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

package com.google.api.services.firestore.v1.model;

/**
 * A Document has changed. May be the result of multiple writes, including deletes, that ultimately
 * resulted in a new value for the Document. Multiple DocumentChange messages may be returned for
 * the same logical change, if multiple targets are affected.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DocumentChange extends com.google.api.client.json.GenericJson {

  /**
   * The new state of the Document. If `mask` is set, contains only fields that were updated or
   * added.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Document document;

  /**
   * A set of target IDs for targets that no longer match this document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> removedTargetIds;

  /**
   * A set of target IDs of targets that match this document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> targetIds;

  /**
   * The new state of the Document. If `mask` is set, contains only fields that were updated or
   * added.
   * @return value or {@code null} for none
   */
  public Document getDocument() {
    return document;
  }

  /**
   * The new state of the Document. If `mask` is set, contains only fields that were updated or
   * added.
   * @param document document or {@code null} for none
   */
  public DocumentChange setDocument(Document document) {
    this.document = document;
    return this;
  }

  /**
   * A set of target IDs for targets that no longer match this document.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getRemovedTargetIds() {
    return removedTargetIds;
  }

  /**
   * A set of target IDs for targets that no longer match this document.
   * @param removedTargetIds removedTargetIds or {@code null} for none
   */
  public DocumentChange setRemovedTargetIds(java.util.List<java.lang.Integer> removedTargetIds) {
    this.removedTargetIds = removedTargetIds;
    return this;
  }

  /**
   * A set of target IDs of targets that match this document.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getTargetIds() {
    return targetIds;
  }

  /**
   * A set of target IDs of targets that match this document.
   * @param targetIds targetIds or {@code null} for none
   */
  public DocumentChange setTargetIds(java.util.List<java.lang.Integer> targetIds) {
    this.targetIds = targetIds;
    return this;
  }

  @Override
  public DocumentChange set(String fieldName, Object value) {
    return (DocumentChange) super.set(fieldName, value);
  }

  @Override
  public DocumentChange clone() {
    return (DocumentChange) super.clone();
  }

}
