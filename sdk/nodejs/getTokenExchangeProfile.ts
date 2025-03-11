// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Data source to retrieve a specific Auth0 Token Exchange Profile by `id`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // An Auth0 Token Exchange Profile loaded using its ID.
 * const myProfile = auth0.getTokenExchangeProfile({
 *     id: "tep_Tnvl88SKv98TkMmr",
 * });
 * ```
 */
export function getTokenExchangeProfile(args: GetTokenExchangeProfileArgs, opts?: pulumi.InvokeOptions): Promise<GetTokenExchangeProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("auth0:index/getTokenExchangeProfile:getTokenExchangeProfile", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getTokenExchangeProfile.
 */
export interface GetTokenExchangeProfileArgs {
    /**
     * The id of the Token Exchange Profile
     */
    id: string;
}

/**
 * A collection of values returned by getTokenExchangeProfile.
 */
export interface GetTokenExchangeProfileResult {
    /**
     * Unique identifier of the Action
     */
    readonly actionId: string;
    /**
     * The ISO 8601 formatted date the credential was created.
     */
    readonly createdAt: string;
    /**
     * The id of the Token Exchange Profile
     */
    readonly id: string;
    /**
     * Name of the token exchange profile.
     */
    readonly name: string;
    /**
     * Type of the subject token
     */
    readonly subjectTokenType: string;
    /**
     * Type of the token exchange profile
     */
    readonly type: string;
    /**
     * The ISO 8601 formatted date the credential was updated.
     */
    readonly updatedAt: string;
}
/**
 * Data source to retrieve a specific Auth0 Token Exchange Profile by `id`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // An Auth0 Token Exchange Profile loaded using its ID.
 * const myProfile = auth0.getTokenExchangeProfile({
 *     id: "tep_Tnvl88SKv98TkMmr",
 * });
 * ```
 */
export function getTokenExchangeProfileOutput(args: GetTokenExchangeProfileOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetTokenExchangeProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("auth0:index/getTokenExchangeProfile:getTokenExchangeProfile", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getTokenExchangeProfile.
 */
export interface GetTokenExchangeProfileOutputArgs {
    /**
     * The id of the Token Exchange Profile
     */
    id: pulumi.Input<string>;
}
