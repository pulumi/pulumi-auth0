// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientAddonsRmsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("url")]
        public Input<string>? Url { get; set; }

        public ClientAddonsRmsGetArgs()
        {
        }
        public static new ClientAddonsRmsGetArgs Empty => new ClientAddonsRmsGetArgs();
    }
}
