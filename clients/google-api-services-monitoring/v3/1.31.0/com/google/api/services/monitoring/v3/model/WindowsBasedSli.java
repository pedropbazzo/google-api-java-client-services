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
 * A WindowsBasedSli defines good_service as the count of time windows for which the provided
 * service was of good quality. Criteria for determining if service was good are embedded in the
 * window_criterion.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WindowsBasedSli extends com.google.api.client.json.GenericJson {

  /**
   * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a
   * TimeSeries with ValueType = BOOL. The window is good if any true values appear in the window.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String goodBadMetricFilter;

  /**
   * A window is good if its performance is high enough.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PerformanceThreshold goodTotalRatioThreshold;

  /**
   * A window is good if the metric's value is in a good range, averaged across returned streams.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricRange metricMeanInRange;

  /**
   * A window is good if the metric's value is in a good range, summed across returned streams.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricRange metricSumInRange;

  /**
   * Duration over which window quality is evaluated. Must be an integer fraction of a day and at
   * least 60s.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String windowPeriod;

  /**
   * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a
   * TimeSeries with ValueType = BOOL. The window is good if any true values appear in the window.
   * @return value or {@code null} for none
   */
  public java.lang.String getGoodBadMetricFilter() {
    return goodBadMetricFilter;
  }

  /**
   * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a
   * TimeSeries with ValueType = BOOL. The window is good if any true values appear in the window.
   * @param goodBadMetricFilter goodBadMetricFilter or {@code null} for none
   */
  public WindowsBasedSli setGoodBadMetricFilter(java.lang.String goodBadMetricFilter) {
    this.goodBadMetricFilter = goodBadMetricFilter;
    return this;
  }

  /**
   * A window is good if its performance is high enough.
   * @return value or {@code null} for none
   */
  public PerformanceThreshold getGoodTotalRatioThreshold() {
    return goodTotalRatioThreshold;
  }

  /**
   * A window is good if its performance is high enough.
   * @param goodTotalRatioThreshold goodTotalRatioThreshold or {@code null} for none
   */
  public WindowsBasedSli setGoodTotalRatioThreshold(PerformanceThreshold goodTotalRatioThreshold) {
    this.goodTotalRatioThreshold = goodTotalRatioThreshold;
    return this;
  }

  /**
   * A window is good if the metric's value is in a good range, averaged across returned streams.
   * @return value or {@code null} for none
   */
  public MetricRange getMetricMeanInRange() {
    return metricMeanInRange;
  }

  /**
   * A window is good if the metric's value is in a good range, averaged across returned streams.
   * @param metricMeanInRange metricMeanInRange or {@code null} for none
   */
  public WindowsBasedSli setMetricMeanInRange(MetricRange metricMeanInRange) {
    this.metricMeanInRange = metricMeanInRange;
    return this;
  }

  /**
   * A window is good if the metric's value is in a good range, summed across returned streams.
   * @return value or {@code null} for none
   */
  public MetricRange getMetricSumInRange() {
    return metricSumInRange;
  }

  /**
   * A window is good if the metric's value is in a good range, summed across returned streams.
   * @param metricSumInRange metricSumInRange or {@code null} for none
   */
  public WindowsBasedSli setMetricSumInRange(MetricRange metricSumInRange) {
    this.metricSumInRange = metricSumInRange;
    return this;
  }

  /**
   * Duration over which window quality is evaluated. Must be an integer fraction of a day and at
   * least 60s.
   * @return value or {@code null} for none
   */
  public String getWindowPeriod() {
    return windowPeriod;
  }

  /**
   * Duration over which window quality is evaluated. Must be an integer fraction of a day and at
   * least 60s.
   * @param windowPeriod windowPeriod or {@code null} for none
   */
  public WindowsBasedSli setWindowPeriod(String windowPeriod) {
    this.windowPeriod = windowPeriod;
    return this;
  }

  @Override
  public WindowsBasedSli set(String fieldName, Object value) {
    return (WindowsBasedSli) super.set(fieldName, value);
  }

  @Override
  public WindowsBasedSli clone() {
    return (WindowsBasedSli) super.clone();
  }

}
