// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With this resource, you can create and manage Forms for a tenant.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-auth0/sdk/v3/go/auth0"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"coordinates": map[string]interface{}{
//					"x": 0,
//					"y": 0,
//				},
//				"next_node": "step_ggeX",
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			tmpJSON1, err := json.Marshal([]map[string]interface{}{
//				map[string]interface{}{
//					"alias": "New step",
//					"config": map[string]interface{}{
//						"components": []interface{}{
//							map[string]interface{}{
//								"category": "FIELD",
//								"config": map[string]interface{}{
//									"max_length": 50,
//									"min_length": 1,
//									"multiline":  false,
//								},
//								"id":        "full_name",
//								"label":     "Your Name",
//								"required":  true,
//								"sensitive": false,
//								"type":      "TEXT",
//							},
//							map[string]interface{}{
//								"category": "BLOCK",
//								"config": map[string]interface{}{
//									"text": "Continue",
//								},
//								"id":   "next_button_3FbA",
//								"type": "NEXT_BUTTON",
//							},
//						},
//						"next_node": "$ending",
//					},
//					"coordinates": map[string]interface{}{
//						"x": 500,
//						"y": 0,
//					},
//					"id":   "step_ggeX",
//					"type": "STEP",
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json1 := string(tmpJSON1)
//			tmpJSON2, err := json.Marshal(map[string]interface{}{
//				"after_submit": map[string]interface{}{
//					"flow_id": "<my_flow_id>",
//				},
//				"coordinates": map[string]interface{}{
//					"x": 1250,
//					"y": 0,
//				},
//				"resume_flow": true,
//			})
//			if err != nil {
//				return err
//			}
//			json2 := string(tmpJSON2)
//			tmpJSON3, err := json.Marshal(map[string]interface{}{
//				"css": "h1 {\n  color: white;\n  text-align: center;\n}",
//			})
//			if err != nil {
//				return err
//			}
//			json3 := string(tmpJSON3)
//			tmpJSON4, err := json.Marshal(map[string]interface{}{
//				"es": map[string]interface{}{
//					"components": map[string]interface{}{
//						"rich_text_uctu": map[string]interface{}{
//							"config": map[string]interface{}{
//								"content": "<h2>Help us verify your personal information</h2><p>We want to learn more about you so that we can validate and protect your account...</p>",
//							},
//						},
//					},
//					"messages": map[string]interface{}{
//						"custom": map[string]interface{}{},
//						"errors": map[string]interface{}{
//							"ERR_ACCEPTANCE_REQUIRED": "Por favor, marca este campo para continuar.",
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json4 := string(tmpJSON4)
//			tmpJSON5, err := json.Marshal(map[string]interface{}{
//				"ERR_REQUIRED_PROPERTY": "This field is required for user kyc.",
//			})
//			if err != nil {
//				return err
//			}
//			json5 := string(tmpJSON5)
//			// Example:
//			_, err = auth0.NewForm(ctx, "my_form", &auth0.FormArgs{
//				Name:         pulumi.String("My KYC Form"),
//				Start:        pulumi.String(json0),
//				Nodes:        pulumi.String(json1),
//				Ending:       pulumi.String(json2),
//				Style:        pulumi.String(json3),
//				Translations: pulumi.String(json4),
//				Messages: auth0.FormMessageArray{
//					&auth0.FormMessageArgs{
//						Errors: pulumi.String(json5),
//					},
//				},
//				Languages: auth0.FormLanguageArray{
//					&auth0.FormLanguageArgs{
//						Default: pulumi.String("en"),
//						Primary: pulumi.String("en"),
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
//
// ## Import
//
// This resource can be imported using the form ID.
//
// #
//
// Example:
//
// ```sh
// $ pulumi import auth0:index/form:Form my_form "ap_ojkKbiPMG6J5E5VCKdeCzK"
// ```
type Form struct {
	pulumi.CustomResourceState

	// Submission configuration of the form. (JSON encoded)
	Ending pulumi.StringPtrOutput `pulumi:"ending"`
	// Language specific configuration for the form.
	Languages FormLanguageArrayOutput `pulumi:"languages"`
	// Message specific configuration for the form.
	Messages FormMessageArrayOutput `pulumi:"messages"`
	// Name of the form.
	Name pulumi.StringOutput `pulumi:"name"`
	// Nodes of the form. (JSON encoded)
	Nodes pulumi.StringPtrOutput `pulumi:"nodes"`
	// Input setup of the form. (JSON encoded)
	Start pulumi.StringPtrOutput `pulumi:"start"`
	// Style specific configuration for the form. (JSON encoded)
	Style pulumi.StringPtrOutput `pulumi:"style"`
	// Translations of the form. (JSON encoded)
	Translations pulumi.StringPtrOutput `pulumi:"translations"`
}

// NewForm registers a new resource with the given unique name, arguments, and options.
func NewForm(ctx *pulumi.Context,
	name string, args *FormArgs, opts ...pulumi.ResourceOption) (*Form, error) {
	if args == nil {
		args = &FormArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Form
	err := ctx.RegisterResource("auth0:index/form:Form", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetForm gets an existing Form resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetForm(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FormState, opts ...pulumi.ResourceOption) (*Form, error) {
	var resource Form
	err := ctx.ReadResource("auth0:index/form:Form", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Form resources.
type formState struct {
	// Submission configuration of the form. (JSON encoded)
	Ending *string `pulumi:"ending"`
	// Language specific configuration for the form.
	Languages []FormLanguage `pulumi:"languages"`
	// Message specific configuration for the form.
	Messages []FormMessage `pulumi:"messages"`
	// Name of the form.
	Name *string `pulumi:"name"`
	// Nodes of the form. (JSON encoded)
	Nodes *string `pulumi:"nodes"`
	// Input setup of the form. (JSON encoded)
	Start *string `pulumi:"start"`
	// Style specific configuration for the form. (JSON encoded)
	Style *string `pulumi:"style"`
	// Translations of the form. (JSON encoded)
	Translations *string `pulumi:"translations"`
}

type FormState struct {
	// Submission configuration of the form. (JSON encoded)
	Ending pulumi.StringPtrInput
	// Language specific configuration for the form.
	Languages FormLanguageArrayInput
	// Message specific configuration for the form.
	Messages FormMessageArrayInput
	// Name of the form.
	Name pulumi.StringPtrInput
	// Nodes of the form. (JSON encoded)
	Nodes pulumi.StringPtrInput
	// Input setup of the form. (JSON encoded)
	Start pulumi.StringPtrInput
	// Style specific configuration for the form. (JSON encoded)
	Style pulumi.StringPtrInput
	// Translations of the form. (JSON encoded)
	Translations pulumi.StringPtrInput
}

func (FormState) ElementType() reflect.Type {
	return reflect.TypeOf((*formState)(nil)).Elem()
}

type formArgs struct {
	// Submission configuration of the form. (JSON encoded)
	Ending *string `pulumi:"ending"`
	// Language specific configuration for the form.
	Languages []FormLanguage `pulumi:"languages"`
	// Message specific configuration for the form.
	Messages []FormMessage `pulumi:"messages"`
	// Name of the form.
	Name *string `pulumi:"name"`
	// Nodes of the form. (JSON encoded)
	Nodes *string `pulumi:"nodes"`
	// Input setup of the form. (JSON encoded)
	Start *string `pulumi:"start"`
	// Style specific configuration for the form. (JSON encoded)
	Style *string `pulumi:"style"`
	// Translations of the form. (JSON encoded)
	Translations *string `pulumi:"translations"`
}

// The set of arguments for constructing a Form resource.
type FormArgs struct {
	// Submission configuration of the form. (JSON encoded)
	Ending pulumi.StringPtrInput
	// Language specific configuration for the form.
	Languages FormLanguageArrayInput
	// Message specific configuration for the form.
	Messages FormMessageArrayInput
	// Name of the form.
	Name pulumi.StringPtrInput
	// Nodes of the form. (JSON encoded)
	Nodes pulumi.StringPtrInput
	// Input setup of the form. (JSON encoded)
	Start pulumi.StringPtrInput
	// Style specific configuration for the form. (JSON encoded)
	Style pulumi.StringPtrInput
	// Translations of the form. (JSON encoded)
	Translations pulumi.StringPtrInput
}

func (FormArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*formArgs)(nil)).Elem()
}

type FormInput interface {
	pulumi.Input

	ToFormOutput() FormOutput
	ToFormOutputWithContext(ctx context.Context) FormOutput
}

func (*Form) ElementType() reflect.Type {
	return reflect.TypeOf((**Form)(nil)).Elem()
}

func (i *Form) ToFormOutput() FormOutput {
	return i.ToFormOutputWithContext(context.Background())
}

func (i *Form) ToFormOutputWithContext(ctx context.Context) FormOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FormOutput)
}

// FormArrayInput is an input type that accepts FormArray and FormArrayOutput values.
// You can construct a concrete instance of `FormArrayInput` via:
//
//	FormArray{ FormArgs{...} }
type FormArrayInput interface {
	pulumi.Input

	ToFormArrayOutput() FormArrayOutput
	ToFormArrayOutputWithContext(context.Context) FormArrayOutput
}

type FormArray []FormInput

func (FormArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Form)(nil)).Elem()
}

func (i FormArray) ToFormArrayOutput() FormArrayOutput {
	return i.ToFormArrayOutputWithContext(context.Background())
}

func (i FormArray) ToFormArrayOutputWithContext(ctx context.Context) FormArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FormArrayOutput)
}

// FormMapInput is an input type that accepts FormMap and FormMapOutput values.
// You can construct a concrete instance of `FormMapInput` via:
//
//	FormMap{ "key": FormArgs{...} }
type FormMapInput interface {
	pulumi.Input

	ToFormMapOutput() FormMapOutput
	ToFormMapOutputWithContext(context.Context) FormMapOutput
}

type FormMap map[string]FormInput

func (FormMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Form)(nil)).Elem()
}

func (i FormMap) ToFormMapOutput() FormMapOutput {
	return i.ToFormMapOutputWithContext(context.Background())
}

func (i FormMap) ToFormMapOutputWithContext(ctx context.Context) FormMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FormMapOutput)
}

type FormOutput struct{ *pulumi.OutputState }

func (FormOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Form)(nil)).Elem()
}

func (o FormOutput) ToFormOutput() FormOutput {
	return o
}

func (o FormOutput) ToFormOutputWithContext(ctx context.Context) FormOutput {
	return o
}

// Submission configuration of the form. (JSON encoded)
func (o FormOutput) Ending() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Form) pulumi.StringPtrOutput { return v.Ending }).(pulumi.StringPtrOutput)
}

// Language specific configuration for the form.
func (o FormOutput) Languages() FormLanguageArrayOutput {
	return o.ApplyT(func(v *Form) FormLanguageArrayOutput { return v.Languages }).(FormLanguageArrayOutput)
}

// Message specific configuration for the form.
func (o FormOutput) Messages() FormMessageArrayOutput {
	return o.ApplyT(func(v *Form) FormMessageArrayOutput { return v.Messages }).(FormMessageArrayOutput)
}

// Name of the form.
func (o FormOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Form) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Nodes of the form. (JSON encoded)
func (o FormOutput) Nodes() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Form) pulumi.StringPtrOutput { return v.Nodes }).(pulumi.StringPtrOutput)
}

// Input setup of the form. (JSON encoded)
func (o FormOutput) Start() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Form) pulumi.StringPtrOutput { return v.Start }).(pulumi.StringPtrOutput)
}

// Style specific configuration for the form. (JSON encoded)
func (o FormOutput) Style() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Form) pulumi.StringPtrOutput { return v.Style }).(pulumi.StringPtrOutput)
}

// Translations of the form. (JSON encoded)
func (o FormOutput) Translations() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Form) pulumi.StringPtrOutput { return v.Translations }).(pulumi.StringPtrOutput)
}

type FormArrayOutput struct{ *pulumi.OutputState }

func (FormArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Form)(nil)).Elem()
}

func (o FormArrayOutput) ToFormArrayOutput() FormArrayOutput {
	return o
}

func (o FormArrayOutput) ToFormArrayOutputWithContext(ctx context.Context) FormArrayOutput {
	return o
}

func (o FormArrayOutput) Index(i pulumi.IntInput) FormOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Form {
		return vs[0].([]*Form)[vs[1].(int)]
	}).(FormOutput)
}

type FormMapOutput struct{ *pulumi.OutputState }

func (FormMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Form)(nil)).Elem()
}

func (o FormMapOutput) ToFormMapOutput() FormMapOutput {
	return o
}

func (o FormMapOutput) ToFormMapOutputWithContext(ctx context.Context) FormMapOutput {
	return o
}

func (o FormMapOutput) MapIndex(k pulumi.StringInput) FormOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Form {
		return vs[0].(map[string]*Form)[vs[1].(string)]
	}).(FormOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FormInput)(nil)).Elem(), &Form{})
	pulumi.RegisterInputType(reflect.TypeOf((*FormArrayInput)(nil)).Elem(), FormArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FormMapInput)(nil)).Elem(), FormMap{})
	pulumi.RegisterOutputType(FormOutput{})
	pulumi.RegisterOutputType(FormArrayOutput{})
	pulumi.RegisterOutputType(FormMapOutput{})
}
