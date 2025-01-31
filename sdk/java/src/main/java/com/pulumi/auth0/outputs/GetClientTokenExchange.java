// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClientTokenExchange {
    /**
     * @return List of allowed profile types for token exchange
     * 
     */
    private List<String> allowAnyProfileOfTypes;

    private GetClientTokenExchange() {}
    /**
     * @return List of allowed profile types for token exchange
     * 
     */
    public List<String> allowAnyProfileOfTypes() {
        return this.allowAnyProfileOfTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientTokenExchange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowAnyProfileOfTypes;
        public Builder() {}
        public Builder(GetClientTokenExchange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAnyProfileOfTypes = defaults.allowAnyProfileOfTypes;
        }

        @CustomType.Setter
        public Builder allowAnyProfileOfTypes(List<String> allowAnyProfileOfTypes) {
            if (allowAnyProfileOfTypes == null) {
              throw new MissingRequiredPropertyException("GetClientTokenExchange", "allowAnyProfileOfTypes");
            }
            this.allowAnyProfileOfTypes = allowAnyProfileOfTypes;
            return this;
        }
        public Builder allowAnyProfileOfTypes(String... allowAnyProfileOfTypes) {
            return allowAnyProfileOfTypes(List.of(allowAnyProfileOfTypes));
        }
        public GetClientTokenExchange build() {
            final var _resultValue = new GetClientTokenExchange();
            _resultValue.allowAnyProfileOfTypes = allowAnyProfileOfTypes;
            return _resultValue;
        }
    }
}
