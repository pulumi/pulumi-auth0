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
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			_, err := auth0.NewPromptPartials(ctx, "myLoginPromptPartials", &auth0.PromptPartialsArgs{
//				FormContentEnd:        pulumi.String("<div>Updated Form Content End</div>"),
//				FormContentStart:      pulumi.String("<div>Updated Form Content Start</div>"),
//				FormFooterEnd:         pulumi.String("<div>Updated Footer End</div>"),
//				FormFooterStart:       pulumi.String("<div>Updated Footer Start</div>"),
//				Prompt:                pulumi.String("login"),
//				SecondaryActionsEnd:   pulumi.String("<div>Updated Secondary Actions End</div>"),
//				SecondaryActionsStart: pulumi.String("<div>Updated Secondary Actions Start</div>"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
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
// $ pulumi import auth0:index/promptPartials:PromptPartials my_login_prompt_partials "login"
// ```
type PromptPartials struct {
	pulumi.CustomResourceState

	// Content that goes at the end of the form.
	FormContentEnd pulumi.StringPtrOutput `pulumi:"formContentEnd"`
	// Content that goes at the start of the form.
	FormContentStart pulumi.StringPtrOutput `pulumi:"formContentStart"`
	// Footer content for the end of the footer.
	FormFooterEnd pulumi.StringPtrOutput `pulumi:"formFooterEnd"`
	// Footer content for the start of the footer.
	FormFooterStart pulumi.StringPtrOutput `pulumi:"formFooterStart"`
	// The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`.
	Prompt pulumi.StringOutput `pulumi:"prompt"`
	// Actions that go at the end of secondary actions.
	SecondaryActionsEnd pulumi.StringPtrOutput `pulumi:"secondaryActionsEnd"`
	// Actions that go at the start of secondary actions.
	SecondaryActionsStart pulumi.StringPtrOutput `pulumi:"secondaryActionsStart"`
}

// NewPromptPartials registers a new resource with the given unique name, arguments, and options.
func NewPromptPartials(ctx *pulumi.Context,
	name string, args *PromptPartialsArgs, opts ...pulumi.ResourceOption) (*PromptPartials, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Prompt == nil {
		return nil, errors.New("invalid value for required argument 'Prompt'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PromptPartials
	err := ctx.RegisterResource("auth0:index/promptPartials:PromptPartials", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPromptPartials gets an existing PromptPartials resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPromptPartials(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PromptPartialsState, opts ...pulumi.ResourceOption) (*PromptPartials, error) {
	var resource PromptPartials
	err := ctx.ReadResource("auth0:index/promptPartials:PromptPartials", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PromptPartials resources.
type promptPartialsState struct {
	// Content that goes at the end of the form.
	FormContentEnd *string `pulumi:"formContentEnd"`
	// Content that goes at the start of the form.
	FormContentStart *string `pulumi:"formContentStart"`
	// Footer content for the end of the footer.
	FormFooterEnd *string `pulumi:"formFooterEnd"`
	// Footer content for the start of the footer.
	FormFooterStart *string `pulumi:"formFooterStart"`
	// The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`.
	Prompt *string `pulumi:"prompt"`
	// Actions that go at the end of secondary actions.
	SecondaryActionsEnd *string `pulumi:"secondaryActionsEnd"`
	// Actions that go at the start of secondary actions.
	SecondaryActionsStart *string `pulumi:"secondaryActionsStart"`
}

type PromptPartialsState struct {
	// Content that goes at the end of the form.
	FormContentEnd pulumi.StringPtrInput
	// Content that goes at the start of the form.
	FormContentStart pulumi.StringPtrInput
	// Footer content for the end of the footer.
	FormFooterEnd pulumi.StringPtrInput
	// Footer content for the start of the footer.
	FormFooterStart pulumi.StringPtrInput
	// The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`.
	Prompt pulumi.StringPtrInput
	// Actions that go at the end of secondary actions.
	SecondaryActionsEnd pulumi.StringPtrInput
	// Actions that go at the start of secondary actions.
	SecondaryActionsStart pulumi.StringPtrInput
}

func (PromptPartialsState) ElementType() reflect.Type {
	return reflect.TypeOf((*promptPartialsState)(nil)).Elem()
}

type promptPartialsArgs struct {
	// Content that goes at the end of the form.
	FormContentEnd *string `pulumi:"formContentEnd"`
	// Content that goes at the start of the form.
	FormContentStart *string `pulumi:"formContentStart"`
	// Footer content for the end of the footer.
	FormFooterEnd *string `pulumi:"formFooterEnd"`
	// Footer content for the start of the footer.
	FormFooterStart *string `pulumi:"formFooterStart"`
	// The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`.
	Prompt string `pulumi:"prompt"`
	// Actions that go at the end of secondary actions.
	SecondaryActionsEnd *string `pulumi:"secondaryActionsEnd"`
	// Actions that go at the start of secondary actions.
	SecondaryActionsStart *string `pulumi:"secondaryActionsStart"`
}

// The set of arguments for constructing a PromptPartials resource.
type PromptPartialsArgs struct {
	// Content that goes at the end of the form.
	FormContentEnd pulumi.StringPtrInput
	// Content that goes at the start of the form.
	FormContentStart pulumi.StringPtrInput
	// Footer content for the end of the footer.
	FormFooterEnd pulumi.StringPtrInput
	// Footer content for the start of the footer.
	FormFooterStart pulumi.StringPtrInput
	// The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`.
	Prompt pulumi.StringInput
	// Actions that go at the end of secondary actions.
	SecondaryActionsEnd pulumi.StringPtrInput
	// Actions that go at the start of secondary actions.
	SecondaryActionsStart pulumi.StringPtrInput
}

func (PromptPartialsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*promptPartialsArgs)(nil)).Elem()
}

type PromptPartialsInput interface {
	pulumi.Input

	ToPromptPartialsOutput() PromptPartialsOutput
	ToPromptPartialsOutputWithContext(ctx context.Context) PromptPartialsOutput
}

func (*PromptPartials) ElementType() reflect.Type {
	return reflect.TypeOf((**PromptPartials)(nil)).Elem()
}

func (i *PromptPartials) ToPromptPartialsOutput() PromptPartialsOutput {
	return i.ToPromptPartialsOutputWithContext(context.Background())
}

func (i *PromptPartials) ToPromptPartialsOutputWithContext(ctx context.Context) PromptPartialsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PromptPartialsOutput)
}

// PromptPartialsArrayInput is an input type that accepts PromptPartialsArray and PromptPartialsArrayOutput values.
// You can construct a concrete instance of `PromptPartialsArrayInput` via:
//
//	PromptPartialsArray{ PromptPartialsArgs{...} }
type PromptPartialsArrayInput interface {
	pulumi.Input

	ToPromptPartialsArrayOutput() PromptPartialsArrayOutput
	ToPromptPartialsArrayOutputWithContext(context.Context) PromptPartialsArrayOutput
}

type PromptPartialsArray []PromptPartialsInput

func (PromptPartialsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PromptPartials)(nil)).Elem()
}

func (i PromptPartialsArray) ToPromptPartialsArrayOutput() PromptPartialsArrayOutput {
	return i.ToPromptPartialsArrayOutputWithContext(context.Background())
}

func (i PromptPartialsArray) ToPromptPartialsArrayOutputWithContext(ctx context.Context) PromptPartialsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PromptPartialsArrayOutput)
}

// PromptPartialsMapInput is an input type that accepts PromptPartialsMap and PromptPartialsMapOutput values.
// You can construct a concrete instance of `PromptPartialsMapInput` via:
//
//	PromptPartialsMap{ "key": PromptPartialsArgs{...} }
type PromptPartialsMapInput interface {
	pulumi.Input

	ToPromptPartialsMapOutput() PromptPartialsMapOutput
	ToPromptPartialsMapOutputWithContext(context.Context) PromptPartialsMapOutput
}

type PromptPartialsMap map[string]PromptPartialsInput

func (PromptPartialsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PromptPartials)(nil)).Elem()
}

func (i PromptPartialsMap) ToPromptPartialsMapOutput() PromptPartialsMapOutput {
	return i.ToPromptPartialsMapOutputWithContext(context.Background())
}

func (i PromptPartialsMap) ToPromptPartialsMapOutputWithContext(ctx context.Context) PromptPartialsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PromptPartialsMapOutput)
}

type PromptPartialsOutput struct{ *pulumi.OutputState }

func (PromptPartialsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PromptPartials)(nil)).Elem()
}

func (o PromptPartialsOutput) ToPromptPartialsOutput() PromptPartialsOutput {
	return o
}

func (o PromptPartialsOutput) ToPromptPartialsOutputWithContext(ctx context.Context) PromptPartialsOutput {
	return o
}

// Content that goes at the end of the form.
func (o PromptPartialsOutput) FormContentEnd() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PromptPartials) pulumi.StringPtrOutput { return v.FormContentEnd }).(pulumi.StringPtrOutput)
}

// Content that goes at the start of the form.
func (o PromptPartialsOutput) FormContentStart() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PromptPartials) pulumi.StringPtrOutput { return v.FormContentStart }).(pulumi.StringPtrOutput)
}

// Footer content for the end of the footer.
func (o PromptPartialsOutput) FormFooterEnd() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PromptPartials) pulumi.StringPtrOutput { return v.FormFooterEnd }).(pulumi.StringPtrOutput)
}

// Footer content for the start of the footer.
func (o PromptPartialsOutput) FormFooterStart() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PromptPartials) pulumi.StringPtrOutput { return v.FormFooterStart }).(pulumi.StringPtrOutput)
}

// The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`.
func (o PromptPartialsOutput) Prompt() pulumi.StringOutput {
	return o.ApplyT(func(v *PromptPartials) pulumi.StringOutput { return v.Prompt }).(pulumi.StringOutput)
}

// Actions that go at the end of secondary actions.
func (o PromptPartialsOutput) SecondaryActionsEnd() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PromptPartials) pulumi.StringPtrOutput { return v.SecondaryActionsEnd }).(pulumi.StringPtrOutput)
}

// Actions that go at the start of secondary actions.
func (o PromptPartialsOutput) SecondaryActionsStart() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PromptPartials) pulumi.StringPtrOutput { return v.SecondaryActionsStart }).(pulumi.StringPtrOutput)
}

type PromptPartialsArrayOutput struct{ *pulumi.OutputState }

func (PromptPartialsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PromptPartials)(nil)).Elem()
}

func (o PromptPartialsArrayOutput) ToPromptPartialsArrayOutput() PromptPartialsArrayOutput {
	return o
}

func (o PromptPartialsArrayOutput) ToPromptPartialsArrayOutputWithContext(ctx context.Context) PromptPartialsArrayOutput {
	return o
}

func (o PromptPartialsArrayOutput) Index(i pulumi.IntInput) PromptPartialsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PromptPartials {
		return vs[0].([]*PromptPartials)[vs[1].(int)]
	}).(PromptPartialsOutput)
}

type PromptPartialsMapOutput struct{ *pulumi.OutputState }

func (PromptPartialsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PromptPartials)(nil)).Elem()
}

func (o PromptPartialsMapOutput) ToPromptPartialsMapOutput() PromptPartialsMapOutput {
	return o
}

func (o PromptPartialsMapOutput) ToPromptPartialsMapOutputWithContext(ctx context.Context) PromptPartialsMapOutput {
	return o
}

func (o PromptPartialsMapOutput) MapIndex(k pulumi.StringInput) PromptPartialsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PromptPartials {
		return vs[0].(map[string]*PromptPartials)[vs[1].(string)]
	}).(PromptPartialsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PromptPartialsInput)(nil)).Elem(), &PromptPartials{})
	pulumi.RegisterInputType(reflect.TypeOf((*PromptPartialsArrayInput)(nil)).Elem(), PromptPartialsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PromptPartialsMapInput)(nil)).Elem(), PromptPartialsMap{})
	pulumi.RegisterOutputType(PromptPartialsOutput{})
	pulumi.RegisterOutputType(PromptPartialsArrayOutput{})
	pulumi.RegisterOutputType(PromptPartialsMapOutput{})
}
