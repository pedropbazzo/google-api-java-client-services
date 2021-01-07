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
 * Inserts an InlineObject containing an image at the given location.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Docs API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InsertInlineImageRequest extends com.google.api.client.json.GenericJson {

  /**
   * Inserts the text at the end of a header, footer or the document body. Inline images cannot be
   * inserted inside a footnote.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EndOfSegmentLocation endOfSegmentLocation;

  /**
   * Inserts the image at a specific index in the document. The image must be inserted inside the
   * bounds of an existing Paragraph. For instance, it cannot be inserted at a table's start index
   * (i.e. between the table and its preceding paragraph). Inline images cannot be inserted inside a
   * footnote or equation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Location location;

  /**
   * The size that the image should appear as in the document. This property is optional and the
   * final size of the image in the document is determined by the following rules: * If neither
   * width nor height is specified, then a default size of the image is calculated based on its
   * resolution. * If one dimension is specified then the other dimension is calculated to preserve
   * the aspect ratio of the image. * If both width and height are specified, the image is scaled to
   * fit within the provided dimensions while maintaining its aspect ratio.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Size objectSize;

  /**
   * The image URI. The image is fetched once at insertion time and a copy is stored for display
   * inside the document. Images must be less than 50MB in size, cannot exceed 25 megapixels, and
   * must be in one of PNG, JPEG, or GIF format. The provided URI can be at most 2 kB in length. The
   * URI itself is saved with the image, and exposed via the ImageProperties.content_uri field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Inserts the text at the end of a header, footer or the document body. Inline images cannot be
   * inserted inside a footnote.
   * @return value or {@code null} for none
   */
  public EndOfSegmentLocation getEndOfSegmentLocation() {
    return endOfSegmentLocation;
  }

  /**
   * Inserts the text at the end of a header, footer or the document body. Inline images cannot be
   * inserted inside a footnote.
   * @param endOfSegmentLocation endOfSegmentLocation or {@code null} for none
   */
  public InsertInlineImageRequest setEndOfSegmentLocation(EndOfSegmentLocation endOfSegmentLocation) {
    this.endOfSegmentLocation = endOfSegmentLocation;
    return this;
  }

  /**
   * Inserts the image at a specific index in the document. The image must be inserted inside the
   * bounds of an existing Paragraph. For instance, it cannot be inserted at a table's start index
   * (i.e. between the table and its preceding paragraph). Inline images cannot be inserted inside a
   * footnote or equation.
   * @return value or {@code null} for none
   */
  public Location getLocation() {
    return location;
  }

  /**
   * Inserts the image at a specific index in the document. The image must be inserted inside the
   * bounds of an existing Paragraph. For instance, it cannot be inserted at a table's start index
   * (i.e. between the table and its preceding paragraph). Inline images cannot be inserted inside a
   * footnote or equation.
   * @param location location or {@code null} for none
   */
  public InsertInlineImageRequest setLocation(Location location) {
    this.location = location;
    return this;
  }

  /**
   * The size that the image should appear as in the document. This property is optional and the
   * final size of the image in the document is determined by the following rules: * If neither
   * width nor height is specified, then a default size of the image is calculated based on its
   * resolution. * If one dimension is specified then the other dimension is calculated to preserve
   * the aspect ratio of the image. * If both width and height are specified, the image is scaled to
   * fit within the provided dimensions while maintaining its aspect ratio.
   * @return value or {@code null} for none
   */
  public Size getObjectSize() {
    return objectSize;
  }

  /**
   * The size that the image should appear as in the document. This property is optional and the
   * final size of the image in the document is determined by the following rules: * If neither
   * width nor height is specified, then a default size of the image is calculated based on its
   * resolution. * If one dimension is specified then the other dimension is calculated to preserve
   * the aspect ratio of the image. * If both width and height are specified, the image is scaled to
   * fit within the provided dimensions while maintaining its aspect ratio.
   * @param objectSize objectSize or {@code null} for none
   */
  public InsertInlineImageRequest setObjectSize(Size objectSize) {
    this.objectSize = objectSize;
    return this;
  }

  /**
   * The image URI. The image is fetched once at insertion time and a copy is stored for display
   * inside the document. Images must be less than 50MB in size, cannot exceed 25 megapixels, and
   * must be in one of PNG, JPEG, or GIF format. The provided URI can be at most 2 kB in length. The
   * URI itself is saved with the image, and exposed via the ImageProperties.content_uri field.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * The image URI. The image is fetched once at insertion time and a copy is stored for display
   * inside the document. Images must be less than 50MB in size, cannot exceed 25 megapixels, and
   * must be in one of PNG, JPEG, or GIF format. The provided URI can be at most 2 kB in length. The
   * URI itself is saved with the image, and exposed via the ImageProperties.content_uri field.
   * @param uri uri or {@code null} for none
   */
  public InsertInlineImageRequest setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public InsertInlineImageRequest set(String fieldName, Object value) {
    return (InsertInlineImageRequest) super.set(fieldName, value);
  }

  @Override
  public InsertInlineImageRequest clone() {
    return (InsertInlineImageRequest) super.clone();
  }

}
