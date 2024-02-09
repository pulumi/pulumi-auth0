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
    /// With this resource, you can bind an action to a trigger. Once an action is created and deployed, it can be attached (i.e. bound) to a trigger so that it will be executed as part of a flow.
    /// 
    /// Ordering of an action within a specific flow is not currently supported when using this resource; the action will get appended to the end of the flow. To precisely manage ordering, it is advised to either do so with the dashboard UI or with the `auth0_trigger_bindings` resource.
    /// 
    /// !&gt; This resource appends an action to the trigger binding. In contrast, the `auth0.TriggerActions` resource manages all
    /// the action bindings to a trigger. To avoid potential issues, it is recommended not to use this resource in conjunction
    /// with the `auth0.TriggerAction` resource when binding actions to the same trigger.
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
    ///     var loginAlert = new Auth0.Action("loginAlert", new()
    ///     {
    ///         Code = @"exports.onContinuePostLogin = async (event, api) =&gt; {
    ///   console.log(""foo"");
    /// };""
    /// ",
    ///         Deploy = true,
    ///         SupportedTriggers = new Auth0.Inputs.ActionSupportedTriggersArgs
    ///         {
    ///             Id = "post-login",
    ///             Version = "v3",
    ///         },
    ///     });
    /// 
    ///     var postLoginAlertAction = new Auth0.TriggerAction("postLoginAlertAction", new()
    ///     {
    ///         Trigger = "post-login",
    ///         ActionId = loginAlert.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by specifying the
    /// 
    ///  trigger and action ID separated by "::" (note the double colon)
    /// 
    ///  &lt;trigger&gt;::&lt;actionID&gt;
    /// 
    /// # 
    /// 
    ///  Example:
    /// 
    /// ```sh
    /// $ pulumi import auth0:index/triggerAction:TriggerAction post_login_action "post-login::28b5c8fa-d371-5734-acf6-d0cf80ead918"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/triggerAction:TriggerAction")]
    public partial class TriggerAction : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the action to bind to the trigger.
        /// </summary>
        [Output("actionId")]
        public Output<string> ActionId { get; private set; } = null!;

        /// <summary>
        /// The name for this action within the trigger. This can be useful for distinguishing between multiple instances of the same action bound to a trigger. Defaults to action name when not provided.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `iga-approval`, `iga-certification`, `iga-fulfillment-assignment`, `iga-fulfillment-execution`.
        /// </summary>
        [Output("trigger")]
        public Output<string> Trigger { get; private set; } = null!;


        /// <summary>
        /// Create a TriggerAction resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TriggerAction(string name, TriggerActionArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/triggerAction:TriggerAction", name, args ?? new TriggerActionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TriggerAction(string name, Input<string> id, TriggerActionState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/triggerAction:TriggerAction", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TriggerAction resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TriggerAction Get(string name, Input<string> id, TriggerActionState? state = null, CustomResourceOptions? options = null)
        {
            return new TriggerAction(name, id, state, options);
        }
    }

    public sealed class TriggerActionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the action to bind to the trigger.
        /// </summary>
        [Input("actionId", required: true)]
        public Input<string> ActionId { get; set; } = null!;

        /// <summary>
        /// The name for this action within the trigger. This can be useful for distinguishing between multiple instances of the same action bound to a trigger. Defaults to action name when not provided.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `iga-approval`, `iga-certification`, `iga-fulfillment-assignment`, `iga-fulfillment-execution`.
        /// </summary>
        [Input("trigger", required: true)]
        public Input<string> Trigger { get; set; } = null!;

        public TriggerActionArgs()
        {
        }
        public static new TriggerActionArgs Empty => new TriggerActionArgs();
    }

    public sealed class TriggerActionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the action to bind to the trigger.
        /// </summary>
        [Input("actionId")]
        public Input<string>? ActionId { get; set; }

        /// <summary>
        /// The name for this action within the trigger. This can be useful for distinguishing between multiple instances of the same action bound to a trigger. Defaults to action name when not provided.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The ID of the trigger to bind with. Available options: `post-login`, `credentials-exchange`, `pre-user-registration`, `post-user-registration`, `post-change-password`, `send-phone-message`, `password-reset-post-challenge`, `iga-approval`, `iga-certification`, `iga-fulfillment-assignment`, `iga-fulfillment-execution`.
        /// </summary>
        [Input("trigger")]
        public Input<string>? Trigger { get; set; }

        public TriggerActionState()
        {
        }
        public static new TriggerActionState Empty => new TriggerActionState();
    }
}
