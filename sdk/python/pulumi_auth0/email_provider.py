# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['EmailProviderArgs', 'EmailProvider']

@pulumi.input_type
class EmailProviderArgs:
    def __init__(__self__, *,
                 credentials: pulumi.Input['EmailProviderCredentialsArgs'],
                 default_from_address: pulumi.Input[_builtins.str],
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 settings: Optional[pulumi.Input['EmailProviderSettingsArgs']] = None):
        """
        The set of arguments for constructing a EmailProvider resource.
        :param pulumi.Input['EmailProviderCredentialsArgs'] credentials: Configuration settings for the credentials for the email provider.
        :param pulumi.Input[_builtins.str] default_from_address: Email address to use as the sender when no other "from" address is specified.
        :param pulumi.Input[_builtins.bool] enabled: Indicates whether the email provider is enabled.
        :param pulumi.Input[_builtins.str] name: Name of the email provider. Options include `azure_cs`, `custom`, `mailgun`, `mandrill`, `ms365`, `sendgrid`, `ses`, `smtp` and `sparkpost`.
        :param pulumi.Input['EmailProviderSettingsArgs'] settings: Specific email provider settings.
        """
        pulumi.set(__self__, "credentials", credentials)
        pulumi.set(__self__, "default_from_address", default_from_address)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if settings is not None:
            pulumi.set(__self__, "settings", settings)

    @_builtins.property
    @pulumi.getter
    def credentials(self) -> pulumi.Input['EmailProviderCredentialsArgs']:
        """
        Configuration settings for the credentials for the email provider.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: pulumi.Input['EmailProviderCredentialsArgs']):
        pulumi.set(self, "credentials", value)

    @_builtins.property
    @pulumi.getter(name="defaultFromAddress")
    def default_from_address(self) -> pulumi.Input[_builtins.str]:
        """
        Email address to use as the sender when no other "from" address is specified.
        """
        return pulumi.get(self, "default_from_address")

    @default_from_address.setter
    def default_from_address(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "default_from_address", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Indicates whether the email provider is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the email provider. Options include `azure_cs`, `custom`, `mailgun`, `mandrill`, `ms365`, `sendgrid`, `ses`, `smtp` and `sparkpost`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def settings(self) -> Optional[pulumi.Input['EmailProviderSettingsArgs']]:
        """
        Specific email provider settings.
        """
        return pulumi.get(self, "settings")

    @settings.setter
    def settings(self, value: Optional[pulumi.Input['EmailProviderSettingsArgs']]):
        pulumi.set(self, "settings", value)


@pulumi.input_type
class _EmailProviderState:
    def __init__(__self__, *,
                 credentials: Optional[pulumi.Input['EmailProviderCredentialsArgs']] = None,
                 default_from_address: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 settings: Optional[pulumi.Input['EmailProviderSettingsArgs']] = None):
        """
        Input properties used for looking up and filtering EmailProvider resources.
        :param pulumi.Input['EmailProviderCredentialsArgs'] credentials: Configuration settings for the credentials for the email provider.
        :param pulumi.Input[_builtins.str] default_from_address: Email address to use as the sender when no other "from" address is specified.
        :param pulumi.Input[_builtins.bool] enabled: Indicates whether the email provider is enabled.
        :param pulumi.Input[_builtins.str] name: Name of the email provider. Options include `azure_cs`, `custom`, `mailgun`, `mandrill`, `ms365`, `sendgrid`, `ses`, `smtp` and `sparkpost`.
        :param pulumi.Input['EmailProviderSettingsArgs'] settings: Specific email provider settings.
        """
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if default_from_address is not None:
            pulumi.set(__self__, "default_from_address", default_from_address)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if settings is not None:
            pulumi.set(__self__, "settings", settings)

    @_builtins.property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['EmailProviderCredentialsArgs']]:
        """
        Configuration settings for the credentials for the email provider.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['EmailProviderCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @_builtins.property
    @pulumi.getter(name="defaultFromAddress")
    def default_from_address(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Email address to use as the sender when no other "from" address is specified.
        """
        return pulumi.get(self, "default_from_address")

    @default_from_address.setter
    def default_from_address(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "default_from_address", value)

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Indicates whether the email provider is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "enabled", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the email provider. Options include `azure_cs`, `custom`, `mailgun`, `mandrill`, `ms365`, `sendgrid`, `ses`, `smtp` and `sparkpost`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def settings(self) -> Optional[pulumi.Input['EmailProviderSettingsArgs']]:
        """
        Specific email provider settings.
        """
        return pulumi.get(self, "settings")

    @settings.setter
    def settings(self, value: Optional[pulumi.Input['EmailProviderSettingsArgs']]):
        pulumi.set(self, "settings", value)


@pulumi.type_token("auth0:index/emailProvider:EmailProvider")
class EmailProvider(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 credentials: Optional[pulumi.Input[Union['EmailProviderCredentialsArgs', 'EmailProviderCredentialsArgsDict']]] = None,
                 default_from_address: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 settings: Optional[pulumi.Input[Union['EmailProviderSettingsArgs', 'EmailProviderSettingsArgsDict']]] = None,
                 __props__=None):
        """
        With Auth0, you can have standard welcome, password reset, and account verification email-based workflows built right into Auth0. This resource allows you to configure email providers, so you can route all emails that are part of Auth0's authentication workflows through the supported high-volume email service of your choice.

        !> This resource manages to create a max of 1 email provider for a tenant.
        To avoid potential issues, it is recommended not to try creating multiple email providers on the same tenant.

        !> If you are using the `EmailProvider` resource to create a `custom` email provider, you must ensure an action is created first with `custom-email-provider` as the supported_triggers

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        # This is an example on how to set up the email provider with Amazon SES.
        amazon_ses_email_provider = auth0.EmailProvider("amazon_ses_email_provider",
            name="ses",
            enabled=True,
            default_from_address="accounts@example.com",
            credentials={
                "access_key_id": "AKIAXXXXXXXXXXXXXXXX",
                "secret_access_key": "7e8c2148xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
                "region": "us-east-1",
            })
        # This is an example on how to set up the email provider with SMTP.
        smtp_email_provider = auth0.EmailProvider("smtp_email_provider",
            name="smtp",
            enabled=True,
            default_from_address="accounts@example.com",
            credentials={
                "smtp_host": "your.smtp.host.com",
                "smtp_port": 583,
                "smtp_user": "SMTP Username",
                "smtp_pass": "SMTP Password",
            })
        # This is an example on how to set up the email provider with Sendgrid.
        sendgrid_email_provider = auth0.EmailProvider("sendgrid_email_provider",
            name="sendgrid",
            enabled=True,
            default_from_address="accounts@example.com",
            credentials={
                "api_key": "secretAPIKey",
            })
        # This is an example on how to set up the email provider with Azure CS.
        azure_cs_email_provider = auth0.EmailProvider("azure_cs_email_provider",
            name="azure_cs",
            enabled=True,
            default_from_address="accounts@example.com",
            credentials={
                "azure_cs_connection_string": "azure_cs_connection_string",
            })
        # This is an example on how to set up the email provider with MS365.
        ms365_email_provider = auth0.EmailProvider("ms365_email_provider",
            name="ms365",
            enabled=True,
            default_from_address="accounts@example.com",
            credentials={
                "ms365_tenant_id": "ms365_tenant_id",
                "ms365_client_id": "ms365_client_id",
                "ms365_client_secret": "ms365_client_secret",
            })
        # Below is an example of how to set up a custom email provider.
        # The action with custom-email-provider as supported_triggers is a prerequisite.
        custom_email_provider_action = auth0.Action("custom_email_provider_action",
            name="custom-email-provider-action",
            runtime="node18",
            deploy=True,
            code=\"\"\"/**
         * Handler to be executed while sending an email notification.
         *
         * @param {Event} event - Details about the user and the context in which they are logging in.
         * @param {CustomEmailProviderAPI} api - Methods and utilities to help change the behavior of sending a email notification.
         */
         exports.onExecuteCustomEmailProvider = async (event, api) => {
          // Code goes here
          console.log(event);
          return;
         };
        \"\"\",
            supported_triggers={
                "id": "custom-email-provider",
                "version": "v1",
            })
        custom_email_provider = auth0.EmailProvider("custom_email_provider",
            name="custom",
            enabled=True,
            default_from_address="accounts@example.com",
            credentials={},
            opts = pulumi.ResourceOptions(depends_on=[custom_email_provider_action]))
        ```

        ## Import

        As this is not a resource identifiable by an ID within the Auth0 Management API,

        email can be imported using a random string.

        We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4)

        Example:

        ```sh
        $ pulumi import auth0:index/emailProvider:EmailProvider my_email_provider "b4213dc2-2eed-42c3-9516-c6131a9ce0b0"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['EmailProviderCredentialsArgs', 'EmailProviderCredentialsArgsDict']] credentials: Configuration settings for the credentials for the email provider.
        :param pulumi.Input[_builtins.str] default_from_address: Email address to use as the sender when no other "from" address is specified.
        :param pulumi.Input[_builtins.bool] enabled: Indicates whether the email provider is enabled.
        :param pulumi.Input[_builtins.str] name: Name of the email provider. Options include `azure_cs`, `custom`, `mailgun`, `mandrill`, `ms365`, `sendgrid`, `ses`, `smtp` and `sparkpost`.
        :param pulumi.Input[Union['EmailProviderSettingsArgs', 'EmailProviderSettingsArgsDict']] settings: Specific email provider settings.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EmailProviderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With Auth0, you can have standard welcome, password reset, and account verification email-based workflows built right into Auth0. This resource allows you to configure email providers, so you can route all emails that are part of Auth0's authentication workflows through the supported high-volume email service of your choice.

        !> This resource manages to create a max of 1 email provider for a tenant.
        To avoid potential issues, it is recommended not to try creating multiple email providers on the same tenant.

        !> If you are using the `EmailProvider` resource to create a `custom` email provider, you must ensure an action is created first with `custom-email-provider` as the supported_triggers

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        # This is an example on how to set up the email provider with Amazon SES.
        amazon_ses_email_provider = auth0.EmailProvider("amazon_ses_email_provider",
            name="ses",
            enabled=True,
            default_from_address="accounts@example.com",
            credentials={
                "access_key_id": "AKIAXXXXXXXXXXXXXXXX",
                "secret_access_key": "7e8c2148xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
                "region": "us-east-1",
            })
        # This is an example on how to set up the email provider with SMTP.
        smtp_email_provider = auth0.EmailProvider("smtp_email_provider",
            name="smtp",
            enabled=True,
            default_from_address="accounts@example.com",
            credentials={
                "smtp_host": "your.smtp.host.com",
                "smtp_port": 583,
                "smtp_user": "SMTP Username",
                "smtp_pass": "SMTP Password",
            })
        # This is an example on how to set up the email provider with Sendgrid.
        sendgrid_email_provider = auth0.EmailProvider("sendgrid_email_provider",
            name="sendgrid",
            enabled=True,
            default_from_address="accounts@example.com",
            credentials={
                "api_key": "secretAPIKey",
            })
        # This is an example on how to set up the email provider with Azure CS.
        azure_cs_email_provider = auth0.EmailProvider("azure_cs_email_provider",
            name="azure_cs",
            enabled=True,
            default_from_address="accounts@example.com",
            credentials={
                "azure_cs_connection_string": "azure_cs_connection_string",
            })
        # This is an example on how to set up the email provider with MS365.
        ms365_email_provider = auth0.EmailProvider("ms365_email_provider",
            name="ms365",
            enabled=True,
            default_from_address="accounts@example.com",
            credentials={
                "ms365_tenant_id": "ms365_tenant_id",
                "ms365_client_id": "ms365_client_id",
                "ms365_client_secret": "ms365_client_secret",
            })
        # Below is an example of how to set up a custom email provider.
        # The action with custom-email-provider as supported_triggers is a prerequisite.
        custom_email_provider_action = auth0.Action("custom_email_provider_action",
            name="custom-email-provider-action",
            runtime="node18",
            deploy=True,
            code=\"\"\"/**
         * Handler to be executed while sending an email notification.
         *
         * @param {Event} event - Details about the user and the context in which they are logging in.
         * @param {CustomEmailProviderAPI} api - Methods and utilities to help change the behavior of sending a email notification.
         */
         exports.onExecuteCustomEmailProvider = async (event, api) => {
          // Code goes here
          console.log(event);
          return;
         };
        \"\"\",
            supported_triggers={
                "id": "custom-email-provider",
                "version": "v1",
            })
        custom_email_provider = auth0.EmailProvider("custom_email_provider",
            name="custom",
            enabled=True,
            default_from_address="accounts@example.com",
            credentials={},
            opts = pulumi.ResourceOptions(depends_on=[custom_email_provider_action]))
        ```

        ## Import

        As this is not a resource identifiable by an ID within the Auth0 Management API,

        email can be imported using a random string.

        We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4)

        Example:

        ```sh
        $ pulumi import auth0:index/emailProvider:EmailProvider my_email_provider "b4213dc2-2eed-42c3-9516-c6131a9ce0b0"
        ```

        :param str resource_name: The name of the resource.
        :param EmailProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EmailProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 credentials: Optional[pulumi.Input[Union['EmailProviderCredentialsArgs', 'EmailProviderCredentialsArgsDict']]] = None,
                 default_from_address: Optional[pulumi.Input[_builtins.str]] = None,
                 enabled: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 settings: Optional[pulumi.Input[Union['EmailProviderSettingsArgs', 'EmailProviderSettingsArgsDict']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EmailProviderArgs.__new__(EmailProviderArgs)

            if credentials is None and not opts.urn:
                raise TypeError("Missing required property 'credentials'")
            __props__.__dict__["credentials"] = credentials
            if default_from_address is None and not opts.urn:
                raise TypeError("Missing required property 'default_from_address'")
            __props__.__dict__["default_from_address"] = default_from_address
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["name"] = name
            __props__.__dict__["settings"] = settings
        super(EmailProvider, __self__).__init__(
            'auth0:index/emailProvider:EmailProvider',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            credentials: Optional[pulumi.Input[Union['EmailProviderCredentialsArgs', 'EmailProviderCredentialsArgsDict']]] = None,
            default_from_address: Optional[pulumi.Input[_builtins.str]] = None,
            enabled: Optional[pulumi.Input[_builtins.bool]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            settings: Optional[pulumi.Input[Union['EmailProviderSettingsArgs', 'EmailProviderSettingsArgsDict']]] = None) -> 'EmailProvider':
        """
        Get an existing EmailProvider resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['EmailProviderCredentialsArgs', 'EmailProviderCredentialsArgsDict']] credentials: Configuration settings for the credentials for the email provider.
        :param pulumi.Input[_builtins.str] default_from_address: Email address to use as the sender when no other "from" address is specified.
        :param pulumi.Input[_builtins.bool] enabled: Indicates whether the email provider is enabled.
        :param pulumi.Input[_builtins.str] name: Name of the email provider. Options include `azure_cs`, `custom`, `mailgun`, `mandrill`, `ms365`, `sendgrid`, `ses`, `smtp` and `sparkpost`.
        :param pulumi.Input[Union['EmailProviderSettingsArgs', 'EmailProviderSettingsArgsDict']] settings: Specific email provider settings.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EmailProviderState.__new__(_EmailProviderState)

        __props__.__dict__["credentials"] = credentials
        __props__.__dict__["default_from_address"] = default_from_address
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["name"] = name
        __props__.__dict__["settings"] = settings
        return EmailProvider(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def credentials(self) -> pulumi.Output['outputs.EmailProviderCredentials']:
        """
        Configuration settings for the credentials for the email provider.
        """
        return pulumi.get(self, "credentials")

    @_builtins.property
    @pulumi.getter(name="defaultFromAddress")
    def default_from_address(self) -> pulumi.Output[_builtins.str]:
        """
        Email address to use as the sender when no other "from" address is specified.
        """
        return pulumi.get(self, "default_from_address")

    @_builtins.property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Indicates whether the email provider is enabled.
        """
        return pulumi.get(self, "enabled")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Name of the email provider. Options include `azure_cs`, `custom`, `mailgun`, `mandrill`, `ms365`, `sendgrid`, `ses`, `smtp` and `sparkpost`.
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def settings(self) -> pulumi.Output['outputs.EmailProviderSettings']:
        """
        Specific email provider settings.
        """
        return pulumi.get(self, "settings")

