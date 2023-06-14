// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With this resource, you can configure the method to use when making requests to any endpoint that requires this client to authenticate.
//
// > Refer to the client secret rotation guide
// for instructions on how to rotate client secrets with zero downtime.
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
//			myClient, err := auth0.NewClient(ctx, "myClient", &auth0.ClientArgs{
//				AppType: pulumi.String("non_interactive"),
//				JwtConfiguration: &auth0.ClientJwtConfigurationArgs{
//					Alg: pulumi.String("RS256"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewClientCredentials(ctx, "testClientCredentials", &auth0.ClientCredentialsArgs{
//				ClientId:             myClient.ID(),
//				AuthenticationMethod: pulumi.String("client_secret_post"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewClientCredentials(ctx, "testIndex/clientCredentialsClientCredentials", &auth0.ClientCredentialsArgs{
//				ClientId:             myClient.ID(),
//				AuthenticationMethod: pulumi.String("client_secret_basic"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewClientCredentials(ctx, "testAuth0Index/clientCredentialsClientCredentials", &auth0.ClientCredentialsArgs{
//				ClientId:             myClient.ID(),
//				AuthenticationMethod: pulumi.String("none"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewClientCredentials(ctx, "testAuth0Index/clientCredentialsClientCredentials1", &auth0.ClientCredentialsArgs{
//				ClientId:             myClient.ID(),
//				AuthenticationMethod: pulumi.String("private_key_jwt"),
//				PrivateKeyJwt: &auth0.ClientCredentialsPrivateKeyJwtArgs{
//					Credentials: auth0.ClientCredentialsPrivateKeyJwtCredentialArray{
//						&auth0.ClientCredentialsPrivateKeyJwtCredentialArgs{
//							Name:                pulumi.String("Testing Credentials 1"),
//							CredentialType:      pulumi.String("public_key"),
//							Algorithm:           pulumi.String("RS256"),
//							ParseExpiryFromCert: pulumi.Bool(true),
//							Pem:                 pulumi.String("-----BEGIN CERTIFICATE-----\nMIIFWDCCA0ACCQDXqpBo3R...G9w0BAQsFADBuMQswCQYDVQQGEwJl\n-----END CERTIFICATE-----\n"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewClientCredentials(ctx, "testAuth0Index/clientCredentialsClientCredentials2", &auth0.ClientCredentialsArgs{
//				ClientId:             myClient.ID(),
//				AuthenticationMethod: pulumi.String("client_secret_basic"),
//				ClientSecret:         pulumi.String("LUFqPx+sRLjbL7peYRPFmFu-bbvE7u7og4YUNe_C345=683341"),
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
// A client credentials resource can be imported using the client's ID. # Example
//
// ```sh
//
//	$ pulumi import auth0:index/clientCredentials:ClientCredentials my_creds AaiyAPdpYdesoKnqjj8HJqRn4T5titww
//
// ```
//
//	~> Importing this resource when the `authentication_method` is set to `private_key_jwt` will force the resource to be recreated. This is to be expected, because the pem file can't be checked for differences.
type ClientCredentials struct {
	pulumi.CustomResourceState

	// Configure the method to use when making requests to any endpoint that requires this client to authenticate. Options include `none` (public client without a client secret), `clientSecretPost` (confidential client using HTTP POST parameters), `clientSecretBasic` (confidential client using HTTP Basic), `privateKeyJwt` (confidential client using a Private Key JWT).
	AuthenticationMethod pulumi.StringOutput `pulumi:"authenticationMethod"`
	// The ID of the client for which to configure the authentication method.
	ClientId pulumi.StringOutput `pulumi:"clientId"`
	// Secret for the client when using `client_secret_post` or `client_secret_basic` authentication method. Keep this private.
	// To access this attribute you need to add the `read:client_keys` scope to the Terraform client. Otherwise, the attribute
	// will contain an empty string. The attribute will also be an empty string in case `private_key_jwt` is selected as an
	// authentication method.
	ClientSecret pulumi.StringOutput `pulumi:"clientSecret"`
	// Defines `privateKeyJwt` client authentication method.
	PrivateKeyJwt ClientCredentialsPrivateKeyJwtPtrOutput `pulumi:"privateKeyJwt"`
}

// NewClientCredentials registers a new resource with the given unique name, arguments, and options.
func NewClientCredentials(ctx *pulumi.Context,
	name string, args *ClientCredentialsArgs, opts ...pulumi.ResourceOption) (*ClientCredentials, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AuthenticationMethod == nil {
		return nil, errors.New("invalid value for required argument 'AuthenticationMethod'")
	}
	if args.ClientId == nil {
		return nil, errors.New("invalid value for required argument 'ClientId'")
	}
	if args.ClientSecret != nil {
		args.ClientSecret = pulumi.ToSecret(args.ClientSecret).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"clientSecret",
	})
	opts = append(opts, secrets)
	var resource ClientCredentials
	err := ctx.RegisterResource("auth0:index/clientCredentials:ClientCredentials", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClientCredentials gets an existing ClientCredentials resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClientCredentials(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClientCredentialsState, opts ...pulumi.ResourceOption) (*ClientCredentials, error) {
	var resource ClientCredentials
	err := ctx.ReadResource("auth0:index/clientCredentials:ClientCredentials", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClientCredentials resources.
type clientCredentialsState struct {
	// Configure the method to use when making requests to any endpoint that requires this client to authenticate. Options include `none` (public client without a client secret), `clientSecretPost` (confidential client using HTTP POST parameters), `clientSecretBasic` (confidential client using HTTP Basic), `privateKeyJwt` (confidential client using a Private Key JWT).
	AuthenticationMethod *string `pulumi:"authenticationMethod"`
	// The ID of the client for which to configure the authentication method.
	ClientId *string `pulumi:"clientId"`
	// Secret for the client when using `client_secret_post` or `client_secret_basic` authentication method. Keep this private.
	// To access this attribute you need to add the `read:client_keys` scope to the Terraform client. Otherwise, the attribute
	// will contain an empty string. The attribute will also be an empty string in case `private_key_jwt` is selected as an
	// authentication method.
	ClientSecret *string `pulumi:"clientSecret"`
	// Defines `privateKeyJwt` client authentication method.
	PrivateKeyJwt *ClientCredentialsPrivateKeyJwt `pulumi:"privateKeyJwt"`
}

type ClientCredentialsState struct {
	// Configure the method to use when making requests to any endpoint that requires this client to authenticate. Options include `none` (public client without a client secret), `clientSecretPost` (confidential client using HTTP POST parameters), `clientSecretBasic` (confidential client using HTTP Basic), `privateKeyJwt` (confidential client using a Private Key JWT).
	AuthenticationMethod pulumi.StringPtrInput
	// The ID of the client for which to configure the authentication method.
	ClientId pulumi.StringPtrInput
	// Secret for the client when using `client_secret_post` or `client_secret_basic` authentication method. Keep this private.
	// To access this attribute you need to add the `read:client_keys` scope to the Terraform client. Otherwise, the attribute
	// will contain an empty string. The attribute will also be an empty string in case `private_key_jwt` is selected as an
	// authentication method.
	ClientSecret pulumi.StringPtrInput
	// Defines `privateKeyJwt` client authentication method.
	PrivateKeyJwt ClientCredentialsPrivateKeyJwtPtrInput
}

func (ClientCredentialsState) ElementType() reflect.Type {
	return reflect.TypeOf((*clientCredentialsState)(nil)).Elem()
}

type clientCredentialsArgs struct {
	// Configure the method to use when making requests to any endpoint that requires this client to authenticate. Options include `none` (public client without a client secret), `clientSecretPost` (confidential client using HTTP POST parameters), `clientSecretBasic` (confidential client using HTTP Basic), `privateKeyJwt` (confidential client using a Private Key JWT).
	AuthenticationMethod string `pulumi:"authenticationMethod"`
	// The ID of the client for which to configure the authentication method.
	ClientId string `pulumi:"clientId"`
	// Secret for the client when using `client_secret_post` or `client_secret_basic` authentication method. Keep this private.
	// To access this attribute you need to add the `read:client_keys` scope to the Terraform client. Otherwise, the attribute
	// will contain an empty string. The attribute will also be an empty string in case `private_key_jwt` is selected as an
	// authentication method.
	ClientSecret *string `pulumi:"clientSecret"`
	// Defines `privateKeyJwt` client authentication method.
	PrivateKeyJwt *ClientCredentialsPrivateKeyJwt `pulumi:"privateKeyJwt"`
}

// The set of arguments for constructing a ClientCredentials resource.
type ClientCredentialsArgs struct {
	// Configure the method to use when making requests to any endpoint that requires this client to authenticate. Options include `none` (public client without a client secret), `clientSecretPost` (confidential client using HTTP POST parameters), `clientSecretBasic` (confidential client using HTTP Basic), `privateKeyJwt` (confidential client using a Private Key JWT).
	AuthenticationMethod pulumi.StringInput
	// The ID of the client for which to configure the authentication method.
	ClientId pulumi.StringInput
	// Secret for the client when using `client_secret_post` or `client_secret_basic` authentication method. Keep this private.
	// To access this attribute you need to add the `read:client_keys` scope to the Terraform client. Otherwise, the attribute
	// will contain an empty string. The attribute will also be an empty string in case `private_key_jwt` is selected as an
	// authentication method.
	ClientSecret pulumi.StringPtrInput
	// Defines `privateKeyJwt` client authentication method.
	PrivateKeyJwt ClientCredentialsPrivateKeyJwtPtrInput
}

func (ClientCredentialsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clientCredentialsArgs)(nil)).Elem()
}

type ClientCredentialsInput interface {
	pulumi.Input

	ToClientCredentialsOutput() ClientCredentialsOutput
	ToClientCredentialsOutputWithContext(ctx context.Context) ClientCredentialsOutput
}

func (*ClientCredentials) ElementType() reflect.Type {
	return reflect.TypeOf((**ClientCredentials)(nil)).Elem()
}

func (i *ClientCredentials) ToClientCredentialsOutput() ClientCredentialsOutput {
	return i.ToClientCredentialsOutputWithContext(context.Background())
}

func (i *ClientCredentials) ToClientCredentialsOutputWithContext(ctx context.Context) ClientCredentialsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClientCredentialsOutput)
}

// ClientCredentialsArrayInput is an input type that accepts ClientCredentialsArray and ClientCredentialsArrayOutput values.
// You can construct a concrete instance of `ClientCredentialsArrayInput` via:
//
//	ClientCredentialsArray{ ClientCredentialsArgs{...} }
type ClientCredentialsArrayInput interface {
	pulumi.Input

	ToClientCredentialsArrayOutput() ClientCredentialsArrayOutput
	ToClientCredentialsArrayOutputWithContext(context.Context) ClientCredentialsArrayOutput
}

type ClientCredentialsArray []ClientCredentialsInput

func (ClientCredentialsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClientCredentials)(nil)).Elem()
}

func (i ClientCredentialsArray) ToClientCredentialsArrayOutput() ClientCredentialsArrayOutput {
	return i.ToClientCredentialsArrayOutputWithContext(context.Background())
}

func (i ClientCredentialsArray) ToClientCredentialsArrayOutputWithContext(ctx context.Context) ClientCredentialsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClientCredentialsArrayOutput)
}

// ClientCredentialsMapInput is an input type that accepts ClientCredentialsMap and ClientCredentialsMapOutput values.
// You can construct a concrete instance of `ClientCredentialsMapInput` via:
//
//	ClientCredentialsMap{ "key": ClientCredentialsArgs{...} }
type ClientCredentialsMapInput interface {
	pulumi.Input

	ToClientCredentialsMapOutput() ClientCredentialsMapOutput
	ToClientCredentialsMapOutputWithContext(context.Context) ClientCredentialsMapOutput
}

type ClientCredentialsMap map[string]ClientCredentialsInput

func (ClientCredentialsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClientCredentials)(nil)).Elem()
}

func (i ClientCredentialsMap) ToClientCredentialsMapOutput() ClientCredentialsMapOutput {
	return i.ToClientCredentialsMapOutputWithContext(context.Background())
}

func (i ClientCredentialsMap) ToClientCredentialsMapOutputWithContext(ctx context.Context) ClientCredentialsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClientCredentialsMapOutput)
}

type ClientCredentialsOutput struct{ *pulumi.OutputState }

func (ClientCredentialsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClientCredentials)(nil)).Elem()
}

func (o ClientCredentialsOutput) ToClientCredentialsOutput() ClientCredentialsOutput {
	return o
}

func (o ClientCredentialsOutput) ToClientCredentialsOutputWithContext(ctx context.Context) ClientCredentialsOutput {
	return o
}

// Configure the method to use when making requests to any endpoint that requires this client to authenticate. Options include `none` (public client without a client secret), `clientSecretPost` (confidential client using HTTP POST parameters), `clientSecretBasic` (confidential client using HTTP Basic), `privateKeyJwt` (confidential client using a Private Key JWT).
func (o ClientCredentialsOutput) AuthenticationMethod() pulumi.StringOutput {
	return o.ApplyT(func(v *ClientCredentials) pulumi.StringOutput { return v.AuthenticationMethod }).(pulumi.StringOutput)
}

// The ID of the client for which to configure the authentication method.
func (o ClientCredentialsOutput) ClientId() pulumi.StringOutput {
	return o.ApplyT(func(v *ClientCredentials) pulumi.StringOutput { return v.ClientId }).(pulumi.StringOutput)
}

// Secret for the client when using `client_secret_post` or `client_secret_basic` authentication method. Keep this private.
// To access this attribute you need to add the `read:client_keys` scope to the Terraform client. Otherwise, the attribute
// will contain an empty string. The attribute will also be an empty string in case `private_key_jwt` is selected as an
// authentication method.
func (o ClientCredentialsOutput) ClientSecret() pulumi.StringOutput {
	return o.ApplyT(func(v *ClientCredentials) pulumi.StringOutput { return v.ClientSecret }).(pulumi.StringOutput)
}

// Defines `privateKeyJwt` client authentication method.
func (o ClientCredentialsOutput) PrivateKeyJwt() ClientCredentialsPrivateKeyJwtPtrOutput {
	return o.ApplyT(func(v *ClientCredentials) ClientCredentialsPrivateKeyJwtPtrOutput { return v.PrivateKeyJwt }).(ClientCredentialsPrivateKeyJwtPtrOutput)
}

type ClientCredentialsArrayOutput struct{ *pulumi.OutputState }

func (ClientCredentialsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClientCredentials)(nil)).Elem()
}

func (o ClientCredentialsArrayOutput) ToClientCredentialsArrayOutput() ClientCredentialsArrayOutput {
	return o
}

func (o ClientCredentialsArrayOutput) ToClientCredentialsArrayOutputWithContext(ctx context.Context) ClientCredentialsArrayOutput {
	return o
}

func (o ClientCredentialsArrayOutput) Index(i pulumi.IntInput) ClientCredentialsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClientCredentials {
		return vs[0].([]*ClientCredentials)[vs[1].(int)]
	}).(ClientCredentialsOutput)
}

type ClientCredentialsMapOutput struct{ *pulumi.OutputState }

func (ClientCredentialsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClientCredentials)(nil)).Elem()
}

func (o ClientCredentialsMapOutput) ToClientCredentialsMapOutput() ClientCredentialsMapOutput {
	return o
}

func (o ClientCredentialsMapOutput) ToClientCredentialsMapOutputWithContext(ctx context.Context) ClientCredentialsMapOutput {
	return o
}

func (o ClientCredentialsMapOutput) MapIndex(k pulumi.StringInput) ClientCredentialsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClientCredentials {
		return vs[0].(map[string]*ClientCredentials)[vs[1].(string)]
	}).(ClientCredentialsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClientCredentialsInput)(nil)).Elem(), &ClientCredentials{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClientCredentialsArrayInput)(nil)).Elem(), ClientCredentialsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClientCredentialsMapInput)(nil)).Elem(), ClientCredentialsMap{})
	pulumi.RegisterOutputType(ClientCredentialsOutput{})
	pulumi.RegisterOutputType(ClientCredentialsArrayOutput{})
	pulumi.RegisterOutputType(ClientCredentialsMapOutput{})
}
