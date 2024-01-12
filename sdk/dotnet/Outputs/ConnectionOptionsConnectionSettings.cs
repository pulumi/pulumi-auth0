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
    public sealed class ConnectionOptionsConnectionSettings
    {
        /// <summary>
        /// PKCE configuration. Possible values: `auto` (uses the strongest algorithm available), `S256` (uses the SHA-256 algorithm), `plain` (uses plaintext as described in the PKCE specification) or `disabled` (disables support for PKCE).
        /// </summary>
        public readonly string Pkce;

        [OutputConstructor]
        private ConnectionOptionsConnectionSettings(string pkce)
        {
            Pkce = pkce;
        }
    }
}
