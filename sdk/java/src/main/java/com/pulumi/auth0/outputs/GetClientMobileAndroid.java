// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClientMobileAndroid {
    private final String appPackageName;
    private final List<String> sha256CertFingerprints;

    @CustomType.Constructor
    private GetClientMobileAndroid(
        @CustomType.Parameter("appPackageName") String appPackageName,
        @CustomType.Parameter("sha256CertFingerprints") List<String> sha256CertFingerprints) {
        this.appPackageName = appPackageName;
        this.sha256CertFingerprints = sha256CertFingerprints;
    }

    public String appPackageName() {
        return this.appPackageName;
    }
    public List<String> sha256CertFingerprints() {
        return this.sha256CertFingerprints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientMobileAndroid defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appPackageName;
        private List<String> sha256CertFingerprints;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClientMobileAndroid defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appPackageName = defaults.appPackageName;
    	      this.sha256CertFingerprints = defaults.sha256CertFingerprints;
        }

        public Builder appPackageName(String appPackageName) {
            this.appPackageName = Objects.requireNonNull(appPackageName);
            return this;
        }
        public Builder sha256CertFingerprints(List<String> sha256CertFingerprints) {
            this.sha256CertFingerprints = Objects.requireNonNull(sha256CertFingerprints);
            return this;
        }
        public Builder sha256CertFingerprints(String... sha256CertFingerprints) {
            return sha256CertFingerprints(List.of(sha256CertFingerprints));
        }        public GetClientMobileAndroid build() {
            return new GetClientMobileAndroid(appPackageName, sha256CertFingerprints);
        }
    }
}
