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

package com.google.api.services.runtimeconfig.v1beta1.model;

/**
 * Describes a single variable within a RuntimeConfig resource. The name denotes the hierarchical
 * variable name. For example, `ports/serving_port` is a valid variable name. The variable value is
 * an opaque string and only leaf variables can have values (that is, variables that do not have any
 * child variables).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Runtime Configuration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Variable extends com.google.api.client.json.GenericJson {

  /**
   * The name of the variable resource, in the format:
   * projects/[PROJECT_ID]/configs/[CONFIG_NAME]/variables/[VARIABLE_NAME] The `[PROJECT_ID]` must
   * be a valid project ID, `[CONFIG_NAME]` must be a valid RuntimeConfig resource and
   * `[VARIABLE_NAME]` follows Unix file system file path naming. The `[VARIABLE_NAME]` can contain
   * ASCII letters, numbers, slashes and dashes. Slashes are used as path element separators and are
   * not part of the `[VARIABLE_NAME]` itself, so `[VARIABLE_NAME]` must contain at least one non-
   * slash character. Multiple slashes are coalesced into single slash character. Each path segment
   * should match [0-9A-Za-z](?:[_.A-Za-z0-9-]{0,62}[_.A-Za-z0-9])? regular expression. The length
   * of a `[VARIABLE_NAME]` must be less than 256 characters. Once you create a variable, you cannot
   * change the variable name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The current state of the variable. The variable state indicates the outcome of the
   * `variables().watch` call and is visible through the `get` and `list` calls.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The string value of the variable. The length of the value must be less than 4096 bytes. Empty
   * values are also accepted. For example, `text: "my text value"`. The string must be valid UTF-8.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * Output only. The time of the last variable update. Timestamp will be UTC timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The binary value of the variable. The length of the value must be less than 4096 bytes. Empty
   * values are also accepted. The value must be base64 encoded, and must comply with IETF RFC4648
   * (https://www.ietf.org/rfc/rfc4648.txt). Only one of `value` or `text` can be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * The name of the variable resource, in the format:
   * projects/[PROJECT_ID]/configs/[CONFIG_NAME]/variables/[VARIABLE_NAME] The `[PROJECT_ID]` must
   * be a valid project ID, `[CONFIG_NAME]` must be a valid RuntimeConfig resource and
   * `[VARIABLE_NAME]` follows Unix file system file path naming. The `[VARIABLE_NAME]` can contain
   * ASCII letters, numbers, slashes and dashes. Slashes are used as path element separators and are
   * not part of the `[VARIABLE_NAME]` itself, so `[VARIABLE_NAME]` must contain at least one non-
   * slash character. Multiple slashes are coalesced into single slash character. Each path segment
   * should match [0-9A-Za-z](?:[_.A-Za-z0-9-]{0,62}[_.A-Za-z0-9])? regular expression. The length
   * of a `[VARIABLE_NAME]` must be less than 256 characters. Once you create a variable, you cannot
   * change the variable name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the variable resource, in the format:
   * projects/[PROJECT_ID]/configs/[CONFIG_NAME]/variables/[VARIABLE_NAME] The `[PROJECT_ID]` must
   * be a valid project ID, `[CONFIG_NAME]` must be a valid RuntimeConfig resource and
   * `[VARIABLE_NAME]` follows Unix file system file path naming. The `[VARIABLE_NAME]` can contain
   * ASCII letters, numbers, slashes and dashes. Slashes are used as path element separators and are
   * not part of the `[VARIABLE_NAME]` itself, so `[VARIABLE_NAME]` must contain at least one non-
   * slash character. Multiple slashes are coalesced into single slash character. Each path segment
   * should match [0-9A-Za-z](?:[_.A-Za-z0-9-]{0,62}[_.A-Za-z0-9])? regular expression. The length
   * of a `[VARIABLE_NAME]` must be less than 256 characters. Once you create a variable, you cannot
   * change the variable name.
   * @param name name or {@code null} for none
   */
  public Variable setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The current state of the variable. The variable state indicates the outcome of the
   * `variables().watch` call and is visible through the `get` and `list` calls.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of the variable. The variable state indicates the outcome of the
   * `variables().watch` call and is visible through the `get` and `list` calls.
   * @param state state or {@code null} for none
   */
  public Variable setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The string value of the variable. The length of the value must be less than 4096 bytes. Empty
   * values are also accepted. For example, `text: "my text value"`. The string must be valid UTF-8.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * The string value of the variable. The length of the value must be less than 4096 bytes. Empty
   * values are also accepted. For example, `text: "my text value"`. The string must be valid UTF-8.
   * @param text text or {@code null} for none
   */
  public Variable setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  /**
   * Output only. The time of the last variable update. Timestamp will be UTC timestamp.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time of the last variable update. Timestamp will be UTC timestamp.
   * @param updateTime updateTime or {@code null} for none
   */
  public Variable setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * The binary value of the variable. The length of the value must be less than 4096 bytes. Empty
   * values are also accepted. The value must be base64 encoded, and must comply with IETF RFC4648
   * (https://www.ietf.org/rfc/rfc4648.txt). Only one of `value` or `text` can be set.
   * @see #decodeValue()
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The binary value of the variable. The length of the value must be less than 4096 bytes. Empty
   * values are also accepted. The value must be base64 encoded, and must comply with IETF RFC4648
   * (https://www.ietf.org/rfc/rfc4648.txt). Only one of `value` or `text` can be set.
   * @see #getValue()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeValue() {
    return com.google.api.client.util.Base64.decodeBase64(value);
  }

  /**
   * The binary value of the variable. The length of the value must be less than 4096 bytes. Empty
   * values are also accepted. The value must be base64 encoded, and must comply with IETF RFC4648
   * (https://www.ietf.org/rfc/rfc4648.txt). Only one of `value` or `text` can be set.
   * @see #encodeValue()
   * @param value value or {@code null} for none
   */
  public Variable setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  /**
   * The binary value of the variable. The length of the value must be less than 4096 bytes. Empty
   * values are also accepted. The value must be base64 encoded, and must comply with IETF RFC4648
   * (https://www.ietf.org/rfc/rfc4648.txt). Only one of `value` or `text` can be set.
   * @see #setValue()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Variable encodeValue(byte[] value) {
    this.value = com.google.api.client.util.Base64.encodeBase64URLSafeString(value);
    return this;
  }

  @Override
  public Variable set(String fieldName, Object value) {
    return (Variable) super.set(fieldName, value);
  }

  @Override
  public Variable clone() {
    return (Variable) super.clone();
  }

}
