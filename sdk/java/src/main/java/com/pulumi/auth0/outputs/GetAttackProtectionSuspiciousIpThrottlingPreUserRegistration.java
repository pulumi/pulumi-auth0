// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetAttackProtectionSuspiciousIpThrottlingPreUserRegistration {
    private Integer maxAttempts;
    private Integer rate;

    private GetAttackProtectionSuspiciousIpThrottlingPreUserRegistration() {}
    public Integer maxAttempts() {
        return this.maxAttempts;
    }
    public Integer rate() {
        return this.rate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAttackProtectionSuspiciousIpThrottlingPreUserRegistration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer maxAttempts;
        private Integer rate;
        public Builder() {}
        public Builder(GetAttackProtectionSuspiciousIpThrottlingPreUserRegistration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxAttempts = defaults.maxAttempts;
    	      this.rate = defaults.rate;
        }

        @CustomType.Setter
        public Builder maxAttempts(Integer maxAttempts) {
            if (maxAttempts == null) {
              throw new MissingRequiredPropertyException("GetAttackProtectionSuspiciousIpThrottlingPreUserRegistration", "maxAttempts");
            }
            this.maxAttempts = maxAttempts;
            return this;
        }
        @CustomType.Setter
        public Builder rate(Integer rate) {
            if (rate == null) {
              throw new MissingRequiredPropertyException("GetAttackProtectionSuspiciousIpThrottlingPreUserRegistration", "rate");
            }
            this.rate = rate;
            return this;
        }
        public GetAttackProtectionSuspiciousIpThrottlingPreUserRegistration build() {
            final var _resultValue = new GetAttackProtectionSuspiciousIpThrottlingPreUserRegistration();
            _resultValue.maxAttempts = maxAttempts;
            _resultValue.rate = rate;
            return _resultValue;
        }
    }
}
