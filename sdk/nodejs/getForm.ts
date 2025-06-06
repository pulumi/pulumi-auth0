// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Data source to retrieve a specific Auth0 Form by `id`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // An Auth0 form loaded using its ID.
 * const myFormData = auth0.getForm({
 *     id: "ap_31LxRJphZF1Kqzf2zBgmgA",
 * });
 * ```
 */
export function getForm(args: GetFormArgs, opts?: pulumi.InvokeOptions): Promise<GetFormResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("auth0:index/getForm:getForm", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getForm.
 */
export interface GetFormArgs {
    /**
     * The id of the Form.
     */
    id: string;
}

/**
 * A collection of values returned by getForm.
 */
export interface GetFormResult {
    /**
     * Submission configuration of the form. (JSON encoded)
     */
    readonly ending: string;
    /**
     * The id of the Form.
     */
    readonly id: string;
    /**
     * Language specific configuration for the form.
     */
    readonly languages: outputs.GetFormLanguage[];
    /**
     * Message specific configuration for the form.
     */
    readonly messages: outputs.GetFormMessage[];
    /**
     * Name of the form.
     */
    readonly name: string;
    /**
     * Nodes of the form. (JSON encoded)
     */
    readonly nodes: string;
    /**
     * Input setup of the form. (JSON encoded)
     */
    readonly start: string;
    /**
     * Style specific configuration for the form. (JSON encoded)
     */
    readonly style: string;
    /**
     * Translations of the form. (JSON encoded)
     */
    readonly translations: string;
}
/**
 * Data source to retrieve a specific Auth0 Form by `id`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // An Auth0 form loaded using its ID.
 * const myFormData = auth0.getForm({
 *     id: "ap_31LxRJphZF1Kqzf2zBgmgA",
 * });
 * ```
 */
export function getFormOutput(args: GetFormOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetFormResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("auth0:index/getForm:getForm", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getForm.
 */
export interface GetFormOutputArgs {
    /**
     * The id of the Form.
     */
    id: pulumi.Input<string>;
}
