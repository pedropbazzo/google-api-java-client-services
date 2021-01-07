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
 * The specification of cohorts for a cohort report. Cohort reports create a time series of user
 * retention for the cohort. For example, you could select the cohort of users that were acquired in
 * the first week of September and follow that cohort for the next six weeks. Selecting the users
 * acquired in the first week of September cohort is specified in the `cohort` object. Following
 * that cohort for the next six weeks is specified in the `cohortsRange` object. For examples, see
 * [Cohort Report Examples](https://developers.google.com/analytics/devguides/reporting/data/v1/adva
 * nced#cohort_report_examples). The report response could show a weekly time series where say your
 * app has retained 60% of this cohort after three weeks and 25% of this cohort after six weeks.
 * These two percentages can be calculated by the metric `cohortActiveUsers/cohortTotalUsers` and
 * will be separate rows in the report.
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
public final class CohortSpec extends com.google.api.client.json.GenericJson {

  /**
   * Optional settings for a cohort report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CohortReportSettings cohortReportSettings;

  /**
   * Defines the selection criteria to group users into cohorts. Most cohort reports define only a
   * single cohort. If multiple cohorts are specified, each cohort can be recognized in the report
   * by their name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Cohort> cohorts;

  static {
    // hack to force ProGuard to consider Cohort used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Cohort.class);
  }

  /**
   * Cohort reports follow cohorts over an extended reporting date range. This range specifies an
   * offset duration to follow the cohorts over.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CohortsRange cohortsRange;

  /**
   * Optional settings for a cohort report.
   * @return value or {@code null} for none
   */
  public CohortReportSettings getCohortReportSettings() {
    return cohortReportSettings;
  }

  /**
   * Optional settings for a cohort report.
   * @param cohortReportSettings cohortReportSettings or {@code null} for none
   */
  public CohortSpec setCohortReportSettings(CohortReportSettings cohortReportSettings) {
    this.cohortReportSettings = cohortReportSettings;
    return this;
  }

  /**
   * Defines the selection criteria to group users into cohorts. Most cohort reports define only a
   * single cohort. If multiple cohorts are specified, each cohort can be recognized in the report
   * by their name.
   * @return value or {@code null} for none
   */
  public java.util.List<Cohort> getCohorts() {
    return cohorts;
  }

  /**
   * Defines the selection criteria to group users into cohorts. Most cohort reports define only a
   * single cohort. If multiple cohorts are specified, each cohort can be recognized in the report
   * by their name.
   * @param cohorts cohorts or {@code null} for none
   */
  public CohortSpec setCohorts(java.util.List<Cohort> cohorts) {
    this.cohorts = cohorts;
    return this;
  }

  /**
   * Cohort reports follow cohorts over an extended reporting date range. This range specifies an
   * offset duration to follow the cohorts over.
   * @return value or {@code null} for none
   */
  public CohortsRange getCohortsRange() {
    return cohortsRange;
  }

  /**
   * Cohort reports follow cohorts over an extended reporting date range. This range specifies an
   * offset duration to follow the cohorts over.
   * @param cohortsRange cohortsRange or {@code null} for none
   */
  public CohortSpec setCohortsRange(CohortsRange cohortsRange) {
    this.cohortsRange = cohortsRange;
    return this;
  }

  @Override
  public CohortSpec set(String fieldName, Object value) {
    return (CohortSpec) super.set(fieldName, value);
  }

  @Override
  public CohortSpec clone() {
    return (CohortSpec) super.clone();
  }

}
