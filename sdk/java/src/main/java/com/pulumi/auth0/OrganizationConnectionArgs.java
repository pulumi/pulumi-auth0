// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationConnectionArgs Empty = new OrganizationConnectionArgs();

    /**
     * When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
     * 
     */
    @Import(name="assignMembershipOnLogin")
    private @Nullable Output<Boolean> assignMembershipOnLogin;

    /**
     * @return When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
     * 
     */
    public Optional<Output<Boolean>> assignMembershipOnLogin() {
        return Optional.ofNullable(this.assignMembershipOnLogin);
    }

    /**
     * The ID of the connection to enable for the organization.
     * 
     */
    @Import(name="connectionId", required=true)
    private Output<String> connectionId;

    /**
     * @return The ID of the connection to enable for the organization.
     * 
     */
    public Output<String> connectionId() {
        return this.connectionId;
    }

    /**
     * The ID of the organization to enable the connection for.
     * 
     */
    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    /**
     * @return The ID of the organization to enable the connection for.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    private OrganizationConnectionArgs() {}

    private OrganizationConnectionArgs(OrganizationConnectionArgs $) {
        this.assignMembershipOnLogin = $.assignMembershipOnLogin;
        this.connectionId = $.connectionId;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationConnectionArgs $;

        public Builder() {
            $ = new OrganizationConnectionArgs();
        }

        public Builder(OrganizationConnectionArgs defaults) {
            $ = new OrganizationConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assignMembershipOnLogin When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
         * 
         * @return builder
         * 
         */
        public Builder assignMembershipOnLogin(@Nullable Output<Boolean> assignMembershipOnLogin) {
            $.assignMembershipOnLogin = assignMembershipOnLogin;
            return this;
        }

        /**
         * @param assignMembershipOnLogin When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
         * 
         * @return builder
         * 
         */
        public Builder assignMembershipOnLogin(Boolean assignMembershipOnLogin) {
            return assignMembershipOnLogin(Output.of(assignMembershipOnLogin));
        }

        /**
         * @param connectionId The ID of the connection to enable for the organization.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(Output<String> connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param connectionId The ID of the connection to enable for the organization.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(String connectionId) {
            return connectionId(Output.of(connectionId));
        }

        /**
         * @param organizationId The ID of the organization to enable the connection for.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId The ID of the organization to enable the connection for.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        public OrganizationConnectionArgs build() {
            if ($.connectionId == null) {
                throw new MissingRequiredPropertyException("OrganizationConnectionArgs", "connectionId");
            }
            if ($.organizationId == null) {
                throw new MissingRequiredPropertyException("OrganizationConnectionArgs", "organizationId");
            }
            return $;
        }
    }

}
