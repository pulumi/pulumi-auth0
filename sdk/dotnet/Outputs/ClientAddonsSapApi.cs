// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Outputs
{

    [OutputType]
    public sealed class ClientAddonsSapApi
    {
        /// <summary>
        /// If activated in the OAuth 2.0 client configuration (transaction `SOAUTH2) the SAML attribute`client*id`must be set and equal the`client*id` form parameter of the access token request.
        /// </summary>
        public readonly string? ClientId;
        /// <summary>
        /// NameID element of the Subject which can be used to express the user's identity. Defaults to `urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified`.
        /// </summary>
        public readonly string? NameIdentifierFormat;
        /// <summary>
        /// Requested scope for SAP APIs.
        /// </summary>
        public readonly string? Scope;
        /// <summary>
        /// Service account password to use to authenticate API calls to the token endpoint.
        /// </summary>
        public readonly string? ServicePassword;
        /// <summary>
        /// The OAuth2 token endpoint URL of your SAP OData server.
        /// </summary>
        public readonly string? TokenEndpointUrl;
        /// <summary>
        /// Name of the property in the user object that maps to a SAP username, for example `email`.
        /// </summary>
        public readonly string? UsernameAttribute;

        [OutputConstructor]
        private ClientAddonsSapApi(
            string? clientId,

            string? nameIdentifierFormat,

            string? scope,

            string? servicePassword,

            string? tokenEndpointUrl,

            string? usernameAttribute)
        {
            ClientId = clientId;
            NameIdentifierFormat = nameIdentifierFormat;
            Scope = scope;
            ServicePassword = servicePassword;
            TokenEndpointUrl = tokenEndpointUrl;
            UsernameAttribute = usernameAttribute;
        }
    }
}
