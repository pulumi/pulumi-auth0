// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsConnectionSettingsArgs : global::Pulumi.ResourceArgs
    {
        [Input("pkce", required: true)]
        public Input<string> Pkce { get; set; } = null!;

        public ConnectionOptionsConnectionSettingsArgs()
        {
        }
        public static new ConnectionOptionsConnectionSettingsArgs Empty => new ConnectionOptionsConnectionSettingsArgs();
    }
}
