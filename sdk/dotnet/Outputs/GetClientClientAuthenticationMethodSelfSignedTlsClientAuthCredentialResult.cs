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
    public sealed class GetClientClientAuthenticationMethodSelfSignedTlsClientAuthCredentialResult
    {
        /// <summary>
        /// The ISO 8601 formatted date the credential was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// Credential type. Supported types: `x509_cert`.
        /// </summary>
        public readonly string CredentialType;
        /// <summary>
        /// The ID of the client credential.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Friendly name for a credential.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The ISO 8601 formatted date the credential was updated.
        /// </summary>
        public readonly string UpdatedAt;

        [OutputConstructor]
        private GetClientClientAuthenticationMethodSelfSignedTlsClientAuthCredentialResult(
            string createdAt,

            string credentialType,

            string id,

            string name,

            string updatedAt)
        {
            CreatedAt = createdAt;
            CredentialType = credentialType;
            Id = id;
            Name = name;
            UpdatedAt = updatedAt;
        }
    }
}
