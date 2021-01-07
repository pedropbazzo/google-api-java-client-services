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

package com.google.api.services.recommendationengine.v1beta1.model;

/**
 * Google Cloud Storage location for input content. format.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Recommendations AI. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecommendationengineV1beta1GcsSource extends com.google.api.client.json.GenericJson {

  /**
   * Required. Google Cloud Storage URIs to input files. URI can be up to 2000 characters long. URIs
   * can match the full object path (for example, gs://bucket/directory/object.json) or a pattern
   * matching one or more files, such as gs://bucket/directory.json. A request can contain at most
   * 100 files, and each file can be up to 2 GB. See [Importing catalog information
   * ](/recommendations-ai/docs/upload-catalog) for the expected file format and setup instructions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> inputUris;

  /**
   * Optional. The schema to use when parsing the data from the source. Supported values for catalog
   * imports: 1: "catalog_recommendations_ai" using https://cloud.google.com/recommendations-ai/docs
   * /upload-catalog#json (Default for catalogItems.import) 2: "catalog_merchant_center" using
   * https://cloud.google.com/recommendations-ai/docs/upload-catalog#mc Supported values for user
   * events imports: 1: "user_events_recommendations_ai" using https://cloud.google.com
   * /recommendations-ai/docs/manage-user-events#import (Default for userEvents.import) 2.
   * "user_events_ga360" using https://support.google.com/analytics/answer/3437719?hl=en
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jsonSchema;

  /**
   * Required. Google Cloud Storage URIs to input files. URI can be up to 2000 characters long. URIs
   * can match the full object path (for example, gs://bucket/directory/object.json) or a pattern
   * matching one or more files, such as gs://bucket/directory.json. A request can contain at most
   * 100 files, and each file can be up to 2 GB. See [Importing catalog information
   * ](/recommendations-ai/docs/upload-catalog) for the expected file format and setup instructions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInputUris() {
    return inputUris;
  }

  /**
   * Required. Google Cloud Storage URIs to input files. URI can be up to 2000 characters long. URIs
   * can match the full object path (for example, gs://bucket/directory/object.json) or a pattern
   * matching one or more files, such as gs://bucket/directory.json. A request can contain at most
   * 100 files, and each file can be up to 2 GB. See [Importing catalog information
   * ](/recommendations-ai/docs/upload-catalog) for the expected file format and setup instructions.
   * @param inputUris inputUris or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1GcsSource setInputUris(java.util.List<java.lang.String> inputUris) {
    this.inputUris = inputUris;
    return this;
  }

  /**
   * Optional. The schema to use when parsing the data from the source. Supported values for catalog
   * imports: 1: "catalog_recommendations_ai" using https://cloud.google.com/recommendations-ai/docs
   * /upload-catalog#json (Default for catalogItems.import) 2: "catalog_merchant_center" using
   * https://cloud.google.com/recommendations-ai/docs/upload-catalog#mc Supported values for user
   * events imports: 1: "user_events_recommendations_ai" using https://cloud.google.com
   * /recommendations-ai/docs/manage-user-events#import (Default for userEvents.import) 2.
   * "user_events_ga360" using https://support.google.com/analytics/answer/3437719?hl=en
   * @return value or {@code null} for none
   */
  public java.lang.String getJsonSchema() {
    return jsonSchema;
  }

  /**
   * Optional. The schema to use when parsing the data from the source. Supported values for catalog
   * imports: 1: "catalog_recommendations_ai" using https://cloud.google.com/recommendations-ai/docs
   * /upload-catalog#json (Default for catalogItems.import) 2: "catalog_merchant_center" using
   * https://cloud.google.com/recommendations-ai/docs/upload-catalog#mc Supported values for user
   * events imports: 1: "user_events_recommendations_ai" using https://cloud.google.com
   * /recommendations-ai/docs/manage-user-events#import (Default for userEvents.import) 2.
   * "user_events_ga360" using https://support.google.com/analytics/answer/3437719?hl=en
   * @param jsonSchema jsonSchema or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1GcsSource setJsonSchema(java.lang.String jsonSchema) {
    this.jsonSchema = jsonSchema;
    return this;
  }

  @Override
  public GoogleCloudRecommendationengineV1beta1GcsSource set(String fieldName, Object value) {
    return (GoogleCloudRecommendationengineV1beta1GcsSource) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecommendationengineV1beta1GcsSource clone() {
    return (GoogleCloudRecommendationengineV1beta1GcsSource) super.clone();
  }

}
