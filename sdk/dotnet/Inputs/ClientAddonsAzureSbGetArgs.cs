// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientAddonsAzureSbGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("entityPath")]
        public Input<string>? EntityPath { get; set; }

        [Input("expiration")]
        public Input<int>? Expiration { get; set; }

        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        [Input("sasKey")]
        private Input<string>? _sasKey;
        public Input<string>? SasKey
        {
            get => _sasKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _sasKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("sasKeyName")]
        public Input<string>? SasKeyName { get; set; }

        public ClientAddonsAzureSbGetArgs()
        {
        }
        public static new ClientAddonsAzureSbGetArgs Empty => new ClientAddonsAzureSbGetArgs();
    }
}