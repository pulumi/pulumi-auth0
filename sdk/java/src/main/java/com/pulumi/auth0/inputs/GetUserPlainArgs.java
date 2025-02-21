// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUserPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserPlainArgs Empty = new GetUserPlainArgs();

    /**
     * Lucene Query for retrieving a user.
     * 
     */
    @Import(name="query")
    private @Nullable String query;

    /**
     * @return Lucene Query for retrieving a user.
     * 
     */
    public Optional<String> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * ID of the user.
     * 
     */
    @Import(name="userId")
    private @Nullable String userId;

    /**
     * @return ID of the user.
     * 
     */
    public Optional<String> userId() {
        return Optional.ofNullable(this.userId);
    }

    private GetUserPlainArgs() {}

    private GetUserPlainArgs(GetUserPlainArgs $) {
        this.query = $.query;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserPlainArgs $;

        public Builder() {
            $ = new GetUserPlainArgs();
        }

        public Builder(GetUserPlainArgs defaults) {
            $ = new GetUserPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param query Lucene Query for retrieving a user.
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable String query) {
            $.query = query;
            return this;
        }

        /**
         * @param userId ID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable String userId) {
            $.userId = userId;
            return this;
        }

        public GetUserPlainArgs build() {
            return $;
        }
    }

}
