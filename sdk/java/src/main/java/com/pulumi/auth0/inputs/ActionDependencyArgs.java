// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ActionDependencyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActionDependencyArgs Empty = new ActionDependencyArgs();

    /**
     * Dependency name, e.g. `lodash`.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Dependency name, e.g. `lodash`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Dependency version, e.g. `latest` or `4.17.21`.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return Dependency version, e.g. `latest` or `4.17.21`.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private ActionDependencyArgs() {}

    private ActionDependencyArgs(ActionDependencyArgs $) {
        this.name = $.name;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionDependencyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionDependencyArgs $;

        public Builder() {
            $ = new ActionDependencyArgs();
        }

        public Builder(ActionDependencyArgs defaults) {
            $ = new ActionDependencyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Dependency name, e.g. `lodash`.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Dependency name, e.g. `lodash`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param version Dependency version, e.g. `latest` or `4.17.21`.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Dependency version, e.g. `latest` or `4.17.21`.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public ActionDependencyArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("ActionDependencyArgs", "name");
            }
            if ($.version == null) {
                throw new MissingRequiredPropertyException("ActionDependencyArgs", "version");
            }
            return $;
        }
    }

}
