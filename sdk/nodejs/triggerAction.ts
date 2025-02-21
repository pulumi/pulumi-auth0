// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * With this resource, you can bind an action to a trigger. Once an action is created and deployed, it can be attached (i.e. bound) to a trigger so that it will be executed as part of a flow.
 *
 * Ordering of an action within a specific flow is not currently supported when using this resource; the action will get appended to the end of the flow. To precisely manage ordering, it is advised to either do so with the dashboard UI or with the `auth0TriggerBindings` resource.
 *
 * !> This resource appends an action to the trigger binding. In contrast, the `auth0.TriggerActions` resource manages all
 * the action bindings to a trigger. To avoid potential issues, it is recommended not to use this resource in conjunction
 * with the `auth0.TriggerAction` resource when binding actions to the same trigger.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const loginAlert = new auth0.Action("login_alert", {
 *     name: "Alert after login",
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
 * const postLoginAlertAction = new auth0.TriggerAction("post_login_alert_action", {
 *     trigger: "post-login",
 *     actionId: loginAlert.id,
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported by specifying the
 *
 * trigger and action ID separated by "::" (note the double colon)
 *
 * <trigger>::<actionID>
 *
 * # 
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/triggerAction:TriggerAction post_login_action "post-login::28b5c8fa-d371-5734-acf6-d0cf80ead918"
 * ```
 */
export class TriggerAction extends pulumi.CustomResource {
    /**
     * Get an existing TriggerAction resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TriggerActionState, opts?: pulumi.CustomResourceOptions): TriggerAction {
        return new TriggerAction(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/triggerAction:TriggerAction';

    /**
     * Returns true if the given object is an instance of TriggerAction.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TriggerAction {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TriggerAction.__pulumiType;
    }

    /**
     * The ID of the action to bind to the trigger.
     */
    public readonly actionId!: pulumi.Output<string>;
    /**
     * The name for this action within the trigger. This can be useful for distinguishing between multiple instances of the same action bound to a trigger. Defaults to action name when not provided.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-token-exchange`, `custom-email-provider`.
     */
    public readonly trigger!: pulumi.Output<string>;

    /**
     * Create a TriggerAction resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TriggerActionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TriggerActionArgs | TriggerActionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TriggerActionState | undefined;
            resourceInputs["actionId"] = state ? state.actionId : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["trigger"] = state ? state.trigger : undefined;
        } else {
            const args = argsOrState as TriggerActionArgs | undefined;
            if ((!args || args.actionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'actionId'");
            }
            if ((!args || args.trigger === undefined) && !opts.urn) {
                throw new Error("Missing required property 'trigger'");
            }
            resourceInputs["actionId"] = args ? args.actionId : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["trigger"] = args ? args.trigger : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TriggerAction.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TriggerAction resources.
 */
export interface TriggerActionState {
    /**
     * The ID of the action to bind to the trigger.
     */
    actionId?: pulumi.Input<string>;
    /**
     * The name for this action within the trigger. This can be useful for distinguishing between multiple instances of the same action bound to a trigger. Defaults to action name when not provided.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-token-exchange`, `custom-email-provider`.
     */
    trigger?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TriggerAction resource.
 */
export interface TriggerActionArgs {
    /**
     * The ID of the action to bind to the trigger.
     */
    actionId: pulumi.Input<string>;
    /**
     * The name for this action within the trigger. This can be useful for distinguishing between multiple instances of the same action bound to a trigger. Defaults to action name when not provided.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `custom-token-exchange`, `custom-email-provider`.
     */
    trigger: pulumi.Input<string>;
}
