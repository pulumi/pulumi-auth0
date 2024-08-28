// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsAttributePhoneNumberSignupVerificationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines verification settings for Phone Number attribute
        /// </summary>
        [Input("active")]
        public Input<bool>? Active { get; set; }

        public ConnectionOptionsAttributePhoneNumberSignupVerificationArgs()
        {
        }
        public static new ConnectionOptionsAttributePhoneNumberSignupVerificationArgs Empty => new ConnectionOptionsAttributePhoneNumberSignupVerificationArgs();
    }
}
