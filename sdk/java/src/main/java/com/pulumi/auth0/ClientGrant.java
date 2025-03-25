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
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Auth0 uses various grant types, or methods by which you grant limited access to your resources to another entity without exposing credentials. The OAuth 2.0 protocol supports several types of grants, which allow different types of access. This resource allows you to create and manage client grants used with configured Auth0 clients.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * This resource can be imported by specifying the client grant ID.
 * 
 * You can find this within the Management Dashboard in Application -&gt; APIs -&gt; Expand the required API.
 * 
 * Example:
 * 
 * ```sh
 * $ pulumi import auth0:index/clientGrant:ClientGrant my_client_grant &#34;cgr_XXXXXXXXXXXXXXXX&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/clientGrant:ClientGrant")
public class ClientGrant extends com.pulumi.resources.CustomResource {
    /**
     * If enabled, any organization can be used with this grant. If disabled (default), the grant must be explicitly assigned to the desired organizations.
     * 
     */
    @Export(name="allowAnyOrganization", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowAnyOrganization;

    /**
     * @return If enabled, any organization can be used with this grant. If disabled (default), the grant must be explicitly assigned to the desired organizations.
     * 
     */
    public Output<Optional<Boolean>> allowAnyOrganization() {
        return Codegen.optional(this.allowAnyOrganization);
    }
    /**
     * Audience or API Identifier for this grant.
     * 
     */
    @Export(name="audience", refs={String.class}, tree="[0]")
    private Output<String> audience;

    /**
     * @return Audience or API Identifier for this grant.
     * 
     */
    public Output<String> audience() {
        return this.audience;
    }
    /**
     * ID of the client for this grant.
     * 
     */
    @Export(name="clientId", refs={String.class}, tree="[0]")
    private Output<String> clientId;

    /**
     * @return ID of the client for this grant.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }
    /**
     * Defines whether organizations can be used with client credentials exchanges for this grant. (defaults to deny when not defined)
     * 
     */
    @Export(name="organizationUsage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> organizationUsage;

    /**
     * @return Defines whether organizations can be used with client credentials exchanges for this grant. (defaults to deny when not defined)
     * 
     */
    public Output<Optional<String>> organizationUsage() {
        return Codegen.optional(this.organizationUsage);
    }
    /**
     * Permissions (scopes) included in this grant.
     * 
     */
    @Export(name="scopes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> scopes;

    /**
     * @return Permissions (scopes) included in this grant.
     * 
     */
    public Output<List<String>> scopes() {
        return this.scopes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClientGrant(java.lang.String name) {
        this(name, ClientGrantArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClientGrant(java.lang.String name, ClientGrantArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClientGrant(java.lang.String name, ClientGrantArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/clientGrant:ClientGrant", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ClientGrant(java.lang.String name, Output<java.lang.String> id, @Nullable ClientGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/clientGrant:ClientGrant", name, state, makeResourceOptions(options, id), false);
    }

    private static ClientGrantArgs makeArgs(ClientGrantArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ClientGrantArgs.Empty : args;
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
    public static ClientGrant get(java.lang.String name, Output<java.lang.String> id, @Nullable ClientGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClientGrant(name, id, state, options);
    }
}
