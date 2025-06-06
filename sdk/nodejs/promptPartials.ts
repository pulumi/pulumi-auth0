// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * With this resource, you can manage a customized sign up and login experience by adding custom content, form elements and css/javascript. You can read more about this [here](https://auth0.com/docs/customize/universal-login-pages/customize-signup-and-login-prompts).
 *
 * !> **Deprecated:** `auth0.PromptPartials` has been deprecated. Please use `auth0.PromptScreenPartials` for managing multiple
 * prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myLoginPromptPartials = new auth0.PromptPartials("my_login_prompt_partials", {
 *     prompt: "login",
 *     formContentStart: "<div>Updated Form Content Start</div>",
 *     formContentEnd: "<div>Updated Form Content End</div>",
 *     formFooterStart: "<div>Updated Footer Start</div>",
 *     formFooterEnd: "<div>Updated Footer End</div>",
 *     secondaryActionsStart: "<div>Updated Secondary Actions Start</div>",
 *     secondaryActionsEnd: "<div>Updated Secondary Actions End</div>",
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported using the prompt name.
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/promptPartials:PromptPartials my_login_prompt_partials "login"
 * ```
 */
export class PromptPartials extends pulumi.CustomResource {
    /**
     * Get an existing PromptPartials resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PromptPartialsState, opts?: pulumi.CustomResourceOptions): PromptPartials {
        return new PromptPartials(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/promptPartials:PromptPartials';

    /**
     * Returns true if the given object is an instance of PromptPartials.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PromptPartials {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PromptPartials.__pulumiType;
    }

    /**
     * Content that goes at the end of the form.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    public readonly formContentEnd!: pulumi.Output<string | undefined>;
    /**
     * Content that goes at the start of the form.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    public readonly formContentStart!: pulumi.Output<string | undefined>;
    /**
     * Footer content for the end of the footer.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    public readonly formFooterEnd!: pulumi.Output<string | undefined>;
    /**
     * Footer content for the start of the footer.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    public readonly formFooterStart!: pulumi.Output<string | undefined>;
    /**
     * The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    public readonly prompt!: pulumi.Output<string>;
    /**
     * Actions that go at the end of secondary actions.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    public readonly secondaryActionsEnd!: pulumi.Output<string | undefined>;
    /**
     * Actions that go at the start of secondary actions.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    public readonly secondaryActionsStart!: pulumi.Output<string | undefined>;

    /**
     * Create a PromptPartials resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PromptPartialsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PromptPartialsArgs | PromptPartialsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PromptPartialsState | undefined;
            resourceInputs["formContentEnd"] = state ? state.formContentEnd : undefined;
            resourceInputs["formContentStart"] = state ? state.formContentStart : undefined;
            resourceInputs["formFooterEnd"] = state ? state.formFooterEnd : undefined;
            resourceInputs["formFooterStart"] = state ? state.formFooterStart : undefined;
            resourceInputs["prompt"] = state ? state.prompt : undefined;
            resourceInputs["secondaryActionsEnd"] = state ? state.secondaryActionsEnd : undefined;
            resourceInputs["secondaryActionsStart"] = state ? state.secondaryActionsStart : undefined;
        } else {
            const args = argsOrState as PromptPartialsArgs | undefined;
            if ((!args || args.prompt === undefined) && !opts.urn) {
                throw new Error("Missing required property 'prompt'");
            }
            resourceInputs["formContentEnd"] = args ? args.formContentEnd : undefined;
            resourceInputs["formContentStart"] = args ? args.formContentStart : undefined;
            resourceInputs["formFooterEnd"] = args ? args.formFooterEnd : undefined;
            resourceInputs["formFooterStart"] = args ? args.formFooterStart : undefined;
            resourceInputs["prompt"] = args ? args.prompt : undefined;
            resourceInputs["secondaryActionsEnd"] = args ? args.secondaryActionsEnd : undefined;
            resourceInputs["secondaryActionsStart"] = args ? args.secondaryActionsStart : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PromptPartials.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PromptPartials resources.
 */
export interface PromptPartialsState {
    /**
     * Content that goes at the end of the form.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    formContentEnd?: pulumi.Input<string>;
    /**
     * Content that goes at the start of the form.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    formContentStart?: pulumi.Input<string>;
    /**
     * Footer content for the end of the footer.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    formFooterEnd?: pulumi.Input<string>;
    /**
     * Footer content for the start of the footer.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    formFooterStart?: pulumi.Input<string>;
    /**
     * The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    prompt?: pulumi.Input<string>;
    /**
     * Actions that go at the end of secondary actions.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    secondaryActionsEnd?: pulumi.Input<string>;
    /**
     * Actions that go at the start of secondary actions.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    secondaryActionsStart?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PromptPartials resource.
 */
export interface PromptPartialsArgs {
    /**
     * Content that goes at the end of the form.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    formContentEnd?: pulumi.Input<string>;
    /**
     * Content that goes at the start of the form.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    formContentStart?: pulumi.Input<string>;
    /**
     * Footer content for the end of the footer.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    formFooterEnd?: pulumi.Input<string>;
    /**
     * Footer content for the start of the footer.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    formFooterStart?: pulumi.Input<string>;
    /**
     * The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    prompt: pulumi.Input<string>;
    /**
     * Actions that go at the end of secondary actions.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    secondaryActionsEnd?: pulumi.Input<string>;
    /**
     * Actions that go at the start of secondary actions.
     *
     * @deprecated This resource is deprecated and will be removed in the next major version. Please use `auth0.PromptScreenPartials` for managing multiple prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen, depending on your use case.
     */
    secondaryActionsStart?: pulumi.Input<string>;
}
