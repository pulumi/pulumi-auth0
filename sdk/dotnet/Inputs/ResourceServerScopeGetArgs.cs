// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ResourceServerScopeGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// String. Description of the permission (scope).
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// String. Name of the permission (scope). Examples include `read:appointments` or `delete:appointments`.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public ResourceServerScopeGetArgs()
        {
        }
    }
}
