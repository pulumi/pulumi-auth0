// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With this resource, you can manage Auth0 tenants, including setting logos and support contact information, setting error
// pages, and configuring default tenant behaviors.
//
// > Auth0 does not currently support creating tenants through the Management API. Therefore, this resource can only
// manage an existing tenant created through the Auth0 dashboard.
//
// Auth0 does not currently support adding/removing extensions on tenants through their API. The Auth0 dashboard must be
// used to add/remove extensions.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"io/ioutil"
//
//	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func readFileOrPanic(path string) pulumi.StringPtrInput {
//		data, err := ioutil.ReadFile(path)
//		if err != nil {
//			panic(err.Error())
//		}
//		return pulumi.String(string(data))
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := auth0.NewTenant(ctx, "tenant", &auth0.TenantArgs{
//				ChangePassword: &TenantChangePasswordArgs{
//					Enabled: pulumi.Bool(true),
//					Html:    readFileOrPanic("./password_reset.html"),
//				},
//				GuardianMfaPage: &TenantGuardianMfaPageArgs{
//					Enabled: pulumi.Bool(true),
//					Html:    readFileOrPanic("./guardian_multifactor.html"),
//				},
//				DefaultAudience:  pulumi.String("<client_id>"),
//				DefaultDirectory: pulumi.String("Connection-Name"),
//				ErrorPage: &TenantErrorPageArgs{
//					Html:        readFileOrPanic("./error.html"),
//					ShowLogLink: pulumi.Bool(true),
//					Url:         pulumi.String("http://mysite/errors"),
//				},
//				FriendlyName: pulumi.String("Tenant Name"),
//				PictureUrl:   pulumi.String("http://mysite/logo.png"),
//				SupportEmail: pulumi.String("support@mysite"),
//				SupportUrl:   pulumi.String("http://mysite/support"),
//				AllowedLogoutUrls: pulumi.StringArray{
//					pulumi.String("http://mysite/logout"),
//				},
//				SessionLifetime: pulumi.Float64(46000),
//				SandboxVersion:  pulumi.String("8"),
//				SessionCookie: &TenantSessionCookieArgs{
//					Mode: pulumi.String("non-persistent"),
//				},
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
// As this is not a resource identifiable by an ID within the Auth0 Management API, tenant can be imported using a random string. We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4) e.g.
//
// ```sh
//
//	$ pulumi import auth0:index/tenant:Tenant tenant 82f4f21b-017a-319d-92e7-2291c1ca36c4
//
// ```
type Tenant struct {
	pulumi.CustomResourceState

	// List(String). URLs that Auth0 may redirect to after logout.
	AllowedLogoutUrls pulumi.StringArrayOutput `pulumi:"allowedLogoutUrls"`
	// List(Resource). Configuration settings for change passsword page. For details, see Change Password Page.
	ChangePassword TenantChangePasswordOutput `pulumi:"changePassword"`
	// String. API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
	DefaultAudience pulumi.StringOutput `pulumi:"defaultAudience"`
	// String. Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
	DefaultDirectory pulumi.StringOutput `pulumi:"defaultDirectory"`
	// String. The default absolute redirection uri, must be https and cannot contain a fragment.
	DefaultRedirectionUri pulumi.StringOutput `pulumi:"defaultRedirectionUri"`
	// List(String). Supported locales for the user interface. The first locale in the list will be used to set the default locale.
	EnabledLocales pulumi.StringArrayOutput `pulumi:"enabledLocales"`
	// List(Resource). Configuration settings for error pages. For details, see Error Page.
	ErrorPage TenantErrorPageOutput `pulumi:"errorPage"`
	// List(Resource). Configuration settings for tenant flags. For details, see Flags.
	Flags TenantFlagsOutput `pulumi:"flags"`
	// String. Friendly name for the tenant.
	FriendlyName pulumi.StringOutput `pulumi:"friendlyName"`
	// List(Resource). Configuration settings for the Guardian MFA page. For details, see Guardian MFA Page.
	GuardianMfaPage TenantGuardianMfaPageOutput `pulumi:"guardianMfaPage"`
	// Integer. Number of hours during which a session can be inactive before the user must log in again.
	IdleSessionLifetime pulumi.Float64PtrOutput `pulumi:"idleSessionLifetime"`
	// . String URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
	PictureUrl pulumi.StringOutput `pulumi:"pictureUrl"`
	// String. Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
	SandboxVersion pulumi.StringOutput `pulumi:"sandboxVersion"`
	// List(Resource). Alters behavior of tenant's session cookie. Contains a single `mode` property that accepts two values: `"persistent"` or `"non-persistent"`.
	SessionCookie TenantSessionCookieOutput `pulumi:"sessionCookie"`
	// Integer. Number of hours during which a session will stay valid.
	SessionLifetime pulumi.Float64PtrOutput `pulumi:"sessionLifetime"`
	// String. Support email address for authenticating users.
	SupportEmail pulumi.StringOutput `pulumi:"supportEmail"`
	// String. Support URL for authenticating users.
	SupportUrl pulumi.StringOutput `pulumi:"supportUrl"`
	// List(Resource). Configuration settings for Universal Login. For details, see Universal Login.
	UniversalLogin TenantUniversalLoginOutput `pulumi:"universalLogin"`
}

// NewTenant registers a new resource with the given unique name, arguments, and options.
func NewTenant(ctx *pulumi.Context,
	name string, args *TenantArgs, opts ...pulumi.ResourceOption) (*Tenant, error) {
	if args == nil {
		args = &TenantArgs{}
	}

	var resource Tenant
	err := ctx.RegisterResource("auth0:index/tenant:Tenant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTenant gets an existing Tenant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTenant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TenantState, opts ...pulumi.ResourceOption) (*Tenant, error) {
	var resource Tenant
	err := ctx.ReadResource("auth0:index/tenant:Tenant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Tenant resources.
type tenantState struct {
	// List(String). URLs that Auth0 may redirect to after logout.
	AllowedLogoutUrls []string `pulumi:"allowedLogoutUrls"`
	// List(Resource). Configuration settings for change passsword page. For details, see Change Password Page.
	ChangePassword *TenantChangePassword `pulumi:"changePassword"`
	// String. API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
	DefaultAudience *string `pulumi:"defaultAudience"`
	// String. Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
	DefaultDirectory *string `pulumi:"defaultDirectory"`
	// String. The default absolute redirection uri, must be https and cannot contain a fragment.
	DefaultRedirectionUri *string `pulumi:"defaultRedirectionUri"`
	// List(String). Supported locales for the user interface. The first locale in the list will be used to set the default locale.
	EnabledLocales []string `pulumi:"enabledLocales"`
	// List(Resource). Configuration settings for error pages. For details, see Error Page.
	ErrorPage *TenantErrorPage `pulumi:"errorPage"`
	// List(Resource). Configuration settings for tenant flags. For details, see Flags.
	Flags *TenantFlags `pulumi:"flags"`
	// String. Friendly name for the tenant.
	FriendlyName *string `pulumi:"friendlyName"`
	// List(Resource). Configuration settings for the Guardian MFA page. For details, see Guardian MFA Page.
	GuardianMfaPage *TenantGuardianMfaPage `pulumi:"guardianMfaPage"`
	// Integer. Number of hours during which a session can be inactive before the user must log in again.
	IdleSessionLifetime *float64 `pulumi:"idleSessionLifetime"`
	// . String URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
	PictureUrl *string `pulumi:"pictureUrl"`
	// String. Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
	SandboxVersion *string `pulumi:"sandboxVersion"`
	// List(Resource). Alters behavior of tenant's session cookie. Contains a single `mode` property that accepts two values: `"persistent"` or `"non-persistent"`.
	SessionCookie *TenantSessionCookie `pulumi:"sessionCookie"`
	// Integer. Number of hours during which a session will stay valid.
	SessionLifetime *float64 `pulumi:"sessionLifetime"`
	// String. Support email address for authenticating users.
	SupportEmail *string `pulumi:"supportEmail"`
	// String. Support URL for authenticating users.
	SupportUrl *string `pulumi:"supportUrl"`
	// List(Resource). Configuration settings for Universal Login. For details, see Universal Login.
	UniversalLogin *TenantUniversalLogin `pulumi:"universalLogin"`
}

type TenantState struct {
	// List(String). URLs that Auth0 may redirect to after logout.
	AllowedLogoutUrls pulumi.StringArrayInput
	// List(Resource). Configuration settings for change passsword page. For details, see Change Password Page.
	ChangePassword TenantChangePasswordPtrInput
	// String. API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
	DefaultAudience pulumi.StringPtrInput
	// String. Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
	DefaultDirectory pulumi.StringPtrInput
	// String. The default absolute redirection uri, must be https and cannot contain a fragment.
	DefaultRedirectionUri pulumi.StringPtrInput
	// List(String). Supported locales for the user interface. The first locale in the list will be used to set the default locale.
	EnabledLocales pulumi.StringArrayInput
	// List(Resource). Configuration settings for error pages. For details, see Error Page.
	ErrorPage TenantErrorPagePtrInput
	// List(Resource). Configuration settings for tenant flags. For details, see Flags.
	Flags TenantFlagsPtrInput
	// String. Friendly name for the tenant.
	FriendlyName pulumi.StringPtrInput
	// List(Resource). Configuration settings for the Guardian MFA page. For details, see Guardian MFA Page.
	GuardianMfaPage TenantGuardianMfaPagePtrInput
	// Integer. Number of hours during which a session can be inactive before the user must log in again.
	IdleSessionLifetime pulumi.Float64PtrInput
	// . String URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
	PictureUrl pulumi.StringPtrInput
	// String. Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
	SandboxVersion pulumi.StringPtrInput
	// List(Resource). Alters behavior of tenant's session cookie. Contains a single `mode` property that accepts two values: `"persistent"` or `"non-persistent"`.
	SessionCookie TenantSessionCookiePtrInput
	// Integer. Number of hours during which a session will stay valid.
	SessionLifetime pulumi.Float64PtrInput
	// String. Support email address for authenticating users.
	SupportEmail pulumi.StringPtrInput
	// String. Support URL for authenticating users.
	SupportUrl pulumi.StringPtrInput
	// List(Resource). Configuration settings for Universal Login. For details, see Universal Login.
	UniversalLogin TenantUniversalLoginPtrInput
}

func (TenantState) ElementType() reflect.Type {
	return reflect.TypeOf((*tenantState)(nil)).Elem()
}

type tenantArgs struct {
	// List(String). URLs that Auth0 may redirect to after logout.
	AllowedLogoutUrls []string `pulumi:"allowedLogoutUrls"`
	// List(Resource). Configuration settings for change passsword page. For details, see Change Password Page.
	ChangePassword *TenantChangePassword `pulumi:"changePassword"`
	// String. API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
	DefaultAudience *string `pulumi:"defaultAudience"`
	// String. Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
	DefaultDirectory *string `pulumi:"defaultDirectory"`
	// String. The default absolute redirection uri, must be https and cannot contain a fragment.
	DefaultRedirectionUri *string `pulumi:"defaultRedirectionUri"`
	// List(String). Supported locales for the user interface. The first locale in the list will be used to set the default locale.
	EnabledLocales []string `pulumi:"enabledLocales"`
	// List(Resource). Configuration settings for error pages. For details, see Error Page.
	ErrorPage *TenantErrorPage `pulumi:"errorPage"`
	// List(Resource). Configuration settings for tenant flags. For details, see Flags.
	Flags *TenantFlags `pulumi:"flags"`
	// String. Friendly name for the tenant.
	FriendlyName *string `pulumi:"friendlyName"`
	// List(Resource). Configuration settings for the Guardian MFA page. For details, see Guardian MFA Page.
	GuardianMfaPage *TenantGuardianMfaPage `pulumi:"guardianMfaPage"`
	// Integer. Number of hours during which a session can be inactive before the user must log in again.
	IdleSessionLifetime *float64 `pulumi:"idleSessionLifetime"`
	// . String URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
	PictureUrl *string `pulumi:"pictureUrl"`
	// String. Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
	SandboxVersion *string `pulumi:"sandboxVersion"`
	// List(Resource). Alters behavior of tenant's session cookie. Contains a single `mode` property that accepts two values: `"persistent"` or `"non-persistent"`.
	SessionCookie *TenantSessionCookie `pulumi:"sessionCookie"`
	// Integer. Number of hours during which a session will stay valid.
	SessionLifetime *float64 `pulumi:"sessionLifetime"`
	// String. Support email address for authenticating users.
	SupportEmail *string `pulumi:"supportEmail"`
	// String. Support URL for authenticating users.
	SupportUrl *string `pulumi:"supportUrl"`
	// List(Resource). Configuration settings for Universal Login. For details, see Universal Login.
	UniversalLogin *TenantUniversalLogin `pulumi:"universalLogin"`
}

// The set of arguments for constructing a Tenant resource.
type TenantArgs struct {
	// List(String). URLs that Auth0 may redirect to after logout.
	AllowedLogoutUrls pulumi.StringArrayInput
	// List(Resource). Configuration settings for change passsword page. For details, see Change Password Page.
	ChangePassword TenantChangePasswordPtrInput
	// String. API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
	DefaultAudience pulumi.StringPtrInput
	// String. Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
	DefaultDirectory pulumi.StringPtrInput
	// String. The default absolute redirection uri, must be https and cannot contain a fragment.
	DefaultRedirectionUri pulumi.StringPtrInput
	// List(String). Supported locales for the user interface. The first locale in the list will be used to set the default locale.
	EnabledLocales pulumi.StringArrayInput
	// List(Resource). Configuration settings for error pages. For details, see Error Page.
	ErrorPage TenantErrorPagePtrInput
	// List(Resource). Configuration settings for tenant flags. For details, see Flags.
	Flags TenantFlagsPtrInput
	// String. Friendly name for the tenant.
	FriendlyName pulumi.StringPtrInput
	// List(Resource). Configuration settings for the Guardian MFA page. For details, see Guardian MFA Page.
	GuardianMfaPage TenantGuardianMfaPagePtrInput
	// Integer. Number of hours during which a session can be inactive before the user must log in again.
	IdleSessionLifetime pulumi.Float64PtrInput
	// . String URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
	PictureUrl pulumi.StringPtrInput
	// String. Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
	SandboxVersion pulumi.StringPtrInput
	// List(Resource). Alters behavior of tenant's session cookie. Contains a single `mode` property that accepts two values: `"persistent"` or `"non-persistent"`.
	SessionCookie TenantSessionCookiePtrInput
	// Integer. Number of hours during which a session will stay valid.
	SessionLifetime pulumi.Float64PtrInput
	// String. Support email address for authenticating users.
	SupportEmail pulumi.StringPtrInput
	// String. Support URL for authenticating users.
	SupportUrl pulumi.StringPtrInput
	// List(Resource). Configuration settings for Universal Login. For details, see Universal Login.
	UniversalLogin TenantUniversalLoginPtrInput
}

func (TenantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tenantArgs)(nil)).Elem()
}

type TenantInput interface {
	pulumi.Input

	ToTenantOutput() TenantOutput
	ToTenantOutputWithContext(ctx context.Context) TenantOutput
}

func (*Tenant) ElementType() reflect.Type {
	return reflect.TypeOf((**Tenant)(nil)).Elem()
}

func (i *Tenant) ToTenantOutput() TenantOutput {
	return i.ToTenantOutputWithContext(context.Background())
}

func (i *Tenant) ToTenantOutputWithContext(ctx context.Context) TenantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TenantOutput)
}

// TenantArrayInput is an input type that accepts TenantArray and TenantArrayOutput values.
// You can construct a concrete instance of `TenantArrayInput` via:
//
//	TenantArray{ TenantArgs{...} }
type TenantArrayInput interface {
	pulumi.Input

	ToTenantArrayOutput() TenantArrayOutput
	ToTenantArrayOutputWithContext(context.Context) TenantArrayOutput
}

type TenantArray []TenantInput

func (TenantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Tenant)(nil)).Elem()
}

func (i TenantArray) ToTenantArrayOutput() TenantArrayOutput {
	return i.ToTenantArrayOutputWithContext(context.Background())
}

func (i TenantArray) ToTenantArrayOutputWithContext(ctx context.Context) TenantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TenantArrayOutput)
}

// TenantMapInput is an input type that accepts TenantMap and TenantMapOutput values.
// You can construct a concrete instance of `TenantMapInput` via:
//
//	TenantMap{ "key": TenantArgs{...} }
type TenantMapInput interface {
	pulumi.Input

	ToTenantMapOutput() TenantMapOutput
	ToTenantMapOutputWithContext(context.Context) TenantMapOutput
}

type TenantMap map[string]TenantInput

func (TenantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Tenant)(nil)).Elem()
}

func (i TenantMap) ToTenantMapOutput() TenantMapOutput {
	return i.ToTenantMapOutputWithContext(context.Background())
}

func (i TenantMap) ToTenantMapOutputWithContext(ctx context.Context) TenantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TenantMapOutput)
}

type TenantOutput struct{ *pulumi.OutputState }

func (TenantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Tenant)(nil)).Elem()
}

func (o TenantOutput) ToTenantOutput() TenantOutput {
	return o
}

func (o TenantOutput) ToTenantOutputWithContext(ctx context.Context) TenantOutput {
	return o
}

// List(String). URLs that Auth0 may redirect to after logout.
func (o TenantOutput) AllowedLogoutUrls() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Tenant) pulumi.StringArrayOutput { return v.AllowedLogoutUrls }).(pulumi.StringArrayOutput)
}

// List(Resource). Configuration settings for change passsword page. For details, see Change Password Page.
func (o TenantOutput) ChangePassword() TenantChangePasswordOutput {
	return o.ApplyT(func(v *Tenant) TenantChangePasswordOutput { return v.ChangePassword }).(TenantChangePasswordOutput)
}

// String. API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
func (o TenantOutput) DefaultAudience() pulumi.StringOutput {
	return o.ApplyT(func(v *Tenant) pulumi.StringOutput { return v.DefaultAudience }).(pulumi.StringOutput)
}

// String. Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
func (o TenantOutput) DefaultDirectory() pulumi.StringOutput {
	return o.ApplyT(func(v *Tenant) pulumi.StringOutput { return v.DefaultDirectory }).(pulumi.StringOutput)
}

// String. The default absolute redirection uri, must be https and cannot contain a fragment.
func (o TenantOutput) DefaultRedirectionUri() pulumi.StringOutput {
	return o.ApplyT(func(v *Tenant) pulumi.StringOutput { return v.DefaultRedirectionUri }).(pulumi.StringOutput)
}

// List(String). Supported locales for the user interface. The first locale in the list will be used to set the default locale.
func (o TenantOutput) EnabledLocales() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Tenant) pulumi.StringArrayOutput { return v.EnabledLocales }).(pulumi.StringArrayOutput)
}

// List(Resource). Configuration settings for error pages. For details, see Error Page.
func (o TenantOutput) ErrorPage() TenantErrorPageOutput {
	return o.ApplyT(func(v *Tenant) TenantErrorPageOutput { return v.ErrorPage }).(TenantErrorPageOutput)
}

// List(Resource). Configuration settings for tenant flags. For details, see Flags.
func (o TenantOutput) Flags() TenantFlagsOutput {
	return o.ApplyT(func(v *Tenant) TenantFlagsOutput { return v.Flags }).(TenantFlagsOutput)
}

// String. Friendly name for the tenant.
func (o TenantOutput) FriendlyName() pulumi.StringOutput {
	return o.ApplyT(func(v *Tenant) pulumi.StringOutput { return v.FriendlyName }).(pulumi.StringOutput)
}

// List(Resource). Configuration settings for the Guardian MFA page. For details, see Guardian MFA Page.
func (o TenantOutput) GuardianMfaPage() TenantGuardianMfaPageOutput {
	return o.ApplyT(func(v *Tenant) TenantGuardianMfaPageOutput { return v.GuardianMfaPage }).(TenantGuardianMfaPageOutput)
}

// Integer. Number of hours during which a session can be inactive before the user must log in again.
func (o TenantOutput) IdleSessionLifetime() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *Tenant) pulumi.Float64PtrOutput { return v.IdleSessionLifetime }).(pulumi.Float64PtrOutput)
}

// . String URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
func (o TenantOutput) PictureUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Tenant) pulumi.StringOutput { return v.PictureUrl }).(pulumi.StringOutput)
}

// String. Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
func (o TenantOutput) SandboxVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *Tenant) pulumi.StringOutput { return v.SandboxVersion }).(pulumi.StringOutput)
}

// List(Resource). Alters behavior of tenant's session cookie. Contains a single `mode` property that accepts two values: `"persistent"` or `"non-persistent"`.
func (o TenantOutput) SessionCookie() TenantSessionCookieOutput {
	return o.ApplyT(func(v *Tenant) TenantSessionCookieOutput { return v.SessionCookie }).(TenantSessionCookieOutput)
}

// Integer. Number of hours during which a session will stay valid.
func (o TenantOutput) SessionLifetime() pulumi.Float64PtrOutput {
	return o.ApplyT(func(v *Tenant) pulumi.Float64PtrOutput { return v.SessionLifetime }).(pulumi.Float64PtrOutput)
}

// String. Support email address for authenticating users.
func (o TenantOutput) SupportEmail() pulumi.StringOutput {
	return o.ApplyT(func(v *Tenant) pulumi.StringOutput { return v.SupportEmail }).(pulumi.StringOutput)
}

// String. Support URL for authenticating users.
func (o TenantOutput) SupportUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *Tenant) pulumi.StringOutput { return v.SupportUrl }).(pulumi.StringOutput)
}

// List(Resource). Configuration settings for Universal Login. For details, see Universal Login.
func (o TenantOutput) UniversalLogin() TenantUniversalLoginOutput {
	return o.ApplyT(func(v *Tenant) TenantUniversalLoginOutput { return v.UniversalLogin }).(TenantUniversalLoginOutput)
}

type TenantArrayOutput struct{ *pulumi.OutputState }

func (TenantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Tenant)(nil)).Elem()
}

func (o TenantArrayOutput) ToTenantArrayOutput() TenantArrayOutput {
	return o
}

func (o TenantArrayOutput) ToTenantArrayOutputWithContext(ctx context.Context) TenantArrayOutput {
	return o
}

func (o TenantArrayOutput) Index(i pulumi.IntInput) TenantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Tenant {
		return vs[0].([]*Tenant)[vs[1].(int)]
	}).(TenantOutput)
}

type TenantMapOutput struct{ *pulumi.OutputState }

func (TenantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Tenant)(nil)).Elem()
}

func (o TenantMapOutput) ToTenantMapOutput() TenantMapOutput {
	return o
}

func (o TenantMapOutput) ToTenantMapOutputWithContext(ctx context.Context) TenantMapOutput {
	return o
}

func (o TenantMapOutput) MapIndex(k pulumi.StringInput) TenantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Tenant {
		return vs[0].(map[string]*Tenant)[vs[1].(string)]
	}).(TenantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TenantInput)(nil)).Elem(), &Tenant{})
	pulumi.RegisterInputType(reflect.TypeOf((*TenantArrayInput)(nil)).Elem(), TenantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TenantMapInput)(nil)).Elem(), TenantMap{})
	pulumi.RegisterOutputType(TenantOutput{})
	pulumi.RegisterOutputType(TenantArrayOutput{})
	pulumi.RegisterOutputType(TenantMapOutput{})
}
