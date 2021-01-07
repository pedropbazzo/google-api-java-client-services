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
 * Store listing of a single in-app product.
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
public final class InAppProductListing extends com.google.api.client.json.GenericJson {

  /**
   * Localized entitlement benefits for a subscription.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> benefits;

  /**
   * Description for the store listing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Title for the store listing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Localized entitlement benefits for a subscription.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getBenefits() {
    return benefits;
  }

  /**
   * Localized entitlement benefits for a subscription.
   * @param benefits benefits or {@code null} for none
   */
  public InAppProductListing setBenefits(java.util.List<java.lang.String> benefits) {
    this.benefits = benefits;
    return this;
  }

  /**
   * Description for the store listing.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description for the store listing.
   * @param description description or {@code null} for none
   */
  public InAppProductListing setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Title for the store listing.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Title for the store listing.
   * @param title title or {@code null} for none
   */
  public InAppProductListing setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public InAppProductListing set(String fieldName, Object value) {
    return (InAppProductListing) super.set(fieldName, value);
  }

  @Override
  public InAppProductListing clone() {
    return (InAppProductListing) super.clone();
  }

}
