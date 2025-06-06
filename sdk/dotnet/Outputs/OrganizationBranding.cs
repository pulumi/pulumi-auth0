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
    public sealed class OrganizationBranding
    {
        /// <summary>
        /// Color scheme used to customize the login pages.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Colors;
        /// <summary>
        /// URL of logo to display on login page.
        /// </summary>
        public readonly string? LogoUrl;

        [OutputConstructor]
        private OrganizationBranding(
            ImmutableDictionary<string, string>? colors,

            string? logoUrl)
        {
            Colors = colors;
            LogoUrl = logoUrl;
        }
    }
}
