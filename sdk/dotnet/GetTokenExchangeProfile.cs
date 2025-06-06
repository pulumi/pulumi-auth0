// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    public static class GetTokenExchangeProfile
    {
        /// <summary>
        /// Data source to retrieve a specific Auth0 Token Exchange Profile by `id`
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
        ///     // An Auth0 Token Exchange Profile loaded using its ID.
        ///     var myProfile = Auth0.GetTokenExchangeProfile.Invoke(new()
        ///     {
        ///         Id = "tep_Tnvl88SKv98TkMmr",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetTokenExchangeProfileResult> InvokeAsync(GetTokenExchangeProfileArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTokenExchangeProfileResult>("auth0:index/getTokenExchangeProfile:getTokenExchangeProfile", args ?? new GetTokenExchangeProfileArgs(), options.WithDefaults());

        /// <summary>
        /// Data source to retrieve a specific Auth0 Token Exchange Profile by `id`
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
        ///     // An Auth0 Token Exchange Profile loaded using its ID.
        ///     var myProfile = Auth0.GetTokenExchangeProfile.Invoke(new()
        ///     {
        ///         Id = "tep_Tnvl88SKv98TkMmr",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTokenExchangeProfileResult> Invoke(GetTokenExchangeProfileInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTokenExchangeProfileResult>("auth0:index/getTokenExchangeProfile:getTokenExchangeProfile", args ?? new GetTokenExchangeProfileInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source to retrieve a specific Auth0 Token Exchange Profile by `id`
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
        ///     // An Auth0 Token Exchange Profile loaded using its ID.
        ///     var myProfile = Auth0.GetTokenExchangeProfile.Invoke(new()
        ///     {
        ///         Id = "tep_Tnvl88SKv98TkMmr",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetTokenExchangeProfileResult> Invoke(GetTokenExchangeProfileInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetTokenExchangeProfileResult>("auth0:index/getTokenExchangeProfile:getTokenExchangeProfile", args ?? new GetTokenExchangeProfileInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTokenExchangeProfileArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the Token Exchange Profile
        /// </summary>
        [Input("id", required: true)]
        public string Id { get; set; } = null!;

        public GetTokenExchangeProfileArgs()
        {
        }
        public static new GetTokenExchangeProfileArgs Empty => new GetTokenExchangeProfileArgs();
    }

    public sealed class GetTokenExchangeProfileInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The id of the Token Exchange Profile
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public GetTokenExchangeProfileInvokeArgs()
        {
        }
        public static new GetTokenExchangeProfileInvokeArgs Empty => new GetTokenExchangeProfileInvokeArgs();
    }


    [OutputType]
    public sealed class GetTokenExchangeProfileResult
    {
        /// <summary>
        /// Unique identifier of the Action
        /// </summary>
        public readonly string ActionId;
        /// <summary>
        /// The ISO 8601 formatted date the credential was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// The id of the Token Exchange Profile
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Name of the token exchange profile.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Type of the subject token
        /// </summary>
        public readonly string SubjectTokenType;
        /// <summary>
        /// Type of the token exchange profile
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The ISO 8601 formatted date the credential was updated.
        /// </summary>
        public readonly string UpdatedAt;

        [OutputConstructor]
        private GetTokenExchangeProfileResult(
            string actionId,

            string createdAt,

            string id,

            string name,

            string subjectTokenType,

            string type,

            string updatedAt)
        {
            ActionId = actionId;
            CreatedAt = createdAt;
            Id = id;
            Name = name;
            SubjectTokenType = subjectTokenType;
            Type = type;
            UpdatedAt = updatedAt;
        }
    }
}
