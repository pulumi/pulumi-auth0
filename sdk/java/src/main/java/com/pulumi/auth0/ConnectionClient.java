// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.ConnectionClientArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.ConnectionClientState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * With this resource, you can enable a single client on a connection.
 * 
 * !&gt; This resource appends an enabled client to a connection. In contrast, the `auth0.ConnectionClients` resource
 * manages all the clients enabled for a connection. To avoid potential issues, it is recommended not to use this
 * resource in conjunction with the `auth0.ConnectionClients` resource when managing enabled clients for the
 * same connection id.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Connection;
 * import com.pulumi.auth0.ConnectionArgs;
 * import com.pulumi.auth0.Client;
 * import com.pulumi.auth0.ClientArgs;
 * import com.pulumi.auth0.ConnectionClient;
 * import com.pulumi.auth0.ConnectionClientArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var myConn = new Connection("myConn", ConnectionArgs.builder()
 *             .name("My-Auth0-Connection")
 *             .strategy("auth0")
 *             .build());
 * 
 *         var myClient = new Client("myClient", ClientArgs.builder()
 *             .name("My-Auth0-Client")
 *             .build());
 * 
 *         // One connection to one client association.
 *         // To prevent issues, avoid using this resource together with the `auth0_connection_clients` resource.
 *         var myConnClientAssoc = new ConnectionClient("myConnClientAssoc", ConnectionClientArgs.builder()
 *             .connectionId(myConn.id())
 *             .clientId(myClient.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * This resource can be imported by specifying the
 * 
 * connection ID and client ID separated by &#34;::&#34; (note the double colon)
 * 
 * &lt;connectionID&gt;::&lt;clientID&gt;
 * 
 * Example:
 * 
 * ```sh
 * $ pulumi import auth0:index/connectionClient:ConnectionClient my_conn_client_assoc &#34;con_XXXXX::XXXXXXXX&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/connectionClient:ConnectionClient")
public class ConnectionClient extends com.pulumi.resources.CustomResource {
    /**
     * ID of the client for which the connection is enabled.
     * 
     */
    @Export(name="clientId", refs={String.class}, tree="[0]")
    private Output<String> clientId;

    /**
     * @return ID of the client for which the connection is enabled.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }
    /**
     * ID of the connection on which to enable the client.
     * 
     */
    @Export(name="connectionId", refs={String.class}, tree="[0]")
    private Output<String> connectionId;

    /**
     * @return ID of the connection on which to enable the client.
     * 
     */
    public Output<String> connectionId() {
        return this.connectionId;
    }
    /**
     * The name of the connection on which to enable the client.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the connection on which to enable the client.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The strategy of the connection on which to enable the client.
     * 
     */
    @Export(name="strategy", refs={String.class}, tree="[0]")
    private Output<String> strategy;

    /**
     * @return The strategy of the connection on which to enable the client.
     * 
     */
    public Output<String> strategy() {
        return this.strategy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectionClient(java.lang.String name) {
        this(name, ConnectionClientArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectionClient(java.lang.String name, ConnectionClientArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectionClient(java.lang.String name, ConnectionClientArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/connectionClient:ConnectionClient", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ConnectionClient(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectionClientState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/connectionClient:ConnectionClient", name, state, makeResourceOptions(options, id), false);
    }

    private static ConnectionClientArgs makeArgs(ConnectionClientArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ConnectionClientArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ConnectionClient get(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectionClientState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectionClient(name, id, state, options);
    }
}
