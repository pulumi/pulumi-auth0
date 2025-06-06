// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class EmailProviderSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Headers settings for the `smtp` email provider.
        /// </summary>
        [Input("headers")]
        public Input<Inputs.EmailProviderSettingsHeadersArgs>? Headers { get; set; }

        /// <summary>
        /// Message settings for the `mandrill` or `ses` email provider.
        /// </summary>
        [Input("message")]
        public Input<Inputs.EmailProviderSettingsMessageArgs>? Message { get; set; }

        public EmailProviderSettingsArgs()
        {
        }
        public static new EmailProviderSettingsArgs Empty => new EmailProviderSettingsArgs();
    }
}
