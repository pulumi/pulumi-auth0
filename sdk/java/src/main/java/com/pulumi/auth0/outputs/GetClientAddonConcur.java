// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GetClientAddonConcur {
    private GetClientAddonConcur() {}

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientAddonConcur defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        public Builder() {}
        public Builder(GetClientAddonConcur defaults) {
    	      Objects.requireNonNull(defaults);
        }

        public GetClientAddonConcur build() {
            final var o = new GetClientAddonConcur();
            return o;
        }
    }
}