// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GetFlowVaultConnectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFlowVaultConnectionPlainArgs Empty = new GetFlowVaultConnectionPlainArgs();

    /**
     * The id of the Flow Vault Connection.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The id of the Flow Vault Connection.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetFlowVaultConnectionPlainArgs() {}

    private GetFlowVaultConnectionPlainArgs(GetFlowVaultConnectionPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFlowVaultConnectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFlowVaultConnectionPlainArgs $;

        public Builder() {
            $ = new GetFlowVaultConnectionPlainArgs();
        }

        public Builder(GetFlowVaultConnectionPlainArgs defaults) {
            $ = new GetFlowVaultConnectionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The id of the Flow Vault Connection.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetFlowVaultConnectionPlainArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetFlowVaultConnectionPlainArgs", "id");
            }
            return $;
        }
    }

}
