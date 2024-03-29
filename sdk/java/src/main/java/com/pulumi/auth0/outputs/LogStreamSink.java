// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogStreamSink {
    /**
     * @return The AWS Account ID.
     * 
     */
    private @Nullable String awsAccountId;
    /**
     * @return Name of the Partner Event Source to be used with AWS. Generally generated by Auth0 and passed to AWS, so this should be an output attribute.
     * 
     */
    private @Nullable String awsPartnerEventSource;
    /**
     * @return The region in which the EventBridge event source will be created. Possible values: `ap-east-1`, `ap-northeast-1`, `ap-northeast-2`, `ap-northeast-3`, `ap-south-1`, `ap-southeast-1`, `ap-southeast-2`, `ca-central-1`, `cn-north-1`, `cn-northwest-1`, `eu-central-1`, `eu-north-1`, `eu-west-1`, `eu-west-2`, `eu-west-3`, `me-south-1`, `sa-east-1`, `us-gov-east-1`, `us-gov-west-1`, `us-east-1`, `us-east-2`, `us-west-1`, `us-west-2`.
     * 
     */
    private @Nullable String awsRegion;
    /**
     * @return Name of the Partner Topic to be used with Azure. Generally should not be specified.
     * 
     */
    private @Nullable String azurePartnerTopic;
    /**
     * @return The Azure region code. Possible values: `australiacentral`, `australiaeast`, `australiasoutheast`, `brazilsouth`, `canadacentral`, `canadaeast`, `centralindia`, `centralus`, `eastasia`, `eastus`, `eastus2`, `francecentral`, `germanywestcentral`, `japaneast`, `japanwest`, `koreacentral`, `koreasouth`, `northcentralus`, `northeurope`, `norwayeast`, `southafricanorth`, `southcentralus`, `southeastasia`, `southindia`, `switzerlandnorth`, `uaenorth`, `uksouth`, `ukwest`, `westcentralus`, `westeurope`, `westindia`, `westus`, `westus2`.
     * 
     */
    private @Nullable String azureRegion;
    /**
     * @return The Azure EventGrid resource group which allows you to manage all Azure assets within one subscription.
     * 
     */
    private @Nullable String azureResourceGroup;
    /**
     * @return The unique alphanumeric string that identifies your Azure subscription.
     * 
     */
    private @Nullable String azureSubscriptionId;
    /**
     * @return The Datadog API key.
     * 
     */
    private @Nullable String datadogApiKey;
    /**
     * @return The Datadog region. Possible values: `us`, `eu`, `us3`, `us5`.
     * 
     */
    private @Nullable String datadogRegion;
    /**
     * @return Sent in the HTTP &#34;Authorization&#34; header with each request.
     * 
     */
    private @Nullable String httpAuthorization;
    /**
     * @return The format of data sent over HTTP. Options are &#34;JSONLINES&#34;, &#34;JSONARRAY&#34; or &#34;JSONOBJECT&#34;
     * 
     */
    private @Nullable String httpContentFormat;
    /**
     * @return The &#34;Content-Type&#34; header to send over HTTP. Common value is &#34;application/json&#34;.
     * 
     */
    private @Nullable String httpContentType;
    /**
     * @return Additional HTTP headers to be included as part of the HTTP request.
     * 
     */
    private @Nullable List<Map<String,String>> httpCustomHeaders;
    /**
     * @return The HTTP endpoint to send streaming logs.
     * 
     */
    private @Nullable String httpEndpoint;
    /**
     * @return The Mixpanel project ID, found on the Project Settings page.
     * 
     */
    private @Nullable String mixpanelProjectId;
    /**
     * @return The Mixpanel region. Options are [&#34;us&#34;, &#34;eu&#34;]. EU is required for customers with EU data residency requirements.
     * 
     */
    private @Nullable String mixpanelRegion;
    /**
     * @return The Mixpanel Service Account password.
     * 
     */
    private @Nullable String mixpanelServiceAccountPassword;
    /**
     * @return The Mixpanel Service Account username. Services Accounts can be created in the Project Settings page.
     * 
     */
    private @Nullable String mixpanelServiceAccountUsername;
    /**
     * @return The [Segment Write Key](https://segment.com/docs/connections/find-writekey/).
     * 
     */
    private @Nullable String segmentWriteKey;
    /**
     * @return The Splunk domain name.
     * 
     */
    private @Nullable String splunkDomain;
    /**
     * @return The Splunk port.
     * 
     */
    private @Nullable String splunkPort;
    /**
     * @return This toggle should be turned off when using self-signed certificates.
     * 
     */
    private @Nullable Boolean splunkSecure;
    /**
     * @return The Splunk access token.
     * 
     */
    private @Nullable String splunkToken;
    /**
     * @return Generated URL for your defined HTTP source in Sumo Logic for collecting streaming data from Auth0.
     * 
     */
    private @Nullable String sumoSourceAddress;

    private LogStreamSink() {}
    /**
     * @return The AWS Account ID.
     * 
     */
    public Optional<String> awsAccountId() {
        return Optional.ofNullable(this.awsAccountId);
    }
    /**
     * @return Name of the Partner Event Source to be used with AWS. Generally generated by Auth0 and passed to AWS, so this should be an output attribute.
     * 
     */
    public Optional<String> awsPartnerEventSource() {
        return Optional.ofNullable(this.awsPartnerEventSource);
    }
    /**
     * @return The region in which the EventBridge event source will be created. Possible values: `ap-east-1`, `ap-northeast-1`, `ap-northeast-2`, `ap-northeast-3`, `ap-south-1`, `ap-southeast-1`, `ap-southeast-2`, `ca-central-1`, `cn-north-1`, `cn-northwest-1`, `eu-central-1`, `eu-north-1`, `eu-west-1`, `eu-west-2`, `eu-west-3`, `me-south-1`, `sa-east-1`, `us-gov-east-1`, `us-gov-west-1`, `us-east-1`, `us-east-2`, `us-west-1`, `us-west-2`.
     * 
     */
    public Optional<String> awsRegion() {
        return Optional.ofNullable(this.awsRegion);
    }
    /**
     * @return Name of the Partner Topic to be used with Azure. Generally should not be specified.
     * 
     */
    public Optional<String> azurePartnerTopic() {
        return Optional.ofNullable(this.azurePartnerTopic);
    }
    /**
     * @return The Azure region code. Possible values: `australiacentral`, `australiaeast`, `australiasoutheast`, `brazilsouth`, `canadacentral`, `canadaeast`, `centralindia`, `centralus`, `eastasia`, `eastus`, `eastus2`, `francecentral`, `germanywestcentral`, `japaneast`, `japanwest`, `koreacentral`, `koreasouth`, `northcentralus`, `northeurope`, `norwayeast`, `southafricanorth`, `southcentralus`, `southeastasia`, `southindia`, `switzerlandnorth`, `uaenorth`, `uksouth`, `ukwest`, `westcentralus`, `westeurope`, `westindia`, `westus`, `westus2`.
     * 
     */
    public Optional<String> azureRegion() {
        return Optional.ofNullable(this.azureRegion);
    }
    /**
     * @return The Azure EventGrid resource group which allows you to manage all Azure assets within one subscription.
     * 
     */
    public Optional<String> azureResourceGroup() {
        return Optional.ofNullable(this.azureResourceGroup);
    }
    /**
     * @return The unique alphanumeric string that identifies your Azure subscription.
     * 
     */
    public Optional<String> azureSubscriptionId() {
        return Optional.ofNullable(this.azureSubscriptionId);
    }
    /**
     * @return The Datadog API key.
     * 
     */
    public Optional<String> datadogApiKey() {
        return Optional.ofNullable(this.datadogApiKey);
    }
    /**
     * @return The Datadog region. Possible values: `us`, `eu`, `us3`, `us5`.
     * 
     */
    public Optional<String> datadogRegion() {
        return Optional.ofNullable(this.datadogRegion);
    }
    /**
     * @return Sent in the HTTP &#34;Authorization&#34; header with each request.
     * 
     */
    public Optional<String> httpAuthorization() {
        return Optional.ofNullable(this.httpAuthorization);
    }
    /**
     * @return The format of data sent over HTTP. Options are &#34;JSONLINES&#34;, &#34;JSONARRAY&#34; or &#34;JSONOBJECT&#34;
     * 
     */
    public Optional<String> httpContentFormat() {
        return Optional.ofNullable(this.httpContentFormat);
    }
    /**
     * @return The &#34;Content-Type&#34; header to send over HTTP. Common value is &#34;application/json&#34;.
     * 
     */
    public Optional<String> httpContentType() {
        return Optional.ofNullable(this.httpContentType);
    }
    /**
     * @return Additional HTTP headers to be included as part of the HTTP request.
     * 
     */
    public List<Map<String,String>> httpCustomHeaders() {
        return this.httpCustomHeaders == null ? List.of() : this.httpCustomHeaders;
    }
    /**
     * @return The HTTP endpoint to send streaming logs.
     * 
     */
    public Optional<String> httpEndpoint() {
        return Optional.ofNullable(this.httpEndpoint);
    }
    /**
     * @return The Mixpanel project ID, found on the Project Settings page.
     * 
     */
    public Optional<String> mixpanelProjectId() {
        return Optional.ofNullable(this.mixpanelProjectId);
    }
    /**
     * @return The Mixpanel region. Options are [&#34;us&#34;, &#34;eu&#34;]. EU is required for customers with EU data residency requirements.
     * 
     */
    public Optional<String> mixpanelRegion() {
        return Optional.ofNullable(this.mixpanelRegion);
    }
    /**
     * @return The Mixpanel Service Account password.
     * 
     */
    public Optional<String> mixpanelServiceAccountPassword() {
        return Optional.ofNullable(this.mixpanelServiceAccountPassword);
    }
    /**
     * @return The Mixpanel Service Account username. Services Accounts can be created in the Project Settings page.
     * 
     */
    public Optional<String> mixpanelServiceAccountUsername() {
        return Optional.ofNullable(this.mixpanelServiceAccountUsername);
    }
    /**
     * @return The [Segment Write Key](https://segment.com/docs/connections/find-writekey/).
     * 
     */
    public Optional<String> segmentWriteKey() {
        return Optional.ofNullable(this.segmentWriteKey);
    }
    /**
     * @return The Splunk domain name.
     * 
     */
    public Optional<String> splunkDomain() {
        return Optional.ofNullable(this.splunkDomain);
    }
    /**
     * @return The Splunk port.
     * 
     */
    public Optional<String> splunkPort() {
        return Optional.ofNullable(this.splunkPort);
    }
    /**
     * @return This toggle should be turned off when using self-signed certificates.
     * 
     */
    public Optional<Boolean> splunkSecure() {
        return Optional.ofNullable(this.splunkSecure);
    }
    /**
     * @return The Splunk access token.
     * 
     */
    public Optional<String> splunkToken() {
        return Optional.ofNullable(this.splunkToken);
    }
    /**
     * @return Generated URL for your defined HTTP source in Sumo Logic for collecting streaming data from Auth0.
     * 
     */
    public Optional<String> sumoSourceAddress() {
        return Optional.ofNullable(this.sumoSourceAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogStreamSink defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String awsAccountId;
        private @Nullable String awsPartnerEventSource;
        private @Nullable String awsRegion;
        private @Nullable String azurePartnerTopic;
        private @Nullable String azureRegion;
        private @Nullable String azureResourceGroup;
        private @Nullable String azureSubscriptionId;
        private @Nullable String datadogApiKey;
        private @Nullable String datadogRegion;
        private @Nullable String httpAuthorization;
        private @Nullable String httpContentFormat;
        private @Nullable String httpContentType;
        private @Nullable List<Map<String,String>> httpCustomHeaders;
        private @Nullable String httpEndpoint;
        private @Nullable String mixpanelProjectId;
        private @Nullable String mixpanelRegion;
        private @Nullable String mixpanelServiceAccountPassword;
        private @Nullable String mixpanelServiceAccountUsername;
        private @Nullable String segmentWriteKey;
        private @Nullable String splunkDomain;
        private @Nullable String splunkPort;
        private @Nullable Boolean splunkSecure;
        private @Nullable String splunkToken;
        private @Nullable String sumoSourceAddress;
        public Builder() {}
        public Builder(LogStreamSink defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.awsPartnerEventSource = defaults.awsPartnerEventSource;
    	      this.awsRegion = defaults.awsRegion;
    	      this.azurePartnerTopic = defaults.azurePartnerTopic;
    	      this.azureRegion = defaults.azureRegion;
    	      this.azureResourceGroup = defaults.azureResourceGroup;
    	      this.azureSubscriptionId = defaults.azureSubscriptionId;
    	      this.datadogApiKey = defaults.datadogApiKey;
    	      this.datadogRegion = defaults.datadogRegion;
    	      this.httpAuthorization = defaults.httpAuthorization;
    	      this.httpContentFormat = defaults.httpContentFormat;
    	      this.httpContentType = defaults.httpContentType;
    	      this.httpCustomHeaders = defaults.httpCustomHeaders;
    	      this.httpEndpoint = defaults.httpEndpoint;
    	      this.mixpanelProjectId = defaults.mixpanelProjectId;
    	      this.mixpanelRegion = defaults.mixpanelRegion;
    	      this.mixpanelServiceAccountPassword = defaults.mixpanelServiceAccountPassword;
    	      this.mixpanelServiceAccountUsername = defaults.mixpanelServiceAccountUsername;
    	      this.segmentWriteKey = defaults.segmentWriteKey;
    	      this.splunkDomain = defaults.splunkDomain;
    	      this.splunkPort = defaults.splunkPort;
    	      this.splunkSecure = defaults.splunkSecure;
    	      this.splunkToken = defaults.splunkToken;
    	      this.sumoSourceAddress = defaults.sumoSourceAddress;
        }

        @CustomType.Setter
        public Builder awsAccountId(@Nullable String awsAccountId) {

            this.awsAccountId = awsAccountId;
            return this;
        }
        @CustomType.Setter
        public Builder awsPartnerEventSource(@Nullable String awsPartnerEventSource) {

            this.awsPartnerEventSource = awsPartnerEventSource;
            return this;
        }
        @CustomType.Setter
        public Builder awsRegion(@Nullable String awsRegion) {

            this.awsRegion = awsRegion;
            return this;
        }
        @CustomType.Setter
        public Builder azurePartnerTopic(@Nullable String azurePartnerTopic) {

            this.azurePartnerTopic = azurePartnerTopic;
            return this;
        }
        @CustomType.Setter
        public Builder azureRegion(@Nullable String azureRegion) {

            this.azureRegion = azureRegion;
            return this;
        }
        @CustomType.Setter
        public Builder azureResourceGroup(@Nullable String azureResourceGroup) {

            this.azureResourceGroup = azureResourceGroup;
            return this;
        }
        @CustomType.Setter
        public Builder azureSubscriptionId(@Nullable String azureSubscriptionId) {

            this.azureSubscriptionId = azureSubscriptionId;
            return this;
        }
        @CustomType.Setter
        public Builder datadogApiKey(@Nullable String datadogApiKey) {

            this.datadogApiKey = datadogApiKey;
            return this;
        }
        @CustomType.Setter
        public Builder datadogRegion(@Nullable String datadogRegion) {

            this.datadogRegion = datadogRegion;
            return this;
        }
        @CustomType.Setter
        public Builder httpAuthorization(@Nullable String httpAuthorization) {

            this.httpAuthorization = httpAuthorization;
            return this;
        }
        @CustomType.Setter
        public Builder httpContentFormat(@Nullable String httpContentFormat) {

            this.httpContentFormat = httpContentFormat;
            return this;
        }
        @CustomType.Setter
        public Builder httpContentType(@Nullable String httpContentType) {

            this.httpContentType = httpContentType;
            return this;
        }
        @CustomType.Setter
        public Builder httpCustomHeaders(@Nullable List<Map<String,String>> httpCustomHeaders) {

            this.httpCustomHeaders = httpCustomHeaders;
            return this;
        }
        @CustomType.Setter
        public Builder httpEndpoint(@Nullable String httpEndpoint) {

            this.httpEndpoint = httpEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder mixpanelProjectId(@Nullable String mixpanelProjectId) {

            this.mixpanelProjectId = mixpanelProjectId;
            return this;
        }
        @CustomType.Setter
        public Builder mixpanelRegion(@Nullable String mixpanelRegion) {

            this.mixpanelRegion = mixpanelRegion;
            return this;
        }
        @CustomType.Setter
        public Builder mixpanelServiceAccountPassword(@Nullable String mixpanelServiceAccountPassword) {

            this.mixpanelServiceAccountPassword = mixpanelServiceAccountPassword;
            return this;
        }
        @CustomType.Setter
        public Builder mixpanelServiceAccountUsername(@Nullable String mixpanelServiceAccountUsername) {

            this.mixpanelServiceAccountUsername = mixpanelServiceAccountUsername;
            return this;
        }
        @CustomType.Setter
        public Builder segmentWriteKey(@Nullable String segmentWriteKey) {

            this.segmentWriteKey = segmentWriteKey;
            return this;
        }
        @CustomType.Setter
        public Builder splunkDomain(@Nullable String splunkDomain) {

            this.splunkDomain = splunkDomain;
            return this;
        }
        @CustomType.Setter
        public Builder splunkPort(@Nullable String splunkPort) {

            this.splunkPort = splunkPort;
            return this;
        }
        @CustomType.Setter
        public Builder splunkSecure(@Nullable Boolean splunkSecure) {

            this.splunkSecure = splunkSecure;
            return this;
        }
        @CustomType.Setter
        public Builder splunkToken(@Nullable String splunkToken) {

            this.splunkToken = splunkToken;
            return this;
        }
        @CustomType.Setter
        public Builder sumoSourceAddress(@Nullable String sumoSourceAddress) {

            this.sumoSourceAddress = sumoSourceAddress;
            return this;
        }
        public LogStreamSink build() {
            final var _resultValue = new LogStreamSink();
            _resultValue.awsAccountId = awsAccountId;
            _resultValue.awsPartnerEventSource = awsPartnerEventSource;
            _resultValue.awsRegion = awsRegion;
            _resultValue.azurePartnerTopic = azurePartnerTopic;
            _resultValue.azureRegion = azureRegion;
            _resultValue.azureResourceGroup = azureResourceGroup;
            _resultValue.azureSubscriptionId = azureSubscriptionId;
            _resultValue.datadogApiKey = datadogApiKey;
            _resultValue.datadogRegion = datadogRegion;
            _resultValue.httpAuthorization = httpAuthorization;
            _resultValue.httpContentFormat = httpContentFormat;
            _resultValue.httpContentType = httpContentType;
            _resultValue.httpCustomHeaders = httpCustomHeaders;
            _resultValue.httpEndpoint = httpEndpoint;
            _resultValue.mixpanelProjectId = mixpanelProjectId;
            _resultValue.mixpanelRegion = mixpanelRegion;
            _resultValue.mixpanelServiceAccountPassword = mixpanelServiceAccountPassword;
            _resultValue.mixpanelServiceAccountUsername = mixpanelServiceAccountUsername;
            _resultValue.segmentWriteKey = segmentWriteKey;
            _resultValue.splunkDomain = splunkDomain;
            _resultValue.splunkPort = splunkPort;
            _resultValue.splunkSecure = splunkSecure;
            _resultValue.splunkToken = splunkToken;
            _resultValue.sumoSourceAddress = sumoSourceAddress;
            return _resultValue;
        }
    }
}
