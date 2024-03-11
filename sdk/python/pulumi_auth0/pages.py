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

__all__ = ['PagesArgs', 'Pages']

@pulumi.input_type
class PagesArgs:
    def __init__(__self__, *,
                 change_password: Optional[pulumi.Input['PagesChangePasswordArgs']] = None,
                 error: Optional[pulumi.Input['PagesErrorArgs']] = None,
                 guardian_mfa: Optional[pulumi.Input['PagesGuardianMfaArgs']] = None,
                 login: Optional[pulumi.Input['PagesLoginArgs']] = None):
        """
        The set of arguments for constructing a Pages resource.
        :param pulumi.Input['PagesChangePasswordArgs'] change_password: Configuration settings for customizing the Password Reset page.
        :param pulumi.Input['PagesErrorArgs'] error: Configuration settings for the Error pages.
        :param pulumi.Input['PagesGuardianMfaArgs'] guardian_mfa: Configuration settings for customizing the Guardian Multi-Factor Authentication page.
        :param pulumi.Input['PagesLoginArgs'] login: Configuration settings for customizing the Login page.
        """
        if change_password is not None:
            pulumi.set(__self__, "change_password", change_password)
        if error is not None:
            pulumi.set(__self__, "error", error)
        if guardian_mfa is not None:
            pulumi.set(__self__, "guardian_mfa", guardian_mfa)
        if login is not None:
            pulumi.set(__self__, "login", login)

    @property
    @pulumi.getter(name="changePassword")
    def change_password(self) -> Optional[pulumi.Input['PagesChangePasswordArgs']]:
        """
        Configuration settings for customizing the Password Reset page.
        """
        return pulumi.get(self, "change_password")

    @change_password.setter
    def change_password(self, value: Optional[pulumi.Input['PagesChangePasswordArgs']]):
        pulumi.set(self, "change_password", value)

    @property
    @pulumi.getter
    def error(self) -> Optional[pulumi.Input['PagesErrorArgs']]:
        """
        Configuration settings for the Error pages.
        """
        return pulumi.get(self, "error")

    @error.setter
    def error(self, value: Optional[pulumi.Input['PagesErrorArgs']]):
        pulumi.set(self, "error", value)

    @property
    @pulumi.getter(name="guardianMfa")
    def guardian_mfa(self) -> Optional[pulumi.Input['PagesGuardianMfaArgs']]:
        """
        Configuration settings for customizing the Guardian Multi-Factor Authentication page.
        """
        return pulumi.get(self, "guardian_mfa")

    @guardian_mfa.setter
    def guardian_mfa(self, value: Optional[pulumi.Input['PagesGuardianMfaArgs']]):
        pulumi.set(self, "guardian_mfa", value)

    @property
    @pulumi.getter
    def login(self) -> Optional[pulumi.Input['PagesLoginArgs']]:
        """
        Configuration settings for customizing the Login page.
        """
        return pulumi.get(self, "login")

    @login.setter
    def login(self, value: Optional[pulumi.Input['PagesLoginArgs']]):
        pulumi.set(self, "login", value)


@pulumi.input_type
class _PagesState:
    def __init__(__self__, *,
                 change_password: Optional[pulumi.Input['PagesChangePasswordArgs']] = None,
                 error: Optional[pulumi.Input['PagesErrorArgs']] = None,
                 guardian_mfa: Optional[pulumi.Input['PagesGuardianMfaArgs']] = None,
                 login: Optional[pulumi.Input['PagesLoginArgs']] = None):
        """
        Input properties used for looking up and filtering Pages resources.
        :param pulumi.Input['PagesChangePasswordArgs'] change_password: Configuration settings for customizing the Password Reset page.
        :param pulumi.Input['PagesErrorArgs'] error: Configuration settings for the Error pages.
        :param pulumi.Input['PagesGuardianMfaArgs'] guardian_mfa: Configuration settings for customizing the Guardian Multi-Factor Authentication page.
        :param pulumi.Input['PagesLoginArgs'] login: Configuration settings for customizing the Login page.
        """
        if change_password is not None:
            pulumi.set(__self__, "change_password", change_password)
        if error is not None:
            pulumi.set(__self__, "error", error)
        if guardian_mfa is not None:
            pulumi.set(__self__, "guardian_mfa", guardian_mfa)
        if login is not None:
            pulumi.set(__self__, "login", login)

    @property
    @pulumi.getter(name="changePassword")
    def change_password(self) -> Optional[pulumi.Input['PagesChangePasswordArgs']]:
        """
        Configuration settings for customizing the Password Reset page.
        """
        return pulumi.get(self, "change_password")

    @change_password.setter
    def change_password(self, value: Optional[pulumi.Input['PagesChangePasswordArgs']]):
        pulumi.set(self, "change_password", value)

    @property
    @pulumi.getter
    def error(self) -> Optional[pulumi.Input['PagesErrorArgs']]:
        """
        Configuration settings for the Error pages.
        """
        return pulumi.get(self, "error")

    @error.setter
    def error(self, value: Optional[pulumi.Input['PagesErrorArgs']]):
        pulumi.set(self, "error", value)

    @property
    @pulumi.getter(name="guardianMfa")
    def guardian_mfa(self) -> Optional[pulumi.Input['PagesGuardianMfaArgs']]:
        """
        Configuration settings for customizing the Guardian Multi-Factor Authentication page.
        """
        return pulumi.get(self, "guardian_mfa")

    @guardian_mfa.setter
    def guardian_mfa(self, value: Optional[pulumi.Input['PagesGuardianMfaArgs']]):
        pulumi.set(self, "guardian_mfa", value)

    @property
    @pulumi.getter
    def login(self) -> Optional[pulumi.Input['PagesLoginArgs']]:
        """
        Configuration settings for customizing the Login page.
        """
        return pulumi.get(self, "login")

    @login.setter
    def login(self, value: Optional[pulumi.Input['PagesLoginArgs']]):
        pulumi.set(self, "login", value)


class Pages(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 change_password: Optional[pulumi.Input[pulumi.InputType['PagesChangePasswordArgs']]] = None,
                 error: Optional[pulumi.Input[pulumi.InputType['PagesErrorArgs']]] = None,
                 guardian_mfa: Optional[pulumi.Input[pulumi.InputType['PagesGuardianMfaArgs']]] = None,
                 login: Optional[pulumi.Input[pulumi.InputType['PagesLoginArgs']]] = None,
                 __props__=None):
        """
        With this resource you can manage custom HTML for the Login, Reset Password, Multi-Factor Authentication and Error pages.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_pages = auth0.Pages("myPages",
            change_password=auth0.PagesChangePasswordArgs(
                enabled=True,
                html="<html><body>My Custom Reset Password Page</body></html>",
            ),
            error=auth0.PagesErrorArgs(
                html="<html><body>My Custom Error Page</body></html>",
                show_log_link=True,
                url="https://example.com",
            ),
            guardian_mfa=auth0.PagesGuardianMfaArgs(
                enabled=True,
                html="<html><body>My Custom MFA Page</body></html>",
            ),
            login=auth0.PagesLoginArgs(
                enabled=True,
                html="<html><body>My Custom Login Page</body></html>",
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        As this is not a resource identifiable by an ID within the Auth0 Management API,

        pages can be imported using a random string.

        # 

        We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4)

        # 

        Example:

        ```sh
        $ pulumi import auth0:index/pages:Pages my_pages "22f4f21b-017a-319d-92e7-2291c1ca36c4"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['PagesChangePasswordArgs']] change_password: Configuration settings for customizing the Password Reset page.
        :param pulumi.Input[pulumi.InputType['PagesErrorArgs']] error: Configuration settings for the Error pages.
        :param pulumi.Input[pulumi.InputType['PagesGuardianMfaArgs']] guardian_mfa: Configuration settings for customizing the Guardian Multi-Factor Authentication page.
        :param pulumi.Input[pulumi.InputType['PagesLoginArgs']] login: Configuration settings for customizing the Login page.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[PagesArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        With this resource you can manage custom HTML for the Login, Reset Password, Multi-Factor Authentication and Error pages.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_pages = auth0.Pages("myPages",
            change_password=auth0.PagesChangePasswordArgs(
                enabled=True,
                html="<html><body>My Custom Reset Password Page</body></html>",
            ),
            error=auth0.PagesErrorArgs(
                html="<html><body>My Custom Error Page</body></html>",
                show_log_link=True,
                url="https://example.com",
            ),
            guardian_mfa=auth0.PagesGuardianMfaArgs(
                enabled=True,
                html="<html><body>My Custom MFA Page</body></html>",
            ),
            login=auth0.PagesLoginArgs(
                enabled=True,
                html="<html><body>My Custom Login Page</body></html>",
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        As this is not a resource identifiable by an ID within the Auth0 Management API,

        pages can be imported using a random string.

        # 

        We recommend [Version 4 UUID](https://www.uuidgenerator.net/version4)

        # 

        Example:

        ```sh
        $ pulumi import auth0:index/pages:Pages my_pages "22f4f21b-017a-319d-92e7-2291c1ca36c4"
        ```

        :param str resource_name: The name of the resource.
        :param PagesArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PagesArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 change_password: Optional[pulumi.Input[pulumi.InputType['PagesChangePasswordArgs']]] = None,
                 error: Optional[pulumi.Input[pulumi.InputType['PagesErrorArgs']]] = None,
                 guardian_mfa: Optional[pulumi.Input[pulumi.InputType['PagesGuardianMfaArgs']]] = None,
                 login: Optional[pulumi.Input[pulumi.InputType['PagesLoginArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PagesArgs.__new__(PagesArgs)

            __props__.__dict__["change_password"] = change_password
            __props__.__dict__["error"] = error
            __props__.__dict__["guardian_mfa"] = guardian_mfa
            __props__.__dict__["login"] = login
        super(Pages, __self__).__init__(
            'auth0:index/pages:Pages',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            change_password: Optional[pulumi.Input[pulumi.InputType['PagesChangePasswordArgs']]] = None,
            error: Optional[pulumi.Input[pulumi.InputType['PagesErrorArgs']]] = None,
            guardian_mfa: Optional[pulumi.Input[pulumi.InputType['PagesGuardianMfaArgs']]] = None,
            login: Optional[pulumi.Input[pulumi.InputType['PagesLoginArgs']]] = None) -> 'Pages':
        """
        Get an existing Pages resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['PagesChangePasswordArgs']] change_password: Configuration settings for customizing the Password Reset page.
        :param pulumi.Input[pulumi.InputType['PagesErrorArgs']] error: Configuration settings for the Error pages.
        :param pulumi.Input[pulumi.InputType['PagesGuardianMfaArgs']] guardian_mfa: Configuration settings for customizing the Guardian Multi-Factor Authentication page.
        :param pulumi.Input[pulumi.InputType['PagesLoginArgs']] login: Configuration settings for customizing the Login page.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PagesState.__new__(_PagesState)

        __props__.__dict__["change_password"] = change_password
        __props__.__dict__["error"] = error
        __props__.__dict__["guardian_mfa"] = guardian_mfa
        __props__.__dict__["login"] = login
        return Pages(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="changePassword")
    def change_password(self) -> pulumi.Output['outputs.PagesChangePassword']:
        """
        Configuration settings for customizing the Password Reset page.
        """
        return pulumi.get(self, "change_password")

    @property
    @pulumi.getter
    def error(self) -> pulumi.Output['outputs.PagesError']:
        """
        Configuration settings for the Error pages.
        """
        return pulumi.get(self, "error")

    @property
    @pulumi.getter(name="guardianMfa")
    def guardian_mfa(self) -> pulumi.Output['outputs.PagesGuardianMfa']:
        """
        Configuration settings for customizing the Guardian Multi-Factor Authentication page.
        """
        return pulumi.get(self, "guardian_mfa")

    @property
    @pulumi.getter
    def login(self) -> pulumi.Output['outputs.PagesLogin']:
        """
        Configuration settings for customizing the Login page.
        """
        return pulumi.get(self, "login")

