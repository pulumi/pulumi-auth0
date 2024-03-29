// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClientAddonEchosign {
    /**
     * @return Your custom domain found in your EchoSign URL, for example `https://acme-org.echosign.com` would be `acme-org`.
     * 
     */
    private String domain;

    private GetClientAddonEchosign() {}
    /**
     * @return Your custom domain found in your EchoSign URL, for example `https://acme-org.echosign.com` would be `acme-org`.
     * 
     */
    public String domain() {
        return this.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientAddonEchosign defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String domain;
        public Builder() {}
        public Builder(GetClientAddonEchosign defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
        }

        @CustomType.Setter
        public Builder domain(String domain) {
            if (domain == null) {
              throw new MissingRequiredPropertyException("GetClientAddonEchosign", "domain");
            }
            this.domain = domain;
            return this;
        }
        public GetClientAddonEchosign build() {
            final var _resultValue = new GetClientAddonEchosign();
            _resultValue.domain = domain;
            return _resultValue;
        }
    }
}
