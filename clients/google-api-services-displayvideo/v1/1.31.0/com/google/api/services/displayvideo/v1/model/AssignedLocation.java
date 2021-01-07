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

package com.google.api.services.displayvideo.v1.model;

/**
 * An assignment between a location list and a relevant targeting option. Currently, geo region
 * targeting options are the only supported option for assignment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssignedLocation extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The unique ID of the assigned location. The ID is only unique within a location
   * list. It may be reused in other contexts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long assignedLocationId;

  /**
   * Output only. The resource name of the assigned location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The ID of the targeting option assigned to the location list. Must be of type
   * TARGETING_TYPE_GEO_REGION.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetingOptionId;

  /**
   * Output only. The unique ID of the assigned location. The ID is only unique within a location
   * list. It may be reused in other contexts.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAssignedLocationId() {
    return assignedLocationId;
  }

  /**
   * Output only. The unique ID of the assigned location. The ID is only unique within a location
   * list. It may be reused in other contexts.
   * @param assignedLocationId assignedLocationId or {@code null} for none
   */
  public AssignedLocation setAssignedLocationId(java.lang.Long assignedLocationId) {
    this.assignedLocationId = assignedLocationId;
    return this;
  }

  /**
   * Output only. The resource name of the assigned location.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The resource name of the assigned location.
   * @param name name or {@code null} for none
   */
  public AssignedLocation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The ID of the targeting option assigned to the location list. Must be of type
   * TARGETING_TYPE_GEO_REGION.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetingOptionId() {
    return targetingOptionId;
  }

  /**
   * Required. The ID of the targeting option assigned to the location list. Must be of type
   * TARGETING_TYPE_GEO_REGION.
   * @param targetingOptionId targetingOptionId or {@code null} for none
   */
  public AssignedLocation setTargetingOptionId(java.lang.String targetingOptionId) {
    this.targetingOptionId = targetingOptionId;
    return this;
  }

  @Override
  public AssignedLocation set(String fieldName, Object value) {
    return (AssignedLocation) super.set(fieldName, value);
  }

  @Override
  public AssignedLocation clone() {
    return (AssignedLocation) super.clone();
  }

}
