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
 * The long running operation metadata for DeleteLabelerPool.
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
public final class GoogleCloudDocumentaiUiv1beta3DeleteLabelerPoolOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The creation time of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Used only when Operation.done is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * A message providing more details about the current state of processing. For example, the error
   * message if the operation is failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stateMessage;

  /**
   * The last update time of the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The creation time of the operation.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The creation time of the operation.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDocumentaiUiv1beta3DeleteLabelerPoolOperationMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Used only when Operation.done is false.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Used only when Operation.done is false.
   * @param state state or {@code null} for none
   */
  public GoogleCloudDocumentaiUiv1beta3DeleteLabelerPoolOperationMetadata setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * A message providing more details about the current state of processing. For example, the error
   * message if the operation is failed.
   * @return value or {@code null} for none
   */
  public java.lang.String getStateMessage() {
    return stateMessage;
  }

  /**
   * A message providing more details about the current state of processing. For example, the error
   * message if the operation is failed.
   * @param stateMessage stateMessage or {@code null} for none
   */
  public GoogleCloudDocumentaiUiv1beta3DeleteLabelerPoolOperationMetadata setStateMessage(java.lang.String stateMessage) {
    this.stateMessage = stateMessage;
    return this;
  }

  /**
   * The last update time of the operation.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The last update time of the operation.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudDocumentaiUiv1beta3DeleteLabelerPoolOperationMetadata setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiUiv1beta3DeleteLabelerPoolOperationMetadata set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiUiv1beta3DeleteLabelerPoolOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiUiv1beta3DeleteLabelerPoolOperationMetadata clone() {
    return (GoogleCloudDocumentaiUiv1beta3DeleteLabelerPoolOperationMetadata) super.clone();
  }

}
