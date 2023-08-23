// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With this resource, you can manage assigned roles for a user.
//
// !> This resource manages all the roles assigned to a user. In contrast, the `UserRole` resource only appends a
// role to a user. To avoid potential issues, it is recommended not to use this resource in conjunction with the
// `UserRole` resource when managing roles for the same user id.
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
//			admin, err := auth0.NewRole(ctx, "admin", &auth0.RoleArgs{
//				Description: pulumi.String("Administrator"),
//			})
//			if err != nil {
//				return err
//			}
//			user, err := auth0.NewUser(ctx, "user", &auth0.UserArgs{
//				ConnectionName: pulumi.String("Username-Password-Authentication"),
//				Username:       pulumi.String("unique_username"),
//				Email:          pulumi.String("test@test.com"),
//				Password:       pulumi.String("passpass$12$12"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewUserRoles(ctx, "userRoles", &auth0.UserRolesArgs{
//				UserId: user.ID(),
//				Roles: pulumi.StringArray{
//					admin.ID(),
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
// This resource can be imported using the user ID. # Example
//
// ```sh
//
//	$ pulumi import auth0:index/userRoles:UserRoles user_roles "auth0|111111111111111111111111"
//
// ```
type UserRoles struct {
	pulumi.CustomResourceState

	// Set of IDs of roles assigned to the user.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// ID of the user.
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewUserRoles registers a new resource with the given unique name, arguments, and options.
func NewUserRoles(ctx *pulumi.Context,
	name string, args *UserRolesArgs, opts ...pulumi.ResourceOption) (*UserRoles, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Roles == nil {
		return nil, errors.New("invalid value for required argument 'Roles'")
	}
	if args.UserId == nil {
		return nil, errors.New("invalid value for required argument 'UserId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource UserRoles
	err := ctx.RegisterResource("auth0:index/userRoles:UserRoles", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserRoles gets an existing UserRoles resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserRoles(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserRolesState, opts ...pulumi.ResourceOption) (*UserRoles, error) {
	var resource UserRoles
	err := ctx.ReadResource("auth0:index/userRoles:UserRoles", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserRoles resources.
type userRolesState struct {
	// Set of IDs of roles assigned to the user.
	Roles []string `pulumi:"roles"`
	// ID of the user.
	UserId *string `pulumi:"userId"`
}

type UserRolesState struct {
	// Set of IDs of roles assigned to the user.
	Roles pulumi.StringArrayInput
	// ID of the user.
	UserId pulumi.StringPtrInput
}

func (UserRolesState) ElementType() reflect.Type {
	return reflect.TypeOf((*userRolesState)(nil)).Elem()
}

type userRolesArgs struct {
	// Set of IDs of roles assigned to the user.
	Roles []string `pulumi:"roles"`
	// ID of the user.
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a UserRoles resource.
type UserRolesArgs struct {
	// Set of IDs of roles assigned to the user.
	Roles pulumi.StringArrayInput
	// ID of the user.
	UserId pulumi.StringInput
}

func (UserRolesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userRolesArgs)(nil)).Elem()
}

type UserRolesInput interface {
	pulumi.Input

	ToUserRolesOutput() UserRolesOutput
	ToUserRolesOutputWithContext(ctx context.Context) UserRolesOutput
}

func (*UserRoles) ElementType() reflect.Type {
	return reflect.TypeOf((**UserRoles)(nil)).Elem()
}

func (i *UserRoles) ToUserRolesOutput() UserRolesOutput {
	return i.ToUserRolesOutputWithContext(context.Background())
}

func (i *UserRoles) ToUserRolesOutputWithContext(ctx context.Context) UserRolesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserRolesOutput)
}

// UserRolesArrayInput is an input type that accepts UserRolesArray and UserRolesArrayOutput values.
// You can construct a concrete instance of `UserRolesArrayInput` via:
//
//	UserRolesArray{ UserRolesArgs{...} }
type UserRolesArrayInput interface {
	pulumi.Input

	ToUserRolesArrayOutput() UserRolesArrayOutput
	ToUserRolesArrayOutputWithContext(context.Context) UserRolesArrayOutput
}

type UserRolesArray []UserRolesInput

func (UserRolesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserRoles)(nil)).Elem()
}

func (i UserRolesArray) ToUserRolesArrayOutput() UserRolesArrayOutput {
	return i.ToUserRolesArrayOutputWithContext(context.Background())
}

func (i UserRolesArray) ToUserRolesArrayOutputWithContext(ctx context.Context) UserRolesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserRolesArrayOutput)
}

// UserRolesMapInput is an input type that accepts UserRolesMap and UserRolesMapOutput values.
// You can construct a concrete instance of `UserRolesMapInput` via:
//
//	UserRolesMap{ "key": UserRolesArgs{...} }
type UserRolesMapInput interface {
	pulumi.Input

	ToUserRolesMapOutput() UserRolesMapOutput
	ToUserRolesMapOutputWithContext(context.Context) UserRolesMapOutput
}

type UserRolesMap map[string]UserRolesInput

func (UserRolesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserRoles)(nil)).Elem()
}

func (i UserRolesMap) ToUserRolesMapOutput() UserRolesMapOutput {
	return i.ToUserRolesMapOutputWithContext(context.Background())
}

func (i UserRolesMap) ToUserRolesMapOutputWithContext(ctx context.Context) UserRolesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserRolesMapOutput)
}

type UserRolesOutput struct{ *pulumi.OutputState }

func (UserRolesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserRoles)(nil)).Elem()
}

func (o UserRolesOutput) ToUserRolesOutput() UserRolesOutput {
	return o
}

func (o UserRolesOutput) ToUserRolesOutputWithContext(ctx context.Context) UserRolesOutput {
	return o
}

// Set of IDs of roles assigned to the user.
func (o UserRolesOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *UserRoles) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// ID of the user.
func (o UserRolesOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *UserRoles) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

type UserRolesArrayOutput struct{ *pulumi.OutputState }

func (UserRolesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserRoles)(nil)).Elem()
}

func (o UserRolesArrayOutput) ToUserRolesArrayOutput() UserRolesArrayOutput {
	return o
}

func (o UserRolesArrayOutput) ToUserRolesArrayOutputWithContext(ctx context.Context) UserRolesArrayOutput {
	return o
}

func (o UserRolesArrayOutput) Index(i pulumi.IntInput) UserRolesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserRoles {
		return vs[0].([]*UserRoles)[vs[1].(int)]
	}).(UserRolesOutput)
}

type UserRolesMapOutput struct{ *pulumi.OutputState }

func (UserRolesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserRoles)(nil)).Elem()
}

func (o UserRolesMapOutput) ToUserRolesMapOutput() UserRolesMapOutput {
	return o
}

func (o UserRolesMapOutput) ToUserRolesMapOutputWithContext(ctx context.Context) UserRolesMapOutput {
	return o
}

func (o UserRolesMapOutput) MapIndex(k pulumi.StringInput) UserRolesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserRoles {
		return vs[0].(map[string]*UserRoles)[vs[1].(string)]
	}).(UserRolesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserRolesInput)(nil)).Elem(), &UserRoles{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserRolesArrayInput)(nil)).Elem(), UserRolesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserRolesMapInput)(nil)).Elem(), UserRolesMap{})
	pulumi.RegisterOutputType(UserRolesOutput{})
	pulumi.RegisterOutputType(UserRolesArrayOutput{})
	pulumi.RegisterOutputType(UserRolesMapOutput{})
}
