// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class OrganizationMemberRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationMemberRoleArgs Empty = new OrganizationMemberRoleArgs();

    /**
     * The ID of the organization.
     * 
     */
    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    /**
     * @return The ID of the organization.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * The role ID to assign to the organization member.
     * 
     */
    @Import(name="roleId", required=true)
    private Output<String> roleId;

    /**
     * @return The role ID to assign to the organization member.
     * 
     */
    public Output<String> roleId() {
        return this.roleId;
    }

    /**
     * The user ID of the organization member.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return The user ID of the organization member.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private OrganizationMemberRoleArgs() {}

    private OrganizationMemberRoleArgs(OrganizationMemberRoleArgs $) {
        this.organizationId = $.organizationId;
        this.roleId = $.roleId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationMemberRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationMemberRoleArgs $;

        public Builder() {
            $ = new OrganizationMemberRoleArgs();
        }

        public Builder(OrganizationMemberRoleArgs defaults) {
            $ = new OrganizationMemberRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param organizationId The ID of the organization.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId The ID of the organization.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param roleId The role ID to assign to the organization member.
         * 
         * @return builder
         * 
         */
        public Builder roleId(Output<String> roleId) {
            $.roleId = roleId;
            return this;
        }

        /**
         * @param roleId The role ID to assign to the organization member.
         * 
         * @return builder
         * 
         */
        public Builder roleId(String roleId) {
            return roleId(Output.of(roleId));
        }

        /**
         * @param userId The user ID of the organization member.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The user ID of the organization member.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public OrganizationMemberRoleArgs build() {
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("OrganizationMemberRoleArgs", "organizationId");
            }
            if ($.roleId == null) {
                throw new MissingRequiredPropertyException("OrganizationMemberRoleArgs", "roleId");
            }
            if ($.userId == null) {
                throw new MissingRequiredPropertyException("OrganizationMemberRoleArgs", "userId");
            }
            return $;
        }
    }

}
