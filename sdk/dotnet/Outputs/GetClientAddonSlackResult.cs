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
    public sealed class GetClientAddonSlackResult
    {
        /// <summary>
        /// Slack team name.
        /// </summary>
        public readonly string Team;

        [OutputConstructor]
        private GetClientAddonSlackResult(string team)
        {
            Team = team;
        }
    }
}
