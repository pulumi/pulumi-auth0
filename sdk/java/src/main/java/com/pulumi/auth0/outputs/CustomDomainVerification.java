// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CustomDomainVerification {
    /**
     * @return Verification methods for the domain.
     * 
     */
    private @Nullable List<Object> methods;

    private CustomDomainVerification() {}
    /**
     * @return Verification methods for the domain.
     * 
     */
    public List<Object> methods() {
        return this.methods == null ? List.of() : this.methods;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDomainVerification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<Object> methods;
        public Builder() {}
        public Builder(CustomDomainVerification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methods = defaults.methods;
        }

        @CustomType.Setter
        public Builder methods(@Nullable List<Object> methods) {

            this.methods = methods;
            return this;
        }
        public Builder methods(Object... methods) {
            return methods(List.of(methods));
        }
        public CustomDomainVerification build() {
            final var _resultValue = new CustomDomainVerification();
            _resultValue.methods = methods;
            return _resultValue;
        }
    }
}
