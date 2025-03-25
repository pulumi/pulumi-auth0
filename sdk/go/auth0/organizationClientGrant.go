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

// With this resource, you can manage a client grant associated with an organization.
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
//			// Create an Organization
//			myOrganization, err := auth0.NewOrganization(ctx, "my_organization", &auth0.OrganizationArgs{
//				Name:        pulumi.String("test-org-acceptance-testing"),
//				DisplayName: pulumi.String("Test Org Acceptance Testing"),
//			})
//			if err != nil {
//				return err
//			}
//			// Create a Resource Server
//			newResourceServer, err := auth0.NewResourceServer(ctx, "new_resource_server", &auth0.ResourceServerArgs{
//				Name:       pulumi.String("Example API"),
//				Identifier: pulumi.String("https://api.travel00123.com/"),
//			})
//			if err != nil {
//				return err
//			}
//			// Create a Client by referencing the newly created organisation or by reference an existing one.
//			myTestClient, err := auth0.NewClient(ctx, "my_test_client", &auth0.ClientArgs{
//				Name:              pulumi.String("test_client"),
//				OrganizationUsage: pulumi.String("allow"),
//				DefaultOrganization: &auth0.ClientDefaultOrganizationArgs{
//					OrganizationId: myOrganization.ID(),
//					Flows: pulumi.StringArray{
//						pulumi.String("client_credentials"),
//					},
//				},
//			}, pulumi.DependsOn([]pulumi.Resource{
//				myOrganization,
//				newResourceServer,
//			}))
//			if err != nil {
//				return err
//			}
//			// Create a client grant which is associated with the client and resource server.
//			myClientGrant, err := auth0.NewClientGrant(ctx, "my_client_grant", &auth0.ClientGrantArgs{
//				ClientId: myTestClient.ID(),
//				Audience: newResourceServer.Identifier,
//				Scopes: pulumi.StringArray{
//					pulumi.String("create:organization_client_grants"),
//					pulumi.String("create:resource"),
//				},
//				AllowAnyOrganization: pulumi.Bool(true),
//				OrganizationUsage:    pulumi.String("allow"),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				newResourceServer,
//				myTestClient,
//			}))
//			if err != nil {
//				return err
//			}
//			// Create the organization and client grant association
//			_, err = auth0.NewOrganizationClientGrant(ctx, "associate_org_client_grant", &auth0.OrganizationClientGrantArgs{
//				OrganizationId: myOrganization.ID(),
//				GrantId:        myClientGrant.ID(),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				myClientGrant,
//			}))
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
// # This resource can be imported by specifying the
//
// organization ID and client grant ID separated by "::" (note the double colon)
//
// <organizationID>::<clientGrantID>
//
// Example:
//
// ```sh
// $ pulumi import auth0:index/organizationClientGrant:OrganizationClientGrant my_org_client_grant "org_XXXXX::cgr_XXXXX"
// ```
type OrganizationClientGrant struct {
	pulumi.CustomResourceState

	// A Client Grant ID to add to the organization.
	GrantId pulumi.StringOutput `pulumi:"grantId"`
	// The ID of the organization to associate the client grant.
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
}

// NewOrganizationClientGrant registers a new resource with the given unique name, arguments, and options.
func NewOrganizationClientGrant(ctx *pulumi.Context,
	name string, args *OrganizationClientGrantArgs, opts ...pulumi.ResourceOption) (*OrganizationClientGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.GrantId == nil {
		return nil, errors.New("invalid value for required argument 'GrantId'")
	}
	if args.OrganizationId == nil {
		return nil, errors.New("invalid value for required argument 'OrganizationId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OrganizationClientGrant
	err := ctx.RegisterResource("auth0:index/organizationClientGrant:OrganizationClientGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOrganizationClientGrant gets an existing OrganizationClientGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOrganizationClientGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OrganizationClientGrantState, opts ...pulumi.ResourceOption) (*OrganizationClientGrant, error) {
	var resource OrganizationClientGrant
	err := ctx.ReadResource("auth0:index/organizationClientGrant:OrganizationClientGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OrganizationClientGrant resources.
type organizationClientGrantState struct {
	// A Client Grant ID to add to the organization.
	GrantId *string `pulumi:"grantId"`
	// The ID of the organization to associate the client grant.
	OrganizationId *string `pulumi:"organizationId"`
}

type OrganizationClientGrantState struct {
	// A Client Grant ID to add to the organization.
	GrantId pulumi.StringPtrInput
	// The ID of the organization to associate the client grant.
	OrganizationId pulumi.StringPtrInput
}

func (OrganizationClientGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationClientGrantState)(nil)).Elem()
}

type organizationClientGrantArgs struct {
	// A Client Grant ID to add to the organization.
	GrantId string `pulumi:"grantId"`
	// The ID of the organization to associate the client grant.
	OrganizationId string `pulumi:"organizationId"`
}

// The set of arguments for constructing a OrganizationClientGrant resource.
type OrganizationClientGrantArgs struct {
	// A Client Grant ID to add to the organization.
	GrantId pulumi.StringInput
	// The ID of the organization to associate the client grant.
	OrganizationId pulumi.StringInput
}

func (OrganizationClientGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*organizationClientGrantArgs)(nil)).Elem()
}

type OrganizationClientGrantInput interface {
	pulumi.Input

	ToOrganizationClientGrantOutput() OrganizationClientGrantOutput
	ToOrganizationClientGrantOutputWithContext(ctx context.Context) OrganizationClientGrantOutput
}

func (*OrganizationClientGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationClientGrant)(nil)).Elem()
}

func (i *OrganizationClientGrant) ToOrganizationClientGrantOutput() OrganizationClientGrantOutput {
	return i.ToOrganizationClientGrantOutputWithContext(context.Background())
}

func (i *OrganizationClientGrant) ToOrganizationClientGrantOutputWithContext(ctx context.Context) OrganizationClientGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationClientGrantOutput)
}

// OrganizationClientGrantArrayInput is an input type that accepts OrganizationClientGrantArray and OrganizationClientGrantArrayOutput values.
// You can construct a concrete instance of `OrganizationClientGrantArrayInput` via:
//
//	OrganizationClientGrantArray{ OrganizationClientGrantArgs{...} }
type OrganizationClientGrantArrayInput interface {
	pulumi.Input

	ToOrganizationClientGrantArrayOutput() OrganizationClientGrantArrayOutput
	ToOrganizationClientGrantArrayOutputWithContext(context.Context) OrganizationClientGrantArrayOutput
}

type OrganizationClientGrantArray []OrganizationClientGrantInput

func (OrganizationClientGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationClientGrant)(nil)).Elem()
}

func (i OrganizationClientGrantArray) ToOrganizationClientGrantArrayOutput() OrganizationClientGrantArrayOutput {
	return i.ToOrganizationClientGrantArrayOutputWithContext(context.Background())
}

func (i OrganizationClientGrantArray) ToOrganizationClientGrantArrayOutputWithContext(ctx context.Context) OrganizationClientGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationClientGrantArrayOutput)
}

// OrganizationClientGrantMapInput is an input type that accepts OrganizationClientGrantMap and OrganizationClientGrantMapOutput values.
// You can construct a concrete instance of `OrganizationClientGrantMapInput` via:
//
//	OrganizationClientGrantMap{ "key": OrganizationClientGrantArgs{...} }
type OrganizationClientGrantMapInput interface {
	pulumi.Input

	ToOrganizationClientGrantMapOutput() OrganizationClientGrantMapOutput
	ToOrganizationClientGrantMapOutputWithContext(context.Context) OrganizationClientGrantMapOutput
}

type OrganizationClientGrantMap map[string]OrganizationClientGrantInput

func (OrganizationClientGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationClientGrant)(nil)).Elem()
}

func (i OrganizationClientGrantMap) ToOrganizationClientGrantMapOutput() OrganizationClientGrantMapOutput {
	return i.ToOrganizationClientGrantMapOutputWithContext(context.Background())
}

func (i OrganizationClientGrantMap) ToOrganizationClientGrantMapOutputWithContext(ctx context.Context) OrganizationClientGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OrganizationClientGrantMapOutput)
}

type OrganizationClientGrantOutput struct{ *pulumi.OutputState }

func (OrganizationClientGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OrganizationClientGrant)(nil)).Elem()
}

func (o OrganizationClientGrantOutput) ToOrganizationClientGrantOutput() OrganizationClientGrantOutput {
	return o
}

func (o OrganizationClientGrantOutput) ToOrganizationClientGrantOutputWithContext(ctx context.Context) OrganizationClientGrantOutput {
	return o
}

// A Client Grant ID to add to the organization.
func (o OrganizationClientGrantOutput) GrantId() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationClientGrant) pulumi.StringOutput { return v.GrantId }).(pulumi.StringOutput)
}

// The ID of the organization to associate the client grant.
func (o OrganizationClientGrantOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *OrganizationClientGrant) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

type OrganizationClientGrantArrayOutput struct{ *pulumi.OutputState }

func (OrganizationClientGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OrganizationClientGrant)(nil)).Elem()
}

func (o OrganizationClientGrantArrayOutput) ToOrganizationClientGrantArrayOutput() OrganizationClientGrantArrayOutput {
	return o
}

func (o OrganizationClientGrantArrayOutput) ToOrganizationClientGrantArrayOutputWithContext(ctx context.Context) OrganizationClientGrantArrayOutput {
	return o
}

func (o OrganizationClientGrantArrayOutput) Index(i pulumi.IntInput) OrganizationClientGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OrganizationClientGrant {
		return vs[0].([]*OrganizationClientGrant)[vs[1].(int)]
	}).(OrganizationClientGrantOutput)
}

type OrganizationClientGrantMapOutput struct{ *pulumi.OutputState }

func (OrganizationClientGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OrganizationClientGrant)(nil)).Elem()
}

func (o OrganizationClientGrantMapOutput) ToOrganizationClientGrantMapOutput() OrganizationClientGrantMapOutput {
	return o
}

func (o OrganizationClientGrantMapOutput) ToOrganizationClientGrantMapOutputWithContext(ctx context.Context) OrganizationClientGrantMapOutput {
	return o
}

func (o OrganizationClientGrantMapOutput) MapIndex(k pulumi.StringInput) OrganizationClientGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OrganizationClientGrant {
		return vs[0].(map[string]*OrganizationClientGrant)[vs[1].(string)]
	}).(OrganizationClientGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationClientGrantInput)(nil)).Elem(), &OrganizationClientGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationClientGrantArrayInput)(nil)).Elem(), OrganizationClientGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OrganizationClientGrantMapInput)(nil)).Elem(), OrganizationClientGrantMap{})
	pulumi.RegisterOutputType(OrganizationClientGrantOutput{})
	pulumi.RegisterOutputType(OrganizationClientGrantArrayOutput{})
	pulumi.RegisterOutputType(OrganizationClientGrantMapOutput{})
}
