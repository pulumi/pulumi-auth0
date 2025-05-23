// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.ConnectionOptionsAttributeEmailIdentifier;
import com.pulumi.auth0.outputs.ConnectionOptionsAttributeEmailSignup;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionOptionsAttributeEmail {
    /**
     * @return Connection Options Email Attribute Identifier
     * 
     */
    private @Nullable List<ConnectionOptionsAttributeEmailIdentifier> identifiers;
    /**
     * @return Defines whether Profile is required
     * 
     */
    private @Nullable Boolean profileRequired;
    /**
     * @return Defines signup settings for Email attribute
     * 
     */
    private @Nullable List<ConnectionOptionsAttributeEmailSignup> signups;
    /**
     * @return Defines whether whether user will receive a link or an OTP during user signup for email verification and password reset for email verification
     * 
     */
    private @Nullable String verificationMethod;

    private ConnectionOptionsAttributeEmail() {}
    /**
     * @return Connection Options Email Attribute Identifier
     * 
     */
    public List<ConnectionOptionsAttributeEmailIdentifier> identifiers() {
        return this.identifiers == null ? List.of() : this.identifiers;
    }
    /**
     * @return Defines whether Profile is required
     * 
     */
    public Optional<Boolean> profileRequired() {
        return Optional.ofNullable(this.profileRequired);
    }
    /**
     * @return Defines signup settings for Email attribute
     * 
     */
    public List<ConnectionOptionsAttributeEmailSignup> signups() {
        return this.signups == null ? List.of() : this.signups;
    }
    /**
     * @return Defines whether whether user will receive a link or an OTP during user signup for email verification and password reset for email verification
     * 
     */
    public Optional<String> verificationMethod() {
        return Optional.ofNullable(this.verificationMethod);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionOptionsAttributeEmail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ConnectionOptionsAttributeEmailIdentifier> identifiers;
        private @Nullable Boolean profileRequired;
        private @Nullable List<ConnectionOptionsAttributeEmailSignup> signups;
        private @Nullable String verificationMethod;
        public Builder() {}
        public Builder(ConnectionOptionsAttributeEmail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifiers = defaults.identifiers;
    	      this.profileRequired = defaults.profileRequired;
    	      this.signups = defaults.signups;
    	      this.verificationMethod = defaults.verificationMethod;
        }

        @CustomType.Setter
        public Builder identifiers(@Nullable List<ConnectionOptionsAttributeEmailIdentifier> identifiers) {

            this.identifiers = identifiers;
            return this;
        }
        public Builder identifiers(ConnectionOptionsAttributeEmailIdentifier... identifiers) {
            return identifiers(List.of(identifiers));
        }
        @CustomType.Setter
        public Builder profileRequired(@Nullable Boolean profileRequired) {

            this.profileRequired = profileRequired;
            return this;
        }
        @CustomType.Setter
        public Builder signups(@Nullable List<ConnectionOptionsAttributeEmailSignup> signups) {

            this.signups = signups;
            return this;
        }
        public Builder signups(ConnectionOptionsAttributeEmailSignup... signups) {
            return signups(List.of(signups));
        }
        @CustomType.Setter
        public Builder verificationMethod(@Nullable String verificationMethod) {

            this.verificationMethod = verificationMethod;
            return this;
        }
        public ConnectionOptionsAttributeEmail build() {
            final var _resultValue = new ConnectionOptionsAttributeEmail();
            _resultValue.identifiers = identifiers;
            _resultValue.profileRequired = profileRequired;
            _resultValue.signups = signups;
            _resultValue.verificationMethod = verificationMethod;
            return _resultValue;
        }
    }
}
