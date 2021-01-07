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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Options for text properties.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TextPropertyOptions extends com.google.api.client.json.GenericJson {

  /**
   * If set, describes how the property should be used as a search operator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextOperatorOptions operatorOptions;

  /**
   * Indicates the search quality importance of the tokens within the field when used for retrieval.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RetrievalImportance retrievalImportance;

  /**
   * If set, describes how the property should be used as a search operator.
   * @return value or {@code null} for none
   */
  public TextOperatorOptions getOperatorOptions() {
    return operatorOptions;
  }

  /**
   * If set, describes how the property should be used as a search operator.
   * @param operatorOptions operatorOptions or {@code null} for none
   */
  public TextPropertyOptions setOperatorOptions(TextOperatorOptions operatorOptions) {
    this.operatorOptions = operatorOptions;
    return this;
  }

  /**
   * Indicates the search quality importance of the tokens within the field when used for retrieval.
   * @return value or {@code null} for none
   */
  public RetrievalImportance getRetrievalImportance() {
    return retrievalImportance;
  }

  /**
   * Indicates the search quality importance of the tokens within the field when used for retrieval.
   * @param retrievalImportance retrievalImportance or {@code null} for none
   */
  public TextPropertyOptions setRetrievalImportance(RetrievalImportance retrievalImportance) {
    this.retrievalImportance = retrievalImportance;
    return this;
  }

  @Override
  public TextPropertyOptions set(String fieldName, Object value) {
    return (TextPropertyOptions) super.set(fieldName, value);
  }

  @Override
  public TextPropertyOptions clone() {
    return (TextPropertyOptions) super.clone();
  }

}
