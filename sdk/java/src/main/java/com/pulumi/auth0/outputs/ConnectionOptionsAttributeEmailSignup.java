// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.ConnectionOptionsAttributeEmailSignupVerification;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionOptionsAttributeEmailSignup {
    /**
     * @return Defines signup status for Email Attribute
     * 
     */
    private @Nullable String status;
    /**
     * @return Defines settings for Verification under Email attribute
     * 
     */
    private @Nullable List<ConnectionOptionsAttributeEmailSignupVerification> verifications;

    private ConnectionOptionsAttributeEmailSignup() {}
    /**
     * @return Defines signup status for Email Attribute
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return Defines settings for Verification under Email attribute
     * 
     */
    public List<ConnectionOptionsAttributeEmailSignupVerification> verifications() {
        return this.verifications == null ? List.of() : this.verifications;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionOptionsAttributeEmailSignup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String status;
        private @Nullable List<ConnectionOptionsAttributeEmailSignupVerification> verifications;
        public Builder() {}
        public Builder(ConnectionOptionsAttributeEmailSignup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.verifications = defaults.verifications;
        }

        @CustomType.Setter
        public Builder status(@Nullable String status) {

            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder verifications(@Nullable List<ConnectionOptionsAttributeEmailSignupVerification> verifications) {

            this.verifications = verifications;
            return this;
        }
        public Builder verifications(ConnectionOptionsAttributeEmailSignupVerification... verifications) {
            return verifications(List.of(verifications));
        }
        public ConnectionOptionsAttributeEmailSignup build() {
            final var _resultValue = new ConnectionOptionsAttributeEmailSignup();
            _resultValue.status = status;
            _resultValue.verifications = verifications;
            return _resultValue;
        }
    }
}
