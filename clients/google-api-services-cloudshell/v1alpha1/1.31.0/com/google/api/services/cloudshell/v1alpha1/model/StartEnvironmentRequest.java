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

package com.google.api.services.cloudshell.v1alpha1.model;

/**
 * Request message for StartEnvironment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Shell API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StartEnvironmentRequest extends com.google.api.client.json.GenericJson {

  /**
   * The initial access token passed to the environment. If this is present and valid, the
   * environment will be pre-authenticated with gcloud so that the user can run gcloud commands in
   * Cloud Shell without having to log in. This code can be updated later by calling
   * AuthorizeEnvironment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accessToken;

  /**
   * Public keys that should be added to the environment before it is started.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PublicKey> publicKeys;

  static {
    // hack to force ProGuard to consider PublicKey used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PublicKey.class);
  }

  /**
   * The initial access token passed to the environment. If this is present and valid, the
   * environment will be pre-authenticated with gcloud so that the user can run gcloud commands in
   * Cloud Shell without having to log in. This code can be updated later by calling
   * AuthorizeEnvironment.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccessToken() {
    return accessToken;
  }

  /**
   * The initial access token passed to the environment. If this is present and valid, the
   * environment will be pre-authenticated with gcloud so that the user can run gcloud commands in
   * Cloud Shell without having to log in. This code can be updated later by calling
   * AuthorizeEnvironment.
   * @param accessToken accessToken or {@code null} for none
   */
  public StartEnvironmentRequest setAccessToken(java.lang.String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Public keys that should be added to the environment before it is started.
   * @return value or {@code null} for none
   */
  public java.util.List<PublicKey> getPublicKeys() {
    return publicKeys;
  }

  /**
   * Public keys that should be added to the environment before it is started.
   * @param publicKeys publicKeys or {@code null} for none
   */
  public StartEnvironmentRequest setPublicKeys(java.util.List<PublicKey> publicKeys) {
    this.publicKeys = publicKeys;
    return this;
  }

  @Override
  public StartEnvironmentRequest set(String fieldName, Object value) {
    return (StartEnvironmentRequest) super.set(fieldName, value);
  }

  @Override
  public StartEnvironmentRequest clone() {
    return (StartEnvironmentRequest) super.clone();
  }

}
