// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.ClientGrantArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.ClientGrantState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Auth0 uses various grant types, or methods by which you grant limited access to your resources to another entity without
 * exposing credentials. The OAuth 2.0 protocol supports several types of grants, which allow different types of access.
 * This resource allows you to create and manage client grants used with configured Auth0 clients.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Client;
 * import com.pulumi.auth0.ResourceServer;
 * import com.pulumi.auth0.ResourceServerArgs;
 * import com.pulumi.auth0.inputs.ResourceServerScopeArgs;
 * import com.pulumi.auth0.ClientGrant;
 * import com.pulumi.auth0.ClientGrantArgs;
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
 *         var myClient = new Client(&#34;myClient&#34;);
 * 
 *         var myResourceServer = new ResourceServer(&#34;myResourceServer&#34;, ResourceServerArgs.builder()        
 *             .identifier(&#34;https://api.example.com/client-grant&#34;)
 *             .scopes(            
 *                 ResourceServerScopeArgs.builder()
 *                     .value(&#34;create:foo&#34;)
 *                     .description(&#34;Create foos&#34;)
 *                     .build(),
 *                 ResourceServerScopeArgs.builder()
 *                     .value(&#34;create:bar&#34;)
 *                     .description(&#34;Create bars&#34;)
 *                     .build())
 *             .build());
 * 
 *         var myClientGrant = new ClientGrant(&#34;myClientGrant&#34;, ClientGrantArgs.builder()        
 *             .clientId(myClient.id())
 *             .audience(myResourceServer.identifier())
 *             .scopes(&#34;create:foo&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Client grants can be imported using the grant ID (Application -&gt; APIs -&gt; Expand the required API)
 * 
 * ```sh
 *  $ pulumi import auth0:index/clientGrant:ClientGrant my_client_grant cgr_XXXXXXXXXXXXXXXX
 * ```
 * 
 */
@ResourceType(type="auth0:index/clientGrant:ClientGrant")
public class ClientGrant extends com.pulumi.resources.CustomResource {
    /**
     * String. Audience or API Identifier for this grant.
     * 
     */
    @Export(name="audience", type=String.class, parameters={})
    private Output<String> audience;

    /**
     * @return String. Audience or API Identifier for this grant.
     * 
     */
    public Output<String> audience() {
        return this.audience;
    }
    /**
     * String. ID of the client for this grant.
     * 
     */
    @Export(name="clientId", type=String.class, parameters={})
    private Output<String> clientId;

    /**
     * @return String. ID of the client for this grant.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }
    /**
     * List(String). Permissions (scopes) included in this grant.
     * 
     */
    @Export(name="scopes", type=List.class, parameters={String.class})
    private Output<List<String>> scopes;

    /**
     * @return List(String). Permissions (scopes) included in this grant.
     * 
     */
    public Output<List<String>> scopes() {
        return this.scopes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClientGrant(String name) {
        this(name, ClientGrantArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClientGrant(String name, ClientGrantArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClientGrant(String name, ClientGrantArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/clientGrant:ClientGrant", name, args == null ? ClientGrantArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClientGrant(String name, Output<String> id, @Nullable ClientGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/clientGrant:ClientGrant", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static ClientGrant get(String name, Output<String> id, @Nullable ClientGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClientGrant(name, id, state, options);
    }
}