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
    public sealed class BrandingUniversalLogin
    {
        /// <summary>
        /// The html template for the New Universal Login Experience.
        /// </summary>
        public readonly string Body;

        [OutputConstructor]
        private BrandingUniversalLogin(string body)
        {
            Body = body;
        }
    }
}
