// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientNativeSocialLoginGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Resource:
        /// </summary>
        [Input("apple")]
        public Input<Inputs.ClientNativeSocialLoginAppleGetArgs>? Apple { get; set; }

        /// <summary>
        /// Resources:
        /// </summary>
        [Input("facebook")]
        public Input<Inputs.ClientNativeSocialLoginFacebookGetArgs>? Facebook { get; set; }

        public ClientNativeSocialLoginGetArgs()
        {
        }
    }
}
