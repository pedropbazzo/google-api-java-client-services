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

package com.google.api.services.language.v1beta2.model;

/**
 * All available features for sentiment, syntax, and semantic analysis. Setting each one to true
 * will enable that specific analysis for the input. Next ID: 10
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Natural Language API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Features extends com.google.api.client.json.GenericJson {

  /**
   * Classify the full document into categories. If this is true, the API will use the default model
   * which classifies into a [predefined taxonomy](https://cloud.google.com/natural-
   * language/docs/categories).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean classifyText;

  /**
   * Extract document-level sentiment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean extractDocumentSentiment;

  /**
   * Extract entities.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean extractEntities;

  /**
   * Extract entities and their associated sentiment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean extractEntitySentiment;

  /**
   * Extract syntax information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean extractSyntax;

  /**
   * Classify the full document into categories. If this is true, the API will use the default model
   * which classifies into a [predefined taxonomy](https://cloud.google.com/natural-
   * language/docs/categories).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getClassifyText() {
    return classifyText;
  }

  /**
   * Classify the full document into categories. If this is true, the API will use the default model
   * which classifies into a [predefined taxonomy](https://cloud.google.com/natural-
   * language/docs/categories).
   * @param classifyText classifyText or {@code null} for none
   */
  public Features setClassifyText(java.lang.Boolean classifyText) {
    this.classifyText = classifyText;
    return this;
  }

  /**
   * Extract document-level sentiment.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExtractDocumentSentiment() {
    return extractDocumentSentiment;
  }

  /**
   * Extract document-level sentiment.
   * @param extractDocumentSentiment extractDocumentSentiment or {@code null} for none
   */
  public Features setExtractDocumentSentiment(java.lang.Boolean extractDocumentSentiment) {
    this.extractDocumentSentiment = extractDocumentSentiment;
    return this;
  }

  /**
   * Extract entities.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExtractEntities() {
    return extractEntities;
  }

  /**
   * Extract entities.
   * @param extractEntities extractEntities or {@code null} for none
   */
  public Features setExtractEntities(java.lang.Boolean extractEntities) {
    this.extractEntities = extractEntities;
    return this;
  }

  /**
   * Extract entities and their associated sentiment.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExtractEntitySentiment() {
    return extractEntitySentiment;
  }

  /**
   * Extract entities and their associated sentiment.
   * @param extractEntitySentiment extractEntitySentiment or {@code null} for none
   */
  public Features setExtractEntitySentiment(java.lang.Boolean extractEntitySentiment) {
    this.extractEntitySentiment = extractEntitySentiment;
    return this;
  }

  /**
   * Extract syntax information.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExtractSyntax() {
    return extractSyntax;
  }

  /**
   * Extract syntax information.
   * @param extractSyntax extractSyntax or {@code null} for none
   */
  public Features setExtractSyntax(java.lang.Boolean extractSyntax) {
    this.extractSyntax = extractSyntax;
    return this;
  }

  @Override
  public Features set(String fieldName, Object value) {
    return (Features) super.set(fieldName, value);
  }

  @Override
  public Features clone() {
    return (Features) super.clone();
  }

}
