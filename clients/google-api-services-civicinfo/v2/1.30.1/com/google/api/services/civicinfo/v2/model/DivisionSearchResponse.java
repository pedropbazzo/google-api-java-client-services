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

package com.google.api.services.civicinfo.v2.model;

/**
 * The result of a division search query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Civic Information API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DivisionSearchResponse extends com.google.api.client.json.GenericJson {

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "civicinfo#divisionSearchResponse".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DivisionSearchResult> results;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "civicinfo#divisionSearchResponse".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "civicinfo#divisionSearchResponse".
   * @param kind kind or {@code null} for none
   */
  public DivisionSearchResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<DivisionSearchResult> getResults() {
    return results;
  }

  /**
   * @param results results or {@code null} for none
   */
  public DivisionSearchResponse setResults(java.util.List<DivisionSearchResult> results) {
    this.results = results;
    return this;
  }

  @Override
  public DivisionSearchResponse set(String fieldName, Object value) {
    return (DivisionSearchResponse) super.set(fieldName, value);
  }

  @Override
  public DivisionSearchResponse clone() {
    return (DivisionSearchResponse) super.clone();
  }

}
