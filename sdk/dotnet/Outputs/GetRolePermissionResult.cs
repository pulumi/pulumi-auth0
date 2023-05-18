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
    public sealed class GetRolePermissionResult
    {
        /// <summary>
        /// Description of the role.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The name of the role. If not provided, `role_id` must be set.
        /// </summary>
        public readonly string Name;
        public readonly string ResourceServerIdentifier;
        public readonly string ResourceServerName;

        [OutputConstructor]
        private GetRolePermissionResult(
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
