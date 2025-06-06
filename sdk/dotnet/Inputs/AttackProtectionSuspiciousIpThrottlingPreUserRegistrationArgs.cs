// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The maximum number of sign up attempts allowed from a single IP address.
        /// </summary>
        [Input("maxAttempts")]
        public Input<int>? MaxAttempts { get; set; }

        /// <summary>
        /// Interval of time, given in milliseconds at which new sign up tokens will become available after they have been used by an IP address. Each sign up attempt will be added on the defined throttling rate.
        /// </summary>
        [Input("rate")]
        public Input<int>? Rate { get; set; }

        public AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs()
        {
        }
        public static new AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs Empty => new AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs();
    }
}
