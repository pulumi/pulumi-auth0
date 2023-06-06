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
    public sealed class GetUserPermissionResult
    {
        public readonly string Description;
        /// <summary>
        /// Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
        /// </summary>
        public readonly string Name;
        public readonly string ResourceServerIdentifier;
        public readonly string ResourceServerName;

        [OutputConstructor]
        private GetUserPermissionResult(
            string description,

            string name,

            string resourceServerIdentifier,

            string resourceServerName)
        {
            Description = description;
            Name = name;
            ResourceServerIdentifier = resourceServerIdentifier;
            ResourceServerName = resourceServerName;
        }
    }
}