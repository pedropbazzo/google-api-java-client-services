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

package com.google.api.services.licensing.model;

/**
 * Representation of a license assignment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Enterprise License Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LicenseAssignment extends com.google.api.client.json.GenericJson {

  /**
   * ETag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etags;

  /**
   * Identifies the resource as a LicenseAssignment, which is `licensing#licenseAssignment`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A product's unique identifier. For more information about products in this version of the API,
   * see Product and SKU IDs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * Display Name of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productName;

  /**
   * Link to this page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * A product SKU's unique identifier. For more information about available SKUs in this version of
   * the API, see Products and SKUs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String skuId;

  /**
   * Display Name of the sku of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String skuName;

  /**
   * The user's current primary email address. If the user's email address changes, use the new
   * email address in your API requests. Since a `userId` is subject to change, do not use a
   * `userId` value as a key for persistent data. This key could break if the current user's email
   * address changes. If the `userId` is suspended, the license status changes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userId;

  /**
   * ETag of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtags() {
    return etags;
  }

  /**
   * ETag of the resource.
   * @param etags etags or {@code null} for none
   */
  public LicenseAssignment setEtags(java.lang.String etags) {
    this.etags = etags;
    return this;
  }

  /**
   * Identifies the resource as a LicenseAssignment, which is `licensing#licenseAssignment`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies the resource as a LicenseAssignment, which is `licensing#licenseAssignment`.
   * @param kind kind or {@code null} for none
   */
  public LicenseAssignment setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A product's unique identifier. For more information about products in this version of the API,
   * see Product and SKU IDs.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * A product's unique identifier. For more information about products in this version of the API,
   * see Product and SKU IDs.
   * @param productId productId or {@code null} for none
   */
  public LicenseAssignment setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Display Name of the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductName() {
    return productName;
  }

  /**
   * Display Name of the product.
   * @param productName productName or {@code null} for none
   */
  public LicenseAssignment setProductName(java.lang.String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Link to this page.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Link to this page.
   * @param selfLink selfLink or {@code null} for none
   */
  public LicenseAssignment setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * A product SKU's unique identifier. For more information about available SKUs in this version of
   * the API, see Products and SKUs.
   * @return value or {@code null} for none
   */
  public java.lang.String getSkuId() {
    return skuId;
  }

  /**
   * A product SKU's unique identifier. For more information about available SKUs in this version of
   * the API, see Products and SKUs.
   * @param skuId skuId or {@code null} for none
   */
  public LicenseAssignment setSkuId(java.lang.String skuId) {
    this.skuId = skuId;
    return this;
  }

  /**
   * Display Name of the sku of the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getSkuName() {
    return skuName;
  }

  /**
   * Display Name of the sku of the product.
   * @param skuName skuName or {@code null} for none
   */
  public LicenseAssignment setSkuName(java.lang.String skuName) {
    this.skuName = skuName;
    return this;
  }

  /**
   * The user's current primary email address. If the user's email address changes, use the new
   * email address in your API requests. Since a `userId` is subject to change, do not use a
   * `userId` value as a key for persistent data. This key could break if the current user's email
   * address changes. If the `userId` is suspended, the license status changes.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserId() {
    return userId;
  }

  /**
   * The user's current primary email address. If the user's email address changes, use the new
   * email address in your API requests. Since a `userId` is subject to change, do not use a
   * `userId` value as a key for persistent data. This key could break if the current user's email
   * address changes. If the `userId` is suspended, the license status changes.
   * @param userId userId or {@code null} for none
   */
  public LicenseAssignment setUserId(java.lang.String userId) {
    this.userId = userId;
    return this;
  }

  @Override
  public LicenseAssignment set(String fieldName, Object value) {
    return (LicenseAssignment) super.set(fieldName, value);
  }

  @Override
  public LicenseAssignment clone() {
    return (LicenseAssignment) super.clone();
  }

}
