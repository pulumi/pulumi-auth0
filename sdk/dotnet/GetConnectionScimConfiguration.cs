// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    public static class GetConnectionScimConfiguration
    {
        /// <summary>
        /// Data source to retrieve a SCIM configuration for an Auth0 connection by `connection_id`.
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
        ///     var myEnterpriseConnection = new Auth0.Connection("my_enterprise_connection", new()
        ///     {
        ///         Name = "my-enterprise-connection",
        ///         DisplayName = "My Enterprise Connection",
        ///         Strategy = "okta",
        ///         Options = new Auth0.Inputs.ConnectionOptionsArgs
        ///         {
        ///             ClientId = "1234567",
        ///             ClientSecret = "1234567",
        ///             Issuer = "https://example.okta.com",
        ///             JwksUri = "https://example.okta.com/oauth2/v1/keys",
        ///             TokenEndpoint = "https://example.okta.com/oauth2/v1/token",
        ///             AuthorizationEndpoint = "https://example.okta.com/oauth2/v1/authorize",
        ///         },
        ///     });
        /// 
        ///     var myConnScimConfiguration = new Auth0.ConnectionScimConfiguration("my_conn_scim_configuration", new()
        ///     {
        ///         ConnectionId = myEnterpriseConnection.Id,
        ///     });
        /// 
        ///     // A data source for an Auth0 Connection SCIM Configuration.
        ///     var myConnScimConfigurationData = Auth0.GetConnectionScimConfiguration.Invoke(new()
        ///     {
        ///         ConnectionId = myConnScimConfiguration.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetConnectionScimConfigurationResult> InvokeAsync(GetConnectionScimConfigurationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetConnectionScimConfigurationResult>("auth0:index/getConnectionScimConfiguration:getConnectionScimConfiguration", args ?? new GetConnectionScimConfigurationArgs(), options.WithDefaults());

        /// <summary>
        /// Data source to retrieve a SCIM configuration for an Auth0 connection by `connection_id`.
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
        ///     var myEnterpriseConnection = new Auth0.Connection("my_enterprise_connection", new()
        ///     {
        ///         Name = "my-enterprise-connection",
        ///         DisplayName = "My Enterprise Connection",
        ///         Strategy = "okta",
        ///         Options = new Auth0.Inputs.ConnectionOptionsArgs
        ///         {
        ///             ClientId = "1234567",
        ///             ClientSecret = "1234567",
        ///             Issuer = "https://example.okta.com",
        ///             JwksUri = "https://example.okta.com/oauth2/v1/keys",
        ///             TokenEndpoint = "https://example.okta.com/oauth2/v1/token",
        ///             AuthorizationEndpoint = "https://example.okta.com/oauth2/v1/authorize",
        ///         },
        ///     });
        /// 
        ///     var myConnScimConfiguration = new Auth0.ConnectionScimConfiguration("my_conn_scim_configuration", new()
        ///     {
        ///         ConnectionId = myEnterpriseConnection.Id,
        ///     });
        /// 
        ///     // A data source for an Auth0 Connection SCIM Configuration.
        ///     var myConnScimConfigurationData = Auth0.GetConnectionScimConfiguration.Invoke(new()
        ///     {
        ///         ConnectionId = myConnScimConfiguration.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetConnectionScimConfigurationResult> Invoke(GetConnectionScimConfigurationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetConnectionScimConfigurationResult>("auth0:index/getConnectionScimConfiguration:getConnectionScimConfiguration", args ?? new GetConnectionScimConfigurationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetConnectionScimConfigurationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the connection for this SCIM configuration.
        /// </summary>
        [Input("connectionId", required: true)]
        public string ConnectionId { get; set; } = null!;

        [Input("defaultMappings")]
        private List<Inputs.GetConnectionScimConfigurationDefaultMappingArgs>? _defaultMappings;

        /// <summary>
        /// Default mapping between Auth0 attributes and SCIM attributes for this connection type.
        /// </summary>
        public List<Inputs.GetConnectionScimConfigurationDefaultMappingArgs> DefaultMappings
        {
            get => _defaultMappings ?? (_defaultMappings = new List<Inputs.GetConnectionScimConfigurationDefaultMappingArgs>());
            set => _defaultMappings = value;
        }

        [Input("mappings")]
        private List<Inputs.GetConnectionScimConfigurationMappingArgs>? _mappings;

        /// <summary>
        /// Mapping between Auth0 attributes and SCIM attributes.
        /// </summary>
        public List<Inputs.GetConnectionScimConfigurationMappingArgs> Mappings
        {
            get => _mappings ?? (_mappings = new List<Inputs.GetConnectionScimConfigurationMappingArgs>());
            set => _mappings = value;
        }

        public GetConnectionScimConfigurationArgs()
        {
        }
        public static new GetConnectionScimConfigurationArgs Empty => new GetConnectionScimConfigurationArgs();
    }

    public sealed class GetConnectionScimConfigurationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID of the connection for this SCIM configuration.
        /// </summary>
        [Input("connectionId", required: true)]
        public Input<string> ConnectionId { get; set; } = null!;

        [Input("defaultMappings")]
        private InputList<Inputs.GetConnectionScimConfigurationDefaultMappingInputArgs>? _defaultMappings;

        /// <summary>
        /// Default mapping between Auth0 attributes and SCIM attributes for this connection type.
        /// </summary>
        public InputList<Inputs.GetConnectionScimConfigurationDefaultMappingInputArgs> DefaultMappings
        {
            get => _defaultMappings ?? (_defaultMappings = new InputList<Inputs.GetConnectionScimConfigurationDefaultMappingInputArgs>());
            set => _defaultMappings = value;
        }

        [Input("mappings")]
        private InputList<Inputs.GetConnectionScimConfigurationMappingInputArgs>? _mappings;

        /// <summary>
        /// Mapping between Auth0 attributes and SCIM attributes.
        /// </summary>
        public InputList<Inputs.GetConnectionScimConfigurationMappingInputArgs> Mappings
        {
            get => _mappings ?? (_mappings = new InputList<Inputs.GetConnectionScimConfigurationMappingInputArgs>());
            set => _mappings = value;
        }

        public GetConnectionScimConfigurationInvokeArgs()
        {
        }
        public static new GetConnectionScimConfigurationInvokeArgs Empty => new GetConnectionScimConfigurationInvokeArgs();
    }


    [OutputType]
    public sealed class GetConnectionScimConfigurationResult
    {
        /// <summary>
        /// ID of the connection for this SCIM configuration.
        /// </summary>
        public readonly string ConnectionId;
        /// <summary>
        /// Name of the connection for this SCIM configuration.
        /// </summary>
        public readonly string ConnectionName;
        /// <summary>
        /// Default mapping between Auth0 attributes and SCIM attributes for this connection type.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionScimConfigurationDefaultMappingResult> DefaultMappings;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Mapping between Auth0 attributes and SCIM attributes.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionScimConfigurationMappingResult> Mappings;
        /// <summary>
        /// Schema of the connection for this SCIM configuration.
        /// </summary>
        public readonly string Strategy;
        /// <summary>
        /// Name of the tenant for this SCIM configuration.
        /// </summary>
        public readonly string TenantName;
        /// <summary>
        /// User ID attribute for generation unique of user ids.
        /// </summary>
        public readonly string UserIdAttribute;

        [OutputConstructor]
        private GetConnectionScimConfigurationResult(
            string connectionId,

            string connectionName,

            ImmutableArray<Outputs.GetConnectionScimConfigurationDefaultMappingResult> defaultMappings,

            string id,

            ImmutableArray<Outputs.GetConnectionScimConfigurationMappingResult> mappings,

            string strategy,

            string tenantName,

            string userIdAttribute)
        {
            ConnectionId = connectionId;
            ConnectionName = connectionName;
            DefaultMappings = defaultMappings;
            Id = id;
            Mappings = mappings;
            Strategy = strategy;
            TenantName = tenantName;
            UserIdAttribute = userIdAttribute;
        }
    }
}