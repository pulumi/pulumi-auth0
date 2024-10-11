// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientCredentialsSelfSignedTlsClientAuthArgs : global::Pulumi.ResourceArgs
    {
        [Input("credentials", required: true)]
        private InputList<Inputs.ClientCredentialsSelfSignedTlsClientAuthCredentialArgs>? _credentials;

        /// <summary>
        /// Credentials that will be enabled on the client for mTLS authentication utilizing self-signed certificates.
        /// </summary>
        public InputList<Inputs.ClientCredentialsSelfSignedTlsClientAuthCredentialArgs> Credentials
        {
            get => _credentials ?? (_credentials = new InputList<Inputs.ClientCredentialsSelfSignedTlsClientAuthCredentialArgs>());
            set => _credentials = value;
        }

        public ClientCredentialsSelfSignedTlsClientAuthArgs()
        {
        }
        public static new ClientCredentialsSelfSignedTlsClientAuthArgs Empty => new ClientCredentialsSelfSignedTlsClientAuthArgs();
    }
}