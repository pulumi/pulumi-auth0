// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    public static class GetForm
    {
        /// <summary>
        /// Data source to retrieve a specific Auth0 Form by `id`
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
        ///     // An Auth0 form loaded using its ID.
        ///     var myFormData = Auth0.GetForm.Invoke(new()
        ///     {
        ///         Id = "ap_31LxRJphZF1Kqzf2zBgmgA",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetFormResult> InvokeAsync(GetFormArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFormResult>("auth0:index/getForm:getForm", args ?? new GetFormArgs(), options.WithDefaults());

        /// <summary>
        /// Data source to retrieve a specific Auth0 Form by `id`
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
        ///     // An Auth0 form loaded using its ID.
        ///     var myFormData = Auth0.GetForm.Invoke(new()
        ///     {
        ///         Id = "ap_31LxRJphZF1Kqzf2zBgmgA",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFormResult> Invoke(GetFormInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFormResult>("auth0:index/getForm:getForm", args ?? new GetFormInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFormArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the Form.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetFormArgs()
        {
        }
        public static new GetFormArgs Empty => new GetFormArgs();
    }

    public sealed class GetFormInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the Form.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetFormInvokeArgs()
        {
        }
        public static new GetFormInvokeArgs Empty => new GetFormInvokeArgs();
    }


    [OutputType]
    public sealed class GetFormResult
    {
        /// <summary>
        /// Submission configuration of the form. (JSON encoded)
        /// </summary>
        public readonly string Ending;
        /// <summary>
        /// The id of the Form.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Language specific configuration for the form.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFormLanguageResult> Languages;
        /// <summary>
        /// Message specific configuration for the form.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetFormMessageResult> Messages;
        /// <summary>
        /// Name of the form.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Nodes of the form. (JSON encoded)
        /// </summary>
        public readonly string Nodes;
        /// <summary>
        /// Input setup of the form. (JSON encoded)
        /// </summary>
        public readonly string Start;
        /// <summary>
        /// Style specific configuration for the form. (JSON encoded)
        /// </summary>
        public readonly string Style;
        /// <summary>
        /// Translations of the form. (JSON encoded)
        /// </summary>
        public readonly string Translations;

        [OutputConstructor]
        private GetFormResult(
            string ending,

            string id,

            ImmutableArray<Outputs.GetFormLanguageResult> languages,

            ImmutableArray<Outputs.GetFormMessageResult> messages,

            string name,

            string nodes,

            string start,

            string style,

            string translations)
        {
            Ending = ending;
            Id = id;
            Languages = languages;
            Messages = messages;
            Name = name;
            Nodes = nodes;
            Start = start;
            Style = style;
            Translations = translations;
        }
    }
}
