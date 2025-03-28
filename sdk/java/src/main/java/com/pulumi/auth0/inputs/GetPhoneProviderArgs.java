// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetPhoneProviderArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPhoneProviderArgs Empty = new GetPhoneProviderArgs();

    /**
     * The ID of the Phone Provider.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The ID of the Phone Provider.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetPhoneProviderArgs() {}

    private GetPhoneProviderArgs(GetPhoneProviderArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPhoneProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPhoneProviderArgs $;

        public Builder() {
            $ = new GetPhoneProviderArgs();
        }

        public Builder(GetPhoneProviderArgs defaults) {
            $ = new GetPhoneProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Phone Provider.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the Phone Provider.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetPhoneProviderArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetPhoneProviderArgs", "id");
            }
            return $;
        }
    }

}
