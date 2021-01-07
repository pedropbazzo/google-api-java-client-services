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
 * Contains information about a city that can be targeted by ads.
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
public final class City extends com.google.api.client.json.GenericJson {

  /**
   * Country code of the country to which this city belongs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String countryCode;

  /**
   * DART ID of the country to which this city belongs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long countryDartId;

  /**
   * DART ID of this city. This is the ID used for targeting and generating reports.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long dartId;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#city".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Metro region code of the metro region (DMA) to which this city belongs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metroCode;

  /**
   * ID of the metro region (DMA) to which this city belongs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long metroDmaId;

  /**
   * Name of this city.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Region code of the region to which this city belongs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regionCode;

  /**
   * DART ID of the region to which this city belongs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long regionDartId;

  /**
   * Country code of the country to which this city belongs.
   * @return value or {@code null} for none
   */
  public java.lang.String getCountryCode() {
    return countryCode;
  }

  /**
   * Country code of the country to which this city belongs.
   * @param countryCode countryCode or {@code null} for none
   */
  public City setCountryCode(java.lang.String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * DART ID of the country to which this city belongs.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCountryDartId() {
    return countryDartId;
  }

  /**
   * DART ID of the country to which this city belongs.
   * @param countryDartId countryDartId or {@code null} for none
   */
  public City setCountryDartId(java.lang.Long countryDartId) {
    this.countryDartId = countryDartId;
    return this;
  }

  /**
   * DART ID of this city. This is the ID used for targeting and generating reports.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDartId() {
    return dartId;
  }

  /**
   * DART ID of this city. This is the ID used for targeting and generating reports.
   * @param dartId dartId or {@code null} for none
   */
  public City setDartId(java.lang.Long dartId) {
    this.dartId = dartId;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#city".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dfareporting#city".
   * @param kind kind or {@code null} for none
   */
  public City setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Metro region code of the metro region (DMA) to which this city belongs.
   * @return value or {@code null} for none
   */
  public java.lang.String getMetroCode() {
    return metroCode;
  }

  /**
   * Metro region code of the metro region (DMA) to which this city belongs.
   * @param metroCode metroCode or {@code null} for none
   */
  public City setMetroCode(java.lang.String metroCode) {
    this.metroCode = metroCode;
    return this;
  }

  /**
   * ID of the metro region (DMA) to which this city belongs.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMetroDmaId() {
    return metroDmaId;
  }

  /**
   * ID of the metro region (DMA) to which this city belongs.
   * @param metroDmaId metroDmaId or {@code null} for none
   */
  public City setMetroDmaId(java.lang.Long metroDmaId) {
    this.metroDmaId = metroDmaId;
    return this;
  }

  /**
   * Name of this city.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this city.
   * @param name name or {@code null} for none
   */
  public City setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Region code of the region to which this city belongs.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegionCode() {
    return regionCode;
  }

  /**
   * Region code of the region to which this city belongs.
   * @param regionCode regionCode or {@code null} for none
   */
  public City setRegionCode(java.lang.String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  /**
   * DART ID of the region to which this city belongs.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRegionDartId() {
    return regionDartId;
  }

  /**
   * DART ID of the region to which this city belongs.
   * @param regionDartId regionDartId or {@code null} for none
   */
  public City setRegionDartId(java.lang.Long regionDartId) {
    this.regionDartId = regionDartId;
    return this;
  }

  @Override
  public City set(String fieldName, Object value) {
    return (City) super.set(fieldName, value);
  }

  @Override
  public City clone() {
    return (City) super.clone();
  }

}
