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

package com.google.api.services.jobs.v3.model;

/**
 * Input only. Geographic region of the search.
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
public final class LocationFilter extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The address name, such as "Mountain View" or "Bay Area".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address;

  /**
   * Optional. The distance_in_miles is applied when the location being searched for is identified
   * as a city or smaller. When the location being searched for is a state or larger, this field is
   * ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double distanceInMiles;

  /**
   * Optional. The latitude and longitude of the geographic center from which to search. This
   * field's ignored if `address` is provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LatLng latLng;

  /**
   * Optional. CLDR region code of the country/region of the address. This is used to address
   * ambiguity of the user-input location, for example, "Liverpool" against "Liverpool, NY, US" or
   * "Liverpool, UK". Set this field if all the jobs to search against are from a same region, or
   * jobs are world-wide, but the job seeker is from a specific region. See http://cldr.unicode.org/
   * and http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html for details.
   * Example: "CH" for Switzerland.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regionCode;

  /**
   * Optional. Allows the client to return jobs without a set location, specifically, telecommuting
   * jobs (telecommuting is considered by the service as a special location. Job.posting_region
   * indicates if a job permits telecommuting. If this field is set to
   * TelecommutePreference.TELECOMMUTE_ALLOWED, telecommuting jobs are searched, and address and
   * lat_lng are ignored. If not set or set to TelecommutePreference.TELECOMMUTE_EXCLUDED,
   * telecommute job are not searched. This filter can be used by itself to search exclusively for
   * telecommuting jobs, or it can be combined with another location filter to search for a
   * combination of job locations, such as "Mountain View" or "telecommuting" jobs. However, when
   * used in combination with other location filters, telecommuting jobs can be treated as less
   * relevant than other jobs in the search response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String telecommutePreference;

  /**
   * Optional. The address name, such as "Mountain View" or "Bay Area".
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * Optional. The address name, such as "Mountain View" or "Bay Area".
   * @param address address or {@code null} for none
   */
  public LocationFilter setAddress(java.lang.String address) {
    this.address = address;
    return this;
  }

  /**
   * Optional. The distance_in_miles is applied when the location being searched for is identified
   * as a city or smaller. When the location being searched for is a state or larger, this field is
   * ignored.
   * @return value or {@code null} for none
   */
  public java.lang.Double getDistanceInMiles() {
    return distanceInMiles;
  }

  /**
   * Optional. The distance_in_miles is applied when the location being searched for is identified
   * as a city or smaller. When the location being searched for is a state or larger, this field is
   * ignored.
   * @param distanceInMiles distanceInMiles or {@code null} for none
   */
  public LocationFilter setDistanceInMiles(java.lang.Double distanceInMiles) {
    this.distanceInMiles = distanceInMiles;
    return this;
  }

  /**
   * Optional. The latitude and longitude of the geographic center from which to search. This
   * field's ignored if `address` is provided.
   * @return value or {@code null} for none
   */
  public LatLng getLatLng() {
    return latLng;
  }

  /**
   * Optional. The latitude and longitude of the geographic center from which to search. This
   * field's ignored if `address` is provided.
   * @param latLng latLng or {@code null} for none
   */
  public LocationFilter setLatLng(LatLng latLng) {
    this.latLng = latLng;
    return this;
  }

  /**
   * Optional. CLDR region code of the country/region of the address. This is used to address
   * ambiguity of the user-input location, for example, "Liverpool" against "Liverpool, NY, US" or
   * "Liverpool, UK". Set this field if all the jobs to search against are from a same region, or
   * jobs are world-wide, but the job seeker is from a specific region. See http://cldr.unicode.org/
   * and http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html for details.
   * Example: "CH" for Switzerland.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegionCode() {
    return regionCode;
  }

  /**
   * Optional. CLDR region code of the country/region of the address. This is used to address
   * ambiguity of the user-input location, for example, "Liverpool" against "Liverpool, NY, US" or
   * "Liverpool, UK". Set this field if all the jobs to search against are from a same region, or
   * jobs are world-wide, but the job seeker is from a specific region. See http://cldr.unicode.org/
   * and http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html for details.
   * Example: "CH" for Switzerland.
   * @param regionCode regionCode or {@code null} for none
   */
  public LocationFilter setRegionCode(java.lang.String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  /**
   * Optional. Allows the client to return jobs without a set location, specifically, telecommuting
   * jobs (telecommuting is considered by the service as a special location. Job.posting_region
   * indicates if a job permits telecommuting. If this field is set to
   * TelecommutePreference.TELECOMMUTE_ALLOWED, telecommuting jobs are searched, and address and
   * lat_lng are ignored. If not set or set to TelecommutePreference.TELECOMMUTE_EXCLUDED,
   * telecommute job are not searched. This filter can be used by itself to search exclusively for
   * telecommuting jobs, or it can be combined with another location filter to search for a
   * combination of job locations, such as "Mountain View" or "telecommuting" jobs. However, when
   * used in combination with other location filters, telecommuting jobs can be treated as less
   * relevant than other jobs in the search response.
   * @return value or {@code null} for none
   */
  public java.lang.String getTelecommutePreference() {
    return telecommutePreference;
  }

  /**
   * Optional. Allows the client to return jobs without a set location, specifically, telecommuting
   * jobs (telecommuting is considered by the service as a special location. Job.posting_region
   * indicates if a job permits telecommuting. If this field is set to
   * TelecommutePreference.TELECOMMUTE_ALLOWED, telecommuting jobs are searched, and address and
   * lat_lng are ignored. If not set or set to TelecommutePreference.TELECOMMUTE_EXCLUDED,
   * telecommute job are not searched. This filter can be used by itself to search exclusively for
   * telecommuting jobs, or it can be combined with another location filter to search for a
   * combination of job locations, such as "Mountain View" or "telecommuting" jobs. However, when
   * used in combination with other location filters, telecommuting jobs can be treated as less
   * relevant than other jobs in the search response.
   * @param telecommutePreference telecommutePreference or {@code null} for none
   */
  public LocationFilter setTelecommutePreference(java.lang.String telecommutePreference) {
    this.telecommutePreference = telecommutePreference;
    return this;
  }

  @Override
  public LocationFilter set(String fieldName, Object value) {
    return (LocationFilter) super.set(fieldName, value);
  }

  @Override
  public LocationFilter clone() {
    return (LocationFilter) super.clone();
  }

}
