# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

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
    'GetBrandingThemeResult',
    'AwaitableGetBrandingThemeResult',
    'get_branding_theme',
    'get_branding_theme_output',
]

@pulumi.output_type
class GetBrandingThemeResult:
    """
    A collection of values returned by getBrandingTheme.
    """
    def __init__(__self__, borders=None, colors=None, display_name=None, fonts=None, id=None, page_backgrounds=None, widgets=None):
        if borders and not isinstance(borders, list):
            raise TypeError("Expected argument 'borders' to be a list")
        pulumi.set(__self__, "borders", borders)
        if colors and not isinstance(colors, list):
            raise TypeError("Expected argument 'colors' to be a list")
        pulumi.set(__self__, "colors", colors)
        if display_name and not isinstance(display_name, str):
            raise TypeError("Expected argument 'display_name' to be a str")
        pulumi.set(__self__, "display_name", display_name)
        if fonts and not isinstance(fonts, list):
            raise TypeError("Expected argument 'fonts' to be a list")
        pulumi.set(__self__, "fonts", fonts)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if page_backgrounds and not isinstance(page_backgrounds, list):
            raise TypeError("Expected argument 'page_backgrounds' to be a list")
        pulumi.set(__self__, "page_backgrounds", page_backgrounds)
        if widgets and not isinstance(widgets, list):
            raise TypeError("Expected argument 'widgets' to be a list")
        pulumi.set(__self__, "widgets", widgets)

    @property
    @pulumi.getter
    def borders(self) -> Sequence['outputs.GetBrandingThemeBorderResult']:
        return pulumi.get(self, "borders")

    @property
    @pulumi.getter
    def colors(self) -> Sequence['outputs.GetBrandingThemeColorResult']:
        return pulumi.get(self, "colors")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> str:
        """
        The display name for the branding theme.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def fonts(self) -> Sequence['outputs.GetBrandingThemeFontResult']:
        return pulumi.get(self, "fonts")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="pageBackgrounds")
    def page_backgrounds(self) -> Sequence['outputs.GetBrandingThemePageBackgroundResult']:
        return pulumi.get(self, "page_backgrounds")

    @property
    @pulumi.getter
    def widgets(self) -> Sequence['outputs.GetBrandingThemeWidgetResult']:
        return pulumi.get(self, "widgets")


class AwaitableGetBrandingThemeResult(GetBrandingThemeResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetBrandingThemeResult(
            borders=self.borders,
            colors=self.colors,
            display_name=self.display_name,
            fonts=self.fonts,
            id=self.id,
            page_backgrounds=self.page_backgrounds,
            widgets=self.widgets)


def get_branding_theme(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetBrandingThemeResult:
    """
    Use this data source to access information about the tenant's branding theme settings.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    my_branding_theme = auth0.get_branding_theme()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('auth0:index/getBrandingTheme:getBrandingTheme', __args__, opts=opts, typ=GetBrandingThemeResult).value

    return AwaitableGetBrandingThemeResult(
        borders=pulumi.get(__ret__, 'borders'),
        colors=pulumi.get(__ret__, 'colors'),
        display_name=pulumi.get(__ret__, 'display_name'),
        fonts=pulumi.get(__ret__, 'fonts'),
        id=pulumi.get(__ret__, 'id'),
        page_backgrounds=pulumi.get(__ret__, 'page_backgrounds'),
        widgets=pulumi.get(__ret__, 'widgets'))
def get_branding_theme_output(opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetBrandingThemeResult]:
    """
    Use this data source to access information about the tenant's branding theme settings.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_auth0 as auth0

    my_branding_theme = auth0.get_branding_theme()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('auth0:index/getBrandingTheme:getBrandingTheme', __args__, opts=opts, typ=GetBrandingThemeResult)
    return __ret__.apply(lambda __response__: GetBrandingThemeResult(
        borders=pulumi.get(__response__, 'borders'),
        colors=pulumi.get(__response__, 'colors'),
        display_name=pulumi.get(__response__, 'display_name'),
        fonts=pulumi.get(__response__, 'fonts'),
        id=pulumi.get(__response__, 'id'),
        page_backgrounds=pulumi.get(__response__, 'page_backgrounds'),
        widgets=pulumi.get(__response__, 'widgets')))
