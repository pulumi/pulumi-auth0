// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.TenantUniversalLoginColors;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TenantUniversalLogin {
    /**
     * @return List(Resource). Configuration settings for Universal Login colors. See Universal Login - Colors.
     * 
     */
    private @Nullable TenantUniversalLoginColors colors;

    private TenantUniversalLogin() {}
    /**
     * @return List(Resource). Configuration settings for Universal Login colors. See Universal Login - Colors.
     * 
     */
    public Optional<TenantUniversalLoginColors> colors() {
        return Optional.ofNullable(this.colors);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TenantUniversalLogin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable TenantUniversalLoginColors colors;
        public Builder() {}
        public Builder(TenantUniversalLogin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colors = defaults.colors;
        }

        @CustomType.Setter
        public Builder colors(@Nullable TenantUniversalLoginColors colors) {
            this.colors = colors;
            return this;
        }
        public TenantUniversalLogin build() {
            final var o = new TenantUniversalLogin();
            o.colors = colors;
            return o;
        }
    }
}