// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.UserRolesArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.UserRolesState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * With this resource, you can manage assigned roles for a user.
 * 
 * !&gt; This resource manages all the roles assigned to a user. In contrast, the `auth0.UserRole` resource only appends a
 * role to a user. To avoid potential issues, it is recommended not to use this resource in conjunction with the
 * `auth0.UserRole` resource when managing roles for the same user id.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Role;
 * import com.pulumi.auth0.RoleArgs;
 * import com.pulumi.auth0.User;
 * import com.pulumi.auth0.UserArgs;
 * import com.pulumi.auth0.UserRoles;
 * import com.pulumi.auth0.UserRolesArgs;
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
 *         // Example:
 *         var admin = new Role(&#34;admin&#34;, RoleArgs.builder()        
 *             .description(&#34;Administrator&#34;)
 *             .build());
 * 
 *         var user = new User(&#34;user&#34;, UserArgs.builder()        
 *             .connectionName(&#34;Username-Password-Authentication&#34;)
 *             .username(&#34;unique_username&#34;)
 *             .email(&#34;test@test.com&#34;)
 *             .password(&#34;passpass$12$12&#34;)
 *             .build());
 * 
 *         var userRoles = new UserRoles(&#34;userRoles&#34;, UserRolesArgs.builder()        
 *             .userId(user.id())
 *             .roles(admin.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * This resource can be imported using the user ID.
 * 
 * # 
 * 
 * Example:
 * 
 * ```sh
 * $ pulumi import auth0:index/userRoles:UserRoles user_roles &#34;auth0|111111111111111111111111&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/userRoles:UserRoles")
public class UserRoles extends com.pulumi.resources.CustomResource {
    /**
     * Set of IDs of roles assigned to the user.
     * 
     */
    @Export(name="roles", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> roles;

    /**
     * @return Set of IDs of roles assigned to the user.
     * 
     */
    public Output<List<String>> roles() {
        return this.roles;
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
    public UserRoles(String name) {
        this(name, UserRolesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserRoles(String name, UserRolesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserRoles(String name, UserRolesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/userRoles:UserRoles", name, args == null ? UserRolesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserRoles(String name, Output<String> id, @Nullable UserRolesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/userRoles:UserRoles", name, state, makeResourceOptions(options, id));
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
    public static UserRoles get(String name, Output<String> id, @Nullable UserRolesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserRoles(name, id, state, options);
    }
}
