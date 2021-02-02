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
    public sealed class ConnectionOptions
    {
        /// <summary>
        /// ADFS Metadata source.
        /// </summary>
        public readonly string? AdfsServer;
        /// <summary>
        /// List of allowed audiences.
        /// </summary>
        public readonly ImmutableArray<string> AllowedAudiences;
        public readonly bool? ApiEnableUsers;
        /// <summary>
        /// Azure AD domain name.
        /// </summary>
        public readonly string? AppDomain;
        /// <summary>
        /// Azure AD app ID.
        /// </summary>
        public readonly string? AppId;
        public readonly string? AuthorizationEndpoint;
        /// <summary>
        /// Indicates whether or not to enable brute force protection, which will limit the number of signups and failed logins from a suspicious IP address.
        /// </summary>
        public readonly bool? BruteForceProtection;
        /// <summary>
        /// OIDC provider client ID.
        /// </summary>
        public readonly string? ClientId;
        /// <summary>
        /// OIDC provider client secret.
        /// </summary>
        public readonly string? ClientSecret;
        /// <summary>
        /// String.
        /// </summary>
        public readonly string? CommunityBaseUrl;
        /// <summary>
        /// A case-sensitive map of key value pairs used as configuration variables for the `custom_script`.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Configuration;
        /// <summary>
        /// Custom database action scripts. For more information, read [Custom Database Action Script Templates](https://auth0.com/docs/connections/database/custom-db/templates).
        /// </summary>
        public readonly ImmutableDictionary<string, string>? CustomScripts;
        /// <summary>
        /// (Boolean) When enabled additional debugging information will be generated.
        /// </summary>
        public readonly bool? Debug;
        /// <summary>
        /// Sign Request Algorithm Digest
        /// </summary>
        public readonly string? DigestAlgorithm;
        public readonly bool? DisableCache;
        /// <summary>
        /// Boolean. Indicates whether or not to allow user sign-ups to your application.
        /// </summary>
        public readonly bool? DisableSignup;
        /// <summary>
        /// OpenID discovery URL. E.g. `https://auth.example.com/.well-known/openid-configuration`.
        /// </summary>
        public readonly string? DiscoveryUrl;
        public readonly string? Domain;
        /// <summary>
        /// List of the domains that can be authenticated using the Identity Provider. Only needed for Identifier First authentication flows.
        /// </summary>
        public readonly ImmutableArray<string> DomainAliases;
        public readonly bool? EnabledDatabaseCustomization;
        /// <summary>
        /// SAML Attributes mapping. If you're configuring a SAML enterprise connection for a non-standard PingFederate Server, you must update the attribute mappings.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? FieldsMap;
        /// <summary>
        /// SMS number for the sender. Used when SMS Source is From.
        /// </summary>
        public readonly string? From;
        public readonly string? IconUrl;
        public readonly string? IdentityApi;
        public readonly Outputs.ConnectionOptionsIdpInitiated? IdpInitiated;
        /// <summary>
        /// Indicates whether or not you have a legacy user store and want to gradually migrate those users to the Auth0 user store. [Learn more](https://auth0.com/docs/users/guides/configure-automatic-migration).
        /// </summary>
        public readonly bool? ImportMode;
        public readonly ImmutableArray<string> Ips;
        /// <summary>
        /// Issuer URL. E.g. `https://auth.example.com`
        /// </summary>
        public readonly string? Issuer;
        public readonly string? JwksUri;
        /// <summary>
        /// Key ID.
        /// </summary>
        public readonly string? KeyId;
        /// <summary>
        /// Maximum number of groups to retrieve.
        /// </summary>
        public readonly string? MaxGroupsToRetrieve;
        /// <summary>
        /// SID for Copilot. Used when SMS Source is Copilot.
        /// </summary>
        public readonly string? MessagingServiceSid;
        /// <summary>
        /// Configuration settings Options for multifactor authentication. For details, see MFA Options.
        /// </summary>
        public readonly Outputs.ConnectionOptionsMfa? Mfa;
        /// <summary>
        /// Name of the connection.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Configuration settings for password complexity. For details, see Password Complexity Options.
        /// </summary>
        public readonly Outputs.ConnectionOptionsPasswordComplexityOptions? PasswordComplexityOptions;
        /// <summary>
        /// Configuration settings for the password dictionary check, which does not allow passwords that are part of the password dictionary. For details, see Password Dictionary.
        /// </summary>
        public readonly Outputs.ConnectionOptionsPasswordDictionary? PasswordDictionary;
        /// <summary>
        /// Configuration settings for the password history that is maintained for each user to prevent the reuse of passwords. For details, see Password History.
        /// </summary>
        public readonly ImmutableArray<Outputs.ConnectionOptionsPasswordHistory> PasswordHistories;
        /// <summary>
        /// Configuration settings for the password personal info check, which does not allow passwords that contain any part of the user's personal data, including user's name, username, nickname, user_metadata.name, user_metadata.first, user_metadata.last, user's email, or first part of the user's email. For details, see Password No Personal Info.
        /// </summary>
        public readonly Outputs.ConnectionOptionsPasswordNoPersonalInfo? PasswordNoPersonalInfo;
        /// <summary>
        /// Indicates level of password strength to enforce during authentication. A strong password policy will make it difficult, if not improbable, for someone to guess a password through either manual or automated means. Options include `none`, `low`, `fair`, `good`, `excellent`.
        /// </summary>
        public readonly string? PasswordPolicy;
        /// <summary>
        /// The SAML Response Binding - how the SAML token is received by Auth0 from IdP. Two possible values are `urn:oasis:names:tc:SAML:2.0:bindings:HTTP-Redirect` (default) and `urn:oasis:names:tc:SAML:2.0:bindings:HTTP-POST`
        /// </summary>
        public readonly string? ProtocolBinding;
        /// <summary>
        /// Template that formats the SAML request
        /// </summary>
        public readonly string? RequestTemplate;
        /// <summary>
        /// Indicates whether or not the user is required to provide a username in addition to an email address.
        /// </summary>
        public readonly bool? RequiresUsername;
        /// <summary>
        /// Scopes required by the connection. The value must be a list, for example `["openid", "profile", "email"]`.
        /// </summary>
        public readonly ImmutableArray<string> Scopes;
        public readonly ImmutableDictionary<string, string>? Scripts;
        /// <summary>
        /// SAML single login URL for the connection.
        /// </summary>
        public readonly string? SignInEndpoint;
        /// <summary>
        /// SAML single logout URL for the connection.
        /// </summary>
        public readonly string? SignOutEndpoint;
        /// <summary>
        /// (Boolean) When enabled, the SAML authentication request will be signed.
        /// </summary>
        public readonly bool? SignSamlRequest;
        /// <summary>
        /// Sign Request Algorithm
        /// </summary>
        public readonly string? SignatureAlgorithm;
        /// <summary>
        /// The X.509 signing certificate (encoded in PEM or CER) you retrieved from the IdP, Base64-encoded
        /// </summary>
        public readonly string? SigningCert;
        /// <summary>
        /// Version 1 is deprecated, use version 2.
        /// </summary>
        public readonly int? StrategyVersion;
        public readonly string? Subject;
        /// <summary>
        /// Syntax of the SMS. Options include `markdown` and `liquid`.
        /// </summary>
        public readonly string? Syntax;
        /// <summary>
        /// Team ID.
        /// </summary>
        public readonly string? TeamId;
        /// <summary>
        /// Template for the SMS. You can use `@@password@@` as a placeholder for the password value.
        /// </summary>
        public readonly string? Template;
        public readonly string? TenantDomain;
        public readonly string? TokenEndpoint;
        /// <summary>
        /// Configuration options for one-time passwords. For details, see TOTP.
        /// </summary>
        public readonly Outputs.ConnectionOptionsTotp? Totp;
        /// <summary>
        /// SID for your Twilio account.
        /// </summary>
        public readonly string? TwilioSid;
        /// <summary>
        /// AuthToken for your Twilio account.
        /// </summary>
        public readonly string? TwilioToken;
        /// <summary>
        /// Value can be `back_channel` or `front_channel`.
        /// </summary>
        public readonly string? Type;
        public readonly bool? UseCertAuth;
        public readonly bool? UseKerberos;
        public readonly bool? UseWsfed;
        /// <summary>
        /// Attribute in the SAML token that will be mapped to the user_id property in Auth0.
        /// </summary>
        public readonly string? UserIdAttribute;
        public readonly string? UserinfoEndpoint;
        /// <summary>
        /// Validation of the minimum and maximum values allowed for a user to have as username. For details, see Validation.
        /// </summary>
        public readonly Outputs.ConnectionOptionsValidation? Validation;
        /// <summary>
        /// Indicates whether or not to use the common endpoint rather than the default endpoint. Typically enabled if you're using this for a multi-tenant application in Azure AD.
        /// </summary>
        public readonly bool? WaadCommonEndpoint;
        public readonly string? WaadProtocol;

        [OutputConstructor]
        private ConnectionOptions(
            string? adfsServer,

            ImmutableArray<string> allowedAudiences,

            bool? apiEnableUsers,

            string? appDomain,

            string? appId,

            string? authorizationEndpoint,

            bool? bruteForceProtection,

            string? clientId,

            string? clientSecret,

            string? communityBaseUrl,

            ImmutableDictionary<string, string>? configuration,

            ImmutableDictionary<string, string>? customScripts,

            bool? debug,

            string? digestAlgorithm,

            bool? disableCache,

            bool? disableSignup,

            string? discoveryUrl,

            string? domain,

            ImmutableArray<string> domainAliases,

            bool? enabledDatabaseCustomization,

            ImmutableDictionary<string, string>? fieldsMap,

            string? from,

            string? iconUrl,

            string? identityApi,

            Outputs.ConnectionOptionsIdpInitiated? idpInitiated,

            bool? importMode,

            ImmutableArray<string> ips,

            string? issuer,

            string? jwksUri,

            string? keyId,

            string? maxGroupsToRetrieve,

            string? messagingServiceSid,

            Outputs.ConnectionOptionsMfa? mfa,

            string? name,

            Outputs.ConnectionOptionsPasswordComplexityOptions? passwordComplexityOptions,

            Outputs.ConnectionOptionsPasswordDictionary? passwordDictionary,

            ImmutableArray<Outputs.ConnectionOptionsPasswordHistory> passwordHistories,

            Outputs.ConnectionOptionsPasswordNoPersonalInfo? passwordNoPersonalInfo,

            string? passwordPolicy,

            string? protocolBinding,

            string? requestTemplate,

            bool? requiresUsername,

            ImmutableArray<string> scopes,

            ImmutableDictionary<string, string>? scripts,

            string? signInEndpoint,

            string? signOutEndpoint,

            bool? signSamlRequest,

            string? signatureAlgorithm,

            string? signingCert,

            int? strategyVersion,

            string? subject,

            string? syntax,

            string? teamId,

            string? template,

            string? tenantDomain,

            string? tokenEndpoint,

            Outputs.ConnectionOptionsTotp? totp,

            string? twilioSid,

            string? twilioToken,

            string? type,

            bool? useCertAuth,

            bool? useKerberos,

            bool? useWsfed,

            string? userIdAttribute,

            string? userinfoEndpoint,

            Outputs.ConnectionOptionsValidation? validation,

            bool? waadCommonEndpoint,

            string? waadProtocol)
        {
            AdfsServer = adfsServer;
            AllowedAudiences = allowedAudiences;
            ApiEnableUsers = apiEnableUsers;
            AppDomain = appDomain;
            AppId = appId;
            AuthorizationEndpoint = authorizationEndpoint;
            BruteForceProtection = bruteForceProtection;
            ClientId = clientId;
            ClientSecret = clientSecret;
            CommunityBaseUrl = communityBaseUrl;
            Configuration = configuration;
            CustomScripts = customScripts;
            Debug = debug;
            DigestAlgorithm = digestAlgorithm;
            DisableCache = disableCache;
            DisableSignup = disableSignup;
            DiscoveryUrl = discoveryUrl;
            Domain = domain;
            DomainAliases = domainAliases;
            EnabledDatabaseCustomization = enabledDatabaseCustomization;
            FieldsMap = fieldsMap;
            From = from;
            IconUrl = iconUrl;
            IdentityApi = identityApi;
            IdpInitiated = idpInitiated;
            ImportMode = importMode;
            Ips = ips;
            Issuer = issuer;
            JwksUri = jwksUri;
            KeyId = keyId;
            MaxGroupsToRetrieve = maxGroupsToRetrieve;
            MessagingServiceSid = messagingServiceSid;
            Mfa = mfa;
            Name = name;
            PasswordComplexityOptions = passwordComplexityOptions;
            PasswordDictionary = passwordDictionary;
            PasswordHistories = passwordHistories;
            PasswordNoPersonalInfo = passwordNoPersonalInfo;
            PasswordPolicy = passwordPolicy;
            ProtocolBinding = protocolBinding;
            RequestTemplate = requestTemplate;
            RequiresUsername = requiresUsername;
            Scopes = scopes;
            Scripts = scripts;
            SignInEndpoint = signInEndpoint;
            SignOutEndpoint = signOutEndpoint;
            SignSamlRequest = signSamlRequest;
            SignatureAlgorithm = signatureAlgorithm;
            SigningCert = signingCert;
            StrategyVersion = strategyVersion;
            Subject = subject;
            Syntax = syntax;
            TeamId = teamId;
            Template = template;
            TenantDomain = tenantDomain;
            TokenEndpoint = tokenEndpoint;
            Totp = totp;
            TwilioSid = twilioSid;
            TwilioToken = twilioToken;
            Type = type;
            UseCertAuth = useCertAuth;
            UseKerberos = useKerberos;
            UseWsfed = useWsfed;
            UserIdAttribute = userIdAttribute;
            UserinfoEndpoint = userinfoEndpoint;
            Validation = validation;
            WaadCommonEndpoint = waadCommonEndpoint;
            WaadProtocol = waadProtocol;
        }
    }
}
