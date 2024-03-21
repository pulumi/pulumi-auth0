// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.PromptPartialsArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.PromptPartialsState;
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
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.PromptPartials;
 * import com.pulumi.auth0.PromptPartialsArgs;
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
 *         var myLoginPromptPartials = new PromptPartials(&#34;myLoginPromptPartials&#34;, PromptPartialsArgs.builder()        
 *             .formContentEnd(&#34;&lt;div&gt;Updated Form Content End&lt;/div&gt;&#34;)
 *             .formContentStart(&#34;&lt;div&gt;Updated Form Content Start&lt;/div&gt;&#34;)
 *             .formFooterEnd(&#34;&lt;div&gt;Updated Footer End&lt;/div&gt;&#34;)
 *             .formFooterStart(&#34;&lt;div&gt;Updated Footer Start&lt;/div&gt;&#34;)
 *             .prompt(&#34;login&#34;)
 *             .secondaryActionsEnd(&#34;&lt;div&gt;Updated Secondary Actions End&lt;/div&gt;&#34;)
 *             .secondaryActionsStart(&#34;&lt;div&gt;Updated Secondary Actions Start&lt;/div&gt;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * This resource can be imported using the prompt name.
 * 
 * # 
 * 
 * Example:
 * 
 * ```sh
 * $ pulumi import auth0:index/promptPartials:PromptPartials my_login_prompt_partials &#34;login&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/promptPartials:PromptPartials")
public class PromptPartials extends com.pulumi.resources.CustomResource {
    /**
     * Content that goes at the end of the form.
     * 
     */
    @Export(name="formContentEnd", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> formContentEnd;

    /**
     * @return Content that goes at the end of the form.
     * 
     */
    public Output<Optional<String>> formContentEnd() {
        return Codegen.optional(this.formContentEnd);
    }
    /**
     * Content that goes at the start of the form.
     * 
     */
    @Export(name="formContentStart", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> formContentStart;

    /**
     * @return Content that goes at the start of the form.
     * 
     */
    public Output<Optional<String>> formContentStart() {
        return Codegen.optional(this.formContentStart);
    }
    /**
     * Footer content for the end of the footer.
     * 
     */
    @Export(name="formFooterEnd", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> formFooterEnd;

    /**
     * @return Footer content for the end of the footer.
     * 
     */
    public Output<Optional<String>> formFooterEnd() {
        return Codegen.optional(this.formFooterEnd);
    }
    /**
     * Footer content for the start of the footer.
     * 
     */
    @Export(name="formFooterStart", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> formFooterStart;

    /**
     * @return Footer content for the start of the footer.
     * 
     */
    public Output<Optional<String>> formFooterStart() {
        return Codegen.optional(this.formFooterStart);
    }
    /**
     * The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`.
     * 
     */
    @Export(name="prompt", refs={String.class}, tree="[0]")
    private Output<String> prompt;

    /**
     * @return The prompt that you are adding partials for. Options are: `login-id`, `login`, `login-password`, `signup`, `signup-id`, `signup-password`.
     * 
     */
    public Output<String> prompt() {
        return this.prompt;
    }
    /**
     * Actions that go at the end of secondary actions.
     * 
     */
    @Export(name="secondaryActionsEnd", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> secondaryActionsEnd;

    /**
     * @return Actions that go at the end of secondary actions.
     * 
     */
    public Output<Optional<String>> secondaryActionsEnd() {
        return Codegen.optional(this.secondaryActionsEnd);
    }
    /**
     * Actions that go at the start of secondary actions.
     * 
     */
    @Export(name="secondaryActionsStart", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> secondaryActionsStart;

    /**
     * @return Actions that go at the start of secondary actions.
     * 
     */
    public Output<Optional<String>> secondaryActionsStart() {
        return Codegen.optional(this.secondaryActionsStart);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PromptPartials(String name) {
        this(name, PromptPartialsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PromptPartials(String name, PromptPartialsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PromptPartials(String name, PromptPartialsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/promptPartials:PromptPartials", name, args == null ? PromptPartialsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PromptPartials(String name, Output<String> id, @Nullable PromptPartialsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/promptPartials:PromptPartials", name, state, makeResourceOptions(options, id));
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
    public static PromptPartials get(String name, Output<String> id, @Nullable PromptPartialsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PromptPartials(name, id, state, options);
    }
}