// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceServerScopesScopeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceServerScopesScopeArgs Empty = new ResourceServerScopesScopeArgs();

    /**
     * User-friendly description of the scope (permission).
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return User-friendly description of the scope (permission).
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the scope (permission). Examples include `read:appointments` or `delete:appointments`.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the scope (permission). Examples include `read:appointments` or `delete:appointments`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private ResourceServerScopesScopeArgs() {}

    private ResourceServerScopesScopeArgs(ResourceServerScopesScopeArgs $) {
        this.description = $.description;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceServerScopesScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceServerScopesScopeArgs $;

        public Builder() {
            $ = new ResourceServerScopesScopeArgs();
        }

        public Builder(ResourceServerScopesScopeArgs defaults) {
            $ = new ResourceServerScopesScopeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description User-friendly description of the scope (permission).
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description User-friendly description of the scope (permission).
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the scope (permission). Examples include `read:appointments` or `delete:appointments`.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the scope (permission). Examples include `read:appointments` or `delete:appointments`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ResourceServerScopesScopeArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ResourceServerScopesScopeArgs", "name");
            }
            return $;
        }
    }

}
