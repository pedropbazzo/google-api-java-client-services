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

package com.google.api.services.displayvideo.v1.model;

/**
 * A single custom bidding algorithm.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomBiddingAlgorithm extends com.google.api.client.json.GenericJson {

  /**
   * Immutable. The unique ID of the advertiser that owns the custom bidding algorithm.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long advertiserId;

  /**
   * Output only. The unique ID of the custom bidding algorithm. Assigned by the system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long customBiddingAlgorithmId;

  /**
   * Required. Immutable. The type of custom bidding algorithm.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customBiddingAlgorithmType;

  /**
   * Required. The display name of the custom bidding algorithm. Must be UTF-8 encoded with a
   * maximum size of 240 bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Controls whether or not the custom bidding algorithm can be used as a bidding strategy.
   * Accepted values are: * `ENTITY_STATUS_ACTIVE` * `ENTITY_STATUS_ARCHIVED`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityStatus;

  /**
   * Output only. The resource name of the custom bidding algorithm.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Immutable. The unique ID of the partner that owns the custom bidding algorithm.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long partnerId;

  /**
   * Immutable. The unique ID of the advertiser that owns the custom bidding algorithm.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdvertiserId() {
    return advertiserId;
  }

  /**
   * Immutable. The unique ID of the advertiser that owns the custom bidding algorithm.
   * @param advertiserId advertiserId or {@code null} for none
   */
  public CustomBiddingAlgorithm setAdvertiserId(java.lang.Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  /**
   * Output only. The unique ID of the custom bidding algorithm. Assigned by the system.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCustomBiddingAlgorithmId() {
    return customBiddingAlgorithmId;
  }

  /**
   * Output only. The unique ID of the custom bidding algorithm. Assigned by the system.
   * @param customBiddingAlgorithmId customBiddingAlgorithmId or {@code null} for none
   */
  public CustomBiddingAlgorithm setCustomBiddingAlgorithmId(java.lang.Long customBiddingAlgorithmId) {
    this.customBiddingAlgorithmId = customBiddingAlgorithmId;
    return this;
  }

  /**
   * Required. Immutable. The type of custom bidding algorithm.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomBiddingAlgorithmType() {
    return customBiddingAlgorithmType;
  }

  /**
   * Required. Immutable. The type of custom bidding algorithm.
   * @param customBiddingAlgorithmType customBiddingAlgorithmType or {@code null} for none
   */
  public CustomBiddingAlgorithm setCustomBiddingAlgorithmType(java.lang.String customBiddingAlgorithmType) {
    this.customBiddingAlgorithmType = customBiddingAlgorithmType;
    return this;
  }

  /**
   * Required. The display name of the custom bidding algorithm. Must be UTF-8 encoded with a
   * maximum size of 240 bytes.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The display name of the custom bidding algorithm. Must be UTF-8 encoded with a
   * maximum size of 240 bytes.
   * @param displayName displayName or {@code null} for none
   */
  public CustomBiddingAlgorithm setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Controls whether or not the custom bidding algorithm can be used as a bidding strategy.
   * Accepted values are: * `ENTITY_STATUS_ACTIVE` * `ENTITY_STATUS_ARCHIVED`
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityStatus() {
    return entityStatus;
  }

  /**
   * Controls whether or not the custom bidding algorithm can be used as a bidding strategy.
   * Accepted values are: * `ENTITY_STATUS_ACTIVE` * `ENTITY_STATUS_ARCHIVED`
   * @param entityStatus entityStatus or {@code null} for none
   */
  public CustomBiddingAlgorithm setEntityStatus(java.lang.String entityStatus) {
    this.entityStatus = entityStatus;
    return this;
  }

  /**
   * Output only. The resource name of the custom bidding algorithm.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the custom bidding algorithm.
   * @param name name or {@code null} for none
   */
  public CustomBiddingAlgorithm setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Immutable. The unique ID of the partner that owns the custom bidding algorithm.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPartnerId() {
    return partnerId;
  }

  /**
   * Immutable. The unique ID of the partner that owns the custom bidding algorithm.
   * @param partnerId partnerId or {@code null} for none
   */
  public CustomBiddingAlgorithm setPartnerId(java.lang.Long partnerId) {
    this.partnerId = partnerId;
    return this;
  }

  @Override
  public CustomBiddingAlgorithm set(String fieldName, Object value) {
    return (CustomBiddingAlgorithm) super.set(fieldName, value);
  }

  @Override
  public CustomBiddingAlgorithm clone() {
    return (CustomBiddingAlgorithm) super.clone();
  }

}
