// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ResourceServerProofOfPossessionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Disable proof-of-possession.
        /// </summary>
        [Input("disable")]
        public Input<bool>? Disable { get; set; }

        /// <summary>
        /// Mechanism used for proof-of-possession. Only `mtls` is supported.
        /// </summary>
        [Input("mechanism")]
        public Input<string>? Mechanism { get; set; }

        /// <summary>
        /// Indicates whether proof-of-possession is required with this resource server.
        /// </summary>
        [Input("required")]
        public Input<bool>? Required { get; set; }

        public ResourceServerProofOfPossessionArgs()
        {
        }
        public static new ResourceServerProofOfPossessionArgs Empty => new ResourceServerProofOfPossessionArgs();
    }
}