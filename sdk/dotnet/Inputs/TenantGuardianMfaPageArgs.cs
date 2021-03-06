// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class TenantGuardianMfaPageArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean. Indicates whether or not to use the custom Guardian page.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// String, HTML format with supported Liquid syntax. Customized content of the Guardian page.
        /// </summary>
        [Input("html", required: true)]
        public Input<string> Html { get; set; } = null!;

        public TenantGuardianMfaPageArgs()
        {
        }
    }
}
