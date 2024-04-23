// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientAddonsSharepoint {
    /**
     * @return External SharePoint application URLs if exposed to the Internet.
     * 
     */
    private @Nullable List<String> externalUrls;
    /**
     * @return Internal SharePoint application URL.
     * 
     */
    private @Nullable String url;

    private ClientAddonsSharepoint() {}
    /**
     * @return External SharePoint application URLs if exposed to the Internet.
     * 
     */
    public List<String> externalUrls() {
        return this.externalUrls == null ? List.of() : this.externalUrls;
    }
    /**
     * @return Internal SharePoint application URL.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientAddonsSharepoint defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> externalUrls;
        private @Nullable String url;
        public Builder() {}
        public Builder(ClientAddonsSharepoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalUrls = defaults.externalUrls;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder externalUrls(@Nullable List<String> externalUrls) {

            this.externalUrls = externalUrls;
            return this;
        }
        public Builder externalUrls(String... externalUrls) {
            return externalUrls(List.of(externalUrls));
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {

            this.url = url;
            return this;
        }
        public ClientAddonsSharepoint build() {
            final var _resultValue = new ClientAddonsSharepoint();
            _resultValue.externalUrls = externalUrls;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
