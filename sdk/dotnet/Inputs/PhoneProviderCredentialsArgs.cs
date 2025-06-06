// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class PhoneProviderCredentialsArgs : global::Pulumi.ResourceArgs
    {
        [Input("authToken")]
        private Input<string>? _authToken;

        /// <summary>
        /// The Auth Token for the phone provider.
        /// </summary>
        public Input<string>? AuthToken
        {
            get => _authToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _authToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public PhoneProviderCredentialsArgs()
        {
        }
        public static new PhoneProviderCredentialsArgs Empty => new PhoneProviderCredentialsArgs();
    }
}
