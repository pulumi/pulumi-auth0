// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsPasswordHistoryArgs : global::Pulumi.ResourceArgs
    {
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        [Input("size")]
        public Input<int>? Size { get; set; }

        public ConnectionOptionsPasswordHistoryArgs()
        {
        }
        public static new ConnectionOptionsPasswordHistoryArgs Empty => new ConnectionOptionsPasswordHistoryArgs();
    }
}
