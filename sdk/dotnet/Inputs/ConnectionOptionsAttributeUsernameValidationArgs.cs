// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsAttributeUsernameValidationArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedTypes")]
        private InputList<Inputs.ConnectionOptionsAttributeUsernameValidationAllowedTypeArgs>? _allowedTypes;

        /// <summary>
        /// Defines allowed types for for UserName attribute
        /// </summary>
        public InputList<Inputs.ConnectionOptionsAttributeUsernameValidationAllowedTypeArgs> AllowedTypes
        {
            get => _allowedTypes ?? (_allowedTypes = new InputList<Inputs.ConnectionOptionsAttributeUsernameValidationAllowedTypeArgs>());
            set => _allowedTypes = value;
        }

        /// <summary>
        /// Defines Max Length for User Name attribute
        /// </summary>
        [Input("maxLength")]
        public Input<int>? MaxLength { get; set; }

        /// <summary>
        /// Defines Min Length for User Name attribute
        /// </summary>
        [Input("minLength")]
        public Input<int>? MinLength { get; set; }

        public ConnectionOptionsAttributeUsernameValidationArgs()
        {
        }
        public static new ConnectionOptionsAttributeUsernameValidationArgs Empty => new ConnectionOptionsAttributeUsernameValidationArgs();
    }
}