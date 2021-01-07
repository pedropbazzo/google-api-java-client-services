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

package com.google.api.services.admob.v1beta.model;

/**
 * Describes which report rows to match based on their dimension values.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdMob API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkReportSpecDimensionFilter extends com.google.api.client.json.GenericJson {

  /**
   * Applies the filter criterion to the specified dimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dimension;

  /**
   * Matches a row if its value for the specified dimension is in one of the values specified in
   * this condition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StringList matchesAny;

  /**
   * Applies the filter criterion to the specified dimension.
   * @return value or {@code null} for none
   */
  public java.lang.String getDimension() {
    return dimension;
  }

  /**
   * Applies the filter criterion to the specified dimension.
   * @param dimension dimension or {@code null} for none
   */
  public NetworkReportSpecDimensionFilter setDimension(java.lang.String dimension) {
    this.dimension = dimension;
    return this;
  }

  /**
   * Matches a row if its value for the specified dimension is in one of the values specified in
   * this condition.
   * @return value or {@code null} for none
   */
  public StringList getMatchesAny() {
    return matchesAny;
  }

  /**
   * Matches a row if its value for the specified dimension is in one of the values specified in
   * this condition.
   * @param matchesAny matchesAny or {@code null} for none
   */
  public NetworkReportSpecDimensionFilter setMatchesAny(StringList matchesAny) {
    this.matchesAny = matchesAny;
    return this;
  }

  @Override
  public NetworkReportSpecDimensionFilter set(String fieldName, Object value) {
    return (NetworkReportSpecDimensionFilter) super.set(fieldName, value);
  }

  @Override
  public NetworkReportSpecDimensionFilter clone() {
    return (NetworkReportSpecDimensionFilter) super.clone();
  }

}
