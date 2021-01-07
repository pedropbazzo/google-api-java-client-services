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

package com.google.api.services.androidpublisher.model;

/**
 * An Android app review.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Review extends com.google.api.client.json.GenericJson {

  /**
   * The name of the user who wrote the review.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authorName;

  /**
   * A repeated field containing comments for the review.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Comment> comments;

  static {
    // hack to force ProGuard to consider Comment used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Comment.class);
  }

  /**
   * Unique identifier for this review.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reviewId;

  /**
   * The name of the user who wrote the review.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthorName() {
    return authorName;
  }

  /**
   * The name of the user who wrote the review.
   * @param authorName authorName or {@code null} for none
   */
  public Review setAuthorName(java.lang.String authorName) {
    this.authorName = authorName;
    return this;
  }

  /**
   * A repeated field containing comments for the review.
   * @return value or {@code null} for none
   */
  public java.util.List<Comment> getComments() {
    return comments;
  }

  /**
   * A repeated field containing comments for the review.
   * @param comments comments or {@code null} for none
   */
  public Review setComments(java.util.List<Comment> comments) {
    this.comments = comments;
    return this;
  }

  /**
   * Unique identifier for this review.
   * @return value or {@code null} for none
   */
  public java.lang.String getReviewId() {
    return reviewId;
  }

  /**
   * Unique identifier for this review.
   * @param reviewId reviewId or {@code null} for none
   */
  public Review setReviewId(java.lang.String reviewId) {
    this.reviewId = reviewId;
    return this;
  }

  @Override
  public Review set(String fieldName, Object value) {
    return (Review) super.set(fieldName, value);
  }

  @Override
  public Review clone() {
    return (Review) super.clone();
  }

}
