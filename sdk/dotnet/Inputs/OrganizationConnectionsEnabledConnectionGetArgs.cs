// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class OrganizationConnectionsEnabledConnectionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// When `true`, all users that log in with this connection will be automatically granted membership in the organization. When `false`, users must be granted membership in the organization before logging in with this connection.
        /// </summary>
        [Input("assignMembershipOnLogin")]
        public Input<bool>? AssignMembershipOnLogin { get; set; }

        /// <summary>
        /// The ID of the connection to enable for the organization.
        /// </summary>
        [Input("connectionId", required: true)]
        public Input<string> ConnectionId { get; set; } = null!;

        /// <summary>
        /// Determines whether organization sign-up should be enabled for this organization connection. Only applicable for database connections. Note: `is_signup_enabled` can only be `true` if `assign_membership_on_login` is `true`.
        /// </summary>
        [Input("isSignupEnabled")]
        public Input<bool>? IsSignupEnabled { get; set; }

        /// <summary>
        /// Determines whether a connection should be displayed on this organization’s login prompt. Only applicable for enterprise connections.
        /// </summary>
        [Input("showAsButton")]
        public Input<bool>? ShowAsButton { get; set; }

        public OrganizationConnectionsEnabledConnectionGetArgs()
        {
        }
        public static new OrganizationConnectionsEnabledConnectionGetArgs Empty => new OrganizationConnectionsEnabledConnectionGetArgs();
    }
}
