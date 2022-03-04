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
    public sealed class GetClientMobileAndroidResult
    {
        public readonly string AppPackageName;
        public readonly ImmutableArray<string> Sha256CertFingerprints;

        [OutputConstructor]
        private GetClientMobileAndroidResult(
            string appPackageName,

            ImmutableArray<string> sha256CertFingerprints)
        {
            AppPackageName = appPackageName;
            Sha256CertFingerprints = sha256CertFingerprints;
        }
    }
}
