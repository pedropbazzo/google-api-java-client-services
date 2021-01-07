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

package com.google.api.services.monitoring.v1.model;

/**
 * Describes a ranking-based time series filter. Each input time series is ranked with an aligner.
 * The filter will allow up to num_time_series time series to pass through it, selecting them based
 * on the relative ranking.For example, if ranking_method is METHOD_MEAN,direction is BOTTOM, and
 * num_time_series is 3, then the 3 times series with the lowest mean values will pass through the
 * filter.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PickTimeSeriesFilter extends com.google.api.client.json.GenericJson {

  /**
   * How to use the ranking to select time series that pass through the filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String direction;

  /**
   * How many time series to allow to pass through the filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numTimeSeries;

  /**
   * ranking_method is applied to each time series independently to produce the value which will be
   * used to compare the time series to other time series.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rankingMethod;

  /**
   * How to use the ranking to select time series that pass through the filter.
   * @return value or {@code null} for none
   */
  public java.lang.String getDirection() {
    return direction;
  }

  /**
   * How to use the ranking to select time series that pass through the filter.
   * @param direction direction or {@code null} for none
   */
  public PickTimeSeriesFilter setDirection(java.lang.String direction) {
    this.direction = direction;
    return this;
  }

  /**
   * How many time series to allow to pass through the filter.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumTimeSeries() {
    return numTimeSeries;
  }

  /**
   * How many time series to allow to pass through the filter.
   * @param numTimeSeries numTimeSeries or {@code null} for none
   */
  public PickTimeSeriesFilter setNumTimeSeries(java.lang.Integer numTimeSeries) {
    this.numTimeSeries = numTimeSeries;
    return this;
  }

  /**
   * ranking_method is applied to each time series independently to produce the value which will be
   * used to compare the time series to other time series.
   * @return value or {@code null} for none
   */
  public java.lang.String getRankingMethod() {
    return rankingMethod;
  }

  /**
   * ranking_method is applied to each time series independently to produce the value which will be
   * used to compare the time series to other time series.
   * @param rankingMethod rankingMethod or {@code null} for none
   */
  public PickTimeSeriesFilter setRankingMethod(java.lang.String rankingMethod) {
    this.rankingMethod = rankingMethod;
    return this;
  }

  @Override
  public PickTimeSeriesFilter set(String fieldName, Object value) {
    return (PickTimeSeriesFilter) super.set(fieldName, value);
  }

  @Override
  public PickTimeSeriesFilter clone() {
    return (PickTimeSeriesFilter) super.clone();
  }

}
