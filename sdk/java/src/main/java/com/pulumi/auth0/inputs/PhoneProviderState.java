// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.PhoneProviderConfigurationArgs;
import com.pulumi.auth0.inputs.PhoneProviderCredentialsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PhoneProviderState extends com.pulumi.resources.ResourceArgs {

    public static final PhoneProviderState Empty = new PhoneProviderState();

    /**
     * The channel of the phone provider.
     * 
     */
    @Import(name="channel")
    private @Nullable Output<String> channel;

    /**
     * @return The channel of the phone provider.
     * 
     */
    public Optional<Output<String>> channel() {
        return Optional.ofNullable(this.channel);
    }

    /**
     * Specific phone provider settings.
     * 
     */
    @Import(name="configuration")
    private @Nullable Output<PhoneProviderConfigurationArgs> configuration;

    /**
     * @return Specific phone provider settings.
     * 
     */
    public Optional<Output<PhoneProviderConfigurationArgs>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    /**
     * Provider credentials required to use authenticate to the provider.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<PhoneProviderCredentialsArgs> credentials;

    /**
     * @return Provider credentials required to use authenticate to the provider.
     * 
     */
    public Optional<Output<PhoneProviderCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * Indicates whether the phone provider is enabled (false) or disabled (true).
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Indicates whether the phone provider is enabled (false) or disabled (true).
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * Name of the phone provider. Options include `twilio`, `custom`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the phone provider. Options include `twilio`, `custom`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The tenant of the phone provider.
     * 
     */
    @Import(name="tenant")
    private @Nullable Output<String> tenant;

    /**
     * @return The tenant of the phone provider.
     * 
     */
    public Optional<Output<String>> tenant() {
        return Optional.ofNullable(this.tenant);
    }

    private PhoneProviderState() {}

    private PhoneProviderState(PhoneProviderState $) {
        this.channel = $.channel;
        this.configuration = $.configuration;
        this.credentials = $.credentials;
        this.disabled = $.disabled;
        this.name = $.name;
        this.tenant = $.tenant;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PhoneProviderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PhoneProviderState $;

        public Builder() {
            $ = new PhoneProviderState();
        }

        public Builder(PhoneProviderState defaults) {
            $ = new PhoneProviderState(Objects.requireNonNull(defaults));
        }

        /**
         * @param channel The channel of the phone provider.
         * 
         * @return builder
         * 
         */
        public Builder channel(@Nullable Output<String> channel) {
            $.channel = channel;
            return this;
        }

        /**
         * @param channel The channel of the phone provider.
         * 
         * @return builder
         * 
         */
        public Builder channel(String channel) {
            return channel(Output.of(channel));
        }

        /**
         * @param configuration Specific phone provider settings.
         * 
         * @return builder
         * 
         */
        public Builder configuration(@Nullable Output<PhoneProviderConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration Specific phone provider settings.
         * 
         * @return builder
         * 
         */
        public Builder configuration(PhoneProviderConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param credentials Provider credentials required to use authenticate to the provider.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<PhoneProviderCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials Provider credentials required to use authenticate to the provider.
         * 
         * @return builder
         * 
         */
        public Builder credentials(PhoneProviderCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param disabled Indicates whether the phone provider is enabled (false) or disabled (true).
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Indicates whether the phone provider is enabled (false) or disabled (true).
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param name Name of the phone provider. Options include `twilio`, `custom`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the phone provider. Options include `twilio`, `custom`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tenant The tenant of the phone provider.
         * 
         * @return builder
         * 
         */
        public Builder tenant(@Nullable Output<String> tenant) {
            $.tenant = tenant;
            return this;
        }

        /**
         * @param tenant The tenant of the phone provider.
         * 
         * @return builder
         * 
         */
        public Builder tenant(String tenant) {
            return tenant(Output.of(tenant));
        }

        public PhoneProviderState build() {
            return $;
        }
    }

}
