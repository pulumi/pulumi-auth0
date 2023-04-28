// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0
{
    /// <summary>
    /// With this resource, you can manage your Auth0 log streams.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Auth0 = Pulumi.Auth0;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // This is an example of an http log stream.
    ///     var myWebhook = new Auth0.LogStream("myWebhook", new()
    ///     {
    ///         Filters = new[]
    ///         {
    ///             
    ///             {
    ///                 { "name", "auth.login.fail" },
    ///                 { "type", "category" },
    ///             },
    ///             
    ///             {
    ///                 { "name", "auth.signup.fail" },
    ///                 { "type", "category" },
    ///             },
    ///         },
    ///         Name = "HTTP log stream",
    ///         Sink = new Auth0.Inputs.LogStreamSinkArgs
    ///         {
    ///             HttpAuthorization = "AKIAXXXXXXXXXXXXXXXX",
    ///             HttpContentFormat = "JSONOBJECT",
    ///             HttpContentType = "application/json",
    ///             HttpCustomHeaders = new[]
    ///             {
    ///                 
    ///                 {
    ///                     { "header", "foo" },
    ///                     { "value", "bar" },
    ///                 },
    ///             },
    ///             HttpEndpoint = "https://example.com/logs",
    ///         },
    ///         Type = "http",
    ///     });
    /// 
    ///     // This is an example of an Amazon EventBridge log stream.
    ///     var exampleAws = new Auth0.LogStream("exampleAws", new()
    ///     {
    ///         Name = "AWS Eventbridge",
    ///         Sink = new Auth0.Inputs.LogStreamSinkArgs
    ///         {
    ///             AwsAccountId = "my_account_id",
    ///             AwsRegion = "us-east-2",
    ///         },
    ///         Status = "active",
    ///         Type = "eventbridge",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// An existing log stream can be imported using its ID. # Example
    /// 
    /// ```sh
    ///  $ pulumi import auth0:index/logStream:LogStream example lst_XXXXXXXXXXXXXXXX
    /// ```
    /// </summary>
    [Auth0ResourceType("auth0:index/logStream:LogStream")]
    public partial class LogStream : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Only logs events matching these filters will be delivered by the stream. If omitted or empty, all events will be delivered.
        /// </summary>
        [Output("filters")]
        public Output<ImmutableArray<ImmutableDictionary<string, string>>> Filters { get; private set; } = null!;

        /// <summary>
        /// Name of the log stream.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The sink configuration for the log stream.
        /// </summary>
        [Output("sink")]
        public Output<Outputs.LogStreamSink> Sink { get; private set; } = null!;

        /// <summary>
        /// The current status of the log stream. Options are "active", "paused", "suspended".
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Type of the log stream, which indicates the sink provider. Options include: `eventbridge`, `eventgrid`, `http`, `datadog`, `splunk`, `sumo`, `mixpanel`, `segment`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a LogStream resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LogStream(string name, LogStreamArgs args, CustomResourceOptions? options = null)
            : base("auth0:index/logStream:LogStream", name, args ?? new LogStreamArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LogStream(string name, Input<string> id, LogStreamState? state = null, CustomResourceOptions? options = null)
            : base("auth0:index/logStream:LogStream", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing LogStream resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LogStream Get(string name, Input<string> id, LogStreamState? state = null, CustomResourceOptions? options = null)
        {
            return new LogStream(name, id, state, options);
        }
    }

    public sealed class LogStreamArgs : global::Pulumi.ResourceArgs
    {
        [Input("filters")]
        private InputList<ImmutableDictionary<string, string>>? _filters;

        /// <summary>
        /// Only logs events matching these filters will be delivered by the stream. If omitted or empty, all events will be delivered.
        /// </summary>
        public InputList<ImmutableDictionary<string, string>> Filters
        {
            get => _filters ?? (_filters = new InputList<ImmutableDictionary<string, string>>());
            set => _filters = value;
        }

        /// <summary>
        /// Name of the log stream.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The sink configuration for the log stream.
        /// </summary>
        [Input("sink", required: true)]
        public Input<Inputs.LogStreamSinkArgs> Sink { get; set; } = null!;

        /// <summary>
        /// The current status of the log stream. Options are "active", "paused", "suspended".
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Type of the log stream, which indicates the sink provider. Options include: `eventbridge`, `eventgrid`, `http`, `datadog`, `splunk`, `sumo`, `mixpanel`, `segment`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public LogStreamArgs()
        {
        }
        public static new LogStreamArgs Empty => new LogStreamArgs();
    }

    public sealed class LogStreamState : global::Pulumi.ResourceArgs
    {
        [Input("filters")]
        private InputList<ImmutableDictionary<string, string>>? _filters;

        /// <summary>
        /// Only logs events matching these filters will be delivered by the stream. If omitted or empty, all events will be delivered.
        /// </summary>
        public InputList<ImmutableDictionary<string, string>> Filters
        {
            get => _filters ?? (_filters = new InputList<ImmutableDictionary<string, string>>());
            set => _filters = value;
        }

        /// <summary>
        /// Name of the log stream.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The sink configuration for the log stream.
        /// </summary>
        [Input("sink")]
        public Input<Inputs.LogStreamSinkGetArgs>? Sink { get; set; }

        /// <summary>
        /// The current status of the log stream. Options are "active", "paused", "suspended".
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Type of the log stream, which indicates the sink provider. Options include: `eventbridge`, `eventgrid`, `http`, `datadog`, `splunk`, `sumo`, `mixpanel`, `segment`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public LogStreamState()
        {
        }
        public static new LogStreamState Empty => new LogStreamState();
    }
}
