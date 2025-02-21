// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUserArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUserArgs Empty = new GetUserArgs();

    /**
     * Lucene Query for retrieving a user.
     * 
     */
    @Import(name="query")
    private @Nullable Output<String> query;

    /**
     * @return Lucene Query for retrieving a user.
     * 
     */
    public Optional<Output<String>> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * ID of the user.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return ID of the user.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private GetUserArgs() {}

    private GetUserArgs(GetUserArgs $) {
        this.query = $.query;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserArgs $;

        public Builder() {
            $ = new GetUserArgs();
        }

        public Builder(GetUserArgs defaults) {
            $ = new GetUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param query Lucene Query for retrieving a user.
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query Lucene Query for retrieving a user.
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param userId ID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId ID of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public GetUserArgs build() {
            return $;
        }
    }

}
