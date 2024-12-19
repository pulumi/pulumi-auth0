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

// With this resource, you can create and manage flow vault connections for a tenant.
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
//			// Example:
//			_, err := auth0.NewFlowVaultConnection(ctx, "my_connection", &auth0.FlowVaultConnectionArgs{
//				AppId: pulumi.String("AUTH0"),
//				Name:  pulumi.String("Auth0 M2M Connection"),
//				Setup: pulumi.StringMap{
//					"client_id":     pulumi.String("******************"),
//					"client_secret": pulumi.String("*********************************"),
//					"domain":        pulumi.String("*****************************"),
//					"type":          pulumi.String("OAUTH_APP"),
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
// This resource can be imported using the flow vault connection ID.
//
// #
//
// Example:
//
// ```sh
// $ pulumi import auth0:index/flowVaultConnection:FlowVaultConnection my_connection "ac_42HT5oiobDyUs8ASwEEWK0"
// ```
type FlowVaultConnection struct {
	pulumi.CustomResourceState

	// Custom account name of the vault connection.
	AccountName pulumi.StringPtrOutput `pulumi:"accountName"`
	// App identifier of the vault connection.
	AppId pulumi.StringOutput `pulumi:"appId"`
	// Environment of the vault connection.
	Environment pulumi.StringPtrOutput `pulumi:"environment"`
	// Fingerprint of the vault connection.
	Fingerprint pulumi.StringOutput `pulumi:"fingerprint"`
	// Name of the vault connection.
	Name pulumi.StringOutput `pulumi:"name"`
	// Indicates if the vault connection is configured.
	Ready pulumi.BoolOutput `pulumi:"ready"`
	// Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
	Setup pulumi.StringMapOutput `pulumi:"setup"`
}

// NewFlowVaultConnection registers a new resource with the given unique name, arguments, and options.
func NewFlowVaultConnection(ctx *pulumi.Context,
	name string, args *FlowVaultConnectionArgs, opts ...pulumi.ResourceOption) (*FlowVaultConnection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AppId == nil {
		return nil, errors.New("invalid value for required argument 'AppId'")
	}
	if args.Setup != nil {
		args.Setup = pulumi.ToSecret(args.Setup).(pulumi.StringMapInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"setup",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FlowVaultConnection
	err := ctx.RegisterResource("auth0:index/flowVaultConnection:FlowVaultConnection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFlowVaultConnection gets an existing FlowVaultConnection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFlowVaultConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FlowVaultConnectionState, opts ...pulumi.ResourceOption) (*FlowVaultConnection, error) {
	var resource FlowVaultConnection
	err := ctx.ReadResource("auth0:index/flowVaultConnection:FlowVaultConnection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FlowVaultConnection resources.
type flowVaultConnectionState struct {
	// Custom account name of the vault connection.
	AccountName *string `pulumi:"accountName"`
	// App identifier of the vault connection.
	AppId *string `pulumi:"appId"`
	// Environment of the vault connection.
	Environment *string `pulumi:"environment"`
	// Fingerprint of the vault connection.
	Fingerprint *string `pulumi:"fingerprint"`
	// Name of the vault connection.
	Name *string `pulumi:"name"`
	// Indicates if the vault connection is configured.
	Ready *bool `pulumi:"ready"`
	// Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
	Setup map[string]string `pulumi:"setup"`
}

type FlowVaultConnectionState struct {
	// Custom account name of the vault connection.
	AccountName pulumi.StringPtrInput
	// App identifier of the vault connection.
	AppId pulumi.StringPtrInput
	// Environment of the vault connection.
	Environment pulumi.StringPtrInput
	// Fingerprint of the vault connection.
	Fingerprint pulumi.StringPtrInput
	// Name of the vault connection.
	Name pulumi.StringPtrInput
	// Indicates if the vault connection is configured.
	Ready pulumi.BoolPtrInput
	// Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
	Setup pulumi.StringMapInput
}

func (FlowVaultConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*flowVaultConnectionState)(nil)).Elem()
}

type flowVaultConnectionArgs struct {
	// Custom account name of the vault connection.
	AccountName *string `pulumi:"accountName"`
	// App identifier of the vault connection.
	AppId string `pulumi:"appId"`
	// Environment of the vault connection.
	Environment *string `pulumi:"environment"`
	// Fingerprint of the vault connection.
	Fingerprint *string `pulumi:"fingerprint"`
	// Name of the vault connection.
	Name *string `pulumi:"name"`
	// Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
	Setup map[string]string `pulumi:"setup"`
}

// The set of arguments for constructing a FlowVaultConnection resource.
type FlowVaultConnectionArgs struct {
	// Custom account name of the vault connection.
	AccountName pulumi.StringPtrInput
	// App identifier of the vault connection.
	AppId pulumi.StringInput
	// Environment of the vault connection.
	Environment pulumi.StringPtrInput
	// Fingerprint of the vault connection.
	Fingerprint pulumi.StringPtrInput
	// Name of the vault connection.
	Name pulumi.StringPtrInput
	// Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
	Setup pulumi.StringMapInput
}

func (FlowVaultConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*flowVaultConnectionArgs)(nil)).Elem()
}

type FlowVaultConnectionInput interface {
	pulumi.Input

	ToFlowVaultConnectionOutput() FlowVaultConnectionOutput
	ToFlowVaultConnectionOutputWithContext(ctx context.Context) FlowVaultConnectionOutput
}

func (*FlowVaultConnection) ElementType() reflect.Type {
	return reflect.TypeOf((**FlowVaultConnection)(nil)).Elem()
}

func (i *FlowVaultConnection) ToFlowVaultConnectionOutput() FlowVaultConnectionOutput {
	return i.ToFlowVaultConnectionOutputWithContext(context.Background())
}

func (i *FlowVaultConnection) ToFlowVaultConnectionOutputWithContext(ctx context.Context) FlowVaultConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlowVaultConnectionOutput)
}

// FlowVaultConnectionArrayInput is an input type that accepts FlowVaultConnectionArray and FlowVaultConnectionArrayOutput values.
// You can construct a concrete instance of `FlowVaultConnectionArrayInput` via:
//
//	FlowVaultConnectionArray{ FlowVaultConnectionArgs{...} }
type FlowVaultConnectionArrayInput interface {
	pulumi.Input

	ToFlowVaultConnectionArrayOutput() FlowVaultConnectionArrayOutput
	ToFlowVaultConnectionArrayOutputWithContext(context.Context) FlowVaultConnectionArrayOutput
}

type FlowVaultConnectionArray []FlowVaultConnectionInput

func (FlowVaultConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FlowVaultConnection)(nil)).Elem()
}

func (i FlowVaultConnectionArray) ToFlowVaultConnectionArrayOutput() FlowVaultConnectionArrayOutput {
	return i.ToFlowVaultConnectionArrayOutputWithContext(context.Background())
}

func (i FlowVaultConnectionArray) ToFlowVaultConnectionArrayOutputWithContext(ctx context.Context) FlowVaultConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlowVaultConnectionArrayOutput)
}

// FlowVaultConnectionMapInput is an input type that accepts FlowVaultConnectionMap and FlowVaultConnectionMapOutput values.
// You can construct a concrete instance of `FlowVaultConnectionMapInput` via:
//
//	FlowVaultConnectionMap{ "key": FlowVaultConnectionArgs{...} }
type FlowVaultConnectionMapInput interface {
	pulumi.Input

	ToFlowVaultConnectionMapOutput() FlowVaultConnectionMapOutput
	ToFlowVaultConnectionMapOutputWithContext(context.Context) FlowVaultConnectionMapOutput
}

type FlowVaultConnectionMap map[string]FlowVaultConnectionInput

func (FlowVaultConnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FlowVaultConnection)(nil)).Elem()
}

func (i FlowVaultConnectionMap) ToFlowVaultConnectionMapOutput() FlowVaultConnectionMapOutput {
	return i.ToFlowVaultConnectionMapOutputWithContext(context.Background())
}

func (i FlowVaultConnectionMap) ToFlowVaultConnectionMapOutputWithContext(ctx context.Context) FlowVaultConnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FlowVaultConnectionMapOutput)
}

type FlowVaultConnectionOutput struct{ *pulumi.OutputState }

func (FlowVaultConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FlowVaultConnection)(nil)).Elem()
}

func (o FlowVaultConnectionOutput) ToFlowVaultConnectionOutput() FlowVaultConnectionOutput {
	return o
}

func (o FlowVaultConnectionOutput) ToFlowVaultConnectionOutputWithContext(ctx context.Context) FlowVaultConnectionOutput {
	return o
}

// Custom account name of the vault connection.
func (o FlowVaultConnectionOutput) AccountName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FlowVaultConnection) pulumi.StringPtrOutput { return v.AccountName }).(pulumi.StringPtrOutput)
}

// App identifier of the vault connection.
func (o FlowVaultConnectionOutput) AppId() pulumi.StringOutput {
	return o.ApplyT(func(v *FlowVaultConnection) pulumi.StringOutput { return v.AppId }).(pulumi.StringOutput)
}

// Environment of the vault connection.
func (o FlowVaultConnectionOutput) Environment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FlowVaultConnection) pulumi.StringPtrOutput { return v.Environment }).(pulumi.StringPtrOutput)
}

// Fingerprint of the vault connection.
func (o FlowVaultConnectionOutput) Fingerprint() pulumi.StringOutput {
	return o.ApplyT(func(v *FlowVaultConnection) pulumi.StringOutput { return v.Fingerprint }).(pulumi.StringOutput)
}

// Name of the vault connection.
func (o FlowVaultConnectionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *FlowVaultConnection) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Indicates if the vault connection is configured.
func (o FlowVaultConnectionOutput) Ready() pulumi.BoolOutput {
	return o.ApplyT(func(v *FlowVaultConnection) pulumi.BoolOutput { return v.Ready }).(pulumi.BoolOutput)
}

// Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
func (o FlowVaultConnectionOutput) Setup() pulumi.StringMapOutput {
	return o.ApplyT(func(v *FlowVaultConnection) pulumi.StringMapOutput { return v.Setup }).(pulumi.StringMapOutput)
}

type FlowVaultConnectionArrayOutput struct{ *pulumi.OutputState }

func (FlowVaultConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FlowVaultConnection)(nil)).Elem()
}

func (o FlowVaultConnectionArrayOutput) ToFlowVaultConnectionArrayOutput() FlowVaultConnectionArrayOutput {
	return o
}

func (o FlowVaultConnectionArrayOutput) ToFlowVaultConnectionArrayOutputWithContext(ctx context.Context) FlowVaultConnectionArrayOutput {
	return o
}

func (o FlowVaultConnectionArrayOutput) Index(i pulumi.IntInput) FlowVaultConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FlowVaultConnection {
		return vs[0].([]*FlowVaultConnection)[vs[1].(int)]
	}).(FlowVaultConnectionOutput)
}

type FlowVaultConnectionMapOutput struct{ *pulumi.OutputState }

func (FlowVaultConnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FlowVaultConnection)(nil)).Elem()
}

func (o FlowVaultConnectionMapOutput) ToFlowVaultConnectionMapOutput() FlowVaultConnectionMapOutput {
	return o
}

func (o FlowVaultConnectionMapOutput) ToFlowVaultConnectionMapOutputWithContext(ctx context.Context) FlowVaultConnectionMapOutput {
	return o
}

func (o FlowVaultConnectionMapOutput) MapIndex(k pulumi.StringInput) FlowVaultConnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FlowVaultConnection {
		return vs[0].(map[string]*FlowVaultConnection)[vs[1].(string)]
	}).(FlowVaultConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FlowVaultConnectionInput)(nil)).Elem(), &FlowVaultConnection{})
	pulumi.RegisterInputType(reflect.TypeOf((*FlowVaultConnectionArrayInput)(nil)).Elem(), FlowVaultConnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FlowVaultConnectionMapInput)(nil)).Elem(), FlowVaultConnectionMap{})
	pulumi.RegisterOutputType(FlowVaultConnectionOutput{})
	pulumi.RegisterOutputType(FlowVaultConnectionArrayOutput{})
	pulumi.RegisterOutputType(FlowVaultConnectionMapOutput{})
}
