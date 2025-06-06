// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Outputs
{

    [OutputType]
    public sealed class PromptScreenPartialsScreenPartialInsertionPoints
    {
        /// <summary>
        /// Content that goes inside the form
        /// </summary>
        public readonly string? FormContent;
        /// <summary>
        /// Content that goes at the end of the form.
        /// </summary>
        public readonly string? FormContentEnd;
        /// <summary>
        /// Content that goes at the start of the form.
        /// </summary>
        public readonly string? FormContentStart;
        /// <summary>
        /// Footer content for the end of the footer.
        /// </summary>
        public readonly string? FormFooterEnd;
        /// <summary>
        /// Footer content for the start of the footer.
        /// </summary>
        public readonly string? FormFooterStart;
        /// <summary>
        /// Actions that go at the end of secondary actions.
        /// </summary>
        public readonly string? SecondaryActionsEnd;
        /// <summary>
        /// Actions that go at the start of secondary actions.
        /// </summary>
        public readonly string? SecondaryActionsStart;

        [OutputConstructor]
        private PromptScreenPartialsScreenPartialInsertionPoints(
            string? formContent,

            string? formContentEnd,

            string? formContentStart,

            string? formFooterEnd,

            string? formFooterStart,

            string? secondaryActionsEnd,

            string? secondaryActionsStart)
        {
            FormContent = formContent;
            FormContentEnd = formContentEnd;
            FormContentStart = formContentStart;
            FormFooterEnd = formFooterEnd;
            FormFooterStart = formFooterStart;
            SecondaryActionsEnd = secondaryActionsEnd;
            SecondaryActionsStart = secondaryActionsStart;
        }
    }
}
