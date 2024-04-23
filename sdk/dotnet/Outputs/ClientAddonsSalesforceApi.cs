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
    public sealed class ClientAddonsSalesforceApi
    {
        /// <summary>
        /// Consumer Key assigned by Salesforce to the Connected App.
        /// </summary>
        public readonly string? ClientId;
        /// <summary>
        /// Community name.
        /// </summary>
        public readonly string? CommunityName;
        /// <summary>
        /// Community URL section.
        /// </summary>
        public readonly string? CommunityUrlSection;
        /// <summary>
        /// Name of the property in the user object that maps to a Salesforce username, for example `email`.
        /// </summary>
        public readonly string? Principal;

        [OutputConstructor]
        private ClientAddonsSalesforceApi(
            string? clientId,

            string? communityName,

            string? communityUrlSection,

            string? principal)
        {
            ClientId = clientId;
            CommunityName = communityName;
            CommunityUrlSection = communityUrlSection;
            Principal = principal;
        }
    }
}
