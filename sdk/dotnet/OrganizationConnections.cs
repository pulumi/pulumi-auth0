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
    /// With this resource, you can manage enabled connections on an organization.
    /// 
    /// !&gt; This resource manages all the connections enabled for an organization. In contrast, the `auth0.OrganizationConnection`
    /// resource appends a connection to an organization. To avoid potential issues, it is recommended not to use this
    /// resource in conjunction with the `auth0.OrganizationConnection` resource when managing connections for the same
    /// organization id.
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
    ///     var myConnection_1 = new Auth0.Connection("my_connection-1", new()
    ///     {
    ///         Name = "My Connection 1",
    ///         Strategy = "auth0",
    ///     });
    /// 
    ///     var myConnection_2 = new Auth0.Connection("my_connection-2", new()
    ///     {
    ///         Name = "My Connection 2",
    ///         Strategy = "auth0",
    ///     });
    /// 
    ///     var myOrganization = new Auth0.Organization("my_organization", new()
    ///     {
    ///         Name = "my-organization",
    ///         DisplayName = "My Organization",
    ///     });
    /// 
    ///     var one_to_many = new Auth0.OrganizationConnections("one-to-many", new()
    ///     {
    ///         OrganizationId = myOrganization.Id,
    ///         EnabledConnections = new[]
    ///         {
    ///             new Auth0.Inputs.OrganizationConnectionsEnabledConnectionArgs
    ///             {
    ///                 ConnectionId = myConnection_1.Id,
    ///                 AssignMembershipOnLogin = true,
    ///             },
    ///             new Auth0.Inputs.OrganizationConnectionsEnabledConnectionArgs
    ///             {
    ///                 ConnectionId = myConnection_2.Id,
    ///                 AssignMembershipOnLogin = true,
    ///             },
    ///         },
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
    /// $ pulumi import auth0:index/organizationConnections:OrganizationConnections my_org_conns "org_XXXXX"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/organizationConnections:OrganizationConnections")]
    public partial class OrganizationConnections : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Connections that are enabled for the organization.
        /// </summary>
        [Output("enabledConnections")]
        public Output<ImmutableArray<Outputs.OrganizationConnectionsEnabledConnection>> EnabledConnections { get; private set; } = null!;

        /// <summary>
        /// ID of the organization on which to enable the connections.
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;


        /// <summary>
        /// Create a OrganizationConnections resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OrganizationConnections(string name, OrganizationConnectionsArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/organizationConnections:OrganizationConnections", name, args ?? new OrganizationConnectionsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OrganizationConnections(string name, Input<string> id, OrganizationConnectionsState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/organizationConnections:OrganizationConnections", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OrganizationConnections resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OrganizationConnections Get(string name, Input<string> id, OrganizationConnectionsState? state = null, CustomResourceOptions? options = null)
        {
            return new OrganizationConnections(name, id, state, options);
        }
    }

    public sealed class OrganizationConnectionsArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabledConnections", required: true)]
        private InputList<Inputs.OrganizationConnectionsEnabledConnectionArgs>? _enabledConnections;

        /// <summary>
        /// Connections that are enabled for the organization.
        /// </summary>
        public InputList<Inputs.OrganizationConnectionsEnabledConnectionArgs> EnabledConnections
        {
            get => _enabledConnections ?? (_enabledConnections = new InputList<Inputs.OrganizationConnectionsEnabledConnectionArgs>());
            set => _enabledConnections = value;
        }

        /// <summary>
        /// ID of the organization on which to enable the connections.
        /// </summary>
        [Input("organizationId", required: true)]
        public Input<string> OrganizationId { get; set; } = null!;

        public OrganizationConnectionsArgs()
        {
        }
        public static new OrganizationConnectionsArgs Empty => new OrganizationConnectionsArgs();
    }

    public sealed class OrganizationConnectionsState : global::Pulumi.ResourceArgs
    {
        [Input("enabledConnections")]
        private InputList<Inputs.OrganizationConnectionsEnabledConnectionGetArgs>? _enabledConnections;

        /// <summary>
        /// Connections that are enabled for the organization.
        /// </summary>
        public InputList<Inputs.OrganizationConnectionsEnabledConnectionGetArgs> EnabledConnections
        {
            get => _enabledConnections ?? (_enabledConnections = new InputList<Inputs.OrganizationConnectionsEnabledConnectionGetArgs>());
            set => _enabledConnections = value;
        }

        /// <summary>
        /// ID of the organization on which to enable the connections.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        public OrganizationConnectionsState()
        {
        }
        public static new OrganizationConnectionsState Empty => new OrganizationConnectionsState();
    }
}
