// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0;

import com.pulumi.auth0.LogStreamArgs;
import com.pulumi.auth0.Utilities;
import com.pulumi.auth0.inputs.LogStreamState;
import com.pulumi.auth0.outputs.LogStreamSink;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * With this resource, you can manage your Auth0 log streams.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.auth0.LogStream;
 * import com.pulumi.auth0.LogStreamArgs;
 * import com.pulumi.auth0.inputs.LogStreamSinkArgs;
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
 *         var myWebhook = new LogStream(&#34;myWebhook&#34;, LogStreamArgs.builder()        
 *             .filters(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;name&#34;, &#34;auth.login.fail&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;category&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;name&#34;, &#34;auth.signup.fail&#34;),
 *                     Map.entry(&#34;type&#34;, &#34;category&#34;)
 *                 ))
 *             .sink(LogStreamSinkArgs.builder()
 *                 .httpAuthorization(&#34;AKIAXXXXXXXXXXXXXXXX&#34;)
 *                 .httpContentFormat(&#34;JSONOBJECT&#34;)
 *                 .httpContentType(&#34;application/json&#34;)
 *                 .httpCustomHeaders(Map.ofEntries(
 *                     Map.entry(&#34;header&#34;, &#34;foo&#34;),
 *                     Map.entry(&#34;value&#34;, &#34;bar&#34;)
 *                 ))
 *                 .httpEndpoint(&#34;https://example.com/logs&#34;)
 *                 .build())
 *             .type(&#34;http&#34;)
 *             .build());
 * 
 *         var exampleAws = new LogStream(&#34;exampleAws&#34;, LogStreamArgs.builder()        
 *             .sink(LogStreamSinkArgs.builder()
 *                 .awsAccountId(&#34;my_account_id&#34;)
 *                 .awsRegion(&#34;us-east-2&#34;)
 *                 .build())
 *             .status(&#34;active&#34;)
 *             .type(&#34;eventbridge&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource can be imported by specifying the log stream ID.
 * 
 * # 
 * 
 *  Example:
 * 
 * ```sh
 * $ pulumi import auth0:index/logStream:LogStream example &#34;lst_XXXXXXXXXXXXXXXX&#34;
 * ```
 * 
 */
@ResourceType(type="auth0:index/logStream:LogStream")
public class LogStream extends com.pulumi.resources.CustomResource {
    /**
     * Only logs events matching these filters will be delivered by the stream. If omitted or empty, all events will be delivered. Filters available: `auth.ancillary.fail`, `auth.ancillary.success`, `auth.login.fail`, `auth.login.notification`, `auth.login.success`, `auth.logout.fail`, `auth.logout.success`, `auth.signup.fail`, `auth.signup.success`, `auth.silent_auth.fail`, `auth.silent_auth.success`, `auth.token_exchange.fail`, `auth.token_exchange.success`, `management.fail`, `management.success`, `system.notification`, `user.fail`, `user.notification`, `user.success`, `other`.
     * 
     */
    @Export(name="filters", refs={List.class,Map.class,String.class}, tree="[0,[1,2,2]]")
    private Output</* @Nullable */ List<Map<String,String>>> filters;

    /**
     * @return Only logs events matching these filters will be delivered by the stream. If omitted or empty, all events will be delivered. Filters available: `auth.ancillary.fail`, `auth.ancillary.success`, `auth.login.fail`, `auth.login.notification`, `auth.login.success`, `auth.logout.fail`, `auth.logout.success`, `auth.signup.fail`, `auth.signup.success`, `auth.silent_auth.fail`, `auth.silent_auth.success`, `auth.token_exchange.fail`, `auth.token_exchange.success`, `management.fail`, `management.success`, `system.notification`, `user.fail`, `user.notification`, `user.success`, `other`.
     * 
     */
    public Output<Optional<List<Map<String,String>>>> filters() {
        return Codegen.optional(this.filters);
    }
    /**
     * Name of the log stream.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the log stream.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The sink configuration for the log stream.
     * 
     */
    @Export(name="sink", refs={LogStreamSink.class}, tree="[0]")
    private Output<LogStreamSink> sink;

    /**
     * @return The sink configuration for the log stream.
     * 
     */
    public Output<LogStreamSink> sink() {
        return this.sink;
    }
    /**
     * The current status of the log stream. Options are &#34;active&#34;, &#34;paused&#34;, &#34;suspended&#34;.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The current status of the log stream. Options are &#34;active&#34;, &#34;paused&#34;, &#34;suspended&#34;.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Type of the log stream, which indicates the sink provider. Options include: `eventbridge`, `eventgrid`, `http`, `datadog`, `splunk`, `sumo`, `mixpanel`, `segment`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of the log stream, which indicates the sink provider. Options include: `eventbridge`, `eventgrid`, `http`, `datadog`, `splunk`, `sumo`, `mixpanel`, `segment`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogStream(String name) {
        this(name, LogStreamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogStream(String name, LogStreamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogStream(String name, LogStreamArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/logStream:LogStream", name, args == null ? LogStreamArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogStream(String name, Output<String> id, @Nullable LogStreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("auth0:index/logStream:LogStream", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static LogStream get(String name, Output<String> id, @Nullable LogStreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogStream(name, id, state, options);
    }
}
