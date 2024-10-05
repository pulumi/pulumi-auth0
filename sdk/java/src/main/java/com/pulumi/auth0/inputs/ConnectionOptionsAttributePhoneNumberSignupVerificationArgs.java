// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionOptionsAttributePhoneNumberSignupVerificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionOptionsAttributePhoneNumberSignupVerificationArgs Empty = new ConnectionOptionsAttributePhoneNumberSignupVerificationArgs();

    /**
     * Defines verification settings for Phone Number attribute
     * 
     */
    @Import(name="active")
    private @Nullable Output<Boolean> active;

    /**
     * @return Defines verification settings for Phone Number attribute
     * 
     */
    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
    }

    private ConnectionOptionsAttributePhoneNumberSignupVerificationArgs() {}

    private ConnectionOptionsAttributePhoneNumberSignupVerificationArgs(ConnectionOptionsAttributePhoneNumberSignupVerificationArgs $) {
        this.active = $.active;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionOptionsAttributePhoneNumberSignupVerificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionOptionsAttributePhoneNumberSignupVerificationArgs $;

        public Builder() {
            $ = new ConnectionOptionsAttributePhoneNumberSignupVerificationArgs();
        }

        public Builder(ConnectionOptionsAttributePhoneNumberSignupVerificationArgs defaults) {
            $ = new ConnectionOptionsAttributePhoneNumberSignupVerificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param active Defines verification settings for Phone Number attribute
         * 
         * @return builder
         * 
         */
        public Builder active(@Nullable Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active Defines verification settings for Phone Number attribute
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        public ConnectionOptionsAttributePhoneNumberSignupVerificationArgs build() {
            return $;
        }
    }

}