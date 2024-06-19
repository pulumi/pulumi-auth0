// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * With this resource, you can manage enabled connections on an organization.
 *
 * !> This resource appends a connection to an organization. In contrast, the `auth0.OrganizationConnections` resource
 * manages all the connections enabled for an organization. To avoid potential issues, it is recommended not to use this
 * resource in conjunction with the `auth0.OrganizationConnections` resource when managing enabled connections for the
 * same organization id.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myConnection = new auth0.Connection("my_connection", {
 *     name: "My Connection",
 *     strategy: "auth0",
 * });
 * const myOrganization = new auth0.Organization("my_organization", {
 *     name: "my-organization",
 *     displayName: "My Organization",
 * });
 * const myOrgConn = new auth0.OrganizationConnection("my_org_conn", {
 *     organizationId: myOrganization.id,
 *     connectionId: myConnection.id,
 *     assignMembershipOnLogin: true,
 *     isSignupEnabled: false,
 *     showAsButton: true,
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported by specifying the
 *
 * organization ID and connection ID separated by "::" (note the double colon)
 *
 * <organizationID>::<connectionID>
 *
 * # 
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/organizationConnection:OrganizationConnection my_org_conn "org_XXXXX::con_XXXXX"
 * ```
 */
export class OrganizationConnection extends pulumi.CustomResource {
    /**
     * Get an existing OrganizationConnection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OrganizationConnectionState, opts?: pulumi.CustomResourceOptions): OrganizationConnection {
        return new OrganizationConnection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/organizationConnection:OrganizationConnection';

    /**
     * Returns true if the given object is an instance of OrganizationConnection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OrganizationConnection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OrganizationConnection.__pulumiType;
    }

    /**
     * When `true`, all users that log in with this connection will be automatically granted membership in the organization. When `false`, users must be granted membership in the organization before logging in with this connection.
     */
    public readonly assignMembershipOnLogin!: pulumi.Output<boolean | undefined>;
    /**
     * The ID of the connection to enable for the organization.
     */
    public readonly connectionId!: pulumi.Output<string>;
    /**
     * Determines whether organization sign-up should be enabled for this organization connection. Only applicable for database connections. Note: `isSignupEnabled` can only be `true` if `assignMembershipOnLogin` is `true`.
     */
    public readonly isSignupEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the enabled connection.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The ID of the organization to enable the connection for.
     */
    public readonly organizationId!: pulumi.Output<string>;
    /**
     * Determines whether a connection should be displayed on this organization’s login prompt. Only applicable for enterprise connections.
     */
    public readonly showAsButton!: pulumi.Output<boolean | undefined>;
    /**
     * The strategy of the enabled connection.
     */
    public /*out*/ readonly strategy!: pulumi.Output<string>;

    /**
     * Create a OrganizationConnection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OrganizationConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OrganizationConnectionArgs | OrganizationConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OrganizationConnectionState | undefined;
            resourceInputs["assignMembershipOnLogin"] = state ? state.assignMembershipOnLogin : undefined;
            resourceInputs["connectionId"] = state ? state.connectionId : undefined;
            resourceInputs["isSignupEnabled"] = state ? state.isSignupEnabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["showAsButton"] = state ? state.showAsButton : undefined;
            resourceInputs["strategy"] = state ? state.strategy : undefined;
        } else {
            const args = argsOrState as OrganizationConnectionArgs | undefined;
            if ((!args || args.connectionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionId'");
            }
            if ((!args || args.organizationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'organizationId'");
            }
            resourceInputs["assignMembershipOnLogin"] = args ? args.assignMembershipOnLogin : undefined;
            resourceInputs["connectionId"] = args ? args.connectionId : undefined;
            resourceInputs["isSignupEnabled"] = args ? args.isSignupEnabled : undefined;
            resourceInputs["organizationId"] = args ? args.organizationId : undefined;
            resourceInputs["showAsButton"] = args ? args.showAsButton : undefined;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["strategy"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OrganizationConnection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OrganizationConnection resources.
 */
export interface OrganizationConnectionState {
    /**
     * When `true`, all users that log in with this connection will be automatically granted membership in the organization. When `false`, users must be granted membership in the organization before logging in with this connection.
     */
    assignMembershipOnLogin?: pulumi.Input<boolean>;
    /**
     * The ID of the connection to enable for the organization.
     */
    connectionId?: pulumi.Input<string>;
    /**
     * Determines whether organization sign-up should be enabled for this organization connection. Only applicable for database connections. Note: `isSignupEnabled` can only be `true` if `assignMembershipOnLogin` is `true`.
     */
    isSignupEnabled?: pulumi.Input<boolean>;
    /**
     * The name of the enabled connection.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the organization to enable the connection for.
     */
    organizationId?: pulumi.Input<string>;
    /**
     * Determines whether a connection should be displayed on this organization’s login prompt. Only applicable for enterprise connections.
     */
    showAsButton?: pulumi.Input<boolean>;
    /**
     * The strategy of the enabled connection.
     */
    strategy?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OrganizationConnection resource.
 */
export interface OrganizationConnectionArgs {
    /**
     * When `true`, all users that log in with this connection will be automatically granted membership in the organization. When `false`, users must be granted membership in the organization before logging in with this connection.
     */
    assignMembershipOnLogin?: pulumi.Input<boolean>;
    /**
     * The ID of the connection to enable for the organization.
     */
    connectionId: pulumi.Input<string>;
    /**
     * Determines whether organization sign-up should be enabled for this organization connection. Only applicable for database connections. Note: `isSignupEnabled` can only be `true` if `assignMembershipOnLogin` is `true`.
     */
    isSignupEnabled?: pulumi.Input<boolean>;
    /**
     * The ID of the organization to enable the connection for.
     */
    organizationId: pulumi.Input<string>;
    /**
     * Determines whether a connection should be displayed on this organization’s login prompt. Only applicable for enterprise connections.
     */
    showAsButton?: pulumi.Input<boolean>;
}
