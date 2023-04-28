// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Auth0 uses various grant types, or methods by which you grant limited access to your resources to another entity without exposing credentials. The OAuth 2.0 protocol supports several types of grants, which allow different types of access. This resource allows you to create and manage client grants used with configured Auth0 clients.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // The following example grants a client the "create:foo" permission (scope).
 * const myClient = new auth0.Client("myClient", {name: "Example Application - Client Grant (Managed by Terraform)"});
 * const myResourceServer = new auth0.ResourceServer("myResourceServer", {
 *     name: "Example Resource Server - Client Grant (Managed by Terraform)",
 *     identifier: "https://api.example.com/client-grant",
 *     scopes: [
 *         {
 *             value: "create:foo",
 *             description: "Create foos",
 *         },
 *         {
 *             value: "create:bar",
 *             description: "Create bars",
 *         },
 *     ],
 * });
 * const myClientGrant = new auth0.ClientGrant("myClientGrant", {
 *     clientId: myClient.id,
 *     audience: myResourceServer.identifier,
 *     scopes: ["create:foo"],
 * });
 * ```
 *
 * ## Import
 *
 * Client grants can be imported using the grant ID. # Application -> APIs -> Expand the required API # Example
 *
 * ```sh
 *  $ pulumi import auth0:index/clientGrant:ClientGrant my_client_grant cgr_XXXXXXXXXXXXXXXX
 * ```
 */
export class ClientGrant extends pulumi.CustomResource {
    /**
     * Get an existing ClientGrant resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClientGrantState, opts?: pulumi.CustomResourceOptions): ClientGrant {
        return new ClientGrant(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/clientGrant:ClientGrant';

    /**
     * Returns true if the given object is an instance of ClientGrant.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClientGrant {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClientGrant.__pulumiType;
    }

    /**
     * Audience or API Identifier for this grant.
     */
    public readonly audience!: pulumi.Output<string>;
    /**
     * ID of the client for this grant.
     */
    public readonly clientId!: pulumi.Output<string>;
    /**
     * Permissions (scopes) included in this grant.
     */
    public readonly scopes!: pulumi.Output<string[]>;

    /**
     * Create a ClientGrant resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClientGrantArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClientGrantArgs | ClientGrantState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClientGrantState | undefined;
            resourceInputs["audience"] = state ? state.audience : undefined;
            resourceInputs["clientId"] = state ? state.clientId : undefined;
            resourceInputs["scopes"] = state ? state.scopes : undefined;
        } else {
            const args = argsOrState as ClientGrantArgs | undefined;
            if ((!args || args.audience === undefined) && !opts.urn) {
                throw new Error("Missing required property 'audience'");
            }
            if ((!args || args.clientId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clientId'");
            }
            if ((!args || args.scopes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'scopes'");
            }
            resourceInputs["audience"] = args ? args.audience : undefined;
            resourceInputs["clientId"] = args ? args.clientId : undefined;
            resourceInputs["scopes"] = args ? args.scopes : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ClientGrant.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClientGrant resources.
 */
export interface ClientGrantState {
    /**
     * Audience or API Identifier for this grant.
     */
    audience?: pulumi.Input<string>;
    /**
     * ID of the client for this grant.
     */
    clientId?: pulumi.Input<string>;
    /**
     * Permissions (scopes) included in this grant.
     */
    scopes?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a ClientGrant resource.
 */
export interface ClientGrantArgs {
    /**
     * Audience or API Identifier for this grant.
     */
    audience: pulumi.Input<string>;
    /**
     * ID of the client for this grant.
     */
    clientId: pulumi.Input<string>;
    /**
     * Permissions (scopes) included in this grant.
     */
    scopes: pulumi.Input<pulumi.Input<string>[]>;
}
