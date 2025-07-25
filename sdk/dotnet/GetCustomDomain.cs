// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    public static class GetCustomDomain
    {
        /// <summary>
        /// Data source to retrieve the custom domain configuration.
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
        ///     var myCustomDomain = new Auth0.CustomDomain("my_custom_domain", new()
        ///     {
        ///         Domain = "example.auth.tempdomain.com",
        ///         Type = "auth0_managed_certs",
        ///         TlsPolicy = "recommended",
        ///         DomainMetadata = 
        ///         {
        ///             { "key1", "value1" },
        ///             { "key2", "value2" },
        ///         },
        ///     });
        /// 
        ///     var test = Auth0.GetCustomDomain.Invoke(new()
        ///     {
        ///         CustomDomainId = myCustomDomain.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetCustomDomainResult> InvokeAsync(GetCustomDomainArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCustomDomainResult>("auth0:index/getCustomDomain:getCustomDomain", args ?? new GetCustomDomainArgs(), options.WithDefaults());

        /// <summary>
        /// Data source to retrieve the custom domain configuration.
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
        ///     var myCustomDomain = new Auth0.CustomDomain("my_custom_domain", new()
        ///     {
        ///         Domain = "example.auth.tempdomain.com",
        ///         Type = "auth0_managed_certs",
        ///         TlsPolicy = "recommended",
        ///         DomainMetadata = 
        ///         {
        ///             { "key1", "value1" },
        ///             { "key2", "value2" },
        ///         },
        ///     });
        /// 
        ///     var test = Auth0.GetCustomDomain.Invoke(new()
        ///     {
        ///         CustomDomainId = myCustomDomain.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCustomDomainResult> Invoke(GetCustomDomainInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCustomDomainResult>("auth0:index/getCustomDomain:getCustomDomain", args ?? new GetCustomDomainInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Data source to retrieve the custom domain configuration.
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
        ///     var myCustomDomain = new Auth0.CustomDomain("my_custom_domain", new()
        ///     {
        ///         Domain = "example.auth.tempdomain.com",
        ///         Type = "auth0_managed_certs",
        ///         TlsPolicy = "recommended",
        ///         DomainMetadata = 
        ///         {
        ///             { "key1", "value1" },
        ///             { "key2", "value2" },
        ///         },
        ///     });
        /// 
        ///     var test = Auth0.GetCustomDomain.Invoke(new()
        ///     {
        ///         CustomDomainId = myCustomDomain.Id,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetCustomDomainResult> Invoke(GetCustomDomainInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCustomDomainResult>("auth0:index/getCustomDomain:getCustomDomain", args ?? new GetCustomDomainInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCustomDomainArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Custom Domain.
        /// </summary>
        [Input("customDomainId")]
        public string? CustomDomainId { get; set; }

        public GetCustomDomainArgs()
        {
        }
        public static new GetCustomDomainArgs Empty => new GetCustomDomainArgs();
    }

    public sealed class GetCustomDomainInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Custom Domain.
        /// </summary>
        [Input("customDomainId")]
        public Input<string>? CustomDomainId { get; set; }

        public GetCustomDomainInvokeArgs()
        {
        }
        public static new GetCustomDomainInvokeArgs Empty => new GetCustomDomainInvokeArgs();
    }


    [OutputType]
    public sealed class GetCustomDomainResult
    {
        /// <summary>
        /// The Custom Domain certificate.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCustomDomainCertificateResult> Certificates;
        /// <summary>
        /// The HTTP header to fetch the client's IP address. Cannot be set on auth0_managed domains.
        /// </summary>
        public readonly string CustomClientIpHeader;
        /// <summary>
        /// The ID of the Custom Domain.
        /// </summary>
        public readonly string? CustomDomainId;
        /// <summary>
        /// Name of the custom domain.
        /// </summary>
        public readonly string Domain;
        /// <summary>
        /// Metadata associated with the Custom Domain. Maximum of 10 metadata properties allowed.
        /// </summary>
        public readonly ImmutableDictionary<string, string> DomainMetadata;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Once the configuration status is `ready`, the DNS name of the Auth0 origin server that handles traffic for the custom domain.
        /// </summary>
        public readonly string OriginDomainName;
        /// <summary>
        /// Indicates whether this is a primary domain.
        /// </summary>
        public readonly bool Primary;
        /// <summary>
        /// Configuration status for the custom domain. Options include `disabled`, `pending`, `pending_verification`, and `ready`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// TLS policy for the custom domain. Available options are: `compatible` or `recommended`. Compatible includes TLS 1.0, 1.1, 1.2, and recommended only includes TLS 1.2. Cannot be set on self_managed domains.
        /// </summary>
        public readonly string TlsPolicy;
        /// <summary>
        /// Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Configuration settings for verification.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCustomDomainVerificationResult> Verifications;

        [OutputConstructor]
        private GetCustomDomainResult(
            ImmutableArray<Outputs.GetCustomDomainCertificateResult> certificates,

            string customClientIpHeader,

            string? customDomainId,

            string domain,

            ImmutableDictionary<string, string> domainMetadata,

            string id,

            string originDomainName,

            bool primary,

            string status,

            string tlsPolicy,

            string type,

            ImmutableArray<Outputs.GetCustomDomainVerificationResult> verifications)
        {
            Certificates = certificates;
            CustomClientIpHeader = customClientIpHeader;
            CustomDomainId = customDomainId;
            Domain = domain;
            DomainMetadata = domainMetadata;
            Id = id;
            OriginDomainName = originDomainName;
            Primary = primary;
            Status = status;
            TlsPolicy = tlsPolicy;
            Type = type;
            Verifications = verifications;
        }
    }
}
