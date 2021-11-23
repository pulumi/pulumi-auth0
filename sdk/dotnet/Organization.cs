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
    /// The Organizations feature represents a broad update to the Auth0 platform that
    /// allows our business-to-business (B2B) customers to better manage their partners
    /// and customers, and to customize the ways that end-users access their
    /// applications. Auth0 customers can use Organizations to:
    /// 
    ///   - Represent their business customers and partners in Auth0 and manage their
    ///     membership.
    ///   - Configure branded, federated login flows for each business.
    ///   - Build administration capabilities into their products, using Organizations
    ///     APIs, so that those businesses can manage their own organizations.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Auth0 = Pulumi.Auth0;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var acme = new Auth0.Organization("acme", new Auth0.OrganizationArgs
    ///         {
    ///             DisplayName = "Acme Inc.",
    ///             Branding = new Auth0.Inputs.OrganizationBrandingArgs
    ///             {
    ///                 LogoUrl = "https://acme.com/logo.svg",
    ///                 Colors = 
    ///                 {
    ///                     { "primary", "#e3e2f0" },
    ///                     { "page_background", "#e3e2ff" },
    ///                 },
    ///             },
    ///             Connections = 
    ///             {
    ///                 new Auth0.Inputs.OrganizationConnectionArgs
    ///                 {
    ///                     ConnectionId = auth0_connection.Acme.Id,
    ///                     AssignMembershipOnLogin = true,
    ///                 },
    ///             },
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/organization:Organization")]
    public partial class Organization : Pulumi.CustomResource
    {
        /// <summary>
        /// Defines how to style the login pages. For details, see
        /// Branding
        /// </summary>
        [Output("branding")]
        public Output<Outputs.OrganizationBranding> Branding { get; private set; } = null!;

        /// <summary>
        /// Connections assigned to the organization. For
        /// details, see Connections
        /// </summary>
        [Output("connections")]
        public Output<ImmutableArray<Outputs.OrganizationConnection>> Connections { get; private set; } = null!;

        /// <summary>
        /// Friendly name of this organization
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Metadata associated with the organization, Maximum of
        /// 10 metadata properties allowed
        /// </summary>
        [Output("metadata")]
        public Output<ImmutableDictionary<string, string>?> Metadata { get; private set; } = null!;

        /// <summary>
        /// The name of this organization
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a Organization resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Organization(string name, OrganizationArgs? args = null, CustomResourceOptions? options = null)
            : base("auth0:index/organization:Organization", name, args ?? new OrganizationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Organization(string name, Input<string> id, OrganizationState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/organization:Organization", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Organization resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Organization Get(string name, Input<string> id, OrganizationState? state = null, CustomResourceOptions? options = null)
        {
            return new Organization(name, id, state, options);
        }
    }

    public sealed class OrganizationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines how to style the login pages. For details, see
        /// Branding
        /// </summary>
        [Input("branding")]
        public Input<Inputs.OrganizationBrandingArgs>? Branding { get; set; }

        [Input("connections")]
        private InputList<Inputs.OrganizationConnectionArgs>? _connections;

        /// <summary>
        /// Connections assigned to the organization. For
        /// details, see Connections
        /// </summary>
        public InputList<Inputs.OrganizationConnectionArgs> Connections
        {
            get => _connections ?? (_connections = new InputList<Inputs.OrganizationConnectionArgs>());
            set => _connections = value;
        }

        /// <summary>
        /// Friendly name of this organization
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("metadata")]
        private InputMap<string>? _metadata;

        /// <summary>
        /// Metadata associated with the organization, Maximum of
        /// 10 metadata properties allowed
        /// </summary>
        public InputMap<string> Metadata
        {
            get => _metadata ?? (_metadata = new InputMap<string>());
            set => _metadata = value;
        }

        /// <summary>
        /// The name of this organization
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public OrganizationArgs()
        {
        }
    }

    public sealed class OrganizationState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines how to style the login pages. For details, see
        /// Branding
        /// </summary>
        [Input("branding")]
        public Input<Inputs.OrganizationBrandingGetArgs>? Branding { get; set; }

        [Input("connections")]
        private InputList<Inputs.OrganizationConnectionGetArgs>? _connections;

        /// <summary>
        /// Connections assigned to the organization. For
        /// details, see Connections
        /// </summary>
        public InputList<Inputs.OrganizationConnectionGetArgs> Connections
        {
            get => _connections ?? (_connections = new InputList<Inputs.OrganizationConnectionGetArgs>());
            set => _connections = value;
        }

        /// <summary>
        /// Friendly name of this organization
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("metadata")]
        private InputMap<string>? _metadata;

        /// <summary>
        /// Metadata associated with the organization, Maximum of
        /// 10 metadata properties allowed
        /// </summary>
        public InputMap<string> Metadata
        {
            get => _metadata ?? (_metadata = new InputMap<string>());
            set => _metadata = value;
        }

        /// <summary>
        /// The name of this organization
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public OrganizationState()
        {
        }
    }
}
