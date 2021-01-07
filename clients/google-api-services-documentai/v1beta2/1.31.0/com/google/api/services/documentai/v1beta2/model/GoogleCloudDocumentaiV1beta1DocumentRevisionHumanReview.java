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

package com.google.api.services.documentai.v1beta2.model;

/**
 * Human Review information of the document.
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
public final class GoogleCloudDocumentaiV1beta1DocumentRevisionHumanReview extends com.google.api.client.json.GenericJson {

  /**
   * Human review state. e.g. `requested`, `succeeded`, `rejected`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * A message providing more details about the current state of processing. For example, the
   * rejection reason when the state is `rejected`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stateMessage;

  /**
   * Human review state. e.g. `requested`, `succeeded`, `rejected`.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Human review state. e.g. `requested`, `succeeded`, `rejected`.
   * @param state state or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta1DocumentRevisionHumanReview setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * A message providing more details about the current state of processing. For example, the
   * rejection reason when the state is `rejected`.
   * @return value or {@code null} for none
   */
  public java.lang.String getStateMessage() {
    return stateMessage;
  }

  /**
   * A message providing more details about the current state of processing. For example, the
   * rejection reason when the state is `rejected`.
   * @param stateMessage stateMessage or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta1DocumentRevisionHumanReview setStateMessage(java.lang.String stateMessage) {
    this.stateMessage = stateMessage;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta1DocumentRevisionHumanReview set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta1DocumentRevisionHumanReview) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta1DocumentRevisionHumanReview clone() {
    return (GoogleCloudDocumentaiV1beta1DocumentRevisionHumanReview) super.clone();
  }

}
