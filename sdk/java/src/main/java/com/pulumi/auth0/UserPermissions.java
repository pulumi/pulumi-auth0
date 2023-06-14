// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.UserPermissionsArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.UserPermissionsState;
import com.pulumi.auth0.outputs.UserPermissionsPermission;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * With this resource, you can manage all of a user&#39;s permissions.
 * 
 * !&gt; This resource manages all the permissions assigned to a user. In contrast, the `auth0.UserPermission` resource only
 * appends a permissions to a user. To avoid potential issues, it is recommended not to use this resource in conjunction
 * with the `auth0.UserPermission` resource when managing permissions for the same user id.
 * 
 * ## Import
 * 
 * This resource can be imported by specifying the user ID Example
 * 
 * ```sh
 *  $ pulumi import auth0:index/userPermissions:UserPermissions all_user_permissions &#34;auth0|111111111111111111111111&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/userPermissions:UserPermissions")
public class UserPermissions extends com.pulumi.resources.CustomResource {
    /**
     * List of API permissions granted to the user.
     * 
     */
    @Export(name="permissions", type=List.class, parameters={UserPermissionsPermission.class})
    private Output<List<UserPermissionsPermission>> permissions;

    /**
     * @return List of API permissions granted to the user.
     * 
     */
    public Output<List<UserPermissionsPermission>> permissions() {
        return this.permissions;
    }
    /**
     * ID of the user to associate the permission to.
     * 
     */
    @Export(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    /**
     * @return ID of the user to associate the permission to.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserPermissions(String name) {
        this(name, UserPermissionsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserPermissions(String name, UserPermissionsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserPermissions(String name, UserPermissionsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/userPermissions:UserPermissions", name, args == null ? UserPermissionsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserPermissions(String name, Output<String> id, @Nullable UserPermissionsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/userPermissions:UserPermissions", name, state, makeResourceOptions(options, id));
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
    public static UserPermissions get(String name, Output<String> id, @Nullable UserPermissionsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserPermissions(name, id, state, options);
    }
}
