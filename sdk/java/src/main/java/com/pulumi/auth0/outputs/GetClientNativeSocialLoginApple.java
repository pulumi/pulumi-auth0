// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetClientNativeSocialLoginApple {
    private Boolean enabled;

    private GetClientNativeSocialLoginApple() {}
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientNativeSocialLoginApple defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        public Builder() {}
        public Builder(GetClientNativeSocialLoginApple defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public GetClientNativeSocialLoginApple build() {
            final var o = new GetClientNativeSocialLoginApple();
            o.enabled = enabled;
            return o;
        }
    }
}