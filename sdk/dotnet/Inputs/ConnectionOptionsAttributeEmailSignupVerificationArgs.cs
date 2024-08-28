// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsAttributeEmailSignupVerificationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines verification settings for signup attribute
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        public ConnectionOptionsAttributeEmailSignupVerificationArgs()
        {
        }
        public static new ConnectionOptionsAttributeEmailSignupVerificationArgs Empty => new ConnectionOptionsAttributeEmailSignupVerificationArgs();
    }
}
