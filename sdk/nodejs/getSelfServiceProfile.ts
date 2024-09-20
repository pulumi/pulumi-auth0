// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Data source to retrieve a specific Auth0 Self-Service Profile by `id`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // An Auth0 Self-Service- Profile loaded using it's ID.
 * const auth0SelfServiceProfile = auth0.getSelfServiceProfile({
 *     id: "some-profile-id",
 * });
 * ```
 */
export function getSelfServiceProfile(args: GetSelfServiceProfileArgs, opts?: pulumi.InvokeOptions): Promise<GetSelfServiceProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("auth0:index/getSelfServiceProfile:getSelfServiceProfile", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getSelfServiceProfile.
 */
export interface GetSelfServiceProfileArgs {
    /**
     * The id of the Self Service Profile
     */
    id: string;
}

/**
 * A collection of values returned by getSelfServiceProfile.
 */
export interface GetSelfServiceProfileResult {
    /**
     * Field can be used to customize the look and feel of the wizard.
     */
    readonly brandings: outputs.GetSelfServiceProfileBranding[];
    /**
     * The ISO 8601 formatted date the profile was created.
     */
    readonly createdAt: string;
    /**
     * The id of the Self Service Profile
     */
    readonly id: string;
    /**
     * The ISO 8601 formatted date the profile was updated.
     */
    readonly updatedAt: string;
    /**
     * This array stores the mapping information that will be shown to the user during the SS-SSO flow. The user will be prompted to map the attributes on their identity provider to ensure the specified attributes get passed to Auth0.
     */
    readonly userAttributes: outputs.GetSelfServiceProfileUserAttribute[];
}
/**
 * Data source to retrieve a specific Auth0 Self-Service Profile by `id`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // An Auth0 Self-Service- Profile loaded using it's ID.
 * const auth0SelfServiceProfile = auth0.getSelfServiceProfile({
 *     id: "some-profile-id",
 * });
 * ```
 */
export function getSelfServiceProfileOutput(args: GetSelfServiceProfileOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSelfServiceProfileResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("auth0:index/getSelfServiceProfile:getSelfServiceProfile", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getSelfServiceProfile.
 */
export interface GetSelfServiceProfileOutputArgs {
    /**
     * The id of the Self Service Profile
     */
    id: pulumi.Input<string>;
}
