// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBrandingThemeWidget {
    /**
     * @return Header text alignment. Available options: `center`, `left`, `right`. Defaults to `center`.
     * 
     */
    private String headerTextAlignment;
    /**
     * @return Logo height. Value needs to be between `1` and `100`. Defaults to `52.0`.
     * 
     */
    private Double logoHeight;
    /**
     * @return Logo position. Available options: `center`, `left`, `right`, `none`. Defaults to `center`.
     * 
     */
    private String logoPosition;
    /**
     * @return Logo url. Defaults to an empty string.
     * 
     */
    private String logoUrl;
    /**
     * @return Social buttons layout. Available options: `bottom`, `top`. Defaults to `bottom`.
     * 
     */
    private String socialButtonsLayout;

    private GetBrandingThemeWidget() {}
    /**
     * @return Header text alignment. Available options: `center`, `left`, `right`. Defaults to `center`.
     * 
     */
    public String headerTextAlignment() {
        return this.headerTextAlignment;
    }
    /**
     * @return Logo height. Value needs to be between `1` and `100`. Defaults to `52.0`.
     * 
     */
    public Double logoHeight() {
        return this.logoHeight;
    }
    /**
     * @return Logo position. Available options: `center`, `left`, `right`, `none`. Defaults to `center`.
     * 
     */
    public String logoPosition() {
        return this.logoPosition;
    }
    /**
     * @return Logo url. Defaults to an empty string.
     * 
     */
    public String logoUrl() {
        return this.logoUrl;
    }
    /**
     * @return Social buttons layout. Available options: `bottom`, `top`. Defaults to `bottom`.
     * 
     */
    public String socialButtonsLayout() {
        return this.socialButtonsLayout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrandingThemeWidget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String headerTextAlignment;
        private Double logoHeight;
        private String logoPosition;
        private String logoUrl;
        private String socialButtonsLayout;
        public Builder() {}
        public Builder(GetBrandingThemeWidget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerTextAlignment = defaults.headerTextAlignment;
    	      this.logoHeight = defaults.logoHeight;
    	      this.logoPosition = defaults.logoPosition;
    	      this.logoUrl = defaults.logoUrl;
    	      this.socialButtonsLayout = defaults.socialButtonsLayout;
        }

        @CustomType.Setter
        public Builder headerTextAlignment(String headerTextAlignment) {
            if (headerTextAlignment == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeWidget", "headerTextAlignment");
            }
            this.headerTextAlignment = headerTextAlignment;
            return this;
        }
        @CustomType.Setter
        public Builder logoHeight(Double logoHeight) {
            if (logoHeight == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeWidget", "logoHeight");
            }
            this.logoHeight = logoHeight;
            return this;
        }
        @CustomType.Setter
        public Builder logoPosition(String logoPosition) {
            if (logoPosition == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeWidget", "logoPosition");
            }
            this.logoPosition = logoPosition;
            return this;
        }
        @CustomType.Setter
        public Builder logoUrl(String logoUrl) {
            if (logoUrl == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeWidget", "logoUrl");
            }
            this.logoUrl = logoUrl;
            return this;
        }
        @CustomType.Setter
        public Builder socialButtonsLayout(String socialButtonsLayout) {
            if (socialButtonsLayout == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeWidget", "socialButtonsLayout");
            }
            this.socialButtonsLayout = socialButtonsLayout;
            return this;
        }
        public GetBrandingThemeWidget build() {
            final var _resultValue = new GetBrandingThemeWidget();
            _resultValue.headerTextAlignment = headerTextAlignment;
            _resultValue.logoHeight = logoHeight;
            _resultValue.logoPosition = logoPosition;
            _resultValue.logoUrl = logoUrl;
            _resultValue.socialButtonsLayout = socialButtonsLayout;
            return _resultValue;
        }
    }
}
