// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.ConnectionOptionsAttributePhoneNumberSignupVerificationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionOptionsAttributePhoneNumberSignupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionOptionsAttributePhoneNumberSignupArgs Empty = new ConnectionOptionsAttributePhoneNumberSignupArgs();

    /**
     * Defines status of signup for Phone Number attribute
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Defines status of signup for Phone Number attribute
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Defines verification settings for Phone Number attribute
     * 
     */
    @Import(name="verifications")
    private @Nullable Output<List<ConnectionOptionsAttributePhoneNumberSignupVerificationArgs>> verifications;

    /**
     * @return Defines verification settings for Phone Number attribute
     * 
     */
    public Optional<Output<List<ConnectionOptionsAttributePhoneNumberSignupVerificationArgs>>> verifications() {
        return Optional.ofNullable(this.verifications);
    }

    private ConnectionOptionsAttributePhoneNumberSignupArgs() {}

    private ConnectionOptionsAttributePhoneNumberSignupArgs(ConnectionOptionsAttributePhoneNumberSignupArgs $) {
        this.status = $.status;
        this.verifications = $.verifications;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionOptionsAttributePhoneNumberSignupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionOptionsAttributePhoneNumberSignupArgs $;

        public Builder() {
            $ = new ConnectionOptionsAttributePhoneNumberSignupArgs();
        }

        public Builder(ConnectionOptionsAttributePhoneNumberSignupArgs defaults) {
            $ = new ConnectionOptionsAttributePhoneNumberSignupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param status Defines status of signup for Phone Number attribute
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Defines status of signup for Phone Number attribute
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param verifications Defines verification settings for Phone Number attribute
         * 
         * @return builder
         * 
         */
        public Builder verifications(@Nullable Output<List<ConnectionOptionsAttributePhoneNumberSignupVerificationArgs>> verifications) {
            $.verifications = verifications;
            return this;
        }

        /**
         * @param verifications Defines verification settings for Phone Number attribute
         * 
         * @return builder
         * 
         */
        public Builder verifications(List<ConnectionOptionsAttributePhoneNumberSignupVerificationArgs> verifications) {
            return verifications(Output.of(verifications));
        }

        /**
         * @param verifications Defines verification settings for Phone Number attribute
         * 
         * @return builder
         * 
         */
        public Builder verifications(ConnectionOptionsAttributePhoneNumberSignupVerificationArgs... verifications) {
            return verifications(List.of(verifications));
        }

        public ConnectionOptionsAttributePhoneNumberSignupArgs build() {
            return $;
        }
    }

}
