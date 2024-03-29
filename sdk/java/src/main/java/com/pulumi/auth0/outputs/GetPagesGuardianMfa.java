// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPagesGuardianMfa {
    /**
     * @return Indicates whether to use the custom Guardian MFA HTML (`true`) or the default Auth0 page (`false`).
     * 
     */
    private Boolean enabled;
    /**
     * @return Customized content for the Guardian MFA page. HTML format with supported [Liquid syntax](https://github.com/Shopify/liquid/wiki/Liquid-for-Designers).
     * 
     */
    private String html;

    private GetPagesGuardianMfa() {}
    /**
     * @return Indicates whether to use the custom Guardian MFA HTML (`true`) or the default Auth0 page (`false`).
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Customized content for the Guardian MFA page. HTML format with supported [Liquid syntax](https://github.com/Shopify/liquid/wiki/Liquid-for-Designers).
     * 
     */
    public String html() {
        return this.html;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPagesGuardianMfa defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String html;
        public Builder() {}
        public Builder(GetPagesGuardianMfa defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.html = defaults.html;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            if (enabled == null) {
              throw new MissingRequiredPropertyException("GetPagesGuardianMfa", "enabled");
            }
            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder html(String html) {
            if (html == null) {
              throw new MissingRequiredPropertyException("GetPagesGuardianMfa", "html");
            }
            this.html = html;
            return this;
        }
        public GetPagesGuardianMfa build() {
            final var _resultValue = new GetPagesGuardianMfa();
            _resultValue.enabled = enabled;
            _resultValue.html = html;
            return _resultValue;
        }
    }
}
