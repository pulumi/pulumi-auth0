// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GuardianPushAmazonSnsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuardianPushAmazonSnsArgs Empty = new GuardianPushAmazonSnsArgs();

    /**
     * Your AWS Access Key ID.
     * 
     */
    @Import(name="awsAccessKeyId", required=true)
    private Output<String> awsAccessKeyId;

    /**
     * @return Your AWS Access Key ID.
     * 
     */
    public Output<String> awsAccessKeyId() {
        return this.awsAccessKeyId;
    }

    /**
     * Your AWS application&#39;s region.
     * 
     */
    @Import(name="awsRegion", required=true)
    private Output<String> awsRegion;

    /**
     * @return Your AWS application&#39;s region.
     * 
     */
    public Output<String> awsRegion() {
        return this.awsRegion;
    }

    /**
     * Your AWS Secret Access Key.
     * 
     */
    @Import(name="awsSecretAccessKey", required=true)
    private Output<String> awsSecretAccessKey;

    /**
     * @return Your AWS Secret Access Key.
     * 
     */
    public Output<String> awsSecretAccessKey() {
        return this.awsSecretAccessKey;
    }

    /**
     * The Amazon Resource Name for your Apple Push Notification Service.
     * 
     */
    @Import(name="snsApnsPlatformApplicationArn", required=true)
    private Output<String> snsApnsPlatformApplicationArn;

    /**
     * @return The Amazon Resource Name for your Apple Push Notification Service.
     * 
     */
    public Output<String> snsApnsPlatformApplicationArn() {
        return this.snsApnsPlatformApplicationArn;
    }

    /**
     * The Amazon Resource Name for your Firebase Cloud Messaging Service.
     * 
     */
    @Import(name="snsGcmPlatformApplicationArn", required=true)
    private Output<String> snsGcmPlatformApplicationArn;

    /**
     * @return The Amazon Resource Name for your Firebase Cloud Messaging Service.
     * 
     */
    public Output<String> snsGcmPlatformApplicationArn() {
        return this.snsGcmPlatformApplicationArn;
    }

    private GuardianPushAmazonSnsArgs() {}

    private GuardianPushAmazonSnsArgs(GuardianPushAmazonSnsArgs $) {
        this.awsAccessKeyId = $.awsAccessKeyId;
        this.awsRegion = $.awsRegion;
        this.awsSecretAccessKey = $.awsSecretAccessKey;
        this.snsApnsPlatformApplicationArn = $.snsApnsPlatformApplicationArn;
        this.snsGcmPlatformApplicationArn = $.snsGcmPlatformApplicationArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuardianPushAmazonSnsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuardianPushAmazonSnsArgs $;

        public Builder() {
            $ = new GuardianPushAmazonSnsArgs();
        }

        public Builder(GuardianPushAmazonSnsArgs defaults) {
            $ = new GuardianPushAmazonSnsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsAccessKeyId Your AWS Access Key ID.
         * 
         * @return builder
         * 
         */
        public Builder awsAccessKeyId(Output<String> awsAccessKeyId) {
            $.awsAccessKeyId = awsAccessKeyId;
            return this;
        }

        /**
         * @param awsAccessKeyId Your AWS Access Key ID.
         * 
         * @return builder
         * 
         */
        public Builder awsAccessKeyId(String awsAccessKeyId) {
            return awsAccessKeyId(Output.of(awsAccessKeyId));
        }

        /**
         * @param awsRegion Your AWS application&#39;s region.
         * 
         * @return builder
         * 
         */
        public Builder awsRegion(Output<String> awsRegion) {
            $.awsRegion = awsRegion;
            return this;
        }

        /**
         * @param awsRegion Your AWS application&#39;s region.
         * 
         * @return builder
         * 
         */
        public Builder awsRegion(String awsRegion) {
            return awsRegion(Output.of(awsRegion));
        }

        /**
         * @param awsSecretAccessKey Your AWS Secret Access Key.
         * 
         * @return builder
         * 
         */
        public Builder awsSecretAccessKey(Output<String> awsSecretAccessKey) {
            $.awsSecretAccessKey = awsSecretAccessKey;
            return this;
        }

        /**
         * @param awsSecretAccessKey Your AWS Secret Access Key.
         * 
         * @return builder
         * 
         */
        public Builder awsSecretAccessKey(String awsSecretAccessKey) {
            return awsSecretAccessKey(Output.of(awsSecretAccessKey));
        }

        /**
         * @param snsApnsPlatformApplicationArn The Amazon Resource Name for your Apple Push Notification Service.
         * 
         * @return builder
         * 
         */
        public Builder snsApnsPlatformApplicationArn(Output<String> snsApnsPlatformApplicationArn) {
            $.snsApnsPlatformApplicationArn = snsApnsPlatformApplicationArn;
            return this;
        }

        /**
         * @param snsApnsPlatformApplicationArn The Amazon Resource Name for your Apple Push Notification Service.
         * 
         * @return builder
         * 
         */
        public Builder snsApnsPlatformApplicationArn(String snsApnsPlatformApplicationArn) {
            return snsApnsPlatformApplicationArn(Output.of(snsApnsPlatformApplicationArn));
        }

        /**
         * @param snsGcmPlatformApplicationArn The Amazon Resource Name for your Firebase Cloud Messaging Service.
         * 
         * @return builder
         * 
         */
        public Builder snsGcmPlatformApplicationArn(Output<String> snsGcmPlatformApplicationArn) {
            $.snsGcmPlatformApplicationArn = snsGcmPlatformApplicationArn;
            return this;
        }

        /**
         * @param snsGcmPlatformApplicationArn The Amazon Resource Name for your Firebase Cloud Messaging Service.
         * 
         * @return builder
         * 
         */
        public Builder snsGcmPlatformApplicationArn(String snsGcmPlatformApplicationArn) {
            return snsGcmPlatformApplicationArn(Output.of(snsGcmPlatformApplicationArn));
        }

        public GuardianPushAmazonSnsArgs build() {
            if ($.awsAccessKeyId == null) {
                throw new MissingRequiredPropertyException("GuardianPushAmazonSnsArgs", "awsAccessKeyId");
            }
            if ($.awsRegion == null) {
                throw new MissingRequiredPropertyException("GuardianPushAmazonSnsArgs", "awsRegion");
            }
            if ($.awsSecretAccessKey == null) {
                throw new MissingRequiredPropertyException("GuardianPushAmazonSnsArgs", "awsSecretAccessKey");
            }
            if ($.snsApnsPlatformApplicationArn == null) {
                throw new MissingRequiredPropertyException("GuardianPushAmazonSnsArgs", "snsApnsPlatformApplicationArn");
            }
            if ($.snsGcmPlatformApplicationArn == null) {
                throw new MissingRequiredPropertyException("GuardianPushAmazonSnsArgs", "snsGcmPlatformApplicationArn");
            }
            return $;
        }
    }

}
