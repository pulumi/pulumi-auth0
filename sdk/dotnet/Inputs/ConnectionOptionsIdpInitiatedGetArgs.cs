// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsIdpInitiatedGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("clientAuthorizeQuery")]
        public Input<string>? ClientAuthorizeQuery { get; set; }

        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        [Input("clientProtocol")]
        public Input<string>? ClientProtocol { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public ConnectionOptionsIdpInitiatedGetArgs()
        {
        }
        public static new ConnectionOptionsIdpInitiatedGetArgs Empty => new ConnectionOptionsIdpInitiatedGetArgs();
    }
}
