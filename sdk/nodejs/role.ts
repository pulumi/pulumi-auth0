// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * With this resource, you can create and manage collections of permissions that can be assigned to users, which are otherwise known as roles. Permissions (scopes) are created on `auth0.ResourceServer`, then associated with roles and optionally, users using this resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myResourceServer = new auth0.ResourceServer("myResourceServer", {
 *     name: "My Resource Server (Managed by Terraform)",
 *     identifier: "my-resource-server-identifier",
 *     signingAlg: "RS256",
 *     tokenLifetime: 86400,
 *     skipConsentForVerifiableFirstPartyClients: true,
 *     enforcePolicies: true,
 *     scopes: [{
 *         value: "read:something",
 *         description: "read something",
 *     }],
 * });
 * const myRole = new auth0.Role("myRole", {
 *     name: "My Role - (Managed by Terraform)",
 *     description: "Role Description...",
 *     permissions: [{
 *         resourceServerIdentifier: myResourceServer.identifier,
 *         name: "read:something",
 *     }],
 * });
 * const myUser = new auth0.User("myUser", {
 *     connectionName: "Username-Password-Authentication",
 *     userId: "auth0|1234567890",
 *     email: "test@test.com",
 *     password: "passpass$12$12",
 *     nickname: "testnick",
 *     username: "testnick",
 *     roles: [myRole.id],
 * });
 * ```
 *
 * ## Import
 *
 * Existing roles can be imported using their ID. # Example
 *
 * ```sh
 *  $ pulumi import auth0:index/role:Role my_role XXXXXXXXXXXXXXXXXXXXXXX
 * ```
 */
export class Role extends pulumi.CustomResource {
    /**
     * Get an existing Role resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RoleState, opts?: pulumi.CustomResourceOptions): Role {
        return new Role(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/role:Role';

    /**
     * Returns true if the given object is an instance of Role.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Role {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Role.__pulumiType;
    }

    /**
     * Description of the role.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Name for this role.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Configuration settings for permissions (scopes) attached to the role.
     */
    public readonly permissions!: pulumi.Output<outputs.RolePermission[] | undefined>;

    /**
     * Create a Role resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RoleArgs | RoleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RoleState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["permissions"] = state ? state.permissions : undefined;
        } else {
            const args = argsOrState as RoleArgs | undefined;
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["description"] = (args ? args.description : undefined) ?? "Managed by Pulumi";
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["permissions"] = args ? args.permissions : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Role.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Role resources.
 */
export interface RoleState {
    /**
     * Description of the role.
     */
    description?: pulumi.Input<string>;
    /**
     * Name for this role.
     */
    name?: pulumi.Input<string>;
    /**
     * Configuration settings for permissions (scopes) attached to the role.
     */
    permissions?: pulumi.Input<pulumi.Input<inputs.RolePermission>[]>;
}

/**
 * The set of arguments for constructing a Role resource.
 */
export interface RoleArgs {
    /**
     * Description of the role.
     */
    description?: pulumi.Input<string>;
    /**
     * Name for this role.
     */
    name: pulumi.Input<string>;
    /**
     * Configuration settings for permissions (scopes) attached to the role.
     */
    permissions?: pulumi.Input<pulumi.Input<inputs.RolePermission>[]>;
}
