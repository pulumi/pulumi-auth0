// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GetClientAddonAw;
import com.pulumi.auth0.outputs.GetClientAddonAzureBlob;
import com.pulumi.auth0.outputs.GetClientAddonAzureSb;
import com.pulumi.auth0.outputs.GetClientAddonBox;
import com.pulumi.auth0.outputs.GetClientAddonCloudbee;
import com.pulumi.auth0.outputs.GetClientAddonConcur;
import com.pulumi.auth0.outputs.GetClientAddonDropbox;
import com.pulumi.auth0.outputs.GetClientAddonEchosign;
import com.pulumi.auth0.outputs.GetClientAddonEgnyte;
import com.pulumi.auth0.outputs.GetClientAddonFirebase;
import com.pulumi.auth0.outputs.GetClientAddonLayer;
import com.pulumi.auth0.outputs.GetClientAddonMscrm;
import com.pulumi.auth0.outputs.GetClientAddonNewrelic;
import com.pulumi.auth0.outputs.GetClientAddonOffice365;
import com.pulumi.auth0.outputs.GetClientAddonRm;
import com.pulumi.auth0.outputs.GetClientAddonSalesforce;
import com.pulumi.auth0.outputs.GetClientAddonSalesforceApi;
import com.pulumi.auth0.outputs.GetClientAddonSalesforceSandboxApi;
import com.pulumi.auth0.outputs.GetClientAddonSamlp;
import com.pulumi.auth0.outputs.GetClientAddonSapApi;
import com.pulumi.auth0.outputs.GetClientAddonSentry;
import com.pulumi.auth0.outputs.GetClientAddonSharepoint;
import com.pulumi.auth0.outputs.GetClientAddonSlack;
import com.pulumi.auth0.outputs.GetClientAddonSpringcm;
import com.pulumi.auth0.outputs.GetClientAddonSsoIntegration;
import com.pulumi.auth0.outputs.GetClientAddonWam;
import com.pulumi.auth0.outputs.GetClientAddonWsfed;
import com.pulumi.auth0.outputs.GetClientAddonZendesk;
import com.pulumi.auth0.outputs.GetClientAddonZoom;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClientAddon {
    /**
     * @return AWS Addon configuration.
     * 
     */
    private List<GetClientAddonAw> aws;
    /**
     * @return Azure Blob Storage Addon configuration.
     * 
     */
    private List<GetClientAddonAzureBlob> azureBlobs;
    /**
     * @return Azure Storage Bus Addon configuration.
     * 
     */
    private List<GetClientAddonAzureSb> azureSbs;
    /**
     * @return Box SSO indicator (no configuration settings needed for Box SSO).
     * 
     */
    private List<GetClientAddonBox> boxes;
    /**
     * @return CloudBees SSO indicator (no configuration settings needed for CloudBees SSO).
     * 
     */
    private List<GetClientAddonCloudbee> cloudbees;
    /**
     * @return Concur SSO indicator (no configuration settings needed for Concur SSO).
     * 
     */
    private List<GetClientAddonConcur> concurs;
    /**
     * @return Dropbox SSO indicator (no configuration settings needed for Dropbox SSO).
     * 
     */
    private List<GetClientAddonDropbox> dropboxes;
    /**
     * @return Adobe EchoSign SSO configuration.
     * 
     */
    private List<GetClientAddonEchosign> echosigns;
    /**
     * @return Egnyte SSO configuration.
     * 
     */
    private List<GetClientAddonEgnyte> egnytes;
    /**
     * @return Google Firebase addon configuration.
     * 
     */
    private List<GetClientAddonFirebase> firebases;
    /**
     * @return Layer addon configuration.
     * 
     */
    private List<GetClientAddonLayer> layers;
    /**
     * @return Microsoft Dynamics CRM SSO configuration.
     * 
     */
    private List<GetClientAddonMscrm> mscrms;
    /**
     * @return New Relic SSO configuration.
     * 
     */
    private List<GetClientAddonNewrelic> newrelics;
    /**
     * @return Microsoft Office 365 SSO configuration.
     * 
     */
    private List<GetClientAddonOffice365> office365s;
    /**
     * @return Active Directory Rights Management Service SSO configuration.
     * 
     */
    private List<GetClientAddonRm> rms;
    /**
     * @return Salesforce API addon configuration.
     * 
     */
    private List<GetClientAddonSalesforceApi> salesforceApis;
    /**
     * @return Salesforce Sandbox addon configuration.
     * 
     */
    private List<GetClientAddonSalesforceSandboxApi> salesforceSandboxApis;
    /**
     * @return Salesforce SSO configuration.
     * 
     */
    private List<GetClientAddonSalesforce> salesforces;
    /**
     * @return Configuration settings for a SAML add-on.
     * 
     */
    private List<GetClientAddonSamlp> samlps;
    /**
     * @return SAP API addon configuration.
     * 
     */
    private List<GetClientAddonSapApi> sapApis;
    /**
     * @return Sentry SSO configuration.
     * 
     */
    private List<GetClientAddonSentry> sentries;
    /**
     * @return SharePoint SSO configuration.
     * 
     */
    private List<GetClientAddonSharepoint> sharepoints;
    /**
     * @return Slack team or workspace name usually first segment in your Slack URL, for example `https://acme-org.slack.com` would be `acme-org`.
     * 
     */
    private List<GetClientAddonSlack> slacks;
    /**
     * @return SpringCM SSO configuration.
     * 
     */
    private List<GetClientAddonSpringcm> springcms;
    /**
     * @return Generic SSO configuration.
     * 
     */
    private List<GetClientAddonSsoIntegration> ssoIntegrations;
    /**
     * @return Windows Azure Mobile Services addon configuration.
     * 
     */
    private List<GetClientAddonWam> wams;
    /**
     * @return WS-Fed (WIF) addon indicator. Actual configuration is stored in `callback` and `client_aliases` properties on the client.
     * 
     */
    private List<GetClientAddonWsfed> wsfeds;
    /**
     * @return Zendesk SSO configuration.
     * 
     */
    private List<GetClientAddonZendesk> zendesks;
    /**
     * @return Zoom SSO configuration.
     * 
     */
    private List<GetClientAddonZoom> zooms;

    private GetClientAddon() {}
    /**
     * @return AWS Addon configuration.
     * 
     */
    public List<GetClientAddonAw> aws() {
        return this.aws;
    }
    /**
     * @return Azure Blob Storage Addon configuration.
     * 
     */
    public List<GetClientAddonAzureBlob> azureBlobs() {
        return this.azureBlobs;
    }
    /**
     * @return Azure Storage Bus Addon configuration.
     * 
     */
    public List<GetClientAddonAzureSb> azureSbs() {
        return this.azureSbs;
    }
    /**
     * @return Box SSO indicator (no configuration settings needed for Box SSO).
     * 
     */
    public List<GetClientAddonBox> boxes() {
        return this.boxes;
    }
    /**
     * @return CloudBees SSO indicator (no configuration settings needed for CloudBees SSO).
     * 
     */
    public List<GetClientAddonCloudbee> cloudbees() {
        return this.cloudbees;
    }
    /**
     * @return Concur SSO indicator (no configuration settings needed for Concur SSO).
     * 
     */
    public List<GetClientAddonConcur> concurs() {
        return this.concurs;
    }
    /**
     * @return Dropbox SSO indicator (no configuration settings needed for Dropbox SSO).
     * 
     */
    public List<GetClientAddonDropbox> dropboxes() {
        return this.dropboxes;
    }
    /**
     * @return Adobe EchoSign SSO configuration.
     * 
     */
    public List<GetClientAddonEchosign> echosigns() {
        return this.echosigns;
    }
    /**
     * @return Egnyte SSO configuration.
     * 
     */
    public List<GetClientAddonEgnyte> egnytes() {
        return this.egnytes;
    }
    /**
     * @return Google Firebase addon configuration.
     * 
     */
    public List<GetClientAddonFirebase> firebases() {
        return this.firebases;
    }
    /**
     * @return Layer addon configuration.
     * 
     */
    public List<GetClientAddonLayer> layers() {
        return this.layers;
    }
    /**
     * @return Microsoft Dynamics CRM SSO configuration.
     * 
     */
    public List<GetClientAddonMscrm> mscrms() {
        return this.mscrms;
    }
    /**
     * @return New Relic SSO configuration.
     * 
     */
    public List<GetClientAddonNewrelic> newrelics() {
        return this.newrelics;
    }
    /**
     * @return Microsoft Office 365 SSO configuration.
     * 
     */
    public List<GetClientAddonOffice365> office365s() {
        return this.office365s;
    }
    /**
     * @return Active Directory Rights Management Service SSO configuration.
     * 
     */
    public List<GetClientAddonRm> rms() {
        return this.rms;
    }
    /**
     * @return Salesforce API addon configuration.
     * 
     */
    public List<GetClientAddonSalesforceApi> salesforceApis() {
        return this.salesforceApis;
    }
    /**
     * @return Salesforce Sandbox addon configuration.
     * 
     */
    public List<GetClientAddonSalesforceSandboxApi> salesforceSandboxApis() {
        return this.salesforceSandboxApis;
    }
    /**
     * @return Salesforce SSO configuration.
     * 
     */
    public List<GetClientAddonSalesforce> salesforces() {
        return this.salesforces;
    }
    /**
     * @return Configuration settings for a SAML add-on.
     * 
     */
    public List<GetClientAddonSamlp> samlps() {
        return this.samlps;
    }
    /**
     * @return SAP API addon configuration.
     * 
     */
    public List<GetClientAddonSapApi> sapApis() {
        return this.sapApis;
    }
    /**
     * @return Sentry SSO configuration.
     * 
     */
    public List<GetClientAddonSentry> sentries() {
        return this.sentries;
    }
    /**
     * @return SharePoint SSO configuration.
     * 
     */
    public List<GetClientAddonSharepoint> sharepoints() {
        return this.sharepoints;
    }
    /**
     * @return Slack team or workspace name usually first segment in your Slack URL, for example `https://acme-org.slack.com` would be `acme-org`.
     * 
     */
    public List<GetClientAddonSlack> slacks() {
        return this.slacks;
    }
    /**
     * @return SpringCM SSO configuration.
     * 
     */
    public List<GetClientAddonSpringcm> springcms() {
        return this.springcms;
    }
    /**
     * @return Generic SSO configuration.
     * 
     */
    public List<GetClientAddonSsoIntegration> ssoIntegrations() {
        return this.ssoIntegrations;
    }
    /**
     * @return Windows Azure Mobile Services addon configuration.
     * 
     */
    public List<GetClientAddonWam> wams() {
        return this.wams;
    }
    /**
     * @return WS-Fed (WIF) addon indicator. Actual configuration is stored in `callback` and `client_aliases` properties on the client.
     * 
     */
    public List<GetClientAddonWsfed> wsfeds() {
        return this.wsfeds;
    }
    /**
     * @return Zendesk SSO configuration.
     * 
     */
    public List<GetClientAddonZendesk> zendesks() {
        return this.zendesks;
    }
    /**
     * @return Zoom SSO configuration.
     * 
     */
    public List<GetClientAddonZoom> zooms() {
        return this.zooms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientAddon defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetClientAddonAw> aws;
        private List<GetClientAddonAzureBlob> azureBlobs;
        private List<GetClientAddonAzureSb> azureSbs;
        private List<GetClientAddonBox> boxes;
        private List<GetClientAddonCloudbee> cloudbees;
        private List<GetClientAddonConcur> concurs;
        private List<GetClientAddonDropbox> dropboxes;
        private List<GetClientAddonEchosign> echosigns;
        private List<GetClientAddonEgnyte> egnytes;
        private List<GetClientAddonFirebase> firebases;
        private List<GetClientAddonLayer> layers;
        private List<GetClientAddonMscrm> mscrms;
        private List<GetClientAddonNewrelic> newrelics;
        private List<GetClientAddonOffice365> office365s;
        private List<GetClientAddonRm> rms;
        private List<GetClientAddonSalesforceApi> salesforceApis;
        private List<GetClientAddonSalesforceSandboxApi> salesforceSandboxApis;
        private List<GetClientAddonSalesforce> salesforces;
        private List<GetClientAddonSamlp> samlps;
        private List<GetClientAddonSapApi> sapApis;
        private List<GetClientAddonSentry> sentries;
        private List<GetClientAddonSharepoint> sharepoints;
        private List<GetClientAddonSlack> slacks;
        private List<GetClientAddonSpringcm> springcms;
        private List<GetClientAddonSsoIntegration> ssoIntegrations;
        private List<GetClientAddonWam> wams;
        private List<GetClientAddonWsfed> wsfeds;
        private List<GetClientAddonZendesk> zendesks;
        private List<GetClientAddonZoom> zooms;
        public Builder() {}
        public Builder(GetClientAddon defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aws = defaults.aws;
    	      this.azureBlobs = defaults.azureBlobs;
    	      this.azureSbs = defaults.azureSbs;
    	      this.boxes = defaults.boxes;
    	      this.cloudbees = defaults.cloudbees;
    	      this.concurs = defaults.concurs;
    	      this.dropboxes = defaults.dropboxes;
    	      this.echosigns = defaults.echosigns;
    	      this.egnytes = defaults.egnytes;
    	      this.firebases = defaults.firebases;
    	      this.layers = defaults.layers;
    	      this.mscrms = defaults.mscrms;
    	      this.newrelics = defaults.newrelics;
    	      this.office365s = defaults.office365s;
    	      this.rms = defaults.rms;
    	      this.salesforceApis = defaults.salesforceApis;
    	      this.salesforceSandboxApis = defaults.salesforceSandboxApis;
    	      this.salesforces = defaults.salesforces;
    	      this.samlps = defaults.samlps;
    	      this.sapApis = defaults.sapApis;
    	      this.sentries = defaults.sentries;
    	      this.sharepoints = defaults.sharepoints;
    	      this.slacks = defaults.slacks;
    	      this.springcms = defaults.springcms;
    	      this.ssoIntegrations = defaults.ssoIntegrations;
    	      this.wams = defaults.wams;
    	      this.wsfeds = defaults.wsfeds;
    	      this.zendesks = defaults.zendesks;
    	      this.zooms = defaults.zooms;
        }

        @CustomType.Setter
        public Builder aws(List<GetClientAddonAw> aws) {
            if (aws == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "aws");
            }
            this.aws = aws;
            return this;
        }
        public Builder aws(GetClientAddonAw... aws) {
            return aws(List.of(aws));
        }
        @CustomType.Setter
        public Builder azureBlobs(List<GetClientAddonAzureBlob> azureBlobs) {
            if (azureBlobs == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "azureBlobs");
            }
            this.azureBlobs = azureBlobs;
            return this;
        }
        public Builder azureBlobs(GetClientAddonAzureBlob... azureBlobs) {
            return azureBlobs(List.of(azureBlobs));
        }
        @CustomType.Setter
        public Builder azureSbs(List<GetClientAddonAzureSb> azureSbs) {
            if (azureSbs == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "azureSbs");
            }
            this.azureSbs = azureSbs;
            return this;
        }
        public Builder azureSbs(GetClientAddonAzureSb... azureSbs) {
            return azureSbs(List.of(azureSbs));
        }
        @CustomType.Setter
        public Builder boxes(List<GetClientAddonBox> boxes) {
            if (boxes == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "boxes");
            }
            this.boxes = boxes;
            return this;
        }
        public Builder boxes(GetClientAddonBox... boxes) {
            return boxes(List.of(boxes));
        }
        @CustomType.Setter
        public Builder cloudbees(List<GetClientAddonCloudbee> cloudbees) {
            if (cloudbees == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "cloudbees");
            }
            this.cloudbees = cloudbees;
            return this;
        }
        public Builder cloudbees(GetClientAddonCloudbee... cloudbees) {
            return cloudbees(List.of(cloudbees));
        }
        @CustomType.Setter
        public Builder concurs(List<GetClientAddonConcur> concurs) {
            if (concurs == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "concurs");
            }
            this.concurs = concurs;
            return this;
        }
        public Builder concurs(GetClientAddonConcur... concurs) {
            return concurs(List.of(concurs));
        }
        @CustomType.Setter
        public Builder dropboxes(List<GetClientAddonDropbox> dropboxes) {
            if (dropboxes == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "dropboxes");
            }
            this.dropboxes = dropboxes;
            return this;
        }
        public Builder dropboxes(GetClientAddonDropbox... dropboxes) {
            return dropboxes(List.of(dropboxes));
        }
        @CustomType.Setter
        public Builder echosigns(List<GetClientAddonEchosign> echosigns) {
            if (echosigns == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "echosigns");
            }
            this.echosigns = echosigns;
            return this;
        }
        public Builder echosigns(GetClientAddonEchosign... echosigns) {
            return echosigns(List.of(echosigns));
        }
        @CustomType.Setter
        public Builder egnytes(List<GetClientAddonEgnyte> egnytes) {
            if (egnytes == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "egnytes");
            }
            this.egnytes = egnytes;
            return this;
        }
        public Builder egnytes(GetClientAddonEgnyte... egnytes) {
            return egnytes(List.of(egnytes));
        }
        @CustomType.Setter
        public Builder firebases(List<GetClientAddonFirebase> firebases) {
            if (firebases == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "firebases");
            }
            this.firebases = firebases;
            return this;
        }
        public Builder firebases(GetClientAddonFirebase... firebases) {
            return firebases(List.of(firebases));
        }
        @CustomType.Setter
        public Builder layers(List<GetClientAddonLayer> layers) {
            if (layers == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "layers");
            }
            this.layers = layers;
            return this;
        }
        public Builder layers(GetClientAddonLayer... layers) {
            return layers(List.of(layers));
        }
        @CustomType.Setter
        public Builder mscrms(List<GetClientAddonMscrm> mscrms) {
            if (mscrms == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "mscrms");
            }
            this.mscrms = mscrms;
            return this;
        }
        public Builder mscrms(GetClientAddonMscrm... mscrms) {
            return mscrms(List.of(mscrms));
        }
        @CustomType.Setter
        public Builder newrelics(List<GetClientAddonNewrelic> newrelics) {
            if (newrelics == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "newrelics");
            }
            this.newrelics = newrelics;
            return this;
        }
        public Builder newrelics(GetClientAddonNewrelic... newrelics) {
            return newrelics(List.of(newrelics));
        }
        @CustomType.Setter
        public Builder office365s(List<GetClientAddonOffice365> office365s) {
            if (office365s == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "office365s");
            }
            this.office365s = office365s;
            return this;
        }
        public Builder office365s(GetClientAddonOffice365... office365s) {
            return office365s(List.of(office365s));
        }
        @CustomType.Setter
        public Builder rms(List<GetClientAddonRm> rms) {
            if (rms == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "rms");
            }
            this.rms = rms;
            return this;
        }
        public Builder rms(GetClientAddonRm... rms) {
            return rms(List.of(rms));
        }
        @CustomType.Setter
        public Builder salesforceApis(List<GetClientAddonSalesforceApi> salesforceApis) {
            if (salesforceApis == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "salesforceApis");
            }
            this.salesforceApis = salesforceApis;
            return this;
        }
        public Builder salesforceApis(GetClientAddonSalesforceApi... salesforceApis) {
            return salesforceApis(List.of(salesforceApis));
        }
        @CustomType.Setter
        public Builder salesforceSandboxApis(List<GetClientAddonSalesforceSandboxApi> salesforceSandboxApis) {
            if (salesforceSandboxApis == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "salesforceSandboxApis");
            }
            this.salesforceSandboxApis = salesforceSandboxApis;
            return this;
        }
        public Builder salesforceSandboxApis(GetClientAddonSalesforceSandboxApi... salesforceSandboxApis) {
            return salesforceSandboxApis(List.of(salesforceSandboxApis));
        }
        @CustomType.Setter
        public Builder salesforces(List<GetClientAddonSalesforce> salesforces) {
            if (salesforces == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "salesforces");
            }
            this.salesforces = salesforces;
            return this;
        }
        public Builder salesforces(GetClientAddonSalesforce... salesforces) {
            return salesforces(List.of(salesforces));
        }
        @CustomType.Setter
        public Builder samlps(List<GetClientAddonSamlp> samlps) {
            if (samlps == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "samlps");
            }
            this.samlps = samlps;
            return this;
        }
        public Builder samlps(GetClientAddonSamlp... samlps) {
            return samlps(List.of(samlps));
        }
        @CustomType.Setter
        public Builder sapApis(List<GetClientAddonSapApi> sapApis) {
            if (sapApis == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "sapApis");
            }
            this.sapApis = sapApis;
            return this;
        }
        public Builder sapApis(GetClientAddonSapApi... sapApis) {
            return sapApis(List.of(sapApis));
        }
        @CustomType.Setter
        public Builder sentries(List<GetClientAddonSentry> sentries) {
            if (sentries == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "sentries");
            }
            this.sentries = sentries;
            return this;
        }
        public Builder sentries(GetClientAddonSentry... sentries) {
            return sentries(List.of(sentries));
        }
        @CustomType.Setter
        public Builder sharepoints(List<GetClientAddonSharepoint> sharepoints) {
            if (sharepoints == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "sharepoints");
            }
            this.sharepoints = sharepoints;
            return this;
        }
        public Builder sharepoints(GetClientAddonSharepoint... sharepoints) {
            return sharepoints(List.of(sharepoints));
        }
        @CustomType.Setter
        public Builder slacks(List<GetClientAddonSlack> slacks) {
            if (slacks == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "slacks");
            }
            this.slacks = slacks;
            return this;
        }
        public Builder slacks(GetClientAddonSlack... slacks) {
            return slacks(List.of(slacks));
        }
        @CustomType.Setter
        public Builder springcms(List<GetClientAddonSpringcm> springcms) {
            if (springcms == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "springcms");
            }
            this.springcms = springcms;
            return this;
        }
        public Builder springcms(GetClientAddonSpringcm... springcms) {
            return springcms(List.of(springcms));
        }
        @CustomType.Setter
        public Builder ssoIntegrations(List<GetClientAddonSsoIntegration> ssoIntegrations) {
            if (ssoIntegrations == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "ssoIntegrations");
            }
            this.ssoIntegrations = ssoIntegrations;
            return this;
        }
        public Builder ssoIntegrations(GetClientAddonSsoIntegration... ssoIntegrations) {
            return ssoIntegrations(List.of(ssoIntegrations));
        }
        @CustomType.Setter
        public Builder wams(List<GetClientAddonWam> wams) {
            if (wams == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "wams");
            }
            this.wams = wams;
            return this;
        }
        public Builder wams(GetClientAddonWam... wams) {
            return wams(List.of(wams));
        }
        @CustomType.Setter
        public Builder wsfeds(List<GetClientAddonWsfed> wsfeds) {
            if (wsfeds == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "wsfeds");
            }
            this.wsfeds = wsfeds;
            return this;
        }
        public Builder wsfeds(GetClientAddonWsfed... wsfeds) {
            return wsfeds(List.of(wsfeds));
        }
        @CustomType.Setter
        public Builder zendesks(List<GetClientAddonZendesk> zendesks) {
            if (zendesks == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "zendesks");
            }
            this.zendesks = zendesks;
            return this;
        }
        public Builder zendesks(GetClientAddonZendesk... zendesks) {
            return zendesks(List.of(zendesks));
        }
        @CustomType.Setter
        public Builder zooms(List<GetClientAddonZoom> zooms) {
            if (zooms == null) {
              throw new MissingRequiredPropertyException("GetClientAddon", "zooms");
            }
            this.zooms = zooms;
            return this;
        }
        public Builder zooms(GetClientAddonZoom... zooms) {
            return zooms(List.of(zooms));
        }
        public GetClientAddon build() {
            final var _resultValue = new GetClientAddon();
            _resultValue.aws = aws;
            _resultValue.azureBlobs = azureBlobs;
            _resultValue.azureSbs = azureSbs;
            _resultValue.boxes = boxes;
            _resultValue.cloudbees = cloudbees;
            _resultValue.concurs = concurs;
            _resultValue.dropboxes = dropboxes;
            _resultValue.echosigns = echosigns;
            _resultValue.egnytes = egnytes;
            _resultValue.firebases = firebases;
            _resultValue.layers = layers;
            _resultValue.mscrms = mscrms;
            _resultValue.newrelics = newrelics;
            _resultValue.office365s = office365s;
            _resultValue.rms = rms;
            _resultValue.salesforceApis = salesforceApis;
            _resultValue.salesforceSandboxApis = salesforceSandboxApis;
            _resultValue.salesforces = salesforces;
            _resultValue.samlps = samlps;
            _resultValue.sapApis = sapApis;
            _resultValue.sentries = sentries;
            _resultValue.sharepoints = sharepoints;
            _resultValue.slacks = slacks;
            _resultValue.springcms = springcms;
            _resultValue.ssoIntegrations = ssoIntegrations;
            _resultValue.wams = wams;
            _resultValue.wsfeds = wsfeds;
            _resultValue.zendesks = zendesks;
            _resultValue.zooms = zooms;
            return _resultValue;
        }
    }
}
