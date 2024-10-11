// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Data source to retrieve a specific Auth0 Flow Vault Connection by `id`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // An Auth0 flow vault connection loaded using its ID.
 * const dataConnection = auth0.getFlowVaultConnection({
 *     id: "ac_9m2uqjHsqs19riN9N6sZQ7",
 * });
 * ```
 */
export function getFlowVaultConnection(args: GetFlowVaultConnectionArgs, opts?: pulumi.InvokeOptions): Promise<GetFlowVaultConnectionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("auth0:index/getFlowVaultConnection:getFlowVaultConnection", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getFlowVaultConnection.
 */
export interface GetFlowVaultConnectionArgs {
    /**
     * The id of the Flow Vault Connection.
     */
    id: string;
}

/**
 * A collection of values returned by getFlowVaultConnection.
 */
export interface GetFlowVaultConnectionResult {
    /**
     * Custom account name of the vault connection.
     */
    readonly accountName: string;
    /**
     * App identifier of the vault connection.
     */
    readonly appId: string;
    /**
     * Environment of the vault connection.
     */
    readonly environment: string;
    /**
     * Fingerprint of the vault connection.
     */
    readonly fingerprint: string;
    /**
     * The id of the Flow Vault Connection.
     */
    readonly id: string;
    /**
     * Name of the vault connection.
     */
    readonly name: string;
    /**
     * Indicates if the vault connection is configured.
     */
    readonly ready: boolean;
    /**
     * Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
     */
    readonly setup: {[key: string]: string};
}
/**
 * Data source to retrieve a specific Auth0 Flow Vault Connection by `id`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // An Auth0 flow vault connection loaded using its ID.
 * const dataConnection = auth0.getFlowVaultConnection({
 *     id: "ac_9m2uqjHsqs19riN9N6sZQ7",
 * });
 * ```
 */
export function getFlowVaultConnectionOutput(args: GetFlowVaultConnectionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFlowVaultConnectionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("auth0:index/getFlowVaultConnection:getFlowVaultConnection", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getFlowVaultConnection.
 */
export interface GetFlowVaultConnectionOutputArgs {
    /**
     * The id of the Flow Vault Connection.
     */
    id: pulumi.Input<string>;
}