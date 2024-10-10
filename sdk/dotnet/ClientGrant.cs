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
    /// Auth0 uses various grant types, or methods by which you grant limited access to your resources to another entity without exposing credentials. The OAuth 2.0 protocol supports several types of grants, which allow different types of access. This resource allows you to create and manage client grants used with configured Auth0 clients.
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by specifying the client grant ID.
    /// 
    /// You can find this within the Management Dashboard in Application -&gt; APIs -&gt; Expand the required API.
    /// 
    /// # 
    /// 
    /// Example:
    /// 
    /// ```sh
    /// $ pulumi import auth0:index/clientGrant:ClientGrant my_client_grant "cgr_XXXXXXXXXXXXXXXX"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/clientGrant:ClientGrant")]
    public partial class ClientGrant : global::Pulumi.CustomResource
    {
        /// <summary>
        /// If enabled, any organization can be used with this grant. If disabled (default), the grant must be explicitly assigned to the desired organizations.
        /// </summary>
        [Output("allowAnyOrganization")]
        public Output<bool?> AllowAnyOrganization { get; private set; } = null!;

        /// <summary>
        /// Audience or API Identifier for this grant.
        /// </summary>
        [Output("audience")]
        public Output<string> Audience { get; private set; } = null!;

        /// <summary>
        /// ID of the client for this grant.
        /// </summary>
        [Output("clientId")]
        public Output<string> ClientId { get; private set; } = null!;

        /// <summary>
        /// Defines whether organizations can be used with client credentials exchanges for this grant. (defaults to deny when not defined)
        /// </summary>
        [Output("organizationUsage")]
        public Output<string?> OrganizationUsage { get; private set; } = null!;

        /// <summary>
        /// Permissions (scopes) included in this grant.
        /// </summary>
        [Output("scopes")]
        public Output<ImmutableArray<string>> Scopes { get; private set; } = null!;


        /// <summary>
        /// Create a ClientGrant resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ClientGrant(string name, ClientGrantArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/clientGrant:ClientGrant", name, args ?? new ClientGrantArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ClientGrant(string name, Input<string> id, ClientGrantState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/clientGrant:ClientGrant", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ClientGrant resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ClientGrant Get(string name, Input<string> id, ClientGrantState? state = null, CustomResourceOptions? options = null)
        {
            return new ClientGrant(name, id, state, options);
        }
    }

    public sealed class ClientGrantArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If enabled, any organization can be used with this grant. If disabled (default), the grant must be explicitly assigned to the desired organizations.
        /// </summary>
        [Input("allowAnyOrganization")]
        public Input<bool>? AllowAnyOrganization { get; set; }

        /// <summary>
        /// Audience or API Identifier for this grant.
        /// </summary>
        [Input("audience", required: true)]
        public Input<string> Audience { get; set; } = null!;

        /// <summary>
        /// ID of the client for this grant.
        /// </summary>
        [Input("clientId", required: true)]
        public Input<string> ClientId { get; set; } = null!;

        /// <summary>
        /// Defines whether organizations can be used with client credentials exchanges for this grant. (defaults to deny when not defined)
        /// </summary>
        [Input("organizationUsage")]
        public Input<string>? OrganizationUsage { get; set; }

        [Input("scopes", required: true)]
        private InputList<string>? _scopes;

        /// <summary>
        /// Permissions (scopes) included in this grant.
        /// </summary>
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

        public ClientGrantArgs()
        {
        }
        public static new ClientGrantArgs Empty => new ClientGrantArgs();
    }

    public sealed class ClientGrantState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If enabled, any organization can be used with this grant. If disabled (default), the grant must be explicitly assigned to the desired organizations.
        /// </summary>
        [Input("allowAnyOrganization")]
        public Input<bool>? AllowAnyOrganization { get; set; }

        /// <summary>
        /// Audience or API Identifier for this grant.
        /// </summary>
        [Input("audience")]
        public Input<string>? Audience { get; set; }

        /// <summary>
        /// ID of the client for this grant.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// Defines whether organizations can be used with client credentials exchanges for this grant. (defaults to deny when not defined)
        /// </summary>
        [Input("organizationUsage")]
        public Input<string>? OrganizationUsage { get; set; }

        [Input("scopes")]
        private InputList<string>? _scopes;

        /// <summary>
        /// Permissions (scopes) included in this grant.
        /// </summary>
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

        public ClientGrantState()
        {
        }
        public static new ClientGrantState Empty => new ClientGrantState();
    }
}
