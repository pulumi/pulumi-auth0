// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class BrandingFontGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// URL for the custom font.
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public BrandingFontGetArgs()
        {
        }
        public static new BrandingFontGetArgs Empty => new BrandingFontGetArgs();
    }
}
