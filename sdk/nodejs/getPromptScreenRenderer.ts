// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Data source to retrieve a specific Auth0 prompt screen settings by `promptType` and `screenName`
 */
export function getPromptScreenRenderer(args: GetPromptScreenRendererArgs, opts?: pulumi.InvokeOptions): Promise<GetPromptScreenRendererResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("auth0:index/getPromptScreenRenderer:getPromptScreenRenderer", {
        "promptType": args.promptType,
        "screenName": args.screenName,
    }, opts);
}

/**
 * A collection of arguments for invoking getPromptScreenRenderer.
 */
export interface GetPromptScreenRendererArgs {
    /**
     * The type of prompt to customize.
     */
    promptType: string;
    /**
     * The screen name associated with the prompt type.
     */
    screenName: string;
}

/**
 * A collection of values returned by getPromptScreenRenderer.
 */
export interface GetPromptScreenRendererResult {
    /**
     * Context values to make available
     */
    readonly contextConfigurations: string[];
    /**
     * Override Universal Login default head tags
     */
    readonly defaultHeadTagsDisabled: boolean;
    /**
     * Optional filters to apply rendering rules to specific entities. `matchType` and at least one of the entity arrays are required.
     */
    readonly filters: outputs.GetPromptScreenRendererFilter[];
    /**
     * An array of head tags
     */
    readonly headTags: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The type of prompt to customize.
     */
    readonly promptType: string;
    /**
     * Rendering modeOptions are: `standard`, `advanced`.
     */
    readonly renderingMode: string;
    /**
     * The screen name associated with the prompt type.
     */
    readonly screenName: string;
    /**
     * Tenant ID
     */
    readonly tenant: string;
    /**
     * Use page template with ACUL
     */
    readonly usePageTemplate: boolean;
}
/**
 * Data source to retrieve a specific Auth0 prompt screen settings by `promptType` and `screenName`
 */
export function getPromptScreenRendererOutput(args: GetPromptScreenRendererOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPromptScreenRendererResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("auth0:index/getPromptScreenRenderer:getPromptScreenRenderer", {
        "promptType": args.promptType,
        "screenName": args.screenName,
    }, opts);
}

/**
 * A collection of arguments for invoking getPromptScreenRenderer.
 */
export interface GetPromptScreenRendererOutputArgs {
    /**
     * The type of prompt to customize.
     */
    promptType: pulumi.Input<string>;
    /**
     * The screen name associated with the prompt type.
     */
    screenName: pulumi.Input<string>;
}
