// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to access information about the tenant's attack protection settings.
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
//			_, err := auth0.LookupAttackProtection(ctx, map[string]interface{}{}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupAttackProtection(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*LookupAttackProtectionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAttackProtectionResult
	err := ctx.Invoke("auth0:index/getAttackProtection:getAttackProtection", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getAttackProtection.
type LookupAttackProtectionResult struct {
	// Breached password detection protects your applications from bad actors logging in with stolen credentials.
	BreachedPasswordDetections []GetAttackProtectionBreachedPasswordDetection `pulumi:"breachedPasswordDetections"`
	// Brute-force protection safeguards against a single IP address attacking a single user account.
	BruteForceProtections []GetAttackProtectionBruteForceProtection `pulumi:"bruteForceProtections"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
	SuspiciousIpThrottlings []GetAttackProtectionSuspiciousIpThrottling `pulumi:"suspiciousIpThrottlings"`
}

func LookupAttackProtectionOutput(ctx *pulumi.Context, opts ...pulumi.InvokeOption) LookupAttackProtectionResultOutput {
	return pulumi.ToOutput(0).ApplyT(func(int) (LookupAttackProtectionResultOutput, error) {
		options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
		return ctx.InvokeOutput("auth0:index/getAttackProtection:getAttackProtection", nil, LookupAttackProtectionResultOutput{}, options).(LookupAttackProtectionResultOutput), nil
	}).(LookupAttackProtectionResultOutput)
}

// A collection of values returned by getAttackProtection.
type LookupAttackProtectionResultOutput struct{ *pulumi.OutputState }

func (LookupAttackProtectionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAttackProtectionResult)(nil)).Elem()
}

func (o LookupAttackProtectionResultOutput) ToLookupAttackProtectionResultOutput() LookupAttackProtectionResultOutput {
	return o
}

func (o LookupAttackProtectionResultOutput) ToLookupAttackProtectionResultOutputWithContext(ctx context.Context) LookupAttackProtectionResultOutput {
	return o
}

// Breached password detection protects your applications from bad actors logging in with stolen credentials.
func (o LookupAttackProtectionResultOutput) BreachedPasswordDetections() GetAttackProtectionBreachedPasswordDetectionArrayOutput {
	return o.ApplyT(func(v LookupAttackProtectionResult) []GetAttackProtectionBreachedPasswordDetection {
		return v.BreachedPasswordDetections
	}).(GetAttackProtectionBreachedPasswordDetectionArrayOutput)
}

// Brute-force protection safeguards against a single IP address attacking a single user account.
func (o LookupAttackProtectionResultOutput) BruteForceProtections() GetAttackProtectionBruteForceProtectionArrayOutput {
	return o.ApplyT(func(v LookupAttackProtectionResult) []GetAttackProtectionBruteForceProtection {
		return v.BruteForceProtections
	}).(GetAttackProtectionBruteForceProtectionArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAttackProtectionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAttackProtectionResult) string { return v.Id }).(pulumi.StringOutput)
}

// Suspicious IP throttling blocks traffic from any IP address that rapidly attempts too many logins or signups.
func (o LookupAttackProtectionResultOutput) SuspiciousIpThrottlings() GetAttackProtectionSuspiciousIpThrottlingArrayOutput {
	return o.ApplyT(func(v LookupAttackProtectionResult) []GetAttackProtectionSuspiciousIpThrottling {
		return v.SuspiciousIpThrottlings
	}).(GetAttackProtectionSuspiciousIpThrottlingArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAttackProtectionResultOutput{})
}
