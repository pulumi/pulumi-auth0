// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OrganizationConnectionsEnabledConnection {
    /**
     * @return When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
     * 
     */
    private @Nullable Boolean assignMembershipOnLogin;
    /**
     * @return The ID of the connection to enable for the organization.
     * 
     */
    private String connectionId;

    private OrganizationConnectionsEnabledConnection() {}
    /**
     * @return When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
     * 
     */
    public Optional<Boolean> assignMembershipOnLogin() {
        return Optional.ofNullable(this.assignMembershipOnLogin);
    }
    /**
     * @return The ID of the connection to enable for the organization.
     * 
     */
    public String connectionId() {
        return this.connectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationConnectionsEnabledConnection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean assignMembershipOnLogin;
        private String connectionId;
        public Builder() {}
        public Builder(OrganizationConnectionsEnabledConnection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignMembershipOnLogin = defaults.assignMembershipOnLogin;
    	      this.connectionId = defaults.connectionId;
        }

        @CustomType.Setter
        public Builder assignMembershipOnLogin(@Nullable Boolean assignMembershipOnLogin) {

            this.assignMembershipOnLogin = assignMembershipOnLogin;
            return this;
        }
        @CustomType.Setter
        public Builder connectionId(String connectionId) {
            if (connectionId == null) {
              throw new MissingRequiredPropertyException("OrganizationConnectionsEnabledConnection", "connectionId");
            }
            this.connectionId = connectionId;
            return this;
        }
        public OrganizationConnectionsEnabledConnection build() {
            final var _resultValue = new OrganizationConnectionsEnabledConnection();
            _resultValue.assignMembershipOnLogin = assignMembershipOnLogin;
            _resultValue.connectionId = connectionId;
            return _resultValue;
        }
    }
}
