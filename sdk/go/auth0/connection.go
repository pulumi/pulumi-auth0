// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With Auth0, you can define sources of users, otherwise known as connections, which may include identity providers (such as Google or LinkedIn), databases, or passwordless authentication methods. This resource allows you to configure and manage connections to be used with your clients and users.
//
// > The Auth0 dashboard displays only one connection per social provider. Although the Auth0 Management API allows the
// creation of multiple connections per strategy, the additional connections may not be visible in the Auth0 dashboard.
//
// ## Example Usage
// ### Google OAuth2 Connection
//
// > Your Auth0 account may be pre-configured with a `google-oauth2` connection.
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
//			_, err := auth0.NewConnection(ctx, "googleOauth2", &auth0.ConnectionArgs{
//				Options: &auth0.ConnectionOptionsArgs{
//					AllowedAudiences: pulumi.StringArray{
//						pulumi.String("example.com"),
//						pulumi.String("api.example.com"),
//					},
//					ClientId:     pulumi.String("<client-id>"),
//					ClientSecret: pulumi.String("<client-secret>"),
//					NonPersistentAttrs: pulumi.StringArray{
//						pulumi.String("ethnicity"),
//						pulumi.String("gender"),
//					},
//					Scopes: pulumi.StringArray{
//						pulumi.String("email"),
//						pulumi.String("profile"),
//						pulumi.String("gmail"),
//						pulumi.String("youtube"),
//					},
//					SetUserRootAttributes: pulumi.String("on_each_login"),
//				},
//				Strategy: pulumi.String("google-oauth2"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Facebook Connection
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
//			_, err := auth0.NewConnection(ctx, "facebook", &auth0.ConnectionArgs{
//				Options: &auth0.ConnectionOptionsArgs{
//					ClientId:     pulumi.String("<client-id>"),
//					ClientSecret: pulumi.String("<client-secret>"),
//					NonPersistentAttrs: pulumi.StringArray{
//						pulumi.String("ethnicity"),
//						pulumi.String("gender"),
//					},
//					Scopes: pulumi.StringArray{
//						pulumi.String("public_profile"),
//						pulumi.String("email"),
//						pulumi.String("groups_access_member_info"),
//						pulumi.String("user_birthday"),
//					},
//					SetUserRootAttributes: pulumi.String("on_each_login"),
//				},
//				Strategy: pulumi.String("facebook"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Apple Connection
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
//			_, err := auth0.NewConnection(ctx, "apple", &auth0.ConnectionArgs{
//				Options: &auth0.ConnectionOptionsArgs{
//					ClientId:     pulumi.String("<client-id>"),
//					ClientSecret: pulumi.String("-----BEGIN PRIVATE KEY-----\nMIHBAgEAMA0GCSqGSIb3DQEBAQUABIGsMIGpAgEAA\n-----END PRIVATE KEY-----\n"),
//					KeyId:        pulumi.String("<key-id>"),
//					NonPersistentAttrs: pulumi.StringArray{
//						pulumi.String("ethnicity"),
//						pulumi.String("gender"),
//					},
//					Scopes: pulumi.StringArray{
//						pulumi.String("email"),
//						pulumi.String("name"),
//					},
//					SetUserRootAttributes: pulumi.String("on_first_login"),
//					TeamId:                pulumi.String("<team-id>"),
//				},
//				Strategy: pulumi.String("apple"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### LinkedIn Connection
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
//			_, err := auth0.NewConnection(ctx, "linkedin", &auth0.ConnectionArgs{
//				Options: &auth0.ConnectionOptionsArgs{
//					ClientId:     pulumi.String("<client-id>"),
//					ClientSecret: pulumi.String("<client-secret>"),
//					NonPersistentAttrs: pulumi.StringArray{
//						pulumi.String("ethnicity"),
//						pulumi.String("gender"),
//					},
//					Scopes: pulumi.StringArray{
//						pulumi.String("basic_profile"),
//						pulumi.String("profile"),
//						pulumi.String("email"),
//					},
//					SetUserRootAttributes: pulumi.String("on_each_login"),
//					StrategyVersion:       pulumi.Int(2),
//				},
//				Strategy: pulumi.String("linkedin"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### GitHub Connection
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
//			_, err := auth0.NewConnection(ctx, "github", &auth0.ConnectionArgs{
//				Options: &auth0.ConnectionOptionsArgs{
//					ClientId:     pulumi.String("<client-id>"),
//					ClientSecret: pulumi.String("<client-secret>"),
//					NonPersistentAttrs: pulumi.StringArray{
//						pulumi.String("ethnicity"),
//						pulumi.String("gender"),
//					},
//					Scopes: pulumi.StringArray{
//						pulumi.String("email"),
//						pulumi.String("profile"),
//						pulumi.String("public_repo"),
//						pulumi.String("repo"),
//					},
//					SetUserRootAttributes: pulumi.String("on_each_login"),
//				},
//				Strategy: pulumi.String("github"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### SalesForce Connection
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
//			_, err := auth0.NewConnection(ctx, "salesforce", &auth0.ConnectionArgs{
//				Options: &auth0.ConnectionOptionsArgs{
//					ClientId:         pulumi.String("<client-id>"),
//					ClientSecret:     pulumi.String("<client-secret>"),
//					CommunityBaseUrl: pulumi.String("https://salesforce.example.com"),
//					NonPersistentAttrs: pulumi.StringArray{
//						pulumi.String("ethnicity"),
//						pulumi.String("gender"),
//					},
//					Scopes: pulumi.StringArray{
//						pulumi.String("openid"),
//						pulumi.String("email"),
//					},
//					SetUserRootAttributes: pulumi.String("on_first_login"),
//				},
//				Strategy: pulumi.String("salesforce"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### OAuth2 Connection
//
// Also applies to following connection strategies: `dropbox`, `bitbucket`, `paypal`, `twitter`, `amazon`, `yahoo`, `box`, `wordpress`, `shopify`, `custom`
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
//			_, err := auth0.NewConnection(ctx, "oauth2", &auth0.ConnectionArgs{
//				Options: &auth0.ConnectionOptionsArgs{
//					AuthorizationEndpoint: pulumi.String("https://auth.example.com/oauth2/authorize"),
//					ClientId:              pulumi.String("<client-id>"),
//					ClientSecret:          pulumi.String("<client-secret>"),
//					IconUrl:               pulumi.String("https://auth.example.com/assets/logo.png"),
//					NonPersistentAttrs: pulumi.StringArray{
//						pulumi.String("ethnicity"),
//						pulumi.String("gender"),
//					},
//					PkceEnabled: pulumi.Bool(true),
//					Scopes: pulumi.StringArray{
//						pulumi.String("basic_profile"),
//						pulumi.String("profile"),
//						pulumi.String("email"),
//					},
//					Scripts: pulumi.StringMap{
//						"fetchUserProfile": pulumi.String("        function fetchUserProfile(accessToken, context, callback) {\n          return callback(new Error(\"Whoops!\"));\n        }\n      \n"),
//					},
//					SetUserRootAttributes: pulumi.String("on_each_login"),
//					TokenEndpoint:         pulumi.String("https://auth.example.com/oauth2/token"),
//				},
//				Strategy: pulumi.String("oauth2"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### SMS Connection
//
// > To be able to see this in the management dashboard as well, the name of the connection must be set to "sms".
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
//			_, err := auth0.NewConnection(ctx, "sms", &auth0.ConnectionArgs{
//				IsDomainConnection: pulumi.Bool(false),
//				Options: &auth0.ConnectionOptionsArgs{
//					BruteForceProtection: pulumi.Bool(true),
//					DisableSignup:        pulumi.Bool(false),
//					ForwardRequestInfo:   pulumi.Bool(true),
//					From:                 pulumi.String("+15555555555"),
//					GatewayAuthentication: &auth0.ConnectionOptionsGatewayAuthenticationArgs{
//						Audience:            pulumi.String("https://somewhere.com/sms-gateway"),
//						Method:              pulumi.String("bearer"),
//						Secret:              pulumi.String("4e2680bb74ec2ae24736476dd37ed6c2"),
//						SecretBase64Encoded: pulumi.Bool(false),
//						Subject:             pulumi.String("test.us.auth0.com:sms"),
//					},
//					GatewayUrl: pulumi.String("https://somewhere.com/sms-gateway"),
//					Name:       pulumi.String("sms"),
//					Provider:   pulumi.String("sms_gateway"),
//					Syntax:     pulumi.String("md_with_macros"),
//					Template:   pulumi.String("@@password@@"),
//					Totp: &auth0.ConnectionOptionsTotpArgs{
//						Length:   pulumi.Int(6),
//						TimeStep: pulumi.Int(300),
//					},
//				},
//				Strategy: pulumi.String("sms"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Email Connection
//
// > To be able to see this in the management dashboard as well, the name of the connection must be set to "email".
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
//			_, err := auth0.NewConnection(ctx, "passwordlessEmail", &auth0.ConnectionArgs{
//				Options: &auth0.ConnectionOptionsArgs{
//					AuthParams: pulumi.StringMap{
//						"responseType": pulumi.String("code"),
//						"scope":        pulumi.String("openid email profile offline_access"),
//					},
//					BruteForceProtection:  pulumi.Bool(true),
//					DisableSignup:         pulumi.Bool(false),
//					From:                  pulumi.String("{{ application.name }} <root@auth0.com>"),
//					Name:                  pulumi.String("email"),
//					NonPersistentAttrs:    pulumi.StringArray{},
//					SetUserRootAttributes: pulumi.String("on_each_login"),
//					Subject:               pulumi.String("Welcome to {{ application.name }}"),
//					Syntax:                pulumi.String("liquid"),
//					Template:              pulumi.String("<html>This is the body of the email</html>"),
//					Totp: &auth0.ConnectionOptionsTotpArgs{
//						Length:   pulumi.Int(6),
//						TimeStep: pulumi.Int(300),
//					},
//				},
//				Strategy: pulumi.String("email"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### WindowsLive Connection
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
//			_, err := auth0.NewConnection(ctx, "windowslive", &auth0.ConnectionArgs{
//				Options: &auth0.ConnectionOptionsArgs{
//					ClientId:     pulumi.String("<client-id>"),
//					ClientSecret: pulumi.String("<client-secret>"),
//					NonPersistentAttrs: pulumi.StringArray{
//						pulumi.String("ethnicity"),
//						pulumi.String("gender"),
//					},
//					Scopes: pulumi.StringArray{
//						pulumi.String("signin"),
//						pulumi.String("graph_user"),
//					},
//					SetUserRootAttributes: pulumi.String("on_first_login"),
//					StrategyVersion:       pulumi.Int(2),
//				},
//				Strategy: pulumi.String("windowslive"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### OIDC Connection
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
//			_, err := auth0.NewConnection(ctx, "oidc", &auth0.ConnectionArgs{
//				DisplayName: pulumi.String("OIDC Connection"),
//				Options: &auth0.ConnectionOptionsArgs{
//					AuthorizationEndpoint: pulumi.String("https://www.paypal.com/signin/authorize"),
//					ClientId:              pulumi.String("1234567"),
//					ClientSecret:          pulumi.String("1234567"),
//					DiscoveryUrl:          pulumi.String("https://www.paypalobjects.com/.well-known/openid-configuration"),
//					DomainAliases: pulumi.StringArray{
//						pulumi.String("example.com"),
//					},
//					IconUrl: pulumi.String("https://example.com/assets/logo.png"),
//					Issuer:  pulumi.String("https://www.paypalobjects.com"),
//					JwksUri: pulumi.String("https://api.paypal.com/v1/oauth2/certs"),
//					NonPersistentAttrs: pulumi.StringArray{
//						pulumi.String("ethnicity"),
//						pulumi.String("gender"),
//					},
//					Scopes: pulumi.StringArray{
//						pulumi.String("openid"),
//						pulumi.String("email"),
//					},
//					SetUserRootAttributes: pulumi.String("on_first_login"),
//					TenantDomain:          pulumi.String(""),
//					TokenEndpoint:         pulumi.String("https://api.paypal.com/v1/oauth2/token"),
//					Type:                  pulumi.String("front_channel"),
//					UserinfoEndpoint:      pulumi.String("https://api.paypal.com/v1/oauth2/token/userinfo"),
//				},
//				ShowAsButton: pulumi.Bool(false),
//				Strategy:     pulumi.String("oidc"),
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
// Connections can be imported using their ID. # Example
//
// ```sh
//
//	$ pulumi import auth0:index/connection:Connection google con_a17f21fdb24d48a0
//
// ```
type Connection struct {
	pulumi.CustomResourceState

	// Name used in login screen.
	DisplayName pulumi.StringPtrOutput `pulumi:"displayName"`
	// IDs of the clients for which the connection is enabled. Reading the enabled clients through this attribute is deprecated and it will be removed in a future major version. Use the `Connection` data source instead.
	EnabledClients pulumi.StringArrayOutput `pulumi:"enabledClients"`
	// Indicates whether the connection is domain level.
	IsDomainConnection pulumi.BoolOutput `pulumi:"isDomainConnection"`
	// Metadata associated with the connection, in the form of a map of string values (max 255 chars).
	Metadata pulumi.StringMapOutput `pulumi:"metadata"`
	// Name of the connection.
	Name pulumi.StringOutput `pulumi:"name"`
	// Configuration settings for connection options.
	Options ConnectionOptionsOutput `pulumi:"options"`
	// Defines the realms for which the connection will be used (e.g., email domains). If not specified, the connection name is added as the realm.
	Realms pulumi.StringArrayOutput `pulumi:"realms"`
	// Display connection as a button. Only available on enterprise connections.
	ShowAsButton pulumi.BoolPtrOutput `pulumi:"showAsButton"`
	// Type of the connection, which indicates the identity provider.
	Strategy pulumi.StringOutput `pulumi:"strategy"`
}

// NewConnection registers a new resource with the given unique name, arguments, and options.
func NewConnection(ctx *pulumi.Context,
	name string, args *ConnectionArgs, opts ...pulumi.ResourceOption) (*Connection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Strategy == nil {
		return nil, errors.New("invalid value for required argument 'Strategy'")
	}
	var resource Connection
	err := ctx.RegisterResource("auth0:index/connection:Connection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnection gets an existing Connection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectionState, opts ...pulumi.ResourceOption) (*Connection, error) {
	var resource Connection
	err := ctx.ReadResource("auth0:index/connection:Connection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Connection resources.
type connectionState struct {
	// Name used in login screen.
	DisplayName *string `pulumi:"displayName"`
	// IDs of the clients for which the connection is enabled. Reading the enabled clients through this attribute is deprecated and it will be removed in a future major version. Use the `Connection` data source instead.
	EnabledClients []string `pulumi:"enabledClients"`
	// Indicates whether the connection is domain level.
	IsDomainConnection *bool `pulumi:"isDomainConnection"`
	// Metadata associated with the connection, in the form of a map of string values (max 255 chars).
	Metadata map[string]string `pulumi:"metadata"`
	// Name of the connection.
	Name *string `pulumi:"name"`
	// Configuration settings for connection options.
	Options *ConnectionOptions `pulumi:"options"`
	// Defines the realms for which the connection will be used (e.g., email domains). If not specified, the connection name is added as the realm.
	Realms []string `pulumi:"realms"`
	// Display connection as a button. Only available on enterprise connections.
	ShowAsButton *bool `pulumi:"showAsButton"`
	// Type of the connection, which indicates the identity provider.
	Strategy *string `pulumi:"strategy"`
}

type ConnectionState struct {
	// Name used in login screen.
	DisplayName pulumi.StringPtrInput
	// IDs of the clients for which the connection is enabled. Reading the enabled clients through this attribute is deprecated and it will be removed in a future major version. Use the `Connection` data source instead.
	EnabledClients pulumi.StringArrayInput
	// Indicates whether the connection is domain level.
	IsDomainConnection pulumi.BoolPtrInput
	// Metadata associated with the connection, in the form of a map of string values (max 255 chars).
	Metadata pulumi.StringMapInput
	// Name of the connection.
	Name pulumi.StringPtrInput
	// Configuration settings for connection options.
	Options ConnectionOptionsPtrInput
	// Defines the realms for which the connection will be used (e.g., email domains). If not specified, the connection name is added as the realm.
	Realms pulumi.StringArrayInput
	// Display connection as a button. Only available on enterprise connections.
	ShowAsButton pulumi.BoolPtrInput
	// Type of the connection, which indicates the identity provider.
	Strategy pulumi.StringPtrInput
}

func (ConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionState)(nil)).Elem()
}

type connectionArgs struct {
	// Name used in login screen.
	DisplayName *string `pulumi:"displayName"`
	// Indicates whether the connection is domain level.
	IsDomainConnection *bool `pulumi:"isDomainConnection"`
	// Metadata associated with the connection, in the form of a map of string values (max 255 chars).
	Metadata map[string]string `pulumi:"metadata"`
	// Name of the connection.
	Name *string `pulumi:"name"`
	// Configuration settings for connection options.
	Options *ConnectionOptions `pulumi:"options"`
	// Defines the realms for which the connection will be used (e.g., email domains). If not specified, the connection name is added as the realm.
	Realms []string `pulumi:"realms"`
	// Display connection as a button. Only available on enterprise connections.
	ShowAsButton *bool `pulumi:"showAsButton"`
	// Type of the connection, which indicates the identity provider.
	Strategy string `pulumi:"strategy"`
}

// The set of arguments for constructing a Connection resource.
type ConnectionArgs struct {
	// Name used in login screen.
	DisplayName pulumi.StringPtrInput
	// Indicates whether the connection is domain level.
	IsDomainConnection pulumi.BoolPtrInput
	// Metadata associated with the connection, in the form of a map of string values (max 255 chars).
	Metadata pulumi.StringMapInput
	// Name of the connection.
	Name pulumi.StringPtrInput
	// Configuration settings for connection options.
	Options ConnectionOptionsPtrInput
	// Defines the realms for which the connection will be used (e.g., email domains). If not specified, the connection name is added as the realm.
	Realms pulumi.StringArrayInput
	// Display connection as a button. Only available on enterprise connections.
	ShowAsButton pulumi.BoolPtrInput
	// Type of the connection, which indicates the identity provider.
	Strategy pulumi.StringInput
}

func (ConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionArgs)(nil)).Elem()
}

type ConnectionInput interface {
	pulumi.Input

	ToConnectionOutput() ConnectionOutput
	ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput
}

func (*Connection) ElementType() reflect.Type {
	return reflect.TypeOf((**Connection)(nil)).Elem()
}

func (i *Connection) ToConnectionOutput() ConnectionOutput {
	return i.ToConnectionOutputWithContext(context.Background())
}

func (i *Connection) ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionOutput)
}

// ConnectionArrayInput is an input type that accepts ConnectionArray and ConnectionArrayOutput values.
// You can construct a concrete instance of `ConnectionArrayInput` via:
//
//	ConnectionArray{ ConnectionArgs{...} }
type ConnectionArrayInput interface {
	pulumi.Input

	ToConnectionArrayOutput() ConnectionArrayOutput
	ToConnectionArrayOutputWithContext(context.Context) ConnectionArrayOutput
}

type ConnectionArray []ConnectionInput

func (ConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connection)(nil)).Elem()
}

func (i ConnectionArray) ToConnectionArrayOutput() ConnectionArrayOutput {
	return i.ToConnectionArrayOutputWithContext(context.Background())
}

func (i ConnectionArray) ToConnectionArrayOutputWithContext(ctx context.Context) ConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionArrayOutput)
}

// ConnectionMapInput is an input type that accepts ConnectionMap and ConnectionMapOutput values.
// You can construct a concrete instance of `ConnectionMapInput` via:
//
//	ConnectionMap{ "key": ConnectionArgs{...} }
type ConnectionMapInput interface {
	pulumi.Input

	ToConnectionMapOutput() ConnectionMapOutput
	ToConnectionMapOutputWithContext(context.Context) ConnectionMapOutput
}

type ConnectionMap map[string]ConnectionInput

func (ConnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connection)(nil)).Elem()
}

func (i ConnectionMap) ToConnectionMapOutput() ConnectionMapOutput {
	return i.ToConnectionMapOutputWithContext(context.Background())
}

func (i ConnectionMap) ToConnectionMapOutputWithContext(ctx context.Context) ConnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionMapOutput)
}

type ConnectionOutput struct{ *pulumi.OutputState }

func (ConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Connection)(nil)).Elem()
}

func (o ConnectionOutput) ToConnectionOutput() ConnectionOutput {
	return o
}

func (o ConnectionOutput) ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput {
	return o
}

// Name used in login screen.
func (o ConnectionOutput) DisplayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringPtrOutput { return v.DisplayName }).(pulumi.StringPtrOutput)
}

// IDs of the clients for which the connection is enabled. Reading the enabled clients through this attribute is deprecated and it will be removed in a future major version. Use the `Connection` data source instead.
func (o ConnectionOutput) EnabledClients() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringArrayOutput { return v.EnabledClients }).(pulumi.StringArrayOutput)
}

// Indicates whether the connection is domain level.
func (o ConnectionOutput) IsDomainConnection() pulumi.BoolOutput {
	return o.ApplyT(func(v *Connection) pulumi.BoolOutput { return v.IsDomainConnection }).(pulumi.BoolOutput)
}

// Metadata associated with the connection, in the form of a map of string values (max 255 chars).
func (o ConnectionOutput) Metadata() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringMapOutput { return v.Metadata }).(pulumi.StringMapOutput)
}

// Name of the connection.
func (o ConnectionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Configuration settings for connection options.
func (o ConnectionOutput) Options() ConnectionOptionsOutput {
	return o.ApplyT(func(v *Connection) ConnectionOptionsOutput { return v.Options }).(ConnectionOptionsOutput)
}

// Defines the realms for which the connection will be used (e.g., email domains). If not specified, the connection name is added as the realm.
func (o ConnectionOutput) Realms() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringArrayOutput { return v.Realms }).(pulumi.StringArrayOutput)
}

// Display connection as a button. Only available on enterprise connections.
func (o ConnectionOutput) ShowAsButton() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Connection) pulumi.BoolPtrOutput { return v.ShowAsButton }).(pulumi.BoolPtrOutput)
}

// Type of the connection, which indicates the identity provider.
func (o ConnectionOutput) Strategy() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.Strategy }).(pulumi.StringOutput)
}

type ConnectionArrayOutput struct{ *pulumi.OutputState }

func (ConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connection)(nil)).Elem()
}

func (o ConnectionArrayOutput) ToConnectionArrayOutput() ConnectionArrayOutput {
	return o
}

func (o ConnectionArrayOutput) ToConnectionArrayOutputWithContext(ctx context.Context) ConnectionArrayOutput {
	return o
}

func (o ConnectionArrayOutput) Index(i pulumi.IntInput) ConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Connection {
		return vs[0].([]*Connection)[vs[1].(int)]
	}).(ConnectionOutput)
}

type ConnectionMapOutput struct{ *pulumi.OutputState }

func (ConnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connection)(nil)).Elem()
}

func (o ConnectionMapOutput) ToConnectionMapOutput() ConnectionMapOutput {
	return o
}

func (o ConnectionMapOutput) ToConnectionMapOutputWithContext(ctx context.Context) ConnectionMapOutput {
	return o
}

func (o ConnectionMapOutput) MapIndex(k pulumi.StringInput) ConnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Connection {
		return vs[0].(map[string]*Connection)[vs[1].(string)]
	}).(ConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionInput)(nil)).Elem(), &Connection{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionArrayInput)(nil)).Elem(), ConnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionMapInput)(nil)).Elem(), ConnectionMap{})
	pulumi.RegisterOutputType(ConnectionOutput{})
	pulumi.RegisterOutputType(ConnectionArrayOutput{})
	pulumi.RegisterOutputType(ConnectionMapOutput{})
}
