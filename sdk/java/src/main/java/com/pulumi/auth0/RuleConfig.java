// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.RuleConfigArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.RuleConfigState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * With Auth0, you can create custom Javascript snippets that run in a secure, isolated sandbox as part of your authentication pipeline, which are otherwise known as rules. This resource allows you to create and manage variables that are available to all rules via Auth0&#39;s global configuration object. Used in conjunction with configured rules.
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
 * import com.pulumi.auth0.Rule;
 * import com.pulumi.auth0.RuleArgs;
 * import com.pulumi.auth0.RuleConfig;
 * import com.pulumi.auth0.RuleConfigArgs;
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
 *         var myRule = new Rule("myRule", RuleArgs.builder()
 *             .name("empty-rule")
 *             .script("""
 *     function (user, context, callback) {
 *       callback(null, user, context);
 *     }
 *             """)
 *             .enabled(true)
 *             .build());
 * 
 *         var myRuleConfig = new RuleConfig("myRuleConfig", RuleConfigArgs.builder()
 *             .key("foo")
 *             .value("bar")
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
 * Existing rule configs can be imported using their key name.
 * 
 * Example:
 * 
 * ```sh
 * $ pulumi import auth0:index/ruleConfig:RuleConfig my_rule_config &#34;foo&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/ruleConfig:RuleConfig")
public class RuleConfig extends com.pulumi.resources.CustomResource {
    /**
     * Key for a rules configuration variable.
     * 
     */
    @Export(name="key", refs={String.class}, tree="[0]")
    private Output<String> key;

    /**
     * @return Key for a rules configuration variable.
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * Value for a rules configuration variable.
     * 
     */
    @Export(name="value", refs={String.class}, tree="[0]")
    private Output<String> value;

    /**
     * @return Value for a rules configuration variable.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RuleConfig(java.lang.String name) {
        this(name, RuleConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RuleConfig(java.lang.String name, RuleConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RuleConfig(java.lang.String name, RuleConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/ruleConfig:RuleConfig", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RuleConfig(java.lang.String name, Output<java.lang.String> id, @Nullable RuleConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/ruleConfig:RuleConfig", name, state, makeResourceOptions(options, id), false);
    }

    private static RuleConfigArgs makeArgs(RuleConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RuleConfigArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "value"
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
    public static RuleConfig get(java.lang.String name, Output<java.lang.String> id, @Nullable RuleConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RuleConfig(name, id, state, options);
    }
}
