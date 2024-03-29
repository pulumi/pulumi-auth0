// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClientAddonMscrm {
    /**
     * @return Microsoft Dynamics CRM application URL.
     * 
     */
    private String url;

    private GetClientAddonMscrm() {}
    /**
     * @return Microsoft Dynamics CRM application URL.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientAddonMscrm defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String url;
        public Builder() {}
        public Builder(GetClientAddonMscrm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder url(String url) {
            if (url == null) {
              throw new MissingRequiredPropertyException("GetClientAddonMscrm", "url");
            }
            this.url = url;
            return this;
        }
        public GetClientAddonMscrm build() {
            final var _resultValue = new GetClientAddonMscrm();
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
