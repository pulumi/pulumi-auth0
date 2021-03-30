// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * With this resource, you can manage Auth0 tenants, including setting logos and support contact information, setting error pages, and configuring default tenant behaviors.
 *
 * > Auth0 does not currently support creating tenants through the Management API. Therefore this resource can only manage an existing tenant created through the Auth0 dashboard.
 *
 * Auth0 does not currently support adding/removing extensions on tenants through their API. The Auth0 dashboard must be used to add/remove extensions.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 * import * as fs from "fs";
 *
 * const tenant = new auth0.Tenant("tenant", {
 *     allowedLogoutUrls: ["http://mysite/logout"],
 *     changePassword: {
 *         enabled: true,
 *         html: fs.readFileSync("./password_reset.html", "utf-8"),
 *     },
 *     defaultAudience: "<client_id>",
 *     defaultDirectory: "Connection-Name",
 *     errorPage: {
 *         html: fs.readFileSync("./error.html", "utf-8"),
 *         showLogLink: true,
 *         url: "http://mysite/errors",
 *     },
 *     friendlyName: "Tenant Name",
 *     guardianMfaPage: {
 *         enabled: true,
 *         html: fs.readFileSync("./guardian_multifactor.html", "utf-8"),
 *     },
 *     pictureUrl: "http://mysite/logo.png",
 *     sandboxVersion: "8",
 *     sessionLifetime: 46000,
 *     supportEmail: "support@mysite",
 *     supportUrl: "http://mysite/support",
 * });
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
     * List(String). URLs that Auth0 may redirect to after logout.
     */
    public readonly allowedLogoutUrls!: pulumi.Output<string[]>;
    /**
     * List(Resource). Configuration settings for change passsword page. For details, see Change Password Page.
     */
    public readonly changePassword!: pulumi.Output<outputs.TenantChangePassword>;
    /**
     * String. API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
     */
    public readonly defaultAudience!: pulumi.Output<string>;
    /**
     * String. Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
     */
    public readonly defaultDirectory!: pulumi.Output<string>;
    /**
     * String. The default absolute redirection uri, must be https and cannot contain a fragment.
     */
    public readonly defaultRedirectionUri!: pulumi.Output<string>;
    /**
     * List(String). Supported locales for the user interface. The first locale in the list will be used to set the default locale.
     */
    public readonly enabledLocales!: pulumi.Output<string[]>;
    /**
     * List(Resource). Configuration settings for error pages. For details, see Error Page.
     */
    public readonly errorPage!: pulumi.Output<outputs.TenantErrorPage>;
    /**
     * List(Resource). Configuration settings for tenant flags. For details, see Flags.
     */
    public readonly flags!: pulumi.Output<outputs.TenantFlags>;
    /**
     * String. Friendly name for the tenant.
     */
    public readonly friendlyName!: pulumi.Output<string>;
    /**
     * List(Resource). Configuration settings for the Guardian MFA page. For details, see Guardian MFA Page.
     */
    public readonly guardianMfaPage!: pulumi.Output<outputs.TenantGuardianMfaPage>;
    /**
     * Integer. Number of hours during which a session can be inactive before the user must log in again.
     */
    public readonly idleSessionLifetime!: pulumi.Output<number>;
    /**
     * . String URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
     */
    public readonly pictureUrl!: pulumi.Output<string>;
    /**
     * String. Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
     */
    public readonly sandboxVersion!: pulumi.Output<string>;
    /**
     * Integer. Number of hours during which a session will stay valid.
     */
    public readonly sessionLifetime!: pulumi.Output<number>;
    /**
     * String. Support email address for authenticating users.
     */
    public readonly supportEmail!: pulumi.Output<string>;
    /**
     * String. Support URL for authenticating users.
     */
    public readonly supportUrl!: pulumi.Output<string>;
    /**
     * List(Resource). Configuration settings for Universal Login. For details, see Universal Login.
     */
    public readonly universalLogin!: pulumi.Output<outputs.TenantUniversalLogin>;

    /**
     * Create a Tenant resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TenantArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TenantArgs | TenantState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TenantState | undefined;
            inputs["allowedLogoutUrls"] = state ? state.allowedLogoutUrls : undefined;
            inputs["changePassword"] = state ? state.changePassword : undefined;
            inputs["defaultAudience"] = state ? state.defaultAudience : undefined;
            inputs["defaultDirectory"] = state ? state.defaultDirectory : undefined;
            inputs["defaultRedirectionUri"] = state ? state.defaultRedirectionUri : undefined;
            inputs["enabledLocales"] = state ? state.enabledLocales : undefined;
            inputs["errorPage"] = state ? state.errorPage : undefined;
            inputs["flags"] = state ? state.flags : undefined;
            inputs["friendlyName"] = state ? state.friendlyName : undefined;
            inputs["guardianMfaPage"] = state ? state.guardianMfaPage : undefined;
            inputs["idleSessionLifetime"] = state ? state.idleSessionLifetime : undefined;
            inputs["pictureUrl"] = state ? state.pictureUrl : undefined;
            inputs["sandboxVersion"] = state ? state.sandboxVersion : undefined;
            inputs["sessionLifetime"] = state ? state.sessionLifetime : undefined;
            inputs["supportEmail"] = state ? state.supportEmail : undefined;
            inputs["supportUrl"] = state ? state.supportUrl : undefined;
            inputs["universalLogin"] = state ? state.universalLogin : undefined;
        } else {
            const args = argsOrState as TenantArgs | undefined;
            inputs["allowedLogoutUrls"] = args ? args.allowedLogoutUrls : undefined;
            inputs["changePassword"] = args ? args.changePassword : undefined;
            inputs["defaultAudience"] = args ? args.defaultAudience : undefined;
            inputs["defaultDirectory"] = args ? args.defaultDirectory : undefined;
            inputs["defaultRedirectionUri"] = args ? args.defaultRedirectionUri : undefined;
            inputs["enabledLocales"] = args ? args.enabledLocales : undefined;
            inputs["errorPage"] = args ? args.errorPage : undefined;
            inputs["flags"] = args ? args.flags : undefined;
            inputs["friendlyName"] = args ? args.friendlyName : undefined;
            inputs["guardianMfaPage"] = args ? args.guardianMfaPage : undefined;
            inputs["idleSessionLifetime"] = args ? args.idleSessionLifetime : undefined;
            inputs["pictureUrl"] = args ? args.pictureUrl : undefined;
            inputs["sandboxVersion"] = args ? args.sandboxVersion : undefined;
            inputs["sessionLifetime"] = args ? args.sessionLifetime : undefined;
            inputs["supportEmail"] = args ? args.supportEmail : undefined;
            inputs["supportUrl"] = args ? args.supportUrl : undefined;
            inputs["universalLogin"] = args ? args.universalLogin : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Tenant.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Tenant resources.
 */
export interface TenantState {
    /**
     * List(String). URLs that Auth0 may redirect to after logout.
     */
    readonly allowedLogoutUrls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List(Resource). Configuration settings for change passsword page. For details, see Change Password Page.
     */
    readonly changePassword?: pulumi.Input<inputs.TenantChangePassword>;
    /**
     * String. API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
     */
    readonly defaultAudience?: pulumi.Input<string>;
    /**
     * String. Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
     */
    readonly defaultDirectory?: pulumi.Input<string>;
    /**
     * String. The default absolute redirection uri, must be https and cannot contain a fragment.
     */
    readonly defaultRedirectionUri?: pulumi.Input<string>;
    /**
     * List(String). Supported locales for the user interface. The first locale in the list will be used to set the default locale.
     */
    readonly enabledLocales?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List(Resource). Configuration settings for error pages. For details, see Error Page.
     */
    readonly errorPage?: pulumi.Input<inputs.TenantErrorPage>;
    /**
     * List(Resource). Configuration settings for tenant flags. For details, see Flags.
     */
    readonly flags?: pulumi.Input<inputs.TenantFlags>;
    /**
     * String. Friendly name for the tenant.
     */
    readonly friendlyName?: pulumi.Input<string>;
    /**
     * List(Resource). Configuration settings for the Guardian MFA page. For details, see Guardian MFA Page.
     */
    readonly guardianMfaPage?: pulumi.Input<inputs.TenantGuardianMfaPage>;
    /**
     * Integer. Number of hours during which a session can be inactive before the user must log in again.
     */
    readonly idleSessionLifetime?: pulumi.Input<number>;
    /**
     * . String URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
     */
    readonly pictureUrl?: pulumi.Input<string>;
    /**
     * String. Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
     */
    readonly sandboxVersion?: pulumi.Input<string>;
    /**
     * Integer. Number of hours during which a session will stay valid.
     */
    readonly sessionLifetime?: pulumi.Input<number>;
    /**
     * String. Support email address for authenticating users.
     */
    readonly supportEmail?: pulumi.Input<string>;
    /**
     * String. Support URL for authenticating users.
     */
    readonly supportUrl?: pulumi.Input<string>;
    /**
     * List(Resource). Configuration settings for Universal Login. For details, see Universal Login.
     */
    readonly universalLogin?: pulumi.Input<inputs.TenantUniversalLogin>;
}

/**
 * The set of arguments for constructing a Tenant resource.
 */
export interface TenantArgs {
    /**
     * List(String). URLs that Auth0 may redirect to after logout.
     */
    readonly allowedLogoutUrls?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List(Resource). Configuration settings for change passsword page. For details, see Change Password Page.
     */
    readonly changePassword?: pulumi.Input<inputs.TenantChangePassword>;
    /**
     * String. API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
     */
    readonly defaultAudience?: pulumi.Input<string>;
    /**
     * String. Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
     */
    readonly defaultDirectory?: pulumi.Input<string>;
    /**
     * String. The default absolute redirection uri, must be https and cannot contain a fragment.
     */
    readonly defaultRedirectionUri?: pulumi.Input<string>;
    /**
     * List(String). Supported locales for the user interface. The first locale in the list will be used to set the default locale.
     */
    readonly enabledLocales?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * List(Resource). Configuration settings for error pages. For details, see Error Page.
     */
    readonly errorPage?: pulumi.Input<inputs.TenantErrorPage>;
    /**
     * List(Resource). Configuration settings for tenant flags. For details, see Flags.
     */
    readonly flags?: pulumi.Input<inputs.TenantFlags>;
    /**
     * String. Friendly name for the tenant.
     */
    readonly friendlyName?: pulumi.Input<string>;
    /**
     * List(Resource). Configuration settings for the Guardian MFA page. For details, see Guardian MFA Page.
     */
    readonly guardianMfaPage?: pulumi.Input<inputs.TenantGuardianMfaPage>;
    /**
     * Integer. Number of hours during which a session can be inactive before the user must log in again.
     */
    readonly idleSessionLifetime?: pulumi.Input<number>;
    /**
     * . String URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
     */
    readonly pictureUrl?: pulumi.Input<string>;
    /**
     * String. Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
     */
    readonly sandboxVersion?: pulumi.Input<string>;
    /**
     * Integer. Number of hours during which a session will stay valid.
     */
    readonly sessionLifetime?: pulumi.Input<number>;
    /**
     * String. Support email address for authenticating users.
     */
    readonly supportEmail?: pulumi.Input<string>;
    /**
     * String. Support URL for authenticating users.
     */
    readonly supportUrl?: pulumi.Input<string>;
    /**
     * List(Resource). Configuration settings for Universal Login. For details, see Universal Login.
     */
    readonly universalLogin?: pulumi.Input<inputs.TenantUniversalLogin>;
}
