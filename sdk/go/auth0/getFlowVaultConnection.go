// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source to retrieve a specific Auth0 Flow Vault Connection by `id`
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
//			// An Auth0 flow vault connection loaded using its ID.
//			_, err := auth0.LookupFlowVaultConnection(ctx, &auth0.LookupFlowVaultConnectionArgs{
//				Id: "ac_9m2uqjHsqs19riN9N6sZQ7",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupFlowVaultConnection(ctx *pulumi.Context, args *LookupFlowVaultConnectionArgs, opts ...pulumi.InvokeOption) (*LookupFlowVaultConnectionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupFlowVaultConnectionResult
	err := ctx.Invoke("auth0:index/getFlowVaultConnection:getFlowVaultConnection", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFlowVaultConnection.
type LookupFlowVaultConnectionArgs struct {
	// The id of the Flow Vault Connection.
	Id string `pulumi:"id"`
}

// A collection of values returned by getFlowVaultConnection.
type LookupFlowVaultConnectionResult struct {
	// Custom account name of the vault connection.
	AccountName string `pulumi:"accountName"`
	// App identifier of the vault connection.
	AppId string `pulumi:"appId"`
	// Environment of the vault connection.
	Environment string `pulumi:"environment"`
	// Fingerprint of the vault connection.
	Fingerprint string `pulumi:"fingerprint"`
	// The id of the Flow Vault Connection.
	Id string `pulumi:"id"`
	// Name of the vault connection.
	Name string `pulumi:"name"`
	// Indicates if the vault connection is configured.
	Ready bool `pulumi:"ready"`
	// Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
	Setup map[string]string `pulumi:"setup"`
}

func LookupFlowVaultConnectionOutput(ctx *pulumi.Context, args LookupFlowVaultConnectionOutputArgs, opts ...pulumi.InvokeOption) LookupFlowVaultConnectionResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupFlowVaultConnectionResultOutput, error) {
			args := v.(LookupFlowVaultConnectionArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("auth0:index/getFlowVaultConnection:getFlowVaultConnection", args, LookupFlowVaultConnectionResultOutput{}, options).(LookupFlowVaultConnectionResultOutput), nil
		}).(LookupFlowVaultConnectionResultOutput)
}

// A collection of arguments for invoking getFlowVaultConnection.
type LookupFlowVaultConnectionOutputArgs struct {
	// The id of the Flow Vault Connection.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupFlowVaultConnectionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFlowVaultConnectionArgs)(nil)).Elem()
}

// A collection of values returned by getFlowVaultConnection.
type LookupFlowVaultConnectionResultOutput struct{ *pulumi.OutputState }

func (LookupFlowVaultConnectionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFlowVaultConnectionResult)(nil)).Elem()
}

func (o LookupFlowVaultConnectionResultOutput) ToLookupFlowVaultConnectionResultOutput() LookupFlowVaultConnectionResultOutput {
	return o
}

func (o LookupFlowVaultConnectionResultOutput) ToLookupFlowVaultConnectionResultOutputWithContext(ctx context.Context) LookupFlowVaultConnectionResultOutput {
	return o
}

// Custom account name of the vault connection.
func (o LookupFlowVaultConnectionResultOutput) AccountName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlowVaultConnectionResult) string { return v.AccountName }).(pulumi.StringOutput)
}

// App identifier of the vault connection.
func (o LookupFlowVaultConnectionResultOutput) AppId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlowVaultConnectionResult) string { return v.AppId }).(pulumi.StringOutput)
}

// Environment of the vault connection.
func (o LookupFlowVaultConnectionResultOutput) Environment() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlowVaultConnectionResult) string { return v.Environment }).(pulumi.StringOutput)
}

// Fingerprint of the vault connection.
func (o LookupFlowVaultConnectionResultOutput) Fingerprint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlowVaultConnectionResult) string { return v.Fingerprint }).(pulumi.StringOutput)
}

// The id of the Flow Vault Connection.
func (o LookupFlowVaultConnectionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlowVaultConnectionResult) string { return v.Id }).(pulumi.StringOutput)
}

// Name of the vault connection.
func (o LookupFlowVaultConnectionResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFlowVaultConnectionResult) string { return v.Name }).(pulumi.StringOutput)
}

// Indicates if the vault connection is configured.
func (o LookupFlowVaultConnectionResultOutput) Ready() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupFlowVaultConnectionResult) bool { return v.Ready }).(pulumi.BoolOutput)
}

// Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
func (o LookupFlowVaultConnectionResultOutput) Setup() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupFlowVaultConnectionResult) map[string]string { return v.Setup }).(pulumi.StringMapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFlowVaultConnectionResultOutput{})
}
