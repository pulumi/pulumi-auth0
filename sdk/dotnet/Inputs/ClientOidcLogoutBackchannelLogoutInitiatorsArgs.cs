// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientOidcLogoutBackchannelLogoutInitiatorsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines the configuration method for enabling initiators. `custom` enables only the initiators listed in the backchannel*logout*selected_initiators set, `all` enables all current and future initiators.
        /// </summary>
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        [Input("selectedInitiators")]
        private InputList<string>? _selectedInitiators;

        /// <summary>
        /// Contains the list of initiators to be enabled for the given client.
        /// </summary>
        public InputList<string> SelectedInitiators
        {
            get => _selectedInitiators ?? (_selectedInitiators = new InputList<string>());
            set => _selectedInitiators = value;
        }

        public ClientOidcLogoutBackchannelLogoutInitiatorsArgs()
        {
        }
        public static new ClientOidcLogoutBackchannelLogoutInitiatorsArgs Empty => new ClientOidcLogoutBackchannelLogoutInitiatorsArgs();
    }
}
