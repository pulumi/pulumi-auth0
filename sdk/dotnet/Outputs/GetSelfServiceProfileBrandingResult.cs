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
    public sealed class GetSelfServiceProfileBrandingResult
    {
        /// <summary>
        /// Configuration settings for colors for branding.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSelfServiceProfileBrandingColorResult> Colors;
        /// <summary>
        /// URL of logo to display on login page.
        /// </summary>
        public readonly string LogoUrl;

        [OutputConstructor]
        private GetSelfServiceProfileBrandingResult(
            ImmutableArray<Outputs.GetSelfServiceProfileBrandingColorResult> colors,

            string logoUrl)
        {
            Colors = colors;
            LogoUrl = logoUrl;
        }
    }
}
