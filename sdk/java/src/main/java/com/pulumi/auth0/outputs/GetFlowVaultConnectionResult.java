// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetFlowVaultConnectionResult {
    /**
     * @return Custom account name of the vault connection.
     * 
     */
    private String accountName;
    /**
     * @return App identifier of the vault connection.
     * 
     */
    private String appId;
    /**
     * @return Environment of the vault connection.
     * 
     */
    private String environment;
    /**
     * @return Fingerprint of the vault connection.
     * 
     */
    private String fingerprint;
    /**
     * @return The id of the Flow Vault Connection.
     * 
     */
    private String id;
    /**
     * @return Name of the vault connection.
     * 
     */
    private String name;
    /**
     * @return Indicates if the vault connection is configured.
     * 
     */
    private Boolean ready;
    /**
     * @return Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
     * 
     */
    private Map<String,String> setup;

    private GetFlowVaultConnectionResult() {}
    /**
     * @return Custom account name of the vault connection.
     * 
     */
    public String accountName() {
        return this.accountName;
    }
    /**
     * @return App identifier of the vault connection.
     * 
     */
    public String appId() {
        return this.appId;
    }
    /**
     * @return Environment of the vault connection.
     * 
     */
    public String environment() {
        return this.environment;
    }
    /**
     * @return Fingerprint of the vault connection.
     * 
     */
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * @return The id of the Flow Vault Connection.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of the vault connection.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Indicates if the vault connection is configured.
     * 
     */
    public Boolean ready() {
        return this.ready;
    }
    /**
     * @return Configuration of the vault connection. (Mapping information must be provided as key/value pairs)
     * 
     */
    public Map<String,String> setup() {
        return this.setup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlowVaultConnectionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountName;
        private String appId;
        private String environment;
        private String fingerprint;
        private String id;
        private String name;
        private Boolean ready;
        private Map<String,String> setup;
        public Builder() {}
        public Builder(GetFlowVaultConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.appId = defaults.appId;
    	      this.environment = defaults.environment;
    	      this.fingerprint = defaults.fingerprint;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.ready = defaults.ready;
    	      this.setup = defaults.setup;
        }

        @CustomType.Setter
        public Builder accountName(String accountName) {
            if (accountName == null) {
              throw new MissingRequiredPropertyException("GetFlowVaultConnectionResult", "accountName");
            }
            this.accountName = accountName;
            return this;
        }
        @CustomType.Setter
        public Builder appId(String appId) {
            if (appId == null) {
              throw new MissingRequiredPropertyException("GetFlowVaultConnectionResult", "appId");
            }
            this.appId = appId;
            return this;
        }
        @CustomType.Setter
        public Builder environment(String environment) {
            if (environment == null) {
              throw new MissingRequiredPropertyException("GetFlowVaultConnectionResult", "environment");
            }
            this.environment = environment;
            return this;
        }
        @CustomType.Setter
        public Builder fingerprint(String fingerprint) {
            if (fingerprint == null) {
              throw new MissingRequiredPropertyException("GetFlowVaultConnectionResult", "fingerprint");
            }
            this.fingerprint = fingerprint;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetFlowVaultConnectionResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetFlowVaultConnectionResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder ready(Boolean ready) {
            if (ready == null) {
              throw new MissingRequiredPropertyException("GetFlowVaultConnectionResult", "ready");
            }
            this.ready = ready;
            return this;
        }
        @CustomType.Setter
        public Builder setup(Map<String,String> setup) {
            if (setup == null) {
              throw new MissingRequiredPropertyException("GetFlowVaultConnectionResult", "setup");
            }
            this.setup = setup;
            return this;
        }
        public GetFlowVaultConnectionResult build() {
            final var _resultValue = new GetFlowVaultConnectionResult();
            _resultValue.accountName = accountName;
            _resultValue.appId = appId;
            _resultValue.environment = environment;
            _resultValue.fingerprint = fingerprint;
            _resultValue.id = id;
            _resultValue.name = name;
            _resultValue.ready = ready;
            _resultValue.setup = setup;
            return _resultValue;
        }
    }
}
