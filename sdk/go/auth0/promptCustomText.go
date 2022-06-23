// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With this resource, you can manage custom text on your Auth0 prompts. You can read more about custom texts
// [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"encoding/json"
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		tmpJSON0, err := json.Marshal(map[string]interface{}{
// 			"login": map[string]interface{}{
// 				"alertListTitle":                "Alerts",
// 				"buttonText":                    "Continue",
// 				"description":                   "Login to",
// 				"editEmailText":                 "Edit",
// 				"emailPlaceholder":              "Email address",
// 				"federatedConnectionButtonText": fmt.Sprintf("Continue with %v", connectionName),
// 				"footerLinkText":                "Sign up",
// 				"footerText":                    "Don't have an account?",
// 				"forgotPasswordText":            "Forgot password?",
// 				"invitationDescription":         fmt.Sprintf("Log in to accept %v's invitation to join %v on %v.", inviterName, companyName, clientName),
// 				"invitationTitle":               "You've Been Invited!",
// 				"logoAltText":                   companyName,
// 				"pageTitle":                     fmt.Sprintf("Log in | %v", clientName),
// 				"passwordPlaceholder":           "Password",
// 				"separatorText":                 "Or",
// 				"signupActionLinkText":          footerLinkText,
// 				"signupActionText":              footerText,
// 				"title":                         "Welcome",
// 				"usernamePlaceholder":           "Username or email address",
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		json0 := string(tmpJSON0)
// 		_, err := auth0.NewPromptCustomText(ctx, "example", &auth0.PromptCustomTextArgs{
// 			Prompt:   pulumi.String("login"),
// 			Language: pulumi.String("en"),
// 			Body:     pulumi.String(json0),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// This resource can be imported using the import command and specifying the prompt and language separated by *:* , e.g.
//
// ```sh
//  $ pulumi import auth0:index/promptCustomText:PromptCustomText example login:en
// ```
type PromptCustomText struct {
	pulumi.CustomResourceState

	// JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values)
	Body pulumi.StringOutput `pulumi:"body"`
	// Language of the custom text. Options include `ar`, `bg`, `bs`, `cs`, `da`, `de`, `el`, `en`, `es`, `et`, `fi`, `fr`, `fr-CA`, `fr-FR`, `he`, `hi`, `hr`, `hu`, `id`, `is`, `it`, `ja`, `ko`, `lt`, `lv`, `nb`, `nl`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `sr`, `sv`, `th`, `tr`, `uk`, `vi`, `zh-CN`, `zh-TW`
	Language pulumi.StringOutput `pulumi:"language"`
	// The term `prompt` is used to refer to a specific step in the login flow. Options include `login`, `login-id`, `login-password`, `login-email-verification`, `signup`, `signup-id`, `signup-password`, `reset-password`, `consent`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`
	Prompt pulumi.StringOutput `pulumi:"prompt"`
}

// NewPromptCustomText registers a new resource with the given unique name, arguments, and options.
func NewPromptCustomText(ctx *pulumi.Context,
	name string, args *PromptCustomTextArgs, opts ...pulumi.ResourceOption) (*PromptCustomText, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Body == nil {
		return nil, errors.New("invalid value for required argument 'Body'")
	}
	if args.Language == nil {
		return nil, errors.New("invalid value for required argument 'Language'")
	}
	if args.Prompt == nil {
		return nil, errors.New("invalid value for required argument 'Prompt'")
	}
	var resource PromptCustomText
	err := ctx.RegisterResource("auth0:index/promptCustomText:PromptCustomText", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPromptCustomText gets an existing PromptCustomText resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPromptCustomText(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PromptCustomTextState, opts ...pulumi.ResourceOption) (*PromptCustomText, error) {
	var resource PromptCustomText
	err := ctx.ReadResource("auth0:index/promptCustomText:PromptCustomText", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PromptCustomText resources.
type promptCustomTextState struct {
	// JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values)
	Body *string `pulumi:"body"`
	// Language of the custom text. Options include `ar`, `bg`, `bs`, `cs`, `da`, `de`, `el`, `en`, `es`, `et`, `fi`, `fr`, `fr-CA`, `fr-FR`, `he`, `hi`, `hr`, `hu`, `id`, `is`, `it`, `ja`, `ko`, `lt`, `lv`, `nb`, `nl`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `sr`, `sv`, `th`, `tr`, `uk`, `vi`, `zh-CN`, `zh-TW`
	Language *string `pulumi:"language"`
	// The term `prompt` is used to refer to a specific step in the login flow. Options include `login`, `login-id`, `login-password`, `login-email-verification`, `signup`, `signup-id`, `signup-password`, `reset-password`, `consent`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`
	Prompt *string `pulumi:"prompt"`
}

type PromptCustomTextState struct {
	// JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values)
	Body pulumi.StringPtrInput
	// Language of the custom text. Options include `ar`, `bg`, `bs`, `cs`, `da`, `de`, `el`, `en`, `es`, `et`, `fi`, `fr`, `fr-CA`, `fr-FR`, `he`, `hi`, `hr`, `hu`, `id`, `is`, `it`, `ja`, `ko`, `lt`, `lv`, `nb`, `nl`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `sr`, `sv`, `th`, `tr`, `uk`, `vi`, `zh-CN`, `zh-TW`
	Language pulumi.StringPtrInput
	// The term `prompt` is used to refer to a specific step in the login flow. Options include `login`, `login-id`, `login-password`, `login-email-verification`, `signup`, `signup-id`, `signup-password`, `reset-password`, `consent`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`
	Prompt pulumi.StringPtrInput
}

func (PromptCustomTextState) ElementType() reflect.Type {
	return reflect.TypeOf((*promptCustomTextState)(nil)).Elem()
}

type promptCustomTextArgs struct {
	// JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values)
	Body string `pulumi:"body"`
	// Language of the custom text. Options include `ar`, `bg`, `bs`, `cs`, `da`, `de`, `el`, `en`, `es`, `et`, `fi`, `fr`, `fr-CA`, `fr-FR`, `he`, `hi`, `hr`, `hu`, `id`, `is`, `it`, `ja`, `ko`, `lt`, `lv`, `nb`, `nl`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `sr`, `sv`, `th`, `tr`, `uk`, `vi`, `zh-CN`, `zh-TW`
	Language string `pulumi:"language"`
	// The term `prompt` is used to refer to a specific step in the login flow. Options include `login`, `login-id`, `login-password`, `login-email-verification`, `signup`, `signup-id`, `signup-password`, `reset-password`, `consent`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`
	Prompt string `pulumi:"prompt"`
}

// The set of arguments for constructing a PromptCustomText resource.
type PromptCustomTextArgs struct {
	// JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values)
	Body pulumi.StringInput
	// Language of the custom text. Options include `ar`, `bg`, `bs`, `cs`, `da`, `de`, `el`, `en`, `es`, `et`, `fi`, `fr`, `fr-CA`, `fr-FR`, `he`, `hi`, `hr`, `hu`, `id`, `is`, `it`, `ja`, `ko`, `lt`, `lv`, `nb`, `nl`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `sr`, `sv`, `th`, `tr`, `uk`, `vi`, `zh-CN`, `zh-TW`
	Language pulumi.StringInput
	// The term `prompt` is used to refer to a specific step in the login flow. Options include `login`, `login-id`, `login-password`, `login-email-verification`, `signup`, `signup-id`, `signup-password`, `reset-password`, `consent`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`
	Prompt pulumi.StringInput
}

func (PromptCustomTextArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*promptCustomTextArgs)(nil)).Elem()
}

type PromptCustomTextInput interface {
	pulumi.Input

	ToPromptCustomTextOutput() PromptCustomTextOutput
	ToPromptCustomTextOutputWithContext(ctx context.Context) PromptCustomTextOutput
}

func (*PromptCustomText) ElementType() reflect.Type {
	return reflect.TypeOf((**PromptCustomText)(nil)).Elem()
}

func (i *PromptCustomText) ToPromptCustomTextOutput() PromptCustomTextOutput {
	return i.ToPromptCustomTextOutputWithContext(context.Background())
}

func (i *PromptCustomText) ToPromptCustomTextOutputWithContext(ctx context.Context) PromptCustomTextOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PromptCustomTextOutput)
}

// PromptCustomTextArrayInput is an input type that accepts PromptCustomTextArray and PromptCustomTextArrayOutput values.
// You can construct a concrete instance of `PromptCustomTextArrayInput` via:
//
//          PromptCustomTextArray{ PromptCustomTextArgs{...} }
type PromptCustomTextArrayInput interface {
	pulumi.Input

	ToPromptCustomTextArrayOutput() PromptCustomTextArrayOutput
	ToPromptCustomTextArrayOutputWithContext(context.Context) PromptCustomTextArrayOutput
}

type PromptCustomTextArray []PromptCustomTextInput

func (PromptCustomTextArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PromptCustomText)(nil)).Elem()
}

func (i PromptCustomTextArray) ToPromptCustomTextArrayOutput() PromptCustomTextArrayOutput {
	return i.ToPromptCustomTextArrayOutputWithContext(context.Background())
}

func (i PromptCustomTextArray) ToPromptCustomTextArrayOutputWithContext(ctx context.Context) PromptCustomTextArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PromptCustomTextArrayOutput)
}

// PromptCustomTextMapInput is an input type that accepts PromptCustomTextMap and PromptCustomTextMapOutput values.
// You can construct a concrete instance of `PromptCustomTextMapInput` via:
//
//          PromptCustomTextMap{ "key": PromptCustomTextArgs{...} }
type PromptCustomTextMapInput interface {
	pulumi.Input

	ToPromptCustomTextMapOutput() PromptCustomTextMapOutput
	ToPromptCustomTextMapOutputWithContext(context.Context) PromptCustomTextMapOutput
}

type PromptCustomTextMap map[string]PromptCustomTextInput

func (PromptCustomTextMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PromptCustomText)(nil)).Elem()
}

func (i PromptCustomTextMap) ToPromptCustomTextMapOutput() PromptCustomTextMapOutput {
	return i.ToPromptCustomTextMapOutputWithContext(context.Background())
}

func (i PromptCustomTextMap) ToPromptCustomTextMapOutputWithContext(ctx context.Context) PromptCustomTextMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PromptCustomTextMapOutput)
}

type PromptCustomTextOutput struct{ *pulumi.OutputState }

func (PromptCustomTextOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PromptCustomText)(nil)).Elem()
}

func (o PromptCustomTextOutput) ToPromptCustomTextOutput() PromptCustomTextOutput {
	return o
}

func (o PromptCustomTextOutput) ToPromptCustomTextOutputWithContext(ctx context.Context) PromptCustomTextOutput {
	return o
}

// JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values)
func (o PromptCustomTextOutput) Body() pulumi.StringOutput {
	return o.ApplyT(func(v *PromptCustomText) pulumi.StringOutput { return v.Body }).(pulumi.StringOutput)
}

// Language of the custom text. Options include `ar`, `bg`, `bs`, `cs`, `da`, `de`, `el`, `en`, `es`, `et`, `fi`, `fr`, `fr-CA`, `fr-FR`, `he`, `hi`, `hr`, `hu`, `id`, `is`, `it`, `ja`, `ko`, `lt`, `lv`, `nb`, `nl`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `sr`, `sv`, `th`, `tr`, `uk`, `vi`, `zh-CN`, `zh-TW`
func (o PromptCustomTextOutput) Language() pulumi.StringOutput {
	return o.ApplyT(func(v *PromptCustomText) pulumi.StringOutput { return v.Language }).(pulumi.StringOutput)
}

// The term `prompt` is used to refer to a specific step in the login flow. Options include `login`, `login-id`, `login-password`, `login-email-verification`, `signup`, `signup-id`, `signup-password`, `reset-password`, `consent`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`
func (o PromptCustomTextOutput) Prompt() pulumi.StringOutput {
	return o.ApplyT(func(v *PromptCustomText) pulumi.StringOutput { return v.Prompt }).(pulumi.StringOutput)
}

type PromptCustomTextArrayOutput struct{ *pulumi.OutputState }

func (PromptCustomTextArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PromptCustomText)(nil)).Elem()
}

func (o PromptCustomTextArrayOutput) ToPromptCustomTextArrayOutput() PromptCustomTextArrayOutput {
	return o
}

func (o PromptCustomTextArrayOutput) ToPromptCustomTextArrayOutputWithContext(ctx context.Context) PromptCustomTextArrayOutput {
	return o
}

func (o PromptCustomTextArrayOutput) Index(i pulumi.IntInput) PromptCustomTextOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PromptCustomText {
		return vs[0].([]*PromptCustomText)[vs[1].(int)]
	}).(PromptCustomTextOutput)
}

type PromptCustomTextMapOutput struct{ *pulumi.OutputState }

func (PromptCustomTextMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PromptCustomText)(nil)).Elem()
}

func (o PromptCustomTextMapOutput) ToPromptCustomTextMapOutput() PromptCustomTextMapOutput {
	return o
}

func (o PromptCustomTextMapOutput) ToPromptCustomTextMapOutputWithContext(ctx context.Context) PromptCustomTextMapOutput {
	return o
}

func (o PromptCustomTextMapOutput) MapIndex(k pulumi.StringInput) PromptCustomTextOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PromptCustomText {
		return vs[0].(map[string]*PromptCustomText)[vs[1].(string)]
	}).(PromptCustomTextOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PromptCustomTextInput)(nil)).Elem(), &PromptCustomText{})
	pulumi.RegisterInputType(reflect.TypeOf((*PromptCustomTextArrayInput)(nil)).Elem(), PromptCustomTextArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PromptCustomTextMapInput)(nil)).Elem(), PromptCustomTextMap{})
	pulumi.RegisterOutputType(PromptCustomTextOutput{})
	pulumi.RegisterOutputType(PromptCustomTextArrayOutput{})
	pulumi.RegisterOutputType(PromptCustomTextMapOutput{})
}
