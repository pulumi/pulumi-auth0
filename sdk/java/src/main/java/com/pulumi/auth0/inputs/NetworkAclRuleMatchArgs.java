// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.auth0.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkAclRuleMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkAclRuleMatchArgs Empty = new NetworkAclRuleMatchArgs();

    /**
     * ASNs. Must contain between 1 and 10 unique items.
     * 
     */
    @Import(name="asns")
    private @Nullable Output<List<Integer>> asns;

    /**
     * @return ASNs. Must contain between 1 and 10 unique items.
     * 
     */
    public Optional<Output<List<Integer>>> asns() {
        return Optional.ofNullable(this.asns);
    }

    /**
     * Geo Country Codes. Must contain between 1 and 10 unique items.
     * 
     */
    @Import(name="geoCountryCodes")
    private @Nullable Output<List<String>> geoCountryCodes;

    /**
     * @return Geo Country Codes. Must contain between 1 and 10 unique items.
     * 
     */
    public Optional<Output<List<String>>> geoCountryCodes() {
        return Optional.ofNullable(this.geoCountryCodes);
    }

    /**
     * Geo Subdivision Codes. Must contain between 1 and 10 unique items.
     * 
     */
    @Import(name="geoSubdivisionCodes")
    private @Nullable Output<List<String>> geoSubdivisionCodes;

    /**
     * @return Geo Subdivision Codes. Must contain between 1 and 10 unique items.
     * 
     */
    public Optional<Output<List<String>>> geoSubdivisionCodes() {
        return Optional.ofNullable(this.geoSubdivisionCodes);
    }

    /**
     * IPv4 CIDRs. Must contain between 1 and 10 unique items. Can be IPv4 addresses or CIDR blocks.
     * 
     */
    @Import(name="ipv4Cidrs")
    private @Nullable Output<List<String>> ipv4Cidrs;

    /**
     * @return IPv4 CIDRs. Must contain between 1 and 10 unique items. Can be IPv4 addresses or CIDR blocks.
     * 
     */
    public Optional<Output<List<String>>> ipv4Cidrs() {
        return Optional.ofNullable(this.ipv4Cidrs);
    }

    /**
     * IPv6 CIDRs. Must contain between 1 and 10 unique items. Can be IPv6 addresses or CIDR blocks.
     * 
     */
    @Import(name="ipv6Cidrs")
    private @Nullable Output<List<String>> ipv6Cidrs;

    /**
     * @return IPv6 CIDRs. Must contain between 1 and 10 unique items. Can be IPv6 addresses or CIDR blocks.
     * 
     */
    public Optional<Output<List<String>>> ipv6Cidrs() {
        return Optional.ofNullable(this.ipv6Cidrs);
    }

    /**
     * JA3 Fingerprints. Must contain between 1 and 10 unique items.
     * 
     */
    @Import(name="ja3Fingerprints")
    private @Nullable Output<List<String>> ja3Fingerprints;

    /**
     * @return JA3 Fingerprints. Must contain between 1 and 10 unique items.
     * 
     */
    public Optional<Output<List<String>>> ja3Fingerprints() {
        return Optional.ofNullable(this.ja3Fingerprints);
    }

    /**
     * JA4 Fingerprints. Must contain between 1 and 10 unique items.
     * 
     */
    @Import(name="ja4Fingerprints")
    private @Nullable Output<List<String>> ja4Fingerprints;

    /**
     * @return JA4 Fingerprints. Must contain between 1 and 10 unique items.
     * 
     */
    public Optional<Output<List<String>>> ja4Fingerprints() {
        return Optional.ofNullable(this.ja4Fingerprints);
    }

    /**
     * User Agents. Must contain between 1 and 10 unique items.
     * 
     */
    @Import(name="userAgents")
    private @Nullable Output<List<String>> userAgents;

    /**
     * @return User Agents. Must contain between 1 and 10 unique items.
     * 
     */
    public Optional<Output<List<String>>> userAgents() {
        return Optional.ofNullable(this.userAgents);
    }

    private NetworkAclRuleMatchArgs() {}

    private NetworkAclRuleMatchArgs(NetworkAclRuleMatchArgs $) {
        this.asns = $.asns;
        this.geoCountryCodes = $.geoCountryCodes;
        this.geoSubdivisionCodes = $.geoSubdivisionCodes;
        this.ipv4Cidrs = $.ipv4Cidrs;
        this.ipv6Cidrs = $.ipv6Cidrs;
        this.ja3Fingerprints = $.ja3Fingerprints;
        this.ja4Fingerprints = $.ja4Fingerprints;
        this.userAgents = $.userAgents;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkAclRuleMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkAclRuleMatchArgs $;

        public Builder() {
            $ = new NetworkAclRuleMatchArgs();
        }

        public Builder(NetworkAclRuleMatchArgs defaults) {
            $ = new NetworkAclRuleMatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param asns ASNs. Must contain between 1 and 10 unique items.
         * 
         * @return builder
         * 
         */
        public Builder asns(@Nullable Output<List<Integer>> asns) {
            $.asns = asns;
            return this;
        }

        /**
         * @param asns ASNs. Must contain between 1 and 10 unique items.
         * 
         * @return builder
         * 
         */
        public Builder asns(List<Integer> asns) {
            return asns(Output.of(asns));
        }

        /**
         * @param asns ASNs. Must contain between 1 and 10 unique items.
         * 
         * @return builder
         * 
         */
        public Builder asns(Integer... asns) {
            return asns(List.of(asns));
        }

        /**
         * @param geoCountryCodes Geo Country Codes. Must contain between 1 and 10 unique items.
         * 
         * @return builder
         * 
         */
        public Builder geoCountryCodes(@Nullable Output<List<String>> geoCountryCodes) {
            $.geoCountryCodes = geoCountryCodes;
            return this;
        }

        /**
         * @param geoCountryCodes Geo Country Codes. Must contain between 1 and 10 unique items.
         * 
         * @return builder
         * 
         */
        public Builder geoCountryCodes(List<String> geoCountryCodes) {
            return geoCountryCodes(Output.of(geoCountryCodes));
        }

        /**
         * @param geoCountryCodes Geo Country Codes. Must contain between 1 and 10 unique items.
         * 
         * @return builder
         * 
         */
        public Builder geoCountryCodes(String... geoCountryCodes) {
            return geoCountryCodes(List.of(geoCountryCodes));
        }

        /**
         * @param geoSubdivisionCodes Geo Subdivision Codes. Must contain between 1 and 10 unique items.
         * 
         * @return builder
         * 
         */
        public Builder geoSubdivisionCodes(@Nullable Output<List<String>> geoSubdivisionCodes) {
            $.geoSubdivisionCodes = geoSubdivisionCodes;
            return this;
        }

        /**
         * @param geoSubdivisionCodes Geo Subdivision Codes. Must contain between 1 and 10 unique items.
         * 
         * @return builder
         * 
         */
        public Builder geoSubdivisionCodes(List<String> geoSubdivisionCodes) {
            return geoSubdivisionCodes(Output.of(geoSubdivisionCodes));
        }

        /**
         * @param geoSubdivisionCodes Geo Subdivision Codes. Must contain between 1 and 10 unique items.
         * 
         * @return builder
         * 
         */
        public Builder geoSubdivisionCodes(String... geoSubdivisionCodes) {
            return geoSubdivisionCodes(List.of(geoSubdivisionCodes));
        }

        /**
         * @param ipv4Cidrs IPv4 CIDRs. Must contain between 1 and 10 unique items. Can be IPv4 addresses or CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Cidrs(@Nullable Output<List<String>> ipv4Cidrs) {
            $.ipv4Cidrs = ipv4Cidrs;
            return this;
        }

        /**
         * @param ipv4Cidrs IPv4 CIDRs. Must contain between 1 and 10 unique items. Can be IPv4 addresses or CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Cidrs(List<String> ipv4Cidrs) {
            return ipv4Cidrs(Output.of(ipv4Cidrs));
        }

        /**
         * @param ipv4Cidrs IPv4 CIDRs. Must contain between 1 and 10 unique items. Can be IPv4 addresses or CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Cidrs(String... ipv4Cidrs) {
            return ipv4Cidrs(List.of(ipv4Cidrs));
        }

        /**
         * @param ipv6Cidrs IPv6 CIDRs. Must contain between 1 and 10 unique items. Can be IPv6 addresses or CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Cidrs(@Nullable Output<List<String>> ipv6Cidrs) {
            $.ipv6Cidrs = ipv6Cidrs;
            return this;
        }

        /**
         * @param ipv6Cidrs IPv6 CIDRs. Must contain between 1 and 10 unique items. Can be IPv6 addresses or CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Cidrs(List<String> ipv6Cidrs) {
            return ipv6Cidrs(Output.of(ipv6Cidrs));
        }

        /**
         * @param ipv6Cidrs IPv6 CIDRs. Must contain between 1 and 10 unique items. Can be IPv6 addresses or CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Cidrs(String... ipv6Cidrs) {
            return ipv6Cidrs(List.of(ipv6Cidrs));
        }

        /**
         * @param ja3Fingerprints JA3 Fingerprints. Must contain between 1 and 10 unique items.
         * 
         * @return builder
         * 
         */
        public Builder ja3Fingerprints(@Nullable Output<List<String>> ja3Fingerprints) {
            $.ja3Fingerprints = ja3Fingerprints;
            return this;
        }

        /**
         * @param ja3Fingerprints JA3 Fingerprints. Must contain between 1 and 10 unique items.
         * 
         * @return builder
         * 
         */
        public Builder ja3Fingerprints(List<String> ja3Fingerprints) {
            return ja3Fingerprints(Output.of(ja3Fingerprints));
        }

        /**
         * @param ja3Fingerprints JA3 Fingerprints. Must contain between 1 and 10 unique items.
         * 
         * @return builder
         * 
         */
        public Builder ja3Fingerprints(String... ja3Fingerprints) {
            return ja3Fingerprints(List.of(ja3Fingerprints));
        }

        /**
         * @param ja4Fingerprints JA4 Fingerprints. Must contain between 1 and 10 unique items.
         * 
         * @return builder
         * 
         */
        public Builder ja4Fingerprints(@Nullable Output<List<String>> ja4Fingerprints) {
            $.ja4Fingerprints = ja4Fingerprints;
            return this;
        }

        /**
         * @param ja4Fingerprints JA4 Fingerprints. Must contain between 1 and 10 unique items.
         * 
         * @return builder
         * 
         */
        public Builder ja4Fingerprints(List<String> ja4Fingerprints) {
            return ja4Fingerprints(Output.of(ja4Fingerprints));
        }

        /**
         * @param ja4Fingerprints JA4 Fingerprints. Must contain between 1 and 10 unique items.
         * 
         * @return builder
         * 
         */
        public Builder ja4Fingerprints(String... ja4Fingerprints) {
            return ja4Fingerprints(List.of(ja4Fingerprints));
        }

        /**
         * @param userAgents User Agents. Must contain between 1 and 10 unique items.
         * 
         * @return builder
         * 
         */
        public Builder userAgents(@Nullable Output<List<String>> userAgents) {
            $.userAgents = userAgents;
            return this;
        }

        /**
         * @param userAgents User Agents. Must contain between 1 and 10 unique items.
         * 
         * @return builder
         * 
         */
        public Builder userAgents(List<String> userAgents) {
            return userAgents(Output.of(userAgents));
        }

        /**
         * @param userAgents User Agents. Must contain between 1 and 10 unique items.
         * 
         * @return builder
         * 
         */
        public Builder userAgents(String... userAgents) {
            return userAgents(List.of(userAgents));
        }

        public NetworkAclRuleMatchArgs build() {
            return $;
        }
    }

}
