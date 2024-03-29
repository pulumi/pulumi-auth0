// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBrandingThemeBorder {
    /**
     * @return Button border radius. Value needs to be between `1` and `10`. Defaults to `3.0`.
     * 
     */
    private Double buttonBorderRadius;
    /**
     * @return Button border weight. Value needs to be between `0` and `10`. Defaults to `1.0`.
     * 
     */
    private Double buttonBorderWeight;
    /**
     * @return Buttons style. Available options: `pill`, `rounded`, `sharp`. Defaults to `rounded`.
     * 
     */
    private String buttonsStyle;
    /**
     * @return Input border radius. Value needs to be between `0` and `10`. Defaults to `3.0`.
     * 
     */
    private Double inputBorderRadius;
    /**
     * @return Input border weight. Value needs to be between `0` and `3`. Defaults to `1.0`.
     * 
     */
    private Double inputBorderWeight;
    /**
     * @return Inputs style. Available options: `pill`, `rounded`, `sharp`. Defaults to `rounded`.
     * 
     */
    private String inputsStyle;
    /**
     * @return Show widget shadow. Defaults to `true`.
     * 
     */
    private Boolean showWidgetShadow;
    /**
     * @return Widget border weight. Value needs to be between `0` and `10`. Defaults to `0.0`.
     * 
     */
    private Double widgetBorderWeight;
    /**
     * @return Widget corner radius. Value needs to be between `0` and `50`. Defaults to `5.0`.
     * 
     */
    private Double widgetCornerRadius;

    private GetBrandingThemeBorder() {}
    /**
     * @return Button border radius. Value needs to be between `1` and `10`. Defaults to `3.0`.
     * 
     */
    public Double buttonBorderRadius() {
        return this.buttonBorderRadius;
    }
    /**
     * @return Button border weight. Value needs to be between `0` and `10`. Defaults to `1.0`.
     * 
     */
    public Double buttonBorderWeight() {
        return this.buttonBorderWeight;
    }
    /**
     * @return Buttons style. Available options: `pill`, `rounded`, `sharp`. Defaults to `rounded`.
     * 
     */
    public String buttonsStyle() {
        return this.buttonsStyle;
    }
    /**
     * @return Input border radius. Value needs to be between `0` and `10`. Defaults to `3.0`.
     * 
     */
    public Double inputBorderRadius() {
        return this.inputBorderRadius;
    }
    /**
     * @return Input border weight. Value needs to be between `0` and `3`. Defaults to `1.0`.
     * 
     */
    public Double inputBorderWeight() {
        return this.inputBorderWeight;
    }
    /**
     * @return Inputs style. Available options: `pill`, `rounded`, `sharp`. Defaults to `rounded`.
     * 
     */
    public String inputsStyle() {
        return this.inputsStyle;
    }
    /**
     * @return Show widget shadow. Defaults to `true`.
     * 
     */
    public Boolean showWidgetShadow() {
        return this.showWidgetShadow;
    }
    /**
     * @return Widget border weight. Value needs to be between `0` and `10`. Defaults to `0.0`.
     * 
     */
    public Double widgetBorderWeight() {
        return this.widgetBorderWeight;
    }
    /**
     * @return Widget corner radius. Value needs to be between `0` and `50`. Defaults to `5.0`.
     * 
     */
    public Double widgetCornerRadius() {
        return this.widgetCornerRadius;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrandingThemeBorder defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double buttonBorderRadius;
        private Double buttonBorderWeight;
        private String buttonsStyle;
        private Double inputBorderRadius;
        private Double inputBorderWeight;
        private String inputsStyle;
        private Boolean showWidgetShadow;
        private Double widgetBorderWeight;
        private Double widgetCornerRadius;
        public Builder() {}
        public Builder(GetBrandingThemeBorder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttonBorderRadius = defaults.buttonBorderRadius;
    	      this.buttonBorderWeight = defaults.buttonBorderWeight;
    	      this.buttonsStyle = defaults.buttonsStyle;
    	      this.inputBorderRadius = defaults.inputBorderRadius;
    	      this.inputBorderWeight = defaults.inputBorderWeight;
    	      this.inputsStyle = defaults.inputsStyle;
    	      this.showWidgetShadow = defaults.showWidgetShadow;
    	      this.widgetBorderWeight = defaults.widgetBorderWeight;
    	      this.widgetCornerRadius = defaults.widgetCornerRadius;
        }

        @CustomType.Setter
        public Builder buttonBorderRadius(Double buttonBorderRadius) {
            if (buttonBorderRadius == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeBorder", "buttonBorderRadius");
            }
            this.buttonBorderRadius = buttonBorderRadius;
            return this;
        }
        @CustomType.Setter
        public Builder buttonBorderWeight(Double buttonBorderWeight) {
            if (buttonBorderWeight == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeBorder", "buttonBorderWeight");
            }
            this.buttonBorderWeight = buttonBorderWeight;
            return this;
        }
        @CustomType.Setter
        public Builder buttonsStyle(String buttonsStyle) {
            if (buttonsStyle == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeBorder", "buttonsStyle");
            }
            this.buttonsStyle = buttonsStyle;
            return this;
        }
        @CustomType.Setter
        public Builder inputBorderRadius(Double inputBorderRadius) {
            if (inputBorderRadius == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeBorder", "inputBorderRadius");
            }
            this.inputBorderRadius = inputBorderRadius;
            return this;
        }
        @CustomType.Setter
        public Builder inputBorderWeight(Double inputBorderWeight) {
            if (inputBorderWeight == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeBorder", "inputBorderWeight");
            }
            this.inputBorderWeight = inputBorderWeight;
            return this;
        }
        @CustomType.Setter
        public Builder inputsStyle(String inputsStyle) {
            if (inputsStyle == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeBorder", "inputsStyle");
            }
            this.inputsStyle = inputsStyle;
            return this;
        }
        @CustomType.Setter
        public Builder showWidgetShadow(Boolean showWidgetShadow) {
            if (showWidgetShadow == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeBorder", "showWidgetShadow");
            }
            this.showWidgetShadow = showWidgetShadow;
            return this;
        }
        @CustomType.Setter
        public Builder widgetBorderWeight(Double widgetBorderWeight) {
            if (widgetBorderWeight == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeBorder", "widgetBorderWeight");
            }
            this.widgetBorderWeight = widgetBorderWeight;
            return this;
        }
        @CustomType.Setter
        public Builder widgetCornerRadius(Double widgetCornerRadius) {
            if (widgetCornerRadius == null) {
              throw new MissingRequiredPropertyException("GetBrandingThemeBorder", "widgetCornerRadius");
            }
            this.widgetCornerRadius = widgetCornerRadius;
            return this;
        }
        public GetBrandingThemeBorder build() {
            final var _resultValue = new GetBrandingThemeBorder();
            _resultValue.buttonBorderRadius = buttonBorderRadius;
            _resultValue.buttonBorderWeight = buttonBorderWeight;
            _resultValue.buttonsStyle = buttonsStyle;
            _resultValue.inputBorderRadius = inputBorderRadius;
            _resultValue.inputBorderWeight = inputBorderWeight;
            _resultValue.inputsStyle = inputsStyle;
            _resultValue.showWidgetShadow = showWidgetShadow;
            _resultValue.widgetBorderWeight = widgetBorderWeight;
            _resultValue.widgetCornerRadius = widgetCornerRadius;
            return _resultValue;
        }
    }
}
