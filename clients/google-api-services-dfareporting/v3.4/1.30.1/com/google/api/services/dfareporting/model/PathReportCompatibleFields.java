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
 * Represents fields that are compatible to be selected for a report of type "PATH".
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
public final class PathReportCompatibleFields extends com.google.api.client.json.GenericJson {

  /**
   * Dimensions which are compatible to be selected in the "channelGroupings" section of the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Dimension> channelGroupings;

  static {
    // hack to force ProGuard to consider Dimension used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Dimension.class);
  }

  /**
   * Dimensions which are compatible to be selected in the "dimensions" section of the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Dimension> dimensions;

  static {
    // hack to force ProGuard to consider Dimension used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Dimension.class);
  }

  /**
   * The kind of resource this is, in this case dfareporting#pathReportCompatibleFields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Metrics which are compatible to be selected in the "metricNames" section of the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Metric> metrics;

  static {
    // hack to force ProGuard to consider Metric used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Metric.class);
  }

  /**
   * Dimensions which are compatible to be selected in the "pathFilters" section of the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Dimension> pathFilters;

  static {
    // hack to force ProGuard to consider Dimension used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Dimension.class);
  }

  /**
   * Dimensions which are compatible to be selected in the "channelGroupings" section of the report.
   * @return value or {@code null} for none
   */
  public java.util.List<Dimension> getChannelGroupings() {
    return channelGroupings;
  }

  /**
   * Dimensions which are compatible to be selected in the "channelGroupings" section of the report.
   * @param channelGroupings channelGroupings or {@code null} for none
   */
  public PathReportCompatibleFields setChannelGroupings(java.util.List<Dimension> channelGroupings) {
    this.channelGroupings = channelGroupings;
    return this;
  }

  /**
   * Dimensions which are compatible to be selected in the "dimensions" section of the report.
   * @return value or {@code null} for none
   */
  public java.util.List<Dimension> getDimensions() {
    return dimensions;
  }

  /**
   * Dimensions which are compatible to be selected in the "dimensions" section of the report.
   * @param dimensions dimensions or {@code null} for none
   */
  public PathReportCompatibleFields setDimensions(java.util.List<Dimension> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * The kind of resource this is, in this case dfareporting#pathReportCompatibleFields.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of resource this is, in this case dfareporting#pathReportCompatibleFields.
   * @param kind kind or {@code null} for none
   */
  public PathReportCompatibleFields setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Metrics which are compatible to be selected in the "metricNames" section of the report.
   * @return value or {@code null} for none
   */
  public java.util.List<Metric> getMetrics() {
    return metrics;
  }

  /**
   * Metrics which are compatible to be selected in the "metricNames" section of the report.
   * @param metrics metrics or {@code null} for none
   */
  public PathReportCompatibleFields setMetrics(java.util.List<Metric> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Dimensions which are compatible to be selected in the "pathFilters" section of the report.
   * @return value or {@code null} for none
   */
  public java.util.List<Dimension> getPathFilters() {
    return pathFilters;
  }

  /**
   * Dimensions which are compatible to be selected in the "pathFilters" section of the report.
   * @param pathFilters pathFilters or {@code null} for none
   */
  public PathReportCompatibleFields setPathFilters(java.util.List<Dimension> pathFilters) {
    this.pathFilters = pathFilters;
    return this;
  }

  @Override
  public PathReportCompatibleFields set(String fieldName, Object value) {
    return (PathReportCompatibleFields) super.set(fieldName, value);
  }

  @Override
  public PathReportCompatibleFields clone() {
    return (PathReportCompatibleFields) super.clone();
  }

}
