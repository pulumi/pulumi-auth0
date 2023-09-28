// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource allows you to manage branding within your Auth0 tenant. Auth0 can be customized with a look and feel that aligns with your organization's brand requirements and user expectations.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 * import * as fs from "fs";
 *
 * const myBrand = new auth0.Branding("myBrand", {
 *     logoUrl: "https://mycompany.org/logo.png",
 *     colors: {
 *         primary: "#0059d6",
 *         pageBackground: "#000000",
 *     },
 *     universalLogin: {
 *         body: fs.readFileSync("universal_login_body.html"),
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * As this is not a resource identifiable by an ID within the Auth0 Management API, branding can be imported using a random string. # We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4) # Example
 *
 * ```sh
 *  $ pulumi import auth0:index/branding:Branding my_brand "22f4f21b-017a-319d-92e7-2291c1ca36c4"
 * ```
 */
export class Branding extends pulumi.CustomResource {
    /**
     * Get an existing Branding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BrandingState, opts?: pulumi.CustomResourceOptions): Branding {
        return new Branding(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/branding:Branding';

    /**
     * Returns true if the given object is an instance of Branding.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Branding {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Branding.__pulumiType;
    }

    /**
     * Configuration settings for colors for branding.
     */
    public readonly colors!: pulumi.Output<outputs.BrandingColors>;
    /**
     * URL for the favicon.
     */
    public readonly faviconUrl!: pulumi.Output<string>;
    /**
     * Configuration settings to customize the font.
     */
    public readonly font!: pulumi.Output<outputs.BrandingFont>;
    /**
     * URL of logo for branding.
     */
    public readonly logoUrl!: pulumi.Output<string>;
    /**
     * Configuration settings for Universal Login.
     */
    public readonly universalLogin!: pulumi.Output<outputs.BrandingUniversalLogin | undefined>;

    /**
     * Create a Branding resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: BrandingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BrandingArgs | BrandingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BrandingState | undefined;
            resourceInputs["colors"] = state ? state.colors : undefined;
            resourceInputs["faviconUrl"] = state ? state.faviconUrl : undefined;
            resourceInputs["font"] = state ? state.font : undefined;
            resourceInputs["logoUrl"] = state ? state.logoUrl : undefined;
            resourceInputs["universalLogin"] = state ? state.universalLogin : undefined;
        } else {
            const args = argsOrState as BrandingArgs | undefined;
            resourceInputs["colors"] = args ? args.colors : undefined;
            resourceInputs["faviconUrl"] = args ? args.faviconUrl : undefined;
            resourceInputs["font"] = args ? args.font : undefined;
            resourceInputs["logoUrl"] = args ? args.logoUrl : undefined;
            resourceInputs["universalLogin"] = args ? args.universalLogin : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Branding.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Branding resources.
 */
export interface BrandingState {
    /**
     * Configuration settings for colors for branding.
     */
    colors?: pulumi.Input<inputs.BrandingColors>;
    /**
     * URL for the favicon.
     */
    faviconUrl?: pulumi.Input<string>;
    /**
     * Configuration settings to customize the font.
     */
    font?: pulumi.Input<inputs.BrandingFont>;
    /**
     * URL of logo for branding.
     */
    logoUrl?: pulumi.Input<string>;
    /**
     * Configuration settings for Universal Login.
     */
    universalLogin?: pulumi.Input<inputs.BrandingUniversalLogin>;
}

/**
 * The set of arguments for constructing a Branding resource.
 */
export interface BrandingArgs {
    /**
     * Configuration settings for colors for branding.
     */
    colors?: pulumi.Input<inputs.BrandingColors>;
    /**
     * URL for the favicon.
     */
    faviconUrl?: pulumi.Input<string>;
    /**
     * Configuration settings to customize the font.
     */
    font?: pulumi.Input<inputs.BrandingFont>;
    /**
     * URL of logo for branding.
     */
    logoUrl?: pulumi.Input<string>;
    /**
     * Configuration settings for Universal Login.
     */
    universalLogin?: pulumi.Input<inputs.BrandingUniversalLogin>;
}
