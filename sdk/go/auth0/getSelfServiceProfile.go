// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source to retrieve a specific Auth0 Self-Service Profile by `id`
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
//			// An Auth0 Self-Service- Profile loaded using it's ID.
//			_, err := auth0.LookupSelfServiceProfile(ctx, &auth0.LookupSelfServiceProfileArgs{
//				Id: "some-profile-id",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSelfServiceProfile(ctx *pulumi.Context, args *LookupSelfServiceProfileArgs, opts ...pulumi.InvokeOption) (*LookupSelfServiceProfileResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupSelfServiceProfileResult
	err := ctx.Invoke("auth0:index/getSelfServiceProfile:getSelfServiceProfile", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSelfServiceProfile.
type LookupSelfServiceProfileArgs struct {
	// The id of the Self Service Profile
	Id string `pulumi:"id"`
}

// A collection of values returned by getSelfServiceProfile.
type LookupSelfServiceProfileResult struct {
	// Field can be used to customize the look and feel of the wizard.
	Brandings []GetSelfServiceProfileBranding `pulumi:"brandings"`
	// The ISO 8601 formatted date the profile was created.
	CreatedAt string `pulumi:"createdAt"`
	// The id of the Self Service Profile
	Id string `pulumi:"id"`
	// The ISO 8601 formatted date the profile was updated.
	UpdatedAt string `pulumi:"updatedAt"`
	// This array stores the mapping information that will be shown to the user during the SS-SSO flow. The user will be prompted to map the attributes on their identity provider to ensure the specified attributes get passed to Auth0.
	UserAttributes []GetSelfServiceProfileUserAttribute `pulumi:"userAttributes"`
}

func LookupSelfServiceProfileOutput(ctx *pulumi.Context, args LookupSelfServiceProfileOutputArgs, opts ...pulumi.InvokeOption) LookupSelfServiceProfileResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSelfServiceProfileResultOutput, error) {
			args := v.(LookupSelfServiceProfileArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupSelfServiceProfileResult
			secret, err := ctx.InvokePackageRaw("auth0:index/getSelfServiceProfile:getSelfServiceProfile", args, &rv, "", opts...)
			if err != nil {
				return LookupSelfServiceProfileResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupSelfServiceProfileResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupSelfServiceProfileResultOutput), nil
			}
			return output, nil
		}).(LookupSelfServiceProfileResultOutput)
}

// A collection of arguments for invoking getSelfServiceProfile.
type LookupSelfServiceProfileOutputArgs struct {
	// The id of the Self Service Profile
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupSelfServiceProfileOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSelfServiceProfileArgs)(nil)).Elem()
}

// A collection of values returned by getSelfServiceProfile.
type LookupSelfServiceProfileResultOutput struct{ *pulumi.OutputState }

func (LookupSelfServiceProfileResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSelfServiceProfileResult)(nil)).Elem()
}

func (o LookupSelfServiceProfileResultOutput) ToLookupSelfServiceProfileResultOutput() LookupSelfServiceProfileResultOutput {
	return o
}

func (o LookupSelfServiceProfileResultOutput) ToLookupSelfServiceProfileResultOutputWithContext(ctx context.Context) LookupSelfServiceProfileResultOutput {
	return o
}

// Field can be used to customize the look and feel of the wizard.
func (o LookupSelfServiceProfileResultOutput) Brandings() GetSelfServiceProfileBrandingArrayOutput {
	return o.ApplyT(func(v LookupSelfServiceProfileResult) []GetSelfServiceProfileBranding { return v.Brandings }).(GetSelfServiceProfileBrandingArrayOutput)
}

// The ISO 8601 formatted date the profile was created.
func (o LookupSelfServiceProfileResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSelfServiceProfileResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

// The id of the Self Service Profile
func (o LookupSelfServiceProfileResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSelfServiceProfileResult) string { return v.Id }).(pulumi.StringOutput)
}

// The ISO 8601 formatted date the profile was updated.
func (o LookupSelfServiceProfileResultOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSelfServiceProfileResult) string { return v.UpdatedAt }).(pulumi.StringOutput)
}

// This array stores the mapping information that will be shown to the user during the SS-SSO flow. The user will be prompted to map the attributes on their identity provider to ensure the specified attributes get passed to Auth0.
func (o LookupSelfServiceProfileResultOutput) UserAttributes() GetSelfServiceProfileUserAttributeArrayOutput {
	return o.ApplyT(func(v LookupSelfServiceProfileResult) []GetSelfServiceProfileUserAttribute { return v.UserAttributes }).(GetSelfServiceProfileUserAttributeArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSelfServiceProfileResultOutput{})
}