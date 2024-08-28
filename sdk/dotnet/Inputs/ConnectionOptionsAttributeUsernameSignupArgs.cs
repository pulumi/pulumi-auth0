// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsAttributeUsernameSignupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines whether User Name attribute is active as an identifier
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public ConnectionOptionsAttributeUsernameSignupArgs()
        {
        }
        public static new ConnectionOptionsAttributeUsernameSignupArgs Empty => new ConnectionOptionsAttributeUsernameSignupArgs();
    }
}
