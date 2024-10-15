// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source to retrieve a specific Auth0 Form by `id`
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
//			// An Auth0 form loaded using its ID.
//			_, err := auth0.LookupForm(ctx, &auth0.LookupFormArgs{
//				Id: "ap_31LxRJphZF1Kqzf2zBgmgA",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupForm(ctx *pulumi.Context, args *LookupFormArgs, opts ...pulumi.InvokeOption) (*LookupFormResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupFormResult
	err := ctx.Invoke("auth0:index/getForm:getForm", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getForm.
type LookupFormArgs struct {
	// The id of the Form.
	Id string `pulumi:"id"`
}

// A collection of values returned by getForm.
type LookupFormResult struct {
	// Submission configuration of the form. (JSON encoded)
	Ending string `pulumi:"ending"`
	// The id of the Form.
	Id string `pulumi:"id"`
	// Language specific configuration for the form.
	Languages []GetFormLanguage `pulumi:"languages"`
	// Message specific configuration for the form.
	Messages []GetFormMessage `pulumi:"messages"`
	// Name of the form.
	Name string `pulumi:"name"`
	// Nodes of the form. (JSON encoded)
	Nodes string `pulumi:"nodes"`
	// Input setup of the form. (JSON encoded)
	Start string `pulumi:"start"`
	// Style specific configuration for the form. (JSON encoded)
	Style string `pulumi:"style"`
	// Translations of the form. (JSON encoded)
	Translations string `pulumi:"translations"`
}

func LookupFormOutput(ctx *pulumi.Context, args LookupFormOutputArgs, opts ...pulumi.InvokeOption) LookupFormResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupFormResultOutput, error) {
			args := v.(LookupFormArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupFormResult
			secret, err := ctx.InvokePackageRaw("auth0:index/getForm:getForm", args, &rv, "", opts...)
			if err != nil {
				return LookupFormResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupFormResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupFormResultOutput), nil
			}
			return output, nil
		}).(LookupFormResultOutput)
}

// A collection of arguments for invoking getForm.
type LookupFormOutputArgs struct {
	// The id of the Form.
	Id pulumi.StringInput `pulumi:"id"`
}

func (LookupFormOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFormArgs)(nil)).Elem()
}

// A collection of values returned by getForm.
type LookupFormResultOutput struct{ *pulumi.OutputState }

func (LookupFormResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupFormResult)(nil)).Elem()
}

func (o LookupFormResultOutput) ToLookupFormResultOutput() LookupFormResultOutput {
	return o
}

func (o LookupFormResultOutput) ToLookupFormResultOutputWithContext(ctx context.Context) LookupFormResultOutput {
	return o
}

// Submission configuration of the form. (JSON encoded)
func (o LookupFormResultOutput) Ending() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFormResult) string { return v.Ending }).(pulumi.StringOutput)
}

// The id of the Form.
func (o LookupFormResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFormResult) string { return v.Id }).(pulumi.StringOutput)
}

// Language specific configuration for the form.
func (o LookupFormResultOutput) Languages() GetFormLanguageArrayOutput {
	return o.ApplyT(func(v LookupFormResult) []GetFormLanguage { return v.Languages }).(GetFormLanguageArrayOutput)
}

// Message specific configuration for the form.
func (o LookupFormResultOutput) Messages() GetFormMessageArrayOutput {
	return o.ApplyT(func(v LookupFormResult) []GetFormMessage { return v.Messages }).(GetFormMessageArrayOutput)
}

// Name of the form.
func (o LookupFormResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFormResult) string { return v.Name }).(pulumi.StringOutput)
}

// Nodes of the form. (JSON encoded)
func (o LookupFormResultOutput) Nodes() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFormResult) string { return v.Nodes }).(pulumi.StringOutput)
}

// Input setup of the form. (JSON encoded)
func (o LookupFormResultOutput) Start() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFormResult) string { return v.Start }).(pulumi.StringOutput)
}

// Style specific configuration for the form. (JSON encoded)
func (o LookupFormResultOutput) Style() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFormResult) string { return v.Style }).(pulumi.StringOutput)
}

// Translations of the form. (JSON encoded)
func (o LookupFormResultOutput) Translations() pulumi.StringOutput {
	return o.ApplyT(func(v LookupFormResult) string { return v.Translations }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupFormResultOutput{})
}
