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

package com.google.api.services.slides.v1.model;

/**
 * Replaces an existing image with a new image. Replacing an image removes some image effects from
 * the existing image.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReplaceImageRequest extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the existing image that will be replaced.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageObjectId;

  /**
   * The replacement method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageReplaceMethod;

  /**
   * The image URL. The image is fetched once at insertion time and a copy is stored for display
   * inside the presentation. Images must be less than 50MB in size, cannot exceed 25 megapixels,
   * and must be in one of PNG, JPEG, or GIF format. The provided URL can be at most 2 kB in length.
   * The URL itself is saved with the image, and exposed via the Image.source_url field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * The ID of the existing image that will be replaced.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageObjectId() {
    return imageObjectId;
  }

  /**
   * The ID of the existing image that will be replaced.
   * @param imageObjectId imageObjectId or {@code null} for none
   */
  public ReplaceImageRequest setImageObjectId(java.lang.String imageObjectId) {
    this.imageObjectId = imageObjectId;
    return this;
  }

  /**
   * The replacement method.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageReplaceMethod() {
    return imageReplaceMethod;
  }

  /**
   * The replacement method.
   * @param imageReplaceMethod imageReplaceMethod or {@code null} for none
   */
  public ReplaceImageRequest setImageReplaceMethod(java.lang.String imageReplaceMethod) {
    this.imageReplaceMethod = imageReplaceMethod;
    return this;
  }

  /**
   * The image URL. The image is fetched once at insertion time and a copy is stored for display
   * inside the presentation. Images must be less than 50MB in size, cannot exceed 25 megapixels,
   * and must be in one of PNG, JPEG, or GIF format. The provided URL can be at most 2 kB in length.
   * The URL itself is saved with the image, and exposed via the Image.source_url field.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * The image URL. The image is fetched once at insertion time and a copy is stored for display
   * inside the presentation. Images must be less than 50MB in size, cannot exceed 25 megapixels,
   * and must be in one of PNG, JPEG, or GIF format. The provided URL can be at most 2 kB in length.
   * The URL itself is saved with the image, and exposed via the Image.source_url field.
   * @param url url or {@code null} for none
   */
  public ReplaceImageRequest setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public ReplaceImageRequest set(String fieldName, Object value) {
    return (ReplaceImageRequest) super.set(fieldName, value);
  }

  @Override
  public ReplaceImageRequest clone() {
    return (ReplaceImageRequest) super.clone();
  }

}
