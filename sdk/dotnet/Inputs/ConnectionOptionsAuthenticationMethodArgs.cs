// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsAuthenticationMethodArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configures passkey authentication
        /// </summary>
        [Input("passkey")]
        public Input<Inputs.ConnectionOptionsAuthenticationMethodPasskeyArgs>? Passkey { get; set; }

        /// <summary>
        /// Configures password authentication
        /// </summary>
        [Input("password")]
        public Input<Inputs.ConnectionOptionsAuthenticationMethodPasswordArgs>? Password { get; set; }

        public ConnectionOptionsAuthenticationMethodArgs()
        {
        }
        public static new ConnectionOptionsAuthenticationMethodArgs Empty => new ConnectionOptionsAuthenticationMethodArgs();
    }
}
