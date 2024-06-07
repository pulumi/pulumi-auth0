// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BrandingThemeFontsLinks {
    /**
     * @return Links bold. Defaults to `true`.
     * 
     */
    private @Nullable Boolean bold;
    /**
     * @return Links size. Value needs to be between `0` and `150`. Defaults to `87.5`.
     * 
     */
    private @Nullable Double size;

    private BrandingThemeFontsLinks() {}
    /**
     * @return Links bold. Defaults to `true`.
     * 
     */
    public Optional<Boolean> bold() {
        return Optional.ofNullable(this.bold);
    }
    /**
     * @return Links size. Value needs to be between `0` and `150`. Defaults to `87.5`.
     * 
     */
    public Optional<Double> size() {
        return Optional.ofNullable(this.size);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrandingThemeFontsLinks defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean bold;
        private @Nullable Double size;
        public Builder() {}
        public Builder(BrandingThemeFontsLinks defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bold = defaults.bold;
    	      this.size = defaults.size;
        }

        @CustomType.Setter
        public Builder bold(@Nullable Boolean bold) {

            this.bold = bold;
            return this;
        }
        @CustomType.Setter
        public Builder size(@Nullable Double size) {

            this.size = size;
            return this;
        }
        public BrandingThemeFontsLinks build() {
            final var _resultValue = new BrandingThemeFontsLinks();
            _resultValue.bold = bold;
            _resultValue.size = size;
            return _resultValue;
        }
    }
}
