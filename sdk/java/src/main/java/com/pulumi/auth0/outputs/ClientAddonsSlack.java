// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientAddonsSlack {
    private @Nullable String team;

    private ClientAddonsSlack() {}
    public Optional<String> team() {
        return Optional.ofNullable(this.team);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientAddonsSlack defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String team;
        public Builder() {}
        public Builder(ClientAddonsSlack defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.team = defaults.team;
        }

        @CustomType.Setter
        public Builder team(@Nullable String team) {
            this.team = team;
            return this;
        }
        public ClientAddonsSlack build() {
            final var o = new ClientAddonsSlack();
            o.team = team;
            return o;
        }
    }
}