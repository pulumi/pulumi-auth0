// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The Organizations feature represents a broad update to the Auth0 platform that
// allows our business-to-business (B2B) customers to better manage their partners
// and customers, and to customize the ways that end-users access their
// applications. Auth0 customers can use Organizations to:
//
//   - Represent their business customers and partners in Auth0 and manage their
//     membership.
//   - Configure branded, federated login flows for each business.
//   - Build administration capabilities into their products, using Organizations
//     APIs, so that those businesses can manage their own organizations.
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
//			_, err := auth0.NewOrganization(ctx, "acme", &auth0.OrganizationArgs{
//				DisplayName: pulumi.String("Acme Inc."),
//				Branding: &OrganizationBrandingArgs{
//					LogoUrl: pulumi.String("https://acme.com/logo.svg"),
//					Colors: pulumi.StringMap{
//						"primary":         pulumi.String("#e3e2f0"),
//						"page_background": pulumi.String("#e3e2ff"),
//					},
//				},
//				Connections: OrganizationConnectionTypeArray{
//					&OrganizationConnectionTypeArgs{
//						ConnectionId:            pulumi.Any(auth0_connection.Acme.Id),
//						AssignMembershipOnLogin: pulumi.Bool(true),
//					},
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
// Existing organizations can be imported using organization id, e.g.
//
// ```sh
//
//	$ pulumi import auth0:index/organization:Organization acme org_XXXXXXXXXXXXXX
//
// ```
type Organization struct {
	pulumi.CustomResourceState

	// Defines how to style the login pages. For details, see
	// Branding
	Branding OrganizationBrandingOutput `pulumi:"branding"`
	// Connections assigned to the organization. For
	// details, see Connections
	//
	// Deprecated: Management of organizations through this property has been deprecated in favor of the `auth0_organization_connection` resource and will be deleted in future versions. It is advised to migrate all managed organization connections to the new resource type.
	Connections OrganizationConnectionTypeArrayOutput `pulumi:"connections"`
	// Friendly name of this organization
	DisplayName pulumi.StringPtrOutput `pulumi:"displayName"`
	// Metadata associated with the organization, Maximum of
	// 10 metadata properties allowed
	Metadata pulumi.StringMapOutput `pulumi:"metadata"`
	// The name of this organization
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewOrganization registers a new resource with the given unique name, arguments, and options.
func NewOrganization(ctx *pulumi.Context,
	name string, args *OrganizationArgs, opts ...pulumi.ResourceOption) (*Organization, error) {
	if args == nil {
		args = &OrganizationArgs{}
	}

	var resource Organization
	err := ctx.RegisterResource("auth0:index/organization:Organization", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOrganization gets an existing Organization resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOrganization(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OrganizationState, opts ...pulumi.ResourceOption) (*Organization, error) {
	var resource Organization
	err := ctx.ReadResource("auth0:index/organization:Organization", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Organization resources.
type organizationState struct {
	// Defines how to style the login pages. For details, see
	// Branding
	Branding *OrganizationBranding `pulumi:"branding"`
	// Connections assigned to the organization. For
	// details, see Connections
	//
	// Deprecated: Management of organizations through this property has been deprecated in favor of the `auth0_organization_connection` resource and will be deleted in future versions. It is advised to migrate all managed organization connections to the new resource type.
	Connections []OrganizationConnectionType `pulumi:"connections"`
	// Friendly name of this organization
	DisplayName *string `pulumi:"displayName"`
	// Metadata associated with the organization, Maximum of
	// 10 metadata properties allowed
	Metadata map[string]string `pulumi:"metadata"`
	// The name of this organization
	Name *string `pulumi:"name"`
}

type OrganizationState struct {
	// Defines how to style the login pages. For details, see
	// Branding
	Branding OrganizationBrandingPtrInput
	// Connections assigned to the organization. For
	// details, see Connections
	//
	// Deprecated: Management of organizations through this property has been deprecated in favor of the `auth0_organization_connection` resource and will be deleted in future versions. It is advised to migrate all managed organization connections to the new resource type.
	Connections OrganizationConnectionTypeArrayInput
	// Friendly name of this organization
	DisplayName pulumi.StringPtrInput
	// Metadata associated with the organization, Maximum of
	// 10 metadata properties allowed
	Metadata pulumi.StringMapInput
	// The name of this organization
	Name pulumi.StringPtrInput
}

func (OrganizationState) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationState)(nil)).Elem()
}

type organizationArgs struct {
	// Defines how to style the login pages. For details, see
	// Branding
	Branding *OrganizationBranding `pulumi:"branding"`
	// Connections assigned to the organization. For
	// details, see Connections
	//
	// Deprecated: Management of organizations through this property has been deprecated in favor of the `auth0_organization_connection` resource and will be deleted in future versions. It is advised to migrate all managed organization connections to the new resource type.
	Connections []OrganizationConnectionType `pulumi:"connections"`
	// Friendly name of this organization
	DisplayName *string `pulumi:"displayName"`
	// Metadata associated with the organization, Maximum of
	// 10 metadata properties allowed
	Metadata map[string]string `pulumi:"metadata"`
	// The name of this organization
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a Organization resource.
type OrganizationArgs struct {
	// Defines how to style the login pages. For details, see
	// Branding
	Branding OrganizationBrandingPtrInput
	// Connections assigned to the organization. For
	// details, see Connections
	//
	// Deprecated: Management of organizations through this property has been deprecated in favor of the `auth0_organization_connection` resource and will be deleted in future versions. It is advised to migrate all managed organization connections to the new resource type.
	Connections OrganizationConnectionTypeArrayInput
	// Friendly name of this organization
	DisplayName pulumi.StringPtrInput
	// Metadata associated with the organization, Maximum of
	// 10 metadata properties allowed
	Metadata pulumi.StringMapInput
	// The name of this organization
	Name pulumi.StringPtrInput
}

func (OrganizationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationArgs)(nil)).Elem()
}

type OrganizationInput interface {
	pulumi.Input

	ToOrganizationOutput() OrganizationOutput
	ToOrganizationOutputWithContext(ctx context.Context) OrganizationOutput
}

func (*Organization) ElementType() reflect.Type {
	return reflect.TypeOf((**Organization)(nil)).Elem()
}

func (i *Organization) ToOrganizationOutput() OrganizationOutput {
	return i.ToOrganizationOutputWithContext(context.Background())
}

func (i *Organization) ToOrganizationOutputWithContext(ctx context.Context) OrganizationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationOutput)
}

// OrganizationArrayInput is an input type that accepts OrganizationArray and OrganizationArrayOutput values.
// You can construct a concrete instance of `OrganizationArrayInput` via:
//
//	OrganizationArray{ OrganizationArgs{...} }
type OrganizationArrayInput interface {
	pulumi.Input

	ToOrganizationArrayOutput() OrganizationArrayOutput
	ToOrganizationArrayOutputWithContext(context.Context) OrganizationArrayOutput
}

type OrganizationArray []OrganizationInput

func (OrganizationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Organization)(nil)).Elem()
}

func (i OrganizationArray) ToOrganizationArrayOutput() OrganizationArrayOutput {
	return i.ToOrganizationArrayOutputWithContext(context.Background())
}

func (i OrganizationArray) ToOrganizationArrayOutputWithContext(ctx context.Context) OrganizationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationArrayOutput)
}

// OrganizationMapInput is an input type that accepts OrganizationMap and OrganizationMapOutput values.
// You can construct a concrete instance of `OrganizationMapInput` via:
//
//	OrganizationMap{ "key": OrganizationArgs{...} }
type OrganizationMapInput interface {
	pulumi.Input

	ToOrganizationMapOutput() OrganizationMapOutput
	ToOrganizationMapOutputWithContext(context.Context) OrganizationMapOutput
}

type OrganizationMap map[string]OrganizationInput

func (OrganizationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Organization)(nil)).Elem()
}

func (i OrganizationMap) ToOrganizationMapOutput() OrganizationMapOutput {
	return i.ToOrganizationMapOutputWithContext(context.Background())
}

func (i OrganizationMap) ToOrganizationMapOutputWithContext(ctx context.Context) OrganizationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationMapOutput)
}

type OrganizationOutput struct{ *pulumi.OutputState }

func (OrganizationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Organization)(nil)).Elem()
}

func (o OrganizationOutput) ToOrganizationOutput() OrganizationOutput {
	return o
}

func (o OrganizationOutput) ToOrganizationOutputWithContext(ctx context.Context) OrganizationOutput {
	return o
}

// Defines how to style the login pages. For details, see
// Branding
func (o OrganizationOutput) Branding() OrganizationBrandingOutput {
	return o.ApplyT(func(v *Organization) OrganizationBrandingOutput { return v.Branding }).(OrganizationBrandingOutput)
}

// Connections assigned to the organization. For
// details, see Connections
//
// Deprecated: Management of organizations through this property has been deprecated in favor of the `auth0_organization_connection` resource and will be deleted in future versions. It is advised to migrate all managed organization connections to the new resource type.
func (o OrganizationOutput) Connections() OrganizationConnectionTypeArrayOutput {
	return o.ApplyT(func(v *Organization) OrganizationConnectionTypeArrayOutput { return v.Connections }).(OrganizationConnectionTypeArrayOutput)
}

// Friendly name of this organization
func (o OrganizationOutput) DisplayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Organization) pulumi.StringPtrOutput { return v.DisplayName }).(pulumi.StringPtrOutput)
}

// Metadata associated with the organization, Maximum of
// 10 metadata properties allowed
func (o OrganizationOutput) Metadata() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Organization) pulumi.StringMapOutput { return v.Metadata }).(pulumi.StringMapOutput)
}

// The name of this organization
func (o OrganizationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Organization) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type OrganizationArrayOutput struct{ *pulumi.OutputState }

func (OrganizationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Organization)(nil)).Elem()
}

func (o OrganizationArrayOutput) ToOrganizationArrayOutput() OrganizationArrayOutput {
	return o
}

func (o OrganizationArrayOutput) ToOrganizationArrayOutputWithContext(ctx context.Context) OrganizationArrayOutput {
	return o
}

func (o OrganizationArrayOutput) Index(i pulumi.IntInput) OrganizationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Organization {
		return vs[0].([]*Organization)[vs[1].(int)]
	}).(OrganizationOutput)
}

type OrganizationMapOutput struct{ *pulumi.OutputState }

func (OrganizationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Organization)(nil)).Elem()
}

func (o OrganizationMapOutput) ToOrganizationMapOutput() OrganizationMapOutput {
	return o
}

func (o OrganizationMapOutput) ToOrganizationMapOutputWithContext(ctx context.Context) OrganizationMapOutput {
	return o
}

func (o OrganizationMapOutput) MapIndex(k pulumi.StringInput) OrganizationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Organization {
		return vs[0].(map[string]*Organization)[vs[1].(string)]
	}).(OrganizationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationInput)(nil)).Elem(), &Organization{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationArrayInput)(nil)).Elem(), OrganizationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationMapInput)(nil)).Elem(), OrganizationMap{})
	pulumi.RegisterOutputType(OrganizationOutput{})
	pulumi.RegisterOutputType(OrganizationArrayOutput{})
	pulumi.RegisterOutputType(OrganizationMapOutput{})
}
