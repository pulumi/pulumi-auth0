// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Outputs
{

    [OutputType]
    public sealed class ClientAddonsFirebase
    {
        /// <summary>
        /// ID of the Service Account you have created (shown as `client_email` in the generated JSON file, SDK v3+ tokens only).
        /// </summary>
        public readonly string? ClientEmail;
        /// <summary>
        /// Optional expiration in seconds for the generated token. Defaults to 3600 seconds (SDK v3+ tokens only).
        /// </summary>
        public readonly int? LifetimeInSeconds;
        /// <summary>
        /// Private Key for signing the token (SDK v3+ tokens only).
        /// </summary>
        public readonly string? PrivateKey;
        /// <summary>
        /// Optional ID of the private key to obtain the `kid` header claim from the issued token (SDK v3+ tokens only).
        /// </summary>
        public readonly string? PrivateKeyId;
        /// <summary>
        /// Google Firebase Secret. (SDK v2 only).
        /// </summary>
        public readonly string? Secret;

        [OutputConstructor]
        private ClientAddonsFirebase(
            string? clientEmail,

            int? lifetimeInSeconds,

            string? privateKey,

            string? privateKeyId,

            string? secret)
        {
            ClientEmail = clientEmail;
            LifetimeInSeconds = lifetimeInSeconds;
            PrivateKey = privateKey;
            PrivateKeyId = privateKeyId;
            Secret = secret;
        }
    }
}
