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

package com.google.api.services.securitycenter.v1p1beta1.model;

/**
 * The config for streaming-based notifications, which send each event as soon as it is detected.
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
public final class StreamingConfig extends com.google.api.client.json.GenericJson {

  /**
   * Expression that defines the filter to apply across create/update events of assets or findings
   * as specified by the event type. The expression is a list of zero or more restrictions combined
   * via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence
   * than `AND`.
   *
   * Restrictions have the form `  ` and may have a `-` character in front of them to indicate
   * negation. The fields map to those defined in the corresponding resource.
   *
   * The supported operators are:
   *
   * * `=` for all value types. * `>`, `<`, `>=`, `<=` for integer values. * `:`, meaning substring
   * matching, for strings.
   *
   * The supported value types are:
   *
   * * string literals in quotes. * integer literals without quotes. * boolean literals `true` and
   * `false` without quotes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * Expression that defines the filter to apply across create/update events of assets or findings
   * as specified by the event type. The expression is a list of zero or more restrictions combined
   * via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence
   * than `AND`.
   *
   * Restrictions have the form `  ` and may have a `-` character in front of them to indicate
   * negation. The fields map to those defined in the corresponding resource.
   *
   * The supported operators are:
   *
   * * `=` for all value types. * `>`, `<`, `>=`, `<=` for integer values. * `:`, meaning substring
   * matching, for strings.
   *
   * The supported value types are:
   *
   * * string literals in quotes. * integer literals without quotes. * boolean literals `true` and
   * `false` without quotes.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Expression that defines the filter to apply across create/update events of assets or findings
   * as specified by the event type. The expression is a list of zero or more restrictions combined
   * via logical operators `AND` and `OR`. Parentheses are supported, and `OR` has higher precedence
   * than `AND`.
   *
   * Restrictions have the form `  ` and may have a `-` character in front of them to indicate
   * negation. The fields map to those defined in the corresponding resource.
   *
   * The supported operators are:
   *
   * * `=` for all value types. * `>`, `<`, `>=`, `<=` for integer values. * `:`, meaning substring
   * matching, for strings.
   *
   * The supported value types are:
   *
   * * string literals in quotes. * integer literals without quotes. * boolean literals `true` and
   * `false` without quotes.
   * @param filter filter or {@code null} for none
   */
  public StreamingConfig setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  @Override
  public StreamingConfig set(String fieldName, Object value) {
    return (StreamingConfig) super.set(fieldName, value);
  }

  @Override
  public StreamingConfig clone() {
    return (StreamingConfig) super.clone();
  }

}
