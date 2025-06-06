// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Hooks are secure, self-contained functions that allow you to customize the behavior of Auth0 when executed for selected extensibility points of the Auth0 platform. Auth0 invokes Hooks during runtime to execute your custom Node.js code. Depending on the extensibility point, you can use hooks with Database Connections and/or Passwordless Connections.
 *
 * !> This resource is deprecated. Refer to the [guide on how to migrate from hooks to actions](https://auth0.com/docs/customize/actions/migrate/migrate-from-hooks-to-actions) and manage your actions using the `auth0.Action` resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myHook = new auth0.Hook("my_hook", {
 *     name: "My Pre User Registration Hook",
 *     script: `    function (user, context, callback) {
 *       callback(null, { user });
 *     }
 * `,
 *     triggerId: "pre-user-registration",
 *     enabled: true,
 *     secrets: {
 *         foo: "bar",
 *     },
 *     dependencies: {
 *         auth0: "2.30.0",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported by specifying the hook ID.
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/hook:Hook my_hook "00001"
 * ```
 */
export class Hook extends pulumi.CustomResource {
    /**
     * Get an existing Hook resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HookState, opts?: pulumi.CustomResourceOptions): Hook {
        return new Hook(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/hook:Hook';

    /**
     * Returns true if the given object is an instance of Hook.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Hook {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Hook.__pulumiType;
    }

    /**
     * Dependencies of this hook used by the WebTask server.
     */
    public readonly dependencies!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Whether the hook is enabled, or disabled.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Name of this hook.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Code to be executed when this hook runs.
     */
    public readonly script!: pulumi.Output<string>;
    /**
     * The secrets associated with the hook.
     */
    public readonly secrets!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
     */
    public readonly triggerId!: pulumi.Output<string>;

    /**
     * Create a Hook resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HookArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HookArgs | HookState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as HookState | undefined;
            resourceInputs["dependencies"] = state ? state.dependencies : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["script"] = state ? state.script : undefined;
            resourceInputs["secrets"] = state ? state.secrets : undefined;
            resourceInputs["triggerId"] = state ? state.triggerId : undefined;
        } else {
            const args = argsOrState as HookArgs | undefined;
            if ((!args || args.script === undefined) && !opts.urn) {
                throw new Error("Missing required property 'script'");
            }
            if ((!args || args.triggerId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'triggerId'");
            }
            resourceInputs["dependencies"] = args ? args.dependencies : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["script"] = args ? args.script : undefined;
            resourceInputs["secrets"] = args?.secrets ? pulumi.secret(args.secrets) : undefined;
            resourceInputs["triggerId"] = args ? args.triggerId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["secrets"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Hook.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Hook resources.
 */
export interface HookState {
    /**
     * Dependencies of this hook used by the WebTask server.
     */
    dependencies?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Whether the hook is enabled, or disabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Name of this hook.
     */
    name?: pulumi.Input<string>;
    /**
     * Code to be executed when this hook runs.
     */
    script?: pulumi.Input<string>;
    /**
     * The secrets associated with the hook.
     */
    secrets?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
     */
    triggerId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Hook resource.
 */
export interface HookArgs {
    /**
     * Dependencies of this hook used by the WebTask server.
     */
    dependencies?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Whether the hook is enabled, or disabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Name of this hook.
     */
    name?: pulumi.Input<string>;
    /**
     * Code to be executed when this hook runs.
     */
    script: pulumi.Input<string>;
    /**
     * The secrets associated with the hook.
     */
    secrets?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
     */
    triggerId: pulumi.Input<string>;
}
