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
    public sealed class ClientNativeSocialLoginGoogle
    {
        public readonly bool? Enabled;

        [OutputConstructor]
        private ClientNativeSocialLoginGoogle(bool? enabled)
        {
            Enabled = enabled;
        }
    }
}
