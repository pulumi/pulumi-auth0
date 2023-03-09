// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTenantUniversalLoginColor {
    private String pageBackground;
    private String primary;

    private GetTenantUniversalLoginColor() {}
    public String pageBackground() {
        return this.pageBackground;
    }
    public String primary() {
        return this.primary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTenantUniversalLoginColor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String pageBackground;
        private String primary;
        public Builder() {}
        public Builder(GetTenantUniversalLoginColor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pageBackground = defaults.pageBackground;
    	      this.primary = defaults.primary;
        }

        @CustomType.Setter
        public Builder pageBackground(String pageBackground) {
            this.pageBackground = Objects.requireNonNull(pageBackground);
            return this;
        }
        @CustomType.Setter
        public Builder primary(String primary) {
            this.primary = Objects.requireNonNull(primary);
            return this;
        }
        public GetTenantUniversalLoginColor build() {
            final var o = new GetTenantUniversalLoginColor();
            o.pageBackground = pageBackground;
            o.primary = primary;
            return o;
        }
    }
}