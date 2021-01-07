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

package com.google.api.services.cloudasset.v1p4beta1.model;

/**
 * An IAM role or permission under analysis.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAssetV1p4beta1Access extends com.google.api.client.json.GenericJson {

  /**
   * The analysis state of this access.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAssetV1p4beta1AnalysisState analysisState;

  /**
   * The permission.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String permission;

  /**
   * The role.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String role;

  /**
   * The analysis state of this access.
   * @return value or {@code null} for none
   */
  public GoogleCloudAssetV1p4beta1AnalysisState getAnalysisState() {
    return analysisState;
  }

  /**
   * The analysis state of this access.
   * @param analysisState analysisState or {@code null} for none
   */
  public GoogleCloudAssetV1p4beta1Access setAnalysisState(GoogleCloudAssetV1p4beta1AnalysisState analysisState) {
    this.analysisState = analysisState;
    return this;
  }

  /**
   * The permission.
   * @return value or {@code null} for none
   */
  public java.lang.String getPermission() {
    return permission;
  }

  /**
   * The permission.
   * @param permission permission or {@code null} for none
   */
  public GoogleCloudAssetV1p4beta1Access setPermission(java.lang.String permission) {
    this.permission = permission;
    return this;
  }

  /**
   * The role.
   * @return value or {@code null} for none
   */
  public java.lang.String getRole() {
    return role;
  }

  /**
   * The role.
   * @param role role or {@code null} for none
   */
  public GoogleCloudAssetV1p4beta1Access setRole(java.lang.String role) {
    this.role = role;
    return this;
  }

  @Override
  public GoogleCloudAssetV1p4beta1Access set(String fieldName, Object value) {
    return (GoogleCloudAssetV1p4beta1Access) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAssetV1p4beta1Access clone() {
    return (GoogleCloudAssetV1p4beta1Access) super.clone();
  }

}
