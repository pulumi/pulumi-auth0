// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class EmailSettingsHeadersGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("xMcViewContentLink")]
        public Input<string>? XMcViewContentLink { get; set; }

        [Input("xSesConfigurationSet")]
        public Input<string>? XSesConfigurationSet { get; set; }

        public EmailSettingsHeadersGetArgs()
        {
        }
        public static new EmailSettingsHeadersGetArgs Empty => new EmailSettingsHeadersGetArgs();
    }
}
