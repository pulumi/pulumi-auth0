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
    public sealed class GetConnectionOptionAttributeUsernameResult
    {
        /// <summary>
        /// Connection options for User Name Attribute Identifier
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionOptionAttributeUsernameIdentifierResult> Identifiers;
        /// <summary>
        /// Defines whether Profile is required
        /// </summary>
        public readonly bool ProfileRequired;
        /// <summary>
        /// Defines signup settings for User Name attribute
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionOptionAttributeUsernameSignupResult> Signups;
        /// <summary>
        /// Defines validation settings for User Name attribute
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionOptionAttributeUsernameValidationResult> Validations;

        [OutputConstructor]
        private GetConnectionOptionAttributeUsernameResult(
            ImmutableArray<Outputs.GetConnectionOptionAttributeUsernameIdentifierResult> identifiers,

            bool profileRequired,

            ImmutableArray<Outputs.GetConnectionOptionAttributeUsernameSignupResult> signups,

            ImmutableArray<Outputs.GetConnectionOptionAttributeUsernameValidationResult> validations)
        {
            Identifiers = identifiers;
            ProfileRequired = profileRequired;
            Signups = signups;
            Validations = validations;
        }
    }
}
