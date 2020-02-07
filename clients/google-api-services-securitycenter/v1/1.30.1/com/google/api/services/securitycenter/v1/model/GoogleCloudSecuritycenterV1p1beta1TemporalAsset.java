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

package com.google.api.services.securitycenter.v1.model;

/**
 * Wrapper over asset object that also captures the state change for the asset e.g. if it was a
 * newly created asset vs updated or deleted asset.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudSecuritycenterV1p1beta1TemporalAsset extends com.google.api.client.json.GenericJson {

  /**
   * Asset data that includes attributes, properties and marks about the asset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudSecuritycenterV1p1beta1Asset asset;

  /**
   * Represents if the asset was created/updated/deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String changeType;

  /**
   * Asset data that includes attributes, properties and marks about the asset.
   * @return value or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1Asset getAsset() {
    return asset;
  }

  /**
   * Asset data that includes attributes, properties and marks about the asset.
   * @param asset asset or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1TemporalAsset setAsset(GoogleCloudSecuritycenterV1p1beta1Asset asset) {
    this.asset = asset;
    return this;
  }

  /**
   * Represents if the asset was created/updated/deleted.
   * @return value or {@code null} for none
   */
  public java.lang.String getChangeType() {
    return changeType;
  }

  /**
   * Represents if the asset was created/updated/deleted.
   * @param changeType changeType or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1p1beta1TemporalAsset setChangeType(java.lang.String changeType) {
    this.changeType = changeType;
    return this;
  }

  @Override
  public GoogleCloudSecuritycenterV1p1beta1TemporalAsset set(String fieldName, Object value) {
    return (GoogleCloudSecuritycenterV1p1beta1TemporalAsset) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSecuritycenterV1p1beta1TemporalAsset clone() {
    return (GoogleCloudSecuritycenterV1p1beta1TemporalAsset) super.clone();
  }

}
