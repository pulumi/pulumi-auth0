// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// With this resource, you can manage role permissions (1-1).
//
// !> This resource appends a permission to a role. In contrast, the `RolePermissions` resource manages all the
// permissions assigned to a role. To avoid potential issues, it is recommended not to use this resource in conjunction
// with the `RolePermissions` resource when managing permissions for the same role id.
type RolePermission struct {
	pulumi.CustomResourceState

	// Description of the permission.
	Description pulumi.StringOutput `pulumi:"description"`
	// Name of the permission.
	Permission pulumi.StringOutput `pulumi:"permission"`
	// Identifier of the resource server that the permission is associated with.
	ResourceServerIdentifier pulumi.StringOutput `pulumi:"resourceServerIdentifier"`
	// Name of the resource server that the permission is associated with.
	ResourceServerName pulumi.StringOutput `pulumi:"resourceServerName"`
	// ID of the role to associate the permission to.
	RoleId pulumi.StringOutput `pulumi:"roleId"`
}

// NewRolePermission registers a new resource with the given unique name, arguments, and options.
func NewRolePermission(ctx *pulumi.Context,
	name string, args *RolePermissionArgs, opts ...pulumi.ResourceOption) (*RolePermission, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Permission == nil {
		return nil, errors.New("invalid value for required argument 'Permission'")
	}
	if args.ResourceServerIdentifier == nil {
		return nil, errors.New("invalid value for required argument 'ResourceServerIdentifier'")
	}
	if args.RoleId == nil {
		return nil, errors.New("invalid value for required argument 'RoleId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RolePermission
	err := ctx.RegisterResource("auth0:index/rolePermission:RolePermission", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRolePermission gets an existing RolePermission resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRolePermission(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RolePermissionState, opts ...pulumi.ResourceOption) (*RolePermission, error) {
	var resource RolePermission
	err := ctx.ReadResource("auth0:index/rolePermission:RolePermission", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RolePermission resources.
type rolePermissionState struct {
	// Description of the permission.
	Description *string `pulumi:"description"`
	// Name of the permission.
	Permission *string `pulumi:"permission"`
	// Identifier of the resource server that the permission is associated with.
	ResourceServerIdentifier *string `pulumi:"resourceServerIdentifier"`
	// Name of the resource server that the permission is associated with.
	ResourceServerName *string `pulumi:"resourceServerName"`
	// ID of the role to associate the permission to.
	RoleId *string `pulumi:"roleId"`
}

type RolePermissionState struct {
	// Description of the permission.
	Description pulumi.StringPtrInput
	// Name of the permission.
	Permission pulumi.StringPtrInput
	// Identifier of the resource server that the permission is associated with.
	ResourceServerIdentifier pulumi.StringPtrInput
	// Name of the resource server that the permission is associated with.
	ResourceServerName pulumi.StringPtrInput
	// ID of the role to associate the permission to.
	RoleId pulumi.StringPtrInput
}

func (RolePermissionState) ElementType() reflect.Type {
	return reflect.TypeOf((*rolePermissionState)(nil)).Elem()
}

type rolePermissionArgs struct {
	// Name of the permission.
	Permission string `pulumi:"permission"`
	// Identifier of the resource server that the permission is associated with.
	ResourceServerIdentifier string `pulumi:"resourceServerIdentifier"`
	// ID of the role to associate the permission to.
	RoleId string `pulumi:"roleId"`
}

// The set of arguments for constructing a RolePermission resource.
type RolePermissionArgs struct {
	// Name of the permission.
	Permission pulumi.StringInput
	// Identifier of the resource server that the permission is associated with.
	ResourceServerIdentifier pulumi.StringInput
	// ID of the role to associate the permission to.
	RoleId pulumi.StringInput
}

func (RolePermissionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*rolePermissionArgs)(nil)).Elem()
}

type RolePermissionInput interface {
	pulumi.Input

	ToRolePermissionOutput() RolePermissionOutput
	ToRolePermissionOutputWithContext(ctx context.Context) RolePermissionOutput
}

func (*RolePermission) ElementType() reflect.Type {
	return reflect.TypeOf((**RolePermission)(nil)).Elem()
}

func (i *RolePermission) ToRolePermissionOutput() RolePermissionOutput {
	return i.ToRolePermissionOutputWithContext(context.Background())
}

func (i *RolePermission) ToRolePermissionOutputWithContext(ctx context.Context) RolePermissionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RolePermissionOutput)
}

func (i *RolePermission) ToOutput(ctx context.Context) pulumix.Output[*RolePermission] {
	return pulumix.Output[*RolePermission]{
		OutputState: i.ToRolePermissionOutputWithContext(ctx).OutputState,
	}
}

// RolePermissionArrayInput is an input type that accepts RolePermissionArray and RolePermissionArrayOutput values.
// You can construct a concrete instance of `RolePermissionArrayInput` via:
//
//	RolePermissionArray{ RolePermissionArgs{...} }
type RolePermissionArrayInput interface {
	pulumi.Input

	ToRolePermissionArrayOutput() RolePermissionArrayOutput
	ToRolePermissionArrayOutputWithContext(context.Context) RolePermissionArrayOutput
}

type RolePermissionArray []RolePermissionInput

func (RolePermissionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RolePermission)(nil)).Elem()
}

func (i RolePermissionArray) ToRolePermissionArrayOutput() RolePermissionArrayOutput {
	return i.ToRolePermissionArrayOutputWithContext(context.Background())
}

func (i RolePermissionArray) ToRolePermissionArrayOutputWithContext(ctx context.Context) RolePermissionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RolePermissionArrayOutput)
}

func (i RolePermissionArray) ToOutput(ctx context.Context) pulumix.Output[[]*RolePermission] {
	return pulumix.Output[[]*RolePermission]{
		OutputState: i.ToRolePermissionArrayOutputWithContext(ctx).OutputState,
	}
}

// RolePermissionMapInput is an input type that accepts RolePermissionMap and RolePermissionMapOutput values.
// You can construct a concrete instance of `RolePermissionMapInput` via:
//
//	RolePermissionMap{ "key": RolePermissionArgs{...} }
type RolePermissionMapInput interface {
	pulumi.Input

	ToRolePermissionMapOutput() RolePermissionMapOutput
	ToRolePermissionMapOutputWithContext(context.Context) RolePermissionMapOutput
}

type RolePermissionMap map[string]RolePermissionInput

func (RolePermissionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RolePermission)(nil)).Elem()
}

func (i RolePermissionMap) ToRolePermissionMapOutput() RolePermissionMapOutput {
	return i.ToRolePermissionMapOutputWithContext(context.Background())
}

func (i RolePermissionMap) ToRolePermissionMapOutputWithContext(ctx context.Context) RolePermissionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RolePermissionMapOutput)
}

func (i RolePermissionMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*RolePermission] {
	return pulumix.Output[map[string]*RolePermission]{
		OutputState: i.ToRolePermissionMapOutputWithContext(ctx).OutputState,
	}
}

type RolePermissionOutput struct{ *pulumi.OutputState }

func (RolePermissionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RolePermission)(nil)).Elem()
}

func (o RolePermissionOutput) ToRolePermissionOutput() RolePermissionOutput {
	return o
}

func (o RolePermissionOutput) ToRolePermissionOutputWithContext(ctx context.Context) RolePermissionOutput {
	return o
}

func (o RolePermissionOutput) ToOutput(ctx context.Context) pulumix.Output[*RolePermission] {
	return pulumix.Output[*RolePermission]{
		OutputState: o.OutputState,
	}
}

// Description of the permission.
func (o RolePermissionOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *RolePermission) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Name of the permission.
func (o RolePermissionOutput) Permission() pulumi.StringOutput {
	return o.ApplyT(func(v *RolePermission) pulumi.StringOutput { return v.Permission }).(pulumi.StringOutput)
}

// Identifier of the resource server that the permission is associated with.
func (o RolePermissionOutput) ResourceServerIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v *RolePermission) pulumi.StringOutput { return v.ResourceServerIdentifier }).(pulumi.StringOutput)
}

// Name of the resource server that the permission is associated with.
func (o RolePermissionOutput) ResourceServerName() pulumi.StringOutput {
	return o.ApplyT(func(v *RolePermission) pulumi.StringOutput { return v.ResourceServerName }).(pulumi.StringOutput)
}

// ID of the role to associate the permission to.
func (o RolePermissionOutput) RoleId() pulumi.StringOutput {
	return o.ApplyT(func(v *RolePermission) pulumi.StringOutput { return v.RoleId }).(pulumi.StringOutput)
}

type RolePermissionArrayOutput struct{ *pulumi.OutputState }

func (RolePermissionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RolePermission)(nil)).Elem()
}

func (o RolePermissionArrayOutput) ToRolePermissionArrayOutput() RolePermissionArrayOutput {
	return o
}

func (o RolePermissionArrayOutput) ToRolePermissionArrayOutputWithContext(ctx context.Context) RolePermissionArrayOutput {
	return o
}

func (o RolePermissionArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*RolePermission] {
	return pulumix.Output[[]*RolePermission]{
		OutputState: o.OutputState,
	}
}

func (o RolePermissionArrayOutput) Index(i pulumi.IntInput) RolePermissionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RolePermission {
		return vs[0].([]*RolePermission)[vs[1].(int)]
	}).(RolePermissionOutput)
}

type RolePermissionMapOutput struct{ *pulumi.OutputState }

func (RolePermissionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RolePermission)(nil)).Elem()
}

func (o RolePermissionMapOutput) ToRolePermissionMapOutput() RolePermissionMapOutput {
	return o
}

func (o RolePermissionMapOutput) ToRolePermissionMapOutputWithContext(ctx context.Context) RolePermissionMapOutput {
	return o
}

func (o RolePermissionMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*RolePermission] {
	return pulumix.Output[map[string]*RolePermission]{
		OutputState: o.OutputState,
	}
}

func (o RolePermissionMapOutput) MapIndex(k pulumi.StringInput) RolePermissionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RolePermission {
		return vs[0].(map[string]*RolePermission)[vs[1].(string)]
	}).(RolePermissionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RolePermissionInput)(nil)).Elem(), &RolePermission{})
	pulumi.RegisterInputType(reflect.TypeOf((*RolePermissionArrayInput)(nil)).Elem(), RolePermissionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RolePermissionMapInput)(nil)).Elem(), RolePermissionMap{})
	pulumi.RegisterOutputType(RolePermissionOutput{})
	pulumi.RegisterOutputType(RolePermissionArrayOutput{})
	pulumi.RegisterOutputType(RolePermissionMapOutput{})
}
