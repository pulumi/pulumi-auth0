// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.OrganizationConnectionArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.OrganizationConnectionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * With this resource, you can manage enabled connections on an organization.
 * 
 * !&gt; This resource appends a connection to an organization. In contrast, the `auth0.OrganizationConnections` resource
 * manages all the connections enabled for an organization. To avoid potential issues, it is recommended not to use this
 * resource in conjunction with the `auth0.OrganizationConnections` resource when managing enabled connections for the
 * same organization id.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Connection;
 * import com.pulumi.auth0.ConnectionArgs;
 * import com.pulumi.auth0.Organization;
 * import com.pulumi.auth0.OrganizationArgs;
 * import com.pulumi.auth0.OrganizationConnection;
 * import com.pulumi.auth0.OrganizationConnectionArgs;
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
 *         var myConnection = new Connection(&#34;myConnection&#34;, ConnectionArgs.builder()        
 *             .strategy(&#34;auth0&#34;)
 *             .build());
 * 
 *         var myOrganization = new Organization(&#34;myOrganization&#34;, OrganizationArgs.builder()        
 *             .displayName(&#34;My Organization&#34;)
 *             .build());
 * 
 *         var myOrgConn = new OrganizationConnection(&#34;myOrgConn&#34;, OrganizationConnectionArgs.builder()        
 *             .organizationId(myOrganization.id())
 *             .connectionId(myConnection.id())
 *             .assignMembershipOnLogin(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported by specifying the organization ID and connection ID separated by &#34;::&#34; (note the double colon) &lt;organizationID&gt;::&lt;connectionID&gt; # Example
 * 
 * ```sh
 *  $ pulumi import auth0:index/organizationConnection:OrganizationConnection my_org_conn &#34;org_XXXXX::con_XXXXX&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/organizationConnection:OrganizationConnection")
public class OrganizationConnection extends com.pulumi.resources.CustomResource {
    /**
     * When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
     * 
     */
    @Export(name="assignMembershipOnLogin", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> assignMembershipOnLogin;

    /**
     * @return When true, all users that log in with this connection will be automatically granted membership in the organization. When false, users must be granted membership in the organization before logging in with this connection.
     * 
     */
    public Output<Optional<Boolean>> assignMembershipOnLogin() {
        return Codegen.optional(this.assignMembershipOnLogin);
    }
    /**
     * The ID of the connection to enable for the organization.
     * 
     */
    @Export(name="connectionId", refs={String.class}, tree="[0]")
    private Output<String> connectionId;

    /**
     * @return The ID of the connection to enable for the organization.
     * 
     */
    public Output<String> connectionId() {
        return this.connectionId;
    }
    /**
     * The name of the enabled connection.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the enabled connection.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the organization to enable the connection for.
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output<String> organizationId;

    /**
     * @return The ID of the organization to enable the connection for.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }
    /**
     * The strategy of the enabled connection.
     * 
     */
    @Export(name="strategy", refs={String.class}, tree="[0]")
    private Output<String> strategy;

    /**
     * @return The strategy of the enabled connection.
     * 
     */
    public Output<String> strategy() {
        return this.strategy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrganizationConnection(String name) {
        this(name, OrganizationConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationConnection(String name, OrganizationConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationConnection(String name, OrganizationConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/organizationConnection:OrganizationConnection", name, args == null ? OrganizationConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OrganizationConnection(String name, Output<String> id, @Nullable OrganizationConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/organizationConnection:OrganizationConnection", name, state, makeResourceOptions(options, id));
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
    public static OrganizationConnection get(String name, Output<String> id, @Nullable OrganizationConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationConnection(name, id, state, options);
    }
}
