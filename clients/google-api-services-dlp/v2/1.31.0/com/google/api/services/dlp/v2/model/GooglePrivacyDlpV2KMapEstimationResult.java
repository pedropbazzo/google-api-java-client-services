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
 * Result of the reidentifiability analysis. Note that these results are an estimation, not exact
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
public final class GooglePrivacyDlpV2KMapEstimationResult extends com.google.api.client.json.GenericJson {

  /**
   * The intervals [min_anonymity, max_anonymity] do not overlap. If a value doesn't correspond to
   * any such interval, the associated frequency is zero. For example, the following records:
   * {min_anonymity: 1, max_anonymity: 1, frequency: 17} {min_anonymity: 2, max_anonymity: 3,
   * frequency: 42} {min_anonymity: 5, max_anonymity: 10, frequency: 99} mean that there are no
   * record with an estimated anonymity of 4, 5, or larger than 10.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2KMapEstimationHistogramBucket> kMapEstimationHistogram;

  static {
    // hack to force ProGuard to consider GooglePrivacyDlpV2KMapEstimationHistogramBucket used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GooglePrivacyDlpV2KMapEstimationHistogramBucket.class);
  }

  /**
   * The intervals [min_anonymity, max_anonymity] do not overlap. If a value doesn't correspond to
   * any such interval, the associated frequency is zero. For example, the following records:
   * {min_anonymity: 1, max_anonymity: 1, frequency: 17} {min_anonymity: 2, max_anonymity: 3,
   * frequency: 42} {min_anonymity: 5, max_anonymity: 10, frequency: 99} mean that there are no
   * record with an estimated anonymity of 4, 5, or larger than 10.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2KMapEstimationHistogramBucket> getKMapEstimationHistogram() {
    return kMapEstimationHistogram;
  }

  /**
   * The intervals [min_anonymity, max_anonymity] do not overlap. If a value doesn't correspond to
   * any such interval, the associated frequency is zero. For example, the following records:
   * {min_anonymity: 1, max_anonymity: 1, frequency: 17} {min_anonymity: 2, max_anonymity: 3,
   * frequency: 42} {min_anonymity: 5, max_anonymity: 10, frequency: 99} mean that there are no
   * record with an estimated anonymity of 4, 5, or larger than 10.
   * @param kMapEstimationHistogram kMapEstimationHistogram or {@code null} for none
   */
  public GooglePrivacyDlpV2KMapEstimationResult setKMapEstimationHistogram(java.util.List<GooglePrivacyDlpV2KMapEstimationHistogramBucket> kMapEstimationHistogram) {
    this.kMapEstimationHistogram = kMapEstimationHistogram;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2KMapEstimationResult set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2KMapEstimationResult) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2KMapEstimationResult clone() {
    return (GooglePrivacyDlpV2KMapEstimationResult) super.clone();
  }

}
