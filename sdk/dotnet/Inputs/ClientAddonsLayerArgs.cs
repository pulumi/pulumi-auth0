// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientAddonsLayerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Expiration in minutes for the generated token (default of 5 minutes).
        /// </summary>
        [Input("expiration")]
        public Input<int>? Expiration { get; set; }

        [Input("keyId", required: true)]
        private Input<string>? _keyId;

        /// <summary>
        /// Authentication Key identifier used to sign the Layer token.
        /// </summary>
        public Input<string>? KeyId
        {
            get => _keyId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _keyId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// AWS principal ARN, for example `arn:aws:iam::010616021751:saml-provider/idpname`.
        /// </summary>
        [Input("principal")]
        public Input<string>? Principal { get; set; }

        [Input("privateKey", required: true)]
        private Input<string>? _privateKey;

        /// <summary>
        /// Private Key for signing the token (SDK v3+ tokens only).
        /// </summary>
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Provider ID of your Layer account.
        /// </summary>
        [Input("providerId", required: true)]
        public Input<string> ProviderId { get; set; } = null!;

        public ClientAddonsLayerArgs()
        {
        }
        public static new ClientAddonsLayerArgs Empty => new ClientAddonsLayerArgs();
    }
}
