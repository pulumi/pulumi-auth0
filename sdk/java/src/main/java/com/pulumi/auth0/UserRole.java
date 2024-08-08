// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.UserRoleArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.UserRoleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * With this resource, you can manage assigned roles for a user.
 * 
 * !&gt; This resource appends a role to a user. In contrast, the `auth0.UserRoles` resource manages all the roles assigned
 * to a user. To avoid potential issues, it is recommended not to use this resource in conjunction with the
 * `auth0.UserRoles` resource when managing roles for the same user id.
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
 * import com.pulumi.auth0.UserRole;
 * import com.pulumi.auth0.UserRoleArgs;
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
 *         // Example:
 *         var admin = new Role("admin", RoleArgs.builder()
 *             .name("admin")
 *             .description("Administrator")
 *             .build());
 * 
 *         var user = new User("user", UserArgs.builder()
 *             .connectionName("Username-Password-Authentication")
 *             .username("unique_username")
 *             .name("Firstname Lastname")
 *             .email("test}{@literal @}{@code test.com")
 *             .password("passpass$12$12")
 *             .build());
 * 
 *         var userRoles = new UserRole("userRoles", UserRoleArgs.builder()
 *             .userId(user.id())
 *             .roleId(admin.id())
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
 * user ID and role ID separated by &#34;::&#34; (note the double colon)
 * 
 * &lt;userID&gt;::&lt;roleID&gt;
 * 
 * # 
 * 
 * Example:
 * 
 * ```sh
 * $ pulumi import auth0:index/userRole:UserRole user_role &#34;auth0|111111111111111111111111::role_123&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/userRole:UserRole")
public class UserRole extends com.pulumi.resources.CustomResource {
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
     * ID of the role assigned to the user.
     * 
     */
    @Export(name="roleId", refs={String.class}, tree="[0]")
    private Output<String> roleId;

    /**
     * @return ID of the role assigned to the user.
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
     * ID of the user.
     * 
     */
    @Export(name="userId", refs={String.class}, tree="[0]")
    private Output<String> userId;

    /**
     * @return ID of the user.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserRole(java.lang.String name) {
        this(name, UserRoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserRole(java.lang.String name, UserRoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserRole(java.lang.String name, UserRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/userRole:UserRole", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private UserRole(java.lang.String name, Output<java.lang.String> id, @Nullable UserRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/userRole:UserRole", name, state, makeResourceOptions(options, id), false);
    }

    private static UserRoleArgs makeArgs(UserRoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? UserRoleArgs.Empty : args;
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
    public static UserRole get(java.lang.String name, Output<java.lang.String> id, @Nullable UserRoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserRole(name, id, state, options);
    }
}
