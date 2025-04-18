// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Outputs
{

    [OutputType]
    public sealed class NetworkAclRuleAction
    {
        /// <summary>
        /// If true, allows the request. When using allow action, no other properties should be set.
        /// </summary>
        public readonly bool? Allow;
        /// <summary>
        /// If true, blocks the request. When using block action, no other properties should be set.
        /// </summary>
        public readonly bool? Block;
        /// <summary>
        /// If true, logs the request. When using log action, no other properties should be set.
        /// </summary>
        public readonly bool? Log;
        /// <summary>
        /// If true, redirects the request. When using redirect action, redirect_uri must also be specified.
        /// </summary>
        public readonly bool? Redirect;
        /// <summary>
        /// The URI to redirect to when redirect is true. Required when redirect is true. Must be between 1 and 2000 characters.
        /// </summary>
        public readonly string? RedirectUri;

        [OutputConstructor]
        private NetworkAclRuleAction(
            bool? allow,

            bool? block,

            bool? log,

            bool? redirect,

            string? redirectUri)
        {
            Allow = allow;
            Block = block;
            Log = log;
            Redirect = redirect;
            RedirectUri = redirectUri;
        }
    }
}
