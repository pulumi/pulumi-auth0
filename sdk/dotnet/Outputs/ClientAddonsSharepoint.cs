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
    public sealed class ClientAddonsSharepoint
    {
        /// <summary>
        /// External SharePoint application URLs if exposed to the Internet.
        /// </summary>
        public readonly ImmutableArray<string> ExternalUrls;
        /// <summary>
        /// Internal SharePoint application URL.
        /// </summary>
        public readonly string? Url;

        [OutputConstructor]
        private ClientAddonsSharepoint(
            ImmutableArray<string> externalUrls,

            string? url)
        {
            ExternalUrls = externalUrls;
            Url = url;
        }
    }
}
