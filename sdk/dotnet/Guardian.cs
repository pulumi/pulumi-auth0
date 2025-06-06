// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    /// <summary>
    /// Multi-Factor Authentication works by requiring additional factors during the login process to prevent unauthorized access. With this resource you can configure some options available for MFA.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Auth0 = Pulumi.Auth0;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myGuardian = new Auth0.Guardian("my_guardian", new()
    ///     {
    ///         Policy = "all-applications",
    ///         Email = true,
    ///         Otp = true,
    ///         RecoveryCode = true,
    ///         WebauthnPlatform = new Auth0.Inputs.GuardianWebauthnPlatformArgs
    ///         {
    ///             Enabled = true,
    ///         },
    ///         WebauthnRoaming = new Auth0.Inputs.GuardianWebauthnRoamingArgs
    ///         {
    ///             Enabled = true,
    ///             UserVerification = "required",
    ///         },
    ///         Phone = new Auth0.Inputs.GuardianPhoneArgs
    ///         {
    ///             Enabled = true,
    ///             Provider = "auth0",
    ///             MessageTypes = new[]
    ///             {
    ///                 "sms",
    ///                 "voice",
    ///             },
    ///             Options = new Auth0.Inputs.GuardianPhoneOptionsArgs
    ///             {
    ///                 EnrollmentMessage = "{{code}} is your verification code for {{tenant.friendly_name}}. Please enter this code to verify your enrollment.",
    ///                 VerificationMessage = "{{code}} is your verification code for {{tenant.friendly_name}}.",
    ///             },
    ///         },
    ///         Push = new Auth0.Inputs.GuardianPushArgs
    ///         {
    ///             Enabled = true,
    ///             Provider = "sns",
    ///             AmazonSns = new Auth0.Inputs.GuardianPushAmazonSnsArgs
    ///             {
    ///                 AwsAccessKeyId = "test1",
    ///                 AwsRegion = "us-west-1",
    ///                 AwsSecretAccessKey = "secretKey",
    ///                 SnsApnsPlatformApplicationArn = "test_arn",
    ///                 SnsGcmPlatformApplicationArn = "test_arn",
    ///             },
    ///             CustomApp = new Auth0.Inputs.GuardianPushCustomAppArgs
    ///             {
    ///                 AppName = "CustomApp",
    ///                 AppleAppLink = "https://itunes.apple.com/us/app/my-app/id123121",
    ///                 GoogleAppLink = "https://play.google.com/store/apps/details?id=com.my.app",
    ///             },
    ///         },
    ///         Duo = new Auth0.Inputs.GuardianDuoArgs
    ///         {
    ///             Enabled = true,
    ///             IntegrationKey = "someKey",
    ///             SecretKey = "someSecret",
    ///             Hostname = "api-hostname",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// As this is not a resource identifiable by an ID within the Auth0 Management API,
    /// 
    /// guardian can be imported using a random string.
    /// 
    /// We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4)
    /// 
    /// Example:
    /// 
    /// ```sh
    /// $ pulumi import auth0:index/guardian:Guardian my_guardian "24940d4b-4bd4-44e7-894e-f92e4de36a40"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/guardian:Guardian")]
    public partial class Guardian : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Configuration settings for the Duo MFA. If this block is present, Duo MFA will be enabled, and disabled otherwise.
        /// </summary>
        [Output("duo")]
        public Output<Outputs.GuardianDuo> Duo { get; private set; } = null!;

        /// <summary>
        /// Indicates whether email MFA is enabled.
        /// </summary>
        [Output("email")]
        public Output<bool?> Email { get; private set; } = null!;

        /// <summary>
        /// Indicates whether one time password MFA is enabled.
        /// </summary>
        [Output("otp")]
        public Output<bool?> Otp { get; private set; } = null!;

        /// <summary>
        /// Configuration settings for the phone MFA. If this block is present, Phone MFA will be enabled, and disabled otherwise.
        /// </summary>
        [Output("phone")]
        public Output<Outputs.GuardianPhone> Phone { get; private set; } = null!;

        /// <summary>
        /// Policy to use. Available options are `never`, `all-applications` and `confidence-score`.
        /// </summary>
        [Output("policy")]
        public Output<string> Policy { get; private set; } = null!;

        /// <summary>
        /// Configuration settings for the Push MFA. If this block is present, Push MFA will be enabled, and disabled otherwise.
        /// </summary>
        [Output("push")]
        public Output<Outputs.GuardianPush> Push { get; private set; } = null!;

        /// <summary>
        /// Indicates whether recovery code MFA is enabled.
        /// </summary>
        [Output("recoveryCode")]
        public Output<bool?> RecoveryCode { get; private set; } = null!;

        /// <summary>
        /// Configuration settings for the WebAuthn with FIDO Device Biometrics MFA. If this block is present, WebAuthn with FIDO Device Biometrics MFA will be enabled, and disabled otherwise.
        /// </summary>
        [Output("webauthnPlatform")]
        public Output<Outputs.GuardianWebauthnPlatform> WebauthnPlatform { get; private set; } = null!;

        /// <summary>
        /// Configuration settings for the WebAuthn with FIDO Security Keys MFA. If this block is present, WebAuthn with FIDO Security Keys MFA will be enabled, and disabled otherwise.
        /// </summary>
        [Output("webauthnRoaming")]
        public Output<Outputs.GuardianWebauthnRoaming> WebauthnRoaming { get; private set; } = null!;


        /// <summary>
        /// Create a Guardian resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Guardian(string name, GuardianArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/guardian:Guardian", name, args ?? new GuardianArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Guardian(string name, Input<string> id, GuardianState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/guardian:Guardian", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Guardian resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Guardian Get(string name, Input<string> id, GuardianState? state = null, CustomResourceOptions? options = null)
        {
            return new Guardian(name, id, state, options);
        }
    }

    public sealed class GuardianArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration settings for the Duo MFA. If this block is present, Duo MFA will be enabled, and disabled otherwise.
        /// </summary>
        [Input("duo")]
        public Input<Inputs.GuardianDuoArgs>? Duo { get; set; }

        /// <summary>
        /// Indicates whether email MFA is enabled.
        /// </summary>
        [Input("email")]
        public Input<bool>? Email { get; set; }

        /// <summary>
        /// Indicates whether one time password MFA is enabled.
        /// </summary>
        [Input("otp")]
        public Input<bool>? Otp { get; set; }

        /// <summary>
        /// Configuration settings for the phone MFA. If this block is present, Phone MFA will be enabled, and disabled otherwise.
        /// </summary>
        [Input("phone")]
        public Input<Inputs.GuardianPhoneArgs>? Phone { get; set; }

        /// <summary>
        /// Policy to use. Available options are `never`, `all-applications` and `confidence-score`.
        /// </summary>
        [Input("policy", required: true)]
        public Input<string> Policy { get; set; } = null!;

        /// <summary>
        /// Configuration settings for the Push MFA. If this block is present, Push MFA will be enabled, and disabled otherwise.
        /// </summary>
        [Input("push")]
        public Input<Inputs.GuardianPushArgs>? Push { get; set; }

        /// <summary>
        /// Indicates whether recovery code MFA is enabled.
        /// </summary>
        [Input("recoveryCode")]
        public Input<bool>? RecoveryCode { get; set; }

        /// <summary>
        /// Configuration settings for the WebAuthn with FIDO Device Biometrics MFA. If this block is present, WebAuthn with FIDO Device Biometrics MFA will be enabled, and disabled otherwise.
        /// </summary>
        [Input("webauthnPlatform")]
        public Input<Inputs.GuardianWebauthnPlatformArgs>? WebauthnPlatform { get; set; }

        /// <summary>
        /// Configuration settings for the WebAuthn with FIDO Security Keys MFA. If this block is present, WebAuthn with FIDO Security Keys MFA will be enabled, and disabled otherwise.
        /// </summary>
        [Input("webauthnRoaming")]
        public Input<Inputs.GuardianWebauthnRoamingArgs>? WebauthnRoaming { get; set; }

        public GuardianArgs()
        {
        }
        public static new GuardianArgs Empty => new GuardianArgs();
    }

    public sealed class GuardianState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration settings for the Duo MFA. If this block is present, Duo MFA will be enabled, and disabled otherwise.
        /// </summary>
        [Input("duo")]
        public Input<Inputs.GuardianDuoGetArgs>? Duo { get; set; }

        /// <summary>
        /// Indicates whether email MFA is enabled.
        /// </summary>
        [Input("email")]
        public Input<bool>? Email { get; set; }

        /// <summary>
        /// Indicates whether one time password MFA is enabled.
        /// </summary>
        [Input("otp")]
        public Input<bool>? Otp { get; set; }

        /// <summary>
        /// Configuration settings for the phone MFA. If this block is present, Phone MFA will be enabled, and disabled otherwise.
        /// </summary>
        [Input("phone")]
        public Input<Inputs.GuardianPhoneGetArgs>? Phone { get; set; }

        /// <summary>
        /// Policy to use. Available options are `never`, `all-applications` and `confidence-score`.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// Configuration settings for the Push MFA. If this block is present, Push MFA will be enabled, and disabled otherwise.
        /// </summary>
        [Input("push")]
        public Input<Inputs.GuardianPushGetArgs>? Push { get; set; }

        /// <summary>
        /// Indicates whether recovery code MFA is enabled.
        /// </summary>
        [Input("recoveryCode")]
        public Input<bool>? RecoveryCode { get; set; }

        /// <summary>
        /// Configuration settings for the WebAuthn with FIDO Device Biometrics MFA. If this block is present, WebAuthn with FIDO Device Biometrics MFA will be enabled, and disabled otherwise.
        /// </summary>
        [Input("webauthnPlatform")]
        public Input<Inputs.GuardianWebauthnPlatformGetArgs>? WebauthnPlatform { get; set; }

        /// <summary>
        /// Configuration settings for the WebAuthn with FIDO Security Keys MFA. If this block is present, WebAuthn with FIDO Security Keys MFA will be enabled, and disabled otherwise.
        /// </summary>
        [Input("webauthnRoaming")]
        public Input<Inputs.GuardianWebauthnRoamingGetArgs>? WebauthnRoaming { get; set; }

        public GuardianState()
        {
        }
        public static new GuardianState Empty => new GuardianState();
    }
}
