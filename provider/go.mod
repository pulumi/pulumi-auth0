module github.com/pulumi/pulumi-auth0/provider/v2

go 1.16

replace (
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/hashicorp/terraform-plugin-test => github.com/hashicorp/terraform-plugin-test v1.3.0
)

require (
	github.com/alexkappa/terraform-provider-auth0 v0.21.0
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.2.1
	github.com/pulumi/pulumi/pkg/v3 v3.3.2-0.20210526172205-85142462c7ed
	github.com/pulumi/pulumi/sdk/v3 v3.3.2-0.20210526172205-85142462c7ed
)
