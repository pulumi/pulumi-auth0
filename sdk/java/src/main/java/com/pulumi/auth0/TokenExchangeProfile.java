// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.TokenExchangeProfileArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.TokenExchangeProfileState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * With this resource, you can manage Auth0 Custom Token Exchange Profiles
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
 * import com.pulumi.auth0.Action;
 * import com.pulumi.auth0.ActionArgs;
 * import com.pulumi.auth0.inputs.ActionSupportedTriggersArgs;
 * import com.pulumi.auth0.TokenExchangeProfile;
 * import com.pulumi.auth0.TokenExchangeProfileArgs;
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
 *         // Below action is created with custom-token-exchange as supported_triggers
 *         // This action is then linked using the action_id param to the token-exchange profile
 *         var myAction = new Action("myAction", ActionArgs.builder()
 *             .name("TokenExchange-Action")
 *             .code("""
 * exports.onExecuteCustomTokenExchange = async (event, api) => {
 * 	console.log("foo")
 * };"
 *             """)
 *             .deploy(true)
 *             .supportedTriggers(ActionSupportedTriggersArgs.builder()
 *                 .id("custom-token-exchange")
 *                 .version("v1")
 *                 .build())
 *             .build());
 * 
 *         var myTokenExchangeProfile = new TokenExchangeProfile("myTokenExchangeProfile", TokenExchangeProfileArgs.builder()
 *             .name("token-exchange-prof")
 *             .subjectTokenType("https://acme.com/cis-token")
 *             .actionId(myAction.id())
 *             .type("custom_authentication")
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
 * This resource can be imported using the token exchange profile ID.
 * 
 * Example:
 * 
 * ```sh
 * $ pulumi import auth0:index/tokenExchangeProfile:TokenExchangeProfile profile &#34;tep_XXXXXXXXXXXXXX&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/tokenExchangeProfile:TokenExchangeProfile")
public class TokenExchangeProfile extends com.pulumi.resources.CustomResource {
    /**
     * Unique identifier of the Action
     * 
     */
    @Export(name="actionId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> actionId;

    /**
     * @return Unique identifier of the Action
     * 
     */
    public Output<Optional<String>> actionId() {
        return Codegen.optional(this.actionId);
    }
    /**
     * The ISO 8601 formatted date the credential was created.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return The ISO 8601 formatted date the credential was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Name of the token exchange profile.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the token exchange profile.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Type of the subject token
     * 
     */
    @Export(name="subjectTokenType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> subjectTokenType;

    /**
     * @return Type of the subject token
     * 
     */
    public Output<Optional<String>> subjectTokenType() {
        return Codegen.optional(this.subjectTokenType);
    }
    /**
     * Type of the token exchange profile
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of the token exchange profile
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The ISO 8601 formatted date the credential was updated.
     * 
     */
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    /**
     * @return The ISO 8601 formatted date the credential was updated.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TokenExchangeProfile(java.lang.String name) {
        this(name, TokenExchangeProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TokenExchangeProfile(java.lang.String name, @Nullable TokenExchangeProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TokenExchangeProfile(java.lang.String name, @Nullable TokenExchangeProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/tokenExchangeProfile:TokenExchangeProfile", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private TokenExchangeProfile(java.lang.String name, Output<java.lang.String> id, @Nullable TokenExchangeProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/tokenExchangeProfile:TokenExchangeProfile", name, state, makeResourceOptions(options, id), false);
    }

    private static TokenExchangeProfileArgs makeArgs(@Nullable TokenExchangeProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TokenExchangeProfileArgs.Empty : args;
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
    public static TokenExchangeProfile get(java.lang.String name, Output<java.lang.String> id, @Nullable TokenExchangeProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TokenExchangeProfile(name, id, state, options);
    }
}
