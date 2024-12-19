// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowVaultConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowVaultConnectionArgs Empty = new FlowVaultConnectionArgs();

    /**
     * Custom account name of the vault connection.
     * 
     */
    @Import(name="accountName")
    private @Nullable Output<String> accountName;

    /**
     * @return Custom account name of the vault connection.
     * 
     */
    public Optional<Output<String>> accountName() {
        return Optional.ofNullable(this.accountName);
    }

    /**
     * App identifier of the vault connection.
     * 
     */
    @Import(name="appId", required=true)
    private Output<String> appId;

    /**
     * @return App identifier of the vault connection.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }

    /**
     * Environment of the vault connection.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<String> environment;

    /**
     * @return Environment of the vault connection.
     * 
     */
    public Optional<Output<String>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * Fingerprint of the vault connection.
     * 
     */
    @Import(name="fingerprint")
    private @Nullable Output<String> fingerprint;

    /**
     * @return Fingerprint of the vault connection.
     * 
     */
    public Optional<Output<String>> fingerprint() {
        return Optional.ofNullable(this.fingerprint);
    }

    /**
     * Name of the vault connection.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the vault connection.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
     * 
     */
    @Import(name="setup")
    private @Nullable Output<Map<String,String>> setup;

    /**
     * @return Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
     * 
     */
    public Optional<Output<Map<String,String>>> setup() {
        return Optional.ofNullable(this.setup);
    }

    private FlowVaultConnectionArgs() {}

    private FlowVaultConnectionArgs(FlowVaultConnectionArgs $) {
        this.accountName = $.accountName;
        this.appId = $.appId;
        this.environment = $.environment;
        this.fingerprint = $.fingerprint;
        this.name = $.name;
        this.setup = $.setup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowVaultConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowVaultConnectionArgs $;

        public Builder() {
            $ = new FlowVaultConnectionArgs();
        }

        public Builder(FlowVaultConnectionArgs defaults) {
            $ = new FlowVaultConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Custom account name of the vault connection.
         * 
         * @return builder
         * 
         */
        public Builder accountName(@Nullable Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName Custom account name of the vault connection.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param appId App identifier of the vault connection.
         * 
         * @return builder
         * 
         */
        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId App identifier of the vault connection.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param environment Environment of the vault connection.
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<String> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment Environment of the vault connection.
         * 
         * @return builder
         * 
         */
        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param fingerprint Fingerprint of the vault connection.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            $.fingerprint = fingerprint;
            return this;
        }

        /**
         * @param fingerprint Fingerprint of the vault connection.
         * 
         * @return builder
         * 
         */
        public Builder fingerprint(String fingerprint) {
            return fingerprint(Output.of(fingerprint));
        }

        /**
         * @param name Name of the vault connection.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the vault connection.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param setup Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
         * 
         * @return builder
         * 
         */
        public Builder setup(@Nullable Output<Map<String,String>> setup) {
            $.setup = setup;
            return this;
        }

        /**
         * @param setup Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
         * 
         * @return builder
         * 
         */
        public Builder setup(Map<String,String> setup) {
            return setup(Output.of(setup));
        }

        public FlowVaultConnectionArgs build() {
            if ($.appId == null) {
                throw new MissingRequiredPropertyException("FlowVaultConnectionArgs", "appId");
            }
            return $;
        }
    }

}
