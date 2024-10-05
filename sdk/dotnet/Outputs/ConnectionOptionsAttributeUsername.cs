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
    public sealed class ConnectionOptionsAttributeUsername
    {
        /// <summary>
        /// Connection options for User Name Attribute Identifier
        /// </summary>
        public readonly ImmutableArray<Outputs.ConnectionOptionsAttributeUsernameIdentifier> Identifiers;
        /// <summary>
        /// Defines whether Profile is required
        /// </summary>
        public readonly bool? ProfileRequired;
        /// <summary>
        /// Defines signup settings for User Name attribute
        /// </summary>
        public readonly ImmutableArray<Outputs.ConnectionOptionsAttributeUsernameSignup> Signups;
        /// <summary>
        /// Defines validation settings for User Name attribute
        /// </summary>
        public readonly ImmutableArray<Outputs.ConnectionOptionsAttributeUsernameValidation> Validations;

        [OutputConstructor]
        private ConnectionOptionsAttributeUsername(
            ImmutableArray<Outputs.ConnectionOptionsAttributeUsernameIdentifier> identifiers,

            bool? profileRequired,

            ImmutableArray<Outputs.ConnectionOptionsAttributeUsernameSignup> signups,

            ImmutableArray<Outputs.ConnectionOptionsAttributeUsernameValidation> validations)
        {
            Identifiers = identifiers;
            ProfileRequired = profileRequired;
            Signups = signups;
            Validations = validations;
        }
    }
}