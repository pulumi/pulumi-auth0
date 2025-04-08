// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource is used to manage the roles assigned to an organization member.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const reader = new auth0.Role("reader", {name: "Reader"});
 * const writer = new auth0.Role("writer", {name: "Writer"});
 * const user = new auth0.User("user", {
 *     connectionName: "Username-Password-Authentication",
 *     email: "test-user@auth0.com",
 *     password: "MyPass123$",
 * });
 * const myOrg = new auth0.Organization("my_org", {
 *     name: "some-org",
 *     displayName: "Some Org",
 * });
 * const myOrgMember = new auth0.OrganizationMember("my_org_member", {
 *     organizationId: myOrg.id,
 *     userId: user.id,
 * });
 * const role1 = new auth0.OrganizationMemberRole("role1", {
 *     organizationId: myOrg.id,
 *     userId: user.id,
 *     roleId: reader.id,
 * });
 * const role2 = new auth0.OrganizationMemberRole("role2", {
 *     organizationId: myOrg.id,
 *     userId: user.id,
 *     roleId: writer.id,
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported by specifying the
 *
 * organization ID, user ID and role ID separated by "::" (note the double colon)
 *
 * <organizationID>::<userID>::<roleID>
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/organizationMemberRole:OrganizationMemberRole my_org_member_role "org_XXXXX::auth0|XXXXX::role_XXXX"
 * ```
 */
export class OrganizationMemberRole extends pulumi.CustomResource {
    /**
     * Get an existing OrganizationMemberRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OrganizationMemberRoleState, opts?: pulumi.CustomResourceOptions): OrganizationMemberRole {
        return new OrganizationMemberRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/organizationMemberRole:OrganizationMemberRole';

    /**
     * Returns true if the given object is an instance of OrganizationMemberRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OrganizationMemberRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OrganizationMemberRole.__pulumiType;
    }

    /**
     * The ID of the organization.
     */
    public readonly organizationId!: pulumi.Output<string>;
    /**
     * Description of the role.
     */
    public /*out*/ readonly roleDescription!: pulumi.Output<string>;
    /**
     * The role ID to assign to the organization member.
     */
    public readonly roleId!: pulumi.Output<string>;
    /**
     * Name of the role.
     */
    public /*out*/ readonly roleName!: pulumi.Output<string>;
    /**
     * The user ID of the organization member.
     */
    public readonly userId!: pulumi.Output<string>;

    /**
     * Create a OrganizationMemberRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OrganizationMemberRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OrganizationMemberRoleArgs | OrganizationMemberRoleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OrganizationMemberRoleState | undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["roleDescription"] = state ? state.roleDescription : undefined;
            resourceInputs["roleId"] = state ? state.roleId : undefined;
            resourceInputs["roleName"] = state ? state.roleName : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as OrganizationMemberRoleArgs | undefined;
            if ((!args || args.organizationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationId'");
            }
            if ((!args || args.roleId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roleId'");
            }
            if ((!args || args.userId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userId'");
            }
            resourceInputs["organizationId"] = args ? args.organizationId : undefined;
            resourceInputs["roleId"] = args ? args.roleId : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
            resourceInputs["roleDescription"] = undefined /*out*/;
            resourceInputs["roleName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OrganizationMemberRole.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OrganizationMemberRole resources.
 */
export interface OrganizationMemberRoleState {
    /**
     * The ID of the organization.
     */
    organizationId?: pulumi.Input<string>;
    /**
     * Description of the role.
     */
    roleDescription?: pulumi.Input<string>;
    /**
     * The role ID to assign to the organization member.
     */
    roleId?: pulumi.Input<string>;
    /**
     * Name of the role.
     */
    roleName?: pulumi.Input<string>;
    /**
     * The user ID of the organization member.
     */
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OrganizationMemberRole resource.
 */
export interface OrganizationMemberRoleArgs {
    /**
     * The ID of the organization.
     */
    organizationId: pulumi.Input<string>;
    /**
     * The role ID to assign to the organization member.
     */
    roleId: pulumi.Input<string>;
    /**
     * The user ID of the organization member.
     */
    userId: pulumi.Input<string>;
}
