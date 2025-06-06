// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTenantErrorPage {
    /**
     * @return Custom Error HTML (Liquid syntax is supported)
     * 
     */
    private String html;
    /**
     * @return Whether to show the link to log as part of the default error page (true, default) or not to show the link (false).
     * 
     */
    private Boolean showLogLink;
    /**
     * @return URL to redirect to when an error occurs instead of showing the default error page
     * 
     */
    private String url;

    private GetTenantErrorPage() {}
    /**
     * @return Custom Error HTML (Liquid syntax is supported)
     * 
     */
    public String html() {
        return this.html;
    }
    /**
     * @return Whether to show the link to log as part of the default error page (true, default) or not to show the link (false).
     * 
     */
    public Boolean showLogLink() {
        return this.showLogLink;
    }
    /**
     * @return URL to redirect to when an error occurs instead of showing the default error page
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTenantErrorPage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String html;
        private Boolean showLogLink;
        private String url;
        public Builder() {}
        public Builder(GetTenantErrorPage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.html = defaults.html;
    	      this.showLogLink = defaults.showLogLink;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder html(String html) {
            if (html == null) {
              throw new MissingRequiredPropertyException("GetTenantErrorPage", "html");
            }
            this.html = html;
            return this;
        }
        @CustomType.Setter
        public Builder showLogLink(Boolean showLogLink) {
            if (showLogLink == null) {
              throw new MissingRequiredPropertyException("GetTenantErrorPage", "showLogLink");
            }
            this.showLogLink = showLogLink;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetTenantErrorPage", "url");
            }
            this.url = url;
            return this;
        }
        public GetTenantErrorPage build() {
            final var _resultValue = new GetTenantErrorPage();
            _resultValue.html = html;
            _resultValue.showLogLink = showLogLink;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
