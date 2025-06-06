// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class GuardianPushAmazonSnsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Your AWS Access Key ID.
        /// </summary>
        [Input("awsAccessKeyId", required: true)]
        public Input<string> AwsAccessKeyId { get; set; } = null!;

        /// <summary>
        /// Your AWS application's region.
        /// </summary>
        [Input("awsRegion", required: true)]
        public Input<string> AwsRegion { get; set; } = null!;

        [Input("awsSecretAccessKey", required: true)]
        private Input<string>? _awsSecretAccessKey;

        /// <summary>
        /// Your AWS Secret Access Key.
        /// </summary>
        public Input<string>? AwsSecretAccessKey
        {
            get => _awsSecretAccessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _awsSecretAccessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The Amazon Resource Name for your Apple Push Notification Service.
        /// </summary>
        [Input("snsApnsPlatformApplicationArn", required: true)]
        public Input<string> SnsApnsPlatformApplicationArn { get; set; } = null!;

        /// <summary>
        /// The Amazon Resource Name for your Firebase Cloud Messaging Service.
        /// </summary>
        [Input("snsGcmPlatformApplicationArn", required: true)]
        public Input<string> SnsGcmPlatformApplicationArn { get; set; } = null!;

        public GuardianPushAmazonSnsArgs()
        {
        }
        public static new GuardianPushAmazonSnsArgs Empty => new GuardianPushAmazonSnsArgs();
    }
}
