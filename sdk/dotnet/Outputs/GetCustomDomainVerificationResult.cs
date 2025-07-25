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
    public sealed class GetCustomDomainVerificationResult
    {
        /// <summary>
        /// Contains error message, if any, from the last DNS verification check.
        /// </summary>
        public readonly string ErrorMsg;
        /// <summary>
        /// Indicates the last time the domain was successfully verified.
        /// </summary>
        public readonly string LastVerifiedAt;
        /// <summary>
        /// Defines the list of domain verification methods used.
        /// </summary>
        public readonly ImmutableArray<object> Methods;
        /// <summary>
        /// Represents the current status of the domain verification process.
        /// </summary>
        public readonly string Status;

        [OutputConstructor]
        private GetCustomDomainVerificationResult(
            string errorMsg,

            string lastVerifiedAt,

            ImmutableArray<object> methods,

            string status)
        {
            ErrorMsg = errorMsg;
            LastVerifiedAt = lastVerifiedAt;
            Methods = methods;
            Status = status;
        }
    }
}
