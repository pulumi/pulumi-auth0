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
    /// With this resource, you can manage your Auth0 prompts, including choosing the login experience version.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Auth0 = Pulumi.Auth0;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myPrompt = new Auth0.Prompt("myPrompt", new()
    ///     {
    ///         IdentifierFirst = false,
    ///         UniversalLoginExperience = "new",
    ///         WebauthnPlatformFirstFactor = true,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// As this is not a resource identifiable by an ID within the Auth0 Management API,
    /// 
    /// prompts can be imported using a random string.
    /// 
    /// # 
    /// 
    /// We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4)
    /// 
    /// # 
    /// 
    /// Example:
    /// 
    /// ```sh
    /// $ pulumi import auth0:index/prompt:Prompt my_prompt "22f4f21b-017a-319d-92e7-2291c1ca36c4"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/prompt:Prompt")]
    public partial class Prompt : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Indicates whether the identifier first is used when using the new Universal Login experience.
        /// </summary>
        [Output("identifierFirst")]
        public Output<bool> IdentifierFirst { get; private set; } = null!;

        /// <summary>
        /// Which login experience to use. Options include `classic` and `new`.
        /// </summary>
        [Output("universalLoginExperience")]
        public Output<string> UniversalLoginExperience { get; private set; } = null!;

        /// <summary>
        /// Determines if the login screen uses identifier and biometrics first. Setting this property to `true`, requires MFA factors enabled for enrollment; use the `auth0.Guardian` resource to set one up.
        /// </summary>
        [Output("webauthnPlatformFirstFactor")]
        public Output<bool> WebauthnPlatformFirstFactor { get; private set; } = null!;


        /// <summary>
        /// Create a Prompt resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Prompt(string name, PromptArgs? args = null, CustomResourceOptions? options = null)
            : base("auth0:index/prompt:Prompt", name, args ?? new PromptArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Prompt(string name, Input<string> id, PromptState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/prompt:Prompt", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Prompt resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Prompt Get(string name, Input<string> id, PromptState? state = null, CustomResourceOptions? options = null)
        {
            return new Prompt(name, id, state, options);
        }
    }

    public sealed class PromptArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether the identifier first is used when using the new Universal Login experience.
        /// </summary>
        [Input("identifierFirst")]
        public Input<bool>? IdentifierFirst { get; set; }

        /// <summary>
        /// Which login experience to use. Options include `classic` and `new`.
        /// </summary>
        [Input("universalLoginExperience")]
        public Input<string>? UniversalLoginExperience { get; set; }

        /// <summary>
        /// Determines if the login screen uses identifier and biometrics first. Setting this property to `true`, requires MFA factors enabled for enrollment; use the `auth0.Guardian` resource to set one up.
        /// </summary>
        [Input("webauthnPlatformFirstFactor")]
        public Input<bool>? WebauthnPlatformFirstFactor { get; set; }

        public PromptArgs()
        {
        }
        public static new PromptArgs Empty => new PromptArgs();
    }

    public sealed class PromptState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether the identifier first is used when using the new Universal Login experience.
        /// </summary>
        [Input("identifierFirst")]
        public Input<bool>? IdentifierFirst { get; set; }

        /// <summary>
        /// Which login experience to use. Options include `classic` and `new`.
        /// </summary>
        [Input("universalLoginExperience")]
        public Input<string>? UniversalLoginExperience { get; set; }

        /// <summary>
        /// Determines if the login screen uses identifier and biometrics first. Setting this property to `true`, requires MFA factors enabled for enrollment; use the `auth0.Guardian` resource to set one up.
        /// </summary>
        [Input("webauthnPlatformFirstFactor")]
        public Input<bool>? WebauthnPlatformFirstFactor { get; set; }

        public PromptState()
        {
        }
        public static new PromptState Empty => new PromptState();
    }
}
