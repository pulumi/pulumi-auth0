// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about the tenant this provider is configured to access.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := auth0.LookupTenant(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupTenant(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*LookupTenantResult, error) {
	var rv LookupTenantResult
	err := ctx.Invoke("auth0:index/getTenant:getTenant", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getTenant.
type LookupTenantResult struct {
	// String. Your Auth0 domain name.
	Domain string `pulumi:"domain"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// String. The identifier value of the built-in Management API resource server, which can be used as an audience when configuring client grants.
	ManagementApiIdentifier string `pulumi:"managementApiIdentifier"`
}