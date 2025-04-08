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
    /// With this resource, you can manage a customized sign up and login experience by adding custom content, form elements and css/javascript. You can read more about this [here](https://auth0.com/docs/customize/universal-login-pages/customize-signup-and-login-prompts).
    /// 
    /// !&gt; **Deprecated:** `auth0.PromptPartials` has been deprecated. Please use `auth0.PromptScreenPartials` for managing multiple
    /// prompt screens or `auth0.PromptScreenPartial` for managing a single prompt screen.
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
    ///     var myLoginPromptPartials = new Auth0.PromptPartials("my_login_prompt_partials", new()
    ///     {
    ///         Prompt = "login",
    ///         FormContentStart = "&lt;div&gt;Updated Form Content Start&lt;/div&gt;",
    ///         FormContentEnd = "&lt;div&gt;Updated Form Content End&lt;/div&gt;",
    ///         FormFooterStart = "&lt;div&gt;Updated Footer Start&lt;/div&gt;",
    ///         FormFooterEnd = "&lt;div&gt;Updated Footer End&lt;/div&gt;",
    ///         SecondaryActionsStart = "&lt;div&gt;Updated Secondary Actions Start&lt;/div&gt;",
    ///         SecondaryActionsEnd = "&lt;div&gt;Updated Secondary Actions End&lt;/div&gt;",
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
    /// $ pulumi import auth0:index/promptPartials:PromptPartials my_login_prompt_partials "login"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/promptPartials:PromptPartials")]
    public partial class PromptPartials : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Content that goes at the end of the form.
        /// </summary>
        [Output("formContentEnd")]
        public Output<string?> FormContentEnd { get; private set; } = null!;

        /// <summary>
        /// Content that goes at the start of the form.
        /// </summary>
        [Output("formContentStart")]
        public Output<string?> FormContentStart { get; private set; } = null!;

        /// <summary>
        /// Footer content for the end of the footer.
        /// </summary>
        [Output("formFooterEnd")]
        public Output<string?> FormFooterEnd { get; private set; } = null!;

        /// <summary>
        /// Footer content for the start of the footer.
        /// </summary>
        [Output("formFooterStart")]
        public Output<string?> FormFooterStart { get; private set; } = null!;

        /// <summary>
        /// The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        /// </summary>
        [Output("prompt")]
        public Output<string> Prompt { get; private set; } = null!;

        /// <summary>
        /// Actions that go at the end of secondary actions.
        /// </summary>
        [Output("secondaryActionsEnd")]
        public Output<string?> SecondaryActionsEnd { get; private set; } = null!;

        /// <summary>
        /// Actions that go at the start of secondary actions.
        /// </summary>
        [Output("secondaryActionsStart")]
        public Output<string?> SecondaryActionsStart { get; private set; } = null!;


        /// <summary>
        /// Create a PromptPartials resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PromptPartials(string name, PromptPartialsArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/promptPartials:PromptPartials", name, args ?? new PromptPartialsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PromptPartials(string name, Input<string> id, PromptPartialsState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/promptPartials:PromptPartials", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PromptPartials resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PromptPartials Get(string name, Input<string> id, PromptPartialsState? state = null, CustomResourceOptions? options = null)
        {
            return new PromptPartials(name, id, state, options);
        }
    }

    public sealed class PromptPartialsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Content that goes at the end of the form.
        /// </summary>
        [Input("formContentEnd")]
        public Input<string>? FormContentEnd { get; set; }

        /// <summary>
        /// Content that goes at the start of the form.
        /// </summary>
        [Input("formContentStart")]
        public Input<string>? FormContentStart { get; set; }

        /// <summary>
        /// Footer content for the end of the footer.
        /// </summary>
        [Input("formFooterEnd")]
        public Input<string>? FormFooterEnd { get; set; }

        /// <summary>
        /// Footer content for the start of the footer.
        /// </summary>
        [Input("formFooterStart")]
        public Input<string>? FormFooterStart { get; set; }

        /// <summary>
        /// The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        /// </summary>
        [Input("prompt", required: true)]
        public Input<string> Prompt { get; set; } = null!;

        /// <summary>
        /// Actions that go at the end of secondary actions.
        /// </summary>
        [Input("secondaryActionsEnd")]
        public Input<string>? SecondaryActionsEnd { get; set; }

        /// <summary>
        /// Actions that go at the start of secondary actions.
        /// </summary>
        [Input("secondaryActionsStart")]
        public Input<string>? SecondaryActionsStart { get; set; }

        public PromptPartialsArgs()
        {
        }
        public static new PromptPartialsArgs Empty => new PromptPartialsArgs();
    }

    public sealed class PromptPartialsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Content that goes at the end of the form.
        /// </summary>
        [Input("formContentEnd")]
        public Input<string>? FormContentEnd { get; set; }

        /// <summary>
        /// Content that goes at the start of the form.
        /// </summary>
        [Input("formContentStart")]
        public Input<string>? FormContentStart { get; set; }

        /// <summary>
        /// Footer content for the end of the footer.
        /// </summary>
        [Input("formFooterEnd")]
        public Input<string>? FormFooterEnd { get; set; }

        /// <summary>
        /// Footer content for the start of the footer.
        /// </summary>
        [Input("formFooterStart")]
        public Input<string>? FormFooterStart { get; set; }

        /// <summary>
        /// The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
        /// </summary>
        [Input("prompt")]
        public Input<string>? Prompt { get; set; }

        /// <summary>
        /// Actions that go at the end of secondary actions.
        /// </summary>
        [Input("secondaryActionsEnd")]
        public Input<string>? SecondaryActionsEnd { get; set; }

        /// <summary>
        /// Actions that go at the start of secondary actions.
        /// </summary>
        [Input("secondaryActionsStart")]
        public Input<string>? SecondaryActionsStart { get; set; }

        public PromptPartialsState()
        {
        }
        public static new PromptPartialsState Empty => new PromptPartialsState();
    }
}
