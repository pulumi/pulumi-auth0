// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use a tenant's global Auth0 Application client.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const global = new auth0.GlobalClient("global", {
 *     callbacks: ["http://somehostname.com/a/callback"],
 *     customLoginPage: `<html>
 *     <head><title>My Custom Login Page</title></head>
 *     <body>
 *         I should probably have a login form here
 *     </body>
 * </html>
 *
 * `,
 *     customLoginPageOn: true,
 * });
 * ```
 *
 * ## Import
 *
 * The auth0_global_client can be imported using the global client's ID. # You can find the ID of the global client by going to the [API Explorer](https://auth0.com/docs/api/management/v2#!/Clients/get_clients) and fetching the clients that have `"global"true`. # Example
 *
 * ```sh
 *  $ pulumi import auth0:index/globalClient:GlobalClient global XaiyAXXXYdXXXXnqjj8HXXXXXT5titww
 * ```
 */
export class GlobalClient extends pulumi.CustomResource {
    /**
     * Get an existing GlobalClient resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GlobalClientState, opts?: pulumi.CustomResourceOptions): GlobalClient {
        return new GlobalClient(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/globalClient:GlobalClient';

    /**
     * Returns true if the given object is an instance of GlobalClient.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GlobalClient {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GlobalClient.__pulumiType;
    }

    /**
     * Addons enabled for this client and their associated configurations.
     */
    public readonly addons!: pulumi.Output<outputs.GlobalClientAddons>;
    /**
     * List of applications ID's that will be allowed to make delegation request. By default, all applications will be allowed.
     */
    public readonly allowedClients!: pulumi.Output<string[]>;
    /**
     * URLs that Auth0 may redirect to after logout.
     */
    public readonly allowedLogoutUrls!: pulumi.Output<string[]>;
    /**
     * URLs that represent valid origins for cross-origin resource sharing. By default, all your callback URLs will be allowed.
     */
    public readonly allowedOrigins!: pulumi.Output<string[]>;
    /**
     * Type of application the client represents. Possible values are: `native`, `spa`, `regularWeb`, `nonInteractive`, `ssoIntegration`. Specific SSO integrations types accepted as well are: `rms`, `box`, `cloudbees`, `concur`, `dropbox`, `mscrm`, `echosign`, `egnyte`, `newrelic`, `office365`, `salesforce`, `sentry`, `sharepoint`, `slack`, `springcm`, `zendesk`, `zoom`.
     */
    public readonly appType!: pulumi.Output<string>;
    /**
     * URLs that Auth0 may call back to after a user authenticates for the client. Make sure to specify the protocol (https://) otherwise the callback may fail in some cases. With the exception of custom URI schemes for native clients, all callbacks should use protocol https://.
     */
    public readonly callbacks!: pulumi.Output<string[]>;
    /**
     * List of audiences/realms for SAML protocol. Used by the wsfed addon.
     */
    public readonly clientAliases!: pulumi.Output<string[]>;
    /**
     * The ID of the client.
     */
    public readonly clientId!: pulumi.Output<string>;
    /**
     * Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?"/\()<>@ [Tab] [Space]`.
     */
    public readonly clientMetadata!: pulumi.Output<{[key: string]: any}>;
    /**
     * Secret for the client. Keep this private. To access this attribute you need to add the `read:client_keys` scope to the
     * Terraform client. Otherwise, the attribute will contain an empty string. Use this attribute on the
     * `auth0_client_credentials` resource instead, to allow managing it directly.
     *
     * @deprecated Reading the client secret through this attribute is deprecated and it will be removed in a future version. Migrate to the `auth0_client_credentials` resource to manage a client's secret instead.
     */
    public readonly clientSecret!: pulumi.Output<string>;
    /**
     * Custom metadata for the rotation. The contents of this map are arbitrary and are hashed by the provider. When the hash changes, a rotation is triggered. For example, the map could contain the user making the change, the date of the change, and a text reason for the change. For more info: rotate-client-secret for instructions on how to rotate client secrets with zero downtime.
     *
     * @deprecated Rotating a client's secret through this attribute is deprecated and it will be removed in a future version. Migrate to the `auth0_client_credentials` resource to manage a client's secret instead. Refer to the [client secret rotation guide](Refer to the [client secret rotation guide](https://registry.terraform.io/providers/auth0/auth0/latest/docs/guides/client_secret_rotation) for instructions on how to rotate client secrets with zero downtime.
     */
    public readonly clientSecretRotationTrigger!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * Whether this client can be used to make cross-origin authentication requests (`true`) or it is not allowed to make such requests (`false`). Requires the `coaToggleEnabled` feature flag to be enabled on the tenant by the support team.
     */
    public readonly crossOriginAuth!: pulumi.Output<boolean>;
    /**
     * URL of the location in your site where the cross-origin verification takes place for the cross-origin auth flow when performing authentication in your own domain instead of Auth0 Universal Login page.
     */
    public readonly crossOriginLoc!: pulumi.Output<string>;
    /**
     * The content (HTML, CSS, JS) of the custom login page.
     */
    public readonly customLoginPage!: pulumi.Output<string>;
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
    public readonly encryptionKey!: pulumi.Output<{[key: string]: string}>;
    /**
     * HTML form template to be used for WS-Federation.
     */
    public readonly formTemplate!: pulumi.Output<string>;
    /**
     * Types of grants that this client is authorized to use.
     */
    public readonly grantTypes!: pulumi.Output<string[]>;
    /**
     * Initiate login URI. Must be HTTPS or an empty string.
     */
    public readonly initiateLoginUri!: pulumi.Output<string>;
    /**
     * Indicates whether this client is a first-party client.
     */
    public readonly isFirstParty!: pulumi.Output<boolean>;
    /**
     * Indicates whether the token endpoint IP header is trusted.
     */
    public readonly isTokenEndpointIpHeaderTrusted!: pulumi.Output<boolean>;
    /**
     * Configuration settings for the JWTs issued for this client.
     */
    public readonly jwtConfiguration!: pulumi.Output<outputs.GlobalClientJwtConfiguration>;
    /**
     * URL of the logo for the client. Recommended size is 150px x 150px. If none is set, the default badge for the application type will be shown.
     */
    public readonly logoUri!: pulumi.Output<string>;
    /**
     * Additional configuration for native mobile apps.
     */
    public readonly mobile!: pulumi.Output<outputs.GlobalClientMobile>;
    /**
     * Name of the client.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Configuration settings to toggle native social login for mobile native applications. Once this is set it must stay set, with both resources set to `false` in order to change the `appType`.
     */
    public readonly nativeSocialLogin!: pulumi.Output<outputs.GlobalClientNativeSocialLogin>;
    /**
     * Set of URLs that are valid to call back from Auth0 for OIDC backchannel logout. Currently only one URL is allowed.
     */
    public readonly oidcBackchannelLogoutUrls!: pulumi.Output<string[]>;
    /**
     * Indicates whether this client will conform to strict OIDC specifications.
     */
    public readonly oidcConformant!: pulumi.Output<boolean>;
    /**
     * Defines how to proceed during an authentication transaction when `organizationUsage = "require"`. Can be `noPrompt` (default) or `preLoginPrompt`.
     */
    public readonly organizationRequireBehavior!: pulumi.Output<string>;
    /**
     * Defines how to proceed during an authentication transaction with regards to an organization. Can be `deny` (default), `allow` or `require`.
     */
    public readonly organizationUsage!: pulumi.Output<string>;
    /**
     * Configuration settings for the refresh tokens issued for this client.
     */
    public readonly refreshToken!: pulumi.Output<outputs.GlobalClientRefreshToken>;
    /**
     * List containing a map of the public cert of the signing key and the public cert of the signing key in PKCS7.
     */
    public readonly signingKeys!: pulumi.Output<{[key: string]: any}[]>;
    /**
     * Applies only to SSO clients and determines whether Auth0 will handle Single Sign-On (true) or whether the identity provider will (false).
     */
    public readonly sso!: pulumi.Output<boolean>;
    /**
     * Indicates whether or not SSO is disabled.
     */
    public readonly ssoDisabled!: pulumi.Output<boolean>;
    /**
     * Defines the requested authentication method for the token endpoint. Options include `none` (public client without a client secret), `clientSecretPost` (client uses HTTP POST parameters), `clientSecretBasic` (client uses HTTP Basic).
     *
     * @deprecated Managing the authentication method through this attribute is deprecated and it will be changed to read-only in a future version. Migrate to the `auth0_client_credentials` resource to manage a client's authentication method instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md) on how to do that.
     */
    public readonly tokenEndpointAuthMethod!: pulumi.Output<string>;
    /**
     * URLs that represent valid web origins for use with web message response mode.
     */
    public readonly webOrigins!: pulumi.Output<string[]>;

    /**
     * Create a GlobalClient resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: GlobalClientArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GlobalClientArgs | GlobalClientState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GlobalClientState | undefined;
            resourceInputs["addons"] = state ? state.addons : undefined;
            resourceInputs["allowedClients"] = state ? state.allowedClients : undefined;
            resourceInputs["allowedLogoutUrls"] = state ? state.allowedLogoutUrls : undefined;
            resourceInputs["allowedOrigins"] = state ? state.allowedOrigins : undefined;
            resourceInputs["appType"] = state ? state.appType : undefined;
            resourceInputs["callbacks"] = state ? state.callbacks : undefined;
            resourceInputs["clientAliases"] = state ? state.clientAliases : undefined;
            resourceInputs["clientId"] = state ? state.clientId : undefined;
            resourceInputs["clientMetadata"] = state ? state.clientMetadata : undefined;
            resourceInputs["clientSecret"] = state ? state.clientSecret : undefined;
            resourceInputs["clientSecretRotationTrigger"] = state ? state.clientSecretRotationTrigger : undefined;
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
            resourceInputs["signingKeys"] = state ? state.signingKeys : undefined;
            resourceInputs["sso"] = state ? state.sso : undefined;
            resourceInputs["ssoDisabled"] = state ? state.ssoDisabled : undefined;
            resourceInputs["tokenEndpointAuthMethod"] = state ? state.tokenEndpointAuthMethod : undefined;
            resourceInputs["webOrigins"] = state ? state.webOrigins : undefined;
        } else {
            const args = argsOrState as GlobalClientArgs | undefined;
            resourceInputs["addons"] = args ? args.addons : undefined;
            resourceInputs["allowedClients"] = args ? args.allowedClients : undefined;
            resourceInputs["allowedLogoutUrls"] = args ? args.allowedLogoutUrls : undefined;
            resourceInputs["allowedOrigins"] = args ? args.allowedOrigins : undefined;
            resourceInputs["appType"] = args ? args.appType : undefined;
            resourceInputs["callbacks"] = args ? args.callbacks : undefined;
            resourceInputs["clientAliases"] = args ? args.clientAliases : undefined;
            resourceInputs["clientId"] = args ? args.clientId : undefined;
            resourceInputs["clientMetadata"] = args ? args.clientMetadata : undefined;
            resourceInputs["clientSecret"] = args?.clientSecret ? pulumi.secret(args.clientSecret) : undefined;
            resourceInputs["clientSecretRotationTrigger"] = args ? args.clientSecretRotationTrigger : undefined;
            resourceInputs["crossOriginAuth"] = args ? args.crossOriginAuth : undefined;
            resourceInputs["crossOriginLoc"] = args ? args.crossOriginLoc : undefined;
            resourceInputs["customLoginPage"] = args ? args.customLoginPage : undefined;
            resourceInputs["customLoginPageOn"] = args ? args.customLoginPageOn : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
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
            resourceInputs["signingKeys"] = args?.signingKeys ? pulumi.secret(args.signingKeys) : undefined;
            resourceInputs["sso"] = args ? args.sso : undefined;
            resourceInputs["ssoDisabled"] = args ? args.ssoDisabled : undefined;
            resourceInputs["tokenEndpointAuthMethod"] = args ? args.tokenEndpointAuthMethod : undefined;
            resourceInputs["webOrigins"] = args ? args.webOrigins : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["clientSecret", "signingKeys"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(GlobalClient.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GlobalClient resources.
 */
export interface GlobalClientState {
    /**
     * Addons enabled for this client and their associated configurations.
     */
    addons?: pulumi.Input<inputs.GlobalClientAddons>;
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
     * The ID of the client.
     */
    clientId?: pulumi.Input<string>;
    /**
     * Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?"/\()<>@ [Tab] [Space]`.
     */
    clientMetadata?: pulumi.Input<{[key: string]: any}>;
    /**
     * Secret for the client. Keep this private. To access this attribute you need to add the `read:client_keys` scope to the
     * Terraform client. Otherwise, the attribute will contain an empty string. Use this attribute on the
     * `auth0_client_credentials` resource instead, to allow managing it directly.
     *
     * @deprecated Reading the client secret through this attribute is deprecated and it will be removed in a future version. Migrate to the `auth0_client_credentials` resource to manage a client's secret instead.
     */
    clientSecret?: pulumi.Input<string>;
    /**
     * Custom metadata for the rotation. The contents of this map are arbitrary and are hashed by the provider. When the hash changes, a rotation is triggered. For example, the map could contain the user making the change, the date of the change, and a text reason for the change. For more info: rotate-client-secret for instructions on how to rotate client secrets with zero downtime.
     *
     * @deprecated Rotating a client's secret through this attribute is deprecated and it will be removed in a future version. Migrate to the `auth0_client_credentials` resource to manage a client's secret instead. Refer to the [client secret rotation guide](Refer to the [client secret rotation guide](https://registry.terraform.io/providers/auth0/auth0/latest/docs/guides/client_secret_rotation) for instructions on how to rotate client secrets with zero downtime.
     */
    clientSecretRotationTrigger?: pulumi.Input<{[key: string]: any}>;
    /**
     * Whether this client can be used to make cross-origin authentication requests (`true`) or it is not allowed to make such requests (`false`). Requires the `coaToggleEnabled` feature flag to be enabled on the tenant by the support team.
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
     * Indicates whether the token endpoint IP header is trusted.
     */
    isTokenEndpointIpHeaderTrusted?: pulumi.Input<boolean>;
    /**
     * Configuration settings for the JWTs issued for this client.
     */
    jwtConfiguration?: pulumi.Input<inputs.GlobalClientJwtConfiguration>;
    /**
     * URL of the logo for the client. Recommended size is 150px x 150px. If none is set, the default badge for the application type will be shown.
     */
    logoUri?: pulumi.Input<string>;
    /**
     * Additional configuration for native mobile apps.
     */
    mobile?: pulumi.Input<inputs.GlobalClientMobile>;
    /**
     * Name of the client.
     */
    name?: pulumi.Input<string>;
    /**
     * Configuration settings to toggle native social login for mobile native applications. Once this is set it must stay set, with both resources set to `false` in order to change the `appType`.
     */
    nativeSocialLogin?: pulumi.Input<inputs.GlobalClientNativeSocialLogin>;
    /**
     * Set of URLs that are valid to call back from Auth0 for OIDC backchannel logout. Currently only one URL is allowed.
     */
    oidcBackchannelLogoutUrls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Indicates whether this client will conform to strict OIDC specifications.
     */
    oidcConformant?: pulumi.Input<boolean>;
    /**
     * Defines how to proceed during an authentication transaction when `organizationUsage = "require"`. Can be `noPrompt` (default) or `preLoginPrompt`.
     */
    organizationRequireBehavior?: pulumi.Input<string>;
    /**
     * Defines how to proceed during an authentication transaction with regards to an organization. Can be `deny` (default), `allow` or `require`.
     */
    organizationUsage?: pulumi.Input<string>;
    /**
     * Configuration settings for the refresh tokens issued for this client.
     */
    refreshToken?: pulumi.Input<inputs.GlobalClientRefreshToken>;
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
     * Defines the requested authentication method for the token endpoint. Options include `none` (public client without a client secret), `clientSecretPost` (client uses HTTP POST parameters), `clientSecretBasic` (client uses HTTP Basic).
     *
     * @deprecated Managing the authentication method through this attribute is deprecated and it will be changed to read-only in a future version. Migrate to the `auth0_client_credentials` resource to manage a client's authentication method instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md) on how to do that.
     */
    tokenEndpointAuthMethod?: pulumi.Input<string>;
    /**
     * URLs that represent valid web origins for use with web message response mode.
     */
    webOrigins?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a GlobalClient resource.
 */
export interface GlobalClientArgs {
    /**
     * Addons enabled for this client and their associated configurations.
     */
    addons?: pulumi.Input<inputs.GlobalClientAddons>;
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
     * The ID of the client.
     */
    clientId?: pulumi.Input<string>;
    /**
     * Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?"/\()<>@ [Tab] [Space]`.
     */
    clientMetadata?: pulumi.Input<{[key: string]: any}>;
    /**
     * Secret for the client. Keep this private. To access this attribute you need to add the `read:client_keys` scope to the
     * Terraform client. Otherwise, the attribute will contain an empty string. Use this attribute on the
     * `auth0_client_credentials` resource instead, to allow managing it directly.
     *
     * @deprecated Reading the client secret through this attribute is deprecated and it will be removed in a future version. Migrate to the `auth0_client_credentials` resource to manage a client's secret instead.
     */
    clientSecret?: pulumi.Input<string>;
    /**
     * Custom metadata for the rotation. The contents of this map are arbitrary and are hashed by the provider. When the hash changes, a rotation is triggered. For example, the map could contain the user making the change, the date of the change, and a text reason for the change. For more info: rotate-client-secret for instructions on how to rotate client secrets with zero downtime.
     *
     * @deprecated Rotating a client's secret through this attribute is deprecated and it will be removed in a future version. Migrate to the `auth0_client_credentials` resource to manage a client's secret instead. Refer to the [client secret rotation guide](Refer to the [client secret rotation guide](https://registry.terraform.io/providers/auth0/auth0/latest/docs/guides/client_secret_rotation) for instructions on how to rotate client secrets with zero downtime.
     */
    clientSecretRotationTrigger?: pulumi.Input<{[key: string]: any}>;
    /**
     * Whether this client can be used to make cross-origin authentication requests (`true`) or it is not allowed to make such requests (`false`). Requires the `coaToggleEnabled` feature flag to be enabled on the tenant by the support team.
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
     * Indicates whether the token endpoint IP header is trusted.
     */
    isTokenEndpointIpHeaderTrusted?: pulumi.Input<boolean>;
    /**
     * Configuration settings for the JWTs issued for this client.
     */
    jwtConfiguration?: pulumi.Input<inputs.GlobalClientJwtConfiguration>;
    /**
     * URL of the logo for the client. Recommended size is 150px x 150px. If none is set, the default badge for the application type will be shown.
     */
    logoUri?: pulumi.Input<string>;
    /**
     * Additional configuration for native mobile apps.
     */
    mobile?: pulumi.Input<inputs.GlobalClientMobile>;
    /**
     * Name of the client.
     */
    name?: pulumi.Input<string>;
    /**
     * Configuration settings to toggle native social login for mobile native applications. Once this is set it must stay set, with both resources set to `false` in order to change the `appType`.
     */
    nativeSocialLogin?: pulumi.Input<inputs.GlobalClientNativeSocialLogin>;
    /**
     * Set of URLs that are valid to call back from Auth0 for OIDC backchannel logout. Currently only one URL is allowed.
     */
    oidcBackchannelLogoutUrls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Indicates whether this client will conform to strict OIDC specifications.
     */
    oidcConformant?: pulumi.Input<boolean>;
    /**
     * Defines how to proceed during an authentication transaction when `organizationUsage = "require"`. Can be `noPrompt` (default) or `preLoginPrompt`.
     */
    organizationRequireBehavior?: pulumi.Input<string>;
    /**
     * Defines how to proceed during an authentication transaction with regards to an organization. Can be `deny` (default), `allow` or `require`.
     */
    organizationUsage?: pulumi.Input<string>;
    /**
     * Configuration settings for the refresh tokens issued for this client.
     */
    refreshToken?: pulumi.Input<inputs.GlobalClientRefreshToken>;
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
     * Defines the requested authentication method for the token endpoint. Options include `none` (public client without a client secret), `clientSecretPost` (client uses HTTP POST parameters), `clientSecretBasic` (client uses HTTP Basic).
     *
     * @deprecated Managing the authentication method through this attribute is deprecated and it will be changed to read-only in a future version. Migrate to the `auth0_client_credentials` resource to manage a client's authentication method instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md) on how to do that.
     */
    tokenEndpointAuthMethod?: pulumi.Input<string>;
    /**
     * URLs that represent valid web origins for use with web message response mode.
     */
    webOrigins?: pulumi.Input<pulumi.Input<string>[]>;
}
