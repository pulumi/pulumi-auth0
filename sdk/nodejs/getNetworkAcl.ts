// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Data source to retrieve a specific Auth0 Network ACL by ID.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // An Auth0 network acl loaded using its ID.
 * const myNetworkAcl = auth0.getNetworkAcl({
 *     id: "167f9a50-4444-3333-1111-ndfdaf953ab4",
 * });
 * ```
 */
export function getNetworkAcl(args: GetNetworkAclArgs, opts?: pulumi.InvokeOptions): Promise<GetNetworkAclResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("auth0:index/getNetworkAcl:getNetworkAcl", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkAcl.
 */
export interface GetNetworkAclArgs {
    /**
     * The ID of the Network ACL.
     */
    id: string;
}

/**
 * A collection of values returned by getNetworkAcl.
 */
export interface GetNetworkAclResult {
    /**
     * Whether the Network ACL is active
     */
    readonly active: boolean;
    /**
     * The description of the Network ACL
     */
    readonly description: string;
    /**
     * The ID of the Network ACL.
     */
    readonly id: string;
    /**
     * The priority of the Network ACL. Must be unique between 1 and 10.
     */
    readonly priority: number;
    /**
     * The rule of the Network ACL
     */
    readonly rules: outputs.GetNetworkAclRule[];
}
/**
 * Data source to retrieve a specific Auth0 Network ACL by ID.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // An Auth0 network acl loaded using its ID.
 * const myNetworkAcl = auth0.getNetworkAcl({
 *     id: "167f9a50-4444-3333-1111-ndfdaf953ab4",
 * });
 * ```
 */
export function getNetworkAclOutput(args: GetNetworkAclOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetNetworkAclResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("auth0:index/getNetworkAcl:getNetworkAcl", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getNetworkAcl.
 */
export interface GetNetworkAclOutputArgs {
    /**
     * The ID of the Network ACL.
     */
    id: pulumi.Input<string>;
}
