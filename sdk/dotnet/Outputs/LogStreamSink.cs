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
    public sealed class LogStreamSink
    {
        public readonly string? AwsAccountId;
        public readonly string? AwsPartnerEventSource;
        public readonly string? AwsRegion;
        public readonly string? AzurePartnerTopic;
        public readonly string? AzureRegion;
        public readonly string? AzureResourceGroup;
        public readonly string? AzureSubscriptionId;
        public readonly string? DatadogApiKey;
        public readonly string? DatadogRegion;
        public readonly string? HttpAuthorization;
        public readonly string? HttpContentFormat;
        public readonly string? HttpContentType;
        public readonly ImmutableArray<string> HttpCustomHeaders;
        public readonly string? HttpEndpoint;
        public readonly string? SplunkDomain;
        public readonly string? SplunkPort;
        public readonly bool? SplunkSecure;
        public readonly string? SplunkToken;

        [OutputConstructor]
        private LogStreamSink(
            string? awsAccountId,

            string? awsPartnerEventSource,

            string? awsRegion,

            string? azurePartnerTopic,

            string? azureRegion,

            string? azureResourceGroup,

            string? azureSubscriptionId,

            string? datadogApiKey,

            string? datadogRegion,

            string? httpAuthorization,

            string? httpContentFormat,

            string? httpContentType,

            ImmutableArray<string> httpCustomHeaders,

            string? httpEndpoint,

            string? splunkDomain,

            string? splunkPort,

            bool? splunkSecure,

            string? splunkToken)
        {
            AwsAccountId = awsAccountId;
            AwsPartnerEventSource = awsPartnerEventSource;
            AwsRegion = awsRegion;
            AzurePartnerTopic = azurePartnerTopic;
            AzureRegion = azureRegion;
            AzureResourceGroup = azureResourceGroup;
            AzureSubscriptionId = azureSubscriptionId;
            DatadogApiKey = datadogApiKey;
            DatadogRegion = datadogRegion;
            HttpAuthorization = httpAuthorization;
            HttpContentFormat = httpContentFormat;
            HttpContentType = httpContentType;
            HttpCustomHeaders = httpCustomHeaders;
            HttpEndpoint = httpEndpoint;
            SplunkDomain = splunkDomain;
            SplunkPort = splunkPort;
            SplunkSecure = splunkSecure;
            SplunkToken = splunkToken;
        }
    }
}