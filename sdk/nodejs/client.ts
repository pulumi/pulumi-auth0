// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * With this resource, you can set up applications that use Auth0 for authentication and configure allowed callback URLs and secrets for these applications.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myClient = new auth0.Client("myClient", {
 *     addons: {
 *         samlp: {
 *             audience: "https://example.com/saml",
 *             createUpnClaim: false,
 *             issuer: "https://example.com",
 *             mapIdentities: false,
 *             mapUnknownClaimsAsIs: false,
 *             mappings: {
 *                 email: "http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress",
 *                 name: "http://schemas.xmlsoap.org/ws/2005/05/identity/claims/name",
 *             },
 *             nameIdentifierFormat: "urn:oasis:names:tc:SAML:2.0:nameid-format:persistent",
 *             nameIdentifierProbes: ["http://schemas.xmlsoap.org/ws/2005/05/identity/claims/emailaddress"],
 *             passthroughClaimsWithNoMapping: false,
 *             signingCert: `-----BEGIN PUBLIC KEY-----
 * MIGf...bpP/t3
 * +JGNGIRMj1hF1rnb6QIDAQAB
 * -----END PUBLIC KEY-----
 *
 * `,
 *         },
 *     },
 *     allowedLogoutUrls: ["https://example.com"],
 *     allowedOrigins: ["https://example.com"],
 *     appType: "non_interactive",
 *     callbacks: ["https://example.com/callback"],
 *     clientMetadata: {
 *         foo: "zoo",
 *     },
 *     customLoginPageOn: true,
 *     description: "Test Applications Long Description",
 *     grantTypes: [
 *         "authorization_code",
 *         "http://auth0.com/oauth/grant-type/password-realm",
 *         "implicit",
 *         "password",
 *         "refresh_token",
 *     ],
 *     isFirstParty: true,
 *     isTokenEndpointIpHeaderTrusted: true,
 *     jwtConfiguration: {
 *         alg: "RS256",
 *         lifetimeInSeconds: 300,
 *         scopes: {
 *             foo: "bar",
 *         },
 *         secretEncoded: true,
 *     },
 *     mobile: {
 *         ios: {
 *             appBundleIdentifier: "com.my.bundle.id",
 *             teamId: "9JA89QQLNQ",
 *         },
 *     },
 *     oidcConformant: false,
 *     refreshToken: {
 *         expirationType: "expiring",
 *         leeway: 0,
 *         rotationType: "rotating",
 *         tokenLifetime: 2592000,
 *     },
 *     webOrigins: ["https://example.com"],
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported by specifying the client ID.
 *
 * # 
 *
 *  Example:
 *
 * ```sh
 * $ pulumi import auth0:index/client:Client my_client "AaiyAPdpYdesoKnqjj8HJqRn4T5titww"
 * ```
 */
export class Client extends pulumi.CustomResource {
    /**
     * Get an existing Client resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClientState, opts?: pulumi.CustomResourceOptions): Client {
        return new Client(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/client:Client';

    /**
     * Returns true if the given object is an instance of Client.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Client {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Client.__pulumiType;
    }

    /**
     * Addons enabled for this client and their associated configurations.
     */
    public readonly addons!: pulumi.Output<outputs.ClientAddons | undefined>;
    /**
     * List of applications ID's that will be allowed to make delegation request. By default, all applications will be allowed.
     */
    public readonly allowedClients!: pulumi.Output<string[] | undefined>;
    /**
     * URLs that Auth0 may redirect to after logout.
     */
    public readonly allowedLogoutUrls!: pulumi.Output<string[] | undefined>;
    /**
     * URLs that represent valid origins for cross-origin resource sharing. By default, all your callback URLs will be allowed.
     */
    public readonly allowedOrigins!: pulumi.Output<string[] | undefined>;
    /**
     * Type of application the client represents. Possible values are: `native`, `spa`, `regularWeb`, `nonInteractive`, `ssoIntegration`. Specific SSO integrations types accepted as well are: `rms`, `box`, `cloudbees`, `concur`, `dropbox`, `mscrm`, `echosign`, `egnyte`, `newrelic`, `office365`, `salesforce`, `sentry`, `sharepoint`, `slack`, `springcm`, `zendesk`, `zoom`.
     */
    public readonly appType!: pulumi.Output<string | undefined>;
    /**
     * URLs that Auth0 may call back to after a user authenticates for the client. Make sure to specify the protocol (https://) otherwise the callback may fail in some cases. With the exception of custom URI schemes for native clients, all callbacks should use protocol https://.
     */
    public readonly callbacks!: pulumi.Output<string[] | undefined>;
    /**
     * List of audiences/realms for SAML protocol. Used by the wsfed addon.
     */
    public readonly clientAliases!: pulumi.Output<string[] | undefined>;
    /**
     * Consumer Key assigned by Salesforce to the Connected App.
     */
    public /*out*/ readonly clientId!: pulumi.Output<string>;
    /**
     * Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?"/\()<>@ [Tab] [Space]`.
     */
    public readonly clientMetadata!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * Whether this client can be used to make cross-origin authentication requests (`true`) or it is not allowed to make such requests (`false`).
     */
    public readonly crossOriginAuth!: pulumi.Output<boolean | undefined>;
    /**
     * URL of the location in your site where the cross-origin verification takes place for the cross-origin auth flow when performing authentication in your own domain instead of Auth0 Universal Login page.
     */
    public readonly crossOriginLoc!: pulumi.Output<string | undefined>;
    /**
     * The content (HTML, CSS, JS) of the custom login page.
     */
    public readonly customLoginPage!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether a custom login page is to be used.
     */
    public readonly customLoginPageOn!: pulumi.Output<boolean>;
    /**
     * Description of the purpose of the client.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Encryption used for WS-Fed responses with this client.
     */
    public readonly encryptionKey!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * HTML form template to be used for WS-Federation.
     */
    public readonly formTemplate!: pulumi.Output<string | undefined>;
    /**
     * Types of grants that this client is authorized to use.
     */
    public readonly grantTypes!: pulumi.Output<string[]>;
    /**
     * Initiate login URI. Must be HTTPS or an empty string.
     */
    public readonly initiateLoginUri!: pulumi.Output<string | undefined>;
    /**
     * Indicates whether this client is a first-party client.
     */
    public readonly isFirstParty!: pulumi.Output<boolean>;
    /**
     * Indicates whether the token endpoint IP header is trusted. Requires the authentication method to be set to `clientSecretPost` or `clientSecretBasic`. Setting this property when creating the resource, will default the authentication method to `clientSecretPost`. To change the authentication method to `clientSecretBasic` use the `auth0.ClientCredentials` resource.
     */
    public readonly isTokenEndpointIpHeaderTrusted!: pulumi.Output<boolean>;
    /**
     * Configuration settings for the JWTs issued for this client.
     */
    public readonly jwtConfiguration!: pulumi.Output<outputs.ClientJwtConfiguration>;
    /**
     * URL of the logo for the client. Recommended size is 150px x 150px. If none is set, the default badge for the application type will be shown.
     */
    public readonly logoUri!: pulumi.Output<string | undefined>;
    /**
     * Additional configuration for native mobile apps.
     */
    public readonly mobile!: pulumi.Output<outputs.ClientMobile>;
    /**
     * SSO integration name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Configuration settings to toggle native social login for mobile native applications. Once this is set it must stay set, with both resources set to `false` in order to change the `appType`.
     */
    public readonly nativeSocialLogin!: pulumi.Output<outputs.ClientNativeSocialLogin>;
    /**
     * Set of URLs that are valid to call back from Auth0 for OIDC backchannel logout. Currently only one URL is allowed.
     */
    public readonly oidcBackchannelLogoutUrls!: pulumi.Output<string[] | undefined>;
    /**
     * Indicates whether this client will conform to strict OIDC specifications.
     */
    public readonly oidcConformant!: pulumi.Output<boolean>;
    /**
     * Defines how to proceed during an authentication transaction when `organizationUsage = "require"`. Can be `noPrompt` (default), `preLoginPrompt` or  `postLoginPrompt`.
     */
    public readonly organizationRequireBehavior!: pulumi.Output<string | undefined>;
    /**
     * Defines how to proceed during an authentication transaction with regards to an organization. Can be `deny` (default), `allow` or `require`.
     */
    public readonly organizationUsage!: pulumi.Output<string | undefined>;
    /**
     * Configuration settings for the refresh tokens issued for this client.
     */
    public readonly refreshToken!: pulumi.Output<outputs.ClientRefreshToken>;
    /**
     * Makes the use of Pushed Authorization Requests mandatory for this client. This feature currently needs to be enabled on the tenant in order to make use of it.
     */
    public readonly requirePushedAuthorizationRequests!: pulumi.Output<boolean | undefined>;
    /**
     * List containing a map of the public cert of the signing key and the public cert of the signing key in PKCS7.
     */
    public /*out*/ readonly signingKeys!: pulumi.Output<{[key: string]: any}[]>;
    /**
     * Applies only to SSO clients and determines whether Auth0 will handle Single Sign-On (true) or whether the identity provider will (false).
     */
    public readonly sso!: pulumi.Output<boolean | undefined>;
    /**
     * Indicates whether or not SSO is disabled.
     */
    public readonly ssoDisabled!: pulumi.Output<boolean | undefined>;
    /**
     * URLs that represent valid web origins for use with web message response mode.
     */
    public readonly webOrigins!: pulumi.Output<string[] | undefined>;

    /**
     * Create a Client resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ClientArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClientArgs | ClientState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClientState | undefined;
            resourceInputs["addons"] = state ? state.addons : undefined;
            resourceInputs["allowedClients"] = state ? state.allowedClients : undefined;
            resourceInputs["allowedLogoutUrls"] = state ? state.allowedLogoutUrls : undefined;
            resourceInputs["allowedOrigins"] = state ? state.allowedOrigins : undefined;
            resourceInputs["appType"] = state ? state.appType : undefined;
            resourceInputs["callbacks"] = state ? state.callbacks : undefined;
            resourceInputs["clientAliases"] = state ? state.clientAliases : undefined;
            resourceInputs["clientId"] = state ? state.clientId : undefined;
            resourceInputs["clientMetadata"] = state ? state.clientMetadata : undefined;
            resourceInputs["crossOriginAuth"] = state ? state.crossOriginAuth : undefined;
            resourceInputs["crossOriginLoc"] = state ? state.crossOriginLoc : undefined;
            resourceInputs["customLoginPage"] = state ? state.customLoginPage : undefined;
            resourceInputs["customLoginPageOn"] = state ? state.customLoginPageOn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["encryptionKey"] = state ? state.encryptionKey : undefined;
            resourceInputs["formTemplate"] = state ? state.formTemplate : undefined;
            resourceInputs["grantTypes"] = state ? state.grantTypes : undefined;
            resourceInputs["initiateLoginUri"] = state ? state.initiateLoginUri : undefined;
            resourceInputs["isFirstParty"] = state ? state.isFirstParty : undefined;
            resourceInputs["isTokenEndpointIpHeaderTrusted"] = state ? state.isTokenEndpointIpHeaderTrusted : undefined;
            resourceInputs["jwtConfiguration"] = state ? state.jwtConfiguration : undefined;
            resourceInputs["logoUri"] = state ? state.logoUri : undefined;
            resourceInputs["mobile"] = state ? state.mobile : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nativeSocialLogin"] = state ? state.nativeSocialLogin : undefined;
            resourceInputs["oidcBackchannelLogoutUrls"] = state ? state.oidcBackchannelLogoutUrls : undefined;
            resourceInputs["oidcConformant"] = state ? state.oidcConformant : undefined;
            resourceInputs["organizationRequireBehavior"] = state ? state.organizationRequireBehavior : undefined;
            resourceInputs["organizationUsage"] = state ? state.organizationUsage : undefined;
            resourceInputs["refreshToken"] = state ? state.refreshToken : undefined;
            resourceInputs["requirePushedAuthorizationRequests"] = state ? state.requirePushedAuthorizationRequests : undefined;
            resourceInputs["signingKeys"] = state ? state.signingKeys : undefined;
            resourceInputs["sso"] = state ? state.sso : undefined;
            resourceInputs["ssoDisabled"] = state ? state.ssoDisabled : undefined;
            resourceInputs["webOrigins"] = state ? state.webOrigins : undefined;
        } else {
            const args = argsOrState as ClientArgs | undefined;
            resourceInputs["addons"] = args ? args.addons : undefined;
            resourceInputs["allowedClients"] = args ? args.allowedClients : undefined;
            resourceInputs["allowedLogoutUrls"] = args ? args.allowedLogoutUrls : undefined;
            resourceInputs["allowedOrigins"] = args ? args.allowedOrigins : undefined;
            resourceInputs["appType"] = args ? args.appType : undefined;
            resourceInputs["callbacks"] = args ? args.callbacks : undefined;
            resourceInputs["clientAliases"] = args ? args.clientAliases : undefined;
            resourceInputs["clientMetadata"] = args ? args.clientMetadata : undefined;
            resourceInputs["crossOriginAuth"] = args ? args.crossOriginAuth : undefined;
            resourceInputs["crossOriginLoc"] = args ? args.crossOriginLoc : undefined;
            resourceInputs["customLoginPage"] = args ? args.customLoginPage : undefined;
            resourceInputs["customLoginPageOn"] = args ? args.customLoginPageOn : undefined;
            resourceInputs["description"] = (args ? args.description : undefined) ?? "Managed by Pulumi";
            resourceInputs["encryptionKey"] = args ? args.encryptionKey : undefined;
            resourceInputs["formTemplate"] = args ? args.formTemplate : undefined;
            resourceInputs["grantTypes"] = args ? args.grantTypes : undefined;
            resourceInputs["initiateLoginUri"] = args ? args.initiateLoginUri : undefined;
            resourceInputs["isFirstParty"] = args ? args.isFirstParty : undefined;
            resourceInputs["isTokenEndpointIpHeaderTrusted"] = args ? args.isTokenEndpointIpHeaderTrusted : undefined;
            resourceInputs["jwtConfiguration"] = args ? args.jwtConfiguration : undefined;
            resourceInputs["logoUri"] = args ? args.logoUri : undefined;
            resourceInputs["mobile"] = args ? args.mobile : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nativeSocialLogin"] = args ? args.nativeSocialLogin : undefined;
            resourceInputs["oidcBackchannelLogoutUrls"] = args ? args.oidcBackchannelLogoutUrls : undefined;
            resourceInputs["oidcConformant"] = args ? args.oidcConformant : undefined;
            resourceInputs["organizationRequireBehavior"] = args ? args.organizationRequireBehavior : undefined;
            resourceInputs["organizationUsage"] = args ? args.organizationUsage : undefined;
            resourceInputs["refreshToken"] = args ? args.refreshToken : undefined;
            resourceInputs["requirePushedAuthorizationRequests"] = args ? args.requirePushedAuthorizationRequests : undefined;
            resourceInputs["sso"] = args ? args.sso : undefined;
            resourceInputs["ssoDisabled"] = args ? args.ssoDisabled : undefined;
            resourceInputs["webOrigins"] = args ? args.webOrigins : undefined;
            resourceInputs["clientId"] = undefined /*out*/;
            resourceInputs["signingKeys"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["signingKeys"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Client.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Client resources.
 */
export interface ClientState {
    /**
     * Addons enabled for this client and their associated configurations.
     */
    addons?: pulumi.Input<inputs.ClientAddons>;
    /**
     * List of applications ID's that will be allowed to make delegation request. By default, all applications will be allowed.
     */
    allowedClients?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * URLs that Auth0 may redirect to after logout.
     */
    allowedLogoutUrls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * URLs that represent valid origins for cross-origin resource sharing. By default, all your callback URLs will be allowed.
     */
    allowedOrigins?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Type of application the client represents. Possible values are: `native`, `spa`, `regularWeb`, `nonInteractive`, `ssoIntegration`. Specific SSO integrations types accepted as well are: `rms`, `box`, `cloudbees`, `concur`, `dropbox`, `mscrm`, `echosign`, `egnyte`, `newrelic`, `office365`, `salesforce`, `sentry`, `sharepoint`, `slack`, `springcm`, `zendesk`, `zoom`.
     */
    appType?: pulumi.Input<string>;
    /**
     * URLs that Auth0 may call back to after a user authenticates for the client. Make sure to specify the protocol (https://) otherwise the callback may fail in some cases. With the exception of custom URI schemes for native clients, all callbacks should use protocol https://.
     */
    callbacks?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of audiences/realms for SAML protocol. Used by the wsfed addon.
     */
    clientAliases?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Consumer Key assigned by Salesforce to the Connected App.
     */
    clientId?: pulumi.Input<string>;
    /**
     * Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?"/\()<>@ [Tab] [Space]`.
     */
    clientMetadata?: pulumi.Input<{[key: string]: any}>;
    /**
     * Whether this client can be used to make cross-origin authentication requests (`true`) or it is not allowed to make such requests (`false`).
     */
    crossOriginAuth?: pulumi.Input<boolean>;
    /**
     * URL of the location in your site where the cross-origin verification takes place for the cross-origin auth flow when performing authentication in your own domain instead of Auth0 Universal Login page.
     */
    crossOriginLoc?: pulumi.Input<string>;
    /**
     * The content (HTML, CSS, JS) of the custom login page.
     */
    customLoginPage?: pulumi.Input<string>;
    /**
     * Indicates whether a custom login page is to be used.
     */
    customLoginPageOn?: pulumi.Input<boolean>;
    /**
     * Description of the purpose of the client.
     */
    description?: pulumi.Input<string>;
    /**
     * Encryption used for WS-Fed responses with this client.
     */
    encryptionKey?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * HTML form template to be used for WS-Federation.
     */
    formTemplate?: pulumi.Input<string>;
    /**
     * Types of grants that this client is authorized to use.
     */
    grantTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Initiate login URI. Must be HTTPS or an empty string.
     */
    initiateLoginUri?: pulumi.Input<string>;
    /**
     * Indicates whether this client is a first-party client.
     */
    isFirstParty?: pulumi.Input<boolean>;
    /**
     * Indicates whether the token endpoint IP header is trusted. Requires the authentication method to be set to `clientSecretPost` or `clientSecretBasic`. Setting this property when creating the resource, will default the authentication method to `clientSecretPost`. To change the authentication method to `clientSecretBasic` use the `auth0.ClientCredentials` resource.
     */
    isTokenEndpointIpHeaderTrusted?: pulumi.Input<boolean>;
    /**
     * Configuration settings for the JWTs issued for this client.
     */
    jwtConfiguration?: pulumi.Input<inputs.ClientJwtConfiguration>;
    /**
     * URL of the logo for the client. Recommended size is 150px x 150px. If none is set, the default badge for the application type will be shown.
     */
    logoUri?: pulumi.Input<string>;
    /**
     * Additional configuration for native mobile apps.
     */
    mobile?: pulumi.Input<inputs.ClientMobile>;
    /**
     * SSO integration name.
     */
    name?: pulumi.Input<string>;
    /**
     * Configuration settings to toggle native social login for mobile native applications. Once this is set it must stay set, with both resources set to `false` in order to change the `appType`.
     */
    nativeSocialLogin?: pulumi.Input<inputs.ClientNativeSocialLogin>;
    /**
     * Set of URLs that are valid to call back from Auth0 for OIDC backchannel logout. Currently only one URL is allowed.
     */
    oidcBackchannelLogoutUrls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Indicates whether this client will conform to strict OIDC specifications.
     */
    oidcConformant?: pulumi.Input<boolean>;
    /**
     * Defines how to proceed during an authentication transaction when `organizationUsage = "require"`. Can be `noPrompt` (default), `preLoginPrompt` or  `postLoginPrompt`.
     */
    organizationRequireBehavior?: pulumi.Input<string>;
    /**
     * Defines how to proceed during an authentication transaction with regards to an organization. Can be `deny` (default), `allow` or `require`.
     */
    organizationUsage?: pulumi.Input<string>;
    /**
     * Configuration settings for the refresh tokens issued for this client.
     */
    refreshToken?: pulumi.Input<inputs.ClientRefreshToken>;
    /**
     * Makes the use of Pushed Authorization Requests mandatory for this client. This feature currently needs to be enabled on the tenant in order to make use of it.
     */
    requirePushedAuthorizationRequests?: pulumi.Input<boolean>;
    /**
     * List containing a map of the public cert of the signing key and the public cert of the signing key in PKCS7.
     */
    signingKeys?: pulumi.Input<pulumi.Input<{[key: string]: any}>[]>;
    /**
     * Applies only to SSO clients and determines whether Auth0 will handle Single Sign-On (true) or whether the identity provider will (false).
     */
    sso?: pulumi.Input<boolean>;
    /**
     * Indicates whether or not SSO is disabled.
     */
    ssoDisabled?: pulumi.Input<boolean>;
    /**
     * URLs that represent valid web origins for use with web message response mode.
     */
    webOrigins?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Client resource.
 */
export interface ClientArgs {
    /**
     * Addons enabled for this client and their associated configurations.
     */
    addons?: pulumi.Input<inputs.ClientAddons>;
    /**
     * List of applications ID's that will be allowed to make delegation request. By default, all applications will be allowed.
     */
    allowedClients?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * URLs that Auth0 may redirect to after logout.
     */
    allowedLogoutUrls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * URLs that represent valid origins for cross-origin resource sharing. By default, all your callback URLs will be allowed.
     */
    allowedOrigins?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Type of application the client represents. Possible values are: `native`, `spa`, `regularWeb`, `nonInteractive`, `ssoIntegration`. Specific SSO integrations types accepted as well are: `rms`, `box`, `cloudbees`, `concur`, `dropbox`, `mscrm`, `echosign`, `egnyte`, `newrelic`, `office365`, `salesforce`, `sentry`, `sharepoint`, `slack`, `springcm`, `zendesk`, `zoom`.
     */
    appType?: pulumi.Input<string>;
    /**
     * URLs that Auth0 may call back to after a user authenticates for the client. Make sure to specify the protocol (https://) otherwise the callback may fail in some cases. With the exception of custom URI schemes for native clients, all callbacks should use protocol https://.
     */
    callbacks?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List of audiences/realms for SAML protocol. Used by the wsfed addon.
     */
    clientAliases?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?"/\()<>@ [Tab] [Space]`.
     */
    clientMetadata?: pulumi.Input<{[key: string]: any}>;
    /**
     * Whether this client can be used to make cross-origin authentication requests (`true`) or it is not allowed to make such requests (`false`).
     */
    crossOriginAuth?: pulumi.Input<boolean>;
    /**
     * URL of the location in your site where the cross-origin verification takes place for the cross-origin auth flow when performing authentication in your own domain instead of Auth0 Universal Login page.
     */
    crossOriginLoc?: pulumi.Input<string>;
    /**
     * The content (HTML, CSS, JS) of the custom login page.
     */
    customLoginPage?: pulumi.Input<string>;
    /**
     * Indicates whether a custom login page is to be used.
     */
    customLoginPageOn?: pulumi.Input<boolean>;
    /**
     * Description of the purpose of the client.
     */
    description?: pulumi.Input<string>;
    /**
     * Encryption used for WS-Fed responses with this client.
     */
    encryptionKey?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * HTML form template to be used for WS-Federation.
     */
    formTemplate?: pulumi.Input<string>;
    /**
     * Types of grants that this client is authorized to use.
     */
    grantTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Initiate login URI. Must be HTTPS or an empty string.
     */
    initiateLoginUri?: pulumi.Input<string>;
    /**
     * Indicates whether this client is a first-party client.
     */
    isFirstParty?: pulumi.Input<boolean>;
    /**
     * Indicates whether the token endpoint IP header is trusted. Requires the authentication method to be set to `clientSecretPost` or `clientSecretBasic`. Setting this property when creating the resource, will default the authentication method to `clientSecretPost`. To change the authentication method to `clientSecretBasic` use the `auth0.ClientCredentials` resource.
     */
    isTokenEndpointIpHeaderTrusted?: pulumi.Input<boolean>;
    /**
     * Configuration settings for the JWTs issued for this client.
     */
    jwtConfiguration?: pulumi.Input<inputs.ClientJwtConfiguration>;
    /**
     * URL of the logo for the client. Recommended size is 150px x 150px. If none is set, the default badge for the application type will be shown.
     */
    logoUri?: pulumi.Input<string>;
    /**
     * Additional configuration for native mobile apps.
     */
    mobile?: pulumi.Input<inputs.ClientMobile>;
    /**
     * SSO integration name.
     */
    name?: pulumi.Input<string>;
    /**
     * Configuration settings to toggle native social login for mobile native applications. Once this is set it must stay set, with both resources set to `false` in order to change the `appType`.
     */
    nativeSocialLogin?: pulumi.Input<inputs.ClientNativeSocialLogin>;
    /**
     * Set of URLs that are valid to call back from Auth0 for OIDC backchannel logout. Currently only one URL is allowed.
     */
    oidcBackchannelLogoutUrls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Indicates whether this client will conform to strict OIDC specifications.
     */
    oidcConformant?: pulumi.Input<boolean>;
    /**
     * Defines how to proceed during an authentication transaction when `organizationUsage = "require"`. Can be `noPrompt` (default), `preLoginPrompt` or  `postLoginPrompt`.
     */
    organizationRequireBehavior?: pulumi.Input<string>;
    /**
     * Defines how to proceed during an authentication transaction with regards to an organization. Can be `deny` (default), `allow` or `require`.
     */
    organizationUsage?: pulumi.Input<string>;
    /**
     * Configuration settings for the refresh tokens issued for this client.
     */
    refreshToken?: pulumi.Input<inputs.ClientRefreshToken>;
    /**
     * Makes the use of Pushed Authorization Requests mandatory for this client. This feature currently needs to be enabled on the tenant in order to make use of it.
     */
    requirePushedAuthorizationRequests?: pulumi.Input<boolean>;
    /**
     * Applies only to SSO clients and determines whether Auth0 will handle Single Sign-On (true) or whether the identity provider will (false).
     */
    sso?: pulumi.Input<boolean>;
    /**
     * Indicates whether or not SSO is disabled.
     */
    ssoDisabled?: pulumi.Input<boolean>;
    /**
     * URLs that represent valid web origins for use with web message response mode.
     */
    webOrigins?: pulumi.Input<pulumi.Input<string>[]>;
}
