// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.AttackProtectionArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.AttackProtectionState;
import com.pulumi.auth0.outputs.AttackProtectionBreachedPasswordDetection;
import com.pulumi.auth0.outputs.AttackProtectionBruteForceProtection;
import com.pulumi.auth0.outputs.AttackProtectionSuspiciousIpThrottling;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import javax.annotation.Nullable;

/**
 * Auth0 can detect attacks and stop malicious attempts to access your application such as blocking traffic from certain IPs and displaying CAPTCHA
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.AttackProtection;
 * import com.pulumi.auth0.AttackProtectionArgs;
 * import com.pulumi.auth0.inputs.AttackProtectionBreachedPasswordDetectionArgs;
 * import com.pulumi.auth0.inputs.AttackProtectionBruteForceProtectionArgs;
 * import com.pulumi.auth0.inputs.AttackProtectionSuspiciousIpThrottlingArgs;
 * import com.pulumi.auth0.inputs.AttackProtectionSuspiciousIpThrottlingPreLoginArgs;
 * import com.pulumi.auth0.inputs.AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs;
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
 *         var attackProtection = new AttackProtection(&#34;attackProtection&#34;, AttackProtectionArgs.builder()        
 *             .breachedPasswordDetection(AttackProtectionBreachedPasswordDetectionArgs.builder()
 *                 .adminNotificationFrequencies(&#34;daily&#34;)
 *                 .enabled(true)
 *                 .method(&#34;standard&#34;)
 *                 .shields(                
 *                     &#34;admin_notification&#34;,
 *                     &#34;block&#34;)
 *                 .build())
 *             .bruteForceProtection(AttackProtectionBruteForceProtectionArgs.builder()
 *                 .allowlists(&#34;127.0.0.1&#34;)
 *                 .enabled(true)
 *                 .maxAttempts(5)
 *                 .mode(&#34;count_per_identifier_and_ip&#34;)
 *                 .shields(                
 *                     &#34;block&#34;,
 *                     &#34;user_notification&#34;)
 *                 .build())
 *             .suspiciousIpThrottling(AttackProtectionSuspiciousIpThrottlingArgs.builder()
 *                 .allowlists(&#34;192.168.1.1&#34;)
 *                 .enabled(true)
 *                 .preLogin(AttackProtectionSuspiciousIpThrottlingPreLoginArgs.builder()
 *                     .maxAttempts(100)
 *                     .rate(864000)
 *                     .build())
 *                 .preUserRegistration(AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs.builder()
 *                     .maxAttempts(50)
 *                     .rate(1200)
 *                     .build())
 *                 .shields(                
 *                     &#34;admin_notification&#34;,
 *                     &#34;block&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * As this is not a resource identifiable by an ID within the Auth0 Management API, guardian can be imported using a random string. We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4) e.g.
 * 
 * ```sh
 *  $ pulumi import auth0:index/attackProtection:AttackProtection default 24940d4b-4bd4-44e7-894e-f92e4de36a40
 * ```
 * 
 */
@ResourceType(type="auth0:index/attackProtection:AttackProtection")
public class AttackProtection extends com.pulumi.resources.CustomResource {
    /**
     * Breached password detection protects your applications from bad actors logging in with stolen credentials.
     * 
     */
    @Export(name="breachedPasswordDetection", type=AttackProtectionBreachedPasswordDetection.class, parameters={})
    private Output<AttackProtectionBreachedPasswordDetection> breachedPasswordDetection;

    /**
     * @return Breached password detection protects your applications from bad actors logging in with stolen credentials.
     * 
     */
    public Output<AttackProtectionBreachedPasswordDetection> breachedPasswordDetection() {
        return this.breachedPasswordDetection;
    }
    /**
     * Safeguards against a single IP address attacking a single user account.
     * 
     */
    @Export(name="bruteForceProtection", type=AttackProtectionBruteForceProtection.class, parameters={})
    private Output<AttackProtectionBruteForceProtection> bruteForceProtection;

    /**
     * @return Safeguards against a single IP address attacking a single user account.
     * 
     */
    public Output<AttackProtectionBruteForceProtection> bruteForceProtection() {
        return this.bruteForceProtection;
    }
    /**
     * Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
     * 
     */
    @Export(name="suspiciousIpThrottling", type=AttackProtectionSuspiciousIpThrottling.class, parameters={})
    private Output<AttackProtectionSuspiciousIpThrottling> suspiciousIpThrottling;

    /**
     * @return Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
     * 
     */
    public Output<AttackProtectionSuspiciousIpThrottling> suspiciousIpThrottling() {
        return this.suspiciousIpThrottling;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AttackProtection(String name) {
        this(name, AttackProtectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AttackProtection(String name, @Nullable AttackProtectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AttackProtection(String name, @Nullable AttackProtectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/attackProtection:AttackProtection", name, args == null ? AttackProtectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AttackProtection(String name, Output<String> id, @Nullable AttackProtectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/attackProtection:AttackProtection", name, state, makeResourceOptions(options, id));
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
    public static AttackProtection get(String name, Output<String> id, @Nullable AttackProtectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AttackProtection(name, id, state, options);
    }
}