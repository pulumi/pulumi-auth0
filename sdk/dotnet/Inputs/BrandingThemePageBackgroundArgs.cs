// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class BrandingThemePageBackgroundArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Background color.
        /// </summary>
        [Input("backgroundColor", required: true)]
        public Input<string> BackgroundColor { get; set; } = null!;

        /// <summary>
        /// Background image url.
        /// </summary>
        [Input("backgroundImageUrl", required: true)]
        public Input<string> BackgroundImageUrl { get; set; } = null!;

        /// <summary>
        /// Page layout. Available options: `center`, `left`, `right`.
        /// </summary>
        [Input("pageLayout", required: true)]
        public Input<string> PageLayout { get; set; } = null!;

        public BrandingThemePageBackgroundArgs()
        {
        }
        public static new BrandingThemePageBackgroundArgs Empty => new BrandingThemePageBackgroundArgs();
    }
}