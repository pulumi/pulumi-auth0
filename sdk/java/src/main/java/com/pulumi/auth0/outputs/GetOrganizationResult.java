// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.auth0.outputs.GetOrganizationBranding;
import com.pulumi.auth0.outputs.GetOrganizationConnection;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOrganizationResult {
    /**
     * @return Defines how to style the login pages.
     * 
     */
    private List<GetOrganizationBranding> brandings;
    /**
     * @return Client Grant ID(s) that are associated to the organization.
     * 
     */
    private List<String> clientGrants;
    private List<GetOrganizationConnection> connections;
    /**
     * @return Friendly name of this organization.
     * 
     */
    private String displayName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return User ID(s) that are members of the organization.
     * 
     */
    private List<String> members;
    /**
     * @return Metadata associated with the organization. Maximum of 10 metadata properties allowed.
     * 
     */
    private Map<String,String> metadata;
    /**
     * @return The name of the organization. If not provided, `organization_id` must be set. For performance, it is advised to use the `organization_id` as a lookup if possible.
     * 
     */
    private @Nullable String name;
    /**
     * @return The ID of the organization. If not provided, `name` must be set.
     * 
     */
    private @Nullable String organizationId;

    private GetOrganizationResult() {}
    /**
     * @return Defines how to style the login pages.
     * 
     */
    public List<GetOrganizationBranding> brandings() {
        return this.brandings;
    }
    /**
     * @return Client Grant ID(s) that are associated to the organization.
     * 
     */
    public List<String> clientGrants() {
        return this.clientGrants;
    }
    public List<GetOrganizationConnection> connections() {
        return this.connections;
    }
    /**
     * @return Friendly name of this organization.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return User ID(s) that are members of the organization.
     * 
     */
    public List<String> members() {
        return this.members;
    }
    /**
     * @return Metadata associated with the organization. Maximum of 10 metadata properties allowed.
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata;
    }
    /**
     * @return The name of the organization. If not provided, `organization_id` must be set. For performance, it is advised to use the `organization_id` as a lookup if possible.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The ID of the organization. If not provided, `name` must be set.
     * 
     */
    public Optional<String> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetOrganizationBranding> brandings;
        private List<String> clientGrants;
        private List<GetOrganizationConnection> connections;
        private String displayName;
        private String id;
        private List<String> members;
        private Map<String,String> metadata;
        private @Nullable String name;
        private @Nullable String organizationId;
        public Builder() {}
        public Builder(GetOrganizationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.brandings = defaults.brandings;
    	      this.clientGrants = defaults.clientGrants;
    	      this.connections = defaults.connections;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.members = defaults.members;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
        }

        @CustomType.Setter
        public Builder brandings(List<GetOrganizationBranding> brandings) {
            if (brandings == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "brandings");
            }
            this.brandings = brandings;
            return this;
        }
        public Builder brandings(GetOrganizationBranding... brandings) {
            return brandings(List.of(brandings));
        }
        @CustomType.Setter
        public Builder clientGrants(List<String> clientGrants) {
            if (clientGrants == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "clientGrants");
            }
            this.clientGrants = clientGrants;
            return this;
        }
        public Builder clientGrants(String... clientGrants) {
            return clientGrants(List.of(clientGrants));
        }
        @CustomType.Setter
        public Builder connections(List<GetOrganizationConnection> connections) {
            if (connections == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "connections");
            }
            this.connections = connections;
            return this;
        }
        public Builder connections(GetOrganizationConnection... connections) {
            return connections(List.of(connections));
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            if (displayName == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "displayName");
            }
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder members(List<String> members) {
            if (members == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "members");
            }
            this.members = members;
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        @CustomType.Setter
        public Builder metadata(Map<String,String> metadata) {
            if (metadata == null) {
              throw new MissingRequiredPropertyException("GetOrganizationResult", "metadata");
            }
            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder organizationId(@Nullable String organizationId) {

            this.organizationId = organizationId;
            return this;
        }
        public GetOrganizationResult build() {
            final var _resultValue = new GetOrganizationResult();
            _resultValue.brandings = brandings;
            _resultValue.clientGrants = clientGrants;
            _resultValue.connections = connections;
            _resultValue.displayName = displayName;
            _resultValue.id = id;
            _resultValue.members = members;
            _resultValue.metadata = metadata;
            _resultValue.name = name;
            _resultValue.organizationId = organizationId;
            return _resultValue;
        }
    }
}
