// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientMobileGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// List(Resource). Configuration settings for Android native apps. For details, see Android.
        /// </summary>
        [Input("android")]
        public Input<Inputs.ClientMobileAndroidGetArgs>? Android { get; set; }

        /// <summary>
        /// List(Resource). Configuration settings for i0S native apps. For details, see iOS.
        /// </summary>
        [Input("ios")]
        public Input<Inputs.ClientMobileIosGetArgs>? Ios { get; set; }

        public ClientMobileGetArgs()
        {
        }
    }
}
