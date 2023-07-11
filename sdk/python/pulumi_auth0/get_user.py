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
    'GetUserResult',
    'AwaitableGetUserResult',
    'get_user',
    'get_user_output',
]

@pulumi.output_type
class GetUserResult:
    """
    A collection of values returned by getUser.
    """
    def __init__(__self__, app_metadata=None, blocked=None, connection_name=None, email=None, email_verified=None, family_name=None, given_name=None, id=None, name=None, nickname=None, password=None, permissions=None, phone_number=None, phone_verified=None, picture=None, roles=None, user_id=None, user_metadata=None, username=None, verify_email=None):
        if app_metadata and not isinstance(app_metadata, str):
            raise TypeError("Expected argument 'app_metadata' to be a str")
        pulumi.set(__self__, "app_metadata", app_metadata)
        if blocked and not isinstance(blocked, bool):
            raise TypeError("Expected argument 'blocked' to be a bool")
        pulumi.set(__self__, "blocked", blocked)
        if connection_name and not isinstance(connection_name, str):
            raise TypeError("Expected argument 'connection_name' to be a str")
        pulumi.set(__self__, "connection_name", connection_name)
        if email and not isinstance(email, str):
            raise TypeError("Expected argument 'email' to be a str")
        pulumi.set(__self__, "email", email)
        if email_verified and not isinstance(email_verified, bool):
            raise TypeError("Expected argument 'email_verified' to be a bool")
        pulumi.set(__self__, "email_verified", email_verified)
        if family_name and not isinstance(family_name, str):
            raise TypeError("Expected argument 'family_name' to be a str")
        pulumi.set(__self__, "family_name", family_name)
        if given_name and not isinstance(given_name, str):
            raise TypeError("Expected argument 'given_name' to be a str")
        pulumi.set(__self__, "given_name", given_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if nickname and not isinstance(nickname, str):
            raise TypeError("Expected argument 'nickname' to be a str")
        pulumi.set(__self__, "nickname", nickname)
        if password and not isinstance(password, str):
            raise TypeError("Expected argument 'password' to be a str")
        pulumi.set(__self__, "password", password)
        if permissions and not isinstance(permissions, list):
            raise TypeError("Expected argument 'permissions' to be a list")
        pulumi.set(__self__, "permissions", permissions)
        if phone_number and not isinstance(phone_number, str):
            raise TypeError("Expected argument 'phone_number' to be a str")
        pulumi.set(__self__, "phone_number", phone_number)
        if phone_verified and not isinstance(phone_verified, bool):
            raise TypeError("Expected argument 'phone_verified' to be a bool")
        pulumi.set(__self__, "phone_verified", phone_verified)
        if picture and not isinstance(picture, str):
            raise TypeError("Expected argument 'picture' to be a str")
        pulumi.set(__self__, "picture", picture)
        if roles and not isinstance(roles, list):
            raise TypeError("Expected argument 'roles' to be a list")
        pulumi.set(__self__, "roles", roles)
        if user_id and not isinstance(user_id, str):
            raise TypeError("Expected argument 'user_id' to be a str")
        pulumi.set(__self__, "user_id", user_id)
        if user_metadata and not isinstance(user_metadata, str):
            raise TypeError("Expected argument 'user_metadata' to be a str")
        pulumi.set(__self__, "user_metadata", user_metadata)
        if username and not isinstance(username, str):
            raise TypeError("Expected argument 'username' to be a str")
        pulumi.set(__self__, "username", username)
        if verify_email and not isinstance(verify_email, bool):
            raise TypeError("Expected argument 'verify_email' to be a bool")
        pulumi.set(__self__, "verify_email", verify_email)

    @property
    @pulumi.getter(name="appMetadata")
    def app_metadata(self) -> str:
        """
        Custom fields that store info about the user that impact the user's core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
        """
        return pulumi.get(self, "app_metadata")

    @property
    @pulumi.getter
    def blocked(self) -> bool:
        """
        Indicates whether the user is blocked or not.
        """
        return pulumi.get(self, "blocked")

    @property
    @pulumi.getter(name="connectionName")
    def connection_name(self) -> str:
        """
        Name of the connection from which the user information was sourced.
        """
        return pulumi.get(self, "connection_name")

    @property
    @pulumi.getter
    def email(self) -> str:
        """
        Email address of the user.
        """
        return pulumi.get(self, "email")

    @property
    @pulumi.getter(name="emailVerified")
    def email_verified(self) -> bool:
        """
        Indicates whether the email address has been verified.
        """
        return pulumi.get(self, "email_verified")

    @property
    @pulumi.getter(name="familyName")
    def family_name(self) -> str:
        """
        Family name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
        """
        return pulumi.get(self, "family_name")

    @property
    @pulumi.getter(name="givenName")
    def given_name(self) -> str:
        """
        Given name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
        """
        return pulumi.get(self, "given_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Name of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def nickname(self) -> str:
        """
        Preferred nickname or alias of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
        """
        return pulumi.get(self, "nickname")

    @property
    @pulumi.getter
    def password(self) -> str:
        """
        Initial password for this user. Required for non-passwordless connections (SMS and email).
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter
    def permissions(self) -> Sequence['outputs.GetUserPermissionResult']:
        """
        List of API permissions granted to the user.
        """
        return pulumi.get(self, "permissions")

    @property
    @pulumi.getter(name="phoneNumber")
    def phone_number(self) -> str:
        """
        Phone number for the user; follows the E.164 recommendation. Used for SMS connections.
        """
        return pulumi.get(self, "phone_number")

    @property
    @pulumi.getter(name="phoneVerified")
    def phone_verified(self) -> bool:
        """
        Indicates whether the phone number has been verified.
        """
        return pulumi.get(self, "phone_verified")

    @property
    @pulumi.getter
    def picture(self) -> str:
        """
        Picture of the user. This value can only be updated if the connection is a database connection (using the Auth0 store), a passwordless connection (email or sms) or has disabled 'Sync user profile attributes at each login'. For more information, see: [Configure Identity Provider Connection for User Profile Updates](https://auth0.com/docs/manage-users/user-accounts/user-profiles/configure-connection-sync-with-auth0).
        """
        return pulumi.get(self, "picture")

    @property
    @pulumi.getter
    def roles(self) -> Sequence[str]:
        """
        Set of IDs of roles assigned to the user.
        """
        return pulumi.get(self, "roles")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> str:
        """
        ID of the user.
        """
        return pulumi.get(self, "user_id")

    @property
    @pulumi.getter(name="userMetadata")
    def user_metadata(self) -> str:
        """
        Custom fields that store info about the user that does not impact a user's core functionality. Examples include work address, home address, and user preferences.
        """
        return pulumi.get(self, "user_metadata")

    @property
    @pulumi.getter
    def username(self) -> str:
        """
        Username of the user. Only valid if the connection requires a username.
        """
        return pulumi.get(self, "username")

    @property
    @pulumi.getter(name="verifyEmail")
    def verify_email(self) -> bool:
        """
        Indicates whether the user will receive a verification email after creation. Overrides behavior of `email_verified` parameter.
        """
        return pulumi.get(self, "verify_email")


class AwaitableGetUserResult(GetUserResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUserResult(
            app_metadata=self.app_metadata,
            blocked=self.blocked,
            connection_name=self.connection_name,
            email=self.email,
            email_verified=self.email_verified,
            family_name=self.family_name,
            given_name=self.given_name,
            id=self.id,
            name=self.name,
            nickname=self.nickname,
            password=self.password,
            permissions=self.permissions,
            phone_number=self.phone_number,
            phone_verified=self.phone_verified,
            picture=self.picture,
            roles=self.roles,
            user_id=self.user_id,
            user_metadata=self.user_metadata,
            username=self.username,
            verify_email=self.verify_email)


def get_user(user_id: Optional[str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUserResult:
    """
    Data source to retrieve a specific Auth0 user by `user_id`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    my_user = auth0.get_user(user_id="auth0|34fdr23fdsfdfsf")
    ```


    :param str user_id: ID of the user.
    """
    __args__ = dict()
    __args__['userId'] = user_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('auth0:index/getUser:getUser', __args__, opts=opts, typ=GetUserResult).value

    return AwaitableGetUserResult(
        app_metadata=pulumi.get(__ret__, 'app_metadata'),
        blocked=pulumi.get(__ret__, 'blocked'),
        connection_name=pulumi.get(__ret__, 'connection_name'),
        email=pulumi.get(__ret__, 'email'),
        email_verified=pulumi.get(__ret__, 'email_verified'),
        family_name=pulumi.get(__ret__, 'family_name'),
        given_name=pulumi.get(__ret__, 'given_name'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        nickname=pulumi.get(__ret__, 'nickname'),
        password=pulumi.get(__ret__, 'password'),
        permissions=pulumi.get(__ret__, 'permissions'),
        phone_number=pulumi.get(__ret__, 'phone_number'),
        phone_verified=pulumi.get(__ret__, 'phone_verified'),
        picture=pulumi.get(__ret__, 'picture'),
        roles=pulumi.get(__ret__, 'roles'),
        user_id=pulumi.get(__ret__, 'user_id'),
        user_metadata=pulumi.get(__ret__, 'user_metadata'),
        username=pulumi.get(__ret__, 'username'),
        verify_email=pulumi.get(__ret__, 'verify_email'))


@_utilities.lift_output_func(get_user)
def get_user_output(user_id: Optional[pulumi.Input[str]] = None,
                    opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetUserResult]:
    """
    Data source to retrieve a specific Auth0 user by `user_id`.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    my_user = auth0.get_user(user_id="auth0|34fdr23fdsfdfsf")
    ```


    :param str user_id: ID of the user.
    """
    ...
