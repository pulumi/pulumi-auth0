// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientAddonsOffice365Args : global::Pulumi.ResourceArgs
    {
        [Input("connection")]
        public Input<string>? Connection { get; set; }

        [Input("domain")]
        public Input<string>? Domain { get; set; }

        public ClientAddonsOffice365Args()
        {
        }
        public static new ClientAddonsOffice365Args Empty => new ClientAddonsOffice365Args();
    }
}