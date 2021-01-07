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

package com.google.api.services.jobs.v4.model;

/**
 * Parameters needed for commute search.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CommuteFilter extends com.google.api.client.json.GenericJson {

  /**
   * If `true`, jobs without street level addresses may also be returned. For city level addresses,
   * the city center is used. For state and coarser level addresses, text matching is used. If this
   * field is set to `false` or isn't specified, only jobs that include street level addresses will
   * be returned by commute search.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowImpreciseAddresses;

  /**
   * Required. The method of transportation to calculate the commute time for.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String commuteMethod;

  /**
   * The departure time used to calculate traffic impact, represented as google.type.TimeOfDay in
   * local time zone. Currently traffic model is restricted to hour level resolution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeOfDay departureTime;

  /**
   * Specifies the traffic density to use when calculating commute time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String roadTraffic;

  /**
   * Required. The latitude and longitude of the location to calculate the commute time from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LatLng startCoordinates;

  /**
   * Required. The maximum travel time in seconds. The maximum allowed value is `3600s` (one hour).
   * Format is `123s`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String travelDuration;

  /**
   * If `true`, jobs without street level addresses may also be returned. For city level addresses,
   * the city center is used. For state and coarser level addresses, text matching is used. If this
   * field is set to `false` or isn't specified, only jobs that include street level addresses will
   * be returned by commute search.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowImpreciseAddresses() {
    return allowImpreciseAddresses;
  }

  /**
   * If `true`, jobs without street level addresses may also be returned. For city level addresses,
   * the city center is used. For state and coarser level addresses, text matching is used. If this
   * field is set to `false` or isn't specified, only jobs that include street level addresses will
   * be returned by commute search.
   * @param allowImpreciseAddresses allowImpreciseAddresses or {@code null} for none
   */
  public CommuteFilter setAllowImpreciseAddresses(java.lang.Boolean allowImpreciseAddresses) {
    this.allowImpreciseAddresses = allowImpreciseAddresses;
    return this;
  }

  /**
   * Required. The method of transportation to calculate the commute time for.
   * @return value or {@code null} for none
   */
  public java.lang.String getCommuteMethod() {
    return commuteMethod;
  }

  /**
   * Required. The method of transportation to calculate the commute time for.
   * @param commuteMethod commuteMethod or {@code null} for none
   */
  public CommuteFilter setCommuteMethod(java.lang.String commuteMethod) {
    this.commuteMethod = commuteMethod;
    return this;
  }

  /**
   * The departure time used to calculate traffic impact, represented as google.type.TimeOfDay in
   * local time zone. Currently traffic model is restricted to hour level resolution.
   * @return value or {@code null} for none
   */
  public TimeOfDay getDepartureTime() {
    return departureTime;
  }

  /**
   * The departure time used to calculate traffic impact, represented as google.type.TimeOfDay in
   * local time zone. Currently traffic model is restricted to hour level resolution.
   * @param departureTime departureTime or {@code null} for none
   */
  public CommuteFilter setDepartureTime(TimeOfDay departureTime) {
    this.departureTime = departureTime;
    return this;
  }

  /**
   * Specifies the traffic density to use when calculating commute time.
   * @return value or {@code null} for none
   */
  public java.lang.String getRoadTraffic() {
    return roadTraffic;
  }

  /**
   * Specifies the traffic density to use when calculating commute time.
   * @param roadTraffic roadTraffic or {@code null} for none
   */
  public CommuteFilter setRoadTraffic(java.lang.String roadTraffic) {
    this.roadTraffic = roadTraffic;
    return this;
  }

  /**
   * Required. The latitude and longitude of the location to calculate the commute time from.
   * @return value or {@code null} for none
   */
  public LatLng getStartCoordinates() {
    return startCoordinates;
  }

  /**
   * Required. The latitude and longitude of the location to calculate the commute time from.
   * @param startCoordinates startCoordinates or {@code null} for none
   */
  public CommuteFilter setStartCoordinates(LatLng startCoordinates) {
    this.startCoordinates = startCoordinates;
    return this;
  }

  /**
   * Required. The maximum travel time in seconds. The maximum allowed value is `3600s` (one hour).
   * Format is `123s`.
   * @return value or {@code null} for none
   */
  public String getTravelDuration() {
    return travelDuration;
  }

  /**
   * Required. The maximum travel time in seconds. The maximum allowed value is `3600s` (one hour).
   * Format is `123s`.
   * @param travelDuration travelDuration or {@code null} for none
   */
  public CommuteFilter setTravelDuration(String travelDuration) {
    this.travelDuration = travelDuration;
    return this;
  }

  @Override
  public CommuteFilter set(String fieldName, Object value) {
    return (CommuteFilter) super.set(fieldName, value);
  }

  @Override
  public CommuteFilter clone() {
    return (CommuteFilter) super.clone();
  }

}
