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

package com.google.api.services.analyticsadmin.v1alpha.model;

/**
 * A resource message representing a Google Analytics web stream.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Admin API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAnalyticsAdminV1alphaWebDataStream extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Time when this stream was originally created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Immutable. Domain name of the web app being measured, or empty. Example:
   * "http://www.google.com", "https://www.google.com"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultUri;

  /**
   * Required. Human-readable display name for the Data Stream. The max allowed display name length
   * is 100 UTF-16 code units.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. ID of the corresponding web app in Firebase, if any. This ID can change if the web
   * app is deleted and recreated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String firebaseAppId;

  /**
   * Output only. Analytics "Measurement ID", without the "G-" prefix. Example: "G-1A2BCD345E" would
   * just be "1A2BCD345E"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String measurementId;

  /**
   * Output only. Resource name of this Data Stream. Format:
   * properties/{property_id}/webDataStreams/{stream_id} Example:
   * "properties/1000/webDataStreams/2000"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Time when stream payload fields were last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Time when this stream was originally created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Time when this stream was originally created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaWebDataStream setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Immutable. Domain name of the web app being measured, or empty. Example:
   * "http://www.google.com", "https://www.google.com"
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultUri() {
    return defaultUri;
  }

  /**
   * Immutable. Domain name of the web app being measured, or empty. Example:
   * "http://www.google.com", "https://www.google.com"
   * @param defaultUri defaultUri or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaWebDataStream setDefaultUri(java.lang.String defaultUri) {
    this.defaultUri = defaultUri;
    return this;
  }

  /**
   * Required. Human-readable display name for the Data Stream. The max allowed display name length
   * is 100 UTF-16 code units.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. Human-readable display name for the Data Stream. The max allowed display name length
   * is 100 UTF-16 code units.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaWebDataStream setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. ID of the corresponding web app in Firebase, if any. This ID can change if the web
   * app is deleted and recreated.
   * @return value or {@code null} for none
   */
  public java.lang.String getFirebaseAppId() {
    return firebaseAppId;
  }

  /**
   * Output only. ID of the corresponding web app in Firebase, if any. This ID can change if the web
   * app is deleted and recreated.
   * @param firebaseAppId firebaseAppId or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaWebDataStream setFirebaseAppId(java.lang.String firebaseAppId) {
    this.firebaseAppId = firebaseAppId;
    return this;
  }

  /**
   * Output only. Analytics "Measurement ID", without the "G-" prefix. Example: "G-1A2BCD345E" would
   * just be "1A2BCD345E"
   * @return value or {@code null} for none
   */
  public java.lang.String getMeasurementId() {
    return measurementId;
  }

  /**
   * Output only. Analytics "Measurement ID", without the "G-" prefix. Example: "G-1A2BCD345E" would
   * just be "1A2BCD345E"
   * @param measurementId measurementId or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaWebDataStream setMeasurementId(java.lang.String measurementId) {
    this.measurementId = measurementId;
    return this;
  }

  /**
   * Output only. Resource name of this Data Stream. Format:
   * properties/{property_id}/webDataStreams/{stream_id} Example:
   * "properties/1000/webDataStreams/2000"
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of this Data Stream. Format:
   * properties/{property_id}/webDataStreams/{stream_id} Example:
   * "properties/1000/webDataStreams/2000"
   * @param name name or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaWebDataStream setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Time when stream payload fields were last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Time when stream payload fields were last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaWebDataStream setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1alphaWebDataStream set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1alphaWebDataStream) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1alphaWebDataStream clone() {
    return (GoogleAnalyticsAdminV1alphaWebDataStream) super.clone();
  }

}
