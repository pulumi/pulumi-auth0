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
    /// This resource is used to manage the assignment of members and their roles within an organization.
    /// 
    /// !&gt; This resource appends a member to an organization. In contrast, the `auth0.OrganizationMembers` resource manages
    /// all the members assigned to an organization. To avoid potential issues, it is recommended not to use this resource in
    /// conjunction with the `auth0.OrganizationMembers` resource when managing members for the same organization id.
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
    ///     var user = new Auth0.User("user", new()
    ///     {
    ///         Email = "test-user@auth0.com",
    ///         ConnectionName = "Username-Password-Authentication",
    ///         EmailVerified = true,
    ///         Password = "MyPass123$",
    ///     });
    /// 
    ///     var myOrg = new Auth0.Organization("my_org", new()
    ///     {
    ///         Name = "org-admin",
    ///         DisplayName = "Admin",
    ///     });
    /// 
    ///     var myOrgMember = new Auth0.OrganizationMember("my_org_member", new()
    ///     {
    ///         OrganizationId = myOrg.Id,
    ///         UserId = user.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by specifying the
    /// 
    /// organization ID and user ID separated by "::" (note the double colon)
    /// 
    /// &lt;organizationID&gt;::&lt;userID&gt;
    /// 
    /// Example:
    /// 
    /// ```sh
    /// $ pulumi import auth0:index/organizationMember:OrganizationMember my_org_member "org_XXXXX::auth0|XXXXX"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/organizationMember:OrganizationMember")]
    public partial class OrganizationMember : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the organization to assign the member to.
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// ID of the user to add as an organization member.
        /// </summary>
        [Output("userId")]
        public Output<string> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a OrganizationMember resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OrganizationMember(string name, OrganizationMemberArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/organizationMember:OrganizationMember", name, args ?? new OrganizationMemberArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OrganizationMember(string name, Input<string> id, OrganizationMemberState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/organizationMember:OrganizationMember", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OrganizationMember resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OrganizationMember Get(string name, Input<string> id, OrganizationMemberState? state = null, CustomResourceOptions? options = null)
        {
            return new OrganizationMember(name, id, state, options);
        }
    }

    public sealed class OrganizationMemberArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the organization to assign the member to.
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        /// <summary>
        /// ID of the user to add as an organization member.
        /// </summary>
        [Input("userId", required: true)]
        public Input<string> UserId { get; set; } = null!;

        public OrganizationMemberArgs()
        {
        }
        public static new OrganizationMemberArgs Empty => new OrganizationMemberArgs();
    }

    public sealed class OrganizationMemberState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the organization to assign the member to.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// ID of the user to add as an organization member.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public OrganizationMemberState()
        {
        }
        public static new OrganizationMemberState Empty => new OrganizationMemberState();
    }
}
