// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * With Auth0, you can have standard welcome, password reset, and account verification email-based workflows built right into Auth0. This resource allows you to configure email templates to customize the look, feel, and sender identities of emails sent by Auth0. Used in conjunction with configured email providers.
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-auth0/blob/master/website/docs/r/email_template.html.md.
 */
export class EmailTemplate extends pulumi.CustomResource {
    /**
     * Get an existing EmailTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EmailTemplateState, opts?: pulumi.CustomResourceOptions): EmailTemplate {
        return new EmailTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/emailTemplate:EmailTemplate';

    /**
     * Returns true if the given object is an instance of EmailTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EmailTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EmailTemplate.__pulumiType;
    }

    /**
     * String. Body of the email template. You can include [common variables](https://auth0.com/docs/email/templates#common-variables).
     */
    public readonly body!: pulumi.Output<string>;
    /**
     * Boolean. Indicates whether or not the template is enabled.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * String. Email address to use as the sender. You can include [common variables](https://auth0.com/docs/email/templates#common-variables).
     */
    public readonly from!: pulumi.Output<string>;
    /**
     * String. URL to redirect the user to after a successful action. [Learn more](https://auth0.com/docs/email/templates#configuring-the-redirect-to-url).
     */
    public readonly resultUrl!: pulumi.Output<string | undefined>;
    /**
     * String. Subject line of the email. You can include [common variables](https://auth0.com/docs/email/templates#common-variables).
     */
    public readonly subject!: pulumi.Output<string>;
    /**
     * String. Syntax of the template body. You can use either text or HTML + Liquid syntax.
     */
    public readonly syntax!: pulumi.Output<string>;
    /**
     * String. Template name. Options include `verifyEmail`, `resetEmail`, `welcomeEmail`, `blockedAccount`, `stolenCredentials`, `enrollmentEmail`, `mfaOobCode`, `changePassword` (legacy), and `passwordReset` (legacy).
     */
    public readonly template!: pulumi.Output<string>;
    /**
     * Integer. Number of seconds during which the link within the email will be valid.
     */
    public readonly urlLifetimeInSeconds!: pulumi.Output<number | undefined>;

    /**
     * Create a EmailTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EmailTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EmailTemplateArgs | EmailTemplateState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as EmailTemplateState | undefined;
            inputs["body"] = state ? state.body : undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["from"] = state ? state.from : undefined;
            inputs["resultUrl"] = state ? state.resultUrl : undefined;
            inputs["subject"] = state ? state.subject : undefined;
            inputs["syntax"] = state ? state.syntax : undefined;
            inputs["template"] = state ? state.template : undefined;
            inputs["urlLifetimeInSeconds"] = state ? state.urlLifetimeInSeconds : undefined;
        } else {
            const args = argsOrState as EmailTemplateArgs | undefined;
            if (!args || args.body === undefined) {
                throw new Error("Missing required property 'body'");
            }
            if (!args || args.enabled === undefined) {
                throw new Error("Missing required property 'enabled'");
            }
            if (!args || args.from === undefined) {
                throw new Error("Missing required property 'from'");
            }
            if (!args || args.subject === undefined) {
                throw new Error("Missing required property 'subject'");
            }
            if (!args || args.syntax === undefined) {
                throw new Error("Missing required property 'syntax'");
            }
            if (!args || args.template === undefined) {
                throw new Error("Missing required property 'template'");
            }
            inputs["body"] = args ? args.body : undefined;
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["from"] = args ? args.from : undefined;
            inputs["resultUrl"] = args ? args.resultUrl : undefined;
            inputs["subject"] = args ? args.subject : undefined;
            inputs["syntax"] = args ? args.syntax : undefined;
            inputs["template"] = args ? args.template : undefined;
            inputs["urlLifetimeInSeconds"] = args ? args.urlLifetimeInSeconds : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(EmailTemplate.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EmailTemplate resources.
 */
export interface EmailTemplateState {
    /**
     * String. Body of the email template. You can include [common variables](https://auth0.com/docs/email/templates#common-variables).
     */
    readonly body?: pulumi.Input<string>;
    /**
     * Boolean. Indicates whether or not the template is enabled.
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * String. Email address to use as the sender. You can include [common variables](https://auth0.com/docs/email/templates#common-variables).
     */
    readonly from?: pulumi.Input<string>;
    /**
     * String. URL to redirect the user to after a successful action. [Learn more](https://auth0.com/docs/email/templates#configuring-the-redirect-to-url).
     */
    readonly resultUrl?: pulumi.Input<string>;
    /**
     * String. Subject line of the email. You can include [common variables](https://auth0.com/docs/email/templates#common-variables).
     */
    readonly subject?: pulumi.Input<string>;
    /**
     * String. Syntax of the template body. You can use either text or HTML + Liquid syntax.
     */
    readonly syntax?: pulumi.Input<string>;
    /**
     * String. Template name. Options include `verifyEmail`, `resetEmail`, `welcomeEmail`, `blockedAccount`, `stolenCredentials`, `enrollmentEmail`, `mfaOobCode`, `changePassword` (legacy), and `passwordReset` (legacy).
     */
    readonly template?: pulumi.Input<string>;
    /**
     * Integer. Number of seconds during which the link within the email will be valid.
     */
    readonly urlLifetimeInSeconds?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a EmailTemplate resource.
 */
export interface EmailTemplateArgs {
    /**
     * String. Body of the email template. You can include [common variables](https://auth0.com/docs/email/templates#common-variables).
     */
    readonly body: pulumi.Input<string>;
    /**
     * Boolean. Indicates whether or not the template is enabled.
     */
    readonly enabled: pulumi.Input<boolean>;
    /**
     * String. Email address to use as the sender. You can include [common variables](https://auth0.com/docs/email/templates#common-variables).
     */
    readonly from: pulumi.Input<string>;
    /**
     * String. URL to redirect the user to after a successful action. [Learn more](https://auth0.com/docs/email/templates#configuring-the-redirect-to-url).
     */
    readonly resultUrl?: pulumi.Input<string>;
    /**
     * String. Subject line of the email. You can include [common variables](https://auth0.com/docs/email/templates#common-variables).
     */
    readonly subject: pulumi.Input<string>;
    /**
     * String. Syntax of the template body. You can use either text or HTML + Liquid syntax.
     */
    readonly syntax: pulumi.Input<string>;
    /**
     * String. Template name. Options include `verifyEmail`, `resetEmail`, `welcomeEmail`, `blockedAccount`, `stolenCredentials`, `enrollmentEmail`, `mfaOobCode`, `changePassword` (legacy), and `passwordReset` (legacy).
     */
    readonly template: pulumi.Input<string>;
    /**
     * Integer. Number of seconds during which the link within the email will be valid.
     */
    readonly urlLifetimeInSeconds?: pulumi.Input<number>;
}
