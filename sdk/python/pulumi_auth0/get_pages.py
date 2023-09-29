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

__all__ = [
    'GetPagesResult',
    'AwaitableGetPagesResult',
    'get_pages',
]

@pulumi.output_type
class GetPagesResult:
    """
    A collection of values returned by getPages.
    """
    def __init__(__self__, change_passwords=None, errors=None, guardian_mfas=None, id=None, logins=None):
        if change_passwords and not isinstance(change_passwords, list):
            raise TypeError("Expected argument 'change_passwords' to be a list")
        pulumi.set(__self__, "change_passwords", change_passwords)
        if errors and not isinstance(errors, list):
            raise TypeError("Expected argument 'errors' to be a list")
        pulumi.set(__self__, "errors", errors)
        if guardian_mfas and not isinstance(guardian_mfas, list):
            raise TypeError("Expected argument 'guardian_mfas' to be a list")
        pulumi.set(__self__, "guardian_mfas", guardian_mfas)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if logins and not isinstance(logins, list):
            raise TypeError("Expected argument 'logins' to be a list")
        pulumi.set(__self__, "logins", logins)

    @property
    @pulumi.getter(name="changePasswords")
    def change_passwords(self) -> Sequence['outputs.GetPagesChangePasswordResult']:
        """
        Configuration settings for customizing the Password Reset page.
        """
        return pulumi.get(self, "change_passwords")

    @property
    @pulumi.getter
    def errors(self) -> Sequence['outputs.GetPagesErrorResult']:
        """
        Configuration settings for the Error pages.
        """
        return pulumi.get(self, "errors")

    @property
    @pulumi.getter(name="guardianMfas")
    def guardian_mfas(self) -> Sequence['outputs.GetPagesGuardianMfaResult']:
        """
        Configuration settings for customizing the Guardian Multi-Factor Authentication page.
        """
        return pulumi.get(self, "guardian_mfas")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def logins(self) -> Sequence['outputs.GetPagesLoginResult']:
        """
        Configuration settings for customizing the Login page.
        """
        return pulumi.get(self, "logins")


class AwaitableGetPagesResult(GetPagesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPagesResult(
            change_passwords=self.change_passwords,
            errors=self.errors,
            guardian_mfas=self.guardian_mfas,
            id=self.id,
            logins=self.logins)


def get_pages(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPagesResult:
    """
    Use this data source to access the HTML for the login, reset password, multi-factor authentication and error pages.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    my_pages = auth0.get_pages()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('auth0:index/getPages:getPages', __args__, opts=opts, typ=GetPagesResult).value

    return AwaitableGetPagesResult(
        change_passwords=pulumi.get(__ret__, 'change_passwords'),
        errors=pulumi.get(__ret__, 'errors'),
        guardian_mfas=pulumi.get(__ret__, 'guardian_mfas'),
        id=pulumi.get(__ret__, 'id'),
        logins=pulumi.get(__ret__, 'logins'))