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

package com.google.api.services.managedidentities.v1beta1.model;

/**
 * Represents a relationship between two domains. This allows a controller in one domain to
 * authenticate a user in another domain.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Managed Service for Microsoft Active Directory API.
 * For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Trust extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time the instance was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The last heartbeat time when the trust was known to be connected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastTrustHeartbeatTime;

  /**
   * The trust authentication type, which decides whether the trusted side has forest/domain wide
   * access or selective access to an approved set of resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean selectiveAuthentication;

  /**
   * Output only. The current state of the trust.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Additional information about the current state of the trust, if available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stateDescription;

  /**
   * The target DNS server IP addresses which can resolve the remote domain involved in the trust.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> targetDnsIpAddresses;

  /**
   * The fully qualified target domain name which will be in trust with the current domain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetDomainName;

  /**
   * The trust direction, which decides if the current domain is trusted, trusting, or both.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trustDirection;

  /**
   * Input only. The trust secret used for the handshake with the target domain. It will not be
   * stored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trustHandshakeSecret;

  /**
   * The type of trust represented by the trust resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trustType;

  /**
   * Output only. The last update time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The time the instance was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time the instance was created.
   * @param createTime createTime or {@code null} for none
   */
  public Trust setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The last heartbeat time when the trust was known to be connected.
   * @return value or {@code null} for none
   */
  public String getLastTrustHeartbeatTime() {
    return lastTrustHeartbeatTime;
  }

  /**
   * Output only. The last heartbeat time when the trust was known to be connected.
   * @param lastTrustHeartbeatTime lastTrustHeartbeatTime or {@code null} for none
   */
  public Trust setLastTrustHeartbeatTime(String lastTrustHeartbeatTime) {
    this.lastTrustHeartbeatTime = lastTrustHeartbeatTime;
    return this;
  }

  /**
   * The trust authentication type, which decides whether the trusted side has forest/domain wide
   * access or selective access to an approved set of resources.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSelectiveAuthentication() {
    return selectiveAuthentication;
  }

  /**
   * The trust authentication type, which decides whether the trusted side has forest/domain wide
   * access or selective access to an approved set of resources.
   * @param selectiveAuthentication selectiveAuthentication or {@code null} for none
   */
  public Trust setSelectiveAuthentication(java.lang.Boolean selectiveAuthentication) {
    this.selectiveAuthentication = selectiveAuthentication;
    return this;
  }

  /**
   * Output only. The current state of the trust.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of the trust.
   * @param state state or {@code null} for none
   */
  public Trust setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Additional information about the current state of the trust, if available.
   * @return value or {@code null} for none
   */
  public java.lang.String getStateDescription() {
    return stateDescription;
  }

  /**
   * Output only. Additional information about the current state of the trust, if available.
   * @param stateDescription stateDescription or {@code null} for none
   */
  public Trust setStateDescription(java.lang.String stateDescription) {
    this.stateDescription = stateDescription;
    return this;
  }

  /**
   * The target DNS server IP addresses which can resolve the remote domain involved in the trust.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTargetDnsIpAddresses() {
    return targetDnsIpAddresses;
  }

  /**
   * The target DNS server IP addresses which can resolve the remote domain involved in the trust.
   * @param targetDnsIpAddresses targetDnsIpAddresses or {@code null} for none
   */
  public Trust setTargetDnsIpAddresses(java.util.List<java.lang.String> targetDnsIpAddresses) {
    this.targetDnsIpAddresses = targetDnsIpAddresses;
    return this;
  }

  /**
   * The fully qualified target domain name which will be in trust with the current domain.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetDomainName() {
    return targetDomainName;
  }

  /**
   * The fully qualified target domain name which will be in trust with the current domain.
   * @param targetDomainName targetDomainName or {@code null} for none
   */
  public Trust setTargetDomainName(java.lang.String targetDomainName) {
    this.targetDomainName = targetDomainName;
    return this;
  }

  /**
   * The trust direction, which decides if the current domain is trusted, trusting, or both.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrustDirection() {
    return trustDirection;
  }

  /**
   * The trust direction, which decides if the current domain is trusted, trusting, or both.
   * @param trustDirection trustDirection or {@code null} for none
   */
  public Trust setTrustDirection(java.lang.String trustDirection) {
    this.trustDirection = trustDirection;
    return this;
  }

  /**
   * Input only. The trust secret used for the handshake with the target domain. It will not be
   * stored.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrustHandshakeSecret() {
    return trustHandshakeSecret;
  }

  /**
   * Input only. The trust secret used for the handshake with the target domain. It will not be
   * stored.
   * @param trustHandshakeSecret trustHandshakeSecret or {@code null} for none
   */
  public Trust setTrustHandshakeSecret(java.lang.String trustHandshakeSecret) {
    this.trustHandshakeSecret = trustHandshakeSecret;
    return this;
  }

  /**
   * The type of trust represented by the trust resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrustType() {
    return trustType;
  }

  /**
   * The type of trust represented by the trust resource.
   * @param trustType trustType or {@code null} for none
   */
  public Trust setTrustType(java.lang.String trustType) {
    this.trustType = trustType;
    return this;
  }

  /**
   * Output only. The last update time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last update time.
   * @param updateTime updateTime or {@code null} for none
   */
  public Trust setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Trust set(String fieldName, Object value) {
    return (Trust) super.set(fieldName, value);
  }

  @Override
  public Trust clone() {
    return (Trust) super.clone();
  }

}
