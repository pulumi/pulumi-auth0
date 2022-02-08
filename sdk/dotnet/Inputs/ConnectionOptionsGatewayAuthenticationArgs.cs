// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsGatewayAuthenticationArgs : Pulumi.ResourceArgs
    {
        [Input("audience")]
        public Input<string>? Audience { get; set; }

        [Input("method")]
        public Input<string>? Method { get; set; }

        [Input("secret")]
        public Input<string>? Secret { get; set; }

        [Input("secretBase64Encoded")]
        public Input<bool>? SecretBase64Encoded { get; set; }

        [Input("subject")]
        public Input<string>? Subject { get; set; }

        public ConnectionOptionsGatewayAuthenticationArgs()
        {
        }
    }
}
