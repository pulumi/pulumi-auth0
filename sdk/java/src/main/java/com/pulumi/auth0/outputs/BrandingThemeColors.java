// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BrandingThemeColors {
    /**
     * @return Base focus color. Defaults to `#635dff`.
     * 
     */
    private @Nullable String baseFocusColor;
    /**
     * @return Base hover color. Defaults to `#000000`.
     * 
     */
    private @Nullable String baseHoverColor;
    /**
     * @return Body text. Defaults to `#1e212a`.
     * 
     */
    private @Nullable String bodyText;
    /**
     * @return Error. Defaults to `#d03c38`.
     * 
     */
    private @Nullable String error;
    /**
     * @return Header. Defaults to `#1e212a`.
     * 
     */
    private @Nullable String header;
    /**
     * @return Icons. Defaults to `#65676e`.
     * 
     */
    private @Nullable String icons;
    /**
     * @return Input background. Defaults to `#ffffff`.
     * 
     */
    private @Nullable String inputBackground;
    /**
     * @return Input border. Defaults to `#c9cace`.
     * 
     */
    private @Nullable String inputBorder;
    /**
     * @return Input filled text. Defaults to `#000000`.
     * 
     */
    private @Nullable String inputFilledText;
    /**
     * @return Input labels &amp; placeholders. Defaults to `#65676e`.
     * 
     */
    private @Nullable String inputLabelsPlaceholders;
    /**
     * @return Links &amp; focused components. Defaults to `#635dff`.
     * 
     */
    private @Nullable String linksFocusedComponents;
    /**
     * @return Primary button. Defaults to `#635dff`.
     * 
     */
    private @Nullable String primaryButton;
    /**
     * @return Primary button label. Defaults to `#ffffff`.
     * 
     */
    private @Nullable String primaryButtonLabel;
    /**
     * @return Secondary button border. Defaults to `#c9cace`.
     * 
     */
    private @Nullable String secondaryButtonBorder;
    /**
     * @return Secondary button label. Defaults to `#1e212a`.
     * 
     */
    private @Nullable String secondaryButtonLabel;
    /**
     * @return Success. Defaults to `#13a688`.
     * 
     */
    private @Nullable String success;
    /**
     * @return Widget background. Defaults to `#ffffff`.
     * 
     */
    private @Nullable String widgetBackground;
    /**
     * @return Widget border. Defaults to `#c9cace`.
     * 
     */
    private @Nullable String widgetBorder;

    private BrandingThemeColors() {}
    /**
     * @return Base focus color. Defaults to `#635dff`.
     * 
     */
    public Optional<String> baseFocusColor() {
        return Optional.ofNullable(this.baseFocusColor);
    }
    /**
     * @return Base hover color. Defaults to `#000000`.
     * 
     */
    public Optional<String> baseHoverColor() {
        return Optional.ofNullable(this.baseHoverColor);
    }
    /**
     * @return Body text. Defaults to `#1e212a`.
     * 
     */
    public Optional<String> bodyText() {
        return Optional.ofNullable(this.bodyText);
    }
    /**
     * @return Error. Defaults to `#d03c38`.
     * 
     */
    public Optional<String> error() {
        return Optional.ofNullable(this.error);
    }
    /**
     * @return Header. Defaults to `#1e212a`.
     * 
     */
    public Optional<String> header() {
        return Optional.ofNullable(this.header);
    }
    /**
     * @return Icons. Defaults to `#65676e`.
     * 
     */
    public Optional<String> icons() {
        return Optional.ofNullable(this.icons);
    }
    /**
     * @return Input background. Defaults to `#ffffff`.
     * 
     */
    public Optional<String> inputBackground() {
        return Optional.ofNullable(this.inputBackground);
    }
    /**
     * @return Input border. Defaults to `#c9cace`.
     * 
     */
    public Optional<String> inputBorder() {
        return Optional.ofNullable(this.inputBorder);
    }
    /**
     * @return Input filled text. Defaults to `#000000`.
     * 
     */
    public Optional<String> inputFilledText() {
        return Optional.ofNullable(this.inputFilledText);
    }
    /**
     * @return Input labels &amp; placeholders. Defaults to `#65676e`.
     * 
     */
    public Optional<String> inputLabelsPlaceholders() {
        return Optional.ofNullable(this.inputLabelsPlaceholders);
    }
    /**
     * @return Links &amp; focused components. Defaults to `#635dff`.
     * 
     */
    public Optional<String> linksFocusedComponents() {
        return Optional.ofNullable(this.linksFocusedComponents);
    }
    /**
     * @return Primary button. Defaults to `#635dff`.
     * 
     */
    public Optional<String> primaryButton() {
        return Optional.ofNullable(this.primaryButton);
    }
    /**
     * @return Primary button label. Defaults to `#ffffff`.
     * 
     */
    public Optional<String> primaryButtonLabel() {
        return Optional.ofNullable(this.primaryButtonLabel);
    }
    /**
     * @return Secondary button border. Defaults to `#c9cace`.
     * 
     */
    public Optional<String> secondaryButtonBorder() {
        return Optional.ofNullable(this.secondaryButtonBorder);
    }
    /**
     * @return Secondary button label. Defaults to `#1e212a`.
     * 
     */
    public Optional<String> secondaryButtonLabel() {
        return Optional.ofNullable(this.secondaryButtonLabel);
    }
    /**
     * @return Success. Defaults to `#13a688`.
     * 
     */
    public Optional<String> success() {
        return Optional.ofNullable(this.success);
    }
    /**
     * @return Widget background. Defaults to `#ffffff`.
     * 
     */
    public Optional<String> widgetBackground() {
        return Optional.ofNullable(this.widgetBackground);
    }
    /**
     * @return Widget border. Defaults to `#c9cace`.
     * 
     */
    public Optional<String> widgetBorder() {
        return Optional.ofNullable(this.widgetBorder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrandingThemeColors defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String baseFocusColor;
        private @Nullable String baseHoverColor;
        private @Nullable String bodyText;
        private @Nullable String error;
        private @Nullable String header;
        private @Nullable String icons;
        private @Nullable String inputBackground;
        private @Nullable String inputBorder;
        private @Nullable String inputFilledText;
        private @Nullable String inputLabelsPlaceholders;
        private @Nullable String linksFocusedComponents;
        private @Nullable String primaryButton;
        private @Nullable String primaryButtonLabel;
        private @Nullable String secondaryButtonBorder;
        private @Nullable String secondaryButtonLabel;
        private @Nullable String success;
        private @Nullable String widgetBackground;
        private @Nullable String widgetBorder;
        public Builder() {}
        public Builder(BrandingThemeColors defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseFocusColor = defaults.baseFocusColor;
    	      this.baseHoverColor = defaults.baseHoverColor;
    	      this.bodyText = defaults.bodyText;
    	      this.error = defaults.error;
    	      this.header = defaults.header;
    	      this.icons = defaults.icons;
    	      this.inputBackground = defaults.inputBackground;
    	      this.inputBorder = defaults.inputBorder;
    	      this.inputFilledText = defaults.inputFilledText;
    	      this.inputLabelsPlaceholders = defaults.inputLabelsPlaceholders;
    	      this.linksFocusedComponents = defaults.linksFocusedComponents;
    	      this.primaryButton = defaults.primaryButton;
    	      this.primaryButtonLabel = defaults.primaryButtonLabel;
    	      this.secondaryButtonBorder = defaults.secondaryButtonBorder;
    	      this.secondaryButtonLabel = defaults.secondaryButtonLabel;
    	      this.success = defaults.success;
    	      this.widgetBackground = defaults.widgetBackground;
    	      this.widgetBorder = defaults.widgetBorder;
        }

        @CustomType.Setter
        public Builder baseFocusColor(@Nullable String baseFocusColor) {

            this.baseFocusColor = baseFocusColor;
            return this;
        }
        @CustomType.Setter
        public Builder baseHoverColor(@Nullable String baseHoverColor) {

            this.baseHoverColor = baseHoverColor;
            return this;
        }
        @CustomType.Setter
        public Builder bodyText(@Nullable String bodyText) {

            this.bodyText = bodyText;
            return this;
        }
        @CustomType.Setter
        public Builder error(@Nullable String error) {

            this.error = error;
            return this;
        }
        @CustomType.Setter
        public Builder header(@Nullable String header) {

            this.header = header;
            return this;
        }
        @CustomType.Setter
        public Builder icons(@Nullable String icons) {

            this.icons = icons;
            return this;
        }
        @CustomType.Setter
        public Builder inputBackground(@Nullable String inputBackground) {

            this.inputBackground = inputBackground;
            return this;
        }
        @CustomType.Setter
        public Builder inputBorder(@Nullable String inputBorder) {

            this.inputBorder = inputBorder;
            return this;
        }
        @CustomType.Setter
        public Builder inputFilledText(@Nullable String inputFilledText) {

            this.inputFilledText = inputFilledText;
            return this;
        }
        @CustomType.Setter
        public Builder inputLabelsPlaceholders(@Nullable String inputLabelsPlaceholders) {

            this.inputLabelsPlaceholders = inputLabelsPlaceholders;
            return this;
        }
        @CustomType.Setter
        public Builder linksFocusedComponents(@Nullable String linksFocusedComponents) {

            this.linksFocusedComponents = linksFocusedComponents;
            return this;
        }
        @CustomType.Setter
        public Builder primaryButton(@Nullable String primaryButton) {

            this.primaryButton = primaryButton;
            return this;
        }
        @CustomType.Setter
        public Builder primaryButtonLabel(@Nullable String primaryButtonLabel) {

            this.primaryButtonLabel = primaryButtonLabel;
            return this;
        }
        @CustomType.Setter
        public Builder secondaryButtonBorder(@Nullable String secondaryButtonBorder) {

            this.secondaryButtonBorder = secondaryButtonBorder;
            return this;
        }
        @CustomType.Setter
        public Builder secondaryButtonLabel(@Nullable String secondaryButtonLabel) {

            this.secondaryButtonLabel = secondaryButtonLabel;
            return this;
        }
        @CustomType.Setter
        public Builder success(@Nullable String success) {

            this.success = success;
            return this;
        }
        @CustomType.Setter
        public Builder widgetBackground(@Nullable String widgetBackground) {

            this.widgetBackground = widgetBackground;
            return this;
        }
        @CustomType.Setter
        public Builder widgetBorder(@Nullable String widgetBorder) {

            this.widgetBorder = widgetBorder;
            return this;
        }
        public BrandingThemeColors build() {
            final var _resultValue = new BrandingThemeColors();
            _resultValue.baseFocusColor = baseFocusColor;
            _resultValue.baseHoverColor = baseHoverColor;
            _resultValue.bodyText = bodyText;
            _resultValue.error = error;
            _resultValue.header = header;
            _resultValue.icons = icons;
            _resultValue.inputBackground = inputBackground;
            _resultValue.inputBorder = inputBorder;
            _resultValue.inputFilledText = inputFilledText;
            _resultValue.inputLabelsPlaceholders = inputLabelsPlaceholders;
            _resultValue.linksFocusedComponents = linksFocusedComponents;
            _resultValue.primaryButton = primaryButton;
            _resultValue.primaryButtonLabel = primaryButtonLabel;
            _resultValue.secondaryButtonBorder = secondaryButtonBorder;
            _resultValue.secondaryButtonLabel = secondaryButtonLabel;
            _resultValue.success = success;
            _resultValue.widgetBackground = widgetBackground;
            _resultValue.widgetBorder = widgetBorder;
            return _resultValue;
        }
    }
}
