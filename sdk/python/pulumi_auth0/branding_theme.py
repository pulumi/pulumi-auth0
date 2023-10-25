# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['BrandingThemeArgs', 'BrandingTheme']

@pulumi.input_type
class BrandingThemeArgs:
    def __init__(__self__, *,
                 borders: pulumi.Input['BrandingThemeBordersArgs'],
                 colors: pulumi.Input['BrandingThemeColorsArgs'],
                 fonts: pulumi.Input['BrandingThemeFontsArgs'],
                 page_background: pulumi.Input['BrandingThemePageBackgroundArgs'],
                 widget: pulumi.Input['BrandingThemeWidgetArgs'],
                 display_name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a BrandingTheme resource.
        :param pulumi.Input[str] display_name: The display name for the branding theme.
        """
        BrandingThemeArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            borders=borders,
            colors=colors,
            fonts=fonts,
            page_background=page_background,
            widget=widget,
            display_name=display_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             borders: Optional[pulumi.Input['BrandingThemeBordersArgs']] = None,
             colors: Optional[pulumi.Input['BrandingThemeColorsArgs']] = None,
             fonts: Optional[pulumi.Input['BrandingThemeFontsArgs']] = None,
             page_background: Optional[pulumi.Input['BrandingThemePageBackgroundArgs']] = None,
             widget: Optional[pulumi.Input['BrandingThemeWidgetArgs']] = None,
             display_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if borders is None:
            raise TypeError("Missing 'borders' argument")
        if colors is None:
            raise TypeError("Missing 'colors' argument")
        if fonts is None:
            raise TypeError("Missing 'fonts' argument")
        if page_background is None and 'pageBackground' in kwargs:
            page_background = kwargs['pageBackground']
        if page_background is None:
            raise TypeError("Missing 'page_background' argument")
        if widget is None:
            raise TypeError("Missing 'widget' argument")
        if display_name is None and 'displayName' in kwargs:
            display_name = kwargs['displayName']

        _setter("borders", borders)
        _setter("colors", colors)
        _setter("fonts", fonts)
        _setter("page_background", page_background)
        _setter("widget", widget)
        if display_name is not None:
            _setter("display_name", display_name)

    @property
    @pulumi.getter
    def borders(self) -> pulumi.Input['BrandingThemeBordersArgs']:
        return pulumi.get(self, "borders")

    @borders.setter
    def borders(self, value: pulumi.Input['BrandingThemeBordersArgs']):
        pulumi.set(self, "borders", value)

    @property
    @pulumi.getter
    def colors(self) -> pulumi.Input['BrandingThemeColorsArgs']:
        return pulumi.get(self, "colors")

    @colors.setter
    def colors(self, value: pulumi.Input['BrandingThemeColorsArgs']):
        pulumi.set(self, "colors", value)

    @property
    @pulumi.getter
    def fonts(self) -> pulumi.Input['BrandingThemeFontsArgs']:
        return pulumi.get(self, "fonts")

    @fonts.setter
    def fonts(self, value: pulumi.Input['BrandingThemeFontsArgs']):
        pulumi.set(self, "fonts", value)

    @property
    @pulumi.getter(name="pageBackground")
    def page_background(self) -> pulumi.Input['BrandingThemePageBackgroundArgs']:
        return pulumi.get(self, "page_background")

    @page_background.setter
    def page_background(self, value: pulumi.Input['BrandingThemePageBackgroundArgs']):
        pulumi.set(self, "page_background", value)

    @property
    @pulumi.getter
    def widget(self) -> pulumi.Input['BrandingThemeWidgetArgs']:
        return pulumi.get(self, "widget")

    @widget.setter
    def widget(self, value: pulumi.Input['BrandingThemeWidgetArgs']):
        pulumi.set(self, "widget", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The display name for the branding theme.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)


@pulumi.input_type
class _BrandingThemeState:
    def __init__(__self__, *,
                 borders: Optional[pulumi.Input['BrandingThemeBordersArgs']] = None,
                 colors: Optional[pulumi.Input['BrandingThemeColorsArgs']] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 fonts: Optional[pulumi.Input['BrandingThemeFontsArgs']] = None,
                 page_background: Optional[pulumi.Input['BrandingThemePageBackgroundArgs']] = None,
                 widget: Optional[pulumi.Input['BrandingThemeWidgetArgs']] = None):
        """
        Input properties used for looking up and filtering BrandingTheme resources.
        :param pulumi.Input[str] display_name: The display name for the branding theme.
        """
        _BrandingThemeState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            borders=borders,
            colors=colors,
            display_name=display_name,
            fonts=fonts,
            page_background=page_background,
            widget=widget,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             borders: Optional[pulumi.Input['BrandingThemeBordersArgs']] = None,
             colors: Optional[pulumi.Input['BrandingThemeColorsArgs']] = None,
             display_name: Optional[pulumi.Input[str]] = None,
             fonts: Optional[pulumi.Input['BrandingThemeFontsArgs']] = None,
             page_background: Optional[pulumi.Input['BrandingThemePageBackgroundArgs']] = None,
             widget: Optional[pulumi.Input['BrandingThemeWidgetArgs']] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if display_name is None and 'displayName' in kwargs:
            display_name = kwargs['displayName']
        if page_background is None and 'pageBackground' in kwargs:
            page_background = kwargs['pageBackground']

        if borders is not None:
            _setter("borders", borders)
        if colors is not None:
            _setter("colors", colors)
        if display_name is not None:
            _setter("display_name", display_name)
        if fonts is not None:
            _setter("fonts", fonts)
        if page_background is not None:
            _setter("page_background", page_background)
        if widget is not None:
            _setter("widget", widget)

    @property
    @pulumi.getter
    def borders(self) -> Optional[pulumi.Input['BrandingThemeBordersArgs']]:
        return pulumi.get(self, "borders")

    @borders.setter
    def borders(self, value: Optional[pulumi.Input['BrandingThemeBordersArgs']]):
        pulumi.set(self, "borders", value)

    @property
    @pulumi.getter
    def colors(self) -> Optional[pulumi.Input['BrandingThemeColorsArgs']]:
        return pulumi.get(self, "colors")

    @colors.setter
    def colors(self, value: Optional[pulumi.Input['BrandingThemeColorsArgs']]):
        pulumi.set(self, "colors", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The display name for the branding theme.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def fonts(self) -> Optional[pulumi.Input['BrandingThemeFontsArgs']]:
        return pulumi.get(self, "fonts")

    @fonts.setter
    def fonts(self, value: Optional[pulumi.Input['BrandingThemeFontsArgs']]):
        pulumi.set(self, "fonts", value)

    @property
    @pulumi.getter(name="pageBackground")
    def page_background(self) -> Optional[pulumi.Input['BrandingThemePageBackgroundArgs']]:
        return pulumi.get(self, "page_background")

    @page_background.setter
    def page_background(self, value: Optional[pulumi.Input['BrandingThemePageBackgroundArgs']]):
        pulumi.set(self, "page_background", value)

    @property
    @pulumi.getter
    def widget(self) -> Optional[pulumi.Input['BrandingThemeWidgetArgs']]:
        return pulumi.get(self, "widget")

    @widget.setter
    def widget(self, value: Optional[pulumi.Input['BrandingThemeWidgetArgs']]):
        pulumi.set(self, "widget", value)


class BrandingTheme(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 borders: Optional[pulumi.Input[pulumi.InputType['BrandingThemeBordersArgs']]] = None,
                 colors: Optional[pulumi.Input[pulumi.InputType['BrandingThemeColorsArgs']]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 fonts: Optional[pulumi.Input[pulumi.InputType['BrandingThemeFontsArgs']]] = None,
                 page_background: Optional[pulumi.Input[pulumi.InputType['BrandingThemePageBackgroundArgs']]] = None,
                 widget: Optional[pulumi.Input[pulumi.InputType['BrandingThemeWidgetArgs']]] = None,
                 __props__=None):
        """
        This resource allows you to manage branding themes for your Universal Login page within your Auth0 tenant.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        # An example of a fully configured auth0_branding_theme.
        my_theme = auth0.BrandingTheme("myTheme",
            borders=auth0.BrandingThemeBordersArgs(
                button_border_radius=1,
                button_border_weight=1,
                buttons_style="pill",
                input_border_radius=3,
                input_border_weight=1,
                inputs_style="pill",
                show_widget_shadow=False,
                widget_border_weight=1,
                widget_corner_radius=3,
            ),
            colors=auth0.BrandingThemeColorsArgs(
                body_text="#FF00CC",
                error="#FF00CC",
                header="#FF00CC",
                icons="#FF00CC",
                input_background="#FF00CC",
                input_border="#FF00CC",
                input_filled_text="#FF00CC",
                input_labels_placeholders="#FF00CC",
                links_focused_components="#FF00CC",
                primary_button="#FF00CC",
                primary_button_label="#FF00CC",
                secondary_button_border="#FF00CC",
                secondary_button_label="#FF00CC",
                success="#FF00CC",
                widget_background="#FF00CC",
                widget_border="#FF00CC",
            ),
            fonts=auth0.BrandingThemeFontsArgs(
                body_text=auth0.BrandingThemeFontsBodyTextArgs(
                    bold=False,
                    size=100,
                ),
                buttons_text=auth0.BrandingThemeFontsButtonsTextArgs(
                    bold=False,
                    size=100,
                ),
                font_url="https://google.com/font.woff",
                input_labels=auth0.BrandingThemeFontsInputLabelsArgs(
                    bold=False,
                    size=100,
                ),
                links=auth0.BrandingThemeFontsLinksArgs(
                    bold=False,
                    size=100,
                ),
                links_style="normal",
                reference_text_size=12,
                subtitle=auth0.BrandingThemeFontsSubtitleArgs(
                    bold=False,
                    size=100,
                ),
                title=auth0.BrandingThemeFontsTitleArgs(
                    bold=False,
                    size=100,
                ),
            ),
            page_background=auth0.BrandingThemePageBackgroundArgs(
                background_color="#000000",
                background_image_url="https://google.com/background.png",
                page_layout="center",
            ),
            widget=auth0.BrandingThemeWidgetArgs(
                header_text_alignment="center",
                logo_height=55,
                logo_position="center",
                logo_url="https://google.com/logo.png",
                social_buttons_layout="top",
            ))
        ```

        ## Import

        This resource can be imported by specifying the Branding Theme ID. # Example

        ```sh
         $ pulumi import auth0:index/brandingTheme:BrandingTheme my_theme "XXXXXXXXXXXXXXXXXXXX"
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] display_name: The display name for the branding theme.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: BrandingThemeArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        This resource allows you to manage branding themes for your Universal Login page within your Auth0 tenant.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_auth0 as auth0

        # An example of a fully configured auth0_branding_theme.
        my_theme = auth0.BrandingTheme("myTheme",
            borders=auth0.BrandingThemeBordersArgs(
                button_border_radius=1,
                button_border_weight=1,
                buttons_style="pill",
                input_border_radius=3,
                input_border_weight=1,
                inputs_style="pill",
                show_widget_shadow=False,
                widget_border_weight=1,
                widget_corner_radius=3,
            ),
            colors=auth0.BrandingThemeColorsArgs(
                body_text="#FF00CC",
                error="#FF00CC",
                header="#FF00CC",
                icons="#FF00CC",
                input_background="#FF00CC",
                input_border="#FF00CC",
                input_filled_text="#FF00CC",
                input_labels_placeholders="#FF00CC",
                links_focused_components="#FF00CC",
                primary_button="#FF00CC",
                primary_button_label="#FF00CC",
                secondary_button_border="#FF00CC",
                secondary_button_label="#FF00CC",
                success="#FF00CC",
                widget_background="#FF00CC",
                widget_border="#FF00CC",
            ),
            fonts=auth0.BrandingThemeFontsArgs(
                body_text=auth0.BrandingThemeFontsBodyTextArgs(
                    bold=False,
                    size=100,
                ),
                buttons_text=auth0.BrandingThemeFontsButtonsTextArgs(
                    bold=False,
                    size=100,
                ),
                font_url="https://google.com/font.woff",
                input_labels=auth0.BrandingThemeFontsInputLabelsArgs(
                    bold=False,
                    size=100,
                ),
                links=auth0.BrandingThemeFontsLinksArgs(
                    bold=False,
                    size=100,
                ),
                links_style="normal",
                reference_text_size=12,
                subtitle=auth0.BrandingThemeFontsSubtitleArgs(
                    bold=False,
                    size=100,
                ),
                title=auth0.BrandingThemeFontsTitleArgs(
                    bold=False,
                    size=100,
                ),
            ),
            page_background=auth0.BrandingThemePageBackgroundArgs(
                background_color="#000000",
                background_image_url="https://google.com/background.png",
                page_layout="center",
            ),
            widget=auth0.BrandingThemeWidgetArgs(
                header_text_alignment="center",
                logo_height=55,
                logo_position="center",
                logo_url="https://google.com/logo.png",
                social_buttons_layout="top",
            ))
        ```

        ## Import

        This resource can be imported by specifying the Branding Theme ID. # Example

        ```sh
         $ pulumi import auth0:index/brandingTheme:BrandingTheme my_theme "XXXXXXXXXXXXXXXXXXXX"
        ```

        :param str resource_name: The name of the resource.
        :param BrandingThemeArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(BrandingThemeArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            BrandingThemeArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 borders: Optional[pulumi.Input[pulumi.InputType['BrandingThemeBordersArgs']]] = None,
                 colors: Optional[pulumi.Input[pulumi.InputType['BrandingThemeColorsArgs']]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 fonts: Optional[pulumi.Input[pulumi.InputType['BrandingThemeFontsArgs']]] = None,
                 page_background: Optional[pulumi.Input[pulumi.InputType['BrandingThemePageBackgroundArgs']]] = None,
                 widget: Optional[pulumi.Input[pulumi.InputType['BrandingThemeWidgetArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = BrandingThemeArgs.__new__(BrandingThemeArgs)

            borders = _utilities.configure(borders, BrandingThemeBordersArgs, True)
            if borders is None and not opts.urn:
                raise TypeError("Missing required property 'borders'")
            __props__.__dict__["borders"] = borders
            colors = _utilities.configure(colors, BrandingThemeColorsArgs, True)
            if colors is None and not opts.urn:
                raise TypeError("Missing required property 'colors'")
            __props__.__dict__["colors"] = colors
            __props__.__dict__["display_name"] = display_name
            fonts = _utilities.configure(fonts, BrandingThemeFontsArgs, True)
            if fonts is None and not opts.urn:
                raise TypeError("Missing required property 'fonts'")
            __props__.__dict__["fonts"] = fonts
            page_background = _utilities.configure(page_background, BrandingThemePageBackgroundArgs, True)
            if page_background is None and not opts.urn:
                raise TypeError("Missing required property 'page_background'")
            __props__.__dict__["page_background"] = page_background
            widget = _utilities.configure(widget, BrandingThemeWidgetArgs, True)
            if widget is None and not opts.urn:
                raise TypeError("Missing required property 'widget'")
            __props__.__dict__["widget"] = widget
        super(BrandingTheme, __self__).__init__(
            'auth0:index/brandingTheme:BrandingTheme',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            borders: Optional[pulumi.Input[pulumi.InputType['BrandingThemeBordersArgs']]] = None,
            colors: Optional[pulumi.Input[pulumi.InputType['BrandingThemeColorsArgs']]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            fonts: Optional[pulumi.Input[pulumi.InputType['BrandingThemeFontsArgs']]] = None,
            page_background: Optional[pulumi.Input[pulumi.InputType['BrandingThemePageBackgroundArgs']]] = None,
            widget: Optional[pulumi.Input[pulumi.InputType['BrandingThemeWidgetArgs']]] = None) -> 'BrandingTheme':
        """
        Get an existing BrandingTheme resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] display_name: The display name for the branding theme.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _BrandingThemeState.__new__(_BrandingThemeState)

        __props__.__dict__["borders"] = borders
        __props__.__dict__["colors"] = colors
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["fonts"] = fonts
        __props__.__dict__["page_background"] = page_background
        __props__.__dict__["widget"] = widget
        return BrandingTheme(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def borders(self) -> pulumi.Output['outputs.BrandingThemeBorders']:
        return pulumi.get(self, "borders")

    @property
    @pulumi.getter
    def colors(self) -> pulumi.Output['outputs.BrandingThemeColors']:
        return pulumi.get(self, "colors")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[Optional[str]]:
        """
        The display name for the branding theme.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter
    def fonts(self) -> pulumi.Output['outputs.BrandingThemeFonts']:
        return pulumi.get(self, "fonts")

    @property
    @pulumi.getter(name="pageBackground")
    def page_background(self) -> pulumi.Output['outputs.BrandingThemePageBackground']:
        return pulumi.get(self, "page_background")

    @property
    @pulumi.getter
    def widget(self) -> pulumi.Output['outputs.BrandingThemeWidget']:
        return pulumi.get(self, "widget")

