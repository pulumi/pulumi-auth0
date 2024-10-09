// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
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
//	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := auth0.LookupBrandingTheme(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupBrandingTheme(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*LookupBrandingThemeResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
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

func LookupBrandingThemeOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) LookupBrandingThemeResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (LookupBrandingThemeResultOutput, error) {
		opts = internal.PkgInvokeDefaultOpts(opts)
		var rv LookupBrandingThemeResult
		secret, err := ctx.InvokePackageRaw("auth0:index/getBrandingTheme:getBrandingTheme", nil, &rv, "", opts...)
		if err != nil {
			return LookupBrandingThemeResultOutput{}, err
		}

		output := pulumi.ToOutput(rv).(LookupBrandingThemeResultOutput)
		if secret {
			return pulumi.ToSecret(output).(LookupBrandingThemeResultOutput), nil
		}
		return output, nil
	}).(LookupBrandingThemeResultOutput)
}

// A collection of values returned by getBrandingTheme.
type LookupBrandingThemeResultOutput struct{ *pulumi.OutputState }

func (LookupBrandingThemeResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupBrandingThemeResult)(nil)).Elem()
}

func (o LookupBrandingThemeResultOutput) ToLookupBrandingThemeResultOutput() LookupBrandingThemeResultOutput {
	return o
}

func (o LookupBrandingThemeResultOutput) ToLookupBrandingThemeResultOutputWithContext(ctx context.Context) LookupBrandingThemeResultOutput {
	return o
}

func (o LookupBrandingThemeResultOutput) Borders() GetBrandingThemeBorderArrayOutput {
	return o.ApplyT(func(v LookupBrandingThemeResult) []GetBrandingThemeBorder { return v.Borders }).(GetBrandingThemeBorderArrayOutput)
}

func (o LookupBrandingThemeResultOutput) Colors() GetBrandingThemeColorArrayOutput {
	return o.ApplyT(func(v LookupBrandingThemeResult) []GetBrandingThemeColor { return v.Colors }).(GetBrandingThemeColorArrayOutput)
}

// The display name for the branding theme.
func (o LookupBrandingThemeResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBrandingThemeResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

func (o LookupBrandingThemeResultOutput) Fonts() GetBrandingThemeFontArrayOutput {
	return o.ApplyT(func(v LookupBrandingThemeResult) []GetBrandingThemeFont { return v.Fonts }).(GetBrandingThemeFontArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupBrandingThemeResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupBrandingThemeResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupBrandingThemeResultOutput) PageBackgrounds() GetBrandingThemePageBackgroundArrayOutput {
	return o.ApplyT(func(v LookupBrandingThemeResult) []GetBrandingThemePageBackground { return v.PageBackgrounds }).(GetBrandingThemePageBackgroundArrayOutput)
}

func (o LookupBrandingThemeResultOutput) Widgets() GetBrandingThemeWidgetArrayOutput {
	return o.ApplyT(func(v LookupBrandingThemeResult) []GetBrandingThemeWidget { return v.Widgets }).(GetBrandingThemeWidgetArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupBrandingThemeResultOutput{})
}
