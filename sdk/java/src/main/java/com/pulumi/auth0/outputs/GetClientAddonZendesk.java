// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClientAddonZendesk {
    /**
     * @return Zendesk account name. Usually the first segment in your Zendesk URL, for example `https://acme-org.zendesk.com` would be `acme-org`.
     * 
     */
    private String accountName;

    private GetClientAddonZendesk() {}
    /**
     * @return Zendesk account name. Usually the first segment in your Zendesk URL, for example `https://acme-org.zendesk.com` would be `acme-org`.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientAddonZendesk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountName;
        public Builder() {}
        public Builder(GetClientAddonZendesk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
        }

        @CustomType.Setter
        public Builder accountName(String accountName) {
            if (accountName == null) {
              throw new MissingRequiredPropertyException("GetClientAddonZendesk", "accountName");
            }
            this.accountName = accountName;
            return this;
        }
        public GetClientAddonZendesk build() {
            final var _resultValue = new GetClientAddonZendesk();
            _resultValue.accountName = accountName;
            return _resultValue;
        }
    }
}
