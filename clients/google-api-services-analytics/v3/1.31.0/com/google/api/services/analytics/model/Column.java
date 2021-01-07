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

package com.google.api.services.analytics.model;

/**
 * JSON template for a metadata column.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Column extends com.google.api.client.json.GenericJson {

  /**
   * Map of attribute name and value for this column.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> attributes;

  /**
   * Column id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Resource type for Analytics column.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Map of attribute name and value for this column.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAttributes() {
    return attributes;
  }

  /**
   * Map of attribute name and value for this column.
   * @param attributes attributes or {@code null} for none
   */
  public Column setAttributes(java.util.Map<String, java.lang.String> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Column id.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Column id.
   * @param id id or {@code null} for none
   */
  public Column setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Resource type for Analytics column.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Resource type for Analytics column.
   * @param kind kind or {@code null} for none
   */
  public Column setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public Column set(String fieldName, Object value) {
    return (Column) super.set(fieldName, value);
  }

  @Override
  public Column clone() {
    return (Column) super.clone();
  }

}
