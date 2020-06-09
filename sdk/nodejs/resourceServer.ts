// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * With this resource, you can set up APIs that can be consumed from your authorized applications.
 *
 * ## Example Usage
 *
 *
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myResourceServer = new auth0.ResourceServer("myResourceServer", {
 *     allowOfflineAccess: true,
 *     identifier: "https://api.example.com",
 *     scopes: [
 *         {
 *             description: "Create foos",
 *             value: "create:foo",
 *         },
 *         {
 *             description: "Create bars",
 *             value: "create:bar",
 *         },
 *     ],
 *     signingAlg: "RS256",
 *     skipConsentForVerifiableFirstPartyClients: true,
 *     tokenLifetime: 8600,
 * });
 * ```
 */
export class ResourceServer extends pulumi.CustomResource {
    /**
     * Get an existing ResourceServer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ResourceServerState, opts?: pulumi.CustomResourceOptions): ResourceServer {
        return new ResourceServer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/resourceServer:ResourceServer';

    /**
     * Returns true if the given object is an instance of ResourceServer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ResourceServer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ResourceServer.__pulumiType;
    }

    /**
     * Boolean. Indicates whether or not refresh tokens can be issued for this resource server.
     */
    public readonly allowOfflineAccess!: pulumi.Output<boolean | undefined>;
    /**
     * Boolean. Indicates whether or not authorization polices are enforced.
     */
    public readonly enforcePolicies!: pulumi.Output<boolean | undefined>;
    /**
     * String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
     */
    public readonly identifier!: pulumi.Output<string | undefined>;
    /**
     * String. Friendly name for the resource server. Cannot include `<` or `>` characters.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Map(String). Used to store additional metadata
     */
    public readonly options!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
     */
    public readonly scopes!: pulumi.Output<outputs.ResourceServerScope[] | undefined>;
    /**
     * String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
     */
    public readonly signingAlg!: pulumi.Output<string>;
    /**
     * String. Secret used to sign tokens when using symmetric algorithms (HS256).
     */
    public readonly signingSecret!: pulumi.Output<string>;
    /**
     * Boolean. Indicates whether or not to skip user consent for applications flagged as first party.
     */
    public readonly skipConsentForVerifiableFirstPartyClients!: pulumi.Output<boolean | undefined>;
    /**
     * String. Dialect of access tokens that should be issued for this resource server. Options include `accessToken` or `accessTokenAuthz` (includes permissions).
     */
    public readonly tokenDialect!: pulumi.Output<string | undefined>;
    /**
     * Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
     */
    public readonly tokenLifetime!: pulumi.Output<number>;
    /**
     * Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `tokenLifetime` value.
     */
    public readonly tokenLifetimeForWeb!: pulumi.Output<number>;
    /**
     * String
     */
    public readonly verificationLocation!: pulumi.Output<string | undefined>;

    /**
     * Create a ResourceServer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ResourceServerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ResourceServerArgs | ResourceServerState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ResourceServerState | undefined;
            inputs["allowOfflineAccess"] = state ? state.allowOfflineAccess : undefined;
            inputs["enforcePolicies"] = state ? state.enforcePolicies : undefined;
            inputs["identifier"] = state ? state.identifier : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["options"] = state ? state.options : undefined;
            inputs["scopes"] = state ? state.scopes : undefined;
            inputs["signingAlg"] = state ? state.signingAlg : undefined;
            inputs["signingSecret"] = state ? state.signingSecret : undefined;
            inputs["skipConsentForVerifiableFirstPartyClients"] = state ? state.skipConsentForVerifiableFirstPartyClients : undefined;
            inputs["tokenDialect"] = state ? state.tokenDialect : undefined;
            inputs["tokenLifetime"] = state ? state.tokenLifetime : undefined;
            inputs["tokenLifetimeForWeb"] = state ? state.tokenLifetimeForWeb : undefined;
            inputs["verificationLocation"] = state ? state.verificationLocation : undefined;
        } else {
            const args = argsOrState as ResourceServerArgs | undefined;
            inputs["allowOfflineAccess"] = args ? args.allowOfflineAccess : undefined;
            inputs["enforcePolicies"] = args ? args.enforcePolicies : undefined;
            inputs["identifier"] = args ? args.identifier : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["options"] = args ? args.options : undefined;
            inputs["scopes"] = args ? args.scopes : undefined;
            inputs["signingAlg"] = args ? args.signingAlg : undefined;
            inputs["signingSecret"] = args ? args.signingSecret : undefined;
            inputs["skipConsentForVerifiableFirstPartyClients"] = args ? args.skipConsentForVerifiableFirstPartyClients : undefined;
            inputs["tokenDialect"] = args ? args.tokenDialect : undefined;
            inputs["tokenLifetime"] = args ? args.tokenLifetime : undefined;
            inputs["tokenLifetimeForWeb"] = args ? args.tokenLifetimeForWeb : undefined;
            inputs["verificationLocation"] = args ? args.verificationLocation : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ResourceServer.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ResourceServer resources.
 */
export interface ResourceServerState {
    /**
     * Boolean. Indicates whether or not refresh tokens can be issued for this resource server.
     */
    readonly allowOfflineAccess?: pulumi.Input<boolean>;
    /**
     * Boolean. Indicates whether or not authorization polices are enforced.
     */
    readonly enforcePolicies?: pulumi.Input<boolean>;
    /**
     * String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
     */
    readonly identifier?: pulumi.Input<string>;
    /**
     * String. Friendly name for the resource server. Cannot include `<` or `>` characters.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Map(String). Used to store additional metadata
     */
    readonly options?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
     */
    readonly scopes?: pulumi.Input<pulumi.Input<inputs.ResourceServerScope>[]>;
    /**
     * String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
     */
    readonly signingAlg?: pulumi.Input<string>;
    /**
     * String. Secret used to sign tokens when using symmetric algorithms (HS256).
     */
    readonly signingSecret?: pulumi.Input<string>;
    /**
     * Boolean. Indicates whether or not to skip user consent for applications flagged as first party.
     */
    readonly skipConsentForVerifiableFirstPartyClients?: pulumi.Input<boolean>;
    /**
     * String. Dialect of access tokens that should be issued for this resource server. Options include `accessToken` or `accessTokenAuthz` (includes permissions).
     */
    readonly tokenDialect?: pulumi.Input<string>;
    /**
     * Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
     */
    readonly tokenLifetime?: pulumi.Input<number>;
    /**
     * Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `tokenLifetime` value.
     */
    readonly tokenLifetimeForWeb?: pulumi.Input<number>;
    /**
     * String
     */
    readonly verificationLocation?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ResourceServer resource.
 */
export interface ResourceServerArgs {
    /**
     * Boolean. Indicates whether or not refresh tokens can be issued for this resource server.
     */
    readonly allowOfflineAccess?: pulumi.Input<boolean>;
    /**
     * Boolean. Indicates whether or not authorization polices are enforced.
     */
    readonly enforcePolicies?: pulumi.Input<boolean>;
    /**
     * String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
     */
    readonly identifier?: pulumi.Input<string>;
    /**
     * String. Friendly name for the resource server. Cannot include `<` or `>` characters.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Map(String). Used to store additional metadata
     */
    readonly options?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
     */
    readonly scopes?: pulumi.Input<pulumi.Input<inputs.ResourceServerScope>[]>;
    /**
     * String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
     */
    readonly signingAlg?: pulumi.Input<string>;
    /**
     * String. Secret used to sign tokens when using symmetric algorithms (HS256).
     */
    readonly signingSecret?: pulumi.Input<string>;
    /**
     * Boolean. Indicates whether or not to skip user consent for applications flagged as first party.
     */
    readonly skipConsentForVerifiableFirstPartyClients?: pulumi.Input<boolean>;
    /**
     * String. Dialect of access tokens that should be issued for this resource server. Options include `accessToken` or `accessTokenAuthz` (includes permissions).
     */
    readonly tokenDialect?: pulumi.Input<string>;
    /**
     * Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
     */
    readonly tokenLifetime?: pulumi.Input<number>;
    /**
     * Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `tokenLifetime` value.
     */
    readonly tokenLifetimeForWeb?: pulumi.Input<number>;
    /**
     * String
     */
    readonly verificationLocation?: pulumi.Input<string>;
}
