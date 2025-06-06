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
    public sealed class ConnectionOptionsAttributeEmailSignupVerification
    {
        /// <summary>
        /// Defines verification settings for signup attribute
        /// </summary>
        public readonly bool? Active;

        [OutputConstructor]
        private ConnectionOptionsAttributeEmailSignupVerification(bool? active)
        {
            Active = active;
        }
    }
}
