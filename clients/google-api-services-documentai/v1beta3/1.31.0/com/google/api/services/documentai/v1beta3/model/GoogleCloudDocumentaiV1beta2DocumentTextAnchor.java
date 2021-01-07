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

package com.google.api.services.documentai.v1beta3.model;

/**
 * Text reference indexing into the Document.text.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1beta2DocumentTextAnchor extends com.google.api.client.json.GenericJson {

  /**
   * Contains the content of the text span so that users do not have to look it up in the
   * text_segments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * The text segments from the Document.text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta2DocumentTextAnchorTextSegment> textSegments;

  /**
   * Contains the content of the text span so that users do not have to look it up in the
   * text_segments.
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * Contains the content of the text span so that users do not have to look it up in the
   * text_segments.
   * @param content content or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentTextAnchor setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * The text segments from the Document.text.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta2DocumentTextAnchorTextSegment> getTextSegments() {
    return textSegments;
  }

  /**
   * The text segments from the Document.text.
   * @param textSegments textSegments or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentTextAnchor setTextSegments(java.util.List<GoogleCloudDocumentaiV1beta2DocumentTextAnchorTextSegment> textSegments) {
    this.textSegments = textSegments;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentTextAnchor set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta2DocumentTextAnchor) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentTextAnchor clone() {
    return (GoogleCloudDocumentaiV1beta2DocumentTextAnchor) super.clone();
  }

}
