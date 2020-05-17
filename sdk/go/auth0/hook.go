// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Hooks are secure, self-contained functions that allow you to customize the behavior of Auth0 when executed for selected extensibility points of the Auth0 platform. Auth0 invokes Hooks during runtime to execute your custom Node.js code.
//
// Depending on the extensibility point, you can use Hooks with Database Connections and/or Passwordless Connections.
type Hook struct {
	pulumi.CustomResourceState

	// Whether the hook is enabled, or disabled
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Name of this hook
	Name pulumi.StringOutput `pulumi:"name"`
	// Code to be executed when this hook runs
	Script pulumi.StringOutput `pulumi:"script"`
	// Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message
	TriggerId pulumi.StringOutput `pulumi:"triggerId"`
}

// NewHook registers a new resource with the given unique name, arguments, and options.
func NewHook(ctx *pulumi.Context,
	name string, args *HookArgs, opts ...pulumi.ResourceOption) (*Hook, error) {
	if args == nil || args.Script == nil {
		return nil, errors.New("missing required argument 'Script'")
	}
	if args == nil || args.TriggerId == nil {
		return nil, errors.New("missing required argument 'TriggerId'")
	}
	if args == nil {
		args = &HookArgs{}
	}
	var resource Hook
	err := ctx.RegisterResource("auth0:index/hook:Hook", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHook gets an existing Hook resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHook(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HookState, opts ...pulumi.ResourceOption) (*Hook, error) {
	var resource Hook
	err := ctx.ReadResource("auth0:index/hook:Hook", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Hook resources.
type hookState struct {
	// Whether the hook is enabled, or disabled
	Enabled *bool `pulumi:"enabled"`
	// Name of this hook
	Name *string `pulumi:"name"`
	// Code to be executed when this hook runs
	Script *string `pulumi:"script"`
	// Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message
	TriggerId *string `pulumi:"triggerId"`
}

type HookState struct {
	// Whether the hook is enabled, or disabled
	Enabled pulumi.BoolPtrInput
	// Name of this hook
	Name pulumi.StringPtrInput
	// Code to be executed when this hook runs
	Script pulumi.StringPtrInput
	// Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message
	TriggerId pulumi.StringPtrInput
}

func (HookState) ElementType() reflect.Type {
	return reflect.TypeOf((*hookState)(nil)).Elem()
}

type hookArgs struct {
	// Whether the hook is enabled, or disabled
	Enabled *bool `pulumi:"enabled"`
	// Name of this hook
	Name *string `pulumi:"name"`
	// Code to be executed when this hook runs
	Script string `pulumi:"script"`
	// Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message
	TriggerId string `pulumi:"triggerId"`
}

// The set of arguments for constructing a Hook resource.
type HookArgs struct {
	// Whether the hook is enabled, or disabled
	Enabled pulumi.BoolPtrInput
	// Name of this hook
	Name pulumi.StringPtrInput
	// Code to be executed when this hook runs
	Script pulumi.StringInput
	// Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message
	TriggerId pulumi.StringInput
}

func (HookArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hookArgs)(nil)).Elem()
}
