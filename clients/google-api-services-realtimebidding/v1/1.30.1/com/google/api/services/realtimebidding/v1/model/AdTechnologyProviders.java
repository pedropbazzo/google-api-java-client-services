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

package com.google.api.services.realtimebidding.v1.model;

/**
 * Detected ad technology provider information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Real-time Bidding API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdTechnologyProviders extends com.google.api.client.json.GenericJson {

  /**
   * The detected ad technology provider IDs for this creative. See https://storage.googleapis.com
   * /adx-rtb-dictionaries/providers.csv for mapping of provider ID to provided name, a privacy
   * policy URL, and a list of domains which can be attributed to the provider. If the creative
   * contains provider IDs that are outside of those listed in the
   * `BidRequest.adslot.consented_providers_settings.consented_providers` field on the [Google bid
   * protocol](https://developers.google.com/authorized-buyers/rtb/downloads/realtime-bidding-proto)
   * and the `BidRequest.user.ext.consented_providers_settings.consented_providers` field on the
   * [OpenRTB protocol](https://developers.google.com/authorized-buyers/rtb/downloads/openrtb-adx-
   * proto), and a bid is submitted with that creative for an impression that will serve to an EEA
   * user, the bid will be filtered before the auction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> detectedProviderIds;

  /**
   * Whether the creative contains an unidentified ad technology provider. If true for a given
   * creative, any bid submitted with that creative for an impression that will serve to an EEA user
   * will be filtered before the auction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasUnidentifiedProvider;

  /**
   * The detected ad technology provider IDs for this creative. See https://storage.googleapis.com
   * /adx-rtb-dictionaries/providers.csv for mapping of provider ID to provided name, a privacy
   * policy URL, and a list of domains which can be attributed to the provider. If the creative
   * contains provider IDs that are outside of those listed in the
   * `BidRequest.adslot.consented_providers_settings.consented_providers` field on the [Google bid
   * protocol](https://developers.google.com/authorized-buyers/rtb/downloads/realtime-bidding-proto)
   * and the `BidRequest.user.ext.consented_providers_settings.consented_providers` field on the
   * [OpenRTB protocol](https://developers.google.com/authorized-buyers/rtb/downloads/openrtb-adx-
   * proto), and a bid is submitted with that creative for an impression that will serve to an EEA
   * user, the bid will be filtered before the auction.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getDetectedProviderIds() {
    return detectedProviderIds;
  }

  /**
   * The detected ad technology provider IDs for this creative. See https://storage.googleapis.com
   * /adx-rtb-dictionaries/providers.csv for mapping of provider ID to provided name, a privacy
   * policy URL, and a list of domains which can be attributed to the provider. If the creative
   * contains provider IDs that are outside of those listed in the
   * `BidRequest.adslot.consented_providers_settings.consented_providers` field on the [Google bid
   * protocol](https://developers.google.com/authorized-buyers/rtb/downloads/realtime-bidding-proto)
   * and the `BidRequest.user.ext.consented_providers_settings.consented_providers` field on the
   * [OpenRTB protocol](https://developers.google.com/authorized-buyers/rtb/downloads/openrtb-adx-
   * proto), and a bid is submitted with that creative for an impression that will serve to an EEA
   * user, the bid will be filtered before the auction.
   * @param detectedProviderIds detectedProviderIds or {@code null} for none
   */
  public AdTechnologyProviders setDetectedProviderIds(java.util.List<java.lang.Long> detectedProviderIds) {
    this.detectedProviderIds = detectedProviderIds;
    return this;
  }

  /**
   * Whether the creative contains an unidentified ad technology provider. If true for a given
   * creative, any bid submitted with that creative for an impression that will serve to an EEA user
   * will be filtered before the auction.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasUnidentifiedProvider() {
    return hasUnidentifiedProvider;
  }

  /**
   * Whether the creative contains an unidentified ad technology provider. If true for a given
   * creative, any bid submitted with that creative for an impression that will serve to an EEA user
   * will be filtered before the auction.
   * @param hasUnidentifiedProvider hasUnidentifiedProvider or {@code null} for none
   */
  public AdTechnologyProviders setHasUnidentifiedProvider(java.lang.Boolean hasUnidentifiedProvider) {
    this.hasUnidentifiedProvider = hasUnidentifiedProvider;
    return this;
  }

  @Override
  public AdTechnologyProviders set(String fieldName, Object value) {
    return (AdTechnologyProviders) super.set(fieldName, value);
  }

  @Override
  public AdTechnologyProviders clone() {
    return (AdTechnologyProviders) super.clone();
  }

}
