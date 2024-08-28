// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetSelfServiceProfilePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSelfServiceProfilePlainArgs Empty = new GetSelfServiceProfilePlainArgs();

    /**
     * The id of the Self Service Profile
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The id of the Self Service Profile
     * 
     */
    public String id() {
        return this.id;
    }

    private GetSelfServiceProfilePlainArgs() {}

    private GetSelfServiceProfilePlainArgs(GetSelfServiceProfilePlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSelfServiceProfilePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSelfServiceProfilePlainArgs $;

        public Builder() {
            $ = new GetSelfServiceProfilePlainArgs();
        }

        public Builder(GetSelfServiceProfilePlainArgs defaults) {
            $ = new GetSelfServiceProfilePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The id of the Self Service Profile
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetSelfServiceProfilePlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetSelfServiceProfilePlainArgs", "id");
            }
            return $;
        }
    }

}
