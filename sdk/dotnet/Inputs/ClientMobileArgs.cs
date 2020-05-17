// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientMobileArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// List(Resource). Configuration settings for Android native apps. For details, see Android.
        /// </summary>
        [Input("android")]
        public Input<Inputs.ClientMobileAndroidArgs>? Android { get; set; }

        /// <summary>
        /// List(Resource). Configuration settings for i0S native apps. For details, see iOS.
        /// </summary>
        [Input("ios")]
        public Input<Inputs.ClientMobileIosArgs>? Ios { get; set; }

        public ClientMobileArgs()
        {
        }
    }
}
