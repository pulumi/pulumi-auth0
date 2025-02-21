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
    public sealed class GetClientNativeSocialLoginResult
    {
        public readonly ImmutableArray<Outputs.GetClientNativeSocialLoginAppleResult> Apples;
        public readonly ImmutableArray<Outputs.GetClientNativeSocialLoginFacebookResult> Facebooks;
        public readonly ImmutableArray<Outputs.GetClientNativeSocialLoginGoogleResult> Googles;

        [OutputConstructor]
        private GetClientNativeSocialLoginResult(
            ImmutableArray<Outputs.GetClientNativeSocialLoginAppleResult> apples,

            ImmutableArray<Outputs.GetClientNativeSocialLoginFacebookResult> facebooks,

            ImmutableArray<Outputs.GetClientNativeSocialLoginGoogleResult> googles)
        {
            Apples = apples;
            Facebooks = facebooks;
            Googles = googles;
        }
    }
}
