// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionOptionsAttributeUsernameValidationAllowedType {
    /**
     * @return One of the allowed types for UserName signup attribute
     * 
     */
    private @Nullable Boolean email;
    /**
     * @return One of the allowed types for UserName signup attribute
     * 
     */
    private @Nullable Boolean phoneNumber;

    private ConnectionOptionsAttributeUsernameValidationAllowedType() {}
    /**
     * @return One of the allowed types for UserName signup attribute
     * 
     */
    public Optional<Boolean> email() {
        return Optional.ofNullable(this.email);
    }
    /**
     * @return One of the allowed types for UserName signup attribute
     * 
     */
    public Optional<Boolean> phoneNumber() {
        return Optional.ofNullable(this.phoneNumber);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionOptionsAttributeUsernameValidationAllowedType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean email;
        private @Nullable Boolean phoneNumber;
        public Builder() {}
        public Builder(ConnectionOptionsAttributeUsernameValidationAllowedType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.phoneNumber = defaults.phoneNumber;
        }

        @CustomType.Setter
        public Builder email(@Nullable Boolean email) {

            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder phoneNumber(@Nullable Boolean phoneNumber) {

            this.phoneNumber = phoneNumber;
            return this;
        }
        public ConnectionOptionsAttributeUsernameValidationAllowedType build() {
            final var _resultValue = new ConnectionOptionsAttributeUsernameValidationAllowedType();
            _resultValue.email = email;
            _resultValue.phoneNumber = phoneNumber;
            return _resultValue;
        }
    }
}