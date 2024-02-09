// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.BrandingThemeArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.BrandingThemeState;
import com.pulumi.auth0.outputs.BrandingThemeBorders;
import com.pulumi.auth0.outputs.BrandingThemeColors;
import com.pulumi.auth0.outputs.BrandingThemeFonts;
import com.pulumi.auth0.outputs.BrandingThemePageBackground;
import com.pulumi.auth0.outputs.BrandingThemeWidget;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource allows you to manage branding themes for your Universal Login page within your Auth0 tenant.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.BrandingTheme;
 * import com.pulumi.auth0.BrandingThemeArgs;
 * import com.pulumi.auth0.inputs.BrandingThemeBordersArgs;
 * import com.pulumi.auth0.inputs.BrandingThemeColorsArgs;
 * import com.pulumi.auth0.inputs.BrandingThemeFontsArgs;
 * import com.pulumi.auth0.inputs.BrandingThemeFontsBodyTextArgs;
 * import com.pulumi.auth0.inputs.BrandingThemeFontsButtonsTextArgs;
 * import com.pulumi.auth0.inputs.BrandingThemeFontsInputLabelsArgs;
 * import com.pulumi.auth0.inputs.BrandingThemeFontsLinksArgs;
 * import com.pulumi.auth0.inputs.BrandingThemeFontsSubtitleArgs;
 * import com.pulumi.auth0.inputs.BrandingThemeFontsTitleArgs;
 * import com.pulumi.auth0.inputs.BrandingThemePageBackgroundArgs;
 * import com.pulumi.auth0.inputs.BrandingThemeWidgetArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var myTheme = new BrandingTheme(&#34;myTheme&#34;, BrandingThemeArgs.builder()        
 *             .borders(BrandingThemeBordersArgs.builder()
 *                 .buttonBorderRadius(1)
 *                 .buttonBorderWeight(1)
 *                 .buttonsStyle(&#34;pill&#34;)
 *                 .inputBorderRadius(3)
 *                 .inputBorderWeight(1)
 *                 .inputsStyle(&#34;pill&#34;)
 *                 .showWidgetShadow(false)
 *                 .widgetBorderWeight(1)
 *                 .widgetCornerRadius(3)
 *                 .build())
 *             .colors(BrandingThemeColorsArgs.builder()
 *                 .bodyText(&#34;#FF00CC&#34;)
 *                 .error(&#34;#FF00CC&#34;)
 *                 .header(&#34;#FF00CC&#34;)
 *                 .icons(&#34;#FF00CC&#34;)
 *                 .inputBackground(&#34;#FF00CC&#34;)
 *                 .inputBorder(&#34;#FF00CC&#34;)
 *                 .inputFilledText(&#34;#FF00CC&#34;)
 *                 .inputLabelsPlaceholders(&#34;#FF00CC&#34;)
 *                 .linksFocusedComponents(&#34;#FF00CC&#34;)
 *                 .primaryButton(&#34;#FF00CC&#34;)
 *                 .primaryButtonLabel(&#34;#FF00CC&#34;)
 *                 .secondaryButtonBorder(&#34;#FF00CC&#34;)
 *                 .secondaryButtonLabel(&#34;#FF00CC&#34;)
 *                 .success(&#34;#FF00CC&#34;)
 *                 .widgetBackground(&#34;#FF00CC&#34;)
 *                 .widgetBorder(&#34;#FF00CC&#34;)
 *                 .build())
 *             .fonts(BrandingThemeFontsArgs.builder()
 *                 .bodyText(BrandingThemeFontsBodyTextArgs.builder()
 *                     .bold(false)
 *                     .size(100)
 *                     .build())
 *                 .buttonsText(BrandingThemeFontsButtonsTextArgs.builder()
 *                     .bold(false)
 *                     .size(100)
 *                     .build())
 *                 .fontUrl(&#34;https://google.com/font.woff&#34;)
 *                 .inputLabels(BrandingThemeFontsInputLabelsArgs.builder()
 *                     .bold(false)
 *                     .size(100)
 *                     .build())
 *                 .links(BrandingThemeFontsLinksArgs.builder()
 *                     .bold(false)
 *                     .size(100)
 *                     .build())
 *                 .linksStyle(&#34;normal&#34;)
 *                 .referenceTextSize(12)
 *                 .subtitle(BrandingThemeFontsSubtitleArgs.builder()
 *                     .bold(false)
 *                     .size(100)
 *                     .build())
 *                 .title(BrandingThemeFontsTitleArgs.builder()
 *                     .bold(false)
 *                     .size(100)
 *                     .build())
 *                 .build())
 *             .pageBackground(BrandingThemePageBackgroundArgs.builder()
 *                 .backgroundColor(&#34;#000000&#34;)
 *                 .backgroundImageUrl(&#34;https://google.com/background.png&#34;)
 *                 .pageLayout(&#34;center&#34;)
 *                 .build())
 *             .widget(BrandingThemeWidgetArgs.builder()
 *                 .headerTextAlignment(&#34;center&#34;)
 *                 .logoHeight(55)
 *                 .logoPosition(&#34;center&#34;)
 *                 .logoUrl(&#34;https://google.com/logo.png&#34;)
 *                 .socialButtonsLayout(&#34;top&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported by specifying the Branding Theme ID.
 * 
 * # 
 * 
 *  Example:
 * 
 * ```sh
 * $ pulumi import auth0:index/brandingTheme:BrandingTheme my_theme &#34;XXXXXXXXXXXXXXXXXXXX&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/brandingTheme:BrandingTheme")
public class BrandingTheme extends com.pulumi.resources.CustomResource {
    @Export(name="borders", refs={BrandingThemeBorders.class}, tree="[0]")
    private Output<BrandingThemeBorders> borders;

    public Output<BrandingThemeBorders> borders() {
        return this.borders;
    }
    @Export(name="colors", refs={BrandingThemeColors.class}, tree="[0]")
    private Output<BrandingThemeColors> colors;

    public Output<BrandingThemeColors> colors() {
        return this.colors;
    }
    /**
     * The display name for the branding theme.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The display name for the branding theme.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    @Export(name="fonts", refs={BrandingThemeFonts.class}, tree="[0]")
    private Output<BrandingThemeFonts> fonts;

    public Output<BrandingThemeFonts> fonts() {
        return this.fonts;
    }
    @Export(name="pageBackground", refs={BrandingThemePageBackground.class}, tree="[0]")
    private Output<BrandingThemePageBackground> pageBackground;

    public Output<BrandingThemePageBackground> pageBackground() {
        return this.pageBackground;
    }
    @Export(name="widget", refs={BrandingThemeWidget.class}, tree="[0]")
    private Output<BrandingThemeWidget> widget;

    public Output<BrandingThemeWidget> widget() {
        return this.widget;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BrandingTheme(String name) {
        this(name, BrandingThemeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BrandingTheme(String name, BrandingThemeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BrandingTheme(String name, BrandingThemeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/brandingTheme:BrandingTheme", name, args == null ? BrandingThemeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BrandingTheme(String name, Output<String> id, @Nullable BrandingThemeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/brandingTheme:BrandingTheme", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BrandingTheme get(String name, Output<String> id, @Nullable BrandingThemeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BrandingTheme(name, id, state, options);
    }
}
