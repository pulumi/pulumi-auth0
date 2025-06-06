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
    public sealed class GetClientAddonSentryResult
    {
        /// <summary>
        /// URL prefix only if running Sentry Community Edition, otherwise leave empty.
        /// </summary>
        public readonly string BaseUrl;
        /// <summary>
        /// Generated slug for your Sentry organization. Found in your Sentry URL, for example `https://sentry.acme.com/acme-org/` would be `acme-org`.
        /// </summary>
        public readonly string OrgSlug;

        [OutputConstructor]
        private GetClientAddonSentryResult(
            string baseUrl,

            string orgSlug)
        {
            BaseUrl = baseUrl;
            OrgSlug = orgSlug;
        }
    }
}
