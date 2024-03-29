// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.ConnectionOptionsValidationUsername;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionOptionsValidation {
    /**
     * @return Specifies the `min` and `max` values of username length.
     * 
     */
    private @Nullable ConnectionOptionsValidationUsername username;

    private ConnectionOptionsValidation() {}
    /**
     * @return Specifies the `min` and `max` values of username length.
     * 
     */
    public Optional<ConnectionOptionsValidationUsername> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionOptionsValidation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ConnectionOptionsValidationUsername username;
        public Builder() {}
        public Builder(ConnectionOptionsValidation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder username(@Nullable ConnectionOptionsValidationUsername username) {

            this.username = username;
            return this;
        }
        public ConnectionOptionsValidation build() {
            final var _resultValue = new ConnectionOptionsValidation();
            _resultValue.username = username;
            return _resultValue;
        }
    }
}
