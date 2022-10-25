// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BrandingThemePageBackground {
    /**
     * @return Background color.
     * 
     */
    private String backgroundColor;
    /**
     * @return Background image url.
     * 
     */
    private String backgroundImageUrl;
    /**
     * @return Page layout. Available options: `center`, `left`, `right`.
     * 
     */
    private String pageLayout;

    private BrandingThemePageBackground() {}
    /**
     * @return Background color.
     * 
     */
    public String backgroundColor() {
        return this.backgroundColor;
    }
    /**
     * @return Background image url.
     * 
     */
    public String backgroundImageUrl() {
        return this.backgroundImageUrl;
    }
    /**
     * @return Page layout. Available options: `center`, `left`, `right`.
     * 
     */
    public String pageLayout() {
        return this.pageLayout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrandingThemePageBackground defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String backgroundColor;
        private String backgroundImageUrl;
        private String pageLayout;
        public Builder() {}
        public Builder(BrandingThemePageBackground defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backgroundColor = defaults.backgroundColor;
    	      this.backgroundImageUrl = defaults.backgroundImageUrl;
    	      this.pageLayout = defaults.pageLayout;
        }

        @CustomType.Setter
        public Builder backgroundColor(String backgroundColor) {
            this.backgroundColor = Objects.requireNonNull(backgroundColor);
            return this;
        }
        @CustomType.Setter
        public Builder backgroundImageUrl(String backgroundImageUrl) {
            this.backgroundImageUrl = Objects.requireNonNull(backgroundImageUrl);
            return this;
        }
        @CustomType.Setter
        public Builder pageLayout(String pageLayout) {
            this.pageLayout = Objects.requireNonNull(pageLayout);
            return this;
        }
        public BrandingThemePageBackground build() {
            final var o = new BrandingThemePageBackground();
            o.backgroundColor = backgroundColor;
            o.backgroundImageUrl = backgroundImageUrl;
            o.pageLayout = pageLayout;
            return o;
        }
    }
}