// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsAttributeUsernameArgs : global::Pulumi.ResourceArgs
    {
        [Input("identifiers")]
        private InputList<Inputs.ConnectionOptionsAttributeUsernameIdentifierArgs>? _identifiers;

        /// <summary>
        /// Connection options for User Name Attribute Identifier
        /// </summary>
        public InputList<Inputs.ConnectionOptionsAttributeUsernameIdentifierArgs> Identifiers
        {
            get => _identifiers ?? (_identifiers = new InputList<Inputs.ConnectionOptionsAttributeUsernameIdentifierArgs>());
            set => _identifiers = value;
        }

        /// <summary>
        /// Defines whether Profile is required
        /// </summary>
        [Input("profileRequired")]
        public Input<bool>? ProfileRequired { get; set; }

        [Input("signups")]
        private InputList<Inputs.ConnectionOptionsAttributeUsernameSignupArgs>? _signups;

        /// <summary>
        /// Defines signup settings for User Name attribute
        /// </summary>
        public InputList<Inputs.ConnectionOptionsAttributeUsernameSignupArgs> Signups
        {
            get => _signups ?? (_signups = new InputList<Inputs.ConnectionOptionsAttributeUsernameSignupArgs>());
            set => _signups = value;
        }

        [Input("validations")]
        private InputList<Inputs.ConnectionOptionsAttributeUsernameValidationArgs>? _validations;

        /// <summary>
        /// Defines validation settings for User Name attribute
        /// </summary>
        public InputList<Inputs.ConnectionOptionsAttributeUsernameValidationArgs> Validations
        {
            get => _validations ?? (_validations = new InputList<Inputs.ConnectionOptionsAttributeUsernameValidationArgs>());
            set => _validations = value;
        }

        public ConnectionOptionsAttributeUsernameArgs()
        {
        }
        public static new ConnectionOptionsAttributeUsernameArgs Empty => new ConnectionOptionsAttributeUsernameArgs();
    }
}
