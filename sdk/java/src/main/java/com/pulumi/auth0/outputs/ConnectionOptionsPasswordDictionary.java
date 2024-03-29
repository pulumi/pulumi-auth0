// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionOptionsPasswordDictionary {
    /**
     * @return Customized contents of the password dictionary. By default, the password dictionary contains a list of the [10,000 most common passwords](https://github.com/danielmiessler/SecLists/blob/master/Passwords/Common-Credentials/10k-most-common.txt); your customized content is used in addition to the default password dictionary. Matching is not case-sensitive.
     * 
     */
    private @Nullable List<String> dictionaries;
    /**
     * @return Indicates whether the password dictionary check is enabled for this connection.
     * 
     */
    private @Nullable Boolean enable;

    private ConnectionOptionsPasswordDictionary() {}
    /**
     * @return Customized contents of the password dictionary. By default, the password dictionary contains a list of the [10,000 most common passwords](https://github.com/danielmiessler/SecLists/blob/master/Passwords/Common-Credentials/10k-most-common.txt); your customized content is used in addition to the default password dictionary. Matching is not case-sensitive.
     * 
     */
    public List<String> dictionaries() {
        return this.dictionaries == null ? List.of() : this.dictionaries;
    }
    /**
     * @return Indicates whether the password dictionary check is enabled for this connection.
     * 
     */
    public Optional<Boolean> enable() {
        return Optional.ofNullable(this.enable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionOptionsPasswordDictionary defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> dictionaries;
        private @Nullable Boolean enable;
        public Builder() {}
        public Builder(ConnectionOptionsPasswordDictionary defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dictionaries = defaults.dictionaries;
    	      this.enable = defaults.enable;
        }

        @CustomType.Setter
        public Builder dictionaries(@Nullable List<String> dictionaries) {

            this.dictionaries = dictionaries;
            return this;
        }
        public Builder dictionaries(String... dictionaries) {
            return dictionaries(List.of(dictionaries));
        }
        @CustomType.Setter
        public Builder enable(@Nullable Boolean enable) {

            this.enable = enable;
            return this;
        }
        public ConnectionOptionsPasswordDictionary build() {
            final var _resultValue = new ConnectionOptionsPasswordDictionary();
            _resultValue.dictionaries = dictionaries;
            _resultValue.enable = enable;
            return _resultValue;
        }
    }
}
