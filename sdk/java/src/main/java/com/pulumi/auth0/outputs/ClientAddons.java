// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.ClientAddonsAws;
import com.pulumi.auth0.outputs.ClientAddonsAzureBlob;
import com.pulumi.auth0.outputs.ClientAddonsAzureSb;
import com.pulumi.auth0.outputs.ClientAddonsBox;
import com.pulumi.auth0.outputs.ClientAddonsCloudbees;
import com.pulumi.auth0.outputs.ClientAddonsConcur;
import com.pulumi.auth0.outputs.ClientAddonsDropbox;
import com.pulumi.auth0.outputs.ClientAddonsEchosign;
import com.pulumi.auth0.outputs.ClientAddonsEgnyte;
import com.pulumi.auth0.outputs.ClientAddonsFirebase;
import com.pulumi.auth0.outputs.ClientAddonsLayer;
import com.pulumi.auth0.outputs.ClientAddonsMscrm;
import com.pulumi.auth0.outputs.ClientAddonsNewrelic;
import com.pulumi.auth0.outputs.ClientAddonsOffice365;
import com.pulumi.auth0.outputs.ClientAddonsRms;
import com.pulumi.auth0.outputs.ClientAddonsSalesforce;
import com.pulumi.auth0.outputs.ClientAddonsSalesforceApi;
import com.pulumi.auth0.outputs.ClientAddonsSalesforceSandboxApi;
import com.pulumi.auth0.outputs.ClientAddonsSamlp;
import com.pulumi.auth0.outputs.ClientAddonsSapApi;
import com.pulumi.auth0.outputs.ClientAddonsSentry;
import com.pulumi.auth0.outputs.ClientAddonsSharepoint;
import com.pulumi.auth0.outputs.ClientAddonsSlack;
import com.pulumi.auth0.outputs.ClientAddonsSpringcm;
import com.pulumi.auth0.outputs.ClientAddonsSsoIntegration;
import com.pulumi.auth0.outputs.ClientAddonsWams;
import com.pulumi.auth0.outputs.ClientAddonsWsfed;
import com.pulumi.auth0.outputs.ClientAddonsZendesk;
import com.pulumi.auth0.outputs.ClientAddonsZoom;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientAddons {
    /**
     * @return AWS Addon configuration.
     * 
     */
    private @Nullable ClientAddonsAws aws;
    /**
     * @return Azure Blob Storage Addon configuration.
     * 
     */
    private @Nullable ClientAddonsAzureBlob azureBlob;
    /**
     * @return Azure Storage Bus Addon configuration.
     * 
     */
    private @Nullable ClientAddonsAzureSb azureSb;
    /**
     * @return Box SSO indicator (no configuration settings needed for Box SSO).
     * 
     */
    private @Nullable ClientAddonsBox box;
    /**
     * @return CloudBees SSO indicator (no configuration settings needed for CloudBees SSO).
     * 
     */
    private @Nullable ClientAddonsCloudbees cloudbees;
    /**
     * @return Concur SSO indicator (no configuration settings needed for Concur SSO).
     * 
     */
    private @Nullable ClientAddonsConcur concur;
    /**
     * @return Dropbox SSO indicator (no configuration settings needed for Dropbox SSO).
     * 
     */
    private @Nullable ClientAddonsDropbox dropbox;
    /**
     * @return Adobe EchoSign SSO configuration.
     * 
     */
    private @Nullable ClientAddonsEchosign echosign;
    /**
     * @return Egnyte SSO configuration.
     * 
     */
    private @Nullable ClientAddonsEgnyte egnyte;
    /**
     * @return Google Firebase addon configuration.
     * 
     */
    private @Nullable ClientAddonsFirebase firebase;
    /**
     * @return Layer addon configuration.
     * 
     */
    private @Nullable ClientAddonsLayer layer;
    /**
     * @return Microsoft Dynamics CRM SSO configuration.
     * 
     */
    private @Nullable ClientAddonsMscrm mscrm;
    /**
     * @return New Relic SSO configuration.
     * 
     */
    private @Nullable ClientAddonsNewrelic newrelic;
    /**
     * @return Microsoft Office 365 SSO configuration.
     * 
     */
    private @Nullable ClientAddonsOffice365 office365;
    /**
     * @return Active Directory Rights Management Service SSO configuration.
     * 
     */
    private @Nullable ClientAddonsRms rms;
    /**
     * @return Salesforce SSO configuration.
     * 
     */
    private @Nullable ClientAddonsSalesforce salesforce;
    /**
     * @return Salesforce API addon configuration.
     * 
     */
    private @Nullable ClientAddonsSalesforceApi salesforceApi;
    /**
     * @return Salesforce Sandbox addon configuration.
     * 
     */
    private @Nullable ClientAddonsSalesforceSandboxApi salesforceSandboxApi;
    /**
     * @return Configuration settings for a SAML add-on.
     * 
     */
    private @Nullable ClientAddonsSamlp samlp;
    /**
     * @return SAP API addon configuration.
     * 
     */
    private @Nullable ClientAddonsSapApi sapApi;
    /**
     * @return Sentry SSO configuration.
     * 
     */
    private @Nullable ClientAddonsSentry sentry;
    /**
     * @return SharePoint SSO configuration.
     * 
     */
    private @Nullable ClientAddonsSharepoint sharepoint;
    /**
     * @return Slack team or workspace name usually first segment in your Slack URL, for example `https://acme-org.slack.com` would be `acme-org`.
     * 
     */
    private @Nullable ClientAddonsSlack slack;
    /**
     * @return SpringCM SSO configuration.
     * 
     */
    private @Nullable ClientAddonsSpringcm springcm;
    /**
     * @return Generic SSO configuration.
     * 
     */
    private @Nullable ClientAddonsSsoIntegration ssoIntegration;
    /**
     * @return Windows Azure Mobile Services addon configuration.
     * 
     */
    private @Nullable ClientAddonsWams wams;
    /**
     * @return WS-Fed (WIF) addon indicator. Actual configuration is stored in `callback` and `client_aliases` properties on the client.
     * 
     */
    private @Nullable ClientAddonsWsfed wsfed;
    /**
     * @return Zendesk SSO configuration.
     * 
     */
    private @Nullable ClientAddonsZendesk zendesk;
    /**
     * @return Zoom SSO configuration.
     * 
     */
    private @Nullable ClientAddonsZoom zoom;

    private ClientAddons() {}
    /**
     * @return AWS Addon configuration.
     * 
     */
    public Optional<ClientAddonsAws> aws() {
        return Optional.ofNullable(this.aws);
    }
    /**
     * @return Azure Blob Storage Addon configuration.
     * 
     */
    public Optional<ClientAddonsAzureBlob> azureBlob() {
        return Optional.ofNullable(this.azureBlob);
    }
    /**
     * @return Azure Storage Bus Addon configuration.
     * 
     */
    public Optional<ClientAddonsAzureSb> azureSb() {
        return Optional.ofNullable(this.azureSb);
    }
    /**
     * @return Box SSO indicator (no configuration settings needed for Box SSO).
     * 
     */
    public Optional<ClientAddonsBox> box() {
        return Optional.ofNullable(this.box);
    }
    /**
     * @return CloudBees SSO indicator (no configuration settings needed for CloudBees SSO).
     * 
     */
    public Optional<ClientAddonsCloudbees> cloudbees() {
        return Optional.ofNullable(this.cloudbees);
    }
    /**
     * @return Concur SSO indicator (no configuration settings needed for Concur SSO).
     * 
     */
    public Optional<ClientAddonsConcur> concur() {
        return Optional.ofNullable(this.concur);
    }
    /**
     * @return Dropbox SSO indicator (no configuration settings needed for Dropbox SSO).
     * 
     */
    public Optional<ClientAddonsDropbox> dropbox() {
        return Optional.ofNullable(this.dropbox);
    }
    /**
     * @return Adobe EchoSign SSO configuration.
     * 
     */
    public Optional<ClientAddonsEchosign> echosign() {
        return Optional.ofNullable(this.echosign);
    }
    /**
     * @return Egnyte SSO configuration.
     * 
     */
    public Optional<ClientAddonsEgnyte> egnyte() {
        return Optional.ofNullable(this.egnyte);
    }
    /**
     * @return Google Firebase addon configuration.
     * 
     */
    public Optional<ClientAddonsFirebase> firebase() {
        return Optional.ofNullable(this.firebase);
    }
    /**
     * @return Layer addon configuration.
     * 
     */
    public Optional<ClientAddonsLayer> layer() {
        return Optional.ofNullable(this.layer);
    }
    /**
     * @return Microsoft Dynamics CRM SSO configuration.
     * 
     */
    public Optional<ClientAddonsMscrm> mscrm() {
        return Optional.ofNullable(this.mscrm);
    }
    /**
     * @return New Relic SSO configuration.
     * 
     */
    public Optional<ClientAddonsNewrelic> newrelic() {
        return Optional.ofNullable(this.newrelic);
    }
    /**
     * @return Microsoft Office 365 SSO configuration.
     * 
     */
    public Optional<ClientAddonsOffice365> office365() {
        return Optional.ofNullable(this.office365);
    }
    /**
     * @return Active Directory Rights Management Service SSO configuration.
     * 
     */
    public Optional<ClientAddonsRms> rms() {
        return Optional.ofNullable(this.rms);
    }
    /**
     * @return Salesforce SSO configuration.
     * 
     */
    public Optional<ClientAddonsSalesforce> salesforce() {
        return Optional.ofNullable(this.salesforce);
    }
    /**
     * @return Salesforce API addon configuration.
     * 
     */
    public Optional<ClientAddonsSalesforceApi> salesforceApi() {
        return Optional.ofNullable(this.salesforceApi);
    }
    /**
     * @return Salesforce Sandbox addon configuration.
     * 
     */
    public Optional<ClientAddonsSalesforceSandboxApi> salesforceSandboxApi() {
        return Optional.ofNullable(this.salesforceSandboxApi);
    }
    /**
     * @return Configuration settings for a SAML add-on.
     * 
     */
    public Optional<ClientAddonsSamlp> samlp() {
        return Optional.ofNullable(this.samlp);
    }
    /**
     * @return SAP API addon configuration.
     * 
     */
    public Optional<ClientAddonsSapApi> sapApi() {
        return Optional.ofNullable(this.sapApi);
    }
    /**
     * @return Sentry SSO configuration.
     * 
     */
    public Optional<ClientAddonsSentry> sentry() {
        return Optional.ofNullable(this.sentry);
    }
    /**
     * @return SharePoint SSO configuration.
     * 
     */
    public Optional<ClientAddonsSharepoint> sharepoint() {
        return Optional.ofNullable(this.sharepoint);
    }
    /**
     * @return Slack team or workspace name usually first segment in your Slack URL, for example `https://acme-org.slack.com` would be `acme-org`.
     * 
     */
    public Optional<ClientAddonsSlack> slack() {
        return Optional.ofNullable(this.slack);
    }
    /**
     * @return SpringCM SSO configuration.
     * 
     */
    public Optional<ClientAddonsSpringcm> springcm() {
        return Optional.ofNullable(this.springcm);
    }
    /**
     * @return Generic SSO configuration.
     * 
     */
    public Optional<ClientAddonsSsoIntegration> ssoIntegration() {
        return Optional.ofNullable(this.ssoIntegration);
    }
    /**
     * @return Windows Azure Mobile Services addon configuration.
     * 
     */
    public Optional<ClientAddonsWams> wams() {
        return Optional.ofNullable(this.wams);
    }
    /**
     * @return WS-Fed (WIF) addon indicator. Actual configuration is stored in `callback` and `client_aliases` properties on the client.
     * 
     */
    public Optional<ClientAddonsWsfed> wsfed() {
        return Optional.ofNullable(this.wsfed);
    }
    /**
     * @return Zendesk SSO configuration.
     * 
     */
    public Optional<ClientAddonsZendesk> zendesk() {
        return Optional.ofNullable(this.zendesk);
    }
    /**
     * @return Zoom SSO configuration.
     * 
     */
    public Optional<ClientAddonsZoom> zoom() {
        return Optional.ofNullable(this.zoom);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientAddons defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClientAddonsAws aws;
        private @Nullable ClientAddonsAzureBlob azureBlob;
        private @Nullable ClientAddonsAzureSb azureSb;
        private @Nullable ClientAddonsBox box;
        private @Nullable ClientAddonsCloudbees cloudbees;
        private @Nullable ClientAddonsConcur concur;
        private @Nullable ClientAddonsDropbox dropbox;
        private @Nullable ClientAddonsEchosign echosign;
        private @Nullable ClientAddonsEgnyte egnyte;
        private @Nullable ClientAddonsFirebase firebase;
        private @Nullable ClientAddonsLayer layer;
        private @Nullable ClientAddonsMscrm mscrm;
        private @Nullable ClientAddonsNewrelic newrelic;
        private @Nullable ClientAddonsOffice365 office365;
        private @Nullable ClientAddonsRms rms;
        private @Nullable ClientAddonsSalesforce salesforce;
        private @Nullable ClientAddonsSalesforceApi salesforceApi;
        private @Nullable ClientAddonsSalesforceSandboxApi salesforceSandboxApi;
        private @Nullable ClientAddonsSamlp samlp;
        private @Nullable ClientAddonsSapApi sapApi;
        private @Nullable ClientAddonsSentry sentry;
        private @Nullable ClientAddonsSharepoint sharepoint;
        private @Nullable ClientAddonsSlack slack;
        private @Nullable ClientAddonsSpringcm springcm;
        private @Nullable ClientAddonsSsoIntegration ssoIntegration;
        private @Nullable ClientAddonsWams wams;
        private @Nullable ClientAddonsWsfed wsfed;
        private @Nullable ClientAddonsZendesk zendesk;
        private @Nullable ClientAddonsZoom zoom;
        public Builder() {}
        public Builder(ClientAddons defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aws = defaults.aws;
    	      this.azureBlob = defaults.azureBlob;
    	      this.azureSb = defaults.azureSb;
    	      this.box = defaults.box;
    	      this.cloudbees = defaults.cloudbees;
    	      this.concur = defaults.concur;
    	      this.dropbox = defaults.dropbox;
    	      this.echosign = defaults.echosign;
    	      this.egnyte = defaults.egnyte;
    	      this.firebase = defaults.firebase;
    	      this.layer = defaults.layer;
    	      this.mscrm = defaults.mscrm;
    	      this.newrelic = defaults.newrelic;
    	      this.office365 = defaults.office365;
    	      this.rms = defaults.rms;
    	      this.salesforce = defaults.salesforce;
    	      this.salesforceApi = defaults.salesforceApi;
    	      this.salesforceSandboxApi = defaults.salesforceSandboxApi;
    	      this.samlp = defaults.samlp;
    	      this.sapApi = defaults.sapApi;
    	      this.sentry = defaults.sentry;
    	      this.sharepoint = defaults.sharepoint;
    	      this.slack = defaults.slack;
    	      this.springcm = defaults.springcm;
    	      this.ssoIntegration = defaults.ssoIntegration;
    	      this.wams = defaults.wams;
    	      this.wsfed = defaults.wsfed;
    	      this.zendesk = defaults.zendesk;
    	      this.zoom = defaults.zoom;
        }

        @CustomType.Setter
        public Builder aws(@Nullable ClientAddonsAws aws) {

            this.aws = aws;
            return this;
        }
        @CustomType.Setter
        public Builder azureBlob(@Nullable ClientAddonsAzureBlob azureBlob) {

            this.azureBlob = azureBlob;
            return this;
        }
        @CustomType.Setter
        public Builder azureSb(@Nullable ClientAddonsAzureSb azureSb) {

            this.azureSb = azureSb;
            return this;
        }
        @CustomType.Setter
        public Builder box(@Nullable ClientAddonsBox box) {

            this.box = box;
            return this;
        }
        @CustomType.Setter
        public Builder cloudbees(@Nullable ClientAddonsCloudbees cloudbees) {

            this.cloudbees = cloudbees;
            return this;
        }
        @CustomType.Setter
        public Builder concur(@Nullable ClientAddonsConcur concur) {

            this.concur = concur;
            return this;
        }
        @CustomType.Setter
        public Builder dropbox(@Nullable ClientAddonsDropbox dropbox) {

            this.dropbox = dropbox;
            return this;
        }
        @CustomType.Setter
        public Builder echosign(@Nullable ClientAddonsEchosign echosign) {

            this.echosign = echosign;
            return this;
        }
        @CustomType.Setter
        public Builder egnyte(@Nullable ClientAddonsEgnyte egnyte) {

            this.egnyte = egnyte;
            return this;
        }
        @CustomType.Setter
        public Builder firebase(@Nullable ClientAddonsFirebase firebase) {

            this.firebase = firebase;
            return this;
        }
        @CustomType.Setter
        public Builder layer(@Nullable ClientAddonsLayer layer) {

            this.layer = layer;
            return this;
        }
        @CustomType.Setter
        public Builder mscrm(@Nullable ClientAddonsMscrm mscrm) {

            this.mscrm = mscrm;
            return this;
        }
        @CustomType.Setter
        public Builder newrelic(@Nullable ClientAddonsNewrelic newrelic) {

            this.newrelic = newrelic;
            return this;
        }
        @CustomType.Setter
        public Builder office365(@Nullable ClientAddonsOffice365 office365) {

            this.office365 = office365;
            return this;
        }
        @CustomType.Setter
        public Builder rms(@Nullable ClientAddonsRms rms) {

            this.rms = rms;
            return this;
        }
        @CustomType.Setter
        public Builder salesforce(@Nullable ClientAddonsSalesforce salesforce) {

            this.salesforce = salesforce;
            return this;
        }
        @CustomType.Setter
        public Builder salesforceApi(@Nullable ClientAddonsSalesforceApi salesforceApi) {

            this.salesforceApi = salesforceApi;
            return this;
        }
        @CustomType.Setter
        public Builder salesforceSandboxApi(@Nullable ClientAddonsSalesforceSandboxApi salesforceSandboxApi) {

            this.salesforceSandboxApi = salesforceSandboxApi;
            return this;
        }
        @CustomType.Setter
        public Builder samlp(@Nullable ClientAddonsSamlp samlp) {

            this.samlp = samlp;
            return this;
        }
        @CustomType.Setter
        public Builder sapApi(@Nullable ClientAddonsSapApi sapApi) {

            this.sapApi = sapApi;
            return this;
        }
        @CustomType.Setter
        public Builder sentry(@Nullable ClientAddonsSentry sentry) {

            this.sentry = sentry;
            return this;
        }
        @CustomType.Setter
        public Builder sharepoint(@Nullable ClientAddonsSharepoint sharepoint) {

            this.sharepoint = sharepoint;
            return this;
        }
        @CustomType.Setter
        public Builder slack(@Nullable ClientAddonsSlack slack) {

            this.slack = slack;
            return this;
        }
        @CustomType.Setter
        public Builder springcm(@Nullable ClientAddonsSpringcm springcm) {

            this.springcm = springcm;
            return this;
        }
        @CustomType.Setter
        public Builder ssoIntegration(@Nullable ClientAddonsSsoIntegration ssoIntegration) {

            this.ssoIntegration = ssoIntegration;
            return this;
        }
        @CustomType.Setter
        public Builder wams(@Nullable ClientAddonsWams wams) {

            this.wams = wams;
            return this;
        }
        @CustomType.Setter
        public Builder wsfed(@Nullable ClientAddonsWsfed wsfed) {

            this.wsfed = wsfed;
            return this;
        }
        @CustomType.Setter
        public Builder zendesk(@Nullable ClientAddonsZendesk zendesk) {

            this.zendesk = zendesk;
            return this;
        }
        @CustomType.Setter
        public Builder zoom(@Nullable ClientAddonsZoom zoom) {

            this.zoom = zoom;
            return this;
        }
        public ClientAddons build() {
            final var _resultValue = new ClientAddons();
            _resultValue.aws = aws;
            _resultValue.azureBlob = azureBlob;
            _resultValue.azureSb = azureSb;
            _resultValue.box = box;
            _resultValue.cloudbees = cloudbees;
            _resultValue.concur = concur;
            _resultValue.dropbox = dropbox;
            _resultValue.echosign = echosign;
            _resultValue.egnyte = egnyte;
            _resultValue.firebase = firebase;
            _resultValue.layer = layer;
            _resultValue.mscrm = mscrm;
            _resultValue.newrelic = newrelic;
            _resultValue.office365 = office365;
            _resultValue.rms = rms;
            _resultValue.salesforce = salesforce;
            _resultValue.salesforceApi = salesforceApi;
            _resultValue.salesforceSandboxApi = salesforceSandboxApi;
            _resultValue.samlp = samlp;
            _resultValue.sapApi = sapApi;
            _resultValue.sentry = sentry;
            _resultValue.sharepoint = sharepoint;
            _resultValue.slack = slack;
            _resultValue.springcm = springcm;
            _resultValue.ssoIntegration = ssoIntegration;
            _resultValue.wams = wams;
            _resultValue.wsfed = wsfed;
            _resultValue.zendesk = zendesk;
            _resultValue.zoom = zoom;
            return _resultValue;
        }
    }
}
