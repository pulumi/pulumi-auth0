// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientMobileIosArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientMobileIosArgs Empty = new ClientMobileIosArgs();

    /**
     * String
     * 
     */
    @Import(name="appBundleIdentifier")
    private @Nullable Output<String> appBundleIdentifier;

    /**
     * @return String
     * 
     */
    public Optional<Output<String>> appBundleIdentifier() {
        return Optional.ofNullable(this.appBundleIdentifier);
    }

    /**
     * String
     * 
     */
    @Import(name="teamId")
    private @Nullable Output<String> teamId;

    /**
     * @return String
     * 
     */
    public Optional<Output<String>> teamId() {
        return Optional.ofNullable(this.teamId);
    }

    private ClientMobileIosArgs() {}

    private ClientMobileIosArgs(ClientMobileIosArgs $) {
        this.appBundleIdentifier = $.appBundleIdentifier;
        this.teamId = $.teamId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientMobileIosArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientMobileIosArgs $;

        public Builder() {
            $ = new ClientMobileIosArgs();
        }

        public Builder(ClientMobileIosArgs defaults) {
            $ = new ClientMobileIosArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appBundleIdentifier String
         * 
         * @return builder
         * 
         */
        public Builder appBundleIdentifier(@Nullable Output<String> appBundleIdentifier) {
            $.appBundleIdentifier = appBundleIdentifier;
            return this;
        }

        /**
         * @param appBundleIdentifier String
         * 
         * @return builder
         * 
         */
        public Builder appBundleIdentifier(String appBundleIdentifier) {
            return appBundleIdentifier(Output.of(appBundleIdentifier));
        }

        /**
         * @param teamId String
         * 
         * @return builder
         * 
         */
        public Builder teamId(@Nullable Output<String> teamId) {
            $.teamId = teamId;
            return this;
        }

        /**
         * @param teamId String
         * 
         * @return builder
         * 
         */
        public Builder teamId(String teamId) {
            return teamId(Output.of(teamId));
        }

        public ClientMobileIosArgs build() {
            return $;
        }
    }

}