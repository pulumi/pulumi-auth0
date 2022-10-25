// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.BrandingThemeFontsBodyText;
import com.pulumi.auth0.outputs.BrandingThemeFontsButtonsText;
import com.pulumi.auth0.outputs.BrandingThemeFontsInputLabels;
import com.pulumi.auth0.outputs.BrandingThemeFontsLinks;
import com.pulumi.auth0.outputs.BrandingThemeFontsSubtitle;
import com.pulumi.auth0.outputs.BrandingThemeFontsTitle;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BrandingThemeFonts {
    /**
     * @return Body text.
     * 
     */
    private BrandingThemeFontsBodyText bodyText;
    /**
     * @return Buttons text.
     * 
     */
    private BrandingThemeFontsButtonsText buttonsText;
    /**
     * @return Font URL.
     * 
     */
    private String fontUrl;
    /**
     * @return Input labels.
     * 
     */
    private BrandingThemeFontsInputLabels inputLabels;
    /**
     * @return Links.
     * 
     */
    private BrandingThemeFontsLinks links;
    /**
     * @return Links style.
     * 
     */
    private String linksStyle;
    /**
     * @return Reference text size. Value needs to be between `12` and `24`.
     * 
     */
    private Double referenceTextSize;
    /**
     * @return Subtitle.
     * 
     */
    private BrandingThemeFontsSubtitle subtitle;
    /**
     * @return Title.
     * 
     */
    private BrandingThemeFontsTitle title;

    private BrandingThemeFonts() {}
    /**
     * @return Body text.
     * 
     */
    public BrandingThemeFontsBodyText bodyText() {
        return this.bodyText;
    }
    /**
     * @return Buttons text.
     * 
     */
    public BrandingThemeFontsButtonsText buttonsText() {
        return this.buttonsText;
    }
    /**
     * @return Font URL.
     * 
     */
    public String fontUrl() {
        return this.fontUrl;
    }
    /**
     * @return Input labels.
     * 
     */
    public BrandingThemeFontsInputLabels inputLabels() {
        return this.inputLabels;
    }
    /**
     * @return Links.
     * 
     */
    public BrandingThemeFontsLinks links() {
        return this.links;
    }
    /**
     * @return Links style.
     * 
     */
    public String linksStyle() {
        return this.linksStyle;
    }
    /**
     * @return Reference text size. Value needs to be between `12` and `24`.
     * 
     */
    public Double referenceTextSize() {
        return this.referenceTextSize;
    }
    /**
     * @return Subtitle.
     * 
     */
    public BrandingThemeFontsSubtitle subtitle() {
        return this.subtitle;
    }
    /**
     * @return Title.
     * 
     */
    public BrandingThemeFontsTitle title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrandingThemeFonts defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private BrandingThemeFontsBodyText bodyText;
        private BrandingThemeFontsButtonsText buttonsText;
        private String fontUrl;
        private BrandingThemeFontsInputLabels inputLabels;
        private BrandingThemeFontsLinks links;
        private String linksStyle;
        private Double referenceTextSize;
        private BrandingThemeFontsSubtitle subtitle;
        private BrandingThemeFontsTitle title;
        public Builder() {}
        public Builder(BrandingThemeFonts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bodyText = defaults.bodyText;
    	      this.buttonsText = defaults.buttonsText;
    	      this.fontUrl = defaults.fontUrl;
    	      this.inputLabels = defaults.inputLabels;
    	      this.links = defaults.links;
    	      this.linksStyle = defaults.linksStyle;
    	      this.referenceTextSize = defaults.referenceTextSize;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        @CustomType.Setter
        public Builder bodyText(BrandingThemeFontsBodyText bodyText) {
            this.bodyText = Objects.requireNonNull(bodyText);
            return this;
        }
        @CustomType.Setter
        public Builder buttonsText(BrandingThemeFontsButtonsText buttonsText) {
            this.buttonsText = Objects.requireNonNull(buttonsText);
            return this;
        }
        @CustomType.Setter
        public Builder fontUrl(String fontUrl) {
            this.fontUrl = Objects.requireNonNull(fontUrl);
            return this;
        }
        @CustomType.Setter
        public Builder inputLabels(BrandingThemeFontsInputLabels inputLabels) {
            this.inputLabels = Objects.requireNonNull(inputLabels);
            return this;
        }
        @CustomType.Setter
        public Builder links(BrandingThemeFontsLinks links) {
            this.links = Objects.requireNonNull(links);
            return this;
        }
        @CustomType.Setter
        public Builder linksStyle(String linksStyle) {
            this.linksStyle = Objects.requireNonNull(linksStyle);
            return this;
        }
        @CustomType.Setter
        public Builder referenceTextSize(Double referenceTextSize) {
            this.referenceTextSize = Objects.requireNonNull(referenceTextSize);
            return this;
        }
        @CustomType.Setter
        public Builder subtitle(BrandingThemeFontsSubtitle subtitle) {
            this.subtitle = Objects.requireNonNull(subtitle);
            return this;
        }
        @CustomType.Setter
        public Builder title(BrandingThemeFontsTitle title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public BrandingThemeFonts build() {
            final var o = new BrandingThemeFonts();
            o.bodyText = bodyText;
            o.buttonsText = buttonsText;
            o.fontUrl = fontUrl;
            o.inputLabels = inputLabels;
            o.links = links;
            o.linksStyle = linksStyle;
            o.referenceTextSize = referenceTextSize;
            o.subtitle = subtitle;
            o.title = title;
            return o;
        }
    }
}