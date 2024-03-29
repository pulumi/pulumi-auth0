// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClientAddonSamlpLogout {
    /**
     * @return The service provider (client application)&#39;s Single Logout Service URL, where Auth0 will send logout requests and responses.
     * 
     */
    private String callback;
    /**
     * @return Controls whether Auth0 should notify service providers of session termination.
     * 
     */
    private Boolean sloEnabled;

    private GetClientAddonSamlpLogout() {}
    /**
     * @return The service provider (client application)&#39;s Single Logout Service URL, where Auth0 will send logout requests and responses.
     * 
     */
    public String callback() {
        return this.callback;
    }
    /**
     * @return Controls whether Auth0 should notify service providers of session termination.
     * 
     */
    public Boolean sloEnabled() {
        return this.sloEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientAddonSamlpLogout defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String callback;
        private Boolean sloEnabled;
        public Builder() {}
        public Builder(GetClientAddonSamlpLogout defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.callback = defaults.callback;
    	      this.sloEnabled = defaults.sloEnabled;
        }

        @CustomType.Setter
        public Builder callback(String callback) {
            if (callback == null) {
              throw new MissingRequiredPropertyException("GetClientAddonSamlpLogout", "callback");
            }
            this.callback = callback;
            return this;
        }
        @CustomType.Setter
        public Builder sloEnabled(Boolean sloEnabled) {
            if (sloEnabled == null) {
              throw new MissingRequiredPropertyException("GetClientAddonSamlpLogout", "sloEnabled");
            }
            this.sloEnabled = sloEnabled;
            return this;
        }
        public GetClientAddonSamlpLogout build() {
            final var _resultValue = new GetClientAddonSamlpLogout();
            _resultValue.callback = callback;
            _resultValue.sloEnabled = sloEnabled;
            return _resultValue;
        }
    }
}
