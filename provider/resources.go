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
	"unicode"

	"github.com/hashicorp/terraform-plugin-sdk/terraform"
	"github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfbridge"
	"github.com/pulumi/pulumi/sdk/v2/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v2/go/common/tokens"
	"github.com/terraform-providers/terraform-provider-auth0/auth0"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "auth0"
	// modules:
	mainMod = "index" // the y module
)

// makeMember manufactures a type token for the package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

// preConfigureCallback is called before the providerConfigure function of the underlying provider.
// It should validate that the provider can be configured, and provide actionable errors in the case
// it cannot be. Configuration variables can be read from `vars` using the `stringValue` function -
// for example `stringValue(vars, "accessKey")`.
func preConfigureCallback(vars resource.PropertyMap, c *terraform.ResourceConfig) error {
	return nil
}

var managedByPulumi = &tfbridge.DefaultInfo{Value: "Managed by Pulumi"}

func Provider() tfbridge.ProviderInfo {
	p := auth0.Provider()

	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "auth0",
		Description: "A Pulumi package for creating and managing auth0 cloud resources.",
		Keywords:    []string{"pulumi", "auth0"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		Repository:  "https://github.com/pulumi/pulumi-auth0",
		Config: map[string]*tfbridge.SchemaInfo{
			"domain": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"AUTH0_DOMAIN"},
				},
			},
			"client_id": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"AUTH0_CLIENT_ID"},
				},
			},
			"client_secret": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"AUTH0_CLIENT_SECRET"},
				},
			},
			"debug": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"AUTH0_DEBUG"},
				},
			},
		},
		PreConfigureCallback: preConfigureCallback,
		Resources: map[string]*tfbridge.ResourceInfo{
			"auth0_client": {
				Tok: makeResource(mainMod, "Client"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"auth0_client_grant": {
				Tok: makeResource(mainMod, "ClientGrant"),
			},
			"auth0_global_client": {
				Tok: makeResource(mainMod, "GlobalClient"),
			},
			"auth0_connection": {
				Tok: makeResource(mainMod, "Connection"),
			},
			"auth0_custom_domain": {
				Tok: makeResource(mainMod, "CustomDomain"),
			},
			"auth0_email": {
				Tok: makeResource(mainMod, "Email"),
			},
			"auth0_email_template": {
				Tok: makeResource(mainMod, "EmailTemplate"),
			},
			"auth0_hook": {
				Tok: makeResource(mainMod, "Hook"),
			},
			"auth0_prompt": {
				Tok: makeResource(mainMod, "Prompt"),
			},
			"auth0_resource_server": {
				Tok: makeResource(mainMod, "ResourceServer"),
			},
			"auth0_role": {
				Tok: makeResource(mainMod, "Role"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"auth0_rule": {
				Tok: makeResource(mainMod, "Rule"),
			},
			"auth0_rule_config": {
				Tok: makeResource(mainMod, "RuleConfig"),
			},
			"auth0_tenant": {
				Tok: makeResource(mainMod, "Tenant"),
			},
			"auth0_user": {
				Tok: makeResource(mainMod, "User"),
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^2.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25",
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=2.9.0,<3.0.0",
			},
			UsesIOClasses: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "2.*",
				"System.Collections.Immutable": "1.6.0",
			},
		},
	}

	// For all resources with name properties, we will add an auto-name property. Make sure to skip those that
	// already have a name mapping entry, since those may have custom overrides set above (e.g., for length).
	const nameProperty = "name"
	for resname, res := range prov.Resources {
		if schema := p.ResourcesMap[resname]; schema != nil {
			// Only apply auto-name to input properties (Optional || Required) named `name`
			if tfs, has := schema.Schema[nameProperty]; has && (tfs.Optional || tfs.Required) {
				if _, hasfield := res.Fields[nameProperty]; !hasfield {
					if res.Fields == nil {
						res.Fields = make(map[string]*tfbridge.SchemaInfo)
					}
					res.Fields[nameProperty] = tfbridge.AutoName(nameProperty, 255)
				}
			}
		}
	}

	return prov
}
