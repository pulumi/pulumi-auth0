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
     * @return When `true`, all users that log in with this connection will be automatically granted membership in the organization. When `false`, users must be granted membership in the organization before logging in with this connection.
     * 
     */
    private @Nullable Boolean assignMembershipOnLogin;
    /**
     * @return The ID of the connection to enable for the organization.
     * 
     */
    private String connectionId;
    /**
     * @return Determines whether organization sign-up should be enabled for this organization connection. Only applicable for database connections. Note: `is_signup_enabled` can only be `true` if `assign_membership_on_login` is `true`.
     * 
     */
    private @Nullable Boolean isSignupEnabled;
    /**
     * @return Determines whether a connection should be displayed on this organization’s login prompt. Only applicable for enterprise connections.
     * 
     */
    private @Nullable Boolean showAsButton;

    private OrganizationConnectionsEnabledConnection() {}
    /**
     * @return When `true`, all users that log in with this connection will be automatically granted membership in the organization. When `false`, users must be granted membership in the organization before logging in with this connection.
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
    /**
     * @return Determines whether organization sign-up should be enabled for this organization connection. Only applicable for database connections. Note: `is_signup_enabled` can only be `true` if `assign_membership_on_login` is `true`.
     * 
     */
    public Optional<Boolean> isSignupEnabled() {
        return Optional.ofNullable(this.isSignupEnabled);
    }
    /**
     * @return Determines whether a connection should be displayed on this organization’s login prompt. Only applicable for enterprise connections.
     * 
     */
    public Optional<Boolean> showAsButton() {
        return Optional.ofNullable(this.showAsButton);
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
        private @Nullable Boolean isSignupEnabled;
        private @Nullable Boolean showAsButton;
        public Builder() {}
        public Builder(OrganizationConnectionsEnabledConnection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignMembershipOnLogin = defaults.assignMembershipOnLogin;
    	      this.connectionId = defaults.connectionId;
    	      this.isSignupEnabled = defaults.isSignupEnabled;
    	      this.showAsButton = defaults.showAsButton;
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
        @CustomType.Setter
        public Builder isSignupEnabled(@Nullable Boolean isSignupEnabled) {

            this.isSignupEnabled = isSignupEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder showAsButton(@Nullable Boolean showAsButton) {

            this.showAsButton = showAsButton;
            return this;
        }
        public OrganizationConnectionsEnabledConnection build() {
            final var _resultValue = new OrganizationConnectionsEnabledConnection();
            _resultValue.assignMembershipOnLogin = assignMembershipOnLogin;
            _resultValue.connectionId = connectionId;
            _resultValue.isSignupEnabled = isSignupEnabled;
            _resultValue.showAsButton = showAsButton;
            return _resultValue;
        }
    }
}
