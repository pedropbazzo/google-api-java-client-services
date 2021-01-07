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

package com.google.api.services.recommender.v1.model;

/**
 * Request for the `MarkRecommendationClaimed` Method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Recommender API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecommenderV1MarkRecommendationClaimedRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. Fingerprint of the Recommendation. Provides optimistic locking.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * State properties to include with this state. Overwrites any existing `state_metadata`. Keys
   * must match the regex /^a-z0-9{0,62}$/. Values must match the regex /^[a-zA-Z0-9_./-]{0,255}$/.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> stateMetadata;

  /**
   * Required. Fingerprint of the Recommendation. Provides optimistic locking.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Required. Fingerprint of the Recommendation. Provides optimistic locking.
   * @param etag etag or {@code null} for none
   */
  public GoogleCloudRecommenderV1MarkRecommendationClaimedRequest setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * State properties to include with this state. Overwrites any existing `state_metadata`. Keys
   * must match the regex /^a-z0-9{0,62}$/. Values must match the regex /^[a-zA-Z0-9_./-]{0,255}$/.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getStateMetadata() {
    return stateMetadata;
  }

  /**
   * State properties to include with this state. Overwrites any existing `state_metadata`. Keys
   * must match the regex /^a-z0-9{0,62}$/. Values must match the regex /^[a-zA-Z0-9_./-]{0,255}$/.
   * @param stateMetadata stateMetadata or {@code null} for none
   */
  public GoogleCloudRecommenderV1MarkRecommendationClaimedRequest setStateMetadata(java.util.Map<String, java.lang.String> stateMetadata) {
    this.stateMetadata = stateMetadata;
    return this;
  }

  @Override
  public GoogleCloudRecommenderV1MarkRecommendationClaimedRequest set(String fieldName, Object value) {
    return (GoogleCloudRecommenderV1MarkRecommendationClaimedRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecommenderV1MarkRecommendationClaimedRequest clone() {
    return (GoogleCloudRecommenderV1MarkRecommendationClaimedRequest) super.clone();
  }

}
