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

package com.google.api.services.analyticsdata.v1alpha.model;

/**
 * The filter for string
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Data API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StringFilter extends com.google.api.client.json.GenericJson {

  /**
   * If true, the string value is case sensitive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean caseSensitive;

  /**
   * The match type for this filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String matchType;

  /**
   * The string value used for the matching.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * If true, the string value is case sensitive.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCaseSensitive() {
    return caseSensitive;
  }

  /**
   * If true, the string value is case sensitive.
   * @param caseSensitive caseSensitive or {@code null} for none
   */
  public StringFilter setCaseSensitive(java.lang.Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

  /**
   * The match type for this filter.
   * @return value or {@code null} for none
   */
  public java.lang.String getMatchType() {
    return matchType;
  }

  /**
   * The match type for this filter.
   * @param matchType matchType or {@code null} for none
   */
  public StringFilter setMatchType(java.lang.String matchType) {
    this.matchType = matchType;
    return this;
  }

  /**
   * The string value used for the matching.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The string value used for the matching.
   * @param value value or {@code null} for none
   */
  public StringFilter setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public StringFilter set(String fieldName, Object value) {
    return (StringFilter) super.set(fieldName, value);
  }

  @Override
  public StringFilter clone() {
    return (StringFilter) super.clone();
  }

}
