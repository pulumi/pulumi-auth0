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
    public sealed class GetClientTokenExchangeResult
    {
        /// <summary>
        /// List of allowed profile types for token exchange
        /// </summary>
        public readonly ImmutableArray<string> AllowAnyProfileOfTypes;

        [OutputConstructor]
        private GetClientTokenExchangeResult(ImmutableArray<string> allowAnyProfileOfTypes)
        {
            AllowAnyProfileOfTypes = allowAnyProfileOfTypes;
        }
    }
}
