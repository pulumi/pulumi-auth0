// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ConnectionOptionsSigningKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionOptionsSigningKeyArgs Empty = new ConnectionOptionsSigningKeyArgs();

    @Import(name="cert", required=true)
    private Output<String> cert;

    public Output<String> cert() {
        return this.cert;
    }

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    private ConnectionOptionsSigningKeyArgs() {}

    private ConnectionOptionsSigningKeyArgs(ConnectionOptionsSigningKeyArgs $) {
        this.cert = $.cert;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionOptionsSigningKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionOptionsSigningKeyArgs $;

        public Builder() {
            $ = new ConnectionOptionsSigningKeyArgs();
        }

        public Builder(ConnectionOptionsSigningKeyArgs defaults) {
            $ = new ConnectionOptionsSigningKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder cert(Output<String> cert) {
            $.cert = cert;
            return this;
        }

        public Builder cert(String cert) {
            return cert(Output.of(cert));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public ConnectionOptionsSigningKeyArgs build() {
            if ($.cert == null) {
                throw new MissingRequiredPropertyException("ConnectionOptionsSigningKeyArgs", "cert");
            }
            if ($.key == null) {
                throw new MissingRequiredPropertyException("ConnectionOptionsSigningKeyArgs", "key");
            }
            return $;
        }
    }

}
