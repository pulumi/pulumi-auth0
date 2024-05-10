// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.OrganizationArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.OrganizationState;
import com.pulumi.auth0.outputs.OrganizationBranding;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The Organizations feature represents a broad update to the Auth0 platform that allows our business-to-business (B2B) customers to better manage their partners and customers, and to customize the ways that end-users access their applications. Auth0 customers can use Organizations to:
 * 
 *   - Represent their business customers and partners in Auth0 and manage their
 *     membership.
 *   - Configure branded, federated login flows for each business.
 *   - Build administration capabilities into their products, using Organizations
 *     APIs, so that those businesses can manage their own organizations.
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
 * import com.pulumi.auth0.Organization;
 * import com.pulumi.auth0.OrganizationArgs;
 * import com.pulumi.auth0.inputs.OrganizationBrandingArgs;
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
 *         var myOrganization = new Organization("myOrganization", OrganizationArgs.builder()        
 *             .name("auth0-inc")
 *             .displayName("Auth0 Inc.")
 *             .branding(OrganizationBrandingArgs.builder()
 *                 .logoUrl("https://example.com/assets/icons/icon.png")
 *                 .colors(Map.ofEntries(
 *                     Map.entry("primary", "#f2f2f2"),
 *                     Map.entry("page_background", "#e1e1e1")
 *                 ))
 *                 .build())
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
 * This resource can be imported by specifying the organization ID.
 * 
 * # 
 * 
 * Example:
 * 
 * ```sh
 * $ pulumi import auth0:index/organization:Organization my_organization &#34;org_XXXXXXXXXXXXXX&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/organization:Organization")
public class Organization extends com.pulumi.resources.CustomResource {
    /**
     * Defines how to style the login pages.
     * 
     */
    @Export(name="branding", refs={OrganizationBranding.class}, tree="[0]")
    private Output<OrganizationBranding> branding;

    /**
     * @return Defines how to style the login pages.
     * 
     */
    public Output<OrganizationBranding> branding() {
        return this.branding;
    }
    /**
     * Friendly name of this organization.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Friendly name of this organization.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * Metadata associated with the organization. Maximum of 10 metadata properties allowed.
     * 
     */
    @Export(name="metadata", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> metadata;

    /**
     * @return Metadata associated with the organization. Maximum of 10 metadata properties allowed.
     * 
     */
    public Output<Optional<Map<String,String>>> metadata() {
        return Codegen.optional(this.metadata);
    }
    /**
     * The name of this organization.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of this organization.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Organization(String name) {
        this(name, OrganizationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Organization(String name, @Nullable OrganizationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Organization(String name, @Nullable OrganizationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/organization:Organization", name, args == null ? OrganizationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Organization(String name, Output<String> id, @Nullable OrganizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/organization:Organization", name, state, makeResourceOptions(options, id));
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
    public static Organization get(String name, Output<String> id, @Nullable OrganizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Organization(name, id, state, options);
    }
}
