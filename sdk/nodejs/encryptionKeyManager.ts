// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Resource to allow the rekeying of your tenant master key.
 */
export class EncryptionKeyManager extends pulumi.CustomResource {
    /**
     * Get an existing EncryptionKeyManager resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EncryptionKeyManagerState, opts?: pulumi.CustomResourceOptions): EncryptionKeyManager {
        return new EncryptionKeyManager(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/encryptionKeyManager:EncryptionKeyManager';

    /**
     * Returns true if the given object is an instance of EncryptionKeyManager.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EncryptionKeyManager {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EncryptionKeyManager.__pulumiType;
    }

    /**
     * This attribute is used for provisioning the customer provided root key. To initiate the provisioning process, create a new empty `customerProvidedRootKey` block. After applying this, the `publicWrappingKey` can be retreived from the resource, and the new root key should be generated by the customer and wrapped with the wrapping key, then base64-encoded and added as the `wrappedKey` attribute.
     */
    public readonly customerProvidedRootKey!: pulumi.Output<outputs.EncryptionKeyManagerCustomerProvidedRootKey | undefined>;
    /**
     * All encryption keys.
     */
    public /*out*/ readonly encryptionKeys!: pulumi.Output<outputs.EncryptionKeyManagerEncryptionKey[]>;
    /**
     * If this value is changed, the encryption keys will be rotated. A UUID is recommended for the `keyRotationId`.
     */
    public readonly keyRotationId!: pulumi.Output<string | undefined>;

    /**
     * Create a EncryptionKeyManager resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: EncryptionKeyManagerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EncryptionKeyManagerArgs | EncryptionKeyManagerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EncryptionKeyManagerState | undefined;
            resourceInputs["customerProvidedRootKey"] = state ? state.customerProvidedRootKey : undefined;
            resourceInputs["encryptionKeys"] = state ? state.encryptionKeys : undefined;
            resourceInputs["keyRotationId"] = state ? state.keyRotationId : undefined;
        } else {
            const args = argsOrState as EncryptionKeyManagerArgs | undefined;
            resourceInputs["customerProvidedRootKey"] = args ? args.customerProvidedRootKey : undefined;
            resourceInputs["keyRotationId"] = args ? args.keyRotationId : undefined;
            resourceInputs["encryptionKeys"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EncryptionKeyManager.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EncryptionKeyManager resources.
 */
export interface EncryptionKeyManagerState {
    /**
     * This attribute is used for provisioning the customer provided root key. To initiate the provisioning process, create a new empty `customerProvidedRootKey` block. After applying this, the `publicWrappingKey` can be retreived from the resource, and the new root key should be generated by the customer and wrapped with the wrapping key, then base64-encoded and added as the `wrappedKey` attribute.
     */
    customerProvidedRootKey?: pulumi.Input<inputs.EncryptionKeyManagerCustomerProvidedRootKey>;
    /**
     * All encryption keys.
     */
    encryptionKeys?: pulumi.Input<pulumi.Input<inputs.EncryptionKeyManagerEncryptionKey>[]>;
    /**
     * If this value is changed, the encryption keys will be rotated. A UUID is recommended for the `keyRotationId`.
     */
    keyRotationId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a EncryptionKeyManager resource.
 */
export interface EncryptionKeyManagerArgs {
    /**
     * This attribute is used for provisioning the customer provided root key. To initiate the provisioning process, create a new empty `customerProvidedRootKey` block. After applying this, the `publicWrappingKey` can be retreived from the resource, and the new root key should be generated by the customer and wrapped with the wrapping key, then base64-encoded and added as the `wrappedKey` attribute.
     */
    customerProvidedRootKey?: pulumi.Input<inputs.EncryptionKeyManagerCustomerProvidedRootKey>;
    /**
     * If this value is changed, the encryption keys will be rotated. A UUID is recommended for the `keyRotationId`.
     */
    keyRotationId?: pulumi.Input<string>;
}