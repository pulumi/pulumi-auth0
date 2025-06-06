// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TenantMtls {
    /**
     * @return Disable mTLS settings.
     * 
     */
    private @Nullable Boolean disable;
    /**
     * @return Enable mTLS endpoint aliases.
     * 
     */
    private @Nullable Boolean enableEndpointAliases;

    private TenantMtls() {}
    /**
     * @return Disable mTLS settings.
     * 
     */
    public Optional<Boolean> disable() {
        return Optional.ofNullable(this.disable);
    }
    /**
     * @return Enable mTLS endpoint aliases.
     * 
     */
    public Optional<Boolean> enableEndpointAliases() {
        return Optional.ofNullable(this.enableEndpointAliases);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TenantMtls defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean disable;
        private @Nullable Boolean enableEndpointAliases;
        public Builder() {}
        public Builder(TenantMtls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disable = defaults.disable;
    	      this.enableEndpointAliases = defaults.enableEndpointAliases;
        }

        @CustomType.Setter
        public Builder disable(@Nullable Boolean disable) {

            this.disable = disable;
            return this;
        }
        @CustomType.Setter
        public Builder enableEndpointAliases(@Nullable Boolean enableEndpointAliases) {

            this.enableEndpointAliases = enableEndpointAliases;
            return this;
        }
        public TenantMtls build() {
            final var _resultValue = new TenantMtls();
            _resultValue.disable = disable;
            _resultValue.enableEndpointAliases = enableEndpointAliases;
            return _resultValue;
        }
    }
}
