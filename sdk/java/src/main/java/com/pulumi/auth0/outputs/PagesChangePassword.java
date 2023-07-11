// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PagesChangePassword {
    /**
     * @return Indicates whether to use the custom Reset Password HTML (`true`) or the default Auth0 page (`false`).
     * 
     */
    private Boolean enabled;
    /**
     * @return Customized content for the Reset Password page. HTML format with supported [Liquid syntax](https://github.com/Shopify/liquid/wiki/Liquid-for-Designers).
     * 
     */
    private String html;

    private PagesChangePassword() {}
    /**
     * @return Indicates whether to use the custom Reset Password HTML (`true`) or the default Auth0 page (`false`).
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return Customized content for the Reset Password page. HTML format with supported [Liquid syntax](https://github.com/Shopify/liquid/wiki/Liquid-for-Designers).
     * 
     */
    public String html() {
        return this.html;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PagesChangePassword defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private String html;
        public Builder() {}
        public Builder(PagesChangePassword defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.html = defaults.html;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder html(String html) {
            this.html = Objects.requireNonNull(html);
            return this;
        }
        public PagesChangePassword build() {
            final var o = new PagesChangePassword();
            o.enabled = enabled;
            o.html = html;
            return o;
        }
    }
}
