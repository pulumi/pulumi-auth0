// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientAddonsSapApiGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If activated in the OAuth 2.0 client configuration (transaction `SOAUTH2) the SAML attribute`client*id`must be set and equal the`client*id` form parameter of the access token request.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// NameID element of the Subject which can be used to express the user's identity. Defaults to `urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified`.
        /// </summary>
        [Input("nameIdentifierFormat")]
        public Input<string>? NameIdentifierFormat { get; set; }

        /// <summary>
        /// Requested scope for SAP APIs.
        /// </summary>
        [Input("scope")]
        public Input<string>? Scope { get; set; }

        [Input("servicePassword")]
        private Input<string>? _servicePassword;

        /// <summary>
        /// Service account password to use to authenticate API calls to the token endpoint.
        /// </summary>
        public Input<string>? ServicePassword
        {
            get => _servicePassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _servicePassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The OAuth2 token endpoint URL of your SAP OData server.
        /// </summary>
        [Input("tokenEndpointUrl")]
        public Input<string>? TokenEndpointUrl { get; set; }

        /// <summary>
        /// Name of the property in the user object that maps to a SAP username, for example `email`.
        /// </summary>
        [Input("usernameAttribute")]
        public Input<string>? UsernameAttribute { get; set; }

        public ClientAddonsSapApiGetArgs()
        {
        }
        public static new ClientAddonsSapApiGetArgs Empty => new ClientAddonsSapApiGetArgs();
    }
}
