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

// This resource is used to manage members of an organization.
//
// !> This resource manages all the members assigned to an organization. In contrast, the `OrganizationMember`
// resource only appends a member to an organization. To avoid potential issues, it is recommended not to use this
// resource in conjunction with the `OrganizationMember` resource when managing members for the same organization
// id.
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
//			user1, err := auth0.NewUser(ctx, "user1", &auth0.UserArgs{
//				ConnectionName: pulumi.String("Username-Password-Authentication"),
//				Email:          pulumi.String("myuser1@auth0.com"),
//				Password:       pulumi.String("MyPass123$"),
//			})
//			if err != nil {
//				return err
//			}
//			user2, err := auth0.NewUser(ctx, "user2", &auth0.UserArgs{
//				ConnectionName: pulumi.String("Username-Password-Authentication"),
//				Email:          pulumi.String("myuser2@auth0.com"),
//				Password:       pulumi.String("MyPass123$"),
//			})
//			if err != nil {
//				return err
//			}
//			myOrg, err := auth0.NewOrganization(ctx, "myOrg", &auth0.OrganizationArgs{
//				DisplayName: pulumi.String("Some Organization"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewOrganizationMembers(ctx, "myMembers", &auth0.OrganizationMembersArgs{
//				OrganizationId: myOrg.ID(),
//				Members: pulumi.StringArray{
//					user1.ID(),
//					user2.ID(),
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
// This resource can be imported by specifying the organization ID.
//
// #
//
//	Example:
//
// ```sh
// $ pulumi import auth0:index/organizationMembers:OrganizationMembers my_org_members "org_XXXXX"
// ```
type OrganizationMembers struct {
	pulumi.CustomResourceState

	// Add user ID(s) directly from the tenant to become members of the organization.
	Members pulumi.StringArrayOutput `pulumi:"members"`
	// The ID of the organization to assign the members to.
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
}

// NewOrganizationMembers registers a new resource with the given unique name, arguments, and options.
func NewOrganizationMembers(ctx *pulumi.Context,
	name string, args *OrganizationMembersArgs, opts ...pulumi.ResourceOption) (*OrganizationMembers, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Members == nil {
		return nil, errors.New("invalid value for required argument 'Members'")
	}
	if args.OrganizationId == nil {
		return nil, errors.New("invalid value for required argument 'OrganizationId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OrganizationMembers
	err := ctx.RegisterResource("auth0:index/organizationMembers:OrganizationMembers", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOrganizationMembers gets an existing OrganizationMembers resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOrganizationMembers(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OrganizationMembersState, opts ...pulumi.ResourceOption) (*OrganizationMembers, error) {
	var resource OrganizationMembers
	err := ctx.ReadResource("auth0:index/organizationMembers:OrganizationMembers", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OrganizationMembers resources.
type organizationMembersState struct {
	// Add user ID(s) directly from the tenant to become members of the organization.
	Members []string `pulumi:"members"`
	// The ID of the organization to assign the members to.
	OrganizationId *string `pulumi:"organizationId"`
}

type OrganizationMembersState struct {
	// Add user ID(s) directly from the tenant to become members of the organization.
	Members pulumi.StringArrayInput
	// The ID of the organization to assign the members to.
	OrganizationId pulumi.StringPtrInput
}

func (OrganizationMembersState) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationMembersState)(nil)).Elem()
}

type organizationMembersArgs struct {
	// Add user ID(s) directly from the tenant to become members of the organization.
	Members []string `pulumi:"members"`
	// The ID of the organization to assign the members to.
	OrganizationId string `pulumi:"organizationId"`
}

// The set of arguments for constructing a OrganizationMembers resource.
type OrganizationMembersArgs struct {
	// Add user ID(s) directly from the tenant to become members of the organization.
	Members pulumi.StringArrayInput
	// The ID of the organization to assign the members to.
	OrganizationId pulumi.StringInput
}

func (OrganizationMembersArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationMembersArgs)(nil)).Elem()
}

type OrganizationMembersInput interface {
	pulumi.Input

	ToOrganizationMembersOutput() OrganizationMembersOutput
	ToOrganizationMembersOutputWithContext(ctx context.Context) OrganizationMembersOutput
}

func (*OrganizationMembers) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationMembers)(nil)).Elem()
}

func (i *OrganizationMembers) ToOrganizationMembersOutput() OrganizationMembersOutput {
	return i.ToOrganizationMembersOutputWithContext(context.Background())
}

func (i *OrganizationMembers) ToOrganizationMembersOutputWithContext(ctx context.Context) OrganizationMembersOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationMembersOutput)
}

// OrganizationMembersArrayInput is an input type that accepts OrganizationMembersArray and OrganizationMembersArrayOutput values.
// You can construct a concrete instance of `OrganizationMembersArrayInput` via:
//
//	OrganizationMembersArray{ OrganizationMembersArgs{...} }
type OrganizationMembersArrayInput interface {
	pulumi.Input

	ToOrganizationMembersArrayOutput() OrganizationMembersArrayOutput
	ToOrganizationMembersArrayOutputWithContext(context.Context) OrganizationMembersArrayOutput
}

type OrganizationMembersArray []OrganizationMembersInput

func (OrganizationMembersArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationMembers)(nil)).Elem()
}

func (i OrganizationMembersArray) ToOrganizationMembersArrayOutput() OrganizationMembersArrayOutput {
	return i.ToOrganizationMembersArrayOutputWithContext(context.Background())
}

func (i OrganizationMembersArray) ToOrganizationMembersArrayOutputWithContext(ctx context.Context) OrganizationMembersArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationMembersArrayOutput)
}

// OrganizationMembersMapInput is an input type that accepts OrganizationMembersMap and OrganizationMembersMapOutput values.
// You can construct a concrete instance of `OrganizationMembersMapInput` via:
//
//	OrganizationMembersMap{ "key": OrganizationMembersArgs{...} }
type OrganizationMembersMapInput interface {
	pulumi.Input

	ToOrganizationMembersMapOutput() OrganizationMembersMapOutput
	ToOrganizationMembersMapOutputWithContext(context.Context) OrganizationMembersMapOutput
}

type OrganizationMembersMap map[string]OrganizationMembersInput

func (OrganizationMembersMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationMembers)(nil)).Elem()
}

func (i OrganizationMembersMap) ToOrganizationMembersMapOutput() OrganizationMembersMapOutput {
	return i.ToOrganizationMembersMapOutputWithContext(context.Background())
}

func (i OrganizationMembersMap) ToOrganizationMembersMapOutputWithContext(ctx context.Context) OrganizationMembersMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationMembersMapOutput)
}

type OrganizationMembersOutput struct{ *pulumi.OutputState }

func (OrganizationMembersOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationMembers)(nil)).Elem()
}

func (o OrganizationMembersOutput) ToOrganizationMembersOutput() OrganizationMembersOutput {
	return o
}

func (o OrganizationMembersOutput) ToOrganizationMembersOutputWithContext(ctx context.Context) OrganizationMembersOutput {
	return o
}

// Add user ID(s) directly from the tenant to become members of the organization.
func (o OrganizationMembersOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OrganizationMembers) pulumi.StringArrayOutput { return v.Members }).(pulumi.StringArrayOutput)
}

// The ID of the organization to assign the members to.
func (o OrganizationMembersOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationMembers) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

type OrganizationMembersArrayOutput struct{ *pulumi.OutputState }

func (OrganizationMembersArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationMembers)(nil)).Elem()
}

func (o OrganizationMembersArrayOutput) ToOrganizationMembersArrayOutput() OrganizationMembersArrayOutput {
	return o
}

func (o OrganizationMembersArrayOutput) ToOrganizationMembersArrayOutputWithContext(ctx context.Context) OrganizationMembersArrayOutput {
	return o
}

func (o OrganizationMembersArrayOutput) Index(i pulumi.IntInput) OrganizationMembersOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OrganizationMembers {
		return vs[0].([]*OrganizationMembers)[vs[1].(int)]
	}).(OrganizationMembersOutput)
}

type OrganizationMembersMapOutput struct{ *pulumi.OutputState }

func (OrganizationMembersMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationMembers)(nil)).Elem()
}

func (o OrganizationMembersMapOutput) ToOrganizationMembersMapOutput() OrganizationMembersMapOutput {
	return o
}

func (o OrganizationMembersMapOutput) ToOrganizationMembersMapOutputWithContext(ctx context.Context) OrganizationMembersMapOutput {
	return o
}

func (o OrganizationMembersMapOutput) MapIndex(k pulumi.StringInput) OrganizationMembersOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OrganizationMembers {
		return vs[0].(map[string]*OrganizationMembers)[vs[1].(string)]
	}).(OrganizationMembersOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationMembersInput)(nil)).Elem(), &OrganizationMembers{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationMembersArrayInput)(nil)).Elem(), OrganizationMembersArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationMembersMapInput)(nil)).Elem(), OrganizationMembersMap{})
	pulumi.RegisterOutputType(OrganizationMembersOutput{})
	pulumi.RegisterOutputType(OrganizationMembersArrayOutput{})
	pulumi.RegisterOutputType(OrganizationMembersMapOutput{})
}
