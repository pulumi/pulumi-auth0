// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientAddonsSalesforceSandboxApiArgs : global::Pulumi.ResourceArgs
    {
        [Input("clientId")]
        private Input<string>? _clientId;

        /// <summary>
        /// Consumer Key assigned by Salesforce to the Connected App.
        /// </summary>
        public Input<string>? ClientId
        {
            get => _clientId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clientId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Community name.
        /// </summary>
        [Input("communityName")]
        public Input<string>? CommunityName { get; set; }

        /// <summary>
        /// Community URL section.
        /// </summary>
        [Input("communityUrlSection")]
        public Input<string>? CommunityUrlSection { get; set; }

        [Input("principal")]
        private Input<string>? _principal;

        /// <summary>
        /// AWS principal ARN, for example `arn:aws:iam::010616021751:saml-provider/idpname`.
        /// </summary>
        public Input<string>? Principal
        {
            get => _principal;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _principal = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ClientAddonsSalesforceSandboxApiArgs()
        {
        }
        public static new ClientAddonsSalesforceSandboxApiArgs Empty => new ClientAddonsSalesforceSandboxApiArgs();
    }
}
