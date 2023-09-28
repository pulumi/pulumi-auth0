// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// With Auth0, you can have standard welcome, password reset, and account verification email-based workflows built right into Auth0. This resource allows you to configure email templates to customize the look, feel, and sender identities of emails sent by Auth0. Used in conjunction with configured email providers.
//
// ## Import
//
// This resource can be imported using the pre-defined template name. # These names are `verify_email`, `verify_email_by_code`, `reset_email`, `welcome_email`, `blocked_account`, `stolen_credentials`, `enrollment_email`, `mfa_oob_code`, and `user_invitation`. # The names `change_password`, and `password_reset` are also supported for legacy scenarios. # Example
//
// ```sh
//
//	$ pulumi import auth0:index/emailTemplate:EmailTemplate my_email_template "welcome_email"
//
// ```
type EmailTemplate struct {
	pulumi.CustomResourceState

	// Body of the email template. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
	Body pulumi.StringOutput `pulumi:"body"`
	// Indicates whether the template is enabled.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// Email address to use as the sender. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
	From pulumi.StringOutput `pulumi:"from"`
	// Whether the `resetEmail` and `verifyEmail` templates should include the user's email address as the email parameter in the `returnUrl` (true) or whether no email address should be included in the redirect (false). Defaults to `true`.
	IncludeEmailInRedirect pulumi.BoolOutput `pulumi:"includeEmailInRedirect"`
	// URL to redirect the user to after a successful action. [Learn more](https://auth0.com/docs/customize/email/email-templates#configure-template-fields).
	ResultUrl pulumi.StringPtrOutput `pulumi:"resultUrl"`
	// Subject line of the email. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
	Subject pulumi.StringOutput `pulumi:"subject"`
	// Syntax of the template body. You can use either text or HTML with Liquid syntax.
	Syntax pulumi.StringOutput `pulumi:"syntax"`
	// Template name. Options include `verifyEmail`, `verifyEmailByCode`, `resetEmail`, `welcomeEmail`, `blockedAccount`, `stolenCredentials`, `enrollmentEmail`, `mfaOobCode`, `userInvitation`, `changePassword` (legacy), or `passwordReset` (legacy).
	Template pulumi.StringOutput `pulumi:"template"`
	// Number of seconds during which the link within the email will be valid.
	UrlLifetimeInSeconds pulumi.IntPtrOutput `pulumi:"urlLifetimeInSeconds"`
}

// NewEmailTemplate registers a new resource with the given unique name, arguments, and options.
func NewEmailTemplate(ctx *pulumi.Context,
	name string, args *EmailTemplateArgs, opts ...pulumi.ResourceOption) (*EmailTemplate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Body == nil {
		return nil, errors.New("invalid value for required argument 'Body'")
	}
	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.From == nil {
		return nil, errors.New("invalid value for required argument 'From'")
	}
	if args.Subject == nil {
		return nil, errors.New("invalid value for required argument 'Subject'")
	}
	if args.Syntax == nil {
		return nil, errors.New("invalid value for required argument 'Syntax'")
	}
	if args.Template == nil {
		return nil, errors.New("invalid value for required argument 'Template'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EmailTemplate
	err := ctx.RegisterResource("auth0:index/emailTemplate:EmailTemplate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEmailTemplate gets an existing EmailTemplate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEmailTemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EmailTemplateState, opts ...pulumi.ResourceOption) (*EmailTemplate, error) {
	var resource EmailTemplate
	err := ctx.ReadResource("auth0:index/emailTemplate:EmailTemplate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EmailTemplate resources.
type emailTemplateState struct {
	// Body of the email template. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
	Body *string `pulumi:"body"`
	// Indicates whether the template is enabled.
	Enabled *bool `pulumi:"enabled"`
	// Email address to use as the sender. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
	From *string `pulumi:"from"`
	// Whether the `resetEmail` and `verifyEmail` templates should include the user's email address as the email parameter in the `returnUrl` (true) or whether no email address should be included in the redirect (false). Defaults to `true`.
	IncludeEmailInRedirect *bool `pulumi:"includeEmailInRedirect"`
	// URL to redirect the user to after a successful action. [Learn more](https://auth0.com/docs/customize/email/email-templates#configure-template-fields).
	ResultUrl *string `pulumi:"resultUrl"`
	// Subject line of the email. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
	Subject *string `pulumi:"subject"`
	// Syntax of the template body. You can use either text or HTML with Liquid syntax.
	Syntax *string `pulumi:"syntax"`
	// Template name. Options include `verifyEmail`, `verifyEmailByCode`, `resetEmail`, `welcomeEmail`, `blockedAccount`, `stolenCredentials`, `enrollmentEmail`, `mfaOobCode`, `userInvitation`, `changePassword` (legacy), or `passwordReset` (legacy).
	Template *string `pulumi:"template"`
	// Number of seconds during which the link within the email will be valid.
	UrlLifetimeInSeconds *int `pulumi:"urlLifetimeInSeconds"`
}

type EmailTemplateState struct {
	// Body of the email template. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
	Body pulumi.StringPtrInput
	// Indicates whether the template is enabled.
	Enabled pulumi.BoolPtrInput
	// Email address to use as the sender. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
	From pulumi.StringPtrInput
	// Whether the `resetEmail` and `verifyEmail` templates should include the user's email address as the email parameter in the `returnUrl` (true) or whether no email address should be included in the redirect (false). Defaults to `true`.
	IncludeEmailInRedirect pulumi.BoolPtrInput
	// URL to redirect the user to after a successful action. [Learn more](https://auth0.com/docs/customize/email/email-templates#configure-template-fields).
	ResultUrl pulumi.StringPtrInput
	// Subject line of the email. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
	Subject pulumi.StringPtrInput
	// Syntax of the template body. You can use either text or HTML with Liquid syntax.
	Syntax pulumi.StringPtrInput
	// Template name. Options include `verifyEmail`, `verifyEmailByCode`, `resetEmail`, `welcomeEmail`, `blockedAccount`, `stolenCredentials`, `enrollmentEmail`, `mfaOobCode`, `userInvitation`, `changePassword` (legacy), or `passwordReset` (legacy).
	Template pulumi.StringPtrInput
	// Number of seconds during which the link within the email will be valid.
	UrlLifetimeInSeconds pulumi.IntPtrInput
}

func (EmailTemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*emailTemplateState)(nil)).Elem()
}

type emailTemplateArgs struct {
	// Body of the email template. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
	Body string `pulumi:"body"`
	// Indicates whether the template is enabled.
	Enabled bool `pulumi:"enabled"`
	// Email address to use as the sender. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
	From string `pulumi:"from"`
	// Whether the `resetEmail` and `verifyEmail` templates should include the user's email address as the email parameter in the `returnUrl` (true) or whether no email address should be included in the redirect (false). Defaults to `true`.
	IncludeEmailInRedirect *bool `pulumi:"includeEmailInRedirect"`
	// URL to redirect the user to after a successful action. [Learn more](https://auth0.com/docs/customize/email/email-templates#configure-template-fields).
	ResultUrl *string `pulumi:"resultUrl"`
	// Subject line of the email. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
	Subject string `pulumi:"subject"`
	// Syntax of the template body. You can use either text or HTML with Liquid syntax.
	Syntax string `pulumi:"syntax"`
	// Template name. Options include `verifyEmail`, `verifyEmailByCode`, `resetEmail`, `welcomeEmail`, `blockedAccount`, `stolenCredentials`, `enrollmentEmail`, `mfaOobCode`, `userInvitation`, `changePassword` (legacy), or `passwordReset` (legacy).
	Template string `pulumi:"template"`
	// Number of seconds during which the link within the email will be valid.
	UrlLifetimeInSeconds *int `pulumi:"urlLifetimeInSeconds"`
}

// The set of arguments for constructing a EmailTemplate resource.
type EmailTemplateArgs struct {
	// Body of the email template. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
	Body pulumi.StringInput
	// Indicates whether the template is enabled.
	Enabled pulumi.BoolInput
	// Email address to use as the sender. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
	From pulumi.StringInput
	// Whether the `resetEmail` and `verifyEmail` templates should include the user's email address as the email parameter in the `returnUrl` (true) or whether no email address should be included in the redirect (false). Defaults to `true`.
	IncludeEmailInRedirect pulumi.BoolPtrInput
	// URL to redirect the user to after a successful action. [Learn more](https://auth0.com/docs/customize/email/email-templates#configure-template-fields).
	ResultUrl pulumi.StringPtrInput
	// Subject line of the email. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
	Subject pulumi.StringInput
	// Syntax of the template body. You can use either text or HTML with Liquid syntax.
	Syntax pulumi.StringInput
	// Template name. Options include `verifyEmail`, `verifyEmailByCode`, `resetEmail`, `welcomeEmail`, `blockedAccount`, `stolenCredentials`, `enrollmentEmail`, `mfaOobCode`, `userInvitation`, `changePassword` (legacy), or `passwordReset` (legacy).
	Template pulumi.StringInput
	// Number of seconds during which the link within the email will be valid.
	UrlLifetimeInSeconds pulumi.IntPtrInput
}

func (EmailTemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*emailTemplateArgs)(nil)).Elem()
}

type EmailTemplateInput interface {
	pulumi.Input

	ToEmailTemplateOutput() EmailTemplateOutput
	ToEmailTemplateOutputWithContext(ctx context.Context) EmailTemplateOutput
}

func (*EmailTemplate) ElementType() reflect.Type {
	return reflect.TypeOf((**EmailTemplate)(nil)).Elem()
}

func (i *EmailTemplate) ToEmailTemplateOutput() EmailTemplateOutput {
	return i.ToEmailTemplateOutputWithContext(context.Background())
}

func (i *EmailTemplate) ToEmailTemplateOutputWithContext(ctx context.Context) EmailTemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailTemplateOutput)
}

func (i *EmailTemplate) ToOutput(ctx context.Context) pulumix.Output[*EmailTemplate] {
	return pulumix.Output[*EmailTemplate]{
		OutputState: i.ToEmailTemplateOutputWithContext(ctx).OutputState,
	}
}

// EmailTemplateArrayInput is an input type that accepts EmailTemplateArray and EmailTemplateArrayOutput values.
// You can construct a concrete instance of `EmailTemplateArrayInput` via:
//
//	EmailTemplateArray{ EmailTemplateArgs{...} }
type EmailTemplateArrayInput interface {
	pulumi.Input

	ToEmailTemplateArrayOutput() EmailTemplateArrayOutput
	ToEmailTemplateArrayOutputWithContext(context.Context) EmailTemplateArrayOutput
}

type EmailTemplateArray []EmailTemplateInput

func (EmailTemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EmailTemplate)(nil)).Elem()
}

func (i EmailTemplateArray) ToEmailTemplateArrayOutput() EmailTemplateArrayOutput {
	return i.ToEmailTemplateArrayOutputWithContext(context.Background())
}

func (i EmailTemplateArray) ToEmailTemplateArrayOutputWithContext(ctx context.Context) EmailTemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailTemplateArrayOutput)
}

func (i EmailTemplateArray) ToOutput(ctx context.Context) pulumix.Output[[]*EmailTemplate] {
	return pulumix.Output[[]*EmailTemplate]{
		OutputState: i.ToEmailTemplateArrayOutputWithContext(ctx).OutputState,
	}
}

// EmailTemplateMapInput is an input type that accepts EmailTemplateMap and EmailTemplateMapOutput values.
// You can construct a concrete instance of `EmailTemplateMapInput` via:
//
//	EmailTemplateMap{ "key": EmailTemplateArgs{...} }
type EmailTemplateMapInput interface {
	pulumi.Input

	ToEmailTemplateMapOutput() EmailTemplateMapOutput
	ToEmailTemplateMapOutputWithContext(context.Context) EmailTemplateMapOutput
}

type EmailTemplateMap map[string]EmailTemplateInput

func (EmailTemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EmailTemplate)(nil)).Elem()
}

func (i EmailTemplateMap) ToEmailTemplateMapOutput() EmailTemplateMapOutput {
	return i.ToEmailTemplateMapOutputWithContext(context.Background())
}

func (i EmailTemplateMap) ToEmailTemplateMapOutputWithContext(ctx context.Context) EmailTemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailTemplateMapOutput)
}

func (i EmailTemplateMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*EmailTemplate] {
	return pulumix.Output[map[string]*EmailTemplate]{
		OutputState: i.ToEmailTemplateMapOutputWithContext(ctx).OutputState,
	}
}

type EmailTemplateOutput struct{ *pulumi.OutputState }

func (EmailTemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EmailTemplate)(nil)).Elem()
}

func (o EmailTemplateOutput) ToEmailTemplateOutput() EmailTemplateOutput {
	return o
}

func (o EmailTemplateOutput) ToEmailTemplateOutputWithContext(ctx context.Context) EmailTemplateOutput {
	return o
}

func (o EmailTemplateOutput) ToOutput(ctx context.Context) pulumix.Output[*EmailTemplate] {
	return pulumix.Output[*EmailTemplate]{
		OutputState: o.OutputState,
	}
}

// Body of the email template. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
func (o EmailTemplateOutput) Body() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailTemplate) pulumi.StringOutput { return v.Body }).(pulumi.StringOutput)
}

// Indicates whether the template is enabled.
func (o EmailTemplateOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *EmailTemplate) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// Email address to use as the sender. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
func (o EmailTemplateOutput) From() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailTemplate) pulumi.StringOutput { return v.From }).(pulumi.StringOutput)
}

// Whether the `resetEmail` and `verifyEmail` templates should include the user's email address as the email parameter in the `returnUrl` (true) or whether no email address should be included in the redirect (false). Defaults to `true`.
func (o EmailTemplateOutput) IncludeEmailInRedirect() pulumi.BoolOutput {
	return o.ApplyT(func(v *EmailTemplate) pulumi.BoolOutput { return v.IncludeEmailInRedirect }).(pulumi.BoolOutput)
}

// URL to redirect the user to after a successful action. [Learn more](https://auth0.com/docs/customize/email/email-templates#configure-template-fields).
func (o EmailTemplateOutput) ResultUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EmailTemplate) pulumi.StringPtrOutput { return v.ResultUrl }).(pulumi.StringPtrOutput)
}

// Subject line of the email. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
func (o EmailTemplateOutput) Subject() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailTemplate) pulumi.StringOutput { return v.Subject }).(pulumi.StringOutput)
}

// Syntax of the template body. You can use either text or HTML with Liquid syntax.
func (o EmailTemplateOutput) Syntax() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailTemplate) pulumi.StringOutput { return v.Syntax }).(pulumi.StringOutput)
}

// Template name. Options include `verifyEmail`, `verifyEmailByCode`, `resetEmail`, `welcomeEmail`, `blockedAccount`, `stolenCredentials`, `enrollmentEmail`, `mfaOobCode`, `userInvitation`, `changePassword` (legacy), or `passwordReset` (legacy).
func (o EmailTemplateOutput) Template() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailTemplate) pulumi.StringOutput { return v.Template }).(pulumi.StringOutput)
}

// Number of seconds during which the link within the email will be valid.
func (o EmailTemplateOutput) UrlLifetimeInSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *EmailTemplate) pulumi.IntPtrOutput { return v.UrlLifetimeInSeconds }).(pulumi.IntPtrOutput)
}

type EmailTemplateArrayOutput struct{ *pulumi.OutputState }

func (EmailTemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EmailTemplate)(nil)).Elem()
}

func (o EmailTemplateArrayOutput) ToEmailTemplateArrayOutput() EmailTemplateArrayOutput {
	return o
}

func (o EmailTemplateArrayOutput) ToEmailTemplateArrayOutputWithContext(ctx context.Context) EmailTemplateArrayOutput {
	return o
}

func (o EmailTemplateArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*EmailTemplate] {
	return pulumix.Output[[]*EmailTemplate]{
		OutputState: o.OutputState,
	}
}

func (o EmailTemplateArrayOutput) Index(i pulumi.IntInput) EmailTemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EmailTemplate {
		return vs[0].([]*EmailTemplate)[vs[1].(int)]
	}).(EmailTemplateOutput)
}

type EmailTemplateMapOutput struct{ *pulumi.OutputState }

func (EmailTemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EmailTemplate)(nil)).Elem()
}

func (o EmailTemplateMapOutput) ToEmailTemplateMapOutput() EmailTemplateMapOutput {
	return o
}

func (o EmailTemplateMapOutput) ToEmailTemplateMapOutputWithContext(ctx context.Context) EmailTemplateMapOutput {
	return o
}

func (o EmailTemplateMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*EmailTemplate] {
	return pulumix.Output[map[string]*EmailTemplate]{
		OutputState: o.OutputState,
	}
}

func (o EmailTemplateMapOutput) MapIndex(k pulumi.StringInput) EmailTemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EmailTemplate {
		return vs[0].(map[string]*EmailTemplate)[vs[1].(string)]
	}).(EmailTemplateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EmailTemplateInput)(nil)).Elem(), &EmailTemplate{})
	pulumi.RegisterInputType(reflect.TypeOf((*EmailTemplateArrayInput)(nil)).Elem(), EmailTemplateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EmailTemplateMapInput)(nil)).Elem(), EmailTemplateMap{})
	pulumi.RegisterOutputType(EmailTemplateOutput{})
	pulumi.RegisterOutputType(EmailTemplateArrayOutput{})
	pulumi.RegisterOutputType(EmailTemplateMapOutput{})
}
