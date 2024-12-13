// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source to retrieve a specific Auth0 connection by `connectionId` or `name`.
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
//			// An Auth0 Connection loaded using its name.
//			_, err := auth0.LookupConnection(ctx, &auth0.LookupConnectionArgs{
//				Name: pulumi.StringRef("Acceptance-Test-Connection-{{.testName}}"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// An Auth0 Connection loaded using its ID.
//			_, err = auth0.LookupConnection(ctx, &auth0.LookupConnectionArgs{
//				ConnectionId: pulumi.StringRef("con_abcdefghkijklmnopqrstuvwxyz0123456789"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupConnection(ctx *pulumi.Context, args *LookupConnectionArgs, opts ...pulumi.InvokeOption) (*LookupConnectionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupConnectionResult
	err := ctx.Invoke("auth0:index/getConnection:getConnection", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConnection.
type LookupConnectionArgs struct {
	// The ID of the connection. If not provided, `name` must be set.
	ConnectionId *string `pulumi:"connectionId"`
	// The name of the connection. If not provided, `connectionId` must be set.
	Name *string `pulumi:"name"`
}

// A collection of values returned by getConnection.
type LookupConnectionResult struct {
	// The ID of the connection. If not provided, `name` must be set.
	ConnectionId *string `pulumi:"connectionId"`
	// Name used in login screen.
	DisplayName string `pulumi:"displayName"`
	// IDs of the clients for which the connection is enabled.
	EnabledClients []string `pulumi:"enabledClients"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Indicates whether the connection is domain level.
	IsDomainConnection bool `pulumi:"isDomainConnection"`
	// Metadata associated with the connection, in the form of a map of string values (max 255 chars).
	Metadata map[string]string `pulumi:"metadata"`
	// The name of the connection. If not provided, `connectionId` must be set.
	Name *string `pulumi:"name"`
	// Configuration settings for connection options.
	Options []GetConnectionOption `pulumi:"options"`
	// Defines the realms for which the connection will be used (e.g., email domains). If not specified, the connection name is added as the realm.
	Realms []string `pulumi:"realms"`
	// Display connection as a button. Only available on enterprise connections.
	ShowAsButton bool `pulumi:"showAsButton"`
	// Type of the connection, which indicates the identity provider.
	Strategy string `pulumi:"strategy"`
}

func LookupConnectionOutput(ctx *pulumi.Context, args LookupConnectionOutputArgs, opts ...pulumi.InvokeOption) LookupConnectionResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupConnectionResultOutput, error) {
			args := v.(LookupConnectionArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("auth0:index/getConnection:getConnection", args, LookupConnectionResultOutput{}, options).(LookupConnectionResultOutput), nil
		}).(LookupConnectionResultOutput)
}

// A collection of arguments for invoking getConnection.
type LookupConnectionOutputArgs struct {
	// The ID of the connection. If not provided, `name` must be set.
	ConnectionId pulumi.StringPtrInput `pulumi:"connectionId"`
	// The name of the connection. If not provided, `connectionId` must be set.
	Name pulumi.StringPtrInput `pulumi:"name"`
}

func (LookupConnectionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectionArgs)(nil)).Elem()
}

// A collection of values returned by getConnection.
type LookupConnectionResultOutput struct{ *pulumi.OutputState }

func (LookupConnectionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectionResult)(nil)).Elem()
}

func (o LookupConnectionResultOutput) ToLookupConnectionResultOutput() LookupConnectionResultOutput {
	return o
}

func (o LookupConnectionResultOutput) ToLookupConnectionResultOutputWithContext(ctx context.Context) LookupConnectionResultOutput {
	return o
}

// The ID of the connection. If not provided, `name` must be set.
func (o LookupConnectionResultOutput) ConnectionId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectionResult) *string { return v.ConnectionId }).(pulumi.StringPtrOutput)
}

// Name used in login screen.
func (o LookupConnectionResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// IDs of the clients for which the connection is enabled.
func (o LookupConnectionResultOutput) EnabledClients() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupConnectionResult) []string { return v.EnabledClients }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupConnectionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Id }).(pulumi.StringOutput)
}

// Indicates whether the connection is domain level.
func (o LookupConnectionResultOutput) IsDomainConnection() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupConnectionResult) bool { return v.IsDomainConnection }).(pulumi.BoolOutput)
}

// Metadata associated with the connection, in the form of a map of string values (max 255 chars).
func (o LookupConnectionResultOutput) Metadata() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupConnectionResult) map[string]string { return v.Metadata }).(pulumi.StringMapOutput)
}

// The name of the connection. If not provided, `connectionId` must be set.
func (o LookupConnectionResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupConnectionResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Configuration settings for connection options.
func (o LookupConnectionResultOutput) Options() GetConnectionOptionArrayOutput {
	return o.ApplyT(func(v LookupConnectionResult) []GetConnectionOption { return v.Options }).(GetConnectionOptionArrayOutput)
}

// Defines the realms for which the connection will be used (e.g., email domains). If not specified, the connection name is added as the realm.
func (o LookupConnectionResultOutput) Realms() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupConnectionResult) []string { return v.Realms }).(pulumi.StringArrayOutput)
}

// Display connection as a button. Only available on enterprise connections.
func (o LookupConnectionResultOutput) ShowAsButton() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupConnectionResult) bool { return v.ShowAsButton }).(pulumi.BoolOutput)
}

// Type of the connection, which indicates the identity provider.
func (o LookupConnectionResultOutput) Strategy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Strategy }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConnectionResultOutput{})
}
