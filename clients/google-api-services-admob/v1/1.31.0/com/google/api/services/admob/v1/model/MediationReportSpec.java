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

package com.google.api.services.admob.v1.model;

/**
 * The specification for generating an AdMob Mediation report. For example, the specification to get
 * observed ECPM sliced by ad source and app for the 'US' and 'CN' countries can look like the
 * following example: { "date_range": { "start_date": {"year": 2018, "month": 9, "day": 1},
 * "end_date": {"year": 2018, "month": 9, "day": 30} }, "dimensions": ["AD_SOURCE", "APP",
 * "COUNTRY"], "metrics": ["OBSERVED_ECPM"], "dimension_filters": [ { "dimension": "COUNTRY",
 * "matches_any": {"values": [{"value": "US", "value": "CN"}]} } ], "sort_conditions": [
 * {"dimension":"APP", order: "ASCENDING"} ], "localization_settings": { "currency_code": "USD",
 * "language_code": "en-US" } } For a better understanding, you can treat the preceding
 * specification like the following pseudo SQL: SELECT AD_SOURCE, APP, COUNTRY, OBSERVED_ECPM FROM
 * MEDIATION_REPORT WHERE DATE >= '2018-09-01' AND DATE <= '2018-09-30' AND COUNTRY IN ('US', 'CN')
 * GROUP BY AD_SOURCE, APP, COUNTRY ORDER BY APP ASC;
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdMob API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MediationReportSpec extends com.google.api.client.json.GenericJson {

  /**
   * The date range for which the report is generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DateRange dateRange;

  /**
   * Describes which report rows to match based on their dimension values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MediationReportSpecDimensionFilter> dimensionFilters;

  /**
   * List of dimensions of the report. The value combination of these dimensions determines the row
   * of the report. If no dimensions are specified, the report returns a single row of requested
   * metrics for the entire account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> dimensions;

  /**
   * Localization settings of the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LocalizationSettings localizationSettings;

  /**
   * Maximum number of report data rows to return. If the value is not set, the API returns as many
   * rows as possible, up to 100000. Acceptable values are 1-100000, inclusive. Values larger than
   * 100000 return an error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxReportRows;

  /**
   * List of metrics of the report. A report must specify at least one metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> metrics;

  /**
   * Describes the sorting of report rows. The order of the condition in the list defines its
   * precedence; the earlier the condition, the higher its precedence. If no sort conditions are
   * specified, the row ordering is undefined.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MediationReportSpecSortCondition> sortConditions;

  /**
   * A report time zone. Accepts an IANA TZ name values, such as "America/Los_Angeles." If no time
   * zone is defined, the account default takes effect. Check default value by the get account
   * action. **Warning:** The "America/Los_Angeles" is the only supported value at the moment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeZone;

  /**
   * The date range for which the report is generated.
   * @return value or {@code null} for none
   */
  public DateRange getDateRange() {
    return dateRange;
  }

  /**
   * The date range for which the report is generated.
   * @param dateRange dateRange or {@code null} for none
   */
  public MediationReportSpec setDateRange(DateRange dateRange) {
    this.dateRange = dateRange;
    return this;
  }

  /**
   * Describes which report rows to match based on their dimension values.
   * @return value or {@code null} for none
   */
  public java.util.List<MediationReportSpecDimensionFilter> getDimensionFilters() {
    return dimensionFilters;
  }

  /**
   * Describes which report rows to match based on their dimension values.
   * @param dimensionFilters dimensionFilters or {@code null} for none
   */
  public MediationReportSpec setDimensionFilters(java.util.List<MediationReportSpecDimensionFilter> dimensionFilters) {
    this.dimensionFilters = dimensionFilters;
    return this;
  }

  /**
   * List of dimensions of the report. The value combination of these dimensions determines the row
   * of the report. If no dimensions are specified, the report returns a single row of requested
   * metrics for the entire account.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDimensions() {
    return dimensions;
  }

  /**
   * List of dimensions of the report. The value combination of these dimensions determines the row
   * of the report. If no dimensions are specified, the report returns a single row of requested
   * metrics for the entire account.
   * @param dimensions dimensions or {@code null} for none
   */
  public MediationReportSpec setDimensions(java.util.List<java.lang.String> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * Localization settings of the report.
   * @return value or {@code null} for none
   */
  public LocalizationSettings getLocalizationSettings() {
    return localizationSettings;
  }

  /**
   * Localization settings of the report.
   * @param localizationSettings localizationSettings or {@code null} for none
   */
  public MediationReportSpec setLocalizationSettings(LocalizationSettings localizationSettings) {
    this.localizationSettings = localizationSettings;
    return this;
  }

  /**
   * Maximum number of report data rows to return. If the value is not set, the API returns as many
   * rows as possible, up to 100000. Acceptable values are 1-100000, inclusive. Values larger than
   * 100000 return an error.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxReportRows() {
    return maxReportRows;
  }

  /**
   * Maximum number of report data rows to return. If the value is not set, the API returns as many
   * rows as possible, up to 100000. Acceptable values are 1-100000, inclusive. Values larger than
   * 100000 return an error.
   * @param maxReportRows maxReportRows or {@code null} for none
   */
  public MediationReportSpec setMaxReportRows(java.lang.Integer maxReportRows) {
    this.maxReportRows = maxReportRows;
    return this;
  }

  /**
   * List of metrics of the report. A report must specify at least one metric.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMetrics() {
    return metrics;
  }

  /**
   * List of metrics of the report. A report must specify at least one metric.
   * @param metrics metrics or {@code null} for none
   */
  public MediationReportSpec setMetrics(java.util.List<java.lang.String> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Describes the sorting of report rows. The order of the condition in the list defines its
   * precedence; the earlier the condition, the higher its precedence. If no sort conditions are
   * specified, the row ordering is undefined.
   * @return value or {@code null} for none
   */
  public java.util.List<MediationReportSpecSortCondition> getSortConditions() {
    return sortConditions;
  }

  /**
   * Describes the sorting of report rows. The order of the condition in the list defines its
   * precedence; the earlier the condition, the higher its precedence. If no sort conditions are
   * specified, the row ordering is undefined.
   * @param sortConditions sortConditions or {@code null} for none
   */
  public MediationReportSpec setSortConditions(java.util.List<MediationReportSpecSortCondition> sortConditions) {
    this.sortConditions = sortConditions;
    return this;
  }

  /**
   * A report time zone. Accepts an IANA TZ name values, such as "America/Los_Angeles." If no time
   * zone is defined, the account default takes effect. Check default value by the get account
   * action. **Warning:** The "America/Los_Angeles" is the only supported value at the moment.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeZone() {
    return timeZone;
  }

  /**
   * A report time zone. Accepts an IANA TZ name values, such as "America/Los_Angeles." If no time
   * zone is defined, the account default takes effect. Check default value by the get account
   * action. **Warning:** The "America/Los_Angeles" is the only supported value at the moment.
   * @param timeZone timeZone or {@code null} for none
   */
  public MediationReportSpec setTimeZone(java.lang.String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  @Override
  public MediationReportSpec set(String fieldName, Object value) {
    return (MediationReportSpec) super.set(fieldName, value);
  }

  @Override
  public MediationReportSpec clone() {
    return (MediationReportSpec) super.clone();
  }

}
