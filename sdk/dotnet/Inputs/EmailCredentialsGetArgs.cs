// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class EmailCredentialsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessKeyId")]
        private Input<string>? _accessKeyId;

        /// <summary>
        /// AWS Access Key ID. Used only for AWS.
        /// </summary>
        public Input<string>? AccessKeyId
        {
            get => _accessKeyId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accessKeyId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("apiKey")]
        private Input<string>? _apiKey;

        /// <summary>
        /// API Key for your email service. Will always be encrypted in our database.
        /// </summary>
        public Input<string>? ApiKey
        {
            get => _apiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// API User for your email service. This field is not accepted by the API any more so it will be removed in a future major version.
        /// </summary>
        [Input("apiUser")]
        public Input<string>? ApiUser { get; set; }

        /// <summary>
        /// Domain name.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// Default region. Used only for AWS, Mailgun, and SparkPost.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("secretAccessKey")]
        private Input<string>? _secretAccessKey;

        /// <summary>
        /// AWS Secret Key. Will always be encrypted in our database. Used only for AWS.
        /// </summary>
        public Input<string>? SecretAccessKey
        {
            get => _secretAccessKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretAccessKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Hostname or IP address of your SMTP server. Used only for SMTP.
        /// </summary>
        [Input("smtpHost")]
        public Input<string>? SmtpHost { get; set; }

        [Input("smtpPass")]
        private Input<string>? _smtpPass;

        /// <summary>
        /// SMTP password. Used only for SMTP.
        /// </summary>
        public Input<string>? SmtpPass
        {
            get => _smtpPass;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _smtpPass = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Port used by your SMTP server. Please avoid using port 25 if possible because many providers have limitations on this port. Used only for SMTP.
        /// </summary>
        [Input("smtpPort")]
        public Input<int>? SmtpPort { get; set; }

        /// <summary>
        /// SMTP username. Used only for SMTP.
        /// </summary>
        [Input("smtpUser")]
        public Input<string>? SmtpUser { get; set; }

        public EmailCredentialsGetArgs()
        {
        }
        public static new EmailCredentialsGetArgs Empty => new EmailCredentialsGetArgs();
    }
}
