// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about the tenant's branding theme settings.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := auth0.LookupBrandingTheme(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupBrandingTheme(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*LookupBrandingThemeResult, error) {
	var rv LookupBrandingThemeResult
	err := ctx.Invoke("auth0:index/getBrandingTheme:getBrandingTheme", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getBrandingTheme.
type LookupBrandingThemeResult struct {
	Borders []GetBrandingThemeBorder `pulumi:"borders"`
	Colors  []GetBrandingThemeColor  `pulumi:"colors"`
	// The display name for the branding theme.
	DisplayName string                 `pulumi:"displayName"`
	Fonts       []GetBrandingThemeFont `pulumi:"fonts"`
	// The provider-assigned unique ID for this managed resource.
	Id              string                           `pulumi:"id"`
	PageBackgrounds []GetBrandingThemePageBackground `pulumi:"pageBackgrounds"`
	Widgets         []GetBrandingThemeWidget         `pulumi:"widgets"`
}