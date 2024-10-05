// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.ConnectionOptionsAttributeEmailIdentifier;
import com.pulumi.auth0.outputs.ConnectionOptionsAttributeEmailSignup;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
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
        public Builder() {}
        public Builder(ConnectionOptionsAttributeEmail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifiers = defaults.identifiers;
    	      this.profileRequired = defaults.profileRequired;
    	      this.signups = defaults.signups;
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
        public ConnectionOptionsAttributeEmail build() {
            final var _resultValue = new ConnectionOptionsAttributeEmail();
            _resultValue.identifiers = identifiers;
            _resultValue.profileRequired = profileRequired;
            _resultValue.signups = signups;
            return _resultValue;
        }
    }
}