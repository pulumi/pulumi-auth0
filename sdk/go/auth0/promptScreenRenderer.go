// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With this resource, you can Configure the render settings for a specific screen.You can read more about this.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal([]map[string]interface{}{
//				map[string]interface{}{
//					"attributes": map[string]interface{}{
//						"async": true,
//						"defer": true,
//						"integrity": []string{
//							"sha512-v2CJ7UaYy4JwqLDIrZUI/4hqeoQieOmAZNXBeQyjo21dadnwR+8ZaIJVT8EE2iyI61OV8e6M8PP2/4hpQINQ/g==",
//						},
//						"src": "https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js",
//					},
//					"tag": "script",
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = auth0.NewPromptScreenRenderer(ctx, "prompt_screen_renderer", &auth0.PromptScreenRendererArgs{
//				PromptType:              pulumi.String("login-id"),
//				ScreenName:              pulumi.String("login-id"),
//				RenderingMode:           pulumi.String("advanced"),
//				DefaultHeadTagsDisabled: pulumi.Bool(false),
//				ContextConfigurations: pulumi.StringArray{
//					pulumi.String("branding.settings"),
//					pulumi.String("branding.themes.default"),
//					pulumi.String("client.logo_uri"),
//					pulumi.String("client.description"),
//					pulumi.String("client.metadata.key"),
//					pulumi.String("organization.display_name"),
//					pulumi.String("organization.branding"),
//					pulumi.String("organization.metadata.key"),
//					pulumi.String("screen.texts"),
//					pulumi.String("tenant.name"),
//					pulumi.String("tenant.friendly_name"),
//					pulumi.String("tenant.enabled_locales"),
//					pulumi.String("untrusted_data.submitted_form_data"),
//					pulumi.String("untrusted_data.authorization_params.login_hint"),
//					pulumi.String("untrusted_data.authorization_params.screen_hint"),
//					pulumi.String("untrusted_data.authorization_params.ui_locales"),
//					pulumi.String("untrusted_data.authorization_params.ext-.key"),
//					pulumi.String("transaction.connection.metadata.key"),
//				},
//				HeadTags: pulumi.String(json0),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// This resource can be imported using the prompt name and screen_name.
//
// #
//
// As this is not a resource identifiable by an ID within the Auth0 Management API,
//
// login can be imported using the prompt name and screen name using the format:
//
// prompt_name:screen_name
//
// #
//
// Example:
//
// ```sh
// $ pulumi import auth0:index/promptScreenRenderer:PromptScreenRenderer auth0_prompt_screen_renderer "login-id:login-id"
// ```
type PromptScreenRenderer struct {
	pulumi.CustomResourceState

	// Context values to make available
	ContextConfigurations pulumi.StringArrayOutput `pulumi:"contextConfigurations"`
	// Override Universal Login default head tags
	DefaultHeadTagsDisabled pulumi.BoolPtrOutput `pulumi:"defaultHeadTagsDisabled"`
	// An array of head tags
	HeadTags pulumi.StringOutput `pulumi:"headTags"`
	// The prompt that you are configuring settings for. Options are: `signup-id`, `signup`, `signup-password`, `login`, `login-id`, `login-password`, `login-passwordless`, `login-email-verification`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `reset-password`, `custom-form`, `consent`, `customized-consent`, `logout`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`, `passkeys`, `captcha`.
	PromptType pulumi.StringOutput `pulumi:"promptType"`
	// Rendering modeOptions are: `standard`, `advanced`.
	RenderingMode pulumi.StringPtrOutput `pulumi:"renderingMode"`
	// The screen that you are configuring settings for. Options are: `login`, `login-id`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `login-passwordless-email-link`, `login-email-verification`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `reset-password-request`, `reset-password-email`, `reset-password`, `reset-password-success`, `reset-password-error`, `reset-password-mfa-email-challenge`, `reset-password-mfa-otp-challenge`, `reset-password-mfa-phone-challenge`, `reset-password-mfa-push-challenge-push`, `reset-password-mfa-recovery-code-challenge`, `reset-password-mfa-sms-challenge`, `reset-password-mfa-voice-challenge`, `reset-password-mfa-webauthn-platform-challenge`, `reset-password-mfa-webauthn-roaming-challenge`, `custom-form`, `consent`, `customized-consent`, `logout`, `logout-complete`, `logout-aborted`, `mfa-push-welcome`, `mfa-push-enrollment-qr`, `mfa-push-enrollment-code`, `mfa-push-success`, `mfa-push-challenge-push`, `mfa-push-list`, `mfa-otp-enrollment-qr`, `mfa-otp-enrollment-code`, `mfa-otp-challenge`, `mfa-voice-enrollment`, `mfa-voice-challenge`, `mfa-phone-challenge`, `mfa-phone-enrollment`, `mfa-webauthn-platform-enrollment`, `mfa-webauthn-roaming-enrollment`, `mfa-webauthn-platform-challenge`, `mfa-webauthn-roaming-challenge`, `mfa-webauthn-change-key-nickname`, `mfa-webauthn-enrollment-success`, `mfa-webauthn-error`, `mfa-webauthn-not-available-error`, `mfa-country-codes`, `mfa-sms-enrollment`, `mfa-sms-challenge`, `mfa-sms-list`, `mfa-email-challenge`, `mfa-email-list`, `mfa-recovery-code-enrollment`, `mfa-recovery-code-challenge`, `mfa-detect-browser-capabilities`, `mfa-enroll-result`, `mfa-login-options`, `mfa-begin-enroll-options`, `status`, `device-code-activation`, `device-code-activation-allowed`, `device-code-activation-denied`, `device-code-confirmation`, `email-verification-result`, `email-otp-challenge`, `organization-selection`, `organization-picker`, `accept-invitation`, `redeem-ticket`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`.
	ScreenName pulumi.StringOutput `pulumi:"screenName"`
	// Tenant ID
	Tenant pulumi.StringOutput `pulumi:"tenant"`
}

// NewPromptScreenRenderer registers a new resource with the given unique name, arguments, and options.
func NewPromptScreenRenderer(ctx *pulumi.Context,
	name string, args *PromptScreenRendererArgs, opts ...pulumi.ResourceOption) (*PromptScreenRenderer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PromptType == nil {
		return nil, errors.New("invalid value for required argument 'PromptType'")
	}
	if args.ScreenName == nil {
		return nil, errors.New("invalid value for required argument 'ScreenName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource PromptScreenRenderer
	err := ctx.RegisterResource("auth0:index/promptScreenRenderer:PromptScreenRenderer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPromptScreenRenderer gets an existing PromptScreenRenderer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPromptScreenRenderer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PromptScreenRendererState, opts ...pulumi.ResourceOption) (*PromptScreenRenderer, error) {
	var resource PromptScreenRenderer
	err := ctx.ReadResource("auth0:index/promptScreenRenderer:PromptScreenRenderer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PromptScreenRenderer resources.
type promptScreenRendererState struct {
	// Context values to make available
	ContextConfigurations []string `pulumi:"contextConfigurations"`
	// Override Universal Login default head tags
	DefaultHeadTagsDisabled *bool `pulumi:"defaultHeadTagsDisabled"`
	// An array of head tags
	HeadTags *string `pulumi:"headTags"`
	// The prompt that you are configuring settings for. Options are: `signup-id`, `signup`, `signup-password`, `login`, `login-id`, `login-password`, `login-passwordless`, `login-email-verification`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `reset-password`, `custom-form`, `consent`, `customized-consent`, `logout`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`, `passkeys`, `captcha`.
	PromptType *string `pulumi:"promptType"`
	// Rendering modeOptions are: `standard`, `advanced`.
	RenderingMode *string `pulumi:"renderingMode"`
	// The screen that you are configuring settings for. Options are: `login`, `login-id`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `login-passwordless-email-link`, `login-email-verification`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `reset-password-request`, `reset-password-email`, `reset-password`, `reset-password-success`, `reset-password-error`, `reset-password-mfa-email-challenge`, `reset-password-mfa-otp-challenge`, `reset-password-mfa-phone-challenge`, `reset-password-mfa-push-challenge-push`, `reset-password-mfa-recovery-code-challenge`, `reset-password-mfa-sms-challenge`, `reset-password-mfa-voice-challenge`, `reset-password-mfa-webauthn-platform-challenge`, `reset-password-mfa-webauthn-roaming-challenge`, `custom-form`, `consent`, `customized-consent`, `logout`, `logout-complete`, `logout-aborted`, `mfa-push-welcome`, `mfa-push-enrollment-qr`, `mfa-push-enrollment-code`, `mfa-push-success`, `mfa-push-challenge-push`, `mfa-push-list`, `mfa-otp-enrollment-qr`, `mfa-otp-enrollment-code`, `mfa-otp-challenge`, `mfa-voice-enrollment`, `mfa-voice-challenge`, `mfa-phone-challenge`, `mfa-phone-enrollment`, `mfa-webauthn-platform-enrollment`, `mfa-webauthn-roaming-enrollment`, `mfa-webauthn-platform-challenge`, `mfa-webauthn-roaming-challenge`, `mfa-webauthn-change-key-nickname`, `mfa-webauthn-enrollment-success`, `mfa-webauthn-error`, `mfa-webauthn-not-available-error`, `mfa-country-codes`, `mfa-sms-enrollment`, `mfa-sms-challenge`, `mfa-sms-list`, `mfa-email-challenge`, `mfa-email-list`, `mfa-recovery-code-enrollment`, `mfa-recovery-code-challenge`, `mfa-detect-browser-capabilities`, `mfa-enroll-result`, `mfa-login-options`, `mfa-begin-enroll-options`, `status`, `device-code-activation`, `device-code-activation-allowed`, `device-code-activation-denied`, `device-code-confirmation`, `email-verification-result`, `email-otp-challenge`, `organization-selection`, `organization-picker`, `accept-invitation`, `redeem-ticket`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`.
	ScreenName *string `pulumi:"screenName"`
	// Tenant ID
	Tenant *string `pulumi:"tenant"`
}

type PromptScreenRendererState struct {
	// Context values to make available
	ContextConfigurations pulumi.StringArrayInput
	// Override Universal Login default head tags
	DefaultHeadTagsDisabled pulumi.BoolPtrInput
	// An array of head tags
	HeadTags pulumi.StringPtrInput
	// The prompt that you are configuring settings for. Options are: `signup-id`, `signup`, `signup-password`, `login`, `login-id`, `login-password`, `login-passwordless`, `login-email-verification`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `reset-password`, `custom-form`, `consent`, `customized-consent`, `logout`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`, `passkeys`, `captcha`.
	PromptType pulumi.StringPtrInput
	// Rendering modeOptions are: `standard`, `advanced`.
	RenderingMode pulumi.StringPtrInput
	// The screen that you are configuring settings for. Options are: `login`, `login-id`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `login-passwordless-email-link`, `login-email-verification`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `reset-password-request`, `reset-password-email`, `reset-password`, `reset-password-success`, `reset-password-error`, `reset-password-mfa-email-challenge`, `reset-password-mfa-otp-challenge`, `reset-password-mfa-phone-challenge`, `reset-password-mfa-push-challenge-push`, `reset-password-mfa-recovery-code-challenge`, `reset-password-mfa-sms-challenge`, `reset-password-mfa-voice-challenge`, `reset-password-mfa-webauthn-platform-challenge`, `reset-password-mfa-webauthn-roaming-challenge`, `custom-form`, `consent`, `customized-consent`, `logout`, `logout-complete`, `logout-aborted`, `mfa-push-welcome`, `mfa-push-enrollment-qr`, `mfa-push-enrollment-code`, `mfa-push-success`, `mfa-push-challenge-push`, `mfa-push-list`, `mfa-otp-enrollment-qr`, `mfa-otp-enrollment-code`, `mfa-otp-challenge`, `mfa-voice-enrollment`, `mfa-voice-challenge`, `mfa-phone-challenge`, `mfa-phone-enrollment`, `mfa-webauthn-platform-enrollment`, `mfa-webauthn-roaming-enrollment`, `mfa-webauthn-platform-challenge`, `mfa-webauthn-roaming-challenge`, `mfa-webauthn-change-key-nickname`, `mfa-webauthn-enrollment-success`, `mfa-webauthn-error`, `mfa-webauthn-not-available-error`, `mfa-country-codes`, `mfa-sms-enrollment`, `mfa-sms-challenge`, `mfa-sms-list`, `mfa-email-challenge`, `mfa-email-list`, `mfa-recovery-code-enrollment`, `mfa-recovery-code-challenge`, `mfa-detect-browser-capabilities`, `mfa-enroll-result`, `mfa-login-options`, `mfa-begin-enroll-options`, `status`, `device-code-activation`, `device-code-activation-allowed`, `device-code-activation-denied`, `device-code-confirmation`, `email-verification-result`, `email-otp-challenge`, `organization-selection`, `organization-picker`, `accept-invitation`, `redeem-ticket`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`.
	ScreenName pulumi.StringPtrInput
	// Tenant ID
	Tenant pulumi.StringPtrInput
}

func (PromptScreenRendererState) ElementType() reflect.Type {
	return reflect.TypeOf((*promptScreenRendererState)(nil)).Elem()
}

type promptScreenRendererArgs struct {
	// Context values to make available
	ContextConfigurations []string `pulumi:"contextConfigurations"`
	// Override Universal Login default head tags
	DefaultHeadTagsDisabled *bool `pulumi:"defaultHeadTagsDisabled"`
	// An array of head tags
	HeadTags *string `pulumi:"headTags"`
	// The prompt that you are configuring settings for. Options are: `signup-id`, `signup`, `signup-password`, `login`, `login-id`, `login-password`, `login-passwordless`, `login-email-verification`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `reset-password`, `custom-form`, `consent`, `customized-consent`, `logout`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`, `passkeys`, `captcha`.
	PromptType string `pulumi:"promptType"`
	// Rendering modeOptions are: `standard`, `advanced`.
	RenderingMode *string `pulumi:"renderingMode"`
	// The screen that you are configuring settings for. Options are: `login`, `login-id`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `login-passwordless-email-link`, `login-email-verification`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `reset-password-request`, `reset-password-email`, `reset-password`, `reset-password-success`, `reset-password-error`, `reset-password-mfa-email-challenge`, `reset-password-mfa-otp-challenge`, `reset-password-mfa-phone-challenge`, `reset-password-mfa-push-challenge-push`, `reset-password-mfa-recovery-code-challenge`, `reset-password-mfa-sms-challenge`, `reset-password-mfa-voice-challenge`, `reset-password-mfa-webauthn-platform-challenge`, `reset-password-mfa-webauthn-roaming-challenge`, `custom-form`, `consent`, `customized-consent`, `logout`, `logout-complete`, `logout-aborted`, `mfa-push-welcome`, `mfa-push-enrollment-qr`, `mfa-push-enrollment-code`, `mfa-push-success`, `mfa-push-challenge-push`, `mfa-push-list`, `mfa-otp-enrollment-qr`, `mfa-otp-enrollment-code`, `mfa-otp-challenge`, `mfa-voice-enrollment`, `mfa-voice-challenge`, `mfa-phone-challenge`, `mfa-phone-enrollment`, `mfa-webauthn-platform-enrollment`, `mfa-webauthn-roaming-enrollment`, `mfa-webauthn-platform-challenge`, `mfa-webauthn-roaming-challenge`, `mfa-webauthn-change-key-nickname`, `mfa-webauthn-enrollment-success`, `mfa-webauthn-error`, `mfa-webauthn-not-available-error`, `mfa-country-codes`, `mfa-sms-enrollment`, `mfa-sms-challenge`, `mfa-sms-list`, `mfa-email-challenge`, `mfa-email-list`, `mfa-recovery-code-enrollment`, `mfa-recovery-code-challenge`, `mfa-detect-browser-capabilities`, `mfa-enroll-result`, `mfa-login-options`, `mfa-begin-enroll-options`, `status`, `device-code-activation`, `device-code-activation-allowed`, `device-code-activation-denied`, `device-code-confirmation`, `email-verification-result`, `email-otp-challenge`, `organization-selection`, `organization-picker`, `accept-invitation`, `redeem-ticket`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`.
	ScreenName string `pulumi:"screenName"`
}

// The set of arguments for constructing a PromptScreenRenderer resource.
type PromptScreenRendererArgs struct {
	// Context values to make available
	ContextConfigurations pulumi.StringArrayInput
	// Override Universal Login default head tags
	DefaultHeadTagsDisabled pulumi.BoolPtrInput
	// An array of head tags
	HeadTags pulumi.StringPtrInput
	// The prompt that you are configuring settings for. Options are: `signup-id`, `signup`, `signup-password`, `login`, `login-id`, `login-password`, `login-passwordless`, `login-email-verification`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `reset-password`, `custom-form`, `consent`, `customized-consent`, `logout`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`, `passkeys`, `captcha`.
	PromptType pulumi.StringInput
	// Rendering modeOptions are: `standard`, `advanced`.
	RenderingMode pulumi.StringPtrInput
	// The screen that you are configuring settings for. Options are: `login`, `login-id`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `login-passwordless-email-link`, `login-email-verification`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `reset-password-request`, `reset-password-email`, `reset-password`, `reset-password-success`, `reset-password-error`, `reset-password-mfa-email-challenge`, `reset-password-mfa-otp-challenge`, `reset-password-mfa-phone-challenge`, `reset-password-mfa-push-challenge-push`, `reset-password-mfa-recovery-code-challenge`, `reset-password-mfa-sms-challenge`, `reset-password-mfa-voice-challenge`, `reset-password-mfa-webauthn-platform-challenge`, `reset-password-mfa-webauthn-roaming-challenge`, `custom-form`, `consent`, `customized-consent`, `logout`, `logout-complete`, `logout-aborted`, `mfa-push-welcome`, `mfa-push-enrollment-qr`, `mfa-push-enrollment-code`, `mfa-push-success`, `mfa-push-challenge-push`, `mfa-push-list`, `mfa-otp-enrollment-qr`, `mfa-otp-enrollment-code`, `mfa-otp-challenge`, `mfa-voice-enrollment`, `mfa-voice-challenge`, `mfa-phone-challenge`, `mfa-phone-enrollment`, `mfa-webauthn-platform-enrollment`, `mfa-webauthn-roaming-enrollment`, `mfa-webauthn-platform-challenge`, `mfa-webauthn-roaming-challenge`, `mfa-webauthn-change-key-nickname`, `mfa-webauthn-enrollment-success`, `mfa-webauthn-error`, `mfa-webauthn-not-available-error`, `mfa-country-codes`, `mfa-sms-enrollment`, `mfa-sms-challenge`, `mfa-sms-list`, `mfa-email-challenge`, `mfa-email-list`, `mfa-recovery-code-enrollment`, `mfa-recovery-code-challenge`, `mfa-detect-browser-capabilities`, `mfa-enroll-result`, `mfa-login-options`, `mfa-begin-enroll-options`, `status`, `device-code-activation`, `device-code-activation-allowed`, `device-code-activation-denied`, `device-code-confirmation`, `email-verification-result`, `email-otp-challenge`, `organization-selection`, `organization-picker`, `accept-invitation`, `redeem-ticket`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`.
	ScreenName pulumi.StringInput
}

func (PromptScreenRendererArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*promptScreenRendererArgs)(nil)).Elem()
}

type PromptScreenRendererInput interface {
	pulumi.Input

	ToPromptScreenRendererOutput() PromptScreenRendererOutput
	ToPromptScreenRendererOutputWithContext(ctx context.Context) PromptScreenRendererOutput
}

func (*PromptScreenRenderer) ElementType() reflect.Type {
	return reflect.TypeOf((**PromptScreenRenderer)(nil)).Elem()
}

func (i *PromptScreenRenderer) ToPromptScreenRendererOutput() PromptScreenRendererOutput {
	return i.ToPromptScreenRendererOutputWithContext(context.Background())
}

func (i *PromptScreenRenderer) ToPromptScreenRendererOutputWithContext(ctx context.Context) PromptScreenRendererOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PromptScreenRendererOutput)
}

// PromptScreenRendererArrayInput is an input type that accepts PromptScreenRendererArray and PromptScreenRendererArrayOutput values.
// You can construct a concrete instance of `PromptScreenRendererArrayInput` via:
//
//	PromptScreenRendererArray{ PromptScreenRendererArgs{...} }
type PromptScreenRendererArrayInput interface {
	pulumi.Input

	ToPromptScreenRendererArrayOutput() PromptScreenRendererArrayOutput
	ToPromptScreenRendererArrayOutputWithContext(context.Context) PromptScreenRendererArrayOutput
}

type PromptScreenRendererArray []PromptScreenRendererInput

func (PromptScreenRendererArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PromptScreenRenderer)(nil)).Elem()
}

func (i PromptScreenRendererArray) ToPromptScreenRendererArrayOutput() PromptScreenRendererArrayOutput {
	return i.ToPromptScreenRendererArrayOutputWithContext(context.Background())
}

func (i PromptScreenRendererArray) ToPromptScreenRendererArrayOutputWithContext(ctx context.Context) PromptScreenRendererArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PromptScreenRendererArrayOutput)
}

// PromptScreenRendererMapInput is an input type that accepts PromptScreenRendererMap and PromptScreenRendererMapOutput values.
// You can construct a concrete instance of `PromptScreenRendererMapInput` via:
//
//	PromptScreenRendererMap{ "key": PromptScreenRendererArgs{...} }
type PromptScreenRendererMapInput interface {
	pulumi.Input

	ToPromptScreenRendererMapOutput() PromptScreenRendererMapOutput
	ToPromptScreenRendererMapOutputWithContext(context.Context) PromptScreenRendererMapOutput
}

type PromptScreenRendererMap map[string]PromptScreenRendererInput

func (PromptScreenRendererMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PromptScreenRenderer)(nil)).Elem()
}

func (i PromptScreenRendererMap) ToPromptScreenRendererMapOutput() PromptScreenRendererMapOutput {
	return i.ToPromptScreenRendererMapOutputWithContext(context.Background())
}

func (i PromptScreenRendererMap) ToPromptScreenRendererMapOutputWithContext(ctx context.Context) PromptScreenRendererMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PromptScreenRendererMapOutput)
}

type PromptScreenRendererOutput struct{ *pulumi.OutputState }

func (PromptScreenRendererOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PromptScreenRenderer)(nil)).Elem()
}

func (o PromptScreenRendererOutput) ToPromptScreenRendererOutput() PromptScreenRendererOutput {
	return o
}

func (o PromptScreenRendererOutput) ToPromptScreenRendererOutputWithContext(ctx context.Context) PromptScreenRendererOutput {
	return o
}

// Context values to make available
func (o PromptScreenRendererOutput) ContextConfigurations() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PromptScreenRenderer) pulumi.StringArrayOutput { return v.ContextConfigurations }).(pulumi.StringArrayOutput)
}

// Override Universal Login default head tags
func (o PromptScreenRendererOutput) DefaultHeadTagsDisabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *PromptScreenRenderer) pulumi.BoolPtrOutput { return v.DefaultHeadTagsDisabled }).(pulumi.BoolPtrOutput)
}

// An array of head tags
func (o PromptScreenRendererOutput) HeadTags() pulumi.StringOutput {
	return o.ApplyT(func(v *PromptScreenRenderer) pulumi.StringOutput { return v.HeadTags }).(pulumi.StringOutput)
}

// The prompt that you are configuring settings for. Options are: `signup-id`, `signup`, `signup-password`, `login`, `login-id`, `login-password`, `login-passwordless`, `login-email-verification`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `reset-password`, `custom-form`, `consent`, `customized-consent`, `logout`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`, `passkeys`, `captcha`.
func (o PromptScreenRendererOutput) PromptType() pulumi.StringOutput {
	return o.ApplyT(func(v *PromptScreenRenderer) pulumi.StringOutput { return v.PromptType }).(pulumi.StringOutput)
}

// Rendering modeOptions are: `standard`, `advanced`.
func (o PromptScreenRendererOutput) RenderingMode() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PromptScreenRenderer) pulumi.StringPtrOutput { return v.RenderingMode }).(pulumi.StringPtrOutput)
}

// The screen that you are configuring settings for. Options are: `login`, `login-id`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `login-passwordless-email-link`, `login-email-verification`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `reset-password-request`, `reset-password-email`, `reset-password`, `reset-password-success`, `reset-password-error`, `reset-password-mfa-email-challenge`, `reset-password-mfa-otp-challenge`, `reset-password-mfa-phone-challenge`, `reset-password-mfa-push-challenge-push`, `reset-password-mfa-recovery-code-challenge`, `reset-password-mfa-sms-challenge`, `reset-password-mfa-voice-challenge`, `reset-password-mfa-webauthn-platform-challenge`, `reset-password-mfa-webauthn-roaming-challenge`, `custom-form`, `consent`, `customized-consent`, `logout`, `logout-complete`, `logout-aborted`, `mfa-push-welcome`, `mfa-push-enrollment-qr`, `mfa-push-enrollment-code`, `mfa-push-success`, `mfa-push-challenge-push`, `mfa-push-list`, `mfa-otp-enrollment-qr`, `mfa-otp-enrollment-code`, `mfa-otp-challenge`, `mfa-voice-enrollment`, `mfa-voice-challenge`, `mfa-phone-challenge`, `mfa-phone-enrollment`, `mfa-webauthn-platform-enrollment`, `mfa-webauthn-roaming-enrollment`, `mfa-webauthn-platform-challenge`, `mfa-webauthn-roaming-challenge`, `mfa-webauthn-change-key-nickname`, `mfa-webauthn-enrollment-success`, `mfa-webauthn-error`, `mfa-webauthn-not-available-error`, `mfa-country-codes`, `mfa-sms-enrollment`, `mfa-sms-challenge`, `mfa-sms-list`, `mfa-email-challenge`, `mfa-email-list`, `mfa-recovery-code-enrollment`, `mfa-recovery-code-challenge`, `mfa-detect-browser-capabilities`, `mfa-enroll-result`, `mfa-login-options`, `mfa-begin-enroll-options`, `status`, `device-code-activation`, `device-code-activation-allowed`, `device-code-activation-denied`, `device-code-confirmation`, `email-verification-result`, `email-otp-challenge`, `organization-selection`, `organization-picker`, `accept-invitation`, `redeem-ticket`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`.
func (o PromptScreenRendererOutput) ScreenName() pulumi.StringOutput {
	return o.ApplyT(func(v *PromptScreenRenderer) pulumi.StringOutput { return v.ScreenName }).(pulumi.StringOutput)
}

// Tenant ID
func (o PromptScreenRendererOutput) Tenant() pulumi.StringOutput {
	return o.ApplyT(func(v *PromptScreenRenderer) pulumi.StringOutput { return v.Tenant }).(pulumi.StringOutput)
}

type PromptScreenRendererArrayOutput struct{ *pulumi.OutputState }

func (PromptScreenRendererArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PromptScreenRenderer)(nil)).Elem()
}

func (o PromptScreenRendererArrayOutput) ToPromptScreenRendererArrayOutput() PromptScreenRendererArrayOutput {
	return o
}

func (o PromptScreenRendererArrayOutput) ToPromptScreenRendererArrayOutputWithContext(ctx context.Context) PromptScreenRendererArrayOutput {
	return o
}

func (o PromptScreenRendererArrayOutput) Index(i pulumi.IntInput) PromptScreenRendererOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PromptScreenRenderer {
		return vs[0].([]*PromptScreenRenderer)[vs[1].(int)]
	}).(PromptScreenRendererOutput)
}

type PromptScreenRendererMapOutput struct{ *pulumi.OutputState }

func (PromptScreenRendererMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PromptScreenRenderer)(nil)).Elem()
}

func (o PromptScreenRendererMapOutput) ToPromptScreenRendererMapOutput() PromptScreenRendererMapOutput {
	return o
}

func (o PromptScreenRendererMapOutput) ToPromptScreenRendererMapOutputWithContext(ctx context.Context) PromptScreenRendererMapOutput {
	return o
}

func (o PromptScreenRendererMapOutput) MapIndex(k pulumi.StringInput) PromptScreenRendererOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PromptScreenRenderer {
		return vs[0].(map[string]*PromptScreenRenderer)[vs[1].(string)]
	}).(PromptScreenRendererOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PromptScreenRendererInput)(nil)).Elem(), &PromptScreenRenderer{})
	pulumi.RegisterInputType(reflect.TypeOf((*PromptScreenRendererArrayInput)(nil)).Elem(), PromptScreenRendererArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PromptScreenRendererMapInput)(nil)).Elem(), PromptScreenRendererMap{})
	pulumi.RegisterOutputType(PromptScreenRendererOutput{})
	pulumi.RegisterOutputType(PromptScreenRendererArrayOutput{})
	pulumi.RegisterOutputType(PromptScreenRendererMapOutput{})
}
