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

// This resource is used to manage the roles assigned to an organization member.
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
//			reader, err := auth0.NewRole(ctx, "reader", nil)
//			if err != nil {
//				return err
//			}
//			writer, err := auth0.NewRole(ctx, "writer", nil)
//			if err != nil {
//				return err
//			}
//			user, err := auth0.NewUser(ctx, "user", &auth0.UserArgs{
//				ConnectionName: pulumi.String("Username-Password-Authentication"),
//				Email:          pulumi.String("test-user@auth0.com"),
//				Password:       pulumi.String("MyPass123$"),
//			})
//			if err != nil {
//				return err
//			}
//			myOrg, err := auth0.NewOrganization(ctx, "myOrg", &auth0.OrganizationArgs{
//				DisplayName: pulumi.String("Some Org"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewOrganizationMember(ctx, "myOrgMember", &auth0.OrganizationMemberArgs{
//				OrganizationId: myOrg.ID(),
//				UserId:         user.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewOrganizationMemberRole(ctx, "role1", &auth0.OrganizationMemberRoleArgs{
//				OrganizationId: myOrg.ID(),
//				UserId:         user.ID(),
//				RoleId:         reader.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewOrganizationMemberRole(ctx, "role2", &auth0.OrganizationMemberRoleArgs{
//				OrganizationId: myOrg.ID(),
//				UserId:         user.ID(),
//				RoleId:         writer.ID(),
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
// This resource can be imported by specifying the organization ID, user ID and role ID separated by "::". # Example
//
// ```sh
//
//	$ pulumi import auth0:index/organizationMemberRole:OrganizationMemberRole my_org_member_role "org_XXXXX::auth0|XXXXX::role_XXXX"
//
// ```
type OrganizationMemberRole struct {
	pulumi.CustomResourceState

	// The ID of the organization.
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
	// Description of the role.
	RoleDescription pulumi.StringOutput `pulumi:"roleDescription"`
	// The role ID to assign to the organization member.
	RoleId pulumi.StringOutput `pulumi:"roleId"`
	// Name of the role.
	RoleName pulumi.StringOutput `pulumi:"roleName"`
	// The user ID of the organization member.
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewOrganizationMemberRole registers a new resource with the given unique name, arguments, and options.
func NewOrganizationMemberRole(ctx *pulumi.Context,
	name string, args *OrganizationMemberRoleArgs, opts ...pulumi.ResourceOption) (*OrganizationMemberRole, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrganizationId == nil {
		return nil, errors.New("invalid value for required argument 'OrganizationId'")
	}
	if args.RoleId == nil {
		return nil, errors.New("invalid value for required argument 'RoleId'")
	}
	if args.UserId == nil {
		return nil, errors.New("invalid value for required argument 'UserId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OrganizationMemberRole
	err := ctx.RegisterResource("auth0:index/organizationMemberRole:OrganizationMemberRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOrganizationMemberRole gets an existing OrganizationMemberRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOrganizationMemberRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OrganizationMemberRoleState, opts ...pulumi.ResourceOption) (*OrganizationMemberRole, error) {
	var resource OrganizationMemberRole
	err := ctx.ReadResource("auth0:index/organizationMemberRole:OrganizationMemberRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OrganizationMemberRole resources.
type organizationMemberRoleState struct {
	// The ID of the organization.
	OrganizationId *string `pulumi:"organizationId"`
	// Description of the role.
	RoleDescription *string `pulumi:"roleDescription"`
	// The role ID to assign to the organization member.
	RoleId *string `pulumi:"roleId"`
	// Name of the role.
	RoleName *string `pulumi:"roleName"`
	// The user ID of the organization member.
	UserId *string `pulumi:"userId"`
}

type OrganizationMemberRoleState struct {
	// The ID of the organization.
	OrganizationId pulumi.StringPtrInput
	// Description of the role.
	RoleDescription pulumi.StringPtrInput
	// The role ID to assign to the organization member.
	RoleId pulumi.StringPtrInput
	// Name of the role.
	RoleName pulumi.StringPtrInput
	// The user ID of the organization member.
	UserId pulumi.StringPtrInput
}

func (OrganizationMemberRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationMemberRoleState)(nil)).Elem()
}

type organizationMemberRoleArgs struct {
	// The ID of the organization.
	OrganizationId string `pulumi:"organizationId"`
	// The role ID to assign to the organization member.
	RoleId string `pulumi:"roleId"`
	// The user ID of the organization member.
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a OrganizationMemberRole resource.
type OrganizationMemberRoleArgs struct {
	// The ID of the organization.
	OrganizationId pulumi.StringInput
	// The role ID to assign to the organization member.
	RoleId pulumi.StringInput
	// The user ID of the organization member.
	UserId pulumi.StringInput
}

func (OrganizationMemberRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationMemberRoleArgs)(nil)).Elem()
}

type OrganizationMemberRoleInput interface {
	pulumi.Input

	ToOrganizationMemberRoleOutput() OrganizationMemberRoleOutput
	ToOrganizationMemberRoleOutputWithContext(ctx context.Context) OrganizationMemberRoleOutput
}

func (*OrganizationMemberRole) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationMemberRole)(nil)).Elem()
}

func (i *OrganizationMemberRole) ToOrganizationMemberRoleOutput() OrganizationMemberRoleOutput {
	return i.ToOrganizationMemberRoleOutputWithContext(context.Background())
}

func (i *OrganizationMemberRole) ToOrganizationMemberRoleOutputWithContext(ctx context.Context) OrganizationMemberRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationMemberRoleOutput)
}

// OrganizationMemberRoleArrayInput is an input type that accepts OrganizationMemberRoleArray and OrganizationMemberRoleArrayOutput values.
// You can construct a concrete instance of `OrganizationMemberRoleArrayInput` via:
//
//	OrganizationMemberRoleArray{ OrganizationMemberRoleArgs{...} }
type OrganizationMemberRoleArrayInput interface {
	pulumi.Input

	ToOrganizationMemberRoleArrayOutput() OrganizationMemberRoleArrayOutput
	ToOrganizationMemberRoleArrayOutputWithContext(context.Context) OrganizationMemberRoleArrayOutput
}

type OrganizationMemberRoleArray []OrganizationMemberRoleInput

func (OrganizationMemberRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationMemberRole)(nil)).Elem()
}

func (i OrganizationMemberRoleArray) ToOrganizationMemberRoleArrayOutput() OrganizationMemberRoleArrayOutput {
	return i.ToOrganizationMemberRoleArrayOutputWithContext(context.Background())
}

func (i OrganizationMemberRoleArray) ToOrganizationMemberRoleArrayOutputWithContext(ctx context.Context) OrganizationMemberRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationMemberRoleArrayOutput)
}

// OrganizationMemberRoleMapInput is an input type that accepts OrganizationMemberRoleMap and OrganizationMemberRoleMapOutput values.
// You can construct a concrete instance of `OrganizationMemberRoleMapInput` via:
//
//	OrganizationMemberRoleMap{ "key": OrganizationMemberRoleArgs{...} }
type OrganizationMemberRoleMapInput interface {
	pulumi.Input

	ToOrganizationMemberRoleMapOutput() OrganizationMemberRoleMapOutput
	ToOrganizationMemberRoleMapOutputWithContext(context.Context) OrganizationMemberRoleMapOutput
}

type OrganizationMemberRoleMap map[string]OrganizationMemberRoleInput

func (OrganizationMemberRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationMemberRole)(nil)).Elem()
}

func (i OrganizationMemberRoleMap) ToOrganizationMemberRoleMapOutput() OrganizationMemberRoleMapOutput {
	return i.ToOrganizationMemberRoleMapOutputWithContext(context.Background())
}

func (i OrganizationMemberRoleMap) ToOrganizationMemberRoleMapOutputWithContext(ctx context.Context) OrganizationMemberRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationMemberRoleMapOutput)
}

type OrganizationMemberRoleOutput struct{ *pulumi.OutputState }

func (OrganizationMemberRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationMemberRole)(nil)).Elem()
}

func (o OrganizationMemberRoleOutput) ToOrganizationMemberRoleOutput() OrganizationMemberRoleOutput {
	return o
}

func (o OrganizationMemberRoleOutput) ToOrganizationMemberRoleOutputWithContext(ctx context.Context) OrganizationMemberRoleOutput {
	return o
}

// The ID of the organization.
func (o OrganizationMemberRoleOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationMemberRole) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

// Description of the role.
func (o OrganizationMemberRoleOutput) RoleDescription() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationMemberRole) pulumi.StringOutput { return v.RoleDescription }).(pulumi.StringOutput)
}

// The role ID to assign to the organization member.
func (o OrganizationMemberRoleOutput) RoleId() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationMemberRole) pulumi.StringOutput { return v.RoleId }).(pulumi.StringOutput)
}

// Name of the role.
func (o OrganizationMemberRoleOutput) RoleName() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationMemberRole) pulumi.StringOutput { return v.RoleName }).(pulumi.StringOutput)
}

// The user ID of the organization member.
func (o OrganizationMemberRoleOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationMemberRole) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

type OrganizationMemberRoleArrayOutput struct{ *pulumi.OutputState }

func (OrganizationMemberRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationMemberRole)(nil)).Elem()
}

func (o OrganizationMemberRoleArrayOutput) ToOrganizationMemberRoleArrayOutput() OrganizationMemberRoleArrayOutput {
	return o
}

func (o OrganizationMemberRoleArrayOutput) ToOrganizationMemberRoleArrayOutputWithContext(ctx context.Context) OrganizationMemberRoleArrayOutput {
	return o
}

func (o OrganizationMemberRoleArrayOutput) Index(i pulumi.IntInput) OrganizationMemberRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OrganizationMemberRole {
		return vs[0].([]*OrganizationMemberRole)[vs[1].(int)]
	}).(OrganizationMemberRoleOutput)
}

type OrganizationMemberRoleMapOutput struct{ *pulumi.OutputState }

func (OrganizationMemberRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationMemberRole)(nil)).Elem()
}

func (o OrganizationMemberRoleMapOutput) ToOrganizationMemberRoleMapOutput() OrganizationMemberRoleMapOutput {
	return o
}

func (o OrganizationMemberRoleMapOutput) ToOrganizationMemberRoleMapOutputWithContext(ctx context.Context) OrganizationMemberRoleMapOutput {
	return o
}

func (o OrganizationMemberRoleMapOutput) MapIndex(k pulumi.StringInput) OrganizationMemberRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OrganizationMemberRole {
		return vs[0].(map[string]*OrganizationMemberRole)[vs[1].(string)]
	}).(OrganizationMemberRoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationMemberRoleInput)(nil)).Elem(), &OrganizationMemberRole{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationMemberRoleArrayInput)(nil)).Elem(), OrganizationMemberRoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationMemberRoleMapInput)(nil)).Elem(), OrganizationMemberRoleMap{})
	pulumi.RegisterOutputType(OrganizationMemberRoleOutput{})
	pulumi.RegisterOutputType(OrganizationMemberRoleArrayOutput{})
	pulumi.RegisterOutputType(OrganizationMemberRoleMapOutput{})
}
