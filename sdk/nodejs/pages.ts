// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * With this resource you can manage custom HTML for the Login, Reset Password, Multi-Factor Authentication and Error pages.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myPages = new auth0.Pages("my_pages", {
 *     login: {
 *         enabled: true,
 *         html: "<html><body>My Custom Login Page</body></html>",
 *     },
 *     changePassword: {
 *         enabled: true,
 *         html: "<html><body>My Custom Reset Password Page</body></html>",
 *     },
 *     guardianMfa: {
 *         enabled: true,
 *         html: "<html><body>My Custom MFA Page</body></html>",
 *     },
 *     error: {
 *         showLogLink: true,
 *         html: "<html><body>My Custom Error Page</body></html>",
 *         url: "https://example.com",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * As this is not a resource identifiable by an ID within the Auth0 Management API,
 *
 * pages can be imported using a random string.
 *
 * # 
 *
 * We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4)
 *
 * # 
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/pages:Pages my_pages "22f4f21b-017a-319d-92e7-2291c1ca36c4"
 * ```
 */
export class Pages extends pulumi.CustomResource {
    /**
     * Get an existing Pages resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PagesState, opts?: pulumi.CustomResourceOptions): Pages {
        return new Pages(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/pages:Pages';

    /**
     * Returns true if the given object is an instance of Pages.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Pages {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Pages.__pulumiType;
    }

    /**
     * Configuration settings for customizing the Password Reset page.
     */
    public readonly changePassword!: pulumi.Output<outputs.PagesChangePassword>;
    /**
     * Configuration settings for the Error pages.
     */
    public readonly error!: pulumi.Output<outputs.PagesError>;
    /**
     * Configuration settings for customizing the Guardian Multi-Factor Authentication page.
     */
    public readonly guardianMfa!: pulumi.Output<outputs.PagesGuardianMfa>;
    /**
     * Configuration settings for customizing the Login page.
     */
    public readonly login!: pulumi.Output<outputs.PagesLogin>;

    /**
     * Create a Pages resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: PagesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PagesArgs | PagesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PagesState | undefined;
            resourceInputs["changePassword"] = state ? state.changePassword : undefined;
            resourceInputs["error"] = state ? state.error : undefined;
            resourceInputs["guardianMfa"] = state ? state.guardianMfa : undefined;
            resourceInputs["login"] = state ? state.login : undefined;
        } else {
            const args = argsOrState as PagesArgs | undefined;
            resourceInputs["changePassword"] = args ? args.changePassword : undefined;
            resourceInputs["error"] = args ? args.error : undefined;
            resourceInputs["guardianMfa"] = args ? args.guardianMfa : undefined;
            resourceInputs["login"] = args ? args.login : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Pages.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Pages resources.
 */
export interface PagesState {
    /**
     * Configuration settings for customizing the Password Reset page.
     */
    changePassword?: pulumi.Input<inputs.PagesChangePassword>;
    /**
     * Configuration settings for the Error pages.
     */
    error?: pulumi.Input<inputs.PagesError>;
    /**
     * Configuration settings for customizing the Guardian Multi-Factor Authentication page.
     */
    guardianMfa?: pulumi.Input<inputs.PagesGuardianMfa>;
    /**
     * Configuration settings for customizing the Login page.
     */
    login?: pulumi.Input<inputs.PagesLogin>;
}

/**
 * The set of arguments for constructing a Pages resource.
 */
export interface PagesArgs {
    /**
     * Configuration settings for customizing the Password Reset page.
     */
    changePassword?: pulumi.Input<inputs.PagesChangePassword>;
    /**
     * Configuration settings for the Error pages.
     */
    error?: pulumi.Input<inputs.PagesError>;
    /**
     * Configuration settings for customizing the Guardian Multi-Factor Authentication page.
     */
    guardianMfa?: pulumi.Input<inputs.PagesGuardianMfa>;
    /**
     * Configuration settings for customizing the Login page.
     */
    login?: pulumi.Input<inputs.PagesLogin>;
}
