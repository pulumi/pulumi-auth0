// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With Auth0, you can setting logo, color to maintain a consistent service brand. This resource allows you to manage a branding within your Auth0 tenant.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := auth0.NewBranding(ctx, "myBrand", &auth0.BrandingArgs{
// 			Colors: &BrandingColorsArgs{
// 				PageBackground: pulumi.String("#000000"),
// 				Primary:        pulumi.String("#0059d6"),
// 			},
// 			LogoUrl: pulumi.String("https://mycompany.org/logo.png"),
// 			UniversalLogin: &BrandingUniversalLoginArgs{
// 				Body: pulumi.String(fmt.Sprintf("%v%v%v%v%v%v%v%v%v", "<!DOCTYPE html><html><head>{", "%", "- auth0:head -", "%", "}</head><body>{", "%", "- auth0:widget -", "%", "}</body></html>")),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type Branding struct {
	pulumi.CustomResourceState

	// List(Resource). Configuration settings for colors for branding. See Colors.
	Colors BrandingColorsPtrOutput `pulumi:"colors"`
	// String. URL for the favicon.
	FaviconUrl pulumi.StringOutput `pulumi:"faviconUrl"`
	// List(Resource). Configuration settings to customize the font. See Font.
	Font BrandingFontPtrOutput `pulumi:"font"`
	// String. URL of logo for branding.
	LogoUrl pulumi.StringOutput `pulumi:"logoUrl"`
	// List(Resource). Configuration settings for Universal Login. See Universal Login. This capability can only be used if the tenant has [Custom Domains](https://auth0.com/docs/custom-domains) enabled.
	UniversalLogin BrandingUniversalLoginPtrOutput `pulumi:"universalLogin"`
}

// NewBranding registers a new resource with the given unique name, arguments, and options.
func NewBranding(ctx *pulumi.Context,
	name string, args *BrandingArgs, opts ...pulumi.ResourceOption) (*Branding, error) {
	if args == nil {
		args = &BrandingArgs{}
	}

	var resource Branding
	err := ctx.RegisterResource("auth0:index/branding:Branding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBranding gets an existing Branding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBranding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BrandingState, opts ...pulumi.ResourceOption) (*Branding, error) {
	var resource Branding
	err := ctx.ReadResource("auth0:index/branding:Branding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Branding resources.
type brandingState struct {
	// List(Resource). Configuration settings for colors for branding. See Colors.
	Colors *BrandingColors `pulumi:"colors"`
	// String. URL for the favicon.
	FaviconUrl *string `pulumi:"faviconUrl"`
	// List(Resource). Configuration settings to customize the font. See Font.
	Font *BrandingFont `pulumi:"font"`
	// String. URL of logo for branding.
	LogoUrl *string `pulumi:"logoUrl"`
	// List(Resource). Configuration settings for Universal Login. See Universal Login. This capability can only be used if the tenant has [Custom Domains](https://auth0.com/docs/custom-domains) enabled.
	UniversalLogin *BrandingUniversalLogin `pulumi:"universalLogin"`
}

type BrandingState struct {
	// List(Resource). Configuration settings for colors for branding. See Colors.
	Colors BrandingColorsPtrInput
	// String. URL for the favicon.
	FaviconUrl pulumi.StringPtrInput
	// List(Resource). Configuration settings to customize the font. See Font.
	Font BrandingFontPtrInput
	// String. URL of logo for branding.
	LogoUrl pulumi.StringPtrInput
	// List(Resource). Configuration settings for Universal Login. See Universal Login. This capability can only be used if the tenant has [Custom Domains](https://auth0.com/docs/custom-domains) enabled.
	UniversalLogin BrandingUniversalLoginPtrInput
}

func (BrandingState) ElementType() reflect.Type {
	return reflect.TypeOf((*brandingState)(nil)).Elem()
}

type brandingArgs struct {
	// List(Resource). Configuration settings for colors for branding. See Colors.
	Colors *BrandingColors `pulumi:"colors"`
	// String. URL for the favicon.
	FaviconUrl *string `pulumi:"faviconUrl"`
	// List(Resource). Configuration settings to customize the font. See Font.
	Font *BrandingFont `pulumi:"font"`
	// String. URL of logo for branding.
	LogoUrl *string `pulumi:"logoUrl"`
	// List(Resource). Configuration settings for Universal Login. See Universal Login. This capability can only be used if the tenant has [Custom Domains](https://auth0.com/docs/custom-domains) enabled.
	UniversalLogin *BrandingUniversalLogin `pulumi:"universalLogin"`
}

// The set of arguments for constructing a Branding resource.
type BrandingArgs struct {
	// List(Resource). Configuration settings for colors for branding. See Colors.
	Colors BrandingColorsPtrInput
	// String. URL for the favicon.
	FaviconUrl pulumi.StringPtrInput
	// List(Resource). Configuration settings to customize the font. See Font.
	Font BrandingFontPtrInput
	// String. URL of logo for branding.
	LogoUrl pulumi.StringPtrInput
	// List(Resource). Configuration settings for Universal Login. See Universal Login. This capability can only be used if the tenant has [Custom Domains](https://auth0.com/docs/custom-domains) enabled.
	UniversalLogin BrandingUniversalLoginPtrInput
}

func (BrandingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*brandingArgs)(nil)).Elem()
}

type BrandingInput interface {
	pulumi.Input

	ToBrandingOutput() BrandingOutput
	ToBrandingOutputWithContext(ctx context.Context) BrandingOutput
}

func (*Branding) ElementType() reflect.Type {
	return reflect.TypeOf((**Branding)(nil)).Elem()
}

func (i *Branding) ToBrandingOutput() BrandingOutput {
	return i.ToBrandingOutputWithContext(context.Background())
}

func (i *Branding) ToBrandingOutputWithContext(ctx context.Context) BrandingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BrandingOutput)
}

// BrandingArrayInput is an input type that accepts BrandingArray and BrandingArrayOutput values.
// You can construct a concrete instance of `BrandingArrayInput` via:
//
//          BrandingArray{ BrandingArgs{...} }
type BrandingArrayInput interface {
	pulumi.Input

	ToBrandingArrayOutput() BrandingArrayOutput
	ToBrandingArrayOutputWithContext(context.Context) BrandingArrayOutput
}

type BrandingArray []BrandingInput

func (BrandingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Branding)(nil)).Elem()
}

func (i BrandingArray) ToBrandingArrayOutput() BrandingArrayOutput {
	return i.ToBrandingArrayOutputWithContext(context.Background())
}

func (i BrandingArray) ToBrandingArrayOutputWithContext(ctx context.Context) BrandingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BrandingArrayOutput)
}

// BrandingMapInput is an input type that accepts BrandingMap and BrandingMapOutput values.
// You can construct a concrete instance of `BrandingMapInput` via:
//
//          BrandingMap{ "key": BrandingArgs{...} }
type BrandingMapInput interface {
	pulumi.Input

	ToBrandingMapOutput() BrandingMapOutput
	ToBrandingMapOutputWithContext(context.Context) BrandingMapOutput
}

type BrandingMap map[string]BrandingInput

func (BrandingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Branding)(nil)).Elem()
}

func (i BrandingMap) ToBrandingMapOutput() BrandingMapOutput {
	return i.ToBrandingMapOutputWithContext(context.Background())
}

func (i BrandingMap) ToBrandingMapOutputWithContext(ctx context.Context) BrandingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BrandingMapOutput)
}

type BrandingOutput struct{ *pulumi.OutputState }

func (BrandingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Branding)(nil)).Elem()
}

func (o BrandingOutput) ToBrandingOutput() BrandingOutput {
	return o
}

func (o BrandingOutput) ToBrandingOutputWithContext(ctx context.Context) BrandingOutput {
	return o
}

type BrandingArrayOutput struct{ *pulumi.OutputState }

func (BrandingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Branding)(nil)).Elem()
}

func (o BrandingArrayOutput) ToBrandingArrayOutput() BrandingArrayOutput {
	return o
}

func (o BrandingArrayOutput) ToBrandingArrayOutputWithContext(ctx context.Context) BrandingArrayOutput {
	return o
}

func (o BrandingArrayOutput) Index(i pulumi.IntInput) BrandingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Branding {
		return vs[0].([]*Branding)[vs[1].(int)]
	}).(BrandingOutput)
}

type BrandingMapOutput struct{ *pulumi.OutputState }

func (BrandingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Branding)(nil)).Elem()
}

func (o BrandingMapOutput) ToBrandingMapOutput() BrandingMapOutput {
	return o
}

func (o BrandingMapOutput) ToBrandingMapOutputWithContext(ctx context.Context) BrandingMapOutput {
	return o
}

func (o BrandingMapOutput) MapIndex(k pulumi.StringInput) BrandingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Branding {
		return vs[0].(map[string]*Branding)[vs[1].(string)]
	}).(BrandingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BrandingInput)(nil)).Elem(), &Branding{})
	pulumi.RegisterInputType(reflect.TypeOf((*BrandingArrayInput)(nil)).Elem(), BrandingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BrandingMapInput)(nil)).Elem(), BrandingMap{})
	pulumi.RegisterOutputType(BrandingOutput{})
	pulumi.RegisterOutputType(BrandingArrayOutput{})
	pulumi.RegisterOutputType(BrandingMapOutput{})
}
