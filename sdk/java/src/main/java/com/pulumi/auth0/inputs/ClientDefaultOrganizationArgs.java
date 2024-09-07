// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientDefaultOrganizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientDefaultOrganizationArgs Empty = new ClientDefaultOrganizationArgs();

    /**
     * If set, the `default_organization` will be removed.
     * 
     */
    @Import(name="disable")
    private @Nullable Output<Boolean> disable;

    /**
     * @return If set, the `default_organization` will be removed.
     * 
     */
    public Optional<Output<Boolean>> disable() {
        return Optional.ofNullable(this.disable);
    }

    /**
     * Definition of the flow that needs to be configured. Eg. client_credentials
     * 
     */
    @Import(name="flows")
    private @Nullable Output<List<String>> flows;

    /**
     * @return Definition of the flow that needs to be configured. Eg. client_credentials
     * 
     */
    public Optional<Output<List<String>>> flows() {
        return Optional.ofNullable(this.flows);
    }

    /**
     * The unique identifier of the organization
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return The unique identifier of the organization
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    private ClientDefaultOrganizationArgs() {}

    private ClientDefaultOrganizationArgs(ClientDefaultOrganizationArgs $) {
        this.disable = $.disable;
        this.flows = $.flows;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientDefaultOrganizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientDefaultOrganizationArgs $;

        public Builder() {
            $ = new ClientDefaultOrganizationArgs();
        }

        public Builder(ClientDefaultOrganizationArgs defaults) {
            $ = new ClientDefaultOrganizationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disable If set, the `default_organization` will be removed.
         * 
         * @return builder
         * 
         */
        public Builder disable(@Nullable Output<Boolean> disable) {
            $.disable = disable;
            return this;
        }

        /**
         * @param disable If set, the `default_organization` will be removed.
         * 
         * @return builder
         * 
         */
        public Builder disable(Boolean disable) {
            return disable(Output.of(disable));
        }

        /**
         * @param flows Definition of the flow that needs to be configured. Eg. client_credentials
         * 
         * @return builder
         * 
         */
        public Builder flows(@Nullable Output<List<String>> flows) {
            $.flows = flows;
            return this;
        }

        /**
         * @param flows Definition of the flow that needs to be configured. Eg. client_credentials
         * 
         * @return builder
         * 
         */
        public Builder flows(List<String> flows) {
            return flows(Output.of(flows));
        }

        /**
         * @param flows Definition of the flow that needs to be configured. Eg. client_credentials
         * 
         * @return builder
         * 
         */
        public Builder flows(String... flows) {
            return flows(List.of(flows));
        }

        /**
         * @param organizationId The unique identifier of the organization
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId The unique identifier of the organization
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public ClientDefaultOrganizationArgs build() {
            return $;
        }
    }

}
