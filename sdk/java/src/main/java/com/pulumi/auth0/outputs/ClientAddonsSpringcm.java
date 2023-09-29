// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientAddonsSpringcm {
    private @Nullable String acsUrl;

    private ClientAddonsSpringcm() {}
    public Optional<String> acsUrl() {
        return Optional.ofNullable(this.acsUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientAddonsSpringcm defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String acsUrl;
        public Builder() {}
        public Builder(ClientAddonsSpringcm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acsUrl = defaults.acsUrl;
        }

        @CustomType.Setter
        public Builder acsUrl(@Nullable String acsUrl) {
            this.acsUrl = acsUrl;
            return this;
        }
        public ClientAddonsSpringcm build() {
            final var o = new ClientAddonsSpringcm();
            o.acsUrl = acsUrl;
            return o;
        }
    }
}