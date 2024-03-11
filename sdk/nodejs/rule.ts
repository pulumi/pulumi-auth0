// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * With Auth0, you can create custom Javascript snippets that run in a secure, isolated sandbox as part of your authentication pipeline, which are otherwise known as rules. This resource allows you to create and manage rules. You can create global variable for use with rules by using the `auth0.RuleConfig` resource.
 *
 * !> This resource is deprecated. Refer to the [guide on how to migrate from rules to actions](https://auth0.com/docs/customize/actions/migrate/migrate-from-rules-to-actions) and manage your actions using the `auth0.Action` resource.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myRule = new auth0.Rule("myRule", {
 *     enabled: true,
 *     script: `    function (user, context, callback) {
 *       callback(null, user, context);
 *     }
 *   
 * `,
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Existing rules can be imported using their ID.
 *
 * # 
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/rule:Rule my_rule "rul_XXXXXXXXXXXXX"
 * ```
 */
export class Rule extends pulumi.CustomResource {
    /**
     * Get an existing Rule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RuleState, opts?: pulumi.CustomResourceOptions): Rule {
        return new Rule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/rule:Rule';

    /**
     * Returns true if the given object is an instance of Rule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Rule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Rule.__pulumiType;
    }

    /**
     * Indicates whether the rule is enabled.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Order in which the rule executes relative to other rules. Lower-valued rules execute first.
     */
    public readonly order!: pulumi.Output<number>;
    /**
     * Code to be executed when the rule runs.
     */
    public readonly script!: pulumi.Output<string>;

    /**
     * Create a Rule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RuleArgs | RuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RuleState | undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["order"] = state ? state.order : undefined;
            resourceInputs["script"] = state ? state.script : undefined;
        } else {
            const args = argsOrState as RuleArgs | undefined;
            if ((!args || args.script === undefined) && !opts.urn) {
                throw new Error("Missing required property 'script'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["order"] = args ? args.order : undefined;
            resourceInputs["script"] = args ? args.script : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Rule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Rule resources.
 */
export interface RuleState {
    /**
     * Indicates whether the rule is enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
     */
    name?: pulumi.Input<string>;
    /**
     * Order in which the rule executes relative to other rules. Lower-valued rules execute first.
     */
    order?: pulumi.Input<number>;
    /**
     * Code to be executed when the rule runs.
     */
    script?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Rule resource.
 */
export interface RuleArgs {
    /**
     * Indicates whether the rule is enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
     */
    name?: pulumi.Input<string>;
    /**
     * Order in which the rule executes relative to other rules. Lower-valued rules execute first.
     */
    order?: pulumi.Input<number>;
    /**
     * Code to be executed when the rule runs.
     */
    script: pulumi.Input<string>;
}
