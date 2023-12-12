// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPagesError {
    private String html;
    private Boolean showLogLink;
    private String url;

    private GetPagesError() {}
    public String html() {
        return this.html;
    }
    public Boolean showLogLink() {
        return this.showLogLink;
    }
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPagesError defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String html;
        private Boolean showLogLink;
        private String url;
        public Builder() {}
        public Builder(GetPagesError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.html = defaults.html;
    	      this.showLogLink = defaults.showLogLink;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder html(String html) {
            this.html = Objects.requireNonNull(html);
            return this;
        }
        @CustomType.Setter
        public Builder showLogLink(Boolean showLogLink) {
            this.showLogLink = Objects.requireNonNull(showLogLink);
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public GetPagesError build() {
            final var _resultValue = new GetPagesError();
            _resultValue.html = html;
            _resultValue.showLogLink = showLogLink;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
