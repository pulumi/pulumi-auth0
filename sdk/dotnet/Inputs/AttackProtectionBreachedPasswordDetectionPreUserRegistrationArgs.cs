// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class AttackProtectionBreachedPasswordDetectionPreUserRegistrationArgs : global::Pulumi.ResourceArgs
    {
        [Input("shields")]
        private InputList<string>? _shields;

        /// <summary>
        /// Action to take when a breached password is detected during a signup. Possible values: `block` (block compromised credentials for new accounts), `admin_notification` (send an email notification with a summary of compromised credentials in new accounts).
        /// </summary>
        public InputList<string> Shields
        {
            get => _shields ?? (_shields = new InputList<string>());
            set => _shields = value;
        }

        public AttackProtectionBreachedPasswordDetectionPreUserRegistrationArgs()
        {
        }
        public static new AttackProtectionBreachedPasswordDetectionPreUserRegistrationArgs Empty => new AttackProtectionBreachedPasswordDetectionPreUserRegistrationArgs();
    }
}
