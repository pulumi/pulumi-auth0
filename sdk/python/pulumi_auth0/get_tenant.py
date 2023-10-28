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
    'GetTenantResult',
    'AwaitableGetTenantResult',
    'get_tenant',
    'get_tenant_output',
]

@pulumi.output_type
class GetTenantResult:
    """
    A collection of values returned by getTenant.
    """
    def __init__(__self__, allow_organization_name_in_authentication_api=None, allowed_logout_urls=None, default_audience=None, default_directory=None, default_redirection_uri=None, domain=None, enabled_locales=None, flags=None, friendly_name=None, id=None, idle_session_lifetime=None, management_api_identifier=None, picture_url=None, sandbox_version=None, session_cookies=None, session_lifetime=None, sessions=None, support_email=None, support_url=None):
        if allow_organization_name_in_authentication_api and not isinstance(allow_organization_name_in_authentication_api, bool):
            raise TypeError("Expected argument 'allow_organization_name_in_authentication_api' to be a bool")
        pulumi.set(__self__, "allow_organization_name_in_authentication_api", allow_organization_name_in_authentication_api)
        if allowed_logout_urls and not isinstance(allowed_logout_urls, list):
            raise TypeError("Expected argument 'allowed_logout_urls' to be a list")
        pulumi.set(__self__, "allowed_logout_urls", allowed_logout_urls)
        if default_audience and not isinstance(default_audience, str):
            raise TypeError("Expected argument 'default_audience' to be a str")
        pulumi.set(__self__, "default_audience", default_audience)
        if default_directory and not isinstance(default_directory, str):
            raise TypeError("Expected argument 'default_directory' to be a str")
        pulumi.set(__self__, "default_directory", default_directory)
        if default_redirection_uri and not isinstance(default_redirection_uri, str):
            raise TypeError("Expected argument 'default_redirection_uri' to be a str")
        pulumi.set(__self__, "default_redirection_uri", default_redirection_uri)
        if domain and not isinstance(domain, str):
            raise TypeError("Expected argument 'domain' to be a str")
        pulumi.set(__self__, "domain", domain)
        if enabled_locales and not isinstance(enabled_locales, list):
            raise TypeError("Expected argument 'enabled_locales' to be a list")
        pulumi.set(__self__, "enabled_locales", enabled_locales)
        if flags and not isinstance(flags, list):
            raise TypeError("Expected argument 'flags' to be a list")
        pulumi.set(__self__, "flags", flags)
        if friendly_name and not isinstance(friendly_name, str):
            raise TypeError("Expected argument 'friendly_name' to be a str")
        pulumi.set(__self__, "friendly_name", friendly_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if idle_session_lifetime and not isinstance(idle_session_lifetime, float):
            raise TypeError("Expected argument 'idle_session_lifetime' to be a float")
        pulumi.set(__self__, "idle_session_lifetime", idle_session_lifetime)
        if management_api_identifier and not isinstance(management_api_identifier, str):
            raise TypeError("Expected argument 'management_api_identifier' to be a str")
        pulumi.set(__self__, "management_api_identifier", management_api_identifier)
        if picture_url and not isinstance(picture_url, str):
            raise TypeError("Expected argument 'picture_url' to be a str")
        pulumi.set(__self__, "picture_url", picture_url)
        if sandbox_version and not isinstance(sandbox_version, str):
            raise TypeError("Expected argument 'sandbox_version' to be a str")
        pulumi.set(__self__, "sandbox_version", sandbox_version)
        if session_cookies and not isinstance(session_cookies, list):
            raise TypeError("Expected argument 'session_cookies' to be a list")
        pulumi.set(__self__, "session_cookies", session_cookies)
        if session_lifetime and not isinstance(session_lifetime, float):
            raise TypeError("Expected argument 'session_lifetime' to be a float")
        pulumi.set(__self__, "session_lifetime", session_lifetime)
        if sessions and not isinstance(sessions, list):
            raise TypeError("Expected argument 'sessions' to be a list")
        pulumi.set(__self__, "sessions", sessions)
        if support_email and not isinstance(support_email, str):
            raise TypeError("Expected argument 'support_email' to be a str")
        pulumi.set(__self__, "support_email", support_email)
        if support_url and not isinstance(support_url, str):
            raise TypeError("Expected argument 'support_url' to be a str")
        pulumi.set(__self__, "support_url", support_url)

    @property
    @pulumi.getter(name="allowOrganizationNameInAuthenticationApi")
    def allow_organization_name_in_authentication_api(self) -> bool:
        """
        Whether to accept an organization name instead of an ID on auth endpoints.
        """
        return pulumi.get(self, "allow_organization_name_in_authentication_api")

    @property
    @pulumi.getter(name="allowedLogoutUrls")
    def allowed_logout_urls(self) -> Sequence[str]:
        """
        URLs that Auth0 may redirect to after logout.
        """
        return pulumi.get(self, "allowed_logout_urls")

    @property
    @pulumi.getter(name="defaultAudience")
    def default_audience(self) -> str:
        """
        API Audience to use by default for API Authorization flows. This setting is equivalent to appending the audience to every authorization request made to the tenant for every application.
        """
        return pulumi.get(self, "default_audience")

    @property
    @pulumi.getter(name="defaultDirectory")
    def default_directory(self) -> str:
        """
        Name of the connection to be used for Password Grant exchanges. Options include `auth0-adldap`, `ad`, `auth0`, `email`, `sms`, `waad`, and `adfs`.
        """
        return pulumi.get(self, "default_directory")

    @property
    @pulumi.getter(name="defaultRedirectionUri")
    def default_redirection_uri(self) -> str:
        """
        The default absolute redirection URI. Must be HTTPS or an empty string.
        """
        return pulumi.get(self, "default_redirection_uri")

    @property
    @pulumi.getter
    def domain(self) -> str:
        """
        Your Auth0 domain name.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter(name="enabledLocales")
    def enabled_locales(self) -> Sequence[str]:
        """
        Supported locales for the user interface. The first locale in the list will be used to set the default locale.
        """
        return pulumi.get(self, "enabled_locales")

    @property
    @pulumi.getter
    def flags(self) -> Sequence['outputs.GetTenantFlagResult']:
        """
        Configuration settings for tenant flags.
        """
        return pulumi.get(self, "flags")

    @property
    @pulumi.getter(name="friendlyName")
    def friendly_name(self) -> str:
        """
        Friendly name for the tenant.
        """
        return pulumi.get(self, "friendly_name")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="idleSessionLifetime")
    def idle_session_lifetime(self) -> float:
        """
        Number of hours during which a session can be inactive before the user must log in again.
        """
        return pulumi.get(self, "idle_session_lifetime")

    @property
    @pulumi.getter(name="managementApiIdentifier")
    def management_api_identifier(self) -> str:
        """
        The identifier value of the built-in Management API resource server, which can be used as an audience when configuring client grants.
        """
        return pulumi.get(self, "management_api_identifier")

    @property
    @pulumi.getter(name="pictureUrl")
    def picture_url(self) -> str:
        """
        URL of logo to be shown for the tenant. Recommended size is 150px x 150px. If no URL is provided, the Auth0 logo will be used.
        """
        return pulumi.get(self, "picture_url")

    @property
    @pulumi.getter(name="sandboxVersion")
    def sandbox_version(self) -> str:
        """
        Selected sandbox version for the extensibility environment, which allows you to use custom scripts to extend parts of Auth0's functionality.
        """
        return pulumi.get(self, "sandbox_version")

    @property
    @pulumi.getter(name="sessionCookies")
    def session_cookies(self) -> Sequence['outputs.GetTenantSessionCookyResult']:
        """
        Alters behavior of tenant's session cookie. Contains a single `mode` property.
        """
        return pulumi.get(self, "session_cookies")

    @property
    @pulumi.getter(name="sessionLifetime")
    def session_lifetime(self) -> float:
        """
        Number of hours during which a session will stay valid.
        """
        return pulumi.get(self, "session_lifetime")

    @property
    @pulumi.getter
    def sessions(self) -> Sequence['outputs.GetTenantSessionResult']:
        """
        Sessions related settings for the tenant.
        """
        return pulumi.get(self, "sessions")

    @property
    @pulumi.getter(name="supportEmail")
    def support_email(self) -> str:
        """
        Support email address for authenticating users.
        """
        return pulumi.get(self, "support_email")

    @property
    @pulumi.getter(name="supportUrl")
    def support_url(self) -> str:
        """
        Support URL for authenticating users.
        """
        return pulumi.get(self, "support_url")


class AwaitableGetTenantResult(GetTenantResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTenantResult(
            allow_organization_name_in_authentication_api=self.allow_organization_name_in_authentication_api,
            allowed_logout_urls=self.allowed_logout_urls,
            default_audience=self.default_audience,
            default_directory=self.default_directory,
            default_redirection_uri=self.default_redirection_uri,
            domain=self.domain,
            enabled_locales=self.enabled_locales,
            flags=self.flags,
            friendly_name=self.friendly_name,
            id=self.id,
            idle_session_lifetime=self.idle_session_lifetime,
            management_api_identifier=self.management_api_identifier,
            picture_url=self.picture_url,
            sandbox_version=self.sandbox_version,
            session_cookies=self.session_cookies,
            session_lifetime=self.session_lifetime,
            sessions=self.sessions,
            support_email=self.support_email,
            support_url=self.support_url)


def get_tenant(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTenantResult:
    """
    Use this data source to access information about the tenant this provider is configured to access.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    my_tenant = auth0.get_tenant()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('auth0:index/getTenant:getTenant', __args__, opts=opts, typ=GetTenantResult).value

    return AwaitableGetTenantResult(
        allow_organization_name_in_authentication_api=pulumi.get(__ret__, 'allow_organization_name_in_authentication_api'),
        allowed_logout_urls=pulumi.get(__ret__, 'allowed_logout_urls'),
        default_audience=pulumi.get(__ret__, 'default_audience'),
        default_directory=pulumi.get(__ret__, 'default_directory'),
        default_redirection_uri=pulumi.get(__ret__, 'default_redirection_uri'),
        domain=pulumi.get(__ret__, 'domain'),
        enabled_locales=pulumi.get(__ret__, 'enabled_locales'),
        flags=pulumi.get(__ret__, 'flags'),
        friendly_name=pulumi.get(__ret__, 'friendly_name'),
        id=pulumi.get(__ret__, 'id'),
        idle_session_lifetime=pulumi.get(__ret__, 'idle_session_lifetime'),
        management_api_identifier=pulumi.get(__ret__, 'management_api_identifier'),
        picture_url=pulumi.get(__ret__, 'picture_url'),
        sandbox_version=pulumi.get(__ret__, 'sandbox_version'),
        session_cookies=pulumi.get(__ret__, 'session_cookies'),
        session_lifetime=pulumi.get(__ret__, 'session_lifetime'),
        sessions=pulumi.get(__ret__, 'sessions'),
        support_email=pulumi.get(__ret__, 'support_email'),
        support_url=pulumi.get(__ret__, 'support_url'))


@_utilities.lift_output_func(get_tenant)
def get_tenant_output(opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTenantResult]:
    """
    Use this data source to access information about the tenant this provider is configured to access.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    my_tenant = auth0.get_tenant()
    ```
    """
    ...
