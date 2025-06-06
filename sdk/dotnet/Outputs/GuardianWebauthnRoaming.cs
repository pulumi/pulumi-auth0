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
    public sealed class GuardianWebauthnRoaming
    {
        /// <summary>
        /// Indicates whether WebAuthn with FIDO Security Keys MFA is enabled.
        /// </summary>
        public readonly bool Enabled;
        /// <summary>
        /// The Relying Party is the domain for which the WebAuthn keys will be issued, set to `true` if you are customizing the identifier.
        /// </summary>
        public readonly bool? OverrideRelyingParty;
        /// <summary>
        /// The Relying Party should be a suffix of the custom domain.
        /// </summary>
        public readonly string? RelyingPartyIdentifier;
        /// <summary>
        /// User verification, one of `discouraged`, `preferred` or `required`.
        /// </summary>
        public readonly string? UserVerification;

        [OutputConstructor]
        private GuardianWebauthnRoaming(
            bool enabled,

            bool? overrideRelyingParty,

            string? relyingPartyIdentifier,

            string? userVerification)
        {
            Enabled = enabled;
            OverrideRelyingParty = overrideRelyingParty;
            RelyingPartyIdentifier = relyingPartyIdentifier;
            UserVerification = userVerification;
        }
    }
}
