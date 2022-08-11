// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class TriggerBindingActionGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of an action.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// Trigger ID.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public TriggerBindingActionGetArgs()
        {
        }
        public static new TriggerBindingActionGetArgs Empty => new TriggerBindingActionGetArgs();
    }
}
