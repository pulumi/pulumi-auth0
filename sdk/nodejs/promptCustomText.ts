// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * With this resource, you can manage custom text on your Auth0 prompts. You can read more about custom texts [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const example = new auth0.PromptCustomText("example", {
 *     prompt: "login",
 *     language: "en",
 *     body: JSON.stringify({
 *         login: {
 *             alertListTitle: "Alerts",
 *             buttonText: "Continue",
 *             description: "Login to",
 *             editEmailText: "Edit",
 *             emailPlaceholder: "Email address",
 *             federatedConnectionButtonText: "Continue with ${connectionName}",
 *             footerLinkText: "Sign up",
 *             footerText: "Don't have an account?",
 *             forgotPasswordText: "Forgot password?",
 *             invitationDescription: "Log in to accept ${inviterName}'s invitation to join ${companyName} on ${clientName}.",
 *             invitationTitle: "You've Been Invited!",
 *             logoAltText: "${companyName}",
 *             pageTitle: "Log in | ${clientName}",
 *             passwordPlaceholder: "Password",
 *             separatorText: "Or",
 *             signupActionLinkText: "${footerLinkText}",
 *             signupActionText: "${footerText}",
 *             title: "Welcome",
 *             usernamePlaceholder: "Username or email address",
 *         },
 *     }),
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported by specifying the
 *
 * prompt and language separated by "::" (note the double colon)
 *
 * <prompt>::<language>
 *
 * Example
 *
 * ```sh
 * $ pulumi import auth0:index/promptCustomText:PromptCustomText example "login::en"
 * ```
 */
export class PromptCustomText extends pulumi.CustomResource {
    /**
     * Get an existing PromptCustomText resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PromptCustomTextState, opts?: pulumi.CustomResourceOptions): PromptCustomText {
        return new PromptCustomText(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/promptCustomText:PromptCustomText';

    /**
     * Returns true if the given object is an instance of PromptCustomText.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PromptCustomText {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PromptCustomText.__pulumiType;
    }

    /**
     * JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values).
     */
    public readonly body!: pulumi.Output<string>;
    /**
     * Language of the custom text. Options include: `am`, `ar`, `ar-EG`, `ar-SA`, `az`, `bg`, `bn`, `bs`, `ca-ES`, `cnr`, `cs`, `cy`, `da`, `de`, `el`, `en`, `en-CA`, `es`, `es-419`, `es-AR`, `es-MX`, `et`, `eu-ES`, `fa`, `fi`, `fr`, `fr-CA`, `fr-FR`, `gl-ES`, `gu`, `he`, `hi`, `hr`, `hu`, `hy`, `id`, `is`, `it`, `ja`, `ka`, `kk`, `kn`, `ko`, `lt`, `lv`, `mk`, `ml`, `mn`, `mr`, `ms`, `my`, `nb`, `nl`, `nn`, `no`, `pa`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `so`, `sq`, `sr`, `sv`, `sw`, `ta`, `te`, `th`, `tl`, `tr`, `uk`, `ur`, `vi`, `zgh`, `zh-CN`, `zh-HK`, `zh-TW`.
     */
    public readonly language!: pulumi.Output<string>;
    /**
     * The term `prompt` is used to refer to a specific step in the login flow. Options include: `login`, `login-id`, `login-password`, `login-passwordless`, `login-email-verification`, `signup`, `signup-id`, `signup-password`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `reset-password`, `custom-form`, `consent`, `customized-consent`, `logout`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`, `passkeys`, `captcha`, `brute-force-protection`.
     */
    public readonly prompt!: pulumi.Output<string>;

    /**
     * Create a PromptCustomText resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PromptCustomTextArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PromptCustomTextArgs | PromptCustomTextState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PromptCustomTextState | undefined;
            resourceInputs["body"] = state ? state.body : undefined;
            resourceInputs["language"] = state ? state.language : undefined;
            resourceInputs["prompt"] = state ? state.prompt : undefined;
        } else {
            const args = argsOrState as PromptCustomTextArgs | undefined;
            if ((!args || args.body === undefined) && !opts.urn) {
                throw new Error("Missing required property 'body'");
            }
            if ((!args || args.language === undefined) && !opts.urn) {
                throw new Error("Missing required property 'language'");
            }
            if ((!args || args.prompt === undefined) && !opts.urn) {
                throw new Error("Missing required property 'prompt'");
            }
            resourceInputs["body"] = args ? args.body : undefined;
            resourceInputs["language"] = args ? args.language : undefined;
            resourceInputs["prompt"] = args ? args.prompt : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PromptCustomText.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PromptCustomText resources.
 */
export interface PromptCustomTextState {
    /**
     * JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values).
     */
    body?: pulumi.Input<string>;
    /**
     * Language of the custom text. Options include: `am`, `ar`, `ar-EG`, `ar-SA`, `az`, `bg`, `bn`, `bs`, `ca-ES`, `cnr`, `cs`, `cy`, `da`, `de`, `el`, `en`, `en-CA`, `es`, `es-419`, `es-AR`, `es-MX`, `et`, `eu-ES`, `fa`, `fi`, `fr`, `fr-CA`, `fr-FR`, `gl-ES`, `gu`, `he`, `hi`, `hr`, `hu`, `hy`, `id`, `is`, `it`, `ja`, `ka`, `kk`, `kn`, `ko`, `lt`, `lv`, `mk`, `ml`, `mn`, `mr`, `ms`, `my`, `nb`, `nl`, `nn`, `no`, `pa`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `so`, `sq`, `sr`, `sv`, `sw`, `ta`, `te`, `th`, `tl`, `tr`, `uk`, `ur`, `vi`, `zgh`, `zh-CN`, `zh-HK`, `zh-TW`.
     */
    language?: pulumi.Input<string>;
    /**
     * The term `prompt` is used to refer to a specific step in the login flow. Options include: `login`, `login-id`, `login-password`, `login-passwordless`, `login-email-verification`, `signup`, `signup-id`, `signup-password`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `reset-password`, `custom-form`, `consent`, `customized-consent`, `logout`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`, `passkeys`, `captcha`, `brute-force-protection`.
     */
    prompt?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PromptCustomText resource.
 */
export interface PromptCustomTextArgs {
    /**
     * JSON containing the custom texts. You can check the options for each prompt [here](https://auth0.com/docs/customize/universal-login-pages/customize-login-text-prompts#prompt-values).
     */
    body: pulumi.Input<string>;
    /**
     * Language of the custom text. Options include: `am`, `ar`, `ar-EG`, `ar-SA`, `az`, `bg`, `bn`, `bs`, `ca-ES`, `cnr`, `cs`, `cy`, `da`, `de`, `el`, `en`, `en-CA`, `es`, `es-419`, `es-AR`, `es-MX`, `et`, `eu-ES`, `fa`, `fi`, `fr`, `fr-CA`, `fr-FR`, `gl-ES`, `gu`, `he`, `hi`, `hr`, `hu`, `hy`, `id`, `is`, `it`, `ja`, `ka`, `kk`, `kn`, `ko`, `lt`, `lv`, `mk`, `ml`, `mn`, `mr`, `ms`, `my`, `nb`, `nl`, `nn`, `no`, `pa`, `pl`, `pt`, `pt-BR`, `pt-PT`, `ro`, `ru`, `sk`, `sl`, `so`, `sq`, `sr`, `sv`, `sw`, `ta`, `te`, `th`, `tl`, `tr`, `uk`, `ur`, `vi`, `zgh`, `zh-CN`, `zh-HK`, `zh-TW`.
     */
    language: pulumi.Input<string>;
    /**
     * The term `prompt` is used to refer to a specific step in the login flow. Options include: `login`, `login-id`, `login-password`, `login-passwordless`, `login-email-verification`, `signup`, `signup-id`, `signup-password`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `reset-password`, `custom-form`, `consent`, `customized-consent`, `logout`, `mfa-push`, `mfa-otp`, `mfa-voice`, `mfa-phone`, `mfa-webauthn`, `mfa-sms`, `mfa-email`, `mfa-recovery-code`, `mfa`, `status`, `device-flow`, `email-verification`, `email-otp-challenge`, `organizations`, `invitation`, `common`, `passkeys`, `captcha`, `brute-force-protection`.
     */
    prompt: pulumi.Input<string>;
}
