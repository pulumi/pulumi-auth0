// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class PromptScreenPartialInsertionPointsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Content that goes inside the form
        /// </summary>
        [Input("formContent")]
        public Input<string>? FormContent { get; set; }

        /// <summary>
        /// Content that goes at the end of the form.
        /// </summary>
        [Input("formContentEnd")]
        public Input<string>? FormContentEnd { get; set; }

        /// <summary>
        /// Content that goes at the start of the form.
        /// </summary>
        [Input("formContentStart")]
        public Input<string>? FormContentStart { get; set; }

        /// <summary>
        /// Footer content for the end of the footer.
        /// </summary>
        [Input("formFooterEnd")]
        public Input<string>? FormFooterEnd { get; set; }

        /// <summary>
        /// Footer content for the start of the footer.
        /// </summary>
        [Input("formFooterStart")]
        public Input<string>? FormFooterStart { get; set; }

        /// <summary>
        /// Actions that go at the end of secondary actions.
        /// </summary>
        [Input("secondaryActionsEnd")]
        public Input<string>? SecondaryActionsEnd { get; set; }

        /// <summary>
        /// Actions that go at the start of secondary actions.
        /// </summary>
        [Input("secondaryActionsStart")]
        public Input<string>? SecondaryActionsStart { get; set; }

        public PromptScreenPartialInsertionPointsArgs()
        {
        }
        public static new PromptScreenPartialInsertionPointsArgs Empty => new PromptScreenPartialInsertionPointsArgs();
    }
}
