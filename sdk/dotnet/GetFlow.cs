// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    public static class GetFlow
    {
        /// <summary>
        /// Data source to retrieve a specific Auth0 Flow by `id`
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
        ///     // An Auth0 flow loaded using its ID.
        ///     var myFlowData = Auth0.GetFlow.Invoke(new()
        ///     {
        ///         Id = "af_5CTYdsXHLoLXD7ZVwvFHew",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetFlowResult> InvokeAsync(GetFlowArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFlowResult>("auth0:index/getFlow:getFlow", args ?? new GetFlowArgs(), options.WithDefaults());

        /// <summary>
        /// Data source to retrieve a specific Auth0 Flow by `id`
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
        ///     // An Auth0 flow loaded using its ID.
        ///     var myFlowData = Auth0.GetFlow.Invoke(new()
        ///     {
        ///         Id = "af_5CTYdsXHLoLXD7ZVwvFHew",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFlowResult> Invoke(GetFlowInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFlowResult>("auth0:index/getFlow:getFlow", args ?? new GetFlowInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source to retrieve a specific Auth0 Flow by `id`
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
        ///     // An Auth0 flow loaded using its ID.
        ///     var myFlowData = Auth0.GetFlow.Invoke(new()
        ///     {
        ///         Id = "af_5CTYdsXHLoLXD7ZVwvFHew",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFlowResult> Invoke(GetFlowInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetFlowResult>("auth0:index/getFlow:getFlow", args ?? new GetFlowInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFlowArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the Flow.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetFlowArgs()
        {
        }
        public static new GetFlowArgs Empty => new GetFlowArgs();
    }

    public sealed class GetFlowInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the Flow.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetFlowInvokeArgs()
        {
        }
        public static new GetFlowInvokeArgs Empty => new GetFlowInvokeArgs();
    }


    [OutputType]
    public sealed class GetFlowResult
    {
        /// <summary>
        /// Actions of the flow.
        /// </summary>
        public readonly string Actions;
        /// <summary>
        /// The id of the Flow.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of the flow.
        /// </summary>
        public readonly string Name;

        [OutputConstructor]
        private GetFlowResult(
            string actions,

            string id,

            string name)
        {
            Actions = actions;
            Id = id;
            Name = name;
        }
    }
}
