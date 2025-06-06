// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * With this resource, you can create and manage Forms for a tenant.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // Example:
 * const myForm = new auth0.Form("my_form", {
 *     name: "My KYC Form",
 *     start: JSON.stringify({
 *         coordinates: {
 *             x: 0,
 *             y: 0,
 *         },
 *         next_node: "step_ggeX",
 *     }),
 *     nodes: JSON.stringify([{
 *         alias: "New step",
 *         config: {
 *             components: [
 *                 {
 *                     category: "FIELD",
 *                     config: {
 *                         max_length: 50,
 *                         min_length: 1,
 *                         multiline: false,
 *                     },
 *                     id: "full_name",
 *                     label: "Your Name",
 *                     required: true,
 *                     sensitive: false,
 *                     type: "TEXT",
 *                 },
 *                 {
 *                     category: "BLOCK",
 *                     config: {
 *                         text: "Continue",
 *                     },
 *                     id: "next_button_3FbA",
 *                     type: "NEXT_BUTTON",
 *                 },
 *             ],
 *             next_node: "$ending",
 *         },
 *         coordinates: {
 *             x: 500,
 *             y: 0,
 *         },
 *         id: "step_ggeX",
 *         type: "STEP",
 *     }]),
 *     ending: JSON.stringify({
 *         after_submit: {
 *             flow_id: "<my_flow_id>",
 *         },
 *         coordinates: {
 *             x: 1250,
 *             y: 0,
 *         },
 *         resume_flow: true,
 *     }),
 *     style: JSON.stringify({
 *         css: `h1 {
 *   color: white;
 *   text-align: center;
 * }`,
 *     }),
 *     translations: JSON.stringify({
 *         es: {
 *             components: {
 *                 rich_text_uctu: {
 *                     config: {
 *                         content: "<h2>Help us verify your personal information</h2><p>We want to learn more about you so that we can validate and protect your account...</p>",
 *                     },
 *                 },
 *             },
 *             messages: {
 *                 custom: {},
 *                 errors: {
 *                     ERR_ACCEPTANCE_REQUIRED: "Por favor, marca este campo para continuar.",
 *                 },
 *             },
 *         },
 *     }),
 *     messages: [{
 *         errors: JSON.stringify({
 *             ERR_REQUIRED_PROPERTY: "This field is required for user kyc.",
 *         }),
 *     }],
 *     languages: [{
 *         "default": "en",
 *         primary: "en",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported using the form ID.
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/form:Form my_form "ap_ojkKbiPMG6J5E5VCKdeCzK"
 * ```
 */
export class Form extends pulumi.CustomResource {
    /**
     * Get an existing Form resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FormState, opts?: pulumi.CustomResourceOptions): Form {
        return new Form(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/form:Form';

    /**
     * Returns true if the given object is an instance of Form.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Form {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Form.__pulumiType;
    }

    /**
     * Submission configuration of the form. (JSON encoded)
     */
    public readonly ending!: pulumi.Output<string | undefined>;
    /**
     * Language specific configuration for the form.
     */
    public readonly languages!: pulumi.Output<outputs.FormLanguage[] | undefined>;
    /**
     * Message specific configuration for the form.
     */
    public readonly messages!: pulumi.Output<outputs.FormMessage[] | undefined>;
    /**
     * Name of the form.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Nodes of the form. (JSON encoded)
     */
    public readonly nodes!: pulumi.Output<string | undefined>;
    /**
     * Input setup of the form. (JSON encoded)
     */
    public readonly start!: pulumi.Output<string | undefined>;
    /**
     * Style specific configuration for the form. (JSON encoded)
     */
    public readonly style!: pulumi.Output<string | undefined>;
    /**
     * Translations of the form. (JSON encoded)
     */
    public readonly translations!: pulumi.Output<string | undefined>;

    /**
     * Create a Form resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: FormArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FormArgs | FormState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FormState | undefined;
            resourceInputs["ending"] = state ? state.ending : undefined;
            resourceInputs["languages"] = state ? state.languages : undefined;
            resourceInputs["messages"] = state ? state.messages : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nodes"] = state ? state.nodes : undefined;
            resourceInputs["start"] = state ? state.start : undefined;
            resourceInputs["style"] = state ? state.style : undefined;
            resourceInputs["translations"] = state ? state.translations : undefined;
        } else {
            const args = argsOrState as FormArgs | undefined;
            resourceInputs["ending"] = args ? args.ending : undefined;
            resourceInputs["languages"] = args ? args.languages : undefined;
            resourceInputs["messages"] = args ? args.messages : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nodes"] = args ? args.nodes : undefined;
            resourceInputs["start"] = args ? args.start : undefined;
            resourceInputs["style"] = args ? args.style : undefined;
            resourceInputs["translations"] = args ? args.translations : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Form.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Form resources.
 */
export interface FormState {
    /**
     * Submission configuration of the form. (JSON encoded)
     */
    ending?: pulumi.Input<string>;
    /**
     * Language specific configuration for the form.
     */
    languages?: pulumi.Input<pulumi.Input<inputs.FormLanguage>[]>;
    /**
     * Message specific configuration for the form.
     */
    messages?: pulumi.Input<pulumi.Input<inputs.FormMessage>[]>;
    /**
     * Name of the form.
     */
    name?: pulumi.Input<string>;
    /**
     * Nodes of the form. (JSON encoded)
     */
    nodes?: pulumi.Input<string>;
    /**
     * Input setup of the form. (JSON encoded)
     */
    start?: pulumi.Input<string>;
    /**
     * Style specific configuration for the form. (JSON encoded)
     */
    style?: pulumi.Input<string>;
    /**
     * Translations of the form. (JSON encoded)
     */
    translations?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Form resource.
 */
export interface FormArgs {
    /**
     * Submission configuration of the form. (JSON encoded)
     */
    ending?: pulumi.Input<string>;
    /**
     * Language specific configuration for the form.
     */
    languages?: pulumi.Input<pulumi.Input<inputs.FormLanguage>[]>;
    /**
     * Message specific configuration for the form.
     */
    messages?: pulumi.Input<pulumi.Input<inputs.FormMessage>[]>;
    /**
     * Name of the form.
     */
    name?: pulumi.Input<string>;
    /**
     * Nodes of the form. (JSON encoded)
     */
    nodes?: pulumi.Input<string>;
    /**
     * Input setup of the form. (JSON encoded)
     */
    start?: pulumi.Input<string>;
    /**
     * Style specific configuration for the form. (JSON encoded)
     */
    style?: pulumi.Input<string>;
    /**
     * Translations of the form. (JSON encoded)
     */
    translations?: pulumi.Input<string>;
}
