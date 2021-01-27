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

package com.google.api.services.retail.v2alpha.model;

/**
 * Google Cloud Storage location for input content. format.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaGcsSource extends com.google.api.client.json.GenericJson {

  /**
   * The schema to use when parsing the data from the source. Supported values for product imports:
   * * `product` (default): One JSON Product per line. Each product must have a valid Product.id. *
   * `product_merchant_center`: See [Importing catalog data from Merchant
   * Center](https://cloud.google.com/retail/recommendations-ai/docs/upload-catalog#mcc). Supported
   * values for user events imports: * `user_event` (default): One JSON UserEvent per line. *
   * `user_event_ga360`: Using https://support.google.com/analytics/answer/3437719?hl=en.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataSchema;

  /**
   * Required. Google Cloud Storage URIs to input files. URI can be up to 2000 characters long. URIs
   * can match the full object path (for example, `gs://bucket/directory/object.json`) or a pattern
   * matching one or more files, such as `gs://bucket/directory.json`. A request can contain at most
   * 100 files, and each file can be up to 2 GB. See [Importing product
   * information](https://cloud.google.com/recommendations-ai/docs/upload-catalog) for the expected
   * file format and setup instructions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> inputUris;

  /**
   * The schema to use when parsing the data from the source. Supported values for product imports:
   * * `product` (default): One JSON Product per line. Each product must have a valid Product.id. *
   * `product_merchant_center`: See [Importing catalog data from Merchant
   * Center](https://cloud.google.com/retail/recommendations-ai/docs/upload-catalog#mcc). Supported
   * values for user events imports: * `user_event` (default): One JSON UserEvent per line. *
   * `user_event_ga360`: Using https://support.google.com/analytics/answer/3437719?hl=en.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataSchema() {
    return dataSchema;
  }

  /**
   * The schema to use when parsing the data from the source. Supported values for product imports:
   * * `product` (default): One JSON Product per line. Each product must have a valid Product.id. *
   * `product_merchant_center`: See [Importing catalog data from Merchant
   * Center](https://cloud.google.com/retail/recommendations-ai/docs/upload-catalog#mcc). Supported
   * values for user events imports: * `user_event` (default): One JSON UserEvent per line. *
   * `user_event_ga360`: Using https://support.google.com/analytics/answer/3437719?hl=en.
   * @param dataSchema dataSchema or {@code null} for none
   */
  public GoogleCloudRetailV2alphaGcsSource setDataSchema(java.lang.String dataSchema) {
    this.dataSchema = dataSchema;
    return this;
  }

  /**
   * Required. Google Cloud Storage URIs to input files. URI can be up to 2000 characters long. URIs
   * can match the full object path (for example, `gs://bucket/directory/object.json`) or a pattern
   * matching one or more files, such as `gs://bucket/directory.json`. A request can contain at most
   * 100 files, and each file can be up to 2 GB. See [Importing product
   * information](https://cloud.google.com/recommendations-ai/docs/upload-catalog) for the expected
   * file format and setup instructions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInputUris() {
    return inputUris;
  }

  /**
   * Required. Google Cloud Storage URIs to input files. URI can be up to 2000 characters long. URIs
   * can match the full object path (for example, `gs://bucket/directory/object.json`) or a pattern
   * matching one or more files, such as `gs://bucket/directory.json`. A request can contain at most
   * 100 files, and each file can be up to 2 GB. See [Importing product
   * information](https://cloud.google.com/recommendations-ai/docs/upload-catalog) for the expected
   * file format and setup instructions.
   * @param inputUris inputUris or {@code null} for none
   */
  public GoogleCloudRetailV2alphaGcsSource setInputUris(java.util.List<java.lang.String> inputUris) {
    this.inputUris = inputUris;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaGcsSource set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaGcsSource) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaGcsSource clone() {
    return (GoogleCloudRetailV2alphaGcsSource) super.clone();
  }

}
