// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogStreamSinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogStreamSinkArgs Empty = new LogStreamSinkArgs();

    /**
     * The AWS Account ID
     * 
     */
    @Import(name="awsAccountId")
    private @Nullable Output<String> awsAccountId;

    /**
     * @return The AWS Account ID
     * 
     */
    public Optional<Output<String>> awsAccountId() {
        return Optional.ofNullable(this.awsAccountId);
    }

    /**
     * Name of the Partner Event Source to be used with AWS. Generally generated by Auth0 and passed to AWS so this should generally be an output attribute.
     * 
     */
    @Import(name="awsPartnerEventSource")
    private @Nullable Output<String> awsPartnerEventSource;

    /**
     * @return Name of the Partner Event Source to be used with AWS. Generally generated by Auth0 and passed to AWS so this should generally be an output attribute.
     * 
     */
    public Optional<Output<String>> awsPartnerEventSource() {
        return Optional.ofNullable(this.awsPartnerEventSource);
    }

    /**
     * The AWS Region (i.e &#34;us-east-2&#34;)
     * 
     */
    @Import(name="awsRegion")
    private @Nullable Output<String> awsRegion;

    /**
     * @return The AWS Region (i.e &#34;us-east-2&#34;)
     * 
     */
    public Optional<Output<String>> awsRegion() {
        return Optional.ofNullable(this.awsRegion);
    }

    /**
     * Name of the Partner Topic to be used with Azure.  Generally should not be specified.
     * 
     */
    @Import(name="azurePartnerTopic")
    private @Nullable Output<String> azurePartnerTopic;

    /**
     * @return Name of the Partner Topic to be used with Azure.  Generally should not be specified.
     * 
     */
    public Optional<Output<String>> azurePartnerTopic() {
        return Optional.ofNullable(this.azurePartnerTopic);
    }

    /**
     * The Azure region code (i.e. &#34;ne&#34;)
     * 
     */
    @Import(name="azureRegion")
    private @Nullable Output<String> azureRegion;

    /**
     * @return The Azure region code (i.e. &#34;ne&#34;)
     * 
     */
    public Optional<Output<String>> azureRegion() {
        return Optional.ofNullable(this.azureRegion);
    }

    /**
     * The Azure EventGrid resource group which allows you to manage all Azure assets within one subscription
     * 
     */
    @Import(name="azureResourceGroup")
    private @Nullable Output<String> azureResourceGroup;

    /**
     * @return The Azure EventGrid resource group which allows you to manage all Azure assets within one subscription
     * 
     */
    public Optional<Output<String>> azureResourceGroup() {
        return Optional.ofNullable(this.azureResourceGroup);
    }

    /**
     * The unique alphanumeric string that identifies your Azure subscription
     * 
     */
    @Import(name="azureSubscriptionId")
    private @Nullable Output<String> azureSubscriptionId;

    /**
     * @return The unique alphanumeric string that identifies your Azure subscription
     * 
     */
    public Optional<Output<String>> azureSubscriptionId() {
        return Optional.ofNullable(this.azureSubscriptionId);
    }

    /**
     * The Datadog API key
     * 
     */
    @Import(name="datadogApiKey")
    private @Nullable Output<String> datadogApiKey;

    /**
     * @return The Datadog API key
     * 
     */
    public Optional<Output<String>> datadogApiKey() {
        return Optional.ofNullable(this.datadogApiKey);
    }

    /**
     * The Datadog region. Options are [&#34;us&#34;, &#34;eu&#34;, &#34;us3&#34;, &#34;us5&#34;]
     * 
     */
    @Import(name="datadogRegion")
    private @Nullable Output<String> datadogRegion;

    /**
     * @return The Datadog region. Options are [&#34;us&#34;, &#34;eu&#34;, &#34;us3&#34;, &#34;us5&#34;]
     * 
     */
    public Optional<Output<String>> datadogRegion() {
        return Optional.ofNullable(this.datadogRegion);
    }

    /**
     * Sent in the HTTP &#34;Authorization&#34; header with each request
     * 
     */
    @Import(name="httpAuthorization")
    private @Nullable Output<String> httpAuthorization;

    /**
     * @return Sent in the HTTP &#34;Authorization&#34; header with each request
     * 
     */
    public Optional<Output<String>> httpAuthorization() {
        return Optional.ofNullable(this.httpAuthorization);
    }

    /**
     * The format of data sent over HTTP. Options are &#34;JSONLINES&#34;, &#34;JSONARRAY&#34; or &#34;JSONOBJECT&#34;
     * 
     */
    @Import(name="httpContentFormat")
    private @Nullable Output<String> httpContentFormat;

    /**
     * @return The format of data sent over HTTP. Options are &#34;JSONLINES&#34;, &#34;JSONARRAY&#34; or &#34;JSONOBJECT&#34;
     * 
     */
    public Optional<Output<String>> httpContentFormat() {
        return Optional.ofNullable(this.httpContentFormat);
    }

    /**
     * The ContentType header to send over HTTP.  Common value is &#34;application/json&#34;
     * 
     */
    @Import(name="httpContentType")
    private @Nullable Output<String> httpContentType;

    /**
     * @return The ContentType header to send over HTTP.  Common value is &#34;application/json&#34;
     * 
     */
    public Optional<Output<String>> httpContentType() {
        return Optional.ofNullable(this.httpContentType);
    }

    /**
     * Additional HTTP headers to be included as part of the HTTP request
     * 
     */
    @Import(name="httpCustomHeaders")
    private @Nullable Output<List<Map<String,String>>> httpCustomHeaders;

    /**
     * @return Additional HTTP headers to be included as part of the HTTP request
     * 
     */
    public Optional<Output<List<Map<String,String>>>> httpCustomHeaders() {
        return Optional.ofNullable(this.httpCustomHeaders);
    }

    /**
     * The HTTP endpoint to send streaming logs
     * 
     */
    @Import(name="httpEndpoint")
    private @Nullable Output<String> httpEndpoint;

    /**
     * @return The HTTP endpoint to send streaming logs
     * 
     */
    public Optional<Output<String>> httpEndpoint() {
        return Optional.ofNullable(this.httpEndpoint);
    }

    /**
     * The Splunk domain name
     * 
     */
    @Import(name="splunkDomain")
    private @Nullable Output<String> splunkDomain;

    /**
     * @return The Splunk domain name
     * 
     */
    public Optional<Output<String>> splunkDomain() {
        return Optional.ofNullable(this.splunkDomain);
    }

    @Import(name="splunkPort")
    private @Nullable Output<String> splunkPort;

    public Optional<Output<String>> splunkPort() {
        return Optional.ofNullable(this.splunkPort);
    }

    /**
     * This toggle should be turned off when using self-signed certificates
     * 
     */
    @Import(name="splunkSecure")
    private @Nullable Output<Boolean> splunkSecure;

    /**
     * @return This toggle should be turned off when using self-signed certificates
     * 
     */
    public Optional<Output<Boolean>> splunkSecure() {
        return Optional.ofNullable(this.splunkSecure);
    }

    /**
     * The Splunk access token
     * 
     */
    @Import(name="splunkToken")
    private @Nullable Output<String> splunkToken;

    /**
     * @return The Splunk access token
     * 
     */
    public Optional<Output<String>> splunkToken() {
        return Optional.ofNullable(this.splunkToken);
    }

    /**
     * Generated URL for your defined HTTP source in Sumo Logic for collecting streaming data from Auth0
     * 
     */
    @Import(name="sumoSourceAddress")
    private @Nullable Output<String> sumoSourceAddress;

    /**
     * @return Generated URL for your defined HTTP source in Sumo Logic for collecting streaming data from Auth0
     * 
     */
    public Optional<Output<String>> sumoSourceAddress() {
        return Optional.ofNullable(this.sumoSourceAddress);
    }

    private LogStreamSinkArgs() {}

    private LogStreamSinkArgs(LogStreamSinkArgs $) {
        this.awsAccountId = $.awsAccountId;
        this.awsPartnerEventSource = $.awsPartnerEventSource;
        this.awsRegion = $.awsRegion;
        this.azurePartnerTopic = $.azurePartnerTopic;
        this.azureRegion = $.azureRegion;
        this.azureResourceGroup = $.azureResourceGroup;
        this.azureSubscriptionId = $.azureSubscriptionId;
        this.datadogApiKey = $.datadogApiKey;
        this.datadogRegion = $.datadogRegion;
        this.httpAuthorization = $.httpAuthorization;
        this.httpContentFormat = $.httpContentFormat;
        this.httpContentType = $.httpContentType;
        this.httpCustomHeaders = $.httpCustomHeaders;
        this.httpEndpoint = $.httpEndpoint;
        this.splunkDomain = $.splunkDomain;
        this.splunkPort = $.splunkPort;
        this.splunkSecure = $.splunkSecure;
        this.splunkToken = $.splunkToken;
        this.sumoSourceAddress = $.sumoSourceAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogStreamSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogStreamSinkArgs $;

        public Builder() {
            $ = new LogStreamSinkArgs();
        }

        public Builder(LogStreamSinkArgs defaults) {
            $ = new LogStreamSinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsAccountId The AWS Account ID
         * 
         * @return builder
         * 
         */
        public Builder awsAccountId(@Nullable Output<String> awsAccountId) {
            $.awsAccountId = awsAccountId;
            return this;
        }

        /**
         * @param awsAccountId The AWS Account ID
         * 
         * @return builder
         * 
         */
        public Builder awsAccountId(String awsAccountId) {
            return awsAccountId(Output.of(awsAccountId));
        }

        /**
         * @param awsPartnerEventSource Name of the Partner Event Source to be used with AWS. Generally generated by Auth0 and passed to AWS so this should generally be an output attribute.
         * 
         * @return builder
         * 
         */
        public Builder awsPartnerEventSource(@Nullable Output<String> awsPartnerEventSource) {
            $.awsPartnerEventSource = awsPartnerEventSource;
            return this;
        }

        /**
         * @param awsPartnerEventSource Name of the Partner Event Source to be used with AWS. Generally generated by Auth0 and passed to AWS so this should generally be an output attribute.
         * 
         * @return builder
         * 
         */
        public Builder awsPartnerEventSource(String awsPartnerEventSource) {
            return awsPartnerEventSource(Output.of(awsPartnerEventSource));
        }

        /**
         * @param awsRegion The AWS Region (i.e &#34;us-east-2&#34;)
         * 
         * @return builder
         * 
         */
        public Builder awsRegion(@Nullable Output<String> awsRegion) {
            $.awsRegion = awsRegion;
            return this;
        }

        /**
         * @param awsRegion The AWS Region (i.e &#34;us-east-2&#34;)
         * 
         * @return builder
         * 
         */
        public Builder awsRegion(String awsRegion) {
            return awsRegion(Output.of(awsRegion));
        }

        /**
         * @param azurePartnerTopic Name of the Partner Topic to be used with Azure.  Generally should not be specified.
         * 
         * @return builder
         * 
         */
        public Builder azurePartnerTopic(@Nullable Output<String> azurePartnerTopic) {
            $.azurePartnerTopic = azurePartnerTopic;
            return this;
        }

        /**
         * @param azurePartnerTopic Name of the Partner Topic to be used with Azure.  Generally should not be specified.
         * 
         * @return builder
         * 
         */
        public Builder azurePartnerTopic(String azurePartnerTopic) {
            return azurePartnerTopic(Output.of(azurePartnerTopic));
        }

        /**
         * @param azureRegion The Azure region code (i.e. &#34;ne&#34;)
         * 
         * @return builder
         * 
         */
        public Builder azureRegion(@Nullable Output<String> azureRegion) {
            $.azureRegion = azureRegion;
            return this;
        }

        /**
         * @param azureRegion The Azure region code (i.e. &#34;ne&#34;)
         * 
         * @return builder
         * 
         */
        public Builder azureRegion(String azureRegion) {
            return azureRegion(Output.of(azureRegion));
        }

        /**
         * @param azureResourceGroup The Azure EventGrid resource group which allows you to manage all Azure assets within one subscription
         * 
         * @return builder
         * 
         */
        public Builder azureResourceGroup(@Nullable Output<String> azureResourceGroup) {
            $.azureResourceGroup = azureResourceGroup;
            return this;
        }

        /**
         * @param azureResourceGroup The Azure EventGrid resource group which allows you to manage all Azure assets within one subscription
         * 
         * @return builder
         * 
         */
        public Builder azureResourceGroup(String azureResourceGroup) {
            return azureResourceGroup(Output.of(azureResourceGroup));
        }

        /**
         * @param azureSubscriptionId The unique alphanumeric string that identifies your Azure subscription
         * 
         * @return builder
         * 
         */
        public Builder azureSubscriptionId(@Nullable Output<String> azureSubscriptionId) {
            $.azureSubscriptionId = azureSubscriptionId;
            return this;
        }

        /**
         * @param azureSubscriptionId The unique alphanumeric string that identifies your Azure subscription
         * 
         * @return builder
         * 
         */
        public Builder azureSubscriptionId(String azureSubscriptionId) {
            return azureSubscriptionId(Output.of(azureSubscriptionId));
        }

        /**
         * @param datadogApiKey The Datadog API key
         * 
         * @return builder
         * 
         */
        public Builder datadogApiKey(@Nullable Output<String> datadogApiKey) {
            $.datadogApiKey = datadogApiKey;
            return this;
        }

        /**
         * @param datadogApiKey The Datadog API key
         * 
         * @return builder
         * 
         */
        public Builder datadogApiKey(String datadogApiKey) {
            return datadogApiKey(Output.of(datadogApiKey));
        }

        /**
         * @param datadogRegion The Datadog region. Options are [&#34;us&#34;, &#34;eu&#34;, &#34;us3&#34;, &#34;us5&#34;]
         * 
         * @return builder
         * 
         */
        public Builder datadogRegion(@Nullable Output<String> datadogRegion) {
            $.datadogRegion = datadogRegion;
            return this;
        }

        /**
         * @param datadogRegion The Datadog region. Options are [&#34;us&#34;, &#34;eu&#34;, &#34;us3&#34;, &#34;us5&#34;]
         * 
         * @return builder
         * 
         */
        public Builder datadogRegion(String datadogRegion) {
            return datadogRegion(Output.of(datadogRegion));
        }

        /**
         * @param httpAuthorization Sent in the HTTP &#34;Authorization&#34; header with each request
         * 
         * @return builder
         * 
         */
        public Builder httpAuthorization(@Nullable Output<String> httpAuthorization) {
            $.httpAuthorization = httpAuthorization;
            return this;
        }

        /**
         * @param httpAuthorization Sent in the HTTP &#34;Authorization&#34; header with each request
         * 
         * @return builder
         * 
         */
        public Builder httpAuthorization(String httpAuthorization) {
            return httpAuthorization(Output.of(httpAuthorization));
        }

        /**
         * @param httpContentFormat The format of data sent over HTTP. Options are &#34;JSONLINES&#34;, &#34;JSONARRAY&#34; or &#34;JSONOBJECT&#34;
         * 
         * @return builder
         * 
         */
        public Builder httpContentFormat(@Nullable Output<String> httpContentFormat) {
            $.httpContentFormat = httpContentFormat;
            return this;
        }

        /**
         * @param httpContentFormat The format of data sent over HTTP. Options are &#34;JSONLINES&#34;, &#34;JSONARRAY&#34; or &#34;JSONOBJECT&#34;
         * 
         * @return builder
         * 
         */
        public Builder httpContentFormat(String httpContentFormat) {
            return httpContentFormat(Output.of(httpContentFormat));
        }

        /**
         * @param httpContentType The ContentType header to send over HTTP.  Common value is &#34;application/json&#34;
         * 
         * @return builder
         * 
         */
        public Builder httpContentType(@Nullable Output<String> httpContentType) {
            $.httpContentType = httpContentType;
            return this;
        }

        /**
         * @param httpContentType The ContentType header to send over HTTP.  Common value is &#34;application/json&#34;
         * 
         * @return builder
         * 
         */
        public Builder httpContentType(String httpContentType) {
            return httpContentType(Output.of(httpContentType));
        }

        /**
         * @param httpCustomHeaders Additional HTTP headers to be included as part of the HTTP request
         * 
         * @return builder
         * 
         */
        public Builder httpCustomHeaders(@Nullable Output<List<Map<String,String>>> httpCustomHeaders) {
            $.httpCustomHeaders = httpCustomHeaders;
            return this;
        }

        /**
         * @param httpCustomHeaders Additional HTTP headers to be included as part of the HTTP request
         * 
         * @return builder
         * 
         */
        public Builder httpCustomHeaders(List<Map<String,String>> httpCustomHeaders) {
            return httpCustomHeaders(Output.of(httpCustomHeaders));
        }

        /**
         * @param httpCustomHeaders Additional HTTP headers to be included as part of the HTTP request
         * 
         * @return builder
         * 
         */
        public Builder httpCustomHeaders(Map<String,String>... httpCustomHeaders) {
            return httpCustomHeaders(List.of(httpCustomHeaders));
        }

        /**
         * @param httpEndpoint The HTTP endpoint to send streaming logs
         * 
         * @return builder
         * 
         */
        public Builder httpEndpoint(@Nullable Output<String> httpEndpoint) {
            $.httpEndpoint = httpEndpoint;
            return this;
        }

        /**
         * @param httpEndpoint The HTTP endpoint to send streaming logs
         * 
         * @return builder
         * 
         */
        public Builder httpEndpoint(String httpEndpoint) {
            return httpEndpoint(Output.of(httpEndpoint));
        }

        /**
         * @param splunkDomain The Splunk domain name
         * 
         * @return builder
         * 
         */
        public Builder splunkDomain(@Nullable Output<String> splunkDomain) {
            $.splunkDomain = splunkDomain;
            return this;
        }

        /**
         * @param splunkDomain The Splunk domain name
         * 
         * @return builder
         * 
         */
        public Builder splunkDomain(String splunkDomain) {
            return splunkDomain(Output.of(splunkDomain));
        }

        public Builder splunkPort(@Nullable Output<String> splunkPort) {
            $.splunkPort = splunkPort;
            return this;
        }

        public Builder splunkPort(String splunkPort) {
            return splunkPort(Output.of(splunkPort));
        }

        /**
         * @param splunkSecure This toggle should be turned off when using self-signed certificates
         * 
         * @return builder
         * 
         */
        public Builder splunkSecure(@Nullable Output<Boolean> splunkSecure) {
            $.splunkSecure = splunkSecure;
            return this;
        }

        /**
         * @param splunkSecure This toggle should be turned off when using self-signed certificates
         * 
         * @return builder
         * 
         */
        public Builder splunkSecure(Boolean splunkSecure) {
            return splunkSecure(Output.of(splunkSecure));
        }

        /**
         * @param splunkToken The Splunk access token
         * 
         * @return builder
         * 
         */
        public Builder splunkToken(@Nullable Output<String> splunkToken) {
            $.splunkToken = splunkToken;
            return this;
        }

        /**
         * @param splunkToken The Splunk access token
         * 
         * @return builder
         * 
         */
        public Builder splunkToken(String splunkToken) {
            return splunkToken(Output.of(splunkToken));
        }

        /**
         * @param sumoSourceAddress Generated URL for your defined HTTP source in Sumo Logic for collecting streaming data from Auth0
         * 
         * @return builder
         * 
         */
        public Builder sumoSourceAddress(@Nullable Output<String> sumoSourceAddress) {
            $.sumoSourceAddress = sumoSourceAddress;
            return this;
        }

        /**
         * @param sumoSourceAddress Generated URL for your defined HTTP source in Sumo Logic for collecting streaming data from Auth0
         * 
         * @return builder
         * 
         */
        public Builder sumoSourceAddress(String sumoSourceAddress) {
            return sumoSourceAddress(Output.of(sumoSourceAddress));
        }

        public LogStreamSinkArgs build() {
            return $;
        }
    }

}