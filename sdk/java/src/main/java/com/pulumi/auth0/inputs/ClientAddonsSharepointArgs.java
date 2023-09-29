// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientAddonsSharepointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientAddonsSharepointArgs Empty = new ClientAddonsSharepointArgs();

    @Import(name="externalUrls")
    private @Nullable Output<List<String>> externalUrls;

    public Optional<Output<List<String>>> externalUrls() {
        return Optional.ofNullable(this.externalUrls);
    }

    @Import(name="url")
    private @Nullable Output<String> url;

    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private ClientAddonsSharepointArgs() {}

    private ClientAddonsSharepointArgs(ClientAddonsSharepointArgs $) {
        this.externalUrls = $.externalUrls;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientAddonsSharepointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientAddonsSharepointArgs $;

        public Builder() {
            $ = new ClientAddonsSharepointArgs();
        }

        public Builder(ClientAddonsSharepointArgs defaults) {
            $ = new ClientAddonsSharepointArgs(Objects.requireNonNull(defaults));
        }

        public Builder externalUrls(@Nullable Output<List<String>> externalUrls) {
            $.externalUrls = externalUrls;
            return this;
        }

        public Builder externalUrls(List<String> externalUrls) {
            return externalUrls(Output.of(externalUrls));
        }

        public Builder externalUrls(String... externalUrls) {
            return externalUrls(List.of(externalUrls));
        }

        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public ClientAddonsSharepointArgs build() {
            return $;
        }
    }

}