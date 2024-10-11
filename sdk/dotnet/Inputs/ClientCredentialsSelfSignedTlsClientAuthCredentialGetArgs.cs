// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientCredentialsSelfSignedTlsClientAuthCredentialGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ISO 8601 formatted date the credential was created.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Credential type. Supported types: `x509_cert`.
        /// </summary>
        [Input("credentialType")]
        public Input<string>? CredentialType { get; set; }

        /// <summary>
        /// The ISO 8601 formatted date representing the expiration of the credential.
        /// </summary>
        [Input("expiresAt")]
        public Input<string>? ExpiresAt { get; set; }

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
        /// PEM-formatted X509 certificate. Must be JSON escaped.
        /// </summary>
        [Input("pem", required: true)]
        public Input<string> Pem { get; set; } = null!;

        /// <summary>
        /// The X509 certificate's SHA256 thumbprint.
        /// </summary>
        [Input("thumbprintSha256")]
        public Input<string>? ThumbprintSha256 { get; set; }

        /// <summary>
        /// The ISO 8601 formatted date the credential was updated.
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        public ClientCredentialsSelfSignedTlsClientAuthCredentialGetArgs()
        {
        }
        public static new ClientCredentialsSelfSignedTlsClientAuthCredentialGetArgs Empty => new ClientCredentialsSelfSignedTlsClientAuthCredentialGetArgs();
    }
}