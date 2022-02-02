// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type CustomDomainVerification struct {
	pulumi.CustomResourceState

	// String. ID of the custom domain resource.
	CustomDomainId pulumi.StringOutput `pulumi:"customDomainId"`
}

// NewCustomDomainVerification registers a new resource with the given unique name, arguments, and options.
func NewCustomDomainVerification(ctx *pulumi.Context,
	name string, args *CustomDomainVerificationArgs, opts ...pulumi.ResourceOption) (*CustomDomainVerification, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CustomDomainId == nil {
		return nil, errors.New("invalid value for required argument 'CustomDomainId'")
	}
	var resource CustomDomainVerification
	err := ctx.RegisterResource("auth0:index/customDomainVerification:CustomDomainVerification", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomDomainVerification gets an existing CustomDomainVerification resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomDomainVerification(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomDomainVerificationState, opts ...pulumi.ResourceOption) (*CustomDomainVerification, error) {
	var resource CustomDomainVerification
	err := ctx.ReadResource("auth0:index/customDomainVerification:CustomDomainVerification", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomDomainVerification resources.
type customDomainVerificationState struct {
	// String. ID of the custom domain resource.
	CustomDomainId *string `pulumi:"customDomainId"`
}

type CustomDomainVerificationState struct {
	// String. ID of the custom domain resource.
	CustomDomainId pulumi.StringPtrInput
}

func (CustomDomainVerificationState) ElementType() reflect.Type {
	return reflect.TypeOf((*customDomainVerificationState)(nil)).Elem()
}

type customDomainVerificationArgs struct {
	// String. ID of the custom domain resource.
	CustomDomainId string `pulumi:"customDomainId"`
}

// The set of arguments for constructing a CustomDomainVerification resource.
type CustomDomainVerificationArgs struct {
	// String. ID of the custom domain resource.
	CustomDomainId pulumi.StringInput
}

func (CustomDomainVerificationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customDomainVerificationArgs)(nil)).Elem()
}

type CustomDomainVerificationInput interface {
	pulumi.Input

	ToCustomDomainVerificationOutput() CustomDomainVerificationOutput
	ToCustomDomainVerificationOutputWithContext(ctx context.Context) CustomDomainVerificationOutput
}

func (*CustomDomainVerification) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomDomainVerification)(nil)).Elem()
}

func (i *CustomDomainVerification) ToCustomDomainVerificationOutput() CustomDomainVerificationOutput {
	return i.ToCustomDomainVerificationOutputWithContext(context.Background())
}

func (i *CustomDomainVerification) ToCustomDomainVerificationOutputWithContext(ctx context.Context) CustomDomainVerificationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomDomainVerificationOutput)
}

// CustomDomainVerificationArrayInput is an input type that accepts CustomDomainVerificationArray and CustomDomainVerificationArrayOutput values.
// You can construct a concrete instance of `CustomDomainVerificationArrayInput` via:
//
//          CustomDomainVerificationArray{ CustomDomainVerificationArgs{...} }
type CustomDomainVerificationArrayInput interface {
	pulumi.Input

	ToCustomDomainVerificationArrayOutput() CustomDomainVerificationArrayOutput
	ToCustomDomainVerificationArrayOutputWithContext(context.Context) CustomDomainVerificationArrayOutput
}

type CustomDomainVerificationArray []CustomDomainVerificationInput

func (CustomDomainVerificationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomDomainVerification)(nil)).Elem()
}

func (i CustomDomainVerificationArray) ToCustomDomainVerificationArrayOutput() CustomDomainVerificationArrayOutput {
	return i.ToCustomDomainVerificationArrayOutputWithContext(context.Background())
}

func (i CustomDomainVerificationArray) ToCustomDomainVerificationArrayOutputWithContext(ctx context.Context) CustomDomainVerificationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomDomainVerificationArrayOutput)
}

// CustomDomainVerificationMapInput is an input type that accepts CustomDomainVerificationMap and CustomDomainVerificationMapOutput values.
// You can construct a concrete instance of `CustomDomainVerificationMapInput` via:
//
//          CustomDomainVerificationMap{ "key": CustomDomainVerificationArgs{...} }
type CustomDomainVerificationMapInput interface {
	pulumi.Input

	ToCustomDomainVerificationMapOutput() CustomDomainVerificationMapOutput
	ToCustomDomainVerificationMapOutputWithContext(context.Context) CustomDomainVerificationMapOutput
}

type CustomDomainVerificationMap map[string]CustomDomainVerificationInput

func (CustomDomainVerificationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomDomainVerification)(nil)).Elem()
}

func (i CustomDomainVerificationMap) ToCustomDomainVerificationMapOutput() CustomDomainVerificationMapOutput {
	return i.ToCustomDomainVerificationMapOutputWithContext(context.Background())
}

func (i CustomDomainVerificationMap) ToCustomDomainVerificationMapOutputWithContext(ctx context.Context) CustomDomainVerificationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomDomainVerificationMapOutput)
}

type CustomDomainVerificationOutput struct{ *pulumi.OutputState }

func (CustomDomainVerificationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomDomainVerification)(nil)).Elem()
}

func (o CustomDomainVerificationOutput) ToCustomDomainVerificationOutput() CustomDomainVerificationOutput {
	return o
}

func (o CustomDomainVerificationOutput) ToCustomDomainVerificationOutputWithContext(ctx context.Context) CustomDomainVerificationOutput {
	return o
}

type CustomDomainVerificationArrayOutput struct{ *pulumi.OutputState }

func (CustomDomainVerificationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomDomainVerification)(nil)).Elem()
}

func (o CustomDomainVerificationArrayOutput) ToCustomDomainVerificationArrayOutput() CustomDomainVerificationArrayOutput {
	return o
}

func (o CustomDomainVerificationArrayOutput) ToCustomDomainVerificationArrayOutputWithContext(ctx context.Context) CustomDomainVerificationArrayOutput {
	return o
}

func (o CustomDomainVerificationArrayOutput) Index(i pulumi.IntInput) CustomDomainVerificationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomDomainVerification {
		return vs[0].([]*CustomDomainVerification)[vs[1].(int)]
	}).(CustomDomainVerificationOutput)
}

type CustomDomainVerificationMapOutput struct{ *pulumi.OutputState }

func (CustomDomainVerificationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomDomainVerification)(nil)).Elem()
}

func (o CustomDomainVerificationMapOutput) ToCustomDomainVerificationMapOutput() CustomDomainVerificationMapOutput {
	return o
}

func (o CustomDomainVerificationMapOutput) ToCustomDomainVerificationMapOutputWithContext(ctx context.Context) CustomDomainVerificationMapOutput {
	return o
}

func (o CustomDomainVerificationMapOutput) MapIndex(k pulumi.StringInput) CustomDomainVerificationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomDomainVerification {
		return vs[0].(map[string]*CustomDomainVerification)[vs[1].(string)]
	}).(CustomDomainVerificationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomDomainVerificationInput)(nil)).Elem(), &CustomDomainVerification{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomDomainVerificationArrayInput)(nil)).Elem(), CustomDomainVerificationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomDomainVerificationMapInput)(nil)).Elem(), CustomDomainVerificationMap{})
	pulumi.RegisterOutputType(CustomDomainVerificationOutput{})
	pulumi.RegisterOutputType(CustomDomainVerificationArrayOutput{})
	pulumi.RegisterOutputType(CustomDomainVerificationMapOutput{})
}
