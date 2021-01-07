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

package com.google.api.services.monitoring.v3.model;

/**
 * A single strongly-typed value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TypedValue extends com.google.api.client.json.GenericJson {

  /**
   * A Boolean value: true or false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean boolValue;

  /**
   * A distribution value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Distribution distributionValue;

  /**
   * A 64-bit double-precision floating-point number. Its magnitude is approximately ±10±300 and it
   * has 16 significant digits of precision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double doubleValue;

  /**
   * A 64-bit integer. Its range is approximately ±9.2x1018.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long int64Value;

  /**
   * A variable-length string value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stringValue;

  /**
   * A Boolean value: true or false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBoolValue() {
    return boolValue;
  }

  /**
   * A Boolean value: true or false.
   * @param boolValue boolValue or {@code null} for none
   */
  public TypedValue setBoolValue(java.lang.Boolean boolValue) {
    this.boolValue = boolValue;
    return this;
  }

  /**
   * A distribution value.
   * @return value or {@code null} for none
   */
  public Distribution getDistributionValue() {
    return distributionValue;
  }

  /**
   * A distribution value.
   * @param distributionValue distributionValue or {@code null} for none
   */
  public TypedValue setDistributionValue(Distribution distributionValue) {
    this.distributionValue = distributionValue;
    return this;
  }

  /**
   * A 64-bit double-precision floating-point number. Its magnitude is approximately ±10±300 and it
   * has 16 significant digits of precision.
   * @return value or {@code null} for none
   */
  public java.lang.Double getDoubleValue() {
    return doubleValue;
  }

  /**
   * A 64-bit double-precision floating-point number. Its magnitude is approximately ±10±300 and it
   * has 16 significant digits of precision.
   * @param doubleValue doubleValue or {@code null} for none
   */
  public TypedValue setDoubleValue(java.lang.Double doubleValue) {
    this.doubleValue = doubleValue;
    return this;
  }

  /**
   * A 64-bit integer. Its range is approximately ±9.2x1018.
   * @return value or {@code null} for none
   */
  public java.lang.Long getInt64Value() {
    return int64Value;
  }

  /**
   * A 64-bit integer. Its range is approximately ±9.2x1018.
   * @param int64Value int64Value or {@code null} for none
   */
  public TypedValue setInt64Value(java.lang.Long int64Value) {
    this.int64Value = int64Value;
    return this;
  }

  /**
   * A variable-length string value.
   * @return value or {@code null} for none
   */
  public java.lang.String getStringValue() {
    return stringValue;
  }

  /**
   * A variable-length string value.
   * @param stringValue stringValue or {@code null} for none
   */
  public TypedValue setStringValue(java.lang.String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  @Override
  public TypedValue set(String fieldName, Object value) {
    return (TypedValue) super.set(fieldName, value);
  }

  @Override
  public TypedValue clone() {
    return (TypedValue) super.clone();
  }

}
