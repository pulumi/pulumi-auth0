// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * With Auth0, you can have standard welcome, password reset, and account verification email-based workflows built right into Auth0. This resource allows you to configure email providers, so you can route all emails that are part of Auth0's authentication workflows through the supported high-volume email service of your choice.
 *
 * !> This resource manages to create a max of 1 email provider for a tenant.
 * To avoid potential issues, it is recommended not to try creating multiple email providers on the same tenant.
 *
 * !> If you are using the `auth0.EmailProvider` resource to create a `custom` email provider, you must ensure an action is created first with `custom-email-provider` as the supportedTriggers
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as auth0 from "@pulumi/auth0";
 *
 * // This is an example on how to set up the email provider with Amazon SES.
 * const amazonSesEmailProvider = new auth0.EmailProvider("amazon_ses_email_provider", {
 *     name: "ses",
 *     enabled: true,
 *     defaultFromAddress: "accounts@example.com",
 *     credentials: {
 *         accessKeyId: "AKIAXXXXXXXXXXXXXXXX",
 *         secretAccessKey: "7e8c2148xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
 *         region: "us-east-1",
 *     },
 * });
 * // This is an example on how to set up the email provider with SMTP.
 * const smtpEmailProvider = new auth0.EmailProvider("smtp_email_provider", {
 *     name: "smtp",
 *     enabled: true,
 *     defaultFromAddress: "accounts@example.com",
 *     credentials: {
 *         smtpHost: "your.smtp.host.com",
 *         smtpPort: 583,
 *         smtpUser: "SMTP Username",
 *         smtpPass: "SMTP Password",
 *     },
 * });
 * // This is an example on how to set up the email provider with Sendgrid.
 * const sendgridEmailProvider = new auth0.EmailProvider("sendgrid_email_provider", {
 *     name: "sendgrid",
 *     enabled: true,
 *     defaultFromAddress: "accounts@example.com",
 *     credentials: {
 *         apiKey: "secretAPIKey",
 *     },
 * });
 * // This is an example on how to set up the email provider with Azure CS.
 * const azureCsEmailProvider = new auth0.EmailProvider("azure_cs_email_provider", {
 *     name: "azure_cs",
 *     enabled: true,
 *     defaultFromAddress: "accounts@example.com",
 *     credentials: {
 *         azureCsConnectionString: "azure_cs_connection_string",
 *     },
 * });
 * // This is an example on how to set up the email provider with MS365.
 * const ms365EmailProvider = new auth0.EmailProvider("ms365_email_provider", {
 *     name: "ms365",
 *     enabled: true,
 *     defaultFromAddress: "accounts@example.com",
 *     credentials: {
 *         ms365TenantId: "ms365_tenant_id",
 *         ms365ClientId: "ms365_client_id",
 *         ms365ClientSecret: "ms365_client_secret",
 *     },
 * });
 * // Below is an example of how to set up a custom email provider.
 * // The action with custom-email-provider as supported_triggers is a prerequisite.
 * const customEmailProviderAction = new auth0.Action("custom_email_provider_action", {
 *     name: "custom-email-provider-action",
 *     runtime: "node18",
 *     deploy: true,
 *     code: `/**
 *  * Handler to be executed while sending an email notification.
 *  *
 *  * @param {Event} event - Details about the user and the context in which they are logging in.
 *  * @param {CustomEmailProviderAPI} api - Methods and utilities to help change the behavior of sending a email notification.
 *  *&#47;
 *  exports.onExecuteCustomEmailProvider = async (event, api) => {
 *   // Code goes here
 *   console.log(event);
 *   return;
 *  };
 * `,
 *     supportedTriggers: {
 *         id: "custom-email-provider",
 *         version: "v1",
 *     },
 * });
 * const customEmailProvider = new auth0.EmailProvider("custom_email_provider", {
 *     name: "custom",
 *     enabled: true,
 *     defaultFromAddress: "accounts@example.com",
 *     credentials: {},
 * }, {
 *     dependsOn: [customEmailProviderAction],
 * });
 * ```
 *
 * ## Import
 *
 * As this is not a resource identifiable by an ID within the Auth0 Management API,
 *
 * email can be imported using a random string.
 *
 * We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4)
 *
 * Example:
 *
 * ```sh
 * $ pulumi import auth0:index/emailProvider:EmailProvider my_email_provider "b4213dc2-2eed-42c3-9516-c6131a9ce0b0"
 * ```
 */
export class EmailProvider extends pulumi.CustomResource {
    /**
     * Get an existing EmailProvider resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EmailProviderState, opts?: pulumi.CustomResourceOptions): EmailProvider {
        return new EmailProvider(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'auth0:index/emailProvider:EmailProvider';

    /**
     * Returns true if the given object is an instance of EmailProvider.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EmailProvider {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EmailProvider.__pulumiType;
    }

    /**
     * Configuration settings for the credentials for the email provider.
     */
    public readonly credentials!: pulumi.Output<outputs.EmailProviderCredentials>;
    /**
     * Email address to use as the sender when no other "from" address is specified.
     */
    public readonly defaultFromAddress!: pulumi.Output<string>;
    /**
     * Indicates whether the email provider is enabled.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Name of the email provider. Options include `azureCs`, `custom`, `mailgun`, `mandrill`, `ms365`, `sendgrid`, `ses`, `smtp` and `sparkpost`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specific email provider settings.
     */
    public readonly settings!: pulumi.Output<outputs.EmailProviderSettings>;

    /**
     * Create a EmailProvider resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EmailProviderArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EmailProviderArgs | EmailProviderState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EmailProviderState | undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["defaultFromAddress"] = state ? state.defaultFromAddress : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["settings"] = state ? state.settings : undefined;
        } else {
            const args = argsOrState as EmailProviderArgs | undefined;
            if ((!args || args.credentials === undefined) && !opts.urn) {
                throw new Error("Missing required property 'credentials'");
            }
            if ((!args || args.defaultFromAddress === undefined) && !opts.urn) {
                throw new Error("Missing required property 'defaultFromAddress'");
            }
            resourceInputs["credentials"] = args ? args.credentials : undefined;
            resourceInputs["defaultFromAddress"] = args ? args.defaultFromAddress : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["settings"] = args ? args.settings : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EmailProvider.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EmailProvider resources.
 */
export interface EmailProviderState {
    /**
     * Configuration settings for the credentials for the email provider.
     */
    credentials?: pulumi.Input<inputs.EmailProviderCredentials>;
    /**
     * Email address to use as the sender when no other "from" address is specified.
     */
    defaultFromAddress?: pulumi.Input<string>;
    /**
     * Indicates whether the email provider is enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Name of the email provider. Options include `azureCs`, `custom`, `mailgun`, `mandrill`, `ms365`, `sendgrid`, `ses`, `smtp` and `sparkpost`.
     */
    name?: pulumi.Input<string>;
    /**
     * Specific email provider settings.
     */
    settings?: pulumi.Input<inputs.EmailProviderSettings>;
}

/**
 * The set of arguments for constructing a EmailProvider resource.
 */
export interface EmailProviderArgs {
    /**
     * Configuration settings for the credentials for the email provider.
     */
    credentials: pulumi.Input<inputs.EmailProviderCredentials>;
    /**
     * Email address to use as the sender when no other "from" address is specified.
     */
    defaultFromAddress: pulumi.Input<string>;
    /**
     * Indicates whether the email provider is enabled.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Name of the email provider. Options include `azureCs`, `custom`, `mailgun`, `mandrill`, `ms365`, `sendgrid`, `ses`, `smtp` and `sparkpost`.
     */
    name?: pulumi.Input<string>;
    /**
     * Specific email provider settings.
     */
    settings?: pulumi.Input<inputs.EmailProviderSettings>;
}
