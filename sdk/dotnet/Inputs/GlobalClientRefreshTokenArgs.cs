// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class GlobalClientRefreshTokenArgs : global::Pulumi.ResourceArgs
    {
        [Input("expirationType", required: true)]
        public Input<string> ExpirationType { get; set; } = null!;

        [Input("idleTokenLifetime")]
        public Input<int>? IdleTokenLifetime { get; set; }

        [Input("infiniteIdleTokenLifetime")]
        public Input<bool>? InfiniteIdleTokenLifetime { get; set; }

        [Input("infiniteTokenLifetime")]
        public Input<bool>? InfiniteTokenLifetime { get; set; }

        [Input("leeway")]
        public Input<int>? Leeway { get; set; }

        [Input("rotationType", required: true)]
        public Input<string> RotationType { get; set; } = null!;

        [Input("tokenLifetime")]
        public Input<int>? TokenLifetime { get; set; }

        public GlobalClientRefreshTokenArgs()
        {
        }
        public static new GlobalClientRefreshTokenArgs Empty => new GlobalClientRefreshTokenArgs();
    }
}
