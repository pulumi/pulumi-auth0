// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetOrganizationBranding {
    /**
     * @return Color scheme used to customize the login pages.
     * 
     */
    private Map<String,String> colors;
    /**
     * @return URL of logo to display on login page.
     * 
     */
    private String logoUrl;

    private GetOrganizationBranding() {}
    /**
     * @return Color scheme used to customize the login pages.
     * 
     */
    public Map<String,String> colors() {
        return this.colors;
    }
    /**
     * @return URL of logo to display on login page.
     * 
     */
    public String logoUrl() {
        return this.logoUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationBranding defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> colors;
        private String logoUrl;
        public Builder() {}
        public Builder(GetOrganizationBranding defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colors = defaults.colors;
    	      this.logoUrl = defaults.logoUrl;
        }

        @CustomType.Setter
        public Builder colors(Map<String,String> colors) {
            if (colors == null) {
              throw new MissingRequiredPropertyException("GetOrganizationBranding", "colors");
            }
            this.colors = colors;
            return this;
        }
        @CustomType.Setter
        public Builder logoUrl(String logoUrl) {
            if (logoUrl == null) {
              throw new MissingRequiredPropertyException("GetOrganizationBranding", "logoUrl");
            }
            this.logoUrl = logoUrl;
            return this;
        }
        public GetOrganizationBranding build() {
            final var _resultValue = new GetOrganizationBranding();
            _resultValue.colors = colors;
            _resultValue.logoUrl = logoUrl;
            return _resultValue;
        }
    }
}
