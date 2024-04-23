// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientAddonsZendesk {
    /**
     * @return Zendesk account name. Usually the first segment in your Zendesk URL, for example `https://acme-org.zendesk.com` would be `acme-org`.
     * 
     */
    private @Nullable String accountName;

    private ClientAddonsZendesk() {}
    /**
     * @return Zendesk account name. Usually the first segment in your Zendesk URL, for example `https://acme-org.zendesk.com` would be `acme-org`.
     * 
     */
    public Optional<String> accountName() {
        return Optional.ofNullable(this.accountName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientAddonsZendesk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accountName;
        public Builder() {}
        public Builder(ClientAddonsZendesk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
        }

        @CustomType.Setter
        public Builder accountName(@Nullable String accountName) {

            this.accountName = accountName;
            return this;
        }
        public ClientAddonsZendesk build() {
            final var _resultValue = new ClientAddonsZendesk();
            _resultValue.accountName = accountName;
            return _resultValue;
        }
    }
}
