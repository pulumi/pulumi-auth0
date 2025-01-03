// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PromptScreenRendererArgs extends com.pulumi.resources.ResourceArgs {

    public static final PromptScreenRendererArgs Empty = new PromptScreenRendererArgs();

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
     * The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`.
     * 
     */
    @Import(name="promptType", required=true)
    private Output<String> promptType;

    /**
     * @return The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`.
     * 
     */
    public Output<String> promptType() {
        return this.promptType;
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
     * The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`.
     * 
     */
    @Import(name="screenName", required=true)
    private Output<String> screenName;

    /**
     * @return The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`.
     * 
     */
    public Output<String> screenName() {
        return this.screenName;
    }

    private PromptScreenRendererArgs() {}

    private PromptScreenRendererArgs(PromptScreenRendererArgs $) {
        this.contextConfigurations = $.contextConfigurations;
        this.defaultHeadTagsDisabled = $.defaultHeadTagsDisabled;
        this.headTags = $.headTags;
        this.promptType = $.promptType;
        this.renderingMode = $.renderingMode;
        this.screenName = $.screenName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PromptScreenRendererArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PromptScreenRendererArgs $;

        public Builder() {
            $ = new PromptScreenRendererArgs();
        }

        public Builder(PromptScreenRendererArgs defaults) {
            $ = new PromptScreenRendererArgs(Objects.requireNonNull(defaults));
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
         * @param promptType The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`.
         * 
         * @return builder
         * 
         */
        public Builder promptType(Output<String> promptType) {
            $.promptType = promptType;
            return this;
        }

        /**
         * @param promptType The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`.
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
         * @param screenName The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`.
         * 
         * @return builder
         * 
         */
        public Builder screenName(Output<String> screenName) {
            $.screenName = screenName;
            return this;
        }

        /**
         * @param screenName The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`.
         * 
         * @return builder
         * 
         */
        public Builder screenName(String screenName) {
            return screenName(Output.of(screenName));
        }

        public PromptScreenRendererArgs build() {
            if ($.promptType == null) {
                throw new MissingRequiredPropertyException("PromptScreenRendererArgs", "promptType");
            }
            if ($.screenName == null) {
                throw new MissingRequiredPropertyException("PromptScreenRendererArgs", "screenName");
            }
            return $;
        }
    }

}