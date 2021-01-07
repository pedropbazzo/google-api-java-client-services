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

package com.google.api.services.datalabeling.v1beta1.model;

/**
 * An AnnotationSpecSet is a collection of label definitions. For example, in image classification
 * tasks, you define a set of possible labels for images as an AnnotationSpecSet. An
 * AnnotationSpecSet is immutable upon creation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Data Labeling API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatalabelingV1beta1AnnotationSpecSet extends com.google.api.client.json.GenericJson {

  /**
   * Required. The array of AnnotationSpecs that you define when you create the AnnotationSpecSet.
   * These are the possible labels for the labeling task.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDatalabelingV1beta1AnnotationSpec> annotationSpecs;

  static {
    // hack to force ProGuard to consider GoogleCloudDatalabelingV1beta1AnnotationSpec used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDatalabelingV1beta1AnnotationSpec.class);
  }

  /**
   * Output only. The names of any related resources that are blocking changes to the annotation
   * spec set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> blockingResources;

  /**
   * Optional. User-provided description of the annotation specification set. The description can be
   * up to 10,000 characters long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. The display name for AnnotationSpecSet that you define when you create it. Maximum of
   * 64 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. The AnnotationSpecSet resource name in the following format:
   * "projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The array of AnnotationSpecs that you define when you create the AnnotationSpecSet.
   * These are the possible labels for the labeling task.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDatalabelingV1beta1AnnotationSpec> getAnnotationSpecs() {
    return annotationSpecs;
  }

  /**
   * Required. The array of AnnotationSpecs that you define when you create the AnnotationSpecSet.
   * These are the possible labels for the labeling task.
   * @param annotationSpecs annotationSpecs or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1AnnotationSpecSet setAnnotationSpecs(java.util.List<GoogleCloudDatalabelingV1beta1AnnotationSpec> annotationSpecs) {
    this.annotationSpecs = annotationSpecs;
    return this;
  }

  /**
   * Output only. The names of any related resources that are blocking changes to the annotation
   * spec set.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getBlockingResources() {
    return blockingResources;
  }

  /**
   * Output only. The names of any related resources that are blocking changes to the annotation
   * spec set.
   * @param blockingResources blockingResources or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1AnnotationSpecSet setBlockingResources(java.util.List<java.lang.String> blockingResources) {
    this.blockingResources = blockingResources;
    return this;
  }

  /**
   * Optional. User-provided description of the annotation specification set. The description can be
   * up to 10,000 characters long.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. User-provided description of the annotation specification set. The description can be
   * up to 10,000 characters long.
   * @param description description or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1AnnotationSpecSet setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. The display name for AnnotationSpecSet that you define when you create it. Maximum of
   * 64 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The display name for AnnotationSpecSet that you define when you create it. Maximum of
   * 64 characters.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1AnnotationSpecSet setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. The AnnotationSpecSet resource name in the following format:
   * "projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}"
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The AnnotationSpecSet resource name in the following format:
   * "projects/{project_id}/annotationSpecSets/{annotation_spec_set_id}"
   * @param name name or {@code null} for none
   */
  public GoogleCloudDatalabelingV1beta1AnnotationSpecSet setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleCloudDatalabelingV1beta1AnnotationSpecSet set(String fieldName, Object value) {
    return (GoogleCloudDatalabelingV1beta1AnnotationSpecSet) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatalabelingV1beta1AnnotationSpecSet clone() {
    return (GoogleCloudDatalabelingV1beta1AnnotationSpecSet) super.clone();
  }

}
