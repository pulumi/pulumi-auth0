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
    /// With this resource, you can created and manage collections of permissions that can be assigned to users, which are otherwise known as roles. Permissions (scopes) are created on auth0_resource_server, then associated with roles and optionally, users using this resource.
    /// </summary>
    public partial class Role : Pulumi.CustomResource
    {
        /// <summary>
        /// String. Description of the role.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// String. Name for this role.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Set(Resource). Configuration settings for permissions (scopes) attached to the role. For details, see Permissions.
        /// </summary>
        [Output("permissions")]
        public Output<ImmutableArray<Outputs.RolePermission>> Permissions { get; private set; } = null!;


        /// <summary>
        /// Create a Role resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Role(string name, RoleArgs? args = null, CustomResourceOptions? options = null)
            : base("auth0:index/role:Role", name, args ?? new RoleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Role(string name, Input<string> id, RoleState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/role:Role", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Role resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Role Get(string name, Input<string> id, RoleState? state = null, CustomResourceOptions? options = null)
        {
            return new Role(name, id, state, options);
        }
    }

    public sealed class RoleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// String. Description of the role.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// String. Name for this role.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("permissions")]
        private InputList<Inputs.RolePermissionArgs>? _permissions;

        /// <summary>
        /// Set(Resource). Configuration settings for permissions (scopes) attached to the role. For details, see Permissions.
        /// </summary>
        public InputList<Inputs.RolePermissionArgs> Permissions
        {
            get => _permissions ?? (_permissions = new InputList<Inputs.RolePermissionArgs>());
            set => _permissions = value;
        }

        public RoleArgs()
        {
            Description = "Managed by Pulumi";
        }
    }

    public sealed class RoleState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// String. Description of the role.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// String. Name for this role.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("permissions")]
        private InputList<Inputs.RolePermissionGetArgs>? _permissions;

        /// <summary>
        /// Set(Resource). Configuration settings for permissions (scopes) attached to the role. For details, see Permissions.
        /// </summary>
        public InputList<Inputs.RolePermissionGetArgs> Permissions
        {
            get => _permissions ?? (_permissions = new InputList<Inputs.RolePermissionGetArgs>());
            set => _permissions = value;
        }

        public RoleState()
        {
            Description = "Managed by Pulumi";
        }
    }
}
