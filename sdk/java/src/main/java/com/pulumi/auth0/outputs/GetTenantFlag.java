// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetTenantFlag {
    private Boolean allowLegacyDelegationGrantTypes;
    private Boolean allowLegacyRoGrantTypes;
    private Boolean allowLegacyTokeninfoEndpoint;
    private Boolean dashboardInsightsView;
    private Boolean dashboardLogStreamsNext;
    private Boolean disableClickjackProtectionHeaders;
    private Boolean disableFieldsMapFix;
    private Boolean disableManagementApiSmsObfuscation;
    private Boolean enableAdfsWaadEmailVerification;
    private Boolean enableApisSection;
    private Boolean enableClientConnections;
    private Boolean enableCustomDomainInEmails;
    private Boolean enableDynamicClientRegistration;
    private Boolean enableIdtokenApi2;
    private Boolean enableLegacyLogsSearchV2;
    private Boolean enableLegacyProfile;
    private Boolean enablePipeline2;
    private Boolean enablePublicSignupUserExistsError;
    private Boolean noDiscloseEnterpriseConnections;
    private Boolean revokeRefreshTokenGrant;
    /**
     * @return Configuration settings for Universal Login.
     * 
     */
    private Boolean universalLogin;
    private Boolean useScopeDescriptionsForConsent;

    private GetTenantFlag() {}
    public Boolean allowLegacyDelegationGrantTypes() {
        return this.allowLegacyDelegationGrantTypes;
    }
    public Boolean allowLegacyRoGrantTypes() {
        return this.allowLegacyRoGrantTypes;
    }
    public Boolean allowLegacyTokeninfoEndpoint() {
        return this.allowLegacyTokeninfoEndpoint;
    }
    public Boolean dashboardInsightsView() {
        return this.dashboardInsightsView;
    }
    public Boolean dashboardLogStreamsNext() {
        return this.dashboardLogStreamsNext;
    }
    public Boolean disableClickjackProtectionHeaders() {
        return this.disableClickjackProtectionHeaders;
    }
    public Boolean disableFieldsMapFix() {
        return this.disableFieldsMapFix;
    }
    public Boolean disableManagementApiSmsObfuscation() {
        return this.disableManagementApiSmsObfuscation;
    }
    public Boolean enableAdfsWaadEmailVerification() {
        return this.enableAdfsWaadEmailVerification;
    }
    public Boolean enableApisSection() {
        return this.enableApisSection;
    }
    public Boolean enableClientConnections() {
        return this.enableClientConnections;
    }
    public Boolean enableCustomDomainInEmails() {
        return this.enableCustomDomainInEmails;
    }
    public Boolean enableDynamicClientRegistration() {
        return this.enableDynamicClientRegistration;
    }
    public Boolean enableIdtokenApi2() {
        return this.enableIdtokenApi2;
    }
    public Boolean enableLegacyLogsSearchV2() {
        return this.enableLegacyLogsSearchV2;
    }
    public Boolean enableLegacyProfile() {
        return this.enableLegacyProfile;
    }
    public Boolean enablePipeline2() {
        return this.enablePipeline2;
    }
    public Boolean enablePublicSignupUserExistsError() {
        return this.enablePublicSignupUserExistsError;
    }
    public Boolean noDiscloseEnterpriseConnections() {
        return this.noDiscloseEnterpriseConnections;
    }
    public Boolean revokeRefreshTokenGrant() {
        return this.revokeRefreshTokenGrant;
    }
    /**
     * @return Configuration settings for Universal Login.
     * 
     */
    public Boolean universalLogin() {
        return this.universalLogin;
    }
    public Boolean useScopeDescriptionsForConsent() {
        return this.useScopeDescriptionsForConsent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTenantFlag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowLegacyDelegationGrantTypes;
        private Boolean allowLegacyRoGrantTypes;
        private Boolean allowLegacyTokeninfoEndpoint;
        private Boolean dashboardInsightsView;
        private Boolean dashboardLogStreamsNext;
        private Boolean disableClickjackProtectionHeaders;
        private Boolean disableFieldsMapFix;
        private Boolean disableManagementApiSmsObfuscation;
        private Boolean enableAdfsWaadEmailVerification;
        private Boolean enableApisSection;
        private Boolean enableClientConnections;
        private Boolean enableCustomDomainInEmails;
        private Boolean enableDynamicClientRegistration;
        private Boolean enableIdtokenApi2;
        private Boolean enableLegacyLogsSearchV2;
        private Boolean enableLegacyProfile;
        private Boolean enablePipeline2;
        private Boolean enablePublicSignupUserExistsError;
        private Boolean noDiscloseEnterpriseConnections;
        private Boolean revokeRefreshTokenGrant;
        private Boolean universalLogin;
        private Boolean useScopeDescriptionsForConsent;
        public Builder() {}
        public Builder(GetTenantFlag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowLegacyDelegationGrantTypes = defaults.allowLegacyDelegationGrantTypes;
    	      this.allowLegacyRoGrantTypes = defaults.allowLegacyRoGrantTypes;
    	      this.allowLegacyTokeninfoEndpoint = defaults.allowLegacyTokeninfoEndpoint;
    	      this.dashboardInsightsView = defaults.dashboardInsightsView;
    	      this.dashboardLogStreamsNext = defaults.dashboardLogStreamsNext;
    	      this.disableClickjackProtectionHeaders = defaults.disableClickjackProtectionHeaders;
    	      this.disableFieldsMapFix = defaults.disableFieldsMapFix;
    	      this.disableManagementApiSmsObfuscation = defaults.disableManagementApiSmsObfuscation;
    	      this.enableAdfsWaadEmailVerification = defaults.enableAdfsWaadEmailVerification;
    	      this.enableApisSection = defaults.enableApisSection;
    	      this.enableClientConnections = defaults.enableClientConnections;
    	      this.enableCustomDomainInEmails = defaults.enableCustomDomainInEmails;
    	      this.enableDynamicClientRegistration = defaults.enableDynamicClientRegistration;
    	      this.enableIdtokenApi2 = defaults.enableIdtokenApi2;
    	      this.enableLegacyLogsSearchV2 = defaults.enableLegacyLogsSearchV2;
    	      this.enableLegacyProfile = defaults.enableLegacyProfile;
    	      this.enablePipeline2 = defaults.enablePipeline2;
    	      this.enablePublicSignupUserExistsError = defaults.enablePublicSignupUserExistsError;
    	      this.noDiscloseEnterpriseConnections = defaults.noDiscloseEnterpriseConnections;
    	      this.revokeRefreshTokenGrant = defaults.revokeRefreshTokenGrant;
    	      this.universalLogin = defaults.universalLogin;
    	      this.useScopeDescriptionsForConsent = defaults.useScopeDescriptionsForConsent;
        }

        @CustomType.Setter
        public Builder allowLegacyDelegationGrantTypes(Boolean allowLegacyDelegationGrantTypes) {
            this.allowLegacyDelegationGrantTypes = Objects.requireNonNull(allowLegacyDelegationGrantTypes);
            return this;
        }
        @CustomType.Setter
        public Builder allowLegacyRoGrantTypes(Boolean allowLegacyRoGrantTypes) {
            this.allowLegacyRoGrantTypes = Objects.requireNonNull(allowLegacyRoGrantTypes);
            return this;
        }
        @CustomType.Setter
        public Builder allowLegacyTokeninfoEndpoint(Boolean allowLegacyTokeninfoEndpoint) {
            this.allowLegacyTokeninfoEndpoint = Objects.requireNonNull(allowLegacyTokeninfoEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder dashboardInsightsView(Boolean dashboardInsightsView) {
            this.dashboardInsightsView = Objects.requireNonNull(dashboardInsightsView);
            return this;
        }
        @CustomType.Setter
        public Builder dashboardLogStreamsNext(Boolean dashboardLogStreamsNext) {
            this.dashboardLogStreamsNext = Objects.requireNonNull(dashboardLogStreamsNext);
            return this;
        }
        @CustomType.Setter
        public Builder disableClickjackProtectionHeaders(Boolean disableClickjackProtectionHeaders) {
            this.disableClickjackProtectionHeaders = Objects.requireNonNull(disableClickjackProtectionHeaders);
            return this;
        }
        @CustomType.Setter
        public Builder disableFieldsMapFix(Boolean disableFieldsMapFix) {
            this.disableFieldsMapFix = Objects.requireNonNull(disableFieldsMapFix);
            return this;
        }
        @CustomType.Setter
        public Builder disableManagementApiSmsObfuscation(Boolean disableManagementApiSmsObfuscation) {
            this.disableManagementApiSmsObfuscation = Objects.requireNonNull(disableManagementApiSmsObfuscation);
            return this;
        }
        @CustomType.Setter
        public Builder enableAdfsWaadEmailVerification(Boolean enableAdfsWaadEmailVerification) {
            this.enableAdfsWaadEmailVerification = Objects.requireNonNull(enableAdfsWaadEmailVerification);
            return this;
        }
        @CustomType.Setter
        public Builder enableApisSection(Boolean enableApisSection) {
            this.enableApisSection = Objects.requireNonNull(enableApisSection);
            return this;
        }
        @CustomType.Setter
        public Builder enableClientConnections(Boolean enableClientConnections) {
            this.enableClientConnections = Objects.requireNonNull(enableClientConnections);
            return this;
        }
        @CustomType.Setter
        public Builder enableCustomDomainInEmails(Boolean enableCustomDomainInEmails) {
            this.enableCustomDomainInEmails = Objects.requireNonNull(enableCustomDomainInEmails);
            return this;
        }
        @CustomType.Setter
        public Builder enableDynamicClientRegistration(Boolean enableDynamicClientRegistration) {
            this.enableDynamicClientRegistration = Objects.requireNonNull(enableDynamicClientRegistration);
            return this;
        }
        @CustomType.Setter
        public Builder enableIdtokenApi2(Boolean enableIdtokenApi2) {
            this.enableIdtokenApi2 = Objects.requireNonNull(enableIdtokenApi2);
            return this;
        }
        @CustomType.Setter
        public Builder enableLegacyLogsSearchV2(Boolean enableLegacyLogsSearchV2) {
            this.enableLegacyLogsSearchV2 = Objects.requireNonNull(enableLegacyLogsSearchV2);
            return this;
        }
        @CustomType.Setter
        public Builder enableLegacyProfile(Boolean enableLegacyProfile) {
            this.enableLegacyProfile = Objects.requireNonNull(enableLegacyProfile);
            return this;
        }
        @CustomType.Setter
        public Builder enablePipeline2(Boolean enablePipeline2) {
            this.enablePipeline2 = Objects.requireNonNull(enablePipeline2);
            return this;
        }
        @CustomType.Setter
        public Builder enablePublicSignupUserExistsError(Boolean enablePublicSignupUserExistsError) {
            this.enablePublicSignupUserExistsError = Objects.requireNonNull(enablePublicSignupUserExistsError);
            return this;
        }
        @CustomType.Setter
        public Builder noDiscloseEnterpriseConnections(Boolean noDiscloseEnterpriseConnections) {
            this.noDiscloseEnterpriseConnections = Objects.requireNonNull(noDiscloseEnterpriseConnections);
            return this;
        }
        @CustomType.Setter
        public Builder revokeRefreshTokenGrant(Boolean revokeRefreshTokenGrant) {
            this.revokeRefreshTokenGrant = Objects.requireNonNull(revokeRefreshTokenGrant);
            return this;
        }
        @CustomType.Setter
        public Builder universalLogin(Boolean universalLogin) {
            this.universalLogin = Objects.requireNonNull(universalLogin);
            return this;
        }
        @CustomType.Setter
        public Builder useScopeDescriptionsForConsent(Boolean useScopeDescriptionsForConsent) {
            this.useScopeDescriptionsForConsent = Objects.requireNonNull(useScopeDescriptionsForConsent);
            return this;
        }
        public GetTenantFlag build() {
            final var o = new GetTenantFlag();
            o.allowLegacyDelegationGrantTypes = allowLegacyDelegationGrantTypes;
            o.allowLegacyRoGrantTypes = allowLegacyRoGrantTypes;
            o.allowLegacyTokeninfoEndpoint = allowLegacyTokeninfoEndpoint;
            o.dashboardInsightsView = dashboardInsightsView;
            o.dashboardLogStreamsNext = dashboardLogStreamsNext;
            o.disableClickjackProtectionHeaders = disableClickjackProtectionHeaders;
            o.disableFieldsMapFix = disableFieldsMapFix;
            o.disableManagementApiSmsObfuscation = disableManagementApiSmsObfuscation;
            o.enableAdfsWaadEmailVerification = enableAdfsWaadEmailVerification;
            o.enableApisSection = enableApisSection;
            o.enableClientConnections = enableClientConnections;
            o.enableCustomDomainInEmails = enableCustomDomainInEmails;
            o.enableDynamicClientRegistration = enableDynamicClientRegistration;
            o.enableIdtokenApi2 = enableIdtokenApi2;
            o.enableLegacyLogsSearchV2 = enableLegacyLogsSearchV2;
            o.enableLegacyProfile = enableLegacyProfile;
            o.enablePipeline2 = enablePipeline2;
            o.enablePublicSignupUserExistsError = enablePublicSignupUserExistsError;
            o.noDiscloseEnterpriseConnections = noDiscloseEnterpriseConnections;
            o.revokeRefreshTokenGrant = revokeRefreshTokenGrant;
            o.universalLogin = universalLogin;
            o.useScopeDescriptionsForConsent = useScopeDescriptionsForConsent;
            return o;
        }
    }
}
