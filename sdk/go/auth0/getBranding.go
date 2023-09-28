// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about the tenant's branding settings.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := auth0.LookupBranding(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupBranding(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*LookupBrandingResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupBrandingResult
	err := ctx.Invoke("auth0:index/getBranding:getBranding", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getBranding.
type LookupBrandingResult struct {
	// Configuration settings for colors for branding.
	Colors []GetBrandingColor `pulumi:"colors"`
	// URL for the favicon.
	FaviconUrl string `pulumi:"faviconUrl"`
	// Configuration settings to customize the font.
	Fonts []GetBrandingFont `pulumi:"fonts"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// URL of logo for branding.
	LogoUrl string `pulumi:"logoUrl"`
	// Configuration settings for Universal Login.
	UniversalLogins []GetBrandingUniversalLogin `pulumi:"universalLogins"`
}
