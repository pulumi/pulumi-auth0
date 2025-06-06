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
    /// With this resource, you can manage role permissions (1-many).
    /// 
    /// !&gt; This resource manages all the permissions assigned to a role. In contrast, the `auth0.RolePermission` resource only
    /// appends a permission to a role. To avoid potential issues, it is recommended not to use this resource in conjunction
    /// with the `auth0.RolePermission` resource when managing permissions for the same role id.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Auth0 = Pulumi.Auth0;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Example:
    ///     var resourceServer = new Auth0.ResourceServer("resource_server", new()
    ///     {
    ///         Name = "test",
    ///         Identifier = "test.example.com",
    ///     });
    /// 
    ///     var resourceServerScopes = new Auth0.ResourceServerScopes("resource_server_scopes", new()
    ///     {
    ///         ResourceServerIdentifier = resourceServer.Identifier,
    ///         Scopes = new[]
    ///         {
    ///             new Auth0.Inputs.ResourceServerScopesScopeArgs
    ///             {
    ///                 Name = "store:create",
    ///             },
    ///             new Auth0.Inputs.ResourceServerScopesScopeArgs
    ///             {
    ///                 Name = "store:read",
    ///             },
    ///             new Auth0.Inputs.ResourceServerScopesScopeArgs
    ///             {
    ///                 Name = "store:update",
    ///             },
    ///             new Auth0.Inputs.ResourceServerScopesScopeArgs
    ///             {
    ///                 Name = "store:delete",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var myRole = new Auth0.Role("my_role", new()
    ///     {
    ///         Name = "My Role",
    ///     });
    /// 
    ///     var myRolePerms = new Auth0.RolePermissions("my_role_perms", new()
    ///     {
    ///         Permissions = resourceServer.Identifier.Apply(identifier =&gt; ),
    ///         RoleId = myRole.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by specifying the role ID
    /// 
    /// Example:
    /// 
    /// ```sh
    /// $ pulumi import auth0:index/rolePermissions:RolePermissions all_role_permissions "rol_XXXXXXXXXXXX"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/rolePermissions:RolePermissions")]
    public partial class RolePermissions : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of API permissions granted to the role.
        /// </summary>
        [Output("permissions")]
        public Output<ImmutableArray<Outputs.RolePermissionsPermission>> Permissions { get; private set; } = null!;

        /// <summary>
        /// ID of the role to associate the permission to.
        /// </summary>
        [Output("roleId")]
        public Output<string> RoleId { get; private set; } = null!;


        /// <summary>
        /// Create a RolePermissions resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RolePermissions(string name, RolePermissionsArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/rolePermissions:RolePermissions", name, args ?? new RolePermissionsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RolePermissions(string name, Input<string> id, RolePermissionsState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/rolePermissions:RolePermissions", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RolePermissions resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RolePermissions Get(string name, Input<string> id, RolePermissionsState? state = null, CustomResourceOptions? options = null)
        {
            return new RolePermissions(name, id, state, options);
        }
    }

    public sealed class RolePermissionsArgs : global::Pulumi.ResourceArgs
    {
        [Input("permissions", required: true)]
        private InputList<Inputs.RolePermissionsPermissionArgs>? _permissions;

        /// <summary>
        /// List of API permissions granted to the role.
        /// </summary>
        public InputList<Inputs.RolePermissionsPermissionArgs> Permissions
        {
            get => _permissions ?? (_permissions = new InputList<Inputs.RolePermissionsPermissionArgs>());
            set => _permissions = value;
        }

        /// <summary>
        /// ID of the role to associate the permission to.
        /// </summary>
        [Input("roleId", required: true)]
        public Input<string> RoleId { get; set; } = null!;

        public RolePermissionsArgs()
        {
        }
        public static new RolePermissionsArgs Empty => new RolePermissionsArgs();
    }

    public sealed class RolePermissionsState : global::Pulumi.ResourceArgs
    {
        [Input("permissions")]
        private InputList<Inputs.RolePermissionsPermissionGetArgs>? _permissions;

        /// <summary>
        /// List of API permissions granted to the role.
        /// </summary>
        public InputList<Inputs.RolePermissionsPermissionGetArgs> Permissions
        {
            get => _permissions ?? (_permissions = new InputList<Inputs.RolePermissionsPermissionGetArgs>());
            set => _permissions = value;
        }

        /// <summary>
        /// ID of the role to associate the permission to.
        /// </summary>
        [Input("roleId")]
        public Input<string>? RoleId { get; set; }

        public RolePermissionsState()
        {
        }
        public static new RolePermissionsState Empty => new RolePermissionsState();
    }
}
