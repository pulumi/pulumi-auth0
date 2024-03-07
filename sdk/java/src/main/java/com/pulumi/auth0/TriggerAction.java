// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.TriggerActionArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.TriggerActionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * With this resource, you can bind an action to a trigger. Once an action is created and deployed, it can be attached (i.e. bound) to a trigger so that it will be executed as part of a flow.
 * 
 * Ordering of an action within a specific flow is not currently supported when using this resource; the action will get appended to the end of the flow. To precisely manage ordering, it is advised to either do so with the dashboard UI or with the `auth0_trigger_bindings` resource.
 * 
 * !&gt; This resource appends an action to the trigger binding. In contrast, the `auth0.TriggerActions` resource manages all
 * the action bindings to a trigger. To avoid potential issues, it is recommended not to use this resource in conjunction
 * with the `auth0.TriggerAction` resource when binding actions to the same trigger.
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
 * import com.pulumi.auth0.Action;
 * import com.pulumi.auth0.ActionArgs;
 * import com.pulumi.auth0.inputs.ActionSupportedTriggersArgs;
 * import com.pulumi.auth0.TriggerAction;
 * import com.pulumi.auth0.TriggerActionArgs;
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
 *         var loginAlert = new Action(&#34;loginAlert&#34;, ActionArgs.builder()        
 *             .code(&#34;&#34;&#34;
 * exports.onContinuePostLogin = async (event, api) =&gt; {
 *   console.log(&#34;foo&#34;);
 * };&#34;
 *             &#34;&#34;&#34;)
 *             .deploy(true)
 *             .supportedTriggers(ActionSupportedTriggersArgs.builder()
 *                 .id(&#34;post-login&#34;)
 *                 .version(&#34;v3&#34;)
 *                 .build())
 *             .build());
 * 
 *         var postLoginAlertAction = new TriggerAction(&#34;postLoginAlertAction&#34;, TriggerActionArgs.builder()        
 *             .trigger(&#34;post-login&#34;)
 *             .actionId(loginAlert.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * This resource can be imported by specifying the
 * 
 * trigger and action ID separated by &#34;::&#34; (note the double colon)
 * 
 * &lt;trigger&gt;::&lt;actionID&gt;
 * 
 * # 
 * 
 * Example:
 * 
 * ```sh
 * $ pulumi import auth0:index/triggerAction:TriggerAction post_login_action &#34;post-login::28b5c8fa-d371-5734-acf6-d0cf80ead918&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/triggerAction:TriggerAction")
public class TriggerAction extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the action to bind to the trigger.
     * 
     */
    @Export(name="actionId", refs={String.class}, tree="[0]")
    private Output<String> actionId;

    /**
     * @return The ID of the action to bind to the trigger.
     * 
     */
    public Output<String> actionId() {
        return this.actionId;
    }
    /**
     * The name for this action within the trigger. This can be useful for distinguishing between multiple instances of the same action bound to a trigger. Defaults to action name when not provided.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The name for this action within the trigger. This can be useful for distinguishing between multiple instances of the same action bound to a trigger. Defaults to action name when not provided.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `iga-approval`, `iga-certification`, `iga-fulfillment-assignment`, `iga-fulfillment-execution`.
     * 
     */
    @Export(name="trigger", refs={String.class}, tree="[0]")
    private Output<String> trigger;

    /**
     * @return The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `iga-approval`, `iga-certification`, `iga-fulfillment-assignment`, `iga-fulfillment-execution`.
     * 
     */
    public Output<String> trigger() {
        return this.trigger;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TriggerAction(String name) {
        this(name, TriggerActionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TriggerAction(String name, TriggerActionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TriggerAction(String name, TriggerActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/triggerAction:TriggerAction", name, args == null ? TriggerActionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TriggerAction(String name, Output<String> id, @Nullable TriggerActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/triggerAction:TriggerAction", name, state, makeResourceOptions(options, id));
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
    public static TriggerAction get(String name, Output<String> id, @Nullable TriggerActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TriggerAction(name, id, state, options);
    }
}
