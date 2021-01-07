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
 * Describes how to combine multiple time series to provide a different view of the data.
 * Aggregation of time series is done in two steps. First, each time series in the set is aligned to
 * the same time interval boundaries, then the set of time series is optionally reduced in
 * number.Alignment consists of applying the per_series_aligner operation to each time series after
 * its data has been divided into regular alignment_period time intervals. This process takes all of
 * the data points in an alignment period, applies a mathematical transformation such as averaging,
 * minimum, maximum, delta, etc., and converts them into a single data point per period.Reduction is
 * when the aligned and transformed time series can optionally be combined, reducing the number of
 * time series through similar mathematical transformations. Reduction involves applying a
 * cross_series_reducer to all the time series, optionally sorting the time series into subsets with
 * group_by_fields, and applying the reducer to each subset.The raw time series data can contain a
 * huge amount of information from multiple sources. Alignment and reduction transforms this mass of
 * data into a more manageable and representative collection of data, for example "the 95% latency
 * across the average of all tasks in a cluster". This representative data can be more easily
 * graphed and comprehended, and the individual time series data is still available for later
 * drilldown. For more details, see Filtering and aggregation
 * (https://cloud.google.com/monitoring/api/v3/aggregation).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Aggregation extends com.google.api.client.json.GenericJson {

  /**
   * The alignment_period specifies a time interval, in seconds, that is used to divide the data in
   * all the time series into consistent blocks of time. This will be done before the per-series
   * aligner can be applied to the data.The value must be at least 60 seconds. If a per-series
   * aligner other than ALIGN_NONE is specified, this field is required or an error is returned. If
   * no per-series aligner is specified, or the aligner ALIGN_NONE is specified, then this field is
   * ignored.The maximum value of the alignment_period is 104 weeks (2 years) for charts, and 90,000
   * seconds (25 hours) for alerting policies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String alignmentPeriod;

  /**
   * The reduction operation to be used to combine time series into a single time series, where the
   * value of each data point in the resulting series is a function of all the already aligned
   * values in the input time series.Not all reducer operations can be applied to all time series.
   * The valid choices depend on the metric_kind and the value_type of the original time series.
   * Reduction can yield a time series with a different metric_kind or value_type than the input
   * time series.Time series data must first be aligned (see per_series_aligner) in order to perform
   * cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must
   * be specified, and must not be ALIGN_NONE. An alignment_period must also be specified;
   * otherwise, an error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String crossSeriesReducer;

  /**
   * The set of fields to preserve when cross_series_reducer is specified. The group_by_fields
   * determine how the time series are partitioned into subsets prior to applying the aggregation
   * operation. Each subset contains time series that have the same value for each of the grouping
   * fields. Each individual time series is a member of exactly one subset. The cross_series_reducer
   * is applied to each subset of time series. It is not possible to reduce across different
   * resource types, so this field implicitly contains resource.type. Fields not specified in
   * group_by_fields are aggregated away. If group_by_fields is not specified and all the time
   * series have the same resource type, then the time series are aggregated into a single output
   * time series. If cross_series_reducer is not defined, this field is ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> groupByFields;

  /**
   * An Aligner describes how to bring the data points in a single time series into temporal
   * alignment. Except for ALIGN_NONE, all alignments cause all the data points in an
   * alignment_period to be mathematically grouped together, resulting in a single data point for
   * each alignment_period with end timestamp at the end of the period.Not all alignment operations
   * may be applied to all time series. The valid choices depend on the metric_kind and value_type
   * of the original time series. Alignment can change the metric_kind or the value_type of the time
   * series.Time series data must be aligned in order to perform cross-time series reduction. If
   * cross_series_reducer is specified, then per_series_aligner must be specified and not equal to
   * ALIGN_NONE and alignment_period must be specified; otherwise, an error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String perSeriesAligner;

  /**
   * The alignment_period specifies a time interval, in seconds, that is used to divide the data in
   * all the time series into consistent blocks of time. This will be done before the per-series
   * aligner can be applied to the data.The value must be at least 60 seconds. If a per-series
   * aligner other than ALIGN_NONE is specified, this field is required or an error is returned. If
   * no per-series aligner is specified, or the aligner ALIGN_NONE is specified, then this field is
   * ignored.The maximum value of the alignment_period is 104 weeks (2 years) for charts, and 90,000
   * seconds (25 hours) for alerting policies.
   * @return value or {@code null} for none
   */
  public String getAlignmentPeriod() {
    return alignmentPeriod;
  }

  /**
   * The alignment_period specifies a time interval, in seconds, that is used to divide the data in
   * all the time series into consistent blocks of time. This will be done before the per-series
   * aligner can be applied to the data.The value must be at least 60 seconds. If a per-series
   * aligner other than ALIGN_NONE is specified, this field is required or an error is returned. If
   * no per-series aligner is specified, or the aligner ALIGN_NONE is specified, then this field is
   * ignored.The maximum value of the alignment_period is 104 weeks (2 years) for charts, and 90,000
   * seconds (25 hours) for alerting policies.
   * @param alignmentPeriod alignmentPeriod or {@code null} for none
   */
  public Aggregation setAlignmentPeriod(String alignmentPeriod) {
    this.alignmentPeriod = alignmentPeriod;
    return this;
  }

  /**
   * The reduction operation to be used to combine time series into a single time series, where the
   * value of each data point in the resulting series is a function of all the already aligned
   * values in the input time series.Not all reducer operations can be applied to all time series.
   * The valid choices depend on the metric_kind and the value_type of the original time series.
   * Reduction can yield a time series with a different metric_kind or value_type than the input
   * time series.Time series data must first be aligned (see per_series_aligner) in order to perform
   * cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must
   * be specified, and must not be ALIGN_NONE. An alignment_period must also be specified;
   * otherwise, an error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getCrossSeriesReducer() {
    return crossSeriesReducer;
  }

  /**
   * The reduction operation to be used to combine time series into a single time series, where the
   * value of each data point in the resulting series is a function of all the already aligned
   * values in the input time series.Not all reducer operations can be applied to all time series.
   * The valid choices depend on the metric_kind and the value_type of the original time series.
   * Reduction can yield a time series with a different metric_kind or value_type than the input
   * time series.Time series data must first be aligned (see per_series_aligner) in order to perform
   * cross-time series reduction. If cross_series_reducer is specified, then per_series_aligner must
   * be specified, and must not be ALIGN_NONE. An alignment_period must also be specified;
   * otherwise, an error is returned.
   * @param crossSeriesReducer crossSeriesReducer or {@code null} for none
   */
  public Aggregation setCrossSeriesReducer(java.lang.String crossSeriesReducer) {
    this.crossSeriesReducer = crossSeriesReducer;
    return this;
  }

  /**
   * The set of fields to preserve when cross_series_reducer is specified. The group_by_fields
   * determine how the time series are partitioned into subsets prior to applying the aggregation
   * operation. Each subset contains time series that have the same value for each of the grouping
   * fields. Each individual time series is a member of exactly one subset. The cross_series_reducer
   * is applied to each subset of time series. It is not possible to reduce across different
   * resource types, so this field implicitly contains resource.type. Fields not specified in
   * group_by_fields are aggregated away. If group_by_fields is not specified and all the time
   * series have the same resource type, then the time series are aggregated into a single output
   * time series. If cross_series_reducer is not defined, this field is ignored.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getGroupByFields() {
    return groupByFields;
  }

  /**
   * The set of fields to preserve when cross_series_reducer is specified. The group_by_fields
   * determine how the time series are partitioned into subsets prior to applying the aggregation
   * operation. Each subset contains time series that have the same value for each of the grouping
   * fields. Each individual time series is a member of exactly one subset. The cross_series_reducer
   * is applied to each subset of time series. It is not possible to reduce across different
   * resource types, so this field implicitly contains resource.type. Fields not specified in
   * group_by_fields are aggregated away. If group_by_fields is not specified and all the time
   * series have the same resource type, then the time series are aggregated into a single output
   * time series. If cross_series_reducer is not defined, this field is ignored.
   * @param groupByFields groupByFields or {@code null} for none
   */
  public Aggregation setGroupByFields(java.util.List<java.lang.String> groupByFields) {
    this.groupByFields = groupByFields;
    return this;
  }

  /**
   * An Aligner describes how to bring the data points in a single time series into temporal
   * alignment. Except for ALIGN_NONE, all alignments cause all the data points in an
   * alignment_period to be mathematically grouped together, resulting in a single data point for
   * each alignment_period with end timestamp at the end of the period.Not all alignment operations
   * may be applied to all time series. The valid choices depend on the metric_kind and value_type
   * of the original time series. Alignment can change the metric_kind or the value_type of the time
   * series.Time series data must be aligned in order to perform cross-time series reduction. If
   * cross_series_reducer is specified, then per_series_aligner must be specified and not equal to
   * ALIGN_NONE and alignment_period must be specified; otherwise, an error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getPerSeriesAligner() {
    return perSeriesAligner;
  }

  /**
   * An Aligner describes how to bring the data points in a single time series into temporal
   * alignment. Except for ALIGN_NONE, all alignments cause all the data points in an
   * alignment_period to be mathematically grouped together, resulting in a single data point for
   * each alignment_period with end timestamp at the end of the period.Not all alignment operations
   * may be applied to all time series. The valid choices depend on the metric_kind and value_type
   * of the original time series. Alignment can change the metric_kind or the value_type of the time
   * series.Time series data must be aligned in order to perform cross-time series reduction. If
   * cross_series_reducer is specified, then per_series_aligner must be specified and not equal to
   * ALIGN_NONE and alignment_period must be specified; otherwise, an error is returned.
   * @param perSeriesAligner perSeriesAligner or {@code null} for none
   */
  public Aggregation setPerSeriesAligner(java.lang.String perSeriesAligner) {
    this.perSeriesAligner = perSeriesAligner;
    return this;
  }

  @Override
  public Aggregation set(String fieldName, Object value) {
    return (Aggregation) super.set(fieldName, value);
  }

  @Override
  public Aggregation clone() {
    return (Aggregation) super.clone();
  }

}
