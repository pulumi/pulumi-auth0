// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.ConnectionOptionsAttributeEmailSignupVerificationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionOptionsAttributeEmailSignupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionOptionsAttributeEmailSignupArgs Empty = new ConnectionOptionsAttributeEmailSignupArgs();

    /**
     * Defines signup status for Email Attribute
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Defines signup status for Email Attribute
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Defines settings for Verification under Email attribute
     * 
     */
    @Import(name="verifications")
    private @Nullable Output<List<ConnectionOptionsAttributeEmailSignupVerificationArgs>> verifications;

    /**
     * @return Defines settings for Verification under Email attribute
     * 
     */
    public Optional<Output<List<ConnectionOptionsAttributeEmailSignupVerificationArgs>>> verifications() {
        return Optional.ofNullable(this.verifications);
    }

    private ConnectionOptionsAttributeEmailSignupArgs() {}

    private ConnectionOptionsAttributeEmailSignupArgs(ConnectionOptionsAttributeEmailSignupArgs $) {
        this.status = $.status;
        this.verifications = $.verifications;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionOptionsAttributeEmailSignupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionOptionsAttributeEmailSignupArgs $;

        public Builder() {
            $ = new ConnectionOptionsAttributeEmailSignupArgs();
        }

        public Builder(ConnectionOptionsAttributeEmailSignupArgs defaults) {
            $ = new ConnectionOptionsAttributeEmailSignupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param status Defines signup status for Email Attribute
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Defines signup status for Email Attribute
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param verifications Defines settings for Verification under Email attribute
         * 
         * @return builder
         * 
         */
        public Builder verifications(@Nullable Output<List<ConnectionOptionsAttributeEmailSignupVerificationArgs>> verifications) {
            $.verifications = verifications;
            return this;
        }

        /**
         * @param verifications Defines settings for Verification under Email attribute
         * 
         * @return builder
         * 
         */
        public Builder verifications(List<ConnectionOptionsAttributeEmailSignupVerificationArgs> verifications) {
            return verifications(Output.of(verifications));
        }

        /**
         * @param verifications Defines settings for Verification under Email attribute
         * 
         * @return builder
         * 
         */
        public Builder verifications(ConnectionOptionsAttributeEmailSignupVerificationArgs... verifications) {
            return verifications(List.of(verifications));
        }

        public ConnectionOptionsAttributeEmailSignupArgs build() {
            return $;
        }
    }

}
