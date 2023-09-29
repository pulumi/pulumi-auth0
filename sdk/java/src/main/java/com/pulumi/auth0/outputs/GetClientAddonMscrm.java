// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClientAddonMscrm {
    private String url;

    private GetClientAddonMscrm() {}
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
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public GetClientAddonMscrm build() {
            final var o = new GetClientAddonMscrm();
            o.url = url;
            return o;
        }
    }
}