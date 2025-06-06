// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    public static class GetFlowVaultConnection
    {
        /// <summary>
        /// Data source to retrieve a specific Auth0 Flow Vault Connection by `id`
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
        ///     // An Auth0 flow vault connection loaded using its ID.
        ///     var dataConnection = Auth0.GetFlowVaultConnection.Invoke(new()
        ///     {
        ///         Id = "ac_9m2uqjHsqs19riN9N6sZQ7",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetFlowVaultConnectionResult> InvokeAsync(GetFlowVaultConnectionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetFlowVaultConnectionResult>("auth0:index/getFlowVaultConnection:getFlowVaultConnection", args ?? new GetFlowVaultConnectionArgs(), options.WithDefaults());

        /// <summary>
        /// Data source to retrieve a specific Auth0 Flow Vault Connection by `id`
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
        ///     // An Auth0 flow vault connection loaded using its ID.
        ///     var dataConnection = Auth0.GetFlowVaultConnection.Invoke(new()
        ///     {
        ///         Id = "ac_9m2uqjHsqs19riN9N6sZQ7",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFlowVaultConnectionResult> Invoke(GetFlowVaultConnectionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetFlowVaultConnectionResult>("auth0:index/getFlowVaultConnection:getFlowVaultConnection", args ?? new GetFlowVaultConnectionInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source to retrieve a specific Auth0 Flow Vault Connection by `id`
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
        ///     // An Auth0 flow vault connection loaded using its ID.
        ///     var dataConnection = Auth0.GetFlowVaultConnection.Invoke(new()
        ///     {
        ///         Id = "ac_9m2uqjHsqs19riN9N6sZQ7",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetFlowVaultConnectionResult> Invoke(GetFlowVaultConnectionInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetFlowVaultConnectionResult>("auth0:index/getFlowVaultConnection:getFlowVaultConnection", args ?? new GetFlowVaultConnectionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetFlowVaultConnectionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the Flow Vault Connection.
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetFlowVaultConnectionArgs()
        {
        }
        public static new GetFlowVaultConnectionArgs Empty => new GetFlowVaultConnectionArgs();
    }

    public sealed class GetFlowVaultConnectionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the Flow Vault Connection.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetFlowVaultConnectionInvokeArgs()
        {
        }
        public static new GetFlowVaultConnectionInvokeArgs Empty => new GetFlowVaultConnectionInvokeArgs();
    }


    [OutputType]
    public sealed class GetFlowVaultConnectionResult
    {
        /// <summary>
        /// Custom account name of the vault connection.
        /// </summary>
        public readonly string AccountName;
        /// <summary>
        /// App identifier of the vault connection.
        /// </summary>
        public readonly string AppId;
        /// <summary>
        /// Environment of the vault connection.
        /// </summary>
        public readonly string Environment;
        /// <summary>
        /// Fingerprint of the vault connection.
        /// </summary>
        public readonly string Fingerprint;
        /// <summary>
        /// The id of the Flow Vault Connection.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of the vault connection.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Indicates if the vault connection is configured.
        /// </summary>
        public readonly bool Ready;
        /// <summary>
        /// Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
        /// </summary>
        public readonly ImmutableDictionary<string, string> Setup;

        [OutputConstructor]
        private GetFlowVaultConnectionResult(
            string accountName,

            string appId,

            string environment,

            string fingerprint,

            string id,

            string name,

            bool ready,

            ImmutableDictionary<string, string> setup)
        {
            AccountName = accountName;
            AppId = appId;
            Environment = environment;
            Fingerprint = fingerprint;
            Id = id;
            Name = name;
            Ready = ready;
            Setup = setup;
        }
    }
}
