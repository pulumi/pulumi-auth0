//go:build !go && !nodejs && !python && !dotnet
// +build !go,!nodejs,!python,!dotnet

package auth0

import (
	"os"
	"path/filepath"
	"testing"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest"
	"github.com/pulumi/providertest/optproviderupgrade"
	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/assertpreview"
	"github.com/pulumi/providertest/pulumitest/opttest"
	"github.com/pulumi/pulumi/sdk/v3/go/auto"
)

const providerName = "auth0"
const defaultBaselineVersion = "3.3.1"

var programs = []string{
	"test-programs/index_role",
	"test-programs/index_client",
	"test-programs/index_prompt",
	"test-programs/index_connection",
}

func TestUpgradeCoverage(t *testing.T) {
	providertest.ReportUpgradeCoverage(t)
}

type UpgradeTestOpts struct {
	baselineVersion string
	assertFunc      func(*testing.T, auto.PreviewResult)
	config          map[string]string
}

func WithBaselineVersion(baselineVersion string) func(opts *UpgradeTestOpts) {
	return func(opts *UpgradeTestOpts) {
		opts.baselineVersion = baselineVersion
	}
}

func WithAssertFunc(assertFunc func(*testing.T, auto.PreviewResult)) func(opts *UpgradeTestOpts) {
	return func(opts *UpgradeTestOpts) {
		opts.assertFunc = assertFunc
	}
}

func WithConfig(config map[string]string) func(opts *UpgradeTestOpts) {
	return func(opts *UpgradeTestOpts) {
		opts.config = config
	}
}
func testProviderUpgrade(t *testing.T, dir string, opts ...func(*UpgradeTestOpts)) {
	options := &UpgradeTestOpts{}
	for _, o := range opts {
		o(options)
	}
	testProviderUpgradeWithOpts(t, dir, options.baselineVersion, options.config, options.assertFunc)
}

func testProviderUpgradeWithOpts(
	t *testing.T, dir, baselineVersion string, config map[string]string,
	assertFunction func(*testing.T, auto.PreviewResult),
) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	if baselineVersion == "" {
		baselineVersion = defaultBaselineVersion
	}
	test := pulumitest.NewPulumiTest(t, dir,
		opttest.DownloadProviderVersion(providerName, baselineVersion),
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
	)
	for k, v := range config {
		test.SetConfig(k, v)
	}
	result := providertest.PreviewProviderUpgrade(t, test, providerName, baselineVersion,
		optproviderupgrade.DisableAttach())
	if assertFunction != nil {
		assertFunction(t, result)
	} else {
		assertpreview.HasNoReplacements(t, result)
	}
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
	test.Up()
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
