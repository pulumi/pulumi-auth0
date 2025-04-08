// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * With this resource, you can manage assigned roles for a user.
 *
 * !> This resource manages all the roles assigned to a user. In contrast, the `auth0.UserRole` resource only appends a
 * role to a user. To avoid potential issues, it is recommended not to use this resource in conjunction with the
 * `auth0.UserRole` resource when managing roles for the same user id.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // Example:
 * const admin = new auth0.Role("admin", {
 *     name: "admin",
 *     description: "Administrator",
 * });
 * const user = new auth0.User("user", {
 *     connectionName: "Username-Password-Authentication",
 *     username: "unique_username",
 *     name: "Firstname Lastname",
 *     email: "test@test.com",
 *     password: "passpass$12$12",
 * });
 * const userRoles = new auth0.UserRoles("user_roles", {
 *     userId: user.id,
 *     roles: [admin.id],
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported using the user ID.
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/userRoles:UserRoles user_roles "auth0|111111111111111111111111"
 * ```
 */
export class UserRoles extends pulumi.CustomResource {
    /**
     * Get an existing UserRoles resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserRolesState, opts?: pulumi.CustomResourceOptions): UserRoles {
        return new UserRoles(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/userRoles:UserRoles';

    /**
     * Returns true if the given object is an instance of UserRoles.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UserRoles {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UserRoles.__pulumiType;
    }

    /**
     * Set of IDs of roles assigned to the user.
     */
    public readonly roles!: pulumi.Output<string[]>;
    /**
     * ID of the user.
     */
    public readonly userId!: pulumi.Output<string>;

    /**
     * Create a UserRoles resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserRolesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserRolesArgs | UserRolesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserRolesState | undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as UserRolesArgs | undefined;
            if ((!args || args.roles === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roles'");
            }
            if ((!args || args.userId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userId'");
            }
            resourceInputs["roles"] = args ? args.roles : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(UserRoles.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UserRoles resources.
 */
export interface UserRolesState {
    /**
     * Set of IDs of roles assigned to the user.
     */
    roles?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of the user.
     */
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a UserRoles resource.
 */
export interface UserRolesArgs {
    /**
     * Set of IDs of roles assigned to the user.
     */
    roles: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ID of the user.
     */
    userId: pulumi.Input<string>;
}
