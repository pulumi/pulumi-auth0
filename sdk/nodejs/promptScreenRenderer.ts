// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * With this resource, you can Configure the render settings for a specific screen.You can read more about this [here](https://auth0.com/docs/customize/login-pages/advanced-customizations/getting-started/configure-acul-screens).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const promptScreenRenderer = new auth0.PromptScreenRenderer("prompt_screen_renderer", {
 *     promptType: "login-id",
 *     screenName: "login-id",
 *     renderingMode: "advanced",
 *     defaultHeadTagsDisabled: false,
 *     contextConfigurations: [
 *         "branding.settings",
 *         "branding.themes.default",
 *         "client.logo_uri",
 *         "client.description",
 *         "client.metadata.key",
 *         "organization.display_name",
 *         "organization.branding",
 *         "organization.metadata.key",
 *         "screen.texts",
 *         "tenant.name",
 *         "tenant.friendly_name",
 *         "tenant.enabled_locales",
 *         "untrusted_data.submitted_form_data",
 *         "untrusted_data.authorization_params.login_hint",
 *         "untrusted_data.authorization_params.screen_hint",
 *         "untrusted_data.authorization_params.ui_locales",
 *         "untrusted_data.authorization_params.ext-key",
 *     ],
 *     headTags: JSON.stringify([{
 *         attributes: {
 *             async: true,
 *             defer: true,
 *             integrity: ["sha512-v2CJ7UaYy4JwqLDIrZUI/4hqeoQieOmAZNXBeQyjo21dadnwR+8ZaIJVT8EE2iyI61OV8e6M8PP2/4hpQINQ/g=="],
 *             src: "https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js",
 *         },
 *         tag: "script",
 *     }]),
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported using the prompt name and screen_name.
 *
 * # 
 *
 * As this is not a resource identifiable by an ID within the Auth0 Management API,
 *
 * login can be imported using the prompt name and screen name using the format:
 *
 * prompt_name:screen_name
 *
 * # 
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/promptScreenRenderer:PromptScreenRenderer auth0_prompt_screen_renderer "login-id:login-id"
 * ```
 */
export class PromptScreenRenderer extends pulumi.CustomResource {
    /**
     * Get an existing PromptScreenRenderer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PromptScreenRendererState, opts?: pulumi.CustomResourceOptions): PromptScreenRenderer {
        return new PromptScreenRenderer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/promptScreenRenderer:PromptScreenRenderer';

    /**
     * Returns true if the given object is an instance of PromptScreenRenderer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PromptScreenRenderer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PromptScreenRenderer.__pulumiType;
    }

    /**
     * Context values to make available
     */
    public readonly contextConfigurations!: pulumi.Output<string[]>;
    /**
     * Override Universal Login default head tags
     */
    public readonly defaultHeadTagsDisabled!: pulumi.Output<boolean | undefined>;
    /**
     * An array of head tags
     */
    public readonly headTags!: pulumi.Output<string>;
    /**
     * The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`, `login`, `signup`, `reset-password`, `mfa`, `mfa-sms`, `mfa-email`, `mfa-push`, `invitation`, `organizations`, `consent`, `customized-consent`, `mfa-otp`.
     */
    public readonly promptType!: pulumi.Output<string>;
    /**
     * Rendering modeOptions are: `standard`, `advanced`.
     */
    public readonly renderingMode!: pulumi.Output<string | undefined>;
    /**
     * The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`, `login`, `signup`, `reset-password-request`, `reset-password-email`, `reset-password`, `reset-password-success`, `reset-password-error`, `reset-password-mfa-email-challenge`, `reset-password-mfa-otp-challenge`, `reset-password-mfa-push-challenge-push`, `reset-password-mfa-sms-challenge`, `mfa-detect-browser-capabilities`, `mfa-enroll-result`, `mfa-begin-enroll-options`, `mfa-login-options`, `mfa-country-codes`, `mfa-sms-challenge`, `mfa-sms-enrollment`, `mfa-sms-list`, `mfa-email-challenge`, `mfa-email-list`, `mfa-push-challenge-push`, `mfa-push-enrollment-qr`, `mfa-push-list`, `mfa-push-welcome`, `accept-invitation`, `organization-selection`, `organization-picker`, `consent`, `customized-consent`, `mfa-otp-challenge`, `mfa-otp-enrollment-code`, `mfa-otp-enrollment-qr`.
     */
    public readonly screenName!: pulumi.Output<string>;
    /**
     * Tenant ID
     */
    public /*out*/ readonly tenant!: pulumi.Output<string>;

    /**
     * Create a PromptScreenRenderer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PromptScreenRendererArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PromptScreenRendererArgs | PromptScreenRendererState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PromptScreenRendererState | undefined;
            resourceInputs["contextConfigurations"] = state ? state.contextConfigurations : undefined;
            resourceInputs["defaultHeadTagsDisabled"] = state ? state.defaultHeadTagsDisabled : undefined;
            resourceInputs["headTags"] = state ? state.headTags : undefined;
            resourceInputs["promptType"] = state ? state.promptType : undefined;
            resourceInputs["renderingMode"] = state ? state.renderingMode : undefined;
            resourceInputs["screenName"] = state ? state.screenName : undefined;
            resourceInputs["tenant"] = state ? state.tenant : undefined;
        } else {
            const args = argsOrState as PromptScreenRendererArgs | undefined;
            if ((!args || args.promptType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'promptType'");
            }
            if ((!args || args.screenName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'screenName'");
            }
            resourceInputs["contextConfigurations"] = args ? args.contextConfigurations : undefined;
            resourceInputs["defaultHeadTagsDisabled"] = args ? args.defaultHeadTagsDisabled : undefined;
            resourceInputs["headTags"] = args ? args.headTags : undefined;
            resourceInputs["promptType"] = args ? args.promptType : undefined;
            resourceInputs["renderingMode"] = args ? args.renderingMode : undefined;
            resourceInputs["screenName"] = args ? args.screenName : undefined;
            resourceInputs["tenant"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PromptScreenRenderer.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PromptScreenRenderer resources.
 */
export interface PromptScreenRendererState {
    /**
     * Context values to make available
     */
    contextConfigurations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Override Universal Login default head tags
     */
    defaultHeadTagsDisabled?: pulumi.Input<boolean>;
    /**
     * An array of head tags
     */
    headTags?: pulumi.Input<string>;
    /**
     * The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`, `login`, `signup`, `reset-password`, `mfa`, `mfa-sms`, `mfa-email`, `mfa-push`, `invitation`, `organizations`, `consent`, `customized-consent`, `mfa-otp`.
     */
    promptType?: pulumi.Input<string>;
    /**
     * Rendering modeOptions are: `standard`, `advanced`.
     */
    renderingMode?: pulumi.Input<string>;
    /**
     * The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`, `login`, `signup`, `reset-password-request`, `reset-password-email`, `reset-password`, `reset-password-success`, `reset-password-error`, `reset-password-mfa-email-challenge`, `reset-password-mfa-otp-challenge`, `reset-password-mfa-push-challenge-push`, `reset-password-mfa-sms-challenge`, `mfa-detect-browser-capabilities`, `mfa-enroll-result`, `mfa-begin-enroll-options`, `mfa-login-options`, `mfa-country-codes`, `mfa-sms-challenge`, `mfa-sms-enrollment`, `mfa-sms-list`, `mfa-email-challenge`, `mfa-email-list`, `mfa-push-challenge-push`, `mfa-push-enrollment-qr`, `mfa-push-list`, `mfa-push-welcome`, `accept-invitation`, `organization-selection`, `organization-picker`, `consent`, `customized-consent`, `mfa-otp-challenge`, `mfa-otp-enrollment-code`, `mfa-otp-enrollment-qr`.
     */
    screenName?: pulumi.Input<string>;
    /**
     * Tenant ID
     */
    tenant?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PromptScreenRenderer resource.
 */
export interface PromptScreenRendererArgs {
    /**
     * Context values to make available
     */
    contextConfigurations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Override Universal Login default head tags
     */
    defaultHeadTagsDisabled?: pulumi.Input<boolean>;
    /**
     * An array of head tags
     */
    headTags?: pulumi.Input<string>;
    /**
     * The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`, `login`, `signup`, `reset-password`, `mfa`, `mfa-sms`, `mfa-email`, `mfa-push`, `invitation`, `organizations`, `consent`, `customized-consent`, `mfa-otp`.
     */
    promptType: pulumi.Input<string>;
    /**
     * Rendering modeOptions are: `standard`, `advanced`.
     */
    renderingMode?: pulumi.Input<string>;
    /**
     * The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`, `login`, `signup`, `reset-password-request`, `reset-password-email`, `reset-password`, `reset-password-success`, `reset-password-error`, `reset-password-mfa-email-challenge`, `reset-password-mfa-otp-challenge`, `reset-password-mfa-push-challenge-push`, `reset-password-mfa-sms-challenge`, `mfa-detect-browser-capabilities`, `mfa-enroll-result`, `mfa-begin-enroll-options`, `mfa-login-options`, `mfa-country-codes`, `mfa-sms-challenge`, `mfa-sms-enrollment`, `mfa-sms-list`, `mfa-email-challenge`, `mfa-email-list`, `mfa-push-challenge-push`, `mfa-push-enrollment-qr`, `mfa-push-list`, `mfa-push-welcome`, `accept-invitation`, `organization-selection`, `organization-picker`, `consent`, `customized-consent`, `mfa-otp-challenge`, `mfa-otp-enrollment-code`, `mfa-otp-enrollment-qr`.
     */
    screenName: pulumi.Input<string>;
}
