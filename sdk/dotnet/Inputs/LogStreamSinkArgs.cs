// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class LogStreamSinkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AWS Account ID.
        /// </summary>
        [Input("awsAccountId")]
        public Input<string>? AwsAccountId { get; set; }

        /// <summary>
        /// Name of the Partner Event Source to be used with AWS. Generally generated by Auth0 and passed to AWS, so this should be an output attribute.
        /// </summary>
        [Input("awsPartnerEventSource")]
        public Input<string>? AwsPartnerEventSource { get; set; }

        /// <summary>
        /// The region in which the EventBridge event source will be created. Possible values: `ap-east-1`, `ap-northeast-1`, `ap-northeast-2`, `ap-northeast-3`, `ap-south-1`, `ap-southeast-1`, `ap-southeast-2`, `ca-central-1`, `cn-north-1`, `cn-northwest-1`, `eu-central-1`, `eu-north-1`, `eu-west-1`, `eu-west-2`, `eu-west-3`, `me-south-1`, `sa-east-1`, `us-gov-east-1`, `us-gov-west-1`, `us-east-1`, `us-east-2`, `us-west-1`, `us-west-2`.
        /// </summary>
        [Input("awsRegion")]
        public Input<string>? AwsRegion { get; set; }

        /// <summary>
        /// Name of the Partner Topic to be used with Azure. Generally should not be specified.
        /// </summary>
        [Input("azurePartnerTopic")]
        public Input<string>? AzurePartnerTopic { get; set; }

        /// <summary>
        /// The Azure region code. Possible values: `australiacentral`, `australiaeast`, `australiasoutheast`, `brazilsouth`, `canadacentral`, `canadaeast`, `centralindia`, `centralus`, `eastasia`, `eastus`, `eastus2`, `francecentral`, `germanywestcentral`, `japaneast`, `japanwest`, `koreacentral`, `koreasouth`, `northcentralus`, `northeurope`, `norwayeast`, `southafricanorth`, `southcentralus`, `southeastasia`, `southindia`, `switzerlandnorth`, `uaenorth`, `uksouth`, `ukwest`, `westcentralus`, `westeurope`, `westindia`, `westus`, `westus2`.
        /// </summary>
        [Input("azureRegion")]
        public Input<string>? AzureRegion { get; set; }

        /// <summary>
        /// The Azure EventGrid resource group which allows you to manage all Azure assets within one subscription.
        /// </summary>
        [Input("azureResourceGroup")]
        public Input<string>? AzureResourceGroup { get; set; }

        /// <summary>
        /// The unique alphanumeric string that identifies your Azure subscription.
        /// </summary>
        [Input("azureSubscriptionId")]
        public Input<string>? AzureSubscriptionId { get; set; }

        [Input("datadogApiKey")]
        private Input<string>? _datadogApiKey;

        /// <summary>
        /// The Datadog API key.
        /// </summary>
        public Input<string>? DatadogApiKey
        {
            get => _datadogApiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _datadogApiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The Datadog region. Possible values: `us`, `eu`, `us3`, `us5`.
        /// </summary>
        [Input("datadogRegion")]
        public Input<string>? DatadogRegion { get; set; }

        [Input("httpAuthorization")]
        private Input<string>? _httpAuthorization;

        /// <summary>
        /// Sent in the HTTP "Authorization" header with each request.
        /// </summary>
        public Input<string>? HttpAuthorization
        {
            get => _httpAuthorization;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _httpAuthorization = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The format of data sent over HTTP. Options are "JSONLINES", "JSONARRAY" or "JSONOBJECT"
        /// </summary>
        [Input("httpContentFormat")]
        public Input<string>? HttpContentFormat { get; set; }

        /// <summary>
        /// The "Content-Type" header to send over HTTP. Common value is "application/json".
        /// </summary>
        [Input("httpContentType")]
        public Input<string>? HttpContentType { get; set; }

        [Input("httpCustomHeaders")]
        private InputList<ImmutableDictionary<string, string>>? _httpCustomHeaders;

        /// <summary>
        /// Additional HTTP headers to be included as part of the HTTP request.
        /// </summary>
        public InputList<ImmutableDictionary<string, string>> HttpCustomHeaders
        {
            get => _httpCustomHeaders ?? (_httpCustomHeaders = new InputList<ImmutableDictionary<string, string>>());
            set => _httpCustomHeaders = value;
        }

        /// <summary>
        /// The HTTP endpoint to send streaming logs.
        /// </summary>
        [Input("httpEndpoint")]
        public Input<string>? HttpEndpoint { get; set; }

        /// <summary>
        /// The Mixpanel project ID, found on the Project Settings page.
        /// </summary>
        [Input("mixpanelProjectId")]
        public Input<string>? MixpanelProjectId { get; set; }

        /// <summary>
        /// The Mixpanel region. Options are ["us", "eu"]. EU is required for customers with EU data residency requirements.
        /// </summary>
        [Input("mixpanelRegion")]
        public Input<string>? MixpanelRegion { get; set; }

        [Input("mixpanelServiceAccountPassword")]
        private Input<string>? _mixpanelServiceAccountPassword;

        /// <summary>
        /// The Mixpanel Service Account password.
        /// </summary>
        public Input<string>? MixpanelServiceAccountPassword
        {
            get => _mixpanelServiceAccountPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _mixpanelServiceAccountPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The Mixpanel Service Account username. Services Accounts can be created in the Project Settings page.
        /// </summary>
        [Input("mixpanelServiceAccountUsername")]
        public Input<string>? MixpanelServiceAccountUsername { get; set; }

        [Input("segmentWriteKey")]
        private Input<string>? _segmentWriteKey;

        /// <summary>
        /// The [Segment Write Key](https://segment.com/docs/connections/find-writekey/).
        /// </summary>
        public Input<string>? SegmentWriteKey
        {
            get => _segmentWriteKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _segmentWriteKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The Splunk domain name.
        /// </summary>
        [Input("splunkDomain")]
        public Input<string>? SplunkDomain { get; set; }

        /// <summary>
        /// The Splunk port.
        /// </summary>
        [Input("splunkPort")]
        public Input<string>? SplunkPort { get; set; }

        /// <summary>
        /// This toggle should be turned off when using self-signed certificates.
        /// </summary>
        [Input("splunkSecure")]
        public Input<bool>? SplunkSecure { get; set; }

        [Input("splunkToken")]
        private Input<string>? _splunkToken;

        /// <summary>
        /// The Splunk access token.
        /// </summary>
        public Input<string>? SplunkToken
        {
            get => _splunkToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _splunkToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Generated URL for your defined HTTP source in Sumo Logic for collecting streaming data from Auth0.
        /// </summary>
        [Input("sumoSourceAddress")]
        public Input<string>? SumoSourceAddress { get; set; }

        public LogStreamSinkArgs()
        {
        }
        public static new LogStreamSinkArgs Empty => new LogStreamSinkArgs();
    }
}
