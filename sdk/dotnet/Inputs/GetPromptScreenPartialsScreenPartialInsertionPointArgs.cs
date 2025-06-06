// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class GetPromptScreenPartialsScreenPartialInsertionPointInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Content that goes inside the form
        /// </summary>
        [Input("formContent", required: true)]
        public Input<string> FormContent { get; set; } = null!;

        /// <summary>
        /// Content that goes at the end of the form.
        /// </summary>
        [Input("formContentEnd", required: true)]
        public Input<string> FormContentEnd { get; set; } = null!;

        /// <summary>
        /// Content that goes at the start of the form.
        /// </summary>
        [Input("formContentStart", required: true)]
        public Input<string> FormContentStart { get; set; } = null!;

        /// <summary>
        /// Footer content for the end of the footer.
        /// </summary>
        [Input("formFooterEnd", required: true)]
        public Input<string> FormFooterEnd { get; set; } = null!;

        /// <summary>
        /// Footer content for the start of the footer.
        /// </summary>
        [Input("formFooterStart", required: true)]
        public Input<string> FormFooterStart { get; set; } = null!;

        /// <summary>
        /// Actions that go at the end of secondary actions.
        /// </summary>
        [Input("secondaryActionsEnd", required: true)]
        public Input<string> SecondaryActionsEnd { get; set; } = null!;

        /// <summary>
        /// Actions that go at the start of secondary actions.
        /// </summary>
        [Input("secondaryActionsStart", required: true)]
        public Input<string> SecondaryActionsStart { get; set; } = null!;

        public GetPromptScreenPartialsScreenPartialInsertionPointInputArgs()
        {
        }
        public static new GetPromptScreenPartialsScreenPartialInsertionPointInputArgs Empty => new GetPromptScreenPartialsScreenPartialInsertionPointInputArgs();
    }
}
