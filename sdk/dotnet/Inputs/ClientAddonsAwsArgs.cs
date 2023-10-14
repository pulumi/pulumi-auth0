// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientAddonsAwsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS token lifetime in seconds.
        /// </summary>
        [Input("lifetimeInSeconds")]
        public Input<int>? LifetimeInSeconds { get; set; }

        /// <summary>
        /// AWS principal ARN, for example `arn:aws:iam::010616021751:saml-provider/idpname`.
        /// </summary>
        [Input("principal")]
        public Input<string>? Principal { get; set; }

        /// <summary>
        /// AWS role ARN, for example `arn:aws:iam::010616021751:role/foo`.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        public ClientAddonsAwsArgs()
        {
        }
        public static new ClientAddonsAwsArgs Empty => new ClientAddonsAwsArgs();
    }
}
