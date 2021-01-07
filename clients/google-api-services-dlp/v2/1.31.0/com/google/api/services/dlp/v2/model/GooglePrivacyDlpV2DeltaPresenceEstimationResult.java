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

package com.google.api.services.dlp.v2.model;

/**
 * Result of the δ-presence computation. Note that these results are an estimation, not exact
 * values.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2DeltaPresenceEstimationResult extends com.google.api.client.json.GenericJson {

  /**
   * The intervals [min_probability, max_probability) do not overlap. If a value doesn't correspond
   * to any such interval, the associated frequency is zero. For example, the following records:
   * {min_probability: 0, max_probability: 0.1, frequency: 17} {min_probability: 0.2,
   * max_probability: 0.3, frequency: 42} {min_probability: 0.3, max_probability: 0.4, frequency:
   * 99} mean that there are no record with an estimated probability in [0.1, 0.2) nor larger or
   * equal to 0.4.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket> deltaPresenceEstimationHistogram;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket.class);
  }

  /**
   * The intervals [min_probability, max_probability) do not overlap. If a value doesn't correspond
   * to any such interval, the associated frequency is zero. For example, the following records:
   * {min_probability: 0, max_probability: 0.1, frequency: 17} {min_probability: 0.2,
   * max_probability: 0.3, frequency: 42} {min_probability: 0.3, max_probability: 0.4, frequency:
   * 99} mean that there are no record with an estimated probability in [0.1, 0.2) nor larger or
   * equal to 0.4.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket> getDeltaPresenceEstimationHistogram() {
    return deltaPresenceEstimationHistogram;
  }

  /**
   * The intervals [min_probability, max_probability) do not overlap. If a value doesn't correspond
   * to any such interval, the associated frequency is zero. For example, the following records:
   * {min_probability: 0, max_probability: 0.1, frequency: 17} {min_probability: 0.2,
   * max_probability: 0.3, frequency: 42} {min_probability: 0.3, max_probability: 0.4, frequency:
   * 99} mean that there are no record with an estimated probability in [0.1, 0.2) nor larger or
   * equal to 0.4.
   * @param deltaPresenceEstimationHistogram deltaPresenceEstimationHistogram or {@code null} for none
   */
  public GooglePrivacyDlpV2DeltaPresenceEstimationResult setDeltaPresenceEstimationHistogram(java.util.List<GooglePrivacyDlpV2DeltaPresenceEstimationHistogramBucket> deltaPresenceEstimationHistogram) {
    this.deltaPresenceEstimationHistogram = deltaPresenceEstimationHistogram;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2DeltaPresenceEstimationResult set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2DeltaPresenceEstimationResult) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2DeltaPresenceEstimationResult clone() {
    return (GooglePrivacyDlpV2DeltaPresenceEstimationResult) super.clone();
  }

}
