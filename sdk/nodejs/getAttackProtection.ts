// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use this data source to access information about the tenant's attack protection settings.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myProtection = auth0.getAttackProtection({});
 * ```
 */
export function getAttackProtection(opts?: pulumi.InvokeOptions): Promise<GetAttackProtectionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("auth0:index/getAttackProtection:getAttackProtection", {
    }, opts);
}

/**
 * A collection of values returned by getAttackProtection.
 */
export interface GetAttackProtectionResult {
    /**
     * Breached password detection protects your applications from bad actors logging in with stolen credentials.
     */
    readonly breachedPasswordDetections: outputs.GetAttackProtectionBreachedPasswordDetection[];
    /**
     * Brute-force protection safeguards against a single IP address attacking a single user account.
     */
    readonly bruteForceProtections: outputs.GetAttackProtectionBruteForceProtection[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
     */
    readonly suspiciousIpThrottlings: outputs.GetAttackProtectionSuspiciousIpThrottling[];
}
/**
 * Use this data source to access information about the tenant's attack protection settings.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myProtection = auth0.getAttackProtection({});
 * ```
 */
export function getAttackProtectionOutput(opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAttackProtectionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("auth0:index/getAttackProtection:getAttackProtection", {
    }, opts);
}
