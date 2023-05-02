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
    public sealed class GuardianPushDirectApns
    {
        public readonly string BundleId;
        public readonly bool? Enabled;
        public readonly string P12;
        public readonly bool Sandbox;

        [OutputConstructor]
        private GuardianPushDirectApns(
            string bundleId,

            bool? enabled,

            string p12,

            bool sandbox)
        {
            BundleId = bundleId;
            Enabled = enabled;
            P12 = p12;
            Sandbox = sandbox;
        }
    }
}
