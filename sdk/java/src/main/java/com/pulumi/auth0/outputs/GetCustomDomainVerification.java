// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Object;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCustomDomainVerification {
    /**
     * @return Verification methods for the domain.
     * 
     */
    private List<Object> methods;

    private GetCustomDomainVerification() {}
    /**
     * @return Verification methods for the domain.
     * 
     */
    public List<Object> methods() {
        return this.methods;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomDomainVerification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<Object> methods;
        public Builder() {}
        public Builder(GetCustomDomainVerification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methods = defaults.methods;
        }

        @CustomType.Setter
        public Builder methods(List<Object> methods) {
            if (methods == null) {
              throw new MissingRequiredPropertyException("GetCustomDomainVerification", "methods");
            }
            this.methods = methods;
            return this;
        }
        public Builder methods(Object... methods) {
            return methods(List.of(methods));
        }
        public GetCustomDomainVerification build() {
            final var _resultValue = new GetCustomDomainVerification();
            _resultValue.methods = methods;
            return _resultValue;
        }
    }
}
