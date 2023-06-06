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
    public sealed class ClientCredentialsPrivateKeyJwt
    {
        /// <summary>
        /// Client credentials available for use when Private Key JWT is in use as the client authentication method. A maximum of 2 client credentials can be set.
        /// </summary>
        public readonly ImmutableArray<Outputs.ClientCredentialsPrivateKeyJwtCredential> Credentials;

        [OutputConstructor]
        private ClientCredentialsPrivateKeyJwt(ImmutableArray<Outputs.ClientCredentialsPrivateKeyJwtCredential> credentials)
        {
            Credentials = credentials;
        }
    }
}