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
    public sealed class GetClientAddonAzureBlobResult
    {
        public readonly string AccountName;
        public readonly bool BlobDelete;
        public readonly string BlobName;
        public readonly bool BlobRead;
        public readonly bool BlobWrite;
        public readonly bool ContainerDelete;
        public readonly bool ContainerList;
        public readonly string ContainerName;
        public readonly bool ContainerRead;
        public readonly bool ContainerWrite;
        public readonly int Expiration;
        public readonly string SignedIdentifier;
        public readonly string StorageAccessKey;

        [OutputConstructor]
        private GetClientAddonAzureBlobResult(
            string accountName,

            bool blobDelete,

            string blobName,

            bool blobRead,

            bool blobWrite,

            bool containerDelete,

            bool containerList,

            string containerName,

            bool containerRead,

            bool containerWrite,

            int expiration,

            string signedIdentifier,

            string storageAccessKey)
        {
            AccountName = accountName;
            BlobDelete = blobDelete;
            BlobName = blobName;
            BlobRead = blobRead;
            BlobWrite = blobWrite;
            ContainerDelete = containerDelete;
            ContainerList = containerList;
            ContainerName = containerName;
            ContainerRead = containerRead;
            ContainerWrite = containerWrite;
            Expiration = expiration;
            SignedIdentifier = signedIdentifier;
            StorageAccessKey = storageAccessKey;
        }
    }
}
