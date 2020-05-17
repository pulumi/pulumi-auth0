# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class User(pulumi.CustomResource):
    app_metadata: pulumi.Output[str]
    """
    String, JSON format. Custom fields that store info about the user that impact the user's core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
    """
    blocked: pulumi.Output[bool]
    connection_name: pulumi.Output[str]
    """
    String. Name of the connection from which the user information was sourced.
    """
    email: pulumi.Output[str]
    """
    String. Email address of the user.
    """
    email_verified: pulumi.Output[bool]
    """
    Boolean. Indicates whether or not the email address has been verified.
    """
    family_name: pulumi.Output[str]
    given_name: pulumi.Output[str]
    name: pulumi.Output[str]
    nickname: pulumi.Output[str]
    """
    String. Preferred nickname or alias of the user.
    """
    password: pulumi.Output[str]
    """
    String, Case-sensitive. Initial password for this user. Used for non-SMS connections.
    """
    phone_number: pulumi.Output[str]
    """
    String. Phone number for the user; follows the E.164 recommendation. Used for SMS connections. 
    """
    phone_verified: pulumi.Output[bool]
    """
    Boolean. Indicates whether or not the phone number has been verified.
    """
    picture: pulumi.Output[str]
    roles: pulumi.Output[list]
    """
    Set(String). Set of IDs of roles assigned to the user.
    """
    user_id: pulumi.Output[str]
    """
    String. ID of the user.
    """
    user_metadata: pulumi.Output[str]
    """
    String, JSON format. Custom fields that store info about the user that does not impact a user's core functionality. Examples include work address, home address, and user preferences.
    """
    username: pulumi.Output[str]
    """
    String. Username of the user. Only valid if the connection requires a username.
    """
    verify_email: pulumi.Output[bool]
    """
    Boolean. Indicates whether or not the user will receive a verification email after creation. Overrides behavior of `email_verified` parameter.
    """
    def __init__(__self__, resource_name, opts=None, app_metadata=None, blocked=None, connection_name=None, email=None, email_verified=None, family_name=None, given_name=None, name=None, nickname=None, password=None, phone_number=None, phone_verified=None, picture=None, roles=None, user_id=None, user_metadata=None, username=None, verify_email=None, __props__=None, __name__=None, __opts__=None):
        """
        With this resource, you can manage user identities, including resetting passwords, and creating, provisioning, blocking, and deleting users.



        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_metadata: String, JSON format. Custom fields that store info about the user that impact the user's core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
        :param pulumi.Input[str] connection_name: String. Name of the connection from which the user information was sourced.
        :param pulumi.Input[str] email: String. Email address of the user.
        :param pulumi.Input[bool] email_verified: Boolean. Indicates whether or not the email address has been verified.
        :param pulumi.Input[str] nickname: String. Preferred nickname or alias of the user.
        :param pulumi.Input[str] password: String, Case-sensitive. Initial password for this user. Used for non-SMS connections.
        :param pulumi.Input[str] phone_number: String. Phone number for the user; follows the E.164 recommendation. Used for SMS connections. 
        :param pulumi.Input[bool] phone_verified: Boolean. Indicates whether or not the phone number has been verified.
        :param pulumi.Input[list] roles: Set(String). Set of IDs of roles assigned to the user.
        :param pulumi.Input[str] user_id: String. ID of the user.
        :param pulumi.Input[str] user_metadata: String, JSON format. Custom fields that store info about the user that does not impact a user's core functionality. Examples include work address, home address, and user preferences.
        :param pulumi.Input[str] username: String. Username of the user. Only valid if the connection requires a username.
        :param pulumi.Input[bool] verify_email: Boolean. Indicates whether or not the user will receive a verification email after creation. Overrides behavior of `email_verified` parameter.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['app_metadata'] = app_metadata
            __props__['blocked'] = blocked
            if connection_name is None:
                raise TypeError("Missing required property 'connection_name'")
            __props__['connection_name'] = connection_name
            __props__['email'] = email
            __props__['email_verified'] = email_verified
            __props__['family_name'] = family_name
            __props__['given_name'] = given_name
            __props__['name'] = name
            __props__['nickname'] = nickname
            __props__['password'] = password
            __props__['phone_number'] = phone_number
            __props__['phone_verified'] = phone_verified
            __props__['picture'] = picture
            __props__['roles'] = roles
            __props__['user_id'] = user_id
            __props__['user_metadata'] = user_metadata
            __props__['username'] = username
            __props__['verify_email'] = verify_email
        super(User, __self__).__init__(
            'auth0:index/user:User',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, app_metadata=None, blocked=None, connection_name=None, email=None, email_verified=None, family_name=None, given_name=None, name=None, nickname=None, password=None, phone_number=None, phone_verified=None, picture=None, roles=None, user_id=None, user_metadata=None, username=None, verify_email=None):
        """
        Get an existing User resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_metadata: String, JSON format. Custom fields that store info about the user that impact the user's core functionality, such as how an application functions or what the user can access. Examples include support plans and IDs for external accounts.
        :param pulumi.Input[str] connection_name: String. Name of the connection from which the user information was sourced.
        :param pulumi.Input[str] email: String. Email address of the user.
        :param pulumi.Input[bool] email_verified: Boolean. Indicates whether or not the email address has been verified.
        :param pulumi.Input[str] nickname: String. Preferred nickname or alias of the user.
        :param pulumi.Input[str] password: String, Case-sensitive. Initial password for this user. Used for non-SMS connections.
        :param pulumi.Input[str] phone_number: String. Phone number for the user; follows the E.164 recommendation. Used for SMS connections. 
        :param pulumi.Input[bool] phone_verified: Boolean. Indicates whether or not the phone number has been verified.
        :param pulumi.Input[list] roles: Set(String). Set of IDs of roles assigned to the user.
        :param pulumi.Input[str] user_id: String. ID of the user.
        :param pulumi.Input[str] user_metadata: String, JSON format. Custom fields that store info about the user that does not impact a user's core functionality. Examples include work address, home address, and user preferences.
        :param pulumi.Input[str] username: String. Username of the user. Only valid if the connection requires a username.
        :param pulumi.Input[bool] verify_email: Boolean. Indicates whether or not the user will receive a verification email after creation. Overrides behavior of `email_verified` parameter.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["app_metadata"] = app_metadata
        __props__["blocked"] = blocked
        __props__["connection_name"] = connection_name
        __props__["email"] = email
        __props__["email_verified"] = email_verified
        __props__["family_name"] = family_name
        __props__["given_name"] = given_name
        __props__["name"] = name
        __props__["nickname"] = nickname
        __props__["password"] = password
        __props__["phone_number"] = phone_number
        __props__["phone_verified"] = phone_verified
        __props__["picture"] = picture
        __props__["roles"] = roles
        __props__["user_id"] = user_id
        __props__["user_metadata"] = user_metadata
        __props__["username"] = username
        __props__["verify_email"] = verify_email
        return User(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

