// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource is used to manage members of an organization.
 *
 * !> This resource manages all the members assigned to an organization. In contrast, the `auth0.OrganizationMember`
 * resource only appends a member to an organization. To avoid potential issues, it is recommended not to use this
 * resource in conjunction with the `auth0.OrganizationMember` resource when managing members for the same organization
 * id.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const user1 = new auth0.User("user_1", {
 *     connectionName: "Username-Password-Authentication",
 *     email: "myuser1@auth0.com",
 *     password: "MyPass123$",
 * });
 * const user2 = new auth0.User("user_2", {
 *     connectionName: "Username-Password-Authentication",
 *     email: "myuser2@auth0.com",
 *     password: "MyPass123$",
 * });
 * const myOrg = new auth0.Organization("my_org", {
 *     name: "some-org",
 *     displayName: "Some Organization",
 * });
 * const myMembers = new auth0.OrganizationMembers("my_members", {
 *     organizationId: myOrg.id,
 *     members: [
 *         user1.id,
 *         user2.id,
 *     ],
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * This resource can be imported by specifying the organization ID.
 *
 * # 
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/organizationMembers:OrganizationMembers my_org_members "org_XXXXX"
 * ```
 */
export class OrganizationMembers extends pulumi.CustomResource {
    /**
     * Get an existing OrganizationMembers resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OrganizationMembersState, opts?: pulumi.CustomResourceOptions): OrganizationMembers {
        return new OrganizationMembers(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/organizationMembers:OrganizationMembers';

    /**
     * Returns true if the given object is an instance of OrganizationMembers.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OrganizationMembers {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OrganizationMembers.__pulumiType;
    }

    /**
     * Add user ID(s) directly from the tenant to become members of the organization.
     */
    public readonly members!: pulumi.Output<string[]>;
    /**
     * The ID of the organization to assign the members to.
     */
    public readonly organizationId!: pulumi.Output<string>;

    /**
     * Create a OrganizationMembers resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OrganizationMembersArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OrganizationMembersArgs | OrganizationMembersState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OrganizationMembersState | undefined;
            resourceInputs["members"] = state ? state.members : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
        } else {
            const args = argsOrState as OrganizationMembersArgs | undefined;
            if ((!args || args.members === undefined) && !opts.urn) {
                throw new Error("Missing required property 'members'");
            }
            if ((!args || args.organizationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationId'");
            }
            resourceInputs["members"] = args ? args.members : undefined;
            resourceInputs["organizationId"] = args ? args.organizationId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OrganizationMembers.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OrganizationMembers resources.
 */
export interface OrganizationMembersState {
    /**
     * Add user ID(s) directly from the tenant to become members of the organization.
     */
    members?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the organization to assign the members to.
     */
    organizationId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OrganizationMembers resource.
 */
export interface OrganizationMembersArgs {
    /**
     * Add user ID(s) directly from the tenant to become members of the organization.
     */
    members: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the organization to assign the members to.
     */
    organizationId: pulumi.Input<string>;
}
