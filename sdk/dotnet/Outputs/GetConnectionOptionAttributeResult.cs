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
    public sealed class GetConnectionOptionAttributeResult
    {
        /// <summary>
        /// Connection Options for Email Attribute
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionOptionAttributeEmailResult> Emails;
        /// <summary>
        /// Connection Options for Phone Number Attribute
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionOptionAttributePhoneNumberResult> PhoneNumbers;
        /// <summary>
        /// Connection Options for User Name Attribute
        /// </summary>
        public readonly ImmutableArray<Outputs.GetConnectionOptionAttributeUsernameResult> Usernames;

        [OutputConstructor]
        private GetConnectionOptionAttributeResult(
            ImmutableArray<Outputs.GetConnectionOptionAttributeEmailResult> emails,

            ImmutableArray<Outputs.GetConnectionOptionAttributePhoneNumberResult> phoneNumbers,

            ImmutableArray<Outputs.GetConnectionOptionAttributeUsernameResult> usernames)
        {
            Emails = emails;
            PhoneNumbers = phoneNumbers;
            Usernames = usernames;
        }
    }
}