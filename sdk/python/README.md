[![Actions Status](https://github.com/pulumi/pulumi-auth0/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-auth0/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Fauth0.svg)](https://www.npmjs.com/package/@pulumi/auth0)
[![Python version](https://badge.fury.io/py/pulumi-auth0.svg)](https://pypi.org/project/pulumi-auth0)
[![NuGet version](https://badge.fury.io/nu/pulumi.auth0.svg)](https://badge.fury.io/nu/pulumi.auth0)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-auth0/sdk/v3/go)](https://pkg.go.dev/github.com/pulumi/pulumi-auth0/sdk/v3/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-auth0/blob/master/LICENSE)

# Auth0 Resource Provider

The Auth0 Resource Provider lets you manage Auth0 resources.

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/auth0

or `yarn`:

    $ yarn add @pulumi/auth0

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_auth0

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-auth0/sdk/v3

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Auth0

## Configuration

The following configuration points are available:

- `auth0:apiToken` - (Optional) Your Auth0 [management api access
  token](https://auth0.com/docs/security/tokens/access-tokens/management-api-access-tokens). It can also be
  sourced from the `AUTH0_API_TOKEN` environment variable. It can be used instead of `auth0:clientId` +
  `auth0:clientSecret`. If both are specified, `auth0:apiToken` will be used over `auth0:clientId` +
  `auth0:clientSecret` fields.
- `auth0:audience` - (Optional) Your Auth0 audience when using a custom domain. It can also be sourced from
  the `AUTH0_AUDIENCE` environment variable.
- `auth0:clientId` - (Optional) Your Auth0 client ID. It can also be sourced from the `AUTH0_CLIENT_ID`
  environment variable.
- `auth0:clientSecret` - (Optional) Your Auth0 client secret. It can also be sourced from the
  `AUTH0_CLIENT_SECRET` environment variable.
- `auth0:debug` - (Optional) Indicates whether to turn on debug mode.
- `auth0:domain` - (Required) Your Auth0 domain name. It can also be sourced from the
  `AUTH0_DOMAIN` environment variable.

## Reference

For further information, please visit [the Auth0 provider docs](https://www.pulumi.com/docs/intro/cloud-providers/auth0) or for detailed reference documentation, please visit [the API docs](https://www.pulumi.com/docs/reference/pkg/auth0).
