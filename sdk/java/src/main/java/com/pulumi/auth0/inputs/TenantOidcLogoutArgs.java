// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.util.Objects;


public final class TenantOidcLogoutArgs extends com.pulumi.resources.ResourceArgs {

    public static final TenantOidcLogoutArgs Empty = new TenantOidcLogoutArgs();

    /**
     * Enable the end*session*endpoint URL in the .well-known discovery configuration.
     * 
     */
    @Import(name="rpLogoutEndSessionEndpointDiscovery", required=true)
    private Output<Boolean> rpLogoutEndSessionEndpointDiscovery;

    /**
     * @return Enable the end*session*endpoint URL in the .well-known discovery configuration.
     * 
     */
    public Output<Boolean> rpLogoutEndSessionEndpointDiscovery() {
        return this.rpLogoutEndSessionEndpointDiscovery;
    }

    private TenantOidcLogoutArgs() {}

    private TenantOidcLogoutArgs(TenantOidcLogoutArgs $) {
        this.rpLogoutEndSessionEndpointDiscovery = $.rpLogoutEndSessionEndpointDiscovery;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TenantOidcLogoutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TenantOidcLogoutArgs $;

        public Builder() {
            $ = new TenantOidcLogoutArgs();
        }

        public Builder(TenantOidcLogoutArgs defaults) {
            $ = new TenantOidcLogoutArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param rpLogoutEndSessionEndpointDiscovery Enable the end*session*endpoint URL in the .well-known discovery configuration.
         * 
         * @return builder
         * 
         */
        public Builder rpLogoutEndSessionEndpointDiscovery(Output<Boolean> rpLogoutEndSessionEndpointDiscovery) {
            $.rpLogoutEndSessionEndpointDiscovery = rpLogoutEndSessionEndpointDiscovery;
            return this;
        }

        /**
         * @param rpLogoutEndSessionEndpointDiscovery Enable the end*session*endpoint URL in the .well-known discovery configuration.
         * 
         * @return builder
         * 
         */
        public Builder rpLogoutEndSessionEndpointDiscovery(Boolean rpLogoutEndSessionEndpointDiscovery) {
            return rpLogoutEndSessionEndpointDiscovery(Output.of(rpLogoutEndSessionEndpointDiscovery));
        }

        public TenantOidcLogoutArgs build() {
            if ($.rpLogoutEndSessionEndpointDiscovery == null) {
                throw new MissingRequiredPropertyException("TenantOidcLogoutArgs", "rpLogoutEndSessionEndpointDiscovery");
            }
            return $;
        }
    }

}
