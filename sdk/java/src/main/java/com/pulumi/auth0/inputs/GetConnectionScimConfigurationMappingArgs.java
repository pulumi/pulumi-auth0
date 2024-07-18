// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetConnectionScimConfigurationMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetConnectionScimConfigurationMappingArgs Empty = new GetConnectionScimConfigurationMappingArgs();

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

    private GetConnectionScimConfigurationMappingArgs() {}

    private GetConnectionScimConfigurationMappingArgs(GetConnectionScimConfigurationMappingArgs $) {
        this.auth0 = $.auth0;
        this.scim = $.scim;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionScimConfigurationMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionScimConfigurationMappingArgs $;

        public Builder() {
            $ = new GetConnectionScimConfigurationMappingArgs();
        }

        public Builder(GetConnectionScimConfigurationMappingArgs defaults) {
            $ = new GetConnectionScimConfigurationMappingArgs(Objects.requireNonNull(defaults));
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

        public GetConnectionScimConfigurationMappingArgs build() {
            if ($.auth0 == null) {
                throw new MissingRequiredPropertyException("GetConnectionScimConfigurationMappingArgs", "auth0");
            }
            if ($.scim == null) {
                throw new MissingRequiredPropertyException("GetConnectionScimConfigurationMappingArgs", "scim");
            }
            return $;
        }
    }

}
