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

// With this resource, you can bind an action to a trigger. Once an action is created and deployed, it can be attached (i.e. bound) to a trigger so that it will be executed as part of a flow.
//
// Ordering of an action within a specific flow is not currently supported when using this resource; the action will get appended to the end of the flow. To precisely manage ordering, it is advised to either do so with the dashboard UI or with the `auth0TriggerBindings` resource.
//
// !> This resource appends an action to the trigger binding. In contrast, the `TriggerActions` resource manages all
// the action bindings to a trigger. To avoid potential issues, it is recommended not to use this resource in conjunction
// with the `TriggerAction` resource when binding actions to the same trigger.
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
//			loginAlert, err := auth0.NewAction(ctx, "login_alert", &auth0.ActionArgs{
//				Name:   pulumi.String("Alert after login"),
//				Code:   pulumi.String("exports.onContinuePostLogin = async (event, api) => {\n  console.log(\"foo\");\n};\"\n"),
//				Deploy: pulumi.Bool(true),
//				SupportedTriggers: &auth0.ActionSupportedTriggersArgs{
//					Id:      pulumi.String("post-login"),
//					Version: pulumi.String("v3"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewTriggerAction(ctx, "post_login_alert_action", &auth0.TriggerActionArgs{
//				Trigger:  pulumi.String("post-login"),
//				ActionId: loginAlert.ID(),
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
// # This resource can be imported by specifying the
//
// trigger and action ID separated by "::" (note the double colon)
//
// <trigger>::<actionID>
//
// Example:
//
// ```sh
// $ pulumi import auth0:index/triggerAction:TriggerAction post_login_action "post-login::28b5c8fa-d371-5734-acf6-d0cf80ead918"
// ```
type TriggerAction struct {
	pulumi.CustomResourceState

	// The ID of the action to bind to the trigger.
	ActionId pulumi.StringOutput `pulumi:"actionId"`
	// The name for this action within the trigger. This can be useful for distinguishing between multiple instances of the same action bound to a trigger. Defaults to action name when not provided.
	DisplayName pulumi.StringOutput `pulumi:"displayName"`
	// The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-email-provider`, `custom-phone-provider`.
	Trigger pulumi.StringOutput `pulumi:"trigger"`
}

// NewTriggerAction registers a new resource with the given unique name, arguments, and options.
func NewTriggerAction(ctx *pulumi.Context,
	name string, args *TriggerActionArgs, opts ...pulumi.ResourceOption) (*TriggerAction, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ActionId == nil {
		return nil, errors.New("invalid value for required argument 'ActionId'")
	}
	if args.Trigger == nil {
		return nil, errors.New("invalid value for required argument 'Trigger'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TriggerAction
	err := ctx.RegisterResource("auth0:index/triggerAction:TriggerAction", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTriggerAction gets an existing TriggerAction resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTriggerAction(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TriggerActionState, opts ...pulumi.ResourceOption) (*TriggerAction, error) {
	var resource TriggerAction
	err := ctx.ReadResource("auth0:index/triggerAction:TriggerAction", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TriggerAction resources.
type triggerActionState struct {
	// The ID of the action to bind to the trigger.
	ActionId *string `pulumi:"actionId"`
	// The name for this action within the trigger. This can be useful for distinguishing between multiple instances of the same action bound to a trigger. Defaults to action name when not provided.
	DisplayName *string `pulumi:"displayName"`
	// The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-email-provider`, `custom-phone-provider`.
	Trigger *string `pulumi:"trigger"`
}

type TriggerActionState struct {
	// The ID of the action to bind to the trigger.
	ActionId pulumi.StringPtrInput
	// The name for this action within the trigger. This can be useful for distinguishing between multiple instances of the same action bound to a trigger. Defaults to action name when not provided.
	DisplayName pulumi.StringPtrInput
	// The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-email-provider`, `custom-phone-provider`.
	Trigger pulumi.StringPtrInput
}

func (TriggerActionState) ElementType() reflect.Type {
	return reflect.TypeOf((*triggerActionState)(nil)).Elem()
}

type triggerActionArgs struct {
	// The ID of the action to bind to the trigger.
	ActionId string `pulumi:"actionId"`
	// The name for this action within the trigger. This can be useful for distinguishing between multiple instances of the same action bound to a trigger. Defaults to action name when not provided.
	DisplayName *string `pulumi:"displayName"`
	// The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-email-provider`, `custom-phone-provider`.
	Trigger string `pulumi:"trigger"`
}

// The set of arguments for constructing a TriggerAction resource.
type TriggerActionArgs struct {
	// The ID of the action to bind to the trigger.
	ActionId pulumi.StringInput
	// The name for this action within the trigger. This can be useful for distinguishing between multiple instances of the same action bound to a trigger. Defaults to action name when not provided.
	DisplayName pulumi.StringPtrInput
	// The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-email-provider`, `custom-phone-provider`.
	Trigger pulumi.StringInput
}

func (TriggerActionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*triggerActionArgs)(nil)).Elem()
}

type TriggerActionInput interface {
	pulumi.Input

	ToTriggerActionOutput() TriggerActionOutput
	ToTriggerActionOutputWithContext(ctx context.Context) TriggerActionOutput
}

func (*TriggerAction) ElementType() reflect.Type {
	return reflect.TypeOf((**TriggerAction)(nil)).Elem()
}

func (i *TriggerAction) ToTriggerActionOutput() TriggerActionOutput {
	return i.ToTriggerActionOutputWithContext(context.Background())
}

func (i *TriggerAction) ToTriggerActionOutputWithContext(ctx context.Context) TriggerActionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TriggerActionOutput)
}

// TriggerActionArrayInput is an input type that accepts TriggerActionArray and TriggerActionArrayOutput values.
// You can construct a concrete instance of `TriggerActionArrayInput` via:
//
//	TriggerActionArray{ TriggerActionArgs{...} }
type TriggerActionArrayInput interface {
	pulumi.Input

	ToTriggerActionArrayOutput() TriggerActionArrayOutput
	ToTriggerActionArrayOutputWithContext(context.Context) TriggerActionArrayOutput
}

type TriggerActionArray []TriggerActionInput

func (TriggerActionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TriggerAction)(nil)).Elem()
}

func (i TriggerActionArray) ToTriggerActionArrayOutput() TriggerActionArrayOutput {
	return i.ToTriggerActionArrayOutputWithContext(context.Background())
}

func (i TriggerActionArray) ToTriggerActionArrayOutputWithContext(ctx context.Context) TriggerActionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TriggerActionArrayOutput)
}

// TriggerActionMapInput is an input type that accepts TriggerActionMap and TriggerActionMapOutput values.
// You can construct a concrete instance of `TriggerActionMapInput` via:
//
//	TriggerActionMap{ "key": TriggerActionArgs{...} }
type TriggerActionMapInput interface {
	pulumi.Input

	ToTriggerActionMapOutput() TriggerActionMapOutput
	ToTriggerActionMapOutputWithContext(context.Context) TriggerActionMapOutput
}

type TriggerActionMap map[string]TriggerActionInput

func (TriggerActionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TriggerAction)(nil)).Elem()
}

func (i TriggerActionMap) ToTriggerActionMapOutput() TriggerActionMapOutput {
	return i.ToTriggerActionMapOutputWithContext(context.Background())
}

func (i TriggerActionMap) ToTriggerActionMapOutputWithContext(ctx context.Context) TriggerActionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TriggerActionMapOutput)
}

type TriggerActionOutput struct{ *pulumi.OutputState }

func (TriggerActionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TriggerAction)(nil)).Elem()
}

func (o TriggerActionOutput) ToTriggerActionOutput() TriggerActionOutput {
	return o
}

func (o TriggerActionOutput) ToTriggerActionOutputWithContext(ctx context.Context) TriggerActionOutput {
	return o
}

// The ID of the action to bind to the trigger.
func (o TriggerActionOutput) ActionId() pulumi.StringOutput {
	return o.ApplyT(func(v *TriggerAction) pulumi.StringOutput { return v.ActionId }).(pulumi.StringOutput)
}

// The name for this action within the trigger. This can be useful for distinguishing between multiple instances of the same action bound to a trigger. Defaults to action name when not provided.
func (o TriggerActionOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v *TriggerAction) pulumi.StringOutput { return v.DisplayName }).(pulumi.StringOutput)
}

// The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-email-provider`, `custom-phone-provider`.
func (o TriggerActionOutput) Trigger() pulumi.StringOutput {
	return o.ApplyT(func(v *TriggerAction) pulumi.StringOutput { return v.Trigger }).(pulumi.StringOutput)
}

type TriggerActionArrayOutput struct{ *pulumi.OutputState }

func (TriggerActionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TriggerAction)(nil)).Elem()
}

func (o TriggerActionArrayOutput) ToTriggerActionArrayOutput() TriggerActionArrayOutput {
	return o
}

func (o TriggerActionArrayOutput) ToTriggerActionArrayOutputWithContext(ctx context.Context) TriggerActionArrayOutput {
	return o
}

func (o TriggerActionArrayOutput) Index(i pulumi.IntInput) TriggerActionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TriggerAction {
		return vs[0].([]*TriggerAction)[vs[1].(int)]
	}).(TriggerActionOutput)
}

type TriggerActionMapOutput struct{ *pulumi.OutputState }

func (TriggerActionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TriggerAction)(nil)).Elem()
}

func (o TriggerActionMapOutput) ToTriggerActionMapOutput() TriggerActionMapOutput {
	return o
}

func (o TriggerActionMapOutput) ToTriggerActionMapOutputWithContext(ctx context.Context) TriggerActionMapOutput {
	return o
}

func (o TriggerActionMapOutput) MapIndex(k pulumi.StringInput) TriggerActionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TriggerAction {
		return vs[0].(map[string]*TriggerAction)[vs[1].(string)]
	}).(TriggerActionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TriggerActionInput)(nil)).Elem(), &TriggerAction{})
	pulumi.RegisterInputType(reflect.TypeOf((*TriggerActionArrayInput)(nil)).Elem(), TriggerActionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TriggerActionMapInput)(nil)).Elem(), TriggerActionMap{})
	pulumi.RegisterOutputType(TriggerActionOutput{})
	pulumi.RegisterOutputType(TriggerActionArrayOutput{})
	pulumi.RegisterOutputType(TriggerActionMapOutput{})
}
