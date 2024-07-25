// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.GetConnectionScimConfigurationDefaultMappingArgs;
import com.pulumi.auth0.inputs.GetConnectionScimConfigurationMappingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectionScimConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConnectionScimConfigurationArgs Empty = new GetConnectionScimConfigurationArgs();

    /**
     * ID of the connection for this SCIM configuration.
     * 
     */
    @Import(name="connectionId", required=true)
    private Output<String> connectionId;

    /**
     * @return ID of the connection for this SCIM configuration.
     * 
     */
    public Output<String> connectionId() {
        return this.connectionId;
    }

    /**
     * Default mapping between Auth0 attributes and SCIM attributes for this connection type.
     * 
     */
    @Import(name="defaultMappings")
    private @Nullable Output<List<GetConnectionScimConfigurationDefaultMappingArgs>> defaultMappings;

    /**
     * @return Default mapping between Auth0 attributes and SCIM attributes for this connection type.
     * 
     */
    public Optional<Output<List<GetConnectionScimConfigurationDefaultMappingArgs>>> defaultMappings() {
        return Optional.ofNullable(this.defaultMappings);
    }

    /**
     * Mapping between Auth0 attributes and SCIM attributes.
     * 
     */
    @Import(name="mappings")
    private @Nullable Output<List<GetConnectionScimConfigurationMappingArgs>> mappings;

    /**
     * @return Mapping between Auth0 attributes and SCIM attributes.
     * 
     */
    public Optional<Output<List<GetConnectionScimConfigurationMappingArgs>>> mappings() {
        return Optional.ofNullable(this.mappings);
    }

    private GetConnectionScimConfigurationArgs() {}

    private GetConnectionScimConfigurationArgs(GetConnectionScimConfigurationArgs $) {
        this.connectionId = $.connectionId;
        this.defaultMappings = $.defaultMappings;
        this.mappings = $.mappings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionScimConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionScimConfigurationArgs $;

        public Builder() {
            $ = new GetConnectionScimConfigurationArgs();
        }

        public Builder(GetConnectionScimConfigurationArgs defaults) {
            $ = new GetConnectionScimConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionId ID of the connection for this SCIM configuration.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(Output<String> connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param connectionId ID of the connection for this SCIM configuration.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(String connectionId) {
            return connectionId(Output.of(connectionId));
        }

        /**
         * @param defaultMappings Default mapping between Auth0 attributes and SCIM attributes for this connection type.
         * 
         * @return builder
         * 
         */
        public Builder defaultMappings(@Nullable Output<List<GetConnectionScimConfigurationDefaultMappingArgs>> defaultMappings) {
            $.defaultMappings = defaultMappings;
            return this;
        }

        /**
         * @param defaultMappings Default mapping between Auth0 attributes and SCIM attributes for this connection type.
         * 
         * @return builder
         * 
         */
        public Builder defaultMappings(List<GetConnectionScimConfigurationDefaultMappingArgs> defaultMappings) {
            return defaultMappings(Output.of(defaultMappings));
        }

        /**
         * @param defaultMappings Default mapping between Auth0 attributes and SCIM attributes for this connection type.
         * 
         * @return builder
         * 
         */
        public Builder defaultMappings(GetConnectionScimConfigurationDefaultMappingArgs... defaultMappings) {
            return defaultMappings(List.of(defaultMappings));
        }

        /**
         * @param mappings Mapping between Auth0 attributes and SCIM attributes.
         * 
         * @return builder
         * 
         */
        public Builder mappings(@Nullable Output<List<GetConnectionScimConfigurationMappingArgs>> mappings) {
            $.mappings = mappings;
            return this;
        }

        /**
         * @param mappings Mapping between Auth0 attributes and SCIM attributes.
         * 
         * @return builder
         * 
         */
        public Builder mappings(List<GetConnectionScimConfigurationMappingArgs> mappings) {
            return mappings(Output.of(mappings));
        }

        /**
         * @param mappings Mapping between Auth0 attributes and SCIM attributes.
         * 
         * @return builder
         * 
         */
        public Builder mappings(GetConnectionScimConfigurationMappingArgs... mappings) {
            return mappings(List.of(mappings));
        }

        public GetConnectionScimConfigurationArgs build() {
            if ($.connectionId == null) {
                throw new MissingRequiredPropertyException("GetConnectionScimConfigurationArgs", "connectionId");
            }
            return $;
        }
    }

}