// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * With Auth0, you can use a custom domain to maintain a consistent user experience. This resource allows you to create and manage a custom domain within your Auth0 tenant.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myCustomDomain = new auth0.CustomDomain("my_custom_domain", {
 *     domain: "auth.example.com",
 *     type: "auth0_managed_certs",
 *     tlsPolicy: "recommended",
 *     domainMetadata: {
 *         key1: "value1",
 *         key2: "value2",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Custom domains can be imported using their ID.
 *
 * You can find existing custom domain IDs using the Auth0 Management API.
 *
 * https://auth0.com/docs/api/management/v2#!/Custom_Domains/get_custom_domains
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/customDomain:CustomDomain my_custom_domain "cd_XXXXXXXXXXXXXXXX"
 * ```
 */
export class CustomDomain extends pulumi.CustomResource {
    /**
     * Get an existing CustomDomain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CustomDomainState, opts?: pulumi.CustomResourceOptions): CustomDomain {
        return new CustomDomain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/customDomain:CustomDomain';

    /**
     * Returns true if the given object is an instance of CustomDomain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CustomDomain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CustomDomain.__pulumiType;
    }

    /**
     * The Custom Domain certificate.
     */
    public /*out*/ readonly certificates!: pulumi.Output<outputs.CustomDomainCertificate[]>;
    /**
     * The HTTP header to fetch the client's IP address. Cannot be set on auth0Managed domains.
     */
    public readonly customClientIpHeader!: pulumi.Output<string | undefined>;
    /**
     * Name of the custom domain.
     */
    public readonly domain!: pulumi.Output<string>;
    /**
     * Metadata associated with the Custom Domain. Maximum of 10 metadata properties allowed.
     */
    public readonly domainMetadata!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Once the configuration status is `ready`, the DNS name of the Auth0 origin server that handles traffic for the custom domain.
     */
    public /*out*/ readonly originDomainName!: pulumi.Output<string>;
    /**
     * Indicates whether this is a primary domain.
     *
     * @deprecated Primary field is no longer used and will be removed in a future release.
     */
    public /*out*/ readonly primary!: pulumi.Output<boolean>;
    /**
     * Configuration status for the custom domain. Options include `disabled`, `pending`, `pendingVerification`, and `ready`.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * TLS policy for the custom domain. Available options are: `compatible` or `recommended`. Compatible includes TLS 1.0, 1.1, 1.2, and recommended only includes TLS 1.2. Cannot be set on selfManaged domains.
     */
    public readonly tlsPolicy!: pulumi.Output<string>;
    /**
     * Provisioning type for the custom domain. Options include `auth0ManagedCerts` and `selfManagedCerts`.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * Configuration settings for verification.
     */
    public /*out*/ readonly verifications!: pulumi.Output<outputs.CustomDomainVerification[]>;

    /**
     * Create a CustomDomain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CustomDomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CustomDomainArgs | CustomDomainState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CustomDomainState | undefined;
            resourceInputs["certificates"] = state ? state.certificates : undefined;
            resourceInputs["customClientIpHeader"] = state ? state.customClientIpHeader : undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["domainMetadata"] = state ? state.domainMetadata : undefined;
            resourceInputs["originDomainName"] = state ? state.originDomainName : undefined;
            resourceInputs["primary"] = state ? state.primary : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tlsPolicy"] = state ? state.tlsPolicy : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["verifications"] = state ? state.verifications : undefined;
        } else {
            const args = argsOrState as CustomDomainArgs | undefined;
            if ((!args || args.domain === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domain'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["customClientIpHeader"] = args ? args.customClientIpHeader : undefined;
            resourceInputs["domain"] = args ? args.domain : undefined;
            resourceInputs["domainMetadata"] = args ? args.domainMetadata : undefined;
            resourceInputs["tlsPolicy"] = args ? args.tlsPolicy : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["certificates"] = undefined /*out*/;
            resourceInputs["originDomainName"] = undefined /*out*/;
            resourceInputs["primary"] = undefined /*out*/;
            resourceInputs["status"] = undefined /*out*/;
            resourceInputs["verifications"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CustomDomain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CustomDomain resources.
 */
export interface CustomDomainState {
    /**
     * The Custom Domain certificate.
     */
    certificates?: pulumi.Input<pulumi.Input<inputs.CustomDomainCertificate>[]>;
    /**
     * The HTTP header to fetch the client's IP address. Cannot be set on auth0Managed domains.
     */
    customClientIpHeader?: pulumi.Input<string>;
    /**
     * Name of the custom domain.
     */
    domain?: pulumi.Input<string>;
    /**
     * Metadata associated with the Custom Domain. Maximum of 10 metadata properties allowed.
     */
    domainMetadata?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Once the configuration status is `ready`, the DNS name of the Auth0 origin server that handles traffic for the custom domain.
     */
    originDomainName?: pulumi.Input<string>;
    /**
     * Indicates whether this is a primary domain.
     *
     * @deprecated Primary field is no longer used and will be removed in a future release.
     */
    primary?: pulumi.Input<boolean>;
    /**
     * Configuration status for the custom domain. Options include `disabled`, `pending`, `pendingVerification`, and `ready`.
     */
    status?: pulumi.Input<string>;
    /**
     * TLS policy for the custom domain. Available options are: `compatible` or `recommended`. Compatible includes TLS 1.0, 1.1, 1.2, and recommended only includes TLS 1.2. Cannot be set on selfManaged domains.
     */
    tlsPolicy?: pulumi.Input<string>;
    /**
     * Provisioning type for the custom domain. Options include `auth0ManagedCerts` and `selfManagedCerts`.
     */
    type?: pulumi.Input<string>;
    /**
     * Configuration settings for verification.
     */
    verifications?: pulumi.Input<pulumi.Input<inputs.CustomDomainVerification>[]>;
}

/**
 * The set of arguments for constructing a CustomDomain resource.
 */
export interface CustomDomainArgs {
    /**
     * The HTTP header to fetch the client's IP address. Cannot be set on auth0Managed domains.
     */
    customClientIpHeader?: pulumi.Input<string>;
    /**
     * Name of the custom domain.
     */
    domain: pulumi.Input<string>;
    /**
     * Metadata associated with the Custom Domain. Maximum of 10 metadata properties allowed.
     */
    domainMetadata?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * TLS policy for the custom domain. Available options are: `compatible` or `recommended`. Compatible includes TLS 1.0, 1.1, 1.2, and recommended only includes TLS 1.2. Cannot be set on selfManaged domains.
     */
    tlsPolicy?: pulumi.Input<string>;
    /**
     * Provisioning type for the custom domain. Options include `auth0ManagedCerts` and `selfManagedCerts`.
     */
    type: pulumi.Input<string>;
}
