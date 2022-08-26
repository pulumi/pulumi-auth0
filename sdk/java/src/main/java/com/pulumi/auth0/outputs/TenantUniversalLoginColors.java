// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TenantUniversalLoginColors {
    /**
     * @return String, Hexadecimal. Background color of login pages.
     * 
     */
    private @Nullable String pageBackground;
    /**
     * @return String, Hexadecimal. Primary button background color.
     * 
     */
    private @Nullable String primary;

    private TenantUniversalLoginColors() {}
    /**
     * @return String, Hexadecimal. Background color of login pages.
     * 
     */
    public Optional<String> pageBackground() {
        return Optional.ofNullable(this.pageBackground);
    }
    /**
     * @return String, Hexadecimal. Primary button background color.
     * 
     */
    public Optional<String> primary() {
        return Optional.ofNullable(this.primary);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TenantUniversalLoginColors defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String pageBackground;
        private @Nullable String primary;
        public Builder() {}
        public Builder(TenantUniversalLoginColors defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pageBackground = defaults.pageBackground;
    	      this.primary = defaults.primary;
        }

        @CustomType.Setter
        public Builder pageBackground(@Nullable String pageBackground) {
            this.pageBackground = pageBackground;
            return this;
        }
        @CustomType.Setter
        public Builder primary(@Nullable String primary) {
            this.primary = primary;
            return this;
        }
        public TenantUniversalLoginColors build() {
            final var o = new TenantUniversalLoginColors();
            o.pageBackground = pageBackground;
            o.primary = primary;
            return o;
        }
    }
}
