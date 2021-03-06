// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class TenantFlagsGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean. Indicates whether or not to use the older v1 change password flow. Not recommended except for backward compatibility.
        /// </summary>
        [Input("changePwdFlowV1")]
        public Input<bool>? ChangePwdFlowV1 { get; set; }

        /// <summary>
        /// Boolean. Indicated whether or not classic Universal Login prompts include additional security headers to prevent clickjacking.
        /// </summary>
        [Input("disableClickjackProtectionHeaders")]
        public Input<bool>? DisableClickjackProtectionHeaders { get; set; }

        /// <summary>
        /// Boolean. Indicates whether or not the APIs section is enabled for the tenant.
        /// </summary>
        [Input("enableApisSection")]
        public Input<bool>? EnableApisSection { get; set; }

        /// <summary>
        /// Boolean. Indicates whether or not all current connections should be enabled when a new client is created.
        /// </summary>
        [Input("enableClientConnections")]
        public Input<bool>? EnableClientConnections { get; set; }

        /// <summary>
        /// Boolean. Indicates whether or not the tenant allows custom domains in emails.
        /// </summary>
        [Input("enableCustomDomainInEmails")]
        public Input<bool>? EnableCustomDomainInEmails { get; set; }

        /// <summary>
        /// Boolean. Indicates whether or not the tenant allows dynamic client registration.
        /// </summary>
        [Input("enableDynamicClientRegistration")]
        public Input<bool>? EnableDynamicClientRegistration { get; set; }

        /// <summary>
        /// Boolean. Indicates whether or not to use the older v2 legacy logs search.
        /// </summary>
        [Input("enableLegacyLogsSearchV2")]
        public Input<bool>? EnableLegacyLogsSearchV2 { get; set; }

        /// <summary>
        /// Boolean. Indicates whether or not advanced API Authorization scenarios are enabled.
        /// </summary>
        [Input("enablePipeline2")]
        public Input<bool>? EnablePipeline2 { get; set; }

        /// <summary>
        /// Boolean. Indicates whether or not the public sign up process shows a user_exists error if the user already exists.
        /// </summary>
        [Input("enablePublicSignupUserExistsError")]
        public Input<bool>? EnablePublicSignupUserExistsError { get; set; }

        /// <summary>
        /// Boolean. Indicates whether or not the tenant uses universal login.
        /// </summary>
        [Input("universalLogin")]
        public Input<bool>? UniversalLogin { get; set; }

        [Input("useScopeDescriptionsForConsent")]
        public Input<bool>? UseScopeDescriptionsForConsent { get; set; }

        public TenantFlagsGetArgs()
        {
        }
    }
}
