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

package com.google.api.services.documentai.v1beta3.model;

/**
 * A bounding polygon for the detected image annotation.
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
public final class GoogleCloudDocumentaiV1beta3BoundingPoly extends com.google.api.client.json.GenericJson {

  /**
   * The bounding polygon normalized vertices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta3NormalizedVertex> normalizedVertices;

  /**
   * The bounding polygon vertices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDocumentaiV1beta3Vertex> vertices;

  /**
   * The bounding polygon normalized vertices.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta3NormalizedVertex> getNormalizedVertices() {
    return normalizedVertices;
  }

  /**
   * The bounding polygon normalized vertices.
   * @param normalizedVertices normalizedVertices or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3BoundingPoly setNormalizedVertices(java.util.List<GoogleCloudDocumentaiV1beta3NormalizedVertex> normalizedVertices) {
    this.normalizedVertices = normalizedVertices;
    return this;
  }

  /**
   * The bounding polygon vertices.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDocumentaiV1beta3Vertex> getVertices() {
    return vertices;
  }

  /**
   * The bounding polygon vertices.
   * @param vertices vertices or {@code null} for none
   */
  public GoogleCloudDocumentaiV1beta3BoundingPoly setVertices(java.util.List<GoogleCloudDocumentaiV1beta3Vertex> vertices) {
    this.vertices = vertices;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1beta3BoundingPoly set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1beta3BoundingPoly) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1beta3BoundingPoly clone() {
    return (GoogleCloudDocumentaiV1beta3BoundingPoly) super.clone();
  }

}
