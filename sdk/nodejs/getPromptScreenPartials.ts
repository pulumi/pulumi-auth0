// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Data source to retrieve a specific Auth0 prompt screen partials by `promptType`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const promptScreenPartials = auth0.getPromptScreenPartials({
 *     promptType: "prompt-name",
 * });
 * ```
 */
export function getPromptScreenPartials(args: GetPromptScreenPartialsArgs, opts?: pulumi.InvokeOptions): Promise<GetPromptScreenPartialsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("auth0:index/getPromptScreenPartials:getPromptScreenPartials", {
        "promptType": args.promptType,
        "screenPartials": args.screenPartials,
    }, opts);
}

/**
 * A collection of arguments for invoking getPromptScreenPartials.
 */
export interface GetPromptScreenPartialsArgs {
    /**
     * The type of prompt to customize.
     */
    promptType: string;
    /**
     * The screen partials associated with the prompt type.
     */
    screenPartials?: inputs.GetPromptScreenPartialsScreenPartial[];
}

/**
 * A collection of values returned by getPromptScreenPartials.
 */
export interface GetPromptScreenPartialsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The type of prompt to customize.
     */
    readonly promptType: string;
    /**
     * The screen partials associated with the prompt type.
     */
    readonly screenPartials: outputs.GetPromptScreenPartialsScreenPartial[];
}
/**
 * Data source to retrieve a specific Auth0 prompt screen partials by `promptType`.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const promptScreenPartials = auth0.getPromptScreenPartials({
 *     promptType: "prompt-name",
 * });
 * ```
 */
export function getPromptScreenPartialsOutput(args: GetPromptScreenPartialsOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPromptScreenPartialsResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("auth0:index/getPromptScreenPartials:getPromptScreenPartials", {
        "promptType": args.promptType,
        "screenPartials": args.screenPartials,
    }, opts);
}

/**
 * A collection of arguments for invoking getPromptScreenPartials.
 */
export interface GetPromptScreenPartialsOutputArgs {
    /**
     * The type of prompt to customize.
     */
    promptType: pulumi.Input<string>;
    /**
     * The screen partials associated with the prompt type.
     */
    screenPartials?: pulumi.Input<pulumi.Input<inputs.GetPromptScreenPartialsScreenPartialArgs>[]>;
}
