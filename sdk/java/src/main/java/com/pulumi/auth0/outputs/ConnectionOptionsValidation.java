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
     * @return Specifies the `min` and `max` values of username length. `min` and `max` are integers.
     * 
     */
    private final @Nullable ConnectionOptionsValidationUsername username;

    @CustomType.Constructor
    private ConnectionOptionsValidation(@CustomType.Parameter("username") @Nullable ConnectionOptionsValidationUsername username) {
        this.username = username;
    }

    /**
     * @return Specifies the `min` and `max` values of username length. `min` and `max` are integers.
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

    public static final class Builder {
        private @Nullable ConnectionOptionsValidationUsername username;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionOptionsValidation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.username = defaults.username;
        }

        public Builder username(@Nullable ConnectionOptionsValidationUsername username) {
            this.username = username;
            return this;
        }        public ConnectionOptionsValidation build() {
            return new ConnectionOptionsValidation(username);
        }
    }
}
