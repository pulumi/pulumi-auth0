// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class GuardianPushArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration for Amazon SNS.
        /// </summary>
        [Input("amazonSns")]
        public Input<Inputs.GuardianPushAmazonSnsArgs>? AmazonSns { get; set; }

        /// <summary>
        /// Configuration for the Guardian Custom App.
        /// </summary>
        [Input("customApp")]
        public Input<Inputs.GuardianPushCustomAppArgs>? CustomApp { get; set; }

        /// <summary>
        /// Configuration for the Apple Push Notification service (APNs) settings.
        /// </summary>
        [Input("directApns")]
        public Input<Inputs.GuardianPushDirectApnsArgs>? DirectApns { get; set; }

        /// <summary>
        /// Configuration for Firebase Cloud Messaging (FCM) settings.
        /// </summary>
        [Input("directFcm")]
        public Input<Inputs.GuardianPushDirectFcmArgs>? DirectFcm { get; set; }

        /// <summary>
        /// Indicates whether Push MFA is enabled.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// Provider to use, one of `direct`, `guardian`, `sns`.
        /// </summary>
        [Input("provider")]
        public Input<string>? Provider { get; set; }

        public GuardianPushArgs()
        {
        }
        public static new GuardianPushArgs Empty => new GuardianPushArgs();
    }
}
