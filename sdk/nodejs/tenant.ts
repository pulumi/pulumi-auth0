// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * With this resource, you can manage Auth0 tenants, including setting logos and support contact information, setting error pages, and configuring default tenant behaviors.
 *
 * > Creating tenants through the Management API is not currently supported. Therefore, this resource can only
 * manage an existing tenant created through the Auth0 dashboard.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myTenant = new auth0.Tenant("myTenant", {
 *     allowedLogoutUrls: ["http://example.com/logout"],
 *     defaultRedirectionUri: "https://example.com/login",
 *     enabledLocales: ["en"],
 *     flags: {
 *         disableClickjackProtectionHeaders: true,
 *         disableFieldsMapFix: false,
 *         disableManagementApiSmsObfuscation: false,
 *         enablePublicSignupUserExistsError: true,
 *         noDiscloseEnterpriseConnections: false,
 *         useScopeDescriptionsForConsent: true,
 *     },
 *     friendlyName: "Tenant Name",
 *     pictureUrl: "http://example.com/logo.png",
 *     sandboxVersion: "12",
 *     sessionCookie: {
 *         mode: "non-persistent",
 *     },
 *     sessionLifetime: 8760,
 *     sessions: {
 *         oidcLogoutPromptEnabled: false,
 *     },
 *     supportEmail: "support@example.com",
 *     supportUrl: "http://example.com/support",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * As this is not a resource identifiable by an ID within the Auth0 Management API,
 *
 * tenant can be imported using a random string.
 *
 * # 
 *
 * We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4)
 *
 * # 
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/tenant:Tenant my_tenant "82f4f21b-017a-319d-92e7-2291c1ca36c4"
 * ```
 */
export class Tenant extends pulumi.CustomResource {
    /**
     * Get an existing Tenant resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TenantState, opts?: pulumi.CustomResourceOptions): Tenant {
        return new Tenant(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/tenant:Tenant';

    /**
     * Returns true if the given object is an instance of Tenant.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Tenant {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Tenant.__pulumiType;
    }

    /**
     * Whether to accept an organization name instead of an ID on auth endpoints.
     */
    public readonly allowOrganizationNameInAuthenticationApi!: pulumi.Output<boolean>;
    /**
     * URLs that Auth0 may redirect to after logout.
     */
    public readonly allowedLogoutUrls!: pulumi.Output<string[]>;
    /**
     * Whether to enable flexible factors for MFA in the PostLogin action.
     */
    public readonly customizeMfaInPostloginAction!: pulumi.Output<boolean>;
    /**
     * API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
     */
    public readonly defaultAudience!: pulumi.Output<string>;
    /**
     * Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
     */
    public readonly defaultDirectory!: pulumi.Output<string>;
    /**
     * The default absolute redirection URI. Must be HTTPS or an empty string.
     */
    public readonly defaultRedirectionUri!: pulumi.Output<string>;
    /**
     * Supported locales for the user interface. The first locale in the list will be used to set the default locale.
     */
    public readonly enabledLocales!: pulumi.Output<string[]>;
    /**
     * Configuration settings for tenant flags.
     */
    public readonly flags!: pulumi.Output<outputs.TenantFlags>;
    /**
     * Friendly name for the tenant.
     */
    public readonly friendlyName!: pulumi.Output<string>;
    /**
     * Number of hours during which a session can be inactive before the user must log in again.
     */
    public readonly idleSessionLifetime!: pulumi.Output<number | undefined>;
    /**
     * URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
     */
    public readonly pictureUrl!: pulumi.Output<string>;
    /**
     * Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
     */
    public readonly sandboxVersion!: pulumi.Output<string>;
    /**
     * Alters behavior of tenant's session cookie. Contains a single `mode` property.
     */
    public readonly sessionCookie!: pulumi.Output<outputs.TenantSessionCookie>;
    /**
     * Number of hours during which a session will stay valid.
     */
    public readonly sessionLifetime!: pulumi.Output<number | undefined>;
    /**
     * Sessions related settings for the tenant.
     */
    public readonly sessions!: pulumi.Output<outputs.TenantSessions>;
    /**
     * Support email address for authenticating users.
     */
    public readonly supportEmail!: pulumi.Output<string>;
    /**
     * Support URL for authenticating users.
     */
    public readonly supportUrl!: pulumi.Output<string>;

    /**
     * Create a Tenant resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TenantArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TenantArgs | TenantState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TenantState | undefined;
            resourceInputs["allowOrganizationNameInAuthenticationApi"] = state ? state.allowOrganizationNameInAuthenticationApi : undefined;
            resourceInputs["allowedLogoutUrls"] = state ? state.allowedLogoutUrls : undefined;
            resourceInputs["customizeMfaInPostloginAction"] = state ? state.customizeMfaInPostloginAction : undefined;
            resourceInputs["defaultAudience"] = state ? state.defaultAudience : undefined;
            resourceInputs["defaultDirectory"] = state ? state.defaultDirectory : undefined;
            resourceInputs["defaultRedirectionUri"] = state ? state.defaultRedirectionUri : undefined;
            resourceInputs["enabledLocales"] = state ? state.enabledLocales : undefined;
            resourceInputs["flags"] = state ? state.flags : undefined;
            resourceInputs["friendlyName"] = state ? state.friendlyName : undefined;
            resourceInputs["idleSessionLifetime"] = state ? state.idleSessionLifetime : undefined;
            resourceInputs["pictureUrl"] = state ? state.pictureUrl : undefined;
            resourceInputs["sandboxVersion"] = state ? state.sandboxVersion : undefined;
            resourceInputs["sessionCookie"] = state ? state.sessionCookie : undefined;
            resourceInputs["sessionLifetime"] = state ? state.sessionLifetime : undefined;
            resourceInputs["sessions"] = state ? state.sessions : undefined;
            resourceInputs["supportEmail"] = state ? state.supportEmail : undefined;
            resourceInputs["supportUrl"] = state ? state.supportUrl : undefined;
        } else {
            const args = argsOrState as TenantArgs | undefined;
            resourceInputs["allowOrganizationNameInAuthenticationApi"] = args ? args.allowOrganizationNameInAuthenticationApi : undefined;
            resourceInputs["allowedLogoutUrls"] = args ? args.allowedLogoutUrls : undefined;
            resourceInputs["customizeMfaInPostloginAction"] = args ? args.customizeMfaInPostloginAction : undefined;
            resourceInputs["defaultAudience"] = args ? args.defaultAudience : undefined;
            resourceInputs["defaultDirectory"] = args ? args.defaultDirectory : undefined;
            resourceInputs["defaultRedirectionUri"] = args ? args.defaultRedirectionUri : undefined;
            resourceInputs["enabledLocales"] = args ? args.enabledLocales : undefined;
            resourceInputs["flags"] = args ? args.flags : undefined;
            resourceInputs["friendlyName"] = args ? args.friendlyName : undefined;
            resourceInputs["idleSessionLifetime"] = args ? args.idleSessionLifetime : undefined;
            resourceInputs["pictureUrl"] = args ? args.pictureUrl : undefined;
            resourceInputs["sandboxVersion"] = args ? args.sandboxVersion : undefined;
            resourceInputs["sessionCookie"] = args ? args.sessionCookie : undefined;
            resourceInputs["sessionLifetime"] = args ? args.sessionLifetime : undefined;
            resourceInputs["sessions"] = args ? args.sessions : undefined;
            resourceInputs["supportEmail"] = args ? args.supportEmail : undefined;
            resourceInputs["supportUrl"] = args ? args.supportUrl : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Tenant.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Tenant resources.
 */
export interface TenantState {
    /**
     * Whether to accept an organization name instead of an ID on auth endpoints.
     */
    allowOrganizationNameInAuthenticationApi?: pulumi.Input<boolean>;
    /**
     * URLs that Auth0 may redirect to after logout.
     */
    allowedLogoutUrls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether to enable flexible factors for MFA in the PostLogin action.
     */
    customizeMfaInPostloginAction?: pulumi.Input<boolean>;
    /**
     * API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
     */
    defaultAudience?: pulumi.Input<string>;
    /**
     * Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
     */
    defaultDirectory?: pulumi.Input<string>;
    /**
     * The default absolute redirection URI. Must be HTTPS or an empty string.
     */
    defaultRedirectionUri?: pulumi.Input<string>;
    /**
     * Supported locales for the user interface. The first locale in the list will be used to set the default locale.
     */
    enabledLocales?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Configuration settings for tenant flags.
     */
    flags?: pulumi.Input<inputs.TenantFlags>;
    /**
     * Friendly name for the tenant.
     */
    friendlyName?: pulumi.Input<string>;
    /**
     * Number of hours during which a session can be inactive before the user must log in again.
     */
    idleSessionLifetime?: pulumi.Input<number>;
    /**
     * URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
     */
    pictureUrl?: pulumi.Input<string>;
    /**
     * Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
     */
    sandboxVersion?: pulumi.Input<string>;
    /**
     * Alters behavior of tenant's session cookie. Contains a single `mode` property.
     */
    sessionCookie?: pulumi.Input<inputs.TenantSessionCookie>;
    /**
     * Number of hours during which a session will stay valid.
     */
    sessionLifetime?: pulumi.Input<number>;
    /**
     * Sessions related settings for the tenant.
     */
    sessions?: pulumi.Input<inputs.TenantSessions>;
    /**
     * Support email address for authenticating users.
     */
    supportEmail?: pulumi.Input<string>;
    /**
     * Support URL for authenticating users.
     */
    supportUrl?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Tenant resource.
 */
export interface TenantArgs {
    /**
     * Whether to accept an organization name instead of an ID on auth endpoints.
     */
    allowOrganizationNameInAuthenticationApi?: pulumi.Input<boolean>;
    /**
     * URLs that Auth0 may redirect to after logout.
     */
    allowedLogoutUrls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether to enable flexible factors for MFA in the PostLogin action.
     */
    customizeMfaInPostloginAction?: pulumi.Input<boolean>;
    /**
     * API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
     */
    defaultAudience?: pulumi.Input<string>;
    /**
     * Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
     */
    defaultDirectory?: pulumi.Input<string>;
    /**
     * The default absolute redirection URI. Must be HTTPS or an empty string.
     */
    defaultRedirectionUri?: pulumi.Input<string>;
    /**
     * Supported locales for the user interface. The first locale in the list will be used to set the default locale.
     */
    enabledLocales?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Configuration settings for tenant flags.
     */
    flags?: pulumi.Input<inputs.TenantFlags>;
    /**
     * Friendly name for the tenant.
     */
    friendlyName?: pulumi.Input<string>;
    /**
     * Number of hours during which a session can be inactive before the user must log in again.
     */
    idleSessionLifetime?: pulumi.Input<number>;
    /**
     * URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
     */
    pictureUrl?: pulumi.Input<string>;
    /**
     * Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
     */
    sandboxVersion?: pulumi.Input<string>;
    /**
     * Alters behavior of tenant's session cookie. Contains a single `mode` property.
     */
    sessionCookie?: pulumi.Input<inputs.TenantSessionCookie>;
    /**
     * Number of hours during which a session will stay valid.
     */
    sessionLifetime?: pulumi.Input<number>;
    /**
     * Sessions related settings for the tenant.
     */
    sessions?: pulumi.Input<inputs.TenantSessions>;
    /**
     * Support email address for authenticating users.
     */
    supportEmail?: pulumi.Input<string>;
    /**
     * Support URL for authenticating users.
     */
    supportUrl?: pulumi.Input<string>;
}
