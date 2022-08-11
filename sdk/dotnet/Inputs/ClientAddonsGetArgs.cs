// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientAddonsGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("aws")]
        private InputMap<object>? _aws;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Aws
        {
            get => _aws ?? (_aws = new InputMap<object>());
            set => _aws = value;
        }

        [Input("azureBlob")]
        private InputMap<object>? _azureBlob;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> AzureBlob
        {
            get => _azureBlob ?? (_azureBlob = new InputMap<object>());
            set => _azureBlob = value;
        }

        [Input("azureSb")]
        private InputMap<object>? _azureSb;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> AzureSb
        {
            get => _azureSb ?? (_azureSb = new InputMap<object>());
            set => _azureSb = value;
        }

        [Input("box")]
        private InputMap<object>? _box;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Box
        {
            get => _box ?? (_box = new InputMap<object>());
            set => _box = value;
        }

        [Input("cloudbees")]
        private InputMap<object>? _cloudbees;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Cloudbees
        {
            get => _cloudbees ?? (_cloudbees = new InputMap<object>());
            set => _cloudbees = value;
        }

        [Input("concur")]
        private InputMap<object>? _concur;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Concur
        {
            get => _concur ?? (_concur = new InputMap<object>());
            set => _concur = value;
        }

        [Input("dropbox")]
        private InputMap<object>? _dropbox;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Dropbox
        {
            get => _dropbox ?? (_dropbox = new InputMap<object>());
            set => _dropbox = value;
        }

        [Input("echosign")]
        private InputMap<object>? _echosign;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Echosign
        {
            get => _echosign ?? (_echosign = new InputMap<object>());
            set => _echosign = value;
        }

        [Input("egnyte")]
        private InputMap<object>? _egnyte;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Egnyte
        {
            get => _egnyte ?? (_egnyte = new InputMap<object>());
            set => _egnyte = value;
        }

        [Input("firebase")]
        private InputMap<object>? _firebase;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Firebase
        {
            get => _firebase ?? (_firebase = new InputMap<object>());
            set => _firebase = value;
        }

        [Input("layer")]
        private InputMap<object>? _layer;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Layer
        {
            get => _layer ?? (_layer = new InputMap<object>());
            set => _layer = value;
        }

        [Input("mscrm")]
        private InputMap<object>? _mscrm;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Mscrm
        {
            get => _mscrm ?? (_mscrm = new InputMap<object>());
            set => _mscrm = value;
        }

        [Input("newrelic")]
        private InputMap<object>? _newrelic;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Newrelic
        {
            get => _newrelic ?? (_newrelic = new InputMap<object>());
            set => _newrelic = value;
        }

        [Input("office365")]
        private InputMap<object>? _office365;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Office365
        {
            get => _office365 ?? (_office365 = new InputMap<object>());
            set => _office365 = value;
        }

        [Input("rms")]
        private InputMap<object>? _rms;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Rms
        {
            get => _rms ?? (_rms = new InputMap<object>());
            set => _rms = value;
        }

        [Input("salesforce")]
        private InputMap<object>? _salesforce;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Salesforce
        {
            get => _salesforce ?? (_salesforce = new InputMap<object>());
            set => _salesforce = value;
        }

        [Input("salesforceApi")]
        private InputMap<object>? _salesforceApi;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> SalesforceApi
        {
            get => _salesforceApi ?? (_salesforceApi = new InputMap<object>());
            set => _salesforceApi = value;
        }

        [Input("salesforceSandboxApi")]
        private InputMap<object>? _salesforceSandboxApi;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> SalesforceSandboxApi
        {
            get => _salesforceSandboxApi ?? (_salesforceSandboxApi = new InputMap<object>());
            set => _salesforceSandboxApi = value;
        }

        /// <summary>
        /// List(Resource). Configuration settings for a SAML add-on. For details, see SAML.
        /// </summary>
        [Input("samlp")]
        public Input<Inputs.ClientAddonsSamlpGetArgs>? Samlp { get; set; }

        [Input("sapApi")]
        private InputMap<object>? _sapApi;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> SapApi
        {
            get => _sapApi ?? (_sapApi = new InputMap<object>());
            set => _sapApi = value;
        }

        [Input("sentry")]
        private InputMap<object>? _sentry;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Sentry
        {
            get => _sentry ?? (_sentry = new InputMap<object>());
            set => _sentry = value;
        }

        [Input("sharepoint")]
        private InputMap<object>? _sharepoint;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Sharepoint
        {
            get => _sharepoint ?? (_sharepoint = new InputMap<object>());
            set => _sharepoint = value;
        }

        [Input("slack")]
        private InputMap<object>? _slack;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Slack
        {
            get => _slack ?? (_slack = new InputMap<object>());
            set => _slack = value;
        }

        [Input("springcm")]
        private InputMap<object>? _springcm;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Springcm
        {
            get => _springcm ?? (_springcm = new InputMap<object>());
            set => _springcm = value;
        }

        [Input("wams")]
        private InputMap<object>? _wams;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Wams
        {
            get => _wams ?? (_wams = new InputMap<object>());
            set => _wams = value;
        }

        [Input("wsfed")]
        private InputMap<object>? _wsfed;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Wsfed
        {
            get => _wsfed ?? (_wsfed = new InputMap<object>());
            set => _wsfed = value;
        }

        [Input("zendesk")]
        private InputMap<object>? _zendesk;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Zendesk
        {
            get => _zendesk ?? (_zendesk = new InputMap<object>());
            set => _zendesk = value;
        }

        [Input("zoom")]
        private InputMap<object>? _zoom;

        /// <summary>
        /// String
        /// </summary>
        public InputMap<object> Zoom
        {
            get => _zoom ?? (_zoom = new InputMap<object>());
            set => _zoom = value;
        }

        public ClientAddonsGetArgs()
        {
        }
        public static new ClientAddonsGetArgs Empty => new ClientAddonsGetArgs();
    }
}
