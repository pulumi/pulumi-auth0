// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Outputs
{

    [OutputType]
    public sealed class ConnectionOptionsAttributePhoneNumberSignupVerification
    {
        /// <summary>
        /// Defines verification settings for Phone Number attribute
        /// </summary>
        public readonly bool? Active;

        [OutputConstructor]
        private ConnectionOptionsAttributePhoneNumberSignupVerification(bool? active)
        {
            Active = active;
        }
    }
}
