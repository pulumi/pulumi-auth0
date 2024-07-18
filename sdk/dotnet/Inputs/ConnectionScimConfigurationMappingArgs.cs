// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionScimConfigurationMappingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The field location in the Auth0 schema.
        /// </summary>
        [Input("auth0", required: true)]
        public Input<string> Auth0 { get; set; } = null!;

        /// <summary>
        /// The field location in the SCIM schema.
        /// </summary>
        [Input("scim", required: true)]
        public Input<string> Scim { get; set; } = null!;

        public ConnectionScimConfigurationMappingArgs()
        {
        }
        public static new ConnectionScimConfigurationMappingArgs Empty => new ConnectionScimConfigurationMappingArgs();
    }
}
