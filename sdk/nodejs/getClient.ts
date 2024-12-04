// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Data source to retrieve a specific Auth0 application client by `clientId` or `name`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // An Auth0 Client loaded using its name.
 * const some-client-by-name = auth0.getClient({
 *     name: "Name of my Application",
 * });
 * // An Auth0 Client loaded using its ID.
 * const some-client-by-id = auth0.getClient({
 *     clientId: "abcdefghkijklmnopqrstuvwxyz0123456789",
 * });
 * ```
 */
export function getClient(args?: GetClientArgs, opts?: pulumi.InvokeOptions): Promise<GetClientResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("auth0:index/getClient:getClient", {
        "clientId": args.clientId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getClient.
 */
export interface GetClientArgs {
    /**
     * The ID of the client. If not provided, `name` must be set.
     */
    clientId?: string;
    /**
     * The name of the client. If not provided, `clientId` must be set.
     */
    name?: string;
}

/**
 * A collection of values returned by getClient.
 */
export interface GetClientResult {
    /**
     * Addons enabled for this client and their associated configurations.
     */
    readonly addons: outputs.GetClientAddon[];
    /**
     * List of applications ID's that will be allowed to make delegation request. By default, all applications will be allowed.
     */
    readonly allowedClients: string[];
    /**
     * URLs that Auth0 may redirect to after logout.
     */
    readonly allowedLogoutUrls: string[];
    /**
     * URLs that represent valid origins for cross-origin resource sharing. By default, all your callback URLs will be allowed.
     */
    readonly allowedOrigins: string[];
    /**
     * Type of application the client represents. Possible values are: `native`, `spa`, `regularWeb`, `nonInteractive`, `ssoIntegration`. Specific SSO integrations types accepted as well are: `rms`, `box`, `cloudbees`, `concur`, `dropbox`, `mscrm`, `echosign`, `egnyte`, `newrelic`, `office365`, `salesforce`, `sentry`, `sharepoint`, `slack`, `springcm`, `zendesk`, `zoom`.
     */
    readonly appType: string;
    /**
     * URLs that Auth0 may call back to after a user authenticates for the client. Make sure to specify the protocol (https://) otherwise the callback may fail in some cases. With the exception of custom URI schemes for native clients, all callbacks should use protocol https://.
     */
    readonly callbacks: string[];
    /**
     * List of audiences/realms for SAML protocol. Used by the wsfed addon.
     */
    readonly clientAliases: string[];
    /**
     * Defines client authentication methods.
     */
    readonly clientAuthenticationMethods: outputs.GetClientClientAuthenticationMethod[];
    /**
     * The ID of the client. If not provided, `name` must be set.
     */
    readonly clientId?: string;
    /**
     * Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?"/\()<>@ [Tab] [Space]`.
     */
    readonly clientMetadata: {[key: string]: string};
    readonly clientSecret: string;
    /**
     * Defines the compliance level for this client, which may restrict it's capabilities. Can be one of `none`, `fapi1AdvPkjPar`, `fapi1AdvMtlsPar`.
     */
    readonly complianceLevel: string;
    /**
     * Whether this client can be used to make cross-origin authentication requests (`true`) or it is not allowed to make such requests (`false`).
     */
    readonly crossOriginAuth: boolean;
    /**
     * URL of the location in your site where the cross-origin verification takes place for the cross-origin auth flow when performing authentication in your own domain instead of Auth0 Universal Login page.
     */
    readonly crossOriginLoc: string;
    /**
     * The content (HTML, CSS, JS) of the custom login page.
     */
    readonly customLoginPage: string;
    /**
     * Indicates whether a custom login page is to be used.
     */
    readonly customLoginPageOn: boolean;
    /**
     * Configure and associate an organization with the Client
     */
    readonly defaultOrganizations: outputs.GetClientDefaultOrganization[];
    /**
     * Description of the purpose of the client.
     */
    readonly description: string;
    /**
     * Encryption used for WS-Fed responses with this client.
     */
    readonly encryptionKey: {[key: string]: string};
    /**
     * HTML form template to be used for WS-Federation.
     */
    readonly formTemplate: string;
    /**
     * Types of grants that this client is authorized to use.
     */
    readonly grantTypes: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Initiate login URI. Must be HTTPS or an empty string.
     */
    readonly initiateLoginUri: string;
    /**
     * Indicates whether this client is a first-party client.
     */
    readonly isFirstParty: boolean;
    /**
     * Indicates whether the token endpoint IP header is trusted. Requires the authentication method to be set to `clientSecretPost` or `clientSecretBasic`. Setting this property when creating the resource, will default the authentication method to `clientSecretPost`. To change the authentication method to `clientSecretBasic` use the `auth0.ClientCredentials` resource.
     */
    readonly isTokenEndpointIpHeaderTrusted: boolean;
    /**
     * Configuration settings for the JWTs issued for this client.
     */
    readonly jwtConfigurations: outputs.GetClientJwtConfiguration[];
    /**
     * URL of the logo for the client. Recommended size is 150px x 150px. If none is set, the default badge for the application type will be shown.
     */
    readonly logoUri: string;
    /**
     * Additional configuration for native mobile apps.
     */
    readonly mobiles: outputs.GetClientMobile[];
    /**
     * The name of the client. If not provided, `clientId` must be set.
     */
    readonly name?: string;
    /**
     * Configuration settings to toggle native social login for mobile native applications. Once this is set it must stay set, with both resources set to `false` in order to change the `appType`.
     */
    readonly nativeSocialLogins: outputs.GetClientNativeSocialLogin[];
    /**
     * Set of URLs that are valid to call back from Auth0 for OIDC backchannel logout. Currently only one URL is allowed.
     */
    readonly oidcBackchannelLogoutUrls: string[];
    /**
     * Indicates whether this client will conform to strict OIDC specifications.
     */
    readonly oidcConformant: boolean;
    /**
     * Configure OIDC logout for the Client
     */
    readonly oidcLogouts: outputs.GetClientOidcLogout[];
    /**
     * Defines how to proceed during an authentication transaction when `organizationUsage = "require"`. Can be `noPrompt` (default), `preLoginPrompt` or  `postLoginPrompt`.
     */
    readonly organizationRequireBehavior: string;
    /**
     * Defines how to proceed during an authentication transaction with regards to an organization. Can be `deny` (default), `allow` or `require`.
     */
    readonly organizationUsage: string;
    /**
     * Configuration settings for the refresh tokens issued for this client.
     */
    readonly refreshTokens: outputs.GetClientRefreshToken[];
    /**
     * Makes the use of Proof-of-Possession mandatory for this client.
     */
    readonly requireProofOfPossession: boolean;
    /**
     * Makes the use of Pushed Authorization Requests mandatory for this client. This feature currently needs to be enabled on the tenant in order to make use of it.
     */
    readonly requirePushedAuthorizationRequests: boolean;
    /**
     * Configuration for JWT-secured Authorization Requests(JAR).
     */
    readonly signedRequestObjects: outputs.GetClientSignedRequestObject[];
    /**
     * List containing a map of the public cert of the signing key and the public cert of the signing key in PKCS7.
     */
    readonly signingKeys: {[key: string]: string}[];
    /**
     * Applies only to SSO clients and determines whether Auth0 will handle Single Sign-On (true) or whether the identity provider will (false).
     */
    readonly sso: boolean;
    /**
     * Indicates whether or not SSO is disabled.
     */
    readonly ssoDisabled: boolean;
    /**
     * The authentication method for the token endpoint. Results include `none` (public client without a client secret), `clientSecretPost` (client uses HTTP POST parameters), `clientSecretBasic` (client uses HTTP Basic), Managing a client's authentication method can be done via the `auth0.ClientCredentials` resource.
     */
    readonly tokenEndpointAuthMethod: string;
    /**
     * URLs that represent valid web origins for use with web message response mode.
     */
    readonly webOrigins: string[];
}
/**
 * Data source to retrieve a specific Auth0 application client by `clientId` or `name`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // An Auth0 Client loaded using its name.
 * const some-client-by-name = auth0.getClient({
 *     name: "Name of my Application",
 * });
 * // An Auth0 Client loaded using its ID.
 * const some-client-by-id = auth0.getClient({
 *     clientId: "abcdefghkijklmnopqrstuvwxyz0123456789",
 * });
 * ```
 */
export function getClientOutput(args?: GetClientOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetClientResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("auth0:index/getClient:getClient", {
        "clientId": args.clientId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getClient.
 */
export interface GetClientOutputArgs {
    /**
     * The ID of the client. If not provided, `name` must be set.
     */
    clientId?: pulumi.Input<string>;
    /**
     * The name of the client. If not provided, `clientId` must be set.
     */
    name?: pulumi.Input<string>;
}
