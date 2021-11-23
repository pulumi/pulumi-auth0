// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// ADFS Metadata source.
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

        [Input("apiEnableUsers")]
        public Input<bool>? ApiEnableUsers { get; set; }

        /// <summary>
        /// Azure AD domain name.
        /// </summary>
        [Input("appDomain")]
        public Input<string>? AppDomain { get; set; }

        /// <summary>
        /// Azure AD app ID.
        /// </summary>
        [Input("appId")]
        public Input<string>? AppId { get; set; }

        [Input("authorizationEndpoint")]
        public Input<string>? AuthorizationEndpoint { get; set; }

        /// <summary>
        /// Indicates whether or not to enable brute force protection, which will limit the number of signups and failed logins from a suspicious IP address.
        /// </summary>
        [Input("bruteForceProtection")]
        public Input<bool>? BruteForceProtection { get; set; }

        /// <summary>
        /// OIDC provider client ID.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// OIDC provider client secret.
        /// </summary>
        [Input("clientSecret")]
        public Input<string>? ClientSecret { get; set; }

        /// <summary>
        /// String.
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
            set => _configuration = value;
        }

        [Input("customScripts")]
        private InputMap<string>? _customScripts;

        /// <summary>
        /// Custom database action scripts. For more information, read [Custom Database Action Script Templates](https://auth0.com/docs/connections/database/custom-db/templates).
        /// </summary>
        public InputMap<string> CustomScripts
        {
            get => _customScripts ?? (_customScripts = new InputMap<string>());
            set => _customScripts = value;
        }

        /// <summary>
        /// (Boolean) When enabled additional debugging information will be generated.
        /// </summary>
        [Input("debug")]
        public Input<bool>? Debug { get; set; }

        /// <summary>
        /// Sign Request Algorithm Digest
        /// </summary>
        [Input("digestAlgorithm")]
        public Input<string>? DigestAlgorithm { get; set; }

        [Input("disableCache")]
        public Input<bool>? DisableCache { get; set; }

        /// <summary>
        /// Boolean. Indicates whether or not to allow user sign-ups to your application.
        /// </summary>
        [Input("disableSignup")]
        public Input<bool>? DisableSignup { get; set; }

        /// <summary>
        /// OpenID discovery URL. E.g. `https://auth.example.com/.well-known/openid-configuration`.
        /// </summary>
        [Input("discoveryUrl")]
        public Input<string>? DiscoveryUrl { get; set; }

        [Input("domain")]
        public Input<string>? Domain { get; set; }

        [Input("domainAliases")]
        private InputList<string>? _domainAliases;

        /// <summary>
        /// List of the domains that can be authenticated using the Identity Provider. Only needed for Identifier First authentication flows.
        /// </summary>
        public InputList<string> DomainAliases
        {
            get => _domainAliases ?? (_domainAliases = new InputList<string>());
            set => _domainAliases = value;
        }

        [Input("enabledDatabaseCustomization")]
        public Input<bool>? EnabledDatabaseCustomization { get; set; }

        [Input("fieldsMap")]
        private InputMap<string>? _fieldsMap;

        /// <summary>
        /// SAML Attributes mapping. If you're configuring a SAML enterprise connection for a non-standard PingFederate Server, you must update the attribute mappings.
        /// </summary>
        public InputMap<string> FieldsMap
        {
            get => _fieldsMap ?? (_fieldsMap = new InputMap<string>());
            set => _fieldsMap = value;
        }

        /// <summary>
        /// SMS number for the sender. Used when SMS Source is From.
        /// </summary>
        [Input("from")]
        public Input<string>? From { get; set; }

        [Input("iconUrl")]
        public Input<string>? IconUrl { get; set; }

        [Input("identityApi")]
        public Input<string>? IdentityApi { get; set; }

        /// <summary>
        /// Configuration Options for IDP Initiated Authentication.  This is an object with the properties: `client_id`, `client_protocol`, and `client_authorize_query`
        /// </summary>
        [Input("idpInitiated")]
        public Input<Inputs.ConnectionOptionsIdpInitiatedGetArgs>? IdpInitiated { get; set; }

        /// <summary>
        /// Indicates whether or not you have a legacy user store and want to gradually migrate those users to the Auth0 user store. [Learn more](https://auth0.com/docs/users/guides/configure-automatic-migration).
        /// </summary>
        [Input("importMode")]
        public Input<bool>? ImportMode { get; set; }

        [Input("ips")]
        private InputList<string>? _ips;
        public InputList<string> Ips
        {
            get => _ips ?? (_ips = new InputList<string>());
            set => _ips = value;
        }

        /// <summary>
        /// Issuer URL. E.g. `https://auth.example.com`
        /// </summary>
        [Input("issuer")]
        public Input<string>? Issuer { get; set; }

        [Input("jwksUri")]
        public Input<string>? JwksUri { get; set; }

        /// <summary>
        /// Key ID.
        /// </summary>
        [Input("keyId")]
        public Input<string>? KeyId { get; set; }

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
        /// Configuration settings Options for multifactor authentication. For details, see MFA Options.
        /// </summary>
        [Input("mfa")]
        public Input<Inputs.ConnectionOptionsMfaGetArgs>? Mfa { get; set; }

        /// <summary>
        /// Name of the connection.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nonPersistentAttrs")]
        private InputList<string>? _nonPersistentAttrs;

        /// <summary>
        /// If there are user fields that should not be stored in Auth0 databases due to privacy reasons, you can add them to the denylist. See [here](https://auth0.com/docs/security/denylist-user-attributes) for more info.
        /// </summary>
        public InputList<string> NonPersistentAttrs
        {
            get => _nonPersistentAttrs ?? (_nonPersistentAttrs = new InputList<string>());
            set => _nonPersistentAttrs = value;
        }

        /// <summary>
        /// Configuration settings for password complexity. For details, see Password Complexity Options.
        /// </summary>
        [Input("passwordComplexityOptions")]
        public Input<Inputs.ConnectionOptionsPasswordComplexityOptionsGetArgs>? PasswordComplexityOptions { get; set; }

        /// <summary>
        /// Configuration settings for the password dictionary check, which does not allow passwords that are part of the password dictionary. For details, see Password Dictionary.
        /// </summary>
        [Input("passwordDictionary")]
        public Input<Inputs.ConnectionOptionsPasswordDictionaryGetArgs>? PasswordDictionary { get; set; }

        [Input("passwordHistories")]
        private InputList<Inputs.ConnectionOptionsPasswordHistoryGetArgs>? _passwordHistories;

        /// <summary>
        /// Configuration settings for the password history that is maintained for each user to prevent the reuse of passwords. For details, see Password History.
        /// </summary>
        public InputList<Inputs.ConnectionOptionsPasswordHistoryGetArgs> PasswordHistories
        {
            get => _passwordHistories ?? (_passwordHistories = new InputList<Inputs.ConnectionOptionsPasswordHistoryGetArgs>());
            set => _passwordHistories = value;
        }

        /// <summary>
        /// Configuration settings for the password personal info check, which does not allow passwords that contain any part of the user's personal data, including user's name, username, nickname, user_metadata.name, user_metadata.first, user_metadata.last, user's email, or first part of the user's email. For details, see Password No Personal Info.
        /// </summary>
        [Input("passwordNoPersonalInfo")]
        public Input<Inputs.ConnectionOptionsPasswordNoPersonalInfoGetArgs>? PasswordNoPersonalInfo { get; set; }

        /// <summary>
        /// Indicates level of password strength to enforce during authentication. A strong password policy will make it difficult, if not improbable, for someone to guess a password through either manual or automated means. Options include `none`, `low`, `fair`, `good`, `excellent`.
        /// </summary>
        [Input("passwordPolicy")]
        public Input<string>? PasswordPolicy { get; set; }

        /// <summary>
        /// The SAML Response Binding - how the SAML token is received by Auth0 from IdP. Two possible values are `urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect` (default) and `urn:oasis:names:tc:SAML:2.0:bindings:HTTP-POST`
        /// </summary>
        [Input("protocolBinding")]
        public Input<string>? ProtocolBinding { get; set; }

        /// <summary>
        /// Template that formats the SAML request
        /// </summary>
        [Input("requestTemplate")]
        public Input<string>? RequestTemplate { get; set; }

        /// <summary>
        /// Indicates whether or not the user is required to provide a username in addition to an email address.
        /// </summary>
        [Input("requiresUsername")]
        public Input<bool>? RequiresUsername { get; set; }

        [Input("scopes")]
        private InputList<string>? _scopes;

        /// <summary>
        /// Scopes required by the connection. The value must be a list, for example `["openid", "profile", "email"]`.
        /// </summary>
        public InputList<string> Scopes
        {
            get => _scopes ?? (_scopes = new InputList<string>());
            set => _scopes = value;
        }

        [Input("scripts")]
        private InputMap<string>? _scripts;
        public InputMap<string> Scripts
        {
            get => _scripts ?? (_scripts = new InputMap<string>());
            set => _scripts = value;
        }

        /// <summary>
        /// Determines whether the 'name', 'given_name', 'family_name', 'nickname', and 'picture' attributes can be independently updated when using the external IdP. Default is `on_each_login` and can be set to `on_first_login`.
        /// </summary>
        [Input("setUserRootAttributes")]
        public Input<string>? SetUserRootAttributes { get; set; }

        /// <summary>
        /// Determines how Auth0 sets the email_verified field in the user profile. Can either be set to `never_set_emails_as_verified` or `always_set_emails_as_verified`.
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
        /// (Boolean) When enabled, the SAML authentication request will be signed.
        /// </summary>
        [Input("signSamlRequest")]
        public Input<bool>? SignSamlRequest { get; set; }

        /// <summary>
        /// Sign Request Algorithm
        /// </summary>
        [Input("signatureAlgorithm")]
        public Input<string>? SignatureAlgorithm { get; set; }

        /// <summary>
        /// The X.509 signing certificate (encoded in PEM or CER) you retrieved from the IdP, Base64-encoded
        /// </summary>
        [Input("signingCert")]
        public Input<string>? SigningCert { get; set; }

        /// <summary>
        /// Version 1 is deprecated, use version 2.
        /// </summary>
        [Input("strategyVersion")]
        public Input<int>? StrategyVersion { get; set; }

        [Input("subject")]
        public Input<string>? Subject { get; set; }

        /// <summary>
        /// Syntax of the SMS. Options include `markdown` and `liquid`.
        /// </summary>
        [Input("syntax")]
        public Input<string>? Syntax { get; set; }

        /// <summary>
        /// Team ID.
        /// </summary>
        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        /// <summary>
        /// Template for the SMS. You can use `@@password@@` as a placeholder for the password value.
        /// </summary>
        [Input("template")]
        public Input<string>? Template { get; set; }

        [Input("tenantDomain")]
        public Input<string>? TenantDomain { get; set; }

        [Input("tokenEndpoint")]
        public Input<string>? TokenEndpoint { get; set; }

        /// <summary>
        /// Configuration options for one-time passwords. For details, see TOTP.
        /// </summary>
        [Input("totp")]
        public Input<Inputs.ConnectionOptionsTotpGetArgs>? Totp { get; set; }

        /// <summary>
        /// SID for your Twilio account.
        /// </summary>
        [Input("twilioSid")]
        public Input<string>? TwilioSid { get; set; }

        /// <summary>
        /// AuthToken for your Twilio account.
        /// </summary>
        [Input("twilioToken")]
        public Input<string>? TwilioToken { get; set; }

        /// <summary>
        /// Value can be `back_channel` or `front_channel`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("useCertAuth")]
        public Input<bool>? UseCertAuth { get; set; }

        [Input("useKerberos")]
        public Input<bool>? UseKerberos { get; set; }

        [Input("useWsfed")]
        public Input<bool>? UseWsfed { get; set; }

        /// <summary>
        /// Attribute in the SAML token that will be mapped to the user_id property in Auth0.
        /// </summary>
        [Input("userIdAttribute")]
        public Input<string>? UserIdAttribute { get; set; }

        [Input("userinfoEndpoint")]
        public Input<string>? UserinfoEndpoint { get; set; }

        /// <summary>
        /// Validation of the minimum and maximum values allowed for a user to have as username. For details, see Validation.
        /// </summary>
        [Input("validation")]
        public Input<Inputs.ConnectionOptionsValidationGetArgs>? Validation { get; set; }

        /// <summary>
        /// Indicates whether or not to use the common endpoint rather than the default endpoint. Typically enabled if you're using this for a multi-tenant application in Azure AD.
        /// </summary>
        [Input("waadCommonEndpoint")]
        public Input<bool>? WaadCommonEndpoint { get; set; }

        [Input("waadProtocol")]
        public Input<string>? WaadProtocol { get; set; }

        public ConnectionOptionsGetArgs()
        {
        }
    }
}
