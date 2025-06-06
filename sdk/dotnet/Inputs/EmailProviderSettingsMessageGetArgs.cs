// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class EmailProviderSettingsMessageGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Setting for the `ses` email provider. The name of the configuration set to apply to the sent emails.
        /// </summary>
        [Input("configurationSetName")]
        public Input<string>? ConfigurationSetName { get; set; }

        /// <summary>
        /// Setting for the `mandrill` email provider. Set to `true` to see the content of individual emails sent to users.
        /// </summary>
        [Input("viewContentLink")]
        public Input<bool>? ViewContentLink { get; set; }

        public EmailProviderSettingsMessageGetArgs()
        {
        }
        public static new EmailProviderSettingsMessageGetArgs Empty => new EmailProviderSettingsMessageGetArgs();
    }
}
