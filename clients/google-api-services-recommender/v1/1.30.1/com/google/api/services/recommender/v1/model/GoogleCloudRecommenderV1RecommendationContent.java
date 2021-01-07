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
 * Contains what resources are changing and how they are changing.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Recommender API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecommenderV1RecommendationContent extends com.google.api.client.json.GenericJson {

  /**
   * Operations to one or more Google Cloud resources grouped in such a way that, all operations
   * within one group are expected to be performed atomically and in an order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRecommenderV1OperationGroup> operationGroups;

  static {
    // hack to force ProGuard to consider GoogleCloudRecommenderV1OperationGroup used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRecommenderV1OperationGroup.class);
  }

  /**
   * Operations to one or more Google Cloud resources grouped in such a way that, all operations
   * within one group are expected to be performed atomically and in an order.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRecommenderV1OperationGroup> getOperationGroups() {
    return operationGroups;
  }

  /**
   * Operations to one or more Google Cloud resources grouped in such a way that, all operations
   * within one group are expected to be performed atomically and in an order.
   * @param operationGroups operationGroups or {@code null} for none
   */
  public GoogleCloudRecommenderV1RecommendationContent setOperationGroups(java.util.List<GoogleCloudRecommenderV1OperationGroup> operationGroups) {
    this.operationGroups = operationGroups;
    return this;
  }

  @Override
  public GoogleCloudRecommenderV1RecommendationContent set(String fieldName, Object value) {
    return (GoogleCloudRecommenderV1RecommendationContent) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecommenderV1RecommendationContent clone() {
    return (GoogleCloudRecommenderV1RecommendationContent) super.clone();
  }

}
