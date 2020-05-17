// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * With Auth0, you can create custom Javascript snippets that run in a secure, isolated sandbox as part of your authentication pipeline, which are otherwise known as rules. This resource allows you to create and manage rules. You can create global variable for use with rules by using the auth0..RuleConfig resource.
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-auth0/blob/master/website/docs/r/rule.html.md.
 */
export class Rule extends pulumi.CustomResource {
    /**
     * Get an existing Rule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
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
     * Boolean. Indicates whether the rule is enabled.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * String. Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Integer. Order in which the rule executes relative to other rules. Lower-valued rules execute first.
     */
    public readonly order!: pulumi.Output<number>;
    /**
     * String. Code to be executed when the rule runs.
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
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as RuleState | undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["order"] = state ? state.order : undefined;
            inputs["script"] = state ? state.script : undefined;
        } else {
            const args = argsOrState as RuleArgs | undefined;
            if (!args || args.script === undefined) {
                throw new Error("Missing required property 'script'");
            }
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["order"] = args ? args.order : undefined;
            inputs["script"] = args ? args.script : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Rule.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Rule resources.
 */
export interface RuleState {
    /**
     * Boolean. Indicates whether the rule is enabled.
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * String. Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Integer. Order in which the rule executes relative to other rules. Lower-valued rules execute first.
     */
    readonly order?: pulumi.Input<number>;
    /**
     * String. Code to be executed when the rule runs.
     */
    readonly script?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Rule resource.
 */
export interface RuleArgs {
    /**
     * Boolean. Indicates whether the rule is enabled.
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * String. Name of the rule. May only contain alphanumeric characters, spaces, and hyphens. May neither start nor end with hyphens or spaces.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Integer. Order in which the rule executes relative to other rules. Lower-valued rules execute first.
     */
    readonly order?: pulumi.Input<number>;
    /**
     * String. Code to be executed when the rule runs.
     */
    readonly script: pulumi.Input<string>;
}
