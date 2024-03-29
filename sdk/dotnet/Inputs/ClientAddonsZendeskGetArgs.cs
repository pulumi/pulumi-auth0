// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientAddonsZendeskGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Your Azure storage account name. Usually first segment in your Azure storage URL, for example `https://acme-org.blob.core.windows.net` would be the account name `acme-org`.
        /// </summary>
        [Input("accountName")]
        public Input<string>? AccountName { get; set; }

        public ClientAddonsZendeskGetArgs()
        {
        }
        public static new ClientAddonsZendeskGetArgs Empty => new ClientAddonsZendeskGetArgs();
    }
}
