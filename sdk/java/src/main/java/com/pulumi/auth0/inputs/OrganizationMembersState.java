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


public final class OrganizationMembersState extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationMembersState Empty = new OrganizationMembersState();

    /**
     * Add user ID(s) directly from the tenant to become members of the organization.
     * 
     */
    @Import(name="members")
    private @Nullable Output<List<String>> members;

    /**
     * @return Add user ID(s) directly from the tenant to become members of the organization.
     * 
     */
    public Optional<Output<List<String>>> members() {
        return Optional.ofNullable(this.members);
    }

    /**
     * The ID of the organization to assign the members to.
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return The ID of the organization to assign the members to.
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    private OrganizationMembersState() {}

    private OrganizationMembersState(OrganizationMembersState $) {
        this.members = $.members;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationMembersState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationMembersState $;

        public Builder() {
            $ = new OrganizationMembersState();
        }

        public Builder(OrganizationMembersState defaults) {
            $ = new OrganizationMembersState(Objects.requireNonNull(defaults));
        }

        /**
         * @param members Add user ID(s) directly from the tenant to become members of the organization.
         * 
         * @return builder
         * 
         */
        public Builder members(@Nullable Output<List<String>> members) {
            $.members = members;
            return this;
        }

        /**
         * @param members Add user ID(s) directly from the tenant to become members of the organization.
         * 
         * @return builder
         * 
         */
        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        /**
         * @param members Add user ID(s) directly from the tenant to become members of the organization.
         * 
         * @return builder
         * 
         */
        public Builder members(String... members) {
            return members(List.of(members));
        }

        /**
         * @param organizationId The ID of the organization to assign the members to.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId The ID of the organization to assign the members to.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public OrganizationMembersState build() {
            return $;
        }
    }

}