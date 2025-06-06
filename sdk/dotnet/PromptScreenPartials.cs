// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    /// <summary>
    /// With this resource, you can manage a customized sign up and login experience by adding custom content, form elements and css/javascript. You can read more about this [here](https://auth0.com/docs/customize/universal-login-pages/customize-signup-and-login-prompts).
    /// 
    /// !&gt; This resource manages the entire set of prompt screens enabled for a prompt. In contrast, the `auth0.PromptScreenPartial`
    /// resource appends a specific prompt screen to the list of prompt screens displayed to the user during the authentication flow.
    ///  To avoid potential issues, it is recommended not to use this resource in conjunction with the `auth0.PromptScreenPartial`
    ///  resource when managing prompt screens for the same prompt.
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
    ///     var promptScreenPartials = new Auth0.PromptScreenPartials("prompt_screen_partials", new()
    ///     {
    ///         PromptType = "login-passwordless",
    ///         ScreenPartials = new[]
    ///         {
    ///             new Auth0.Inputs.PromptScreenPartialsScreenPartialArgs
    ///             {
    ///                 ScreenName = "login-passwordless-email-code",
    ///                 InsertionPoints = new Auth0.Inputs.PromptScreenPartialsScreenPartialInsertionPointsArgs
    ///                 {
    ///                     FormContentStart = "&lt;div&gt;Form Content Start&lt;/div&gt;",
    ///                     FormContentEnd = "&lt;div&gt;Form Content End&lt;/div&gt;",
    ///                 },
    ///             },
    ///             new Auth0.Inputs.PromptScreenPartialsScreenPartialArgs
    ///             {
    ///                 ScreenName = "login-passwordless-sms-otp",
    ///                 InsertionPoints = new Auth0.Inputs.PromptScreenPartialsScreenPartialInsertionPointsArgs
    ///                 {
    ///                     FormContentStart = "&lt;div&gt;Form Content Start&lt;/div&gt;",
    ///                     FormContentEnd = "&lt;div&gt;Form Content End&lt;/div&gt;",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var customized_consent = new Auth0.PromptScreenPartials("customized-consent", new()
    ///     {
    ///         PromptType = "customized-consent",
    ///         ScreenPartials = new[]
    ///         {
    ///             new Auth0.Inputs.PromptScreenPartialsScreenPartialArgs
    ///             {
    ///                 ScreenName = "customized-consent",
    ///                 InsertionPoints = new Auth0.Inputs.PromptScreenPartialsScreenPartialInsertionPointsArgs
    ///                 {
    ///                     FormContent = "&lt;div&gt;Form Content&lt;/div&gt;",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported using the prompt name.
    /// 
    /// Example:
    /// 
    /// ```sh
    /// $ pulumi import auth0:index/promptScreenPartials:PromptScreenPartials prompt_screen_partials "login-passwordless"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/promptScreenPartials:PromptScreenPartials")]
    public partial class PromptScreenPartials : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        /// </summary>
        [Output("promptType")]
        public Output<string> PromptType { get; private set; } = null!;

        [Output("screenPartials")]
        public Output<ImmutableArray<Outputs.PromptScreenPartialsScreenPartial>> ScreenPartials { get; private set; } = null!;


        /// <summary>
        /// Create a PromptScreenPartials resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PromptScreenPartials(string name, PromptScreenPartialsArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/promptScreenPartials:PromptScreenPartials", name, args ?? new PromptScreenPartialsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PromptScreenPartials(string name, Input<string> id, PromptScreenPartialsState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/promptScreenPartials:PromptScreenPartials", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PromptScreenPartials resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PromptScreenPartials Get(string name, Input<string> id, PromptScreenPartialsState? state = null, CustomResourceOptions? options = null)
        {
            return new PromptScreenPartials(name, id, state, options);
        }
    }

    public sealed class PromptScreenPartialsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        /// </summary>
        [Input("promptType", required: true)]
        public Input<string> PromptType { get; set; } = null!;

        [Input("screenPartials")]
        private InputList<Inputs.PromptScreenPartialsScreenPartialArgs>? _screenPartials;
        public InputList<Inputs.PromptScreenPartialsScreenPartialArgs> ScreenPartials
        {
            get => _screenPartials ?? (_screenPartials = new InputList<Inputs.PromptScreenPartialsScreenPartialArgs>());
            set => _screenPartials = value;
        }

        public PromptScreenPartialsArgs()
        {
        }
        public static new PromptScreenPartialsArgs Empty => new PromptScreenPartialsArgs();
    }

    public sealed class PromptScreenPartialsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        /// </summary>
        [Input("promptType")]
        public Input<string>? PromptType { get; set; }

        [Input("screenPartials")]
        private InputList<Inputs.PromptScreenPartialsScreenPartialGetArgs>? _screenPartials;
        public InputList<Inputs.PromptScreenPartialsScreenPartialGetArgs> ScreenPartials
        {
            get => _screenPartials ?? (_screenPartials = new InputList<Inputs.PromptScreenPartialsScreenPartialGetArgs>());
            set => _screenPartials = value;
        }

        public PromptScreenPartialsState()
        {
        }
        public static new PromptScreenPartialsState Empty => new PromptScreenPartialsState();
    }
}
