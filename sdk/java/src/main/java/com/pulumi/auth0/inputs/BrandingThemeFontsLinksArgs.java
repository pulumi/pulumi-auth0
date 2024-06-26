// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BrandingThemeFontsLinksArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrandingThemeFontsLinksArgs Empty = new BrandingThemeFontsLinksArgs();

    /**
     * Links bold. Defaults to `true`.
     * 
     */
    @Import(name="bold")
    private @Nullable Output<Boolean> bold;

    /**
     * @return Links bold. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> bold() {
        return Optional.ofNullable(this.bold);
    }

    /**
     * Links size. Value needs to be between `0` and `150`. Defaults to `87.5`.
     * 
     */
    @Import(name="size")
    private @Nullable Output<Double> size;

    /**
     * @return Links size. Value needs to be between `0` and `150`. Defaults to `87.5`.
     * 
     */
    public Optional<Output<Double>> size() {
        return Optional.ofNullable(this.size);
    }

    private BrandingThemeFontsLinksArgs() {}

    private BrandingThemeFontsLinksArgs(BrandingThemeFontsLinksArgs $) {
        this.bold = $.bold;
        this.size = $.size;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrandingThemeFontsLinksArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrandingThemeFontsLinksArgs $;

        public Builder() {
            $ = new BrandingThemeFontsLinksArgs();
        }

        public Builder(BrandingThemeFontsLinksArgs defaults) {
            $ = new BrandingThemeFontsLinksArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bold Links bold. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder bold(@Nullable Output<Boolean> bold) {
            $.bold = bold;
            return this;
        }

        /**
         * @param bold Links bold. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder bold(Boolean bold) {
            return bold(Output.of(bold));
        }

        /**
         * @param size Links size. Value needs to be between `0` and `150`. Defaults to `87.5`.
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Double> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size Links size. Value needs to be between `0` and `150`. Defaults to `87.5`.
         * 
         * @return builder
         * 
         */
        public Builder size(Double size) {
            return size(Output.of(size));
        }

        public BrandingThemeFontsLinksArgs build() {
            return $;
        }
    }

}
