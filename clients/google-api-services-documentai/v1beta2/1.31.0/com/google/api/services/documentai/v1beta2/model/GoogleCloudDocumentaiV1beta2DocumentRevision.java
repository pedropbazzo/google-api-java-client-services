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
 * Contains past or forward revisions of this document.
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
public final class GoogleCloudDocumentaiV1beta2DocumentRevision extends com.google.api.client.json.GenericJson {

  /**
   * If the change was made by a person specify the name or id of that person.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String agent;

  /**
   * The time that the revision was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Human Review information of this revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1beta2DocumentRevisionHumanReview humanReview;

  /**
   * Id of the revision. Unique within the context of the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The revisions that this revision is based on. This can include one or more parent (when
   * documents are merged.) This field represents the index into the `revisions` field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> parent;

  /**
   * If the annotation was made by processor identify the processor by its resource name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String processor;

  /**
   * If the change was made by a person specify the name or id of that person.
   * @return value or {@code null} for none
   */
  public java.lang.String getAgent() {
    return agent;
  }

  /**
   * If the change was made by a person specify the name or id of that person.
   * @param agent agent or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentRevision setAgent(java.lang.String agent) {
    this.agent = agent;
    return this;
  }

  /**
   * The time that the revision was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time that the revision was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentRevision setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Human Review information of this revision.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentRevisionHumanReview getHumanReview() {
    return humanReview;
  }

  /**
   * Human Review information of this revision.
   * @param humanReview humanReview or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentRevision setHumanReview(GoogleCloudDocumentaiV1beta2DocumentRevisionHumanReview humanReview) {
    this.humanReview = humanReview;
    return this;
  }

  /**
   * Id of the revision. Unique within the context of the document.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Id of the revision. Unique within the context of the document.
   * @param id id or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentRevision setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The revisions that this revision is based on. This can include one or more parent (when
   * documents are merged.) This field represents the index into the `revisions` field.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getParent() {
    return parent;
  }

  /**
   * The revisions that this revision is based on. This can include one or more parent (when
   * documents are merged.) This field represents the index into the `revisions` field.
   * @param parent parent or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentRevision setParent(java.util.List<java.lang.Integer> parent) {
    this.parent = parent;
    return this;
  }

  /**
   * If the annotation was made by processor identify the processor by its resource name.
   * @return value or {@code null} for none
   */
  public java.lang.String getProcessor() {
    return processor;
  }

  /**
   * If the annotation was made by processor identify the processor by its resource name.
   * @param processor processor or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta2DocumentRevision setProcessor(java.lang.String processor) {
    this.processor = processor;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentRevision set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta2DocumentRevision) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta2DocumentRevision clone() {
    return (GoogleCloudDocumentaiV1beta2DocumentRevision) super.clone();
  }

}
