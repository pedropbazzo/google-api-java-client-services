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

package com.google.api.services.storage.model;

/**
 * JSON template to produce a JSON-style HMAC Key resource for Create responses.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Storage JSON API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HmacKey extends com.google.api.client.json.GenericJson {

  /**
   * The kind of item this is. For HMAC keys, this is always storage#hmacKey.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Key metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HmacKeyMetadata metadata;

  /**
   * HMAC secret key material.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secret;

  /**
   * The kind of item this is. For HMAC keys, this is always storage#hmacKey.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of item this is. For HMAC keys, this is always storage#hmacKey.
   * @param kind kind or {@code null} for none
   */
  public HmacKey setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Key metadata.
   * @return value or {@code null} for none
   */
  public HmacKeyMetadata getMetadata() {
    return metadata;
  }

  /**
   * Key metadata.
   * @param metadata metadata or {@code null} for none
   */
  public HmacKey setMetadata(HmacKeyMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * HMAC secret key material.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecret() {
    return secret;
  }

  /**
   * HMAC secret key material.
   * @param secret secret or {@code null} for none
   */
  public HmacKey setSecret(java.lang.String secret) {
    this.secret = secret;
    return this;
  }

  @Override
  public HmacKey set(String fieldName, Object value) {
    return (HmacKey) super.set(fieldName, value);
  }

  @Override
  public HmacKey clone() {
    return (HmacKey) super.clone();
  }

}
