// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientCredentialsTlsClientAuthCredentialGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ISO 8601 formatted date the credential was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Credential type. Supported types: `cert_subject_dn`.
        /// </summary>
        [Input("credentialType", required: true)]
        public Input<string> CredentialType { get; set; } = null!;

        /// <summary>
        /// The ID of the client credential.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Friendly name for a credential.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// PEM-formatted X509 certificate. Must be JSON escaped. Mutually exlusive with `subject_dn` property.
        /// </summary>
        [Input("pem")]
        public Input<string>? Pem { get; set; }

        /// <summary>
        /// Subject Distinguished Name. Mutually exlusive with `pem` property.
        /// </summary>
        [Input("subjectDn")]
        public Input<string>? SubjectDn { get; set; }

        /// <summary>
        /// The ISO 8601 formatted date the credential was updated.
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        public ClientCredentialsTlsClientAuthCredentialGetArgs()
        {
        }
        public static new ClientCredentialsTlsClientAuthCredentialGetArgs Empty => new ClientCredentialsTlsClientAuthCredentialGetArgs();
    }
}
