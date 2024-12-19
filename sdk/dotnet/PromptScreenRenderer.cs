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
    /// With this resource, you can Configure the render settings for a specific screen.You can read more about this [here](https://auth0.com/docs/customize/login-pages/advanced-customizations/getting-started/configure-acul-screens).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Auth0 = Pulumi.Auth0;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var promptScreenRenderer = new Auth0.PromptScreenRenderer("prompt_screen_renderer", new()
    ///     {
    ///         PromptType = "login-id",
    ///         ScreenName = "login-id",
    ///         RenderingMode = "advanced",
    ///         DefaultHeadTagsDisabled = false,
    ///         ContextConfigurations = new[]
    ///         {
    ///             "branding.settings",
    ///             "branding.themes.default",
    ///             "client.logo_uri",
    ///             "client.description",
    ///             "client.metadata.key",
    ///             "organization.display_name",
    ///             "organization.branding",
    ///             "organization.metadata.key",
    ///             "screen.texts",
    ///             "tenant.name",
    ///             "tenant.friendly_name",
    ///             "tenant.enabled_locales",
    ///             "untrusted_data.submitted_form_data",
    ///             "untrusted_data.authorization_params.login_hint",
    ///             "untrusted_data.authorization_params.screen_hint",
    ///             "untrusted_data.authorization_params.ui_locales",
    ///             "untrusted_data.authorization_params.ext-.key",
    ///             "transaction.connection.metadata.key",
    ///         },
    ///         HeadTags = JsonSerializer.Serialize(new[]
    ///         {
    ///             new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 ["attributes"] = new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["async"] = true,
    ///                     ["defer"] = true,
    ///                     ["integrity"] = new[]
    ///                     {
    ///                         "sha512-v2CJ7UaYy4JwqLDIrZUI/4hqeoQieOmAZNXBeQyjo21dadnwR+8ZaIJVT8EE2iyI61OV8e6M8PP2/4hpQINQ/g==",
    ///                     },
    ///                     ["src"] = "https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js",
    ///                 },
    ///                 ["tag"] = "script",
    ///             },
    ///         }),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported using the prompt name and screen_name.
    /// 
    /// # 
    /// 
    /// As this is not a resource identifiable by an ID within the Auth0 Management API,
    /// 
    /// login can be imported using the prompt name and screen name using the format:
    /// 
    /// prompt_name:screen_name
    /// 
    /// # 
    /// 
    /// Example:
    /// 
    /// ```sh
    /// $ pulumi import auth0:index/promptScreenRenderer:PromptScreenRenderer auth0_prompt_screen_renderer "login-id:login-id"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/promptScreenRenderer:PromptScreenRenderer")]
    public partial class PromptScreenRenderer : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Context values to make available
        /// </summary>
        [Output("contextConfigurations")]
        public Output<ImmutableArray<string>> ContextConfigurations { get; private set; } = null!;

        /// <summary>
        /// Override Universal Login default head tags
        /// </summary>
        [Output("defaultHeadTagsDisabled")]
        public Output<bool?> DefaultHeadTagsDisabled { get; private set; } = null!;

        /// <summary>
        /// An array of head tags
        /// </summary>
        [Output("headTags")]
        public Output<string> HeadTags { get; private set; } = null!;

        /// <summary>
        /// The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`.
        /// </summary>
        [Output("promptType")]
        public Output<string> PromptType { get; private set; } = null!;

        /// <summary>
        /// Rendering modeOptions are: `standard`, `advanced`.
        /// </summary>
        [Output("renderingMode")]
        public Output<string?> RenderingMode { get; private set; } = null!;

        /// <summary>
        /// The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`.
        /// </summary>
        [Output("screenName")]
        public Output<string> ScreenName { get; private set; } = null!;

        /// <summary>
        /// Tenant ID
        /// </summary>
        [Output("tenant")]
        public Output<string> Tenant { get; private set; } = null!;


        /// <summary>
        /// Create a PromptScreenRenderer resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PromptScreenRenderer(string name, PromptScreenRendererArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/promptScreenRenderer:PromptScreenRenderer", name, args ?? new PromptScreenRendererArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PromptScreenRenderer(string name, Input<string> id, PromptScreenRendererState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/promptScreenRenderer:PromptScreenRenderer", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PromptScreenRenderer resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PromptScreenRenderer Get(string name, Input<string> id, PromptScreenRendererState? state = null, CustomResourceOptions? options = null)
        {
            return new PromptScreenRenderer(name, id, state, options);
        }
    }

    public sealed class PromptScreenRendererArgs : global::Pulumi.ResourceArgs
    {
        [Input("contextConfigurations")]
        private InputList<string>? _contextConfigurations;

        /// <summary>
        /// Context values to make available
        /// </summary>
        public InputList<string> ContextConfigurations
        {
            get => _contextConfigurations ?? (_contextConfigurations = new InputList<string>());
            set => _contextConfigurations = value;
        }

        /// <summary>
        /// Override Universal Login default head tags
        /// </summary>
        [Input("defaultHeadTagsDisabled")]
        public Input<bool>? DefaultHeadTagsDisabled { get; set; }

        /// <summary>
        /// An array of head tags
        /// </summary>
        [Input("headTags")]
        public Input<string>? HeadTags { get; set; }

        /// <summary>
        /// The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`.
        /// </summary>
        [Input("promptType", required: true)]
        public Input<string> PromptType { get; set; } = null!;

        /// <summary>
        /// Rendering modeOptions are: `standard`, `advanced`.
        /// </summary>
        [Input("renderingMode")]
        public Input<string>? RenderingMode { get; set; }

        /// <summary>
        /// The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`.
        /// </summary>
        [Input("screenName", required: true)]
        public Input<string> ScreenName { get; set; } = null!;

        public PromptScreenRendererArgs()
        {
        }
        public static new PromptScreenRendererArgs Empty => new PromptScreenRendererArgs();
    }

    public sealed class PromptScreenRendererState : global::Pulumi.ResourceArgs
    {
        [Input("contextConfigurations")]
        private InputList<string>? _contextConfigurations;

        /// <summary>
        /// Context values to make available
        /// </summary>
        public InputList<string> ContextConfigurations
        {
            get => _contextConfigurations ?? (_contextConfigurations = new InputList<string>());
            set => _contextConfigurations = value;
        }

        /// <summary>
        /// Override Universal Login default head tags
        /// </summary>
        [Input("defaultHeadTagsDisabled")]
        public Input<bool>? DefaultHeadTagsDisabled { get; set; }

        /// <summary>
        /// An array of head tags
        /// </summary>
        [Input("headTags")]
        public Input<string>? HeadTags { get; set; }

        /// <summary>
        /// The prompt that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkeys`, `captcha`.
        /// </summary>
        [Input("promptType")]
        public Input<string>? PromptType { get; set; }

        /// <summary>
        /// Rendering modeOptions are: `standard`, `advanced`.
        /// </summary>
        [Input("renderingMode")]
        public Input<string>? RenderingMode { get; set; }

        /// <summary>
        /// The screen that you are configuring settings for. Options are: `signup-id`, `signup-password`, `login-id`, `login-password`, `login-passwordless-sms-otp`, `login-passwordless-email-code`, `phone-identifier-enrollment`, `phone-identifier-challenge`, `email-identifier-challenge`, `passkey-enrollment`, `passkey-enrollment-local`, `interstitial-captcha`.
        /// </summary>
        [Input("screenName")]
        public Input<string>? ScreenName { get; set; }

        /// <summary>
        /// Tenant ID
        /// </summary>
        [Input("tenant")]
        public Input<string>? Tenant { get; set; }

        public PromptScreenRendererState()
        {
        }
        public static new PromptScreenRendererState Empty => new PromptScreenRendererState();
    }
}
