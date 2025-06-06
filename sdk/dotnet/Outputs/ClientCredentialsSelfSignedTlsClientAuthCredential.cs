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
    public sealed class ClientCredentialsSelfSignedTlsClientAuthCredential
    {
        /// <summary>
        /// The ISO 8601 formatted date the credential was created.
        /// </summary>
        public readonly string? CreatedAt;
        /// <summary>
        /// Credential type. Supported types: `x509_cert`.
        /// </summary>
        public readonly string? CredentialType;
        /// <summary>
        /// The ISO 8601 formatted date representing the expiration of the credential.
        /// </summary>
        public readonly string? ExpiresAt;
        /// <summary>
        /// The ID of the client credential.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// Friendly name for a credential.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// PEM-formatted X509 certificate. Must be JSON escaped.
        /// </summary>
        public readonly string Pem;
        /// <summary>
        /// The X509 certificate's SHA256 thumbprint.
        /// </summary>
        public readonly string? ThumbprintSha256;
        /// <summary>
        /// The ISO 8601 formatted date the credential was updated.
        /// </summary>
        public readonly string? UpdatedAt;

        [OutputConstructor]
        private ClientCredentialsSelfSignedTlsClientAuthCredential(
            string? createdAt,

            string? credentialType,

            string? expiresAt,

            string? id,

            string? name,

            string pem,

            string? thumbprintSha256,

            string? updatedAt)
        {
            CreatedAt = createdAt;
            CredentialType = credentialType;
            ExpiresAt = expiresAt;
            Id = id;
            Name = name;
            Pem = pem;
            ThumbprintSha256 = thumbprintSha256;
            UpdatedAt = updatedAt;
        }
    }
}
