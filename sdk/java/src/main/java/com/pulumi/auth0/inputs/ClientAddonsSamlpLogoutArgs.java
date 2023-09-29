// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientAddonsSamlpLogoutArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientAddonsSamlpLogoutArgs Empty = new ClientAddonsSamlpLogoutArgs();

    @Import(name="callback")
    private @Nullable Output<String> callback;

    public Optional<Output<String>> callback() {
        return Optional.ofNullable(this.callback);
    }

    @Import(name="sloEnabled")
    private @Nullable Output<Boolean> sloEnabled;

    public Optional<Output<Boolean>> sloEnabled() {
        return Optional.ofNullable(this.sloEnabled);
    }

    private ClientAddonsSamlpLogoutArgs() {}

    private ClientAddonsSamlpLogoutArgs(ClientAddonsSamlpLogoutArgs $) {
        this.callback = $.callback;
        this.sloEnabled = $.sloEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientAddonsSamlpLogoutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientAddonsSamlpLogoutArgs $;

        public Builder() {
            $ = new ClientAddonsSamlpLogoutArgs();
        }

        public Builder(ClientAddonsSamlpLogoutArgs defaults) {
            $ = new ClientAddonsSamlpLogoutArgs(Objects.requireNonNull(defaults));
        }

        public Builder callback(@Nullable Output<String> callback) {
            $.callback = callback;
            return this;
        }

        public Builder callback(String callback) {
            return callback(Output.of(callback));
        }

        public Builder sloEnabled(@Nullable Output<Boolean> sloEnabled) {
            $.sloEnabled = sloEnabled;
            return this;
        }

        public Builder sloEnabled(Boolean sloEnabled) {
            return sloEnabled(Output.of(sloEnabled));
        }

        public ClientAddonsSamlpLogoutArgs build() {
            return $;
        }
    }

}