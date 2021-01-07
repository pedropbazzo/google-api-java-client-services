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

package com.google.api.services.vision.v1.model;

/**
 * Metadata for the batch operations such as the current state. This is included in the `metadata`
 * field of the `Operation` returned by the `GetOperation` call of the
 * `google::longrunning::Operations` service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The time when the batch request is finished and google.longrunning.Operation.done is set to
   * true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * The current state of the batch operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The time when the batch request was submitted to the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String submitTime;

  /**
   * The time when the batch request is finished and google.longrunning.Operation.done is set to
   * true.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The time when the batch request is finished and google.longrunning.Operation.done is set to
   * true.
   * @param endTime endTime or {@code null} for none
   */
  public BatchOperationMetadata setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The current state of the batch operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The current state of the batch operation.
   * @param state state or {@code null} for none
   */
  public BatchOperationMetadata setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The time when the batch request was submitted to the server.
   * @return value or {@code null} for none
   */
  public String getSubmitTime() {
    return submitTime;
  }

  /**
   * The time when the batch request was submitted to the server.
   * @param submitTime submitTime or {@code null} for none
   */
  public BatchOperationMetadata setSubmitTime(String submitTime) {
    this.submitTime = submitTime;
    return this;
  }

  @Override
  public BatchOperationMetadata set(String fieldName, Object value) {
    return (BatchOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public BatchOperationMetadata clone() {
    return (BatchOperationMetadata) super.clone();
  }

}
