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
        /// </summary>
        public static Task<GetCustomDomainResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCustomDomainResult>("auth0:index/getCustomDomain:getCustomDomain", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Data source to retrieve the custom domain configuration.
        /// </summary>
        public static Output<GetCustomDomainResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCustomDomainResult>("auth0:index/getCustomDomain:getCustomDomain", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Data source to retrieve the custom domain configuration.
        /// </summary>
        public static Output<GetCustomDomainResult> Invoke(InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCustomDomainResult>("auth0:index/getCustomDomain:getCustomDomain", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetCustomDomainResult
    {
        /// <summary>
        /// The HTTP header to fetch the client's IP address. Cannot be set on auth0_managed domains.
        /// </summary>
        public readonly string CustomClientIpHeader;
        /// <summary>
        /// Name of the custom domain.
        /// </summary>
        public readonly string Domain;
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
            string customClientIpHeader,

            string domain,

            string id,

            string originDomainName,

            bool primary,

            string status,

            string tlsPolicy,

            string type,

            ImmutableArray<Outputs.GetCustomDomainVerificationResult> verifications)
        {
            CustomClientIpHeader = customClientIpHeader;
            Domain = domain;
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
