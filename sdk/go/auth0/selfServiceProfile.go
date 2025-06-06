// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With this resource, you can create and manage Self-Service Profile for a tenant.
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
//			_, err := auth0.NewSelfServiceProfile(ctx, "my_self_service_profile", &auth0.SelfServiceProfileArgs{
//				UserAttributes: auth0.SelfServiceProfileUserAttributeArray{
//					&auth0.SelfServiceProfileUserAttributeArgs{
//						Name:        pulumi.String("sample-name"),
//						Description: pulumi.String("sample-description"),
//						IsOptional:  pulumi.Bool(true),
//					},
//				},
//				Branding: &auth0.SelfServiceProfileBrandingArgs{
//					LogoUrl: pulumi.String("https://mycompany.org/v2/logo.png"),
//					Colors: &auth0.SelfServiceProfileBrandingColorsArgs{
//						Primary: pulumi.String("#0059d6"),
//					},
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
// # This resource can be imported using the id
//
// Example:
//
// ```sh
// $ pulumi import auth0:index/selfServiceProfile:SelfServiceProfile id "ssp_32oi5unksja93124"
// ```
type SelfServiceProfile struct {
	pulumi.CustomResourceState

	// List of IdP strategies that will be shown to users during the Self-Service SSO flow.
	AllowedStrategies pulumi.StringArrayOutput `pulumi:"allowedStrategies"`
	// Field can be used to customize the look and feel of the wizard.
	Branding SelfServiceProfileBrandingOutput `pulumi:"branding"`
	// The ISO 8601 formatted date the profile was created.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// The description of the self-service Profile
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the self-service Profile
	Name pulumi.StringOutput `pulumi:"name"`
	// The ISO 8601 formatted date the profile was updated.
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
	// This array stores the mapping information that will be shown to the user during the SS-SSO flow. The user will be prompted to map the attributes on their identity provider to ensure the specified attributes get passed to Auth0.
	UserAttributes SelfServiceProfileUserAttributeArrayOutput `pulumi:"userAttributes"`
}

// NewSelfServiceProfile registers a new resource with the given unique name, arguments, and options.
func NewSelfServiceProfile(ctx *pulumi.Context,
	name string, args *SelfServiceProfileArgs, opts ...pulumi.ResourceOption) (*SelfServiceProfile, error) {
	if args == nil {
		args = &SelfServiceProfileArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SelfServiceProfile
	err := ctx.RegisterResource("auth0:index/selfServiceProfile:SelfServiceProfile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSelfServiceProfile gets an existing SelfServiceProfile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSelfServiceProfile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SelfServiceProfileState, opts ...pulumi.ResourceOption) (*SelfServiceProfile, error) {
	var resource SelfServiceProfile
	err := ctx.ReadResource("auth0:index/selfServiceProfile:SelfServiceProfile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SelfServiceProfile resources.
type selfServiceProfileState struct {
	// List of IdP strategies that will be shown to users during the Self-Service SSO flow.
	AllowedStrategies []string `pulumi:"allowedStrategies"`
	// Field can be used to customize the look and feel of the wizard.
	Branding *SelfServiceProfileBranding `pulumi:"branding"`
	// The ISO 8601 formatted date the profile was created.
	CreatedAt *string `pulumi:"createdAt"`
	// The description of the self-service Profile
	Description *string `pulumi:"description"`
	// The name of the self-service Profile
	Name *string `pulumi:"name"`
	// The ISO 8601 formatted date the profile was updated.
	UpdatedAt *string `pulumi:"updatedAt"`
	// This array stores the mapping information that will be shown to the user during the SS-SSO flow. The user will be prompted to map the attributes on their identity provider to ensure the specified attributes get passed to Auth0.
	UserAttributes []SelfServiceProfileUserAttribute `pulumi:"userAttributes"`
}

type SelfServiceProfileState struct {
	// List of IdP strategies that will be shown to users during the Self-Service SSO flow.
	AllowedStrategies pulumi.StringArrayInput
	// Field can be used to customize the look and feel of the wizard.
	Branding SelfServiceProfileBrandingPtrInput
	// The ISO 8601 formatted date the profile was created.
	CreatedAt pulumi.StringPtrInput
	// The description of the self-service Profile
	Description pulumi.StringPtrInput
	// The name of the self-service Profile
	Name pulumi.StringPtrInput
	// The ISO 8601 formatted date the profile was updated.
	UpdatedAt pulumi.StringPtrInput
	// This array stores the mapping information that will be shown to the user during the SS-SSO flow. The user will be prompted to map the attributes on their identity provider to ensure the specified attributes get passed to Auth0.
	UserAttributes SelfServiceProfileUserAttributeArrayInput
}

func (SelfServiceProfileState) ElementType() reflect.Type {
	return reflect.TypeOf((*selfServiceProfileState)(nil)).Elem()
}

type selfServiceProfileArgs struct {
	// List of IdP strategies that will be shown to users during the Self-Service SSO flow.
	AllowedStrategies []string `pulumi:"allowedStrategies"`
	// Field can be used to customize the look and feel of the wizard.
	Branding *SelfServiceProfileBranding `pulumi:"branding"`
	// The description of the self-service Profile
	Description *string `pulumi:"description"`
	// The name of the self-service Profile
	Name *string `pulumi:"name"`
	// This array stores the mapping information that will be shown to the user during the SS-SSO flow. The user will be prompted to map the attributes on their identity provider to ensure the specified attributes get passed to Auth0.
	UserAttributes []SelfServiceProfileUserAttribute `pulumi:"userAttributes"`
}

// The set of arguments for constructing a SelfServiceProfile resource.
type SelfServiceProfileArgs struct {
	// List of IdP strategies that will be shown to users during the Self-Service SSO flow.
	AllowedStrategies pulumi.StringArrayInput
	// Field can be used to customize the look and feel of the wizard.
	Branding SelfServiceProfileBrandingPtrInput
	// The description of the self-service Profile
	Description pulumi.StringPtrInput
	// The name of the self-service Profile
	Name pulumi.StringPtrInput
	// This array stores the mapping information that will be shown to the user during the SS-SSO flow. The user will be prompted to map the attributes on their identity provider to ensure the specified attributes get passed to Auth0.
	UserAttributes SelfServiceProfileUserAttributeArrayInput
}

func (SelfServiceProfileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*selfServiceProfileArgs)(nil)).Elem()
}

type SelfServiceProfileInput interface {
	pulumi.Input

	ToSelfServiceProfileOutput() SelfServiceProfileOutput
	ToSelfServiceProfileOutputWithContext(ctx context.Context) SelfServiceProfileOutput
}

func (*SelfServiceProfile) ElementType() reflect.Type {
	return reflect.TypeOf((**SelfServiceProfile)(nil)).Elem()
}

func (i *SelfServiceProfile) ToSelfServiceProfileOutput() SelfServiceProfileOutput {
	return i.ToSelfServiceProfileOutputWithContext(context.Background())
}

func (i *SelfServiceProfile) ToSelfServiceProfileOutputWithContext(ctx context.Context) SelfServiceProfileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SelfServiceProfileOutput)
}

// SelfServiceProfileArrayInput is an input type that accepts SelfServiceProfileArray and SelfServiceProfileArrayOutput values.
// You can construct a concrete instance of `SelfServiceProfileArrayInput` via:
//
//	SelfServiceProfileArray{ SelfServiceProfileArgs{...} }
type SelfServiceProfileArrayInput interface {
	pulumi.Input

	ToSelfServiceProfileArrayOutput() SelfServiceProfileArrayOutput
	ToSelfServiceProfileArrayOutputWithContext(context.Context) SelfServiceProfileArrayOutput
}

type SelfServiceProfileArray []SelfServiceProfileInput

func (SelfServiceProfileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SelfServiceProfile)(nil)).Elem()
}

func (i SelfServiceProfileArray) ToSelfServiceProfileArrayOutput() SelfServiceProfileArrayOutput {
	return i.ToSelfServiceProfileArrayOutputWithContext(context.Background())
}

func (i SelfServiceProfileArray) ToSelfServiceProfileArrayOutputWithContext(ctx context.Context) SelfServiceProfileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SelfServiceProfileArrayOutput)
}

// SelfServiceProfileMapInput is an input type that accepts SelfServiceProfileMap and SelfServiceProfileMapOutput values.
// You can construct a concrete instance of `SelfServiceProfileMapInput` via:
//
//	SelfServiceProfileMap{ "key": SelfServiceProfileArgs{...} }
type SelfServiceProfileMapInput interface {
	pulumi.Input

	ToSelfServiceProfileMapOutput() SelfServiceProfileMapOutput
	ToSelfServiceProfileMapOutputWithContext(context.Context) SelfServiceProfileMapOutput
}

type SelfServiceProfileMap map[string]SelfServiceProfileInput

func (SelfServiceProfileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SelfServiceProfile)(nil)).Elem()
}

func (i SelfServiceProfileMap) ToSelfServiceProfileMapOutput() SelfServiceProfileMapOutput {
	return i.ToSelfServiceProfileMapOutputWithContext(context.Background())
}

func (i SelfServiceProfileMap) ToSelfServiceProfileMapOutputWithContext(ctx context.Context) SelfServiceProfileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SelfServiceProfileMapOutput)
}

type SelfServiceProfileOutput struct{ *pulumi.OutputState }

func (SelfServiceProfileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SelfServiceProfile)(nil)).Elem()
}

func (o SelfServiceProfileOutput) ToSelfServiceProfileOutput() SelfServiceProfileOutput {
	return o
}

func (o SelfServiceProfileOutput) ToSelfServiceProfileOutputWithContext(ctx context.Context) SelfServiceProfileOutput {
	return o
}

// List of IdP strategies that will be shown to users during the Self-Service SSO flow.
func (o SelfServiceProfileOutput) AllowedStrategies() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SelfServiceProfile) pulumi.StringArrayOutput { return v.AllowedStrategies }).(pulumi.StringArrayOutput)
}

// Field can be used to customize the look and feel of the wizard.
func (o SelfServiceProfileOutput) Branding() SelfServiceProfileBrandingOutput {
	return o.ApplyT(func(v *SelfServiceProfile) SelfServiceProfileBrandingOutput { return v.Branding }).(SelfServiceProfileBrandingOutput)
}

// The ISO 8601 formatted date the profile was created.
func (o SelfServiceProfileOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *SelfServiceProfile) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// The description of the self-service Profile
func (o SelfServiceProfileOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SelfServiceProfile) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name of the self-service Profile
func (o SelfServiceProfileOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SelfServiceProfile) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ISO 8601 formatted date the profile was updated.
func (o SelfServiceProfileOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *SelfServiceProfile) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

// This array stores the mapping information that will be shown to the user during the SS-SSO flow. The user will be prompted to map the attributes on their identity provider to ensure the specified attributes get passed to Auth0.
func (o SelfServiceProfileOutput) UserAttributes() SelfServiceProfileUserAttributeArrayOutput {
	return o.ApplyT(func(v *SelfServiceProfile) SelfServiceProfileUserAttributeArrayOutput { return v.UserAttributes }).(SelfServiceProfileUserAttributeArrayOutput)
}

type SelfServiceProfileArrayOutput struct{ *pulumi.OutputState }

func (SelfServiceProfileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SelfServiceProfile)(nil)).Elem()
}

func (o SelfServiceProfileArrayOutput) ToSelfServiceProfileArrayOutput() SelfServiceProfileArrayOutput {
	return o
}

func (o SelfServiceProfileArrayOutput) ToSelfServiceProfileArrayOutputWithContext(ctx context.Context) SelfServiceProfileArrayOutput {
	return o
}

func (o SelfServiceProfileArrayOutput) Index(i pulumi.IntInput) SelfServiceProfileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SelfServiceProfile {
		return vs[0].([]*SelfServiceProfile)[vs[1].(int)]
	}).(SelfServiceProfileOutput)
}

type SelfServiceProfileMapOutput struct{ *pulumi.OutputState }

func (SelfServiceProfileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SelfServiceProfile)(nil)).Elem()
}

func (o SelfServiceProfileMapOutput) ToSelfServiceProfileMapOutput() SelfServiceProfileMapOutput {
	return o
}

func (o SelfServiceProfileMapOutput) ToSelfServiceProfileMapOutputWithContext(ctx context.Context) SelfServiceProfileMapOutput {
	return o
}

func (o SelfServiceProfileMapOutput) MapIndex(k pulumi.StringInput) SelfServiceProfileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SelfServiceProfile {
		return vs[0].(map[string]*SelfServiceProfile)[vs[1].(string)]
	}).(SelfServiceProfileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SelfServiceProfileInput)(nil)).Elem(), &SelfServiceProfile{})
	pulumi.RegisterInputType(reflect.TypeOf((*SelfServiceProfileArrayInput)(nil)).Elem(), SelfServiceProfileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SelfServiceProfileMapInput)(nil)).Elem(), SelfServiceProfileMap{})
	pulumi.RegisterOutputType(SelfServiceProfileOutput{})
	pulumi.RegisterOutputType(SelfServiceProfileArrayOutput{})
	pulumi.RegisterOutputType(SelfServiceProfileMapOutput{})
}
