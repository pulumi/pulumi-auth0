// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource is used to manage the assignment of members and their roles within an organization.
 *
 * !> This resource appends a member to an organization. In contrast, the `auth0.OrganizationMembers` resource manages
 * all the members assigned to an organization. To avoid potential issues, it is recommended not to use this resource in
 * conjunction with the `auth0.OrganizationMembers` resource when managing members for the same organization id.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const user = new auth0.User("user", {
 *     email: "test-user@auth0.com",
 *     connectionName: "Username-Password-Authentication",
 *     emailVerified: true,
 *     password: "MyPass123$",
 * });
 * const myOrg = new auth0.Organization("myOrg", {displayName: "Admin"});
 * const myOrgMember = new auth0.OrganizationMember("myOrgMember", {
 *     organizationId: myOrg.id,
 *     userId: user.id,
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported by specifying the organization ID and user ID separated by ":". # Example
 *
 * ```sh
 *  $ pulumi import auth0:index/organizationMember:OrganizationMember my_org_member "org_XXXXX:auth0|XXXXX"
 * ```
 */
export class OrganizationMember extends pulumi.CustomResource {
    /**
     * Get an existing OrganizationMember resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OrganizationMemberState, opts?: pulumi.CustomResourceOptions): OrganizationMember {
        return new OrganizationMember(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/organizationMember:OrganizationMember';

    /**
     * Returns true if the given object is an instance of OrganizationMember.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OrganizationMember {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OrganizationMember.__pulumiType;
    }

    /**
     * The ID of the organization to assign the member to.
     */
    public readonly organizationId!: pulumi.Output<string>;
    /**
     * The role ID(s) to assign to the organization member. Managing roles through this attribute is deprecated and it will be
     * removed in a future version. Migrate to the `auth0_organization_member_roles` or the `auth0_organization_member_role`
     * resource to manage organization member roles instead. Check the [MIGRATION
     * GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#organization-member-roles) on how
     * to do that.
     *
     * @deprecated Managing roles through this attribute is deprecated and it will be removed in a future version. Migrate to the `auth0_organization_member_roles` or the `auth0_organization_member_role` resource to manage organization member roles instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#organization-member-roles) on how to do that.
     */
    public readonly roles!: pulumi.Output<string[] | undefined>;
    /**
     * ID of the user to add as an organization member.
     */
    public readonly userId!: pulumi.Output<string>;

    /**
     * Create a OrganizationMember resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OrganizationMemberArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OrganizationMemberArgs | OrganizationMemberState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OrganizationMemberState | undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as OrganizationMemberArgs | undefined;
            if ((!args || args.organizationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationId'");
            }
            if ((!args || args.userId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userId'");
            }
            resourceInputs["organizationId"] = args ? args.organizationId : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OrganizationMember.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OrganizationMember resources.
 */
export interface OrganizationMemberState {
    /**
     * The ID of the organization to assign the member to.
     */
    organizationId?: pulumi.Input<string>;
    /**
     * The role ID(s) to assign to the organization member. Managing roles through this attribute is deprecated and it will be
     * removed in a future version. Migrate to the `auth0_organization_member_roles` or the `auth0_organization_member_role`
     * resource to manage organization member roles instead. Check the [MIGRATION
     * GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#organization-member-roles) on how
     * to do that.
     *
     * @deprecated Managing roles through this attribute is deprecated and it will be removed in a future version. Migrate to the `auth0_organization_member_roles` or the `auth0_organization_member_role` resource to manage organization member roles instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#organization-member-roles) on how to do that.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of the user to add as an organization member.
     */
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OrganizationMember resource.
 */
export interface OrganizationMemberArgs {
    /**
     * The ID of the organization to assign the member to.
     */
    organizationId: pulumi.Input<string>;
    /**
     * The role ID(s) to assign to the organization member. Managing roles through this attribute is deprecated and it will be
     * removed in a future version. Migrate to the `auth0_organization_member_roles` or the `auth0_organization_member_role`
     * resource to manage organization member roles instead. Check the [MIGRATION
     * GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#organization-member-roles) on how
     * to do that.
     *
     * @deprecated Managing roles through this attribute is deprecated and it will be removed in a future version. Migrate to the `auth0_organization_member_roles` or the `auth0_organization_member_role` resource to manage organization member roles instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#organization-member-roles) on how to do that.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of the user to add as an organization member.
     */
    userId: pulumi.Input<string>;
}
