// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Data source to retrieve a specific Auth0 connection by `connectionId` or `name`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // An Auth0 Connection loaded using its name.
 * const some-connection-by-name = auth0.getConnection({
 *     name: "Acceptance-Test-Connection-{{.testName}}",
 * });
 * // An Auth0 Connection loaded using its ID.
 * const some-connection-by-id = auth0.getConnection({
 *     connectionId: "con_abcdefghkijklmnopqrstuvwxyz0123456789",
 * });
 * ```
 */
export function getConnection(args?: GetConnectionArgs, opts?: pulumi.InvokeOptions): Promise<GetConnectionResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("auth0:index/getConnection:getConnection", {
        "connectionId": args.connectionId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getConnection.
 */
export interface GetConnectionArgs {
    /**
     * The ID of the connection. If not provided, `name` must be set.
     */
    connectionId?: string;
    /**
     * The name of the connection. If not provided, `connectionId` must be set.
     */
    name?: string;
}

/**
 * A collection of values returned by getConnection.
 */
export interface GetConnectionResult {
    /**
     * The ID of the connection. If not provided, `name` must be set.
     */
    readonly connectionId?: string;
    /**
     * Name used in login screen.
     */
    readonly displayName: string;
    /**
     * IDs of the clients for which the connection is enabled.
     */
    readonly enabledClients: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Indicates whether the connection is domain level.
     */
    readonly isDomainConnection: boolean;
    /**
     * Metadata associated with the connection, in the form of a map of string values (max 255 chars).
     */
    readonly metadata: {[key: string]: string};
    /**
     * The name of the connection. If not provided, `connectionId` must be set.
     */
    readonly name?: string;
    /**
     * Configuration settings for connection options.
     */
    readonly options: outputs.GetConnectionOption[];
    /**
     * Defines the realms for which the connection will be used (e.g., email domains). If not specified, the connection name is added as the realm.
     */
    readonly realms: string[];
    /**
     * Display connection as a button. Only available on enterprise connections.
     */
    readonly showAsButton: boolean;
    /**
     * Type of the connection, which indicates the identity provider.
     */
    readonly strategy: string;
}
/**
 * Data source to retrieve a specific Auth0 connection by `connectionId` or `name`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // An Auth0 Connection loaded using its name.
 * const some-connection-by-name = auth0.getConnection({
 *     name: "Acceptance-Test-Connection-{{.testName}}",
 * });
 * // An Auth0 Connection loaded using its ID.
 * const some-connection-by-id = auth0.getConnection({
 *     connectionId: "con_abcdefghkijklmnopqrstuvwxyz0123456789",
 * });
 * ```
 */
export function getConnectionOutput(args?: GetConnectionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetConnectionResult> {
    return pulumi.output(args).apply((a: any) => getConnection(a, opts))
}

/**
 * A collection of arguments for invoking getConnection.
 */
export interface GetConnectionOutputArgs {
    /**
     * The ID of the connection. If not provided, `name` must be set.
     */
    connectionId?: pulumi.Input<string>;
    /**
     * The name of the connection. If not provided, `connectionId` must be set.
     */
    name?: pulumi.Input<string>;
}
