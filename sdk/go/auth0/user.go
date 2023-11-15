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

// With this resource, you can manage user identities, including resetting passwords, and creating, provisioning, blocking, and deleting users.
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
//			_, err := auth0.NewUser(ctx, "user", &auth0.UserArgs{
//				ConnectionName: pulumi.String("Username-Password-Authentication"),
//				Email:          pulumi.String("test@test.com"),
//				EmailVerified:  pulumi.Bool(true),
//				Nickname:       pulumi.String("some.nickname"),
//				Password:       pulumi.String("passpass$12$12"),
//				Picture:        pulumi.String("https://www.example.com/a-valid-picture-url.jpg"),
//				UserId:         pulumi.String("12345"),
//				Username:       pulumi.String("unique_username"),
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
// This resource can be imported using the user ID. # Example
//
// ```sh
//
//	$ pulumi import auth0:index/user:User user "auth0|111111111111111111111111"
//
// ```
type User struct {
	pulumi.CustomResourceState

	// Custom fields that store info about the user that impact the user's core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
	AppMetadata pulumi.StringPtrOutput `pulumi:"appMetadata"`
	// Indicates whether the user is blocked or not.
	Blocked pulumi.BoolPtrOutput `pulumi:"blocked"`
	// Name of the connection from which the user information was sourced.
	ConnectionName pulumi.StringOutput `pulumi:"connectionName"`
	// Email address of the user.
	Email pulumi.StringPtrOutput `pulumi:"email"`
	// Indicates whether the email address has been verified.
	EmailVerified pulumi.BoolPtrOutput `pulumi:"emailVerified"`
	// Family name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	FamilyName pulumi.StringPtrOutput `pulumi:"familyName"`
	// Given name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	GivenName pulumi.StringPtrOutput `pulumi:"givenName"`
	// Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	Name pulumi.StringOutput `pulumi:"name"`
	// Preferred nickname or alias of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	Nickname pulumi.StringOutput `pulumi:"nickname"`
	// Initial password for this user. Required for non-passwordless connections (SMS and email).
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
	PhoneNumber pulumi.StringPtrOutput `pulumi:"phoneNumber"`
	// Indicates whether the phone number has been verified.
	PhoneVerified pulumi.BoolPtrOutput `pulumi:"phoneVerified"`
	// Picture of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	Picture pulumi.StringOutput `pulumi:"picture"`
	// ID of the user.
	UserId pulumi.StringOutput `pulumi:"userId"`
	// Custom fields that store info about the user that does not impact a user's core functionality. Examples include work address, home address, and user preferences.
	UserMetadata pulumi.StringPtrOutput `pulumi:"userMetadata"`
	// Username of the user. Only valid if the connection requires a username.
	Username pulumi.StringPtrOutput `pulumi:"username"`
	// Indicates whether the user will receive a verification email after creation. Overrides behavior of `emailVerified` parameter.
	VerifyEmail pulumi.BoolPtrOutput `pulumi:"verifyEmail"`
}

// NewUser registers a new resource with the given unique name, arguments, and options.
func NewUser(ctx *pulumi.Context,
	name string, args *UserArgs, opts ...pulumi.ResourceOption) (*User, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConnectionName == nil {
		return nil, errors.New("invalid value for required argument 'ConnectionName'")
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource User
	err := ctx.RegisterResource("auth0:index/user:User", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUser gets an existing User resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserState, opts ...pulumi.ResourceOption) (*User, error) {
	var resource User
	err := ctx.ReadResource("auth0:index/user:User", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering User resources.
type userState struct {
	// Custom fields that store info about the user that impact the user's core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
	AppMetadata *string `pulumi:"appMetadata"`
	// Indicates whether the user is blocked or not.
	Blocked *bool `pulumi:"blocked"`
	// Name of the connection from which the user information was sourced.
	ConnectionName *string `pulumi:"connectionName"`
	// Email address of the user.
	Email *string `pulumi:"email"`
	// Indicates whether the email address has been verified.
	EmailVerified *bool `pulumi:"emailVerified"`
	// Family name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	FamilyName *string `pulumi:"familyName"`
	// Given name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	GivenName *string `pulumi:"givenName"`
	// Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	Name *string `pulumi:"name"`
	// Preferred nickname or alias of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	Nickname *string `pulumi:"nickname"`
	// Initial password for this user. Required for non-passwordless connections (SMS and email).
	Password *string `pulumi:"password"`
	// Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
	PhoneNumber *string `pulumi:"phoneNumber"`
	// Indicates whether the phone number has been verified.
	PhoneVerified *bool `pulumi:"phoneVerified"`
	// Picture of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	Picture *string `pulumi:"picture"`
	// ID of the user.
	UserId *string `pulumi:"userId"`
	// Custom fields that store info about the user that does not impact a user's core functionality. Examples include work address, home address, and user preferences.
	UserMetadata *string `pulumi:"userMetadata"`
	// Username of the user. Only valid if the connection requires a username.
	Username *string `pulumi:"username"`
	// Indicates whether the user will receive a verification email after creation. Overrides behavior of `emailVerified` parameter.
	VerifyEmail *bool `pulumi:"verifyEmail"`
}

type UserState struct {
	// Custom fields that store info about the user that impact the user's core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
	AppMetadata pulumi.StringPtrInput
	// Indicates whether the user is blocked or not.
	Blocked pulumi.BoolPtrInput
	// Name of the connection from which the user information was sourced.
	ConnectionName pulumi.StringPtrInput
	// Email address of the user.
	Email pulumi.StringPtrInput
	// Indicates whether the email address has been verified.
	EmailVerified pulumi.BoolPtrInput
	// Family name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	FamilyName pulumi.StringPtrInput
	// Given name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	GivenName pulumi.StringPtrInput
	// Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	Name pulumi.StringPtrInput
	// Preferred nickname or alias of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	Nickname pulumi.StringPtrInput
	// Initial password for this user. Required for non-passwordless connections (SMS and email).
	Password pulumi.StringPtrInput
	// Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
	PhoneNumber pulumi.StringPtrInput
	// Indicates whether the phone number has been verified.
	PhoneVerified pulumi.BoolPtrInput
	// Picture of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	Picture pulumi.StringPtrInput
	// ID of the user.
	UserId pulumi.StringPtrInput
	// Custom fields that store info about the user that does not impact a user's core functionality. Examples include work address, home address, and user preferences.
	UserMetadata pulumi.StringPtrInput
	// Username of the user. Only valid if the connection requires a username.
	Username pulumi.StringPtrInput
	// Indicates whether the user will receive a verification email after creation. Overrides behavior of `emailVerified` parameter.
	VerifyEmail pulumi.BoolPtrInput
}

func (UserState) ElementType() reflect.Type {
	return reflect.TypeOf((*userState)(nil)).Elem()
}

type userArgs struct {
	// Custom fields that store info about the user that impact the user's core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
	AppMetadata *string `pulumi:"appMetadata"`
	// Indicates whether the user is blocked or not.
	Blocked *bool `pulumi:"blocked"`
	// Name of the connection from which the user information was sourced.
	ConnectionName string `pulumi:"connectionName"`
	// Email address of the user.
	Email *string `pulumi:"email"`
	// Indicates whether the email address has been verified.
	EmailVerified *bool `pulumi:"emailVerified"`
	// Family name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	FamilyName *string `pulumi:"familyName"`
	// Given name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	GivenName *string `pulumi:"givenName"`
	// Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	Name *string `pulumi:"name"`
	// Preferred nickname or alias of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	Nickname *string `pulumi:"nickname"`
	// Initial password for this user. Required for non-passwordless connections (SMS and email).
	Password *string `pulumi:"password"`
	// Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
	PhoneNumber *string `pulumi:"phoneNumber"`
	// Indicates whether the phone number has been verified.
	PhoneVerified *bool `pulumi:"phoneVerified"`
	// Picture of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	Picture *string `pulumi:"picture"`
	// ID of the user.
	UserId *string `pulumi:"userId"`
	// Custom fields that store info about the user that does not impact a user's core functionality. Examples include work address, home address, and user preferences.
	UserMetadata *string `pulumi:"userMetadata"`
	// Username of the user. Only valid if the connection requires a username.
	Username *string `pulumi:"username"`
	// Indicates whether the user will receive a verification email after creation. Overrides behavior of `emailVerified` parameter.
	VerifyEmail *bool `pulumi:"verifyEmail"`
}

// The set of arguments for constructing a User resource.
type UserArgs struct {
	// Custom fields that store info about the user that impact the user's core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
	AppMetadata pulumi.StringPtrInput
	// Indicates whether the user is blocked or not.
	Blocked pulumi.BoolPtrInput
	// Name of the connection from which the user information was sourced.
	ConnectionName pulumi.StringInput
	// Email address of the user.
	Email pulumi.StringPtrInput
	// Indicates whether the email address has been verified.
	EmailVerified pulumi.BoolPtrInput
	// Family name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	FamilyName pulumi.StringPtrInput
	// Given name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	GivenName pulumi.StringPtrInput
	// Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	Name pulumi.StringPtrInput
	// Preferred nickname or alias of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	Nickname pulumi.StringPtrInput
	// Initial password for this user. Required for non-passwordless connections (SMS and email).
	Password pulumi.StringPtrInput
	// Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
	PhoneNumber pulumi.StringPtrInput
	// Indicates whether the phone number has been verified.
	PhoneVerified pulumi.BoolPtrInput
	// Picture of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
	Picture pulumi.StringPtrInput
	// ID of the user.
	UserId pulumi.StringPtrInput
	// Custom fields that store info about the user that does not impact a user's core functionality. Examples include work address, home address, and user preferences.
	UserMetadata pulumi.StringPtrInput
	// Username of the user. Only valid if the connection requires a username.
	Username pulumi.StringPtrInput
	// Indicates whether the user will receive a verification email after creation. Overrides behavior of `emailVerified` parameter.
	VerifyEmail pulumi.BoolPtrInput
}

func (UserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userArgs)(nil)).Elem()
}

type UserInput interface {
	pulumi.Input

	ToUserOutput() UserOutput
	ToUserOutputWithContext(ctx context.Context) UserOutput
}

func (*User) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (i *User) ToUserOutput() UserOutput {
	return i.ToUserOutputWithContext(context.Background())
}

func (i *User) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserOutput)
}

// UserArrayInput is an input type that accepts UserArray and UserArrayOutput values.
// You can construct a concrete instance of `UserArrayInput` via:
//
//	UserArray{ UserArgs{...} }
type UserArrayInput interface {
	pulumi.Input

	ToUserArrayOutput() UserArrayOutput
	ToUserArrayOutputWithContext(context.Context) UserArrayOutput
}

type UserArray []UserInput

func (UserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (i UserArray) ToUserArrayOutput() UserArrayOutput {
	return i.ToUserArrayOutputWithContext(context.Background())
}

func (i UserArray) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserArrayOutput)
}

// UserMapInput is an input type that accepts UserMap and UserMapOutput values.
// You can construct a concrete instance of `UserMapInput` via:
//
//	UserMap{ "key": UserArgs{...} }
type UserMapInput interface {
	pulumi.Input

	ToUserMapOutput() UserMapOutput
	ToUserMapOutputWithContext(context.Context) UserMapOutput
}

type UserMap map[string]UserInput

func (UserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (i UserMap) ToUserMapOutput() UserMapOutput {
	return i.ToUserMapOutputWithContext(context.Background())
}

func (i UserMap) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserMapOutput)
}

type UserOutput struct{ *pulumi.OutputState }

func (UserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (o UserOutput) ToUserOutput() UserOutput {
	return o
}

func (o UserOutput) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return o
}

// Custom fields that store info about the user that impact the user's core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
func (o UserOutput) AppMetadata() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.AppMetadata }).(pulumi.StringPtrOutput)
}

// Indicates whether the user is blocked or not.
func (o UserOutput) Blocked() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *User) pulumi.BoolPtrOutput { return v.Blocked }).(pulumi.BoolPtrOutput)
}

// Name of the connection from which the user information was sourced.
func (o UserOutput) ConnectionName() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.ConnectionName }).(pulumi.StringOutput)
}

// Email address of the user.
func (o UserOutput) Email() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Email }).(pulumi.StringPtrOutput)
}

// Indicates whether the email address has been verified.
func (o UserOutput) EmailVerified() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *User) pulumi.BoolPtrOutput { return v.EmailVerified }).(pulumi.BoolPtrOutput)
}

// Family name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
func (o UserOutput) FamilyName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.FamilyName }).(pulumi.StringPtrOutput)
}

// Given name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
func (o UserOutput) GivenName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.GivenName }).(pulumi.StringPtrOutput)
}

// Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
func (o UserOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Preferred nickname or alias of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
func (o UserOutput) Nickname() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.Nickname }).(pulumi.StringOutput)
}

// Initial password for this user. Required for non-passwordless connections (SMS and email).
func (o UserOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
func (o UserOutput) PhoneNumber() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.PhoneNumber }).(pulumi.StringPtrOutput)
}

// Indicates whether the phone number has been verified.
func (o UserOutput) PhoneVerified() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *User) pulumi.BoolPtrOutput { return v.PhoneVerified }).(pulumi.BoolPtrOutput)
}

// Picture of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
func (o UserOutput) Picture() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.Picture }).(pulumi.StringOutput)
}

// ID of the user.
func (o UserOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

// Custom fields that store info about the user that does not impact a user's core functionality. Examples include work address, home address, and user preferences.
func (o UserOutput) UserMetadata() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.UserMetadata }).(pulumi.StringPtrOutput)
}

// Username of the user. Only valid if the connection requires a username.
func (o UserOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Username }).(pulumi.StringPtrOutput)
}

// Indicates whether the user will receive a verification email after creation. Overrides behavior of `emailVerified` parameter.
func (o UserOutput) VerifyEmail() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *User) pulumi.BoolPtrOutput { return v.VerifyEmail }).(pulumi.BoolPtrOutput)
}

type UserArrayOutput struct{ *pulumi.OutputState }

func (UserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (o UserArrayOutput) ToUserArrayOutput() UserArrayOutput {
	return o
}

func (o UserArrayOutput) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return o
}

func (o UserArrayOutput) Index(i pulumi.IntInput) UserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *User {
		return vs[0].([]*User)[vs[1].(int)]
	}).(UserOutput)
}

type UserMapOutput struct{ *pulumi.OutputState }

func (UserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (o UserMapOutput) ToUserMapOutput() UserMapOutput {
	return o
}

func (o UserMapOutput) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return o
}

func (o UserMapOutput) MapIndex(k pulumi.StringInput) UserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *User {
		return vs[0].(map[string]*User)[vs[1].(string)]
	}).(UserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserInput)(nil)).Elem(), &User{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserArrayInput)(nil)).Elem(), UserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserMapInput)(nil)).Elem(), UserMap{})
	pulumi.RegisterOutputType(UserOutput{})
	pulumi.RegisterOutputType(UserArrayOutput{})
	pulumi.RegisterOutputType(UserMapOutput{})
}
