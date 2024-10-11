// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ResourceServerAuthorizationDetailArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Disable authorization details.
        /// </summary>
        [Input("disable")]
        public Input<bool>? Disable { get; set; }

        /// <summary>
        /// Type of authorization details.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ResourceServerAuthorizationDetailArgs()
        {
        }
        public static new ResourceServerAuthorizationDetailArgs Empty => new ResourceServerAuthorizationDetailArgs();
    }
}
