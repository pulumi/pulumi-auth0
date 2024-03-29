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
    /// The provider type for the auth0 package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [Auth0ResourceType("pulumi:providers:auth0")]
    public partial class Provider : global::Pulumi.ProviderResource
    {
        /// <summary>
        /// Your Auth0 [management api access
        /// token](https://auth0.com/docs/security/tokens/access-tokens/management-api-access-tokens). It can also be sourced from
        /// the `AUTH0_API_TOKEN` environment variable. It can be used instead of `client_id` + `client_secret`. If both are
        /// specified, `api_token` will be used over `client_id` + `client_secret` fields.
        /// </summary>
        [Output("apiToken")]
        public Output<string?> ApiToken { get; private set; } = null!;

        /// <summary>
        /// Your Auth0 audience when using a custom domain. It can also be sourced from the `AUTH0_AUDIENCE` environment variable.
        /// </summary>
        [Output("audience")]
        public Output<string?> Audience { get; private set; } = null!;

        /// <summary>
        /// Your Auth0 client ID. It can also be sourced from the `AUTH0_CLIENT_ID` environment variable.
        /// </summary>
        [Output("clientId")]
        public Output<string?> ClientId { get; private set; } = null!;

        /// <summary>
        /// Your Auth0 client secret. It can also be sourced from the `AUTH0_CLIENT_SECRET` environment variable.
        /// </summary>
        [Output("clientSecret")]
        public Output<string?> ClientSecret { get; private set; } = null!;

        /// <summary>
        /// Your Auth0 domain name. It can also be sourced from the `AUTH0_DOMAIN` environment variable.
        /// </summary>
        [Output("domain")]
        public Output<string?> Domain { get; private set; } = null!;


        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs? args = null, CustomResourceOptions? options = null)
            : base("auth0", name, args ?? new ProviderArgs(), MakeResourceOptions(options, ""))
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
    }

    public sealed class ProviderArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Your Auth0 [management api access
        /// token](https://auth0.com/docs/security/tokens/access-tokens/management-api-access-tokens). It can also be sourced from
        /// the `AUTH0_API_TOKEN` environment variable. It can be used instead of `client_id` + `client_secret`. If both are
        /// specified, `api_token` will be used over `client_id` + `client_secret` fields.
        /// </summary>
        [Input("apiToken")]
        public Input<string>? ApiToken { get; set; }

        /// <summary>
        /// Your Auth0 audience when using a custom domain. It can also be sourced from the `AUTH0_AUDIENCE` environment variable.
        /// </summary>
        [Input("audience")]
        public Input<string>? Audience { get; set; }

        /// <summary>
        /// Your Auth0 client ID. It can also be sourced from the `AUTH0_CLIENT_ID` environment variable.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// Your Auth0 client secret. It can also be sourced from the `AUTH0_CLIENT_SECRET` environment variable.
        /// </summary>
        [Input("clientSecret")]
        public Input<string>? ClientSecret { get; set; }

        /// <summary>
        /// Indicates whether to turn on debug mode.
        /// </summary>
        [Input("debug", json: true)]
        public Input<bool>? Debug { get; set; }

        /// <summary>
        /// Your Auth0 domain name. It can also be sourced from the `AUTH0_DOMAIN` environment variable.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        public ProviderArgs()
        {
            Debug = Utilities.GetEnvBoolean("AUTH0_DEBUG");
        }
        public static new ProviderArgs Empty => new ProviderArgs();
    }
}
