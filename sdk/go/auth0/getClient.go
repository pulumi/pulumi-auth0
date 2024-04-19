// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source to retrieve a specific Auth0 application client by `clientId` or `name`.
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
//			// An Auth0 Client loaded using its name.
//			_, err := auth0.LookupClient(ctx, &auth0.LookupClientArgs{
//				Name: pulumi.StringRef("Name of my Application"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// An Auth0 Client loaded using its ID.
//			_, err = auth0.LookupClient(ctx, &auth0.LookupClientArgs{
//				ClientId: pulumi.StringRef("abcdefghkijklmnopqrstuvwxyz0123456789"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupClient(ctx *pulumi.Context, args *LookupClientArgs, opts ...pulumi.InvokeOption) (*LookupClientResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupClientResult
	err := ctx.Invoke("auth0:index/getClient:getClient", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClient.
type LookupClientArgs struct {
	ClientId *string `pulumi:"clientId"`
	Name     *string `pulumi:"name"`
}

// A collection of values returned by getClient.
type LookupClientResult struct {
	// Addons enabled for this client and their associated configurations.
	Addons []GetClientAddon `pulumi:"addons"`
	// List of applications ID's that will be allowed to make delegation request. By default, all applications will be allowed.
	AllowedClients []string `pulumi:"allowedClients"`
	// URLs that Auth0 may redirect to after logout.
	AllowedLogoutUrls []string `pulumi:"allowedLogoutUrls"`
	// URLs that represent valid origins for cross-origin resource sharing. By default, all your callback URLs will be allowed.
	AllowedOrigins []string `pulumi:"allowedOrigins"`
	// Type of application the client represents. Possible values are: `native`, `spa`, `regularWeb`, `nonInteractive`, `ssoIntegration`. Specific SSO integrations types accepted as well are: `rms`, `box`, `cloudbees`, `concur`, `dropbox`, `mscrm`, `echosign`, `egnyte`, `newrelic`, `office365`, `salesforce`, `sentry`, `sharepoint`, `slack`, `springcm`, `zendesk`, `zoom`.
	AppType string `pulumi:"appType"`
	// URLs that Auth0 may call back to after a user authenticates for the client. Make sure to specify the protocol (https://) otherwise the callback may fail in some cases. With the exception of custom URI schemes for native clients, all callbacks should use protocol https://.
	Callbacks []string `pulumi:"callbacks"`
	// List of audiences/realms for SAML protocol. Used by the wsfed addon.
	ClientAliases []string `pulumi:"clientAliases"`
	// The ID of the client. If not provided, `name` must be set.
	ClientId *string `pulumi:"clientId"`
	// Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?"/\()<>@ [Tab] [Space]`.
	ClientMetadata map[string]interface{} `pulumi:"clientMetadata"`
	ClientSecret   string                 `pulumi:"clientSecret"`
	// Whether this client can be used to make cross-origin authentication requests (`true`) or it is not allowed to make such requests (`false`).
	CrossOriginAuth bool `pulumi:"crossOriginAuth"`
	// URL of the location in your site where the cross-origin verification takes place for the cross-origin auth flow when performing authentication in your own domain instead of Auth0 Universal Login page.
	CrossOriginLoc string `pulumi:"crossOriginLoc"`
	// The content (HTML, CSS, JS) of the custom login page.
	CustomLoginPage string `pulumi:"customLoginPage"`
	// Indicates whether a custom login page is to be used.
	CustomLoginPageOn bool `pulumi:"customLoginPageOn"`
	// Description of the purpose of the client.
	Description string `pulumi:"description"`
	// Encryption used for WS-Fed responses with this client.
	EncryptionKey map[string]string `pulumi:"encryptionKey"`
	// HTML form template to be used for WS-Federation.
	FormTemplate string `pulumi:"formTemplate"`
	// Types of grants that this client is authorized to use.
	GrantTypes []string `pulumi:"grantTypes"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Initiate login URI. Must be HTTPS or an empty string.
	InitiateLoginUri string `pulumi:"initiateLoginUri"`
	// Indicates whether this client is a first-party client.
	IsFirstParty bool `pulumi:"isFirstParty"`
	// Indicates whether the token endpoint IP header is trusted. Requires the authentication method to be set to `clientSecretPost` or `clientSecretBasic`. Setting this property when creating the resource, will default the authentication method to `clientSecretPost`. To change the authentication method to `clientSecretBasic` use the `ClientCredentials` resource.
	IsTokenEndpointIpHeaderTrusted bool `pulumi:"isTokenEndpointIpHeaderTrusted"`
	// Configuration settings for the JWTs issued for this client.
	JwtConfigurations []GetClientJwtConfiguration `pulumi:"jwtConfigurations"`
	// URL of the logo for the client. Recommended size is 150px x 150px. If none is set, the default badge for the application type will be shown.
	LogoUri string `pulumi:"logoUri"`
	// Additional configuration for native mobile apps.
	Mobiles []GetClientMobile `pulumi:"mobiles"`
	// The name of the client. If not provided, `clientId` must be set.
	Name *string `pulumi:"name"`
	// Configuration settings to toggle native social login for mobile native applications. Once this is set it must stay set, with both resources set to `false` in order to change the `appType`.
	NativeSocialLogins []GetClientNativeSocialLogin `pulumi:"nativeSocialLogins"`
	// Set of URLs that are valid to call back from Auth0 for OIDC backchannel logout. Currently only one URL is allowed.
	OidcBackchannelLogoutUrls []string `pulumi:"oidcBackchannelLogoutUrls"`
	// Indicates whether this client will conform to strict OIDC specifications.
	OidcConformant bool `pulumi:"oidcConformant"`
	// Defines how to proceed during an authentication transaction when `organizationUsage = "require"`. Can be `noPrompt` (default), `preLoginPrompt` or  `postLoginPrompt`.
	OrganizationRequireBehavior string `pulumi:"organizationRequireBehavior"`
	// Defines how to proceed during an authentication transaction with regards to an organization. Can be `deny` (default), `allow` or `require`.
	OrganizationUsage string `pulumi:"organizationUsage"`
	// Configuration settings for the refresh tokens issued for this client.
	RefreshTokens []GetClientRefreshToken `pulumi:"refreshTokens"`
	// Makes the use of Pushed Authorization Requests mandatory for this client. This feature currently needs to be enabled on the tenant in order to make use of it.
	RequirePushedAuthorizationRequests bool `pulumi:"requirePushedAuthorizationRequests"`
	// List containing a map of the public cert of the signing key and the public cert of the signing key in PKCS7.
	SigningKeys []map[string]interface{} `pulumi:"signingKeys"`
	// Applies only to SSO clients and determines whether Auth0 will handle Single Sign-On (true) or whether the identity provider will (false).
	Sso bool `pulumi:"sso"`
	// Indicates whether or not SSO is disabled.
	SsoDisabled bool `pulumi:"ssoDisabled"`
	// The authentication method for the token endpoint. Results include `none` (public client without a client secret), `clientSecretPost` (client uses HTTP POST parameters), `clientSecretBasic` (client uses HTTP Basic). Managing a client's authentication method can be done via the `ClientCredentials` resource.
	TokenEndpointAuthMethod string `pulumi:"tokenEndpointAuthMethod"`
	// URLs that represent valid web origins for use with web message response mode.
	WebOrigins []string `pulumi:"webOrigins"`
}

func LookupClientOutput(ctx *pulumi.Context, args LookupClientOutputArgs, opts ...pulumi.InvokeOption) LookupClientResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupClientResult, error) {
			args := v.(LookupClientArgs)
			r, err := LookupClient(ctx, &args, opts...)
			var s LookupClientResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupClientResultOutput)
}

// A collection of arguments for invoking getClient.
type LookupClientOutputArgs struct {
	ClientId pulumi.StringPtrInput `pulumi:"clientId"`
	Name     pulumi.StringPtrInput `pulumi:"name"`
}

func (LookupClientOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClientArgs)(nil)).Elem()
}

// A collection of values returned by getClient.
type LookupClientResultOutput struct{ *pulumi.OutputState }

func (LookupClientResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupClientResult)(nil)).Elem()
}

func (o LookupClientResultOutput) ToLookupClientResultOutput() LookupClientResultOutput {
	return o
}

func (o LookupClientResultOutput) ToLookupClientResultOutputWithContext(ctx context.Context) LookupClientResultOutput {
	return o
}

// Addons enabled for this client and their associated configurations.
func (o LookupClientResultOutput) Addons() GetClientAddonArrayOutput {
	return o.ApplyT(func(v LookupClientResult) []GetClientAddon { return v.Addons }).(GetClientAddonArrayOutput)
}

// List of applications ID's that will be allowed to make delegation request. By default, all applications will be allowed.
func (o LookupClientResultOutput) AllowedClients() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupClientResult) []string { return v.AllowedClients }).(pulumi.StringArrayOutput)
}

// URLs that Auth0 may redirect to after logout.
func (o LookupClientResultOutput) AllowedLogoutUrls() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupClientResult) []string { return v.AllowedLogoutUrls }).(pulumi.StringArrayOutput)
}

// URLs that represent valid origins for cross-origin resource sharing. By default, all your callback URLs will be allowed.
func (o LookupClientResultOutput) AllowedOrigins() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupClientResult) []string { return v.AllowedOrigins }).(pulumi.StringArrayOutput)
}

// Type of application the client represents. Possible values are: `native`, `spa`, `regularWeb`, `nonInteractive`, `ssoIntegration`. Specific SSO integrations types accepted as well are: `rms`, `box`, `cloudbees`, `concur`, `dropbox`, `mscrm`, `echosign`, `egnyte`, `newrelic`, `office365`, `salesforce`, `sentry`, `sharepoint`, `slack`, `springcm`, `zendesk`, `zoom`.
func (o LookupClientResultOutput) AppType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClientResult) string { return v.AppType }).(pulumi.StringOutput)
}

// URLs that Auth0 may call back to after a user authenticates for the client. Make sure to specify the protocol (https://) otherwise the callback may fail in some cases. With the exception of custom URI schemes for native clients, all callbacks should use protocol https://.
func (o LookupClientResultOutput) Callbacks() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupClientResult) []string { return v.Callbacks }).(pulumi.StringArrayOutput)
}

// List of audiences/realms for SAML protocol. Used by the wsfed addon.
func (o LookupClientResultOutput) ClientAliases() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupClientResult) []string { return v.ClientAliases }).(pulumi.StringArrayOutput)
}

// The ID of the client. If not provided, `name` must be set.
func (o LookupClientResultOutput) ClientId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupClientResult) *string { return v.ClientId }).(pulumi.StringPtrOutput)
}

// Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?"/\()<>@ [Tab] [Space]`.
func (o LookupClientResultOutput) ClientMetadata() pulumi.MapOutput {
	return o.ApplyT(func(v LookupClientResult) map[string]interface{} { return v.ClientMetadata }).(pulumi.MapOutput)
}

func (o LookupClientResultOutput) ClientSecret() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClientResult) string { return v.ClientSecret }).(pulumi.StringOutput)
}

// Whether this client can be used to make cross-origin authentication requests (`true`) or it is not allowed to make such requests (`false`).
func (o LookupClientResultOutput) CrossOriginAuth() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClientResult) bool { return v.CrossOriginAuth }).(pulumi.BoolOutput)
}

// URL of the location in your site where the cross-origin verification takes place for the cross-origin auth flow when performing authentication in your own domain instead of Auth0 Universal Login page.
func (o LookupClientResultOutput) CrossOriginLoc() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClientResult) string { return v.CrossOriginLoc }).(pulumi.StringOutput)
}

// The content (HTML, CSS, JS) of the custom login page.
func (o LookupClientResultOutput) CustomLoginPage() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClientResult) string { return v.CustomLoginPage }).(pulumi.StringOutput)
}

// Indicates whether a custom login page is to be used.
func (o LookupClientResultOutput) CustomLoginPageOn() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClientResult) bool { return v.CustomLoginPageOn }).(pulumi.BoolOutput)
}

// Description of the purpose of the client.
func (o LookupClientResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClientResult) string { return v.Description }).(pulumi.StringOutput)
}

// Encryption used for WS-Fed responses with this client.
func (o LookupClientResultOutput) EncryptionKey() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupClientResult) map[string]string { return v.EncryptionKey }).(pulumi.StringMapOutput)
}

// HTML form template to be used for WS-Federation.
func (o LookupClientResultOutput) FormTemplate() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClientResult) string { return v.FormTemplate }).(pulumi.StringOutput)
}

// Types of grants that this client is authorized to use.
func (o LookupClientResultOutput) GrantTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupClientResult) []string { return v.GrantTypes }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupClientResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClientResult) string { return v.Id }).(pulumi.StringOutput)
}

// Initiate login URI. Must be HTTPS or an empty string.
func (o LookupClientResultOutput) InitiateLoginUri() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClientResult) string { return v.InitiateLoginUri }).(pulumi.StringOutput)
}

// Indicates whether this client is a first-party client.
func (o LookupClientResultOutput) IsFirstParty() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClientResult) bool { return v.IsFirstParty }).(pulumi.BoolOutput)
}

// Indicates whether the token endpoint IP header is trusted. Requires the authentication method to be set to `clientSecretPost` or `clientSecretBasic`. Setting this property when creating the resource, will default the authentication method to `clientSecretPost`. To change the authentication method to `clientSecretBasic` use the `ClientCredentials` resource.
func (o LookupClientResultOutput) IsTokenEndpointIpHeaderTrusted() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClientResult) bool { return v.IsTokenEndpointIpHeaderTrusted }).(pulumi.BoolOutput)
}

// Configuration settings for the JWTs issued for this client.
func (o LookupClientResultOutput) JwtConfigurations() GetClientJwtConfigurationArrayOutput {
	return o.ApplyT(func(v LookupClientResult) []GetClientJwtConfiguration { return v.JwtConfigurations }).(GetClientJwtConfigurationArrayOutput)
}

// URL of the logo for the client. Recommended size is 150px x 150px. If none is set, the default badge for the application type will be shown.
func (o LookupClientResultOutput) LogoUri() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClientResult) string { return v.LogoUri }).(pulumi.StringOutput)
}

// Additional configuration for native mobile apps.
func (o LookupClientResultOutput) Mobiles() GetClientMobileArrayOutput {
	return o.ApplyT(func(v LookupClientResult) []GetClientMobile { return v.Mobiles }).(GetClientMobileArrayOutput)
}

// The name of the client. If not provided, `clientId` must be set.
func (o LookupClientResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupClientResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Configuration settings to toggle native social login for mobile native applications. Once this is set it must stay set, with both resources set to `false` in order to change the `appType`.
func (o LookupClientResultOutput) NativeSocialLogins() GetClientNativeSocialLoginArrayOutput {
	return o.ApplyT(func(v LookupClientResult) []GetClientNativeSocialLogin { return v.NativeSocialLogins }).(GetClientNativeSocialLoginArrayOutput)
}

// Set of URLs that are valid to call back from Auth0 for OIDC backchannel logout. Currently only one URL is allowed.
func (o LookupClientResultOutput) OidcBackchannelLogoutUrls() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupClientResult) []string { return v.OidcBackchannelLogoutUrls }).(pulumi.StringArrayOutput)
}

// Indicates whether this client will conform to strict OIDC specifications.
func (o LookupClientResultOutput) OidcConformant() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClientResult) bool { return v.OidcConformant }).(pulumi.BoolOutput)
}

// Defines how to proceed during an authentication transaction when `organizationUsage = "require"`. Can be `noPrompt` (default), `preLoginPrompt` or  `postLoginPrompt`.
func (o LookupClientResultOutput) OrganizationRequireBehavior() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClientResult) string { return v.OrganizationRequireBehavior }).(pulumi.StringOutput)
}

// Defines how to proceed during an authentication transaction with regards to an organization. Can be `deny` (default), `allow` or `require`.
func (o LookupClientResultOutput) OrganizationUsage() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClientResult) string { return v.OrganizationUsage }).(pulumi.StringOutput)
}

// Configuration settings for the refresh tokens issued for this client.
func (o LookupClientResultOutput) RefreshTokens() GetClientRefreshTokenArrayOutput {
	return o.ApplyT(func(v LookupClientResult) []GetClientRefreshToken { return v.RefreshTokens }).(GetClientRefreshTokenArrayOutput)
}

// Makes the use of Pushed Authorization Requests mandatory for this client. This feature currently needs to be enabled on the tenant in order to make use of it.
func (o LookupClientResultOutput) RequirePushedAuthorizationRequests() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClientResult) bool { return v.RequirePushedAuthorizationRequests }).(pulumi.BoolOutput)
}

// List containing a map of the public cert of the signing key and the public cert of the signing key in PKCS7.
func (o LookupClientResultOutput) SigningKeys() pulumi.MapArrayOutput {
	return o.ApplyT(func(v LookupClientResult) []map[string]interface{} { return v.SigningKeys }).(pulumi.MapArrayOutput)
}

// Applies only to SSO clients and determines whether Auth0 will handle Single Sign-On (true) or whether the identity provider will (false).
func (o LookupClientResultOutput) Sso() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClientResult) bool { return v.Sso }).(pulumi.BoolOutput)
}

// Indicates whether or not SSO is disabled.
func (o LookupClientResultOutput) SsoDisabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupClientResult) bool { return v.SsoDisabled }).(pulumi.BoolOutput)
}

// The authentication method for the token endpoint. Results include `none` (public client without a client secret), `clientSecretPost` (client uses HTTP POST parameters), `clientSecretBasic` (client uses HTTP Basic). Managing a client's authentication method can be done via the `ClientCredentials` resource.
func (o LookupClientResultOutput) TokenEndpointAuthMethod() pulumi.StringOutput {
	return o.ApplyT(func(v LookupClientResult) string { return v.TokenEndpointAuthMethod }).(pulumi.StringOutput)
}

// URLs that represent valid web origins for use with web message response mode.
func (o LookupClientResultOutput) WebOrigins() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupClientResult) []string { return v.WebOrigins }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupClientResultOutput{})
}
