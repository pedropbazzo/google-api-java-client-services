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
 * Represents a Target TCP Proxy resource.
 *
 * A target TCP proxy is a component of a TCP Proxy load balancer. Global forwarding rules reference
 * target TCP proxy, and the target proxy then references an external backend service. For more
 * information, read TCP Proxy Load Balancing overview. (== resource_for
 * {$api_version}.targetTcpProxies ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TargetTcpProxy extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
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
   * [Output Only] Type of the resource. Always compute#targetTcpProxy for target TCP proxies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * This field only applies when the forwarding rule that references this target proxy has a
   * loadBalancingScheme set to INTERNAL_SELF_MANAGED.
   *
   * When this field is set to true, Envoy proxies set up inbound traffic interception and bind to
   * the IP address and port specified in the forwarding rule. This is generally useful when using
   * Traffic Director to configure Envoy as a gateway or middle proxy (in other words, not a sidecar
   * proxy). The Envoy proxy listens for inbound requests and handles requests when it receives
   * them.
   *
   * The default is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean proxyBind;

  /**
   * Specifies the type of proxy header to append before sending data to the backend, either NONE or
   * PROXY_V1. The default is NONE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String proxyHeader;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * URL to the BackendService resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String service;

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
  public TargetTcpProxy setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public TargetTcpProxy setDescription(java.lang.String description) {
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
  public TargetTcpProxy setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#targetTcpProxy for target TCP proxies.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#targetTcpProxy for target TCP proxies.
   * @param kind kind or {@code null} for none
   */
  public TargetTcpProxy setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public TargetTcpProxy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * This field only applies when the forwarding rule that references this target proxy has a
   * loadBalancingScheme set to INTERNAL_SELF_MANAGED.
   *
   * When this field is set to true, Envoy proxies set up inbound traffic interception and bind to
   * the IP address and port specified in the forwarding rule. This is generally useful when using
   * Traffic Director to configure Envoy as a gateway or middle proxy (in other words, not a sidecar
   * proxy). The Envoy proxy listens for inbound requests and handles requests when it receives
   * them.
   *
   * The default is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getProxyBind() {
    return proxyBind;
  }

  /**
   * This field only applies when the forwarding rule that references this target proxy has a
   * loadBalancingScheme set to INTERNAL_SELF_MANAGED.
   *
   * When this field is set to true, Envoy proxies set up inbound traffic interception and bind to
   * the IP address and port specified in the forwarding rule. This is generally useful when using
   * Traffic Director to configure Envoy as a gateway or middle proxy (in other words, not a sidecar
   * proxy). The Envoy proxy listens for inbound requests and handles requests when it receives
   * them.
   *
   * The default is false.
   * @param proxyBind proxyBind or {@code null} for none
   */
  public TargetTcpProxy setProxyBind(java.lang.Boolean proxyBind) {
    this.proxyBind = proxyBind;
    return this;
  }

  /**
   * Specifies the type of proxy header to append before sending data to the backend, either NONE or
   * PROXY_V1. The default is NONE.
   * @return value or {@code null} for none
   */
  public java.lang.String getProxyHeader() {
    return proxyHeader;
  }

  /**
   * Specifies the type of proxy header to append before sending data to the backend, either NONE or
   * PROXY_V1. The default is NONE.
   * @param proxyHeader proxyHeader or {@code null} for none
   */
  public TargetTcpProxy setProxyHeader(java.lang.String proxyHeader) {
    this.proxyHeader = proxyHeader;
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
  public TargetTcpProxy setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * URL to the BackendService resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getService() {
    return service;
  }

  /**
   * URL to the BackendService resource.
   * @param service service or {@code null} for none
   */
  public TargetTcpProxy setService(java.lang.String service) {
    this.service = service;
    return this;
  }

  @Override
  public TargetTcpProxy set(String fieldName, Object value) {
    return (TargetTcpProxy) super.set(fieldName, value);
  }

  @Override
  public TargetTcpProxy clone() {
    return (TargetTcpProxy) super.clone();
  }

}
