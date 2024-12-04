// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ClientOidcLogoutBackchannelLogoutInitiators {
    /**
     * @return Determines the configuration method for enabling initiators. `custom` enables only the initiators listed in the backchannel*logout*selected_initiators set, `all` enables all current and future initiators.
     * 
     */
    private String mode;
    /**
     * @return Contains the list of initiators to be enabled for the given client.
     * 
     */
    private @Nullable List<String> selectedInitiators;

    private ClientOidcLogoutBackchannelLogoutInitiators() {}
    /**
     * @return Determines the configuration method for enabling initiators. `custom` enables only the initiators listed in the backchannel*logout*selected_initiators set, `all` enables all current and future initiators.
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return Contains the list of initiators to be enabled for the given client.
     * 
     */
    public List<String> selectedInitiators() {
        return this.selectedInitiators == null ? List.of() : this.selectedInitiators;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientOidcLogoutBackchannelLogoutInitiators defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mode;
        private @Nullable List<String> selectedInitiators;
        public Builder() {}
        public Builder(ClientOidcLogoutBackchannelLogoutInitiators defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.selectedInitiators = defaults.selectedInitiators;
        }

        @CustomType.Setter
        public Builder mode(String mode) {
            if (mode == null) {
              throw new MissingRequiredPropertyException("ClientOidcLogoutBackchannelLogoutInitiators", "mode");
            }
            this.mode = mode;
            return this;
        }
        @CustomType.Setter
        public Builder selectedInitiators(@Nullable List<String> selectedInitiators) {

            this.selectedInitiators = selectedInitiators;
            return this;
        }
        public Builder selectedInitiators(String... selectedInitiators) {
            return selectedInitiators(List.of(selectedInitiators));
        }
        public ClientOidcLogoutBackchannelLogoutInitiators build() {
            final var _resultValue = new ClientOidcLogoutBackchannelLogoutInitiators();
            _resultValue.mode = mode;
            _resultValue.selectedInitiators = selectedInitiators;
            return _resultValue;
        }
    }
}
