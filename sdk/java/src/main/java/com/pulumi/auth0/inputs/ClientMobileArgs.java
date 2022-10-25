// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.auth0.inputs.ClientMobileAndroidArgs;
import com.pulumi.auth0.inputs.ClientMobileIosArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientMobileArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientMobileArgs Empty = new ClientMobileArgs();

    /**
     * List(Resource). Configuration settings for Android native apps. For details, see Android.
     * 
     */
    @Import(name="android")
    private @Nullable Output<ClientMobileAndroidArgs> android;

    /**
     * @return List(Resource). Configuration settings for Android native apps. For details, see Android.
     * 
     */
    public Optional<Output<ClientMobileAndroidArgs>> android() {
        return Optional.ofNullable(this.android);
    }

    /**
     * List(Resource). Configuration settings for i0S native apps. For details, see iOS.
     * 
     */
    @Import(name="ios")
    private @Nullable Output<ClientMobileIosArgs> ios;

    /**
     * @return List(Resource). Configuration settings for i0S native apps. For details, see iOS.
     * 
     */
    public Optional<Output<ClientMobileIosArgs>> ios() {
        return Optional.ofNullable(this.ios);
    }

    private ClientMobileArgs() {}

    private ClientMobileArgs(ClientMobileArgs $) {
        this.android = $.android;
        this.ios = $.ios;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientMobileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientMobileArgs $;

        public Builder() {
            $ = new ClientMobileArgs();
        }

        public Builder(ClientMobileArgs defaults) {
            $ = new ClientMobileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param android List(Resource). Configuration settings for Android native apps. For details, see Android.
         * 
         * @return builder
         * 
         */
        public Builder android(@Nullable Output<ClientMobileAndroidArgs> android) {
            $.android = android;
            return this;
        }

        /**
         * @param android List(Resource). Configuration settings for Android native apps. For details, see Android.
         * 
         * @return builder
         * 
         */
        public Builder android(ClientMobileAndroidArgs android) {
            return android(Output.of(android));
        }

        /**
         * @param ios List(Resource). Configuration settings for i0S native apps. For details, see iOS.
         * 
         * @return builder
         * 
         */
        public Builder ios(@Nullable Output<ClientMobileIosArgs> ios) {
            $.ios = ios;
            return this;
        }

        /**
         * @param ios List(Resource). Configuration settings for i0S native apps. For details, see iOS.
         * 
         * @return builder
         * 
         */
        public Builder ios(ClientMobileIosArgs ios) {
            return ios(Output.of(ios));
        }

        public ClientMobileArgs build() {
            return $;
        }
    }

}