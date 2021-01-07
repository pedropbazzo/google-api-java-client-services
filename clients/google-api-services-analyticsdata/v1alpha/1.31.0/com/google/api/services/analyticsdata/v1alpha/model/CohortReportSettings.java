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
 * Optional settings of a cohort report.
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
public final class CohortReportSettings extends com.google.api.client.json.GenericJson {

  /**
   * If true, accumulates the result from first touch day to the end day. Not supported in
   * `RunReportRequest`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean accumulate;

  /**
   * If true, accumulates the result from first touch day to the end day. Not supported in
   * `RunReportRequest`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAccumulate() {
    return accumulate;
  }

  /**
   * If true, accumulates the result from first touch day to the end day. Not supported in
   * `RunReportRequest`.
   * @param accumulate accumulate or {@code null} for none
   */
  public CohortReportSettings setAccumulate(java.lang.Boolean accumulate) {
    this.accumulate = accumulate;
    return this;
  }

  @Override
  public CohortReportSettings set(String fieldName, Object value) {
    return (CohortReportSettings) super.set(fieldName, value);
  }

  @Override
  public CohortReportSettings clone() {
    return (CohortReportSettings) super.clone();
  }

}
