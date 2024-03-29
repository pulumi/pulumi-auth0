// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.EmailProviderSettingsHeadersArgs;
import com.pulumi.auth0.inputs.EmailProviderSettingsMessageArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EmailProviderSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EmailProviderSettingsArgs Empty = new EmailProviderSettingsArgs();

    /**
     * Headers settings for the `smtp` email provider.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<EmailProviderSettingsHeadersArgs> headers;

    /**
     * @return Headers settings for the `smtp` email provider.
     * 
     */
    public Optional<Output<EmailProviderSettingsHeadersArgs>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * Message settings for the `mandrill` or `ses` email provider.
     * 
     */
    @Import(name="message")
    private @Nullable Output<EmailProviderSettingsMessageArgs> message;

    /**
     * @return Message settings for the `mandrill` or `ses` email provider.
     * 
     */
    public Optional<Output<EmailProviderSettingsMessageArgs>> message() {
        return Optional.ofNullable(this.message);
    }

    private EmailProviderSettingsArgs() {}

    private EmailProviderSettingsArgs(EmailProviderSettingsArgs $) {
        this.headers = $.headers;
        this.message = $.message;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EmailProviderSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EmailProviderSettingsArgs $;

        public Builder() {
            $ = new EmailProviderSettingsArgs();
        }

        public Builder(EmailProviderSettingsArgs defaults) {
            $ = new EmailProviderSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param headers Headers settings for the `smtp` email provider.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<EmailProviderSettingsHeadersArgs> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers Headers settings for the `smtp` email provider.
         * 
         * @return builder
         * 
         */
        public Builder headers(EmailProviderSettingsHeadersArgs headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param message Message settings for the `mandrill` or `ses` email provider.
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<EmailProviderSettingsMessageArgs> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message Message settings for the `mandrill` or `ses` email provider.
         * 
         * @return builder
         * 
         */
        public Builder message(EmailProviderSettingsMessageArgs message) {
            return message(Output.of(message));
        }

        public EmailProviderSettingsArgs build() {
            return $;
        }
    }

}
