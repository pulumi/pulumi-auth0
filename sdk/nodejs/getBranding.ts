// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to access information about the tenant's branding settings.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myBranding = auth0.getBranding({});
 * ```
 */
export function getBranding(opts?: pulumi.InvokeOptions): Promise<GetBrandingResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("auth0:index/getBranding:getBranding", {
    }, opts);
}

/**
 * A collection of values returned by getBranding.
 */
export interface GetBrandingResult {
    /**
     * Configuration settings for colors for branding.
     */
    readonly colors: outputs.GetBrandingColor[];
    /**
     * URL for the favicon.
     */
    readonly faviconUrl: string;
    /**
     * Configuration settings to customize the font.
     */
    readonly fonts: outputs.GetBrandingFont[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * URL of logo for branding.
     */
    readonly logoUrl: string;
    /**
     * Configuration settings for Universal Login.
     */
    readonly universalLogins: outputs.GetBrandingUniversalLogin[];
}
/**
 * Use this data source to access information about the tenant's branding settings.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myBranding = auth0.getBranding({});
 * ```
 */
export function getBrandingOutput(opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetBrandingResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("auth0:index/getBranding:getBranding", {
    }, opts);
}
