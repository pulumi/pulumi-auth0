// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    public static class GetClients
    {
        /// <summary>
        /// Data source to retrieve a list of Auth0 application clients with optional filtering.
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
        ///     // Auth0 clients with "External" in the name
        ///     var externalApps = Auth0.GetClients.Invoke(new()
        ///     {
        ///         NameFilter = "External",
        ///     });
        /// 
        ///     // Auth0 clients filtered by non_interactive or spa app type
        ///     var m2mApps = Auth0.GetClients.Invoke(new()
        ///     {
        ///         AppTypes = new[]
        ///         {
        ///             "non_interactive",
        ///             "spa",
        ///         },
        ///     });
        /// 
        ///     // Auth0 clients filtered by is_first_party equal to true
        ///     var firstPartyApps = Auth0.GetClients.Invoke(new()
        ///     {
        ///         IsFirstParty = true,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetClientsResult> InvokeAsync(GetClientsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetClientsResult>("auth0:index/getClients:getClients", args ?? new GetClientsArgs(), options.WithDefaults());

        /// <summary>
        /// Data source to retrieve a list of Auth0 application clients with optional filtering.
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
        ///     // Auth0 clients with "External" in the name
        ///     var externalApps = Auth0.GetClients.Invoke(new()
        ///     {
        ///         NameFilter = "External",
        ///     });
        /// 
        ///     // Auth0 clients filtered by non_interactive or spa app type
        ///     var m2mApps = Auth0.GetClients.Invoke(new()
        ///     {
        ///         AppTypes = new[]
        ///         {
        ///             "non_interactive",
        ///             "spa",
        ///         },
        ///     });
        /// 
        ///     // Auth0 clients filtered by is_first_party equal to true
        ///     var firstPartyApps = Auth0.GetClients.Invoke(new()
        ///     {
        ///         IsFirstParty = true,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetClientsResult> Invoke(GetClientsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetClientsResult>("auth0:index/getClients:getClients", args ?? new GetClientsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetClientsArgs : global::Pulumi.InvokeArgs
    {
        [Input("appTypes")]
        private List<string>? _appTypes;

        /// <summary>
        /// Filter clients by application types.
        /// </summary>
        public List<string> AppTypes
        {
            get => _appTypes ?? (_appTypes = new List<string>());
            set => _appTypes = value;
        }

        /// <summary>
        /// Filter clients by first party status.
        /// </summary>
        [Input("isFirstParty")]
        public bool? IsFirstParty { get; set; }

        /// <summary>
        /// Filter clients by name (partial matches supported).
        /// </summary>
        [Input("nameFilter")]
        public string? NameFilter { get; set; }

        public GetClientsArgs()
        {
        }
        public static new GetClientsArgs Empty => new GetClientsArgs();
    }

    public sealed class GetClientsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("appTypes")]
        private InputList<string>? _appTypes;

        /// <summary>
        /// Filter clients by application types.
        /// </summary>
        public InputList<string> AppTypes
        {
            get => _appTypes ?? (_appTypes = new InputList<string>());
            set => _appTypes = value;
        }

        /// <summary>
        /// Filter clients by first party status.
        /// </summary>
        [Input("isFirstParty")]
        public Input<bool>? IsFirstParty { get; set; }

        /// <summary>
        /// Filter clients by name (partial matches supported).
        /// </summary>
        [Input("nameFilter")]
        public Input<string>? NameFilter { get; set; }

        public GetClientsInvokeArgs()
        {
        }
        public static new GetClientsInvokeArgs Empty => new GetClientsInvokeArgs();
    }


    [OutputType]
    public sealed class GetClientsResult
    {
        /// <summary>
        /// Filter clients by application types.
        /// </summary>
        public readonly ImmutableArray<string> AppTypes;
        /// <summary>
        /// List of clients matching the filter criteria.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetClientsClientResult> Clients;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Filter clients by first party status.
        /// </summary>
        public readonly bool? IsFirstParty;
        /// <summary>
        /// Filter clients by name (partial matches supported).
        /// </summary>
        public readonly string? NameFilter;

        [OutputConstructor]
        private GetClientsResult(
            ImmutableArray<string> appTypes,

            ImmutableArray<Outputs.GetClientsClientResult> clients,

            string id,

            bool? isFirstParty,

            string? nameFilter)
        {
            AppTypes = appTypes;
            Clients = clients;
            Id = id;
            IsFirstParty = isFirstParty;
            NameFilter = nameFilter;
        }
    }
}