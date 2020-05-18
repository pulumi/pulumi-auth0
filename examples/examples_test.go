package examples

import (
	"os"
	"path"
	"testing"

	"github.com/pulumi/pulumi/pkg/v2/testing/integration"
)

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func TestAccClient(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "client"),
		})

	integration.ProgramTest(t, &test)
}

func getJSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := integration.ProgramTestOptions{}
	baseJS := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/auth0",
		},
	})

	return baseJS
}
