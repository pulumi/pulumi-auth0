// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This resource is used to manage the assignment of members and their roles within an organization.
//
// !> This resource appends a member to an organization. In contrast, the `OrganizationMembers` resource manages
// all the members assigned to an organization. To avoid potential issues, it is recommended not to use this resource in
// conjunction with the `OrganizationMembers` resource when managing members for the same organization id.
//
// ## Import
//
// This resource can be imported by specifying the organization ID and user ID separated by "::" (note the double colon) <organizationID>::<userID> # Example
//
// ```sh
//
//	$ pulumi import auth0:index/organizationMember:OrganizationMember my_org_member "org_XXXXX::auth0|XXXXX"
//
// ```
type OrganizationMember struct {
	pulumi.CustomResourceState

	// The ID of the organization to assign the member to.
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
	// ID of the user to add as an organization member.
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
	opts = internal.PkgResourceDefaultOpts(opts)
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
	// The ID of the organization to assign the member to.
	OrganizationId *string `pulumi:"organizationId"`
	// ID of the user to add as an organization member.
	UserId *string `pulumi:"userId"`
}

type OrganizationMemberState struct {
	// The ID of the organization to assign the member to.
	OrganizationId pulumi.StringPtrInput
	// ID of the user to add as an organization member.
	UserId pulumi.StringPtrInput
}

func (OrganizationMemberState) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationMemberState)(nil)).Elem()
}

type organizationMemberArgs struct {
	// The ID of the organization to assign the member to.
	OrganizationId string `pulumi:"organizationId"`
	// ID of the user to add as an organization member.
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a OrganizationMember resource.
type OrganizationMemberArgs struct {
	// The ID of the organization to assign the member to.
	OrganizationId pulumi.StringInput
	// ID of the user to add as an organization member.
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

func (i *OrganizationMember) ToOutput(ctx context.Context) pulumix.Output[*OrganizationMember] {
	return pulumix.Output[*OrganizationMember]{
		OutputState: i.ToOrganizationMemberOutputWithContext(ctx).OutputState,
	}
}

// OrganizationMemberArrayInput is an input type that accepts OrganizationMemberArray and OrganizationMemberArrayOutput values.
// You can construct a concrete instance of `OrganizationMemberArrayInput` via:
//
//	OrganizationMemberArray{ OrganizationMemberArgs{...} }
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

func (i OrganizationMemberArray) ToOutput(ctx context.Context) pulumix.Output[[]*OrganizationMember] {
	return pulumix.Output[[]*OrganizationMember]{
		OutputState: i.ToOrganizationMemberArrayOutputWithContext(ctx).OutputState,
	}
}

// OrganizationMemberMapInput is an input type that accepts OrganizationMemberMap and OrganizationMemberMapOutput values.
// You can construct a concrete instance of `OrganizationMemberMapInput` via:
//
//	OrganizationMemberMap{ "key": OrganizationMemberArgs{...} }
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

func (i OrganizationMemberMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*OrganizationMember] {
	return pulumix.Output[map[string]*OrganizationMember]{
		OutputState: i.ToOrganizationMemberMapOutputWithContext(ctx).OutputState,
	}
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

func (o OrganizationMemberOutput) ToOutput(ctx context.Context) pulumix.Output[*OrganizationMember] {
	return pulumix.Output[*OrganizationMember]{
		OutputState: o.OutputState,
	}
}

// The ID of the organization to assign the member to.
func (o OrganizationMemberOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationMember) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

// ID of the user to add as an organization member.
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

func (o OrganizationMemberArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*OrganizationMember] {
	return pulumix.Output[[]*OrganizationMember]{
		OutputState: o.OutputState,
	}
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

func (o OrganizationMemberMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*OrganizationMember] {
	return pulumix.Output[map[string]*OrganizationMember]{
		OutputState: o.OutputState,
	}
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
