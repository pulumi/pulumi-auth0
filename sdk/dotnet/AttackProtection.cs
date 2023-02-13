// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    /// <summary>
    /// Auth0 can detect attacks and stop malicious attempts to access your application such as blocking traffic from certain IPs and displaying CAPTCHAs.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Auth0 = Pulumi.Auth0;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myProtection = new Auth0.AttackProtection("myProtection", new()
    ///     {
    ///         BreachedPasswordDetection = new Auth0.Inputs.AttackProtectionBreachedPasswordDetectionArgs
    ///         {
    ///             AdminNotificationFrequencies = new[]
    ///             {
    ///                 "daily",
    ///             },
    ///             Enabled = true,
    ///             Method = "standard",
    ///             PreUserRegistration = new Auth0.Inputs.AttackProtectionBreachedPasswordDetectionPreUserRegistrationArgs
    ///             {
    ///                 Shields = new[]
    ///                 {
    ///                     "block",
    ///                 },
    ///             },
    ///             Shields = new[]
    ///             {
    ///                 "admin_notification",
    ///                 "block",
    ///             },
    ///         },
    ///         BruteForceProtection = new Auth0.Inputs.AttackProtectionBruteForceProtectionArgs
    ///         {
    ///             Allowlists = new[]
    ///             {
    ///                 "127.0.0.1",
    ///             },
    ///             Enabled = true,
    ///             MaxAttempts = 5,
    ///             Mode = "count_per_identifier_and_ip",
    ///             Shields = new[]
    ///             {
    ///                 "block",
    ///                 "user_notification",
    ///             },
    ///         },
    ///         SuspiciousIpThrottling = new Auth0.Inputs.AttackProtectionSuspiciousIpThrottlingArgs
    ///         {
    ///             Allowlists = new[]
    ///             {
    ///                 "192.168.1.1",
    ///             },
    ///             Enabled = true,
    ///             PreLogin = new Auth0.Inputs.AttackProtectionSuspiciousIpThrottlingPreLoginArgs
    ///             {
    ///                 MaxAttempts = 100,
    ///                 Rate = 864000,
    ///             },
    ///             PreUserRegistration = new Auth0.Inputs.AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs
    ///             {
    ///                 MaxAttempts = 50,
    ///                 Rate = 1200,
    ///             },
    ///             Shields = new[]
    ///             {
    ///                 "admin_notification",
    ///                 "block",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// As this is not a resource identifiable by an ID within the Auth0 Management API, attack_protection can be imported using a random string. # We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4) # Example
    /// 
    /// ```sh
    ///  $ pulumi import auth0:index/attackProtection:AttackProtection my_protection 24940d4b-4bd4-44e7-894e-f92e4de36a40
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/attackProtection:AttackProtection")]
    public partial class AttackProtection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Breached password detection protects your applications from bad actors logging in with stolen credentials.
        /// </summary>
        [Output("breachedPasswordDetection")]
        public Output<Outputs.AttackProtectionBreachedPasswordDetection> BreachedPasswordDetection { get; private set; } = null!;

        /// <summary>
        /// Brute-force protection safeguards against a single IP address attacking a single user account.
        /// </summary>
        [Output("bruteForceProtection")]
        public Output<Outputs.AttackProtectionBruteForceProtection> BruteForceProtection { get; private set; } = null!;

        /// <summary>
        /// Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
        /// </summary>
        [Output("suspiciousIpThrottling")]
        public Output<Outputs.AttackProtectionSuspiciousIpThrottling> SuspiciousIpThrottling { get; private set; } = null!;


        /// <summary>
        /// Create a AttackProtection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AttackProtection(string name, AttackProtectionArgs? args = null, CustomResourceOptions? options = null)
            : base("auth0:index/attackProtection:AttackProtection", name, args ?? new AttackProtectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AttackProtection(string name, Input<string> id, AttackProtectionState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/attackProtection:AttackProtection", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AttackProtection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AttackProtection Get(string name, Input<string> id, AttackProtectionState? state = null, CustomResourceOptions? options = null)
        {
            return new AttackProtection(name, id, state, options);
        }
    }

    public sealed class AttackProtectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Breached password detection protects your applications from bad actors logging in with stolen credentials.
        /// </summary>
        [Input("breachedPasswordDetection")]
        public Input<Inputs.AttackProtectionBreachedPasswordDetectionArgs>? BreachedPasswordDetection { get; set; }

        /// <summary>
        /// Brute-force protection safeguards against a single IP address attacking a single user account.
        /// </summary>
        [Input("bruteForceProtection")]
        public Input<Inputs.AttackProtectionBruteForceProtectionArgs>? BruteForceProtection { get; set; }

        /// <summary>
        /// Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
        /// </summary>
        [Input("suspiciousIpThrottling")]
        public Input<Inputs.AttackProtectionSuspiciousIpThrottlingArgs>? SuspiciousIpThrottling { get; set; }

        public AttackProtectionArgs()
        {
        }
        public static new AttackProtectionArgs Empty => new AttackProtectionArgs();
    }

    public sealed class AttackProtectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Breached password detection protects your applications from bad actors logging in with stolen credentials.
        /// </summary>
        [Input("breachedPasswordDetection")]
        public Input<Inputs.AttackProtectionBreachedPasswordDetectionGetArgs>? BreachedPasswordDetection { get; set; }

        /// <summary>
        /// Brute-force protection safeguards against a single IP address attacking a single user account.
        /// </summary>
        [Input("bruteForceProtection")]
        public Input<Inputs.AttackProtectionBruteForceProtectionGetArgs>? BruteForceProtection { get; set; }

        /// <summary>
        /// Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
        /// </summary>
        [Input("suspiciousIpThrottling")]
        public Input<Inputs.AttackProtectionSuspiciousIpThrottlingGetArgs>? SuspiciousIpThrottling { get; set; }

        public AttackProtectionState()
        {
        }
        public static new AttackProtectionState Empty => new AttackProtectionState();
    }
}
