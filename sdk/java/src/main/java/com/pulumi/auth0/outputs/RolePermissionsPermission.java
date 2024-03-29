// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RolePermissionsPermission {
    /**
     * @return Description of the permission.
     * 
     */
    private @Nullable String description;
    /**
     * @return Name of permission.
     * 
     */
    private String name;
    /**
     * @return Resource server identifier associated with the permission.
     * 
     */
    private String resourceServerIdentifier;
    /**
     * @return Name of resource server that the permission is associated with.
     * 
     */
    private @Nullable String resourceServerName;

    private RolePermissionsPermission() {}
    /**
     * @return Description of the permission.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Name of permission.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Resource server identifier associated with the permission.
     * 
     */
    public String resourceServerIdentifier() {
        return this.resourceServerIdentifier;
    }
    /**
     * @return Name of resource server that the permission is associated with.
     * 
     */
    public Optional<String> resourceServerName() {
        return Optional.ofNullable(this.resourceServerName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RolePermissionsPermission defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private String name;
        private String resourceServerIdentifier;
        private @Nullable String resourceServerName;
        public Builder() {}
        public Builder(RolePermissionsPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.resourceServerIdentifier = defaults.resourceServerIdentifier;
    	      this.resourceServerName = defaults.resourceServerName;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("RolePermissionsPermission", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder resourceServerIdentifier(String resourceServerIdentifier) {
            if (resourceServerIdentifier == null) {
              throw new MissingRequiredPropertyException("RolePermissionsPermission", "resourceServerIdentifier");
            }
            this.resourceServerIdentifier = resourceServerIdentifier;
            return this;
        }
        @CustomType.Setter
        public Builder resourceServerName(@Nullable String resourceServerName) {

            this.resourceServerName = resourceServerName;
            return this;
        }
        public RolePermissionsPermission build() {
            final var _resultValue = new RolePermissionsPermission();
            _resultValue.description = description;
            _resultValue.name = name;
            _resultValue.resourceServerIdentifier = resourceServerIdentifier;
            _resultValue.resourceServerName = resourceServerName;
            return _resultValue;
        }
    }
}
