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
    public sealed class GetAttackProtectionBruteForceProtectionResult
    {
        public readonly ImmutableArray<string> Allowlists;
        public readonly bool Enabled;
        public readonly int MaxAttempts;
        public readonly string Mode;
        public readonly ImmutableArray<string> Shields;

        [OutputConstructor]
        private GetAttackProtectionBruteForceProtectionResult(
            ImmutableArray<string> allowlists,

            bool enabled,

            int maxAttempts,

            string mode,

            ImmutableArray<string> shields)
        {
            Allowlists = allowlists;
            Enabled = enabled;
            MaxAttempts = maxAttempts;
            Mode = mode;
            Shields = shields;
        }
    }
}
