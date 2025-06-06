// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source to retrieve a specific Auth0 Network ACL by ID.
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
//			// An Auth0 network acl loaded using its ID.
//			_, err := auth0.LookupNetworkAcl(ctx, &auth0.LookupNetworkAclArgs{
//				Id: "167f9a50-4444-3333-1111-ndfdaf953ab4",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupNetworkAcl(ctx *pulumi.Context, args *LookupNetworkAclArgs, opts ...pulumi.InvokeOption) (*LookupNetworkAclResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNetworkAclResult
	err := ctx.Invoke("auth0:index/getNetworkAcl:getNetworkAcl", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetworkAcl.
type LookupNetworkAclArgs struct {
	// The ID of the Network ACL.
	Id string `pulumi:"id"`
}

// A collection of values returned by getNetworkAcl.
type LookupNetworkAclResult struct {
	// Whether the Network ACL is active
	Active bool `pulumi:"active"`
	// The description of the Network ACL
	Description string `pulumi:"description"`
	// The ID of the Network ACL.
	Id string `pulumi:"id"`
	// The priority of the Network ACL. Must be unique between 1 and 10.
	Priority int `pulumi:"priority"`
	// The rule of the Network ACL
	Rules []GetNetworkAclRule `pulumi:"rules"`
}

func LookupNetworkAclOutput(ctx *pulumi.Context, args LookupNetworkAclOutputArgs, opts ...pulumi.InvokeOption) LookupNetworkAclResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupNetworkAclResultOutput, error) {
			args := v.(LookupNetworkAclArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("auth0:index/getNetworkAcl:getNetworkAcl", args, LookupNetworkAclResultOutput{}, options).(LookupNetworkAclResultOutput), nil
		}).(LookupNetworkAclResultOutput)
}

// A collection of arguments for invoking getNetworkAcl.
type LookupNetworkAclOutputArgs struct {
	// The ID of the Network ACL.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupNetworkAclOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkAclArgs)(nil)).Elem()
}

// A collection of values returned by getNetworkAcl.
type LookupNetworkAclResultOutput struct{ *pulumi.OutputState }

func (LookupNetworkAclResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkAclResult)(nil)).Elem()
}

func (o LookupNetworkAclResultOutput) ToLookupNetworkAclResultOutput() LookupNetworkAclResultOutput {
	return o
}

func (o LookupNetworkAclResultOutput) ToLookupNetworkAclResultOutputWithContext(ctx context.Context) LookupNetworkAclResultOutput {
	return o
}

// Whether the Network ACL is active
func (o LookupNetworkAclResultOutput) Active() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupNetworkAclResult) bool { return v.Active }).(pulumi.BoolOutput)
}

// The description of the Network ACL
func (o LookupNetworkAclResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkAclResult) string { return v.Description }).(pulumi.StringOutput)
}

// The ID of the Network ACL.
func (o LookupNetworkAclResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkAclResult) string { return v.Id }).(pulumi.StringOutput)
}

// The priority of the Network ACL. Must be unique between 1 and 10.
func (o LookupNetworkAclResultOutput) Priority() pulumi.IntOutput {
	return o.ApplyT(func(v LookupNetworkAclResult) int { return v.Priority }).(pulumi.IntOutput)
}

// The rule of the Network ACL
func (o LookupNetworkAclResultOutput) Rules() GetNetworkAclRuleArrayOutput {
	return o.ApplyT(func(v LookupNetworkAclResult) []GetNetworkAclRule { return v.Rules }).(GetNetworkAclRuleArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNetworkAclResultOutput{})
}
