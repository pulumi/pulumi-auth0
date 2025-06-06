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
    public sealed class GetClientAddonZoomResult
    {
        /// <summary>
        /// Zoom account name. Usually the first segment of your Zoom URL, for example `https://acme-org.zoom.us` would be `acme-org`.
        /// </summary>
        public readonly string Account;

        [OutputConstructor]
        private GetClientAddonZoomResult(string account)
        {
            Account = account;
        }
    }
}
