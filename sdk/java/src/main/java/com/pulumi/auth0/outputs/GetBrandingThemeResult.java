// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GetBrandingThemeBorder;
import com.pulumi.auth0.outputs.GetBrandingThemeColor;
import com.pulumi.auth0.outputs.GetBrandingThemeFont;
import com.pulumi.auth0.outputs.GetBrandingThemePageBackground;
import com.pulumi.auth0.outputs.GetBrandingThemeWidget;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBrandingThemeResult {
    private List<GetBrandingThemeBorder> borders;
    private List<GetBrandingThemeColor> colors;
    /**
     * @return The display name for the branding theme.
     * 
     */
    private String displayName;
    private List<GetBrandingThemeFont> fonts;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<GetBrandingThemePageBackground> pageBackgrounds;
    private List<GetBrandingThemeWidget> widgets;

    private GetBrandingThemeResult() {}
    public List<GetBrandingThemeBorder> borders() {
        return this.borders;
    }
    public List<GetBrandingThemeColor> colors() {
        return this.colors;
    }
    /**
     * @return The display name for the branding theme.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    public List<GetBrandingThemeFont> fonts() {
        return this.fonts;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetBrandingThemePageBackground> pageBackgrounds() {
        return this.pageBackgrounds;
    }
    public List<GetBrandingThemeWidget> widgets() {
        return this.widgets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrandingThemeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetBrandingThemeBorder> borders;
        private List<GetBrandingThemeColor> colors;
        private String displayName;
        private List<GetBrandingThemeFont> fonts;
        private String id;
        private List<GetBrandingThemePageBackground> pageBackgrounds;
        private List<GetBrandingThemeWidget> widgets;
        public Builder() {}
        public Builder(GetBrandingThemeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.borders = defaults.borders;
    	      this.colors = defaults.colors;
    	      this.displayName = defaults.displayName;
    	      this.fonts = defaults.fonts;
    	      this.id = defaults.id;
    	      this.pageBackgrounds = defaults.pageBackgrounds;
    	      this.widgets = defaults.widgets;
        }

        @CustomType.Setter
        public Builder borders(List<GetBrandingThemeBorder> borders) {
            if (borders == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeResult", "borders");
            }
            this.borders = borders;
            return this;
        }
        public Builder borders(GetBrandingThemeBorder... borders) {
            return borders(List.of(borders));
        }
        @CustomType.Setter
        public Builder colors(List<GetBrandingThemeColor> colors) {
            if (colors == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeResult", "colors");
            }
            this.colors = colors;
            return this;
        }
        public Builder colors(GetBrandingThemeColor... colors) {
            return colors(List.of(colors));
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            if (displayName == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeResult", "displayName");
            }
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder fonts(List<GetBrandingThemeFont> fonts) {
            if (fonts == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeResult", "fonts");
            }
            this.fonts = fonts;
            return this;
        }
        public Builder fonts(GetBrandingThemeFont... fonts) {
            return fonts(List.of(fonts));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder pageBackgrounds(List<GetBrandingThemePageBackground> pageBackgrounds) {
            if (pageBackgrounds == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeResult", "pageBackgrounds");
            }
            this.pageBackgrounds = pageBackgrounds;
            return this;
        }
        public Builder pageBackgrounds(GetBrandingThemePageBackground... pageBackgrounds) {
            return pageBackgrounds(List.of(pageBackgrounds));
        }
        @CustomType.Setter
        public Builder widgets(List<GetBrandingThemeWidget> widgets) {
            if (widgets == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeResult", "widgets");
            }
            this.widgets = widgets;
            return this;
        }
        public Builder widgets(GetBrandingThemeWidget... widgets) {
            return widgets(List.of(widgets));
        }
        public GetBrandingThemeResult build() {
            final var _resultValue = new GetBrandingThemeResult();
            _resultValue.borders = borders;
            _resultValue.colors = colors;
            _resultValue.displayName = displayName;
            _resultValue.fonts = fonts;
            _resultValue.id = id;
            _resultValue.pageBackgrounds = pageBackgrounds;
            _resultValue.widgets = widgets;
            return _resultValue;
        }
    }
}
