// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Data source to retrieve a specific Auth0 organization by `organizationId` or `name`.
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
//			_, err := auth0.LookupOrganization(ctx, &auth0.LookupOrganizationArgs{
//				Name: pulumi.StringRef("my-org"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = auth0.LookupOrganization(ctx, &auth0.LookupOrganizationArgs{
//				OrganizationId: pulumi.StringRef("org_abcdefghkijklmnopqrstuvwxyz0123456789"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupOrganization(ctx *pulumi.Context, args *LookupOrganizationArgs, opts ...pulumi.InvokeOption) (*LookupOrganizationResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupOrganizationResult
	err := ctx.Invoke("auth0:index/getOrganization:getOrganization", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getOrganization.
type LookupOrganizationArgs struct {
	// The name of the organization. If not provided, `organizationId` must be set. For performance, it is advised to use the `organizationId` as a lookup if possible.
	Name *string `pulumi:"name"`
	// The ID of the organization. If not provided, `name` must be set.
	OrganizationId *string `pulumi:"organizationId"`
}

// A collection of values returned by getOrganization.
type LookupOrganizationResult struct {
	// Defines how to style the login pages.
	Brandings   []GetOrganizationBranding       `pulumi:"brandings"`
	Connections []GetOrganizationConnectionType `pulumi:"connections"`
	// Friendly name of this organization.
	DisplayName string `pulumi:"displayName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// User ID(s) that are members of the organization.
	Members []string `pulumi:"members"`
	// Metadata associated with the organization. Maximum of 10 metadata properties allowed.
	Metadata map[string]string `pulumi:"metadata"`
	// The name of the organization. If not provided, `organizationId` must be set. For performance, it is advised to use the `organizationId` as a lookup if possible.
	Name *string `pulumi:"name"`
	// The ID of the organization. If not provided, `name` must be set.
	OrganizationId *string `pulumi:"organizationId"`
}

func LookupOrganizationOutput(ctx *pulumi.Context, args LookupOrganizationOutputArgs, opts ...pulumi.InvokeOption) LookupOrganizationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupOrganizationResult, error) {
			args := v.(LookupOrganizationArgs)
			r, err := LookupOrganization(ctx, &args, opts...)
			var s LookupOrganizationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupOrganizationResultOutput)
}

// A collection of arguments for invoking getOrganization.
type LookupOrganizationOutputArgs struct {
	// The name of the organization. If not provided, `organizationId` must be set. For performance, it is advised to use the `organizationId` as a lookup if possible.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The ID of the organization. If not provided, `name` must be set.
	OrganizationId pulumi.StringPtrInput `pulumi:"organizationId"`
}

func (LookupOrganizationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOrganizationArgs)(nil)).Elem()
}

// A collection of values returned by getOrganization.
type LookupOrganizationResultOutput struct{ *pulumi.OutputState }

func (LookupOrganizationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupOrganizationResult)(nil)).Elem()
}

func (o LookupOrganizationResultOutput) ToLookupOrganizationResultOutput() LookupOrganizationResultOutput {
	return o
}

func (o LookupOrganizationResultOutput) ToLookupOrganizationResultOutputWithContext(ctx context.Context) LookupOrganizationResultOutput {
	return o
}

func (o LookupOrganizationResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupOrganizationResult] {
	return pulumix.Output[LookupOrganizationResult]{
		OutputState: o.OutputState,
	}
}

// Defines how to style the login pages.
func (o LookupOrganizationResultOutput) Brandings() GetOrganizationBrandingArrayOutput {
	return o.ApplyT(func(v LookupOrganizationResult) []GetOrganizationBranding { return v.Brandings }).(GetOrganizationBrandingArrayOutput)
}

func (o LookupOrganizationResultOutput) Connections() GetOrganizationConnectionTypeArrayOutput {
	return o.ApplyT(func(v LookupOrganizationResult) []GetOrganizationConnectionType { return v.Connections }).(GetOrganizationConnectionTypeArrayOutput)
}

// Friendly name of this organization.
func (o LookupOrganizationResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupOrganizationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupOrganizationResult) string { return v.Id }).(pulumi.StringOutput)
}

// User ID(s) that are members of the organization.
func (o LookupOrganizationResultOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupOrganizationResult) []string { return v.Members }).(pulumi.StringArrayOutput)
}

// Metadata associated with the organization. Maximum of 10 metadata properties allowed.
func (o LookupOrganizationResultOutput) Metadata() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupOrganizationResult) map[string]string { return v.Metadata }).(pulumi.StringMapOutput)
}

// The name of the organization. If not provided, `organizationId` must be set. For performance, it is advised to use the `organizationId` as a lookup if possible.
func (o LookupOrganizationResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupOrganizationResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The ID of the organization. If not provided, `name` must be set.
func (o LookupOrganizationResultOutput) OrganizationId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupOrganizationResult) *string { return v.OrganizationId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupOrganizationResultOutput{})
}
