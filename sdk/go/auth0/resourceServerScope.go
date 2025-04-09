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

// With this resource, you can manage scopes (permissions) associated with a resource server (API).
//
// !> This resource appends a scope to a resource server. In contrast, the `ResourceServerScopes` resource manages
// all the scopes assigned to a resource server. To avoid potential issues, it is recommended not to use this resource in
// conjunction with the `ResourceServerScopes` resource when managing scopes for the same resource server id.
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
//			resourceServer, err := auth0.NewResourceServer(ctx, "resource_server", &auth0.ResourceServerArgs{
//				Name:       pulumi.String("Example Resource Server (Managed by Terraform)"),
//				Identifier: pulumi.String("https://api.example.com"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewResourceServerScope(ctx, "read_posts", &auth0.ResourceServerScopeArgs{
//				ResourceServerIdentifier: resourceServer.Identifier,
//				Scope:                    pulumi.String("read:posts"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewResourceServerScope(ctx, "write_posts", &auth0.ResourceServerScopeArgs{
//				ResourceServerIdentifier: resourceServer.Identifier,
//				Scope:                    pulumi.String("write:posts"),
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
// resource identifier and scope name separated by "::" (note the double colon)
//
// <resourceServerIdentifier>::<scope>
//
// Example:
//
// ```sh
// $ pulumi import auth0:index/resourceServerScope:ResourceServerScope scope "https://api.travel0.com/v1::read:posts"
// ```
type ResourceServerScope struct {
	pulumi.CustomResourceState

	// Description of the scope (permission).
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Identifier of the resource server that the scope (permission) is associated with.
	ResourceServerIdentifier pulumi.StringOutput `pulumi:"resourceServerIdentifier"`
	// Name of the scope (permission).
	Scope pulumi.StringOutput `pulumi:"scope"`
}

// NewResourceServerScope registers a new resource with the given unique name, arguments, and options.
func NewResourceServerScope(ctx *pulumi.Context,
	name string, args *ResourceServerScopeArgs, opts ...pulumi.ResourceOption) (*ResourceServerScope, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceServerIdentifier == nil {
		return nil, errors.New("invalid value for required argument 'ResourceServerIdentifier'")
	}
	if args.Scope == nil {
		return nil, errors.New("invalid value for required argument 'Scope'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ResourceServerScope
	err := ctx.RegisterResource("auth0:index/resourceServerScope:ResourceServerScope", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResourceServerScope gets an existing ResourceServerScope resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResourceServerScope(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResourceServerScopeState, opts ...pulumi.ResourceOption) (*ResourceServerScope, error) {
	var resource ResourceServerScope
	err := ctx.ReadResource("auth0:index/resourceServerScope:ResourceServerScope", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResourceServerScope resources.
type resourceServerScopeState struct {
	// Description of the scope (permission).
	Description *string `pulumi:"description"`
	// Identifier of the resource server that the scope (permission) is associated with.
	ResourceServerIdentifier *string `pulumi:"resourceServerIdentifier"`
	// Name of the scope (permission).
	Scope *string `pulumi:"scope"`
}

type ResourceServerScopeState struct {
	// Description of the scope (permission).
	Description pulumi.StringPtrInput
	// Identifier of the resource server that the scope (permission) is associated with.
	ResourceServerIdentifier pulumi.StringPtrInput
	// Name of the scope (permission).
	Scope pulumi.StringPtrInput
}

func (ResourceServerScopeState) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceServerScopeState)(nil)).Elem()
}

type resourceServerScopeArgs struct {
	// Description of the scope (permission).
	Description *string `pulumi:"description"`
	// Identifier of the resource server that the scope (permission) is associated with.
	ResourceServerIdentifier string `pulumi:"resourceServerIdentifier"`
	// Name of the scope (permission).
	Scope string `pulumi:"scope"`
}

// The set of arguments for constructing a ResourceServerScope resource.
type ResourceServerScopeArgs struct {
	// Description of the scope (permission).
	Description pulumi.StringPtrInput
	// Identifier of the resource server that the scope (permission) is associated with.
	ResourceServerIdentifier pulumi.StringInput
	// Name of the scope (permission).
	Scope pulumi.StringInput
}

func (ResourceServerScopeArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceServerScopeArgs)(nil)).Elem()
}

type ResourceServerScopeInput interface {
	pulumi.Input

	ToResourceServerScopeOutput() ResourceServerScopeOutput
	ToResourceServerScopeOutputWithContext(ctx context.Context) ResourceServerScopeOutput
}

func (*ResourceServerScope) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceServerScope)(nil)).Elem()
}

func (i *ResourceServerScope) ToResourceServerScopeOutput() ResourceServerScopeOutput {
	return i.ToResourceServerScopeOutputWithContext(context.Background())
}

func (i *ResourceServerScope) ToResourceServerScopeOutputWithContext(ctx context.Context) ResourceServerScopeOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceServerScopeOutput)
}

// ResourceServerScopeArrayInput is an input type that accepts ResourceServerScopeArray and ResourceServerScopeArrayOutput values.
// You can construct a concrete instance of `ResourceServerScopeArrayInput` via:
//
//	ResourceServerScopeArray{ ResourceServerScopeArgs{...} }
type ResourceServerScopeArrayInput interface {
	pulumi.Input

	ToResourceServerScopeArrayOutput() ResourceServerScopeArrayOutput
	ToResourceServerScopeArrayOutputWithContext(context.Context) ResourceServerScopeArrayOutput
}

type ResourceServerScopeArray []ResourceServerScopeInput

func (ResourceServerScopeArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceServerScope)(nil)).Elem()
}

func (i ResourceServerScopeArray) ToResourceServerScopeArrayOutput() ResourceServerScopeArrayOutput {
	return i.ToResourceServerScopeArrayOutputWithContext(context.Background())
}

func (i ResourceServerScopeArray) ToResourceServerScopeArrayOutputWithContext(ctx context.Context) ResourceServerScopeArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceServerScopeArrayOutput)
}

// ResourceServerScopeMapInput is an input type that accepts ResourceServerScopeMap and ResourceServerScopeMapOutput values.
// You can construct a concrete instance of `ResourceServerScopeMapInput` via:
//
//	ResourceServerScopeMap{ "key": ResourceServerScopeArgs{...} }
type ResourceServerScopeMapInput interface {
	pulumi.Input

	ToResourceServerScopeMapOutput() ResourceServerScopeMapOutput
	ToResourceServerScopeMapOutputWithContext(context.Context) ResourceServerScopeMapOutput
}

type ResourceServerScopeMap map[string]ResourceServerScopeInput

func (ResourceServerScopeMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceServerScope)(nil)).Elem()
}

func (i ResourceServerScopeMap) ToResourceServerScopeMapOutput() ResourceServerScopeMapOutput {
	return i.ToResourceServerScopeMapOutputWithContext(context.Background())
}

func (i ResourceServerScopeMap) ToResourceServerScopeMapOutputWithContext(ctx context.Context) ResourceServerScopeMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceServerScopeMapOutput)
}

type ResourceServerScopeOutput struct{ *pulumi.OutputState }

func (ResourceServerScopeOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceServerScope)(nil)).Elem()
}

func (o ResourceServerScopeOutput) ToResourceServerScopeOutput() ResourceServerScopeOutput {
	return o
}

func (o ResourceServerScopeOutput) ToResourceServerScopeOutputWithContext(ctx context.Context) ResourceServerScopeOutput {
	return o
}

// Description of the scope (permission).
func (o ResourceServerScopeOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResourceServerScope) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Identifier of the resource server that the scope (permission) is associated with.
func (o ResourceServerScopeOutput) ResourceServerIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceServerScope) pulumi.StringOutput { return v.ResourceServerIdentifier }).(pulumi.StringOutput)
}

// Name of the scope (permission).
func (o ResourceServerScopeOutput) Scope() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceServerScope) pulumi.StringOutput { return v.Scope }).(pulumi.StringOutput)
}

type ResourceServerScopeArrayOutput struct{ *pulumi.OutputState }

func (ResourceServerScopeArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceServerScope)(nil)).Elem()
}

func (o ResourceServerScopeArrayOutput) ToResourceServerScopeArrayOutput() ResourceServerScopeArrayOutput {
	return o
}

func (o ResourceServerScopeArrayOutput) ToResourceServerScopeArrayOutputWithContext(ctx context.Context) ResourceServerScopeArrayOutput {
	return o
}

func (o ResourceServerScopeArrayOutput) Index(i pulumi.IntInput) ResourceServerScopeOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResourceServerScope {
		return vs[0].([]*ResourceServerScope)[vs[1].(int)]
	}).(ResourceServerScopeOutput)
}

type ResourceServerScopeMapOutput struct{ *pulumi.OutputState }

func (ResourceServerScopeMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceServerScope)(nil)).Elem()
}

func (o ResourceServerScopeMapOutput) ToResourceServerScopeMapOutput() ResourceServerScopeMapOutput {
	return o
}

func (o ResourceServerScopeMapOutput) ToResourceServerScopeMapOutputWithContext(ctx context.Context) ResourceServerScopeMapOutput {
	return o
}

func (o ResourceServerScopeMapOutput) MapIndex(k pulumi.StringInput) ResourceServerScopeOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResourceServerScope {
		return vs[0].(map[string]*ResourceServerScope)[vs[1].(string)]
	}).(ResourceServerScopeOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceServerScopeInput)(nil)).Elem(), &ResourceServerScope{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceServerScopeArrayInput)(nil)).Elem(), ResourceServerScopeArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceServerScopeMapInput)(nil)).Elem(), ResourceServerScopeMap{})
	pulumi.RegisterOutputType(ResourceServerScopeOutput{})
	pulumi.RegisterOutputType(ResourceServerScopeArrayOutput{})
	pulumi.RegisterOutputType(ResourceServerScopeMapOutput{})
}
