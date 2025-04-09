// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    /// <summary>
    /// Auth0 allows you to configure your own phone messaging provider to help you manage, monitor, and troubleshoot your SMS and voice communications. You can only configure one phone provider for all SMS and voice communications per tenant.
    /// 
    /// !&gt; This resource manages to create a max of 1 phone provider for a tenant.
    /// To avoid potential issues, it is recommended not to try creating multiple phone providers on the same tenant.
    /// 
    /// !&gt; If you are using the `auth0.PhoneProvider` resource to create a `custom` phone provider, you must ensure an action is created first with `custom-phone-provider` as the supported_triggers
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Auth0 = Pulumi.Auth0;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // This is an example on how to set up the phone provider with Twilio.
    ///     var twilioPhoneProvider = new Auth0.PhoneProvider("twilio_phone_provider", new()
    ///     {
    ///         Name = "twilio",
    ///         Disabled = false,
    ///         Credentials = new Auth0.Inputs.PhoneProviderCredentialsArgs
    ///         {
    ///             AuthToken = "secretAuthToken",
    ///         },
    ///         Configuration = new Auth0.Inputs.PhoneProviderConfigurationArgs
    ///         {
    ///             DeliveryMethods = new[]
    ///             {
    ///                 "text",
    ///                 "voice",
    ///             },
    ///             DefaultFrom = "+1234567890",
    ///             Sid = "ACXXXXXXXXXXXXXXXX",
    ///             Mssid = "MSXXXXXXXXXXXXXXXX",
    ///         },
    ///     });
    /// 
    ///     // This is an example on how to set up the phone provider with a custom action.
    ///     // Make sure a corresponding action exists with custom-phone-provider as supported triggers
    ///     var sendCustomPhone = new Auth0.Action("send_custom_phone", new()
    ///     {
    ///         Name = "Custom Phone Provider",
    ///         Runtime = "node18",
    ///         Deploy = true,
    ///         Code = @"/**
    ///  * Handler to be executed while sending a phone notification
    ///  * @param {Event} event - Details about the user and the context in which they are logging in.
    ///  * @param {CustomPhoneProviderAPI} api - Methods and utilities to help change the behavior of sending a phone notification.
    ///  */
    /// exports.onExecuteCustomPhoneProvider = async (event, api) =&gt; {
    ///     // Code goes here
    ///     return;
    /// };
    /// ",
    ///         SupportedTriggers = new Auth0.Inputs.ActionSupportedTriggersArgs
    ///         {
    ///             Id = "custom-phone-provider",
    ///             Version = "v1",
    ///         },
    ///     });
    /// 
    ///     var customPhoneProvider = new Auth0.PhoneProvider("custom_phone_provider", new()
    ///     {
    ///         Name = "custom",
    ///         Disabled = false,
    ///         Configuration = new Auth0.Inputs.PhoneProviderConfigurationArgs
    ///         {
    ///             DeliveryMethods = new[]
    ///             {
    ///                 "text",
    ///                 "voice",
    ///             },
    ///         },
    ///         Credentials = null,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn =
    ///         {
    ///             sendCustomPhone,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by specifying the phone Provider ID.
    /// 
    /// Example:
    /// 
    /// ```sh
    /// $ pulumi import auth0:index/phoneProvider:PhoneProvider my_phone_provider "pro_XXXXXXXXXXXXXXXX"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/phoneProvider:PhoneProvider")]
    public partial class PhoneProvider : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The channel of the phone provider.
        /// </summary>
        [Output("channel")]
        public Output<string> Channel { get; private set; } = null!;

        /// <summary>
        /// Specific phone provider settings.
        /// </summary>
        [Output("configuration")]
        public Output<Outputs.PhoneProviderConfiguration> Configuration { get; private set; } = null!;

        /// <summary>
        /// Provider credentials required to use authenticate to the provider.
        /// </summary>
        [Output("credentials")]
        public Output<Outputs.PhoneProviderCredentials> Credentials { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the phone provider is enabled (false) or disabled (true).
        /// </summary>
        [Output("disabled")]
        public Output<bool?> Disabled { get; private set; } = null!;

        /// <summary>
        /// Name of the phone provider. Options include `twilio`, `custom`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The tenant of the phone provider.
        /// </summary>
        [Output("tenant")]
        public Output<string> Tenant { get; private set; } = null!;


        /// <summary>
        /// Create a PhoneProvider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PhoneProvider(string name, PhoneProviderArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/phoneProvider:PhoneProvider", name, args ?? new PhoneProviderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PhoneProvider(string name, Input<string> id, PhoneProviderState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/phoneProvider:PhoneProvider", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing PhoneProvider resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PhoneProvider Get(string name, Input<string> id, PhoneProviderState? state = null, CustomResourceOptions? options = null)
        {
            return new PhoneProvider(name, id, state, options);
        }
    }

    public sealed class PhoneProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specific phone provider settings.
        /// </summary>
        [Input("configuration", required: true)]
        public Input<Inputs.PhoneProviderConfigurationArgs> Configuration { get; set; } = null!;

        /// <summary>
        /// Provider credentials required to use authenticate to the provider.
        /// </summary>
        [Input("credentials", required: true)]
        public Input<Inputs.PhoneProviderCredentialsArgs> Credentials { get; set; } = null!;

        /// <summary>
        /// Indicates whether the phone provider is enabled (false) or disabled (true).
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Name of the phone provider. Options include `twilio`, `custom`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public PhoneProviderArgs()
        {
        }
        public static new PhoneProviderArgs Empty => new PhoneProviderArgs();
    }

    public sealed class PhoneProviderState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The channel of the phone provider.
        /// </summary>
        [Input("channel")]
        public Input<string>? Channel { get; set; }

        /// <summary>
        /// Specific phone provider settings.
        /// </summary>
        [Input("configuration")]
        public Input<Inputs.PhoneProviderConfigurationGetArgs>? Configuration { get; set; }

        /// <summary>
        /// Provider credentials required to use authenticate to the provider.
        /// </summary>
        [Input("credentials")]
        public Input<Inputs.PhoneProviderCredentialsGetArgs>? Credentials { get; set; }

        /// <summary>
        /// Indicates whether the phone provider is enabled (false) or disabled (true).
        /// </summary>
        [Input("disabled")]
        public Input<bool>? Disabled { get; set; }

        /// <summary>
        /// Name of the phone provider. Options include `twilio`, `custom`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The tenant of the phone provider.
        /// </summary>
        [Input("tenant")]
        public Input<string>? Tenant { get; set; }

        public PhoneProviderState()
        {
        }
        public static new PhoneProviderState Empty => new PhoneProviderState();
    }
}
