// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    /// <summary>
    /// With this resource, you can manage role permissions (1-1).
    /// 
    /// !&gt; This resource appends a permission to a role. In contrast, the `auth0.RolePermissions` resource manages all the
    /// permissions assigned to a role. To avoid potential issues, it is recommended not to use this resource in conjunction
    /// with the `auth0.RolePermissions` resource when managing permissions for the same role id.
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by specifying the
    /// 
    /// role ID, resource identifier, and permission name separated by "::" (note the double colon)
    /// 
    /// &lt;roleID&gt;::&lt;resourceServerIdentifier&gt;::&lt;permission&gt;
    /// 
    /// Example:
    /// 
    /// ```sh
    /// $ pulumi import auth0:index/rolePermission:RolePermission permission "rol_XXXXXXXXXXXXX::https://example.com::read:foo"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/rolePermission:RolePermission")]
    public partial class RolePermission : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Description of the permission.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Name of the permission.
        /// </summary>
        [Output("permission")]
        public Output<string> Permission { get; private set; } = null!;

        /// <summary>
        /// Identifier of the resource server that the permission is associated with.
        /// </summary>
        [Output("resourceServerIdentifier")]
        public Output<string> ResourceServerIdentifier { get; private set; } = null!;

        /// <summary>
        /// Name of the resource server that the permission is associated with.
        /// </summary>
        [Output("resourceServerName")]
        public Output<string> ResourceServerName { get; private set; } = null!;

        /// <summary>
        /// ID of the role to associate the permission to.
        /// </summary>
        [Output("roleId")]
        public Output<string> RoleId { get; private set; } = null!;


        /// <summary>
        /// Create a RolePermission resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RolePermission(string name, RolePermissionArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/rolePermission:RolePermission", name, args ?? new RolePermissionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RolePermission(string name, Input<string> id, RolePermissionState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/rolePermission:RolePermission", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing RolePermission resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RolePermission Get(string name, Input<string> id, RolePermissionState? state = null, CustomResourceOptions? options = null)
        {
            return new RolePermission(name, id, state, options);
        }
    }

    public sealed class RolePermissionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the permission.
        /// </summary>
        [Input("permission", required: true)]
        public Input<string> Permission { get; set; } = null!;

        /// <summary>
        /// Identifier of the resource server that the permission is associated with.
        /// </summary>
        [Input("resourceServerIdentifier", required: true)]
        public Input<string> ResourceServerIdentifier { get; set; } = null!;

        /// <summary>
        /// ID of the role to associate the permission to.
        /// </summary>
        [Input("roleId", required: true)]
        public Input<string> RoleId { get; set; } = null!;

        public RolePermissionArgs()
        {
        }
        public static new RolePermissionArgs Empty => new RolePermissionArgs();
    }

    public sealed class RolePermissionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the permission.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the permission.
        /// </summary>
        [Input("permission")]
        public Input<string>? Permission { get; set; }

        /// <summary>
        /// Identifier of the resource server that the permission is associated with.
        /// </summary>
        [Input("resourceServerIdentifier")]
        public Input<string>? ResourceServerIdentifier { get; set; }

        /// <summary>
        /// Name of the resource server that the permission is associated with.
        /// </summary>
        [Input("resourceServerName")]
        public Input<string>? ResourceServerName { get; set; }

        /// <summary>
        /// ID of the role to associate the permission to.
        /// </summary>
        [Input("roleId")]
        public Input<string>? RoleId { get; set; }

        public RolePermissionState()
        {
        }
        public static new RolePermissionState Empty => new RolePermissionState();
    }
}
