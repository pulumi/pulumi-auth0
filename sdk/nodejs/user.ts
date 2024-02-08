// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * With this resource, you can manage user identities, including resetting passwords, and creating, provisioning, blocking, and deleting users.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const user = new auth0.User("user", {
 *     connectionName: "Username-Password-Authentication",
 *     email: "test@test.com",
 *     emailVerified: true,
 *     nickname: "some.nickname",
 *     password: "passpass$12$12",
 *     picture: "https://www.example.com/a-valid-picture-url.jpg",
 *     userId: "12345",
 *     username: "unique_username",
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported using the user ID.
 *
 * # 
 *
 *  Example:
 *
 * ```sh
 * $ pulumi import auth0:index/user:User user "auth0|111111111111111111111111"
 * ```
 */
export class User extends pulumi.CustomResource {
    /**
     * Get an existing User resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserState, opts?: pulumi.CustomResourceOptions): User {
        return new User(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/user:User';

    /**
     * Returns true if the given object is an instance of User.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is User {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === User.__pulumiType;
    }

    /**
     * Custom fields that store info about the user that impact the user's core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
     */
    public readonly appMetadata!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether the user is blocked or not.
     */
    public readonly blocked!: pulumi.Output<boolean | undefined>;
    /**
     * Name of the connection from which the user information was sourced.
     */
    public readonly connectionName!: pulumi.Output<string>;
    /**
     * Email address of the user.
     */
    public readonly email!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether the email address has been verified.
     */
    public readonly emailVerified!: pulumi.Output<boolean | undefined>;
    /**
     * Family name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     */
    public readonly familyName!: pulumi.Output<string | undefined>;
    /**
     * Given name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     */
    public readonly givenName!: pulumi.Output<string | undefined>;
    /**
     * Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Preferred nickname or alias of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     */
    public readonly nickname!: pulumi.Output<string>;
    /**
     * Initial password for this user. Required for non-passwordless connections (SMS and email).
     */
    public readonly password!: pulumi.Output<string | undefined>;
    /**
     * Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
     */
    public readonly phoneNumber!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether the phone number has been verified.
     */
    public readonly phoneVerified!: pulumi.Output<boolean | undefined>;
    /**
     * Picture of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     */
    public readonly picture!: pulumi.Output<string>;
    /**
     * ID of the user.
     */
    public readonly userId!: pulumi.Output<string>;
    /**
     * Custom fields that store info about the user that does not impact a user's core functionality. Examples include work address, home address, and user preferences.
     */
    public readonly userMetadata!: pulumi.Output<string | undefined>;
    /**
     * Username of the user. Only valid if the connection requires a username.
     */
    public readonly username!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether the user will receive a verification email after creation. Overrides behavior of `emailVerified` parameter.
     */
    public readonly verifyEmail!: pulumi.Output<boolean | undefined>;

    /**
     * Create a User resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserArgs | UserState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserState | undefined;
            resourceInputs["appMetadata"] = state ? state.appMetadata : undefined;
            resourceInputs["blocked"] = state ? state.blocked : undefined;
            resourceInputs["connectionName"] = state ? state.connectionName : undefined;
            resourceInputs["email"] = state ? state.email : undefined;
            resourceInputs["emailVerified"] = state ? state.emailVerified : undefined;
            resourceInputs["familyName"] = state ? state.familyName : undefined;
            resourceInputs["givenName"] = state ? state.givenName : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nickname"] = state ? state.nickname : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["phoneNumber"] = state ? state.phoneNumber : undefined;
            resourceInputs["phoneVerified"] = state ? state.phoneVerified : undefined;
            resourceInputs["picture"] = state ? state.picture : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
            resourceInputs["userMetadata"] = state ? state.userMetadata : undefined;
            resourceInputs["username"] = state ? state.username : undefined;
            resourceInputs["verifyEmail"] = state ? state.verifyEmail : undefined;
        } else {
            const args = argsOrState as UserArgs | undefined;
            if ((!args || args.connectionName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionName'");
            }
            resourceInputs["appMetadata"] = args ? args.appMetadata : undefined;
            resourceInputs["blocked"] = args ? args.blocked : undefined;
            resourceInputs["connectionName"] = args ? args.connectionName : undefined;
            resourceInputs["email"] = args ? args.email : undefined;
            resourceInputs["emailVerified"] = args ? args.emailVerified : undefined;
            resourceInputs["familyName"] = args ? args.familyName : undefined;
            resourceInputs["givenName"] = args ? args.givenName : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nickname"] = args ? args.nickname : undefined;
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["phoneNumber"] = args ? args.phoneNumber : undefined;
            resourceInputs["phoneVerified"] = args ? args.phoneVerified : undefined;
            resourceInputs["picture"] = args ? args.picture : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
            resourceInputs["userMetadata"] = args ? args.userMetadata : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
            resourceInputs["verifyEmail"] = args ? args.verifyEmail : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(User.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering User resources.
 */
export interface UserState {
    /**
     * Custom fields that store info about the user that impact the user's core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
     */
    appMetadata?: pulumi.Input<string>;
    /**
     * Indicates whether the user is blocked or not.
     */
    blocked?: pulumi.Input<boolean>;
    /**
     * Name of the connection from which the user information was sourced.
     */
    connectionName?: pulumi.Input<string>;
    /**
     * Email address of the user.
     */
    email?: pulumi.Input<string>;
    /**
     * Indicates whether the email address has been verified.
     */
    emailVerified?: pulumi.Input<boolean>;
    /**
     * Family name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     */
    familyName?: pulumi.Input<string>;
    /**
     * Given name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     */
    givenName?: pulumi.Input<string>;
    /**
     * Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     */
    name?: pulumi.Input<string>;
    /**
     * Preferred nickname or alias of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     */
    nickname?: pulumi.Input<string>;
    /**
     * Initial password for this user. Required for non-passwordless connections (SMS and email).
     */
    password?: pulumi.Input<string>;
    /**
     * Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
     */
    phoneNumber?: pulumi.Input<string>;
    /**
     * Indicates whether the phone number has been verified.
     */
    phoneVerified?: pulumi.Input<boolean>;
    /**
     * Picture of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     */
    picture?: pulumi.Input<string>;
    /**
     * ID of the user.
     */
    userId?: pulumi.Input<string>;
    /**
     * Custom fields that store info about the user that does not impact a user's core functionality. Examples include work address, home address, and user preferences.
     */
    userMetadata?: pulumi.Input<string>;
    /**
     * Username of the user. Only valid if the connection requires a username.
     */
    username?: pulumi.Input<string>;
    /**
     * Indicates whether the user will receive a verification email after creation. Overrides behavior of `emailVerified` parameter.
     */
    verifyEmail?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a User resource.
 */
export interface UserArgs {
    /**
     * Custom fields that store info about the user that impact the user's core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
     */
    appMetadata?: pulumi.Input<string>;
    /**
     * Indicates whether the user is blocked or not.
     */
    blocked?: pulumi.Input<boolean>;
    /**
     * Name of the connection from which the user information was sourced.
     */
    connectionName: pulumi.Input<string>;
    /**
     * Email address of the user.
     */
    email?: pulumi.Input<string>;
    /**
     * Indicates whether the email address has been verified.
     */
    emailVerified?: pulumi.Input<boolean>;
    /**
     * Family name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     */
    familyName?: pulumi.Input<string>;
    /**
     * Given name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     */
    givenName?: pulumi.Input<string>;
    /**
     * Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     */
    name?: pulumi.Input<string>;
    /**
     * Preferred nickname or alias of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     */
    nickname?: pulumi.Input<string>;
    /**
     * Initial password for this user. Required for non-passwordless connections (SMS and email).
     */
    password?: pulumi.Input<string>;
    /**
     * Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
     */
    phoneNumber?: pulumi.Input<string>;
    /**
     * Indicates whether the phone number has been verified.
     */
    phoneVerified?: pulumi.Input<boolean>;
    /**
     * Picture of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
     */
    picture?: pulumi.Input<string>;
    /**
     * ID of the user.
     */
    userId?: pulumi.Input<string>;
    /**
     * Custom fields that store info about the user that does not impact a user's core functionality. Examples include work address, home address, and user preferences.
     */
    userMetadata?: pulumi.Input<string>;
    /**
     * Username of the user. Only valid if the connection requires a username.
     */
    username?: pulumi.Input<string>;
    /**
     * Indicates whether the user will receive a verification email after creation. Overrides behavior of `emailVerified` parameter.
     */
    verifyEmail?: pulumi.Input<boolean>;
}
