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
    /// This resource allows you to manage branding themes for your Universal Login page within your Auth0 tenant.
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
    ///     // An example of a fully configured auth0_branding_theme.
    ///     var myTheme = new Auth0.BrandingTheme("myTheme", new()
    ///     {
    ///         Borders = new Auth0.Inputs.BrandingThemeBordersArgs
    ///         {
    ///             ButtonBorderRadius = 1,
    ///             ButtonBorderWeight = 1,
    ///             ButtonsStyle = "pill",
    ///             InputBorderRadius = 3,
    ///             InputBorderWeight = 1,
    ///             InputsStyle = "pill",
    ///             ShowWidgetShadow = false,
    ///             WidgetBorderWeight = 1,
    ///             WidgetCornerRadius = 3,
    ///         },
    ///         Colors = new Auth0.Inputs.BrandingThemeColorsArgs
    ///         {
    ///             BodyText = "#FF00CC",
    ///             Error = "#FF00CC",
    ///             Header = "#FF00CC",
    ///             Icons = "#FF00CC",
    ///             InputBackground = "#FF00CC",
    ///             InputBorder = "#FF00CC",
    ///             InputFilledText = "#FF00CC",
    ///             InputLabelsPlaceholders = "#FF00CC",
    ///             LinksFocusedComponents = "#FF00CC",
    ///             PrimaryButton = "#FF00CC",
    ///             PrimaryButtonLabel = "#FF00CC",
    ///             SecondaryButtonBorder = "#FF00CC",
    ///             SecondaryButtonLabel = "#FF00CC",
    ///             Success = "#FF00CC",
    ///             WidgetBackground = "#FF00CC",
    ///             WidgetBorder = "#FF00CC",
    ///         },
    ///         Fonts = new Auth0.Inputs.BrandingThemeFontsArgs
    ///         {
    ///             BodyText = new Auth0.Inputs.BrandingThemeFontsBodyTextArgs
    ///             {
    ///                 Bold = false,
    ///                 Size = 100,
    ///             },
    ///             ButtonsText = new Auth0.Inputs.BrandingThemeFontsButtonsTextArgs
    ///             {
    ///                 Bold = false,
    ///                 Size = 100,
    ///             },
    ///             FontUrl = "https://google.com/font.woff",
    ///             InputLabels = new Auth0.Inputs.BrandingThemeFontsInputLabelsArgs
    ///             {
    ///                 Bold = false,
    ///                 Size = 100,
    ///             },
    ///             Links = new Auth0.Inputs.BrandingThemeFontsLinksArgs
    ///             {
    ///                 Bold = false,
    ///                 Size = 100,
    ///             },
    ///             LinksStyle = "normal",
    ///             ReferenceTextSize = 12,
    ///             Subtitle = new Auth0.Inputs.BrandingThemeFontsSubtitleArgs
    ///             {
    ///                 Bold = false,
    ///                 Size = 100,
    ///             },
    ///             Title = new Auth0.Inputs.BrandingThemeFontsTitleArgs
    ///             {
    ///                 Bold = false,
    ///                 Size = 100,
    ///             },
    ///         },
    ///         PageBackground = new Auth0.Inputs.BrandingThemePageBackgroundArgs
    ///         {
    ///             BackgroundColor = "#000000",
    ///             BackgroundImageUrl = "https://google.com/background.png",
    ///             PageLayout = "center",
    ///         },
    ///         Widget = new Auth0.Inputs.BrandingThemeWidgetArgs
    ///         {
    ///             HeaderTextAlignment = "center",
    ///             LogoHeight = 55,
    ///             LogoPosition = "center",
    ///             LogoUrl = "https://google.com/logo.png",
    ///             SocialButtonsLayout = "top",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by specifying the Branding Theme ID.
    /// 
    /// # 
    /// 
    /// Example:
    /// 
    /// ```sh
    /// $ pulumi import auth0:index/brandingTheme:BrandingTheme my_theme "XXXXXXXXXXXXXXXXXXXX"
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/brandingTheme:BrandingTheme")]
    public partial class BrandingTheme : global::Pulumi.CustomResource
    {
        [Output("borders")]
        public Output<Outputs.BrandingThemeBorders> Borders { get; private set; } = null!;

        [Output("colors")]
        public Output<Outputs.BrandingThemeColors> Colors { get; private set; } = null!;

        /// <summary>
        /// The display name for the branding theme.
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        [Output("fonts")]
        public Output<Outputs.BrandingThemeFonts> Fonts { get; private set; } = null!;

        [Output("pageBackground")]
        public Output<Outputs.BrandingThemePageBackground> PageBackground { get; private set; } = null!;

        [Output("widget")]
        public Output<Outputs.BrandingThemeWidget> Widget { get; private set; } = null!;


        /// <summary>
        /// Create a BrandingTheme resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BrandingTheme(string name, BrandingThemeArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/brandingTheme:BrandingTheme", name, args ?? new BrandingThemeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BrandingTheme(string name, Input<string> id, BrandingThemeState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/brandingTheme:BrandingTheme", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BrandingTheme resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BrandingTheme Get(string name, Input<string> id, BrandingThemeState? state = null, CustomResourceOptions? options = null)
        {
            return new BrandingTheme(name, id, state, options);
        }
    }

    public sealed class BrandingThemeArgs : global::Pulumi.ResourceArgs
    {
        [Input("borders", required: true)]
        public Input<Inputs.BrandingThemeBordersArgs> Borders { get; set; } = null!;

        [Input("colors", required: true)]
        public Input<Inputs.BrandingThemeColorsArgs> Colors { get; set; } = null!;

        /// <summary>
        /// The display name for the branding theme.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("fonts", required: true)]
        public Input<Inputs.BrandingThemeFontsArgs> Fonts { get; set; } = null!;

        [Input("pageBackground", required: true)]
        public Input<Inputs.BrandingThemePageBackgroundArgs> PageBackground { get; set; } = null!;

        [Input("widget", required: true)]
        public Input<Inputs.BrandingThemeWidgetArgs> Widget { get; set; } = null!;

        public BrandingThemeArgs()
        {
        }
        public static new BrandingThemeArgs Empty => new BrandingThemeArgs();
    }

    public sealed class BrandingThemeState : global::Pulumi.ResourceArgs
    {
        [Input("borders")]
        public Input<Inputs.BrandingThemeBordersGetArgs>? Borders { get; set; }

        [Input("colors")]
        public Input<Inputs.BrandingThemeColorsGetArgs>? Colors { get; set; }

        /// <summary>
        /// The display name for the branding theme.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        [Input("fonts")]
        public Input<Inputs.BrandingThemeFontsGetArgs>? Fonts { get; set; }

        [Input("pageBackground")]
        public Input<Inputs.BrandingThemePageBackgroundGetArgs>? PageBackground { get; set; }

        [Input("widget")]
        public Input<Inputs.BrandingThemeWidgetGetArgs>? Widget { get; set; }

        public BrandingThemeState()
        {
        }
        public static new BrandingThemeState Empty => new BrandingThemeState();
    }
}
