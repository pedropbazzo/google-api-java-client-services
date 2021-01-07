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

package com.google.api.services.displayvideo.v1.model;

/**
 * Settings for brand safety controls.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DoubleVerifyBrandSafetyCategories extends com.google.api.client.json.GenericJson {

  /**
   * Unknown or unrateable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean avoidUnknownBrandSafetyCategory;

  /**
   * Brand safety high severity avoidance categories.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> avoidedHighSeverityCategories;

  /**
   * Brand safety medium severity avoidance categories.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> avoidedMediumSeverityCategories;

  /**
   * Unknown or unrateable.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAvoidUnknownBrandSafetyCategory() {
    return avoidUnknownBrandSafetyCategory;
  }

  /**
   * Unknown or unrateable.
   * @param avoidUnknownBrandSafetyCategory avoidUnknownBrandSafetyCategory or {@code null} for none
   */
  public DoubleVerifyBrandSafetyCategories setAvoidUnknownBrandSafetyCategory(java.lang.Boolean avoidUnknownBrandSafetyCategory) {
    this.avoidUnknownBrandSafetyCategory = avoidUnknownBrandSafetyCategory;
    return this;
  }

  /**
   * Brand safety high severity avoidance categories.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAvoidedHighSeverityCategories() {
    return avoidedHighSeverityCategories;
  }

  /**
   * Brand safety high severity avoidance categories.
   * @param avoidedHighSeverityCategories avoidedHighSeverityCategories or {@code null} for none
   */
  public DoubleVerifyBrandSafetyCategories setAvoidedHighSeverityCategories(java.util.List<java.lang.String> avoidedHighSeverityCategories) {
    this.avoidedHighSeverityCategories = avoidedHighSeverityCategories;
    return this;
  }

  /**
   * Brand safety medium severity avoidance categories.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAvoidedMediumSeverityCategories() {
    return avoidedMediumSeverityCategories;
  }

  /**
   * Brand safety medium severity avoidance categories.
   * @param avoidedMediumSeverityCategories avoidedMediumSeverityCategories or {@code null} for none
   */
  public DoubleVerifyBrandSafetyCategories setAvoidedMediumSeverityCategories(java.util.List<java.lang.String> avoidedMediumSeverityCategories) {
    this.avoidedMediumSeverityCategories = avoidedMediumSeverityCategories;
    return this;
  }

  @Override
  public DoubleVerifyBrandSafetyCategories set(String fieldName, Object value) {
    return (DoubleVerifyBrandSafetyCategories) super.set(fieldName, value);
  }

  @Override
  public DoubleVerifyBrandSafetyCategories clone() {
    return (DoubleVerifyBrandSafetyCategories) super.clone();
  }

}
