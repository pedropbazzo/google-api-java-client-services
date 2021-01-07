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

package com.google.api.services.docs.v1.model;

/**
 * A StructuralElement representing a paragraph. A paragraph is a range of content that is
 * terminated with a newline character.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Paragraph extends com.google.api.client.json.GenericJson {

  /**
   * The bullet for this paragraph. If not present, the paragraph does not belong to a list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Bullet bullet;

  /**
   * The content of the paragraph broken down into its component parts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ParagraphElement> elements;

  /**
   * The style of this paragraph.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ParagraphStyle paragraphStyle;

  /**
   * The IDs of the positioned objects tethered to this paragraph.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> positionedObjectIds;

  /**
   * The suggested changes to this paragraph's bullet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, SuggestedBullet> suggestedBulletChanges;

  /**
   * The suggested paragraph style changes to this paragraph, keyed by suggestion ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, SuggestedParagraphStyle> suggestedParagraphStyleChanges;

  /**
   * The IDs of the positioned objects that are suggested to be attached to this paragraph, keyed by
   * suggestion ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, ObjectReferences> suggestedPositionedObjectIds;

  static {
    // hack to force ProGuard to consider ObjectReferences used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ObjectReferences.class);
  }

  /**
   * The bullet for this paragraph. If not present, the paragraph does not belong to a list.
   * @return value or {@code null} for none
   */
  public Bullet getBullet() {
    return bullet;
  }

  /**
   * The bullet for this paragraph. If not present, the paragraph does not belong to a list.
   * @param bullet bullet or {@code null} for none
   */
  public Paragraph setBullet(Bullet bullet) {
    this.bullet = bullet;
    return this;
  }

  /**
   * The content of the paragraph broken down into its component parts.
   * @return value or {@code null} for none
   */
  public java.util.List<ParagraphElement> getElements() {
    return elements;
  }

  /**
   * The content of the paragraph broken down into its component parts.
   * @param elements elements or {@code null} for none
   */
  public Paragraph setElements(java.util.List<ParagraphElement> elements) {
    this.elements = elements;
    return this;
  }

  /**
   * The style of this paragraph.
   * @return value or {@code null} for none
   */
  public ParagraphStyle getParagraphStyle() {
    return paragraphStyle;
  }

  /**
   * The style of this paragraph.
   * @param paragraphStyle paragraphStyle or {@code null} for none
   */
  public Paragraph setParagraphStyle(ParagraphStyle paragraphStyle) {
    this.paragraphStyle = paragraphStyle;
    return this;
  }

  /**
   * The IDs of the positioned objects tethered to this paragraph.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPositionedObjectIds() {
    return positionedObjectIds;
  }

  /**
   * The IDs of the positioned objects tethered to this paragraph.
   * @param positionedObjectIds positionedObjectIds or {@code null} for none
   */
  public Paragraph setPositionedObjectIds(java.util.List<java.lang.String> positionedObjectIds) {
    this.positionedObjectIds = positionedObjectIds;
    return this;
  }

  /**
   * The suggested changes to this paragraph's bullet.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, SuggestedBullet> getSuggestedBulletChanges() {
    return suggestedBulletChanges;
  }

  /**
   * The suggested changes to this paragraph's bullet.
   * @param suggestedBulletChanges suggestedBulletChanges or {@code null} for none
   */
  public Paragraph setSuggestedBulletChanges(java.util.Map<String, SuggestedBullet> suggestedBulletChanges) {
    this.suggestedBulletChanges = suggestedBulletChanges;
    return this;
  }

  /**
   * The suggested paragraph style changes to this paragraph, keyed by suggestion ID.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, SuggestedParagraphStyle> getSuggestedParagraphStyleChanges() {
    return suggestedParagraphStyleChanges;
  }

  /**
   * The suggested paragraph style changes to this paragraph, keyed by suggestion ID.
   * @param suggestedParagraphStyleChanges suggestedParagraphStyleChanges or {@code null} for none
   */
  public Paragraph setSuggestedParagraphStyleChanges(java.util.Map<String, SuggestedParagraphStyle> suggestedParagraphStyleChanges) {
    this.suggestedParagraphStyleChanges = suggestedParagraphStyleChanges;
    return this;
  }

  /**
   * The IDs of the positioned objects that are suggested to be attached to this paragraph, keyed by
   * suggestion ID.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, ObjectReferences> getSuggestedPositionedObjectIds() {
    return suggestedPositionedObjectIds;
  }

  /**
   * The IDs of the positioned objects that are suggested to be attached to this paragraph, keyed by
   * suggestion ID.
   * @param suggestedPositionedObjectIds suggestedPositionedObjectIds or {@code null} for none
   */
  public Paragraph setSuggestedPositionedObjectIds(java.util.Map<String, ObjectReferences> suggestedPositionedObjectIds) {
    this.suggestedPositionedObjectIds = suggestedPositionedObjectIds;
    return this;
  }

  @Override
  public Paragraph set(String fieldName, Object value) {
    return (Paragraph) super.set(fieldName, value);
  }

  @Override
  public Paragraph clone() {
    return (Paragraph) super.clone();
  }

}
