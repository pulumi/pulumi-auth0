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
    public sealed class ConnectionOptionsAttributePhoneNumberSignup
    {
        /// <summary>
        /// Defines status of signup for Phone Number attribute
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// Defines verification settings for Phone Number attribute
        /// </summary>
        public readonly ImmutableArray<Outputs.ConnectionOptionsAttributePhoneNumberSignupVerification> Verifications;

        [OutputConstructor]
        private ConnectionOptionsAttributePhoneNumberSignup(
            string? status,

            ImmutableArray<Outputs.ConnectionOptionsAttributePhoneNumberSignupVerification> verifications)
        {
            Status = status;
            Verifications = verifications;
        }
    }
}
