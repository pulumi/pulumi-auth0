// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetConnectionOptionValidationUsername {
    private Integer max;
    private Integer min;

    private GetConnectionOptionValidationUsername() {}
    public Integer max() {
        return this.max;
    }
    public Integer min() {
        return this.min;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionOptionValidationUsername defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer max;
        private Integer min;
        public Builder() {}
        public Builder(GetConnectionOptionValidationUsername defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        @CustomType.Setter
        public Builder max(Integer max) {
            this.max = Objects.requireNonNull(max);
            return this;
        }
        @CustomType.Setter
        public Builder min(Integer min) {
            this.min = Objects.requireNonNull(min);
            return this;
        }
        public GetConnectionOptionValidationUsername build() {
            final var _resultValue = new GetConnectionOptionValidationUsername();
            _resultValue.max = max;
            _resultValue.min = min;
            return _resultValue;
        }
    }
}
