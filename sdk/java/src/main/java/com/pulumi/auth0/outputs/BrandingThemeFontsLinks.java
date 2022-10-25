// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class BrandingThemeFontsLinks {
    private Boolean bold;
    private Double size;

    private BrandingThemeFontsLinks() {}
    public Boolean bold() {
        return this.bold;
    }
    public Double size() {
        return this.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrandingThemeFontsLinks defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean bold;
        private Double size;
        public Builder() {}
        public Builder(BrandingThemeFontsLinks defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bold = defaults.bold;
    	      this.size = defaults.size;
        }

        @CustomType.Setter
        public Builder bold(Boolean bold) {
            this.bold = Objects.requireNonNull(bold);
            return this;
        }
        @CustomType.Setter
        public Builder size(Double size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public BrandingThemeFontsLinks build() {
            final var o = new BrandingThemeFontsLinks();
            o.bold = bold;
            o.size = size;
            return o;
        }
    }
}