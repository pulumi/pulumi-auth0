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
    public sealed class GuardianPushDirectApns
    {
        /// <summary>
        /// The Apple Push Notification service Bundle ID.
        /// </summary>
        public readonly string BundleId;
        /// <summary>
        /// Indicates whether the Apple Push Notification service is enabled.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// The base64 encoded certificate in P12 format.
        /// </summary>
        public readonly string P12;
        /// <summary>
        /// Set to true to use the sandbox iOS app environment, otherwise set to false to use the production iOS app environment.
        /// </summary>
        public readonly bool Sandbox;

        [OutputConstructor]
        private GuardianPushDirectApns(
            string bundleId,

            bool? enabled,

            string p12,

            bool sandbox)
        {
            BundleId = bundleId;
            Enabled = enabled;
            P12 = p12;
            Sandbox = sandbox;
        }
    }
}
