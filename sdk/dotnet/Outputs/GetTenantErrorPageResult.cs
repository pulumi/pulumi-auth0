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
    public sealed class GetTenantErrorPageResult
    {
        public readonly string Html;
        public readonly bool ShowLogLink;
        public readonly string Url;

        [OutputConstructor]
        private GetTenantErrorPageResult(
            string html,

            bool showLogLink,

            string url)
        {
            Html = html;
            ShowLogLink = showLogLink;
            Url = url;
        }
    }
}
