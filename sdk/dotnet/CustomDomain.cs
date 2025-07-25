// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    /// <summary>
    /// With Auth0, you can use a custom domain to maintain a consistent user experience. This resource allows you to create and manage a custom domain within your Auth0 tenant.
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
    ///         Domain = "auth.example.com",
    ///         Type = "auth0_managed_certs",
    ///         TlsPolicy = "recommended",
    ///         DomainMetadata = 
    ///         {
    ///             { "key1", "value1" },
    ///             { "key2", "value2" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Custom domains can be imported using their ID.
    /// 
    /// You can find existing custom domain IDs using the Auth0 Management API.
    /// 
    /// https://auth0.com/docs/api/management/v2#!/Custom_Domains/get_custom_domains
    /// 
    /// Example:
    /// 
    /// ```sh
    /// $ pulumi import auth0:index/customDomain:CustomDomain my_custom_domain "cd_XXXXXXXXXXXXXXXX"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/customDomain:CustomDomain")]
    public partial class CustomDomain : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Custom Domain certificate.
        /// </summary>
        [Output("certificates")]
        public Output<ImmutableArray<Outputs.CustomDomainCertificate>> Certificates { get; private set; } = null!;

        /// <summary>
        /// The HTTP header to fetch the client's IP address. Cannot be set on auth0_managed domains.
        /// </summary>
        [Output("customClientIpHeader")]
        public Output<string?> CustomClientIpHeader { get; private set; } = null!;

        /// <summary>
        /// Name of the custom domain.
        /// </summary>
        [Output("domain")]
        public Output<string> Domain { get; private set; } = null!;

        /// <summary>
        /// Metadata associated with the Custom Domain. Maximum of 10 metadata properties allowed.
        /// </summary>
        [Output("domainMetadata")]
        public Output<ImmutableDictionary<string, string>?> DomainMetadata { get; private set; } = null!;

        /// <summary>
        /// Once the configuration status is `ready`, the DNS name of the Auth0 origin server that handles traffic for the custom domain.
        /// </summary>
        [Output("originDomainName")]
        public Output<string> OriginDomainName { get; private set; } = null!;

        /// <summary>
        /// Indicates whether this is a primary domain.
        /// </summary>
        [Output("primary")]
        public Output<bool> Primary { get; private set; } = null!;

        /// <summary>
        /// Configuration status for the custom domain. Options include `disabled`, `pending`, `pending_verification`, and `ready`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// TLS policy for the custom domain. Available options are: `compatible` or `recommended`. Compatible includes TLS 1.0, 1.1, 1.2, and recommended only includes TLS 1.2. Cannot be set on self_managed domains.
        /// </summary>
        [Output("tlsPolicy")]
        public Output<string> TlsPolicy { get; private set; } = null!;

        /// <summary>
        /// Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// Configuration settings for verification.
        /// </summary>
        [Output("verifications")]
        public Output<ImmutableArray<Outputs.CustomDomainVerification>> Verifications { get; private set; } = null!;


        /// <summary>
        /// Create a CustomDomain resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CustomDomain(string name, CustomDomainArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/customDomain:CustomDomain", name, args ?? new CustomDomainArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CustomDomain(string name, Input<string> id, CustomDomainState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/customDomain:CustomDomain", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CustomDomain resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CustomDomain Get(string name, Input<string> id, CustomDomainState? state = null, CustomResourceOptions? options = null)
        {
            return new CustomDomain(name, id, state, options);
        }
    }

    public sealed class CustomDomainArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The HTTP header to fetch the client's IP address. Cannot be set on auth0_managed domains.
        /// </summary>
        [Input("customClientIpHeader")]
        public Input<string>? CustomClientIpHeader { get; set; }

        /// <summary>
        /// Name of the custom domain.
        /// </summary>
        [Input("domain", required: true)]
        public Input<string> Domain { get; set; } = null!;

        [Input("domainMetadata")]
        private InputMap<string>? _domainMetadata;

        /// <summary>
        /// Metadata associated with the Custom Domain. Maximum of 10 metadata properties allowed.
        /// </summary>
        public InputMap<string> DomainMetadata
        {
            get => _domainMetadata ?? (_domainMetadata = new InputMap<string>());
            set => _domainMetadata = value;
        }

        /// <summary>
        /// TLS policy for the custom domain. Available options are: `compatible` or `recommended`. Compatible includes TLS 1.0, 1.1, 1.2, and recommended only includes TLS 1.2. Cannot be set on self_managed domains.
        /// </summary>
        [Input("tlsPolicy")]
        public Input<string>? TlsPolicy { get; set; }

        /// <summary>
        /// Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public CustomDomainArgs()
        {
        }
        public static new CustomDomainArgs Empty => new CustomDomainArgs();
    }

    public sealed class CustomDomainState : global::Pulumi.ResourceArgs
    {
        [Input("certificates")]
        private InputList<Inputs.CustomDomainCertificateGetArgs>? _certificates;

        /// <summary>
        /// The Custom Domain certificate.
        /// </summary>
        public InputList<Inputs.CustomDomainCertificateGetArgs> Certificates
        {
            get => _certificates ?? (_certificates = new InputList<Inputs.CustomDomainCertificateGetArgs>());
            set => _certificates = value;
        }

        /// <summary>
        /// The HTTP header to fetch the client's IP address. Cannot be set on auth0_managed domains.
        /// </summary>
        [Input("customClientIpHeader")]
        public Input<string>? CustomClientIpHeader { get; set; }

        /// <summary>
        /// Name of the custom domain.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        [Input("domainMetadata")]
        private InputMap<string>? _domainMetadata;

        /// <summary>
        /// Metadata associated with the Custom Domain. Maximum of 10 metadata properties allowed.
        /// </summary>
        public InputMap<string> DomainMetadata
        {
            get => _domainMetadata ?? (_domainMetadata = new InputMap<string>());
            set => _domainMetadata = value;
        }

        /// <summary>
        /// Once the configuration status is `ready`, the DNS name of the Auth0 origin server that handles traffic for the custom domain.
        /// </summary>
        [Input("originDomainName")]
        public Input<string>? OriginDomainName { get; set; }

        /// <summary>
        /// Indicates whether this is a primary domain.
        /// </summary>
        [Input("primary")]
        public Input<bool>? Primary { get; set; }

        /// <summary>
        /// Configuration status for the custom domain. Options include `disabled`, `pending`, `pending_verification`, and `ready`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// TLS policy for the custom domain. Available options are: `compatible` or `recommended`. Compatible includes TLS 1.0, 1.1, 1.2, and recommended only includes TLS 1.2. Cannot be set on self_managed domains.
        /// </summary>
        [Input("tlsPolicy")]
        public Input<string>? TlsPolicy { get; set; }

        /// <summary>
        /// Provisioning type for the custom domain. Options include `auth0_managed_certs` and `self_managed_certs`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("verifications")]
        private InputList<Inputs.CustomDomainVerificationGetArgs>? _verifications;

        /// <summary>
        /// Configuration settings for verification.
        /// </summary>
        public InputList<Inputs.CustomDomainVerificationGetArgs> Verifications
        {
            get => _verifications ?? (_verifications = new InputList<Inputs.CustomDomainVerificationGetArgs>());
            set => _verifications = value;
        }

        public CustomDomainState()
        {
        }
        public static new CustomDomainState Empty => new CustomDomainState();
    }
}
