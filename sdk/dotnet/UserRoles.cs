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
    /// With this resource, you can manage assigned roles for a user.
    /// 
    /// !&gt; This resource manages all the roles assigned to a user. In contrast, the `auth0.UserRole` resource only appends a
    /// role to a user. To avoid potential issues, it is recommended not to use this resource in conjunction with the
    /// `auth0.UserRole` resource when managing roles for the same user id.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Auth0 = Pulumi.Auth0;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // Example:
    ///     var admin = new Auth0.Role("admin", new()
    ///     {
    ///         Name = "admin",
    ///         Description = "Administrator",
    ///     });
    /// 
    ///     var user = new Auth0.User("user", new()
    ///     {
    ///         ConnectionName = "Username-Password-Authentication",
    ///         Username = "unique_username",
    ///         Name = "Firstname Lastname",
    ///         Email = "test@test.com",
    ///         Password = "passpass$12$12",
    ///     });
    /// 
    ///     var userRoles = new Auth0.UserRoles("user_roles", new()
    ///     {
    ///         UserId = user.Id,
    ///         Roles = new[]
    ///         {
    ///             admin.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// This resource can be imported using the user ID.
    /// 
    /// # 
    /// 
    /// Example:
    /// 
    /// ```sh
    /// $ pulumi import auth0:index/userRoles:UserRoles user_roles "auth0|111111111111111111111111"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/userRoles:UserRoles")]
    public partial class UserRoles : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Set of IDs of roles assigned to the user.
        /// </summary>
        [Output("roles")]
        public Output<ImmutableArray<string>> Roles { get; private set; } = null!;

        /// <summary>
        /// ID of the user.
        /// </summary>
        [Output("userId")]
        public Output<string> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a UserRoles resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserRoles(string name, UserRolesArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/userRoles:UserRoles", name, args ?? new UserRolesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserRoles(string name, Input<string> id, UserRolesState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/userRoles:UserRoles", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UserRoles resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserRoles Get(string name, Input<string> id, UserRolesState? state = null, CustomResourceOptions? options = null)
        {
            return new UserRoles(name, id, state, options);
        }
    }

    public sealed class UserRolesArgs : global::Pulumi.ResourceArgs
    {
        [Input("roles", required: true)]
        private InputList<string>? _roles;

        /// <summary>
        /// Set of IDs of roles assigned to the user.
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        /// <summary>
        /// ID of the user.
        /// </summary>
        [Input("userId", required: true)]
        public Input<string> UserId { get; set; } = null!;

        public UserRolesArgs()
        {
        }
        public static new UserRolesArgs Empty => new UserRolesArgs();
    }

    public sealed class UserRolesState : global::Pulumi.ResourceArgs
    {
        [Input("roles")]
        private InputList<string>? _roles;

        /// <summary>
        /// Set of IDs of roles assigned to the user.
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        /// <summary>
        /// ID of the user.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public UserRolesState()
        {
        }
        public static new UserRolesState Empty => new UserRolesState();
    }
}
