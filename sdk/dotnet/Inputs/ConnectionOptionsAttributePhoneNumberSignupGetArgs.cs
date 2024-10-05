// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsAttributePhoneNumberSignupGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines status of signup for Phone Number attribute
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("verifications")]
        private InputList<Inputs.ConnectionOptionsAttributePhoneNumberSignupVerificationGetArgs>? _verifications;

        /// <summary>
        /// Defines verification settings for Phone Number attribute
        /// </summary>
        public InputList<Inputs.ConnectionOptionsAttributePhoneNumberSignupVerificationGetArgs> Verifications
        {
            get => _verifications ?? (_verifications = new InputList<Inputs.ConnectionOptionsAttributePhoneNumberSignupVerificationGetArgs>());
            set => _verifications = value;
        }

        public ConnectionOptionsAttributePhoneNumberSignupGetArgs()
        {
        }
        public static new ConnectionOptionsAttributePhoneNumberSignupGetArgs Empty => new ConnectionOptionsAttributePhoneNumberSignupGetArgs();
    }
}