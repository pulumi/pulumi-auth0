// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.GuardianArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.GuardianState;
import com.pulumi.auth0.outputs.GuardianDuo;
import com.pulumi.auth0.outputs.GuardianPhone;
import com.pulumi.auth0.outputs.GuardianPush;
import com.pulumi.auth0.outputs.GuardianWebauthnPlatform;
import com.pulumi.auth0.outputs.GuardianWebauthnRoaming;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Multi-Factor Authentication works by requiring additional factors during the login process to prevent unauthorized
 * access. With this resource you can configure some options available for MFA.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Guardian;
 * import com.pulumi.auth0.GuardianArgs;
 * import com.pulumi.auth0.inputs.GuardianDuoArgs;
 * import com.pulumi.auth0.inputs.GuardianPhoneArgs;
 * import com.pulumi.auth0.inputs.GuardianPhoneOptionsArgs;
 * import com.pulumi.auth0.inputs.GuardianPushArgs;
 * import com.pulumi.auth0.inputs.GuardianPushAmazonSnsArgs;
 * import com.pulumi.auth0.inputs.GuardianPushCustomAppArgs;
 * import com.pulumi.auth0.inputs.GuardianWebauthnPlatformArgs;
 * import com.pulumi.auth0.inputs.GuardianWebauthnRoamingArgs;
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
 *         var myGuardian = new Guardian(&#34;myGuardian&#34;, GuardianArgs.builder()        
 *             .duo(GuardianDuoArgs.builder()
 *                 .hostname(&#34;api-hostname&#34;)
 *                 .integrationKey(&#34;someKey&#34;)
 *                 .secretKey(&#34;someSecret&#34;)
 *                 .build())
 *             .email(true)
 *             .otp(true)
 *             .phone(GuardianPhoneArgs.builder()
 *                 .messageTypes(                
 *                     &#34;sms&#34;,
 *                     &#34;voice&#34;)
 *                 .options(GuardianPhoneOptionsArgs.builder()
 *                     .enrollmentMessage(&#34;{{code}} is your verification code for {{tenant.friendly_name}}. Please enter this code to verify your enrollment.&#34;)
 *                     .verificationMessage(&#34;{{code}} is your verification code for {{tenant.friendly_name}}.&#34;)
 *                     .build())
 *                 .provider(&#34;auth0&#34;)
 *                 .build())
 *             .policy(&#34;all-applications&#34;)
 *             .push(GuardianPushArgs.builder()
 *                 .amazonSns(GuardianPushAmazonSnsArgs.builder()
 *                     .awsAccessKeyId(&#34;test1&#34;)
 *                     .awsRegion(&#34;us-west-1&#34;)
 *                     .awsSecretAccessKey(&#34;secretKey&#34;)
 *                     .snsApnsPlatformApplicationArn(&#34;test_arn&#34;)
 *                     .snsGcmPlatformApplicationArn(&#34;test_arn&#34;)
 *                     .build())
 *                 .customApp(GuardianPushCustomAppArgs.builder()
 *                     .appName(&#34;CustomApp&#34;)
 *                     .appleAppLink(&#34;https://itunes.apple.com/us/app/my-app/id123121&#34;)
 *                     .googleAppLink(&#34;https://play.google.com/store/apps/details?id=com.my.app&#34;)
 *                     .build())
 *                 .build())
 *             .recoveryCode(true)
 *             .webauthnPlatform()
 *             .webauthnRoaming(GuardianWebauthnRoamingArgs.builder()
 *                 .userVerification(&#34;required&#34;)
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
 *  $ pulumi import auth0:index/guardian:Guardian default 24940d4b-4bd4-44e7-894e-f92e4de36a40
 * ```
 * 
 */
@ResourceType(type="auth0:index/guardian:Guardian")
public class Guardian extends com.pulumi.resources.CustomResource {
    /**
     * List(Resource). Configuration settings for the Duo MFA.
     * If this block is present, Duo MFA will be enabled, and disabled otherwise. For details, see Duo.
     * 
     */
    @Export(name="duo", type=GuardianDuo.class, parameters={})
    private Output</* @Nullable */ GuardianDuo> duo;

    /**
     * @return List(Resource). Configuration settings for the Duo MFA.
     * If this block is present, Duo MFA will be enabled, and disabled otherwise. For details, see Duo.
     * 
     */
    public Output<Optional<GuardianDuo>> duo() {
        return Codegen.optional(this.duo);
    }
    /**
     * Boolean. Indicates whether email MFA is enabled.
     * 
     */
    @Export(name="email", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> email;

    /**
     * @return Boolean. Indicates whether email MFA is enabled.
     * 
     */
    public Output<Optional<Boolean>> email() {
        return Codegen.optional(this.email);
    }
    /**
     * Boolean. Indicates whether one time password MFA is enabled.
     * 
     */
    @Export(name="otp", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> otp;

    /**
     * @return Boolean. Indicates whether one time password MFA is enabled.
     * 
     */
    public Output<Optional<Boolean>> otp() {
        return Codegen.optional(this.otp);
    }
    /**
     * List(Resource). Configuration settings for the phone MFA.
     * If this block is present, Phone MFA will be enabled, and disabled otherwise. For details, see Phone.
     * 
     */
    @Export(name="phone", type=GuardianPhone.class, parameters={})
    private Output</* @Nullable */ GuardianPhone> phone;

    /**
     * @return List(Resource). Configuration settings for the phone MFA.
     * If this block is present, Phone MFA will be enabled, and disabled otherwise. For details, see Phone.
     * 
     */
    public Output<Optional<GuardianPhone>> phone() {
        return Codegen.optional(this.phone);
    }
    /**
     * String. Policy to use. Available options are `never`, `all-applications` and `confidence-score`.
     * The option `confidence-score` means the trigger of MFA will be adaptive. See [Auth0 docs](https://auth0.com/docs/mfa/adaptive-mfa).
     * 
     */
    @Export(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    /**
     * @return String. Policy to use. Available options are `never`, `all-applications` and `confidence-score`.
     * The option `confidence-score` means the trigger of MFA will be adaptive. See [Auth0 docs](https://auth0.com/docs/mfa/adaptive-mfa).
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * List(Resource). Configuration settings for the Push MFA.
     * If this block is present, Push MFA will be enabled, and disabled otherwise. For details, see Push.
     * 
     */
    @Export(name="push", type=GuardianPush.class, parameters={})
    private Output</* @Nullable */ GuardianPush> push;

    /**
     * @return List(Resource). Configuration settings for the Push MFA.
     * If this block is present, Push MFA will be enabled, and disabled otherwise. For details, see Push.
     * 
     */
    public Output<Optional<GuardianPush>> push() {
        return Codegen.optional(this.push);
    }
    /**
     * Boolean. Indicates whether recovery code MFA is enabled.
     * 
     */
    @Export(name="recoveryCode", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> recoveryCode;

    /**
     * @return Boolean. Indicates whether recovery code MFA is enabled.
     * 
     */
    public Output<Optional<Boolean>> recoveryCode() {
        return Codegen.optional(this.recoveryCode);
    }
    /**
     * List(Resource). Configuration settings for the WebAuthn with FIDO Device Biometrics MFA.
     * If this block is present, WebAuthn with FIDO Device Biometrics MFA will be enabled, and disabled otherwise.
     * For details, see WebAuthn Platform.
     * 
     */
    @Export(name="webauthnPlatform", type=GuardianWebauthnPlatform.class, parameters={})
    private Output</* @Nullable */ GuardianWebauthnPlatform> webauthnPlatform;

    /**
     * @return List(Resource). Configuration settings for the WebAuthn with FIDO Device Biometrics MFA.
     * If this block is present, WebAuthn with FIDO Device Biometrics MFA will be enabled, and disabled otherwise.
     * For details, see WebAuthn Platform.
     * 
     */
    public Output<Optional<GuardianWebauthnPlatform>> webauthnPlatform() {
        return Codegen.optional(this.webauthnPlatform);
    }
    /**
     * List(Resource). Configuration settings for the WebAuthn with FIDO Security Keys MFA.
     * If this block is present, WebAuthn with FIDO Security Keys MFA will be enabled, and disabled otherwise.
     * For details, see WebAuthn Roaming.
     * 
     */
    @Export(name="webauthnRoaming", type=GuardianWebauthnRoaming.class, parameters={})
    private Output</* @Nullable */ GuardianWebauthnRoaming> webauthnRoaming;

    /**
     * @return List(Resource). Configuration settings for the WebAuthn with FIDO Security Keys MFA.
     * If this block is present, WebAuthn with FIDO Security Keys MFA will be enabled, and disabled otherwise.
     * For details, see WebAuthn Roaming.
     * 
     */
    public Output<Optional<GuardianWebauthnRoaming>> webauthnRoaming() {
        return Codegen.optional(this.webauthnRoaming);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Guardian(String name) {
        this(name, GuardianArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Guardian(String name, GuardianArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Guardian(String name, GuardianArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/guardian:Guardian", name, args == null ? GuardianArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Guardian(String name, Output<String> id, @Nullable GuardianState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/guardian:Guardian", name, state, makeResourceOptions(options, id));
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
    public static Guardian get(String name, Output<String> id, @Nullable GuardianState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Guardian(name, id, state, options);
    }
}
