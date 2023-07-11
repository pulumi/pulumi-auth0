// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class PagesChangePasswordArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether to use the custom Reset Password HTML (`true`) or the default Auth0 page (`false`).
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// Customized content for the Reset Password page. HTML format with supported [Liquid syntax](https://github.com/Shopify/liquid/wiki/Liquid-for-Designers).
        /// </summary>
        [Input("html", required: true)]
        public Input<string> Html { get; set; } = null!;

        public PagesChangePasswordArgs()
        {
        }
        public static new PagesChangePasswordArgs Empty => new PagesChangePasswordArgs();
    }
}
