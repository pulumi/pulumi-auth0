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
public final class BrandingThemeFontsInputLabels {
    /**
     * @return Input labels bold. Defaults to `false`.
     * 
     */
    private @Nullable Boolean bold;
    /**
     * @return Input labels size. Value needs to be between `0` and `150`. Defaults to `100.0`.
     * 
     */
    private @Nullable Double size;

    private BrandingThemeFontsInputLabels() {}
    /**
     * @return Input labels bold. Defaults to `false`.
     * 
     */
    public Optional<Boolean> bold() {
        return Optional.ofNullable(this.bold);
    }
    /**
     * @return Input labels size. Value needs to be between `0` and `150`. Defaults to `100.0`.
     * 
     */
    public Optional<Double> size() {
        return Optional.ofNullable(this.size);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrandingThemeFontsInputLabels defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean bold;
        private @Nullable Double size;
        public Builder() {}
        public Builder(BrandingThemeFontsInputLabels defaults) {
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
        public BrandingThemeFontsInputLabels build() {
            final var _resultValue = new BrandingThemeFontsInputLabels();
            _resultValue.bold = bold;
            _resultValue.size = size;
            return _resultValue;
        }
    }
}
