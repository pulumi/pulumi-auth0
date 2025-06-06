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
    public sealed class ClientOidcLogoutBackchannelLogoutInitiators
    {
        /// <summary>
        /// Determines the configuration method for enabling initiators. `custom` enables only the initiators listed in the backchannel*logout*selected_initiators set, `all` enables all current and future initiators.
        /// </summary>
        public readonly string Mode;
        /// <summary>
        /// Contains the list of initiators to be enabled for the given client.
        /// </summary>
        public readonly ImmutableArray<string> SelectedInitiators;

        [OutputConstructor]
        private ClientOidcLogoutBackchannelLogoutInitiators(
            string mode,

            ImmutableArray<string> selectedInitiators)
        {
            Mode = mode;
            SelectedInitiators = selectedInitiators;
        }
    }
}
