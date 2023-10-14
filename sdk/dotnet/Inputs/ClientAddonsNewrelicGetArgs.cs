// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientAddonsNewrelicGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Your New Relic Account ID found in your New Relic URL after the `/accounts/` path, for example `https://rpm.newrelic.com/accounts/123456/query` would be `123456`.
        /// </summary>
        [Input("account")]
        public Input<string>? Account { get; set; }

        public ClientAddonsNewrelicGetArgs()
        {
        }
        public static new ClientAddonsNewrelicGetArgs Empty => new ClientAddonsNewrelicGetArgs();
    }
}
