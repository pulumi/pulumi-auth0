// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class GuardianPushAmazonSnsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// String. Your AWS Access Key ID.
        /// </summary>
        [Input("awsAccessKeyId", required: true)]
        public Input<string> AwsAccessKeyId { get; set; } = null!;

        /// <summary>
        /// String. Your AWS application's region.
        /// </summary>
        [Input("awsRegion", required: true)]
        public Input<string> AwsRegion { get; set; } = null!;

        /// <summary>
        /// String. Your AWS Secret Access Key.
        /// </summary>
        [Input("awsSecretAccessKey", required: true)]
        public Input<string> AwsSecretAccessKey { get; set; } = null!;

        /// <summary>
        /// String. The Amazon Resource Name for your Apple Push Notification Service.
        /// </summary>
        [Input("snsApnsPlatformApplicationArn", required: true)]
        public Input<string> SnsApnsPlatformApplicationArn { get; set; } = null!;

        /// <summary>
        /// String. The Amazon Resource Name for your Firebase Cloud Messaging Service.
        /// </summary>
        [Input("snsGcmPlatformApplicationArn", required: true)]
        public Input<string> SnsGcmPlatformApplicationArn { get; set; } = null!;

        public GuardianPushAmazonSnsGetArgs()
        {
        }
        public static new GuardianPushAmazonSnsGetArgs Empty => new GuardianPushAmazonSnsGetArgs();
    }
}
