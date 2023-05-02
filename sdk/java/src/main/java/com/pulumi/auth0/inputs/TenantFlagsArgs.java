// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TenantFlagsArgs extends com.pulumi.resources.ResourceArgs {

    public static final TenantFlagsArgs Empty = new TenantFlagsArgs();

    /**
     * Whether the legacy delegation endpoint will be enabled for your account (true) or not available (false).
     * 
     */
    @Import(name="allowLegacyDelegationGrantTypes")
    private @Nullable Output<Boolean> allowLegacyDelegationGrantTypes;

    /**
     * @return Whether the legacy delegation endpoint will be enabled for your account (true) or not available (false).
     * 
     */
    public Optional<Output<Boolean>> allowLegacyDelegationGrantTypes() {
        return Optional.ofNullable(this.allowLegacyDelegationGrantTypes);
    }

    /**
     * Whether the legacy `auth/ro` endpoint (used with resource owner password and passwordless features) will be enabled for your account (true) or not available (false).
     * 
     */
    @Import(name="allowLegacyRoGrantTypes")
    private @Nullable Output<Boolean> allowLegacyRoGrantTypes;

    /**
     * @return Whether the legacy `auth/ro` endpoint (used with resource owner password and passwordless features) will be enabled for your account (true) or not available (false).
     * 
     */
    public Optional<Output<Boolean>> allowLegacyRoGrantTypes() {
        return Optional.ofNullable(this.allowLegacyRoGrantTypes);
    }

    /**
     * If enabled, customers can use Tokeninfo Endpoint, otherwise they can not use it.
     * 
     */
    @Import(name="allowLegacyTokeninfoEndpoint")
    private @Nullable Output<Boolean> allowLegacyTokeninfoEndpoint;

    /**
     * @return If enabled, customers can use Tokeninfo Endpoint, otherwise they can not use it.
     * 
     */
    public Optional<Output<Boolean>> allowLegacyTokeninfoEndpoint() {
        return Optional.ofNullable(this.allowLegacyTokeninfoEndpoint);
    }

    /**
     * Enables new insights activity page view.
     * 
     */
    @Import(name="dashboardInsightsView")
    private @Nullable Output<Boolean> dashboardInsightsView;

    /**
     * @return Enables new insights activity page view.
     * 
     */
    public Optional<Output<Boolean>> dashboardInsightsView() {
        return Optional.ofNullable(this.dashboardInsightsView);
    }

    /**
     * Enables beta access to log streaming changes.
     * 
     */
    @Import(name="dashboardLogStreamsNext")
    private @Nullable Output<Boolean> dashboardLogStreamsNext;

    /**
     * @return Enables beta access to log streaming changes.
     * 
     */
    public Optional<Output<Boolean>> dashboardLogStreamsNext() {
        return Optional.ofNullable(this.dashboardLogStreamsNext);
    }

    /**
     * Indicates whether classic Universal Login prompts include additional security headers to prevent clickjacking.
     * 
     */
    @Import(name="disableClickjackProtectionHeaders")
    private @Nullable Output<Boolean> disableClickjackProtectionHeaders;

    /**
     * @return Indicates whether classic Universal Login prompts include additional security headers to prevent clickjacking.
     * 
     */
    public Optional<Output<Boolean>> disableClickjackProtectionHeaders() {
        return Optional.ofNullable(this.disableClickjackProtectionHeaders);
    }

    /**
     * Disables SAML fields map fix for bad mappings with repeated attributes.
     * 
     */
    @Import(name="disableFieldsMapFix")
    private @Nullable Output<Boolean> disableFieldsMapFix;

    /**
     * @return Disables SAML fields map fix for bad mappings with repeated attributes.
     * 
     */
    public Optional<Output<Boolean>> disableFieldsMapFix() {
        return Optional.ofNullable(this.disableFieldsMapFix);
    }

    /**
     * If true, SMS phone numbers will not be obfuscated in Management API GET calls.
     * 
     */
    @Import(name="disableManagementApiSmsObfuscation")
    private @Nullable Output<Boolean> disableManagementApiSmsObfuscation;

    /**
     * @return If true, SMS phone numbers will not be obfuscated in Management API GET calls.
     * 
     */
    public Optional<Output<Boolean>> disableManagementApiSmsObfuscation() {
        return Optional.ofNullable(this.disableManagementApiSmsObfuscation);
    }

    /**
     * If enabled, users will be presented with an email verification prompt during their first login when using Azure AD or ADFS connections.
     * 
     */
    @Import(name="enableAdfsWaadEmailVerification")
    private @Nullable Output<Boolean> enableAdfsWaadEmailVerification;

    /**
     * @return If enabled, users will be presented with an email verification prompt during their first login when using Azure AD or ADFS connections.
     * 
     */
    public Optional<Output<Boolean>> enableAdfsWaadEmailVerification() {
        return Optional.ofNullable(this.enableAdfsWaadEmailVerification);
    }

    /**
     * Indicates whether the APIs section is enabled for the tenant.
     * 
     */
    @Import(name="enableApisSection")
    private @Nullable Output<Boolean> enableApisSection;

    /**
     * @return Indicates whether the APIs section is enabled for the tenant.
     * 
     */
    public Optional<Output<Boolean>> enableApisSection() {
        return Optional.ofNullable(this.enableApisSection);
    }

    /**
     * Indicates whether all current connections should be enabled when a new client is created.
     * 
     */
    @Import(name="enableClientConnections")
    private @Nullable Output<Boolean> enableClientConnections;

    /**
     * @return Indicates whether all current connections should be enabled when a new client is created.
     * 
     */
    public Optional<Output<Boolean>> enableClientConnections() {
        return Optional.ofNullable(this.enableClientConnections);
    }

    /**
     * Indicates whether the tenant allows custom domains in emails.
     * 
     */
    @Import(name="enableCustomDomainInEmails")
    private @Nullable Output<Boolean> enableCustomDomainInEmails;

    /**
     * @return Indicates whether the tenant allows custom domains in emails.
     * 
     */
    public Optional<Output<Boolean>> enableCustomDomainInEmails() {
        return Optional.ofNullable(this.enableCustomDomainInEmails);
    }

    /**
     * Indicates whether the tenant allows dynamic client registration.
     * 
     */
    @Import(name="enableDynamicClientRegistration")
    private @Nullable Output<Boolean> enableDynamicClientRegistration;

    /**
     * @return Indicates whether the tenant allows dynamic client registration.
     * 
     */
    public Optional<Output<Boolean>> enableDynamicClientRegistration() {
        return Optional.ofNullable(this.enableDynamicClientRegistration);
    }

    /**
     * Whether ID tokens can be used to authorize some types of requests to API v2 (true) or not (false).
     * 
     */
    @Import(name="enableIdtokenApi2")
    private @Nullable Output<Boolean> enableIdtokenApi2;

    /**
     * @return Whether ID tokens can be used to authorize some types of requests to API v2 (true) or not (false).
     * 
     */
    public Optional<Output<Boolean>> enableIdtokenApi2() {
        return Optional.ofNullable(this.enableIdtokenApi2);
    }

    /**
     * Indicates whether to use the older v2 legacy logs search.
     * 
     */
    @Import(name="enableLegacyLogsSearchV2")
    private @Nullable Output<Boolean> enableLegacyLogsSearchV2;

    /**
     * @return Indicates whether to use the older v2 legacy logs search.
     * 
     */
    public Optional<Output<Boolean>> enableLegacyLogsSearchV2() {
        return Optional.ofNullable(this.enableLegacyLogsSearchV2);
    }

    /**
     * Whether ID tokens and the userinfo endpoint includes a complete user profile (true) or only OpenID Connect claims (false).
     * 
     */
    @Import(name="enableLegacyProfile")
    private @Nullable Output<Boolean> enableLegacyProfile;

    /**
     * @return Whether ID tokens and the userinfo endpoint includes a complete user profile (true) or only OpenID Connect claims (false).
     * 
     */
    public Optional<Output<Boolean>> enableLegacyProfile() {
        return Optional.ofNullable(this.enableLegacyProfile);
    }

    /**
     * Indicates whether advanced API Authorization scenarios are enabled.
     * 
     */
    @Import(name="enablePipeline2")
    private @Nullable Output<Boolean> enablePipeline2;

    /**
     * @return Indicates whether advanced API Authorization scenarios are enabled.
     * 
     */
    public Optional<Output<Boolean>> enablePipeline2() {
        return Optional.ofNullable(this.enablePipeline2);
    }

    /**
     * Indicates whether the public sign up process shows a `user_exists` error if the user already exists.
     * 
     */
    @Import(name="enablePublicSignupUserExistsError")
    private @Nullable Output<Boolean> enablePublicSignupUserExistsError;

    /**
     * @return Indicates whether the public sign up process shows a `user_exists` error if the user already exists.
     * 
     */
    public Optional<Output<Boolean>> enablePublicSignupUserExistsError() {
        return Optional.ofNullable(this.enablePublicSignupUserExistsError);
    }

    /**
     * Used to allow users to pick which factor to enroll with from the list of available MFA factors.
     * 
     */
    @Import(name="mfaShowFactorListOnEnrollment")
    private @Nullable Output<Boolean> mfaShowFactorListOnEnrollment;

    /**
     * @return Used to allow users to pick which factor to enroll with from the list of available MFA factors.
     * 
     */
    public Optional<Output<Boolean>> mfaShowFactorListOnEnrollment() {
        return Optional.ofNullable(this.mfaShowFactorListOnEnrollment);
    }

    /**
     * Do not Publish Enterprise Connections Information with IdP domains on the lock configuration file.
     * 
     */
    @Import(name="noDiscloseEnterpriseConnections")
    private @Nullable Output<Boolean> noDiscloseEnterpriseConnections;

    /**
     * @return Do not Publish Enterprise Connections Information with IdP domains on the lock configuration file.
     * 
     */
    public Optional<Output<Boolean>> noDiscloseEnterpriseConnections() {
        return Optional.ofNullable(this.noDiscloseEnterpriseConnections);
    }

    /**
     * Delete underlying grant when a refresh token is revoked via the Authentication API.
     * 
     */
    @Import(name="revokeRefreshTokenGrant")
    private @Nullable Output<Boolean> revokeRefreshTokenGrant;

    /**
     * @return Delete underlying grant when a refresh token is revoked via the Authentication API.
     * 
     */
    public Optional<Output<Boolean>> revokeRefreshTokenGrant() {
        return Optional.ofNullable(this.revokeRefreshTokenGrant);
    }

    /**
     * Indicates whether the New Universal Login Experience is enabled.
     * 
     * @deprecated
     * This attribute is deprecated. Use the `universal_login_experience` attribute on the `auth0_prompt` resource to toggle the new or classic experience instead.
     * 
     */
    @Deprecated /* This attribute is deprecated. Use the `universal_login_experience` attribute on the `auth0_prompt` resource to toggle the new or classic experience instead. */
    @Import(name="universalLogin")
    private @Nullable Output<Boolean> universalLogin;

    /**
     * @return Indicates whether the New Universal Login Experience is enabled.
     * 
     * @deprecated
     * This attribute is deprecated. Use the `universal_login_experience` attribute on the `auth0_prompt` resource to toggle the new or classic experience instead.
     * 
     */
    @Deprecated /* This attribute is deprecated. Use the `universal_login_experience` attribute on the `auth0_prompt` resource to toggle the new or classic experience instead. */
    public Optional<Output<Boolean>> universalLogin() {
        return Optional.ofNullable(this.universalLogin);
    }

    /**
     * Indicates whether to use scope descriptions for consent.
     * 
     */
    @Import(name="useScopeDescriptionsForConsent")
    private @Nullable Output<Boolean> useScopeDescriptionsForConsent;

    /**
     * @return Indicates whether to use scope descriptions for consent.
     * 
     */
    public Optional<Output<Boolean>> useScopeDescriptionsForConsent() {
        return Optional.ofNullable(this.useScopeDescriptionsForConsent);
    }

    private TenantFlagsArgs() {}

    private TenantFlagsArgs(TenantFlagsArgs $) {
        this.allowLegacyDelegationGrantTypes = $.allowLegacyDelegationGrantTypes;
        this.allowLegacyRoGrantTypes = $.allowLegacyRoGrantTypes;
        this.allowLegacyTokeninfoEndpoint = $.allowLegacyTokeninfoEndpoint;
        this.dashboardInsightsView = $.dashboardInsightsView;
        this.dashboardLogStreamsNext = $.dashboardLogStreamsNext;
        this.disableClickjackProtectionHeaders = $.disableClickjackProtectionHeaders;
        this.disableFieldsMapFix = $.disableFieldsMapFix;
        this.disableManagementApiSmsObfuscation = $.disableManagementApiSmsObfuscation;
        this.enableAdfsWaadEmailVerification = $.enableAdfsWaadEmailVerification;
        this.enableApisSection = $.enableApisSection;
        this.enableClientConnections = $.enableClientConnections;
        this.enableCustomDomainInEmails = $.enableCustomDomainInEmails;
        this.enableDynamicClientRegistration = $.enableDynamicClientRegistration;
        this.enableIdtokenApi2 = $.enableIdtokenApi2;
        this.enableLegacyLogsSearchV2 = $.enableLegacyLogsSearchV2;
        this.enableLegacyProfile = $.enableLegacyProfile;
        this.enablePipeline2 = $.enablePipeline2;
        this.enablePublicSignupUserExistsError = $.enablePublicSignupUserExistsError;
        this.mfaShowFactorListOnEnrollment = $.mfaShowFactorListOnEnrollment;
        this.noDiscloseEnterpriseConnections = $.noDiscloseEnterpriseConnections;
        this.revokeRefreshTokenGrant = $.revokeRefreshTokenGrant;
        this.universalLogin = $.universalLogin;
        this.useScopeDescriptionsForConsent = $.useScopeDescriptionsForConsent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TenantFlagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TenantFlagsArgs $;

        public Builder() {
            $ = new TenantFlagsArgs();
        }

        public Builder(TenantFlagsArgs defaults) {
            $ = new TenantFlagsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowLegacyDelegationGrantTypes Whether the legacy delegation endpoint will be enabled for your account (true) or not available (false).
         * 
         * @return builder
         * 
         */
        public Builder allowLegacyDelegationGrantTypes(@Nullable Output<Boolean> allowLegacyDelegationGrantTypes) {
            $.allowLegacyDelegationGrantTypes = allowLegacyDelegationGrantTypes;
            return this;
        }

        /**
         * @param allowLegacyDelegationGrantTypes Whether the legacy delegation endpoint will be enabled for your account (true) or not available (false).
         * 
         * @return builder
         * 
         */
        public Builder allowLegacyDelegationGrantTypes(Boolean allowLegacyDelegationGrantTypes) {
            return allowLegacyDelegationGrantTypes(Output.of(allowLegacyDelegationGrantTypes));
        }

        /**
         * @param allowLegacyRoGrantTypes Whether the legacy `auth/ro` endpoint (used with resource owner password and passwordless features) will be enabled for your account (true) or not available (false).
         * 
         * @return builder
         * 
         */
        public Builder allowLegacyRoGrantTypes(@Nullable Output<Boolean> allowLegacyRoGrantTypes) {
            $.allowLegacyRoGrantTypes = allowLegacyRoGrantTypes;
            return this;
        }

        /**
         * @param allowLegacyRoGrantTypes Whether the legacy `auth/ro` endpoint (used with resource owner password and passwordless features) will be enabled for your account (true) or not available (false).
         * 
         * @return builder
         * 
         */
        public Builder allowLegacyRoGrantTypes(Boolean allowLegacyRoGrantTypes) {
            return allowLegacyRoGrantTypes(Output.of(allowLegacyRoGrantTypes));
        }

        /**
         * @param allowLegacyTokeninfoEndpoint If enabled, customers can use Tokeninfo Endpoint, otherwise they can not use it.
         * 
         * @return builder
         * 
         */
        public Builder allowLegacyTokeninfoEndpoint(@Nullable Output<Boolean> allowLegacyTokeninfoEndpoint) {
            $.allowLegacyTokeninfoEndpoint = allowLegacyTokeninfoEndpoint;
            return this;
        }

        /**
         * @param allowLegacyTokeninfoEndpoint If enabled, customers can use Tokeninfo Endpoint, otherwise they can not use it.
         * 
         * @return builder
         * 
         */
        public Builder allowLegacyTokeninfoEndpoint(Boolean allowLegacyTokeninfoEndpoint) {
            return allowLegacyTokeninfoEndpoint(Output.of(allowLegacyTokeninfoEndpoint));
        }

        /**
         * @param dashboardInsightsView Enables new insights activity page view.
         * 
         * @return builder
         * 
         */
        public Builder dashboardInsightsView(@Nullable Output<Boolean> dashboardInsightsView) {
            $.dashboardInsightsView = dashboardInsightsView;
            return this;
        }

        /**
         * @param dashboardInsightsView Enables new insights activity page view.
         * 
         * @return builder
         * 
         */
        public Builder dashboardInsightsView(Boolean dashboardInsightsView) {
            return dashboardInsightsView(Output.of(dashboardInsightsView));
        }

        /**
         * @param dashboardLogStreamsNext Enables beta access to log streaming changes.
         * 
         * @return builder
         * 
         */
        public Builder dashboardLogStreamsNext(@Nullable Output<Boolean> dashboardLogStreamsNext) {
            $.dashboardLogStreamsNext = dashboardLogStreamsNext;
            return this;
        }

        /**
         * @param dashboardLogStreamsNext Enables beta access to log streaming changes.
         * 
         * @return builder
         * 
         */
        public Builder dashboardLogStreamsNext(Boolean dashboardLogStreamsNext) {
            return dashboardLogStreamsNext(Output.of(dashboardLogStreamsNext));
        }

        /**
         * @param disableClickjackProtectionHeaders Indicates whether classic Universal Login prompts include additional security headers to prevent clickjacking.
         * 
         * @return builder
         * 
         */
        public Builder disableClickjackProtectionHeaders(@Nullable Output<Boolean> disableClickjackProtectionHeaders) {
            $.disableClickjackProtectionHeaders = disableClickjackProtectionHeaders;
            return this;
        }

        /**
         * @param disableClickjackProtectionHeaders Indicates whether classic Universal Login prompts include additional security headers to prevent clickjacking.
         * 
         * @return builder
         * 
         */
        public Builder disableClickjackProtectionHeaders(Boolean disableClickjackProtectionHeaders) {
            return disableClickjackProtectionHeaders(Output.of(disableClickjackProtectionHeaders));
        }

        /**
         * @param disableFieldsMapFix Disables SAML fields map fix for bad mappings with repeated attributes.
         * 
         * @return builder
         * 
         */
        public Builder disableFieldsMapFix(@Nullable Output<Boolean> disableFieldsMapFix) {
            $.disableFieldsMapFix = disableFieldsMapFix;
            return this;
        }

        /**
         * @param disableFieldsMapFix Disables SAML fields map fix for bad mappings with repeated attributes.
         * 
         * @return builder
         * 
         */
        public Builder disableFieldsMapFix(Boolean disableFieldsMapFix) {
            return disableFieldsMapFix(Output.of(disableFieldsMapFix));
        }

        /**
         * @param disableManagementApiSmsObfuscation If true, SMS phone numbers will not be obfuscated in Management API GET calls.
         * 
         * @return builder
         * 
         */
        public Builder disableManagementApiSmsObfuscation(@Nullable Output<Boolean> disableManagementApiSmsObfuscation) {
            $.disableManagementApiSmsObfuscation = disableManagementApiSmsObfuscation;
            return this;
        }

        /**
         * @param disableManagementApiSmsObfuscation If true, SMS phone numbers will not be obfuscated in Management API GET calls.
         * 
         * @return builder
         * 
         */
        public Builder disableManagementApiSmsObfuscation(Boolean disableManagementApiSmsObfuscation) {
            return disableManagementApiSmsObfuscation(Output.of(disableManagementApiSmsObfuscation));
        }

        /**
         * @param enableAdfsWaadEmailVerification If enabled, users will be presented with an email verification prompt during their first login when using Azure AD or ADFS connections.
         * 
         * @return builder
         * 
         */
        public Builder enableAdfsWaadEmailVerification(@Nullable Output<Boolean> enableAdfsWaadEmailVerification) {
            $.enableAdfsWaadEmailVerification = enableAdfsWaadEmailVerification;
            return this;
        }

        /**
         * @param enableAdfsWaadEmailVerification If enabled, users will be presented with an email verification prompt during their first login when using Azure AD or ADFS connections.
         * 
         * @return builder
         * 
         */
        public Builder enableAdfsWaadEmailVerification(Boolean enableAdfsWaadEmailVerification) {
            return enableAdfsWaadEmailVerification(Output.of(enableAdfsWaadEmailVerification));
        }

        /**
         * @param enableApisSection Indicates whether the APIs section is enabled for the tenant.
         * 
         * @return builder
         * 
         */
        public Builder enableApisSection(@Nullable Output<Boolean> enableApisSection) {
            $.enableApisSection = enableApisSection;
            return this;
        }

        /**
         * @param enableApisSection Indicates whether the APIs section is enabled for the tenant.
         * 
         * @return builder
         * 
         */
        public Builder enableApisSection(Boolean enableApisSection) {
            return enableApisSection(Output.of(enableApisSection));
        }

        /**
         * @param enableClientConnections Indicates whether all current connections should be enabled when a new client is created.
         * 
         * @return builder
         * 
         */
        public Builder enableClientConnections(@Nullable Output<Boolean> enableClientConnections) {
            $.enableClientConnections = enableClientConnections;
            return this;
        }

        /**
         * @param enableClientConnections Indicates whether all current connections should be enabled when a new client is created.
         * 
         * @return builder
         * 
         */
        public Builder enableClientConnections(Boolean enableClientConnections) {
            return enableClientConnections(Output.of(enableClientConnections));
        }

        /**
         * @param enableCustomDomainInEmails Indicates whether the tenant allows custom domains in emails.
         * 
         * @return builder
         * 
         */
        public Builder enableCustomDomainInEmails(@Nullable Output<Boolean> enableCustomDomainInEmails) {
            $.enableCustomDomainInEmails = enableCustomDomainInEmails;
            return this;
        }

        /**
         * @param enableCustomDomainInEmails Indicates whether the tenant allows custom domains in emails.
         * 
         * @return builder
         * 
         */
        public Builder enableCustomDomainInEmails(Boolean enableCustomDomainInEmails) {
            return enableCustomDomainInEmails(Output.of(enableCustomDomainInEmails));
        }

        /**
         * @param enableDynamicClientRegistration Indicates whether the tenant allows dynamic client registration.
         * 
         * @return builder
         * 
         */
        public Builder enableDynamicClientRegistration(@Nullable Output<Boolean> enableDynamicClientRegistration) {
            $.enableDynamicClientRegistration = enableDynamicClientRegistration;
            return this;
        }

        /**
         * @param enableDynamicClientRegistration Indicates whether the tenant allows dynamic client registration.
         * 
         * @return builder
         * 
         */
        public Builder enableDynamicClientRegistration(Boolean enableDynamicClientRegistration) {
            return enableDynamicClientRegistration(Output.of(enableDynamicClientRegistration));
        }

        /**
         * @param enableIdtokenApi2 Whether ID tokens can be used to authorize some types of requests to API v2 (true) or not (false).
         * 
         * @return builder
         * 
         */
        public Builder enableIdtokenApi2(@Nullable Output<Boolean> enableIdtokenApi2) {
            $.enableIdtokenApi2 = enableIdtokenApi2;
            return this;
        }

        /**
         * @param enableIdtokenApi2 Whether ID tokens can be used to authorize some types of requests to API v2 (true) or not (false).
         * 
         * @return builder
         * 
         */
        public Builder enableIdtokenApi2(Boolean enableIdtokenApi2) {
            return enableIdtokenApi2(Output.of(enableIdtokenApi2));
        }

        /**
         * @param enableLegacyLogsSearchV2 Indicates whether to use the older v2 legacy logs search.
         * 
         * @return builder
         * 
         */
        public Builder enableLegacyLogsSearchV2(@Nullable Output<Boolean> enableLegacyLogsSearchV2) {
            $.enableLegacyLogsSearchV2 = enableLegacyLogsSearchV2;
            return this;
        }

        /**
         * @param enableLegacyLogsSearchV2 Indicates whether to use the older v2 legacy logs search.
         * 
         * @return builder
         * 
         */
        public Builder enableLegacyLogsSearchV2(Boolean enableLegacyLogsSearchV2) {
            return enableLegacyLogsSearchV2(Output.of(enableLegacyLogsSearchV2));
        }

        /**
         * @param enableLegacyProfile Whether ID tokens and the userinfo endpoint includes a complete user profile (true) or only OpenID Connect claims (false).
         * 
         * @return builder
         * 
         */
        public Builder enableLegacyProfile(@Nullable Output<Boolean> enableLegacyProfile) {
            $.enableLegacyProfile = enableLegacyProfile;
            return this;
        }

        /**
         * @param enableLegacyProfile Whether ID tokens and the userinfo endpoint includes a complete user profile (true) or only OpenID Connect claims (false).
         * 
         * @return builder
         * 
         */
        public Builder enableLegacyProfile(Boolean enableLegacyProfile) {
            return enableLegacyProfile(Output.of(enableLegacyProfile));
        }

        /**
         * @param enablePipeline2 Indicates whether advanced API Authorization scenarios are enabled.
         * 
         * @return builder
         * 
         */
        public Builder enablePipeline2(@Nullable Output<Boolean> enablePipeline2) {
            $.enablePipeline2 = enablePipeline2;
            return this;
        }

        /**
         * @param enablePipeline2 Indicates whether advanced API Authorization scenarios are enabled.
         * 
         * @return builder
         * 
         */
        public Builder enablePipeline2(Boolean enablePipeline2) {
            return enablePipeline2(Output.of(enablePipeline2));
        }

        /**
         * @param enablePublicSignupUserExistsError Indicates whether the public sign up process shows a `user_exists` error if the user already exists.
         * 
         * @return builder
         * 
         */
        public Builder enablePublicSignupUserExistsError(@Nullable Output<Boolean> enablePublicSignupUserExistsError) {
            $.enablePublicSignupUserExistsError = enablePublicSignupUserExistsError;
            return this;
        }

        /**
         * @param enablePublicSignupUserExistsError Indicates whether the public sign up process shows a `user_exists` error if the user already exists.
         * 
         * @return builder
         * 
         */
        public Builder enablePublicSignupUserExistsError(Boolean enablePublicSignupUserExistsError) {
            return enablePublicSignupUserExistsError(Output.of(enablePublicSignupUserExistsError));
        }

        /**
         * @param mfaShowFactorListOnEnrollment Used to allow users to pick which factor to enroll with from the list of available MFA factors.
         * 
         * @return builder
         * 
         */
        public Builder mfaShowFactorListOnEnrollment(@Nullable Output<Boolean> mfaShowFactorListOnEnrollment) {
            $.mfaShowFactorListOnEnrollment = mfaShowFactorListOnEnrollment;
            return this;
        }

        /**
         * @param mfaShowFactorListOnEnrollment Used to allow users to pick which factor to enroll with from the list of available MFA factors.
         * 
         * @return builder
         * 
         */
        public Builder mfaShowFactorListOnEnrollment(Boolean mfaShowFactorListOnEnrollment) {
            return mfaShowFactorListOnEnrollment(Output.of(mfaShowFactorListOnEnrollment));
        }

        /**
         * @param noDiscloseEnterpriseConnections Do not Publish Enterprise Connections Information with IdP domains on the lock configuration file.
         * 
         * @return builder
         * 
         */
        public Builder noDiscloseEnterpriseConnections(@Nullable Output<Boolean> noDiscloseEnterpriseConnections) {
            $.noDiscloseEnterpriseConnections = noDiscloseEnterpriseConnections;
            return this;
        }

        /**
         * @param noDiscloseEnterpriseConnections Do not Publish Enterprise Connections Information with IdP domains on the lock configuration file.
         * 
         * @return builder
         * 
         */
        public Builder noDiscloseEnterpriseConnections(Boolean noDiscloseEnterpriseConnections) {
            return noDiscloseEnterpriseConnections(Output.of(noDiscloseEnterpriseConnections));
        }

        /**
         * @param revokeRefreshTokenGrant Delete underlying grant when a refresh token is revoked via the Authentication API.
         * 
         * @return builder
         * 
         */
        public Builder revokeRefreshTokenGrant(@Nullable Output<Boolean> revokeRefreshTokenGrant) {
            $.revokeRefreshTokenGrant = revokeRefreshTokenGrant;
            return this;
        }

        /**
         * @param revokeRefreshTokenGrant Delete underlying grant when a refresh token is revoked via the Authentication API.
         * 
         * @return builder
         * 
         */
        public Builder revokeRefreshTokenGrant(Boolean revokeRefreshTokenGrant) {
            return revokeRefreshTokenGrant(Output.of(revokeRefreshTokenGrant));
        }

        /**
         * @param universalLogin Indicates whether the New Universal Login Experience is enabled.
         * 
         * @return builder
         * 
         * @deprecated
         * This attribute is deprecated. Use the `universal_login_experience` attribute on the `auth0_prompt` resource to toggle the new or classic experience instead.
         * 
         */
        @Deprecated /* This attribute is deprecated. Use the `universal_login_experience` attribute on the `auth0_prompt` resource to toggle the new or classic experience instead. */
        public Builder universalLogin(@Nullable Output<Boolean> universalLogin) {
            $.universalLogin = universalLogin;
            return this;
        }

        /**
         * @param universalLogin Indicates whether the New Universal Login Experience is enabled.
         * 
         * @return builder
         * 
         * @deprecated
         * This attribute is deprecated. Use the `universal_login_experience` attribute on the `auth0_prompt` resource to toggle the new or classic experience instead.
         * 
         */
        @Deprecated /* This attribute is deprecated. Use the `universal_login_experience` attribute on the `auth0_prompt` resource to toggle the new or classic experience instead. */
        public Builder universalLogin(Boolean universalLogin) {
            return universalLogin(Output.of(universalLogin));
        }

        /**
         * @param useScopeDescriptionsForConsent Indicates whether to use scope descriptions for consent.
         * 
         * @return builder
         * 
         */
        public Builder useScopeDescriptionsForConsent(@Nullable Output<Boolean> useScopeDescriptionsForConsent) {
            $.useScopeDescriptionsForConsent = useScopeDescriptionsForConsent;
            return this;
        }

        /**
         * @param useScopeDescriptionsForConsent Indicates whether to use scope descriptions for consent.
         * 
         * @return builder
         * 
         */
        public Builder useScopeDescriptionsForConsent(Boolean useScopeDescriptionsForConsent) {
            return useScopeDescriptionsForConsent(Output.of(useScopeDescriptionsForConsent));
        }

        public TenantFlagsArgs build() {
            return $;
        }
    }

}
