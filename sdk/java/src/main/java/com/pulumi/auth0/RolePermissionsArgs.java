// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.inputs.RolePermissionsPermissionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RolePermissionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RolePermissionsArgs Empty = new RolePermissionsArgs();

    /**
     * List of API permissions granted to the role.
     * 
     */
    @Import(name="permissions", required=true)
    private Output<List<RolePermissionsPermissionArgs>> permissions;

    /**
     * @return List of API permissions granted to the role.
     * 
     */
    public Output<List<RolePermissionsPermissionArgs>> permissions() {
        return this.permissions;
    }

    /**
     * ID of the role to associate the permission to.
     * 
     */
    @Import(name="roleId", required=true)
    private Output<String> roleId;

    /**
     * @return ID of the role to associate the permission to.
     * 
     */
    public Output<String> roleId() {
        return this.roleId;
    }

    private RolePermissionsArgs() {}

    private RolePermissionsArgs(RolePermissionsArgs $) {
        this.permissions = $.permissions;
        this.roleId = $.roleId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RolePermissionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RolePermissionsArgs $;

        public Builder() {
            $ = new RolePermissionsArgs();
        }

        public Builder(RolePermissionsArgs defaults) {
            $ = new RolePermissionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param permissions List of API permissions granted to the role.
         * 
         * @return builder
         * 
         */
        public Builder permissions(Output<List<RolePermissionsPermissionArgs>> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions List of API permissions granted to the role.
         * 
         * @return builder
         * 
         */
        public Builder permissions(List<RolePermissionsPermissionArgs> permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param permissions List of API permissions granted to the role.
         * 
         * @return builder
         * 
         */
        public Builder permissions(RolePermissionsPermissionArgs... permissions) {
            return permissions(List.of(permissions));
        }

        /**
         * @param roleId ID of the role to associate the permission to.
         * 
         * @return builder
         * 
         */
        public Builder roleId(Output<String> roleId) {
            $.roleId = roleId;
            return this;
        }

        /**
         * @param roleId ID of the role to associate the permission to.
         * 
         * @return builder
         * 
         */
        public Builder roleId(String roleId) {
            return roleId(Output.of(roleId));
        }

        public RolePermissionsArgs build() {
            if ($.permissions == null) {
                throw new MissingRequiredPropertyException("RolePermissionsArgs", "permissions");
            }
            if ($.roleId == null) {
                throw new MissingRequiredPropertyException("RolePermissionsArgs", "roleId");
            }
            return $;
        }
    }

}
