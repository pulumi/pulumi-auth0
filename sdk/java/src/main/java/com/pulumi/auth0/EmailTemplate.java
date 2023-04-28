// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.EmailTemplateArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.EmailTemplateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * With Auth0, you can have standard welcome, password reset, and account verification email-based workflows built right into Auth0. This resource allows you to configure email templates to customize the look, feel, and sender identities of emails sent by Auth0. Used in conjunction with configured email providers.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Email;
 * import com.pulumi.auth0.EmailArgs;
 * import com.pulumi.auth0.inputs.EmailCredentialsArgs;
 * import com.pulumi.auth0.EmailTemplate;
 * import com.pulumi.auth0.EmailTemplateArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var myEmailProvider = new Email(&#34;myEmailProvider&#34;, EmailArgs.builder()        
 *             .name(&#34;ses&#34;)
 *             .enabled(true)
 *             .defaultFromAddress(&#34;accounts@example.com&#34;)
 *             .credentials(EmailCredentialsArgs.builder()
 *                 .accessKeyId(&#34;AKIAXXXXXXXXXXXXXXXX&#34;)
 *                 .secretAccessKey(&#34;7e8c2148xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx&#34;)
 *                 .region(&#34;us-east-1&#34;)
 *                 .build())
 *             .build());
 * 
 *         var myEmailTemplate = new EmailTemplate(&#34;myEmailTemplate&#34;, EmailTemplateArgs.builder()        
 *             .template(&#34;welcome_email&#34;)
 *             .body(&#34;&lt;html&gt;&lt;body&gt;&lt;h1&gt;Welcome!&lt;/h1&gt;&lt;/body&gt;&lt;/html&gt;&#34;)
 *             .from(&#34;welcome@example.com&#34;)
 *             .resultUrl(&#34;https://example.com/welcome&#34;)
 *             .subject(&#34;Welcome&#34;)
 *             .syntax(&#34;liquid&#34;)
 *             .urlLifetimeInSeconds(3600)
 *             .enabled(true)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(myEmailProvider)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported using the pre-defined template name. # These names are `verify_email`, `verify_email_by_code`, `reset_email`, `welcome_email`, `blocked_account`, `stolen_credentials`, `enrollment_email`, `mfa_oob_code`, and `user_invitation`. # The names `change_password`, and `password_reset` are also supported for legacy scenarios. # Example
 * 
 * ```sh
 *  $ pulumi import auth0:index/emailTemplate:EmailTemplate my_email_template welcome_email
 * ```
 * 
 */
@ResourceType(type="auth0:index/emailTemplate:EmailTemplate")
public class EmailTemplate extends com.pulumi.resources.CustomResource {
    /**
     * Body of the email template. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
     * 
     */
    @Export(name="body", type=String.class, parameters={})
    private Output<String> body;

    /**
     * @return Body of the email template. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
     * 
     */
    public Output<String> body() {
        return this.body;
    }
    /**
     * Indicates whether the template is enabled.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return Indicates whether the template is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * Email address to use as the sender. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
     * 
     */
    @Export(name="from", type=String.class, parameters={})
    private Output<String> from;

    /**
     * @return Email address to use as the sender. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
     * 
     */
    public Output<String> from() {
        return this.from;
    }
    /**
     * Whether the `reset_email` and `verify_email` templates should include the user&#39;s email address as the email parameter in the `returnUrl` (true) or whether no email address should be included in the redirect (false). Defaults to `true`.
     * 
     */
    @Export(name="includeEmailInRedirect", type=Boolean.class, parameters={})
    private Output<Boolean> includeEmailInRedirect;

    /**
     * @return Whether the `reset_email` and `verify_email` templates should include the user&#39;s email address as the email parameter in the `returnUrl` (true) or whether no email address should be included in the redirect (false). Defaults to `true`.
     * 
     */
    public Output<Boolean> includeEmailInRedirect() {
        return this.includeEmailInRedirect;
    }
    /**
     * URL to redirect the user to after a successful action. [Learn more](https://auth0.com/docs/customize/email/email-templates#configure-template-fields).
     * 
     */
    @Export(name="resultUrl", type=String.class, parameters={})
    private Output</* @Nullable */ String> resultUrl;

    /**
     * @return URL to redirect the user to after a successful action. [Learn more](https://auth0.com/docs/customize/email/email-templates#configure-template-fields).
     * 
     */
    public Output<Optional<String>> resultUrl() {
        return Codegen.optional(this.resultUrl);
    }
    /**
     * Subject line of the email. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
     * 
     */
    @Export(name="subject", type=String.class, parameters={})
    private Output<String> subject;

    /**
     * @return Subject line of the email. You can include [common variables](https://auth0.com/docs/customize/email/email-templates#common-variables).
     * 
     */
    public Output<String> subject() {
        return this.subject;
    }
    /**
     * Syntax of the template body. You can use either text or HTML with Liquid syntax.
     * 
     */
    @Export(name="syntax", type=String.class, parameters={})
    private Output<String> syntax;

    /**
     * @return Syntax of the template body. You can use either text or HTML with Liquid syntax.
     * 
     */
    public Output<String> syntax() {
        return this.syntax;
    }
    /**
     * Template name. Options include `verify_email`, `verify_email_by_code`, `reset_email`, `welcome_email`, `blocked_account`, `stolen_credentials`, `enrollment_email`, `mfa_oob_code`, `user_invitation`, `change_password` (legacy), or `password_reset` (legacy).
     * 
     */
    @Export(name="template", type=String.class, parameters={})
    private Output<String> template;

    /**
     * @return Template name. Options include `verify_email`, `verify_email_by_code`, `reset_email`, `welcome_email`, `blocked_account`, `stolen_credentials`, `enrollment_email`, `mfa_oob_code`, `user_invitation`, `change_password` (legacy), or `password_reset` (legacy).
     * 
     */
    public Output<String> template() {
        return this.template;
    }
    /**
     * Number of seconds during which the link within the email will be valid.
     * 
     */
    @Export(name="urlLifetimeInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> urlLifetimeInSeconds;

    /**
     * @return Number of seconds during which the link within the email will be valid.
     * 
     */
    public Output<Optional<Integer>> urlLifetimeInSeconds() {
        return Codegen.optional(this.urlLifetimeInSeconds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EmailTemplate(String name) {
        this(name, EmailTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EmailTemplate(String name, EmailTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EmailTemplate(String name, EmailTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/emailTemplate:EmailTemplate", name, args == null ? EmailTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EmailTemplate(String name, Output<String> id, @Nullable EmailTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/emailTemplate:EmailTemplate", name, state, makeResourceOptions(options, id));
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
    public static EmailTemplate get(String name, Output<String> id, @Nullable EmailTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EmailTemplate(name, id, state, options);
    }
}
