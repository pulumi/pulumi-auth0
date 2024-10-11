// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ResourceServerTokenEncryptionEncryptionKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Algorithm used to encrypt the token.
        /// </summary>
        [Input("algorithm", required: true)]
        public Input<string> Algorithm { get; set; } = null!;

        /// <summary>
        /// Key ID.
        /// </summary>
        [Input("kid")]
        public Input<string>? Kid { get; set; }

        /// <summary>
        /// Name of the encryption key.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// PEM-formatted public key. Must be JSON escaped.
        /// </summary>
        [Input("pem", required: true)]
        public Input<string> Pem { get; set; } = null!;

        public ResourceServerTokenEncryptionEncryptionKeyArgs()
        {
        }
        public static new ResourceServerTokenEncryptionEncryptionKeyArgs Empty => new ResourceServerTokenEncryptionEncryptionKeyArgs();
    }
}
