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
 * A single data point from a collectd-based plugin.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CollectdValue extends com.google.api.client.json.GenericJson {

  /**
   * The data source for the collectd value. For example, there are two data sources for network
   * measurements: "rx" and "tx".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataSourceName;

  /**
   * The type of measurement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataSourceType;

  /**
   * The measurement value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TypedValue value;

  /**
   * The data source for the collectd value. For example, there are two data sources for network
   * measurements: "rx" and "tx".
   * @return value or {@code null} for none
   */
  public java.lang.String getDataSourceName() {
    return dataSourceName;
  }

  /**
   * The data source for the collectd value. For example, there are two data sources for network
   * measurements: "rx" and "tx".
   * @param dataSourceName dataSourceName or {@code null} for none
   */
  public CollectdValue setDataSourceName(java.lang.String dataSourceName) {
    this.dataSourceName = dataSourceName;
    return this;
  }

  /**
   * The type of measurement.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataSourceType() {
    return dataSourceType;
  }

  /**
   * The type of measurement.
   * @param dataSourceType dataSourceType or {@code null} for none
   */
  public CollectdValue setDataSourceType(java.lang.String dataSourceType) {
    this.dataSourceType = dataSourceType;
    return this;
  }

  /**
   * The measurement value.
   * @return value or {@code null} for none
   */
  public TypedValue getValue() {
    return value;
  }

  /**
   * The measurement value.
   * @param value value or {@code null} for none
   */
  public CollectdValue setValue(TypedValue value) {
    this.value = value;
    return this;
  }

  @Override
  public CollectdValue set(String fieldName, Object value) {
    return (CollectdValue) super.set(fieldName, value);
  }

  @Override
  public CollectdValue clone() {
    return (CollectdValue) super.clone();
  }

}
