// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientCredentialsPrivateKeyJwtGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("credentials", required: true)]
        private InputList<Inputs.ClientCredentialsPrivateKeyJwtCredentialGetArgs>? _credentials;

        /// <summary>
        /// Client credentials available for use when Private Key JWT is in use as the client authentication method. A maximum of 2 client credentials can be set.
        /// </summary>
        public InputList<Inputs.ClientCredentialsPrivateKeyJwtCredentialGetArgs> Credentials
        {
            get => _credentials ?? (_credentials = new InputList<Inputs.ClientCredentialsPrivateKeyJwtCredentialGetArgs>());
            set => _credentials = value;
        }

        public ClientCredentialsPrivateKeyJwtGetArgs()
        {
        }
        public static new ClientCredentialsPrivateKeyJwtGetArgs Empty => new ClientCredentialsPrivateKeyJwtGetArgs();
    }
}