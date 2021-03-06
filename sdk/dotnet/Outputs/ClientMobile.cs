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
    public sealed class ClientMobile
    {
        /// <summary>
        /// List(Resource). Configuration settings for Android native apps. For details, see Android.
        /// </summary>
        public readonly Outputs.ClientMobileAndroid? Android;
        /// <summary>
        /// List(Resource). Configuration settings for i0S native apps. For details, see iOS.
        /// </summary>
        public readonly Outputs.ClientMobileIos? Ios;

        [OutputConstructor]
        private ClientMobile(
            Outputs.ClientMobileAndroid? android,

            Outputs.ClientMobileIos? ios)
        {
            Android = android;
            Ios = ios;
        }
    }
}
