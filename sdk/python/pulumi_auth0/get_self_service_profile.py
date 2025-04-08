# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
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

__all__ = [
    'GetSelfServiceProfileResult',
    'AwaitableGetSelfServiceProfileResult',
    'get_self_service_profile',
    'get_self_service_profile_output',
]

@pulumi.output_type
class GetSelfServiceProfileResult:
    """
    A collection of values returned by getSelfServiceProfile.
    """
    def __init__(__self__, allowed_strategies=None, brandings=None, created_at=None, description=None, id=None, name=None, updated_at=None, user_attributes=None):
        if allowed_strategies and not isinstance(allowed_strategies, list):
            raise TypeError("Expected argument 'allowed_strategies' to be a list")
        pulumi.set(__self__, "allowed_strategies", allowed_strategies)
        if brandings and not isinstance(brandings, list):
            raise TypeError("Expected argument 'brandings' to be a list")
        pulumi.set(__self__, "brandings", brandings)
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if updated_at and not isinstance(updated_at, str):
            raise TypeError("Expected argument 'updated_at' to be a str")
        pulumi.set(__self__, "updated_at", updated_at)
        if user_attributes and not isinstance(user_attributes, list):
            raise TypeError("Expected argument 'user_attributes' to be a list")
        pulumi.set(__self__, "user_attributes", user_attributes)

    @property
    @pulumi.getter(name="allowedStrategies")
    def allowed_strategies(self) -> Sequence[builtins.str]:
        """
        List of IdP strategies that will be shown to users during the Self-Service SSO flow.
        """
        return pulumi.get(self, "allowed_strategies")

    @property
    @pulumi.getter
    def brandings(self) -> Sequence['outputs.GetSelfServiceProfileBrandingResult']:
        """
        Field can be used to customize the look and feel of the wizard.
        """
        return pulumi.get(self, "brandings")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> builtins.str:
        """
        The ISO 8601 formatted date the profile was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def description(self) -> builtins.str:
        """
        The description of the self-service Profile
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The id of the Self Service Profile
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        """
        The name of the self-service Profile
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> builtins.str:
        """
        The ISO 8601 formatted date the profile was updated.
        """
        return pulumi.get(self, "updated_at")

    @property
    @pulumi.getter(name="userAttributes")
    def user_attributes(self) -> Sequence['outputs.GetSelfServiceProfileUserAttributeResult']:
        """
        This array stores the mapping information that will be shown to the user during the SS-SSO flow. The user will be prompted to map the attributes on their identity provider to ensure the specified attributes get passed to Auth0.
        """
        return pulumi.get(self, "user_attributes")


class AwaitableGetSelfServiceProfileResult(GetSelfServiceProfileResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSelfServiceProfileResult(
            allowed_strategies=self.allowed_strategies,
            brandings=self.brandings,
            created_at=self.created_at,
            description=self.description,
            id=self.id,
            name=self.name,
            updated_at=self.updated_at,
            user_attributes=self.user_attributes)


def get_self_service_profile(id: Optional[builtins.str] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSelfServiceProfileResult:
    """
    Data source to retrieve a specific Auth0 Self-Service Profile by `id`

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    # An Auth0 Self-Service- Profile loaded using it's ID.
    auth0_self_service_profile = auth0.get_self_service_profile(id="some-profile-id")
    ```


    :param builtins.str id: The id of the Self Service Profile
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('auth0:index/getSelfServiceProfile:getSelfServiceProfile', __args__, opts=opts, typ=GetSelfServiceProfileResult).value

    return AwaitableGetSelfServiceProfileResult(
        allowed_strategies=pulumi.get(__ret__, 'allowed_strategies'),
        brandings=pulumi.get(__ret__, 'brandings'),
        created_at=pulumi.get(__ret__, 'created_at'),
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        updated_at=pulumi.get(__ret__, 'updated_at'),
        user_attributes=pulumi.get(__ret__, 'user_attributes'))
def get_self_service_profile_output(id: Optional[pulumi.Input[builtins.str]] = None,
                                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetSelfServiceProfileResult]:
    """
    Data source to retrieve a specific Auth0 Self-Service Profile by `id`

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    # An Auth0 Self-Service- Profile loaded using it's ID.
    auth0_self_service_profile = auth0.get_self_service_profile(id="some-profile-id")
    ```


    :param builtins.str id: The id of the Self Service Profile
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('auth0:index/getSelfServiceProfile:getSelfServiceProfile', __args__, opts=opts, typ=GetSelfServiceProfileResult)
    return __ret__.apply(lambda __response__: GetSelfServiceProfileResult(
        allowed_strategies=pulumi.get(__response__, 'allowed_strategies'),
        brandings=pulumi.get(__response__, 'brandings'),
        created_at=pulumi.get(__response__, 'created_at'),
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        updated_at=pulumi.get(__response__, 'updated_at'),
        user_attributes=pulumi.get(__response__, 'user_attributes')))
