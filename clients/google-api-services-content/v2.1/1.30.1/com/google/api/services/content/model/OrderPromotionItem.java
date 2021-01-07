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

package com.google.api.services.content.model;

/**
 * Model definition for OrderPromotionItem.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OrderPromotionItem extends com.google.api.client.json.GenericJson {

  /**
   * The line item ID of a product. Do not provide for `orders.createtestorder`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lineItemId;

  /**
   * Required. Offer ID of a product. Only for `orders.createtestorder`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String offerId;

  /**
   * `orders.createtestorder`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * The quantity of the associated product. Do not provide for `orders.createtestorder`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer quantity;

  /**
   * The line item ID of a product. Do not provide for `orders.createtestorder`.
   * @return value or {@code null} for none
   */
  public java.lang.String getLineItemId() {
    return lineItemId;
  }

  /**
   * The line item ID of a product. Do not provide for `orders.createtestorder`.
   * @param lineItemId lineItemId or {@code null} for none
   */
  public OrderPromotionItem setLineItemId(java.lang.String lineItemId) {
    this.lineItemId = lineItemId;
    return this;
  }

  /**
   * Required. Offer ID of a product. Only for `orders.createtestorder`.
   * @return value or {@code null} for none
   */
  public java.lang.String getOfferId() {
    return offerId;
  }

  /**
   * Required. Offer ID of a product. Only for `orders.createtestorder`.
   * @param offerId offerId or {@code null} for none
   */
  public OrderPromotionItem setOfferId(java.lang.String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * `orders.createtestorder`.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * `orders.createtestorder`.
   * @param productId productId or {@code null} for none
   */
  public OrderPromotionItem setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The quantity of the associated product. Do not provide for `orders.createtestorder`.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getQuantity() {
    return quantity;
  }

  /**
   * The quantity of the associated product. Do not provide for `orders.createtestorder`.
   * @param quantity quantity or {@code null} for none
   */
  public OrderPromotionItem setQuantity(java.lang.Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  @Override
  public OrderPromotionItem set(String fieldName, Object value) {
    return (OrderPromotionItem) super.set(fieldName, value);
  }

  @Override
  public OrderPromotionItem clone() {
    return (OrderPromotionItem) super.clone();
  }

}
