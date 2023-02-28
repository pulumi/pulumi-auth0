// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to access information about the tenant this provider is configured to access.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myTenant = auth0.getTenant({});
 * ```
 */
export function getTenant(opts?: pulumi.InvokeOptions): Promise<GetTenantResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("auth0:index/getTenant:getTenant", {
    }, opts);
}

/**
 * A collection of values returned by getTenant.
 */
export interface GetTenantResult {
    /**
     * URLs that Auth0 may redirect to after logout.
     */
    readonly allowedLogoutUrls: string[];
    /**
     * Configuration settings for change password page.
     */
    readonly changePasswords: outputs.GetTenantChangePassword[];
    /**
     * API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
     */
    readonly defaultAudience: string;
    /**
     * Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
     */
    readonly defaultDirectory: string;
    /**
     * The default absolute redirection URI. Must be HTTPS or an empty string.
     */
    readonly defaultRedirectionUri: string;
    /**
     * Your Auth0 domain name.
     */
    readonly domain: string;
    /**
     * Supported locales for the user interface. The first locale in the list will be used to set the default locale.
     */
    readonly enabledLocales: string[];
    /**
     * Configuration settings for error pages.
     */
    readonly errorPages: outputs.GetTenantErrorPage[];
    /**
     * Configuration settings for tenant flags.
     */
    readonly flags: outputs.GetTenantFlag[];
    /**
     * Friendly name for the tenant.
     */
    readonly friendlyName: string;
    /**
     * Configuration settings for the Guardian MFA page.
     */
    readonly guardianMfaPages: outputs.GetTenantGuardianMfaPage[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Number of hours during which a session can be inactive before the user must log in again.
     */
    readonly idleSessionLifetime: number;
    /**
     * The identifier value of the built-in Management API resource server, which can be used as an audience when configuring client grants.
     */
    readonly managementApiIdentifier: string;
    /**
     * URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
     */
    readonly pictureUrl: string;
    /**
     * Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
     */
    readonly sandboxVersion: string;
    /**
     * Alters behavior of tenant's session cookie. Contains a single `mode` property.
     */
    readonly sessionCookies: outputs.GetTenantSessionCooky[];
    /**
     * Number of hours during which a session will stay valid.
     */
    readonly sessionLifetime: number;
    /**
     * Support email address for authenticating users.
     */
    readonly supportEmail: string;
    /**
     * Support URL for authenticating users.
     */
    readonly supportUrl: string;
    /**
     * Configuration settings for Universal Login.
     */
    readonly universalLogins: outputs.GetTenantUniversalLogin[];
}
