// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With this resource, you can manage your Auth0 log streams.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := auth0.NewLogStream(ctx, "myWebhook", &auth0.LogStreamArgs{
//				Filters: pulumi.StringMapArray{
//					pulumi.StringMap{
//						"name": pulumi.String("auth.login.fail"),
//						"type": pulumi.String("category"),
//					},
//					pulumi.StringMap{
//						"name": pulumi.String("auth.signup.fail"),
//						"type": pulumi.String("category"),
//					},
//				},
//				Sink: &auth0.LogStreamSinkArgs{
//					HttpAuthorization: pulumi.String("AKIAXXXXXXXXXXXXXXXX"),
//					HttpContentFormat: pulumi.String("JSONOBJECT"),
//					HttpContentType:   pulumi.String("application/json"),
//					HttpCustomHeaders: pulumi.StringMapArray{
//						pulumi.StringMap{
//							"header": pulumi.String("foo"),
//							"value":  pulumi.String("bar"),
//						},
//					},
//					HttpEndpoint: pulumi.String("https://example.com/logs"),
//				},
//				Type: pulumi.String("http"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewLogStream(ctx, "exampleAws", &auth0.LogStreamArgs{
//				Sink: &auth0.LogStreamSinkArgs{
//					AwsAccountId: pulumi.String("my_account_id"),
//					AwsRegion:    pulumi.String("us-east-2"),
//				},
//				Status: pulumi.String("active"),
//				Type:   pulumi.String("eventbridge"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// This resource can be imported by specifying the log stream ID. # Example
//
// ```sh
//
//	$ pulumi import auth0:index/logStream:LogStream example "lst_XXXXXXXXXXXXXXXX"
//
// ```
type LogStream struct {
	pulumi.CustomResourceState

	// Only logs events matching these filters will be delivered by the stream. If omitted or empty, all events will be delivered. Filters available: `auth.ancillary.fail`, `auth.ancillary.success`, `auth.login.fail`, `auth.login.notification`, `auth.login.success`, `auth.logout.fail`, `auth.logout.success`, `auth.signup.fail`, `auth.signup.success`, `auth.silent_auth.fail`, `auth.silent_auth.success`, `auth.token_exchange.fail`, `auth.token_exchange.success`, `management.fail`, `management.success`, `system.notification`, `user.fail`, `user.notification`, `user.success`, `other`.
	Filters pulumi.StringMapArrayOutput `pulumi:"filters"`
	// Name of the log stream.
	Name pulumi.StringOutput `pulumi:"name"`
	// The sink configuration for the log stream.
	Sink LogStreamSinkOutput `pulumi:"sink"`
	// The current status of the log stream. Options are "active", "paused", "suspended".
	Status pulumi.StringOutput `pulumi:"status"`
	// Type of the log stream, which indicates the sink provider. Options include: `eventbridge`, `eventgrid`, `http`, `datadog`, `splunk`, `sumo`, `mixpanel`, `segment`.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewLogStream registers a new resource with the given unique name, arguments, and options.
func NewLogStream(ctx *pulumi.Context,
	name string, args *LogStreamArgs, opts ...pulumi.ResourceOption) (*LogStream, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Sink == nil {
		return nil, errors.New("invalid value for required argument 'Sink'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LogStream
	err := ctx.RegisterResource("auth0:index/logStream:LogStream", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLogStream gets an existing LogStream resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLogStream(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LogStreamState, opts ...pulumi.ResourceOption) (*LogStream, error) {
	var resource LogStream
	err := ctx.ReadResource("auth0:index/logStream:LogStream", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LogStream resources.
type logStreamState struct {
	// Only logs events matching these filters will be delivered by the stream. If omitted or empty, all events will be delivered. Filters available: `auth.ancillary.fail`, `auth.ancillary.success`, `auth.login.fail`, `auth.login.notification`, `auth.login.success`, `auth.logout.fail`, `auth.logout.success`, `auth.signup.fail`, `auth.signup.success`, `auth.silent_auth.fail`, `auth.silent_auth.success`, `auth.token_exchange.fail`, `auth.token_exchange.success`, `management.fail`, `management.success`, `system.notification`, `user.fail`, `user.notification`, `user.success`, `other`.
	Filters []map[string]string `pulumi:"filters"`
	// Name of the log stream.
	Name *string `pulumi:"name"`
	// The sink configuration for the log stream.
	Sink *LogStreamSink `pulumi:"sink"`
	// The current status of the log stream. Options are "active", "paused", "suspended".
	Status *string `pulumi:"status"`
	// Type of the log stream, which indicates the sink provider. Options include: `eventbridge`, `eventgrid`, `http`, `datadog`, `splunk`, `sumo`, `mixpanel`, `segment`.
	Type *string `pulumi:"type"`
}

type LogStreamState struct {
	// Only logs events matching these filters will be delivered by the stream. If omitted or empty, all events will be delivered. Filters available: `auth.ancillary.fail`, `auth.ancillary.success`, `auth.login.fail`, `auth.login.notification`, `auth.login.success`, `auth.logout.fail`, `auth.logout.success`, `auth.signup.fail`, `auth.signup.success`, `auth.silent_auth.fail`, `auth.silent_auth.success`, `auth.token_exchange.fail`, `auth.token_exchange.success`, `management.fail`, `management.success`, `system.notification`, `user.fail`, `user.notification`, `user.success`, `other`.
	Filters pulumi.StringMapArrayInput
	// Name of the log stream.
	Name pulumi.StringPtrInput
	// The sink configuration for the log stream.
	Sink LogStreamSinkPtrInput
	// The current status of the log stream. Options are "active", "paused", "suspended".
	Status pulumi.StringPtrInput
	// Type of the log stream, which indicates the sink provider. Options include: `eventbridge`, `eventgrid`, `http`, `datadog`, `splunk`, `sumo`, `mixpanel`, `segment`.
	Type pulumi.StringPtrInput
}

func (LogStreamState) ElementType() reflect.Type {
	return reflect.TypeOf((*logStreamState)(nil)).Elem()
}

type logStreamArgs struct {
	// Only logs events matching these filters will be delivered by the stream. If omitted or empty, all events will be delivered. Filters available: `auth.ancillary.fail`, `auth.ancillary.success`, `auth.login.fail`, `auth.login.notification`, `auth.login.success`, `auth.logout.fail`, `auth.logout.success`, `auth.signup.fail`, `auth.signup.success`, `auth.silent_auth.fail`, `auth.silent_auth.success`, `auth.token_exchange.fail`, `auth.token_exchange.success`, `management.fail`, `management.success`, `system.notification`, `user.fail`, `user.notification`, `user.success`, `other`.
	Filters []map[string]string `pulumi:"filters"`
	// Name of the log stream.
	Name *string `pulumi:"name"`
	// The sink configuration for the log stream.
	Sink LogStreamSink `pulumi:"sink"`
	// The current status of the log stream. Options are "active", "paused", "suspended".
	Status *string `pulumi:"status"`
	// Type of the log stream, which indicates the sink provider. Options include: `eventbridge`, `eventgrid`, `http`, `datadog`, `splunk`, `sumo`, `mixpanel`, `segment`.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a LogStream resource.
type LogStreamArgs struct {
	// Only logs events matching these filters will be delivered by the stream. If omitted or empty, all events will be delivered. Filters available: `auth.ancillary.fail`, `auth.ancillary.success`, `auth.login.fail`, `auth.login.notification`, `auth.login.success`, `auth.logout.fail`, `auth.logout.success`, `auth.signup.fail`, `auth.signup.success`, `auth.silent_auth.fail`, `auth.silent_auth.success`, `auth.token_exchange.fail`, `auth.token_exchange.success`, `management.fail`, `management.success`, `system.notification`, `user.fail`, `user.notification`, `user.success`, `other`.
	Filters pulumi.StringMapArrayInput
	// Name of the log stream.
	Name pulumi.StringPtrInput
	// The sink configuration for the log stream.
	Sink LogStreamSinkInput
	// The current status of the log stream. Options are "active", "paused", "suspended".
	Status pulumi.StringPtrInput
	// Type of the log stream, which indicates the sink provider. Options include: `eventbridge`, `eventgrid`, `http`, `datadog`, `splunk`, `sumo`, `mixpanel`, `segment`.
	Type pulumi.StringInput
}

func (LogStreamArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*logStreamArgs)(nil)).Elem()
}

type LogStreamInput interface {
	pulumi.Input

	ToLogStreamOutput() LogStreamOutput
	ToLogStreamOutputWithContext(ctx context.Context) LogStreamOutput
}

func (*LogStream) ElementType() reflect.Type {
	return reflect.TypeOf((**LogStream)(nil)).Elem()
}

func (i *LogStream) ToLogStreamOutput() LogStreamOutput {
	return i.ToLogStreamOutputWithContext(context.Background())
}

func (i *LogStream) ToLogStreamOutputWithContext(ctx context.Context) LogStreamOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogStreamOutput)
}

// LogStreamArrayInput is an input type that accepts LogStreamArray and LogStreamArrayOutput values.
// You can construct a concrete instance of `LogStreamArrayInput` via:
//
//	LogStreamArray{ LogStreamArgs{...} }
type LogStreamArrayInput interface {
	pulumi.Input

	ToLogStreamArrayOutput() LogStreamArrayOutput
	ToLogStreamArrayOutputWithContext(context.Context) LogStreamArrayOutput
}

type LogStreamArray []LogStreamInput

func (LogStreamArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogStream)(nil)).Elem()
}

func (i LogStreamArray) ToLogStreamArrayOutput() LogStreamArrayOutput {
	return i.ToLogStreamArrayOutputWithContext(context.Background())
}

func (i LogStreamArray) ToLogStreamArrayOutputWithContext(ctx context.Context) LogStreamArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogStreamArrayOutput)
}

// LogStreamMapInput is an input type that accepts LogStreamMap and LogStreamMapOutput values.
// You can construct a concrete instance of `LogStreamMapInput` via:
//
//	LogStreamMap{ "key": LogStreamArgs{...} }
type LogStreamMapInput interface {
	pulumi.Input

	ToLogStreamMapOutput() LogStreamMapOutput
	ToLogStreamMapOutputWithContext(context.Context) LogStreamMapOutput
}

type LogStreamMap map[string]LogStreamInput

func (LogStreamMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogStream)(nil)).Elem()
}

func (i LogStreamMap) ToLogStreamMapOutput() LogStreamMapOutput {
	return i.ToLogStreamMapOutputWithContext(context.Background())
}

func (i LogStreamMap) ToLogStreamMapOutputWithContext(ctx context.Context) LogStreamMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LogStreamMapOutput)
}

type LogStreamOutput struct{ *pulumi.OutputState }

func (LogStreamOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LogStream)(nil)).Elem()
}

func (o LogStreamOutput) ToLogStreamOutput() LogStreamOutput {
	return o
}

func (o LogStreamOutput) ToLogStreamOutputWithContext(ctx context.Context) LogStreamOutput {
	return o
}

// Only logs events matching these filters will be delivered by the stream. If omitted or empty, all events will be delivered. Filters available: `auth.ancillary.fail`, `auth.ancillary.success`, `auth.login.fail`, `auth.login.notification`, `auth.login.success`, `auth.logout.fail`, `auth.logout.success`, `auth.signup.fail`, `auth.signup.success`, `auth.silent_auth.fail`, `auth.silent_auth.success`, `auth.token_exchange.fail`, `auth.token_exchange.success`, `management.fail`, `management.success`, `system.notification`, `user.fail`, `user.notification`, `user.success`, `other`.
func (o LogStreamOutput) Filters() pulumi.StringMapArrayOutput {
	return o.ApplyT(func(v *LogStream) pulumi.StringMapArrayOutput { return v.Filters }).(pulumi.StringMapArrayOutput)
}

// Name of the log stream.
func (o LogStreamOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LogStream) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The sink configuration for the log stream.
func (o LogStreamOutput) Sink() LogStreamSinkOutput {
	return o.ApplyT(func(v *LogStream) LogStreamSinkOutput { return v.Sink }).(LogStreamSinkOutput)
}

// The current status of the log stream. Options are "active", "paused", "suspended".
func (o LogStreamOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *LogStream) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Type of the log stream, which indicates the sink provider. Options include: `eventbridge`, `eventgrid`, `http`, `datadog`, `splunk`, `sumo`, `mixpanel`, `segment`.
func (o LogStreamOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *LogStream) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type LogStreamArrayOutput struct{ *pulumi.OutputState }

func (LogStreamArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LogStream)(nil)).Elem()
}

func (o LogStreamArrayOutput) ToLogStreamArrayOutput() LogStreamArrayOutput {
	return o
}

func (o LogStreamArrayOutput) ToLogStreamArrayOutputWithContext(ctx context.Context) LogStreamArrayOutput {
	return o
}

func (o LogStreamArrayOutput) Index(i pulumi.IntInput) LogStreamOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LogStream {
		return vs[0].([]*LogStream)[vs[1].(int)]
	}).(LogStreamOutput)
}

type LogStreamMapOutput struct{ *pulumi.OutputState }

func (LogStreamMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LogStream)(nil)).Elem()
}

func (o LogStreamMapOutput) ToLogStreamMapOutput() LogStreamMapOutput {
	return o
}

func (o LogStreamMapOutput) ToLogStreamMapOutputWithContext(ctx context.Context) LogStreamMapOutput {
	return o
}

func (o LogStreamMapOutput) MapIndex(k pulumi.StringInput) LogStreamOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LogStream {
		return vs[0].(map[string]*LogStream)[vs[1].(string)]
	}).(LogStreamOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LogStreamInput)(nil)).Elem(), &LogStream{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogStreamArrayInput)(nil)).Elem(), LogStreamArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LogStreamMapInput)(nil)).Elem(), LogStreamMap{})
	pulumi.RegisterOutputType(LogStreamOutput{})
	pulumi.RegisterOutputType(LogStreamArrayOutput{})
	pulumi.RegisterOutputType(LogStreamMapOutput{})
}
