// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * With Auth0, you can create custom Javascript snippets that run in a secure, isolated sandbox as part of your authentication pipeline, which are otherwise known as rules. This resource allows you to create and manage variables that are available to all rules via Auth0's global configuration object. Used in conjunction with configured rules.
 *
 * ## Example Usage
 *
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
 * const myRuleConfig = new auth0.RuleConfig("myRuleConfig", {
 *     key: "foo",
 *     value: "bar",
 * });
 * ```
 *
 * ## Import
 *
 * Existing rule configs can be imported using their key name.
 *
 * # 
 *
 *  Example:
 *
 * ```sh
 * $ pulumi import auth0:index/ruleConfig:RuleConfig my_rule_config "foo"
 * ```
 */
export class RuleConfig extends pulumi.CustomResource {
    /**
     * Get an existing RuleConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RuleConfigState, opts?: pulumi.CustomResourceOptions): RuleConfig {
        return new RuleConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/ruleConfig:RuleConfig';

    /**
     * Returns true if the given object is an instance of RuleConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RuleConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RuleConfig.__pulumiType;
    }

    /**
     * Key for a rules configuration variable.
     */
    public readonly key!: pulumi.Output<string>;
    /**
     * Value for a rules configuration variable.
     */
    public readonly value!: pulumi.Output<string>;

    /**
     * Create a RuleConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RuleConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RuleConfigArgs | RuleConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RuleConfigState | undefined;
            resourceInputs["key"] = state ? state.key : undefined;
            resourceInputs["value"] = state ? state.value : undefined;
        } else {
            const args = argsOrState as RuleConfigArgs | undefined;
            if ((!args || args.key === undefined) && !opts.urn) {
                throw new Error("Missing required property 'key'");
            }
            if ((!args || args.value === undefined) && !opts.urn) {
                throw new Error("Missing required property 'value'");
            }
            resourceInputs["key"] = args ? args.key : undefined;
            resourceInputs["value"] = args?.value ? pulumi.secret(args.value) : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["value"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(RuleConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RuleConfig resources.
 */
export interface RuleConfigState {
    /**
     * Key for a rules configuration variable.
     */
    key?: pulumi.Input<string>;
    /**
     * Value for a rules configuration variable.
     */
    value?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RuleConfig resource.
 */
export interface RuleConfigArgs {
    /**
     * Key for a rules configuration variable.
     */
    key: pulumi.Input<string>;
    /**
     * Value for a rules configuration variable.
     */
    value: pulumi.Input<string>;
}
