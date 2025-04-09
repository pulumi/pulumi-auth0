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
 * ## Import
 *
 * This resource can be imported by specifying the client ID.
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
     * Configure the method to use when making requests to any endpoint that requires this client to authenticate. Options include `none` (public client without a client secret), `clientSecretPost` (confidential client using HTTP POST parameters), `clientSecretBasic` (confidential client using HTTP Basic), `privateKeyJwt` (confidential client using a Private Key JWT), `tlsClientAuth` (confidential client using CA-based mTLS authentication), `selfSignedTlsClientAuth` (confidential client using mTLS authentication utilizing a self-signed certificate).
     */
    public readonly authenticationMethod!: pulumi.Output<string>;
    /**
     * The ID of the client for which to configure the authentication method.
     */
    public readonly clientId!: pulumi.Output<string>;
    public readonly clientSecret!: pulumi.Output<string>;
    /**
     * Defines `privateKeyJwt` client authentication method.
     */
    public readonly privateKeyJwt!: pulumi.Output<outputs.ClientCredentialsPrivateKeyJwt | undefined>;
    /**
     * Defines `tlsClientAuth` client authentication method.
     */
    public readonly selfSignedTlsClientAuth!: pulumi.Output<outputs.ClientCredentialsSelfSignedTlsClientAuth | undefined>;
    /**
     * Configuration for JWT-secured Authorization Requests(JAR).
     */
    public readonly signedRequestObject!: pulumi.Output<outputs.ClientCredentialsSignedRequestObject | undefined>;
    /**
     * Defines `tlsClientAuth` client authentication method.
     */
    public readonly tlsClientAuth!: pulumi.Output<outputs.ClientCredentialsTlsClientAuth | undefined>;

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
            resourceInputs["selfSignedTlsClientAuth"] = state ? state.selfSignedTlsClientAuth : undefined;
            resourceInputs["signedRequestObject"] = state ? state.signedRequestObject : undefined;
            resourceInputs["tlsClientAuth"] = state ? state.tlsClientAuth : undefined;
        } else {
            const args = argsOrState as ClientCredentialsArgs | undefined;
            if ((!args || args.clientId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clientId'");
            }
            resourceInputs["authenticationMethod"] = args ? args.authenticationMethod : undefined;
            resourceInputs["clientId"] = args ? args.clientId : undefined;
            resourceInputs["clientSecret"] = args?.clientSecret ? pulumi.secret(args.clientSecret) : undefined;
            resourceInputs["privateKeyJwt"] = args ? args.privateKeyJwt : undefined;
            resourceInputs["selfSignedTlsClientAuth"] = args ? args.selfSignedTlsClientAuth : undefined;
            resourceInputs["signedRequestObject"] = args ? args.signedRequestObject : undefined;
            resourceInputs["tlsClientAuth"] = args ? args.tlsClientAuth : undefined;
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
     * Configure the method to use when making requests to any endpoint that requires this client to authenticate. Options include `none` (public client without a client secret), `clientSecretPost` (confidential client using HTTP POST parameters), `clientSecretBasic` (confidential client using HTTP Basic), `privateKeyJwt` (confidential client using a Private Key JWT), `tlsClientAuth` (confidential client using CA-based mTLS authentication), `selfSignedTlsClientAuth` (confidential client using mTLS authentication utilizing a self-signed certificate).
     */
    authenticationMethod?: pulumi.Input<string>;
    /**
     * The ID of the client for which to configure the authentication method.
     */
    clientId?: pulumi.Input<string>;
    clientSecret?: pulumi.Input<string>;
    /**
     * Defines `privateKeyJwt` client authentication method.
     */
    privateKeyJwt?: pulumi.Input<inputs.ClientCredentialsPrivateKeyJwt>;
    /**
     * Defines `tlsClientAuth` client authentication method.
     */
    selfSignedTlsClientAuth?: pulumi.Input<inputs.ClientCredentialsSelfSignedTlsClientAuth>;
    /**
     * Configuration for JWT-secured Authorization Requests(JAR).
     */
    signedRequestObject?: pulumi.Input<inputs.ClientCredentialsSignedRequestObject>;
    /**
     * Defines `tlsClientAuth` client authentication method.
     */
    tlsClientAuth?: pulumi.Input<inputs.ClientCredentialsTlsClientAuth>;
}

/**
 * The set of arguments for constructing a ClientCredentials resource.
 */
export interface ClientCredentialsArgs {
    /**
     * Configure the method to use when making requests to any endpoint that requires this client to authenticate. Options include `none` (public client without a client secret), `clientSecretPost` (confidential client using HTTP POST parameters), `clientSecretBasic` (confidential client using HTTP Basic), `privateKeyJwt` (confidential client using a Private Key JWT), `tlsClientAuth` (confidential client using CA-based mTLS authentication), `selfSignedTlsClientAuth` (confidential client using mTLS authentication utilizing a self-signed certificate).
     */
    authenticationMethod?: pulumi.Input<string>;
    /**
     * The ID of the client for which to configure the authentication method.
     */
    clientId: pulumi.Input<string>;
    clientSecret?: pulumi.Input<string>;
    /**
     * Defines `privateKeyJwt` client authentication method.
     */
    privateKeyJwt?: pulumi.Input<inputs.ClientCredentialsPrivateKeyJwt>;
    /**
     * Defines `tlsClientAuth` client authentication method.
     */
    selfSignedTlsClientAuth?: pulumi.Input<inputs.ClientCredentialsSelfSignedTlsClientAuth>;
    /**
     * Configuration for JWT-secured Authorization Requests(JAR).
     */
    signedRequestObject?: pulumi.Input<inputs.ClientCredentialsSignedRequestObject>;
    /**
     * Defines `tlsClientAuth` client authentication method.
     */
    tlsClientAuth?: pulumi.Input<inputs.ClientCredentialsTlsClientAuth>;
}
