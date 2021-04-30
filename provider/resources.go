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
	"fmt"
	"path/filepath"
	"unicode"

	"github.com/alexkappa/terraform-provider-auth0/auth0"
	"github.com/pulumi/pulumi-auth0/provider/v2/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shimv1 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v1"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
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

var managedByPulumi = &tfbridge.DefaultInfo{Value: "Managed by Pulumi"}

func Provider() tfbridge.ProviderInfo {
	p := shimv1.NewProvider(auth0.Provider())

	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "auth0",
		Description: "A Pulumi package for creating and managing auth0 cloud resources.",
		Keywords:    []string{"pulumi", "auth0"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		GitHubOrg:   "alexkappa",
		Repository:  "https://github.com/pulumi/pulumi-auth0",
		Config: map[string]*tfbridge.SchemaInfo{
			"debug": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"AUTH0_DEBUG"},
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"auth0_client": {
				Tok: makeResource(mainMod, "Client"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"auth0_client_grant":    {Tok: makeResource(mainMod, "ClientGrant")},
			"auth0_global_client":   {Tok: makeResource(mainMod, "GlobalClient")},
			"auth0_connection":      {Tok: makeResource(mainMod, "Connection")},
			"auth0_custom_domain":   {Tok: makeResource(mainMod, "CustomDomain")},
			"auth0_email":           {Tok: makeResource(mainMod, "Email")},
			"auth0_email_template":  {Tok: makeResource(mainMod, "EmailTemplate")},
			"auth0_hook":            {Tok: makeResource(mainMod, "Hook")},
			"auth0_prompt":          {Tok: makeResource(mainMod, "Prompt")},
			"auth0_resource_server": {Tok: makeResource(mainMod, "ResourceServer")},
			"auth0_role": {
				Tok: makeResource(mainMod, "Role"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"description": {
						Default: managedByPulumi,
					},
				},
			},
			"auth0_rule":        {Tok: makeResource(mainMod, "Rule")},
			"auth0_rule_config": {Tok: makeResource(mainMod, "RuleConfig")},
			"auth0_tenant":      {Tok: makeResource(mainMod, "Tenant")},
			"auth0_user":        {Tok: makeResource(mainMod, "User")},
			"auth0_log_stream":  {Tok: makeResource(mainMod, "LogStream")},
			"auth0_guardian":    {Tok: makeResource(mainMod, "Guardian")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{},
		JavaScript: &tfbridge.JavaScriptInfo{
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0",
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},

		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "3.*",
				"System.Collections.Immutable": "1.6.0",
			},
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
