// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With this resource, you can set up APIs that can be consumed from your authorized applications.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := auth0.NewResourceServer(ctx, "myResourceServer", &auth0.ResourceServerArgs{
//				AllowOfflineAccess: pulumi.Bool(true),
//				Identifier:         pulumi.String("https://api.example.com"),
//				Scopes: auth0.ResourceServerScopeArray{
//					&auth0.ResourceServerScopeArgs{
//						Description: pulumi.String("Create foos"),
//						Value:       pulumi.String("create:foo"),
//					},
//					&auth0.ResourceServerScopeArgs{
//						Description: pulumi.String("Create bars"),
//						Value:       pulumi.String("create:bar"),
//					},
//				},
//				SigningAlg: pulumi.String("RS256"),
//				SkipConsentForVerifiableFirstPartyClients: pulumi.Bool(true),
//				TokenLifetime: pulumi.Int(8600),
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
// Existing resource servers can be imported using their ID. # Example
//
// ```sh
//
//	$ pulumi import auth0:index/resourceServer:ResourceServer my_resource_server XXXXXXXXXXXXXXXXXXXXXXX
//
// ```
type ResourceServer struct {
	pulumi.CustomResourceState

	// Indicates whether refresh tokens can be issued for this resource server.
	AllowOfflineAccess pulumi.BoolPtrOutput `pulumi:"allowOfflineAccess"`
	// If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
	EnforcePolicies pulumi.BoolOutput `pulumi:"enforcePolicies"`
	// Unique identifier for the resource server. Used as the audience parameter for authorization calls. Cannot be changed once set.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Friendly name for the resource server. Cannot include `<` or `>` characters.
	Name pulumi.StringOutput `pulumi:"name"`
	// Used to store additional metadata.
	Options pulumi.StringMapOutput `pulumi:"options"`
	// List of permissions (scopes) used by this resource server.
	Scopes ResourceServerScopeArrayOutput `pulumi:"scopes"`
	// Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
	SigningAlg pulumi.StringOutput `pulumi:"signingAlg"`
	// Secret used to sign tokens when using symmetric algorithms (HS256).
	SigningSecret pulumi.StringOutput `pulumi:"signingSecret"`
	// Indicates whether to skip user consent for applications flagged as first party.
	SkipConsentForVerifiableFirstPartyClients pulumi.BoolOutput `pulumi:"skipConsentForVerifiableFirstPartyClients"`
	// Dialect of access tokens that should be issued for this resource server. Options include `accessToken` or `accessTokenAuthz`. If this setting is set to `accessTokenAuthz`, the Permissions claim will be added to the access token. Only available if RBAC (`enforcePolicies`) is enabled for this API.
	TokenDialect pulumi.StringPtrOutput `pulumi:"tokenDialect"`
	// Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
	TokenLifetime pulumi.IntOutput `pulumi:"tokenLifetime"`
	// Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `tokenLifetime` value.
	TokenLifetimeForWeb pulumi.IntOutput `pulumi:"tokenLifetimeForWeb"`
	// URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
	VerificationLocation pulumi.StringPtrOutput `pulumi:"verificationLocation"`
}

// NewResourceServer registers a new resource with the given unique name, arguments, and options.
func NewResourceServer(ctx *pulumi.Context,
	name string, args *ResourceServerArgs, opts ...pulumi.ResourceOption) (*ResourceServer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	var resource ResourceServer
	err := ctx.RegisterResource("auth0:index/resourceServer:ResourceServer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResourceServer gets an existing ResourceServer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResourceServer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResourceServerState, opts ...pulumi.ResourceOption) (*ResourceServer, error) {
	var resource ResourceServer
	err := ctx.ReadResource("auth0:index/resourceServer:ResourceServer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResourceServer resources.
type resourceServerState struct {
	// Indicates whether refresh tokens can be issued for this resource server.
	AllowOfflineAccess *bool `pulumi:"allowOfflineAccess"`
	// If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
	EnforcePolicies *bool `pulumi:"enforcePolicies"`
	// Unique identifier for the resource server. Used as the audience parameter for authorization calls. Cannot be changed once set.
	Identifier *string `pulumi:"identifier"`
	// Friendly name for the resource server. Cannot include `<` or `>` characters.
	Name *string `pulumi:"name"`
	// Used to store additional metadata.
	Options map[string]string `pulumi:"options"`
	// List of permissions (scopes) used by this resource server.
	Scopes []ResourceServerScope `pulumi:"scopes"`
	// Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
	SigningAlg *string `pulumi:"signingAlg"`
	// Secret used to sign tokens when using symmetric algorithms (HS256).
	SigningSecret *string `pulumi:"signingSecret"`
	// Indicates whether to skip user consent for applications flagged as first party.
	SkipConsentForVerifiableFirstPartyClients *bool `pulumi:"skipConsentForVerifiableFirstPartyClients"`
	// Dialect of access tokens that should be issued for this resource server. Options include `accessToken` or `accessTokenAuthz`. If this setting is set to `accessTokenAuthz`, the Permissions claim will be added to the access token. Only available if RBAC (`enforcePolicies`) is enabled for this API.
	TokenDialect *string `pulumi:"tokenDialect"`
	// Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
	TokenLifetime *int `pulumi:"tokenLifetime"`
	// Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `tokenLifetime` value.
	TokenLifetimeForWeb *int `pulumi:"tokenLifetimeForWeb"`
	// URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
	VerificationLocation *string `pulumi:"verificationLocation"`
}

type ResourceServerState struct {
	// Indicates whether refresh tokens can be issued for this resource server.
	AllowOfflineAccess pulumi.BoolPtrInput
	// If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
	EnforcePolicies pulumi.BoolPtrInput
	// Unique identifier for the resource server. Used as the audience parameter for authorization calls. Cannot be changed once set.
	Identifier pulumi.StringPtrInput
	// Friendly name for the resource server. Cannot include `<` or `>` characters.
	Name pulumi.StringPtrInput
	// Used to store additional metadata.
	Options pulumi.StringMapInput
	// List of permissions (scopes) used by this resource server.
	Scopes ResourceServerScopeArrayInput
	// Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
	SigningAlg pulumi.StringPtrInput
	// Secret used to sign tokens when using symmetric algorithms (HS256).
	SigningSecret pulumi.StringPtrInput
	// Indicates whether to skip user consent for applications flagged as first party.
	SkipConsentForVerifiableFirstPartyClients pulumi.BoolPtrInput
	// Dialect of access tokens that should be issued for this resource server. Options include `accessToken` or `accessTokenAuthz`. If this setting is set to `accessTokenAuthz`, the Permissions claim will be added to the access token. Only available if RBAC (`enforcePolicies`) is enabled for this API.
	TokenDialect pulumi.StringPtrInput
	// Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
	TokenLifetime pulumi.IntPtrInput
	// Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `tokenLifetime` value.
	TokenLifetimeForWeb pulumi.IntPtrInput
	// URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
	VerificationLocation pulumi.StringPtrInput
}

func (ResourceServerState) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceServerState)(nil)).Elem()
}

type resourceServerArgs struct {
	// Indicates whether refresh tokens can be issued for this resource server.
	AllowOfflineAccess *bool `pulumi:"allowOfflineAccess"`
	// If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
	EnforcePolicies *bool `pulumi:"enforcePolicies"`
	// Unique identifier for the resource server. Used as the audience parameter for authorization calls. Cannot be changed once set.
	Identifier string `pulumi:"identifier"`
	// Friendly name for the resource server. Cannot include `<` or `>` characters.
	Name *string `pulumi:"name"`
	// Used to store additional metadata.
	Options map[string]string `pulumi:"options"`
	// List of permissions (scopes) used by this resource server.
	Scopes []ResourceServerScope `pulumi:"scopes"`
	// Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
	SigningAlg *string `pulumi:"signingAlg"`
	// Secret used to sign tokens when using symmetric algorithms (HS256).
	SigningSecret *string `pulumi:"signingSecret"`
	// Indicates whether to skip user consent for applications flagged as first party.
	SkipConsentForVerifiableFirstPartyClients *bool `pulumi:"skipConsentForVerifiableFirstPartyClients"`
	// Dialect of access tokens that should be issued for this resource server. Options include `accessToken` or `accessTokenAuthz`. If this setting is set to `accessTokenAuthz`, the Permissions claim will be added to the access token. Only available if RBAC (`enforcePolicies`) is enabled for this API.
	TokenDialect *string `pulumi:"tokenDialect"`
	// Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
	TokenLifetime *int `pulumi:"tokenLifetime"`
	// Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `tokenLifetime` value.
	TokenLifetimeForWeb *int `pulumi:"tokenLifetimeForWeb"`
	// URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
	VerificationLocation *string `pulumi:"verificationLocation"`
}

// The set of arguments for constructing a ResourceServer resource.
type ResourceServerArgs struct {
	// Indicates whether refresh tokens can be issued for this resource server.
	AllowOfflineAccess pulumi.BoolPtrInput
	// If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
	EnforcePolicies pulumi.BoolPtrInput
	// Unique identifier for the resource server. Used as the audience parameter for authorization calls. Cannot be changed once set.
	Identifier pulumi.StringInput
	// Friendly name for the resource server. Cannot include `<` or `>` characters.
	Name pulumi.StringPtrInput
	// Used to store additional metadata.
	Options pulumi.StringMapInput
	// List of permissions (scopes) used by this resource server.
	Scopes ResourceServerScopeArrayInput
	// Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
	SigningAlg pulumi.StringPtrInput
	// Secret used to sign tokens when using symmetric algorithms (HS256).
	SigningSecret pulumi.StringPtrInput
	// Indicates whether to skip user consent for applications flagged as first party.
	SkipConsentForVerifiableFirstPartyClients pulumi.BoolPtrInput
	// Dialect of access tokens that should be issued for this resource server. Options include `accessToken` or `accessTokenAuthz`. If this setting is set to `accessTokenAuthz`, the Permissions claim will be added to the access token. Only available if RBAC (`enforcePolicies`) is enabled for this API.
	TokenDialect pulumi.StringPtrInput
	// Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
	TokenLifetime pulumi.IntPtrInput
	// Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `tokenLifetime` value.
	TokenLifetimeForWeb pulumi.IntPtrInput
	// URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
	VerificationLocation pulumi.StringPtrInput
}

func (ResourceServerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*resourceServerArgs)(nil)).Elem()
}

type ResourceServerInput interface {
	pulumi.Input

	ToResourceServerOutput() ResourceServerOutput
	ToResourceServerOutputWithContext(ctx context.Context) ResourceServerOutput
}

func (*ResourceServer) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceServer)(nil)).Elem()
}

func (i *ResourceServer) ToResourceServerOutput() ResourceServerOutput {
	return i.ToResourceServerOutputWithContext(context.Background())
}

func (i *ResourceServer) ToResourceServerOutputWithContext(ctx context.Context) ResourceServerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceServerOutput)
}

// ResourceServerArrayInput is an input type that accepts ResourceServerArray and ResourceServerArrayOutput values.
// You can construct a concrete instance of `ResourceServerArrayInput` via:
//
//	ResourceServerArray{ ResourceServerArgs{...} }
type ResourceServerArrayInput interface {
	pulumi.Input

	ToResourceServerArrayOutput() ResourceServerArrayOutput
	ToResourceServerArrayOutputWithContext(context.Context) ResourceServerArrayOutput
}

type ResourceServerArray []ResourceServerInput

func (ResourceServerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceServer)(nil)).Elem()
}

func (i ResourceServerArray) ToResourceServerArrayOutput() ResourceServerArrayOutput {
	return i.ToResourceServerArrayOutputWithContext(context.Background())
}

func (i ResourceServerArray) ToResourceServerArrayOutputWithContext(ctx context.Context) ResourceServerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceServerArrayOutput)
}

// ResourceServerMapInput is an input type that accepts ResourceServerMap and ResourceServerMapOutput values.
// You can construct a concrete instance of `ResourceServerMapInput` via:
//
//	ResourceServerMap{ "key": ResourceServerArgs{...} }
type ResourceServerMapInput interface {
	pulumi.Input

	ToResourceServerMapOutput() ResourceServerMapOutput
	ToResourceServerMapOutputWithContext(context.Context) ResourceServerMapOutput
}

type ResourceServerMap map[string]ResourceServerInput

func (ResourceServerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceServer)(nil)).Elem()
}

func (i ResourceServerMap) ToResourceServerMapOutput() ResourceServerMapOutput {
	return i.ToResourceServerMapOutputWithContext(context.Background())
}

func (i ResourceServerMap) ToResourceServerMapOutputWithContext(ctx context.Context) ResourceServerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResourceServerMapOutput)
}

type ResourceServerOutput struct{ *pulumi.OutputState }

func (ResourceServerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResourceServer)(nil)).Elem()
}

func (o ResourceServerOutput) ToResourceServerOutput() ResourceServerOutput {
	return o
}

func (o ResourceServerOutput) ToResourceServerOutputWithContext(ctx context.Context) ResourceServerOutput {
	return o
}

// Indicates whether refresh tokens can be issued for this resource server.
func (o ResourceServerOutput) AllowOfflineAccess() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ResourceServer) pulumi.BoolPtrOutput { return v.AllowOfflineAccess }).(pulumi.BoolPtrOutput)
}

// If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
func (o ResourceServerOutput) EnforcePolicies() pulumi.BoolOutput {
	return o.ApplyT(func(v *ResourceServer) pulumi.BoolOutput { return v.EnforcePolicies }).(pulumi.BoolOutput)
}

// Unique identifier for the resource server. Used as the audience parameter for authorization calls. Cannot be changed once set.
func (o ResourceServerOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceServer) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Friendly name for the resource server. Cannot include `<` or `>` characters.
func (o ResourceServerOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceServer) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Used to store additional metadata.
func (o ResourceServerOutput) Options() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ResourceServer) pulumi.StringMapOutput { return v.Options }).(pulumi.StringMapOutput)
}

// List of permissions (scopes) used by this resource server.
func (o ResourceServerOutput) Scopes() ResourceServerScopeArrayOutput {
	return o.ApplyT(func(v *ResourceServer) ResourceServerScopeArrayOutput { return v.Scopes }).(ResourceServerScopeArrayOutput)
}

// Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
func (o ResourceServerOutput) SigningAlg() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceServer) pulumi.StringOutput { return v.SigningAlg }).(pulumi.StringOutput)
}

// Secret used to sign tokens when using symmetric algorithms (HS256).
func (o ResourceServerOutput) SigningSecret() pulumi.StringOutput {
	return o.ApplyT(func(v *ResourceServer) pulumi.StringOutput { return v.SigningSecret }).(pulumi.StringOutput)
}

// Indicates whether to skip user consent for applications flagged as first party.
func (o ResourceServerOutput) SkipConsentForVerifiableFirstPartyClients() pulumi.BoolOutput {
	return o.ApplyT(func(v *ResourceServer) pulumi.BoolOutput { return v.SkipConsentForVerifiableFirstPartyClients }).(pulumi.BoolOutput)
}

// Dialect of access tokens that should be issued for this resource server. Options include `accessToken` or `accessTokenAuthz`. If this setting is set to `accessTokenAuthz`, the Permissions claim will be added to the access token. Only available if RBAC (`enforcePolicies`) is enabled for this API.
func (o ResourceServerOutput) TokenDialect() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResourceServer) pulumi.StringPtrOutput { return v.TokenDialect }).(pulumi.StringPtrOutput)
}

// Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
func (o ResourceServerOutput) TokenLifetime() pulumi.IntOutput {
	return o.ApplyT(func(v *ResourceServer) pulumi.IntOutput { return v.TokenLifetime }).(pulumi.IntOutput)
}

// Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `tokenLifetime` value.
func (o ResourceServerOutput) TokenLifetimeForWeb() pulumi.IntOutput {
	return o.ApplyT(func(v *ResourceServer) pulumi.IntOutput { return v.TokenLifetimeForWeb }).(pulumi.IntOutput)
}

// URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
func (o ResourceServerOutput) VerificationLocation() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResourceServer) pulumi.StringPtrOutput { return v.VerificationLocation }).(pulumi.StringPtrOutput)
}

type ResourceServerArrayOutput struct{ *pulumi.OutputState }

func (ResourceServerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResourceServer)(nil)).Elem()
}

func (o ResourceServerArrayOutput) ToResourceServerArrayOutput() ResourceServerArrayOutput {
	return o
}

func (o ResourceServerArrayOutput) ToResourceServerArrayOutputWithContext(ctx context.Context) ResourceServerArrayOutput {
	return o
}

func (o ResourceServerArrayOutput) Index(i pulumi.IntInput) ResourceServerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResourceServer {
		return vs[0].([]*ResourceServer)[vs[1].(int)]
	}).(ResourceServerOutput)
}

type ResourceServerMapOutput struct{ *pulumi.OutputState }

func (ResourceServerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResourceServer)(nil)).Elem()
}

func (o ResourceServerMapOutput) ToResourceServerMapOutput() ResourceServerMapOutput {
	return o
}

func (o ResourceServerMapOutput) ToResourceServerMapOutputWithContext(ctx context.Context) ResourceServerMapOutput {
	return o
}

func (o ResourceServerMapOutput) MapIndex(k pulumi.StringInput) ResourceServerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResourceServer {
		return vs[0].(map[string]*ResourceServer)[vs[1].(string)]
	}).(ResourceServerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceServerInput)(nil)).Elem(), &ResourceServer{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceServerArrayInput)(nil)).Elem(), ResourceServerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResourceServerMapInput)(nil)).Elem(), ResourceServerMap{})
	pulumi.RegisterOutputType(ResourceServerOutput{})
	pulumi.RegisterOutputType(ResourceServerArrayOutput{})
	pulumi.RegisterOutputType(ResourceServerMapOutput{})
}
