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

package com.google.api.services.firebase.v1beta1.model;

/**
 * A SHA-1 or SHA-256 certificate associated with the AndroidApp.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ShaCertificate extends com.google.api.client.json.GenericJson {

  /**
   * The type of SHA certificate encoded in the hash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String certType;

  /**
   * The resource name of the ShaCertificate for the AndroidApp, in the format:
   * projects/PROJECT_IDENTIFIER/androidApps/APP_ID/sha/SHA_HASH * PROJECT_IDENTIFIER: the parent
   * Project's [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number)
   * ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn
   * more about using project identifiers in Google's [AIP 2510
   * standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any
   * response body will be the `ProjectId`. * APP_ID: the globally unique, Firebase-assigned
   * identifier for the App (see [`appId`](../projects.androidApps#AndroidApp.FIELDS.app_id)). *
   * SHA_HASH: the certificate hash for the App (see
   * [`shaHash`](../projects.androidApps.sha#ShaCertificate.FIELDS.sha_hash)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The certificate hash for the `AndroidApp`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shaHash;

  /**
   * The type of SHA certificate encoded in the hash.
   * @return value or {@code null} for none
   */
  public java.lang.String getCertType() {
    return certType;
  }

  /**
   * The type of SHA certificate encoded in the hash.
   * @param certType certType or {@code null} for none
   */
  public ShaCertificate setCertType(java.lang.String certType) {
    this.certType = certType;
    return this;
  }

  /**
   * The resource name of the ShaCertificate for the AndroidApp, in the format:
   * projects/PROJECT_IDENTIFIER/androidApps/APP_ID/sha/SHA_HASH * PROJECT_IDENTIFIER: the parent
   * Project's [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number)
   * ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn
   * more about using project identifiers in Google's [AIP 2510
   * standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any
   * response body will be the `ProjectId`. * APP_ID: the globally unique, Firebase-assigned
   * identifier for the App (see [`appId`](../projects.androidApps#AndroidApp.FIELDS.app_id)). *
   * SHA_HASH: the certificate hash for the App (see
   * [`shaHash`](../projects.androidApps.sha#ShaCertificate.FIELDS.sha_hash)).
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the ShaCertificate for the AndroidApp, in the format:
   * projects/PROJECT_IDENTIFIER/androidApps/APP_ID/sha/SHA_HASH * PROJECT_IDENTIFIER: the parent
   * Project's [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number)
   * ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn
   * more about using project identifiers in Google's [AIP 2510
   * standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any
   * response body will be the `ProjectId`. * APP_ID: the globally unique, Firebase-assigned
   * identifier for the App (see [`appId`](../projects.androidApps#AndroidApp.FIELDS.app_id)). *
   * SHA_HASH: the certificate hash for the App (see
   * [`shaHash`](../projects.androidApps.sha#ShaCertificate.FIELDS.sha_hash)).
   * @param name name or {@code null} for none
   */
  public ShaCertificate setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The certificate hash for the `AndroidApp`.
   * @return value or {@code null} for none
   */
  public java.lang.String getShaHash() {
    return shaHash;
  }

  /**
   * The certificate hash for the `AndroidApp`.
   * @param shaHash shaHash or {@code null} for none
   */
  public ShaCertificate setShaHash(java.lang.String shaHash) {
    this.shaHash = shaHash;
    return this;
  }

  @Override
  public ShaCertificate set(String fieldName, Object value) {
    return (ShaCertificate) super.set(fieldName, value);
  }

  @Override
  public ShaCertificate clone() {
    return (ShaCertificate) super.clone();
  }

}
