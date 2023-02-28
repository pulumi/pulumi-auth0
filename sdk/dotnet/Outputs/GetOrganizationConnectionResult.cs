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
    public sealed class GetOrganizationConnectionResult
    {
        public readonly bool AssignMembershipOnLogin;
        public readonly string ConnectionId;

        [OutputConstructor]
        private GetOrganizationConnectionResult(
            bool assignMembershipOnLogin,

            string connectionId)
        {
            AssignMembershipOnLogin = assignMembershipOnLogin;
            ConnectionId = connectionId;
        }
    }
}
