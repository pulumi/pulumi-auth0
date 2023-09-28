// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClientAddonsAzureBlobArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientAddonsAzureBlobArgs Empty = new ClientAddonsAzureBlobArgs();

    @Import(name="accountName")
    private @Nullable Output<String> accountName;

    public Optional<Output<String>> accountName() {
        return Optional.ofNullable(this.accountName);
    }

    @Import(name="blobDelete")
    private @Nullable Output<Boolean> blobDelete;

    public Optional<Output<Boolean>> blobDelete() {
        return Optional.ofNullable(this.blobDelete);
    }

    @Import(name="blobName")
    private @Nullable Output<String> blobName;

    public Optional<Output<String>> blobName() {
        return Optional.ofNullable(this.blobName);
    }

    @Import(name="blobRead")
    private @Nullable Output<Boolean> blobRead;

    public Optional<Output<Boolean>> blobRead() {
        return Optional.ofNullable(this.blobRead);
    }

    @Import(name="blobWrite")
    private @Nullable Output<Boolean> blobWrite;

    public Optional<Output<Boolean>> blobWrite() {
        return Optional.ofNullable(this.blobWrite);
    }

    @Import(name="containerDelete")
    private @Nullable Output<Boolean> containerDelete;

    public Optional<Output<Boolean>> containerDelete() {
        return Optional.ofNullable(this.containerDelete);
    }

    @Import(name="containerList")
    private @Nullable Output<Boolean> containerList;

    public Optional<Output<Boolean>> containerList() {
        return Optional.ofNullable(this.containerList);
    }

    @Import(name="containerName")
    private @Nullable Output<String> containerName;

    public Optional<Output<String>> containerName() {
        return Optional.ofNullable(this.containerName);
    }

    @Import(name="containerRead")
    private @Nullable Output<Boolean> containerRead;

    public Optional<Output<Boolean>> containerRead() {
        return Optional.ofNullable(this.containerRead);
    }

    @Import(name="containerWrite")
    private @Nullable Output<Boolean> containerWrite;

    public Optional<Output<Boolean>> containerWrite() {
        return Optional.ofNullable(this.containerWrite);
    }

    @Import(name="expiration")
    private @Nullable Output<Integer> expiration;

    public Optional<Output<Integer>> expiration() {
        return Optional.ofNullable(this.expiration);
    }

    @Import(name="signedIdentifier")
    private @Nullable Output<String> signedIdentifier;

    public Optional<Output<String>> signedIdentifier() {
        return Optional.ofNullable(this.signedIdentifier);
    }

    @Import(name="storageAccessKey")
    private @Nullable Output<String> storageAccessKey;

    public Optional<Output<String>> storageAccessKey() {
        return Optional.ofNullable(this.storageAccessKey);
    }

    private ClientAddonsAzureBlobArgs() {}

    private ClientAddonsAzureBlobArgs(ClientAddonsAzureBlobArgs $) {
        this.accountName = $.accountName;
        this.blobDelete = $.blobDelete;
        this.blobName = $.blobName;
        this.blobRead = $.blobRead;
        this.blobWrite = $.blobWrite;
        this.containerDelete = $.containerDelete;
        this.containerList = $.containerList;
        this.containerName = $.containerName;
        this.containerRead = $.containerRead;
        this.containerWrite = $.containerWrite;
        this.expiration = $.expiration;
        this.signedIdentifier = $.signedIdentifier;
        this.storageAccessKey = $.storageAccessKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClientAddonsAzureBlobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClientAddonsAzureBlobArgs $;

        public Builder() {
            $ = new ClientAddonsAzureBlobArgs();
        }

        public Builder(ClientAddonsAzureBlobArgs defaults) {
            $ = new ClientAddonsAzureBlobArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(@Nullable Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        public Builder blobDelete(@Nullable Output<Boolean> blobDelete) {
            $.blobDelete = blobDelete;
            return this;
        }

        public Builder blobDelete(Boolean blobDelete) {
            return blobDelete(Output.of(blobDelete));
        }

        public Builder blobName(@Nullable Output<String> blobName) {
            $.blobName = blobName;
            return this;
        }

        public Builder blobName(String blobName) {
            return blobName(Output.of(blobName));
        }

        public Builder blobRead(@Nullable Output<Boolean> blobRead) {
            $.blobRead = blobRead;
            return this;
        }

        public Builder blobRead(Boolean blobRead) {
            return blobRead(Output.of(blobRead));
        }

        public Builder blobWrite(@Nullable Output<Boolean> blobWrite) {
            $.blobWrite = blobWrite;
            return this;
        }

        public Builder blobWrite(Boolean blobWrite) {
            return blobWrite(Output.of(blobWrite));
        }

        public Builder containerDelete(@Nullable Output<Boolean> containerDelete) {
            $.containerDelete = containerDelete;
            return this;
        }

        public Builder containerDelete(Boolean containerDelete) {
            return containerDelete(Output.of(containerDelete));
        }

        public Builder containerList(@Nullable Output<Boolean> containerList) {
            $.containerList = containerList;
            return this;
        }

        public Builder containerList(Boolean containerList) {
            return containerList(Output.of(containerList));
        }

        public Builder containerName(@Nullable Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        public Builder containerRead(@Nullable Output<Boolean> containerRead) {
            $.containerRead = containerRead;
            return this;
        }

        public Builder containerRead(Boolean containerRead) {
            return containerRead(Output.of(containerRead));
        }

        public Builder containerWrite(@Nullable Output<Boolean> containerWrite) {
            $.containerWrite = containerWrite;
            return this;
        }

        public Builder containerWrite(Boolean containerWrite) {
            return containerWrite(Output.of(containerWrite));
        }

        public Builder expiration(@Nullable Output<Integer> expiration) {
            $.expiration = expiration;
            return this;
        }

        public Builder expiration(Integer expiration) {
            return expiration(Output.of(expiration));
        }

        public Builder signedIdentifier(@Nullable Output<String> signedIdentifier) {
            $.signedIdentifier = signedIdentifier;
            return this;
        }

        public Builder signedIdentifier(String signedIdentifier) {
            return signedIdentifier(Output.of(signedIdentifier));
        }

        public Builder storageAccessKey(@Nullable Output<String> storageAccessKey) {
            $.storageAccessKey = storageAccessKey;
            return this;
        }

        public Builder storageAccessKey(String storageAccessKey) {
            return storageAccessKey(Output.of(storageAccessKey));
        }

        public ClientAddonsAzureBlobArgs build() {
            return $;
        }
    }

}
