// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsAttributeEmailSignupGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines signup status for Email Attribute
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("verifications")]
        private InputList<Inputs.ConnectionOptionsAttributeEmailSignupVerificationGetArgs>? _verifications;

        /// <summary>
        /// Defines settings for Verification under Email attribute
        /// </summary>
        public InputList<Inputs.ConnectionOptionsAttributeEmailSignupVerificationGetArgs> Verifications
        {
            get => _verifications ?? (_verifications = new InputList<Inputs.ConnectionOptionsAttributeEmailSignupVerificationGetArgs>());
            set => _verifications = value;
        }

        public ConnectionOptionsAttributeEmailSignupGetArgs()
        {
        }
        public static new ConnectionOptionsAttributeEmailSignupGetArgs Empty => new ConnectionOptionsAttributeEmailSignupGetArgs();
    }
}
