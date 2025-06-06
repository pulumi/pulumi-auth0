// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Outputs
{

    [OutputType]
    public sealed class GetClientsClientResult
    {
        /// <summary>
        /// List of applications ID's that will be allowed to make delegation request. By default, all applications will be allowed.
        /// </summary>
        public readonly ImmutableArray<string> AllowedClients;
        /// <summary>
        /// URLs that Auth0 may redirect to after logout.
        /// </summary>
        public readonly ImmutableArray<string> AllowedLogoutUrls;
        /// <summary>
        /// URLs that represent valid origins for cross-origin resource sharing. By default, all your callback URLs will be allowed.
        /// </summary>
        public readonly ImmutableArray<string> AllowedOrigins;
        /// <summary>
        /// Type of application the client represents. Possible values are: `native`, `spa`, `regular_web`, `non_interactive`, `sso_integration`. Specific SSO integrations types accepted as well are: `rms`, `box`, `cloudbees`, `concur`, `dropbox`, `mscrm`, `echosign`, `egnyte`, `newrelic`, `office365`, `salesforce`, `sentry`, `sharepoint`, `slack`, `springcm`, `zendesk`, `zoom`.
        /// </summary>
        public readonly string AppType;
        /// <summary>
        /// URLs that Auth0 may call back to after a user authenticates for the client. Make sure to specify the protocol (https://) otherwise the callback may fail in some cases. With the exception of custom URI schemes for native clients, all callbacks should use protocol https://.
        /// </summary>
        public readonly ImmutableArray<string> Callbacks;
        /// <summary>
        /// The ID of the client. If not provided, `name` must be set.
        /// </summary>
        public readonly string? ClientId;
        /// <summary>
        /// Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?"/\()&lt;&gt;@ [Tab] [Space]`.
        /// </summary>
        public readonly ImmutableDictionary<string, string> ClientMetadata;
        public readonly string ClientSecret;
        /// <summary>
        /// Description of the purpose of the client.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Types of grants that this client is authorized to use.
        /// </summary>
        public readonly ImmutableArray<string> GrantTypes;
        /// <summary>
        /// Indicates whether this client is a first-party client.Defaults to true from the API
        /// </summary>
        public readonly bool IsFirstParty;
        /// <summary>
        /// Indicates whether the token endpoint IP header is trusted. Requires the authentication method to be set to `client_secret_post` or `client_secret_basic`. Setting this property when creating the resource, will default the authentication method to `client_secret_post`. To change the authentication method to `client_secret_basic` use the `auth0.ClientCredentials` resource.
        /// </summary>
        public readonly bool IsTokenEndpointIpHeaderTrusted;
        /// <summary>
        /// The name of the client. If not provided, `client_id` must be set.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Configure OIDC logout for the Client
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClientsClientOidcLogoutResult> OidcLogouts;
        public readonly ImmutableArray<Outputs.GetClientsClientSessionTransferResult> SessionTransfers;
        /// <summary>
        /// Allows configuration for token exchange
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClientsClientTokenExchangeResult> TokenExchanges;
        /// <summary>
        /// The token quota configuration.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClientsClientTokenQuotaResult> TokenQuotas;
        /// <summary>
        /// URLs that represent valid web origins for use with web message response mode.
        /// </summary>
        public readonly ImmutableArray<string> WebOrigins;

        [OutputConstructor]
        private GetClientsClientResult(
            ImmutableArray<string> allowedClients,

            ImmutableArray<string> allowedLogoutUrls,

            ImmutableArray<string> allowedOrigins,

            string appType,

            ImmutableArray<string> callbacks,

            string? clientId,

            ImmutableDictionary<string, string> clientMetadata,

            string clientSecret,

            string description,

            ImmutableArray<string> grantTypes,

            bool isFirstParty,

            bool isTokenEndpointIpHeaderTrusted,

            string? name,

            ImmutableArray<Outputs.GetClientsClientOidcLogoutResult> oidcLogouts,

            ImmutableArray<Outputs.GetClientsClientSessionTransferResult> sessionTransfers,

            ImmutableArray<Outputs.GetClientsClientTokenExchangeResult> tokenExchanges,

            ImmutableArray<Outputs.GetClientsClientTokenQuotaResult> tokenQuotas,

            ImmutableArray<string> webOrigins)
        {
            AllowedClients = allowedClients;
            AllowedLogoutUrls = allowedLogoutUrls;
            AllowedOrigins = allowedOrigins;
            AppType = appType;
            Callbacks = callbacks;
            ClientId = clientId;
            ClientMetadata = clientMetadata;
            ClientSecret = clientSecret;
            Description = description;
            GrantTypes = grantTypes;
            IsFirstParty = isFirstParty;
            IsTokenEndpointIpHeaderTrusted = isTokenEndpointIpHeaderTrusted;
            Name = name;
            OidcLogouts = oidcLogouts;
            SessionTransfers = sessionTransfers;
            TokenExchanges = tokenExchanges;
            TokenQuotas = tokenQuotas;
            WebOrigins = webOrigins;
        }
    }
}
