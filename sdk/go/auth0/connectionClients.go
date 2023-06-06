// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With this resource, you can manage all of the enabled clients on a connection.
//
// !> To prevent issues, avoid using this resource together with the `ConnectionClient` resource.
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
//			myConn, err := auth0.NewConnection(ctx, "myConn", &auth0.ConnectionArgs{
//				Strategy: pulumi.String("auth0"),
//			})
//			if err != nil {
//				return err
//			}
//			myFirstClient, err := auth0.NewClient(ctx, "myFirstClient", nil)
//			if err != nil {
//				return err
//			}
//			mySecondClient, err := auth0.NewClient(ctx, "mySecondClient", nil)
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewConnectionClients(ctx, "myConnClientsAssoc", &auth0.ConnectionClientsArgs{
//				ConnectionId: myConn.ID(),
//				EnabledClients: pulumi.StringArray{
//					myFirstClient.ID(),
//					mySecondClient.ID(),
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
// This resource can be imported by specifying the Connection ID. # Example
//
// ```sh
//
//	$ pulumi import auth0:index/connectionClients:ConnectionClients my_conn_clients_assoc con_XXXXX
//
// ```
type ConnectionClients struct {
	pulumi.CustomResourceState

	// ID of the connection on which to enable the client.
	ConnectionId pulumi.StringOutput `pulumi:"connectionId"`
	// IDs of the clients for which the connection is enabled.
	EnabledClients pulumi.StringArrayOutput `pulumi:"enabledClients"`
	// The name of the connection on which to enable the client.
	Name pulumi.StringOutput `pulumi:"name"`
	// The strategy of the connection on which to enable the client.
	Strategy pulumi.StringOutput `pulumi:"strategy"`
}

// NewConnectionClients registers a new resource with the given unique name, arguments, and options.
func NewConnectionClients(ctx *pulumi.Context,
	name string, args *ConnectionClientsArgs, opts ...pulumi.ResourceOption) (*ConnectionClients, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConnectionId == nil {
		return nil, errors.New("invalid value for required argument 'ConnectionId'")
	}
	if args.EnabledClients == nil {
		return nil, errors.New("invalid value for required argument 'EnabledClients'")
	}
	var resource ConnectionClients
	err := ctx.RegisterResource("auth0:index/connectionClients:ConnectionClients", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnectionClients gets an existing ConnectionClients resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnectionClients(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectionClientsState, opts ...pulumi.ResourceOption) (*ConnectionClients, error) {
	var resource ConnectionClients
	err := ctx.ReadResource("auth0:index/connectionClients:ConnectionClients", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ConnectionClients resources.
type connectionClientsState struct {
	// ID of the connection on which to enable the client.
	ConnectionId *string `pulumi:"connectionId"`
	// IDs of the clients for which the connection is enabled.
	EnabledClients []string `pulumi:"enabledClients"`
	// The name of the connection on which to enable the client.
	Name *string `pulumi:"name"`
	// The strategy of the connection on which to enable the client.
	Strategy *string `pulumi:"strategy"`
}

type ConnectionClientsState struct {
	// ID of the connection on which to enable the client.
	ConnectionId pulumi.StringPtrInput
	// IDs of the clients for which the connection is enabled.
	EnabledClients pulumi.StringArrayInput
	// The name of the connection on which to enable the client.
	Name pulumi.StringPtrInput
	// The strategy of the connection on which to enable the client.
	Strategy pulumi.StringPtrInput
}

func (ConnectionClientsState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionClientsState)(nil)).Elem()
}

type connectionClientsArgs struct {
	// ID of the connection on which to enable the client.
	ConnectionId string `pulumi:"connectionId"`
	// IDs of the clients for which the connection is enabled.
	EnabledClients []string `pulumi:"enabledClients"`
}

// The set of arguments for constructing a ConnectionClients resource.
type ConnectionClientsArgs struct {
	// ID of the connection on which to enable the client.
	ConnectionId pulumi.StringInput
	// IDs of the clients for which the connection is enabled.
	EnabledClients pulumi.StringArrayInput
}

func (ConnectionClientsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionClientsArgs)(nil)).Elem()
}

type ConnectionClientsInput interface {
	pulumi.Input

	ToConnectionClientsOutput() ConnectionClientsOutput
	ToConnectionClientsOutputWithContext(ctx context.Context) ConnectionClientsOutput
}

func (*ConnectionClients) ElementType() reflect.Type {
	return reflect.TypeOf((**ConnectionClients)(nil)).Elem()
}

func (i *ConnectionClients) ToConnectionClientsOutput() ConnectionClientsOutput {
	return i.ToConnectionClientsOutputWithContext(context.Background())
}

func (i *ConnectionClients) ToConnectionClientsOutputWithContext(ctx context.Context) ConnectionClientsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionClientsOutput)
}

// ConnectionClientsArrayInput is an input type that accepts ConnectionClientsArray and ConnectionClientsArrayOutput values.
// You can construct a concrete instance of `ConnectionClientsArrayInput` via:
//
//	ConnectionClientsArray{ ConnectionClientsArgs{...} }
type ConnectionClientsArrayInput interface {
	pulumi.Input

	ToConnectionClientsArrayOutput() ConnectionClientsArrayOutput
	ToConnectionClientsArrayOutputWithContext(context.Context) ConnectionClientsArrayOutput
}

type ConnectionClientsArray []ConnectionClientsInput

func (ConnectionClientsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConnectionClients)(nil)).Elem()
}

func (i ConnectionClientsArray) ToConnectionClientsArrayOutput() ConnectionClientsArrayOutput {
	return i.ToConnectionClientsArrayOutputWithContext(context.Background())
}

func (i ConnectionClientsArray) ToConnectionClientsArrayOutputWithContext(ctx context.Context) ConnectionClientsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionClientsArrayOutput)
}

// ConnectionClientsMapInput is an input type that accepts ConnectionClientsMap and ConnectionClientsMapOutput values.
// You can construct a concrete instance of `ConnectionClientsMapInput` via:
//
//	ConnectionClientsMap{ "key": ConnectionClientsArgs{...} }
type ConnectionClientsMapInput interface {
	pulumi.Input

	ToConnectionClientsMapOutput() ConnectionClientsMapOutput
	ToConnectionClientsMapOutputWithContext(context.Context) ConnectionClientsMapOutput
}

type ConnectionClientsMap map[string]ConnectionClientsInput

func (ConnectionClientsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConnectionClients)(nil)).Elem()
}

func (i ConnectionClientsMap) ToConnectionClientsMapOutput() ConnectionClientsMapOutput {
	return i.ToConnectionClientsMapOutputWithContext(context.Background())
}

func (i ConnectionClientsMap) ToConnectionClientsMapOutputWithContext(ctx context.Context) ConnectionClientsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionClientsMapOutput)
}

type ConnectionClientsOutput struct{ *pulumi.OutputState }

func (ConnectionClientsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ConnectionClients)(nil)).Elem()
}

func (o ConnectionClientsOutput) ToConnectionClientsOutput() ConnectionClientsOutput {
	return o
}

func (o ConnectionClientsOutput) ToConnectionClientsOutputWithContext(ctx context.Context) ConnectionClientsOutput {
	return o
}

// ID of the connection on which to enable the client.
func (o ConnectionClientsOutput) ConnectionId() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionClients) pulumi.StringOutput { return v.ConnectionId }).(pulumi.StringOutput)
}

// IDs of the clients for which the connection is enabled.
func (o ConnectionClientsOutput) EnabledClients() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ConnectionClients) pulumi.StringArrayOutput { return v.EnabledClients }).(pulumi.StringArrayOutput)
}

// The name of the connection on which to enable the client.
func (o ConnectionClientsOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionClients) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The strategy of the connection on which to enable the client.
func (o ConnectionClientsOutput) Strategy() pulumi.StringOutput {
	return o.ApplyT(func(v *ConnectionClients) pulumi.StringOutput { return v.Strategy }).(pulumi.StringOutput)
}

type ConnectionClientsArrayOutput struct{ *pulumi.OutputState }

func (ConnectionClientsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ConnectionClients)(nil)).Elem()
}

func (o ConnectionClientsArrayOutput) ToConnectionClientsArrayOutput() ConnectionClientsArrayOutput {
	return o
}

func (o ConnectionClientsArrayOutput) ToConnectionClientsArrayOutputWithContext(ctx context.Context) ConnectionClientsArrayOutput {
	return o
}

func (o ConnectionClientsArrayOutput) Index(i pulumi.IntInput) ConnectionClientsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ConnectionClients {
		return vs[0].([]*ConnectionClients)[vs[1].(int)]
	}).(ConnectionClientsOutput)
}

type ConnectionClientsMapOutput struct{ *pulumi.OutputState }

func (ConnectionClientsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ConnectionClients)(nil)).Elem()
}

func (o ConnectionClientsMapOutput) ToConnectionClientsMapOutput() ConnectionClientsMapOutput {
	return o
}

func (o ConnectionClientsMapOutput) ToConnectionClientsMapOutputWithContext(ctx context.Context) ConnectionClientsMapOutput {
	return o
}

func (o ConnectionClientsMapOutput) MapIndex(k pulumi.StringInput) ConnectionClientsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ConnectionClients {
		return vs[0].(map[string]*ConnectionClients)[vs[1].(string)]
	}).(ConnectionClientsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionClientsInput)(nil)).Elem(), &ConnectionClients{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionClientsArrayInput)(nil)).Elem(), ConnectionClientsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionClientsMapInput)(nil)).Elem(), ConnectionClientsMap{})
	pulumi.RegisterOutputType(ConnectionClientsOutput{})
	pulumi.RegisterOutputType(ConnectionClientsArrayOutput{})
	pulumi.RegisterOutputType(ConnectionClientsMapOutput{})
}