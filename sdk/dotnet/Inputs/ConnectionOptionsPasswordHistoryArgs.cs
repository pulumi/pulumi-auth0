// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsPasswordHistoryArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether password history is enabled for the connection. When enabled, any existing users in this connection will be unaffected; the system will maintain their password history going forward.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// Indicates the number of passwords to keep in history with a maximum of 24.
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        public ConnectionOptionsPasswordHistoryArgs()
        {
        }
    }
}
