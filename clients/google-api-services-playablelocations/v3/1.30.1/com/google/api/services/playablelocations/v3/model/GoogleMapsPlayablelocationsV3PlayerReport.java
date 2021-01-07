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

package com.google.api.services.playablelocations.v3.model;

/**
 * A report submitted by a player about a playable location that is considered inappropriate for use
 * in the game.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Playable Locations API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleMapsPlayablelocationsV3PlayerReport extends com.google.api.client.json.GenericJson {

  /**
   * Language code (in BCP-47 format) indicating the language of the freeform description provided
   * in `reason_details`. Examples are "en", "en-US" or "ja-Latn". For more information, see
   * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String languageCode;

  /**
   * Required. The name of the playable location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationName;

  /**
   * Required. A free-form description detailing why the playable location is considered bad.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reasonDetails;

  /**
   * Required. One or more reasons why this playable location is considered bad.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> reasons;

  /**
   * Language code (in BCP-47 format) indicating the language of the freeform description provided
   * in `reason_details`. Examples are "en", "en-US" or "ja-Latn". For more information, see
   * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguageCode() {
    return languageCode;
  }

  /**
   * Language code (in BCP-47 format) indicating the language of the freeform description provided
   * in `reason_details`. Examples are "en", "en-US" or "ja-Latn". For more information, see
   * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
   * @param languageCode languageCode or {@code null} for none
   */
  public GoogleMapsPlayablelocationsV3PlayerReport setLanguageCode(java.lang.String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Required. The name of the playable location.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationName() {
    return locationName;
  }

  /**
   * Required. The name of the playable location.
   * @param locationName locationName or {@code null} for none
   */
  public GoogleMapsPlayablelocationsV3PlayerReport setLocationName(java.lang.String locationName) {
    this.locationName = locationName;
    return this;
  }

  /**
   * Required. A free-form description detailing why the playable location is considered bad.
   * @return value or {@code null} for none
   */
  public java.lang.String getReasonDetails() {
    return reasonDetails;
  }

  /**
   * Required. A free-form description detailing why the playable location is considered bad.
   * @param reasonDetails reasonDetails or {@code null} for none
   */
  public GoogleMapsPlayablelocationsV3PlayerReport setReasonDetails(java.lang.String reasonDetails) {
    this.reasonDetails = reasonDetails;
    return this;
  }

  /**
   * Required. One or more reasons why this playable location is considered bad.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReasons() {
    return reasons;
  }

  /**
   * Required. One or more reasons why this playable location is considered bad.
   * @param reasons reasons or {@code null} for none
   */
  public GoogleMapsPlayablelocationsV3PlayerReport setReasons(java.util.List<java.lang.String> reasons) {
    this.reasons = reasons;
    return this;
  }

  @Override
  public GoogleMapsPlayablelocationsV3PlayerReport set(String fieldName, Object value) {
    return (GoogleMapsPlayablelocationsV3PlayerReport) super.set(fieldName, value);
  }

  @Override
  public GoogleMapsPlayablelocationsV3PlayerReport clone() {
    return (GoogleMapsPlayablelocationsV3PlayerReport) super.clone();
  }

}
