// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.PromptScreenRendererArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.PromptScreenRendererState;
import com.pulumi.auth0.outputs.PromptScreenRendererFilters;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * With this resource, you can Configure the render settings for a specific screen.You can read more about this [here](https://auth0.com/docs/customize/login-pages/advanced-customizations/getting-started/configure-acul-screens).
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.PromptScreenRenderer;
 * import com.pulumi.auth0.PromptScreenRendererArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var promptScreenRenderer = new PromptScreenRenderer("promptScreenRenderer", PromptScreenRendererArgs.builder()
 *             .promptType("login-id")
 *             .screenName("login-id")
 *             .renderingMode("advanced")
 *             .defaultHeadTagsDisabled(false)
 *             .contextConfigurations(            
 *                 "branding.settings",
 *                 "branding.themes.default",
 *                 "client.logo_uri",
 *                 "client.description",
 *                 "client.metadata.key",
 *                 "organization.display_name",
 *                 "organization.branding",
 *                 "organization.metadata.key",
 *                 "screen.texts",
 *                 "tenant.name",
 *                 "tenant.friendly_name",
 *                 "tenant.enabled_locales",
 *                 "untrusted_data.submitted_form_data",
 *                 "untrusted_data.authorization_params.login_hint",
 *                 "untrusted_data.authorization_params.screen_hint",
 *                 "untrusted_data.authorization_params.ui_locales",
 *                 "untrusted_data.authorization_params.ext-key")
 *             .headTags(serializeJson(
 *                 jsonArray(jsonObject(
 *                     jsonProperty("attributes", jsonObject(
 *                         jsonProperty("async", true),
 *                         jsonProperty("defer", true),
 *                         jsonProperty("integrity", jsonArray("sha512-v2CJ7UaYy4JwqLDIrZUI/4hqeoQieOmAZNXBeQyjo21dadnwR+8ZaIJVT8EE2iyI61OV8e6M8PP2/4hpQINQ/g==")),
 *                         jsonProperty("src", "https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js")
 *                     )),
 *                     jsonProperty("tag", "script")
 *                 ))))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * This resource can be imported using the prompt name and screen_name.
 * 
 * As this is not a resource identifiable by an ID within the Auth0 Management API,
 * 
 * login can be imported using the prompt name and screen name using the format:
 * 
 * prompt_name:screen_name
 * 
 * Example:
 * 
 * ```sh
 * $ pulumi import auth0:index/promptScreenRenderer:PromptScreenRenderer auth0_prompt_screen_renderer &#34;login-id:login-id&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/promptScreenRenderer:PromptScreenRenderer")
public class PromptScreenRenderer extends com.pulumi.resources.CustomResource {
    /**
     * Context values to make available
     * 
     */
    @Export(name="contextConfigurations", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> contextConfigurations;

    /**
     * @return Context values to make available
     * 
     */
    public Output<List<String>> contextConfigurations() {
        return this.contextConfigurations;
    }
    /**
     * Override Universal Login default head tags
     * 
     */
    @Export(name="defaultHeadTagsDisabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> defaultHeadTagsDisabled;

    /**
     * @return Override Universal Login default head tags
     * 
     */
    public Output<Optional<Boolean>> defaultHeadTagsDisabled() {
        return Codegen.optional(this.defaultHeadTagsDisabled);
    }
    /**
     * Optional filters to apply rendering rules to specific entities. `match_type` and at least one of the entity arrays are required.
     * 
     */
    @Export(name="filters", refs={PromptScreenRendererFilters.class}, tree="[0]")
    private Output</* @Nullable */ PromptScreenRendererFilters> filters;

    /**
     * @return Optional filters to apply rendering rules to specific entities. `match_type` and at least one of the entity arrays are required.
     * 
     */
    public Output<Optional<PromptScreenRendererFilters>> filters() {
        return Codegen.optional(this.filters);
    }
    /**
     * An array of head tags
     * 
     */
    @Export(name="headTags", refs={String.class}, tree="[0]")
    private Output<String> headTags;

    /**
     * @return An array of head tags
     * 
     */
    public Output<String> headTags() {
        return this.headTags;
    }
    /**
     * The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`, `login`, `signup`, `reset-password`, `mfa`, `mfa-sms`, `mfa-email`, `mfa-push`, `invitation`, `organizations`, `mfa-otp`, `device-flow`, `mfa-phone`, `mfa-voice`, `mfa-recovery-code`, `common`, `email-verification`, `login-email-verification`, `logout`, `mfa-webauthn`, `consent`, `customized-consent`, `email-otp-challenge`.
     * 
     */
    @Export(name="promptType", refs={String.class}, tree="[0]")
    private Output<String> promptType;

    /**
     * @return The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`, `login`, `signup`, `reset-password`, `mfa`, `mfa-sms`, `mfa-email`, `mfa-push`, `invitation`, `organizations`, `mfa-otp`, `device-flow`, `mfa-phone`, `mfa-voice`, `mfa-recovery-code`, `common`, `email-verification`, `login-email-verification`, `logout`, `mfa-webauthn`, `consent`, `customized-consent`, `email-otp-challenge`.
     * 
     */
    public Output<String> promptType() {
        return this.promptType;
    }
    /**
     * Rendering modeOptions are: `standard`, `advanced`.
     * 
     */
    @Export(name="renderingMode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> renderingMode;

    /**
     * @return Rendering modeOptions are: `standard`, `advanced`.
     * 
     */
    public Output<Optional<String>> renderingMode() {
        return Codegen.optional(this.renderingMode);
    }
    /**
     * The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`, `login`, `signup`, `reset-password-request`, `reset-password-email`, `reset-password`, `reset-password-success`, `reset-password-error`, `reset-password-mfa-email-challenge`, `reset-password-mfa-otp-challenge`, `reset-password-mfa-push-challenge-push`, `reset-password-mfa-sms-challenge`, `mfa-detect-browser-capabilities`, `mfa-enroll-result`, `mfa-begin-enroll-options`, `mfa-login-options`, `mfa-country-codes`, `mfa-sms-challenge`, `mfa-sms-enrollment`, `mfa-sms-list`, `mfa-email-challenge`, `mfa-email-list`, `mfa-push-challenge-push`, `mfa-push-enrollment-qr`, `mfa-push-list`, `mfa-push-welcome`, `accept-invitation`, `organization-selection`, `organization-picker`, `mfa-otp-challenge`, `mfa-otp-enrollment-code`, `mfa-otp-enrollment-qr`, `device-code-activation`, `device-code-activation-allowed`, `device-code-activation-denied`, `device-code-confirmation`, `mfa-phone-challenge`, `mfa-phone-enrollment`, `mfa-voice-challenge`, `mfa-voice-enrollment`, `reset-password-mfa-phone-challenge`, `reset-password-mfa-voice-challenge`, `mfa-recovery-code-challenge`, `mfa-recovery-code-enrollment`, `reset-password-mfa-recovery-code-challenge`, `redeem-ticket`, `mfa-recovery-code-challenge-new-code`, `email-verification-result`, `login-email-verification`, `logout`, `logout-aborted`, `logout-complete`, `mfa-webauthn-change-key-nickname`, `mfa-webauthn-enrollment-success`, `mfa-webauthn-error`, `mfa-webauthn-platform-challenge`, `mfa-webauthn-platform-enrollment`, `mfa-webauthn-roaming-challenge`, `mfa-webauthn-roaming-enrollment`, `reset-password-mfa-webauthn-platform-challenge`, `reset-password-mfa-webauthn-roaming-challenge`, `consent`, `customized-consent`, `email-otp-challenge`, `mfa-webauthn-not-available-error`.
     * 
     */
    @Export(name="screenName", refs={String.class}, tree="[0]")
    private Output<String> screenName;

    /**
     * @return The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`, `login`, `signup`, `reset-password-request`, `reset-password-email`, `reset-password`, `reset-password-success`, `reset-password-error`, `reset-password-mfa-email-challenge`, `reset-password-mfa-otp-challenge`, `reset-password-mfa-push-challenge-push`, `reset-password-mfa-sms-challenge`, `mfa-detect-browser-capabilities`, `mfa-enroll-result`, `mfa-begin-enroll-options`, `mfa-login-options`, `mfa-country-codes`, `mfa-sms-challenge`, `mfa-sms-enrollment`, `mfa-sms-list`, `mfa-email-challenge`, `mfa-email-list`, `mfa-push-challenge-push`, `mfa-push-enrollment-qr`, `mfa-push-list`, `mfa-push-welcome`, `accept-invitation`, `organization-selection`, `organization-picker`, `mfa-otp-challenge`, `mfa-otp-enrollment-code`, `mfa-otp-enrollment-qr`, `device-code-activation`, `device-code-activation-allowed`, `device-code-activation-denied`, `device-code-confirmation`, `mfa-phone-challenge`, `mfa-phone-enrollment`, `mfa-voice-challenge`, `mfa-voice-enrollment`, `reset-password-mfa-phone-challenge`, `reset-password-mfa-voice-challenge`, `mfa-recovery-code-challenge`, `mfa-recovery-code-enrollment`, `reset-password-mfa-recovery-code-challenge`, `redeem-ticket`, `mfa-recovery-code-challenge-new-code`, `email-verification-result`, `login-email-verification`, `logout`, `logout-aborted`, `logout-complete`, `mfa-webauthn-change-key-nickname`, `mfa-webauthn-enrollment-success`, `mfa-webauthn-error`, `mfa-webauthn-platform-challenge`, `mfa-webauthn-platform-enrollment`, `mfa-webauthn-roaming-challenge`, `mfa-webauthn-roaming-enrollment`, `reset-password-mfa-webauthn-platform-challenge`, `reset-password-mfa-webauthn-roaming-challenge`, `consent`, `customized-consent`, `email-otp-challenge`, `mfa-webauthn-not-available-error`.
     * 
     */
    public Output<String> screenName() {
        return this.screenName;
    }
    /**
     * Tenant ID
     * 
     */
    @Export(name="tenant", refs={String.class}, tree="[0]")
    private Output<String> tenant;

    /**
     * @return Tenant ID
     * 
     */
    public Output<String> tenant() {
        return this.tenant;
    }
    /**
     * Use page template with ACUL
     * 
     */
    @Export(name="usePageTemplate", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> usePageTemplate;

    /**
     * @return Use page template with ACUL
     * 
     */
    public Output<Optional<Boolean>> usePageTemplate() {
        return Codegen.optional(this.usePageTemplate);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PromptScreenRenderer(java.lang.String name) {
        this(name, PromptScreenRendererArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PromptScreenRenderer(java.lang.String name, PromptScreenRendererArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PromptScreenRenderer(java.lang.String name, PromptScreenRendererArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/promptScreenRenderer:PromptScreenRenderer", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private PromptScreenRenderer(java.lang.String name, Output<java.lang.String> id, @Nullable PromptScreenRendererState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/promptScreenRenderer:PromptScreenRenderer", name, state, makeResourceOptions(options, id), false);
    }

    private static PromptScreenRendererArgs makeArgs(PromptScreenRendererArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PromptScreenRendererArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PromptScreenRenderer get(java.lang.String name, Output<java.lang.String> id, @Nullable PromptScreenRendererState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PromptScreenRenderer(name, id, state, options);
    }
}
