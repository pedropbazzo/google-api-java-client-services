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
 * Representation of a metric value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdMob API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReportRowMetricValue extends com.google.api.client.json.GenericJson {

  /**
   * Double precision (approximate) decimal values. Rates are from 0 to 1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double doubleValue;

  /**
   * Metric integer value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long integerValue;

  /**
   * Amount in micros. One million is equivalent to one unit. Currency value is in the unit (USD,
   * EUR or other) specified by the request. For example, $6.50 whould be represented as 6500000
   * micros.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long microsValue;

  /**
   * Double precision (approximate) decimal values. Rates are from 0 to 1.
   * @return value or {@code null} for none
   */
  public java.lang.Double getDoubleValue() {
    return doubleValue;
  }

  /**
   * Double precision (approximate) decimal values. Rates are from 0 to 1.
   * @param doubleValue doubleValue or {@code null} for none
   */
  public ReportRowMetricValue setDoubleValue(java.lang.Double doubleValue) {
    this.doubleValue = doubleValue;
    return this;
  }

  /**
   * Metric integer value.
   * @return value or {@code null} for none
   */
  public java.lang.Long getIntegerValue() {
    return integerValue;
  }

  /**
   * Metric integer value.
   * @param integerValue integerValue or {@code null} for none
   */
  public ReportRowMetricValue setIntegerValue(java.lang.Long integerValue) {
    this.integerValue = integerValue;
    return this;
  }

  /**
   * Amount in micros. One million is equivalent to one unit. Currency value is in the unit (USD,
   * EUR or other) specified by the request. For example, $6.50 whould be represented as 6500000
   * micros.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMicrosValue() {
    return microsValue;
  }

  /**
   * Amount in micros. One million is equivalent to one unit. Currency value is in the unit (USD,
   * EUR or other) specified by the request. For example, $6.50 whould be represented as 6500000
   * micros.
   * @param microsValue microsValue or {@code null} for none
   */
  public ReportRowMetricValue setMicrosValue(java.lang.Long microsValue) {
    this.microsValue = microsValue;
    return this;
  }

  @Override
  public ReportRowMetricValue set(String fieldName, Object value) {
    return (ReportRowMetricValue) super.set(fieldName, value);
  }

  @Override
  public ReportRowMetricValue clone() {
    return (ReportRowMetricValue) super.clone();
  }

}
