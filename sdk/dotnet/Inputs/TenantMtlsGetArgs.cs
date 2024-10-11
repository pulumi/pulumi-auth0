// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class TenantMtlsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Disable mTLS settings.
        /// </summary>
        [Input("disable")]
        public Input<bool>? Disable { get; set; }

        /// <summary>
        /// Enable mTLS endpoint aliases.
        /// </summary>
        [Input("enableEndpointAliases")]
        public Input<bool>? EnableEndpointAliases { get; set; }

        public TenantMtlsGetArgs()
        {
        }
        public static new TenantMtlsGetArgs Empty => new TenantMtlsGetArgs();
    }
}