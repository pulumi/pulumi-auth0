// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With Auth0, you can use a custom domain to maintain a consistent user experience. This resource allows you to create and
// manage a custom domain within your Auth0 tenant.
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
//			_, err := auth0.NewCustomDomain(ctx, "myCustomDomain", &auth0.CustomDomainArgs{
//				Domain: pulumi.String("auth.example.com"),
//				Type:   pulumi.String("auth0_managed_certs"),
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
// Custom Domains can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import auth0:index/customDomain:CustomDomain my_custom_domain cd_XXXXXXXXXXXXXXXX
//
// ```
type CustomDomain struct {
	pulumi.CustomResourceState

	// String. Name of the custom domain.
	Domain pulumi.StringOutput `pulumi:"domain"`
	// String. Once the configuration status is `ready`, the DNS name of the Auth0 origin server that handles traffic for the custom domain.
	OriginDomainName pulumi.StringOutput `pulumi:"originDomainName"`
	// Boolean. Indicates whether this is a primary domain.
	Primary pulumi.BoolOutput `pulumi:"primary"`
	// String. Configuration status for the custom domain. Options include `disabled`, `pending`, `pendingVerification`, and `ready`.
	Status pulumi.StringOutput `pulumi:"status"`
	// String. Provisioning type for the custom domain. Options include `auth0ManagedCerts` and `selfManagedCerts`.
	Type pulumi.StringOutput `pulumi:"type"`
	// List(Resource). Configuration settings for verification. For details, see Verification.
	Verifications CustomDomainVerificationTypeArrayOutput `pulumi:"verifications"`
}

// NewCustomDomain registers a new resource with the given unique name, arguments, and options.
func NewCustomDomain(ctx *pulumi.Context,
	name string, args *CustomDomainArgs, opts ...pulumi.ResourceOption) (*CustomDomain, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Domain == nil {
		return nil, errors.New("invalid value for required argument 'Domain'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	var resource CustomDomain
	err := ctx.RegisterResource("auth0:index/customDomain:CustomDomain", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomDomain gets an existing CustomDomain resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomDomain(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomDomainState, opts ...pulumi.ResourceOption) (*CustomDomain, error) {
	var resource CustomDomain
	err := ctx.ReadResource("auth0:index/customDomain:CustomDomain", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomDomain resources.
type customDomainState struct {
	// String. Name of the custom domain.
	Domain *string `pulumi:"domain"`
	// String. Once the configuration status is `ready`, the DNS name of the Auth0 origin server that handles traffic for the custom domain.
	OriginDomainName *string `pulumi:"originDomainName"`
	// Boolean. Indicates whether this is a primary domain.
	Primary *bool `pulumi:"primary"`
	// String. Configuration status for the custom domain. Options include `disabled`, `pending`, `pendingVerification`, and `ready`.
	Status *string `pulumi:"status"`
	// String. Provisioning type for the custom domain. Options include `auth0ManagedCerts` and `selfManagedCerts`.
	Type *string `pulumi:"type"`
	// List(Resource). Configuration settings for verification. For details, see Verification.
	Verifications []CustomDomainVerificationType `pulumi:"verifications"`
}

type CustomDomainState struct {
	// String. Name of the custom domain.
	Domain pulumi.StringPtrInput
	// String. Once the configuration status is `ready`, the DNS name of the Auth0 origin server that handles traffic for the custom domain.
	OriginDomainName pulumi.StringPtrInput
	// Boolean. Indicates whether this is a primary domain.
	Primary pulumi.BoolPtrInput
	// String. Configuration status for the custom domain. Options include `disabled`, `pending`, `pendingVerification`, and `ready`.
	Status pulumi.StringPtrInput
	// String. Provisioning type for the custom domain. Options include `auth0ManagedCerts` and `selfManagedCerts`.
	Type pulumi.StringPtrInput
	// List(Resource). Configuration settings for verification. For details, see Verification.
	Verifications CustomDomainVerificationTypeArrayInput
}

func (CustomDomainState) ElementType() reflect.Type {
	return reflect.TypeOf((*customDomainState)(nil)).Elem()
}

type customDomainArgs struct {
	// String. Name of the custom domain.
	Domain string `pulumi:"domain"`
	// String. Provisioning type for the custom domain. Options include `auth0ManagedCerts` and `selfManagedCerts`.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a CustomDomain resource.
type CustomDomainArgs struct {
	// String. Name of the custom domain.
	Domain pulumi.StringInput
	// String. Provisioning type for the custom domain. Options include `auth0ManagedCerts` and `selfManagedCerts`.
	Type pulumi.StringInput
}

func (CustomDomainArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customDomainArgs)(nil)).Elem()
}

type CustomDomainInput interface {
	pulumi.Input

	ToCustomDomainOutput() CustomDomainOutput
	ToCustomDomainOutputWithContext(ctx context.Context) CustomDomainOutput
}

func (*CustomDomain) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomDomain)(nil)).Elem()
}

func (i *CustomDomain) ToCustomDomainOutput() CustomDomainOutput {
	return i.ToCustomDomainOutputWithContext(context.Background())
}

func (i *CustomDomain) ToCustomDomainOutputWithContext(ctx context.Context) CustomDomainOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomDomainOutput)
}

// CustomDomainArrayInput is an input type that accepts CustomDomainArray and CustomDomainArrayOutput values.
// You can construct a concrete instance of `CustomDomainArrayInput` via:
//
//	CustomDomainArray{ CustomDomainArgs{...} }
type CustomDomainArrayInput interface {
	pulumi.Input

	ToCustomDomainArrayOutput() CustomDomainArrayOutput
	ToCustomDomainArrayOutputWithContext(context.Context) CustomDomainArrayOutput
}

type CustomDomainArray []CustomDomainInput

func (CustomDomainArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomDomain)(nil)).Elem()
}

func (i CustomDomainArray) ToCustomDomainArrayOutput() CustomDomainArrayOutput {
	return i.ToCustomDomainArrayOutputWithContext(context.Background())
}

func (i CustomDomainArray) ToCustomDomainArrayOutputWithContext(ctx context.Context) CustomDomainArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomDomainArrayOutput)
}

// CustomDomainMapInput is an input type that accepts CustomDomainMap and CustomDomainMapOutput values.
// You can construct a concrete instance of `CustomDomainMapInput` via:
//
//	CustomDomainMap{ "key": CustomDomainArgs{...} }
type CustomDomainMapInput interface {
	pulumi.Input

	ToCustomDomainMapOutput() CustomDomainMapOutput
	ToCustomDomainMapOutputWithContext(context.Context) CustomDomainMapOutput
}

type CustomDomainMap map[string]CustomDomainInput

func (CustomDomainMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomDomain)(nil)).Elem()
}

func (i CustomDomainMap) ToCustomDomainMapOutput() CustomDomainMapOutput {
	return i.ToCustomDomainMapOutputWithContext(context.Background())
}

func (i CustomDomainMap) ToCustomDomainMapOutputWithContext(ctx context.Context) CustomDomainMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomDomainMapOutput)
}

type CustomDomainOutput struct{ *pulumi.OutputState }

func (CustomDomainOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomDomain)(nil)).Elem()
}

func (o CustomDomainOutput) ToCustomDomainOutput() CustomDomainOutput {
	return o
}

func (o CustomDomainOutput) ToCustomDomainOutputWithContext(ctx context.Context) CustomDomainOutput {
	return o
}

// String. Name of the custom domain.
func (o CustomDomainOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomDomain) pulumi.StringOutput { return v.Domain }).(pulumi.StringOutput)
}

// String. Once the configuration status is `ready`, the DNS name of the Auth0 origin server that handles traffic for the custom domain.
func (o CustomDomainOutput) OriginDomainName() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomDomain) pulumi.StringOutput { return v.OriginDomainName }).(pulumi.StringOutput)
}

// Boolean. Indicates whether this is a primary domain.
func (o CustomDomainOutput) Primary() pulumi.BoolOutput {
	return o.ApplyT(func(v *CustomDomain) pulumi.BoolOutput { return v.Primary }).(pulumi.BoolOutput)
}

// String. Configuration status for the custom domain. Options include `disabled`, `pending`, `pendingVerification`, and `ready`.
func (o CustomDomainOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomDomain) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// String. Provisioning type for the custom domain. Options include `auth0ManagedCerts` and `selfManagedCerts`.
func (o CustomDomainOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomDomain) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// List(Resource). Configuration settings for verification. For details, see Verification.
func (o CustomDomainOutput) Verifications() CustomDomainVerificationTypeArrayOutput {
	return o.ApplyT(func(v *CustomDomain) CustomDomainVerificationTypeArrayOutput { return v.Verifications }).(CustomDomainVerificationTypeArrayOutput)
}

type CustomDomainArrayOutput struct{ *pulumi.OutputState }

func (CustomDomainArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomDomain)(nil)).Elem()
}

func (o CustomDomainArrayOutput) ToCustomDomainArrayOutput() CustomDomainArrayOutput {
	return o
}

func (o CustomDomainArrayOutput) ToCustomDomainArrayOutputWithContext(ctx context.Context) CustomDomainArrayOutput {
	return o
}

func (o CustomDomainArrayOutput) Index(i pulumi.IntInput) CustomDomainOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomDomain {
		return vs[0].([]*CustomDomain)[vs[1].(int)]
	}).(CustomDomainOutput)
}

type CustomDomainMapOutput struct{ *pulumi.OutputState }

func (CustomDomainMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomDomain)(nil)).Elem()
}

func (o CustomDomainMapOutput) ToCustomDomainMapOutput() CustomDomainMapOutput {
	return o
}

func (o CustomDomainMapOutput) ToCustomDomainMapOutputWithContext(ctx context.Context) CustomDomainMapOutput {
	return o
}

func (o CustomDomainMapOutput) MapIndex(k pulumi.StringInput) CustomDomainOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomDomain {
		return vs[0].(map[string]*CustomDomain)[vs[1].(string)]
	}).(CustomDomainOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomDomainInput)(nil)).Elem(), &CustomDomain{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomDomainArrayInput)(nil)).Elem(), CustomDomainArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomDomainMapInput)(nil)).Elem(), CustomDomainMap{})
	pulumi.RegisterOutputType(CustomDomainOutput{})
	pulumi.RegisterOutputType(CustomDomainArrayOutput{})
	pulumi.RegisterOutputType(CustomDomainMapOutput{})
}
