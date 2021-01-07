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

package com.google.api.services.file.v1beta1.model;

/**
 * A set of attributes, each in the format `[KEY]:[VALUE]`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Filestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Attributes extends com.google.api.client.json.GenericJson {

  /**
   * The set of attributes. Each attribute's key can be up to 128 bytes long. The value can be a
   * string up to 256 bytes, a signed 64-bit integer, or the Boolean values `true` and `false`. For
   * example:
   *
   *     "/instance_id": "my-instance"     "/http/user_agent": ""     "/http/request_bytes": 300
   * "abc.com/myattribute": true
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, AttributeValue> attributeMap;

  static {
    // hack to force ProGuard to consider AttributeValue used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AttributeValue.class);
  }

  /**
   * The number of attributes that were discarded. Attributes can be discarded because their keys
   * are too long or because there are too many attributes. If this value is 0 then all attributes
   * are valid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer droppedAttributesCount;

  /**
   * The set of attributes. Each attribute's key can be up to 128 bytes long. The value can be a
   * string up to 256 bytes, a signed 64-bit integer, or the Boolean values `true` and `false`. For
   * example:
   *
   *     "/instance_id": "my-instance"     "/http/user_agent": ""     "/http/request_bytes": 300
   * "abc.com/myattribute": true
   * @return value or {@code null} for none
   */
  public java.util.Map<String, AttributeValue> getAttributeMap() {
    return attributeMap;
  }

  /**
   * The set of attributes. Each attribute's key can be up to 128 bytes long. The value can be a
   * string up to 256 bytes, a signed 64-bit integer, or the Boolean values `true` and `false`. For
   * example:
   *
   *     "/instance_id": "my-instance"     "/http/user_agent": ""     "/http/request_bytes": 300
   * "abc.com/myattribute": true
   * @param attributeMap attributeMap or {@code null} for none
   */
  public Attributes setAttributeMap(java.util.Map<String, AttributeValue> attributeMap) {
    this.attributeMap = attributeMap;
    return this;
  }

  /**
   * The number of attributes that were discarded. Attributes can be discarded because their keys
   * are too long or because there are too many attributes. If this value is 0 then all attributes
   * are valid.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDroppedAttributesCount() {
    return droppedAttributesCount;
  }

  /**
   * The number of attributes that were discarded. Attributes can be discarded because their keys
   * are too long or because there are too many attributes. If this value is 0 then all attributes
   * are valid.
   * @param droppedAttributesCount droppedAttributesCount or {@code null} for none
   */
  public Attributes setDroppedAttributesCount(java.lang.Integer droppedAttributesCount) {
    this.droppedAttributesCount = droppedAttributesCount;
    return this;
  }

  @Override
  public Attributes set(String fieldName, Object value) {
    return (Attributes) super.set(fieldName, value);
  }

  @Override
  public Attributes clone() {
    return (Attributes) super.clone();
  }

}
