// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class RolePermissionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the permission.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the permission (scope) configured on the resource server. If referencing a scope from an `auth0.ResourceServer` resource, use the `value` property, for example `auth0_resource_server.my_resource_server.scopes[0].value`.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Unique identifier for the resource server.
        /// </summary>
        [Input("resourceServerIdentifier", required: true)]
        public Input<string> ResourceServerIdentifier { get; set; } = null!;

        /// <summary>
        /// Name of resource server that the permission is associated with.
        /// </summary>
        [Input("resourceServerName")]
        public Input<string>? ResourceServerName { get; set; }

        public RolePermissionArgs()
        {
        }
        public static new RolePermissionArgs Empty => new RolePermissionArgs();
    }
}
