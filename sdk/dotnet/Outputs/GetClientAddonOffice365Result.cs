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
    public sealed class GetClientAddonOffice365Result
    {
        /// <summary>
        /// Optional Auth0 database connection for testing an already-configured Office 365 tenant.
        /// </summary>
        public readonly string Connection;
        /// <summary>
        /// Your Office 365 domain name, for example `acme-org.com`.
        /// </summary>
        public readonly string Domain;

        [OutputConstructor]
        private GetClientAddonOffice365Result(
            string connection,

            string domain)
        {
            Connection = connection;
            Domain = domain;
        }
    }
}
