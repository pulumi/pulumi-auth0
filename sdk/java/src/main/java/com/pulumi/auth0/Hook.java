// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.HookArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.HookState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Hooks are secure, self-contained functions that allow you to customize the behavior of Auth0 when executed for selected extensibility points of the Auth0 platform. Auth0 invokes Hooks during runtime to execute your custom Node.js code. Depending on the extensibility point, you can use hooks with Database Connections and/or Passwordless Connections.
 * 
 * !&gt; This resource is deprecated. Refer to the [guide on how to migrate from hooks to actions](https://auth0.com/docs/customize/actions/migrate/migrate-from-hooks-to-actions) and manage your actions using the `auth0.Action` resource.
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
 * import com.pulumi.auth0.Hook;
 * import com.pulumi.auth0.HookArgs;
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
 *         var myHook = new Hook(&#34;myHook&#34;, HookArgs.builder()        
 *             .dependencies(Map.of(&#34;auth0&#34;, &#34;2.30.0&#34;))
 *             .enabled(true)
 *             .script(&#34;&#34;&#34;
 *     function (user, context, callback) {
 *       callback(null, { user });
 *     }
 *   
 *             &#34;&#34;&#34;)
 *             .secrets(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .triggerId(&#34;pre-user-registration&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * This resource can be imported by specifying the hook ID.
 * 
 * # 
 * 
 * Example:
 * 
 * ```sh
 * $ pulumi import auth0:index/hook:Hook my_hook &#34;00001&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/hook:Hook")
public class Hook extends com.pulumi.resources.CustomResource {
    /**
     * Dependencies of this hook used by the WebTask server.
     * 
     */
    @Export(name="dependencies", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> dependencies;

    /**
     * @return Dependencies of this hook used by the WebTask server.
     * 
     */
    public Output<Optional<Map<String,Object>>> dependencies() {
        return Codegen.optional(this.dependencies);
    }
    /**
     * Whether the hook is enabled, or disabled.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Whether the hook is enabled, or disabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * Name of this hook.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of this hook.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Code to be executed when this hook runs.
     * 
     */
    @Export(name="script", refs={String.class}, tree="[0]")
    private Output<String> script;

    /**
     * @return Code to be executed when this hook runs.
     * 
     */
    public Output<String> script() {
        return this.script;
    }
    /**
     * The secrets associated with the hook.
     * 
     */
    @Export(name="secrets", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> secrets;

    /**
     * @return The secrets associated with the hook.
     * 
     */
    public Output<Optional<Map<String,Object>>> secrets() {
        return Codegen.optional(this.secrets);
    }
    /**
     * Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
     * 
     */
    @Export(name="triggerId", refs={String.class}, tree="[0]")
    private Output<String> triggerId;

    /**
     * @return Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
     * 
     */
    public Output<String> triggerId() {
        return this.triggerId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Hook(String name) {
        this(name, HookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Hook(String name, HookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Hook(String name, HookArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/hook:Hook", name, args == null ? HookArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Hook(String name, Output<String> id, @Nullable HookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/hook:Hook", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "secrets"
            ))
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
    public static Hook get(String name, Output<String> id, @Nullable HookState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Hook(name, id, state, options);
    }
}
