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

package com.google.api.services.vision.v1p1beta1.model;

/**
 * Response to a single file annotation request. A file may contain one or more images, which
 * individually have their own responses.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AnnotateFileResponse extends com.google.api.client.json.GenericJson {

  /**
   * If set, represents the error message for the failed request. The `responses` field will not be
   * set in this case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status error;

  /**
   * Information about the file for which this response is generated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InputConfig inputConfig;

  /**
   * Individual responses to images found within the file. This field will be empty if the `error`
   * field is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AnnotateImageResponse> responses;

  /**
   * This field gives the total number of pages in the file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalPages;

  /**
   * If set, represents the error message for the failed request. The `responses` field will not be
   * set in this case.
   * @return value or {@code null} for none
   */
  public Status getError() {
    return error;
  }

  /**
   * If set, represents the error message for the failed request. The `responses` field will not be
   * set in this case.
   * @param error error or {@code null} for none
   */
  public AnnotateFileResponse setError(Status error) {
    this.error = error;
    return this;
  }

  /**
   * Information about the file for which this response is generated.
   * @return value or {@code null} for none
   */
  public InputConfig getInputConfig() {
    return inputConfig;
  }

  /**
   * Information about the file for which this response is generated.
   * @param inputConfig inputConfig or {@code null} for none
   */
  public AnnotateFileResponse setInputConfig(InputConfig inputConfig) {
    this.inputConfig = inputConfig;
    return this;
  }

  /**
   * Individual responses to images found within the file. This field will be empty if the `error`
   * field is set.
   * @return value or {@code null} for none
   */
  public java.util.List<AnnotateImageResponse> getResponses() {
    return responses;
  }

  /**
   * Individual responses to images found within the file. This field will be empty if the `error`
   * field is set.
   * @param responses responses or {@code null} for none
   */
  public AnnotateFileResponse setResponses(java.util.List<AnnotateImageResponse> responses) {
    this.responses = responses;
    return this;
  }

  /**
   * This field gives the total number of pages in the file.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalPages() {
    return totalPages;
  }

  /**
   * This field gives the total number of pages in the file.
   * @param totalPages totalPages or {@code null} for none
   */
  public AnnotateFileResponse setTotalPages(java.lang.Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  @Override
  public AnnotateFileResponse set(String fieldName, Object value) {
    return (AnnotateFileResponse) super.set(fieldName, value);
  }

  @Override
  public AnnotateFileResponse clone() {
    return (AnnotateFileResponse) super.clone();
  }

}
