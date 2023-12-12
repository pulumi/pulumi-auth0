// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.PagesArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.PagesState;
import com.pulumi.auth0.outputs.PagesChangePassword;
import com.pulumi.auth0.outputs.PagesError;
import com.pulumi.auth0.outputs.PagesGuardianMfa;
import com.pulumi.auth0.outputs.PagesLogin;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import javax.annotation.Nullable;

/**
 * With this resource you can manage custom HTML for the Login, Reset Password, Multi-Factor Authentication and Error pages.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Pages;
 * import com.pulumi.auth0.PagesArgs;
 * import com.pulumi.auth0.inputs.PagesChangePasswordArgs;
 * import com.pulumi.auth0.inputs.PagesErrorArgs;
 * import com.pulumi.auth0.inputs.PagesGuardianMfaArgs;
 * import com.pulumi.auth0.inputs.PagesLoginArgs;
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
 *         var myPages = new Pages(&#34;myPages&#34;, PagesArgs.builder()        
 *             .changePassword(PagesChangePasswordArgs.builder()
 *                 .enabled(true)
 *                 .html(&#34;&lt;html&gt;&lt;body&gt;My Custom Reset Password Page&lt;/body&gt;&lt;/html&gt;&#34;)
 *                 .build())
 *             .error(PagesErrorArgs.builder()
 *                 .html(&#34;&lt;html&gt;&lt;body&gt;My Custom Error Page&lt;/body&gt;&lt;/html&gt;&#34;)
 *                 .showLogLink(true)
 *                 .url(&#34;https://example.com&#34;)
 *                 .build())
 *             .guardianMfa(PagesGuardianMfaArgs.builder()
 *                 .enabled(true)
 *                 .html(&#34;&lt;html&gt;&lt;body&gt;My Custom MFA Page&lt;/body&gt;&lt;/html&gt;&#34;)
 *                 .build())
 *             .login(PagesLoginArgs.builder()
 *                 .enabled(true)
 *                 .html(&#34;&lt;html&gt;&lt;body&gt;My Custom Login Page&lt;/body&gt;&lt;/html&gt;&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * As this is not a resource identifiable by an ID within the Auth0 Management API, pages can be imported using a random string. # We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4) # Example
 * 
 * ```sh
 *  $ pulumi import auth0:index/pages:Pages my_pages &#34;22f4f21b-017a-319d-92e7-2291c1ca36c4&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/pages:Pages")
public class Pages extends com.pulumi.resources.CustomResource {
    /**
     * Configuration settings for customizing the Password Reset page.
     * 
     */
    @Export(name="changePassword", refs={PagesChangePassword.class}, tree="[0]")
    private Output<PagesChangePassword> changePassword;

    /**
     * @return Configuration settings for customizing the Password Reset page.
     * 
     */
    public Output<PagesChangePassword> changePassword() {
        return this.changePassword;
    }
    /**
     * Configuration settings for the Error pages.
     * 
     */
    @Export(name="error", refs={PagesError.class}, tree="[0]")
    private Output<PagesError> error;

    /**
     * @return Configuration settings for the Error pages.
     * 
     */
    public Output<PagesError> error() {
        return this.error;
    }
    /**
     * Configuration settings for customizing the Guardian Multi-Factor Authentication page.
     * 
     */
    @Export(name="guardianMfa", refs={PagesGuardianMfa.class}, tree="[0]")
    private Output<PagesGuardianMfa> guardianMfa;

    /**
     * @return Configuration settings for customizing the Guardian Multi-Factor Authentication page.
     * 
     */
    public Output<PagesGuardianMfa> guardianMfa() {
        return this.guardianMfa;
    }
    /**
     * Configuration settings for customizing the Login page.
     * 
     */
    @Export(name="login", refs={PagesLogin.class}, tree="[0]")
    private Output<PagesLogin> login;

    /**
     * @return Configuration settings for customizing the Login page.
     * 
     */
    public Output<PagesLogin> login() {
        return this.login;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pages(String name) {
        this(name, PagesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pages(String name, @Nullable PagesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pages(String name, @Nullable PagesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/pages:Pages", name, args == null ? PagesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Pages(String name, Output<String> id, @Nullable PagesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/pages:Pages", name, state, makeResourceOptions(options, id));
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
    public static Pages get(String name, Output<String> id, @Nullable PagesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Pages(name, id, state, options);
    }
}
