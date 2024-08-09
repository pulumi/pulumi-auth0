// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.ProviderArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The provider type for the auth0 package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 * 
 */
@ResourceType(type="pulumi:providers:auth0")
public class Provider extends com.pulumi.resources.ProviderResource {
    /**
     * Your Auth0 [management api access
     * token](https://auth0.com/docs/security/tokens/access-tokens/management-api-access-tokens). It can also be sourced from
     * the `AUTH0_API_TOKEN` environment variable. It can be used instead of `client_id` + `client_secret`. If both are
     * specified, `api_token` will be used over `client_id` + `client_secret` fields.
     * 
     */
    @Export(name="apiToken", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> apiToken;

    /**
     * @return Your Auth0 [management api access
     * token](https://auth0.com/docs/security/tokens/access-tokens/management-api-access-tokens). It can also be sourced from
     * the `AUTH0_API_TOKEN` environment variable. It can be used instead of `client_id` + `client_secret`. If both are
     * specified, `api_token` will be used over `client_id` + `client_secret` fields.
     * 
     */
    public Output<Optional<String>> apiToken() {
        return Codegen.optional(this.apiToken);
    }
    /**
     * Your Auth0 audience when using a custom domain. It can also be sourced from the `AUTH0_AUDIENCE` environment variable.
     * 
     */
    @Export(name="audience", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> audience;

    /**
     * @return Your Auth0 audience when using a custom domain. It can also be sourced from the `AUTH0_AUDIENCE` environment variable.
     * 
     */
    public Output<Optional<String>> audience() {
        return Codegen.optional(this.audience);
    }
    /**
     * Your Auth0 client ID. It can also be sourced from the `AUTH0_CLIENT_ID` environment variable.
     * 
     */
    @Export(name="clientId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clientId;

    /**
     * @return Your Auth0 client ID. It can also be sourced from the `AUTH0_CLIENT_ID` environment variable.
     * 
     */
    public Output<Optional<String>> clientId() {
        return Codegen.optional(this.clientId);
    }
    /**
     * Your Auth0 client secret. It can also be sourced from the `AUTH0_CLIENT_SECRET` environment variable.
     * 
     */
    @Export(name="clientSecret", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> clientSecret;

    /**
     * @return Your Auth0 client secret. It can also be sourced from the `AUTH0_CLIENT_SECRET` environment variable.
     * 
     */
    public Output<Optional<String>> clientSecret() {
        return Codegen.optional(this.clientSecret);
    }
    /**
     * Your Auth0 domain name. It can also be sourced from the `AUTH0_DOMAIN` environment variable.
     * 
     */
    @Export(name="domain", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> domain;

    /**
     * @return Your Auth0 domain name. It can also be sourced from the `AUTH0_DOMAIN` environment variable.
     * 
     */
    public Output<Optional<String>> domain() {
        return Codegen.optional(this.domain);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(java.lang.String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(java.lang.String name, @Nullable ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(java.lang.String name, @Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private static ProviderArgs makeArgs(@Nullable ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ProviderArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
