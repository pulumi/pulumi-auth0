// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source to retrieve a specific Auth0 resource server by `resourceServerId` or `identifier`.
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
//			// An Auth0 Resource Server loaded using its identifier.
//			_, err := auth0.LookupResourceServer(ctx, &auth0.LookupResourceServerArgs{
//				Identifier: pulumi.StringRef("https://my-api.com/v1"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			// An Auth0 Resource Server loaded using its ID.
//			_, err = auth0.LookupResourceServer(ctx, &auth0.LookupResourceServerArgs{
//				ResourceServerId: pulumi.StringRef("abcdefghkijklmnopqrstuvwxyz0123456789"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupResourceServer(ctx *pulumi.Context, args *LookupResourceServerArgs, opts ...pulumi.InvokeOption) (*LookupResourceServerResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupResourceServerResult
	err := ctx.Invoke("auth0:index/getResourceServer:getResourceServer", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getResourceServer.
type LookupResourceServerArgs struct {
	// Unique identifier for the resource server. Used as the audience parameter for authorization calls. If not provided, `resourceServerId` must be set.
	Identifier *string `pulumi:"identifier"`
	// The ID of the resource server. If not provided, `identifier` must be set.
	ResourceServerId *string `pulumi:"resourceServerId"`
}

// A collection of values returned by getResourceServer.
type LookupResourceServerResult struct {
	// Indicates whether refresh tokens can be issued for this resource server.
	AllowOfflineAccess bool `pulumi:"allowOfflineAccess"`
	// Authorization details for this resource server.
	AuthorizationDetails []GetResourceServerAuthorizationDetail `pulumi:"authorizationDetails"`
	// Consent policy for this resource server. Options include `transactional-authorization-with-mfa`, or `null` to disable.
	ConsentPolicy string `pulumi:"consentPolicy"`
	// If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
	EnforcePolicies bool `pulumi:"enforcePolicies"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier for the resource server. Used as the audience parameter for authorization calls. If not provided, `resourceServerId` must be set.
	Identifier *string `pulumi:"identifier"`
	// Friendly name for the resource server. Cannot include `<` or `>` characters.
	Name string `pulumi:"name"`
	// Configuration settings for proof-of-possession for this resource server.
	ProofOfPossessions []GetResourceServerProofOfPossession `pulumi:"proofOfPossessions"`
	// The ID of the resource server. If not provided, `identifier` must be set.
	ResourceServerId *string `pulumi:"resourceServerId"`
	// List of permissions (scopes) used by this resource server.
	Scopes []GetResourceServerScopeType `pulumi:"scopes"`
	// Algorithm used to sign JWTs. Options include `HS256`, `RS256`, and `PS256`.
	SigningAlg string `pulumi:"signingAlg"`
	// Secret used to sign tokens when using symmetric algorithms (HS256).
	SigningSecret string `pulumi:"signingSecret"`
	// Indicates whether to skip user consent for applications flagged as first party.
	SkipConsentForVerifiableFirstPartyClients bool `pulumi:"skipConsentForVerifiableFirstPartyClients"`
	// Dialect of access tokens that should be issued for this resource server. Options include `accessToken`, `rfc9068Profile`, `accessTokenAuthz`, and `rfc9068ProfileAuthz`. `accessToken` is a JWT containing standard Auth0 claims. `rfc9068Profile` is a JWT conforming to the IETF JWT Access Token Profile. `accessTokenAuthz` is a JWT containing standard Auth0 claims, including RBAC permissions claims. `rfc9068ProfileAuthz` is a JWT conforming to the IETF JWT Access Token Profile, including RBAC permissions claims. RBAC permissions claims are available if RBAC (`enforcePolicies`) is enabled for this API. For more details, refer to [Access Token Profiles](https://auth0.com/docs/secure/tokens/access-tokens/access-token-profiles).
	TokenDialect string `pulumi:"tokenDialect"`
	// Configuration for JSON Web Encryption(JWE) of tokens for this resource server.
	TokenEncryptions []GetResourceServerTokenEncryption `pulumi:"tokenEncryptions"`
	// Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
	TokenLifetime int `pulumi:"tokenLifetime"`
	// Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `tokenLifetime` value.
	TokenLifetimeForWeb int `pulumi:"tokenLifetimeForWeb"`
	// URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
	VerificationLocation string `pulumi:"verificationLocation"`
}

func LookupResourceServerOutput(ctx *pulumi.Context, args LookupResourceServerOutputArgs, opts ...pulumi.InvokeOption) LookupResourceServerResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupResourceServerResultOutput, error) {
			args := v.(LookupResourceServerArgs)
			opts = internal.PkgInvokeDefaultOpts(opts)
			var rv LookupResourceServerResult
			secret, err := ctx.InvokePackageRaw("auth0:index/getResourceServer:getResourceServer", args, &rv, "", opts...)
			if err != nil {
				return LookupResourceServerResultOutput{}, err
			}

			output := pulumi.ToOutput(rv).(LookupResourceServerResultOutput)
			if secret {
				return pulumi.ToSecret(output).(LookupResourceServerResultOutput), nil
			}
			return output, nil
		}).(LookupResourceServerResultOutput)
}

// A collection of arguments for invoking getResourceServer.
type LookupResourceServerOutputArgs struct {
	// Unique identifier for the resource server. Used as the audience parameter for authorization calls. If not provided, `resourceServerId` must be set.
	Identifier pulumi.StringPtrInput `pulumi:"identifier"`
	// The ID of the resource server. If not provided, `identifier` must be set.
	ResourceServerId pulumi.StringPtrInput `pulumi:"resourceServerId"`
}

func (LookupResourceServerOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupResourceServerArgs)(nil)).Elem()
}

// A collection of values returned by getResourceServer.
type LookupResourceServerResultOutput struct{ *pulumi.OutputState }

func (LookupResourceServerResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupResourceServerResult)(nil)).Elem()
}

func (o LookupResourceServerResultOutput) ToLookupResourceServerResultOutput() LookupResourceServerResultOutput {
	return o
}

func (o LookupResourceServerResultOutput) ToLookupResourceServerResultOutputWithContext(ctx context.Context) LookupResourceServerResultOutput {
	return o
}

// Indicates whether refresh tokens can be issued for this resource server.
func (o LookupResourceServerResultOutput) AllowOfflineAccess() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupResourceServerResult) bool { return v.AllowOfflineAccess }).(pulumi.BoolOutput)
}

// Authorization details for this resource server.
func (o LookupResourceServerResultOutput) AuthorizationDetails() GetResourceServerAuthorizationDetailArrayOutput {
	return o.ApplyT(func(v LookupResourceServerResult) []GetResourceServerAuthorizationDetail {
		return v.AuthorizationDetails
	}).(GetResourceServerAuthorizationDetailArrayOutput)
}

// Consent policy for this resource server. Options include `transactional-authorization-with-mfa`, or `null` to disable.
func (o LookupResourceServerResultOutput) ConsentPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v LookupResourceServerResult) string { return v.ConsentPolicy }).(pulumi.StringOutput)
}

// If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
func (o LookupResourceServerResultOutput) EnforcePolicies() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupResourceServerResult) bool { return v.EnforcePolicies }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupResourceServerResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupResourceServerResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier for the resource server. Used as the audience parameter for authorization calls. If not provided, `resourceServerId` must be set.
func (o LookupResourceServerResultOutput) Identifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupResourceServerResult) *string { return v.Identifier }).(pulumi.StringPtrOutput)
}

// Friendly name for the resource server. Cannot include `<` or `>` characters.
func (o LookupResourceServerResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupResourceServerResult) string { return v.Name }).(pulumi.StringOutput)
}

// Configuration settings for proof-of-possession for this resource server.
func (o LookupResourceServerResultOutput) ProofOfPossessions() GetResourceServerProofOfPossessionArrayOutput {
	return o.ApplyT(func(v LookupResourceServerResult) []GetResourceServerProofOfPossession { return v.ProofOfPossessions }).(GetResourceServerProofOfPossessionArrayOutput)
}

// The ID of the resource server. If not provided, `identifier` must be set.
func (o LookupResourceServerResultOutput) ResourceServerId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupResourceServerResult) *string { return v.ResourceServerId }).(pulumi.StringPtrOutput)
}

// List of permissions (scopes) used by this resource server.
func (o LookupResourceServerResultOutput) Scopes() GetResourceServerScopeTypeArrayOutput {
	return o.ApplyT(func(v LookupResourceServerResult) []GetResourceServerScopeType { return v.Scopes }).(GetResourceServerScopeTypeArrayOutput)
}

// Algorithm used to sign JWTs. Options include `HS256`, `RS256`, and `PS256`.
func (o LookupResourceServerResultOutput) SigningAlg() pulumi.StringOutput {
	return o.ApplyT(func(v LookupResourceServerResult) string { return v.SigningAlg }).(pulumi.StringOutput)
}

// Secret used to sign tokens when using symmetric algorithms (HS256).
func (o LookupResourceServerResultOutput) SigningSecret() pulumi.StringOutput {
	return o.ApplyT(func(v LookupResourceServerResult) string { return v.SigningSecret }).(pulumi.StringOutput)
}

// Indicates whether to skip user consent for applications flagged as first party.
func (o LookupResourceServerResultOutput) SkipConsentForVerifiableFirstPartyClients() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupResourceServerResult) bool { return v.SkipConsentForVerifiableFirstPartyClients }).(pulumi.BoolOutput)
}

// Dialect of access tokens that should be issued for this resource server. Options include `accessToken`, `rfc9068Profile`, `accessTokenAuthz`, and `rfc9068ProfileAuthz`. `accessToken` is a JWT containing standard Auth0 claims. `rfc9068Profile` is a JWT conforming to the IETF JWT Access Token Profile. `accessTokenAuthz` is a JWT containing standard Auth0 claims, including RBAC permissions claims. `rfc9068ProfileAuthz` is a JWT conforming to the IETF JWT Access Token Profile, including RBAC permissions claims. RBAC permissions claims are available if RBAC (`enforcePolicies`) is enabled for this API. For more details, refer to [Access Token Profiles](https://auth0.com/docs/secure/tokens/access-tokens/access-token-profiles).
func (o LookupResourceServerResultOutput) TokenDialect() pulumi.StringOutput {
	return o.ApplyT(func(v LookupResourceServerResult) string { return v.TokenDialect }).(pulumi.StringOutput)
}

// Configuration for JSON Web Encryption(JWE) of tokens for this resource server.
func (o LookupResourceServerResultOutput) TokenEncryptions() GetResourceServerTokenEncryptionArrayOutput {
	return o.ApplyT(func(v LookupResourceServerResult) []GetResourceServerTokenEncryption { return v.TokenEncryptions }).(GetResourceServerTokenEncryptionArrayOutput)
}

// Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
func (o LookupResourceServerResultOutput) TokenLifetime() pulumi.IntOutput {
	return o.ApplyT(func(v LookupResourceServerResult) int { return v.TokenLifetime }).(pulumi.IntOutput)
}

// Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `tokenLifetime` value.
func (o LookupResourceServerResultOutput) TokenLifetimeForWeb() pulumi.IntOutput {
	return o.ApplyT(func(v LookupResourceServerResult) int { return v.TokenLifetimeForWeb }).(pulumi.IntOutput)
}

// URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
func (o LookupResourceServerResultOutput) VerificationLocation() pulumi.StringOutput {
	return o.ApplyT(func(v LookupResourceServerResult) string { return v.VerificationLocation }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupResourceServerResultOutput{})
}
