// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * With this resource, you can create and manage Self-Service Profile for a tenant.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const mySelfServiceProfile = new auth0.SelfServiceProfile("my_self_service_profile", {
 *     userAttributes: [{
 *         name: "sample-name",
 *         description: "sample-description",
 *         isOptional: true,
 *     }],
 *     branding: {
 *         logoUrl: "https://mycompany.org/v2/logo.png",
 *         colors: {
 *             primary: "#0059d6",
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported using the id
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/selfServiceProfile:SelfServiceProfile id "ssp_32oi5unksja93124"
 * ```
 */
export class SelfServiceProfile extends pulumi.CustomResource {
    /**
     * Get an existing SelfServiceProfile resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SelfServiceProfileState, opts?: pulumi.CustomResourceOptions): SelfServiceProfile {
        return new SelfServiceProfile(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/selfServiceProfile:SelfServiceProfile';

    /**
     * Returns true if the given object is an instance of SelfServiceProfile.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SelfServiceProfile {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SelfServiceProfile.__pulumiType;
    }

    /**
     * Field can be used to customize the look and feel of the wizard.
     */
    public readonly branding!: pulumi.Output<outputs.SelfServiceProfileBranding>;
    /**
     * The ISO 8601 formatted date the profile was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * The ISO 8601 formatted date the profile was updated.
     */
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;
    /**
     * This array stores the mapping information that will be shown to the user during the SS-SSO flow. The user will be prompted to map the attributes on their identity provider to ensure the specified attributes get passed to Auth0.
     */
    public readonly userAttributes!: pulumi.Output<outputs.SelfServiceProfileUserAttribute[] | undefined>;

    /**
     * Create a SelfServiceProfile resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: SelfServiceProfileArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SelfServiceProfileArgs | SelfServiceProfileState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SelfServiceProfileState | undefined;
            resourceInputs["branding"] = state ? state.branding : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
            resourceInputs["userAttributes"] = state ? state.userAttributes : undefined;
        } else {
            const args = argsOrState as SelfServiceProfileArgs | undefined;
            resourceInputs["branding"] = args ? args.branding : undefined;
            resourceInputs["userAttributes"] = args ? args.userAttributes : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SelfServiceProfile.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SelfServiceProfile resources.
 */
export interface SelfServiceProfileState {
    /**
     * Field can be used to customize the look and feel of the wizard.
     */
    branding?: pulumi.Input<inputs.SelfServiceProfileBranding>;
    /**
     * The ISO 8601 formatted date the profile was created.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * The ISO 8601 formatted date the profile was updated.
     */
    updatedAt?: pulumi.Input<string>;
    /**
     * This array stores the mapping information that will be shown to the user during the SS-SSO flow. The user will be prompted to map the attributes on their identity provider to ensure the specified attributes get passed to Auth0.
     */
    userAttributes?: pulumi.Input<pulumi.Input<inputs.SelfServiceProfileUserAttribute>[]>;
}

/**
 * The set of arguments for constructing a SelfServiceProfile resource.
 */
export interface SelfServiceProfileArgs {
    /**
     * Field can be used to customize the look and feel of the wizard.
     */
    branding?: pulumi.Input<inputs.SelfServiceProfileBranding>;
    /**
     * This array stores the mapping information that will be shown to the user during the SS-SSO flow. The user will be prompted to map the attributes on their identity provider to ensure the specified attributes get passed to Auth0.
     */
    userAttributes?: pulumi.Input<pulumi.Input<inputs.SelfServiceProfileUserAttribute>[]>;
}