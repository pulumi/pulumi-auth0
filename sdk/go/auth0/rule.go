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

// With Auth0, you can create custom Javascript snippets that run in a secure, isolated sandbox as part of your authentication pipeline, which are otherwise known as rules. This resource allows you to create and manage rules. You can create global variable for use with rules by using the `RuleConfig` resource.
//
// !> This resource is deprecated. Refer to the [guide on how to migrate from rules to actions](https://auth0.com/docs/customize/actions/migrate/migrate-from-rules-to-actions) and manage your actions using the `Action` resource.
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
//			_, err := auth0.NewRule(ctx, "myRule", &auth0.RuleArgs{
//				Enabled: pulumi.Bool(true),
//				Script:  pulumi.String("    function (user, context, callback) {\n      callback(null, user, context);\n    }\n  \n"),
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
// Existing rules can be imported using their ID.
//
// #
//
//	Example:
//
// ```sh
// $ pulumi import auth0:index/rule:Rule my_rule "rul_XXXXXXXXXXXXX"
// ```
type Rule struct {
	pulumi.CustomResourceState

	// Indicates whether the rule is enabled.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
	Name pulumi.StringOutput `pulumi:"name"`
	// Order in which the rule executes relative to other rules. Lower-valued rules execute first.
	Order pulumi.IntOutput `pulumi:"order"`
	// Code to be executed when the rule runs.
	Script pulumi.StringOutput `pulumi:"script"`
}

// NewRule registers a new resource with the given unique name, arguments, and options.
func NewRule(ctx *pulumi.Context,
	name string, args *RuleArgs, opts ...pulumi.ResourceOption) (*Rule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Script == nil {
		return nil, errors.New("invalid value for required argument 'Script'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Rule
	err := ctx.RegisterResource("auth0:index/rule:Rule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRule gets an existing Rule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RuleState, opts ...pulumi.ResourceOption) (*Rule, error) {
	var resource Rule
	err := ctx.ReadResource("auth0:index/rule:Rule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Rule resources.
type ruleState struct {
	// Indicates whether the rule is enabled.
	Enabled *bool `pulumi:"enabled"`
	// Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
	Name *string `pulumi:"name"`
	// Order in which the rule executes relative to other rules. Lower-valued rules execute first.
	Order *int `pulumi:"order"`
	// Code to be executed when the rule runs.
	Script *string `pulumi:"script"`
}

type RuleState struct {
	// Indicates whether the rule is enabled.
	Enabled pulumi.BoolPtrInput
	// Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
	Name pulumi.StringPtrInput
	// Order in which the rule executes relative to other rules. Lower-valued rules execute first.
	Order pulumi.IntPtrInput
	// Code to be executed when the rule runs.
	Script pulumi.StringPtrInput
}

func (RuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*ruleState)(nil)).Elem()
}

type ruleArgs struct {
	// Indicates whether the rule is enabled.
	Enabled *bool `pulumi:"enabled"`
	// Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
	Name *string `pulumi:"name"`
	// Order in which the rule executes relative to other rules. Lower-valued rules execute first.
	Order *int `pulumi:"order"`
	// Code to be executed when the rule runs.
	Script string `pulumi:"script"`
}

// The set of arguments for constructing a Rule resource.
type RuleArgs struct {
	// Indicates whether the rule is enabled.
	Enabled pulumi.BoolPtrInput
	// Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
	Name pulumi.StringPtrInput
	// Order in which the rule executes relative to other rules. Lower-valued rules execute first.
	Order pulumi.IntPtrInput
	// Code to be executed when the rule runs.
	Script pulumi.StringInput
}

func (RuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ruleArgs)(nil)).Elem()
}

type RuleInput interface {
	pulumi.Input

	ToRuleOutput() RuleOutput
	ToRuleOutputWithContext(ctx context.Context) RuleOutput
}

func (*Rule) ElementType() reflect.Type {
	return reflect.TypeOf((**Rule)(nil)).Elem()
}

func (i *Rule) ToRuleOutput() RuleOutput {
	return i.ToRuleOutputWithContext(context.Background())
}

func (i *Rule) ToRuleOutputWithContext(ctx context.Context) RuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleOutput)
}

// RuleArrayInput is an input type that accepts RuleArray and RuleArrayOutput values.
// You can construct a concrete instance of `RuleArrayInput` via:
//
//	RuleArray{ RuleArgs{...} }
type RuleArrayInput interface {
	pulumi.Input

	ToRuleArrayOutput() RuleArrayOutput
	ToRuleArrayOutputWithContext(context.Context) RuleArrayOutput
}

type RuleArray []RuleInput

func (RuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Rule)(nil)).Elem()
}

func (i RuleArray) ToRuleArrayOutput() RuleArrayOutput {
	return i.ToRuleArrayOutputWithContext(context.Background())
}

func (i RuleArray) ToRuleArrayOutputWithContext(ctx context.Context) RuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleArrayOutput)
}

// RuleMapInput is an input type that accepts RuleMap and RuleMapOutput values.
// You can construct a concrete instance of `RuleMapInput` via:
//
//	RuleMap{ "key": RuleArgs{...} }
type RuleMapInput interface {
	pulumi.Input

	ToRuleMapOutput() RuleMapOutput
	ToRuleMapOutputWithContext(context.Context) RuleMapOutput
}

type RuleMap map[string]RuleInput

func (RuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Rule)(nil)).Elem()
}

func (i RuleMap) ToRuleMapOutput() RuleMapOutput {
	return i.ToRuleMapOutputWithContext(context.Background())
}

func (i RuleMap) ToRuleMapOutputWithContext(ctx context.Context) RuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleMapOutput)
}

type RuleOutput struct{ *pulumi.OutputState }

func (RuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Rule)(nil)).Elem()
}

func (o RuleOutput) ToRuleOutput() RuleOutput {
	return o
}

func (o RuleOutput) ToRuleOutputWithContext(ctx context.Context) RuleOutput {
	return o
}

// Indicates whether the rule is enabled.
func (o RuleOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Rule) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
func (o RuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Rule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Order in which the rule executes relative to other rules. Lower-valued rules execute first.
func (o RuleOutput) Order() pulumi.IntOutput {
	return o.ApplyT(func(v *Rule) pulumi.IntOutput { return v.Order }).(pulumi.IntOutput)
}

// Code to be executed when the rule runs.
func (o RuleOutput) Script() pulumi.StringOutput {
	return o.ApplyT(func(v *Rule) pulumi.StringOutput { return v.Script }).(pulumi.StringOutput)
}

type RuleArrayOutput struct{ *pulumi.OutputState }

func (RuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Rule)(nil)).Elem()
}

func (o RuleArrayOutput) ToRuleArrayOutput() RuleArrayOutput {
	return o
}

func (o RuleArrayOutput) ToRuleArrayOutputWithContext(ctx context.Context) RuleArrayOutput {
	return o
}

func (o RuleArrayOutput) Index(i pulumi.IntInput) RuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Rule {
		return vs[0].([]*Rule)[vs[1].(int)]
	}).(RuleOutput)
}

type RuleMapOutput struct{ *pulumi.OutputState }

func (RuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Rule)(nil)).Elem()
}

func (o RuleMapOutput) ToRuleMapOutput() RuleMapOutput {
	return o
}

func (o RuleMapOutput) ToRuleMapOutputWithContext(ctx context.Context) RuleMapOutput {
	return o
}

func (o RuleMapOutput) MapIndex(k pulumi.StringInput) RuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Rule {
		return vs[0].(map[string]*Rule)[vs[1].(string)]
	}).(RuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RuleInput)(nil)).Elem(), &Rule{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuleArrayInput)(nil)).Elem(), RuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuleMapInput)(nil)).Elem(), RuleMap{})
	pulumi.RegisterOutputType(RuleOutput{})
	pulumi.RegisterOutputType(RuleArrayOutput{})
	pulumi.RegisterOutputType(RuleMapOutput{})
}
