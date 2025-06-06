// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class BrandingThemeFontsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Body text.
        /// </summary>
        [Input("bodyText", required: true)]
        public Input<Inputs.BrandingThemeFontsBodyTextGetArgs> BodyText { get; set; } = null!;

        /// <summary>
        /// Buttons text.
        /// </summary>
        [Input("buttonsText", required: true)]
        public Input<Inputs.BrandingThemeFontsButtonsTextGetArgs> ButtonsText { get; set; } = null!;

        /// <summary>
        /// Font URL. Defaults to an empty string.
        /// </summary>
        [Input("fontUrl")]
        public Input<string>? FontUrl { get; set; }

        /// <summary>
        /// Input labels.
        /// </summary>
        [Input("inputLabels", required: true)]
        public Input<Inputs.BrandingThemeFontsInputLabelsGetArgs> InputLabels { get; set; } = null!;

        /// <summary>
        /// Links.
        /// </summary>
        [Input("links", required: true)]
        public Input<Inputs.BrandingThemeFontsLinksGetArgs> Links { get; set; } = null!;

        /// <summary>
        /// Links style. Defaults to `normal`.
        /// </summary>
        [Input("linksStyle")]
        public Input<string>? LinksStyle { get; set; }

        /// <summary>
        /// Reference text size. Value needs to be between `12` and `24`. Defaults to `16.0`.
        /// </summary>
        [Input("referenceTextSize")]
        public Input<double>? ReferenceTextSize { get; set; }

        /// <summary>
        /// Subtitle.
        /// </summary>
        [Input("subtitle", required: true)]
        public Input<Inputs.BrandingThemeFontsSubtitleGetArgs> Subtitle { get; set; } = null!;

        /// <summary>
        /// Title.
        /// </summary>
        [Input("title", required: true)]
        public Input<Inputs.BrandingThemeFontsTitleGetArgs> Title { get; set; } = null!;

        public BrandingThemeFontsGetArgs()
        {
        }
        public static new BrandingThemeFontsGetArgs Empty => new BrandingThemeFontsGetArgs();
    }
}
