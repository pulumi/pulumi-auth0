// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This resource allows you to manage branding themes for your Universal Login page within your Auth0 tenant.
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
//			_, err := auth0.NewBrandingTheme(ctx, "myTheme", &auth0.BrandingThemeArgs{
//				Borders: &auth0.BrandingThemeBordersArgs{
//					ButtonBorderRadius: pulumi.Float64(1),
//					ButtonBorderWeight: pulumi.Float64(1),
//					ButtonsStyle:       pulumi.String("pill"),
//					InputBorderRadius:  pulumi.Float64(3),
//					InputBorderWeight:  pulumi.Float64(1),
//					InputsStyle:        pulumi.String("pill"),
//					ShowWidgetShadow:   pulumi.Bool(false),
//					WidgetBorderWeight: pulumi.Float64(1),
//					WidgetCornerRadius: pulumi.Float64(3),
//				},
//				Colors: &auth0.BrandingThemeColorsArgs{
//					BodyText:                pulumi.String("#FF00CC"),
//					Error:                   pulumi.String("#FF00CC"),
//					Header:                  pulumi.String("#FF00CC"),
//					Icons:                   pulumi.String("#FF00CC"),
//					InputBackground:         pulumi.String("#FF00CC"),
//					InputBorder:             pulumi.String("#FF00CC"),
//					InputFilledText:         pulumi.String("#FF00CC"),
//					InputLabelsPlaceholders: pulumi.String("#FF00CC"),
//					LinksFocusedComponents:  pulumi.String("#FF00CC"),
//					PrimaryButton:           pulumi.String("#FF00CC"),
//					PrimaryButtonLabel:      pulumi.String("#FF00CC"),
//					SecondaryButtonBorder:   pulumi.String("#FF00CC"),
//					SecondaryButtonLabel:    pulumi.String("#FF00CC"),
//					Success:                 pulumi.String("#FF00CC"),
//					WidgetBackground:        pulumi.String("#FF00CC"),
//					WidgetBorder:            pulumi.String("#FF00CC"),
//				},
//				Fonts: &auth0.BrandingThemeFontsArgs{
//					BodyText: &auth0.BrandingThemeFontsBodyTextArgs{
//						Bold: pulumi.Bool(false),
//						Size: pulumi.Float64(100),
//					},
//					ButtonsText: &auth0.BrandingThemeFontsButtonsTextArgs{
//						Bold: pulumi.Bool(false),
//						Size: pulumi.Float64(100),
//					},
//					FontUrl: pulumi.String("https://google.com/font.woff"),
//					InputLabels: &auth0.BrandingThemeFontsInputLabelsArgs{
//						Bold: pulumi.Bool(false),
//						Size: pulumi.Float64(100),
//					},
//					Links: &auth0.BrandingThemeFontsLinksArgs{
//						Bold: pulumi.Bool(false),
//						Size: pulumi.Float64(100),
//					},
//					LinksStyle:        pulumi.String("normal"),
//					ReferenceTextSize: pulumi.Float64(12),
//					Subtitle: &auth0.BrandingThemeFontsSubtitleArgs{
//						Bold: pulumi.Bool(false),
//						Size: pulumi.Float64(100),
//					},
//					Title: &auth0.BrandingThemeFontsTitleArgs{
//						Bold: pulumi.Bool(false),
//						Size: pulumi.Float64(100),
//					},
//				},
//				PageBackground: &auth0.BrandingThemePageBackgroundArgs{
//					BackgroundColor:    pulumi.String("#000000"),
//					BackgroundImageUrl: pulumi.String("https://google.com/background.png"),
//					PageLayout:         pulumi.String("center"),
//				},
//				Widget: &auth0.BrandingThemeWidgetArgs{
//					HeaderTextAlignment: pulumi.String("center"),
//					LogoHeight:          pulumi.Float64(55),
//					LogoPosition:        pulumi.String("center"),
//					LogoUrl:             pulumi.String("https://google.com/logo.png"),
//					SocialButtonsLayout: pulumi.String("top"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// This resource can be imported by specifying the Branding Theme ID. # Example
//
// ```sh
//
//	$ pulumi import auth0:index/brandingTheme:BrandingTheme my_theme "XXXXXXXXXXXXXXXXXXXX"
//
// ```
type BrandingTheme struct {
	pulumi.CustomResourceState

	Borders BrandingThemeBordersOutput `pulumi:"borders"`
	Colors  BrandingThemeColorsOutput  `pulumi:"colors"`
	// The display name for the branding theme.
	DisplayName    pulumi.StringPtrOutput            `pulumi:"displayName"`
	Fonts          BrandingThemeFontsOutput          `pulumi:"fonts"`
	PageBackground BrandingThemePageBackgroundOutput `pulumi:"pageBackground"`
	Widget         BrandingThemeWidgetOutput         `pulumi:"widget"`
}

// NewBrandingTheme registers a new resource with the given unique name, arguments, and options.
func NewBrandingTheme(ctx *pulumi.Context,
	name string, args *BrandingThemeArgs, opts ...pulumi.ResourceOption) (*BrandingTheme, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Borders == nil {
		return nil, errors.New("invalid value for required argument 'Borders'")
	}
	if args.Colors == nil {
		return nil, errors.New("invalid value for required argument 'Colors'")
	}
	if args.Fonts == nil {
		return nil, errors.New("invalid value for required argument 'Fonts'")
	}
	if args.PageBackground == nil {
		return nil, errors.New("invalid value for required argument 'PageBackground'")
	}
	if args.Widget == nil {
		return nil, errors.New("invalid value for required argument 'Widget'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BrandingTheme
	err := ctx.RegisterResource("auth0:index/brandingTheme:BrandingTheme", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBrandingTheme gets an existing BrandingTheme resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBrandingTheme(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BrandingThemeState, opts ...pulumi.ResourceOption) (*BrandingTheme, error) {
	var resource BrandingTheme
	err := ctx.ReadResource("auth0:index/brandingTheme:BrandingTheme", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BrandingTheme resources.
type brandingThemeState struct {
	Borders *BrandingThemeBorders `pulumi:"borders"`
	Colors  *BrandingThemeColors  `pulumi:"colors"`
	// The display name for the branding theme.
	DisplayName    *string                      `pulumi:"displayName"`
	Fonts          *BrandingThemeFonts          `pulumi:"fonts"`
	PageBackground *BrandingThemePageBackground `pulumi:"pageBackground"`
	Widget         *BrandingThemeWidget         `pulumi:"widget"`
}

type BrandingThemeState struct {
	Borders BrandingThemeBordersPtrInput
	Colors  BrandingThemeColorsPtrInput
	// The display name for the branding theme.
	DisplayName    pulumi.StringPtrInput
	Fonts          BrandingThemeFontsPtrInput
	PageBackground BrandingThemePageBackgroundPtrInput
	Widget         BrandingThemeWidgetPtrInput
}

func (BrandingThemeState) ElementType() reflect.Type {
	return reflect.TypeOf((*brandingThemeState)(nil)).Elem()
}

type brandingThemeArgs struct {
	Borders BrandingThemeBorders `pulumi:"borders"`
	Colors  BrandingThemeColors  `pulumi:"colors"`
	// The display name for the branding theme.
	DisplayName    *string                     `pulumi:"displayName"`
	Fonts          BrandingThemeFonts          `pulumi:"fonts"`
	PageBackground BrandingThemePageBackground `pulumi:"pageBackground"`
	Widget         BrandingThemeWidget         `pulumi:"widget"`
}

// The set of arguments for constructing a BrandingTheme resource.
type BrandingThemeArgs struct {
	Borders BrandingThemeBordersInput
	Colors  BrandingThemeColorsInput
	// The display name for the branding theme.
	DisplayName    pulumi.StringPtrInput
	Fonts          BrandingThemeFontsInput
	PageBackground BrandingThemePageBackgroundInput
	Widget         BrandingThemeWidgetInput
}

func (BrandingThemeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*brandingThemeArgs)(nil)).Elem()
}

type BrandingThemeInput interface {
	pulumi.Input

	ToBrandingThemeOutput() BrandingThemeOutput
	ToBrandingThemeOutputWithContext(ctx context.Context) BrandingThemeOutput
}

func (*BrandingTheme) ElementType() reflect.Type {
	return reflect.TypeOf((**BrandingTheme)(nil)).Elem()
}

func (i *BrandingTheme) ToBrandingThemeOutput() BrandingThemeOutput {
	return i.ToBrandingThemeOutputWithContext(context.Background())
}

func (i *BrandingTheme) ToBrandingThemeOutputWithContext(ctx context.Context) BrandingThemeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BrandingThemeOutput)
}

func (i *BrandingTheme) ToOutput(ctx context.Context) pulumix.Output[*BrandingTheme] {
	return pulumix.Output[*BrandingTheme]{
		OutputState: i.ToBrandingThemeOutputWithContext(ctx).OutputState,
	}
}

// BrandingThemeArrayInput is an input type that accepts BrandingThemeArray and BrandingThemeArrayOutput values.
// You can construct a concrete instance of `BrandingThemeArrayInput` via:
//
//	BrandingThemeArray{ BrandingThemeArgs{...} }
type BrandingThemeArrayInput interface {
	pulumi.Input

	ToBrandingThemeArrayOutput() BrandingThemeArrayOutput
	ToBrandingThemeArrayOutputWithContext(context.Context) BrandingThemeArrayOutput
}

type BrandingThemeArray []BrandingThemeInput

func (BrandingThemeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BrandingTheme)(nil)).Elem()
}

func (i BrandingThemeArray) ToBrandingThemeArrayOutput() BrandingThemeArrayOutput {
	return i.ToBrandingThemeArrayOutputWithContext(context.Background())
}

func (i BrandingThemeArray) ToBrandingThemeArrayOutputWithContext(ctx context.Context) BrandingThemeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BrandingThemeArrayOutput)
}

func (i BrandingThemeArray) ToOutput(ctx context.Context) pulumix.Output[[]*BrandingTheme] {
	return pulumix.Output[[]*BrandingTheme]{
		OutputState: i.ToBrandingThemeArrayOutputWithContext(ctx).OutputState,
	}
}

// BrandingThemeMapInput is an input type that accepts BrandingThemeMap and BrandingThemeMapOutput values.
// You can construct a concrete instance of `BrandingThemeMapInput` via:
//
//	BrandingThemeMap{ "key": BrandingThemeArgs{...} }
type BrandingThemeMapInput interface {
	pulumi.Input

	ToBrandingThemeMapOutput() BrandingThemeMapOutput
	ToBrandingThemeMapOutputWithContext(context.Context) BrandingThemeMapOutput
}

type BrandingThemeMap map[string]BrandingThemeInput

func (BrandingThemeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BrandingTheme)(nil)).Elem()
}

func (i BrandingThemeMap) ToBrandingThemeMapOutput() BrandingThemeMapOutput {
	return i.ToBrandingThemeMapOutputWithContext(context.Background())
}

func (i BrandingThemeMap) ToBrandingThemeMapOutputWithContext(ctx context.Context) BrandingThemeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BrandingThemeMapOutput)
}

func (i BrandingThemeMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*BrandingTheme] {
	return pulumix.Output[map[string]*BrandingTheme]{
		OutputState: i.ToBrandingThemeMapOutputWithContext(ctx).OutputState,
	}
}

type BrandingThemeOutput struct{ *pulumi.OutputState }

func (BrandingThemeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BrandingTheme)(nil)).Elem()
}

func (o BrandingThemeOutput) ToBrandingThemeOutput() BrandingThemeOutput {
	return o
}

func (o BrandingThemeOutput) ToBrandingThemeOutputWithContext(ctx context.Context) BrandingThemeOutput {
	return o
}

func (o BrandingThemeOutput) ToOutput(ctx context.Context) pulumix.Output[*BrandingTheme] {
	return pulumix.Output[*BrandingTheme]{
		OutputState: o.OutputState,
	}
}

func (o BrandingThemeOutput) Borders() BrandingThemeBordersOutput {
	return o.ApplyT(func(v *BrandingTheme) BrandingThemeBordersOutput { return v.Borders }).(BrandingThemeBordersOutput)
}

func (o BrandingThemeOutput) Colors() BrandingThemeColorsOutput {
	return o.ApplyT(func(v *BrandingTheme) BrandingThemeColorsOutput { return v.Colors }).(BrandingThemeColorsOutput)
}

// The display name for the branding theme.
func (o BrandingThemeOutput) DisplayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *BrandingTheme) pulumi.StringPtrOutput { return v.DisplayName }).(pulumi.StringPtrOutput)
}

func (o BrandingThemeOutput) Fonts() BrandingThemeFontsOutput {
	return o.ApplyT(func(v *BrandingTheme) BrandingThemeFontsOutput { return v.Fonts }).(BrandingThemeFontsOutput)
}

func (o BrandingThemeOutput) PageBackground() BrandingThemePageBackgroundOutput {
	return o.ApplyT(func(v *BrandingTheme) BrandingThemePageBackgroundOutput { return v.PageBackground }).(BrandingThemePageBackgroundOutput)
}

func (o BrandingThemeOutput) Widget() BrandingThemeWidgetOutput {
	return o.ApplyT(func(v *BrandingTheme) BrandingThemeWidgetOutput { return v.Widget }).(BrandingThemeWidgetOutput)
}

type BrandingThemeArrayOutput struct{ *pulumi.OutputState }

func (BrandingThemeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BrandingTheme)(nil)).Elem()
}

func (o BrandingThemeArrayOutput) ToBrandingThemeArrayOutput() BrandingThemeArrayOutput {
	return o
}

func (o BrandingThemeArrayOutput) ToBrandingThemeArrayOutputWithContext(ctx context.Context) BrandingThemeArrayOutput {
	return o
}

func (o BrandingThemeArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*BrandingTheme] {
	return pulumix.Output[[]*BrandingTheme]{
		OutputState: o.OutputState,
	}
}

func (o BrandingThemeArrayOutput) Index(i pulumi.IntInput) BrandingThemeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BrandingTheme {
		return vs[0].([]*BrandingTheme)[vs[1].(int)]
	}).(BrandingThemeOutput)
}

type BrandingThemeMapOutput struct{ *pulumi.OutputState }

func (BrandingThemeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BrandingTheme)(nil)).Elem()
}

func (o BrandingThemeMapOutput) ToBrandingThemeMapOutput() BrandingThemeMapOutput {
	return o
}

func (o BrandingThemeMapOutput) ToBrandingThemeMapOutputWithContext(ctx context.Context) BrandingThemeMapOutput {
	return o
}

func (o BrandingThemeMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*BrandingTheme] {
	return pulumix.Output[map[string]*BrandingTheme]{
		OutputState: o.OutputState,
	}
}

func (o BrandingThemeMapOutput) MapIndex(k pulumi.StringInput) BrandingThemeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BrandingTheme {
		return vs[0].(map[string]*BrandingTheme)[vs[1].(string)]
	}).(BrandingThemeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BrandingThemeInput)(nil)).Elem(), &BrandingTheme{})
	pulumi.RegisterInputType(reflect.TypeOf((*BrandingThemeArrayInput)(nil)).Elem(), BrandingThemeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BrandingThemeMapInput)(nil)).Elem(), BrandingThemeMap{})
	pulumi.RegisterOutputType(BrandingThemeOutput{})
	pulumi.RegisterOutputType(BrandingThemeArrayOutput{})
	pulumi.RegisterOutputType(BrandingThemeMapOutput{})
}
