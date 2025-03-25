// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With this resource, you can create and manage Flows for a tenant.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal([]map[string]interface{}{
//				map[string]interface{}{
//					"action":        "UPDATE_USER",
//					"alias":         "user meta data",
//					"allow_failure": false,
//					"id":            "update_user_PmSa",
//					"mask_output":   false,
//					"params": map[string]interface{}{
//						"changes": map[string]interface{}{
//							"user_metadata": map[string]interface{}{
//								"full_name": "{{fields.full_name}}",
//							},
//						},
//						"connection_id": "<vault_connection_id>",
//						"user_id":       "{{context.user.user_id}}",
//					},
//					"type": "AUTH0",
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			// Example:
//			_, err = auth0.NewFlow(ctx, "my_flow", &auth0.FlowArgs{
//				Actions: pulumi.String(json0),
//				Name:    pulumi.String("Flow KYC update data"),
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
// This resource can be imported using the flow ID.
//
// Example:
//
// ```sh
// $ pulumi import auth0:index/flow:Flow my_flow "af_4JwsAjokf6DpK8xJCkTRjK"
// ```
type Flow struct {
	pulumi.CustomResourceState

	// Actions of the flow.
	Actions pulumi.StringPtrOutput `pulumi:"actions"`
	// Name of the flow.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewFlow registers a new resource with the given unique name, arguments, and options.
func NewFlow(ctx *pulumi.Context,
	name string, args *FlowArgs, opts ...pulumi.ResourceOption) (*Flow, error) {
	if args == nil {
		args = &FlowArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Flow
	err := ctx.RegisterResource("auth0:index/flow:Flow", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFlow gets an existing Flow resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFlow(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FlowState, opts ...pulumi.ResourceOption) (*Flow, error) {
	var resource Flow
	err := ctx.ReadResource("auth0:index/flow:Flow", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Flow resources.
type flowState struct {
	// Actions of the flow.
	Actions *string `pulumi:"actions"`
	// Name of the flow.
	Name *string `pulumi:"name"`
}

type FlowState struct {
	// Actions of the flow.
	Actions pulumi.StringPtrInput
	// Name of the flow.
	Name pulumi.StringPtrInput
}

func (FlowState) ElementType() reflect.Type {
	return reflect.TypeOf((*flowState)(nil)).Elem()
}

type flowArgs struct {
	// Actions of the flow.
	Actions *string `pulumi:"actions"`
	// Name of the flow.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a Flow resource.
type FlowArgs struct {
	// Actions of the flow.
	Actions pulumi.StringPtrInput
	// Name of the flow.
	Name pulumi.StringPtrInput
}

func (FlowArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*flowArgs)(nil)).Elem()
}

type FlowInput interface {
	pulumi.Input

	ToFlowOutput() FlowOutput
	ToFlowOutputWithContext(ctx context.Context) FlowOutput
}

func (*Flow) ElementType() reflect.Type {
	return reflect.TypeOf((**Flow)(nil)).Elem()
}

func (i *Flow) ToFlowOutput() FlowOutput {
	return i.ToFlowOutputWithContext(context.Background())
}

func (i *Flow) ToFlowOutputWithContext(ctx context.Context) FlowOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlowOutput)
}

// FlowArrayInput is an input type that accepts FlowArray and FlowArrayOutput values.
// You can construct a concrete instance of `FlowArrayInput` via:
//
//	FlowArray{ FlowArgs{...} }
type FlowArrayInput interface {
	pulumi.Input

	ToFlowArrayOutput() FlowArrayOutput
	ToFlowArrayOutputWithContext(context.Context) FlowArrayOutput
}

type FlowArray []FlowInput

func (FlowArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Flow)(nil)).Elem()
}

func (i FlowArray) ToFlowArrayOutput() FlowArrayOutput {
	return i.ToFlowArrayOutputWithContext(context.Background())
}

func (i FlowArray) ToFlowArrayOutputWithContext(ctx context.Context) FlowArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlowArrayOutput)
}

// FlowMapInput is an input type that accepts FlowMap and FlowMapOutput values.
// You can construct a concrete instance of `FlowMapInput` via:
//
//	FlowMap{ "key": FlowArgs{...} }
type FlowMapInput interface {
	pulumi.Input

	ToFlowMapOutput() FlowMapOutput
	ToFlowMapOutputWithContext(context.Context) FlowMapOutput
}

type FlowMap map[string]FlowInput

func (FlowMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Flow)(nil)).Elem()
}

func (i FlowMap) ToFlowMapOutput() FlowMapOutput {
	return i.ToFlowMapOutputWithContext(context.Background())
}

func (i FlowMap) ToFlowMapOutputWithContext(ctx context.Context) FlowMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlowMapOutput)
}

type FlowOutput struct{ *pulumi.OutputState }

func (FlowOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Flow)(nil)).Elem()
}

func (o FlowOutput) ToFlowOutput() FlowOutput {
	return o
}

func (o FlowOutput) ToFlowOutputWithContext(ctx context.Context) FlowOutput {
	return o
}

// Actions of the flow.
func (o FlowOutput) Actions() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Flow) pulumi.StringPtrOutput { return v.Actions }).(pulumi.StringPtrOutput)
}

// Name of the flow.
func (o FlowOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Flow) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type FlowArrayOutput struct{ *pulumi.OutputState }

func (FlowArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Flow)(nil)).Elem()
}

func (o FlowArrayOutput) ToFlowArrayOutput() FlowArrayOutput {
	return o
}

func (o FlowArrayOutput) ToFlowArrayOutputWithContext(ctx context.Context) FlowArrayOutput {
	return o
}

func (o FlowArrayOutput) Index(i pulumi.IntInput) FlowOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Flow {
		return vs[0].([]*Flow)[vs[1].(int)]
	}).(FlowOutput)
}

type FlowMapOutput struct{ *pulumi.OutputState }

func (FlowMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Flow)(nil)).Elem()
}

func (o FlowMapOutput) ToFlowMapOutput() FlowMapOutput {
	return o
}

func (o FlowMapOutput) ToFlowMapOutputWithContext(ctx context.Context) FlowMapOutput {
	return o
}

func (o FlowMapOutput) MapIndex(k pulumi.StringInput) FlowOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Flow {
		return vs[0].(map[string]*Flow)[vs[1].(string)]
	}).(FlowOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FlowInput)(nil)).Elem(), &Flow{})
	pulumi.RegisterInputType(reflect.TypeOf((*FlowArrayInput)(nil)).Elem(), FlowArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FlowMapInput)(nil)).Elem(), FlowMap{})
	pulumi.RegisterOutputType(FlowOutput{})
	pulumi.RegisterOutputType(FlowArrayOutput{})
	pulumi.RegisterOutputType(FlowMapOutput{})
}
