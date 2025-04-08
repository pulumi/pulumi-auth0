// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource allows you to manage branding themes for your Universal Login page within your Auth0 tenant.
 *
 * ## Import
 *
 * This resource can be imported by specifying the Branding Theme ID.
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/brandingTheme:BrandingTheme my_theme "XXXXXXXXXXXXXXXXXXXX"
 * ```
 */
export class BrandingTheme extends pulumi.CustomResource {
    /**
     * Get an existing BrandingTheme resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BrandingThemeState, opts?: pulumi.CustomResourceOptions): BrandingTheme {
        return new BrandingTheme(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/brandingTheme:BrandingTheme';

    /**
     * Returns true if the given object is an instance of BrandingTheme.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BrandingTheme {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BrandingTheme.__pulumiType;
    }

    public readonly borders!: pulumi.Output<outputs.BrandingThemeBorders>;
    public readonly colors!: pulumi.Output<outputs.BrandingThemeColors>;
    /**
     * The display name for the branding theme.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    public readonly fonts!: pulumi.Output<outputs.BrandingThemeFonts>;
    public readonly pageBackground!: pulumi.Output<outputs.BrandingThemePageBackground>;
    public readonly widget!: pulumi.Output<outputs.BrandingThemeWidget>;

    /**
     * Create a BrandingTheme resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BrandingThemeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BrandingThemeArgs | BrandingThemeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BrandingThemeState | undefined;
            resourceInputs["borders"] = state ? state.borders : undefined;
            resourceInputs["colors"] = state ? state.colors : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["fonts"] = state ? state.fonts : undefined;
            resourceInputs["pageBackground"] = state ? state.pageBackground : undefined;
            resourceInputs["widget"] = state ? state.widget : undefined;
        } else {
            const args = argsOrState as BrandingThemeArgs | undefined;
            if ((!args || args.borders === undefined) && !opts.urn) {
                throw new Error("Missing required property 'borders'");
            }
            if ((!args || args.colors === undefined) && !opts.urn) {
                throw new Error("Missing required property 'colors'");
            }
            if ((!args || args.fonts === undefined) && !opts.urn) {
                throw new Error("Missing required property 'fonts'");
            }
            if ((!args || args.pageBackground === undefined) && !opts.urn) {
                throw new Error("Missing required property 'pageBackground'");
            }
            if ((!args || args.widget === undefined) && !opts.urn) {
                throw new Error("Missing required property 'widget'");
            }
            resourceInputs["borders"] = args ? args.borders : undefined;
            resourceInputs["colors"] = args ? args.colors : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["fonts"] = args ? args.fonts : undefined;
            resourceInputs["pageBackground"] = args ? args.pageBackground : undefined;
            resourceInputs["widget"] = args ? args.widget : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BrandingTheme.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BrandingTheme resources.
 */
export interface BrandingThemeState {
    borders?: pulumi.Input<inputs.BrandingThemeBorders>;
    colors?: pulumi.Input<inputs.BrandingThemeColors>;
    /**
     * The display name for the branding theme.
     */
    displayName?: pulumi.Input<string>;
    fonts?: pulumi.Input<inputs.BrandingThemeFonts>;
    pageBackground?: pulumi.Input<inputs.BrandingThemePageBackground>;
    widget?: pulumi.Input<inputs.BrandingThemeWidget>;
}

/**
 * The set of arguments for constructing a BrandingTheme resource.
 */
export interface BrandingThemeArgs {
    borders: pulumi.Input<inputs.BrandingThemeBorders>;
    colors: pulumi.Input<inputs.BrandingThemeColors>;
    /**
     * The display name for the branding theme.
     */
    displayName?: pulumi.Input<string>;
    fonts: pulumi.Input<inputs.BrandingThemeFonts>;
    pageBackground: pulumi.Input<inputs.BrandingThemePageBackground>;
    widget: pulumi.Input<inputs.BrandingThemeWidget>;
}
