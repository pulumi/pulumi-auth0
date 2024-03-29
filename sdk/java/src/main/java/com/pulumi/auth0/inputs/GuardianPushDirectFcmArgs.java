// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GuardianPushDirectFcmArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuardianPushDirectFcmArgs Empty = new GuardianPushDirectFcmArgs();

    /**
     * The Firebase Cloud Messaging Server Key. For security purposes, we don’t retrieve your existing FCM server key to check for drift.
     * 
     */
    @Import(name="serverKey", required=true)
    private Output<String> serverKey;

    /**
     * @return The Firebase Cloud Messaging Server Key. For security purposes, we don’t retrieve your existing FCM server key to check for drift.
     * 
     */
    public Output<String> serverKey() {
        return this.serverKey;
    }

    private GuardianPushDirectFcmArgs() {}

    private GuardianPushDirectFcmArgs(GuardianPushDirectFcmArgs $) {
        this.serverKey = $.serverKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuardianPushDirectFcmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuardianPushDirectFcmArgs $;

        public Builder() {
            $ = new GuardianPushDirectFcmArgs();
        }

        public Builder(GuardianPushDirectFcmArgs defaults) {
            $ = new GuardianPushDirectFcmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serverKey The Firebase Cloud Messaging Server Key. For security purposes, we don’t retrieve your existing FCM server key to check for drift.
         * 
         * @return builder
         * 
         */
        public Builder serverKey(Output<String> serverKey) {
            $.serverKey = serverKey;
            return this;
        }

        /**
         * @param serverKey The Firebase Cloud Messaging Server Key. For security purposes, we don’t retrieve your existing FCM server key to check for drift.
         * 
         * @return builder
         * 
         */
        public Builder serverKey(String serverKey) {
            return serverKey(Output.of(serverKey));
        }

        public GuardianPushDirectFcmArgs build() {
            if ($.serverKey == null) {
                throw new MissingRequiredPropertyException("GuardianPushDirectFcmArgs", "serverKey");
            }
            return $;
        }
    }

}
