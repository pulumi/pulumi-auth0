// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source to retrieve a specific Auth0 prompt screen settings by `promptType` and `screenName`
func LookupPromptScreenRenderer(ctx *pulumi.Context, args *LookupPromptScreenRendererArgs, opts ...pulumi.InvokeOption) (*LookupPromptScreenRendererResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupPromptScreenRendererResult
	err := ctx.Invoke("auth0:index/getPromptScreenRenderer:getPromptScreenRenderer", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPromptScreenRenderer.
type LookupPromptScreenRendererArgs struct {
	// The type of prompt to customize.
	PromptType string `pulumi:"promptType"`
	// The screen name associated with the prompt type.
	ScreenName string `pulumi:"screenName"`
}

// A collection of values returned by getPromptScreenRenderer.
type LookupPromptScreenRendererResult struct {
	// Context values to make available
	ContextConfigurations []string `pulumi:"contextConfigurations"`
	// Override Universal Login default head tags
	DefaultHeadTagsDisabled bool `pulumi:"defaultHeadTagsDisabled"`
	// An array of head tags
	HeadTags string `pulumi:"headTags"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The type of prompt to customize.
	PromptType string `pulumi:"promptType"`
	// Rendering modeOptions are: `standard`, `advanced`.
	RenderingMode string `pulumi:"renderingMode"`
	// The screen name associated with the prompt type.
	ScreenName string `pulumi:"screenName"`
	// Tenant ID
	Tenant string `pulumi:"tenant"`
}

func LookupPromptScreenRendererOutput(ctx *pulumi.Context, args LookupPromptScreenRendererOutputArgs, opts ...pulumi.InvokeOption) LookupPromptScreenRendererResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupPromptScreenRendererResultOutput, error) {
			args := v.(LookupPromptScreenRendererArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("auth0:index/getPromptScreenRenderer:getPromptScreenRenderer", args, LookupPromptScreenRendererResultOutput{}, options).(LookupPromptScreenRendererResultOutput), nil
		}).(LookupPromptScreenRendererResultOutput)
}

// A collection of arguments for invoking getPromptScreenRenderer.
type LookupPromptScreenRendererOutputArgs struct {
	// The type of prompt to customize.
	PromptType pulumi.StringInput `pulumi:"promptType"`
	// The screen name associated with the prompt type.
	ScreenName pulumi.StringInput `pulumi:"screenName"`
}

func (LookupPromptScreenRendererOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPromptScreenRendererArgs)(nil)).Elem()
}

// A collection of values returned by getPromptScreenRenderer.
type LookupPromptScreenRendererResultOutput struct{ *pulumi.OutputState }

func (LookupPromptScreenRendererResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPromptScreenRendererResult)(nil)).Elem()
}

func (o LookupPromptScreenRendererResultOutput) ToLookupPromptScreenRendererResultOutput() LookupPromptScreenRendererResultOutput {
	return o
}

func (o LookupPromptScreenRendererResultOutput) ToLookupPromptScreenRendererResultOutputWithContext(ctx context.Context) LookupPromptScreenRendererResultOutput {
	return o
}

// Context values to make available
func (o LookupPromptScreenRendererResultOutput) ContextConfigurations() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupPromptScreenRendererResult) []string { return v.ContextConfigurations }).(pulumi.StringArrayOutput)
}

// Override Universal Login default head tags
func (o LookupPromptScreenRendererResultOutput) DefaultHeadTagsDisabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupPromptScreenRendererResult) bool { return v.DefaultHeadTagsDisabled }).(pulumi.BoolOutput)
}

// An array of head tags
func (o LookupPromptScreenRendererResultOutput) HeadTags() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPromptScreenRendererResult) string { return v.HeadTags }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupPromptScreenRendererResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPromptScreenRendererResult) string { return v.Id }).(pulumi.StringOutput)
}

// The type of prompt to customize.
func (o LookupPromptScreenRendererResultOutput) PromptType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPromptScreenRendererResult) string { return v.PromptType }).(pulumi.StringOutput)
}

// Rendering modeOptions are: `standard`, `advanced`.
func (o LookupPromptScreenRendererResultOutput) RenderingMode() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPromptScreenRendererResult) string { return v.RenderingMode }).(pulumi.StringOutput)
}

// The screen name associated with the prompt type.
func (o LookupPromptScreenRendererResultOutput) ScreenName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPromptScreenRendererResult) string { return v.ScreenName }).(pulumi.StringOutput)
}

// Tenant ID
func (o LookupPromptScreenRendererResultOutput) Tenant() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPromptScreenRendererResult) string { return v.Tenant }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPromptScreenRendererResultOutput{})
}