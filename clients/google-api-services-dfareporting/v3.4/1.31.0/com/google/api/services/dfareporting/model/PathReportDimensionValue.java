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

package com.google.api.services.dfareporting.model;

/**
 * Represents a PathReportDimensionValue resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Campaign Manager 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PathReportDimensionValue extends com.google.api.client.json.GenericJson {

  /**
   * The name of the dimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dimensionName;

  /**
   * The possible ID's associated with the value if available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ids;

  /**
   * The kind of resource this is, in this case dfareporting#pathReportDimensionValue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Determines how the 'value' field is matched when filtering. If not specified, defaults to
   * EXACT. If set to WILDCARD_EXPRESSION, '*' is allowed as a placeholder for variable length
   * character sequences, and it can be escaped with a backslash. Note, only paid search dimensions
   * ('dfa:paidSearch*') allow a matchType other than EXACT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String matchType;

  /**
   * The possible values of the dimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> values;

  /**
   * The name of the dimension.
   * @return value or {@code null} for none
   */
  public java.lang.String getDimensionName() {
    return dimensionName;
  }

  /**
   * The name of the dimension.
   * @param dimensionName dimensionName or {@code null} for none
   */
  public PathReportDimensionValue setDimensionName(java.lang.String dimensionName) {
    this.dimensionName = dimensionName;
    return this;
  }

  /**
   * The possible ID's associated with the value if available.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIds() {
    return ids;
  }

  /**
   * The possible ID's associated with the value if available.
   * @param ids ids or {@code null} for none
   */
  public PathReportDimensionValue setIds(java.util.List<java.lang.String> ids) {
    this.ids = ids;
    return this;
  }

  /**
   * The kind of resource this is, in this case dfareporting#pathReportDimensionValue.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of resource this is, in this case dfareporting#pathReportDimensionValue.
   * @param kind kind or {@code null} for none
   */
  public PathReportDimensionValue setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Determines how the 'value' field is matched when filtering. If not specified, defaults to
   * EXACT. If set to WILDCARD_EXPRESSION, '*' is allowed as a placeholder for variable length
   * character sequences, and it can be escaped with a backslash. Note, only paid search dimensions
   * ('dfa:paidSearch*') allow a matchType other than EXACT.
   * @return value or {@code null} for none
   */
  public java.lang.String getMatchType() {
    return matchType;
  }

  /**
   * Determines how the 'value' field is matched when filtering. If not specified, defaults to
   * EXACT. If set to WILDCARD_EXPRESSION, '*' is allowed as a placeholder for variable length
   * character sequences, and it can be escaped with a backslash. Note, only paid search dimensions
   * ('dfa:paidSearch*') allow a matchType other than EXACT.
   * @param matchType matchType or {@code null} for none
   */
  public PathReportDimensionValue setMatchType(java.lang.String matchType) {
    this.matchType = matchType;
    return this;
  }

  /**
   * The possible values of the dimension.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getValues() {
    return values;
  }

  /**
   * The possible values of the dimension.
   * @param values values or {@code null} for none
   */
  public PathReportDimensionValue setValues(java.util.List<java.lang.String> values) {
    this.values = values;
    return this;
  }

  @Override
  public PathReportDimensionValue set(String fieldName, Object value) {
    return (PathReportDimensionValue) super.set(fieldName, value);
  }

  @Override
  public PathReportDimensionValue clone() {
    return (PathReportDimensionValue) super.clone();
  }

}
