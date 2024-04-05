//go:build !go && !nodejs && !python && !dotnet
// +build !go,!nodejs,!python,!dotnet

// Copyright 2016-2024, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License")
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//	http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package auth0

import (
	"os"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/opttest"
)

const providerName = "auth0"

func testProgram(t *testing.T, dir string) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	test := pulumitest.NewPulumiTest(t, dir,
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
		opttest.SkipInstall(),
	)
	test.Up()
}

func TestPrograms(t *testing.T) {
	programs := []string{
		"test-programs/index_client",
		"test-programs/index_resourceserver",
		"test-programs/index_connection",
		"test-programs/index_clientgrant",
		"test-programs/index_action",
		"test-programs/index_tenant",
		"test-programs/index_customdomain",
		"test-programs/index_branding",
		"test-programs/index_role",
		"test-programs/index_connectionclient",
		"test-programs/index_emailtemplate",
		"test-programs/index_clientcredentials",
		"test-programs/index_rule",
		"test-programs/index_triggerbinding",
		"test-programs/index_email",
		"test-programs/index_prompt",
		"test-programs/index_brandingtheme",
		"test-programs/index_logstream",
		"test-programs/index_triggeractions",
		"test-programs/index_emailprovider",
	}
	for _, p := range programs {
		t.Run(p, func(t *testing.T) {
			testProgram(t, p)
		})
	}
}
