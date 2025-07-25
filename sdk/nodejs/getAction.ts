// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Data source to retrieve a specific Auth0 action by `name`.
 */
export function getAction(args?: GetActionArgs, opts?: pulumi.InvokeOptions): Promise<GetActionResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("auth0:index/getAction:getAction", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getAction.
 */
export interface GetActionArgs {
    /**
     * The ID of the action. If not provided, `name` must be set.
     */
    id?: string;
    /**
     * The name of the action. If not provided, `id` must be set.
     */
    name?: string;
}

/**
 * A collection of values returned by getAction.
 */
export interface GetActionResult {
    /**
     * The source code of the action.
     */
    readonly code: string;
    /**
     * List of third party npm modules, and their versions, that this action depends on.
     */
    readonly dependencies: outputs.GetActionDependency[];
    /**
     * Deploying an action will create a new immutable version of the action. If the action is currently bound to a trigger, then the system will begin executing the newly deployed version of the action immediately.
     */
    readonly deploy: boolean;
    /**
     * The ID of the action. If not provided, `name` must be set.
     */
    readonly id?: string;
    /**
     * The name of the action. If not provided, `id` must be set.
     */
    readonly name?: string;
    /**
     * The Node runtime. Possible values are: `node12`, `node16` (not recommended), `node18`, `node22`
     */
    readonly runtime: string;
    /**
     * List of secrets that are included in an action or a version of an action. Partial management of secrets is not supported. If the secret block is edited, the whole object is re-provisioned.
     */
    readonly secrets: outputs.GetActionSecret[];
    /**
     * List of triggers that this action supports. At this time, an action can only target a single trigger at a time. Read Retrieving the set of triggers available within actions to retrieve the latest trigger versions supported.
     */
    readonly supportedTriggers: outputs.GetActionSupportedTrigger[];
    /**
     * Version ID of the action. This value is available if `deploy` is set to true.
     */
    readonly versionId: string;
}
/**
 * Data source to retrieve a specific Auth0 action by `name`.
 */
export function getActionOutput(args?: GetActionOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetActionResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("auth0:index/getAction:getAction", {
        "id": args.id,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getAction.
 */
export interface GetActionOutputArgs {
    /**
     * The ID of the action. If not provided, `name` must be set.
     */
    id?: pulumi.Input<string>;
    /**
     * The name of the action. If not provided, `id` must be set.
     */
    name?: pulumi.Input<string>;
}
