// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientAddonsAws {
    private @Nullable Integer lifetimeInSeconds;
    private @Nullable String principal;
    private @Nullable String role;

    private ClientAddonsAws() {}
    public Optional<Integer> lifetimeInSeconds() {
        return Optional.ofNullable(this.lifetimeInSeconds);
    }
    public Optional<String> principal() {
        return Optional.ofNullable(this.principal);
    }
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientAddonsAws defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer lifetimeInSeconds;
        private @Nullable String principal;
        private @Nullable String role;
        public Builder() {}
        public Builder(ClientAddonsAws defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lifetimeInSeconds = defaults.lifetimeInSeconds;
    	      this.principal = defaults.principal;
    	      this.role = defaults.role;
        }

        @CustomType.Setter
        public Builder lifetimeInSeconds(@Nullable Integer lifetimeInSeconds) {
            this.lifetimeInSeconds = lifetimeInSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder principal(@Nullable String principal) {
            this.principal = principal;
            return this;
        }
        @CustomType.Setter
        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }
        public ClientAddonsAws build() {
            final var o = new ClientAddonsAws();
            o.lifetimeInSeconds = lifetimeInSeconds;
            o.principal = principal;
            o.role = role;
            return o;
        }
    }
}