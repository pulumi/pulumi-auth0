// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class PagesErrorGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Customized content for the Error page. HTML format with supported [Liquid syntax](https://github.com/Shopify/liquid/wiki/Liquid-for-Designers).
        /// </summary>
        [Input("html")]
        public Input<string>? Html { get; set; }

        /// <summary>
        /// Indicates whether to show the link to logs as part of the default error page.
        /// </summary>
        [Input("showLogLink", required: true)]
        public Input<bool> ShowLogLink { get; set; } = null!;

        /// <summary>
        /// URL to redirect to when an error occurs, instead of showing the default error page.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public PagesErrorGetArgs()
        {
        }
        public static new PagesErrorGetArgs Empty => new PagesErrorGetArgs();
    }
}
