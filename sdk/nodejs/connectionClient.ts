// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * With this resource, you can enable a single client on a connection.
 *
 * !> This resource appends an enabled client to a connection. In contrast, the `auth0.ConnectionClients` resource
 * manages all the clients enabled for a connection. To avoid potential issues, it is recommended not to use this
 * resource in conjunction with the `auth0.ConnectionClients` resource when managing enabled clients for the
 * same connection id.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myConn = new auth0.Connection("myConn", {strategy: "auth0"});
 * const myClient = new auth0.Client("myClient", {});
 * // One connection to one client association.
 * // To prevent issues, avoid using this resource together with the `auth0_connection_clients` resource.
 * const myConnClientAssoc = new auth0.ConnectionClient("myConnClientAssoc", {
 *     connectionId: myConn.id,
 *     clientId: myClient.id,
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported by specifying the
 *
 *  connection ID and client ID separated by "::" (note the double colon)
 *
 *  <connectionID>::<clientID>
 *
 * # 
 *
 *  Example:
 *
 * ```sh
 * $ pulumi import auth0:index/connectionClient:ConnectionClient my_conn_client_assoc "con_XXXXX::XXXXXXXX"
 * ```
 */
export class ConnectionClient extends pulumi.CustomResource {
    /**
     * Get an existing ConnectionClient resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectionClientState, opts?: pulumi.CustomResourceOptions): ConnectionClient {
        return new ConnectionClient(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/connectionClient:ConnectionClient';

    /**
     * Returns true if the given object is an instance of ConnectionClient.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ConnectionClient {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ConnectionClient.__pulumiType;
    }

    /**
     * ID of the client for which the connection is enabled.
     */
    public readonly clientId!: pulumi.Output<string>;
    /**
     * ID of the connection on which to enable the client.
     */
    public readonly connectionId!: pulumi.Output<string>;
    /**
     * The name of the connection on which to enable the client.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The strategy of the connection on which to enable the client.
     */
    public /*out*/ readonly strategy!: pulumi.Output<string>;

    /**
     * Create a ConnectionClient resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectionClientArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectionClientArgs | ConnectionClientState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectionClientState | undefined;
            resourceInputs["clientId"] = state ? state.clientId : undefined;
            resourceInputs["connectionId"] = state ? state.connectionId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["strategy"] = state ? state.strategy : undefined;
        } else {
            const args = argsOrState as ConnectionClientArgs | undefined;
            if ((!args || args.clientId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clientId'");
            }
            if ((!args || args.connectionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionId'");
            }
            resourceInputs["clientId"] = args ? args.clientId : undefined;
            resourceInputs["connectionId"] = args ? args.connectionId : undefined;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["strategy"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ConnectionClient.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ConnectionClient resources.
 */
export interface ConnectionClientState {
    /**
     * ID of the client for which the connection is enabled.
     */
    clientId?: pulumi.Input<string>;
    /**
     * ID of the connection on which to enable the client.
     */
    connectionId?: pulumi.Input<string>;
    /**
     * The name of the connection on which to enable the client.
     */
    name?: pulumi.Input<string>;
    /**
     * The strategy of the connection on which to enable the client.
     */
    strategy?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ConnectionClient resource.
 */
export interface ConnectionClientArgs {
    /**
     * ID of the client for which the connection is enabled.
     */
    clientId: pulumi.Input<string>;
    /**
     * ID of the connection on which to enable the client.
     */
    connectionId: pulumi.Input<string>;
}
