// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    /// <summary>
    /// With Auth0, you can have standard welcome, password reset, and account verification email-based workflows built right
    /// into Auth0. This resource allows you to configure email providers, so you can route all emails that are part of Auth0's
    /// authentication workflows through the supported high-volume email service of your choice.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Auth0 = Pulumi.Auth0;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var myEmailProvider = new Auth0.Email("myEmailProvider", new Auth0.EmailArgs
    ///         {
    ///             Credentials = new Auth0.Inputs.EmailCredentialsArgs
    ///             {
    ///                 AccessKeyId = "AKIAXXXXXXXXXXXXXXXX",
    ///                 Region = "us-east-1",
    ///                 SecretAccessKey = "7e8c2148xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
    ///             },
    ///             DefaultFromAddress = "accounts@example.com",
    ///             Enabled = true,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// As this is not a resource identifiable by an ID within the Auth0 Management API, email can be imported using a random string. We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4) e.g.
    /// 
    /// ```sh
    ///  $ pulumi import auth0:index/email:Email my_email_provider b4213dc2-2eed-42c3-9516-c6131a9ce0b0
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/email:Email")]
    public partial class Email : Pulumi.CustomResource
    {
        /// <summary>
        /// List(Resource). Configuration settings for the credentials for the email provider. For details, see Credentials.
        /// </summary>
        [Output("credentials")]
        public Output<Outputs.EmailCredentials> Credentials { get; private set; } = null!;

        /// <summary>
        /// String. Email address to use as the sender when no other "from" address is specified.
        /// </summary>
        [Output("defaultFromAddress")]
        public Output<string> DefaultFromAddress { get; private set; } = null!;

        /// <summary>
        /// Boolean. Indicates whether or not the email provider is enabled.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// String. Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a Email resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Email(string name, EmailArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/email:Email", name, args ?? new EmailArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Email(string name, Input<string> id, EmailState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/email:Email", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Email resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Email Get(string name, Input<string> id, EmailState? state = null, CustomResourceOptions? options = null)
        {
            return new Email(name, id, state, options);
        }
    }

    public sealed class EmailArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// List(Resource). Configuration settings for the credentials for the email provider. For details, see Credentials.
        /// </summary>
        [Input("credentials", required: true)]
        public Input<Inputs.EmailCredentialsArgs> Credentials { get; set; } = null!;

        /// <summary>
        /// String. Email address to use as the sender when no other "from" address is specified.
        /// </summary>
        [Input("defaultFromAddress", required: true)]
        public Input<string> DefaultFromAddress { get; set; } = null!;

        /// <summary>
        /// Boolean. Indicates whether or not the email provider is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// String. Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public EmailArgs()
        {
        }
    }

    public sealed class EmailState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// List(Resource). Configuration settings for the credentials for the email provider. For details, see Credentials.
        /// </summary>
        [Input("credentials")]
        public Input<Inputs.EmailCredentialsGetArgs>? Credentials { get; set; }

        /// <summary>
        /// String. Email address to use as the sender when no other "from" address is specified.
        /// </summary>
        [Input("defaultFromAddress")]
        public Input<string>? DefaultFromAddress { get; set; }

        /// <summary>
        /// Boolean. Indicates whether or not the email provider is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// String. Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public EmailState()
        {
        }
    }
}
