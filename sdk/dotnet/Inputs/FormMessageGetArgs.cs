// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class FormMessageGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Custom message for the form. (JSON encoded)
        /// </summary>
        [Input("custom")]
        public Input<string>? Custom { get; set; }

        /// <summary>
        /// Error message for the form. (JSON encoded)
        /// </summary>
        [Input("errors")]
        public Input<string>? Errors { get; set; }

        public FormMessageGetArgs()
        {
        }
        public static new FormMessageGetArgs Empty => new FormMessageGetArgs();
    }
}