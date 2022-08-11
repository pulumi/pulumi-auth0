// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class TenantUniversalLoginColorsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// String, Hexadecimal. Background color of login pages.
        /// </summary>
        [Input("pageBackground")]
        public Input<string>? PageBackground { get; set; }

        /// <summary>
        /// String, Hexadecimal. Primary button background color.
        /// </summary>
        [Input("primary")]
        public Input<string>? Primary { get; set; }

        public TenantUniversalLoginColorsArgs()
        {
        }
        public static new TenantUniversalLoginColorsArgs Empty => new TenantUniversalLoginColorsArgs();
    }
}
