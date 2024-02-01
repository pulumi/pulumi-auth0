// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClientAddonZoom {
    /**
     * @return Zoom account name. Usually the first segment of your Zoom URL, for example `https://acme-org.zoom.us` would be `acme-org`.
     * 
     */
    private String account;

    private GetClientAddonZoom() {}
    /**
     * @return Zoom account name. Usually the first segment of your Zoom URL, for example `https://acme-org.zoom.us` would be `acme-org`.
     * 
     */
    public String account() {
        return this.account;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientAddonZoom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String account;
        public Builder() {}
        public Builder(GetClientAddonZoom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
        }

        @CustomType.Setter
        public Builder account(String account) {
            if (account == null) {
              throw new MissingRequiredPropertyException("GetClientAddonZoom", "account");
            }
            this.account = account;
            return this;
        }
        public GetClientAddonZoom build() {
            final var _resultValue = new GetClientAddonZoom();
            _resultValue.account = account;
            return _resultValue;
        }
    }
}
