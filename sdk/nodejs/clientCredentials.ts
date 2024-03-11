// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * With this resource, you can configure the method to use when making requests to any endpoint that requires this client to authenticate.
 *
 * > Refer to the client secret rotation guide
 * for instructions on how to rotate client secrets with zero downtime.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * const myClient = new auth0.Client("myClient", {
 *     appType: "non_interactive",
 *     jwtConfiguration: {
 *         alg: "RS256",
 *     },
 * });
 * // Configuring client_secret_post as an authentication method.
 * const testClientCredentials = new auth0.ClientCredentials("testClientCredentials", {
 *     clientId: myClient.id,
 *     authenticationMethod: "client_secret_post",
 * });
 * // Configuring client_secret_basic as an authentication method.
 * const testIndex_clientCredentialsClientCredentials = new auth0.ClientCredentials("testIndex/clientCredentialsClientCredentials", {
 *     clientId: myClient.id,
 *     authenticationMethod: "client_secret_basic",
 * });
 * // Configuring none as an authentication method.
 * const testAuth0Index_clientCredentialsClientCredentials = new auth0.ClientCredentials("testAuth0Index/clientCredentialsClientCredentials", {
 *     clientId: myClient.id,
 *     authenticationMethod: "none",
 * });
 * // Configuring private_key_jwt as an authentication method.
 * const testAuth0Index_clientCredentialsClientCredentials1 = new auth0.ClientCredentials("testAuth0Index/clientCredentialsClientCredentials1", {
 *     clientId: myClient.id,
 *     authenticationMethod: "private_key_jwt",
 *     privateKeyJwt: {
 *         credentials: [{
 *             name: "Testing Credentials 1",
 *             credentialType: "public_key",
 *             algorithm: "RS256",
 *             parseExpiryFromCert: true,
 *             pem: `-----BEGIN CERTIFICATE-----
 * MIIFWDCCA0ACCQDXqpBo3R...G9w0BAQsFADBuMQswCQYDVQQGEwJl
 * -----END CERTIFICATE-----
 * `,
 *         }],
 *     },
 * });
 * // Configuring the client_secret.
 * const testAuth0Index_clientCredentialsClientCredentials2 = new auth0.ClientCredentials("testAuth0Index/clientCredentialsClientCredentials2", {
 *     clientId: myClient.id,
 *     authenticationMethod: "client_secret_basic",
 *     clientSecret: "LUFqPx+sRLjbL7peYRPFmFu-bbvE7u7og4YUNe_C345=683341",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * This resource can be imported by specifying the client ID.
 *
 * # 
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/clientCredentials:ClientCredentials my_creds "AaiyAPdpYdesoKnqjj8HJqRn4T5titww"
 * ```
 *
 * ~> Importing this resource when the `authentication_method` is set to `private_key_jwt` will force the resource to be recreated.
 *
 * This is to be expected, because the pem file can't be checked for differences.
 */
export class ClientCredentials extends pulumi.CustomResource {
    /**
     * Get an existing ClientCredentials resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClientCredentialsState, opts?: pulumi.CustomResourceOptions): ClientCredentials {
        return new ClientCredentials(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/clientCredentials:ClientCredentials';

    /**
     * Returns true if the given object is an instance of ClientCredentials.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ClientCredentials {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ClientCredentials.__pulumiType;
    }

    /**
     * Configure the method to use when making requests to any endpoint that requires this client to authenticate. Options include `none` (public client without a client secret), `clientSecretPost` (confidential client using HTTP POST parameters), `clientSecretBasic` (confidential client using HTTP Basic), `privateKeyJwt` (confidential client using a Private Key JWT).
     */
    public readonly authenticationMethod!: pulumi.Output<string>;
    /**
     * The ID of the client for which to configure the authentication method.
     */
    public readonly clientId!: pulumi.Output<string>;
    /**
     * Secret for the client when using `client_secret_post` or `client_secret_basic` authentication method. Keep this private.
     * To access this attribute you need to add the `read:client_keys` scope to the Terraform client. Otherwise, the attribute
     * will contain an empty string. The attribute will also be an empty string in case `private_key_jwt` is selected as an
     * authentication method.
     */
    public readonly clientSecret!: pulumi.Output<string>;
    /**
     * Defines `privateKeyJwt` client authentication method.
     */
    public readonly privateKeyJwt!: pulumi.Output<outputs.ClientCredentialsPrivateKeyJwt | undefined>;

    /**
     * Create a ClientCredentials resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClientCredentialsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClientCredentialsArgs | ClientCredentialsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClientCredentialsState | undefined;
            resourceInputs["authenticationMethod"] = state ? state.authenticationMethod : undefined;
            resourceInputs["clientId"] = state ? state.clientId : undefined;
            resourceInputs["clientSecret"] = state ? state.clientSecret : undefined;
            resourceInputs["privateKeyJwt"] = state ? state.privateKeyJwt : undefined;
        } else {
            const args = argsOrState as ClientCredentialsArgs | undefined;
            if ((!args || args.authenticationMethod === undefined) && !opts.urn) {
                throw new Error("Missing required property 'authenticationMethod'");
            }
            if ((!args || args.clientId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clientId'");
            }
            resourceInputs["authenticationMethod"] = args ? args.authenticationMethod : undefined;
            resourceInputs["clientId"] = args ? args.clientId : undefined;
            resourceInputs["clientSecret"] = args?.clientSecret ? pulumi.secret(args.clientSecret) : undefined;
            resourceInputs["privateKeyJwt"] = args ? args.privateKeyJwt : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["clientSecret"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ClientCredentials.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ClientCredentials resources.
 */
export interface ClientCredentialsState {
    /**
     * Configure the method to use when making requests to any endpoint that requires this client to authenticate. Options include `none` (public client without a client secret), `clientSecretPost` (confidential client using HTTP POST parameters), `clientSecretBasic` (confidential client using HTTP Basic), `privateKeyJwt` (confidential client using a Private Key JWT).
     */
    authenticationMethod?: pulumi.Input<string>;
    /**
     * The ID of the client for which to configure the authentication method.
     */
    clientId?: pulumi.Input<string>;
    /**
     * Secret for the client when using `client_secret_post` or `client_secret_basic` authentication method. Keep this private.
     * To access this attribute you need to add the `read:client_keys` scope to the Terraform client. Otherwise, the attribute
     * will contain an empty string. The attribute will also be an empty string in case `private_key_jwt` is selected as an
     * authentication method.
     */
    clientSecret?: pulumi.Input<string>;
    /**
     * Defines `privateKeyJwt` client authentication method.
     */
    privateKeyJwt?: pulumi.Input<inputs.ClientCredentialsPrivateKeyJwt>;
}

/**
 * The set of arguments for constructing a ClientCredentials resource.
 */
export interface ClientCredentialsArgs {
    /**
     * Configure the method to use when making requests to any endpoint that requires this client to authenticate. Options include `none` (public client without a client secret), `clientSecretPost` (confidential client using HTTP POST parameters), `clientSecretBasic` (confidential client using HTTP Basic), `privateKeyJwt` (confidential client using a Private Key JWT).
     */
    authenticationMethod: pulumi.Input<string>;
    /**
     * The ID of the client for which to configure the authentication method.
     */
    clientId: pulumi.Input<string>;
    /**
     * Secret for the client when using `client_secret_post` or `client_secret_basic` authentication method. Keep this private.
     * To access this attribute you need to add the `read:client_keys` scope to the Terraform client. Otherwise, the attribute
     * will contain an empty string. The attribute will also be an empty string in case `private_key_jwt` is selected as an
     * authentication method.
     */
    clientSecret?: pulumi.Input<string>;
    /**
     * Defines `privateKeyJwt` client authentication method.
     */
    privateKeyJwt?: pulumi.Input<inputs.ClientCredentialsPrivateKeyJwt>;
}
