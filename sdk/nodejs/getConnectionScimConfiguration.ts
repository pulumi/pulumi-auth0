// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Data source to retrieve a SCIM configuration for an Auth0 connection by `connectionId`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myEnterpriseConnection = new auth0.Connection("my_enterprise_connection", {
 *     name: "my-enterprise-connection",
 *     displayName: "My Enterprise Connection",
 *     strategy: "okta",
 *     options: {
 *         clientId: "1234567",
 *         clientSecret: "1234567",
 *         issuer: "https://example.okta.com",
 *         jwksUri: "https://example.okta.com/oauth2/v1/keys",
 *         tokenEndpoint: "https://example.okta.com/oauth2/v1/token",
 *         authorizationEndpoint: "https://example.okta.com/oauth2/v1/authorize",
 *     },
 * });
 * const myConnScimConfiguration = new auth0.ConnectionScimConfiguration("my_conn_scim_configuration", {connectionId: myEnterpriseConnection.id});
 * // A data source for an Auth0 Connection SCIM Configuration.
 * const myConnScimConfigurationData = auth0.getConnectionScimConfigurationOutput({
 *     connectionId: myConnScimConfiguration.id,
 * });
 * ```
 */
export function getConnectionScimConfiguration(args: GetConnectionScimConfigurationArgs, opts?: pulumi.InvokeOptions): Promise<GetConnectionScimConfigurationResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("auth0:index/getConnectionScimConfiguration:getConnectionScimConfiguration", {
        "connectionId": args.connectionId,
        "defaultMappings": args.defaultMappings,
        "mappings": args.mappings,
    }, opts);
}

/**
 * A collection of arguments for invoking getConnectionScimConfiguration.
 */
export interface GetConnectionScimConfigurationArgs {
    /**
     * ID of the connection for this SCIM configuration.
     */
    connectionId: string;
    /**
     * Default mapping between Auth0 attributes and SCIM attributes for this connection type.
     */
    defaultMappings?: inputs.GetConnectionScimConfigurationDefaultMapping[];
    /**
     * Mapping between Auth0 attributes and SCIM attributes.
     */
    mappings?: inputs.GetConnectionScimConfigurationMapping[];
}

/**
 * A collection of values returned by getConnectionScimConfiguration.
 */
export interface GetConnectionScimConfigurationResult {
    /**
     * ID of the connection for this SCIM configuration.
     */
    readonly connectionId: string;
    /**
     * Name of the connection for this SCIM configuration.
     */
    readonly connectionName: string;
    /**
     * Default mapping between Auth0 attributes and SCIM attributes for this connection type.
     */
    readonly defaultMappings: outputs.GetConnectionScimConfigurationDefaultMapping[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Mapping between Auth0 attributes and SCIM attributes.
     */
    readonly mappings: outputs.GetConnectionScimConfigurationMapping[];
    /**
     * Schema of the connection for this SCIM configuration.
     */
    readonly strategy: string;
    /**
     * Name of the tenant for this SCIM configuration.
     */
    readonly tenantName: string;
    /**
     * User ID attribute for generation unique of user ids.
     */
    readonly userIdAttribute: string;
}
/**
 * Data source to retrieve a SCIM configuration for an Auth0 connection by `connectionId`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myEnterpriseConnection = new auth0.Connection("my_enterprise_connection", {
 *     name: "my-enterprise-connection",
 *     displayName: "My Enterprise Connection",
 *     strategy: "okta",
 *     options: {
 *         clientId: "1234567",
 *         clientSecret: "1234567",
 *         issuer: "https://example.okta.com",
 *         jwksUri: "https://example.okta.com/oauth2/v1/keys",
 *         tokenEndpoint: "https://example.okta.com/oauth2/v1/token",
 *         authorizationEndpoint: "https://example.okta.com/oauth2/v1/authorize",
 *     },
 * });
 * const myConnScimConfiguration = new auth0.ConnectionScimConfiguration("my_conn_scim_configuration", {connectionId: myEnterpriseConnection.id});
 * // A data source for an Auth0 Connection SCIM Configuration.
 * const myConnScimConfigurationData = auth0.getConnectionScimConfigurationOutput({
 *     connectionId: myConnScimConfiguration.id,
 * });
 * ```
 */
export function getConnectionScimConfigurationOutput(args: GetConnectionScimConfigurationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetConnectionScimConfigurationResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("auth0:index/getConnectionScimConfiguration:getConnectionScimConfiguration", {
        "connectionId": args.connectionId,
        "defaultMappings": args.defaultMappings,
        "mappings": args.mappings,
    }, opts);
}

/**
 * A collection of arguments for invoking getConnectionScimConfiguration.
 */
export interface GetConnectionScimConfigurationOutputArgs {
    /**
     * ID of the connection for this SCIM configuration.
     */
    connectionId: pulumi.Input<string>;
    /**
     * Default mapping between Auth0 attributes and SCIM attributes for this connection type.
     */
    defaultMappings?: pulumi.Input<pulumi.Input<inputs.GetConnectionScimConfigurationDefaultMappingArgs>[]>;
    /**
     * Mapping between Auth0 attributes and SCIM attributes.
     */
    mappings?: pulumi.Input<pulumi.Input<inputs.GetConnectionScimConfigurationMappingArgs>[]>;
}
