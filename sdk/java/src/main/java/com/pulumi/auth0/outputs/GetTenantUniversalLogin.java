// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GetTenantUniversalLoginColor;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTenantUniversalLogin {
    private List<GetTenantUniversalLoginColor> colors;

    private GetTenantUniversalLogin() {}
    public List<GetTenantUniversalLoginColor> colors() {
        return this.colors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTenantUniversalLogin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetTenantUniversalLoginColor> colors;
        public Builder() {}
        public Builder(GetTenantUniversalLogin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colors = defaults.colors;
        }

        @CustomType.Setter
        public Builder colors(List<GetTenantUniversalLoginColor> colors) {
            this.colors = Objects.requireNonNull(colors);
            return this;
        }
        public Builder colors(GetTenantUniversalLoginColor... colors) {
            return colors(List.of(colors));
        }
        public GetTenantUniversalLogin build() {
            final var o = new GetTenantUniversalLogin();
            o.colors = colors;
            return o;
        }
    }
}