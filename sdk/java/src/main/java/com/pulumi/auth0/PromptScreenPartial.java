// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.PromptScreenPartialArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.PromptScreenPartialState;
import com.pulumi.auth0.outputs.PromptScreenPartialInsertionPoints;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * With this resource, you can manage a customized sign up and login experience by adding custom content, form elements and css/javascript. You can read more about this [here](https://auth0.com/docs/customize/universal-login-pages/customize-signup-and-login-prompts).
 * 
 * !&gt; This resource appends a specific prompt screen to the list of prompt screens displayed to the user during the authentication flow.
 *  In contrast, the `auth0.PromptScreenPartials` resource manages the complete set of prompt screens that are displayed during the
 *  authentication flow. To avoid potential issues, it is recommended not to use this resource in conjunction with the
 *  `auth0.PromptScreenPartials` resource when managing prompt screens for the same prompt.
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
 * import com.pulumi.auth0.PromptScreenPartial;
 * import com.pulumi.auth0.PromptScreenPartialArgs;
 * import com.pulumi.auth0.inputs.PromptScreenPartialInsertionPointsArgs;
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
 *         var login = new PromptScreenPartial("login", PromptScreenPartialArgs.builder()
 *             .promptType("login")
 *             .screenName("login")
 *             .insertionPoints(PromptScreenPartialInsertionPointsArgs.builder()
 *                 .formContentStart("<div>Form Content Start</div>")
 *                 .formContentEnd("<div>Form Content End</div>")
 *                 .build())
 *             .build());
 * 
 *         var customized_consent = new PromptScreenPartial("customized-consent", PromptScreenPartialArgs.builder()
 *             .promptType("customized-consent")
 *             .screenName("customized-consent")
 *             .insertionPoints(PromptScreenPartialInsertionPointsArgs.builder()
 *                 .formContent("<div>Form Content</div>")
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
 * This resource can be imported using the prompt name and screen_name.
 * 
 * As this is not a resource identifiable by an ID within the Auth0 Management API,
 * 
 * login can be imported using the prompt name and screen name using the format:
 * 
 * prompt_name:screen_name
 * 
 * Example:
 * 
 * ```sh
 * $ pulumi import auth0:index/promptScreenPartial:PromptScreenPartial login &#34;login:login&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/promptScreenPartial:PromptScreenPartial")
public class PromptScreenPartial extends com.pulumi.resources.CustomResource {
    /**
     * The insertion points for the partials.
     * 
     */
    @Export(name="insertionPoints", refs={PromptScreenPartialInsertionPoints.class}, tree="[0]")
    private Output</* @Nullable */ PromptScreenPartialInsertionPoints> insertionPoints;

    /**
     * @return The insertion points for the partials.
     * 
     */
    public Output<Optional<PromptScreenPartialInsertionPoints>> insertionPoints() {
        return Codegen.optional(this.insertionPoints);
    }
    /**
     * The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
     * 
     */
    @Export(name="promptType", refs={String.class}, tree="[0]")
    private Output<String> promptType;

    /**
     * @return The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`, `login-passwordless`, `customized-consent`.
     * 
     */
    public Output<String> promptType() {
        return this.promptType;
    }
    /**
     * The name of the screen associated with the partials
     * 
     */
    @Export(name="screenName", refs={String.class}, tree="[0]")
    private Output<String> screenName;

    /**
     * @return The name of the screen associated with the partials
     * 
     */
    public Output<String> screenName() {
        return this.screenName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PromptScreenPartial(java.lang.String name) {
        this(name, PromptScreenPartialArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PromptScreenPartial(java.lang.String name, PromptScreenPartialArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PromptScreenPartial(java.lang.String name, PromptScreenPartialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/promptScreenPartial:PromptScreenPartial", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private PromptScreenPartial(java.lang.String name, Output<java.lang.String> id, @Nullable PromptScreenPartialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/promptScreenPartial:PromptScreenPartial", name, state, makeResourceOptions(options, id), false);
    }

    private static PromptScreenPartialArgs makeArgs(PromptScreenPartialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PromptScreenPartialArgs.Empty : args;
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
    public static PromptScreenPartial get(java.lang.String name, Output<java.lang.String> id, @Nullable PromptScreenPartialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PromptScreenPartial(name, id, state, options);
    }
}
