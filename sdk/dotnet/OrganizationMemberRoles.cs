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
    /// This resource is used to manage the roles assigned to an organization member.
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
    ///     var reader = new Auth0.Role("reader");
    /// 
    ///     var writer = new Auth0.Role("writer");
    /// 
    ///     var user = new Auth0.User("user", new()
    ///     {
    ///         ConnectionName = "Username-Password-Authentication",
    ///         Email = "test-user@auth0.com",
    ///         Password = "MyPass123$",
    ///     });
    /// 
    ///     var myOrg = new Auth0.Organization("myOrg", new()
    ///     {
    ///         DisplayName = "Some Org",
    ///     });
    /// 
    ///     var myOrgMember = new Auth0.OrganizationMember("myOrgMember", new()
    ///     {
    ///         OrganizationId = myOrg.Id,
    ///         UserId = user.Id,
    ///     });
    /// 
    ///     var myOrgMemberRoles = new Auth0.OrganizationMemberRoles("myOrgMemberRoles", new()
    ///     {
    ///         OrganizationId = myOrg.Id,
    ///         UserId = user.Id,
    ///         Roles = new[]
    ///         {
    ///             reader.Id,
    ///             writer.Id,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by specifying the organization ID and user ID separated by ":". # Example
    /// 
    /// ```sh
    ///  $ pulumi import auth0:index/organizationMemberRoles:OrganizationMemberRoles my_org_member_roles "org_XXXXX:auth0|XXXXX"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/organizationMemberRoles:OrganizationMemberRoles")]
    public partial class OrganizationMemberRoles : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the organization.
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// The role ID(s) to assign to the organization member.
        /// </summary>
        [Output("roles")]
        public Output<ImmutableArray<string>> Roles { get; private set; } = null!;

        /// <summary>
        /// The user ID of the organization member.
        /// </summary>
        [Output("userId")]
        public Output<string> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a OrganizationMemberRoles resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OrganizationMemberRoles(string name, OrganizationMemberRolesArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/organizationMemberRoles:OrganizationMemberRoles", name, args ?? new OrganizationMemberRolesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OrganizationMemberRoles(string name, Input<string> id, OrganizationMemberRolesState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/organizationMemberRoles:OrganizationMemberRoles", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OrganizationMemberRoles resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OrganizationMemberRoles Get(string name, Input<string> id, OrganizationMemberRolesState? state = null, CustomResourceOptions? options = null)
        {
            return new OrganizationMemberRoles(name, id, state, options);
        }
    }

    public sealed class OrganizationMemberRolesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the organization.
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        [Input("roles", required: true)]
        private InputList<string>? _roles;

        /// <summary>
        /// The role ID(s) to assign to the organization member.
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        /// <summary>
        /// The user ID of the organization member.
        /// </summary>
        [Input("userId", required: true)]
        public Input<string> UserId { get; set; } = null!;

        public OrganizationMemberRolesArgs()
        {
        }
        public static new OrganizationMemberRolesArgs Empty => new OrganizationMemberRolesArgs();
    }

    public sealed class OrganizationMemberRolesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the organization.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        [Input("roles")]
        private InputList<string>? _roles;

        /// <summary>
        /// The role ID(s) to assign to the organization member.
        /// </summary>
        public InputList<string> Roles
        {
            get => _roles ?? (_roles = new InputList<string>());
            set => _roles = value;
        }

        /// <summary>
        /// The user ID of the organization member.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public OrganizationMemberRolesState()
        {
        }
        public static new OrganizationMemberRolesState Empty => new OrganizationMemberRolesState();
    }
}