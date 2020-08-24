# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['ResourceServer']


class ResourceServer(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_offline_access: Optional[pulumi.Input[bool]] = None,
                 enforce_policies: Optional[pulumi.Input[bool]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 options: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 scopes: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['ResourceServerScopeArgs']]]]] = None,
                 signing_alg: Optional[pulumi.Input[str]] = None,
                 signing_secret: Optional[pulumi.Input[str]] = None,
                 skip_consent_for_verifiable_first_party_clients: Optional[pulumi.Input[bool]] = None,
                 token_dialect: Optional[pulumi.Input[str]] = None,
                 token_lifetime: Optional[pulumi.Input[float]] = None,
                 token_lifetime_for_web: Optional[pulumi.Input[float]] = None,
                 verification_location: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        With this resource, you can set up APIs that can be consumed from your authorized applications.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        my_resource_server = auth0.ResourceServer("myResourceServer",
            allow_offline_access=True,
            identifier="https://api.example.com",
            scopes=[
                auth0.ResourceServerScopeArgs(
                    description="Create foos",
                    value="create:foo",
                ),
                auth0.ResourceServerScopeArgs(
                    description="Create bars",
                    value="create:bar",
                ),
            ],
            signing_alg="RS256",
            skip_consent_for_verifiable_first_party_clients=True,
            token_lifetime=8600)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_offline_access: Boolean. Indicates whether or not refresh tokens can be issued for this resource server.
        :param pulumi.Input[bool] enforce_policies: Boolean. Indicates whether or not authorization polices are enforced.
        :param pulumi.Input[str] identifier: String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
        :param pulumi.Input[str] name: String. Friendly name for the resource server. Cannot include `<` or `>` characters.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] options: Map(String). Used to store additional metadata
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['ResourceServerScopeArgs']]]] scopes: Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
        :param pulumi.Input[str] signing_alg: String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
        :param pulumi.Input[str] signing_secret: String. Secret used to sign tokens when using symmetric algorithms (HS256).
        :param pulumi.Input[bool] skip_consent_for_verifiable_first_party_clients: Boolean. Indicates whether or not to skip user consent for applications flagged as first party.
        :param pulumi.Input[str] token_dialect: String. Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz` (includes permissions).
        :param pulumi.Input[float] token_lifetime: Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
        :param pulumi.Input[float] token_lifetime_for_web: Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
        :param pulumi.Input[str] verification_location: String
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
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['allow_offline_access'] = allow_offline_access
            __props__['enforce_policies'] = enforce_policies
            __props__['identifier'] = identifier
            __props__['name'] = name
            __props__['options'] = options
            __props__['scopes'] = scopes
            __props__['signing_alg'] = signing_alg
            __props__['signing_secret'] = signing_secret
            __props__['skip_consent_for_verifiable_first_party_clients'] = skip_consent_for_verifiable_first_party_clients
            __props__['token_dialect'] = token_dialect
            __props__['token_lifetime'] = token_lifetime
            __props__['token_lifetime_for_web'] = token_lifetime_for_web
            __props__['verification_location'] = verification_location
        super(ResourceServer, __self__).__init__(
            'auth0:index/resourceServer:ResourceServer',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allow_offline_access: Optional[pulumi.Input[bool]] = None,
            enforce_policies: Optional[pulumi.Input[bool]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            options: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            scopes: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['ResourceServerScopeArgs']]]]] = None,
            signing_alg: Optional[pulumi.Input[str]] = None,
            signing_secret: Optional[pulumi.Input[str]] = None,
            skip_consent_for_verifiable_first_party_clients: Optional[pulumi.Input[bool]] = None,
            token_dialect: Optional[pulumi.Input[str]] = None,
            token_lifetime: Optional[pulumi.Input[float]] = None,
            token_lifetime_for_web: Optional[pulumi.Input[float]] = None,
            verification_location: Optional[pulumi.Input[str]] = None) -> 'ResourceServer':
        """
        Get an existing ResourceServer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_offline_access: Boolean. Indicates whether or not refresh tokens can be issued for this resource server.
        :param pulumi.Input[bool] enforce_policies: Boolean. Indicates whether or not authorization polices are enforced.
        :param pulumi.Input[str] identifier: String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
        :param pulumi.Input[str] name: String. Friendly name for the resource server. Cannot include `<` or `>` characters.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] options: Map(String). Used to store additional metadata
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['ResourceServerScopeArgs']]]] scopes: Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
        :param pulumi.Input[str] signing_alg: String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
        :param pulumi.Input[str] signing_secret: String. Secret used to sign tokens when using symmetric algorithms (HS256).
        :param pulumi.Input[bool] skip_consent_for_verifiable_first_party_clients: Boolean. Indicates whether or not to skip user consent for applications flagged as first party.
        :param pulumi.Input[str] token_dialect: String. Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz` (includes permissions).
        :param pulumi.Input[float] token_lifetime: Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
        :param pulumi.Input[float] token_lifetime_for_web: Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
        :param pulumi.Input[str] verification_location: String
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["allow_offline_access"] = allow_offline_access
        __props__["enforce_policies"] = enforce_policies
        __props__["identifier"] = identifier
        __props__["name"] = name
        __props__["options"] = options
        __props__["scopes"] = scopes
        __props__["signing_alg"] = signing_alg
        __props__["signing_secret"] = signing_secret
        __props__["skip_consent_for_verifiable_first_party_clients"] = skip_consent_for_verifiable_first_party_clients
        __props__["token_dialect"] = token_dialect
        __props__["token_lifetime"] = token_lifetime
        __props__["token_lifetime_for_web"] = token_lifetime_for_web
        __props__["verification_location"] = verification_location
        return ResourceServer(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowOfflineAccess")
    def allow_offline_access(self) -> Optional[bool]:
        """
        Boolean. Indicates whether or not refresh tokens can be issued for this resource server.
        """
        return pulumi.get(self, "allow_offline_access")

    @property
    @pulumi.getter(name="enforcePolicies")
    def enforce_policies(self) -> Optional[bool]:
        """
        Boolean. Indicates whether or not authorization polices are enforced.
        """
        return pulumi.get(self, "enforce_policies")

    @property
    @pulumi.getter
    def identifier(self) -> Optional[str]:
        """
        String. Unique identifier for the resource server. Used as the audience parameter for authorization calls. Can not be changed once set.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        String. Friendly name for the resource server. Cannot include `<` or `>` characters.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def options(self) -> Optional[Mapping[str, str]]:
        """
        Map(String). Used to store additional metadata
        """
        return pulumi.get(self, "options")

    @property
    @pulumi.getter
    def scopes(self) -> Optional[List['outputs.ResourceServerScope']]:
        """
        Set(Resource).  List of permissions (scopes) used by this resource server. For details, see Scopes.
        """
        return pulumi.get(self, "scopes")

    @property
    @pulumi.getter(name="signingAlg")
    def signing_alg(self) -> str:
        """
        String. Algorithm used to sign JWTs. Options include `HS256` and `RS256`.
        """
        return pulumi.get(self, "signing_alg")

    @property
    @pulumi.getter(name="signingSecret")
    def signing_secret(self) -> str:
        """
        String. Secret used to sign tokens when using symmetric algorithms (HS256).
        """
        return pulumi.get(self, "signing_secret")

    @property
    @pulumi.getter(name="skipConsentForVerifiableFirstPartyClients")
    def skip_consent_for_verifiable_first_party_clients(self) -> Optional[bool]:
        """
        Boolean. Indicates whether or not to skip user consent for applications flagged as first party.
        """
        return pulumi.get(self, "skip_consent_for_verifiable_first_party_clients")

    @property
    @pulumi.getter(name="tokenDialect")
    def token_dialect(self) -> Optional[str]:
        """
        String. Dialect of access tokens that should be issued for this resource server. Options include `access_token` or `access_token_authz` (includes permissions).
        """
        return pulumi.get(self, "token_dialect")

    @property
    @pulumi.getter(name="tokenLifetime")
    def token_lifetime(self) -> float:
        """
        Integer. Number of seconds during which access tokens issued for this resource server from the token endpoint remain valid.
        """
        return pulumi.get(self, "token_lifetime")

    @property
    @pulumi.getter(name="tokenLifetimeForWeb")
    def token_lifetime_for_web(self) -> float:
        """
        Integer. Number of seconds during which access tokens issued for this resource server via implicit or hybrid flows remain valid. Cannot be greater than the `token_lifetime` value.
        """
        return pulumi.get(self, "token_lifetime_for_web")

    @property
    @pulumi.getter(name="verificationLocation")
    def verification_location(self) -> Optional[str]:
        """
        String
        """
        return pulumi.get(self, "verification_location")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

