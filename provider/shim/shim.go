package shim

import (
	"github.com/auth0/terraform-provider-auth0/internal/provider"
	"github.com/hashicorp/terraform-plugin-sdk/v2/helper/schema"
)

func NewProvider() *schema.Provider {
	return provider.New()
}
