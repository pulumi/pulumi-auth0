// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With this resource, you can manage a customized sign up and login experience by adding custom content, form elements and css/javascript. You can read more about this [here](https://auth0.com/docs/customize/universal-login-pages/customize-signup-and-login-prompts).
//
// !> This resource manages the entire set of prompt screens enabled for a prompt. In contrast, the `PromptScreenPartial`
// resource appends a specific prompt screen to the list of prompt screens displayed to the user during the authentication flow.
//
//	To avoid potential issues, it is recommended not to use this resource in conjunction with the `PromptScreenPartial`
//	resource when managing prompt screens for the same prompt.
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
//			_, err := auth0.NewPromptScreenPartials(ctx, "prompt_screen_partials", &auth0.PromptScreenPartialsArgs{
//				PromptType: pulumi.String("login-passwordless"),
//				ScreenPartials: auth0.PromptScreenPartialsScreenPartialArray{
//					&auth0.PromptScreenPartialsScreenPartialArgs{
//						ScreenName: pulumi.String("login-passwordless-email-code"),
//						InsertionPoints: &auth0.PromptScreenPartialsScreenPartialInsertionPointsArgs{
//							FormContentStart: pulumi.String("<div>Form Content Start</div>"),
//							FormContentEnd:   pulumi.String("<div>Form Content End</div>"),
//						},
//					},
//					&auth0.PromptScreenPartialsScreenPartialArgs{
//						ScreenName: pulumi.String("login-passwordless-sms-otp"),
//						InsertionPoints: &auth0.PromptScreenPartialsScreenPartialInsertionPointsArgs{
//							FormContentStart: pulumi.String("<div>Form Content Start</div>"),
//							FormContentEnd:   pulumi.String("<div>Form Content End</div>"),
//						},
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
// This resource can be imported using the prompt name.
//
// #
//
// Example:
//
// ```sh
// $ pulumi import auth0:index/promptScreenPartials:PromptScreenPartials prompt_screen_partials "login-passwordless"
// ```
type PromptScreenPartials struct {
	pulumi.CustomResourceState

	// The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`.
	PromptType     pulumi.StringOutput                          `pulumi:"promptType"`
	ScreenPartials PromptScreenPartialsScreenPartialArrayOutput `pulumi:"screenPartials"`
}

// NewPromptScreenPartials registers a new resource with the given unique name, arguments, and options.
func NewPromptScreenPartials(ctx *pulumi.Context,
	name string, args *PromptScreenPartialsArgs, opts ...pulumi.ResourceOption) (*PromptScreenPartials, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PromptType == nil {
		return nil, errors.New("invalid value for required argument 'PromptType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PromptScreenPartials
	err := ctx.RegisterResource("auth0:index/promptScreenPartials:PromptScreenPartials", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPromptScreenPartials gets an existing PromptScreenPartials resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPromptScreenPartials(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PromptScreenPartialsState, opts ...pulumi.ResourceOption) (*PromptScreenPartials, error) {
	var resource PromptScreenPartials
	err := ctx.ReadResource("auth0:index/promptScreenPartials:PromptScreenPartials", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PromptScreenPartials resources.
type promptScreenPartialsState struct {
	// The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`.
	PromptType     *string                             `pulumi:"promptType"`
	ScreenPartials []PromptScreenPartialsScreenPartial `pulumi:"screenPartials"`
}

type PromptScreenPartialsState struct {
	// The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`.
	PromptType     pulumi.StringPtrInput
	ScreenPartials PromptScreenPartialsScreenPartialArrayInput
}

func (PromptScreenPartialsState) ElementType() reflect.Type {
	return reflect.TypeOf((*promptScreenPartialsState)(nil)).Elem()
}

type promptScreenPartialsArgs struct {
	// The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`.
	PromptType     string                              `pulumi:"promptType"`
	ScreenPartials []PromptScreenPartialsScreenPartial `pulumi:"screenPartials"`
}

// The set of arguments for constructing a PromptScreenPartials resource.
type PromptScreenPartialsArgs struct {
	// The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`.
	PromptType     pulumi.StringInput
	ScreenPartials PromptScreenPartialsScreenPartialArrayInput
}

func (PromptScreenPartialsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*promptScreenPartialsArgs)(nil)).Elem()
}

type PromptScreenPartialsInput interface {
	pulumi.Input

	ToPromptScreenPartialsOutput() PromptScreenPartialsOutput
	ToPromptScreenPartialsOutputWithContext(ctx context.Context) PromptScreenPartialsOutput
}

func (*PromptScreenPartials) ElementType() reflect.Type {
	return reflect.TypeOf((**PromptScreenPartials)(nil)).Elem()
}

func (i *PromptScreenPartials) ToPromptScreenPartialsOutput() PromptScreenPartialsOutput {
	return i.ToPromptScreenPartialsOutputWithContext(context.Background())
}

func (i *PromptScreenPartials) ToPromptScreenPartialsOutputWithContext(ctx context.Context) PromptScreenPartialsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PromptScreenPartialsOutput)
}

// PromptScreenPartialsArrayInput is an input type that accepts PromptScreenPartialsArray and PromptScreenPartialsArrayOutput values.
// You can construct a concrete instance of `PromptScreenPartialsArrayInput` via:
//
//	PromptScreenPartialsArray{ PromptScreenPartialsArgs{...} }
type PromptScreenPartialsArrayInput interface {
	pulumi.Input

	ToPromptScreenPartialsArrayOutput() PromptScreenPartialsArrayOutput
	ToPromptScreenPartialsArrayOutputWithContext(context.Context) PromptScreenPartialsArrayOutput
}

type PromptScreenPartialsArray []PromptScreenPartialsInput

func (PromptScreenPartialsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PromptScreenPartials)(nil)).Elem()
}

func (i PromptScreenPartialsArray) ToPromptScreenPartialsArrayOutput() PromptScreenPartialsArrayOutput {
	return i.ToPromptScreenPartialsArrayOutputWithContext(context.Background())
}

func (i PromptScreenPartialsArray) ToPromptScreenPartialsArrayOutputWithContext(ctx context.Context) PromptScreenPartialsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PromptScreenPartialsArrayOutput)
}

// PromptScreenPartialsMapInput is an input type that accepts PromptScreenPartialsMap and PromptScreenPartialsMapOutput values.
// You can construct a concrete instance of `PromptScreenPartialsMapInput` via:
//
//	PromptScreenPartialsMap{ "key": PromptScreenPartialsArgs{...} }
type PromptScreenPartialsMapInput interface {
	pulumi.Input

	ToPromptScreenPartialsMapOutput() PromptScreenPartialsMapOutput
	ToPromptScreenPartialsMapOutputWithContext(context.Context) PromptScreenPartialsMapOutput
}

type PromptScreenPartialsMap map[string]PromptScreenPartialsInput

func (PromptScreenPartialsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PromptScreenPartials)(nil)).Elem()
}

func (i PromptScreenPartialsMap) ToPromptScreenPartialsMapOutput() PromptScreenPartialsMapOutput {
	return i.ToPromptScreenPartialsMapOutputWithContext(context.Background())
}

func (i PromptScreenPartialsMap) ToPromptScreenPartialsMapOutputWithContext(ctx context.Context) PromptScreenPartialsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PromptScreenPartialsMapOutput)
}

type PromptScreenPartialsOutput struct{ *pulumi.OutputState }

func (PromptScreenPartialsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PromptScreenPartials)(nil)).Elem()
}

func (o PromptScreenPartialsOutput) ToPromptScreenPartialsOutput() PromptScreenPartialsOutput {
	return o
}

func (o PromptScreenPartialsOutput) ToPromptScreenPartialsOutputWithContext(ctx context.Context) PromptScreenPartialsOutput {
	return o
}

// The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`.
func (o PromptScreenPartialsOutput) PromptType() pulumi.StringOutput {
	return o.ApplyT(func(v *PromptScreenPartials) pulumi.StringOutput { return v.PromptType }).(pulumi.StringOutput)
}

func (o PromptScreenPartialsOutput) ScreenPartials() PromptScreenPartialsScreenPartialArrayOutput {
	return o.ApplyT(func(v *PromptScreenPartials) PromptScreenPartialsScreenPartialArrayOutput { return v.ScreenPartials }).(PromptScreenPartialsScreenPartialArrayOutput)
}

type PromptScreenPartialsArrayOutput struct{ *pulumi.OutputState }

func (PromptScreenPartialsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PromptScreenPartials)(nil)).Elem()
}

func (o PromptScreenPartialsArrayOutput) ToPromptScreenPartialsArrayOutput() PromptScreenPartialsArrayOutput {
	return o
}

func (o PromptScreenPartialsArrayOutput) ToPromptScreenPartialsArrayOutputWithContext(ctx context.Context) PromptScreenPartialsArrayOutput {
	return o
}

func (o PromptScreenPartialsArrayOutput) Index(i pulumi.IntInput) PromptScreenPartialsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PromptScreenPartials {
		return vs[0].([]*PromptScreenPartials)[vs[1].(int)]
	}).(PromptScreenPartialsOutput)
}

type PromptScreenPartialsMapOutput struct{ *pulumi.OutputState }

func (PromptScreenPartialsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PromptScreenPartials)(nil)).Elem()
}

func (o PromptScreenPartialsMapOutput) ToPromptScreenPartialsMapOutput() PromptScreenPartialsMapOutput {
	return o
}

func (o PromptScreenPartialsMapOutput) ToPromptScreenPartialsMapOutputWithContext(ctx context.Context) PromptScreenPartialsMapOutput {
	return o
}

func (o PromptScreenPartialsMapOutput) MapIndex(k pulumi.StringInput) PromptScreenPartialsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PromptScreenPartials {
		return vs[0].(map[string]*PromptScreenPartials)[vs[1].(string)]
	}).(PromptScreenPartialsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PromptScreenPartialsInput)(nil)).Elem(), &PromptScreenPartials{})
	pulumi.RegisterInputType(reflect.TypeOf((*PromptScreenPartialsArrayInput)(nil)).Elem(), PromptScreenPartialsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PromptScreenPartialsMapInput)(nil)).Elem(), PromptScreenPartialsMap{})
	pulumi.RegisterOutputType(PromptScreenPartialsOutput{})
	pulumi.RegisterOutputType(PromptScreenPartialsArrayOutput{})
	pulumi.RegisterOutputType(PromptScreenPartialsMapOutput{})
}