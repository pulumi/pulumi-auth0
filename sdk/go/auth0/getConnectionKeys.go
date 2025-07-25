// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Retrieve the list of signing keys for a specific Auth0 connection. (Okta/OIDC only)
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
//			// An Auth0 Connection Keys loaded using its Connection ID.
//			_, err := auth0.LookupConnectionKeys(ctx, &auth0.LookupConnectionKeysArgs{
//				ConnectionId: "con_xxxxxxxxxxxxx",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupConnectionKeys(ctx *pulumi.Context, args *LookupConnectionKeysArgs, opts ...pulumi.InvokeOption) (*LookupConnectionKeysResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupConnectionKeysResult
	err := ctx.Invoke("auth0:index/getConnectionKeys:getConnectionKeys", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConnectionKeys.
type LookupConnectionKeysArgs struct {
	// The ID of the connection to retrieve keys for.
	ConnectionId string `pulumi:"connectionId"`
}

// A collection of values returned by getConnectionKeys.
type LookupConnectionKeysResult struct {
	// The ID of the connection to retrieve keys for.
	ConnectionId string `pulumi:"connectionId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// List of signing keys associated with the connection.
	Keys []GetConnectionKeysKey `pulumi:"keys"`
}

func LookupConnectionKeysOutput(ctx *pulumi.Context, args LookupConnectionKeysOutputArgs, opts ...pulumi.InvokeOption) LookupConnectionKeysResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupConnectionKeysResultOutput, error) {
			args := v.(LookupConnectionKeysArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("auth0:index/getConnectionKeys:getConnectionKeys", args, LookupConnectionKeysResultOutput{}, options).(LookupConnectionKeysResultOutput), nil
		}).(LookupConnectionKeysResultOutput)
}

// A collection of arguments for invoking getConnectionKeys.
type LookupConnectionKeysOutputArgs struct {
	// The ID of the connection to retrieve keys for.
	ConnectionId pulumi.StringInput `pulumi:"connectionId"`
}

func (LookupConnectionKeysOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectionKeysArgs)(nil)).Elem()
}

// A collection of values returned by getConnectionKeys.
type LookupConnectionKeysResultOutput struct{ *pulumi.OutputState }

func (LookupConnectionKeysResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectionKeysResult)(nil)).Elem()
}

func (o LookupConnectionKeysResultOutput) ToLookupConnectionKeysResultOutput() LookupConnectionKeysResultOutput {
	return o
}

func (o LookupConnectionKeysResultOutput) ToLookupConnectionKeysResultOutputWithContext(ctx context.Context) LookupConnectionKeysResultOutput {
	return o
}

// The ID of the connection to retrieve keys for.
func (o LookupConnectionKeysResultOutput) ConnectionId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionKeysResult) string { return v.ConnectionId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupConnectionKeysResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionKeysResult) string { return v.Id }).(pulumi.StringOutput)
}

// List of signing keys associated with the connection.
func (o LookupConnectionKeysResultOutput) Keys() GetConnectionKeysKeyArrayOutput {
	return o.ApplyT(func(v LookupConnectionKeysResult) []GetConnectionKeysKey { return v.Keys }).(GetConnectionKeysKeyArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConnectionKeysResultOutput{})
}
