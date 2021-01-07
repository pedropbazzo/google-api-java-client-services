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

package com.google.api.services.youtube.model;

/**
 * A thumbnail is an image representing a YouTube resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Thumbnail extends com.google.api.client.json.GenericJson {

  /**
   * (Optional) Height of the thumbnail image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long height;

  /**
   * The thumbnail image's URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * (Optional) Width of the thumbnail image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long width;

  /**
   * (Optional) Height of the thumbnail image.
   * @return value or {@code null} for none
   */
  public java.lang.Long getHeight() {
    return height;
  }

  /**
   * (Optional) Height of the thumbnail image.
   * @param height height or {@code null} for none
   */
  public Thumbnail setHeight(java.lang.Long height) {
    this.height = height;
    return this;
  }

  /**
   * The thumbnail image's URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * The thumbnail image's URL.
   * @param url url or {@code null} for none
   */
  public Thumbnail setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  /**
   * (Optional) Width of the thumbnail image.
   * @return value or {@code null} for none
   */
  public java.lang.Long getWidth() {
    return width;
  }

  /**
   * (Optional) Width of the thumbnail image.
   * @param width width or {@code null} for none
   */
  public Thumbnail setWidth(java.lang.Long width) {
    this.width = width;
    return this;
  }

  @Override
  public Thumbnail set(String fieldName, Object value) {
    return (Thumbnail) super.set(fieldName, value);
  }

  @Override
  public Thumbnail clone() {
    return (Thumbnail) super.clone();
  }

}
