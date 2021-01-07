/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.compute.model;

/**
 * Use global external addresses for GFE-based external HTTP(S) load balancers in Premium Tier.
 *
 * Use global internal addresses for reserved peering network range.
 *
 * Use regional external addresses for the following resources:
 *
 * - External IP addresses for VM instances - Regional external forwarding rules - Cloud NAT
 * external IP addresses - GFE based LBs in Standard Tier - Network LBs in Premium or Standard Tier
 * - Cloud VPN gateways (both Classic and HA)
 *
 * Use regional internal IP addresses for subnet IP ranges (primary and secondary). This includes:
 *
 * - Internal IP addresses for VM instances - Alias IP ranges of VM instances (/32 only) - Regional
 * internal forwarding rules - Internal TCP/UDP load balancer addresses - Internal HTTP(S) load
 * balancer addresses - Cloud DNS inbound forwarding IP addresses
 *
 * For more information, read reserved IP address.
 *
 * (== resource_for {$api_version}.addresses ==) (== resource_for {$api_version}.globalAddresses ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Address extends com.google.api.client.json.GenericJson {

  /**
   * The static IP address represented by this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address;

  /**
   * The type of address to reserve, either INTERNAL or EXTERNAL. If unspecified, defaults to
   * EXTERNAL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String addressType;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this field when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * The IP version that will be used by this address. Valid options are IPV4 or IPV6. This can only
   * be specified for a global address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipVersion;

  /**
   * [Output Only] Type of the resource. Always compute#address for addresses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A fingerprint for the labels being applied to this Address, which is essentially a hash of the
   * labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an Address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String labelFingerprint;

  /**
   * Labels for this resource. These can only be added or modified by the setLabels method. Each
   * label key/value pair must comply with RFC1035. Label values may be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be
   * a lowercase letter, and all following characters (except for the last character) must be a
   * dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The URL of the network in which to reserve the address. This field can only be used with
   * INTERNAL type with the VPC_PEERING purpose.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * This signifies the networking tier used for configuring this address and can only take the
   * following values: PREMIUM or STANDARD. Global forwarding rules can only be Premium Tier.
   * Regional forwarding rules can be either Premium or Standard Tier. Standard Tier addresses
   * applied to regional forwarding rules can be used with any external load balancer. Regional
   * forwarding rules in Premium Tier can only be used with a network load balancer.
   *
   * If this field is not specified, it is assumed to be PREMIUM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkTier;

  /**
   * The prefix length if the resource reprensents an IP range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer prefixLength;

  /**
   * The purpose of this resource, which can be one of the following values: - `GCE_ENDPOINT` for
   * addresses that are used by VM instances, alias IP ranges, internal load balancers, and similar
   * resources.  - `DNS_RESOLVER` for a DNS resolver address in a subnetwork  - `VPC_PEERING` for
   * addresses that are reserved for VPC peer networks.  - `NAT_AUTO` for addresses that are
   * external IP addresses automatically reserved for Cloud NAT.  - `IPSEC_INTERCONNECT` for
   * addresses created from a private IP range that are reserved for a VLAN attachment in an IPsec
   * encrypted Interconnect configuration. These addresses are regional resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String purpose;

  /**
   * [Output Only] The URL of the region where the regional address resides. This field is not
   * applicable to global addresses. You must specify this field as part of the HTTP request URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLinkWithId;

  /**
   * [Output Only] The status of the address, which can be one of RESERVING, RESERVED, or IN_USE. An
   * address that is RESERVING is currently in the process of being reserved. A RESERVED address is
   * currently reserved and available to use. An IN_USE address is currently being used by another
   * resource and is not available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The URL of the subnetwork in which to reserve the address. If an IP address is specified, it
   * must be within the subnetwork's IP range. This field can only be used with INTERNAL type with a
   * GCE_ENDPOINT or DNS_RESOLVER purpose.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnetwork;

  /**
   * [Output Only] The URLs of the resources that are using this address.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> users;

  /**
   * The static IP address represented by this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * The static IP address represented by this resource.
   * @param address address or {@code null} for none
   */
  public Address setAddress(java.lang.String address) {
    this.address = address;
    return this;
  }

  /**
   * The type of address to reserve, either INTERNAL or EXTERNAL. If unspecified, defaults to
   * EXTERNAL.
   * @return value or {@code null} for none
   */
  public java.lang.String getAddressType() {
    return addressType;
  }

  /**
   * The type of address to reserve, either INTERNAL or EXTERNAL. If unspecified, defaults to
   * EXTERNAL.
   * @param addressType addressType or {@code null} for none
   */
  public Address setAddressType(java.lang.String addressType) {
    this.addressType = addressType;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public Address setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this field when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this field when you create the resource.
   * @param description description or {@code null} for none
   */
  public Address setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public Address setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * The IP version that will be used by this address. Valid options are IPV4 or IPV6. This can only
   * be specified for a global address.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpVersion() {
    return ipVersion;
  }

  /**
   * The IP version that will be used by this address. Valid options are IPV4 or IPV6. This can only
   * be specified for a global address.
   * @param ipVersion ipVersion or {@code null} for none
   */
  public Address setIpVersion(java.lang.String ipVersion) {
    this.ipVersion = ipVersion;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#address for addresses.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#address for addresses.
   * @param kind kind or {@code null} for none
   */
  public Address setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A fingerprint for the labels being applied to this Address, which is essentially a hash of the
   * labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an Address.
   * @see #decodeLabelFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getLabelFingerprint() {
    return labelFingerprint;
  }

  /**
   * A fingerprint for the labels being applied to this Address, which is essentially a hash of the
   * labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an Address.
   * @see #getLabelFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeLabelFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(labelFingerprint);
  }

  /**
   * A fingerprint for the labels being applied to this Address, which is essentially a hash of the
   * labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an Address.
   * @see #encodeLabelFingerprint()
   * @param labelFingerprint labelFingerprint or {@code null} for none
   */
  public Address setLabelFingerprint(java.lang.String labelFingerprint) {
    this.labelFingerprint = labelFingerprint;
    return this;
  }

  /**
   * A fingerprint for the labels being applied to this Address, which is essentially a hash of the
   * labels set used for optimistic locking. The fingerprint is initially generated by Compute
   * Engine and changes after every request to modify or update labels. You must always provide an
   * up-to-date fingerprint hash in order to update or change labels, otherwise the request will
   * fail with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve an Address.
   * @see #setLabelFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Address encodeLabelFingerprint(byte[] labelFingerprint) {
    this.labelFingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(labelFingerprint);
    return this;
  }

  /**
   * Labels for this resource. These can only be added or modified by the setLabels method. Each
   * label key/value pair must comply with RFC1035. Label values may be empty.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels for this resource. These can only be added or modified by the setLabels method. Each
   * label key/value pair must comply with RFC1035. Label values may be empty.
   * @param labels labels or {@code null} for none
   */
  public Address setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be
   * a lowercase letter, and all following characters (except for the last character) must be a
   * dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be
   * a lowercase letter, and all following characters (except for the last character) must be a
   * dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
   * @param name name or {@code null} for none
   */
  public Address setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The URL of the network in which to reserve the address. This field can only be used with
   * INTERNAL type with the VPC_PEERING purpose.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * The URL of the network in which to reserve the address. This field can only be used with
   * INTERNAL type with the VPC_PEERING purpose.
   * @param network network or {@code null} for none
   */
  public Address setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * This signifies the networking tier used for configuring this address and can only take the
   * following values: PREMIUM or STANDARD. Global forwarding rules can only be Premium Tier.
   * Regional forwarding rules can be either Premium or Standard Tier. Standard Tier addresses
   * applied to regional forwarding rules can be used with any external load balancer. Regional
   * forwarding rules in Premium Tier can only be used with a network load balancer.
   *
   * If this field is not specified, it is assumed to be PREMIUM.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkTier() {
    return networkTier;
  }

  /**
   * This signifies the networking tier used for configuring this address and can only take the
   * following values: PREMIUM or STANDARD. Global forwarding rules can only be Premium Tier.
   * Regional forwarding rules can be either Premium or Standard Tier. Standard Tier addresses
   * applied to regional forwarding rules can be used with any external load balancer. Regional
   * forwarding rules in Premium Tier can only be used with a network load balancer.
   *
   * If this field is not specified, it is assumed to be PREMIUM.
   * @param networkTier networkTier or {@code null} for none
   */
  public Address setNetworkTier(java.lang.String networkTier) {
    this.networkTier = networkTier;
    return this;
  }

  /**
   * The prefix length if the resource reprensents an IP range.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPrefixLength() {
    return prefixLength;
  }

  /**
   * The prefix length if the resource reprensents an IP range.
   * @param prefixLength prefixLength or {@code null} for none
   */
  public Address setPrefixLength(java.lang.Integer prefixLength) {
    this.prefixLength = prefixLength;
    return this;
  }

  /**
   * The purpose of this resource, which can be one of the following values: - `GCE_ENDPOINT` for
   * addresses that are used by VM instances, alias IP ranges, internal load balancers, and similar
   * resources.  - `DNS_RESOLVER` for a DNS resolver address in a subnetwork  - `VPC_PEERING` for
   * addresses that are reserved for VPC peer networks.  - `NAT_AUTO` for addresses that are
   * external IP addresses automatically reserved for Cloud NAT.  - `IPSEC_INTERCONNECT` for
   * addresses created from a private IP range that are reserved for a VLAN attachment in an IPsec
   * encrypted Interconnect configuration. These addresses are regional resources.
   * @return value or {@code null} for none
   */
  public java.lang.String getPurpose() {
    return purpose;
  }

  /**
   * The purpose of this resource, which can be one of the following values: - `GCE_ENDPOINT` for
   * addresses that are used by VM instances, alias IP ranges, internal load balancers, and similar
   * resources.  - `DNS_RESOLVER` for a DNS resolver address in a subnetwork  - `VPC_PEERING` for
   * addresses that are reserved for VPC peer networks.  - `NAT_AUTO` for addresses that are
   * external IP addresses automatically reserved for Cloud NAT.  - `IPSEC_INTERCONNECT` for
   * addresses created from a private IP range that are reserved for a VLAN attachment in an IPsec
   * encrypted Interconnect configuration. These addresses are regional resources.
   * @param purpose purpose or {@code null} for none
   */
  public Address setPurpose(java.lang.String purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * [Output Only] The URL of the region where the regional address resides. This field is not
   * applicable to global addresses. You must specify this field as part of the HTTP request URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] The URL of the region where the regional address resides. This field is not
   * applicable to global addresses. You must specify this field as part of the HTTP request URL.
   * @param region region or {@code null} for none
   */
  public Address setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Address setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLinkWithId() {
    return selfLinkWithId;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @param selfLinkWithId selfLinkWithId or {@code null} for none
   */
  public Address setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  /**
   * [Output Only] The status of the address, which can be one of RESERVING, RESERVED, or IN_USE. An
   * address that is RESERVING is currently in the process of being reserved. A RESERVED address is
   * currently reserved and available to use. An IN_USE address is currently being used by another
   * resource and is not available.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output Only] The status of the address, which can be one of RESERVING, RESERVED, or IN_USE. An
   * address that is RESERVING is currently in the process of being reserved. A RESERVED address is
   * currently reserved and available to use. An IN_USE address is currently being used by another
   * resource and is not available.
   * @param status status or {@code null} for none
   */
  public Address setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * The URL of the subnetwork in which to reserve the address. If an IP address is specified, it
   * must be within the subnetwork's IP range. This field can only be used with INTERNAL type with a
   * GCE_ENDPOINT or DNS_RESOLVER purpose.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnetwork() {
    return subnetwork;
  }

  /**
   * The URL of the subnetwork in which to reserve the address. If an IP address is specified, it
   * must be within the subnetwork's IP range. This field can only be used with INTERNAL type with a
   * GCE_ENDPOINT or DNS_RESOLVER purpose.
   * @param subnetwork subnetwork or {@code null} for none
   */
  public Address setSubnetwork(java.lang.String subnetwork) {
    this.subnetwork = subnetwork;
    return this;
  }

  /**
   * [Output Only] The URLs of the resources that are using this address.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUsers() {
    return users;
  }

  /**
   * [Output Only] The URLs of the resources that are using this address.
   * @param users users or {@code null} for none
   */
  public Address setUsers(java.util.List<java.lang.String> users) {
    this.users = users;
    return this;
  }

  @Override
  public Address set(String fieldName, Object value) {
    return (Address) super.set(fieldName, value);
  }

  @Override
  public Address clone() {
    return (Address) super.clone();
  }

}
