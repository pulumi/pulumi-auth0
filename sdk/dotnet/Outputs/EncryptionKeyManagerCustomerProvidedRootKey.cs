// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Outputs
{

    [OutputType]
    public sealed class EncryptionKeyManagerCustomerProvidedRootKey
    {
        /// <summary>
        /// The ISO 8601 formatted date the customer provided root key was created.
        /// </summary>
        public readonly string? CreatedAt;
        /// <summary>
        /// The key ID of the customer provided root key.
        /// </summary>
        public readonly string? KeyId;
        /// <summary>
        /// The key ID of the parent wrapping key.
        /// </summary>
        public readonly string? ParentKeyId;
        /// <summary>
        /// The public wrapping key in PEM format.
        /// </summary>
        public readonly string? PublicWrappingKey;
        /// <summary>
        /// The state of the encryption key. One of `pre-activation`, `active`, `deactivated`, or `destroyed`.
        /// </summary>
        public readonly string? State;
        /// <summary>
        /// The type of the customer provided root key. Should be `customer-provided-root-key`.
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// The ISO 8601 formatted date the customer provided root key was updated.
        /// </summary>
        public readonly string? UpdatedAt;
        /// <summary>
        /// The base64-encoded customer provided root key, wrapped using the `public_wrapping_key`. This can be removed after the wrapped key has been applied.
        /// </summary>
        public readonly string? WrappedKey;
        /// <summary>
        /// The algorithm that should be used to wrap the customer provided root key. Should be `CKM_RSA_AES_KEY_WRAP`.
        /// </summary>
        public readonly string? WrappingAlgorithm;

        [OutputConstructor]
        private EncryptionKeyManagerCustomerProvidedRootKey(
            string? createdAt,

            string? keyId,

            string? parentKeyId,

            string? publicWrappingKey,

            string? state,

            string? type,

            string? updatedAt,

            string? wrappedKey,

            string? wrappingAlgorithm)
        {
            CreatedAt = createdAt;
            KeyId = keyId;
            ParentKeyId = parentKeyId;
            PublicWrappingKey = publicWrappingKey;
            State = state;
            Type = type;
            UpdatedAt = updatedAt;
            WrappedKey = wrappedKey;
            WrappingAlgorithm = wrappingAlgorithm;
        }
    }
}
