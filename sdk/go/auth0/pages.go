// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With this resource you can manage custom HTML for the Login, Reset Password, Multi-Factor Authentication and Error pages.
//
// !> The error block in Pages is not recommended when you're managing tenant settings via the Tenant resource.
// To avoid conflicts, configure the errorPage directly in Tenant instead.
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
//			_, err := auth0.NewPages(ctx, "my_pages", &auth0.PagesArgs{
//				Login: &auth0.PagesLoginArgs{
//					Enabled: pulumi.Bool(true),
//					Html:    pulumi.String("<html><body>My Custom Login Page</body></html>"),
//				},
//				ChangePassword: &auth0.PagesChangePasswordArgs{
//					Enabled: pulumi.Bool(true),
//					Html:    pulumi.String("<html><body>My Custom Reset Password Page</body></html>"),
//				},
//				GuardianMfa: &auth0.PagesGuardianMfaArgs{
//					Enabled: pulumi.Bool(true),
//					Html:    pulumi.String("<html><body>My Custom MFA Page</body></html>"),
//				},
//				Error: &auth0.PagesErrorArgs{
//					ShowLogLink: pulumi.Bool(true),
//					Html:        pulumi.String("<html><body>My Custom Error Page</body></html>"),
//					Url:         pulumi.String("https://example.com"),
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
// As this is not a resource identifiable by an ID within the Auth0 Management API,
//
// pages can be imported using a random string.
//
// We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4)
//
// Example:
//
// ```sh
// $ pulumi import auth0:index/pages:Pages my_pages "22f4f21b-017a-319d-92e7-2291c1ca36c4"
// ```
type Pages struct {
	pulumi.CustomResourceState

	// Configuration settings for customizing the Password Reset page.
	ChangePassword PagesChangePasswordOutput `pulumi:"changePassword"`
	// Configuration settings for the Error pages.
	Error PagesErrorOutput `pulumi:"error"`
	// Configuration settings for customizing the Guardian Multi-Factor Authentication page.
	GuardianMfa PagesGuardianMfaOutput `pulumi:"guardianMfa"`
	// Configuration settings for customizing the Login page.
	Login PagesLoginOutput `pulumi:"login"`
}

// NewPages registers a new resource with the given unique name, arguments, and options.
func NewPages(ctx *pulumi.Context,
	name string, args *PagesArgs, opts ...pulumi.ResourceOption) (*Pages, error) {
	if args == nil {
		args = &PagesArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Pages
	err := ctx.RegisterResource("auth0:index/pages:Pages", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPages gets an existing Pages resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPages(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PagesState, opts ...pulumi.ResourceOption) (*Pages, error) {
	var resource Pages
	err := ctx.ReadResource("auth0:index/pages:Pages", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Pages resources.
type pagesState struct {
	// Configuration settings for customizing the Password Reset page.
	ChangePassword *PagesChangePassword `pulumi:"changePassword"`
	// Configuration settings for the Error pages.
	Error *PagesError `pulumi:"error"`
	// Configuration settings for customizing the Guardian Multi-Factor Authentication page.
	GuardianMfa *PagesGuardianMfa `pulumi:"guardianMfa"`
	// Configuration settings for customizing the Login page.
	Login *PagesLogin `pulumi:"login"`
}

type PagesState struct {
	// Configuration settings for customizing the Password Reset page.
	ChangePassword PagesChangePasswordPtrInput
	// Configuration settings for the Error pages.
	Error PagesErrorPtrInput
	// Configuration settings for customizing the Guardian Multi-Factor Authentication page.
	GuardianMfa PagesGuardianMfaPtrInput
	// Configuration settings for customizing the Login page.
	Login PagesLoginPtrInput
}

func (PagesState) ElementType() reflect.Type {
	return reflect.TypeOf((*pagesState)(nil)).Elem()
}

type pagesArgs struct {
	// Configuration settings for customizing the Password Reset page.
	ChangePassword *PagesChangePassword `pulumi:"changePassword"`
	// Configuration settings for the Error pages.
	Error *PagesError `pulumi:"error"`
	// Configuration settings for customizing the Guardian Multi-Factor Authentication page.
	GuardianMfa *PagesGuardianMfa `pulumi:"guardianMfa"`
	// Configuration settings for customizing the Login page.
	Login *PagesLogin `pulumi:"login"`
}

// The set of arguments for constructing a Pages resource.
type PagesArgs struct {
	// Configuration settings for customizing the Password Reset page.
	ChangePassword PagesChangePasswordPtrInput
	// Configuration settings for the Error pages.
	Error PagesErrorPtrInput
	// Configuration settings for customizing the Guardian Multi-Factor Authentication page.
	GuardianMfa PagesGuardianMfaPtrInput
	// Configuration settings for customizing the Login page.
	Login PagesLoginPtrInput
}

func (PagesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pagesArgs)(nil)).Elem()
}

type PagesInput interface {
	pulumi.Input

	ToPagesOutput() PagesOutput
	ToPagesOutputWithContext(ctx context.Context) PagesOutput
}

func (*Pages) ElementType() reflect.Type {
	return reflect.TypeOf((**Pages)(nil)).Elem()
}

func (i *Pages) ToPagesOutput() PagesOutput {
	return i.ToPagesOutputWithContext(context.Background())
}

func (i *Pages) ToPagesOutputWithContext(ctx context.Context) PagesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PagesOutput)
}

// PagesArrayInput is an input type that accepts PagesArray and PagesArrayOutput values.
// You can construct a concrete instance of `PagesArrayInput` via:
//
//	PagesArray{ PagesArgs{...} }
type PagesArrayInput interface {
	pulumi.Input

	ToPagesArrayOutput() PagesArrayOutput
	ToPagesArrayOutputWithContext(context.Context) PagesArrayOutput
}

type PagesArray []PagesInput

func (PagesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Pages)(nil)).Elem()
}

func (i PagesArray) ToPagesArrayOutput() PagesArrayOutput {
	return i.ToPagesArrayOutputWithContext(context.Background())
}

func (i PagesArray) ToPagesArrayOutputWithContext(ctx context.Context) PagesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PagesArrayOutput)
}

// PagesMapInput is an input type that accepts PagesMap and PagesMapOutput values.
// You can construct a concrete instance of `PagesMapInput` via:
//
//	PagesMap{ "key": PagesArgs{...} }
type PagesMapInput interface {
	pulumi.Input

	ToPagesMapOutput() PagesMapOutput
	ToPagesMapOutputWithContext(context.Context) PagesMapOutput
}

type PagesMap map[string]PagesInput

func (PagesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Pages)(nil)).Elem()
}

func (i PagesMap) ToPagesMapOutput() PagesMapOutput {
	return i.ToPagesMapOutputWithContext(context.Background())
}

func (i PagesMap) ToPagesMapOutputWithContext(ctx context.Context) PagesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PagesMapOutput)
}

type PagesOutput struct{ *pulumi.OutputState }

func (PagesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Pages)(nil)).Elem()
}

func (o PagesOutput) ToPagesOutput() PagesOutput {
	return o
}

func (o PagesOutput) ToPagesOutputWithContext(ctx context.Context) PagesOutput {
	return o
}

// Configuration settings for customizing the Password Reset page.
func (o PagesOutput) ChangePassword() PagesChangePasswordOutput {
	return o.ApplyT(func(v *Pages) PagesChangePasswordOutput { return v.ChangePassword }).(PagesChangePasswordOutput)
}

// Configuration settings for the Error pages.
func (o PagesOutput) Error() PagesErrorOutput {
	return o.ApplyT(func(v *Pages) PagesErrorOutput { return v.Error }).(PagesErrorOutput)
}

// Configuration settings for customizing the Guardian Multi-Factor Authentication page.
func (o PagesOutput) GuardianMfa() PagesGuardianMfaOutput {
	return o.ApplyT(func(v *Pages) PagesGuardianMfaOutput { return v.GuardianMfa }).(PagesGuardianMfaOutput)
}

// Configuration settings for customizing the Login page.
func (o PagesOutput) Login() PagesLoginOutput {
	return o.ApplyT(func(v *Pages) PagesLoginOutput { return v.Login }).(PagesLoginOutput)
}

type PagesArrayOutput struct{ *pulumi.OutputState }

func (PagesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Pages)(nil)).Elem()
}

func (o PagesArrayOutput) ToPagesArrayOutput() PagesArrayOutput {
	return o
}

func (o PagesArrayOutput) ToPagesArrayOutputWithContext(ctx context.Context) PagesArrayOutput {
	return o
}

func (o PagesArrayOutput) Index(i pulumi.IntInput) PagesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Pages {
		return vs[0].([]*Pages)[vs[1].(int)]
	}).(PagesOutput)
}

type PagesMapOutput struct{ *pulumi.OutputState }

func (PagesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Pages)(nil)).Elem()
}

func (o PagesMapOutput) ToPagesMapOutput() PagesMapOutput {
	return o
}

func (o PagesMapOutput) ToPagesMapOutputWithContext(ctx context.Context) PagesMapOutput {
	return o
}

func (o PagesMapOutput) MapIndex(k pulumi.StringInput) PagesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Pages {
		return vs[0].(map[string]*Pages)[vs[1].(string)]
	}).(PagesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PagesInput)(nil)).Elem(), &Pages{})
	pulumi.RegisterInputType(reflect.TypeOf((*PagesArrayInput)(nil)).Elem(), PagesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PagesMapInput)(nil)).Elem(), PagesMap{})
	pulumi.RegisterOutputType(PagesOutput{})
	pulumi.RegisterOutputType(PagesArrayOutput{})
	pulumi.RegisterOutputType(PagesMapOutput{})
}
