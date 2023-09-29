// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsAttributeMapGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("attributes")]
        public Input<string>? Attributes { get; set; }

        [Input("mappingMode", required: true)]
        public Input<string> MappingMode { get; set; } = null!;

        [Input("userinfoScope")]
        public Input<string>? UserinfoScope { get; set; }

        public ConnectionOptionsAttributeMapGetArgs()
        {
        }
        public static new ConnectionOptionsAttributeMapGetArgs Empty => new ConnectionOptionsAttributeMapGetArgs();
    }
}