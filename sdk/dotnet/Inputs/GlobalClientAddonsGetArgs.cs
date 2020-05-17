// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class GlobalClientAddonsGetArgs : Pulumi.ResourceArgs
    {
        [Input("aws")]
        private InputMap<object>? _aws;
        public InputMap<object> Aws
        {
            get => _aws ?? (_aws = new InputMap<object>());
            set => _aws = value;
        }

        [Input("azureBlob")]
        private InputMap<object>? _azureBlob;
        public InputMap<object> AzureBlob
        {
            get => _azureBlob ?? (_azureBlob = new InputMap<object>());
            set => _azureBlob = value;
        }

        [Input("azureSb")]
        private InputMap<object>? _azureSb;
        public InputMap<object> AzureSb
        {
            get => _azureSb ?? (_azureSb = new InputMap<object>());
            set => _azureSb = value;
        }

        [Input("box")]
        private InputMap<object>? _box;
        public InputMap<object> Box
        {
            get => _box ?? (_box = new InputMap<object>());
            set => _box = value;
        }

        [Input("cloudbees")]
        private InputMap<object>? _cloudbees;
        public InputMap<object> Cloudbees
        {
            get => _cloudbees ?? (_cloudbees = new InputMap<object>());
            set => _cloudbees = value;
        }

        [Input("concur")]
        private InputMap<object>? _concur;
        public InputMap<object> Concur
        {
            get => _concur ?? (_concur = new InputMap<object>());
            set => _concur = value;
        }

        [Input("dropbox")]
        private InputMap<object>? _dropbox;
        public InputMap<object> Dropbox
        {
            get => _dropbox ?? (_dropbox = new InputMap<object>());
            set => _dropbox = value;
        }

        [Input("echosign")]
        private InputMap<object>? _echosign;
        public InputMap<object> Echosign
        {
            get => _echosign ?? (_echosign = new InputMap<object>());
            set => _echosign = value;
        }

        [Input("egnyte")]
        private InputMap<object>? _egnyte;
        public InputMap<object> Egnyte
        {
            get => _egnyte ?? (_egnyte = new InputMap<object>());
            set => _egnyte = value;
        }

        [Input("firebase")]
        private InputMap<object>? _firebase;
        public InputMap<object> Firebase
        {
            get => _firebase ?? (_firebase = new InputMap<object>());
            set => _firebase = value;
        }

        [Input("layer")]
        private InputMap<object>? _layer;
        public InputMap<object> Layer
        {
            get => _layer ?? (_layer = new InputMap<object>());
            set => _layer = value;
        }

        [Input("mscrm")]
        private InputMap<object>? _mscrm;
        public InputMap<object> Mscrm
        {
            get => _mscrm ?? (_mscrm = new InputMap<object>());
            set => _mscrm = value;
        }

        [Input("newrelic")]
        private InputMap<object>? _newrelic;
        public InputMap<object> Newrelic
        {
            get => _newrelic ?? (_newrelic = new InputMap<object>());
            set => _newrelic = value;
        }

        [Input("office365")]
        private InputMap<object>? _office365;
        public InputMap<object> Office365
        {
            get => _office365 ?? (_office365 = new InputMap<object>());
            set => _office365 = value;
        }

        [Input("rms")]
        private InputMap<object>? _rms;
        public InputMap<object> Rms
        {
            get => _rms ?? (_rms = new InputMap<object>());
            set => _rms = value;
        }

        [Input("salesforce")]
        private InputMap<object>? _salesforce;
        public InputMap<object> Salesforce
        {
            get => _salesforce ?? (_salesforce = new InputMap<object>());
            set => _salesforce = value;
        }

        [Input("salesforceApi")]
        private InputMap<object>? _salesforceApi;
        public InputMap<object> SalesforceApi
        {
            get => _salesforceApi ?? (_salesforceApi = new InputMap<object>());
            set => _salesforceApi = value;
        }

        [Input("salesforceSandboxApi")]
        private InputMap<object>? _salesforceSandboxApi;
        public InputMap<object> SalesforceSandboxApi
        {
            get => _salesforceSandboxApi ?? (_salesforceSandboxApi = new InputMap<object>());
            set => _salesforceSandboxApi = value;
        }

        [Input("samlp")]
        public Input<Inputs.GlobalClientAddonsSamlpGetArgs>? Samlp { get; set; }

        [Input("sapApi")]
        private InputMap<object>? _sapApi;
        public InputMap<object> SapApi
        {
            get => _sapApi ?? (_sapApi = new InputMap<object>());
            set => _sapApi = value;
        }

        [Input("sentry")]
        private InputMap<object>? _sentry;
        public InputMap<object> Sentry
        {
            get => _sentry ?? (_sentry = new InputMap<object>());
            set => _sentry = value;
        }

        [Input("sharepoint")]
        private InputMap<object>? _sharepoint;
        public InputMap<object> Sharepoint
        {
            get => _sharepoint ?? (_sharepoint = new InputMap<object>());
            set => _sharepoint = value;
        }

        [Input("slack")]
        private InputMap<object>? _slack;
        public InputMap<object> Slack
        {
            get => _slack ?? (_slack = new InputMap<object>());
            set => _slack = value;
        }

        [Input("springcm")]
        private InputMap<object>? _springcm;
        public InputMap<object> Springcm
        {
            get => _springcm ?? (_springcm = new InputMap<object>());
            set => _springcm = value;
        }

        [Input("wams")]
        private InputMap<object>? _wams;
        public InputMap<object> Wams
        {
            get => _wams ?? (_wams = new InputMap<object>());
            set => _wams = value;
        }

        [Input("wsfed")]
        private InputMap<object>? _wsfed;
        public InputMap<object> Wsfed
        {
            get => _wsfed ?? (_wsfed = new InputMap<object>());
            set => _wsfed = value;
        }

        [Input("zendesk")]
        private InputMap<object>? _zendesk;
        public InputMap<object> Zendesk
        {
            get => _zendesk ?? (_zendesk = new InputMap<object>());
            set => _zendesk = value;
        }

        [Input("zoom")]
        private InputMap<object>? _zoom;
        public InputMap<object> Zoom
        {
            get => _zoom ?? (_zoom = new InputMap<object>());
            set => _zoom = value;
        }

        public GlobalClientAddonsGetArgs()
        {
        }
    }
}
