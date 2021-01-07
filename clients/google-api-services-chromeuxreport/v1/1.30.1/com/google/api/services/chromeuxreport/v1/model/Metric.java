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

package com.google.api.services.chromeuxreport.v1.model;

/**
 * A `metric` is a set of user experience data for a single web performance metric, like "first
 * contentful paint". It contains a summary histogram of real world Chrome usage as a series of
 * `bins`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome UX Report API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Metric extends com.google.api.client.json.GenericJson {

  /**
   * The histogram of user experiences for a metric. The histogram will have at least one bin and
   * the densities of all bins will add up to ~1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Bin> histogram;

  static {
    // hack to force ProGuard to consider Bin used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Bin.class);
  }

  /**
   * Common useful percentiles of the Metric. The value type for the percentiles will be the same as
   * the value types given for the Histogram bins.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Percentiles percentiles;

  /**
   * The histogram of user experiences for a metric. The histogram will have at least one bin and
   * the densities of all bins will add up to ~1.
   * @return value or {@code null} for none
   */
  public java.util.List<Bin> getHistogram() {
    return histogram;
  }

  /**
   * The histogram of user experiences for a metric. The histogram will have at least one bin and
   * the densities of all bins will add up to ~1.
   * @param histogram histogram or {@code null} for none
   */
  public Metric setHistogram(java.util.List<Bin> histogram) {
    this.histogram = histogram;
    return this;
  }

  /**
   * Common useful percentiles of the Metric. The value type for the percentiles will be the same as
   * the value types given for the Histogram bins.
   * @return value or {@code null} for none
   */
  public Percentiles getPercentiles() {
    return percentiles;
  }

  /**
   * Common useful percentiles of the Metric. The value type for the percentiles will be the same as
   * the value types given for the Histogram bins.
   * @param percentiles percentiles or {@code null} for none
   */
  public Metric setPercentiles(Percentiles percentiles) {
    this.percentiles = percentiles;
    return this;
  }

  @Override
  public Metric set(String fieldName, Object value) {
    return (Metric) super.set(fieldName, value);
  }

  @Override
  public Metric clone() {
    return (Metric) super.clone();
  }

}
