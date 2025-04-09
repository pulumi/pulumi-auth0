// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.ConnectionClientsArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.ConnectionClientsState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * With this resource, you can manage all of the enabled clients on a connection.
 * 
 * !&gt; This resource manages all the enabled clients for a connection. In contrast, the `auth0.ConnectionClient` resource
 * appends an enabled client to a connection. To avoid potential issues, it is recommended not to use this
 * resource in conjunction with the `auth0.ConnectionClient` resource when managing enabled clients for the same
 * connection id.
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
 * import com.pulumi.auth0.ConnectionClients;
 * import com.pulumi.auth0.ConnectionClientsArgs;
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
 *         var myFirstClient = new Client("myFirstClient", ClientArgs.builder()
 *             .name("My-First-Auth0-Client")
 *             .build());
 * 
 *         var mySecondClient = new Client("mySecondClient", ClientArgs.builder()
 *             .name("My-Second-Auth0-Client")
 *             .build());
 * 
 *         // One connection to many clients association.
 *         // To prevent issues, avoid using this resource together with the `auth0_connection_client` resource.
 *         var myConnClientsAssoc = new ConnectionClients("myConnClientsAssoc", ConnectionClientsArgs.builder()
 *             .connectionId(myConn.id())
 *             .enabledClients(            
 *                 myFirstClient.id(),
 *                 mySecondClient.id())
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
 * This resource can be imported by specifying the Connection ID.
 * 
 * Example:
 * 
 * ```sh
 * $ pulumi import auth0:index/connectionClients:ConnectionClients my_conn_clients_assoc &#34;con_XXXXX&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/connectionClients:ConnectionClients")
public class ConnectionClients extends com.pulumi.resources.CustomResource {
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
     * IDs of the clients for which the connection is enabled.
     * 
     */
    @Export(name="enabledClients", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> enabledClients;

    /**
     * @return IDs of the clients for which the connection is enabled.
     * 
     */
    public Output<List<String>> enabledClients() {
        return this.enabledClients;
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
    public ConnectionClients(java.lang.String name) {
        this(name, ConnectionClientsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectionClients(java.lang.String name, ConnectionClientsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectionClients(java.lang.String name, ConnectionClientsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/connectionClients:ConnectionClients", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ConnectionClients(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectionClientsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/connectionClients:ConnectionClients", name, state, makeResourceOptions(options, id), false);
    }

    private static ConnectionClientsArgs makeArgs(ConnectionClientsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ConnectionClientsArgs.Empty : args;
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
    public static ConnectionClients get(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectionClientsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectionClients(name, id, state, options);
    }
}
