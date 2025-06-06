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
    public sealed class GetConnectionScimConfigurationDefaultMappingResult
    {
        /// <summary>
        /// The field location in the Auth0 schema.
        /// </summary>
        public readonly string Auth0;
        /// <summary>
        /// The field location in the SCIM schema.
        /// </summary>
        public readonly string Scim;

        [OutputConstructor]
        private GetConnectionScimConfigurationDefaultMappingResult(
            string auth0,

            string scim)
        {
            Auth0 = auth0;
            Scim = scim;
        }
    }
}
