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
    public sealed class AttackProtectionSuspiciousIpThrottlingPreUserRegistration
    {
        /// <summary>
        /// Maximum number of consecutive failed login attempts from a single user before blocking is triggered. Only available on public tenants.
        /// </summary>
        public readonly int? MaxAttempts;
        /// <summary>
        /// Interval of time, given in milliseconds at which new login tokens will become available after they have been used by an IP address. Each login attempt will be added on the defined throttling rate.
        /// </summary>
        public readonly int? Rate;

        [OutputConstructor]
        private AttackProtectionSuspiciousIpThrottlingPreUserRegistration(
            int? maxAttempts,

            int? rate)
        {
            MaxAttempts = maxAttempts;
            Rate = rate;
        }
    }
}
