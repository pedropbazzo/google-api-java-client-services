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
 * Color information consists of RGB channels, score, and the fraction of the image that the color
 * occupies in the image.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p4beta1ColorInfo extends com.google.api.client.json.GenericJson {

  /**
   * RGB components of the color.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color color;

  /**
   * The fraction of pixels the color occupies in the image. Value in range [0, 1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float pixelFraction;

  /**
   * Image-specific score for this color. Value in range [0, 1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float score;

  /**
   * RGB components of the color.
   * @return value or {@code null} for none
   */
  public Color getColor() {
    return color;
  }

  /**
   * RGB components of the color.
   * @param color color or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1ColorInfo setColor(Color color) {
    this.color = color;
    return this;
  }

  /**
   * The fraction of pixels the color occupies in the image. Value in range [0, 1].
   * @return value or {@code null} for none
   */
  public java.lang.Float getPixelFraction() {
    return pixelFraction;
  }

  /**
   * The fraction of pixels the color occupies in the image. Value in range [0, 1].
   * @param pixelFraction pixelFraction or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1ColorInfo setPixelFraction(java.lang.Float pixelFraction) {
    this.pixelFraction = pixelFraction;
    return this;
  }

  /**
   * Image-specific score for this color. Value in range [0, 1].
   * @return value or {@code null} for none
   */
  public java.lang.Float getScore() {
    return score;
  }

  /**
   * Image-specific score for this color. Value in range [0, 1].
   * @param score score or {@code null} for none
   */
  public GoogleCloudVisionV1p4beta1ColorInfo setScore(java.lang.Float score) {
    this.score = score;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p4beta1ColorInfo set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p4beta1ColorInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p4beta1ColorInfo clone() {
    return (GoogleCloudVisionV1p4beta1ColorInfo) super.clone();
  }

}
