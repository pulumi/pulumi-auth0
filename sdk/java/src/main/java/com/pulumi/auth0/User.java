// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.UserArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.UserState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * With this resource, you can manage user identities, including resetting passwords, and creating, provisioning, blocking, and deleting users.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.User;
 * import com.pulumi.auth0.UserArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var user = new User("user", UserArgs.builder()
 *             .connectionName("Username-Password-Authentication")
 *             .userId("12345")
 *             .username("unique_username")
 *             .name("Firstname Lastname")
 *             .nickname("some.nickname")
 *             .email("test{@literal @}test.com")
 *             .emailVerified(true)
 *             .password("passpass$12$12")
 *             .picture("https://www.example.com/a-valid-picture-url.jpg")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * This resource can be imported using the user ID.
 * 
 * # 
 * 
 * Example:
 * 
 * ```sh
 * $ pulumi import auth0:index/user:User user &#34;auth0|111111111111111111111111&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/user:User")
public class User extends com.pulumi.resources.CustomResource {
    /**
     * Custom fields that store info about the user that impact the user&#39;s core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
     * 
     */
    @Export(name="appMetadata", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> appMetadata;

    /**
     * @return Custom fields that store info about the user that impact the user&#39;s core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
     * 
     */
    public Output<Optional<String>> appMetadata() {
        return Codegen.optional(this.appMetadata);
    }
    /**
     * Indicates whether the user is blocked or not.
     * 
     */
    @Export(name="blocked", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> blocked;

    /**
     * @return Indicates whether the user is blocked or not.
     * 
     */
    public Output<Optional<Boolean>> blocked() {
        return Codegen.optional(this.blocked);
    }
    /**
     * Name of the connection from which the user information was sourced.
     * 
     */
    @Export(name="connectionName", refs={String.class}, tree="[0]")
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
    @Export(name="email", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> email;

    /**
     * @return Email address of the user.
     * 
     */
    public Output<Optional<String>> email() {
        return Codegen.optional(this.email);
    }
    /**
     * Indicates whether the email address has been verified.
     * 
     */
    @Export(name="emailVerified", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> emailVerified;

    /**
     * @return Indicates whether the email address has been verified.
     * 
     */
    public Output<Optional<Boolean>> emailVerified() {
        return Codegen.optional(this.emailVerified);
    }
    /**
     * Family name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    @Export(name="familyName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> familyName;

    /**
     * @return Family name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    public Output<Optional<String>> familyName() {
        return Codegen.optional(this.familyName);
    }
    /**
     * Given name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    @Export(name="givenName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> givenName;

    /**
     * @return Given name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    public Output<Optional<String>> givenName() {
        return Codegen.optional(this.givenName);
    }
    /**
     * Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Preferred nickname or alias of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    @Export(name="nickname", refs={String.class}, tree="[0]")
    private Output<String> nickname;

    /**
     * @return Preferred nickname or alias of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    public Output<String> nickname() {
        return this.nickname;
    }
    /**
     * Initial password for this user. Required for non-passwordless connections (SMS and email).
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> password;

    /**
     * @return Initial password for this user. Required for non-passwordless connections (SMS and email).
     * 
     */
    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
     * 
     */
    @Export(name="phoneNumber", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> phoneNumber;

    /**
     * @return Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
     * 
     */
    public Output<Optional<String>> phoneNumber() {
        return Codegen.optional(this.phoneNumber);
    }
    /**
     * Indicates whether the phone number has been verified.
     * 
     */
    @Export(name="phoneVerified", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> phoneVerified;

    /**
     * @return Indicates whether the phone number has been verified.
     * 
     */
    public Output<Optional<Boolean>> phoneVerified() {
        return Codegen.optional(this.phoneVerified);
    }
    /**
     * Picture of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    @Export(name="picture", refs={String.class}, tree="[0]")
    private Output<String> picture;

    /**
     * @return Picture of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled &#39;Sync user profile attributes at each login&#39;. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     * 
     */
    public Output<String> picture() {
        return this.picture;
    }
    /**
     * ID of the user.
     * 
     */
    @Export(name="userId", refs={String.class}, tree="[0]")
    private Output<String> userId;

    /**
     * @return ID of the user.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }
    /**
     * Custom fields that store info about the user that does not impact a user&#39;s core functionality. Examples include work address, home address, and user preferences.
     * 
     */
    @Export(name="userMetadata", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userMetadata;

    /**
     * @return Custom fields that store info about the user that does not impact a user&#39;s core functionality. Examples include work address, home address, and user preferences.
     * 
     */
    public Output<Optional<String>> userMetadata() {
        return Codegen.optional(this.userMetadata);
    }
    /**
     * Username of the user. Only valid if the connection requires a username.
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> username;

    /**
     * @return Username of the user. Only valid if the connection requires a username.
     * 
     */
    public Output<Optional<String>> username() {
        return Codegen.optional(this.username);
    }
    /**
     * Indicates whether the user will receive a verification email after creation. Overrides behavior of `email_verified` parameter.
     * 
     */
    @Export(name="verifyEmail", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> verifyEmail;

    /**
     * @return Indicates whether the user will receive a verification email after creation. Overrides behavior of `email_verified` parameter.
     * 
     */
    public Output<Optional<Boolean>> verifyEmail() {
        return Codegen.optional(this.verifyEmail);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public User(String name) {
        this(name, UserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public User(String name, UserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(String name, UserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/user:User", name, args == null ? UserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private User(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/user:User", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "password"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static User get(String name, Output<String> id, @Nullable UserState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, state, options);
    }
}
