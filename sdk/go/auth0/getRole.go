// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source to retrieve a specific Auth0 role by `roleId` or `name`.
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
//			// An Auth0 Role loaded using its name.
//			_, err := auth0.LookupRole(ctx, &auth0.LookupRoleArgs{
//				Name: pulumi.StringRef("my-role"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// An Auth0 Role loaded using its ID.
//			_, err = auth0.LookupRole(ctx, &auth0.LookupRoleArgs{
//				RoleId: pulumi.StringRef("abcdefghkijklmnopqrstuvwxyz0123456789"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupRole(ctx *pulumi.Context, args *LookupRoleArgs, opts ...pulumi.InvokeOption) (*LookupRoleResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupRoleResult
	err := ctx.Invoke("auth0:index/getRole:getRole", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRole.
type LookupRoleArgs struct {
	// The name of the role. If not provided, `roleId` must be set.
	Name *string `pulumi:"name"`
	// The ID of the role. If not provided, `name` must be set.
	RoleId *string `pulumi:"roleId"`
}

// A collection of values returned by getRole.
type LookupRoleResult struct {
	// The description of the role.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The name of the role. If not provided, `roleId` must be set.
	Name *string `pulumi:"name"`
	// Configuration settings for permissions (scopes) attached to the role.
	Permissions []GetRolePermissionType `pulumi:"permissions"`
	// The ID of the role. If not provided, `name` must be set.
	RoleId *string `pulumi:"roleId"`
	// List of user IDs assigned to this role. Retrieves a maximum of 1000 user IDs.
	Users []string `pulumi:"users"`
}

func LookupRoleOutput(ctx *pulumi.Context, args LookupRoleOutputArgs, opts ...pulumi.InvokeOption) LookupRoleResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupRoleResultOutput, error) {
			args := v.(LookupRoleArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("auth0:index/getRole:getRole", args, LookupRoleResultOutput{}, options).(LookupRoleResultOutput), nil
		}).(LookupRoleResultOutput)
}

// A collection of arguments for invoking getRole.
type LookupRoleOutputArgs struct {
	// The name of the role. If not provided, `roleId` must be set.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The ID of the role. If not provided, `name` must be set.
	RoleId pulumi.StringPtrInput `pulumi:"roleId"`
}

func (LookupRoleOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRoleArgs)(nil)).Elem()
}

// A collection of values returned by getRole.
type LookupRoleResultOutput struct{ *pulumi.OutputState }

func (LookupRoleResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRoleResult)(nil)).Elem()
}

func (o LookupRoleResultOutput) ToLookupRoleResultOutput() LookupRoleResultOutput {
	return o
}

func (o LookupRoleResultOutput) ToLookupRoleResultOutputWithContext(ctx context.Context) LookupRoleResultOutput {
	return o
}

// The description of the role.
func (o LookupRoleResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoleResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupRoleResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRoleResult) string { return v.Id }).(pulumi.StringOutput)
}

// The name of the role. If not provided, `roleId` must be set.
func (o LookupRoleResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupRoleResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Configuration settings for permissions (scopes) attached to the role.
func (o LookupRoleResultOutput) Permissions() GetRolePermissionTypeArrayOutput {
	return o.ApplyT(func(v LookupRoleResult) []GetRolePermissionType { return v.Permissions }).(GetRolePermissionTypeArrayOutput)
}

// The ID of the role. If not provided, `name` must be set.
func (o LookupRoleResultOutput) RoleId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupRoleResult) *string { return v.RoleId }).(pulumi.StringPtrOutput)
}

// List of user IDs assigned to this role. Retrieves a maximum of 1000 user IDs.
func (o LookupRoleResultOutput) Users() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupRoleResult) []string { return v.Users }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupRoleResultOutput{})
}
