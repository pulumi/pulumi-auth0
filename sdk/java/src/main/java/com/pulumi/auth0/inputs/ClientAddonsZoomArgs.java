// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientAddonsZoomArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientAddonsZoomArgs Empty = new ClientAddonsZoomArgs();

    @Import(name="account")
    private @Nullable Output<String> account;

    public Optional<Output<String>> account() {
        return Optional.ofNullable(this.account);
    }

    private ClientAddonsZoomArgs() {}

    private ClientAddonsZoomArgs(ClientAddonsZoomArgs $) {
        this.account = $.account;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientAddonsZoomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientAddonsZoomArgs $;

        public Builder() {
            $ = new ClientAddonsZoomArgs();
        }

        public Builder(ClientAddonsZoomArgs defaults) {
            $ = new ClientAddonsZoomArgs(Objects.requireNonNull(defaults));
        }

        public Builder account(@Nullable Output<String> account) {
            $.account = account;
            return this;
        }

        public Builder account(String account) {
            return account(Output.of(account));
        }

        public ClientAddonsZoomArgs build() {
            return $;
        }
    }

}