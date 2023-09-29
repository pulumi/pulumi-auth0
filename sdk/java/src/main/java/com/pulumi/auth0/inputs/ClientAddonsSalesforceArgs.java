// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientAddonsSalesforceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientAddonsSalesforceArgs Empty = new ClientAddonsSalesforceArgs();

    @Import(name="entityId")
    private @Nullable Output<String> entityId;

    public Optional<Output<String>> entityId() {
        return Optional.ofNullable(this.entityId);
    }

    private ClientAddonsSalesforceArgs() {}

    private ClientAddonsSalesforceArgs(ClientAddonsSalesforceArgs $) {
        this.entityId = $.entityId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientAddonsSalesforceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientAddonsSalesforceArgs $;

        public Builder() {
            $ = new ClientAddonsSalesforceArgs();
        }

        public Builder(ClientAddonsSalesforceArgs defaults) {
            $ = new ClientAddonsSalesforceArgs(Objects.requireNonNull(defaults));
        }

        public Builder entityId(@Nullable Output<String> entityId) {
            $.entityId = entityId;
            return this;
        }

        public Builder entityId(String entityId) {
            return entityId(Output.of(entityId));
        }

        public ClientAddonsSalesforceArgs build() {
            return $;
        }
    }

}