// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Outputs
{

    [OutputType]
    public sealed class GlobalClientAddons
    {
        public readonly ImmutableDictionary<string, object>? Aws;
        public readonly ImmutableDictionary<string, object>? AzureBlob;
        public readonly ImmutableDictionary<string, object>? AzureSb;
        public readonly ImmutableDictionary<string, object>? Box;
        public readonly ImmutableDictionary<string, object>? Cloudbees;
        public readonly ImmutableDictionary<string, object>? Concur;
        public readonly ImmutableDictionary<string, object>? Dropbox;
        public readonly ImmutableDictionary<string, object>? Echosign;
        public readonly ImmutableDictionary<string, object>? Egnyte;
        public readonly ImmutableDictionary<string, object>? Firebase;
        public readonly ImmutableDictionary<string, object>? Layer;
        public readonly ImmutableDictionary<string, object>? Mscrm;
        public readonly ImmutableDictionary<string, object>? Newrelic;
        public readonly ImmutableDictionary<string, object>? Office365;
        public readonly ImmutableDictionary<string, object>? Rms;
        public readonly ImmutableDictionary<string, object>? Salesforce;
        public readonly ImmutableDictionary<string, object>? SalesforceApi;
        public readonly ImmutableDictionary<string, object>? SalesforceSandboxApi;
        public readonly Outputs.GlobalClientAddonsSamlp? Samlp;
        public readonly ImmutableDictionary<string, object>? SapApi;
        public readonly ImmutableDictionary<string, object>? Sentry;
        public readonly ImmutableDictionary<string, object>? Sharepoint;
        public readonly ImmutableDictionary<string, object>? Slack;
        public readonly ImmutableDictionary<string, object>? Springcm;
        public readonly ImmutableDictionary<string, object>? Wams;
        public readonly ImmutableDictionary<string, object>? Wsfed;
        public readonly ImmutableDictionary<string, object>? Zendesk;
        public readonly ImmutableDictionary<string, object>? Zoom;

        [OutputConstructor]
        private GlobalClientAddons(
            ImmutableDictionary<string, object>? aws,

            ImmutableDictionary<string, object>? azureBlob,

            ImmutableDictionary<string, object>? azureSb,

            ImmutableDictionary<string, object>? box,

            ImmutableDictionary<string, object>? cloudbees,

            ImmutableDictionary<string, object>? concur,

            ImmutableDictionary<string, object>? dropbox,

            ImmutableDictionary<string, object>? echosign,

            ImmutableDictionary<string, object>? egnyte,

            ImmutableDictionary<string, object>? firebase,

            ImmutableDictionary<string, object>? layer,

            ImmutableDictionary<string, object>? mscrm,

            ImmutableDictionary<string, object>? newrelic,

            ImmutableDictionary<string, object>? office365,

            ImmutableDictionary<string, object>? rms,

            ImmutableDictionary<string, object>? salesforce,

            ImmutableDictionary<string, object>? salesforceApi,

            ImmutableDictionary<string, object>? salesforceSandboxApi,

            Outputs.GlobalClientAddonsSamlp? samlp,

            ImmutableDictionary<string, object>? sapApi,

            ImmutableDictionary<string, object>? sentry,

            ImmutableDictionary<string, object>? sharepoint,

            ImmutableDictionary<string, object>? slack,

            ImmutableDictionary<string, object>? springcm,

            ImmutableDictionary<string, object>? wams,

            ImmutableDictionary<string, object>? wsfed,

            ImmutableDictionary<string, object>? zendesk,

            ImmutableDictionary<string, object>? zoom)
        {
            Aws = aws;
            AzureBlob = azureBlob;
            AzureSb = azureSb;
            Box = box;
            Cloudbees = cloudbees;
            Concur = concur;
            Dropbox = dropbox;
            Echosign = echosign;
            Egnyte = egnyte;
            Firebase = firebase;
            Layer = layer;
            Mscrm = mscrm;
            Newrelic = newrelic;
            Office365 = office365;
            Rms = rms;
            Salesforce = salesforce;
            SalesforceApi = salesforceApi;
            SalesforceSandboxApi = salesforceSandboxApi;
            Samlp = samlp;
            SapApi = sapApi;
            Sentry = sentry;
            Sharepoint = sharepoint;
            Slack = slack;
            Springcm = springcm;
            Wams = wams;
            Wsfed = wsfed;
            Zendesk = zendesk;
            Zoom = zoom;
        }
    }
}
