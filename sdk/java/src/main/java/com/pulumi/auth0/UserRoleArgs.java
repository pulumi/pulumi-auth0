// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class UserRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserRoleArgs Empty = new UserRoleArgs();

    /**
     * ID of the role assigned to the user.
     * 
     */
    @Import(name="roleId", required=true)
    private Output<String> roleId;

    /**
     * @return ID of the role assigned to the user.
     * 
     */
    public Output<String> roleId() {
        return this.roleId;
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

    private UserRoleArgs() {}

    private UserRoleArgs(UserRoleArgs $) {
        this.roleId = $.roleId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserRoleArgs $;

        public Builder() {
            $ = new UserRoleArgs();
        }

        public Builder(UserRoleArgs defaults) {
            $ = new UserRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param roleId ID of the role assigned to the user.
         * 
         * @return builder
         * 
         */
        public Builder roleId(Output<String> roleId) {
            $.roleId = roleId;
            return this;
        }

        /**
         * @param roleId ID of the role assigned to the user.
         * 
         * @return builder
         * 
         */
        public Builder roleId(String roleId) {
            return roleId(Output.of(roleId));
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

        public UserRoleArgs build() {
            if ($.roleId == null) {
                throw new MissingRequiredPropertyException("UserRoleArgs", "roleId");
            }
            if ($.userId == null) {
                throw new MissingRequiredPropertyException("UserRoleArgs", "userId");
            }
            return $;
        }
    }

}
