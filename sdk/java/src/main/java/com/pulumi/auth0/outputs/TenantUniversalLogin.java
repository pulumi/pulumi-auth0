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
    private final @Nullable TenantUniversalLoginColors colors;

    @CustomType.Constructor
    private TenantUniversalLogin(@CustomType.Parameter("colors") @Nullable TenantUniversalLoginColors colors) {
        this.colors = colors;
    }

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

    public static final class Builder {
        private @Nullable TenantUniversalLoginColors colors;

        public Builder() {
    	      // Empty
        }

        public Builder(TenantUniversalLogin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.colors = defaults.colors;
        }

        public Builder colors(@Nullable TenantUniversalLoginColors colors) {
            this.colors = colors;
            return this;
        }        public TenantUniversalLogin build() {
            return new TenantUniversalLogin(colors);
        }
    }
}
