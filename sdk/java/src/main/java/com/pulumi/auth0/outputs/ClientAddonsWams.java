// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientAddonsWams {
    private @Nullable String masterKey;

    private ClientAddonsWams() {}
    public Optional<String> masterKey() {
        return Optional.ofNullable(this.masterKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientAddonsWams defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String masterKey;
        public Builder() {}
        public Builder(ClientAddonsWams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.masterKey = defaults.masterKey;
        }

        @CustomType.Setter
        public Builder masterKey(@Nullable String masterKey) {
            this.masterKey = masterKey;
            return this;
        }
        public ClientAddonsWams build() {
            final var o = new ClientAddonsWams();
            o.masterKey = masterKey;
            return o;
        }
    }
}
