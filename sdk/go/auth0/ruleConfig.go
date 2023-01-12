// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With Auth0, you can create custom Javascript snippets that run in a secure, isolated sandbox as part of your authentication pipeline, which are otherwise known as rules. This resource allows you to create and manage variables that are available to all rules via Auth0's global configuration object. Used in conjunction with configured rules.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := auth0.NewRule(ctx, "myRule", &auth0.RuleArgs{
//				Enabled: pulumi.Bool(true),
//				Script:  pulumi.String(fmt.Sprintf("    function (user, context, callback) {\n      callback(null, user, context);\n    }\n  \n")),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewRuleConfig(ctx, "myRuleConfig", &auth0.RuleConfigArgs{
//				Key:   pulumi.String("foo"),
//				Value: pulumi.String("bar"),
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
// Existing rule configs can be imported using their key name. # Example
//
// ```sh
//
//	$ pulumi import auth0:index/ruleConfig:RuleConfig my_rule_config foo
//
// ```
type RuleConfig struct {
	pulumi.CustomResourceState

	// Key for a rules configuration variable.
	Key pulumi.StringOutput `pulumi:"key"`
	// Value for a rules configuration variable.
	Value pulumi.StringOutput `pulumi:"value"`
}

// NewRuleConfig registers a new resource with the given unique name, arguments, and options.
func NewRuleConfig(ctx *pulumi.Context,
	name string, args *RuleConfigArgs, opts ...pulumi.ResourceOption) (*RuleConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Key == nil {
		return nil, errors.New("invalid value for required argument 'Key'")
	}
	if args.Value == nil {
		return nil, errors.New("invalid value for required argument 'Value'")
	}
	if args.Value != nil {
		args.Value = pulumi.ToSecret(args.Value).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"value",
	})
	opts = append(opts, secrets)
	var resource RuleConfig
	err := ctx.RegisterResource("auth0:index/ruleConfig:RuleConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRuleConfig gets an existing RuleConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRuleConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RuleConfigState, opts ...pulumi.ResourceOption) (*RuleConfig, error) {
	var resource RuleConfig
	err := ctx.ReadResource("auth0:index/ruleConfig:RuleConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RuleConfig resources.
type ruleConfigState struct {
	// Key for a rules configuration variable.
	Key *string `pulumi:"key"`
	// Value for a rules configuration variable.
	Value *string `pulumi:"value"`
}

type RuleConfigState struct {
	// Key for a rules configuration variable.
	Key pulumi.StringPtrInput
	// Value for a rules configuration variable.
	Value pulumi.StringPtrInput
}

func (RuleConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*ruleConfigState)(nil)).Elem()
}

type ruleConfigArgs struct {
	// Key for a rules configuration variable.
	Key string `pulumi:"key"`
	// Value for a rules configuration variable.
	Value string `pulumi:"value"`
}

// The set of arguments for constructing a RuleConfig resource.
type RuleConfigArgs struct {
	// Key for a rules configuration variable.
	Key pulumi.StringInput
	// Value for a rules configuration variable.
	Value pulumi.StringInput
}

func (RuleConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ruleConfigArgs)(nil)).Elem()
}

type RuleConfigInput interface {
	pulumi.Input

	ToRuleConfigOutput() RuleConfigOutput
	ToRuleConfigOutputWithContext(ctx context.Context) RuleConfigOutput
}

func (*RuleConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**RuleConfig)(nil)).Elem()
}

func (i *RuleConfig) ToRuleConfigOutput() RuleConfigOutput {
	return i.ToRuleConfigOutputWithContext(context.Background())
}

func (i *RuleConfig) ToRuleConfigOutputWithContext(ctx context.Context) RuleConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleConfigOutput)
}

// RuleConfigArrayInput is an input type that accepts RuleConfigArray and RuleConfigArrayOutput values.
// You can construct a concrete instance of `RuleConfigArrayInput` via:
//
//	RuleConfigArray{ RuleConfigArgs{...} }
type RuleConfigArrayInput interface {
	pulumi.Input

	ToRuleConfigArrayOutput() RuleConfigArrayOutput
	ToRuleConfigArrayOutputWithContext(context.Context) RuleConfigArrayOutput
}

type RuleConfigArray []RuleConfigInput

func (RuleConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RuleConfig)(nil)).Elem()
}

func (i RuleConfigArray) ToRuleConfigArrayOutput() RuleConfigArrayOutput {
	return i.ToRuleConfigArrayOutputWithContext(context.Background())
}

func (i RuleConfigArray) ToRuleConfigArrayOutputWithContext(ctx context.Context) RuleConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleConfigArrayOutput)
}

// RuleConfigMapInput is an input type that accepts RuleConfigMap and RuleConfigMapOutput values.
// You can construct a concrete instance of `RuleConfigMapInput` via:
//
//	RuleConfigMap{ "key": RuleConfigArgs{...} }
type RuleConfigMapInput interface {
	pulumi.Input

	ToRuleConfigMapOutput() RuleConfigMapOutput
	ToRuleConfigMapOutputWithContext(context.Context) RuleConfigMapOutput
}

type RuleConfigMap map[string]RuleConfigInput

func (RuleConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RuleConfig)(nil)).Elem()
}

func (i RuleConfigMap) ToRuleConfigMapOutput() RuleConfigMapOutput {
	return i.ToRuleConfigMapOutputWithContext(context.Background())
}

func (i RuleConfigMap) ToRuleConfigMapOutputWithContext(ctx context.Context) RuleConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleConfigMapOutput)
}

type RuleConfigOutput struct{ *pulumi.OutputState }

func (RuleConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RuleConfig)(nil)).Elem()
}

func (o RuleConfigOutput) ToRuleConfigOutput() RuleConfigOutput {
	return o
}

func (o RuleConfigOutput) ToRuleConfigOutputWithContext(ctx context.Context) RuleConfigOutput {
	return o
}

// Key for a rules configuration variable.
func (o RuleConfigOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v *RuleConfig) pulumi.StringOutput { return v.Key }).(pulumi.StringOutput)
}

// Value for a rules configuration variable.
func (o RuleConfigOutput) Value() pulumi.StringOutput {
	return o.ApplyT(func(v *RuleConfig) pulumi.StringOutput { return v.Value }).(pulumi.StringOutput)
}

type RuleConfigArrayOutput struct{ *pulumi.OutputState }

func (RuleConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RuleConfig)(nil)).Elem()
}

func (o RuleConfigArrayOutput) ToRuleConfigArrayOutput() RuleConfigArrayOutput {
	return o
}

func (o RuleConfigArrayOutput) ToRuleConfigArrayOutputWithContext(ctx context.Context) RuleConfigArrayOutput {
	return o
}

func (o RuleConfigArrayOutput) Index(i pulumi.IntInput) RuleConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RuleConfig {
		return vs[0].([]*RuleConfig)[vs[1].(int)]
	}).(RuleConfigOutput)
}

type RuleConfigMapOutput struct{ *pulumi.OutputState }

func (RuleConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RuleConfig)(nil)).Elem()
}

func (o RuleConfigMapOutput) ToRuleConfigMapOutput() RuleConfigMapOutput {
	return o
}

func (o RuleConfigMapOutput) ToRuleConfigMapOutputWithContext(ctx context.Context) RuleConfigMapOutput {
	return o
}

func (o RuleConfigMapOutput) MapIndex(k pulumi.StringInput) RuleConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RuleConfig {
		return vs[0].(map[string]*RuleConfig)[vs[1].(string)]
	}).(RuleConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RuleConfigInput)(nil)).Elem(), &RuleConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuleConfigArrayInput)(nil)).Elem(), RuleConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuleConfigMapInput)(nil)).Elem(), RuleConfigMap{})
	pulumi.RegisterOutputType(RuleConfigOutput{})
	pulumi.RegisterOutputType(RuleConfigArrayOutput{})
	pulumi.RegisterOutputType(RuleConfigMapOutput{})
}
