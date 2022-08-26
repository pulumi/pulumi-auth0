// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GetGlobalClientNativeSocialLoginApple;
import com.pulumi.auth0.outputs.GetGlobalClientNativeSocialLoginFacebook;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGlobalClientNativeSocialLogin {
    private List<GetGlobalClientNativeSocialLoginApple> apples;
    private List<GetGlobalClientNativeSocialLoginFacebook> facebooks;

    private GetGlobalClientNativeSocialLogin() {}
    public List<GetGlobalClientNativeSocialLoginApple> apples() {
        return this.apples;
    }
    public List<GetGlobalClientNativeSocialLoginFacebook> facebooks() {
        return this.facebooks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalClientNativeSocialLogin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetGlobalClientNativeSocialLoginApple> apples;
        private List<GetGlobalClientNativeSocialLoginFacebook> facebooks;
        public Builder() {}
        public Builder(GetGlobalClientNativeSocialLogin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apples = defaults.apples;
    	      this.facebooks = defaults.facebooks;
        }

        @CustomType.Setter
        public Builder apples(List<GetGlobalClientNativeSocialLoginApple> apples) {
            this.apples = Objects.requireNonNull(apples);
            return this;
        }
        public Builder apples(GetGlobalClientNativeSocialLoginApple... apples) {
            return apples(List.of(apples));
        }
        @CustomType.Setter
        public Builder facebooks(List<GetGlobalClientNativeSocialLoginFacebook> facebooks) {
            this.facebooks = Objects.requireNonNull(facebooks);
            return this;
        }
        public Builder facebooks(GetGlobalClientNativeSocialLoginFacebook... facebooks) {
            return facebooks(List.of(facebooks));
        }
        public GetGlobalClientNativeSocialLogin build() {
            final var o = new GetGlobalClientNativeSocialLogin();
            o.apples = apples;
            o.facebooks = facebooks;
            return o;
        }
    }
}
