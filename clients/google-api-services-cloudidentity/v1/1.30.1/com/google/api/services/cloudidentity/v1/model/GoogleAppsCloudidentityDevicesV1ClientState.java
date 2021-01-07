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

package com.google.api.services.cloudidentity.v1.model;

/**
 * Represents the state associated with an API client calling the Devices API. Resource representing
 * ClientState and supports updates from API users
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Identity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsCloudidentityDevicesV1ClientState extends com.google.api.client.json.GenericJson {

  /**
   * The caller can specify asset tags for this resource
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> assetTags;

  /**
   * The compliance state of the resource as specified by the API client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String complianceState;

  /**
   * Output only. The time the client state data was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * This field may be used to store a unique identifier for the API resource within which these
   * CustomAttributes are a field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customId;

  /**
   * The token that needs to be passed back for concurrency control in updates. Token needs to be
   * passed back in UpdateRequest
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The Health score of the resource. The Health score is the callers specification of the
   * condition of the device from a usability point of view. For example, a third-party device
   * management provider may specify a health score based on its compliance with organizational
   * policies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String healthScore;

  /**
   * The map of key-value attributes stored by callers specific to a device. The total serialized
   * length of this map may not exceed 10KB. No limit is placed on the number of attributes in a
   * map.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleAppsCloudidentityDevicesV1CustomAttributeValue> keyValuePairs;

  /**
   * Output only. The time the client state data was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastUpdateTime;

  /**
   * The management state of the resource as specified by the API client.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String managed;

  /**
   * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the
   * ClientState in format:
   * `devices/{device_id}/deviceUsers/{device_user_id}/clientState/{partner_id}`, where partner_id
   * corresponds to the partner storing the data. For partners belonging to the "BeyondCorp
   * Alliance", this is the partner ID specified to you by Google. For all other callers, this is a
   * string of the form: `{customer_id}-suffix`, where `customer_id` is your customer ID. The
   * *suffix* is any string the caller specifies. This string will be displayed verbatim in the
   * administration console. This suffix is used in setting up Custom Access Levels in Context-Aware
   * Access. Your organization's customer ID can be obtained from the URL: `GET
   * https://www.googleapis.com/admin/directory/v1/customers/my_customer` The `id` field in the
   * response contains the customer ID starting with the letter 'C'. The customer ID to be used in
   * this API is the string after the letter 'C' (not including 'C')
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The owner of the ClientState
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ownerType;

  /**
   * A descriptive cause of the health score.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scoreReason;

  /**
   * The caller can specify asset tags for this resource
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAssetTags() {
    return assetTags;
  }

  /**
   * The caller can specify asset tags for this resource
   * @param assetTags assetTags or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1ClientState setAssetTags(java.util.List<java.lang.String> assetTags) {
    this.assetTags = assetTags;
    return this;
  }

  /**
   * The compliance state of the resource as specified by the API client.
   * @return value or {@code null} for none
   */
  public java.lang.String getComplianceState() {
    return complianceState;
  }

  /**
   * The compliance state of the resource as specified by the API client.
   * @param complianceState complianceState or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1ClientState setComplianceState(java.lang.String complianceState) {
    this.complianceState = complianceState;
    return this;
  }

  /**
   * Output only. The time the client state data was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time the client state data was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1ClientState setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * This field may be used to store a unique identifier for the API resource within which these
   * CustomAttributes are a field.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomId() {
    return customId;
  }

  /**
   * This field may be used to store a unique identifier for the API resource within which these
   * CustomAttributes are a field.
   * @param customId customId or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1ClientState setCustomId(java.lang.String customId) {
    this.customId = customId;
    return this;
  }

  /**
   * The token that needs to be passed back for concurrency control in updates. Token needs to be
   * passed back in UpdateRequest
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * The token that needs to be passed back for concurrency control in updates. Token needs to be
   * passed back in UpdateRequest
   * @param etag etag or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1ClientState setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The Health score of the resource. The Health score is the callers specification of the
   * condition of the device from a usability point of view. For example, a third-party device
   * management provider may specify a health score based on its compliance with organizational
   * policies.
   * @return value or {@code null} for none
   */
  public java.lang.String getHealthScore() {
    return healthScore;
  }

  /**
   * The Health score of the resource. The Health score is the callers specification of the
   * condition of the device from a usability point of view. For example, a third-party device
   * management provider may specify a health score based on its compliance with organizational
   * policies.
   * @param healthScore healthScore or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1ClientState setHealthScore(java.lang.String healthScore) {
    this.healthScore = healthScore;
    return this;
  }

  /**
   * The map of key-value attributes stored by callers specific to a device. The total serialized
   * length of this map may not exceed 10KB. No limit is placed on the number of attributes in a
   * map.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleAppsCloudidentityDevicesV1CustomAttributeValue> getKeyValuePairs() {
    return keyValuePairs;
  }

  /**
   * The map of key-value attributes stored by callers specific to a device. The total serialized
   * length of this map may not exceed 10KB. No limit is placed on the number of attributes in a
   * map.
   * @param keyValuePairs keyValuePairs or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1ClientState setKeyValuePairs(java.util.Map<String, GoogleAppsCloudidentityDevicesV1CustomAttributeValue> keyValuePairs) {
    this.keyValuePairs = keyValuePairs;
    return this;
  }

  /**
   * Output only. The time the client state data was last updated.
   * @return value or {@code null} for none
   */
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  /**
   * Output only. The time the client state data was last updated.
   * @param lastUpdateTime lastUpdateTime or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1ClientState setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  /**
   * The management state of the resource as specified by the API client.
   * @return value or {@code null} for none
   */
  public java.lang.String getManaged() {
    return managed;
  }

  /**
   * The management state of the resource as specified by the API client.
   * @param managed managed or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1ClientState setManaged(java.lang.String managed) {
    this.managed = managed;
    return this;
  }

  /**
   * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the
   * ClientState in format:
   * `devices/{device_id}/deviceUsers/{device_user_id}/clientState/{partner_id}`, where partner_id
   * corresponds to the partner storing the data. For partners belonging to the "BeyondCorp
   * Alliance", this is the partner ID specified to you by Google. For all other callers, this is a
   * string of the form: `{customer_id}-suffix`, where `customer_id` is your customer ID. The
   * *suffix* is any string the caller specifies. This string will be displayed verbatim in the
   * administration console. This suffix is used in setting up Custom Access Levels in Context-Aware
   * Access. Your organization's customer ID can be obtained from the URL: `GET
   * https://www.googleapis.com/admin/directory/v1/customers/my_customer` The `id` field in the
   * response contains the customer ID starting with the letter 'C'. The customer ID to be used in
   * this API is the string after the letter 'C' (not including 'C')
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the
   * ClientState in format:
   * `devices/{device_id}/deviceUsers/{device_user_id}/clientState/{partner_id}`, where partner_id
   * corresponds to the partner storing the data. For partners belonging to the "BeyondCorp
   * Alliance", this is the partner ID specified to you by Google. For all other callers, this is a
   * string of the form: `{customer_id}-suffix`, where `customer_id` is your customer ID. The
   * *suffix* is any string the caller specifies. This string will be displayed verbatim in the
   * administration console. This suffix is used in setting up Custom Access Levels in Context-Aware
   * Access. Your organization's customer ID can be obtained from the URL: `GET
   * https://www.googleapis.com/admin/directory/v1/customers/my_customer` The `id` field in the
   * response contains the customer ID starting with the letter 'C'. The customer ID to be used in
   * this API is the string after the letter 'C' (not including 'C')
   * @param name name or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1ClientState setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The owner of the ClientState
   * @return value or {@code null} for none
   */
  public java.lang.String getOwnerType() {
    return ownerType;
  }

  /**
   * Output only. The owner of the ClientState
   * @param ownerType ownerType or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1ClientState setOwnerType(java.lang.String ownerType) {
    this.ownerType = ownerType;
    return this;
  }

  /**
   * A descriptive cause of the health score.
   * @return value or {@code null} for none
   */
  public java.lang.String getScoreReason() {
    return scoreReason;
  }

  /**
   * A descriptive cause of the health score.
   * @param scoreReason scoreReason or {@code null} for none
   */
  public GoogleAppsCloudidentityDevicesV1ClientState setScoreReason(java.lang.String scoreReason) {
    this.scoreReason = scoreReason;
    return this;
  }

  @Override
  public GoogleAppsCloudidentityDevicesV1ClientState set(String fieldName, Object value) {
    return (GoogleAppsCloudidentityDevicesV1ClientState) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsCloudidentityDevicesV1ClientState clone() {
    return (GoogleAppsCloudidentityDevicesV1ClientState) super.clone();
  }

}
