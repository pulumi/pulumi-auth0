// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientMobileIosGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// String
        /// </summary>
        [Input("appBundleIdentifier")]
        public Input<string>? AppBundleIdentifier { get; set; }

        /// <summary>
        /// String
        /// </summary>
        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        public ClientMobileIosGetArgs()
        {
        }
    }
}
