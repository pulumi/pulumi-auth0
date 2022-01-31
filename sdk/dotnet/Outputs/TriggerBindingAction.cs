// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Outputs
{

    [OutputType]
    public sealed class TriggerBindingAction
    {
        /// <summary>
        /// The name of an action.
        /// </summary>
        public readonly string DisplayName;
        /// <summary>
        /// Trigger ID.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private TriggerBindingAction(
            string displayName,

            string id)
        {
            DisplayName = displayName;
            Id = id;
        }
    }
}