// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationMemberRolesState extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationMemberRolesState Empty = new OrganizationMemberRolesState();

    /**
     * The ID of the organization.
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return The ID of the organization.
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * The role ID(s) to assign to the organization member.
     * 
     */
    @Import(name="roles")
    private @Nullable Output<List<String>> roles;

    /**
     * @return The role ID(s) to assign to the organization member.
     * 
     */
    public Optional<Output<List<String>>> roles() {
        return Optional.ofNullable(this.roles);
    }

    /**
     * The user ID of the organization member.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return The user ID of the organization member.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private OrganizationMemberRolesState() {}

    private OrganizationMemberRolesState(OrganizationMemberRolesState $) {
        this.organizationId = $.organizationId;
        this.roles = $.roles;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationMemberRolesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationMemberRolesState $;

        public Builder() {
            $ = new OrganizationMemberRolesState();
        }

        public Builder(OrganizationMemberRolesState defaults) {
            $ = new OrganizationMemberRolesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param organizationId The ID of the organization.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
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
         * @param roles The role ID(s) to assign to the organization member.
         * 
         * @return builder
         * 
         */
        public Builder roles(@Nullable Output<List<String>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles The role ID(s) to assign to the organization member.
         * 
         * @return builder
         * 
         */
        public Builder roles(List<String> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles The role ID(s) to assign to the organization member.
         * 
         * @return builder
         * 
         */
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }

        /**
         * @param userId The user ID of the organization member.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
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

        public OrganizationMemberRolesState build() {
            return $;
        }
    }

}
