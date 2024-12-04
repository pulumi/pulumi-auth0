// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GetClientsClient;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClientsResult {
    /**
     * @return Filter clients by application types.
     * 
     */
    private @Nullable List<String> appTypes;
    /**
     * @return List of clients matching the filter criteria.
     * 
     */
    private List<GetClientsClient> clients;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Filter clients by first party status.
     * 
     */
    private @Nullable Boolean isFirstParty;
    /**
     * @return Filter clients by name (partial matches supported).
     * 
     */
    private @Nullable String nameFilter;

    private GetClientsResult() {}
    /**
     * @return Filter clients by application types.
     * 
     */
    public List<String> appTypes() {
        return this.appTypes == null ? List.of() : this.appTypes;
    }
    /**
     * @return List of clients matching the filter criteria.
     * 
     */
    public List<GetClientsClient> clients() {
        return this.clients;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Filter clients by first party status.
     * 
     */
    public Optional<Boolean> isFirstParty() {
        return Optional.ofNullable(this.isFirstParty);
    }
    /**
     * @return Filter clients by name (partial matches supported).
     * 
     */
    public Optional<String> nameFilter() {
        return Optional.ofNullable(this.nameFilter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> appTypes;
        private List<GetClientsClient> clients;
        private String id;
        private @Nullable Boolean isFirstParty;
        private @Nullable String nameFilter;
        public Builder() {}
        public Builder(GetClientsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appTypes = defaults.appTypes;
    	      this.clients = defaults.clients;
    	      this.id = defaults.id;
    	      this.isFirstParty = defaults.isFirstParty;
    	      this.nameFilter = defaults.nameFilter;
        }

        @CustomType.Setter
        public Builder appTypes(@Nullable List<String> appTypes) {

            this.appTypes = appTypes;
            return this;
        }
        public Builder appTypes(String... appTypes) {
            return appTypes(List.of(appTypes));
        }
        @CustomType.Setter
        public Builder clients(List<GetClientsClient> clients) {
            if (clients == null) {
              throw new MissingRequiredPropertyException("GetClientsResult", "clients");
            }
            this.clients = clients;
            return this;
        }
        public Builder clients(GetClientsClient... clients) {
            return clients(List.of(clients));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetClientsResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isFirstParty(@Nullable Boolean isFirstParty) {

            this.isFirstParty = isFirstParty;
            return this;
        }
        @CustomType.Setter
        public Builder nameFilter(@Nullable String nameFilter) {

            this.nameFilter = nameFilter;
            return this;
        }
        public GetClientsResult build() {
            final var _resultValue = new GetClientsResult();
            _resultValue.appTypes = appTypes;
            _resultValue.clients = clients;
            _resultValue.id = id;
            _resultValue.isFirstParty = isFirstParty;
            _resultValue.nameFilter = nameFilter;
            return _resultValue;
        }
    }
}
