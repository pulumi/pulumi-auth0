// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source to retrieve the custom domain configuration.
func LookupCustomDomain(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*LookupCustomDomainResult, error) {
	var rv LookupCustomDomainResult
	err := ctx.Invoke("auth0:index/getCustomDomain:getCustomDomain", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getCustomDomain.
type LookupCustomDomainResult struct {
	// The HTTP header to fetch the client's IP address. Cannot be set on auth0Managed domains.
	CustomClientIpHeader string `pulumi:"customClientIpHeader"`
	// Name of the custom domain.
	Domain string `pulumi:"domain"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Once the configuration status is `ready`, the DNS name of the Auth0 origin server that handles traffic for the custom domain.
	OriginDomainName string `pulumi:"originDomainName"`
	// Indicates whether this is a primary domain.
	Primary bool `pulumi:"primary"`
	// Configuration status for the custom domain. Options include `disabled`, `pending`, `pendingVerification`, and `ready`.
	Status string `pulumi:"status"`
	// TLS policy for the custom domain. Available options are: `compatible` or `recommended`. Compatible includes TLS 1.0, 1.1, 1.2, and recommended only includes TLS 1.2. Cannot be set on selfManaged domains.
	TlsPolicy string `pulumi:"tlsPolicy"`
	// Provisioning type for the custom domain. Options include `auth0ManagedCerts` and `selfManagedCerts`.
	Type string `pulumi:"type"`
	// Configuration settings for verification.
	Verifications []GetCustomDomainVerificationType `pulumi:"verifications"`
}
