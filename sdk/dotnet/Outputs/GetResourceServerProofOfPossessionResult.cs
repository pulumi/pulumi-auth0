// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Outputs
{

    [OutputType]
    public sealed class GetResourceServerProofOfPossessionResult
    {
        /// <summary>
        /// Disable proof-of-possession.
        /// </summary>
        public readonly bool Disable;
        /// <summary>
        /// Mechanism used for proof-of-possession. Only `mtls` is supported.
        /// </summary>
        public readonly string Mechanism;
        /// <summary>
        /// Indicates whether proof-of-possession is required with this resource server.
        /// </summary>
        public readonly bool Required;

        [OutputConstructor]
        private GetResourceServerProofOfPossessionResult(
            bool disable,

            string mechanism,

            bool required)
        {
            Disable = disable;
            Mechanism = mechanism;
            Required = required;
        }
    }
}
