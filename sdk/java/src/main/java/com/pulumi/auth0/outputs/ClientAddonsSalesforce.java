// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientAddonsSalesforce {
    private @Nullable String entityId;

    private ClientAddonsSalesforce() {}
    public Optional<String> entityId() {
        return Optional.ofNullable(this.entityId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientAddonsSalesforce defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String entityId;
        public Builder() {}
        public Builder(ClientAddonsSalesforce defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityId = defaults.entityId;
        }

        @CustomType.Setter
        public Builder entityId(@Nullable String entityId) {
            this.entityId = entityId;
            return this;
        }
        public ClientAddonsSalesforce build() {
            final var o = new ClientAddonsSalesforce();
            o.entityId = entityId;
            return o;
        }
    }
}
