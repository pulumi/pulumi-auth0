// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource is used to manage the assignment of members and their roles within an organization.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := auth0.NewOrganizationMember(ctx, "acmeAdmin", &auth0.OrganizationMemberArgs{
// 			OrganizationId: pulumi.Any(auth0_organization.Acme.Id),
// 			UserId:         pulumi.Any(auth0_user.Acme_user.Id),
// 			Roles: pulumi.StringArray{
// 				pulumi.Any(auth0_role.Admin.Id),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// As this is not a resource identifiable by an ID within the Auth0 Management API, organization_connection can be imported using a random string. We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4) e.g.
//
// ```sh
//  $ pulumi import auth0:index/organizationMember:OrganizationMember acme_admin 11f4a21b-011a-312d-9217-e291caca36c5
// ```
type OrganizationMember struct {
	pulumi.CustomResourceState

	// The ID of the organization
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
	// Set(string). List of role IDs to assign to member.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// The user ID of the member
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewOrganizationMember registers a new resource with the given unique name, arguments, and options.
func NewOrganizationMember(ctx *pulumi.Context,
	name string, args *OrganizationMemberArgs, opts ...pulumi.ResourceOption) (*OrganizationMember, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OrganizationId == nil {
		return nil, errors.New("invalid value for required argument 'OrganizationId'")
	}
	if args.UserId == nil {
		return nil, errors.New("invalid value for required argument 'UserId'")
	}
	var resource OrganizationMember
	err := ctx.RegisterResource("auth0:index/organizationMember:OrganizationMember", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOrganizationMember gets an existing OrganizationMember resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOrganizationMember(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OrganizationMemberState, opts ...pulumi.ResourceOption) (*OrganizationMember, error) {
	var resource OrganizationMember
	err := ctx.ReadResource("auth0:index/organizationMember:OrganizationMember", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OrganizationMember resources.
type organizationMemberState struct {
	// The ID of the organization
	OrganizationId *string `pulumi:"organizationId"`
	// Set(string). List of role IDs to assign to member.
	Roles []string `pulumi:"roles"`
	// The user ID of the member
	UserId *string `pulumi:"userId"`
}

type OrganizationMemberState struct {
	// The ID of the organization
	OrganizationId pulumi.StringPtrInput
	// Set(string). List of role IDs to assign to member.
	Roles pulumi.StringArrayInput
	// The user ID of the member
	UserId pulumi.StringPtrInput
}

func (OrganizationMemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationMemberState)(nil)).Elem()
}

type organizationMemberArgs struct {
	// The ID of the organization
	OrganizationId string `pulumi:"organizationId"`
	// Set(string). List of role IDs to assign to member.
	Roles []string `pulumi:"roles"`
	// The user ID of the member
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a OrganizationMember resource.
type OrganizationMemberArgs struct {
	// The ID of the organization
	OrganizationId pulumi.StringInput
	// Set(string). List of role IDs to assign to member.
	Roles pulumi.StringArrayInput
	// The user ID of the member
	UserId pulumi.StringInput
}

func (OrganizationMemberArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationMemberArgs)(nil)).Elem()
}

type OrganizationMemberInput interface {
	pulumi.Input

	ToOrganizationMemberOutput() OrganizationMemberOutput
	ToOrganizationMemberOutputWithContext(ctx context.Context) OrganizationMemberOutput
}

func (*OrganizationMember) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationMember)(nil)).Elem()
}

func (i *OrganizationMember) ToOrganizationMemberOutput() OrganizationMemberOutput {
	return i.ToOrganizationMemberOutputWithContext(context.Background())
}

func (i *OrganizationMember) ToOrganizationMemberOutputWithContext(ctx context.Context) OrganizationMemberOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationMemberOutput)
}

// OrganizationMemberArrayInput is an input type that accepts OrganizationMemberArray and OrganizationMemberArrayOutput values.
// You can construct a concrete instance of `OrganizationMemberArrayInput` via:
//
//          OrganizationMemberArray{ OrganizationMemberArgs{...} }
type OrganizationMemberArrayInput interface {
	pulumi.Input

	ToOrganizationMemberArrayOutput() OrganizationMemberArrayOutput
	ToOrganizationMemberArrayOutputWithContext(context.Context) OrganizationMemberArrayOutput
}

type OrganizationMemberArray []OrganizationMemberInput

func (OrganizationMemberArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationMember)(nil)).Elem()
}

func (i OrganizationMemberArray) ToOrganizationMemberArrayOutput() OrganizationMemberArrayOutput {
	return i.ToOrganizationMemberArrayOutputWithContext(context.Background())
}

func (i OrganizationMemberArray) ToOrganizationMemberArrayOutputWithContext(ctx context.Context) OrganizationMemberArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationMemberArrayOutput)
}

// OrganizationMemberMapInput is an input type that accepts OrganizationMemberMap and OrganizationMemberMapOutput values.
// You can construct a concrete instance of `OrganizationMemberMapInput` via:
//
//          OrganizationMemberMap{ "key": OrganizationMemberArgs{...} }
type OrganizationMemberMapInput interface {
	pulumi.Input

	ToOrganizationMemberMapOutput() OrganizationMemberMapOutput
	ToOrganizationMemberMapOutputWithContext(context.Context) OrganizationMemberMapOutput
}

type OrganizationMemberMap map[string]OrganizationMemberInput

func (OrganizationMemberMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationMember)(nil)).Elem()
}

func (i OrganizationMemberMap) ToOrganizationMemberMapOutput() OrganizationMemberMapOutput {
	return i.ToOrganizationMemberMapOutputWithContext(context.Background())
}

func (i OrganizationMemberMap) ToOrganizationMemberMapOutputWithContext(ctx context.Context) OrganizationMemberMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationMemberMapOutput)
}

type OrganizationMemberOutput struct{ *pulumi.OutputState }

func (OrganizationMemberOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationMember)(nil)).Elem()
}

func (o OrganizationMemberOutput) ToOrganizationMemberOutput() OrganizationMemberOutput {
	return o
}

func (o OrganizationMemberOutput) ToOrganizationMemberOutputWithContext(ctx context.Context) OrganizationMemberOutput {
	return o
}

// The ID of the organization
func (o OrganizationMemberOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationMember) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

// Set(string). List of role IDs to assign to member.
func (o OrganizationMemberOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *OrganizationMember) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// The user ID of the member
func (o OrganizationMemberOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationMember) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

type OrganizationMemberArrayOutput struct{ *pulumi.OutputState }

func (OrganizationMemberArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationMember)(nil)).Elem()
}

func (o OrganizationMemberArrayOutput) ToOrganizationMemberArrayOutput() OrganizationMemberArrayOutput {
	return o
}

func (o OrganizationMemberArrayOutput) ToOrganizationMemberArrayOutputWithContext(ctx context.Context) OrganizationMemberArrayOutput {
	return o
}

func (o OrganizationMemberArrayOutput) Index(i pulumi.IntInput) OrganizationMemberOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OrganizationMember {
		return vs[0].([]*OrganizationMember)[vs[1].(int)]
	}).(OrganizationMemberOutput)
}

type OrganizationMemberMapOutput struct{ *pulumi.OutputState }

func (OrganizationMemberMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationMember)(nil)).Elem()
}

func (o OrganizationMemberMapOutput) ToOrganizationMemberMapOutput() OrganizationMemberMapOutput {
	return o
}

func (o OrganizationMemberMapOutput) ToOrganizationMemberMapOutputWithContext(ctx context.Context) OrganizationMemberMapOutput {
	return o
}

func (o OrganizationMemberMapOutput) MapIndex(k pulumi.StringInput) OrganizationMemberOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OrganizationMember {
		return vs[0].(map[string]*OrganizationMember)[vs[1].(string)]
	}).(OrganizationMemberOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationMemberInput)(nil)).Elem(), &OrganizationMember{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationMemberArrayInput)(nil)).Elem(), OrganizationMemberArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationMemberMapInput)(nil)).Elem(), OrganizationMemberMap{})
	pulumi.RegisterOutputType(OrganizationMemberOutput{})
	pulumi.RegisterOutputType(OrganizationMemberArrayOutput{})
	pulumi.RegisterOutputType(OrganizationMemberMapOutput{})
}