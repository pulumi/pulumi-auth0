// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientAddonsSalesforceSandboxApiArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientAddonsSalesforceSandboxApiArgs Empty = new ClientAddonsSalesforceSandboxApiArgs();

    /**
     * The ID of the client.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The ID of the client.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    @Import(name="communityName")
    private @Nullable Output<String> communityName;

    public Optional<Output<String>> communityName() {
        return Optional.ofNullable(this.communityName);
    }

    @Import(name="communityUrlSection")
    private @Nullable Output<String> communityUrlSection;

    public Optional<Output<String>> communityUrlSection() {
        return Optional.ofNullable(this.communityUrlSection);
    }

    @Import(name="principal")
    private @Nullable Output<String> principal;

    public Optional<Output<String>> principal() {
        return Optional.ofNullable(this.principal);
    }

    private ClientAddonsSalesforceSandboxApiArgs() {}

    private ClientAddonsSalesforceSandboxApiArgs(ClientAddonsSalesforceSandboxApiArgs $) {
        this.clientId = $.clientId;
        this.communityName = $.communityName;
        this.communityUrlSection = $.communityUrlSection;
        this.principal = $.principal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientAddonsSalesforceSandboxApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientAddonsSalesforceSandboxApiArgs $;

        public Builder() {
            $ = new ClientAddonsSalesforceSandboxApiArgs();
        }

        public Builder(ClientAddonsSalesforceSandboxApiArgs defaults) {
            $ = new ClientAddonsSalesforceSandboxApiArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId The ID of the client.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The ID of the client.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        public Builder communityName(@Nullable Output<String> communityName) {
            $.communityName = communityName;
            return this;
        }

        public Builder communityName(String communityName) {
            return communityName(Output.of(communityName));
        }

        public Builder communityUrlSection(@Nullable Output<String> communityUrlSection) {
            $.communityUrlSection = communityUrlSection;
            return this;
        }

        public Builder communityUrlSection(String communityUrlSection) {
            return communityUrlSection(Output.of(communityUrlSection));
        }

        public Builder principal(@Nullable Output<String> principal) {
            $.principal = principal;
            return this;
        }

        public Builder principal(String principal) {
            return principal(Output.of(principal));
        }

        public ClientAddonsSalesforceSandboxApiArgs build() {
            return $;
        }
    }

}
