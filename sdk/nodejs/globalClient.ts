// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

export class GlobalClient extends pulumi.CustomResource {
    /**
     * Get an existing GlobalClient resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GlobalClientState, opts?: pulumi.CustomResourceOptions): GlobalClient {
        return new GlobalClient(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/globalClient:GlobalClient';

    /**
     * Returns true if the given object is an instance of GlobalClient.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GlobalClient {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GlobalClient.__pulumiType;
    }

    public readonly addons!: pulumi.Output<outputs.GlobalClientAddons>;
    public readonly allowedClients!: pulumi.Output<string[]>;
    public readonly allowedLogoutUrls!: pulumi.Output<string[]>;
    public readonly allowedOrigins!: pulumi.Output<string[]>;
    public readonly appType!: pulumi.Output<string>;
    public readonly callbacks!: pulumi.Output<string[]>;
    public readonly clientId!: pulumi.Output<string>;
    public readonly clientMetadata!: pulumi.Output<{[key: string]: any}>;
    public readonly clientSecret!: pulumi.Output<string>;
    public readonly clientSecretRotationTrigger!: pulumi.Output<{[key: string]: any} | undefined>;
    public readonly crossOriginAuth!: pulumi.Output<boolean>;
    public readonly crossOriginLoc!: pulumi.Output<string>;
    public readonly customLoginPage!: pulumi.Output<string>;
    public readonly customLoginPageOn!: pulumi.Output<boolean>;
    public readonly description!: pulumi.Output<string>;
    public readonly encryptionKey!: pulumi.Output<{[key: string]: string}>;
    public readonly formTemplate!: pulumi.Output<string>;
    public readonly grantTypes!: pulumi.Output<string[]>;
    public readonly initiateLoginUri!: pulumi.Output<string>;
    public readonly isFirstParty!: pulumi.Output<boolean>;
    public readonly isTokenEndpointIpHeaderTrusted!: pulumi.Output<boolean>;
    public readonly jwtConfiguration!: pulumi.Output<outputs.GlobalClientJwtConfiguration>;
    public readonly logoUri!: pulumi.Output<string>;
    public readonly mobile!: pulumi.Output<outputs.GlobalClientMobile>;
    public readonly name!: pulumi.Output<string>;
    public readonly nativeSocialLogin!: pulumi.Output<outputs.GlobalClientNativeSocialLogin>;
    public readonly oidcConformant!: pulumi.Output<boolean>;
    public readonly organizationRequireBehavior!: pulumi.Output<string>;
    public readonly organizationUsage!: pulumi.Output<string>;
    public readonly refreshToken!: pulumi.Output<outputs.GlobalClientRefreshToken>;
    public readonly sso!: pulumi.Output<boolean>;
    public readonly ssoDisabled!: pulumi.Output<boolean>;
    public readonly tokenEndpointAuthMethod!: pulumi.Output<string>;
    public readonly webOrigins!: pulumi.Output<string[]>;

    /**
     * Create a GlobalClient resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: GlobalClientArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GlobalClientArgs | GlobalClientState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GlobalClientState | undefined;
            resourceInputs["addons"] = state ? state.addons : undefined;
            resourceInputs["allowedClients"] = state ? state.allowedClients : undefined;
            resourceInputs["allowedLogoutUrls"] = state ? state.allowedLogoutUrls : undefined;
            resourceInputs["allowedOrigins"] = state ? state.allowedOrigins : undefined;
            resourceInputs["appType"] = state ? state.appType : undefined;
            resourceInputs["callbacks"] = state ? state.callbacks : undefined;
            resourceInputs["clientId"] = state ? state.clientId : undefined;
            resourceInputs["clientMetadata"] = state ? state.clientMetadata : undefined;
            resourceInputs["clientSecret"] = state ? state.clientSecret : undefined;
            resourceInputs["clientSecretRotationTrigger"] = state ? state.clientSecretRotationTrigger : undefined;
            resourceInputs["crossOriginAuth"] = state ? state.crossOriginAuth : undefined;
            resourceInputs["crossOriginLoc"] = state ? state.crossOriginLoc : undefined;
            resourceInputs["customLoginPage"] = state ? state.customLoginPage : undefined;
            resourceInputs["customLoginPageOn"] = state ? state.customLoginPageOn : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["encryptionKey"] = state ? state.encryptionKey : undefined;
            resourceInputs["formTemplate"] = state ? state.formTemplate : undefined;
            resourceInputs["grantTypes"] = state ? state.grantTypes : undefined;
            resourceInputs["initiateLoginUri"] = state ? state.initiateLoginUri : undefined;
            resourceInputs["isFirstParty"] = state ? state.isFirstParty : undefined;
            resourceInputs["isTokenEndpointIpHeaderTrusted"] = state ? state.isTokenEndpointIpHeaderTrusted : undefined;
            resourceInputs["jwtConfiguration"] = state ? state.jwtConfiguration : undefined;
            resourceInputs["logoUri"] = state ? state.logoUri : undefined;
            resourceInputs["mobile"] = state ? state.mobile : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nativeSocialLogin"] = state ? state.nativeSocialLogin : undefined;
            resourceInputs["oidcConformant"] = state ? state.oidcConformant : undefined;
            resourceInputs["organizationRequireBehavior"] = state ? state.organizationRequireBehavior : undefined;
            resourceInputs["organizationUsage"] = state ? state.organizationUsage : undefined;
            resourceInputs["refreshToken"] = state ? state.refreshToken : undefined;
            resourceInputs["sso"] = state ? state.sso : undefined;
            resourceInputs["ssoDisabled"] = state ? state.ssoDisabled : undefined;
            resourceInputs["tokenEndpointAuthMethod"] = state ? state.tokenEndpointAuthMethod : undefined;
            resourceInputs["webOrigins"] = state ? state.webOrigins : undefined;
        } else {
            const args = argsOrState as GlobalClientArgs | undefined;
            resourceInputs["addons"] = args ? args.addons : undefined;
            resourceInputs["allowedClients"] = args ? args.allowedClients : undefined;
            resourceInputs["allowedLogoutUrls"] = args ? args.allowedLogoutUrls : undefined;
            resourceInputs["allowedOrigins"] = args ? args.allowedOrigins : undefined;
            resourceInputs["appType"] = args ? args.appType : undefined;
            resourceInputs["callbacks"] = args ? args.callbacks : undefined;
            resourceInputs["clientId"] = args ? args.clientId : undefined;
            resourceInputs["clientMetadata"] = args ? args.clientMetadata : undefined;
            resourceInputs["clientSecret"] = args ? args.clientSecret : undefined;
            resourceInputs["clientSecretRotationTrigger"] = args ? args.clientSecretRotationTrigger : undefined;
            resourceInputs["crossOriginAuth"] = args ? args.crossOriginAuth : undefined;
            resourceInputs["crossOriginLoc"] = args ? args.crossOriginLoc : undefined;
            resourceInputs["customLoginPage"] = args ? args.customLoginPage : undefined;
            resourceInputs["customLoginPageOn"] = args ? args.customLoginPageOn : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["encryptionKey"] = args ? args.encryptionKey : undefined;
            resourceInputs["formTemplate"] = args ? args.formTemplate : undefined;
            resourceInputs["grantTypes"] = args ? args.grantTypes : undefined;
            resourceInputs["initiateLoginUri"] = args ? args.initiateLoginUri : undefined;
            resourceInputs["isFirstParty"] = args ? args.isFirstParty : undefined;
            resourceInputs["isTokenEndpointIpHeaderTrusted"] = args ? args.isTokenEndpointIpHeaderTrusted : undefined;
            resourceInputs["jwtConfiguration"] = args ? args.jwtConfiguration : undefined;
            resourceInputs["logoUri"] = args ? args.logoUri : undefined;
            resourceInputs["mobile"] = args ? args.mobile : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nativeSocialLogin"] = args ? args.nativeSocialLogin : undefined;
            resourceInputs["oidcConformant"] = args ? args.oidcConformant : undefined;
            resourceInputs["organizationRequireBehavior"] = args ? args.organizationRequireBehavior : undefined;
            resourceInputs["organizationUsage"] = args ? args.organizationUsage : undefined;
            resourceInputs["refreshToken"] = args ? args.refreshToken : undefined;
            resourceInputs["sso"] = args ? args.sso : undefined;
            resourceInputs["ssoDisabled"] = args ? args.ssoDisabled : undefined;
            resourceInputs["tokenEndpointAuthMethod"] = args ? args.tokenEndpointAuthMethod : undefined;
            resourceInputs["webOrigins"] = args ? args.webOrigins : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GlobalClient.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GlobalClient resources.
 */
export interface GlobalClientState {
    addons?: pulumi.Input<inputs.GlobalClientAddons>;
    allowedClients?: pulumi.Input<pulumi.Input<string>[]>;
    allowedLogoutUrls?: pulumi.Input<pulumi.Input<string>[]>;
    allowedOrigins?: pulumi.Input<pulumi.Input<string>[]>;
    appType?: pulumi.Input<string>;
    callbacks?: pulumi.Input<pulumi.Input<string>[]>;
    clientId?: pulumi.Input<string>;
    clientMetadata?: pulumi.Input<{[key: string]: any}>;
    clientSecret?: pulumi.Input<string>;
    clientSecretRotationTrigger?: pulumi.Input<{[key: string]: any}>;
    crossOriginAuth?: pulumi.Input<boolean>;
    crossOriginLoc?: pulumi.Input<string>;
    customLoginPage?: pulumi.Input<string>;
    customLoginPageOn?: pulumi.Input<boolean>;
    description?: pulumi.Input<string>;
    encryptionKey?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    formTemplate?: pulumi.Input<string>;
    grantTypes?: pulumi.Input<pulumi.Input<string>[]>;
    initiateLoginUri?: pulumi.Input<string>;
    isFirstParty?: pulumi.Input<boolean>;
    isTokenEndpointIpHeaderTrusted?: pulumi.Input<boolean>;
    jwtConfiguration?: pulumi.Input<inputs.GlobalClientJwtConfiguration>;
    logoUri?: pulumi.Input<string>;
    mobile?: pulumi.Input<inputs.GlobalClientMobile>;
    name?: pulumi.Input<string>;
    nativeSocialLogin?: pulumi.Input<inputs.GlobalClientNativeSocialLogin>;
    oidcConformant?: pulumi.Input<boolean>;
    organizationRequireBehavior?: pulumi.Input<string>;
    organizationUsage?: pulumi.Input<string>;
    refreshToken?: pulumi.Input<inputs.GlobalClientRefreshToken>;
    sso?: pulumi.Input<boolean>;
    ssoDisabled?: pulumi.Input<boolean>;
    tokenEndpointAuthMethod?: pulumi.Input<string>;
    webOrigins?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a GlobalClient resource.
 */
export interface GlobalClientArgs {
    addons?: pulumi.Input<inputs.GlobalClientAddons>;
    allowedClients?: pulumi.Input<pulumi.Input<string>[]>;
    allowedLogoutUrls?: pulumi.Input<pulumi.Input<string>[]>;
    allowedOrigins?: pulumi.Input<pulumi.Input<string>[]>;
    appType?: pulumi.Input<string>;
    callbacks?: pulumi.Input<pulumi.Input<string>[]>;
    clientId?: pulumi.Input<string>;
    clientMetadata?: pulumi.Input<{[key: string]: any}>;
    clientSecret?: pulumi.Input<string>;
    clientSecretRotationTrigger?: pulumi.Input<{[key: string]: any}>;
    crossOriginAuth?: pulumi.Input<boolean>;
    crossOriginLoc?: pulumi.Input<string>;
    customLoginPage?: pulumi.Input<string>;
    customLoginPageOn?: pulumi.Input<boolean>;
    description?: pulumi.Input<string>;
    encryptionKey?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    formTemplate?: pulumi.Input<string>;
    grantTypes?: pulumi.Input<pulumi.Input<string>[]>;
    initiateLoginUri?: pulumi.Input<string>;
    isFirstParty?: pulumi.Input<boolean>;
    isTokenEndpointIpHeaderTrusted?: pulumi.Input<boolean>;
    jwtConfiguration?: pulumi.Input<inputs.GlobalClientJwtConfiguration>;
    logoUri?: pulumi.Input<string>;
    mobile?: pulumi.Input<inputs.GlobalClientMobile>;
    name?: pulumi.Input<string>;
    nativeSocialLogin?: pulumi.Input<inputs.GlobalClientNativeSocialLogin>;
    oidcConformant?: pulumi.Input<boolean>;
    organizationRequireBehavior?: pulumi.Input<string>;
    organizationUsage?: pulumi.Input<string>;
    refreshToken?: pulumi.Input<inputs.GlobalClientRefreshToken>;
    sso?: pulumi.Input<boolean>;
    ssoDisabled?: pulumi.Input<boolean>;
    tokenEndpointAuthMethod?: pulumi.Input<string>;
    webOrigins?: pulumi.Input<pulumi.Input<string>[]>;
}
