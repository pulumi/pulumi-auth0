# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Email resource.
        :param pulumi.Input['EmailCredentialsArgs'] credentials: List(Resource). Configuration settings for the credentials for the email provider. For details, see Credentials.
        :param pulumi.Input[str] default_from_address: String. Email address to use as the sender when no other "from" address is specified.
        :param pulumi.Input[bool] enabled: Boolean. Indicates whether or not the email provider is enabled.
        :param pulumi.Input[str] name: String. Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
        """
        pulumi.set(__self__, "credentials", credentials)
        pulumi.set(__self__, "default_from_address", default_from_address)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Input['EmailCredentialsArgs']:
        """
        List(Resource). Configuration settings for the credentials for the email provider. For details, see Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: pulumi.Input['EmailCredentialsArgs']):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter(name="defaultFromAddress")
    def default_from_address(self) -> pulumi.Input[str]:
        """
        String. Email address to use as the sender when no other "from" address is specified.
        """
        return pulumi.get(self, "default_from_address")

    @default_from_address.setter
    def default_from_address(self, value: pulumi.Input[str]):
        pulumi.set(self, "default_from_address", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean. Indicates whether or not the email provider is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        String. Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _EmailState:
    def __init__(__self__, *,
                 credentials: Optional[pulumi.Input['EmailCredentialsArgs']] = None,
                 default_from_address: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Email resources.
        :param pulumi.Input['EmailCredentialsArgs'] credentials: List(Resource). Configuration settings for the credentials for the email provider. For details, see Credentials.
        :param pulumi.Input[str] default_from_address: String. Email address to use as the sender when no other "from" address is specified.
        :param pulumi.Input[bool] enabled: Boolean. Indicates whether or not the email provider is enabled.
        :param pulumi.Input[str] name: String. Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
        """
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if default_from_address is not None:
            pulumi.set(__self__, "default_from_address", default_from_address)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input['EmailCredentialsArgs']]:
        """
        List(Resource). Configuration settings for the credentials for the email provider. For details, see Credentials.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input['EmailCredentialsArgs']]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter(name="defaultFromAddress")
    def default_from_address(self) -> Optional[pulumi.Input[str]]:
        """
        String. Email address to use as the sender when no other "from" address is specified.
        """
        return pulumi.get(self, "default_from_address")

    @default_from_address.setter
    def default_from_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_from_address", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Boolean. Indicates whether or not the email provider is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        String. Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class Email(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 credentials: Optional[pulumi.Input[pulumi.InputType['EmailCredentialsArgs']]] = None,
                 default_from_address: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        With Auth0, you can have standard welcome, password reset, and account verification email-based workflows built right into Auth0. This resource allows you to configure email providers so you can route all emails that are part of Auth0's authentication workflows through the supported high-volume email service of your choice.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_email_provider = auth0.Email("myEmailProvider",
            credentials=auth0.EmailCredentialsArgs(
                access_key_id="AKIAXXXXXXXXXXXXXXXX",
                region="us-east-1",
                secret_access_key="7e8c2148xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
            ),
            default_from_address="accounts@example.com",
            enabled=True)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['EmailCredentialsArgs']] credentials: List(Resource). Configuration settings for the credentials for the email provider. For details, see Credentials.
        :param pulumi.Input[str] default_from_address: String. Email address to use as the sender when no other "from" address is specified.
        :param pulumi.Input[bool] enabled: Boolean. Indicates whether or not the email provider is enabled.
        :param pulumi.Input[str] name: String. Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EmailArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With Auth0, you can have standard welcome, password reset, and account verification email-based workflows built right into Auth0. This resource allows you to configure email providers so you can route all emails that are part of Auth0's authentication workflows through the supported high-volume email service of your choice.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_email_provider = auth0.Email("myEmailProvider",
            credentials=auth0.EmailCredentialsArgs(
                access_key_id="AKIAXXXXXXXXXXXXXXXX",
                region="us-east-1",
                secret_access_key="7e8c2148xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
            ),
            default_from_address="accounts@example.com",
            enabled=True)
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
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
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
            name: Optional[pulumi.Input[str]] = None) -> 'Email':
        """
        Get an existing Email resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['EmailCredentialsArgs']] credentials: List(Resource). Configuration settings for the credentials for the email provider. For details, see Credentials.
        :param pulumi.Input[str] default_from_address: String. Email address to use as the sender when no other "from" address is specified.
        :param pulumi.Input[bool] enabled: Boolean. Indicates whether or not the email provider is enabled.
        :param pulumi.Input[str] name: String. Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EmailState.__new__(_EmailState)

        __props__.__dict__["credentials"] = credentials
        __props__.__dict__["default_from_address"] = default_from_address
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["name"] = name
        return Email(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Output['outputs.EmailCredentials']:
        """
        List(Resource). Configuration settings for the credentials for the email provider. For details, see Credentials.
        """
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter(name="defaultFromAddress")
    def default_from_address(self) -> pulumi.Output[str]:
        """
        String. Email address to use as the sender when no other "from" address is specified.
        """
        return pulumi.get(self, "default_from_address")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Boolean. Indicates whether or not the email provider is enabled.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        String. Name of the email provider. Options include `mailgun`, `mandrill`, `sendgrid`, `ses`, `smtp`, and `sparkpost`.
        """
        return pulumi.get(self, "name")

