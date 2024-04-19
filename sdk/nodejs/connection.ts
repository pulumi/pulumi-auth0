// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * With Auth0, you can define sources of users, otherwise known as connections, which may include identity providers (such as Google or LinkedIn), databases, or passwordless authentication methods. This resource allows you to configure and manage connections to be used with your clients and users.
 *
 * > The Auth0 dashboard displays only one connection per social provider. Although the Auth0 Management API allows the
 * creation of multiple connections per strategy, the additional connections may not be visible in the Auth0 dashboard.
 *
 * ## Example Usage
 *
 * ### Auth0 Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // This is an example of an Auth0 connection.
 * const myConnection = new auth0.Connection("my_connection", {
 *     name: "Example-Connection",
 *     isDomainConnection: true,
 *     strategy: "auth0",
 *     metadata: {
 *         key1: "foo",
 *         key2: "bar",
 *     },
 *     options: {
 *         passwordPolicy: "excellent",
 *         bruteForceProtection: true,
 *         enabledDatabaseCustomization: true,
 *         importMode: false,
 *         requiresUsername: true,
 *         disableSignup: false,
 *         customScripts: {
 *             get_user: `        function getByEmail(email, callback) {
 *           return callback(new Error("Whoops!"));
 *         }
 * `,
 *         },
 *         configuration: {
 *             foo: "bar",
 *             bar: "baz",
 *         },
 *         upstreamParams: JSON.stringify({
 *             screen_name: {
 *                 alias: "login_hint",
 *             },
 *         }),
 *         passwordHistories: [{
 *             enable: true,
 *             size: 3,
 *         }],
 *         passwordNoPersonalInfo: {
 *             enable: true,
 *         },
 *         passwordDictionary: {
 *             enable: true,
 *             dictionaries: [
 *                 "password",
 *                 "admin",
 *                 "1234",
 *             ],
 *         },
 *         passwordComplexityOptions: {
 *             minLength: 12,
 *         },
 *         validation: {
 *             username: {
 *                 min: 10,
 *                 max: 40,
 *             },
 *         },
 *         mfa: {
 *             active: true,
 *             returnEnrollSettings: true,
 *         },
 *     },
 * });
 * ```
 *
 * ### Google OAuth2 Connection
 *
 * > Your Auth0 account may be pre-configured with a `google-oauth2` connection.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // This is an example of a Google OAuth2 connection.
 * const googleOauth2 = new auth0.Connection("google_oauth2", {
 *     name: "Google-OAuth2-Connection",
 *     strategy: "google-oauth2",
 *     options: {
 *         clientId: "<client-id>",
 *         clientSecret: "<client-secret>",
 *         allowedAudiences: [
 *             "example.com",
 *             "api.example.com",
 *         ],
 *         scopes: [
 *             "email",
 *             "profile",
 *             "gmail",
 *             "youtube",
 *         ],
 *         setUserRootAttributes: "on_each_login",
 *         nonPersistentAttrs: [
 *             "ethnicity",
 *             "gender",
 *         ],
 *     },
 * });
 * ```
 *
 * ### Google Apps
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const googleApps = new auth0.Connection("google_apps", {
 *     name: "connection-google-apps",
 *     isDomainConnection: false,
 *     strategy: "google-apps",
 *     showAsButton: false,
 *     options: {
 *         clientId: "",
 *         clientSecret: "",
 *         domain: "example.com",
 *         tenantDomain: "example.com",
 *         domainAliases: [
 *             "example.com",
 *             "api.example.com",
 *         ],
 *         apiEnableUsers: true,
 *         scopes: [
 *             "ext_profile",
 *             "ext_groups",
 *         ],
 *         iconUrl: "https://example.com/assets/logo.png",
 *         upstreamParams: JSON.stringify({
 *             screen_name: {
 *                 alias: "login_hint",
 *             },
 *         }),
 *         setUserRootAttributes: "on_each_login",
 *         nonPersistentAttrs: [
 *             "ethnicity",
 *             "gender",
 *         ],
 *     },
 * });
 * ```
 *
 * ### Facebook Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // This is an example of a Facebook connection.
 * const facebook = new auth0.Connection("facebook", {
 *     name: "Facebook-Connection",
 *     strategy: "facebook",
 *     options: {
 *         clientId: "<client-id>",
 *         clientSecret: "<client-secret>",
 *         scopes: [
 *             "public_profile",
 *             "email",
 *             "groups_access_member_info",
 *             "user_birthday",
 *         ],
 *         setUserRootAttributes: "on_each_login",
 *         nonPersistentAttrs: [
 *             "ethnicity",
 *             "gender",
 *         ],
 *     },
 * });
 * ```
 *
 * ### Apple Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // This is an example of an Apple connection.
 * const apple = new auth0.Connection("apple", {
 *     name: "Apple-Connection",
 *     strategy: "apple",
 *     options: {
 *         clientId: "<client-id>",
 *         clientSecret: `-----BEGIN PRIVATE KEY-----
 * MIHBAgEAMA0GCSqGSIb3DQEBAQUABIGsMIGpAgEAA
 * -----END PRIVATE KEY-----`,
 *         teamId: "<team-id>",
 *         keyId: "<key-id>",
 *         scopes: [
 *             "email",
 *             "name",
 *         ],
 *         setUserRootAttributes: "on_first_login",
 *         nonPersistentAttrs: [
 *             "ethnicity",
 *             "gender",
 *         ],
 *     },
 * });
 * ```
 *
 * ### LinkedIn Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // This is an example of an LinkedIn connection.
 * const linkedin = new auth0.Connection("linkedin", {
 *     name: "Linkedin-Connection",
 *     strategy: "linkedin",
 *     options: {
 *         clientId: "<client-id>",
 *         clientSecret: "<client-secret>",
 *         strategyVersion: 2,
 *         scopes: [
 *             "basic_profile",
 *             "profile",
 *             "email",
 *         ],
 *         setUserRootAttributes: "on_each_login",
 *         nonPersistentAttrs: [
 *             "ethnicity",
 *             "gender",
 *         ],
 *     },
 * });
 * ```
 *
 * ### GitHub Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // This is an example of an GitHub connection.
 * const github = new auth0.Connection("github", {
 *     name: "GitHub-Connection",
 *     strategy: "github",
 *     options: {
 *         clientId: "<client-id>",
 *         clientSecret: "<client-secret>",
 *         scopes: [
 *             "email",
 *             "profile",
 *             "public_repo",
 *             "repo",
 *         ],
 *         setUserRootAttributes: "on_each_login",
 *         nonPersistentAttrs: [
 *             "ethnicity",
 *             "gender",
 *         ],
 *     },
 * });
 * ```
 *
 * ### SalesForce Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // This is an example of an SalesForce connection.
 * const salesforce = new auth0.Connection("salesforce", {
 *     name: "Salesforce-Connection",
 *     strategy: "salesforce",
 *     options: {
 *         clientId: "<client-id>",
 *         clientSecret: "<client-secret>",
 *         communityBaseUrl: "https://salesforce.example.com",
 *         scopes: [
 *             "openid",
 *             "email",
 *         ],
 *         setUserRootAttributes: "on_first_login",
 *         nonPersistentAttrs: [
 *             "ethnicity",
 *             "gender",
 *         ],
 *     },
 * });
 * ```
 *
 * ### OAuth2 Connection
 *
 * Also applies to following connection strategies: `dropbox`, `bitbucket`, `paypal`, `twitter`, `amazon`, `yahoo`, `box`, `wordpress`, `shopify`, `custom`
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // This is an example of an OAuth2 connection.
 * const oauth2 = new auth0.Connection("oauth2", {
 *     name: "OAuth2-Connection",
 *     strategy: "oauth2",
 *     options: {
 *         clientId: "<client-id>",
 *         clientSecret: "<client-secret>",
 *         scopes: [
 *             "basic_profile",
 *             "profile",
 *             "email",
 *         ],
 *         tokenEndpoint: "https://auth.example.com/oauth2/token",
 *         authorizationEndpoint: "https://auth.example.com/oauth2/authorize",
 *         pkceEnabled: true,
 *         iconUrl: "https://auth.example.com/assets/logo.png",
 *         scripts: {
 *             fetchUserProfile: `        function fetchUserProfile(accessToken, context, callback) {
 *           return callback(new Error("Whoops!"));
 *         }
 * `,
 *         },
 *         setUserRootAttributes: "on_each_login",
 *         nonPersistentAttrs: [
 *             "ethnicity",
 *             "gender",
 *         ],
 *     },
 * });
 * ```
 *
 * ### Active Directory (AD)
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const ad = new auth0.Connection("ad", {
 *     name: "connection-active-directory",
 *     displayName: "Active Directory Connection",
 *     strategy: "ad",
 *     showAsButton: true,
 *     options: {
 *         disableSelfServiceChangePassword: true,
 *         bruteForceProtection: true,
 *         tenantDomain: "example.com",
 *         iconUrl: "https://example.com/assets/logo.png",
 *         domainAliases: [
 *             "example.com",
 *             "api.example.com",
 *         ],
 *         ips: [
 *             "192.168.1.1",
 *             "192.168.1.2",
 *         ],
 *         setUserRootAttributes: "on_each_login",
 *         nonPersistentAttrs: [
 *             "ethnicity",
 *             "gender",
 *         ],
 *         upstreamParams: JSON.stringify({
 *             screen_name: {
 *                 alias: "login_hint",
 *             },
 *         }),
 *         useCertAuth: false,
 *         useKerberos: false,
 *         disableCache: false,
 *     },
 * });
 * ```
 *
 * ### Azure AD Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const azureAd = new auth0.Connection("azure_ad", {
 *     name: "connection-azure-ad",
 *     strategy: "waad",
 *     showAsButton: true,
 *     options: {
 *         identityApi: "azure-active-directory-v1.0",
 *         clientId: "123456",
 *         clientSecret: "123456",
 *         appId: "app-id-123",
 *         tenantDomain: "example.onmicrosoft.com",
 *         domain: "example.onmicrosoft.com",
 *         domainAliases: [
 *             "example.com",
 *             "api.example.com",
 *         ],
 *         iconUrl: "https://example.onmicrosoft.com/assets/logo.png",
 *         useWsfed: false,
 *         waadProtocol: "openid-connect",
 *         waadCommonEndpoint: false,
 *         maxGroupsToRetrieve: "250",
 *         apiEnableUsers: true,
 *         scopes: [
 *             "basic_profile",
 *             "ext_groups",
 *             "ext_profile",
 *         ],
 *         setUserRootAttributes: "on_each_login",
 *         shouldTrustEmailVerifiedConnection: "never_set_emails_as_verified",
 *         upstreamParams: JSON.stringify({
 *             screen_name: {
 *                 alias: "login_hint",
 *             },
 *         }),
 *         nonPersistentAttrs: [
 *             "ethnicity",
 *             "gender",
 *         ],
 *     },
 * });
 * ```
 *
 * ### Email Connection
 *
 * > To be able to see this in the management dashboard as well, the name of the connection must be set to "email".
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // This is an example of an Email connection.
 * const passwordlessEmail = new auth0.Connection("passwordless_email", {
 *     strategy: "email",
 *     name: "email",
 *     options: {
 *         name: "email",
 *         from: "{{ application.name }} <root@auth0.com>",
 *         subject: "Welcome to {{ application.name }}",
 *         syntax: "liquid",
 *         template: "<html>This is the body of the email</html>",
 *         disableSignup: false,
 *         bruteForceProtection: true,
 *         setUserRootAttributes: "on_each_login",
 *         nonPersistentAttrs: [],
 *         authParams: {
 *             scope: "openid email profile offline_access",
 *             response_type: "code",
 *         },
 *         totp: {
 *             timeStep: 300,
 *             length: 6,
 *         },
 *     },
 * });
 * ```
 *
 * ### SAML Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // This is an example of a SAML connection.
 * const samlp = new auth0.Connection("samlp", {
 *     name: "SAML-Connection",
 *     strategy: "samlp",
 *     options: {
 *         debug: false,
 *         signingCert: "<signing-certificate>",
 *         signInEndpoint: "https://saml.provider/sign_in",
 *         signOutEndpoint: "https://saml.provider/sign_out",
 *         disableSignOut: true,
 *         tenantDomain: "example.com",
 *         domainAliases: [
 *             "example.com",
 *             "alias.example.com",
 *         ],
 *         protocolBinding: "urn:oasis:names:tc:SAML:2.0:bindings:HTTP-POST",
 *         requestTemplate: `<samlp:AuthnRequest xmlns:samlp="urn:oasis:names:tc:SAML:2.0:protocol"
 * @@AssertServiceURLAndDestination@@
 *     ID="@@ID@@"
 *     IssueInstant="@@IssueInstant@@"
 *     ProtocolBinding="@@ProtocolBinding@@" Version="2.0">
 *     <saml:Issuer xmlns:saml="urn:oasis:names:tc:SAML:2.0:assertion">@@Issuer@@</saml:Issuer>
 * </samlp:AuthnRequest>`,
 *         userIdAttribute: "https://saml.provider/imi/ns/identity-200810",
 *         signatureAlgorithm: "rsa-sha256",
 *         digestAlgorithm: "sha256",
 *         iconUrl: "https://saml.provider/assets/logo.png",
 *         entityId: "<entity_id>",
 *         metadataXml: `    <?xml version="1.0"?>
 *     <md:EntityDescriptor xmlns:md="urn:oasis:names:tc:SAML:2.0:metadata" xmlns:ds="http://www.w3.org/2000/09/xmldsig#" entityID="https://example.com">
 *       <md:IDPSSODescriptor protocolSupportEnumeration="urn:oasis:names:tc:SAML:2.0:protocol">
 *         <md:SingleLogoutService Binding="urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect" Location="https://saml.provider/sign_out"/>
 *         <md:SingleSignOnService Binding="urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect" Location="https://saml.provider/sign_in"/>
 *       </md:IDPSSODescriptor>
 *     </md:EntityDescriptor>
 * `,
 *         metadataUrl: "https://saml.provider/imi/ns/FederationMetadata.xml",
 *         fieldsMap: JSON.stringify({
 *             name: [
 *                 "name",
 *                 "nameidentifier",
 *             ],
 *             email: [
 *                 "emailaddress",
 *                 "nameidentifier",
 *             ],
 *             family_name: "surname",
 *         }),
 *         signingKey: {
 *             key: `-----BEGIN PRIVATE KEY-----
 * ...{your private key here}...
 * -----END PRIVATE KEY-----`,
 *             cert: `-----BEGIN CERTIFICATE-----
 * ...{your public key cert here}...
 * -----END CERTIFICATE-----`,
 *         },
 *         decryptionKey: {
 *             key: `-----BEGIN PRIVATE KEY-----
 * ...{your private key here}...
 * -----END PRIVATE KEY-----`,
 *             cert: `-----BEGIN CERTIFICATE-----
 * ...{your public key cert here}...
 * -----END CERTIFICATE-----`,
 *         },
 *         idpInitiated: {
 *             clientId: "client_id",
 *             clientProtocol: "samlp",
 *             clientAuthorizeQuery: "type=code&timeout=30",
 *         },
 *     },
 * });
 * ```
 *
 * ### WindowsLive Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // This is an example of a WindowsLive connection.
 * const windowslive = new auth0.Connection("windowslive", {
 *     name: "Windowslive-Connection",
 *     strategy: "windowslive",
 *     options: {
 *         clientId: "<client-id>",
 *         clientSecret: "<client-secret>",
 *         strategyVersion: 2,
 *         scopes: [
 *             "signin",
 *             "graph_user",
 *         ],
 *         setUserRootAttributes: "on_first_login",
 *         nonPersistentAttrs: [
 *             "ethnicity",
 *             "gender",
 *         ],
 *     },
 * });
 * ```
 *
 * ### OIDC Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // This is an example of an OIDC connection.
 * const oidc = new auth0.Connection("oidc", {
 *     name: "oidc-connection",
 *     displayName: "OIDC Connection",
 *     strategy: "oidc",
 *     showAsButton: false,
 *     options: {
 *         clientId: "1234567",
 *         clientSecret: "1234567",
 *         domainAliases: ["example.com"],
 *         tenantDomain: "",
 *         iconUrl: "https://example.com/assets/logo.png",
 *         type: "back_channel",
 *         issuer: "https://www.paypalobjects.com",
 *         jwksUri: "https://api.paypal.com/v1/oauth2/certs",
 *         discoveryUrl: "https://www.paypalobjects.com/.well-known/openid-configuration",
 *         tokenEndpoint: "https://api.paypal.com/v1/oauth2/token",
 *         userinfoEndpoint: "https://api.paypal.com/v1/oauth2/token/userinfo",
 *         authorizationEndpoint: "https://www.paypal.com/signin/authorize",
 *         scopes: [
 *             "openid",
 *             "email",
 *         ],
 *         setUserRootAttributes: "on_first_login",
 *         nonPersistentAttrs: [
 *             "ethnicity",
 *             "gender",
 *         ],
 *         connectionSettings: {
 *             pkce: "auto",
 *         },
 *         attributeMap: {
 *             mappingMode: "use_map",
 *             userinfoScope: "openid email profile groups",
 *             attributes: JSON.stringify({
 *                 name: "${context.tokenset.name}",
 *                 email: "${context.tokenset.email}",
 *                 email_verified: "${context.tokenset.email_verified}",
 *                 nickname: "${context.tokenset.nickname}",
 *                 picture: "${context.tokenset.picture}",
 *                 given_name: "${context.tokenset.given_name}",
 *                 family_name: "${context.tokenset.family_name}",
 *             }),
 *         },
 *     },
 * });
 * ```
 *
 * ### Okta Connection
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // This is an example of an Okta Workforce connection.
 * const okta = new auth0.Connection("okta", {
 *     name: "okta-connection",
 *     displayName: "Okta Workforce Connection",
 *     strategy: "okta",
 *     showAsButton: false,
 *     options: {
 *         clientId: "1234567",
 *         clientSecret: "1234567",
 *         domain: "example.okta.com",
 *         domainAliases: ["example.com"],
 *         issuer: "https://example.okta.com",
 *         jwksUri: "https://example.okta.com/oauth2/v1/keys",
 *         tokenEndpoint: "https://example.okta.com/oauth2/v1/token",
 *         userinfoEndpoint: "https://example.okta.com/oauth2/v1/userinfo",
 *         authorizationEndpoint: "https://example.okta.com/oauth2/v1/authorize",
 *         scopes: [
 *             "openid",
 *             "email",
 *         ],
 *         setUserRootAttributes: "on_first_login",
 *         nonPersistentAttrs: [
 *             "ethnicity",
 *             "gender",
 *         ],
 *         upstreamParams: JSON.stringify({
 *             screen_name: {
 *                 alias: "login_hint",
 *             },
 *         }),
 *         connectionSettings: {
 *             pkce: "auto",
 *         },
 *         attributeMap: {
 *             mappingMode: "basic_profile",
 *             userinfoScope: "openid email profile groups",
 *             attributes: JSON.stringify({
 *                 name: "${context.tokenset.name}",
 *                 email: "${context.tokenset.email}",
 *                 email_verified: "${context.tokenset.email_verified}",
 *                 nickname: "${context.tokenset.nickname}",
 *                 picture: "${context.tokenset.picture}",
 *                 given_name: "${context.tokenset.given_name}",
 *                 family_name: "${context.tokenset.family_name}",
 *             }),
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported by specifying the connection ID.
 *
 * # 
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/connection:Connection google "con_a17f21fdb24d48a0"
 * ```
 */
export class Connection extends pulumi.CustomResource {
    /**
     * Get an existing Connection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectionState, opts?: pulumi.CustomResourceOptions): Connection {
        return new Connection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/connection:Connection';

    /**
     * Returns true if the given object is an instance of Connection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Connection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Connection.__pulumiType;
    }

    /**
     * Name used in login screen.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether the connection is domain level.
     */
    public readonly isDomainConnection!: pulumi.Output<boolean>;
    /**
     * Metadata associated with the connection, in the form of a map of string values (max 255 chars).
     */
    public readonly metadata!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The public name of the email or SMS Connection. In most cases this is the same name as the connection name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Configuration settings for connection options.
     */
    public readonly options!: pulumi.Output<outputs.ConnectionOptions>;
    /**
     * Defines the realms for which the connection will be used (e.g., email domains). If not specified, the connection name is added as the realm.
     */
    public readonly realms!: pulumi.Output<string[]>;
    /**
     * Display connection as a button. Only available on enterprise connections.
     */
    public readonly showAsButton!: pulumi.Output<boolean | undefined>;
    /**
     * Type of the connection, which indicates the identity provider.
     */
    public readonly strategy!: pulumi.Output<string>;

    /**
     * Create a Connection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectionArgs | ConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectionState | undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["isDomainConnection"] = state ? state.isDomainConnection : undefined;
            resourceInputs["metadata"] = state ? state.metadata : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["options"] = state ? state.options : undefined;
            resourceInputs["realms"] = state ? state.realms : undefined;
            resourceInputs["showAsButton"] = state ? state.showAsButton : undefined;
            resourceInputs["strategy"] = state ? state.strategy : undefined;
        } else {
            const args = argsOrState as ConnectionArgs | undefined;
            if ((!args || args.strategy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'strategy'");
            }
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["isDomainConnection"] = args ? args.isDomainConnection : undefined;
            resourceInputs["metadata"] = args ? args.metadata : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["options"] = args ? args.options : undefined;
            resourceInputs["realms"] = args ? args.realms : undefined;
            resourceInputs["showAsButton"] = args ? args.showAsButton : undefined;
            resourceInputs["strategy"] = args ? args.strategy : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Connection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Connection resources.
 */
export interface ConnectionState {
    /**
     * Name used in login screen.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Indicates whether the connection is domain level.
     */
    isDomainConnection?: pulumi.Input<boolean>;
    /**
     * Metadata associated with the connection, in the form of a map of string values (max 255 chars).
     */
    metadata?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The public name of the email or SMS Connection. In most cases this is the same name as the connection name.
     */
    name?: pulumi.Input<string>;
    /**
     * Configuration settings for connection options.
     */
    options?: pulumi.Input<inputs.ConnectionOptions>;
    /**
     * Defines the realms for which the connection will be used (e.g., email domains). If not specified, the connection name is added as the realm.
     */
    realms?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Display connection as a button. Only available on enterprise connections.
     */
    showAsButton?: pulumi.Input<boolean>;
    /**
     * Type of the connection, which indicates the identity provider.
     */
    strategy?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Connection resource.
 */
export interface ConnectionArgs {
    /**
     * Name used in login screen.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Indicates whether the connection is domain level.
     */
    isDomainConnection?: pulumi.Input<boolean>;
    /**
     * Metadata associated with the connection, in the form of a map of string values (max 255 chars).
     */
    metadata?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The public name of the email or SMS Connection. In most cases this is the same name as the connection name.
     */
    name?: pulumi.Input<string>;
    /**
     * Configuration settings for connection options.
     */
    options?: pulumi.Input<inputs.ConnectionOptions>;
    /**
     * Defines the realms for which the connection will be used (e.g., email domains). If not specified, the connection name is added as the realm.
     */
    realms?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Display connection as a button. Only available on enterprise connections.
     */
    showAsButton?: pulumi.Input<boolean>;
    /**
     * Type of the connection, which indicates the identity provider.
     */
    strategy: pulumi.Input<string>;
}
