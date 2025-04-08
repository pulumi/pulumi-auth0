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
from ._inputs import *

__all__ = ['EncryptionKeyManagerArgs', 'EncryptionKeyManager']

@pulumi.input_type
class EncryptionKeyManagerArgs:
    def __init__(__self__, *,
                 customer_provided_root_key: Optional[pulumi.Input['EncryptionKeyManagerCustomerProvidedRootKeyArgs']] = None,
                 key_rotation_id: Optional[pulumi.Input[builtins.str]] = None):
        """
        The set of arguments for constructing a EncryptionKeyManager resource.
        :param pulumi.Input['EncryptionKeyManagerCustomerProvidedRootKeyArgs'] customer_provided_root_key: This attribute is used for provisioning the customer provided root key. To initiate the provisioning process, create a new empty `customer_provided_root_key` block. After applying this, the `public_wrapping_key` can be retreived from the resource, and the new root key should be generated by the customer and wrapped with the wrapping key, then base64-encoded and added as the `wrapped_key` attribute.
        :param pulumi.Input[builtins.str] key_rotation_id: If this value is changed, the encryption keys will be rotated. A UUID is recommended for the `key_rotation_id`.
        """
        if customer_provided_root_key is not None:
            pulumi.set(__self__, "customer_provided_root_key", customer_provided_root_key)
        if key_rotation_id is not None:
            pulumi.set(__self__, "key_rotation_id", key_rotation_id)

    @property
    @pulumi.getter(name="customerProvidedRootKey")
    def customer_provided_root_key(self) -> Optional[pulumi.Input['EncryptionKeyManagerCustomerProvidedRootKeyArgs']]:
        """
        This attribute is used for provisioning the customer provided root key. To initiate the provisioning process, create a new empty `customer_provided_root_key` block. After applying this, the `public_wrapping_key` can be retreived from the resource, and the new root key should be generated by the customer and wrapped with the wrapping key, then base64-encoded and added as the `wrapped_key` attribute.
        """
        return pulumi.get(self, "customer_provided_root_key")

    @customer_provided_root_key.setter
    def customer_provided_root_key(self, value: Optional[pulumi.Input['EncryptionKeyManagerCustomerProvidedRootKeyArgs']]):
        pulumi.set(self, "customer_provided_root_key", value)

    @property
    @pulumi.getter(name="keyRotationId")
    def key_rotation_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        If this value is changed, the encryption keys will be rotated. A UUID is recommended for the `key_rotation_id`.
        """
        return pulumi.get(self, "key_rotation_id")

    @key_rotation_id.setter
    def key_rotation_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "key_rotation_id", value)


@pulumi.input_type
class _EncryptionKeyManagerState:
    def __init__(__self__, *,
                 customer_provided_root_key: Optional[pulumi.Input['EncryptionKeyManagerCustomerProvidedRootKeyArgs']] = None,
                 encryption_keys: Optional[pulumi.Input[Sequence[pulumi.Input['EncryptionKeyManagerEncryptionKeyArgs']]]] = None,
                 key_rotation_id: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering EncryptionKeyManager resources.
        :param pulumi.Input['EncryptionKeyManagerCustomerProvidedRootKeyArgs'] customer_provided_root_key: This attribute is used for provisioning the customer provided root key. To initiate the provisioning process, create a new empty `customer_provided_root_key` block. After applying this, the `public_wrapping_key` can be retreived from the resource, and the new root key should be generated by the customer and wrapped with the wrapping key, then base64-encoded and added as the `wrapped_key` attribute.
        :param pulumi.Input[Sequence[pulumi.Input['EncryptionKeyManagerEncryptionKeyArgs']]] encryption_keys: All encryption keys.
        :param pulumi.Input[builtins.str] key_rotation_id: If this value is changed, the encryption keys will be rotated. A UUID is recommended for the `key_rotation_id`.
        """
        if customer_provided_root_key is not None:
            pulumi.set(__self__, "customer_provided_root_key", customer_provided_root_key)
        if encryption_keys is not None:
            pulumi.set(__self__, "encryption_keys", encryption_keys)
        if key_rotation_id is not None:
            pulumi.set(__self__, "key_rotation_id", key_rotation_id)

    @property
    @pulumi.getter(name="customerProvidedRootKey")
    def customer_provided_root_key(self) -> Optional[pulumi.Input['EncryptionKeyManagerCustomerProvidedRootKeyArgs']]:
        """
        This attribute is used for provisioning the customer provided root key. To initiate the provisioning process, create a new empty `customer_provided_root_key` block. After applying this, the `public_wrapping_key` can be retreived from the resource, and the new root key should be generated by the customer and wrapped with the wrapping key, then base64-encoded and added as the `wrapped_key` attribute.
        """
        return pulumi.get(self, "customer_provided_root_key")

    @customer_provided_root_key.setter
    def customer_provided_root_key(self, value: Optional[pulumi.Input['EncryptionKeyManagerCustomerProvidedRootKeyArgs']]):
        pulumi.set(self, "customer_provided_root_key", value)

    @property
    @pulumi.getter(name="encryptionKeys")
    def encryption_keys(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['EncryptionKeyManagerEncryptionKeyArgs']]]]:
        """
        All encryption keys.
        """
        return pulumi.get(self, "encryption_keys")

    @encryption_keys.setter
    def encryption_keys(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['EncryptionKeyManagerEncryptionKeyArgs']]]]):
        pulumi.set(self, "encryption_keys", value)

    @property
    @pulumi.getter(name="keyRotationId")
    def key_rotation_id(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        If this value is changed, the encryption keys will be rotated. A UUID is recommended for the `key_rotation_id`.
        """
        return pulumi.get(self, "key_rotation_id")

    @key_rotation_id.setter
    def key_rotation_id(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "key_rotation_id", value)


class EncryptionKeyManager(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 customer_provided_root_key: Optional[pulumi.Input[Union['EncryptionKeyManagerCustomerProvidedRootKeyArgs', 'EncryptionKeyManagerCustomerProvidedRootKeyArgsDict']]] = None,
                 key_rotation_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Resource to allow the rekeying of your tenant master key.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['EncryptionKeyManagerCustomerProvidedRootKeyArgs', 'EncryptionKeyManagerCustomerProvidedRootKeyArgsDict']] customer_provided_root_key: This attribute is used for provisioning the customer provided root key. To initiate the provisioning process, create a new empty `customer_provided_root_key` block. After applying this, the `public_wrapping_key` can be retreived from the resource, and the new root key should be generated by the customer and wrapped with the wrapping key, then base64-encoded and added as the `wrapped_key` attribute.
        :param pulumi.Input[builtins.str] key_rotation_id: If this value is changed, the encryption keys will be rotated. A UUID is recommended for the `key_rotation_id`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[EncryptionKeyManagerArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource to allow the rekeying of your tenant master key.

        :param str resource_name: The name of the resource.
        :param EncryptionKeyManagerArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EncryptionKeyManagerArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 customer_provided_root_key: Optional[pulumi.Input[Union['EncryptionKeyManagerCustomerProvidedRootKeyArgs', 'EncryptionKeyManagerCustomerProvidedRootKeyArgsDict']]] = None,
                 key_rotation_id: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EncryptionKeyManagerArgs.__new__(EncryptionKeyManagerArgs)

            __props__.__dict__["customer_provided_root_key"] = customer_provided_root_key
            __props__.__dict__["key_rotation_id"] = key_rotation_id
            __props__.__dict__["encryption_keys"] = None
        super(EncryptionKeyManager, __self__).__init__(
            'auth0:index/encryptionKeyManager:EncryptionKeyManager',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            customer_provided_root_key: Optional[pulumi.Input[Union['EncryptionKeyManagerCustomerProvidedRootKeyArgs', 'EncryptionKeyManagerCustomerProvidedRootKeyArgsDict']]] = None,
            encryption_keys: Optional[pulumi.Input[Sequence[pulumi.Input[Union['EncryptionKeyManagerEncryptionKeyArgs', 'EncryptionKeyManagerEncryptionKeyArgsDict']]]]] = None,
            key_rotation_id: Optional[pulumi.Input[builtins.str]] = None) -> 'EncryptionKeyManager':
        """
        Get an existing EncryptionKeyManager resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Union['EncryptionKeyManagerCustomerProvidedRootKeyArgs', 'EncryptionKeyManagerCustomerProvidedRootKeyArgsDict']] customer_provided_root_key: This attribute is used for provisioning the customer provided root key. To initiate the provisioning process, create a new empty `customer_provided_root_key` block. After applying this, the `public_wrapping_key` can be retreived from the resource, and the new root key should be generated by the customer and wrapped with the wrapping key, then base64-encoded and added as the `wrapped_key` attribute.
        :param pulumi.Input[Sequence[pulumi.Input[Union['EncryptionKeyManagerEncryptionKeyArgs', 'EncryptionKeyManagerEncryptionKeyArgsDict']]]] encryption_keys: All encryption keys.
        :param pulumi.Input[builtins.str] key_rotation_id: If this value is changed, the encryption keys will be rotated. A UUID is recommended for the `key_rotation_id`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EncryptionKeyManagerState.__new__(_EncryptionKeyManagerState)

        __props__.__dict__["customer_provided_root_key"] = customer_provided_root_key
        __props__.__dict__["encryption_keys"] = encryption_keys
        __props__.__dict__["key_rotation_id"] = key_rotation_id
        return EncryptionKeyManager(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="customerProvidedRootKey")
    def customer_provided_root_key(self) -> pulumi.Output[Optional['outputs.EncryptionKeyManagerCustomerProvidedRootKey']]:
        """
        This attribute is used for provisioning the customer provided root key. To initiate the provisioning process, create a new empty `customer_provided_root_key` block. After applying this, the `public_wrapping_key` can be retreived from the resource, and the new root key should be generated by the customer and wrapped with the wrapping key, then base64-encoded and added as the `wrapped_key` attribute.
        """
        return pulumi.get(self, "customer_provided_root_key")

    @property
    @pulumi.getter(name="encryptionKeys")
    def encryption_keys(self) -> pulumi.Output[Sequence['outputs.EncryptionKeyManagerEncryptionKey']]:
        """
        All encryption keys.
        """
        return pulumi.get(self, "encryption_keys")

    @property
    @pulumi.getter(name="keyRotationId")
    def key_rotation_id(self) -> pulumi.Output[Optional[builtins.str]]:
        """
        If this value is changed, the encryption keys will be rotated. A UUID is recommended for the `key_rotation_id`.
        """
        return pulumi.get(self, "key_rotation_id")

