// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientAddonsSharepointArgs : global::Pulumi.ResourceArgs
    {
        [Input("externalUrls")]
        private InputList<string>? _externalUrls;
        public InputList<string> ExternalUrls
        {
            get => _externalUrls ?? (_externalUrls = new InputList<string>());
            set => _externalUrls = value;
        }

        [Input("url")]
        public Input<string>? Url { get; set; }

        public ClientAddonsSharepointArgs()
        {
        }
        public static new ClientAddonsSharepointArgs Empty => new ClientAddonsSharepointArgs();
    }
}