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
 * A single data point in a time series.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Point extends com.google.api.client.json.GenericJson {

  /**
   * The time interval to which the data point applies. For GAUGE metrics, the start time is
   * optional, but if it is supplied, it must equal the end time. For DELTA metrics, the start and
   * end time should specify a non-zero interval, with subsequent points specifying contiguous and
   * non-overlapping intervals. For CUMULATIVE metrics, the start and end time should specify a non-
   * zero interval, with subsequent points specifying the same start time and increasing end times,
   * until an event resets the cumulative value to zero and sets a new start time for the following
   * points.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeInterval interval;

  /**
   * The value of the data point.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TypedValue value;

  /**
   * The time interval to which the data point applies. For GAUGE metrics, the start time is
   * optional, but if it is supplied, it must equal the end time. For DELTA metrics, the start and
   * end time should specify a non-zero interval, with subsequent points specifying contiguous and
   * non-overlapping intervals. For CUMULATIVE metrics, the start and end time should specify a non-
   * zero interval, with subsequent points specifying the same start time and increasing end times,
   * until an event resets the cumulative value to zero and sets a new start time for the following
   * points.
   * @return value or {@code null} for none
   */
  public TimeInterval getInterval() {
    return interval;
  }

  /**
   * The time interval to which the data point applies. For GAUGE metrics, the start time is
   * optional, but if it is supplied, it must equal the end time. For DELTA metrics, the start and
   * end time should specify a non-zero interval, with subsequent points specifying contiguous and
   * non-overlapping intervals. For CUMULATIVE metrics, the start and end time should specify a non-
   * zero interval, with subsequent points specifying the same start time and increasing end times,
   * until an event resets the cumulative value to zero and sets a new start time for the following
   * points.
   * @param interval interval or {@code null} for none
   */
  public Point setInterval(TimeInterval interval) {
    this.interval = interval;
    return this;
  }

  /**
   * The value of the data point.
   * @return value or {@code null} for none
   */
  public TypedValue getValue() {
    return value;
  }

  /**
   * The value of the data point.
   * @param value value or {@code null} for none
   */
  public Point setValue(TypedValue value) {
    this.value = value;
    return this;
  }

  @Override
  public Point set(String fieldName, Object value) {
    return (Point) super.set(fieldName, value);
  }

  @Override
  public Point clone() {
    return (Point) super.clone();
  }

}
