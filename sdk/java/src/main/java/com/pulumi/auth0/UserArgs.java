// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserArgs Empty = new UserArgs();

    /**
     * Custom fields that store info about the user that impact the user&#39;s core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
     * 
     */
    @Import(name="appMetadata")
    private @Nullable Output<String> appMetadata;

    /**
     * @return Custom fields that store info about the user that impact the user&#39;s core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
     * 
     */
    public Optional<Output<String>> appMetadata() {
        return Optional.ofNullable(this.appMetadata);
    }

    /**
     * Indicates whether the user is blocked or not.
     * 
     */
    @Import(name="blocked")
    private @Nullable Output<Boolean> blocked;

    /**
     * @return Indicates whether the user is blocked or not.
     * 
     */
    public Optional<Output<Boolean>> blocked() {
        return Optional.ofNullable(this.blocked);
    }

    /**
     * Name of the connection from which the user information was sourced.
     * 
     */
    @Import(name="connectionName", required=true)
    private Output<String> connectionName;

    /**
     * @return Name of the connection from which the user information was sourced.
     * 
     */
    public Output<String> connectionName() {
        return this.connectionName;
    }

    /**
     * Email address of the user.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return Email address of the user.
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * Indicates whether the email address has been verified.
     * 
     */
    @Import(name="emailVerified")
    private @Nullable Output<Boolean> emailVerified;

    /**
     * @return Indicates whether the email address has been verified.
     * 
     */
    public Optional<Output<Boolean>> emailVerified() {
        return Optional.ofNullable(this.emailVerified);
    }

    /**
     * Family name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    @Import(name="familyName")
    private @Nullable Output<String> familyName;

    /**
     * @return Family name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    public Optional<Output<String>> familyName() {
        return Optional.ofNullable(this.familyName);
    }

    /**
     * Given name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    @Import(name="givenName")
    private @Nullable Output<String> givenName;

    /**
     * @return Given name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    public Optional<Output<String>> givenName() {
        return Optional.ofNullable(this.givenName);
    }

    /**
     * Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Preferred nickname or alias of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    @Import(name="nickname")
    private @Nullable Output<String> nickname;

    /**
     * @return Preferred nickname or alias of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    public Optional<Output<String>> nickname() {
        return Optional.ofNullable(this.nickname);
    }

    /**
     * Initial password for this user. Required for non-passwordless connections (SMS and email).
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Initial password for this user. Required for non-passwordless connections (SMS and email).
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
     * 
     */
    @Import(name="phoneNumber")
    private @Nullable Output<String> phoneNumber;

    /**
     * @return Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
     * 
     */
    public Optional<Output<String>> phoneNumber() {
        return Optional.ofNullable(this.phoneNumber);
    }

    /**
     * Indicates whether the phone number has been verified.
     * 
     */
    @Import(name="phoneVerified")
    private @Nullable Output<Boolean> phoneVerified;

    /**
     * @return Indicates whether the phone number has been verified.
     * 
     */
    public Optional<Output<Boolean>> phoneVerified() {
        return Optional.ofNullable(this.phoneVerified);
    }

    /**
     * Picture of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    @Import(name="picture")
    private @Nullable Output<String> picture;

    /**
     * @return Picture of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    public Optional<Output<String>> picture() {
        return Optional.ofNullable(this.picture);
    }

    /**
     * Set of IDs of roles assigned to the user. Managing roles through this attribute is deprecated and it will be removed in
     * a future major version. Migrate to the `auth0_user_roles` or the `auth0_user_role` resource to manage user roles
     * instead. Check the [MIGRATION
     * GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#user-roles) on how to do that.
     * 
     * @deprecated
     * Managing roles through this attribute is deprecated and it will be removed in a future major version. Migrate to the `auth0_user_roles` or the `auth0_user_role` resource to manage user roles instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#user-roles) on how to do that.
     * 
     */
    @Deprecated /* Managing roles through this attribute is deprecated and it will be removed in a future major version. Migrate to the `auth0_user_roles` or the `auth0_user_role` resource to manage user roles instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#user-roles) on how to do that. */
    @Import(name="roles")
    private @Nullable Output<List<String>> roles;

    /**
     * @return Set of IDs of roles assigned to the user. Managing roles through this attribute is deprecated and it will be removed in
     * a future major version. Migrate to the `auth0_user_roles` or the `auth0_user_role` resource to manage user roles
     * instead. Check the [MIGRATION
     * GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#user-roles) on how to do that.
     * 
     * @deprecated
     * Managing roles through this attribute is deprecated and it will be removed in a future major version. Migrate to the `auth0_user_roles` or the `auth0_user_role` resource to manage user roles instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#user-roles) on how to do that.
     * 
     */
    @Deprecated /* Managing roles through this attribute is deprecated and it will be removed in a future major version. Migrate to the `auth0_user_roles` or the `auth0_user_role` resource to manage user roles instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#user-roles) on how to do that. */
    public Optional<Output<List<String>>> roles() {
        return Optional.ofNullable(this.roles);
    }

    /**
     * ID of the user.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return ID of the user.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    /**
     * Custom fields that store info about the user that does not impact a user&#39;s core functionality. Examples include work address, home address, and user preferences.
     * 
     */
    @Import(name="userMetadata")
    private @Nullable Output<String> userMetadata;

    /**
     * @return Custom fields that store info about the user that does not impact a user&#39;s core functionality. Examples include work address, home address, and user preferences.
     * 
     */
    public Optional<Output<String>> userMetadata() {
        return Optional.ofNullable(this.userMetadata);
    }

    /**
     * Username of the user. Only valid if the connection requires a username.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return Username of the user. Only valid if the connection requires a username.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    /**
     * Indicates whether the user will receive a verification email after creation. Overrides behavior of `email_verified` parameter.
     * 
     */
    @Import(name="verifyEmail")
    private @Nullable Output<Boolean> verifyEmail;

    /**
     * @return Indicates whether the user will receive a verification email after creation. Overrides behavior of `email_verified` parameter.
     * 
     */
    public Optional<Output<Boolean>> verifyEmail() {
        return Optional.ofNullable(this.verifyEmail);
    }

    private UserArgs() {}

    private UserArgs(UserArgs $) {
        this.appMetadata = $.appMetadata;
        this.blocked = $.blocked;
        this.connectionName = $.connectionName;
        this.email = $.email;
        this.emailVerified = $.emailVerified;
        this.familyName = $.familyName;
        this.givenName = $.givenName;
        this.name = $.name;
        this.nickname = $.nickname;
        this.password = $.password;
        this.phoneNumber = $.phoneNumber;
        this.phoneVerified = $.phoneVerified;
        this.picture = $.picture;
        this.roles = $.roles;
        this.userId = $.userId;
        this.userMetadata = $.userMetadata;
        this.username = $.username;
        this.verifyEmail = $.verifyEmail;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserArgs $;

        public Builder() {
            $ = new UserArgs();
        }

        public Builder(UserArgs defaults) {
            $ = new UserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appMetadata Custom fields that store info about the user that impact the user&#39;s core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
         * 
         * @return builder
         * 
         */
        public Builder appMetadata(@Nullable Output<String> appMetadata) {
            $.appMetadata = appMetadata;
            return this;
        }

        /**
         * @param appMetadata Custom fields that store info about the user that impact the user&#39;s core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
         * 
         * @return builder
         * 
         */
        public Builder appMetadata(String appMetadata) {
            return appMetadata(Output.of(appMetadata));
        }

        /**
         * @param blocked Indicates whether the user is blocked or not.
         * 
         * @return builder
         * 
         */
        public Builder blocked(@Nullable Output<Boolean> blocked) {
            $.blocked = blocked;
            return this;
        }

        /**
         * @param blocked Indicates whether the user is blocked or not.
         * 
         * @return builder
         * 
         */
        public Builder blocked(Boolean blocked) {
            return blocked(Output.of(blocked));
        }

        /**
         * @param connectionName Name of the connection from which the user information was sourced.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(Output<String> connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        /**
         * @param connectionName Name of the connection from which the user information was sourced.
         * 
         * @return builder
         * 
         */
        public Builder connectionName(String connectionName) {
            return connectionName(Output.of(connectionName));
        }

        /**
         * @param email Email address of the user.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email Email address of the user.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param emailVerified Indicates whether the email address has been verified.
         * 
         * @return builder
         * 
         */
        public Builder emailVerified(@Nullable Output<Boolean> emailVerified) {
            $.emailVerified = emailVerified;
            return this;
        }

        /**
         * @param emailVerified Indicates whether the email address has been verified.
         * 
         * @return builder
         * 
         */
        public Builder emailVerified(Boolean emailVerified) {
            return emailVerified(Output.of(emailVerified));
        }

        /**
         * @param familyName Family name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
         * 
         * @return builder
         * 
         */
        public Builder familyName(@Nullable Output<String> familyName) {
            $.familyName = familyName;
            return this;
        }

        /**
         * @param familyName Family name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
         * 
         * @return builder
         * 
         */
        public Builder familyName(String familyName) {
            return familyName(Output.of(familyName));
        }

        /**
         * @param givenName Given name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
         * 
         * @return builder
         * 
         */
        public Builder givenName(@Nullable Output<String> givenName) {
            $.givenName = givenName;
            return this;
        }

        /**
         * @param givenName Given name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
         * 
         * @return builder
         * 
         */
        public Builder givenName(String givenName) {
            return givenName(Output.of(givenName));
        }

        /**
         * @param name Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nickname Preferred nickname or alias of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
         * 
         * @return builder
         * 
         */
        public Builder nickname(@Nullable Output<String> nickname) {
            $.nickname = nickname;
            return this;
        }

        /**
         * @param nickname Preferred nickname or alias of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
         * 
         * @return builder
         * 
         */
        public Builder nickname(String nickname) {
            return nickname(Output.of(nickname));
        }

        /**
         * @param password Initial password for this user. Required for non-passwordless connections (SMS and email).
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Initial password for this user. Required for non-passwordless connections (SMS and email).
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param phoneNumber Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
         * 
         * @return builder
         * 
         */
        public Builder phoneNumber(@Nullable Output<String> phoneNumber) {
            $.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * @param phoneNumber Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
         * 
         * @return builder
         * 
         */
        public Builder phoneNumber(String phoneNumber) {
            return phoneNumber(Output.of(phoneNumber));
        }

        /**
         * @param phoneVerified Indicates whether the phone number has been verified.
         * 
         * @return builder
         * 
         */
        public Builder phoneVerified(@Nullable Output<Boolean> phoneVerified) {
            $.phoneVerified = phoneVerified;
            return this;
        }

        /**
         * @param phoneVerified Indicates whether the phone number has been verified.
         * 
         * @return builder
         * 
         */
        public Builder phoneVerified(Boolean phoneVerified) {
            return phoneVerified(Output.of(phoneVerified));
        }

        /**
         * @param picture Picture of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
         * 
         * @return builder
         * 
         */
        public Builder picture(@Nullable Output<String> picture) {
            $.picture = picture;
            return this;
        }

        /**
         * @param picture Picture of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
         * 
         * @return builder
         * 
         */
        public Builder picture(String picture) {
            return picture(Output.of(picture));
        }

        /**
         * @param roles Set of IDs of roles assigned to the user. Managing roles through this attribute is deprecated and it will be removed in
         * a future major version. Migrate to the `auth0_user_roles` or the `auth0_user_role` resource to manage user roles
         * instead. Check the [MIGRATION
         * GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#user-roles) on how to do that.
         * 
         * @return builder
         * 
         * @deprecated
         * Managing roles through this attribute is deprecated and it will be removed in a future major version. Migrate to the `auth0_user_roles` or the `auth0_user_role` resource to manage user roles instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#user-roles) on how to do that.
         * 
         */
        @Deprecated /* Managing roles through this attribute is deprecated and it will be removed in a future major version. Migrate to the `auth0_user_roles` or the `auth0_user_role` resource to manage user roles instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#user-roles) on how to do that. */
        public Builder roles(@Nullable Output<List<String>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles Set of IDs of roles assigned to the user. Managing roles through this attribute is deprecated and it will be removed in
         * a future major version. Migrate to the `auth0_user_roles` or the `auth0_user_role` resource to manage user roles
         * instead. Check the [MIGRATION
         * GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#user-roles) on how to do that.
         * 
         * @return builder
         * 
         * @deprecated
         * Managing roles through this attribute is deprecated and it will be removed in a future major version. Migrate to the `auth0_user_roles` or the `auth0_user_role` resource to manage user roles instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#user-roles) on how to do that.
         * 
         */
        @Deprecated /* Managing roles through this attribute is deprecated and it will be removed in a future major version. Migrate to the `auth0_user_roles` or the `auth0_user_role` resource to manage user roles instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#user-roles) on how to do that. */
        public Builder roles(List<String> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles Set of IDs of roles assigned to the user. Managing roles through this attribute is deprecated and it will be removed in
         * a future major version. Migrate to the `auth0_user_roles` or the `auth0_user_role` resource to manage user roles
         * instead. Check the [MIGRATION
         * GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#user-roles) on how to do that.
         * 
         * @return builder
         * 
         * @deprecated
         * Managing roles through this attribute is deprecated and it will be removed in a future major version. Migrate to the `auth0_user_roles` or the `auth0_user_role` resource to manage user roles instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#user-roles) on how to do that.
         * 
         */
        @Deprecated /* Managing roles through this attribute is deprecated and it will be removed in a future major version. Migrate to the `auth0_user_roles` or the `auth0_user_role` resource to manage user roles instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#user-roles) on how to do that. */
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }

        /**
         * @param userId ID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
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

        /**
         * @param userMetadata Custom fields that store info about the user that does not impact a user&#39;s core functionality. Examples include work address, home address, and user preferences.
         * 
         * @return builder
         * 
         */
        public Builder userMetadata(@Nullable Output<String> userMetadata) {
            $.userMetadata = userMetadata;
            return this;
        }

        /**
         * @param userMetadata Custom fields that store info about the user that does not impact a user&#39;s core functionality. Examples include work address, home address, and user preferences.
         * 
         * @return builder
         * 
         */
        public Builder userMetadata(String userMetadata) {
            return userMetadata(Output.of(userMetadata));
        }

        /**
         * @param username Username of the user. Only valid if the connection requires a username.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username of the user. Only valid if the connection requires a username.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        /**
         * @param verifyEmail Indicates whether the user will receive a verification email after creation. Overrides behavior of `email_verified` parameter.
         * 
         * @return builder
         * 
         */
        public Builder verifyEmail(@Nullable Output<Boolean> verifyEmail) {
            $.verifyEmail = verifyEmail;
            return this;
        }

        /**
         * @param verifyEmail Indicates whether the user will receive a verification email after creation. Overrides behavior of `email_verified` parameter.
         * 
         * @return builder
         * 
         */
        public Builder verifyEmail(Boolean verifyEmail) {
            return verifyEmail(Output.of(verifyEmail));
        }

        public UserArgs build() {
            $.connectionName = Objects.requireNonNull($.connectionName, "expected parameter 'connectionName' to be non-null");
            return $;
        }
    }

}
