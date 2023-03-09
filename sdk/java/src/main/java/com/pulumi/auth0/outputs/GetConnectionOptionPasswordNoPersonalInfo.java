// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetConnectionOptionPasswordNoPersonalInfo {
    private Boolean enable;

    private GetConnectionOptionPasswordNoPersonalInfo() {}
    public Boolean enable() {
        return this.enable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionOptionPasswordNoPersonalInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enable;
        public Builder() {}
        public Builder(GetConnectionOptionPasswordNoPersonalInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
        }

        @CustomType.Setter
        public Builder enable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }
        public GetConnectionOptionPasswordNoPersonalInfo build() {
            final var o = new GetConnectionOptionPasswordNoPersonalInfo();
            o.enable = enable;
            return o;
        }
    }
}