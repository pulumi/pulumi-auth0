// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RolePermissionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RolePermissionArgs Empty = new RolePermissionArgs();

    /**
     * String. Name of the permission (scope).
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return String. Name of the permission (scope).
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * String. Unique identifier for the resource server.
     * 
     */
    @Import(name="resourceServerIdentifier", required=true)
    private Output<String> resourceServerIdentifier;

    /**
     * @return String. Unique identifier for the resource server.
     * 
     */
    public Output<String> resourceServerIdentifier() {
        return this.resourceServerIdentifier;
    }

    private RolePermissionArgs() {}

    private RolePermissionArgs(RolePermissionArgs $) {
        this.name = $.name;
        this.resourceServerIdentifier = $.resourceServerIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RolePermissionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RolePermissionArgs $;

        public Builder() {
            $ = new RolePermissionArgs();
        }

        public Builder(RolePermissionArgs defaults) {
            $ = new RolePermissionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name String. Name of the permission (scope).
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name String. Name of the permission (scope).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceServerIdentifier String. Unique identifier for the resource server.
         * 
         * @return builder
         * 
         */
        public Builder resourceServerIdentifier(Output<String> resourceServerIdentifier) {
            $.resourceServerIdentifier = resourceServerIdentifier;
            return this;
        }

        /**
         * @param resourceServerIdentifier String. Unique identifier for the resource server.
         * 
         * @return builder
         * 
         */
        public Builder resourceServerIdentifier(String resourceServerIdentifier) {
            return resourceServerIdentifier(Output.of(resourceServerIdentifier));
        }

        public RolePermissionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceServerIdentifier = Objects.requireNonNull($.resourceServerIdentifier, "expected parameter 'resourceServerIdentifier' to be non-null");
            return $;
        }
    }

}
