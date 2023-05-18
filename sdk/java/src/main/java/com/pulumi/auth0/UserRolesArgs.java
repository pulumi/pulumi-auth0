// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class UserRolesArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserRolesArgs Empty = new UserRolesArgs();

    /**
     * Set of IDs of roles assigned to the user.
     * 
     */
    @Import(name="roles", required=true)
    private Output<List<String>> roles;

    /**
     * @return Set of IDs of roles assigned to the user.
     * 
     */
    public Output<List<String>> roles() {
        return this.roles;
    }

    /**
     * ID of the user.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return ID of the user.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private UserRolesArgs() {}

    private UserRolesArgs(UserRolesArgs $) {
        this.roles = $.roles;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserRolesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserRolesArgs $;

        public Builder() {
            $ = new UserRolesArgs();
        }

        public Builder(UserRolesArgs defaults) {
            $ = new UserRolesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param roles Set of IDs of roles assigned to the user.
         * 
         * @return builder
         * 
         */
        public Builder roles(Output<List<String>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles Set of IDs of roles assigned to the user.
         * 
         * @return builder
         * 
         */
        public Builder roles(List<String> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles Set of IDs of roles assigned to the user.
         * 
         * @return builder
         * 
         */
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }

        /**
         * @param userId ID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId ID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public UserRolesArgs build() {
            $.roles = Objects.requireNonNull($.roles, "expected parameter 'roles' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
