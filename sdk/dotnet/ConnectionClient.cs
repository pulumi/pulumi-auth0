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
    /// With this resource, you can enable a single client on a connection.
    /// 
    /// !&gt; This resource appends an enabled client to a connection. In contrast, the `auth0.ConnectionClients` resource
    /// manages all the clients enabled for a connection. To avoid potential issues, it is recommended not to use this
    /// resource in conjunction with the `auth0.ConnectionClients` resource when managing enabled clients for the
    /// same connection id.
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
    ///     var myConn = new Auth0.Connection("myConn", new()
    ///     {
    ///         Strategy = "auth0",
    ///     });
    /// 
    ///     var myClient = new Auth0.Client("myClient");
    /// 
    ///     // One connection to one client association.
    ///     // To prevent issues, avoid using this resource together with the `auth0_connection_clients` resource.
    ///     var myConnClientAssoc = new Auth0.ConnectionClient("myConnClientAssoc", new()
    ///     {
    ///         ConnectionId = myConn.Id,
    ///         ClientId = myClient.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by specifying the connection ID and client ID separated by ":". # Example
    /// 
    /// ```sh
    ///  $ pulumi import auth0:index/connectionClient:ConnectionClient my_conn_client_assoc con_XXXXX:XXXXXXXX
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/connectionClient:ConnectionClient")]
    public partial class ConnectionClient : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ID of the client for which the connection is enabled.
        /// </summary>
        [Output("clientId")]
        public Output<string> ClientId { get; private set; } = null!;

        /// <summary>
        /// ID of the connection on which to enable the client.
        /// </summary>
        [Output("connectionId")]
        public Output<string> ConnectionId { get; private set; } = null!;

        /// <summary>
        /// The name of the connection on which to enable the client.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The strategy of the connection on which to enable the client.
        /// </summary>
        [Output("strategy")]
        public Output<string> Strategy { get; private set; } = null!;


        /// <summary>
        /// Create a ConnectionClient resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ConnectionClient(string name, ConnectionClientArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/connectionClient:ConnectionClient", name, args ?? new ConnectionClientArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ConnectionClient(string name, Input<string> id, ConnectionClientState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/connectionClient:ConnectionClient", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ConnectionClient resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ConnectionClient Get(string name, Input<string> id, ConnectionClientState? state = null, CustomResourceOptions? options = null)
        {
            return new ConnectionClient(name, id, state, options);
        }
    }

    public sealed class ConnectionClientArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the client for which the connection is enabled.
        /// </summary>
        [Input("clientId", required: true)]
        public Input<string> ClientId { get; set; } = null!;

        /// <summary>
        /// ID of the connection on which to enable the client.
        /// </summary>
        [Input("connectionId", required: true)]
        public Input<string> ConnectionId { get; set; } = null!;

        public ConnectionClientArgs()
        {
        }
        public static new ConnectionClientArgs Empty => new ConnectionClientArgs();
    }

    public sealed class ConnectionClientState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the client for which the connection is enabled.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// ID of the connection on which to enable the client.
        /// </summary>
        [Input("connectionId")]
        public Input<string>? ConnectionId { get; set; }

        /// <summary>
        /// The name of the connection on which to enable the client.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The strategy of the connection on which to enable the client.
        /// </summary>
        [Input("strategy")]
        public Input<string>? Strategy { get; set; }

        public ConnectionClientState()
        {
        }
        public static new ConnectionClientState Empty => new ConnectionClientState();
    }
}
