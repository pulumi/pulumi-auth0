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
    public sealed class GetAttackProtectionSuspiciousIpThrottlingResult
    {
        /// <summary>
        /// List of trusted IP addresses that will not have attack protection enforced against them. This field allows you to specify multiple IP addresses, or ranges. You can use IPv4 or IPv6 addresses and CIDR notation.
        /// </summary>
        public readonly ImmutableArray<string> Allowlists;
        /// <summary>
        /// Whether suspicious IP throttling attack protections are active.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Configuration options that apply before every login attempt. Only available on public tenants.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAttackProtectionSuspiciousIpThrottlingPreLoginResult> PreLogins;
        /// <summary>
        /// Configuration options that apply before every user registration attempt. Only available on public tenants.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetAttackProtectionSuspiciousIpThrottlingPreUserRegistrationResult> PreUserRegistrations;
        /// <summary>
        /// Action to take when a suspicious IP throttling threshold is violated. Possible values: `block` (throttle traffic from an IP address when there is a high number of login attempts targeting too many different accounts), `admin_notification` (send an email notification when traffic is throttled on one or more IP addresses due to high-velocity traffic).
        /// </summary>
        public readonly ImmutableArray<string> Shields;

        [OutputConstructor]
        private GetAttackProtectionSuspiciousIpThrottlingResult(
            ImmutableArray<string> allowlists,

            bool enabled,

            ImmutableArray<Outputs.GetAttackProtectionSuspiciousIpThrottlingPreLoginResult> preLogins,

            ImmutableArray<Outputs.GetAttackProtectionSuspiciousIpThrottlingPreUserRegistrationResult> preUserRegistrations,

            ImmutableArray<string> shields)
        {
            Allowlists = allowlists;
            Enabled = enabled;
            PreLogins = preLogins;
            PreUserRegistrations = preUserRegistrations;
            Shields = shields;
        }
    }
}
