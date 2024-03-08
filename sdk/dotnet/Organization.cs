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
    /// The Organizations feature represents a broad update to the Auth0 platform that allows our business-to-business (B2B) customers to better manage their partners and customers, and to customize the ways that end-users access their applications. Auth0 customers can use Organizations to:
    /// 
    ///   - Represent their business customers and partners in Auth0 and manage their
    ///     membership.
    ///   - Configure branded, federated login flows for each business.
    ///   - Build administration capabilities into their products, using Organizations
    ///     APIs, so that those businesses can manage their own organizations.
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
    ///     var myOrganization = new Auth0.Organization("myOrganization", new()
    ///     {
    ///         Branding = new Auth0.Inputs.OrganizationBrandingArgs
    ///         {
    ///             Colors = 
    ///             {
    ///                 { "pageBackground", "#e1e1e1" },
    ///                 { "primary", "#f2f2f2" },
    ///             },
    ///             LogoUrl = "https://example.com/assets/icons/icon.png",
    ///         },
    ///         DisplayName = "Auth0 Inc.",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by specifying the organization ID.
    /// 
    /// # 
    /// 
    /// Example:
    /// 
    /// ```sh
    /// $ pulumi import auth0:index/organization:Organization my_organization "org_XXXXXXXXXXXXXX"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/organization:Organization")]
    public partial class Organization : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Defines how to style the login pages.
        /// </summary>
        [Output("branding")]
        public Output<Outputs.OrganizationBranding> Branding { get; private set; } = null!;

        /// <summary>
        /// Friendly name of this organization.
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Metadata associated with the organization. Maximum of 10 metadata properties allowed.
        /// </summary>
        [Output("metadata")]
        public Output<ImmutableDictionary<string, string>?> Metadata { get; private set; } = null!;

        /// <summary>
        /// The name of this organization.
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

    public sealed class OrganizationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines how to style the login pages.
        /// </summary>
        [Input("branding")]
        public Input<Inputs.OrganizationBrandingArgs>? Branding { get; set; }

        /// <summary>
        /// Friendly name of this organization.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("metadata")]
        private InputMap<string>? _metadata;

        /// <summary>
        /// Metadata associated with the organization. Maximum of 10 metadata properties allowed.
        /// </summary>
        public InputMap<string> Metadata
        {
            get => _metadata ?? (_metadata = new InputMap<string>());
            set => _metadata = value;
        }

        /// <summary>
        /// The name of this organization.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public OrganizationArgs()
        {
        }
        public static new OrganizationArgs Empty => new OrganizationArgs();
    }

    public sealed class OrganizationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines how to style the login pages.
        /// </summary>
        [Input("branding")]
        public Input<Inputs.OrganizationBrandingGetArgs>? Branding { get; set; }

        /// <summary>
        /// Friendly name of this organization.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("metadata")]
        private InputMap<string>? _metadata;

        /// <summary>
        /// Metadata associated with the organization. Maximum of 10 metadata properties allowed.
        /// </summary>
        public InputMap<string> Metadata
        {
            get => _metadata ?? (_metadata = new InputMap<string>());
            set => _metadata = value;
        }

        /// <summary>
        /// The name of this organization.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public OrganizationState()
        {
        }
        public static new OrganizationState Empty => new OrganizationState();
    }
}
