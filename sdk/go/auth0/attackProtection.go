// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Auth0 can detect attacks and stop malicious attempts to access your application such as blocking traffic from certain IPs and displaying CAPTCHAs.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
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
//			_, err := auth0.NewAttackProtection(ctx, "my_protection", &auth0.AttackProtectionArgs{
//				SuspiciousIpThrottling: &auth0.AttackProtectionSuspiciousIpThrottlingArgs{
//					Enabled: pulumi.Bool(true),
//					Shields: pulumi.StringArray{
//						pulumi.String("admin_notification"),
//						pulumi.String("block"),
//					},
//					Allowlists: pulumi.StringArray{
//						pulumi.String("192.168.1.1"),
//					},
//					PreLogin: &auth0.AttackProtectionSuspiciousIpThrottlingPreLoginArgs{
//						MaxAttempts: pulumi.Int(100),
//						Rate:        pulumi.Int(864000),
//					},
//					PreUserRegistration: &auth0.AttackProtectionSuspiciousIpThrottlingPreUserRegistrationArgs{
//						MaxAttempts: pulumi.Int(50),
//						Rate:        pulumi.Int(1200),
//					},
//				},
//				BruteForceProtection: &auth0.AttackProtectionBruteForceProtectionArgs{
//					Allowlists: pulumi.StringArray{
//						pulumi.String("127.0.0.1"),
//					},
//					Enabled:     pulumi.Bool(true),
//					MaxAttempts: pulumi.Int(5),
//					Mode:        pulumi.String("count_per_identifier_and_ip"),
//					Shields: pulumi.StringArray{
//						pulumi.String("block"),
//						pulumi.String("user_notification"),
//					},
//				},
//				BreachedPasswordDetection: &auth0.AttackProtectionBreachedPasswordDetectionArgs{
//					AdminNotificationFrequencies: pulumi.StringArray{
//						pulumi.String("daily"),
//					},
//					Enabled: pulumi.Bool(true),
//					Method:  pulumi.String("standard"),
//					Shields: pulumi.StringArray{
//						pulumi.String("admin_notification"),
//						pulumi.String("block"),
//					},
//					PreUserRegistration: &auth0.AttackProtectionBreachedPasswordDetectionPreUserRegistrationArgs{
//						Shields: pulumi.StringArray{
//							pulumi.String("block"),
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// As this is not a resource identifiable by an ID within the Auth0 Management API,
//
// attack_protection can be imported using a random string.
//
// #
//
// We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4)
//
// #
//
// Example:
//
// ```sh
// $ pulumi import auth0:index/attackProtection:AttackProtection my_protection "24940d4b-4bd4-44e7-894e-f92e4de36a40"
// ```
type AttackProtection struct {
	pulumi.CustomResourceState

	// Breached password detection protects your applications from bad actors logging in with stolen credentials.
	BreachedPasswordDetection AttackProtectionBreachedPasswordDetectionOutput `pulumi:"breachedPasswordDetection"`
	// Brute-force protection safeguards against a single IP address attacking a single user account.
	BruteForceProtection AttackProtectionBruteForceProtectionOutput `pulumi:"bruteForceProtection"`
	// Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
	SuspiciousIpThrottling AttackProtectionSuspiciousIpThrottlingOutput `pulumi:"suspiciousIpThrottling"`
}

// NewAttackProtection registers a new resource with the given unique name, arguments, and options.
func NewAttackProtection(ctx *pulumi.Context,
	name string, args *AttackProtectionArgs, opts ...pulumi.ResourceOption) (*AttackProtection, error) {
	if args == nil {
		args = &AttackProtectionArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AttackProtection
	err := ctx.RegisterResource("auth0:index/attackProtection:AttackProtection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAttackProtection gets an existing AttackProtection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAttackProtection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AttackProtectionState, opts ...pulumi.ResourceOption) (*AttackProtection, error) {
	var resource AttackProtection
	err := ctx.ReadResource("auth0:index/attackProtection:AttackProtection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AttackProtection resources.
type attackProtectionState struct {
	// Breached password detection protects your applications from bad actors logging in with stolen credentials.
	BreachedPasswordDetection *AttackProtectionBreachedPasswordDetection `pulumi:"breachedPasswordDetection"`
	// Brute-force protection safeguards against a single IP address attacking a single user account.
	BruteForceProtection *AttackProtectionBruteForceProtection `pulumi:"bruteForceProtection"`
	// Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
	SuspiciousIpThrottling *AttackProtectionSuspiciousIpThrottling `pulumi:"suspiciousIpThrottling"`
}

type AttackProtectionState struct {
	// Breached password detection protects your applications from bad actors logging in with stolen credentials.
	BreachedPasswordDetection AttackProtectionBreachedPasswordDetectionPtrInput
	// Brute-force protection safeguards against a single IP address attacking a single user account.
	BruteForceProtection AttackProtectionBruteForceProtectionPtrInput
	// Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
	SuspiciousIpThrottling AttackProtectionSuspiciousIpThrottlingPtrInput
}

func (AttackProtectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*attackProtectionState)(nil)).Elem()
}

type attackProtectionArgs struct {
	// Breached password detection protects your applications from bad actors logging in with stolen credentials.
	BreachedPasswordDetection *AttackProtectionBreachedPasswordDetection `pulumi:"breachedPasswordDetection"`
	// Brute-force protection safeguards against a single IP address attacking a single user account.
	BruteForceProtection *AttackProtectionBruteForceProtection `pulumi:"bruteForceProtection"`
	// Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
	SuspiciousIpThrottling *AttackProtectionSuspiciousIpThrottling `pulumi:"suspiciousIpThrottling"`
}

// The set of arguments for constructing a AttackProtection resource.
type AttackProtectionArgs struct {
	// Breached password detection protects your applications from bad actors logging in with stolen credentials.
	BreachedPasswordDetection AttackProtectionBreachedPasswordDetectionPtrInput
	// Brute-force protection safeguards against a single IP address attacking a single user account.
	BruteForceProtection AttackProtectionBruteForceProtectionPtrInput
	// Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
	SuspiciousIpThrottling AttackProtectionSuspiciousIpThrottlingPtrInput
}

func (AttackProtectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*attackProtectionArgs)(nil)).Elem()
}

type AttackProtectionInput interface {
	pulumi.Input

	ToAttackProtectionOutput() AttackProtectionOutput
	ToAttackProtectionOutputWithContext(ctx context.Context) AttackProtectionOutput
}

func (*AttackProtection) ElementType() reflect.Type {
	return reflect.TypeOf((**AttackProtection)(nil)).Elem()
}

func (i *AttackProtection) ToAttackProtectionOutput() AttackProtectionOutput {
	return i.ToAttackProtectionOutputWithContext(context.Background())
}

func (i *AttackProtection) ToAttackProtectionOutputWithContext(ctx context.Context) AttackProtectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AttackProtectionOutput)
}

// AttackProtectionArrayInput is an input type that accepts AttackProtectionArray and AttackProtectionArrayOutput values.
// You can construct a concrete instance of `AttackProtectionArrayInput` via:
//
//	AttackProtectionArray{ AttackProtectionArgs{...} }
type AttackProtectionArrayInput interface {
	pulumi.Input

	ToAttackProtectionArrayOutput() AttackProtectionArrayOutput
	ToAttackProtectionArrayOutputWithContext(context.Context) AttackProtectionArrayOutput
}

type AttackProtectionArray []AttackProtectionInput

func (AttackProtectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AttackProtection)(nil)).Elem()
}

func (i AttackProtectionArray) ToAttackProtectionArrayOutput() AttackProtectionArrayOutput {
	return i.ToAttackProtectionArrayOutputWithContext(context.Background())
}

func (i AttackProtectionArray) ToAttackProtectionArrayOutputWithContext(ctx context.Context) AttackProtectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AttackProtectionArrayOutput)
}

// AttackProtectionMapInput is an input type that accepts AttackProtectionMap and AttackProtectionMapOutput values.
// You can construct a concrete instance of `AttackProtectionMapInput` via:
//
//	AttackProtectionMap{ "key": AttackProtectionArgs{...} }
type AttackProtectionMapInput interface {
	pulumi.Input

	ToAttackProtectionMapOutput() AttackProtectionMapOutput
	ToAttackProtectionMapOutputWithContext(context.Context) AttackProtectionMapOutput
}

type AttackProtectionMap map[string]AttackProtectionInput

func (AttackProtectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AttackProtection)(nil)).Elem()
}

func (i AttackProtectionMap) ToAttackProtectionMapOutput() AttackProtectionMapOutput {
	return i.ToAttackProtectionMapOutputWithContext(context.Background())
}

func (i AttackProtectionMap) ToAttackProtectionMapOutputWithContext(ctx context.Context) AttackProtectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AttackProtectionMapOutput)
}

type AttackProtectionOutput struct{ *pulumi.OutputState }

func (AttackProtectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AttackProtection)(nil)).Elem()
}

func (o AttackProtectionOutput) ToAttackProtectionOutput() AttackProtectionOutput {
	return o
}

func (o AttackProtectionOutput) ToAttackProtectionOutputWithContext(ctx context.Context) AttackProtectionOutput {
	return o
}

// Breached password detection protects your applications from bad actors logging in with stolen credentials.
func (o AttackProtectionOutput) BreachedPasswordDetection() AttackProtectionBreachedPasswordDetectionOutput {
	return o.ApplyT(func(v *AttackProtection) AttackProtectionBreachedPasswordDetectionOutput {
		return v.BreachedPasswordDetection
	}).(AttackProtectionBreachedPasswordDetectionOutput)
}

// Brute-force protection safeguards against a single IP address attacking a single user account.
func (o AttackProtectionOutput) BruteForceProtection() AttackProtectionBruteForceProtectionOutput {
	return o.ApplyT(func(v *AttackProtection) AttackProtectionBruteForceProtectionOutput { return v.BruteForceProtection }).(AttackProtectionBruteForceProtectionOutput)
}

// Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
func (o AttackProtectionOutput) SuspiciousIpThrottling() AttackProtectionSuspiciousIpThrottlingOutput {
	return o.ApplyT(func(v *AttackProtection) AttackProtectionSuspiciousIpThrottlingOutput {
		return v.SuspiciousIpThrottling
	}).(AttackProtectionSuspiciousIpThrottlingOutput)
}

type AttackProtectionArrayOutput struct{ *pulumi.OutputState }

func (AttackProtectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AttackProtection)(nil)).Elem()
}

func (o AttackProtectionArrayOutput) ToAttackProtectionArrayOutput() AttackProtectionArrayOutput {
	return o
}

func (o AttackProtectionArrayOutput) ToAttackProtectionArrayOutputWithContext(ctx context.Context) AttackProtectionArrayOutput {
	return o
}

func (o AttackProtectionArrayOutput) Index(i pulumi.IntInput) AttackProtectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AttackProtection {
		return vs[0].([]*AttackProtection)[vs[1].(int)]
	}).(AttackProtectionOutput)
}

type AttackProtectionMapOutput struct{ *pulumi.OutputState }

func (AttackProtectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AttackProtection)(nil)).Elem()
}

func (o AttackProtectionMapOutput) ToAttackProtectionMapOutput() AttackProtectionMapOutput {
	return o
}

func (o AttackProtectionMapOutput) ToAttackProtectionMapOutputWithContext(ctx context.Context) AttackProtectionMapOutput {
	return o
}

func (o AttackProtectionMapOutput) MapIndex(k pulumi.StringInput) AttackProtectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AttackProtection {
		return vs[0].(map[string]*AttackProtection)[vs[1].(string)]
	}).(AttackProtectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AttackProtectionInput)(nil)).Elem(), &AttackProtection{})
	pulumi.RegisterInputType(reflect.TypeOf((*AttackProtectionArrayInput)(nil)).Elem(), AttackProtectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AttackProtectionMapInput)(nil)).Elem(), AttackProtectionMap{})
	pulumi.RegisterOutputType(AttackProtectionOutput{})
	pulumi.RegisterOutputType(AttackProtectionArrayOutput{})
	pulumi.RegisterOutputType(AttackProtectionMapOutput{})
}
