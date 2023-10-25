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
    /// With this resource, you can set up APIs that can be consumed from your authorized applications.
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
    ///     var myResourceServer = new Auth0.ResourceServer("myResourceServer", new()
    ///     {
    ///         AllowOfflineAccess = true,
    ///         Identifier = "https://api.example.com",
    ///         SigningAlg = "RS256",
    ///         SkipConsentForVerifiableFirstPartyClients = true,
    ///         TokenLifetime = 8600,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Existing resource servers can be imported using their ID. # Example
    /// 
    /// ```sh
    ///  $ pulumi import auth0:index/resourceServer:ResourceServer my_resource_server "XXXXXXXXXXXXXXXXXXXXXXX"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/resourceServer:ResourceServer")]
    public partial class ResourceServer : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Indicates whether refresh tokens can be issued for this resource server.
        /// </summary>
        [Output("allowOfflineAccess")]
        public Output<bool?> AllowOfflineAccess { get; private set; } = null!;

        /// <summary>
        /// If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
        /// </summary>
        [Output("enforcePolicies")]
        public Output<bool> EnforcePolicies { get; private set; } = null!;

        /// <summary>
        /// Unique identifier for the resource server. Used as the audience parameter for authorization calls. Cannot be changed once set.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Friendly name for the resource server. Cannot include `&lt;` or `&gt;` characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
        /// </summary>
        [Output("signingAlg")]
        public Output<string> SigningAlg { get; private set; } = null!;

        /// <summary>
        /// Secret used to sign tokens when using symmetric algorithms (HS256).
        /// </summary>
        [Output("signingSecret")]
        public Output<string> SigningSecret { get; private set; } = null!;

        /// <summary>
        /// Indicates whether to skip user consent for applications flagged as first party.
        /// </summary>
        [Output("skipConsentForVerifiableFirstPartyClients")]
        public Output<bool> SkipConsentForVerifiableFirstPartyClients { get; private set; } = null!;

        /// <summary>
        /// Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz`. If this setting is set to `access_token_authz`, the Permissions claim will be added to the access token. Only available if RBAC (`enforce_policies`) is enabled for this API.
        /// </summary>
        [Output("tokenDialect")]
        public Output<string?> TokenDialect { get; private set; } = null!;

        /// <summary>
        /// Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
        /// </summary>
        [Output("tokenLifetime")]
        public Output<int> TokenLifetime { get; private set; } = null!;

        /// <summary>
        /// Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
        /// </summary>
        [Output("tokenLifetimeForWeb")]
        public Output<int> TokenLifetimeForWeb { get; private set; } = null!;

        /// <summary>
        /// URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
        /// </summary>
        [Output("verificationLocation")]
        public Output<string?> VerificationLocation { get; private set; } = null!;


        /// <summary>
        /// Create a ResourceServer resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResourceServer(string name, ResourceServerArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/resourceServer:ResourceServer", name, args ?? new ResourceServerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ResourceServer(string name, Input<string> id, ResourceServerState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/resourceServer:ResourceServer", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ResourceServer resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResourceServer Get(string name, Input<string> id, ResourceServerState? state = null, CustomResourceOptions? options = null)
        {
            return new ResourceServer(name, id, state, options);
        }
    }

    public sealed class ResourceServerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether refresh tokens can be issued for this resource server.
        /// </summary>
        [Input("allowOfflineAccess")]
        public Input<bool>? AllowOfflineAccess { get; set; }

        /// <summary>
        /// If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
        /// </summary>
        [Input("enforcePolicies")]
        public Input<bool>? EnforcePolicies { get; set; }

        /// <summary>
        /// Unique identifier for the resource server. Used as the audience parameter for authorization calls. Cannot be changed once set.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Friendly name for the resource server. Cannot include `&lt;` or `&gt;` characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
        /// </summary>
        [Input("signingAlg")]
        public Input<string>? SigningAlg { get; set; }

        /// <summary>
        /// Secret used to sign tokens when using symmetric algorithms (HS256).
        /// </summary>
        [Input("signingSecret")]
        public Input<string>? SigningSecret { get; set; }

        /// <summary>
        /// Indicates whether to skip user consent for applications flagged as first party.
        /// </summary>
        [Input("skipConsentForVerifiableFirstPartyClients")]
        public Input<bool>? SkipConsentForVerifiableFirstPartyClients { get; set; }

        /// <summary>
        /// Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz`. If this setting is set to `access_token_authz`, the Permissions claim will be added to the access token. Only available if RBAC (`enforce_policies`) is enabled for this API.
        /// </summary>
        [Input("tokenDialect")]
        public Input<string>? TokenDialect { get; set; }

        /// <summary>
        /// Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
        /// </summary>
        [Input("tokenLifetime")]
        public Input<int>? TokenLifetime { get; set; }

        /// <summary>
        /// Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
        /// </summary>
        [Input("tokenLifetimeForWeb")]
        public Input<int>? TokenLifetimeForWeb { get; set; }

        /// <summary>
        /// URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
        /// </summary>
        [Input("verificationLocation")]
        public Input<string>? VerificationLocation { get; set; }

        public ResourceServerArgs()
        {
        }
        public static new ResourceServerArgs Empty => new ResourceServerArgs();
    }

    public sealed class ResourceServerState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether refresh tokens can be issued for this resource server.
        /// </summary>
        [Input("allowOfflineAccess")]
        public Input<bool>? AllowOfflineAccess { get; set; }

        /// <summary>
        /// If this setting is enabled, RBAC authorization policies will be enforced for this API. Role and permission assignments will be evaluated during the login transaction.
        /// </summary>
        [Input("enforcePolicies")]
        public Input<bool>? EnforcePolicies { get; set; }

        /// <summary>
        /// Unique identifier for the resource server. Used as the audience parameter for authorization calls. Cannot be changed once set.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Friendly name for the resource server. Cannot include `&lt;` or `&gt;` characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
        /// </summary>
        [Input("signingAlg")]
        public Input<string>? SigningAlg { get; set; }

        /// <summary>
        /// Secret used to sign tokens when using symmetric algorithms (HS256).
        /// </summary>
        [Input("signingSecret")]
        public Input<string>? SigningSecret { get; set; }

        /// <summary>
        /// Indicates whether to skip user consent for applications flagged as first party.
        /// </summary>
        [Input("skipConsentForVerifiableFirstPartyClients")]
        public Input<bool>? SkipConsentForVerifiableFirstPartyClients { get; set; }

        /// <summary>
        /// Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz`. If this setting is set to `access_token_authz`, the Permissions claim will be added to the access token. Only available if RBAC (`enforce_policies`) is enabled for this API.
        /// </summary>
        [Input("tokenDialect")]
        public Input<string>? TokenDialect { get; set; }

        /// <summary>
        /// Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
        /// </summary>
        [Input("tokenLifetime")]
        public Input<int>? TokenLifetime { get; set; }

        /// <summary>
        /// Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
        /// </summary>
        [Input("tokenLifetimeForWeb")]
        public Input<int>? TokenLifetimeForWeb { get; set; }

        /// <summary>
        /// URL from which to retrieve JWKs for this resource server. Used for verifying the JWT sent to Auth0 for token introspection.
        /// </summary>
        [Input("verificationLocation")]
        public Input<string>? VerificationLocation { get; set; }

        public ResourceServerState()
        {
        }
        public static new ResourceServerState Empty => new ResourceServerState();
    }
}
