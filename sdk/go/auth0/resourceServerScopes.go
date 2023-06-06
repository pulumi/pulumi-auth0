// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With this resource, you can manage scopes (permissions) associated with a resource server (API).
//
// !> To prevent issues, avoid using this resource together with the `ResourceServerScope` resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			myApi, err := auth0.NewResourceServer(ctx, "myApi", &auth0.ResourceServerArgs{
//				Identifier: pulumi.String("https://api.example.com"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewResourceServerScopes(ctx, "myApiScopes", &auth0.ResourceServerScopesArgs{
//				ResourceServerIdentifier: myApi.Identifier,
//				Scopes: auth0.ResourceServerScopesScopeArray{
//					&auth0.ResourceServerScopesScopeArgs{
//						Name:        pulumi.String("create:appointments"),
//						Description: pulumi.String("Ability to create appointments"),
//					},
//					&auth0.ResourceServerScopesScopeArgs{
//						Name:        pulumi.String("read:appointments"),
//						Description: pulumi.String("Ability to read appointments"),
//					},
//				},
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
// This resource can be imported by specifying the resource server identifier. # Example
//
// ```sh
//
//	$ pulumi import auth0:index/resourceServerScopes:ResourceServerScopes my_api_scopes "https://api.travel0.com/v1"
//
// ```
type ResourceServerScopes struct {
	pulumi.CustomResourceState

	// Identifier of the resource server that the scopes (permission) are associated with.
	ResourceServerIdentifier pulumi.StringOutput                  `pulumi:"resourceServerIdentifier"`
	Scopes                   ResourceServerScopesScopeArrayOutput `pulumi:"scopes"`
}

// NewResourceServerScopes registers a new resource with the given unique name, arguments, and options.
func NewResourceServerScopes(ctx *pulumi.Context,
	name string, args *ResourceServerScopesArgs, opts ...pulumi.ResourceOption) (*ResourceServerScopes, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceServerIdentifier == nil {
		return nil, errors.New("invalid value for required argument 'ResourceServerIdentifier'")
	}
	if args.Scopes == nil {
		return nil, errors.New("invalid value for required argument 'Scopes'")
	}
	var resource ResourceServerScopes
	err := ctx.RegisterResource("auth0:index/resourceServerScopes:ResourceServerScopes", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResourceServerScopes gets an existing ResourceServerScopes resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResourceServerScopes(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResourceServerScopesState, opts ...pulumi.ResourceOption) (*ResourceServerScopes, error) {
	var resource ResourceServerScopes
	err := ctx.ReadResource("auth0:index/resourceServerScopes:ResourceServerScopes", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResourceServerScopes resources.
type resourceServerScopesState struct {
	// Identifier of the resource server that the scopes (permission) are associated with.
	ResourceServerIdentifier *string                     `pulumi:"resourceServerIdentifier"`
	Scopes                   []ResourceServerScopesScope `pulumi:"scopes"`
}

type ResourceServerScopesState struct {
	// Identifier of the resource server that the scopes (permission) are associated with.
	ResourceServerIdentifier pulumi.StringPtrInput
	Scopes                   ResourceServerScopesScopeArrayInput
}

func (ResourceServerScopesState) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceServerScopesState)(nil)).Elem()
}

type resourceServerScopesArgs struct {
	// Identifier of the resource server that the scopes (permission) are associated with.
	ResourceServerIdentifier string                      `pulumi:"resourceServerIdentifier"`
	Scopes                   []ResourceServerScopesScope `pulumi:"scopes"`
}

// The set of arguments for constructing a ResourceServerScopes resource.
type ResourceServerScopesArgs struct {
	// Identifier of the resource server that the scopes (permission) are associated with.
	ResourceServerIdentifier pulumi.StringInput
	Scopes                   ResourceServerScopesScopeArrayInput
}

func (ResourceServerScopesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceServerScopesArgs)(nil)).Elem()
}

type ResourceServerScopesInput interface {
	pulumi.Input

	ToResourceServerScopesOutput() ResourceServerScopesOutput
	ToResourceServerScopesOutputWithContext(ctx context.Context) ResourceServerScopesOutput
}

func (*ResourceServerScopes) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceServerScopes)(nil)).Elem()
}

func (i *ResourceServerScopes) ToResourceServerScopesOutput() ResourceServerScopesOutput {
	return i.ToResourceServerScopesOutputWithContext(context.Background())
}

func (i *ResourceServerScopes) ToResourceServerScopesOutputWithContext(ctx context.Context) ResourceServerScopesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceServerScopesOutput)
}

// ResourceServerScopesArrayInput is an input type that accepts ResourceServerScopesArray and ResourceServerScopesArrayOutput values.
// You can construct a concrete instance of `ResourceServerScopesArrayInput` via:
//
//	ResourceServerScopesArray{ ResourceServerScopesArgs{...} }
type ResourceServerScopesArrayInput interface {
	pulumi.Input

	ToResourceServerScopesArrayOutput() ResourceServerScopesArrayOutput
	ToResourceServerScopesArrayOutputWithContext(context.Context) ResourceServerScopesArrayOutput
}

type ResourceServerScopesArray []ResourceServerScopesInput

func (ResourceServerScopesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceServerScopes)(nil)).Elem()
}

func (i ResourceServerScopesArray) ToResourceServerScopesArrayOutput() ResourceServerScopesArrayOutput {
	return i.ToResourceServerScopesArrayOutputWithContext(context.Background())
}

func (i ResourceServerScopesArray) ToResourceServerScopesArrayOutputWithContext(ctx context.Context) ResourceServerScopesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceServerScopesArrayOutput)
}

// ResourceServerScopesMapInput is an input type that accepts ResourceServerScopesMap and ResourceServerScopesMapOutput values.
// You can construct a concrete instance of `ResourceServerScopesMapInput` via:
//
//	ResourceServerScopesMap{ "key": ResourceServerScopesArgs{...} }
type ResourceServerScopesMapInput interface {
	pulumi.Input

	ToResourceServerScopesMapOutput() ResourceServerScopesMapOutput
	ToResourceServerScopesMapOutputWithContext(context.Context) ResourceServerScopesMapOutput
}

type ResourceServerScopesMap map[string]ResourceServerScopesInput

func (ResourceServerScopesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceServerScopes)(nil)).Elem()
}

func (i ResourceServerScopesMap) ToResourceServerScopesMapOutput() ResourceServerScopesMapOutput {
	return i.ToResourceServerScopesMapOutputWithContext(context.Background())
}

func (i ResourceServerScopesMap) ToResourceServerScopesMapOutputWithContext(ctx context.Context) ResourceServerScopesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceServerScopesMapOutput)
}

type ResourceServerScopesOutput struct{ *pulumi.OutputState }

func (ResourceServerScopesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceServerScopes)(nil)).Elem()
}

func (o ResourceServerScopesOutput) ToResourceServerScopesOutput() ResourceServerScopesOutput {
	return o
}

func (o ResourceServerScopesOutput) ToResourceServerScopesOutputWithContext(ctx context.Context) ResourceServerScopesOutput {
	return o
}

// Identifier of the resource server that the scopes (permission) are associated with.
func (o ResourceServerScopesOutput) ResourceServerIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceServerScopes) pulumi.StringOutput { return v.ResourceServerIdentifier }).(pulumi.StringOutput)
}

func (o ResourceServerScopesOutput) Scopes() ResourceServerScopesScopeArrayOutput {
	return o.ApplyT(func(v *ResourceServerScopes) ResourceServerScopesScopeArrayOutput { return v.Scopes }).(ResourceServerScopesScopeArrayOutput)
}

type ResourceServerScopesArrayOutput struct{ *pulumi.OutputState }

func (ResourceServerScopesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceServerScopes)(nil)).Elem()
}

func (o ResourceServerScopesArrayOutput) ToResourceServerScopesArrayOutput() ResourceServerScopesArrayOutput {
	return o
}

func (o ResourceServerScopesArrayOutput) ToResourceServerScopesArrayOutputWithContext(ctx context.Context) ResourceServerScopesArrayOutput {
	return o
}

func (o ResourceServerScopesArrayOutput) Index(i pulumi.IntInput) ResourceServerScopesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResourceServerScopes {
		return vs[0].([]*ResourceServerScopes)[vs[1].(int)]
	}).(ResourceServerScopesOutput)
}

type ResourceServerScopesMapOutput struct{ *pulumi.OutputState }

func (ResourceServerScopesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceServerScopes)(nil)).Elem()
}

func (o ResourceServerScopesMapOutput) ToResourceServerScopesMapOutput() ResourceServerScopesMapOutput {
	return o
}

func (o ResourceServerScopesMapOutput) ToResourceServerScopesMapOutputWithContext(ctx context.Context) ResourceServerScopesMapOutput {
	return o
}

func (o ResourceServerScopesMapOutput) MapIndex(k pulumi.StringInput) ResourceServerScopesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResourceServerScopes {
		return vs[0].(map[string]*ResourceServerScopes)[vs[1].(string)]
	}).(ResourceServerScopesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceServerScopesInput)(nil)).Elem(), &ResourceServerScopes{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceServerScopesArrayInput)(nil)).Elem(), ResourceServerScopesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceServerScopesMapInput)(nil)).Elem(), ResourceServerScopesMap{})
	pulumi.RegisterOutputType(ResourceServerScopesOutput{})
	pulumi.RegisterOutputType(ResourceServerScopesArrayOutput{})
	pulumi.RegisterOutputType(ResourceServerScopesMapOutput{})
}