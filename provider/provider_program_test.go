//go:build !go && !nodejs && !python && !dotnet && !java
// +build !go,!nodejs,!python,!dotnet,!java

package auth0

import (
	"fmt"
	"os"
	"path/filepath"
	"strings"
	"testing"
	"time"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest"
	"github.com/pulumi/providertest/optproviderupgrade"
	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/assertpreview"
	"github.com/pulumi/providertest/pulumitest/opttest"
)

const (
	providerName           = "auth0"
	defaultBaselineVersion = "3.3.1"
)

var programs = []string{
	"test-programs/index_role",
	"test-programs/index_client",
	"test-programs/index_prompt",
	"test-programs/index_connection",
}

func TestUpgradeCoverage(t *testing.T) {
	providertest.ReportUpgradeCoverage(t)
}

func testProviderUpgrade(t *testing.T, dir string) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	test := pulumitest.NewPulumiTest(t, dir,
		opttest.DownloadProviderVersion(providerName, defaultBaselineVersion),
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
	)
	result := providertest.PreviewProviderUpgrade(t, test, providerName, defaultBaselineVersion,
		optproviderupgrade.DisableAttach())
	assertpreview.HasNoReplacements(t, result)
}

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
	test.Up(t)
}

func TestPrograms(t *testing.T) {
	for _, p := range programs {
		t.Run(p, func(t *testing.T) {
			testProgram(t, p)
		})
	}
}

func TestProgramsUpgrade(t *testing.T) {
	t.Skipf("skip upgrade tests for now as we have not recorded them.")
	for _, p := range programs {
		t.Run(p, func(t *testing.T) {
			testProviderUpgrade(t, p)
		})
	}
}

// Regression test for https://github.com/pulumi/pulumi-auth0/issues/657
func TestOrganizationConnection(t *testing.T) {
	cwd, err := os.Getwd()
	require.NoError(t, err)

	pt := pulumitest.NewPulumiTest(t, "test-programs/organization_connection",
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
		opttest.SkipInstall(),
	)
	pt.Up(t)
}

func TestUserImport(t *testing.T) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}

	cwd, err := os.Getwd()
	require.NoError(t, err)

	suffix := fmt.Sprintf("user-import-%d", time.Now().UnixNano())
	suffix = strings.ToLower(strings.ReplaceAll(suffix, "_", "-"))

	create := pulumitest.NewPulumiTest(t, "test-programs/user_import_create",
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
		opttest.SkipInstall(),
	)
	create.SetConfig(t, "suffix", suffix)
	up := create.Up(t)

	importedUserID, ok := up.Outputs["importedUserId"].Value.(string)
	require.True(t, ok, "expected importedUserId output to be a string")
	require.NotEmpty(t, importedUserID)

	importer := pulumitest.NewPulumiTest(t, "test-programs/yaml_empty",
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
		opttest.SkipInstall(),
	)
	res := importer.Import(t, "auth0:index/user:User", "importedUser", importedUserID, "")

	require.Contains(t, res.Stdout, "type: auth0:User")
}
