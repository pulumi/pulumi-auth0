// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Outputs
{

    [OutputType]
    public sealed class ClientAddonsAws
    {
        /// <summary>
        /// AWS token lifetime in seconds.
        /// </summary>
        public readonly int? LifetimeInSeconds;
        /// <summary>
        /// AWS principal ARN, for example `arn:aws:iam::010616021751:saml-provider/idpname`.
        /// </summary>
        public readonly string? Principal;
        /// <summary>
        /// AWS role ARN, for example `arn:aws:iam::010616021751:role/foo`.
        /// </summary>
        public readonly string? Role;

        [OutputConstructor]
        private ClientAddonsAws(
            int? lifetimeInSeconds,

            string? principal,

            string? role)
        {
            LifetimeInSeconds = lifetimeInSeconds;
            Principal = principal;
            Role = role;
        }
    }
}
