CHANGELOG
=========

## HEAD (Unreleased)
_(none)_

---

## 2.3.0 (2021-11-22)
* Upgrade to terraform-bridge 3.11.0
* Upgrade to pulumi 3.17.0

## 2.2.0 (2021-05-27)
* Upgrade to v3.2.1 of the pulumi-terraform-bridge

## 2.1.0 (2021-04-30)
* Upgrade to v0.20.0 of the Auth0 Terraform Provider

## 2.0.0 (2021-04-19)
* Depend on Pulumi 3.0, which includes improvements to Python resource arguments and key translation, Go SDK performance,
  Node SDK performance, general availability of Automation API, and more.

## 1.11.0 (2021-04-12)
* Upgrade to pulumi-terraform-bridge v2.23.0

## 1.10.0 (2021-04-05)
* Upgrade to v0.20.0 of the Auth0 Terraform Provider

## 1.9.1 (2021-03-23)
* Upgrade to pulumi-terraform-bridge v2.22.1  
  **Please Note:** This includes a bug fix to the refresh operation regarding arrays

## 1.9.0 (2021-03-15)
* Upgrade to pulumi-terraform-bridge v2.21.0
* Release macOS arm64 binary

## 1.8.1 (2021-02-16)
* Upgrade to pulumi-terraform-bridge v2.19.0  
  **Please Note:** This includes a bug fix that stops mutating resources options in the nodejs provider
* Avoid storing config from the environment into the state

## 1.8.0 (2021-02-08)
* Upgrade to v0.19.0 of the Auth0 Terraform Provider

## 1.7.0 (2021-02-03)
* Upgrade to v0.18.0 of the Auth0 Terraform Provider

## 1.6.0 (2021-02-01)
* Upgrade to pulumi-terraform-bridge v2.18.1

## 1.5.2 (2021-01-13)
* Upgrade to pulumi-terraform-bridge v2.17.0
* Upgrade to Pulumi v2.17.0

## 1.5.1 (2021-01-05)
* Upgrade to pulumi-terraform-bridge v2.13.2
  * This adds support for import specific examples in documentation

## 1.5.0 (2020-12-30)
* Upgrade to v0.17.2 of the Auth0 Terraform Provider

## 1.4.0 (2020-12-08)
* Upgrade to v0.16.1 of the Auth0 Terraform Provider

## 1.3.0 (2020-10-26)
* Upgrade to Pulumi v2.12.0 and pulumi-terraform-bridge v2.11.0
* Improving the accuracy of previews leading to a more accurate understanding of what will actually change rather than assuming all output properties will change.  
  ** PLEASE NOTE:**  
  This new preview functionality can be disabled by setting `PULUMI_DISABLE_PROVIDER_PREVIEW` to `1` or `false`.

## 1.2.0 (2020-10-01)
* Upgrade to pulumi-terraform-bridge v2.8.0
* Upgrade to Pulumi v2.10.0
* Upgrade to v0.15.1 of the Auth0 Terraform Provider

## 1.1.0 (2020-08-31)
* Upgrade to pulumi-terraform-bridge v2.7.3
* Upgrade to Pulumi v2.9.0, which adds type annotations and input/output classes to Python

## 1.0.2 (2020-06-10)
* Switch to GitHub actions for build

## 1.0.1 (2020-05-28)
* Upgrade to Pulumi v2.4.0
* Upgrade to pulumi-terraform-bridge v2.4.0

## 1.0.0 (2020-05-18)
* Initial release of the provider against v0.10.1 of the Auth0 Terraform Provider
