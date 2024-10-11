// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * With this resource, you can create and manage Flows for a tenant.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // Example:
 * const myFlow = new auth0.Flow("my_flow", {
 *     actions: JSON.stringify([{
 *         action: "UPDATE_USER",
 *         alias: "user meta data",
 *         allow_failure: false,
 *         id: "update_user_PmSa",
 *         mask_output: false,
 *         params: {
 *             changes: {
 *                 user_metadata: {
 *                     full_name: "{{fields.full_name}}",
 *                 },
 *             },
 *             connection_id: "<vault_connection_id>",
 *             user_id: "{{context.user.user_id}}",
 *         },
 *         type: "AUTH0",
 *     }]),
 *     name: "Flow KYC update data",
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported using the flow ID.
 *
 * # 
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/flow:Flow my_flow "af_4JwsAjokf6DpK8xJCkTRjK"
 * ```
 */
export class Flow extends pulumi.CustomResource {
    /**
     * Get an existing Flow resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FlowState, opts?: pulumi.CustomResourceOptions): Flow {
        return new Flow(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/flow:Flow';

    /**
     * Returns true if the given object is an instance of Flow.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Flow {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Flow.__pulumiType;
    }

    /**
     * Actions of the flow.
     */
    public readonly actions!: pulumi.Output<string | undefined>;
    /**
     * Name of the flow.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a Flow resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: FlowArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FlowArgs | FlowState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FlowState | undefined;
            resourceInputs["actions"] = state ? state.actions : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as FlowArgs | undefined;
            resourceInputs["actions"] = args ? args.actions : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Flow.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Flow resources.
 */
export interface FlowState {
    /**
     * Actions of the flow.
     */
    actions?: pulumi.Input<string>;
    /**
     * Name of the flow.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Flow resource.
 */
export interface FlowArgs {
    /**
     * Actions of the flow.
     */
    actions?: pulumi.Input<string>;
    /**
     * Name of the flow.
     */
    name?: pulumi.Input<string>;
}
