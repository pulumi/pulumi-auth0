// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.ConnectionKeysArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.ConnectionKeysState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Client Assertion JWT is a more secure alternative to client secret authentication for OIDC and Okta Workforce connections. It uses a signed JWT instead of a shared secret to authenticate the client. The resource only supports key rotation. Use the auth0.ConnectionKeys data source to read existing keys. Removing the resource from configuration will NOT DELETE the key.
 * 
 * !&gt; The triggers field is only a placeholder for an arbitrary map used to signal the provider
 * to perform a key rotation whenever any update is made.
 * If the resource is removed from the configuration, the keys will not be deleted.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.Client;
 * import com.pulumi.auth0.ClientArgs;
 * import com.pulumi.auth0.Connection;
 * import com.pulumi.auth0.ConnectionArgs;
 * import com.pulumi.auth0.inputs.ConnectionOptionsArgs;
 * import com.pulumi.auth0.ConnectionKeys;
 * import com.pulumi.auth0.ConnectionKeysArgs;
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
 *         var myClient = new Client("myClient", ClientArgs.builder()
 *             .name("My-Auth0-Client")
 *             .build());
 * 
 *         var oidc = new Connection("oidc", ConnectionArgs.builder()
 *             .name("OIDC-Connection")
 *             .strategy("oidc")
 *             .options(ConnectionOptionsArgs.builder()
 *                 .clientId(myClient.id())
 *                 .scopes(                
 *                     "ext_nested_groups",
 *                     "openid")
 *                 .issuer("https://example.com")
 *                 .authorizationEndpoint("https://example.com")
 *                 .jwksUri("https://example.com/jwks")
 *                 .type("front_channel")
 *                 .discoveryUrl("https://www.paypalobjects.com/.well-known/openid-configuration")
 *                 .tokenEndpointAuthMethod("private_key_jwt")
 *                 .tokenEndpointAuthSigningAlg("RS256")
 *                 .build())
 *             .build());
 * 
 *         // Resource used to rotate the keys for above OIDC connection
 *         var myKeys = new ConnectionKeys("myKeys", ConnectionKeysArgs.builder()
 *             .connectionId(oidc.id())
 *             .triggers(Map.ofEntries(
 *                 Map.entry("version", "1"),
 *                 Map.entry("date", "2023-10-01T00:00:00Z")
 *             ))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="auth0:index/connectionKeys:ConnectionKeys")
public class ConnectionKeys extends com.pulumi.resources.CustomResource {
    /**
     * The signing key algorithm.
     * 
     */
    @Export(name="algorithm", refs={String.class}, tree="[0]")
    private Output<String> algorithm;

    /**
     * @return The signing key algorithm.
     * 
     */
    public Output<String> algorithm() {
        return this.algorithm;
    }
    /**
     * The public certificate of the signing key.
     * 
     */
    @Export(name="cert", refs={String.class}, tree="[0]")
    private Output<String> cert;

    /**
     * @return The public certificate of the signing key.
     * 
     */
    public Output<String> cert() {
        return this.cert;
    }
    @Export(name="connectionId", refs={String.class}, tree="[0]")
    private Output<String> connectionId;

    public Output<String> connectionId() {
        return this.connectionId;
    }
    /**
     * True if the key is the current key.
     * 
     */
    @Export(name="current", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> current;

    /**
     * @return True if the key is the current key.
     * 
     */
    public Output<Boolean> current() {
        return this.current;
    }
    /**
     * The date and time when the key became the current key.
     * 
     */
    @Export(name="currentSince", refs={String.class}, tree="[0]")
    private Output<String> currentSince;

    /**
     * @return The date and time when the key became the current key.
     * 
     */
    public Output<String> currentSince() {
        return this.currentSince;
    }
    /**
     * The certificate fingerprint.
     * 
     */
    @Export(name="fingerprint", refs={String.class}, tree="[0]")
    private Output<String> fingerprint;

    /**
     * @return The certificate fingerprint.
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * The signing key use, whether for encryption or signing.
     * 
     */
    @Export(name="keyUse", refs={String.class}, tree="[0]")
    private Output<String> keyUse;

    /**
     * @return The signing key use, whether for encryption or signing.
     * 
     */
    public Output<String> keyUse() {
        return this.keyUse;
    }
    /**
     * The key ID of the signing key.
     * 
     */
    @Export(name="kid", refs={String.class}, tree="[0]")
    private Output<String> kid;

    /**
     * @return The key ID of the signing key.
     * 
     */
    public Output<String> kid() {
        return this.kid;
    }
    /**
     * True if the key is the next key.
     * 
     */
    @Export(name="next", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> next;

    /**
     * @return True if the key is the next key.
     * 
     */
    public Output<Boolean> next() {
        return this.next;
    }
    /**
     * The public certificate of the signing key in PKCS7 format.
     * 
     */
    @Export(name="pkcs", refs={String.class}, tree="[0]")
    private Output<String> pkcs;

    /**
     * @return The public certificate of the signing key in PKCS7 format.
     * 
     */
    public Output<String> pkcs() {
        return this.pkcs;
    }
    /**
     * True if the key is the previous key.
     * 
     */
    @Export(name="previous", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> previous;

    /**
     * @return True if the key is the previous key.
     * 
     */
    public Output<Boolean> previous() {
        return this.previous;
    }
    /**
     * The subject distinguished name (DN) of the certificate.
     * 
     */
    @Export(name="subjectDn", refs={String.class}, tree="[0]")
    private Output<String> subjectDn;

    /**
     * @return The subject distinguished name (DN) of the certificate.
     * 
     */
    public Output<String> subjectDn() {
        return this.subjectDn;
    }
    /**
     * The certificate thumbprint.
     * 
     */
    @Export(name="thumbprint", refs={String.class}, tree="[0]")
    private Output<String> thumbprint;

    /**
     * @return The certificate thumbprint.
     * 
     */
    public Output<String> thumbprint() {
        return this.thumbprint;
    }
    /**
     * This is an arbitrary map, which when edited shall perform rotation of keys for the corresponding connection. It can host keys like version, timestamp of last rotation etc.The field has no association with API
     * 
     */
    @Export(name="triggers", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> triggers;

    /**
     * @return This is an arbitrary map, which when edited shall perform rotation of keys for the corresponding connection. It can host keys like version, timestamp of last rotation etc.The field has no association with API
     * 
     */
    public Output<Map<String,String>> triggers() {
        return this.triggers;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectionKeys(java.lang.String name) {
        this(name, ConnectionKeysArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectionKeys(java.lang.String name, ConnectionKeysArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectionKeys(java.lang.String name, ConnectionKeysArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/connectionKeys:ConnectionKeys", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ConnectionKeys(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectionKeysState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/connectionKeys:ConnectionKeys", name, state, makeResourceOptions(options, id), false);
    }

    private static ConnectionKeysArgs makeArgs(ConnectionKeysArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ConnectionKeysArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static ConnectionKeys get(java.lang.String name, Output<java.lang.String> id, @Nullable ConnectionKeysState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectionKeys(name, id, state, options);
    }
}
