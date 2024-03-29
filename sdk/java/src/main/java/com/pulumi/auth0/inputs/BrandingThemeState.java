// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.BrandingThemeBordersArgs;
import com.pulumi.auth0.inputs.BrandingThemeColorsArgs;
import com.pulumi.auth0.inputs.BrandingThemeFontsArgs;
import com.pulumi.auth0.inputs.BrandingThemePageBackgroundArgs;
import com.pulumi.auth0.inputs.BrandingThemeWidgetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BrandingThemeState extends com.pulumi.resources.ResourceArgs {

    public static final BrandingThemeState Empty = new BrandingThemeState();

    @Import(name="borders")
    private @Nullable Output<BrandingThemeBordersArgs> borders;

    public Optional<Output<BrandingThemeBordersArgs>> borders() {
        return Optional.ofNullable(this.borders);
    }

    @Import(name="colors")
    private @Nullable Output<BrandingThemeColorsArgs> colors;

    public Optional<Output<BrandingThemeColorsArgs>> colors() {
        return Optional.ofNullable(this.colors);
    }

    /**
     * The display name for the branding theme.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name for the branding theme.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="fonts")
    private @Nullable Output<BrandingThemeFontsArgs> fonts;

    public Optional<Output<BrandingThemeFontsArgs>> fonts() {
        return Optional.ofNullable(this.fonts);
    }

    @Import(name="pageBackground")
    private @Nullable Output<BrandingThemePageBackgroundArgs> pageBackground;

    public Optional<Output<BrandingThemePageBackgroundArgs>> pageBackground() {
        return Optional.ofNullable(this.pageBackground);
    }

    @Import(name="widget")
    private @Nullable Output<BrandingThemeWidgetArgs> widget;

    public Optional<Output<BrandingThemeWidgetArgs>> widget() {
        return Optional.ofNullable(this.widget);
    }

    private BrandingThemeState() {}

    private BrandingThemeState(BrandingThemeState $) {
        this.borders = $.borders;
        this.colors = $.colors;
        this.displayName = $.displayName;
        this.fonts = $.fonts;
        this.pageBackground = $.pageBackground;
        this.widget = $.widget;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrandingThemeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrandingThemeState $;

        public Builder() {
            $ = new BrandingThemeState();
        }

        public Builder(BrandingThemeState defaults) {
            $ = new BrandingThemeState(Objects.requireNonNull(defaults));
        }

        public Builder borders(@Nullable Output<BrandingThemeBordersArgs> borders) {
            $.borders = borders;
            return this;
        }

        public Builder borders(BrandingThemeBordersArgs borders) {
            return borders(Output.of(borders));
        }

        public Builder colors(@Nullable Output<BrandingThemeColorsArgs> colors) {
            $.colors = colors;
            return this;
        }

        public Builder colors(BrandingThemeColorsArgs colors) {
            return colors(Output.of(colors));
        }

        /**
         * @param displayName The display name for the branding theme.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name for the branding theme.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder fonts(@Nullable Output<BrandingThemeFontsArgs> fonts) {
            $.fonts = fonts;
            return this;
        }

        public Builder fonts(BrandingThemeFontsArgs fonts) {
            return fonts(Output.of(fonts));
        }

        public Builder pageBackground(@Nullable Output<BrandingThemePageBackgroundArgs> pageBackground) {
            $.pageBackground = pageBackground;
            return this;
        }

        public Builder pageBackground(BrandingThemePageBackgroundArgs pageBackground) {
            return pageBackground(Output.of(pageBackground));
        }

        public Builder widget(@Nullable Output<BrandingThemeWidgetArgs> widget) {
            $.widget = widget;
            return this;
        }

        public Builder widget(BrandingThemeWidgetArgs widget) {
            return widget(Output.of(widget));
        }

        public BrandingThemeState build() {
            return $;
        }
    }

}
