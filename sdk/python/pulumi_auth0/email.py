# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['EmailArgs', 'Email']

@pulumi.input_type
class EmailArgs:
    def __init__(__self__, *,
                 credentials: pulumi.Input['EmailCredentialsArgs'],
                 default_from_address: pulumi.Input[str],
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 settings: Optional[pulumi.Input['EmailSettingsArgs']] = None):
        """
        The set of arguments for constructing a Email resource.
        :param pulumi.Input['EmailCredentialsArgs'] credentials: Configuration settings for the credentials for the email provider.
        :param pulumi.Input[str] default_from_address: Email address to use as the sender when no other "from" address is specified.
        :param pulumi.Input[bool] enabled: Indicates whether the email provider is enabled.
        :param pulumi.Input[str] name: Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
        :param pulumi.Input['EmailSettingsArgs'] settings: Specific email provider settings.
        """
        pulumi.set(__self__, "credentials", credentials)
        pulumi.set(__self__, "default_from_address", default_from_address)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if settings is not None:
            pulumi.set(__self__, "settings", settings)

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Input['EmailCredentialsArgs']:
        """
        Configuration settings for the credentials for the email provider.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: pulumi.Input['EmailCredentialsArgs']):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter(name="defaultFromAddress")
    def default_from_address(self) -> pulumi.Input[str]:
        """
        Email address to use as the sender when no other "from" address is specified.
        """
        return pulumi.get(self, "default_from_address")

    @default_from_address.setter
    def default_from_address(self, value: pulumi.Input[str]):
        pulumi.set(self, "default_from_address", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether the email provider is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def settings(self) -> Optional[pulumi.Input['EmailSettingsArgs']]:
        """
        Specific email provider settings.
        """
        return pulumi.get(self, "settings")

    @settings.setter
    def settings(self, value: Optional[pulumi.Input['EmailSettingsArgs']]):
        pulumi.set(self, "settings", value)


@pulumi.input_type
class _EmailState:
    def __init__(__self__, *,
                 credentials: Optional[pulumi.Input['EmailCredentialsArgs']] = None,
                 default_from_address: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 settings: Optional[pulumi.Input['EmailSettingsArgs']] = None):
        """
        Input properties used for looking up and filtering Email resources.
        :param pulumi.Input['EmailCredentialsArgs'] credentials: Configuration settings for the credentials for the email provider.
        :param pulumi.Input[str] default_from_address: Email address to use as the sender when no other "from" address is specified.
        :param pulumi.Input[bool] enabled: Indicates whether the email provider is enabled.
        :param pulumi.Input[str] name: Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
        :param pulumi.Input['EmailSettingsArgs'] settings: Specific email provider settings.
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

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['EmailCredentialsArgs']]:
        """
        Configuration settings for the credentials for the email provider.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['EmailCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter(name="defaultFromAddress")
    def default_from_address(self) -> Optional[pulumi.Input[str]]:
        """
        Email address to use as the sender when no other "from" address is specified.
        """
        return pulumi.get(self, "default_from_address")

    @default_from_address.setter
    def default_from_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_from_address", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether the email provider is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def settings(self) -> Optional[pulumi.Input['EmailSettingsArgs']]:
        """
        Specific email provider settings.
        """
        return pulumi.get(self, "settings")

    @settings.setter
    def settings(self, value: Optional[pulumi.Input['EmailSettingsArgs']]):
        pulumi.set(self, "settings", value)


class Email(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 credentials: Optional[pulumi.Input[pulumi.InputType['EmailCredentialsArgs']]] = None,
                 default_from_address: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 settings: Optional[pulumi.Input[pulumi.InputType['EmailSettingsArgs']]] = None,
                 __props__=None):
        """
        With Auth0, you can have standard welcome, password reset, and account verification email-based workflows built right into Auth0. This resource allows you to configure email providers, so you can route all emails that are part of Auth0's authentication workflows through the supported high-volume email service of your choice.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        # This is an example on how to set up the email provider with Amazon SES.
        amazon_ses_email_provider = auth0.Email("amazonSesEmailProvider",
            credentials=auth0.EmailCredentialsArgs(
                access_key_id="AKIAXXXXXXXXXXXXXXXX",
                region="us-east-1",
                secret_access_key="7e8c2148xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
            ),
            default_from_address="accounts@example.com",
            enabled=True)
        # This is an example on how to set up the email provider with SMTP.
        smtp_email_provider = auth0.Email("smtpEmailProvider",
            credentials=auth0.EmailCredentialsArgs(
                smtp_host="your.smtp.host.com",
                smtp_pass="SMTP Password",
                smtp_port=583,
                smtp_user="SMTP Username",
            ),
            default_from_address="accounts@example.com",
            enabled=True)
        # This is an example on how to set up the email provider with Sendgrid.
        sendgrid_email_provider = auth0.Email("sendgridEmailProvider",
            credentials=auth0.EmailCredentialsArgs(
                api_key="secretAPIKey",
            ),
            default_from_address="accounts@example.com",
            enabled=True)
        ```

        ## Import

        As this is not a resource identifiable by an ID within the Auth0 Management API, email can be imported using a random string. # We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4) # Example

        ```sh
         $ pulumi import auth0:index/email:Email my_email_provider b4213dc2-2eed-42c3-9516-c6131a9ce0b0
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['EmailCredentialsArgs']] credentials: Configuration settings for the credentials for the email provider.
        :param pulumi.Input[str] default_from_address: Email address to use as the sender when no other "from" address is specified.
        :param pulumi.Input[bool] enabled: Indicates whether the email provider is enabled.
        :param pulumi.Input[str] name: Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
        :param pulumi.Input[pulumi.InputType['EmailSettingsArgs']] settings: Specific email provider settings.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EmailArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With Auth0, you can have standard welcome, password reset, and account verification email-based workflows built right into Auth0. This resource allows you to configure email providers, so you can route all emails that are part of Auth0's authentication workflows through the supported high-volume email service of your choice.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        # This is an example on how to set up the email provider with Amazon SES.
        amazon_ses_email_provider = auth0.Email("amazonSesEmailProvider",
            credentials=auth0.EmailCredentialsArgs(
                access_key_id="AKIAXXXXXXXXXXXXXXXX",
                region="us-east-1",
                secret_access_key="7e8c2148xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
            ),
            default_from_address="accounts@example.com",
            enabled=True)
        # This is an example on how to set up the email provider with SMTP.
        smtp_email_provider = auth0.Email("smtpEmailProvider",
            credentials=auth0.EmailCredentialsArgs(
                smtp_host="your.smtp.host.com",
                smtp_pass="SMTP Password",
                smtp_port=583,
                smtp_user="SMTP Username",
            ),
            default_from_address="accounts@example.com",
            enabled=True)
        # This is an example on how to set up the email provider with Sendgrid.
        sendgrid_email_provider = auth0.Email("sendgridEmailProvider",
            credentials=auth0.EmailCredentialsArgs(
                api_key="secretAPIKey",
            ),
            default_from_address="accounts@example.com",
            enabled=True)
        ```

        ## Import

        As this is not a resource identifiable by an ID within the Auth0 Management API, email can be imported using a random string. # We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4) # Example

        ```sh
         $ pulumi import auth0:index/email:Email my_email_provider b4213dc2-2eed-42c3-9516-c6131a9ce0b0
        ```

        :param str resource_name: The name of the resource.
        :param EmailArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EmailArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 credentials: Optional[pulumi.Input[pulumi.InputType['EmailCredentialsArgs']]] = None,
                 default_from_address: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 settings: Optional[pulumi.Input[pulumi.InputType['EmailSettingsArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EmailArgs.__new__(EmailArgs)

            if credentials is None and not opts.urn:
                raise TypeError("Missing required property 'credentials'")
            __props__.__dict__["credentials"] = credentials
            if default_from_address is None and not opts.urn:
                raise TypeError("Missing required property 'default_from_address'")
            __props__.__dict__["default_from_address"] = default_from_address
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["name"] = name
            __props__.__dict__["settings"] = settings
        super(Email, __self__).__init__(
            'auth0:index/email:Email',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            credentials: Optional[pulumi.Input[pulumi.InputType['EmailCredentialsArgs']]] = None,
            default_from_address: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            settings: Optional[pulumi.Input[pulumi.InputType['EmailSettingsArgs']]] = None) -> 'Email':
        """
        Get an existing Email resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['EmailCredentialsArgs']] credentials: Configuration settings for the credentials for the email provider.
        :param pulumi.Input[str] default_from_address: Email address to use as the sender when no other "from" address is specified.
        :param pulumi.Input[bool] enabled: Indicates whether the email provider is enabled.
        :param pulumi.Input[str] name: Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
        :param pulumi.Input[pulumi.InputType['EmailSettingsArgs']] settings: Specific email provider settings.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EmailState.__new__(_EmailState)

        __props__.__dict__["credentials"] = credentials
        __props__.__dict__["default_from_address"] = default_from_address
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["name"] = name
        __props__.__dict__["settings"] = settings
        return Email(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Output['outputs.EmailCredentials']:
        """
        Configuration settings for the credentials for the email provider.
        """
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter(name="defaultFromAddress")
    def default_from_address(self) -> pulumi.Output[str]:
        """
        Email address to use as the sender when no other "from" address is specified.
        """
        return pulumi.get(self, "default_from_address")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicates whether the email provider is enabled.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def settings(self) -> pulumi.Output['outputs.EmailSettings']:
        """
        Specific email provider settings.
        """
        return pulumi.get(self, "settings")

