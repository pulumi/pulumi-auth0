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
    /// With this resource, you can create and manage Forms for a tenant.
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
    ///     // Example:
    ///     var myForm = new Auth0.Form("my_form", new()
    ///     {
    ///         Name = "My KYC Form",
    ///         Start = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["coordinates"] = new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 ["x"] = 0,
    ///                 ["y"] = 0,
    ///             },
    ///             ["next_node"] = "step_ggeX",
    ///         }),
    ///         Nodes = JsonSerializer.Serialize(new[]
    ///         {
    ///             new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 ["alias"] = "New step",
    ///                 ["config"] = new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["components"] = new[]
    ///                     {
    ///                         new Dictionary&lt;string, object?&gt;
    ///                         {
    ///                             ["category"] = "FIELD",
    ///                             ["config"] = new Dictionary&lt;string, object?&gt;
    ///                             {
    ///                                 ["max_length"] = 50,
    ///                                 ["min_length"] = 1,
    ///                                 ["multiline"] = false,
    ///                             },
    ///                             ["id"] = "full_name",
    ///                             ["label"] = "Your Name",
    ///                             ["required"] = true,
    ///                             ["sensitive"] = false,
    ///                             ["type"] = "TEXT",
    ///                         },
    ///                         new Dictionary&lt;string, object?&gt;
    ///                         {
    ///                             ["category"] = "BLOCK",
    ///                             ["config"] = new Dictionary&lt;string, object?&gt;
    ///                             {
    ///                                 ["text"] = "Continue",
    ///                             },
    ///                             ["id"] = "next_button_3FbA",
    ///                             ["type"] = "NEXT_BUTTON",
    ///                         },
    ///                     },
    ///                     ["next_node"] = "$ending",
    ///                 },
    ///                 ["coordinates"] = new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["x"] = 500,
    ///                     ["y"] = 0,
    ///                 },
    ///                 ["id"] = "step_ggeX",
    ///                 ["type"] = "STEP",
    ///             },
    ///         }),
    ///         Ending = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["after_submit"] = new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 ["flow_id"] = "&lt;my_flow_id&gt;",
    ///             },
    ///             ["coordinates"] = new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 ["x"] = 1250,
    ///                 ["y"] = 0,
    ///             },
    ///             ["resume_flow"] = true,
    ///         }),
    ///         Style = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["css"] = @"h1 {
    ///   color: white;
    ///   text-align: center;
    /// }",
    ///         }),
    ///         Translations = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["es"] = new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 ["components"] = new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["rich_text_uctu"] = new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["config"] = new Dictionary&lt;string, object?&gt;
    ///                         {
    ///                             ["content"] = "&lt;h2&gt;Help us verify your personal information&lt;/h2&gt;&lt;p&gt;We want to learn more about you so that we can validate and protect your account...&lt;/p&gt;",
    ///                         },
    ///                     },
    ///                 },
    ///                 ["messages"] = new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["custom"] = new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                     },
    ///                     ["errors"] = new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["ERR_ACCEPTANCE_REQUIRED"] = "Por favor, marca este campo para continuar.",
    ///                     },
    ///                 },
    ///             },
    ///         }),
    ///         Languages = new[]
    ///         {
    ///             new Auth0.Inputs.FormLanguageArgs
    ///             {
    ///                 Default = "en",
    ///                 Primary = "en",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported using the form ID.
    /// 
    /// # 
    /// 
    /// Example:
    /// 
    /// ```sh
    /// $ pulumi import auth0:index/form:Form my_form "ap_ojkKbiPMG6J5E5VCKdeCzK"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/form:Form")]
    public partial class Form : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Submission configuration of the form. (JSON encoded)
        /// </summary>
        [Output("ending")]
        public Output<string?> Ending { get; private set; } = null!;

        /// <summary>
        /// Language specific configuration for the form.
        /// </summary>
        [Output("languages")]
        public Output<ImmutableArray<Outputs.FormLanguage>> Languages { get; private set; } = null!;

        /// <summary>
        /// Message specific configuration for the form.
        /// </summary>
        [Output("messages")]
        public Output<ImmutableArray<Outputs.FormMessage>> Messages { get; private set; } = null!;

        /// <summary>
        /// Name of the form.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Nodes of the form. (JSON encoded)
        /// </summary>
        [Output("nodes")]
        public Output<string?> Nodes { get; private set; } = null!;

        /// <summary>
        /// Input setup of the form. (JSON encoded)
        /// </summary>
        [Output("start")]
        public Output<string?> Start { get; private set; } = null!;

        /// <summary>
        /// Style specific configuration for the form. (JSON encoded)
        /// </summary>
        [Output("style")]
        public Output<string?> Style { get; private set; } = null!;

        /// <summary>
        /// Translations of the form. (JSON encoded)
        /// </summary>
        [Output("translations")]
        public Output<string?> Translations { get; private set; } = null!;


        /// <summary>
        /// Create a Form resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Form(string name, FormArgs? args = null, CustomResourceOptions? options = null)
            : base("auth0:index/form:Form", name, args ?? new FormArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Form(string name, Input<string> id, FormState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/form:Form", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Form resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Form Get(string name, Input<string> id, FormState? state = null, CustomResourceOptions? options = null)
        {
            return new Form(name, id, state, options);
        }
    }

    public sealed class FormArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Submission configuration of the form. (JSON encoded)
        /// </summary>
        [Input("ending")]
        public Input<string>? Ending { get; set; }

        [Input("languages")]
        private InputList<Inputs.FormLanguageArgs>? _languages;

        /// <summary>
        /// Language specific configuration for the form.
        /// </summary>
        public InputList<Inputs.FormLanguageArgs> Languages
        {
            get => _languages ?? (_languages = new InputList<Inputs.FormLanguageArgs>());
            set => _languages = value;
        }

        [Input("messages")]
        private InputList<Inputs.FormMessageArgs>? _messages;

        /// <summary>
        /// Message specific configuration for the form.
        /// </summary>
        public InputList<Inputs.FormMessageArgs> Messages
        {
            get => _messages ?? (_messages = new InputList<Inputs.FormMessageArgs>());
            set => _messages = value;
        }

        /// <summary>
        /// Name of the form.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Nodes of the form. (JSON encoded)
        /// </summary>
        [Input("nodes")]
        public Input<string>? Nodes { get; set; }

        /// <summary>
        /// Input setup of the form. (JSON encoded)
        /// </summary>
        [Input("start")]
        public Input<string>? Start { get; set; }

        /// <summary>
        /// Style specific configuration for the form. (JSON encoded)
        /// </summary>
        [Input("style")]
        public Input<string>? Style { get; set; }

        /// <summary>
        /// Translations of the form. (JSON encoded)
        /// </summary>
        [Input("translations")]
        public Input<string>? Translations { get; set; }

        public FormArgs()
        {
        }
        public static new FormArgs Empty => new FormArgs();
    }

    public sealed class FormState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Submission configuration of the form. (JSON encoded)
        /// </summary>
        [Input("ending")]
        public Input<string>? Ending { get; set; }

        [Input("languages")]
        private InputList<Inputs.FormLanguageGetArgs>? _languages;

        /// <summary>
        /// Language specific configuration for the form.
        /// </summary>
        public InputList<Inputs.FormLanguageGetArgs> Languages
        {
            get => _languages ?? (_languages = new InputList<Inputs.FormLanguageGetArgs>());
            set => _languages = value;
        }

        [Input("messages")]
        private InputList<Inputs.FormMessageGetArgs>? _messages;

        /// <summary>
        /// Message specific configuration for the form.
        /// </summary>
        public InputList<Inputs.FormMessageGetArgs> Messages
        {
            get => _messages ?? (_messages = new InputList<Inputs.FormMessageGetArgs>());
            set => _messages = value;
        }

        /// <summary>
        /// Name of the form.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Nodes of the form. (JSON encoded)
        /// </summary>
        [Input("nodes")]
        public Input<string>? Nodes { get; set; }

        /// <summary>
        /// Input setup of the form. (JSON encoded)
        /// </summary>
        [Input("start")]
        public Input<string>? Start { get; set; }

        /// <summary>
        /// Style specific configuration for the form. (JSON encoded)
        /// </summary>
        [Input("style")]
        public Input<string>? Style { get; set; }

        /// <summary>
        /// Translations of the form. (JSON encoded)
        /// </summary>
        [Input("translations")]
        public Input<string>? Translations { get; set; }

        public FormState()
        {
        }
        public static new FormState Empty => new FormState();
    }
}
