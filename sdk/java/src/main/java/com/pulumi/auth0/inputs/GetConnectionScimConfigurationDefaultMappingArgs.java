// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetConnectionScimConfigurationDefaultMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetConnectionScimConfigurationDefaultMappingArgs Empty = new GetConnectionScimConfigurationDefaultMappingArgs();

    /**
     * The field location in the Auth0 schema.
     * 
     */
    @Import(name="auth0", required=true)
    private Output<String> auth0;

    /**
     * @return The field location in the Auth0 schema.
     * 
     */
    public Output<String> auth0() {
        return this.auth0;
    }

    /**
     * The field location in the SCIM schema.
     * 
     */
    @Import(name="scim", required=true)
    private Output<String> scim;

    /**
     * @return The field location in the SCIM schema.
     * 
     */
    public Output<String> scim() {
        return this.scim;
    }

    private GetConnectionScimConfigurationDefaultMappingArgs() {}

    private GetConnectionScimConfigurationDefaultMappingArgs(GetConnectionScimConfigurationDefaultMappingArgs $) {
        this.auth0 = $.auth0;
        this.scim = $.scim;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionScimConfigurationDefaultMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionScimConfigurationDefaultMappingArgs $;

        public Builder() {
            $ = new GetConnectionScimConfigurationDefaultMappingArgs();
        }

        public Builder(GetConnectionScimConfigurationDefaultMappingArgs defaults) {
            $ = new GetConnectionScimConfigurationDefaultMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param auth0 The field location in the Auth0 schema.
         * 
         * @return builder
         * 
         */
        public Builder auth0(Output<String> auth0) {
            $.auth0 = auth0;
            return this;
        }

        /**
         * @param auth0 The field location in the Auth0 schema.
         * 
         * @return builder
         * 
         */
        public Builder auth0(String auth0) {
            return auth0(Output.of(auth0));
        }

        /**
         * @param scim The field location in the SCIM schema.
         * 
         * @return builder
         * 
         */
        public Builder scim(Output<String> scim) {
            $.scim = scim;
            return this;
        }

        /**
         * @param scim The field location in the SCIM schema.
         * 
         * @return builder
         * 
         */
        public Builder scim(String scim) {
            return scim(Output.of(scim));
        }

        public GetConnectionScimConfigurationDefaultMappingArgs build() {
            if ($.auth0 == null) {
                throw new MissingRequiredPropertyException("GetConnectionScimConfigurationDefaultMappingArgs", "auth0");
            }
            if ($.scim == null) {
                throw new MissingRequiredPropertyException("GetConnectionScimConfigurationDefaultMappingArgs", "scim");
            }
            return $;
        }
    }

}