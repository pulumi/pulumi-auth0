// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * With this resource, you can bind actions to a trigger. Once actions are created and deployed, they can be attached (i.e. bound) to a trigger so that it will be executed as part of a flow. The list of actions reflects the order in which they will be executed during the appropriate flow.
 *
 * !> This resource manages all the action bindings to a trigger. In contrast, the `auth0.TriggerAction` resource only
 * appends an action to the trigger binding. To avoid potential issues, it is recommended not to use this resource in
 * conjunction with the `auth0.TriggerAction` resource when binding actions to the same trigger.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const actionFoo = new auth0.Action("action_foo", {
 *     name: "Test Trigger Binding Foo",
 *     code: `exports.onContinuePostLogin = async (event, api) => {
 *   console.log("foo");
 * };"
 * `,
 *     deploy: true,
 *     supportedTriggers: {
 *         id: "post-login",
 *         version: "v3",
 *     },
 * });
 * const actionBar = new auth0.Action("action_bar", {
 *     name: "Test Trigger Binding Bar",
 *     code: `exports.onContinuePostLogin = async (event, api) => {
 *   console.log("bar");
 * };"
 * `,
 *     deploy: true,
 *     supportedTriggers: {
 *         id: "post-login",
 *         version: "v3",
 *     },
 * });
 * const loginFlow = new auth0.TriggerActions("login_flow", {
 *     trigger: "post-login",
 *     actions: [
 *         {
 *             id: actionFoo.id,
 *             displayName: actionFoo.name,
 *         },
 *         {
 *             id: actionBar.id,
 *             displayName: actionBar.name,
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported using the bindings trigger ID.
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/triggerActions:TriggerActions example "post-login"
 * ```
 */
export class TriggerActions extends pulumi.CustomResource {
    /**
     * Get an existing TriggerActions resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TriggerActionsState, opts?: pulumi.CustomResourceOptions): TriggerActions {
        return new TriggerActions(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/triggerActions:TriggerActions';

    /**
     * Returns true if the given object is an instance of TriggerActions.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TriggerActions {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TriggerActions.__pulumiType;
    }

    /**
     * The list of actions bound to this trigger.
     */
    public readonly actions!: pulumi.Output<outputs.TriggerActionsAction[]>;
    /**
     * The ID of the trigger to bind with. Options include: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-email-provider`, `custom-phone-provider`.
     */
    public readonly trigger!: pulumi.Output<string>;

    /**
     * Create a TriggerActions resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TriggerActionsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TriggerActionsArgs | TriggerActionsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TriggerActionsState | undefined;
            resourceInputs["actions"] = state ? state.actions : undefined;
            resourceInputs["trigger"] = state ? state.trigger : undefined;
        } else {
            const args = argsOrState as TriggerActionsArgs | undefined;
            if ((!args || args.actions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'actions'");
            }
            if ((!args || args.trigger === undefined) && !opts.urn) {
                throw new Error("Missing required property 'trigger'");
            }
            resourceInputs["actions"] = args ? args.actions : undefined;
            resourceInputs["trigger"] = args ? args.trigger : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TriggerActions.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TriggerActions resources.
 */
export interface TriggerActionsState {
    /**
     * The list of actions bound to this trigger.
     */
    actions?: pulumi.Input<pulumi.Input<inputs.TriggerActionsAction>[]>;
    /**
     * The ID of the trigger to bind with. Options include: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-email-provider`, `custom-phone-provider`.
     */
    trigger?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TriggerActions resource.
 */
export interface TriggerActionsArgs {
    /**
     * The list of actions bound to this trigger.
     */
    actions: pulumi.Input<pulumi.Input<inputs.TriggerActionsAction>[]>;
    /**
     * The ID of the trigger to bind with. Options include: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-email-provider`, `custom-phone-provider`.
     */
    trigger: pulumi.Input<string>;
}
