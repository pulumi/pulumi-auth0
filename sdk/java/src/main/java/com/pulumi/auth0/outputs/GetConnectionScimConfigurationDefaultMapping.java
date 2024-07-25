// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionScimConfigurationDefaultMapping {
    /**
     * @return The field location in the Auth0 schema.
     * 
     */
    private String auth0;
    /**
     * @return The field location in the SCIM schema.
     * 
     */
    private String scim;

    private GetConnectionScimConfigurationDefaultMapping() {}
    /**
     * @return The field location in the Auth0 schema.
     * 
     */
    public String auth0() {
        return this.auth0;
    }
    /**
     * @return The field location in the SCIM schema.
     * 
     */
    public String scim() {
        return this.scim;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionScimConfigurationDefaultMapping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String auth0;
        private String scim;
        public Builder() {}
        public Builder(GetConnectionScimConfigurationDefaultMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth0 = defaults.auth0;
    	      this.scim = defaults.scim;
        }

        @CustomType.Setter
        public Builder auth0(String auth0) {
            if (auth0 == null) {
              throw new MissingRequiredPropertyException("GetConnectionScimConfigurationDefaultMapping", "auth0");
            }
            this.auth0 = auth0;
            return this;
        }
        @CustomType.Setter
        public Builder scim(String scim) {
            if (scim == null) {
              throw new MissingRequiredPropertyException("GetConnectionScimConfigurationDefaultMapping", "scim");
            }
            this.scim = scim;
            return this;
        }
        public GetConnectionScimConfigurationDefaultMapping build() {
            final var _resultValue = new GetConnectionScimConfigurationDefaultMapping();
            _resultValue.auth0 = auth0;
            _resultValue.scim = scim;
            return _resultValue;
        }
    }
}