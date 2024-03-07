// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.ClientCredentialsArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.ClientCredentialsState;
import com.pulumi.auth0.outputs.ClientCredentialsPrivateKeyJwt;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * With this resource, you can configure the method to use when making requests to any endpoint that requires this client to authenticate.
 * 
 * &gt; Refer to the client secret rotation guide
 * for instructions on how to rotate client secrets with zero downtime.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Client;
 * import com.pulumi.auth0.ClientArgs;
 * import com.pulumi.auth0.inputs.ClientJwtConfigurationArgs;
 * import com.pulumi.auth0.ClientCredentials;
 * import com.pulumi.auth0.ClientCredentialsArgs;
 * import com.pulumi.auth0.inputs.ClientCredentialsPrivateKeyJwtArgs;
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
 *         var myClient = new Client(&#34;myClient&#34;, ClientArgs.builder()        
 *             .appType(&#34;non_interactive&#34;)
 *             .jwtConfiguration(ClientJwtConfigurationArgs.builder()
 *                 .alg(&#34;RS256&#34;)
 *                 .build())
 *             .build());
 * 
 *         var testClientCredentials = new ClientCredentials(&#34;testClientCredentials&#34;, ClientCredentialsArgs.builder()        
 *             .clientId(myClient.id())
 *             .authenticationMethod(&#34;client_secret_post&#34;)
 *             .build());
 * 
 *         var testIndex_clientCredentialsClientCredentials = new ClientCredentials(&#34;testIndex/clientCredentialsClientCredentials&#34;, ClientCredentialsArgs.builder()        
 *             .clientId(myClient.id())
 *             .authenticationMethod(&#34;client_secret_basic&#34;)
 *             .build());
 * 
 *         var testAuth0Index_clientCredentialsClientCredentials = new ClientCredentials(&#34;testAuth0Index/clientCredentialsClientCredentials&#34;, ClientCredentialsArgs.builder()        
 *             .clientId(myClient.id())
 *             .authenticationMethod(&#34;none&#34;)
 *             .build());
 * 
 *         var testAuth0Index_clientCredentialsClientCredentials1 = new ClientCredentials(&#34;testAuth0Index/clientCredentialsClientCredentials1&#34;, ClientCredentialsArgs.builder()        
 *             .clientId(myClient.id())
 *             .authenticationMethod(&#34;private_key_jwt&#34;)
 *             .privateKeyJwt(ClientCredentialsPrivateKeyJwtArgs.builder()
 *                 .credentials(ClientCredentialsPrivateKeyJwtCredentialArgs.builder()
 *                     .name(&#34;Testing Credentials 1&#34;)
 *                     .credentialType(&#34;public_key&#34;)
 *                     .algorithm(&#34;RS256&#34;)
 *                     .parseExpiryFromCert(true)
 *                     .pem(&#34;&#34;&#34;
 * -----BEGIN CERTIFICATE-----
 * MIIFWDCCA0ACCQDXqpBo3R...G9w0BAQsFADBuMQswCQYDVQQGEwJl
 * -----END CERTIFICATE-----
 *                     &#34;&#34;&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var testAuth0Index_clientCredentialsClientCredentials2 = new ClientCredentials(&#34;testAuth0Index/clientCredentialsClientCredentials2&#34;, ClientCredentialsArgs.builder()        
 *             .clientId(myClient.id())
 *             .authenticationMethod(&#34;client_secret_basic&#34;)
 *             .clientSecret(&#34;LUFqPx+sRLjbL7peYRPFmFu-bbvE7u7og4YUNe_C345=683341&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * This resource can be imported by specifying the client ID.
 * 
 * # 
 * 
 * Example:
 * 
 * ```sh
 * $ pulumi import auth0:index/clientCredentials:ClientCredentials my_creds &#34;AaiyAPdpYdesoKnqjj8HJqRn4T5titww&#34;
 * ```
 * 
 * ~&gt; Importing this resource when the `authentication_method` is set to `private_key_jwt` will force the resource to be recreated.
 * 
 * This is to be expected, because the pem file can&#39;t be checked for differences.
 * 
 */
@ResourceType(type="auth0:index/clientCredentials:ClientCredentials")
public class ClientCredentials extends com.pulumi.resources.CustomResource {
    /**
     * Configure the method to use when making requests to any endpoint that requires this client to authenticate. Options include `none` (public client without a client secret), `client_secret_post` (confidential client using HTTP POST parameters), `client_secret_basic` (confidential client using HTTP Basic), `private_key_jwt` (confidential client using a Private Key JWT).
     * 
     */
    @Export(name="authenticationMethod", refs={String.class}, tree="[0]")
    private Output<String> authenticationMethod;

    /**
     * @return Configure the method to use when making requests to any endpoint that requires this client to authenticate. Options include `none` (public client without a client secret), `client_secret_post` (confidential client using HTTP POST parameters), `client_secret_basic` (confidential client using HTTP Basic), `private_key_jwt` (confidential client using a Private Key JWT).
     * 
     */
    public Output<String> authenticationMethod() {
        return this.authenticationMethod;
    }
    /**
     * The ID of the client for which to configure the authentication method.
     * 
     */
    @Export(name="clientId", refs={String.class}, tree="[0]")
    private Output<String> clientId;

    /**
     * @return The ID of the client for which to configure the authentication method.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }
    /**
     * Secret for the client when using `client_secret_post` or `client_secret_basic` authentication method. Keep this private.
     * To access this attribute you need to add the `read:client_keys` scope to the Terraform client. Otherwise, the attribute
     * will contain an empty string. The attribute will also be an empty string in case `private_key_jwt` is selected as an
     * authentication method.
     * 
     */
    @Export(name="clientSecret", refs={String.class}, tree="[0]")
    private Output<String> clientSecret;

    /**
     * @return Secret for the client when using `client_secret_post` or `client_secret_basic` authentication method. Keep this private.
     * To access this attribute you need to add the `read:client_keys` scope to the Terraform client. Otherwise, the attribute
     * will contain an empty string. The attribute will also be an empty string in case `private_key_jwt` is selected as an
     * authentication method.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }
    /**
     * Defines `private_key_jwt` client authentication method.
     * 
     */
    @Export(name="privateKeyJwt", refs={ClientCredentialsPrivateKeyJwt.class}, tree="[0]")
    private Output</* @Nullable */ ClientCredentialsPrivateKeyJwt> privateKeyJwt;

    /**
     * @return Defines `private_key_jwt` client authentication method.
     * 
     */
    public Output<Optional<ClientCredentialsPrivateKeyJwt>> privateKeyJwt() {
        return Codegen.optional(this.privateKeyJwt);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClientCredentials(String name) {
        this(name, ClientCredentialsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClientCredentials(String name, ClientCredentialsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClientCredentials(String name, ClientCredentialsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/clientCredentials:ClientCredentials", name, args == null ? ClientCredentialsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClientCredentials(String name, Output<String> id, @Nullable ClientCredentialsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/clientCredentials:ClientCredentials", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "clientSecret"
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
    public static ClientCredentials get(String name, Output<String> id, @Nullable ClientCredentialsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClientCredentials(name, id, state, options);
    }
}
