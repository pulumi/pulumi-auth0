// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package auth0

import (
	"context"
	"encoding/json"
	"fmt"
	"path"

	// embed is used to store bridge-metadata.json in the compiled binary
	_ "embed"

	auth0Shim "github.com/auth0/terraform-provider-auth0/shim"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tks "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"

	"github.com/pulumi/pulumi-auth0/provider/v3/pkg/version"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "auth0"
	// modules:
	mainMod = "index" // the y module
)

var managedByPulumi = &tfbridge.DefaultInfo{Value: "Managed by Pulumi"}

//go:embed cmd/pulumi-resource-auth0/bridge-metadata.json
var metadata []byte

func Provider() tfbridge.ProviderInfo {
	p := shimv2.NewProvider(auth0Shim.NewProvider())

	prov := tfbridge.ProviderInfo{
		P:                p,
		Name:             "auth0",
		DisplayName:      "Auth0",
		Description:      "A Pulumi package for creating and managing auth0 cloud resources.",
		Keywords:         []string{"pulumi", "auth0"},
		License:          "Apache-2.0",
		Homepage:         "https://pulumi.io",
		GitHubOrg:        "auth0",
		Repository:       "https://github.com/pulumi/pulumi-auth0",
		UpstreamRepoPath: "./upstream",
		Version:          version.Version,
		Config: map[string]*tfbridge.SchemaInfo{
			"debug": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"AUTH0_DEBUG"},
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"auth0_client": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {Default: managedByPulumi},
				},
			},
			"auth0_role": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {Default: managedByPulumi},
				},
			},
			"auth0_connection": {
				TransformFromState: connectionMigration,
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0",
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: (func() *tfbridge.PythonInfo {
			i := &tfbridge.PythonInfo{
				RespectSchemaVersion: true,
			}
			i.PyProject.Enabled = true
			return i
		})(),

		Golang: &tfbridge.GolangInfo{
			ImportBasePath: path.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},

		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		}, MetadataInfo: tfbridge.NewProviderMetadata(metadata),
		EnableZeroDefaultSchemaVersion: true,
		EnableAccurateBridgePreview:    true,
		EnableRawStateDelta:            true,
	}

	prov.MustComputeTokens(tks.SingleModule("auth0_", mainMod,
		tks.MakeStandard(mainPkg)))
	prov.MustApplyAutoAliases()
	prov.SetAutonaming(255, "-")

	return prov
}

// connectionMigration migrates options.fieldsMap from a map to a JSON encoded string.
//
// This migration handles the general case where options.fieldsMap is a simple
// map[string]string by encoding the map to JSON.
//
// See https://github.com/pulumi/pulumi-auth0/issues/398 for why this is necessary.
func connectionMigration(ctx context.Context, state resource.PropertyMap) (resource.PropertyMap, error) {
	if state == nil {
		return state, nil
	}
	const (
		optionsKey  = "options"
		fieldMapKey = "fieldsMap"
	)
	if !state[optionsKey].IsObject() {
		return state, nil
	}
	options := state[optionsKey].ObjectValue()

	fieldMap, ok := options[fieldMapKey]
	if !ok || !fieldMap.IsObject() {
		return state, nil
	}

	var fieldMapIsSecret bool
	if fieldMap.IsSecret() {
		fieldMapIsSecret = true
		fieldMap = fieldMap.SecretValue().Element
	}

	if fieldMap.ContainsUnknowns() {
		return state, nil
	}

	jsonValue, err := json.Marshal(fieldMap.Mappable())
	if err != nil {
		tfbridge.GetLogger(ctx).Warn(fmt.Sprintf("Unable to convert %s.%s into a string.", optionsKey, fieldMapKey))
		return state, nil
	}

	newValue := resource.NewProperty(string(jsonValue))

	if fieldMapIsSecret {
		newValue = resource.MakeSecret(newValue)
	}

	options[fieldMapKey] = newValue

	return state, nil
}
