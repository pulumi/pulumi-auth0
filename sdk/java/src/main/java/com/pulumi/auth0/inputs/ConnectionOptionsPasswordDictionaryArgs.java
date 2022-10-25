// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionOptionsPasswordDictionaryArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionOptionsPasswordDictionaryArgs Empty = new ConnectionOptionsPasswordDictionaryArgs();

    /**
     * Customized contents of the password dictionary. By default, the password dictionary contains a list of the [10,000 most common passwords](https://github.com/danielmiessler/SecLists/blob/master/Passwords/Common-Credentials/10k-most-common.txt); your customized content is used in addition to the default password dictionary. Matching is not case-sensitive.
     * 
     */
    @Import(name="dictionaries")
    private @Nullable Output<List<String>> dictionaries;

    /**
     * @return Customized contents of the password dictionary. By default, the password dictionary contains a list of the [10,000 most common passwords](https://github.com/danielmiessler/SecLists/blob/master/Passwords/Common-Credentials/10k-most-common.txt); your customized content is used in addition to the default password dictionary. Matching is not case-sensitive.
     * 
     */
    public Optional<Output<List<String>>> dictionaries() {
        return Optional.ofNullable(this.dictionaries);
    }

    /**
     * Indicates whether the password dictionary check is enabled for this connection.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    /**
     * @return Indicates whether the password dictionary check is enabled for this connection.
     * 
     */
    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    private ConnectionOptionsPasswordDictionaryArgs() {}

    private ConnectionOptionsPasswordDictionaryArgs(ConnectionOptionsPasswordDictionaryArgs $) {
        this.dictionaries = $.dictionaries;
        this.enable = $.enable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionOptionsPasswordDictionaryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionOptionsPasswordDictionaryArgs $;

        public Builder() {
            $ = new ConnectionOptionsPasswordDictionaryArgs();
        }

        public Builder(ConnectionOptionsPasswordDictionaryArgs defaults) {
            $ = new ConnectionOptionsPasswordDictionaryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dictionaries Customized contents of the password dictionary. By default, the password dictionary contains a list of the [10,000 most common passwords](https://github.com/danielmiessler/SecLists/blob/master/Passwords/Common-Credentials/10k-most-common.txt); your customized content is used in addition to the default password dictionary. Matching is not case-sensitive.
         * 
         * @return builder
         * 
         */
        public Builder dictionaries(@Nullable Output<List<String>> dictionaries) {
            $.dictionaries = dictionaries;
            return this;
        }

        /**
         * @param dictionaries Customized contents of the password dictionary. By default, the password dictionary contains a list of the [10,000 most common passwords](https://github.com/danielmiessler/SecLists/blob/master/Passwords/Common-Credentials/10k-most-common.txt); your customized content is used in addition to the default password dictionary. Matching is not case-sensitive.
         * 
         * @return builder
         * 
         */
        public Builder dictionaries(List<String> dictionaries) {
            return dictionaries(Output.of(dictionaries));
        }

        /**
         * @param dictionaries Customized contents of the password dictionary. By default, the password dictionary contains a list of the [10,000 most common passwords](https://github.com/danielmiessler/SecLists/blob/master/Passwords/Common-Credentials/10k-most-common.txt); your customized content is used in addition to the default password dictionary. Matching is not case-sensitive.
         * 
         * @return builder
         * 
         */
        public Builder dictionaries(String... dictionaries) {
            return dictionaries(List.of(dictionaries));
        }

        /**
         * @param enable Indicates whether the password dictionary check is enabled for this connection.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable Indicates whether the password dictionary check is enabled for this connection.
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public ConnectionOptionsPasswordDictionaryArgs build() {
            return $;
        }
    }

}