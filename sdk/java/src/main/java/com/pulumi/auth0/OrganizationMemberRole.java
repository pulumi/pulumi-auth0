// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.OrganizationMemberRoleArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.OrganizationMemberRoleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource is used to manage the roles assigned to an organization member.
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
 * import com.pulumi.auth0.Role;
 * import com.pulumi.auth0.RoleArgs;
 * import com.pulumi.auth0.User;
 * import com.pulumi.auth0.UserArgs;
 * import com.pulumi.auth0.Organization;
 * import com.pulumi.auth0.OrganizationArgs;
 * import com.pulumi.auth0.OrganizationMember;
 * import com.pulumi.auth0.OrganizationMemberArgs;
 * import com.pulumi.auth0.OrganizationMemberRole;
 * import com.pulumi.auth0.OrganizationMemberRoleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App }{{@code
 *     public static void main(String[] args) }{{@code
 *         Pulumi.run(App::stack);
 *     }}{@code
 * 
 *     public static void stack(Context ctx) }{{@code
 *         var reader = new Role("reader", RoleArgs.builder()
 *             .name("Reader")
 *             .build());
 * 
 *         var writer = new Role("writer", RoleArgs.builder()
 *             .name("Writer")
 *             .build());
 * 
 *         var user = new User("user", UserArgs.builder()
 *             .connectionName("Username-Password-Authentication")
 *             .email("test-user}{@literal @}{@code auth0.com")
 *             .password("MyPass123$")
 *             .build());
 * 
 *         var myOrg = new Organization("myOrg", OrganizationArgs.builder()
 *             .name("some-org")
 *             .displayName("Some Org")
 *             .build());
 * 
 *         var myOrgMember = new OrganizationMember("myOrgMember", OrganizationMemberArgs.builder()
 *             .organizationId(myOrg.id())
 *             .userId(user.id())
 *             .build());
 * 
 *         var role1 = new OrganizationMemberRole("role1", OrganizationMemberRoleArgs.builder()
 *             .organizationId(myOrg.id())
 *             .userId(user.id())
 *             .roleId(reader.id())
 *             .build());
 * 
 *         var role2 = new OrganizationMemberRole("role2", OrganizationMemberRoleArgs.builder()
 *             .organizationId(myOrg.id())
 *             .userId(user.id())
 *             .roleId(writer.id())
 *             .build());
 * 
 *     }}{@code
 * }}{@code
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * This resource can be imported by specifying the
 * 
 * organization ID, user ID and role ID separated by &#34;::&#34; (note the double colon)
 * 
 * &lt;organizationID&gt;::&lt;userID&gt;::&lt;roleID&gt;
 * 
 * Example:
 * 
 * ```sh
 * $ pulumi import auth0:index/organizationMemberRole:OrganizationMemberRole my_org_member_role &#34;org_XXXXX::auth0|XXXXX::role_XXXX&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/organizationMemberRole:OrganizationMemberRole")
public class OrganizationMemberRole extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the organization.
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output<String> organizationId;

    /**
     * @return The ID of the organization.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }
    /**
     * Description of the role.
     * 
     */
    @Export(name="roleDescription", refs={String.class}, tree="[0]")
    private Output<String> roleDescription;

    /**
     * @return Description of the role.
     * 
     */
    public Output<String> roleDescription() {
        return this.roleDescription;
    }
    /**
     * The role ID to assign to the organization member.
     * 
     */
    @Export(name="roleId", refs={String.class}, tree="[0]")
    private Output<String> roleId;

    /**
     * @return The role ID to assign to the organization member.
     * 
     */
    public Output<String> roleId() {
        return this.roleId;
    }
    /**
     * Name of the role.
     * 
     */
    @Export(name="roleName", refs={String.class}, tree="[0]")
    private Output<String> roleName;

    /**
     * @return Name of the role.
     * 
     */
    public Output<String> roleName() {
        return this.roleName;
    }
    /**
     * The user ID of the organization member.
     * 
     */
    @Export(name="userId", refs={String.class}, tree="[0]")
    private Output<String> userId;

    /**
     * @return The user ID of the organization member.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OrganizationMemberRole(java.lang.String name) {
        this(name, OrganizationMemberRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OrganizationMemberRole(java.lang.String name, OrganizationMemberRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OrganizationMemberRole(java.lang.String name, OrganizationMemberRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/organizationMemberRole:OrganizationMemberRole", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private OrganizationMemberRole(java.lang.String name, Output<java.lang.String> id, @Nullable OrganizationMemberRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/organizationMemberRole:OrganizationMemberRole", name, state, makeResourceOptions(options, id), false);
    }

    private static OrganizationMemberRoleArgs makeArgs(OrganizationMemberRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? OrganizationMemberRoleArgs.Empty : args;
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
    public static OrganizationMemberRole get(java.lang.String name, Output<java.lang.String> id, @Nullable OrganizationMemberRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OrganizationMemberRole(name, id, state, options);
    }
}
