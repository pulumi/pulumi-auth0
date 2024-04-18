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
    /// With this resource you can manage custom HTML for the Login, Reset Password, Multi-Factor Authentication and Error pages.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Auth0 = Pulumi.Auth0;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myPages = new Auth0.Pages("my_pages", new()
    ///     {
    ///         Login = new Auth0.Inputs.PagesLoginArgs
    ///         {
    ///             Enabled = true,
    ///             Html = "&lt;html&gt;&lt;body&gt;My Custom Login Page&lt;/body&gt;&lt;/html&gt;",
    ///         },
    ///         ChangePassword = new Auth0.Inputs.PagesChangePasswordArgs
    ///         {
    ///             Enabled = true,
    ///             Html = "&lt;html&gt;&lt;body&gt;My Custom Reset Password Page&lt;/body&gt;&lt;/html&gt;",
    ///         },
    ///         GuardianMfa = new Auth0.Inputs.PagesGuardianMfaArgs
    ///         {
    ///             Enabled = true,
    ///             Html = "&lt;html&gt;&lt;body&gt;My Custom MFA Page&lt;/body&gt;&lt;/html&gt;",
    ///         },
    ///         Error = new Auth0.Inputs.PagesErrorArgs
    ///         {
    ///             ShowLogLink = true,
    ///             Html = "&lt;html&gt;&lt;body&gt;My Custom Error Page&lt;/body&gt;&lt;/html&gt;",
    ///             Url = "https://example.com",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// As this is not a resource identifiable by an ID within the Auth0 Management API,
    /// 
    /// pages can be imported using a random string.
    /// 
    /// # 
    /// 
    /// We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4)
    /// 
    /// # 
    /// 
    /// Example:
    /// 
    /// ```sh
    /// $ pulumi import auth0:index/pages:Pages my_pages "22f4f21b-017a-319d-92e7-2291c1ca36c4"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/pages:Pages")]
    public partial class Pages : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Configuration settings for customizing the Password Reset page.
        /// </summary>
        [Output("changePassword")]
        public Output<Outputs.PagesChangePassword> ChangePassword { get; private set; } = null!;

        /// <summary>
        /// Configuration settings for the Error pages.
        /// </summary>
        [Output("error")]
        public Output<Outputs.PagesError> Error { get; private set; } = null!;

        /// <summary>
        /// Configuration settings for customizing the Guardian Multi-Factor Authentication page.
        /// </summary>
        [Output("guardianMfa")]
        public Output<Outputs.PagesGuardianMfa> GuardianMfa { get; private set; } = null!;

        /// <summary>
        /// Configuration settings for customizing the Login page.
        /// </summary>
        [Output("login")]
        public Output<Outputs.PagesLogin> Login { get; private set; } = null!;


        /// <summary>
        /// Create a Pages resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Pages(string name, PagesArgs? args = null, CustomResourceOptions? options = null)
            : base("auth0:index/pages:Pages", name, args ?? new PagesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Pages(string name, Input<string> id, PagesState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/pages:Pages", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Pages resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Pages Get(string name, Input<string> id, PagesState? state = null, CustomResourceOptions? options = null)
        {
            return new Pages(name, id, state, options);
        }
    }

    public sealed class PagesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration settings for customizing the Password Reset page.
        /// </summary>
        [Input("changePassword")]
        public Input<Inputs.PagesChangePasswordArgs>? ChangePassword { get; set; }

        /// <summary>
        /// Configuration settings for the Error pages.
        /// </summary>
        [Input("error")]
        public Input<Inputs.PagesErrorArgs>? Error { get; set; }

        /// <summary>
        /// Configuration settings for customizing the Guardian Multi-Factor Authentication page.
        /// </summary>
        [Input("guardianMfa")]
        public Input<Inputs.PagesGuardianMfaArgs>? GuardianMfa { get; set; }

        /// <summary>
        /// Configuration settings for customizing the Login page.
        /// </summary>
        [Input("login")]
        public Input<Inputs.PagesLoginArgs>? Login { get; set; }

        public PagesArgs()
        {
        }
        public static new PagesArgs Empty => new PagesArgs();
    }

    public sealed class PagesState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration settings for customizing the Password Reset page.
        /// </summary>
        [Input("changePassword")]
        public Input<Inputs.PagesChangePasswordGetArgs>? ChangePassword { get; set; }

        /// <summary>
        /// Configuration settings for the Error pages.
        /// </summary>
        [Input("error")]
        public Input<Inputs.PagesErrorGetArgs>? Error { get; set; }

        /// <summary>
        /// Configuration settings for customizing the Guardian Multi-Factor Authentication page.
        /// </summary>
        [Input("guardianMfa")]
        public Input<Inputs.PagesGuardianMfaGetArgs>? GuardianMfa { get; set; }

        /// <summary>
        /// Configuration settings for customizing the Login page.
        /// </summary>
        [Input("login")]
        public Input<Inputs.PagesLoginGetArgs>? Login { get; set; }

        public PagesState()
        {
        }
        public static new PagesState Empty => new PagesState();
    }
}
