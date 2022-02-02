// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With this resource, you can bind an action to a trigger. Once an action is
// created and deployed, it can be attached (i.e. bound) to a trigger so that it
// will be executed as part of a flow.
//
// The list of actions reflects the order in which they will be executed during the
// appropriate flow.
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
// 		actionFoo, err := auth0.NewAction(ctx, "actionFoo", &auth0.ActionArgs{
// 			SupportedTriggers: &ActionSupportedTriggersArgs{
// 				Id:      pulumi.String("post-login"),
// 				Version: pulumi.String("v2"),
// 			},
// 			Code: pulumi.String(fmt.Sprintf("%v%v%v", "exports.onContinuePostLogin = async (event, api) => { \n", "	console.log(\"foo\") \n", "};\"\n")),
// 			Deploy: pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		actionBar, err := auth0.NewAction(ctx, "actionBar", &auth0.ActionArgs{
// 			SupportedTriggers: &ActionSupportedTriggersArgs{
// 				Id:      pulumi.String("post-login"),
// 				Version: pulumi.String("v2"),
// 			},
// 			Code: pulumi.String(fmt.Sprintf("%v%v%v", "exports.onContinuePostLogin = async (event, api) => { \n", "	console.log(\"bar\") \n", "};\"\n")),
// 			Deploy: pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = auth0.NewTriggerBinding(ctx, "loginFlow", &auth0.TriggerBindingArgs{
// 			Trigger: pulumi.String("post-login"),
// 			Actions: TriggerBindingActionArray{
// 				&TriggerBindingActionArgs{
// 					Id:          actionFoo.ID(),
// 					DisplayName: actionFoo.Name,
// 				},
// 				&TriggerBindingActionArgs{
// 					Id:          actionBar.ID(),
// 					DisplayName: actionBar.Name,
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// auth0_trigger_binding can be imported using the bindings trigger ID, e.g.
//
// ```sh
//  $ pulumi import auth0:index/triggerBinding:TriggerBinding example "post-login"
// ```
type TriggerBinding struct {
	pulumi.CustomResourceState

	// The actions bound to this trigger. For details, see
	// Actions.
	Actions TriggerBindingActionArrayOutput `pulumi:"actions"`
	// The id of the trigger to bind with
	Trigger pulumi.StringOutput `pulumi:"trigger"`
}

// NewTriggerBinding registers a new resource with the given unique name, arguments, and options.
func NewTriggerBinding(ctx *pulumi.Context,
	name string, args *TriggerBindingArgs, opts ...pulumi.ResourceOption) (*TriggerBinding, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Actions == nil {
		return nil, errors.New("invalid value for required argument 'Actions'")
	}
	if args.Trigger == nil {
		return nil, errors.New("invalid value for required argument 'Trigger'")
	}
	var resource TriggerBinding
	err := ctx.RegisterResource("auth0:index/triggerBinding:TriggerBinding", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTriggerBinding gets an existing TriggerBinding resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTriggerBinding(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TriggerBindingState, opts ...pulumi.ResourceOption) (*TriggerBinding, error) {
	var resource TriggerBinding
	err := ctx.ReadResource("auth0:index/triggerBinding:TriggerBinding", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TriggerBinding resources.
type triggerBindingState struct {
	// The actions bound to this trigger. For details, see
	// Actions.
	Actions []TriggerBindingAction `pulumi:"actions"`
	// The id of the trigger to bind with
	Trigger *string `pulumi:"trigger"`
}

type TriggerBindingState struct {
	// The actions bound to this trigger. For details, see
	// Actions.
	Actions TriggerBindingActionArrayInput
	// The id of the trigger to bind with
	Trigger pulumi.StringPtrInput
}

func (TriggerBindingState) ElementType() reflect.Type {
	return reflect.TypeOf((*triggerBindingState)(nil)).Elem()
}

type triggerBindingArgs struct {
	// The actions bound to this trigger. For details, see
	// Actions.
	Actions []TriggerBindingAction `pulumi:"actions"`
	// The id of the trigger to bind with
	Trigger string `pulumi:"trigger"`
}

// The set of arguments for constructing a TriggerBinding resource.
type TriggerBindingArgs struct {
	// The actions bound to this trigger. For details, see
	// Actions.
	Actions TriggerBindingActionArrayInput
	// The id of the trigger to bind with
	Trigger pulumi.StringInput
}

func (TriggerBindingArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*triggerBindingArgs)(nil)).Elem()
}

type TriggerBindingInput interface {
	pulumi.Input

	ToTriggerBindingOutput() TriggerBindingOutput
	ToTriggerBindingOutputWithContext(ctx context.Context) TriggerBindingOutput
}

func (*TriggerBinding) ElementType() reflect.Type {
	return reflect.TypeOf((**TriggerBinding)(nil)).Elem()
}

func (i *TriggerBinding) ToTriggerBindingOutput() TriggerBindingOutput {
	return i.ToTriggerBindingOutputWithContext(context.Background())
}

func (i *TriggerBinding) ToTriggerBindingOutputWithContext(ctx context.Context) TriggerBindingOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TriggerBindingOutput)
}

// TriggerBindingArrayInput is an input type that accepts TriggerBindingArray and TriggerBindingArrayOutput values.
// You can construct a concrete instance of `TriggerBindingArrayInput` via:
//
//          TriggerBindingArray{ TriggerBindingArgs{...} }
type TriggerBindingArrayInput interface {
	pulumi.Input

	ToTriggerBindingArrayOutput() TriggerBindingArrayOutput
	ToTriggerBindingArrayOutputWithContext(context.Context) TriggerBindingArrayOutput
}

type TriggerBindingArray []TriggerBindingInput

func (TriggerBindingArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TriggerBinding)(nil)).Elem()
}

func (i TriggerBindingArray) ToTriggerBindingArrayOutput() TriggerBindingArrayOutput {
	return i.ToTriggerBindingArrayOutputWithContext(context.Background())
}

func (i TriggerBindingArray) ToTriggerBindingArrayOutputWithContext(ctx context.Context) TriggerBindingArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TriggerBindingArrayOutput)
}

// TriggerBindingMapInput is an input type that accepts TriggerBindingMap and TriggerBindingMapOutput values.
// You can construct a concrete instance of `TriggerBindingMapInput` via:
//
//          TriggerBindingMap{ "key": TriggerBindingArgs{...} }
type TriggerBindingMapInput interface {
	pulumi.Input

	ToTriggerBindingMapOutput() TriggerBindingMapOutput
	ToTriggerBindingMapOutputWithContext(context.Context) TriggerBindingMapOutput
}

type TriggerBindingMap map[string]TriggerBindingInput

func (TriggerBindingMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TriggerBinding)(nil)).Elem()
}

func (i TriggerBindingMap) ToTriggerBindingMapOutput() TriggerBindingMapOutput {
	return i.ToTriggerBindingMapOutputWithContext(context.Background())
}

func (i TriggerBindingMap) ToTriggerBindingMapOutputWithContext(ctx context.Context) TriggerBindingMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TriggerBindingMapOutput)
}

type TriggerBindingOutput struct{ *pulumi.OutputState }

func (TriggerBindingOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TriggerBinding)(nil)).Elem()
}

func (o TriggerBindingOutput) ToTriggerBindingOutput() TriggerBindingOutput {
	return o
}

func (o TriggerBindingOutput) ToTriggerBindingOutputWithContext(ctx context.Context) TriggerBindingOutput {
	return o
}

type TriggerBindingArrayOutput struct{ *pulumi.OutputState }

func (TriggerBindingArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TriggerBinding)(nil)).Elem()
}

func (o TriggerBindingArrayOutput) ToTriggerBindingArrayOutput() TriggerBindingArrayOutput {
	return o
}

func (o TriggerBindingArrayOutput) ToTriggerBindingArrayOutputWithContext(ctx context.Context) TriggerBindingArrayOutput {
	return o
}

func (o TriggerBindingArrayOutput) Index(i pulumi.IntInput) TriggerBindingOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TriggerBinding {
		return vs[0].([]*TriggerBinding)[vs[1].(int)]
	}).(TriggerBindingOutput)
}

type TriggerBindingMapOutput struct{ *pulumi.OutputState }

func (TriggerBindingMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TriggerBinding)(nil)).Elem()
}

func (o TriggerBindingMapOutput) ToTriggerBindingMapOutput() TriggerBindingMapOutput {
	return o
}

func (o TriggerBindingMapOutput) ToTriggerBindingMapOutputWithContext(ctx context.Context) TriggerBindingMapOutput {
	return o
}

func (o TriggerBindingMapOutput) MapIndex(k pulumi.StringInput) TriggerBindingOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TriggerBinding {
		return vs[0].(map[string]*TriggerBinding)[vs[1].(string)]
	}).(TriggerBindingOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TriggerBindingInput)(nil)).Elem(), &TriggerBinding{})
	pulumi.RegisterInputType(reflect.TypeOf((*TriggerBindingArrayInput)(nil)).Elem(), TriggerBindingArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TriggerBindingMapInput)(nil)).Elem(), TriggerBindingMap{})
	pulumi.RegisterOutputType(TriggerBindingOutput{})
	pulumi.RegisterOutputType(TriggerBindingArrayOutput{})
	pulumi.RegisterOutputType(TriggerBindingMapOutput{})
}
