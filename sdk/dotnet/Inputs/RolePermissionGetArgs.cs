// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class RolePermissionGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// String. Name of the permission (scope).
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// String. Unique identifier for the resource server.
        /// </summary>
        [Input("resourceServerIdentifier", required: true)]
        public Input<string> ResourceServerIdentifier { get; set; } = null!;

        public RolePermissionGetArgs()
        {
        }
    }
}
