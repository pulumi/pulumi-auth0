// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    /// <summary>
    /// With this resource, you can manage user permissions.
    /// 
    /// !&gt; This resource appends a permission to a user. In contrast, the `auth0.UserPermissions` resource manages all the
    /// permissions assigned to a user. To avoid potential issues, it is recommended not to use this resource in conjunction
    /// with the `auth0.UserPermissions` resource when managing permissions for the same user id.
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by specifying the
    /// 
    ///  user ID, resource identifier and permission name separated by "::" (note the double colon)
    /// 
    ///  &lt;userID&gt;::&lt;resourceServerIdentifier&gt;::&lt;permission&gt;
    /// 
    /// # 
    /// 
    ///  Example:
    /// 
    /// ```sh
    /// $ pulumi import auth0:index/userPermission:UserPermission permission "auth0|111111111111111111111111::https://api.travel0.com/v1::read:posts"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/userPermission:UserPermission")]
    public partial class UserPermission : global::Pulumi.CustomResource
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
        /// ID of the user to associate the permission to.
        /// </summary>
        [Output("userId")]
        public Output<string> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a UserPermission resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserPermission(string name, UserPermissionArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/userPermission:UserPermission", name, args ?? new UserPermissionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserPermission(string name, Input<string> id, UserPermissionState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/userPermission:UserPermission", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UserPermission resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserPermission Get(string name, Input<string> id, UserPermissionState? state = null, CustomResourceOptions? options = null)
        {
            return new UserPermission(name, id, state, options);
        }
    }

    public sealed class UserPermissionArgs : global::Pulumi.ResourceArgs
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
        /// ID of the user to associate the permission to.
        /// </summary>
        [Input("userId", required: true)]
        public Input<string> UserId { get; set; } = null!;

        public UserPermissionArgs()
        {
        }
        public static new UserPermissionArgs Empty => new UserPermissionArgs();
    }

    public sealed class UserPermissionState : global::Pulumi.ResourceArgs
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
        /// ID of the user to associate the permission to.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public UserPermissionState()
        {
        }
        public static new UserPermissionState Empty => new UserPermissionState();
    }
}
