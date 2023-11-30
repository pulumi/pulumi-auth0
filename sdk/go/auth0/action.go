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

// Actions are secure, tenant-specific, versioned functions written in Node.js that execute at certain points during the Auth0 runtime. Actions are used to customize and extend Auth0's capabilities with custom logic.
//
// ## Import
//
// This resource can be imported by specifying the action ID. # Example
//
// ```sh
//
//	$ pulumi import auth0:index/action:Action my_action "12f4f21b-017a-319d-92e7-2291c1ca36c4"
//
// ```
//
//	~> For security reasons importing `secrets` is not allowed. Therefore, it is advised to import the action without secrets and adding them back after the action has been imported.
type Action struct {
	pulumi.CustomResourceState

	// The source code of the action.
	Code pulumi.StringOutput `pulumi:"code"`
	// List of third party npm modules, and their versions, that this action depends on.
	Dependencies ActionDependencyArrayOutput `pulumi:"dependencies"`
	// Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately.
	Deploy pulumi.BoolPtrOutput `pulumi:"deploy"`
	// Dependency name, e.g. `lodash`.
	Name pulumi.StringOutput `pulumi:"name"`
	// The Node runtime. Defaults to `node18`. Possible values are: `node16` (not recommended), or `node18` (recommended).
	Runtime pulumi.StringOutput `pulumi:"runtime"`
	// List of secrets that are included in an action or a version of an action. Partial management of secrets is not supported.
	Secrets ActionSecretArrayOutput `pulumi:"secrets"`
	// List of triggers that this action supports. At this time, an action can only target a single trigger at a time. Read Retrieving the set of triggers available within actions to retrieve the latest trigger versions supported.
	SupportedTriggers ActionSupportedTriggersOutput `pulumi:"supportedTriggers"`
	// Version ID of the action. This value is available if `deploy` is set to true.
	VersionId pulumi.StringOutput `pulumi:"versionId"`
}

// NewAction registers a new resource with the given unique name, arguments, and options.
func NewAction(ctx *pulumi.Context,
	name string, args *ActionArgs, opts ...pulumi.ResourceOption) (*Action, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Code == nil {
		return nil, errors.New("invalid value for required argument 'Code'")
	}
	if args.SupportedTriggers == nil {
		return nil, errors.New("invalid value for required argument 'SupportedTriggers'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Action
	err := ctx.RegisterResource("auth0:index/action:Action", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAction gets an existing Action resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAction(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ActionState, opts ...pulumi.ResourceOption) (*Action, error) {
	var resource Action
	err := ctx.ReadResource("auth0:index/action:Action", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Action resources.
type actionState struct {
	// The source code of the action.
	Code *string `pulumi:"code"`
	// List of third party npm modules, and their versions, that this action depends on.
	Dependencies []ActionDependency `pulumi:"dependencies"`
	// Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately.
	Deploy *bool `pulumi:"deploy"`
	// Dependency name, e.g. `lodash`.
	Name *string `pulumi:"name"`
	// The Node runtime. Defaults to `node18`. Possible values are: `node16` (not recommended), or `node18` (recommended).
	Runtime *string `pulumi:"runtime"`
	// List of secrets that are included in an action or a version of an action. Partial management of secrets is not supported.
	Secrets []ActionSecret `pulumi:"secrets"`
	// List of triggers that this action supports. At this time, an action can only target a single trigger at a time. Read Retrieving the set of triggers available within actions to retrieve the latest trigger versions supported.
	SupportedTriggers *ActionSupportedTriggers `pulumi:"supportedTriggers"`
	// Version ID of the action. This value is available if `deploy` is set to true.
	VersionId *string `pulumi:"versionId"`
}

type ActionState struct {
	// The source code of the action.
	Code pulumi.StringPtrInput
	// List of third party npm modules, and their versions, that this action depends on.
	Dependencies ActionDependencyArrayInput
	// Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately.
	Deploy pulumi.BoolPtrInput
	// Dependency name, e.g. `lodash`.
	Name pulumi.StringPtrInput
	// The Node runtime. Defaults to `node18`. Possible values are: `node16` (not recommended), or `node18` (recommended).
	Runtime pulumi.StringPtrInput
	// List of secrets that are included in an action or a version of an action. Partial management of secrets is not supported.
	Secrets ActionSecretArrayInput
	// List of triggers that this action supports. At this time, an action can only target a single trigger at a time. Read Retrieving the set of triggers available within actions to retrieve the latest trigger versions supported.
	SupportedTriggers ActionSupportedTriggersPtrInput
	// Version ID of the action. This value is available if `deploy` is set to true.
	VersionId pulumi.StringPtrInput
}

func (ActionState) ElementType() reflect.Type {
	return reflect.TypeOf((*actionState)(nil)).Elem()
}

type actionArgs struct {
	// The source code of the action.
	Code string `pulumi:"code"`
	// List of third party npm modules, and their versions, that this action depends on.
	Dependencies []ActionDependency `pulumi:"dependencies"`
	// Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately.
	Deploy *bool `pulumi:"deploy"`
	// Dependency name, e.g. `lodash`.
	Name *string `pulumi:"name"`
	// The Node runtime. Defaults to `node18`. Possible values are: `node16` (not recommended), or `node18` (recommended).
	Runtime *string `pulumi:"runtime"`
	// List of secrets that are included in an action or a version of an action. Partial management of secrets is not supported.
	Secrets []ActionSecret `pulumi:"secrets"`
	// List of triggers that this action supports. At this time, an action can only target a single trigger at a time. Read Retrieving the set of triggers available within actions to retrieve the latest trigger versions supported.
	SupportedTriggers ActionSupportedTriggers `pulumi:"supportedTriggers"`
}

// The set of arguments for constructing a Action resource.
type ActionArgs struct {
	// The source code of the action.
	Code pulumi.StringInput
	// List of third party npm modules, and their versions, that this action depends on.
	Dependencies ActionDependencyArrayInput
	// Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately.
	Deploy pulumi.BoolPtrInput
	// Dependency name, e.g. `lodash`.
	Name pulumi.StringPtrInput
	// The Node runtime. Defaults to `node18`. Possible values are: `node16` (not recommended), or `node18` (recommended).
	Runtime pulumi.StringPtrInput
	// List of secrets that are included in an action or a version of an action. Partial management of secrets is not supported.
	Secrets ActionSecretArrayInput
	// List of triggers that this action supports. At this time, an action can only target a single trigger at a time. Read Retrieving the set of triggers available within actions to retrieve the latest trigger versions supported.
	SupportedTriggers ActionSupportedTriggersInput
}

func (ActionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*actionArgs)(nil)).Elem()
}

type ActionInput interface {
	pulumi.Input

	ToActionOutput() ActionOutput
	ToActionOutputWithContext(ctx context.Context) ActionOutput
}

func (*Action) ElementType() reflect.Type {
	return reflect.TypeOf((**Action)(nil)).Elem()
}

func (i *Action) ToActionOutput() ActionOutput {
	return i.ToActionOutputWithContext(context.Background())
}

func (i *Action) ToActionOutputWithContext(ctx context.Context) ActionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActionOutput)
}

// ActionArrayInput is an input type that accepts ActionArray and ActionArrayOutput values.
// You can construct a concrete instance of `ActionArrayInput` via:
//
//	ActionArray{ ActionArgs{...} }
type ActionArrayInput interface {
	pulumi.Input

	ToActionArrayOutput() ActionArrayOutput
	ToActionArrayOutputWithContext(context.Context) ActionArrayOutput
}

type ActionArray []ActionInput

func (ActionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Action)(nil)).Elem()
}

func (i ActionArray) ToActionArrayOutput() ActionArrayOutput {
	return i.ToActionArrayOutputWithContext(context.Background())
}

func (i ActionArray) ToActionArrayOutputWithContext(ctx context.Context) ActionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActionArrayOutput)
}

// ActionMapInput is an input type that accepts ActionMap and ActionMapOutput values.
// You can construct a concrete instance of `ActionMapInput` via:
//
//	ActionMap{ "key": ActionArgs{...} }
type ActionMapInput interface {
	pulumi.Input

	ToActionMapOutput() ActionMapOutput
	ToActionMapOutputWithContext(context.Context) ActionMapOutput
}

type ActionMap map[string]ActionInput

func (ActionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Action)(nil)).Elem()
}

func (i ActionMap) ToActionMapOutput() ActionMapOutput {
	return i.ToActionMapOutputWithContext(context.Background())
}

func (i ActionMap) ToActionMapOutputWithContext(ctx context.Context) ActionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ActionMapOutput)
}

type ActionOutput struct{ *pulumi.OutputState }

func (ActionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Action)(nil)).Elem()
}

func (o ActionOutput) ToActionOutput() ActionOutput {
	return o
}

func (o ActionOutput) ToActionOutputWithContext(ctx context.Context) ActionOutput {
	return o
}

// The source code of the action.
func (o ActionOutput) Code() pulumi.StringOutput {
	return o.ApplyT(func(v *Action) pulumi.StringOutput { return v.Code }).(pulumi.StringOutput)
}

// List of third party npm modules, and their versions, that this action depends on.
func (o ActionOutput) Dependencies() ActionDependencyArrayOutput {
	return o.ApplyT(func(v *Action) ActionDependencyArrayOutput { return v.Dependencies }).(ActionDependencyArrayOutput)
}

// Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately.
func (o ActionOutput) Deploy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Action) pulumi.BoolPtrOutput { return v.Deploy }).(pulumi.BoolPtrOutput)
}

// Dependency name, e.g. `lodash`.
func (o ActionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Action) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The Node runtime. Defaults to `node18`. Possible values are: `node16` (not recommended), or `node18` (recommended).
func (o ActionOutput) Runtime() pulumi.StringOutput {
	return o.ApplyT(func(v *Action) pulumi.StringOutput { return v.Runtime }).(pulumi.StringOutput)
}

// List of secrets that are included in an action or a version of an action. Partial management of secrets is not supported.
func (o ActionOutput) Secrets() ActionSecretArrayOutput {
	return o.ApplyT(func(v *Action) ActionSecretArrayOutput { return v.Secrets }).(ActionSecretArrayOutput)
}

// List of triggers that this action supports. At this time, an action can only target a single trigger at a time. Read Retrieving the set of triggers available within actions to retrieve the latest trigger versions supported.
func (o ActionOutput) SupportedTriggers() ActionSupportedTriggersOutput {
	return o.ApplyT(func(v *Action) ActionSupportedTriggersOutput { return v.SupportedTriggers }).(ActionSupportedTriggersOutput)
}

// Version ID of the action. This value is available if `deploy` is set to true.
func (o ActionOutput) VersionId() pulumi.StringOutput {
	return o.ApplyT(func(v *Action) pulumi.StringOutput { return v.VersionId }).(pulumi.StringOutput)
}

type ActionArrayOutput struct{ *pulumi.OutputState }

func (ActionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Action)(nil)).Elem()
}

func (o ActionArrayOutput) ToActionArrayOutput() ActionArrayOutput {
	return o
}

func (o ActionArrayOutput) ToActionArrayOutputWithContext(ctx context.Context) ActionArrayOutput {
	return o
}

func (o ActionArrayOutput) Index(i pulumi.IntInput) ActionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Action {
		return vs[0].([]*Action)[vs[1].(int)]
	}).(ActionOutput)
}

type ActionMapOutput struct{ *pulumi.OutputState }

func (ActionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Action)(nil)).Elem()
}

func (o ActionMapOutput) ToActionMapOutput() ActionMapOutput {
	return o
}

func (o ActionMapOutput) ToActionMapOutputWithContext(ctx context.Context) ActionMapOutput {
	return o
}

func (o ActionMapOutput) MapIndex(k pulumi.StringInput) ActionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Action {
		return vs[0].(map[string]*Action)[vs[1].(string)]
	}).(ActionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ActionInput)(nil)).Elem(), &Action{})
	pulumi.RegisterInputType(reflect.TypeOf((*ActionArrayInput)(nil)).Elem(), ActionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ActionMapInput)(nil)).Elem(), ActionMap{})
	pulumi.RegisterOutputType(ActionOutput{})
	pulumi.RegisterOutputType(ActionArrayOutput{})
	pulumi.RegisterOutputType(ActionMapOutput{})
}
