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

package com.google.api.services.cloudbuild.v1.model;

/**
 * NotifierSecret is the container that maps a secret name (reference) to its Google Cloud Secret
 * Manager resource path.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NotifierSecret extends com.google.api.client.json.GenericJson {

  /**
   * Name is the local name of the secret, such as the verbatim string "my-smtp-password".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Value is interpreted to be a resource path for fetching the actual (versioned) secret data for
   * this secret. For example, this would be a Google Cloud Secret Manager secret version resource
   * path like: "projects/my-project/secrets/my-secret/versions/latest".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Name is the local name of the secret, such as the verbatim string "my-smtp-password".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name is the local name of the secret, such as the verbatim string "my-smtp-password".
   * @param name name or {@code null} for none
   */
  public NotifierSecret setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Value is interpreted to be a resource path for fetching the actual (versioned) secret data for
   * this secret. For example, this would be a Google Cloud Secret Manager secret version resource
   * path like: "projects/my-project/secrets/my-secret/versions/latest".
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Value is interpreted to be a resource path for fetching the actual (versioned) secret data for
   * this secret. For example, this would be a Google Cloud Secret Manager secret version resource
   * path like: "projects/my-project/secrets/my-secret/versions/latest".
   * @param value value or {@code null} for none
   */
  public NotifierSecret setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public NotifierSecret set(String fieldName, Object value) {
    return (NotifierSecret) super.set(fieldName, value);
  }

  @Override
  public NotifierSecret clone() {
    return (NotifierSecret) super.clone();
  }

}
