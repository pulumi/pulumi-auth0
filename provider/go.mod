module github.com/pulumi/pulumi-auth0/provider/v2

go 1.16

replace (
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20220505215311-795430389fa7
	github.com/hashicorp/terraform-plugin-test => github.com/hashicorp/terraform-plugin-test v1.3.0
)

require (
	github.com/auth0/terraform-provider-auth0 v0.30.2
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.24.1
	github.com/pulumi/pulumi/sdk/v3 v3.33.1
)
