// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResourceServerAuthorizationDetail {
    /**
     * @return Disable authorization details.
     * 
     */
    private Boolean disable;
    /**
     * @return Type of authorization details.
     * 
     */
    private String type;

    private GetResourceServerAuthorizationDetail() {}
    /**
     * @return Disable authorization details.
     * 
     */
    public Boolean disable() {
        return this.disable;
    }
    /**
     * @return Type of authorization details.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceServerAuthorizationDetail defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean disable;
        private String type;
        public Builder() {}
        public Builder(GetResourceServerAuthorizationDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disable = defaults.disable;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder disable(Boolean disable) {
            if (disable == null) {
              throw new MissingRequiredPropertyException("GetResourceServerAuthorizationDetail", "disable");
            }
            this.disable = disable;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetResourceServerAuthorizationDetail", "type");
            }
            this.type = type;
            return this;
        }
        public GetResourceServerAuthorizationDetail build() {
            final var _resultValue = new GetResourceServerAuthorizationDetail();
            _resultValue.disable = disable;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
