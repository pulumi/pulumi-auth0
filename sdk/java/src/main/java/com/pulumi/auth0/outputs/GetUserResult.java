// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetUserResult {
    /**
     * @return Custom fields that store info about the user that impact the user&#39;s core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
     * 
     */
    private String appMetadata;
    /**
     * @return Indicates whether the user is blocked or not.
     * 
     */
    private Boolean blocked;
    /**
     * @return Name of the connection from which the user information was sourced.
     * 
     */
    private String connectionName;
    /**
     * @return Email address of the user.
     * 
     */
    private String email;
    /**
     * @return Indicates whether the email address has been verified.
     * 
     */
    private Boolean emailVerified;
    /**
     * @return Family name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    private String familyName;
    /**
     * @return Given name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    private String givenName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    private String name;
    /**
     * @return Preferred nickname or alias of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    private String nickname;
    /**
     * @return Initial password for this user. Required for non-passwordless connections (SMS and email).
     * 
     */
    private String password;
    /**
     * @return Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
     * 
     */
    private String phoneNumber;
    /**
     * @return Indicates whether the phone number has been verified.
     * 
     */
    private Boolean phoneVerified;
    /**
     * @return Picture of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    private String picture;
    /**
     * @return Set of IDs of roles assigned to the user.
     * 
     */
    private List<String> roles;
    /**
     * @return ID of the user.
     * 
     */
    private String userId;
    /**
     * @return Custom fields that store info about the user that does not impact a user&#39;s core functionality. Examples include work address, home address, and user preferences.
     * 
     */
    private String userMetadata;
    /**
     * @return Username of the user. Only valid if the connection requires a username.
     * 
     */
    private String username;
    /**
     * @return Indicates whether the user will receive a verification email after creation. Overrides behavior of `email_verified` parameter.
     * 
     */
    private Boolean verifyEmail;

    private GetUserResult() {}
    /**
     * @return Custom fields that store info about the user that impact the user&#39;s core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
     * 
     */
    public String appMetadata() {
        return this.appMetadata;
    }
    /**
     * @return Indicates whether the user is blocked or not.
     * 
     */
    public Boolean blocked() {
        return this.blocked;
    }
    /**
     * @return Name of the connection from which the user information was sourced.
     * 
     */
    public String connectionName() {
        return this.connectionName;
    }
    /**
     * @return Email address of the user.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return Indicates whether the email address has been verified.
     * 
     */
    public Boolean emailVerified() {
        return this.emailVerified;
    }
    /**
     * @return Family name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    public String familyName() {
        return this.familyName;
    }
    /**
     * @return Given name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    public String givenName() {
        return this.givenName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Preferred nickname or alias of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    public String nickname() {
        return this.nickname;
    }
    /**
     * @return Initial password for this user. Required for non-passwordless connections (SMS and email).
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
     * 
     */
    public String phoneNumber() {
        return this.phoneNumber;
    }
    /**
     * @return Indicates whether the phone number has been verified.
     * 
     */
    public Boolean phoneVerified() {
        return this.phoneVerified;
    }
    /**
     * @return Picture of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    public String picture() {
        return this.picture;
    }
    /**
     * @return Set of IDs of roles assigned to the user.
     * 
     */
    public List<String> roles() {
        return this.roles;
    }
    /**
     * @return ID of the user.
     * 
     */
    public String userId() {
        return this.userId;
    }
    /**
     * @return Custom fields that store info about the user that does not impact a user&#39;s core functionality. Examples include work address, home address, and user preferences.
     * 
     */
    public String userMetadata() {
        return this.userMetadata;
    }
    /**
     * @return Username of the user. Only valid if the connection requires a username.
     * 
     */
    public String username() {
        return this.username;
    }
    /**
     * @return Indicates whether the user will receive a verification email after creation. Overrides behavior of `email_verified` parameter.
     * 
     */
    public Boolean verifyEmail() {
        return this.verifyEmail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String appMetadata;
        private Boolean blocked;
        private String connectionName;
        private String email;
        private Boolean emailVerified;
        private String familyName;
        private String givenName;
        private String id;
        private String name;
        private String nickname;
        private String password;
        private String phoneNumber;
        private Boolean phoneVerified;
        private String picture;
        private List<String> roles;
        private String userId;
        private String userMetadata;
        private String username;
        private Boolean verifyEmail;
        public Builder() {}
        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appMetadata = defaults.appMetadata;
    	      this.blocked = defaults.blocked;
    	      this.connectionName = defaults.connectionName;
    	      this.email = defaults.email;
    	      this.emailVerified = defaults.emailVerified;
    	      this.familyName = defaults.familyName;
    	      this.givenName = defaults.givenName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.nickname = defaults.nickname;
    	      this.password = defaults.password;
    	      this.phoneNumber = defaults.phoneNumber;
    	      this.phoneVerified = defaults.phoneVerified;
    	      this.picture = defaults.picture;
    	      this.roles = defaults.roles;
    	      this.userId = defaults.userId;
    	      this.userMetadata = defaults.userMetadata;
    	      this.username = defaults.username;
    	      this.verifyEmail = defaults.verifyEmail;
        }

        @CustomType.Setter
        public Builder appMetadata(String appMetadata) {
            this.appMetadata = Objects.requireNonNull(appMetadata);
            return this;
        }
        @CustomType.Setter
        public Builder blocked(Boolean blocked) {
            this.blocked = Objects.requireNonNull(blocked);
            return this;
        }
        @CustomType.Setter
        public Builder connectionName(String connectionName) {
            this.connectionName = Objects.requireNonNull(connectionName);
            return this;
        }
        @CustomType.Setter
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        @CustomType.Setter
        public Builder emailVerified(Boolean emailVerified) {
            this.emailVerified = Objects.requireNonNull(emailVerified);
            return this;
        }
        @CustomType.Setter
        public Builder familyName(String familyName) {
            this.familyName = Objects.requireNonNull(familyName);
            return this;
        }
        @CustomType.Setter
        public Builder givenName(String givenName) {
            this.givenName = Objects.requireNonNull(givenName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder nickname(String nickname) {
            this.nickname = Objects.requireNonNull(nickname);
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }
        @CustomType.Setter
        public Builder phoneVerified(Boolean phoneVerified) {
            this.phoneVerified = Objects.requireNonNull(phoneVerified);
            return this;
        }
        @CustomType.Setter
        public Builder picture(String picture) {
            this.picture = Objects.requireNonNull(picture);
            return this;
        }
        @CustomType.Setter
        public Builder roles(List<String> roles) {
            this.roles = Objects.requireNonNull(roles);
            return this;
        }
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }
        @CustomType.Setter
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        @CustomType.Setter
        public Builder userMetadata(String userMetadata) {
            this.userMetadata = Objects.requireNonNull(userMetadata);
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        @CustomType.Setter
        public Builder verifyEmail(Boolean verifyEmail) {
            this.verifyEmail = Objects.requireNonNull(verifyEmail);
            return this;
        }
        public GetUserResult build() {
            final var o = new GetUserResult();
            o.appMetadata = appMetadata;
            o.blocked = blocked;
            o.connectionName = connectionName;
            o.email = email;
            o.emailVerified = emailVerified;
            o.familyName = familyName;
            o.givenName = givenName;
            o.id = id;
            o.name = name;
            o.nickname = nickname;
            o.password = password;
            o.phoneNumber = phoneNumber;
            o.phoneVerified = phoneVerified;
            o.picture = picture;
            o.roles = roles;
            o.userId = userId;
            o.userMetadata = userMetadata;
            o.username = username;
            o.verifyEmail = verifyEmail;
            return o;
        }
    }
}
