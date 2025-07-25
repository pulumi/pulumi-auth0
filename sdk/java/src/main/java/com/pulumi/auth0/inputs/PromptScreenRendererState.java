// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.PromptScreenRendererFiltersArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PromptScreenRendererState extends com.pulumi.resources.ResourceArgs {

    public static final PromptScreenRendererState Empty = new PromptScreenRendererState();

    /**
     * Context values to make available
     * 
     */
    @Import(name="contextConfigurations")
    private @Nullable Output<List<String>> contextConfigurations;

    /**
     * @return Context values to make available
     * 
     */
    public Optional<Output<List<String>>> contextConfigurations() {
        return Optional.ofNullable(this.contextConfigurations);
    }

    /**
     * Override Universal Login default head tags
     * 
     */
    @Import(name="defaultHeadTagsDisabled")
    private @Nullable Output<Boolean> defaultHeadTagsDisabled;

    /**
     * @return Override Universal Login default head tags
     * 
     */
    public Optional<Output<Boolean>> defaultHeadTagsDisabled() {
        return Optional.ofNullable(this.defaultHeadTagsDisabled);
    }

    /**
     * Optional filters to apply rendering rules to specific entities. `match_type` and at least one of the entity arrays are required.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<PromptScreenRendererFiltersArgs> filters;

    /**
     * @return Optional filters to apply rendering rules to specific entities. `match_type` and at least one of the entity arrays are required.
     * 
     */
    public Optional<Output<PromptScreenRendererFiltersArgs>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * An array of head tags
     * 
     */
    @Import(name="headTags")
    private @Nullable Output<String> headTags;

    /**
     * @return An array of head tags
     * 
     */
    public Optional<Output<String>> headTags() {
        return Optional.ofNullable(this.headTags);
    }

    /**
     * The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`, `login`, `signup`, `reset-password`, `mfa`, `mfa-sms`, `mfa-email`, `mfa-push`, `invitation`, `organizations`, `mfa-otp`, `device-flow`, `mfa-phone`, `mfa-voice`, `mfa-recovery-code`, `common`, `email-verification`, `login-email-verification`, `logout`, `mfa-webauthn`, `consent`, `customized-consent`, `email-otp-challenge`.
     * 
     */
    @Import(name="promptType")
    private @Nullable Output<String> promptType;

    /**
     * @return The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`, `login`, `signup`, `reset-password`, `mfa`, `mfa-sms`, `mfa-email`, `mfa-push`, `invitation`, `organizations`, `mfa-otp`, `device-flow`, `mfa-phone`, `mfa-voice`, `mfa-recovery-code`, `common`, `email-verification`, `login-email-verification`, `logout`, `mfa-webauthn`, `consent`, `customized-consent`, `email-otp-challenge`.
     * 
     */
    public Optional<Output<String>> promptType() {
        return Optional.ofNullable(this.promptType);
    }

    /**
     * Rendering modeOptions are: `standard`, `advanced`.
     * 
     */
    @Import(name="renderingMode")
    private @Nullable Output<String> renderingMode;

    /**
     * @return Rendering modeOptions are: `standard`, `advanced`.
     * 
     */
    public Optional<Output<String>> renderingMode() {
        return Optional.ofNullable(this.renderingMode);
    }

    /**
     * The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`, `login`, `signup`, `reset-password-request`, `reset-password-email`, `reset-password`, `reset-password-success`, `reset-password-error`, `reset-password-mfa-email-challenge`, `reset-password-mfa-otp-challenge`, `reset-password-mfa-push-challenge-push`, `reset-password-mfa-sms-challenge`, `mfa-detect-browser-capabilities`, `mfa-enroll-result`, `mfa-begin-enroll-options`, `mfa-login-options`, `mfa-country-codes`, `mfa-sms-challenge`, `mfa-sms-enrollment`, `mfa-sms-list`, `mfa-email-challenge`, `mfa-email-list`, `mfa-push-challenge-push`, `mfa-push-enrollment-qr`, `mfa-push-list`, `mfa-push-welcome`, `accept-invitation`, `organization-selection`, `organization-picker`, `mfa-otp-challenge`, `mfa-otp-enrollment-code`, `mfa-otp-enrollment-qr`, `device-code-activation`, `device-code-activation-allowed`, `device-code-activation-denied`, `device-code-confirmation`, `mfa-phone-challenge`, `mfa-phone-enrollment`, `mfa-voice-challenge`, `mfa-voice-enrollment`, `reset-password-mfa-phone-challenge`, `reset-password-mfa-voice-challenge`, `mfa-recovery-code-challenge`, `mfa-recovery-code-enrollment`, `reset-password-mfa-recovery-code-challenge`, `redeem-ticket`, `mfa-recovery-code-challenge-new-code`, `email-verification-result`, `login-email-verification`, `logout`, `logout-aborted`, `logout-complete`, `mfa-webauthn-change-key-nickname`, `mfa-webauthn-enrollment-success`, `mfa-webauthn-error`, `mfa-webauthn-platform-challenge`, `mfa-webauthn-platform-enrollment`, `mfa-webauthn-roaming-challenge`, `mfa-webauthn-roaming-enrollment`, `reset-password-mfa-webauthn-platform-challenge`, `reset-password-mfa-webauthn-roaming-challenge`, `consent`, `customized-consent`, `email-otp-challenge`, `mfa-webauthn-not-available-error`.
     * 
     */
    @Import(name="screenName")
    private @Nullable Output<String> screenName;

    /**
     * @return The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`, `login`, `signup`, `reset-password-request`, `reset-password-email`, `reset-password`, `reset-password-success`, `reset-password-error`, `reset-password-mfa-email-challenge`, `reset-password-mfa-otp-challenge`, `reset-password-mfa-push-challenge-push`, `reset-password-mfa-sms-challenge`, `mfa-detect-browser-capabilities`, `mfa-enroll-result`, `mfa-begin-enroll-options`, `mfa-login-options`, `mfa-country-codes`, `mfa-sms-challenge`, `mfa-sms-enrollment`, `mfa-sms-list`, `mfa-email-challenge`, `mfa-email-list`, `mfa-push-challenge-push`, `mfa-push-enrollment-qr`, `mfa-push-list`, `mfa-push-welcome`, `accept-invitation`, `organization-selection`, `organization-picker`, `mfa-otp-challenge`, `mfa-otp-enrollment-code`, `mfa-otp-enrollment-qr`, `device-code-activation`, `device-code-activation-allowed`, `device-code-activation-denied`, `device-code-confirmation`, `mfa-phone-challenge`, `mfa-phone-enrollment`, `mfa-voice-challenge`, `mfa-voice-enrollment`, `reset-password-mfa-phone-challenge`, `reset-password-mfa-voice-challenge`, `mfa-recovery-code-challenge`, `mfa-recovery-code-enrollment`, `reset-password-mfa-recovery-code-challenge`, `redeem-ticket`, `mfa-recovery-code-challenge-new-code`, `email-verification-result`, `login-email-verification`, `logout`, `logout-aborted`, `logout-complete`, `mfa-webauthn-change-key-nickname`, `mfa-webauthn-enrollment-success`, `mfa-webauthn-error`, `mfa-webauthn-platform-challenge`, `mfa-webauthn-platform-enrollment`, `mfa-webauthn-roaming-challenge`, `mfa-webauthn-roaming-enrollment`, `reset-password-mfa-webauthn-platform-challenge`, `reset-password-mfa-webauthn-roaming-challenge`, `consent`, `customized-consent`, `email-otp-challenge`, `mfa-webauthn-not-available-error`.
     * 
     */
    public Optional<Output<String>> screenName() {
        return Optional.ofNullable(this.screenName);
    }

    /**
     * Tenant ID
     * 
     */
    @Import(name="tenant")
    private @Nullable Output<String> tenant;

    /**
     * @return Tenant ID
     * 
     */
    public Optional<Output<String>> tenant() {
        return Optional.ofNullable(this.tenant);
    }

    /**
     * Use page template with ACUL
     * 
     */
    @Import(name="usePageTemplate")
    private @Nullable Output<Boolean> usePageTemplate;

    /**
     * @return Use page template with ACUL
     * 
     */
    public Optional<Output<Boolean>> usePageTemplate() {
        return Optional.ofNullable(this.usePageTemplate);
    }

    private PromptScreenRendererState() {}

    private PromptScreenRendererState(PromptScreenRendererState $) {
        this.contextConfigurations = $.contextConfigurations;
        this.defaultHeadTagsDisabled = $.defaultHeadTagsDisabled;
        this.filters = $.filters;
        this.headTags = $.headTags;
        this.promptType = $.promptType;
        this.renderingMode = $.renderingMode;
        this.screenName = $.screenName;
        this.tenant = $.tenant;
        this.usePageTemplate = $.usePageTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PromptScreenRendererState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PromptScreenRendererState $;

        public Builder() {
            $ = new PromptScreenRendererState();
        }

        public Builder(PromptScreenRendererState defaults) {
            $ = new PromptScreenRendererState(Objects.requireNonNull(defaults));
        }

        /**
         * @param contextConfigurations Context values to make available
         * 
         * @return builder
         * 
         */
        public Builder contextConfigurations(@Nullable Output<List<String>> contextConfigurations) {
            $.contextConfigurations = contextConfigurations;
            return this;
        }

        /**
         * @param contextConfigurations Context values to make available
         * 
         * @return builder
         * 
         */
        public Builder contextConfigurations(List<String> contextConfigurations) {
            return contextConfigurations(Output.of(contextConfigurations));
        }

        /**
         * @param contextConfigurations Context values to make available
         * 
         * @return builder
         * 
         */
        public Builder contextConfigurations(String... contextConfigurations) {
            return contextConfigurations(List.of(contextConfigurations));
        }

        /**
         * @param defaultHeadTagsDisabled Override Universal Login default head tags
         * 
         * @return builder
         * 
         */
        public Builder defaultHeadTagsDisabled(@Nullable Output<Boolean> defaultHeadTagsDisabled) {
            $.defaultHeadTagsDisabled = defaultHeadTagsDisabled;
            return this;
        }

        /**
         * @param defaultHeadTagsDisabled Override Universal Login default head tags
         * 
         * @return builder
         * 
         */
        public Builder defaultHeadTagsDisabled(Boolean defaultHeadTagsDisabled) {
            return defaultHeadTagsDisabled(Output.of(defaultHeadTagsDisabled));
        }

        /**
         * @param filters Optional filters to apply rendering rules to specific entities. `match_type` and at least one of the entity arrays are required.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<PromptScreenRendererFiltersArgs> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Optional filters to apply rendering rules to specific entities. `match_type` and at least one of the entity arrays are required.
         * 
         * @return builder
         * 
         */
        public Builder filters(PromptScreenRendererFiltersArgs filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param headTags An array of head tags
         * 
         * @return builder
         * 
         */
        public Builder headTags(@Nullable Output<String> headTags) {
            $.headTags = headTags;
            return this;
        }

        /**
         * @param headTags An array of head tags
         * 
         * @return builder
         * 
         */
        public Builder headTags(String headTags) {
            return headTags(Output.of(headTags));
        }

        /**
         * @param promptType The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`, `login`, `signup`, `reset-password`, `mfa`, `mfa-sms`, `mfa-email`, `mfa-push`, `invitation`, `organizations`, `mfa-otp`, `device-flow`, `mfa-phone`, `mfa-voice`, `mfa-recovery-code`, `common`, `email-verification`, `login-email-verification`, `logout`, `mfa-webauthn`, `consent`, `customized-consent`, `email-otp-challenge`.
         * 
         * @return builder
         * 
         */
        public Builder promptType(@Nullable Output<String> promptType) {
            $.promptType = promptType;
            return this;
        }

        /**
         * @param promptType The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`, `login`, `signup`, `reset-password`, `mfa`, `mfa-sms`, `mfa-email`, `mfa-push`, `invitation`, `organizations`, `mfa-otp`, `device-flow`, `mfa-phone`, `mfa-voice`, `mfa-recovery-code`, `common`, `email-verification`, `login-email-verification`, `logout`, `mfa-webauthn`, `consent`, `customized-consent`, `email-otp-challenge`.
         * 
         * @return builder
         * 
         */
        public Builder promptType(String promptType) {
            return promptType(Output.of(promptType));
        }

        /**
         * @param renderingMode Rendering modeOptions are: `standard`, `advanced`.
         * 
         * @return builder
         * 
         */
        public Builder renderingMode(@Nullable Output<String> renderingMode) {
            $.renderingMode = renderingMode;
            return this;
        }

        /**
         * @param renderingMode Rendering modeOptions are: `standard`, `advanced`.
         * 
         * @return builder
         * 
         */
        public Builder renderingMode(String renderingMode) {
            return renderingMode(Output.of(renderingMode));
        }

        /**
         * @param screenName The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`, `login`, `signup`, `reset-password-request`, `reset-password-email`, `reset-password`, `reset-password-success`, `reset-password-error`, `reset-password-mfa-email-challenge`, `reset-password-mfa-otp-challenge`, `reset-password-mfa-push-challenge-push`, `reset-password-mfa-sms-challenge`, `mfa-detect-browser-capabilities`, `mfa-enroll-result`, `mfa-begin-enroll-options`, `mfa-login-options`, `mfa-country-codes`, `mfa-sms-challenge`, `mfa-sms-enrollment`, `mfa-sms-list`, `mfa-email-challenge`, `mfa-email-list`, `mfa-push-challenge-push`, `mfa-push-enrollment-qr`, `mfa-push-list`, `mfa-push-welcome`, `accept-invitation`, `organization-selection`, `organization-picker`, `mfa-otp-challenge`, `mfa-otp-enrollment-code`, `mfa-otp-enrollment-qr`, `device-code-activation`, `device-code-activation-allowed`, `device-code-activation-denied`, `device-code-confirmation`, `mfa-phone-challenge`, `mfa-phone-enrollment`, `mfa-voice-challenge`, `mfa-voice-enrollment`, `reset-password-mfa-phone-challenge`, `reset-password-mfa-voice-challenge`, `mfa-recovery-code-challenge`, `mfa-recovery-code-enrollment`, `reset-password-mfa-recovery-code-challenge`, `redeem-ticket`, `mfa-recovery-code-challenge-new-code`, `email-verification-result`, `login-email-verification`, `logout`, `logout-aborted`, `logout-complete`, `mfa-webauthn-change-key-nickname`, `mfa-webauthn-enrollment-success`, `mfa-webauthn-error`, `mfa-webauthn-platform-challenge`, `mfa-webauthn-platform-enrollment`, `mfa-webauthn-roaming-challenge`, `mfa-webauthn-roaming-enrollment`, `reset-password-mfa-webauthn-platform-challenge`, `reset-password-mfa-webauthn-roaming-challenge`, `consent`, `customized-consent`, `email-otp-challenge`, `mfa-webauthn-not-available-error`.
         * 
         * @return builder
         * 
         */
        public Builder screenName(@Nullable Output<String> screenName) {
            $.screenName = screenName;
            return this;
        }

        /**
         * @param screenName The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`, `login`, `signup`, `reset-password-request`, `reset-password-email`, `reset-password`, `reset-password-success`, `reset-password-error`, `reset-password-mfa-email-challenge`, `reset-password-mfa-otp-challenge`, `reset-password-mfa-push-challenge-push`, `reset-password-mfa-sms-challenge`, `mfa-detect-browser-capabilities`, `mfa-enroll-result`, `mfa-begin-enroll-options`, `mfa-login-options`, `mfa-country-codes`, `mfa-sms-challenge`, `mfa-sms-enrollment`, `mfa-sms-list`, `mfa-email-challenge`, `mfa-email-list`, `mfa-push-challenge-push`, `mfa-push-enrollment-qr`, `mfa-push-list`, `mfa-push-welcome`, `accept-invitation`, `organization-selection`, `organization-picker`, `mfa-otp-challenge`, `mfa-otp-enrollment-code`, `mfa-otp-enrollment-qr`, `device-code-activation`, `device-code-activation-allowed`, `device-code-activation-denied`, `device-code-confirmation`, `mfa-phone-challenge`, `mfa-phone-enrollment`, `mfa-voice-challenge`, `mfa-voice-enrollment`, `reset-password-mfa-phone-challenge`, `reset-password-mfa-voice-challenge`, `mfa-recovery-code-challenge`, `mfa-recovery-code-enrollment`, `reset-password-mfa-recovery-code-challenge`, `redeem-ticket`, `mfa-recovery-code-challenge-new-code`, `email-verification-result`, `login-email-verification`, `logout`, `logout-aborted`, `logout-complete`, `mfa-webauthn-change-key-nickname`, `mfa-webauthn-enrollment-success`, `mfa-webauthn-error`, `mfa-webauthn-platform-challenge`, `mfa-webauthn-platform-enrollment`, `mfa-webauthn-roaming-challenge`, `mfa-webauthn-roaming-enrollment`, `reset-password-mfa-webauthn-platform-challenge`, `reset-password-mfa-webauthn-roaming-challenge`, `consent`, `customized-consent`, `email-otp-challenge`, `mfa-webauthn-not-available-error`.
         * 
         * @return builder
         * 
         */
        public Builder screenName(String screenName) {
            return screenName(Output.of(screenName));
        }

        /**
         * @param tenant Tenant ID
         * 
         * @return builder
         * 
         */
        public Builder tenant(@Nullable Output<String> tenant) {
            $.tenant = tenant;
            return this;
        }

        /**
         * @param tenant Tenant ID
         * 
         * @return builder
         * 
         */
        public Builder tenant(String tenant) {
            return tenant(Output.of(tenant));
        }

        /**
         * @param usePageTemplate Use page template with ACUL
         * 
         * @return builder
         * 
         */
        public Builder usePageTemplate(@Nullable Output<Boolean> usePageTemplate) {
            $.usePageTemplate = usePageTemplate;
            return this;
        }

        /**
         * @param usePageTemplate Use page template with ACUL
         * 
         * @return builder
         * 
         */
        public Builder usePageTemplate(Boolean usePageTemplate) {
            return usePageTemplate(Output.of(usePageTemplate));
        }

        public PromptScreenRendererState build() {
            return $;
        }
    }

}
