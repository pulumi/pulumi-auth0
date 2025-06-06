// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Outputs
{

    [OutputType]
    public sealed class GuardianPushAmazonSns
    {
        /// <summary>
        /// Your AWS Access Key ID.
        /// </summary>
        public readonly string AwsAccessKeyId;
        /// <summary>
        /// Your AWS application's region.
        /// </summary>
        public readonly string AwsRegion;
        /// <summary>
        /// Your AWS Secret Access Key.
        /// </summary>
        public readonly string AwsSecretAccessKey;
        /// <summary>
        /// The Amazon Resource Name for your Apple Push Notification Service.
        /// </summary>
        public readonly string SnsApnsPlatformApplicationArn;
        /// <summary>
        /// The Amazon Resource Name for your Firebase Cloud Messaging Service.
        /// </summary>
        public readonly string SnsGcmPlatformApplicationArn;

        [OutputConstructor]
        private GuardianPushAmazonSns(
            string awsAccessKeyId,

            string awsRegion,

            string awsSecretAccessKey,

            string snsApnsPlatformApplicationArn,

            string snsGcmPlatformApplicationArn)
        {
            AwsAccessKeyId = awsAccessKeyId;
            AwsRegion = awsRegion;
            AwsSecretAccessKey = awsSecretAccessKey;
            SnsApnsPlatformApplicationArn = snsApnsPlatformApplicationArn;
            SnsGcmPlatformApplicationArn = snsGcmPlatformApplicationArn;
        }
    }
}
