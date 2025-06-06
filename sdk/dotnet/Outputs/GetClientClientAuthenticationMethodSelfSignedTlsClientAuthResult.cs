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
    public sealed class GetClientClientAuthenticationMethodSelfSignedTlsClientAuthResult
    {
        /// <summary>
        /// Credentials that will be enabled on the client for mTLS authentication utilizing self-signed certificates.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClientClientAuthenticationMethodSelfSignedTlsClientAuthCredentialResult> Credentials;

        [OutputConstructor]
        private GetClientClientAuthenticationMethodSelfSignedTlsClientAuthResult(ImmutableArray<Outputs.GetClientClientAuthenticationMethodSelfSignedTlsClientAuthCredentialResult> credentials)
        {
            Credentials = credentials;
        }
    }
}
