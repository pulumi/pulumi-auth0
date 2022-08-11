// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class AttackProtectionSuspiciousIpThrottlingPreLoginGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Maximum number of unsuccessful attempts. Only available on public tenants.
        /// </summary>
        [Input("maxAttempts")]
        public Input<int>? MaxAttempts { get; set; }

        [Input("rate")]
        public Input<int>? Rate { get; set; }

        public AttackProtectionSuspiciousIpThrottlingPreLoginGetArgs()
        {
        }
        public static new AttackProtectionSuspiciousIpThrottlingPreLoginGetArgs Empty => new AttackProtectionSuspiciousIpThrottlingPreLoginGetArgs();
    }
}
