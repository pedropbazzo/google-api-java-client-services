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

package com.google.api.services.dlp.v2.model;

/**
 * Request message for CreateStoredInfoType.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2CreateStoredInfoTypeRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Configuration of the storedInfoType to create.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2StoredInfoTypeConfig config;

  /**
   * Deprecated. This field has no effect.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationId;

  /**
   * The storedInfoType ID can contain uppercase and lowercase letters, numbers, and hyphens; that
   * is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String storedInfoTypeId;

  /**
   * Required. Configuration of the storedInfoType to create.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2StoredInfoTypeConfig getConfig() {
    return config;
  }

  /**
   * Required. Configuration of the storedInfoType to create.
   * @param config config or {@code null} for none
   */
  public GooglePrivacyDlpV2CreateStoredInfoTypeRequest setConfig(GooglePrivacyDlpV2StoredInfoTypeConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Deprecated. This field has no effect.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationId() {
    return locationId;
  }

  /**
   * Deprecated. This field has no effect.
   * @param locationId locationId or {@code null} for none
   */
  public GooglePrivacyDlpV2CreateStoredInfoTypeRequest setLocationId(java.lang.String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * The storedInfoType ID can contain uppercase and lowercase letters, numbers, and hyphens; that
   * is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * @return value or {@code null} for none
   */
  public java.lang.String getStoredInfoTypeId() {
    return storedInfoTypeId;
  }

  /**
   * The storedInfoType ID can contain uppercase and lowercase letters, numbers, and hyphens; that
   * is, it must match the regular expression: `[a-zA-Z\d-_]+`. The maximum length is 100
   * characters. Can be empty to allow the system to generate one.
   * @param storedInfoTypeId storedInfoTypeId or {@code null} for none
   */
  public GooglePrivacyDlpV2CreateStoredInfoTypeRequest setStoredInfoTypeId(java.lang.String storedInfoTypeId) {
    this.storedInfoTypeId = storedInfoTypeId;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2CreateStoredInfoTypeRequest set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2CreateStoredInfoTypeRequest) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2CreateStoredInfoTypeRequest clone() {
    return (GooglePrivacyDlpV2CreateStoredInfoTypeRequest) super.clone();
  }

}
