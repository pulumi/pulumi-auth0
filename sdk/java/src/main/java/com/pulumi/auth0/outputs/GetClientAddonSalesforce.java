// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClientAddonSalesforce {
    private String entityId;

    private GetClientAddonSalesforce() {}
    public String entityId() {
        return this.entityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientAddonSalesforce defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String entityId;
        public Builder() {}
        public Builder(GetClientAddonSalesforce defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityId = defaults.entityId;
        }

        @CustomType.Setter
        public Builder entityId(String entityId) {
            this.entityId = Objects.requireNonNull(entityId);
            return this;
        }
        public GetClientAddonSalesforce build() {
            final var o = new GetClientAddonSalesforce();
            o.entityId = entityId;
            return o;
        }
    }
}