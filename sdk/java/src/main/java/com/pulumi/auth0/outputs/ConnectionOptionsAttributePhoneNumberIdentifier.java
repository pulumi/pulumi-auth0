// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionOptionsAttributePhoneNumberIdentifier {
    /**
     * @return Defines whether Phone Number attribute is active as an identifier
     * 
     */
    private @Nullable Boolean active;

    private ConnectionOptionsAttributePhoneNumberIdentifier() {}
    /**
     * @return Defines whether Phone Number attribute is active as an identifier
     * 
     */
    public Optional<Boolean> active() {
        return Optional.ofNullable(this.active);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionOptionsAttributePhoneNumberIdentifier defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean active;
        public Builder() {}
        public Builder(ConnectionOptionsAttributePhoneNumberIdentifier defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
        }

        @CustomType.Setter
        public Builder active(@Nullable Boolean active) {

            this.active = active;
            return this;
        }
        public ConnectionOptionsAttributePhoneNumberIdentifier build() {
            final var _resultValue = new ConnectionOptionsAttributePhoneNumberIdentifier();
            _resultValue.active = active;
            return _resultValue;
        }
    }
}