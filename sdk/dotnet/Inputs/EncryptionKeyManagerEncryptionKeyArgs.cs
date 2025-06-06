// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class EncryptionKeyManagerEncryptionKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ISO 8601 formatted date the encryption key was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// The key ID of the encryption key.
        /// </summary>
        [Input("keyId")]
        public Input<string>? KeyId { get; set; }

        /// <summary>
        /// The key ID of the parent wrapping key.
        /// </summary>
        [Input("parentKeyId")]
        public Input<string>? ParentKeyId { get; set; }

        /// <summary>
        /// The state of the encryption key. One of `pre-activation`, `active`, `deactivated`, or `destroyed`.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The type of the encryption key. One of `customer-provided-root-key`, `environment-root-key`, or `tenant-master-key`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The ISO 8601 formatted date the encryption key was updated.
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        public EncryptionKeyManagerEncryptionKeyArgs()
        {
        }
        public static new EncryptionKeyManagerEncryptionKeyArgs Empty => new EncryptionKeyManagerEncryptionKeyArgs();
    }
}
