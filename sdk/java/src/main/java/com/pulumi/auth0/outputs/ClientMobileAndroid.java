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
public final class ClientMobileAndroid {
    /**
     * @return String
     * 
     */
    private @Nullable String appPackageName;
    /**
     * @return List(String)
     * 
     */
    private @Nullable List<String> sha256CertFingerprints;

    private ClientMobileAndroid() {}
    /**
     * @return String
     * 
     */
    public Optional<String> appPackageName() {
        return Optional.ofNullable(this.appPackageName);
    }
    /**
     * @return List(String)
     * 
     */
    public List<String> sha256CertFingerprints() {
        return this.sha256CertFingerprints == null ? List.of() : this.sha256CertFingerprints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientMobileAndroid defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String appPackageName;
        private @Nullable List<String> sha256CertFingerprints;
        public Builder() {}
        public Builder(ClientMobileAndroid defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appPackageName = defaults.appPackageName;
    	      this.sha256CertFingerprints = defaults.sha256CertFingerprints;
        }

        @CustomType.Setter
        public Builder appPackageName(@Nullable String appPackageName) {
            this.appPackageName = appPackageName;
            return this;
        }
        @CustomType.Setter
        public Builder sha256CertFingerprints(@Nullable List<String> sha256CertFingerprints) {
            this.sha256CertFingerprints = sha256CertFingerprints;
            return this;
        }
        public Builder sha256CertFingerprints(String... sha256CertFingerprints) {
            return sha256CertFingerprints(List.of(sha256CertFingerprints));
        }
        public ClientMobileAndroid build() {
            final var o = new ClientMobileAndroid();
            o.appPackageName = appPackageName;
            o.sha256CertFingerprints = sha256CertFingerprints;
            return o;
        }
    }
}
