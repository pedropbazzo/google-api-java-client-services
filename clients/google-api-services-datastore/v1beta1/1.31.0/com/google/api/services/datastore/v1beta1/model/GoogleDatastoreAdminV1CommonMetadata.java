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

package com.google.api.services.datastore.v1beta1.model;

/**
 * Metadata common to all Datastore Admin operations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Datastore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDatastoreAdminV1CommonMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The time the operation ended, either successfully or otherwise.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * The client-assigned labels which were provided when the operation was created. May also include
   * additional labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The type of the operation. Can be used as a filter in ListOperationsRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationType;

  /**
   * The time that work began on the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * The current state of the Operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The time the operation ended, either successfully or otherwise.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The time the operation ended, either successfully or otherwise.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleDatastoreAdminV1CommonMetadata setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * The client-assigned labels which were provided when the operation was created. May also include
   * additional labels.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The client-assigned labels which were provided when the operation was created. May also include
   * additional labels.
   * @param labels labels or {@code null} for none
   */
  public GoogleDatastoreAdminV1CommonMetadata setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The type of the operation. Can be used as a filter in ListOperationsRequest.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationType() {
    return operationType;
  }

  /**
   * The type of the operation. Can be used as a filter in ListOperationsRequest.
   * @param operationType operationType or {@code null} for none
   */
  public GoogleDatastoreAdminV1CommonMetadata setOperationType(java.lang.String operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * The time that work began on the operation.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * The time that work began on the operation.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleDatastoreAdminV1CommonMetadata setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The current state of the Operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The current state of the Operation.
   * @param state state or {@code null} for none
   */
  public GoogleDatastoreAdminV1CommonMetadata setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleDatastoreAdminV1CommonMetadata set(String fieldName, Object value) {
    return (GoogleDatastoreAdminV1CommonMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleDatastoreAdminV1CommonMetadata clone() {
    return (GoogleDatastoreAdminV1CommonMetadata) super.clone();
  }

}
