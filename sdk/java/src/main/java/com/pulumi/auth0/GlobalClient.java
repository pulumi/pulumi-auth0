// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.GlobalClientArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.GlobalClientState;
import com.pulumi.auth0.outputs.GlobalClientAddons;
import com.pulumi.auth0.outputs.GlobalClientJwtConfiguration;
import com.pulumi.auth0.outputs.GlobalClientMobile;
import com.pulumi.auth0.outputs.GlobalClientNativeSocialLogin;
import com.pulumi.auth0.outputs.GlobalClientRefreshToken;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.GlobalClient;
 * import com.pulumi.auth0.GlobalClientArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var global = new GlobalClient(&#34;global&#34;, GlobalClientArgs.builder()        
 *             .callbacks(&#34;http://somehostname.com/a/callback&#34;)
 *             .customLoginPage(&#34;&#34;&#34;
 * &lt;html&gt;
 *     &lt;head&gt;&lt;title&gt;My Custom Login Page&lt;/title&gt;&lt;/head&gt;
 *     &lt;body&gt;
 *         I should probably have a login form here
 *     &lt;/body&gt;
 * &lt;/html&gt;
 * 
 *             &#34;&#34;&#34;)
 *             .customLoginPageOn(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * The auth0_global_client can be imported using the global client&#39;s ID. # You can find the ID of the global client by going to the [API Explorer](https://auth0.com/docs/api/management/v2#!/Clients/get_clients) and fetching the clients that have `&#34;global&#34;true`. # Example
 * 
 * ```sh
 *  $ pulumi import auth0:index/globalClient:GlobalClient global XaiyAXXXYdXXXXnqjj8HXXXXXT5titww
 * ```
 * 
 */
@ResourceType(type="auth0:index/globalClient:GlobalClient")
public class GlobalClient extends com.pulumi.resources.CustomResource {
    /**
     * Addons enabled for this client and their associated configurations.
     * 
     */
    @Export(name="addons", type=GlobalClientAddons.class, parameters={})
    private Output<GlobalClientAddons> addons;

    /**
     * @return Addons enabled for this client and their associated configurations.
     * 
     */
    public Output<GlobalClientAddons> addons() {
        return this.addons;
    }
    /**
     * List of applications ID&#39;s that will be allowed to make delegation request. By default, all applications will be allowed.
     * 
     */
    @Export(name="allowedClients", type=List.class, parameters={String.class})
    private Output<List<String>> allowedClients;

    /**
     * @return List of applications ID&#39;s that will be allowed to make delegation request. By default, all applications will be allowed.
     * 
     */
    public Output<List<String>> allowedClients() {
        return this.allowedClients;
    }
    /**
     * URLs that Auth0 may redirect to after logout.
     * 
     */
    @Export(name="allowedLogoutUrls", type=List.class, parameters={String.class})
    private Output<List<String>> allowedLogoutUrls;

    /**
     * @return URLs that Auth0 may redirect to after logout.
     * 
     */
    public Output<List<String>> allowedLogoutUrls() {
        return this.allowedLogoutUrls;
    }
    /**
     * URLs that represent valid origins for cross-origin resource sharing. By default, all your callback URLs will be allowed.
     * 
     */
    @Export(name="allowedOrigins", type=List.class, parameters={String.class})
    private Output<List<String>> allowedOrigins;

    /**
     * @return URLs that represent valid origins for cross-origin resource sharing. By default, all your callback URLs will be allowed.
     * 
     */
    public Output<List<String>> allowedOrigins() {
        return this.allowedOrigins;
    }
    /**
     * Type of application the client represents. Possible values are: `native`, `spa`, `regular_web`, `non_interactive`, `sso_integration`. Specific SSO integrations types accepted as well are: `rms`, `box`, `cloudbees`, `concur`, `dropbox`, `mscrm`, `echosign`, `egnyte`, `newrelic`, `office365`, `salesforce`, `sentry`, `sharepoint`, `slack`, `springcm`, `zendesk`, `zoom`.
     * 
     */
    @Export(name="appType", type=String.class, parameters={})
    private Output<String> appType;

    /**
     * @return Type of application the client represents. Possible values are: `native`, `spa`, `regular_web`, `non_interactive`, `sso_integration`. Specific SSO integrations types accepted as well are: `rms`, `box`, `cloudbees`, `concur`, `dropbox`, `mscrm`, `echosign`, `egnyte`, `newrelic`, `office365`, `salesforce`, `sentry`, `sharepoint`, `slack`, `springcm`, `zendesk`, `zoom`.
     * 
     */
    public Output<String> appType() {
        return this.appType;
    }
    /**
     * URLs that Auth0 may call back to after a user authenticates for the client. Make sure to specify the protocol (https://) otherwise the callback may fail in some cases. With the exception of custom URI schemes for native clients, all callbacks should use protocol https://.
     * 
     */
    @Export(name="callbacks", type=List.class, parameters={String.class})
    private Output<List<String>> callbacks;

    /**
     * @return URLs that Auth0 may call back to after a user authenticates for the client. Make sure to specify the protocol (https://) otherwise the callback may fail in some cases. With the exception of custom URI schemes for native clients, all callbacks should use protocol https://.
     * 
     */
    public Output<List<String>> callbacks() {
        return this.callbacks;
    }
    /**
     * List of audiences/realms for SAML protocol. Used by the wsfed addon.
     * 
     */
    @Export(name="clientAliases", type=List.class, parameters={String.class})
    private Output<List<String>> clientAliases;

    /**
     * @return List of audiences/realms for SAML protocol. Used by the wsfed addon.
     * 
     */
    public Output<List<String>> clientAliases() {
        return this.clientAliases;
    }
    /**
     * The ID of the client.
     * 
     */
    @Export(name="clientId", type=String.class, parameters={})
    private Output<String> clientId;

    /**
     * @return The ID of the client.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }
    /**
     * Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?&#34;/\()&lt;&gt;@ [Tab] [Space]`.
     * 
     */
    @Export(name="clientMetadata", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> clientMetadata;

    /**
     * @return Metadata associated with the client, in the form of an object with string values (max 255 chars). Maximum of 10 metadata properties allowed. Field names (max 255 chars) are alphanumeric and may only include the following special characters: `:,-+=_*?&#34;/\()&lt;&gt;@ [Tab] [Space]`.
     * 
     */
    public Output<Map<String,Object>> clientMetadata() {
        return this.clientMetadata;
    }
    /**
     * Secret for the client. Keep this private. To access this attribute you need to add the `read:client_keys` scope to the
     * Terraform client. Otherwise, the attribute will contain an empty string. Use this attribute on the
     * `auth0_client_credentials` resource instead, to allow managing it directly or use the `auth0_client` data source to read
     * this property.
     * 
     * @deprecated
     * Reading the client secret through this attribute is deprecated and it will be removed in a future version. Migrate to the `auth0_client_credentials` resource to manage a client&#39;s secret instead or use the `auth0_client` data source to read this property.
     * 
     */
    @Deprecated /* Reading the client secret through this attribute is deprecated and it will be removed in a future version. Migrate to the `auth0_client_credentials` resource to manage a client's secret instead or use the `auth0_client` data source to read this property. */
    @Export(name="clientSecret", type=String.class, parameters={})
    private Output<String> clientSecret;

    /**
     * @return Secret for the client. Keep this private. To access this attribute you need to add the `read:client_keys` scope to the
     * Terraform client. Otherwise, the attribute will contain an empty string. Use this attribute on the
     * `auth0_client_credentials` resource instead, to allow managing it directly or use the `auth0_client` data source to read
     * this property.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }
    /**
     * Custom metadata for the rotation. The contents of this map are arbitrary and are hashed by the provider. When the hash changes, a rotation is triggered. For example, the map could contain the user making the change, the date of the change, and a text reason for the change. For more info: rotate-client-secret for instructions on how to rotate client secrets with zero downtime.
     * 
     * @deprecated
     * Rotating a client&#39;s secret through this attribute is deprecated and it will be removed in a future version. Migrate to the `auth0_client_credentials` resource to manage a client&#39;s secret instead. Refer to the [client secret rotation guide](https://registry.terraform.io/providers/auth0/auth0/latest/docs/guides/client_secret_rotation) for instructions on how to rotate client secrets with zero downtime.
     * 
     */
    @Deprecated /* Rotating a client's secret through this attribute is deprecated and it will be removed in a future version. Migrate to the `auth0_client_credentials` resource to manage a client's secret instead. Refer to the [client secret rotation guide](https://registry.terraform.io/providers/auth0/auth0/latest/docs/guides/client_secret_rotation) for instructions on how to rotate client secrets with zero downtime. */
    @Export(name="clientSecretRotationTrigger", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> clientSecretRotationTrigger;

    /**
     * @return Custom metadata for the rotation. The contents of this map are arbitrary and are hashed by the provider. When the hash changes, a rotation is triggered. For example, the map could contain the user making the change, the date of the change, and a text reason for the change. For more info: rotate-client-secret for instructions on how to rotate client secrets with zero downtime.
     * 
     */
    public Output<Optional<Map<String,Object>>> clientSecretRotationTrigger() {
        return Codegen.optional(this.clientSecretRotationTrigger);
    }
    /**
     * Whether this client can be used to make cross-origin authentication requests (`true`) or it is not allowed to make such requests (`false`). Requires the `coa_toggle_enabled` feature flag to be enabled on the tenant by the support team.
     * 
     */
    @Export(name="crossOriginAuth", type=Boolean.class, parameters={})
    private Output<Boolean> crossOriginAuth;

    /**
     * @return Whether this client can be used to make cross-origin authentication requests (`true`) or it is not allowed to make such requests (`false`). Requires the `coa_toggle_enabled` feature flag to be enabled on the tenant by the support team.
     * 
     */
    public Output<Boolean> crossOriginAuth() {
        return this.crossOriginAuth;
    }
    /**
     * URL of the location in your site where the cross-origin verification takes place for the cross-origin auth flow when performing authentication in your own domain instead of Auth0 Universal Login page.
     * 
     */
    @Export(name="crossOriginLoc", type=String.class, parameters={})
    private Output<String> crossOriginLoc;

    /**
     * @return URL of the location in your site where the cross-origin verification takes place for the cross-origin auth flow when performing authentication in your own domain instead of Auth0 Universal Login page.
     * 
     */
    public Output<String> crossOriginLoc() {
        return this.crossOriginLoc;
    }
    /**
     * The content (HTML, CSS, JS) of the custom login page.
     * 
     */
    @Export(name="customLoginPage", type=String.class, parameters={})
    private Output<String> customLoginPage;

    /**
     * @return The content (HTML, CSS, JS) of the custom login page.
     * 
     */
    public Output<String> customLoginPage() {
        return this.customLoginPage;
    }
    /**
     * Indicates whether a custom login page is to be used.
     * 
     */
    @Export(name="customLoginPageOn", type=Boolean.class, parameters={})
    private Output<Boolean> customLoginPageOn;

    /**
     * @return Indicates whether a custom login page is to be used.
     * 
     */
    public Output<Boolean> customLoginPageOn() {
        return this.customLoginPageOn;
    }
    /**
     * Description of the purpose of the client.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the purpose of the client.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Encryption used for WS-Fed responses with this client.
     * 
     */
    @Export(name="encryptionKey", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> encryptionKey;

    /**
     * @return Encryption used for WS-Fed responses with this client.
     * 
     */
    public Output<Map<String,String>> encryptionKey() {
        return this.encryptionKey;
    }
    /**
     * HTML form template to be used for WS-Federation.
     * 
     */
    @Export(name="formTemplate", type=String.class, parameters={})
    private Output<String> formTemplate;

    /**
     * @return HTML form template to be used for WS-Federation.
     * 
     */
    public Output<String> formTemplate() {
        return this.formTemplate;
    }
    /**
     * Types of grants that this client is authorized to use.
     * 
     */
    @Export(name="grantTypes", type=List.class, parameters={String.class})
    private Output<List<String>> grantTypes;

    /**
     * @return Types of grants that this client is authorized to use.
     * 
     */
    public Output<List<String>> grantTypes() {
        return this.grantTypes;
    }
    /**
     * Initiate login URI. Must be HTTPS or an empty string.
     * 
     */
    @Export(name="initiateLoginUri", type=String.class, parameters={})
    private Output<String> initiateLoginUri;

    /**
     * @return Initiate login URI. Must be HTTPS or an empty string.
     * 
     */
    public Output<String> initiateLoginUri() {
        return this.initiateLoginUri;
    }
    /**
     * Indicates whether this client is a first-party client.
     * 
     */
    @Export(name="isFirstParty", type=Boolean.class, parameters={})
    private Output<Boolean> isFirstParty;

    /**
     * @return Indicates whether this client is a first-party client.
     * 
     */
    public Output<Boolean> isFirstParty() {
        return this.isFirstParty;
    }
    /**
     * Indicates whether the token endpoint IP header is trusted. This attribute can only be updated after the client gets created.
     * 
     */
    @Export(name="isTokenEndpointIpHeaderTrusted", type=Boolean.class, parameters={})
    private Output<Boolean> isTokenEndpointIpHeaderTrusted;

    /**
     * @return Indicates whether the token endpoint IP header is trusted. This attribute can only be updated after the client gets created.
     * 
     */
    public Output<Boolean> isTokenEndpointIpHeaderTrusted() {
        return this.isTokenEndpointIpHeaderTrusted;
    }
    /**
     * Configuration settings for the JWTs issued for this client.
     * 
     */
    @Export(name="jwtConfiguration", type=GlobalClientJwtConfiguration.class, parameters={})
    private Output<GlobalClientJwtConfiguration> jwtConfiguration;

    /**
     * @return Configuration settings for the JWTs issued for this client.
     * 
     */
    public Output<GlobalClientJwtConfiguration> jwtConfiguration() {
        return this.jwtConfiguration;
    }
    /**
     * URL of the logo for the client. Recommended size is 150px x 150px. If none is set, the default badge for the application type will be shown.
     * 
     */
    @Export(name="logoUri", type=String.class, parameters={})
    private Output<String> logoUri;

    /**
     * @return URL of the logo for the client. Recommended size is 150px x 150px. If none is set, the default badge for the application type will be shown.
     * 
     */
    public Output<String> logoUri() {
        return this.logoUri;
    }
    /**
     * Additional configuration for native mobile apps.
     * 
     */
    @Export(name="mobile", type=GlobalClientMobile.class, parameters={})
    private Output<GlobalClientMobile> mobile;

    /**
     * @return Additional configuration for native mobile apps.
     * 
     */
    public Output<GlobalClientMobile> mobile() {
        return this.mobile;
    }
    /**
     * Name of the client.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the client.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configuration settings to toggle native social login for mobile native applications. Once this is set it must stay set, with both resources set to `false` in order to change the `app_type`.
     * 
     */
    @Export(name="nativeSocialLogin", type=GlobalClientNativeSocialLogin.class, parameters={})
    private Output<GlobalClientNativeSocialLogin> nativeSocialLogin;

    /**
     * @return Configuration settings to toggle native social login for mobile native applications. Once this is set it must stay set, with both resources set to `false` in order to change the `app_type`.
     * 
     */
    public Output<GlobalClientNativeSocialLogin> nativeSocialLogin() {
        return this.nativeSocialLogin;
    }
    /**
     * Set of URLs that are valid to call back from Auth0 for OIDC backchannel logout. Currently only one URL is allowed.
     * 
     */
    @Export(name="oidcBackchannelLogoutUrls", type=List.class, parameters={String.class})
    private Output<List<String>> oidcBackchannelLogoutUrls;

    /**
     * @return Set of URLs that are valid to call back from Auth0 for OIDC backchannel logout. Currently only one URL is allowed.
     * 
     */
    public Output<List<String>> oidcBackchannelLogoutUrls() {
        return this.oidcBackchannelLogoutUrls;
    }
    /**
     * Indicates whether this client will conform to strict OIDC specifications.
     * 
     */
    @Export(name="oidcConformant", type=Boolean.class, parameters={})
    private Output<Boolean> oidcConformant;

    /**
     * @return Indicates whether this client will conform to strict OIDC specifications.
     * 
     */
    public Output<Boolean> oidcConformant() {
        return this.oidcConformant;
    }
    /**
     * Defines how to proceed during an authentication transaction when `organization_usage = &#34;require&#34;`. Can be `no_prompt` (default), `pre_login_prompt` or  `post_login_prompt`.
     * 
     */
    @Export(name="organizationRequireBehavior", type=String.class, parameters={})
    private Output<String> organizationRequireBehavior;

    /**
     * @return Defines how to proceed during an authentication transaction when `organization_usage = &#34;require&#34;`. Can be `no_prompt` (default), `pre_login_prompt` or  `post_login_prompt`.
     * 
     */
    public Output<String> organizationRequireBehavior() {
        return this.organizationRequireBehavior;
    }
    /**
     * Defines how to proceed during an authentication transaction with regards to an organization. Can be `deny` (default), `allow` or `require`.
     * 
     */
    @Export(name="organizationUsage", type=String.class, parameters={})
    private Output<String> organizationUsage;

    /**
     * @return Defines how to proceed during an authentication transaction with regards to an organization. Can be `deny` (default), `allow` or `require`.
     * 
     */
    public Output<String> organizationUsage() {
        return this.organizationUsage;
    }
    /**
     * Configuration settings for the refresh tokens issued for this client.
     * 
     */
    @Export(name="refreshToken", type=GlobalClientRefreshToken.class, parameters={})
    private Output<GlobalClientRefreshToken> refreshToken;

    /**
     * @return Configuration settings for the refresh tokens issued for this client.
     * 
     */
    public Output<GlobalClientRefreshToken> refreshToken() {
        return this.refreshToken;
    }
    /**
     * List containing a map of the public cert of the signing key and the public cert of the signing key in PKCS7.
     * 
     */
    @Export(name="signingKeys", type=List.class, parameters={Map.class})
    private Output<List<Map<String,Object>>> signingKeys;

    /**
     * @return List containing a map of the public cert of the signing key and the public cert of the signing key in PKCS7.
     * 
     */
    public Output<List<Map<String,Object>>> signingKeys() {
        return this.signingKeys;
    }
    /**
     * Applies only to SSO clients and determines whether Auth0 will handle Single Sign-On (true) or whether the identity provider will (false).
     * 
     */
    @Export(name="sso", type=Boolean.class, parameters={})
    private Output<Boolean> sso;

    /**
     * @return Applies only to SSO clients and determines whether Auth0 will handle Single Sign-On (true) or whether the identity provider will (false).
     * 
     */
    public Output<Boolean> sso() {
        return this.sso;
    }
    /**
     * Indicates whether or not SSO is disabled.
     * 
     */
    @Export(name="ssoDisabled", type=Boolean.class, parameters={})
    private Output<Boolean> ssoDisabled;

    /**
     * @return Indicates whether or not SSO is disabled.
     * 
     */
    public Output<Boolean> ssoDisabled() {
        return this.ssoDisabled;
    }
    /**
     * Defines the requested authentication method for the token endpoint. Options include `none` (public client without a
     * client secret), `client_secret_post` (client uses HTTP POST parameters), `client_secret_basic` (client uses HTTP Basic).
     * Managing the authentication method through this attribute is deprecated and it will be removed in a future major
     * version. Migrate to the `auth0_client_credentials` resource to manage a client&#39;s authentication method instead. Check
     * the [MIGRATION
     * GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#client-authentication-method) on
     * how to do that.
     * 
     * @deprecated
     * Managing the authentication method through this attribute is deprecated and it will be changed to read-only in a future version. Migrate to the `auth0_client_credentials` resource to manage a client&#39;s authentication method instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#client-authentication-method) on how to do that.
     * 
     */
    @Deprecated /* Managing the authentication method through this attribute is deprecated and it will be changed to read-only in a future version. Migrate to the `auth0_client_credentials` resource to manage a client's authentication method instead. Check the [MIGRATION GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#client-authentication-method) on how to do that. */
    @Export(name="tokenEndpointAuthMethod", type=String.class, parameters={})
    private Output<String> tokenEndpointAuthMethod;

    /**
     * @return Defines the requested authentication method for the token endpoint. Options include `none` (public client without a
     * client secret), `client_secret_post` (client uses HTTP POST parameters), `client_secret_basic` (client uses HTTP Basic).
     * Managing the authentication method through this attribute is deprecated and it will be removed in a future major
     * version. Migrate to the `auth0_client_credentials` resource to manage a client&#39;s authentication method instead. Check
     * the [MIGRATION
     * GUIDE](https://github.com/auth0/terraform-provider-auth0/blob/main/MIGRATION_GUIDE.md#client-authentication-method) on
     * how to do that.
     * 
     */
    public Output<String> tokenEndpointAuthMethod() {
        return this.tokenEndpointAuthMethod;
    }
    /**
     * URLs that represent valid web origins for use with web message response mode.
     * 
     */
    @Export(name="webOrigins", type=List.class, parameters={String.class})
    private Output<List<String>> webOrigins;

    /**
     * @return URLs that represent valid web origins for use with web message response mode.
     * 
     */
    public Output<List<String>> webOrigins() {
        return this.webOrigins;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GlobalClient(String name) {
        this(name, GlobalClientArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalClient(String name, @Nullable GlobalClientArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalClient(String name, @Nullable GlobalClientArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/globalClient:GlobalClient", name, args == null ? GlobalClientArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GlobalClient(String name, Output<String> id, @Nullable GlobalClientState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/globalClient:GlobalClient", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "clientSecret",
                "signingKeys"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static GlobalClient get(String name, Output<String> id, @Nullable GlobalClientState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GlobalClient(name, id, state, options);
    }
}
