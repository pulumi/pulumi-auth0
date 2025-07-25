// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ADFS URL where to fetch the metadata source.
        /// </summary>
        [Input("adfsServer")]
        public Input<string>? AdfsServer { get; set; }

        [Input("allowedAudiences")]
        private InputList<string>? _allowedAudiences;

        /// <summary>
        /// List of allowed audiences.
        /// </summary>
        public InputList<string> AllowedAudiences
        {
            get => _allowedAudiences ?? (_allowedAudiences = new InputList<string>());
            set => _allowedAudiences = value;
        }

        /// <summary>
        /// Enable API Access to users.
        /// </summary>
        [Input("apiEnableUsers")]
        public Input<bool>? ApiEnableUsers { get; set; }

        /// <summary>
        /// App ID.
        /// </summary>
        [Input("appId")]
        public Input<string>? AppId { get; set; }

        /// <summary>
        /// OpenID Connect and Okta Workforce connections can automatically map claims received from the identity provider (IdP). You can configure this mapping through a library template provided by Auth0 or by entering your own template directly. Click [here](https://auth0.com/docs/authenticate/identity-providers/enterprise-identity-providers/configure-pkce-claim-mapping-for-oidc#map-claims-for-oidc-connections) for more info.
        /// </summary>
        [Input("attributeMap")]
        public Input<Inputs.ConnectionOptionsAttributeMapGetArgs>? AttributeMap { get; set; }

        [Input("attributes")]
        private InputList<Inputs.ConnectionOptionsAttributeGetArgs>? _attributes;

        /// <summary>
        /// Order of attributes for precedence in identification.Valid values: email, phone*number, username. If Precedence is set, it must contain all values (email, phone*number, username) in specific order
        /// </summary>
        public InputList<Inputs.ConnectionOptionsAttributeGetArgs> Attributes
        {
            get => _attributes ?? (_attributes = new InputList<Inputs.ConnectionOptionsAttributeGetArgs>());
            set => _attributes = value;
        }

        [Input("authParams")]
        private InputMap<string>? _authParams;

        /// <summary>
        /// Query string parameters to be included as part of the generated passwordless email link.
        /// </summary>
        public InputMap<string> AuthParams
        {
            get => _authParams ?? (_authParams = new InputMap<string>());
            set => _authParams = value;
        }

        [Input("authenticationMethods")]
        private InputList<Inputs.ConnectionOptionsAuthenticationMethodGetArgs>? _authenticationMethods;

        /// <summary>
        /// Specifies the authentication methods and their configuration (enabled or disabled)
        /// </summary>
        public InputList<Inputs.ConnectionOptionsAuthenticationMethodGetArgs> AuthenticationMethods
        {
            get => _authenticationMethods ?? (_authenticationMethods = new InputList<Inputs.ConnectionOptionsAuthenticationMethodGetArgs>());
            set => _authenticationMethods = value;
        }

        /// <summary>
        /// Authorization endpoint.
        /// </summary>
        [Input("authorizationEndpoint")]
        public Input<string>? AuthorizationEndpoint { get; set; }

        /// <summary>
        /// Indicates whether to enable brute force protection, which will limit the number of signups and failed logins from a suspicious IP address.
        /// </summary>
        [Input("bruteForceProtection")]
        public Input<bool>? BruteForceProtection { get; set; }

        /// <summary>
        /// The strategy's client ID.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        [Input("clientSecret")]
        private Input<string>? _clientSecret;

        /// <summary>
        /// The strategy's client secret.
        /// </summary>
        public Input<string>? ClientSecret
        {
            get => _clientSecret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clientSecret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Salesforce community base URL.
        /// </summary>
        [Input("communityBaseUrl")]
        public Input<string>? CommunityBaseUrl { get; set; }

        [Input("configuration")]
        private InputMap<string>? _configuration;

        /// <summary>
        /// A case-sensitive map of key value pairs used as configuration variables for the `custom_script`.
        /// </summary>
        public InputMap<string> Configuration
        {
            get => _configuration ?? (_configuration = new InputMap<string>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, string>());
                _configuration = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// Proof Key for Code Exchange (PKCE) configuration settings for an OIDC or Okta Workforce connection.
        /// </summary>
        [Input("connectionSettings")]
        public Input<Inputs.ConnectionOptionsConnectionSettingsGetArgs>? ConnectionSettings { get; set; }

        [Input("customHeaders")]
        private InputList<Inputs.ConnectionOptionsCustomHeaderGetArgs>? _customHeaders;

        /// <summary>
        /// Configure extra headers to the Token endpoint of an OAuth 2.0 provider
        /// </summary>
        public InputList<Inputs.ConnectionOptionsCustomHeaderGetArgs> CustomHeaders
        {
            get => _customHeaders ?? (_customHeaders = new InputList<Inputs.ConnectionOptionsCustomHeaderGetArgs>());
            set => _customHeaders = value;
        }

        [Input("customScripts")]
        private InputMap<string>? _customScripts;

        /// <summary>
        /// A map of scripts used to integrate with a custom database.
        /// </summary>
        public InputMap<string> CustomScripts
        {
            get => _customScripts ?? (_customScripts = new InputMap<string>());
            set => _customScripts = value;
        }

        /// <summary>
        /// When enabled, additional debug information will be generated.
        /// </summary>
        [Input("debug")]
        public Input<bool>? Debug { get; set; }

        /// <summary>
        /// The key used to decrypt encrypted responses from the connection. Uses the `key` and `cert` properties to provide the private key and certificate respectively.
        /// </summary>
        [Input("decryptionKey")]
        public Input<Inputs.ConnectionOptionsDecryptionKeyGetArgs>? DecryptionKey { get; set; }

        /// <summary>
        /// Sign Request Algorithm Digest.
        /// </summary>
        [Input("digestAlgorithm")]
        public Input<string>? DigestAlgorithm { get; set; }

        /// <summary>
        /// Indicates whether to disable the cache or not.
        /// </summary>
        [Input("disableCache")]
        public Input<bool>? DisableCache { get; set; }

        /// <summary>
        /// Indicates whether to remove the forgot password link within the New Universal Login.
        /// </summary>
        [Input("disableSelfServiceChangePassword")]
        public Input<bool>? DisableSelfServiceChangePassword { get; set; }

        /// <summary>
        /// When enabled, will disable sign out.
        /// </summary>
        [Input("disableSignOut")]
        public Input<bool>? DisableSignOut { get; set; }

        /// <summary>
        /// Indicates whether to allow user sign-ups to your application.
        /// </summary>
        [Input("disableSignup")]
        public Input<bool>? DisableSignup { get; set; }

        /// <summary>
        /// OpenID discovery URL, e.g. `https://auth.example.com/.well-known/openid-configuration`.
        /// </summary>
        [Input("discoveryUrl")]
        public Input<string>? DiscoveryUrl { get; set; }

        /// <summary>
        /// Domain name.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        [Input("domainAliases")]
        private InputList<string>? _domainAliases;

        /// <summary>
        /// List of the domains that can be authenticated using the identity provider. Only needed for Identifier First authentication flows.
        /// </summary>
        public InputList<string> DomainAliases
        {
            get => _domainAliases ?? (_domainAliases = new InputList<string>());
            set => _domainAliases = value;
        }

        /// <summary>
        /// Set to `true` to inject context into custom DB scripts (warning: cannot be disabled once enabled).
        /// </summary>
        [Input("enableScriptContext")]
        public Input<bool>? EnableScriptContext { get; set; }

        /// <summary>
        /// Set to `true` to use a legacy user store.
        /// </summary>
        [Input("enabledDatabaseCustomization")]
        public Input<bool>? EnabledDatabaseCustomization { get; set; }

        /// <summary>
        /// Custom Entity ID for the connection.
        /// </summary>
        [Input("entityId")]
        public Input<string>? EntityId { get; set; }

        /// <summary>
        /// Federation Metadata for the ADFS connection.
        /// </summary>
        [Input("fedMetadataXml")]
        public Input<string>? FedMetadataXml { get; set; }

        /// <summary>
        /// If you're configuring a SAML enterprise connection for a non-standard PingFederate Server, you must update the attribute mappings.
        /// </summary>
        [Input("fieldsMap")]
        public Input<string>? FieldsMap { get; set; }

        /// <summary>
        /// Specifies whether or not request info should be forwarded to sms gateway.
        /// </summary>
        [Input("forwardRequestInfo")]
        public Input<bool>? ForwardRequestInfo { get; set; }

        /// <summary>
        /// Address to use as the sender.
        /// </summary>
        [Input("from")]
        public Input<string>? From { get; set; }

        /// <summary>
        /// Defines the parameters used to generate the auth token for the custom gateway.
        /// </summary>
        [Input("gatewayAuthentication")]
        public Input<Inputs.ConnectionOptionsGatewayAuthenticationGetArgs>? GatewayAuthentication { get; set; }

        /// <summary>
        /// Defines a custom sms gateway to use instead of Twilio.
        /// </summary>
        [Input("gatewayUrl")]
        public Input<string>? GatewayUrl { get; set; }

        /// <summary>
        /// Specifies the issuer of the JWT used for global token revocation for the SAML connection.
        /// </summary>
        [Input("globalTokenRevocationJwtIss")]
        public Input<string>? GlobalTokenRevocationJwtIss { get; set; }

        /// <summary>
        /// Specifies the subject of the JWT used for global token revocation for the SAML connection.
        /// </summary>
        [Input("globalTokenRevocationJwtSub")]
        public Input<string>? GlobalTokenRevocationJwtSub { get; set; }

        /// <summary>
        /// Icon URL.
        /// </summary>
        [Input("iconUrl")]
        public Input<string>? IconUrl { get; set; }

        /// <summary>
        /// Azure AD Identity API. Available options are: `microsoft-identity-platform-v2.0` or `azure-active-directory-v1.0`.
        /// </summary>
        [Input("identityApi")]
        public Input<string>? IdentityApi { get; set; }

        /// <summary>
        /// Configuration options for IDP Initiated Authentication. This is an object with the properties: `client_id`, `client_protocol`, and `client_authorize_query`.
        /// </summary>
        [Input("idpInitiated")]
        public Input<Inputs.ConnectionOptionsIdpInitiatedGetArgs>? IdpInitiated { get; set; }

        /// <summary>
        /// Indicates whether you have a legacy user store and want to gradually migrate those users to the Auth0 user store.
        /// </summary>
        [Input("importMode")]
        public Input<bool>? ImportMode { get; set; }

        [Input("ips")]
        private InputList<string>? _ips;

        /// <summary>
        /// A list of IPs.
        /// </summary>
        public InputList<string> Ips
        {
            get => _ips ?? (_ips = new InputList<string>());
            set => _ips = value;
        }

        /// <summary>
        /// Issuer URL, e.g. `https://auth.example.com`.
        /// </summary>
        [Input("issuer")]
        public Input<string>? Issuer { get; set; }

        /// <summary>
        /// JWKS URI.
        /// </summary>
        [Input("jwksUri")]
        public Input<string>? JwksUri { get; set; }

        /// <summary>
        /// Apple Key ID.
        /// </summary>
        [Input("keyId")]
        public Input<string>? KeyId { get; set; }

        /// <summary>
        /// By default Auth0 maps `user_id` to `email`. Enabling this setting changes the behavior to map `user_id` to 'id' instead. This can only be defined on a new Google Workspace connection and can not be changed once set.
        /// </summary>
        [Input("mapUserIdToId")]
        public Input<bool>? MapUserIdToId { get; set; }

        /// <summary>
        /// Maximum number of groups to retrieve.
        /// </summary>
        [Input("maxGroupsToRetrieve")]
        public Input<string>? MaxGroupsToRetrieve { get; set; }

        /// <summary>
        /// SID for Copilot. Used when SMS Source is Copilot.
        /// </summary>
        [Input("messagingServiceSid")]
        public Input<string>? MessagingServiceSid { get; set; }

        /// <summary>
        /// The URL of the SAML metadata document.
        /// </summary>
        [Input("metadataUrl")]
        public Input<string>? MetadataUrl { get; set; }

        /// <summary>
        /// The XML content for the SAML metadata document. Values within the xml will take precedence over other attributes set on the options block.
        /// </summary>
        [Input("metadataXml")]
        public Input<string>? MetadataXml { get; set; }

        /// <summary>
        /// Configuration options for multifactor authentication.
        /// </summary>
        [Input("mfa")]
        public Input<Inputs.ConnectionOptionsMfaGetArgs>? Mfa { get; set; }

        /// <summary>
        /// The public name of the email or SMS Connection. In most cases this is the same name as the connection name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nonPersistentAttrs")]
        private InputList<string>? _nonPersistentAttrs;

        /// <summary>
        /// If there are user fields that should not be stored in Auth0 databases due to privacy reasons, you can add them to the DenyList here.
        /// </summary>
        public InputList<string> NonPersistentAttrs
        {
            get => _nonPersistentAttrs ?? (_nonPersistentAttrs = new InputList<string>());
            set => _nonPersistentAttrs = value;
        }

        /// <summary>
        /// Defines options for the passkey authentication method
        /// </summary>
        [Input("passkeyOptions")]
        public Input<Inputs.ConnectionOptionsPasskeyOptionsGetArgs>? PasskeyOptions { get; set; }

        /// <summary>
        /// Configuration settings for password complexity.
        /// </summary>
        [Input("passwordComplexityOptions")]
        public Input<Inputs.ConnectionOptionsPasswordComplexityOptionsGetArgs>? PasswordComplexityOptions { get; set; }

        /// <summary>
        /// Configuration settings for the password dictionary check, which does not allow passwords that are part of the password dictionary.
        /// </summary>
        [Input("passwordDictionary")]
        public Input<Inputs.ConnectionOptionsPasswordDictionaryGetArgs>? PasswordDictionary { get; set; }

        [Input("passwordHistories")]
        private InputList<Inputs.ConnectionOptionsPasswordHistoryGetArgs>? _passwordHistories;

        /// <summary>
        /// Configuration settings for the password history that is maintained for each user to prevent the reuse of passwords.
        /// </summary>
        public InputList<Inputs.ConnectionOptionsPasswordHistoryGetArgs> PasswordHistories
        {
            get => _passwordHistories ?? (_passwordHistories = new InputList<Inputs.ConnectionOptionsPasswordHistoryGetArgs>());
            set => _passwordHistories = value;
        }

        /// <summary>
        /// Configuration settings for the password personal info check, which does not allow passwords that contain any part of the user's personal data, including user's `name`, `username`, `nickname`, `user_metadata.name`, `user_metadata.first`, `user_metadata.last`, user's `email`, or first part of the user's `email`.
        /// </summary>
        [Input("passwordNoPersonalInfo")]
        public Input<Inputs.ConnectionOptionsPasswordNoPersonalInfoGetArgs>? PasswordNoPersonalInfo { get; set; }

        /// <summary>
        /// Indicates level of password strength to enforce during authentication. A strong password policy will make it difficult, if not improbable, for someone to guess a password through either manual or automated means. Options include `none`, `low`, `fair`, `good`, `excellent`.
        /// </summary>
        [Input("passwordPolicy")]
        public Input<string>? PasswordPolicy { get; set; }

        /// <summary>
        /// Ping Federate Server URL.
        /// </summary>
        [Input("pingFederateBaseUrl")]
        public Input<string>? PingFederateBaseUrl { get; set; }

        /// <summary>
        /// Enables Proof Key for Code Exchange (PKCE) functionality for OAuth2 connections.
        /// </summary>
        [Input("pkceEnabled")]
        public Input<bool>? PkceEnabled { get; set; }

        [Input("precedences")]
        private InputList<string>? _precedences;

        /// <summary>
        /// Order of attributes for precedence in identification.Valid values: email, phone*number, username. If Precedence is set, it must contain all values (email, phone*number, username) in specific order
        /// </summary>
        public InputList<string> Precedences
        {
            get => _precedences ?? (_precedences = new InputList<string>());
            set => _precedences = value;
        }

        /// <summary>
        /// The SAML Response Binding: how the SAML token is received by Auth0 from the IdP.
        /// </summary>
        [Input("protocolBinding")]
        public Input<string>? ProtocolBinding { get; set; }

        /// <summary>
        /// Defines the custom `sms_gateway` provider.
        /// </summary>
        [Input("provider")]
        public Input<string>? Provider { get; set; }

        /// <summary>
        /// Allows configuration if connections*realm*fallback flag is enabled for the tenant
        /// </summary>
        [Input("realmFallback")]
        public Input<bool>? RealmFallback { get; set; }

        /// <summary>
        /// Template that formats the SAML request.
        /// </summary>
        [Input("requestTemplate")]
        public Input<string>? RequestTemplate { get; set; }

        /// <summary>
        /// Indicates whether the user is required to provide a username in addition to an email address.
        /// </summary>
        [Input("requiresUsername")]
        public Input<bool>? RequiresUsername { get; set; }

        [Input("scopes")]
        private InputList<string>? _scopes;

        /// <summary>
        /// Permissions to grant to the connection. Within the Auth0 dashboard these appear under the "Attributes" and "Extended Attributes" sections. Some examples: `basic_profile`, `ext_profile`, `ext_nested_groups`, etc.
        /// </summary>
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

        [Input("scripts")]
        private InputMap<string>? _scripts;

        /// <summary>
        /// A map of scripts used for an OAuth connection. Only accepts a `fetchUserProfile` script.
        /// </summary>
        public InputMap<string> Scripts
        {
            get => _scripts ?? (_scripts = new InputMap<string>());
            set => _scripts = value;
        }

        /// <summary>
        /// Determines whether to sync user profile attributes (`name`, `given_name`, `family_name`, `nickname`, `picture`) at each login or only on the first login. Options include: `on_each_login`, `on_first_login`, `never_on_login`. Default value: `on_each_login`.
        /// </summary>
        [Input("setUserRootAttributes")]
        public Input<string>? SetUserRootAttributes { get; set; }

        /// <summary>
        /// Choose how Auth0 sets the email_verified field in the user profile.
        /// </summary>
        [Input("shouldTrustEmailVerifiedConnection")]
        public Input<string>? ShouldTrustEmailVerifiedConnection { get; set; }

        /// <summary>
        /// SAML single login URL for the connection.
        /// </summary>
        [Input("signInEndpoint")]
        public Input<string>? SignInEndpoint { get; set; }

        /// <summary>
        /// SAML single logout URL for the connection.
        /// </summary>
        [Input("signOutEndpoint")]
        public Input<string>? SignOutEndpoint { get; set; }

        /// <summary>
        /// When enabled, the SAML authentication request will be signed.
        /// </summary>
        [Input("signSamlRequest")]
        public Input<bool>? SignSamlRequest { get; set; }

        /// <summary>
        /// Sign Request Algorithm.
        /// </summary>
        [Input("signatureAlgorithm")]
        public Input<string>? SignatureAlgorithm { get; set; }

        /// <summary>
        /// X.509 signing certificate (encoded in PEM or CER) you retrieved from the IdP, Base64-encoded.
        /// </summary>
        [Input("signingCert")]
        public Input<string>? SigningCert { get; set; }

        /// <summary>
        /// The key used to sign requests in the connection. Uses the `key` and `cert` properties to provide the private key and certificate respectively.
        /// </summary>
        [Input("signingKey")]
        public Input<Inputs.ConnectionOptionsSigningKeyGetArgs>? SigningKey { get; set; }

        /// <summary>
        /// Version 1 is deprecated, use version 2.
        /// </summary>
        [Input("strategyVersion")]
        public Input<int>? StrategyVersion { get; set; }

        /// <summary>
        /// Subject line of the email.
        /// </summary>
        [Input("subject")]
        public Input<string>? Subject { get; set; }

        /// <summary>
        /// Syntax of the template body.
        /// </summary>
        [Input("syntax")]
        public Input<string>? Syntax { get; set; }

        /// <summary>
        /// Apple Team ID.
        /// </summary>
        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        /// <summary>
        /// Body of the template.
        /// </summary>
        [Input("template")]
        public Input<string>? Template { get; set; }

        /// <summary>
        /// Tenant domain name.
        /// </summary>
        [Input("tenantDomain")]
        public Input<string>? TenantDomain { get; set; }

        /// <summary>
        /// Token endpoint.
        /// </summary>
        [Input("tokenEndpoint")]
        public Input<string>? TokenEndpoint { get; set; }

        /// <summary>
        /// Specifies the authentication method for the token endpoint. (Okta/OIDC Connections)
        /// </summary>
        [Input("tokenEndpointAuthMethod")]
        public Input<string>? TokenEndpointAuthMethod { get; set; }

        /// <summary>
        /// Specifies the signing algorithm for the token endpoint. (Okta/OIDC Connections)
        /// </summary>
        [Input("tokenEndpointAuthSigningAlg")]
        public Input<string>? TokenEndpointAuthSigningAlg { get; set; }

        /// <summary>
        /// Configuration options for one-time passwords.
        /// </summary>
        [Input("totp")]
        public Input<Inputs.ConnectionOptionsTotpGetArgs>? Totp { get; set; }

        /// <summary>
        /// SID for your Twilio account.
        /// </summary>
        [Input("twilioSid")]
        public Input<string>? TwilioSid { get; set; }

        [Input("twilioToken")]
        private Input<string>? _twilioToken;

        /// <summary>
        /// AuthToken for your Twilio account.
        /// </summary>
        public Input<string>? TwilioToken
        {
            get => _twilioToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _twilioToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Value can be `back_channel` or `front_channel`. Front Channel will use OIDC protocol with `response_mode=form_post` and `response_type=id_token`. Back Channel will use `response_type=code`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// You can pass provider-specific parameters to an identity provider during authentication. The values can either be static per connection or dynamic per user.
        /// </summary>
        [Input("upstreamParams")]
        public Input<string>? UpstreamParams { get; set; }

        /// <summary>
        /// Indicates whether to use cert auth or not.
        /// </summary>
        [Input("useCertAuth")]
        public Input<bool>? UseCertAuth { get; set; }

        /// <summary>
        /// Indicates whether to use Kerberos or not.
        /// </summary>
        [Input("useKerberos")]
        public Input<bool>? UseKerberos { get; set; }

        /// <summary>
        /// Whether to use WS-Fed.
        /// </summary>
        [Input("useWsfed")]
        public Input<bool>? UseWsfed { get; set; }

        /// <summary>
        /// Attribute in the token that will be mapped to the user_id property in Auth0.
        /// </summary>
        [Input("userIdAttribute")]
        public Input<string>? UserIdAttribute { get; set; }

        /// <summary>
        /// User info endpoint.
        /// </summary>
        [Input("userinfoEndpoint")]
        public Input<string>? UserinfoEndpoint { get; set; }

        /// <summary>
        /// Validation of the minimum and maximum values allowed for a user to have as username.
        /// </summary>
        [Input("validation")]
        public Input<Inputs.ConnectionOptionsValidationGetArgs>? Validation { get; set; }

        /// <summary>
        /// Indicates whether to use the common endpoint rather than the default endpoint. Typically enabled if you're using this for a multi-tenant application in Azure AD.
        /// </summary>
        [Input("waadCommonEndpoint")]
        public Input<bool>? WaadCommonEndpoint { get; set; }

        /// <summary>
        /// Protocol to use.
        /// </summary>
        [Input("waadProtocol")]
        public Input<string>? WaadProtocol { get; set; }

        public ConnectionOptionsGetArgs()
        {
        }
        public static new ConnectionOptionsGetArgs Empty => new ConnectionOptionsGetArgs();
    }
}
