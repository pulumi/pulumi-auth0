// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * With this resource, you can manage Auth0 Custom Token Exchange Profiles
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // Below action is created with custom-token-exchange as supported_triggers
 * // This action is then linked using the action_id param to the token-exchange profile
 * const myAction = new auth0.Action("my_action", {
 *     name: "TokenExchange-Action",
 *     code: `exports.onContinuePostLogin = async (event, api) => {
 * \x09console.log("foo")
 * };"
 * `,
 *     deploy: true,
 *     supportedTriggers: {
 *         id: "custom-token-exchange",
 *         version: "v1",
 *     },
 * });
 * const myTokenExchangeProfile = new auth0.TokenExchangeProfile("my_token_exchange_profile", {
 *     name: "token-exchange-prof",
 *     subjectTokenType: "https://acme.com/cis-token",
 *     actionId: myAction.id,
 *     type: "custom_authentication",
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported using the token exchange profile ID.
 *
 * # 
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/tokenExchangeProfile:TokenExchangeProfile profile "tep_XXXXXXXXXXXXXX"
 * ```
 */
export class TokenExchangeProfile extends pulumi.CustomResource {
    /**
     * Get an existing TokenExchangeProfile resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TokenExchangeProfileState, opts?: pulumi.CustomResourceOptions): TokenExchangeProfile {
        return new TokenExchangeProfile(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/tokenExchangeProfile:TokenExchangeProfile';

    /**
     * Returns true if the given object is an instance of TokenExchangeProfile.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TokenExchangeProfile {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TokenExchangeProfile.__pulumiType;
    }

    /**
     * Unique identifier of the Action
     */
    public readonly actionId!: pulumi.Output<string | undefined>;
    /**
     * The ISO 8601 formatted date the credential was created.
     */
    public /*out*/ readonly createdAt!: pulumi.Output<string>;
    /**
     * Name of the token exchange profile.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Type of the subject token
     */
    public readonly subjectTokenType!: pulumi.Output<string | undefined>;
    /**
     * Type of the token exchange profile
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * The ISO 8601 formatted date the credential was updated.
     */
    public /*out*/ readonly updatedAt!: pulumi.Output<string>;

    /**
     * Create a TokenExchangeProfile resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TokenExchangeProfileArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TokenExchangeProfileArgs | TokenExchangeProfileState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TokenExchangeProfileState | undefined;
            resourceInputs["actionId"] = state ? state.actionId : undefined;
            resourceInputs["createdAt"] = state ? state.createdAt : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["subjectTokenType"] = state ? state.subjectTokenType : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["updatedAt"] = state ? state.updatedAt : undefined;
        } else {
            const args = argsOrState as TokenExchangeProfileArgs | undefined;
            resourceInputs["actionId"] = args ? args.actionId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["subjectTokenType"] = args ? args.subjectTokenType : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["createdAt"] = undefined /*out*/;
            resourceInputs["updatedAt"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TokenExchangeProfile.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TokenExchangeProfile resources.
 */
export interface TokenExchangeProfileState {
    /**
     * Unique identifier of the Action
     */
    actionId?: pulumi.Input<string>;
    /**
     * The ISO 8601 formatted date the credential was created.
     */
    createdAt?: pulumi.Input<string>;
    /**
     * Name of the token exchange profile.
     */
    name?: pulumi.Input<string>;
    /**
     * Type of the subject token
     */
    subjectTokenType?: pulumi.Input<string>;
    /**
     * Type of the token exchange profile
     */
    type?: pulumi.Input<string>;
    /**
     * The ISO 8601 formatted date the credential was updated.
     */
    updatedAt?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TokenExchangeProfile resource.
 */
export interface TokenExchangeProfileArgs {
    /**
     * Unique identifier of the Action
     */
    actionId?: pulumi.Input<string>;
    /**
     * Name of the token exchange profile.
     */
    name?: pulumi.Input<string>;
    /**
     * Type of the subject token
     */
    subjectTokenType?: pulumi.Input<string>;
    /**
     * Type of the token exchange profile
     */
    type?: pulumi.Input<string>;
}
