// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientAddonsSalesforceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Arbitrary logical URL that identifies the Saleforce resource, for example `https://acme-org.com`.
        /// </summary>
        [Input("entityId")]
        public Input<string>? EntityId { get; set; }

        public ClientAddonsSalesforceArgs()
        {
        }
        public static new ClientAddonsSalesforceArgs Empty => new ClientAddonsSalesforceArgs();
    }
}
