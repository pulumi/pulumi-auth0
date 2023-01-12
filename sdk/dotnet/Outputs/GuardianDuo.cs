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
    public sealed class GuardianDuo
    {
        /// <summary>
        /// Indicates whether Duo MFA is enabled.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// Duo API Hostname, see the Duo documentation for more details on Duo setup.
        /// </summary>
        public readonly string? Hostname;
        /// <summary>
        /// Duo client ID, see the Duo documentation for more details on Duo setup.
        /// </summary>
        public readonly string? IntegrationKey;
        /// <summary>
        /// Duo client secret, see the Duo documentation for more details on Duo setup.
        /// </summary>
        public readonly string? SecretKey;

        [OutputConstructor]
        private GuardianDuo(
            bool enabled,

            string? hostname,

            string? integrationKey,

            string? secretKey)
        {
            Enabled = enabled;
            Hostname = hostname;
            IntegrationKey = integrationKey;
            SecretKey = secretKey;
        }
    }
}
