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
    public sealed class GetClientRefreshTokenResult
    {
        public readonly string ExpirationType;
        public readonly int IdleTokenLifetime;
        public readonly bool InfiniteIdleTokenLifetime;
        public readonly bool InfiniteTokenLifetime;
        public readonly int Leeway;
        public readonly string RotationType;
        public readonly int TokenLifetime;

        [OutputConstructor]
        private GetClientRefreshTokenResult(
            string expirationType,

            int idleTokenLifetime,

            bool infiniteIdleTokenLifetime,

            bool infiniteTokenLifetime,

            int leeway,

            string rotationType,

            int tokenLifetime)
        {
            ExpirationType = expirationType;
            IdleTokenLifetime = idleTokenLifetime;
            InfiniteIdleTokenLifetime = infiniteIdleTokenLifetime;
            InfiniteTokenLifetime = infiniteTokenLifetime;
            Leeway = leeway;
            RotationType = rotationType;
            TokenLifetime = tokenLifetime;
        }
    }
}