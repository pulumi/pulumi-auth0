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
    public sealed class GetOrganizationConnectionResult
    {
        /// <summary>
        /// When `true`, all users that log in with this connection will be automatically granted membership in the organization. When `false`, users must be granted membership in the organization before logging in with this connection.
        /// </summary>
        public readonly bool AssignMembershipOnLogin;
        /// <summary>
        /// The ID of the enabled connection on the organization.
        /// </summary>
        public readonly string ConnectionId;
        /// <summary>
        /// Determines whether organization sign-up should be enabled for this organization connection. Only applicable for database connections. Note: `is_signup_enabled` can only be `true` if `assign_membership_on_login` is `true`.
        /// </summary>
        public readonly bool IsSignupEnabled;
        /// <summary>
        /// Determines whether a connection should be displayed on this organization’s login prompt. Only applicable for enterprise connections.
        /// </summary>
        public readonly bool ShowAsButton;

        [OutputConstructor]
        private GetOrganizationConnectionResult(
            bool assignMembershipOnLogin,

            string connectionId,

            bool isSignupEnabled,

            bool showAsButton)
        {
            AssignMembershipOnLogin = assignMembershipOnLogin;
            ConnectionId = connectionId;
            IsSignupEnabled = isSignupEnabled;
            ShowAsButton = showAsButton;
        }
    }
}
