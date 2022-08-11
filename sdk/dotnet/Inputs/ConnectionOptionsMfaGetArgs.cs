// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsMfaGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether multifactor authentication is enabled for this connection.
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        /// <summary>
        /// Indicates whether multifactor authentication enrollment settings will be returned.
        /// </summary>
        [Input("returnEnrollSettings")]
        public Input<bool>? ReturnEnrollSettings { get; set; }

        public ConnectionOptionsMfaGetArgs()
        {
        }
        public static new ConnectionOptionsMfaGetArgs Empty => new ConnectionOptionsMfaGetArgs();
    }
}
