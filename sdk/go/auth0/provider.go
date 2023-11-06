// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the auth0 package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	// Your Auth0 [management api access
	// token](https://auth0.com/docs/security/tokens/access-tokens/management-api-access-tokens). It can also be sourced from
	// the `AUTH0_API_TOKEN` environment variable. It can be used instead of `client_id` + `client_secret`. If both are
	// specified, `api_token` will be used over `client_id` + `client_secret` fields.
	ApiToken pulumi.StringPtrOutput `pulumi:"apiToken"`
	// Your Auth0 audience when using a custom domain. It can also be sourced from the `AUTH0_AUDIENCE` environment variable.
	Audience pulumi.StringPtrOutput `pulumi:"audience"`
	// Your Auth0 client ID. It can also be sourced from the `AUTH0_CLIENT_ID` environment variable.
	ClientId pulumi.StringPtrOutput `pulumi:"clientId"`
	// Your Auth0 client secret. It can also be sourced from the `AUTH0_CLIENT_SECRET` environment variable.
	ClientSecret pulumi.StringPtrOutput `pulumi:"clientSecret"`
	// Your Auth0 domain name. It can also be sourced from the `AUTH0_DOMAIN` environment variable.
	Domain pulumi.StringPtrOutput `pulumi:"domain"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	if args.Debug == nil {
		if d := internal.GetEnvOrDefault(nil, internal.ParseEnvBool, "AUTH0_DEBUG"); d != nil {
			args.Debug = pulumi.BoolPtr(d.(bool))
		}
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:auth0", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	// Your Auth0 [management api access
	// token](https://auth0.com/docs/security/tokens/access-tokens/management-api-access-tokens). It can also be sourced from
	// the `AUTH0_API_TOKEN` environment variable. It can be used instead of `client_id` + `client_secret`. If both are
	// specified, `api_token` will be used over `client_id` + `client_secret` fields.
	ApiToken *string `pulumi:"apiToken"`
	// Your Auth0 audience when using a custom domain. It can also be sourced from the `AUTH0_AUDIENCE` environment variable.
	Audience *string `pulumi:"audience"`
	// Your Auth0 client ID. It can also be sourced from the `AUTH0_CLIENT_ID` environment variable.
	ClientId *string `pulumi:"clientId"`
	// Your Auth0 client secret. It can also be sourced from the `AUTH0_CLIENT_SECRET` environment variable.
	ClientSecret *string `pulumi:"clientSecret"`
	// Indicates whether to turn on debug mode.
	Debug *bool `pulumi:"debug"`
	// Your Auth0 domain name. It can also be sourced from the `AUTH0_DOMAIN` environment variable.
	Domain *string `pulumi:"domain"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	// Your Auth0 [management api access
	// token](https://auth0.com/docs/security/tokens/access-tokens/management-api-access-tokens). It can also be sourced from
	// the `AUTH0_API_TOKEN` environment variable. It can be used instead of `client_id` + `client_secret`. If both are
	// specified, `api_token` will be used over `client_id` + `client_secret` fields.
	ApiToken pulumi.StringPtrInput
	// Your Auth0 audience when using a custom domain. It can also be sourced from the `AUTH0_AUDIENCE` environment variable.
	Audience pulumi.StringPtrInput
	// Your Auth0 client ID. It can also be sourced from the `AUTH0_CLIENT_ID` environment variable.
	ClientId pulumi.StringPtrInput
	// Your Auth0 client secret. It can also be sourced from the `AUTH0_CLIENT_SECRET` environment variable.
	ClientSecret pulumi.StringPtrInput
	// Indicates whether to turn on debug mode.
	Debug pulumi.BoolPtrInput
	// Your Auth0 domain name. It can also be sourced from the `AUTH0_DOMAIN` environment variable.
	Domain pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

// Your Auth0 [management api access
// token](https://auth0.com/docs/security/tokens/access-tokens/management-api-access-tokens). It can also be sourced from
// the `AUTH0_API_TOKEN` environment variable. It can be used instead of `client_id` + `client_secret`. If both are
// specified, `api_token` will be used over `client_id` + `client_secret` fields.
func (o ProviderOutput) ApiToken() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ApiToken }).(pulumi.StringPtrOutput)
}

// Your Auth0 audience when using a custom domain. It can also be sourced from the `AUTH0_AUDIENCE` environment variable.
func (o ProviderOutput) Audience() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Audience }).(pulumi.StringPtrOutput)
}

// Your Auth0 client ID. It can also be sourced from the `AUTH0_CLIENT_ID` environment variable.
func (o ProviderOutput) ClientId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ClientId }).(pulumi.StringPtrOutput)
}

// Your Auth0 client secret. It can also be sourced from the `AUTH0_CLIENT_SECRET` environment variable.
func (o ProviderOutput) ClientSecret() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.ClientSecret }).(pulumi.StringPtrOutput)
}

// Your Auth0 domain name. It can also be sourced from the `AUTH0_DOMAIN` environment variable.
func (o ProviderOutput) Domain() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Provider) pulumi.StringPtrOutput { return v.Domain }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}
