// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientAddonsSamlpArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Audience of the SAML Assertion. Default will be the Issuer on SAMLRequest.
        /// </summary>
        [Input("audience")]
        public Input<string>? Audience { get; set; }

        /// <summary>
        /// Class reference of the authentication context.
        /// </summary>
        [Input("authnContextClassRef")]
        public Input<string>? AuthnContextClassRef { get; set; }

        /// <summary>
        /// Protocol binding used for SAML logout responses.
        /// </summary>
        [Input("binding")]
        public Input<string>? Binding { get; set; }

        /// <summary>
        /// Indicates whether a UPN claim should be created. Defaults to `true`.
        /// </summary>
        [Input("createUpnClaim")]
        public Input<bool>? CreateUpnClaim { get; set; }

        /// <summary>
        /// Destination of the SAML Response. If not specified, it will be `AssertionConsumerUrl` of SAMLRequest or callback URL if there was no SAMLRequest.
        /// </summary>
        [Input("destination")]
        public Input<string>? Destination { get; set; }

        /// <summary>
        /// Algorithm used to calculate the digest of the SAML Assertion or response. Options include `sha1` and `sha256`. Defaults to `sha1`.
        /// </summary>
        [Input("digestAlgorithm")]
        public Input<string>? DigestAlgorithm { get; set; }

        /// <summary>
        /// Indicates whether or not we should infer the NameFormat based on the attribute name. If set to `false`, the attribute NameFormat is not set in the assertion. Defaults to `true`.
        /// </summary>
        [Input("includeAttributeNameFormat")]
        public Input<bool>? IncludeAttributeNameFormat { get; set; }

        /// <summary>
        /// Issuer of the SAML Assertion.
        /// </summary>
        [Input("issuer")]
        public Input<string>? Issuer { get; set; }

        /// <summary>
        /// Number of seconds during which the token is valid. Defaults to `3600` seconds.
        /// </summary>
        [Input("lifetimeInSeconds")]
        public Input<int>? LifetimeInSeconds { get; set; }

        /// <summary>
        /// Configuration settings for logout.
        /// </summary>
        [Input("logout")]
        public Input<Inputs.ClientAddonsSamlpLogoutArgs>? Logout { get; set; }

        /// <summary>
        /// Indicates whether or not to add additional identity information in the token, such as the provider used and the `access_token`, if available. Defaults to `true`.
        /// </summary>
        [Input("mapIdentities")]
        public Input<bool>? MapIdentities { get; set; }

        /// <summary>
        /// Indicates whether to add a prefix of `http://schema.auth0.com` to any claims that are not mapped to the common profile when passed through in the output assertion. Defaults to `false`.
        /// </summary>
        [Input("mapUnknownClaimsAsIs")]
        public Input<bool>? MapUnknownClaimsAsIs { get; set; }

        [Input("mappings")]
        private InputMap<object>? _mappings;

        /// <summary>
        /// Mappings between the Auth0 user profile property name (`name`) and the output attributes on the SAML attribute in the assertion (`value`).
        /// </summary>
        public InputMap<object> Mappings
        {
            get => _mappings ?? (_mappings = new InputMap<object>());
            set => _mappings = value;
        }

        /// <summary>
        /// Format of the name identifier. Defaults to `urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified`.
        /// </summary>
        [Input("nameIdentifierFormat")]
        public Input<string>? NameIdentifierFormat { get; set; }

        [Input("nameIdentifierProbes")]
        private InputList<string>? _nameIdentifierProbes;

        /// <summary>
        /// Attributes that can be used for Subject/NameID. Auth0 will try each of the attributes of this array in order and use the first value it finds.
        /// </summary>
        public InputList<string> NameIdentifierProbes
        {
            get => _nameIdentifierProbes ?? (_nameIdentifierProbes = new InputList<string>());
            set => _nameIdentifierProbes = value;
        }

        /// <summary>
        /// Indicates whether or not to passthrough claims that are not mapped to the common profile in the output assertion. Defaults to `true`.
        /// </summary>
        [Input("passthroughClaimsWithNoMapping")]
        public Input<bool>? PassthroughClaimsWithNoMapping { get; set; }

        /// <summary>
        /// Recipient of the SAML Assertion (SubjectConfirmationData). Default is `AssertionConsumerUrl` on SAMLRequest or callback URL if no SAMLRequest was sent.
        /// </summary>
        [Input("recipient")]
        public Input<string>? Recipient { get; set; }

        /// <summary>
        /// Indicates whether or not the SAML Response should be signed instead of the SAML Assertion.
        /// </summary>
        [Input("signResponse")]
        public Input<bool>? SignResponse { get; set; }

        /// <summary>
        /// Algorithm used to sign the SAML Assertion or response. Options include `rsa-sha1` and `rsa-sha256`. Defaults to `rsa-sha1`.
        /// </summary>
        [Input("signatureAlgorithm")]
        public Input<string>? SignatureAlgorithm { get; set; }

        /// <summary>
        /// Optionally indicates the public key certificate used to validate SAML requests. If set, SAML requests will be required to be signed. A sample value would be `-----BEGIN PUBLIC KEY-----\nMIGf...bpP/t3\n+JGNGIRMj1hF1rnb6QIDAQAB\n-----END PUBLIC KEY-----\n`.
        /// </summary>
        [Input("signingCert")]
        public Input<string>? SigningCert { get; set; }

        /// <summary>
        /// Indicates whether or not we should infer the `xs:type` of the element. Types include `xs:string`, `xs:boolean`, `xs:double`, and `xs:anyType`. When set to `false`, all `xs:type` are `xs:anyType`. Defaults to `true`.
        /// </summary>
        [Input("typedAttributes")]
        public Input<bool>? TypedAttributes { get; set; }

        public ClientAddonsSamlpArgs()
        {
        }
        public static new ClientAddonsSamlpArgs Empty => new ClientAddonsSamlpArgs();
    }
}
