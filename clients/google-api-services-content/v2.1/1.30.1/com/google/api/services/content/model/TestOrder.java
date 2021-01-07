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
 * Model definition for TestOrder.
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
public final class TestOrder extends com.google.api.client.json.GenericJson {

  /**
   * Overrides the predefined delivery details if provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TestOrderDeliveryDetails deliveryDetails;

  /**
   * Whether the orderinvoices service should support this order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableOrderinvoices;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "`content#testOrder`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Required. Line items that are ordered. At least one line item must be provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TestOrderLineItem> lineItems;

  /**
   * Restricted. Do not use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String notificationMode;

  /**
   * Overrides the predefined pickup details if provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TestOrderPickupDetails pickupDetails;

  /**
   * Required. The billing address. Acceptable values are: - "`dwight`" - "`jim`" - "`pam`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String predefinedBillingAddress;

  /**
   * Required. Identifier of one of the predefined delivery addresses for the delivery. Acceptable
   * values are: - "`dwight`" - "`jim`" - "`pam`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String predefinedDeliveryAddress;

  /**
   * Required. Email address of the customer. Acceptable values are: -
   * "`pog.dwight.schrute@gmail.com`" - "`pog.jim.halpert@gmail.com`" -
   * "`penpog.pam.beesly@gmail.comding`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String predefinedEmail;

  /**
   * Identifier of one of the predefined pickup details. Required for orders containing line items
   * with shipping type `pickup`. Acceptable values are: - "`dwight`" - "`jim`" - "`pam`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String predefinedPickupDetails;

  /**
   * Promotions associated with the order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrderPromotion> promotions;

  static {
    // hack to force ProGuard to consider OrderPromotion used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(OrderPromotion.class);
  }

  /**
   * Required. The price of shipping for all items. Shipping tax is automatically calculated for
   * orders where marketplace facilitator tax laws are applicable. Otherwise, tax settings from
   * Merchant Center are applied. Note that shipping is not taxed in certain states.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price shippingCost;

  /**
   * Required. The requested shipping option. Acceptable values are: - "`economy`" - "`expedited`" -
   * "`oneDay`" - "`sameDay`" - "`standard`" - "`twoDay`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shippingOption;

  /**
   * Overrides the predefined delivery details if provided.
   * @return value or {@code null} for none
   */
  public TestOrderDeliveryDetails getDeliveryDetails() {
    return deliveryDetails;
  }

  /**
   * Overrides the predefined delivery details if provided.
   * @param deliveryDetails deliveryDetails or {@code null} for none
   */
  public TestOrder setDeliveryDetails(TestOrderDeliveryDetails deliveryDetails) {
    this.deliveryDetails = deliveryDetails;
    return this;
  }

  /**
   * Whether the orderinvoices service should support this order.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableOrderinvoices() {
    return enableOrderinvoices;
  }

  /**
   * Whether the orderinvoices service should support this order.
   * @param enableOrderinvoices enableOrderinvoices or {@code null} for none
   */
  public TestOrder setEnableOrderinvoices(java.lang.Boolean enableOrderinvoices) {
    this.enableOrderinvoices = enableOrderinvoices;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "`content#testOrder`"
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "`content#testOrder`"
   * @param kind kind or {@code null} for none
   */
  public TestOrder setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Required. Line items that are ordered. At least one line item must be provided.
   * @return value or {@code null} for none
   */
  public java.util.List<TestOrderLineItem> getLineItems() {
    return lineItems;
  }

  /**
   * Required. Line items that are ordered. At least one line item must be provided.
   * @param lineItems lineItems or {@code null} for none
   */
  public TestOrder setLineItems(java.util.List<TestOrderLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  /**
   * Restricted. Do not use.
   * @return value or {@code null} for none
   */
  public java.lang.String getNotificationMode() {
    return notificationMode;
  }

  /**
   * Restricted. Do not use.
   * @param notificationMode notificationMode or {@code null} for none
   */
  public TestOrder setNotificationMode(java.lang.String notificationMode) {
    this.notificationMode = notificationMode;
    return this;
  }

  /**
   * Overrides the predefined pickup details if provided.
   * @return value or {@code null} for none
   */
  public TestOrderPickupDetails getPickupDetails() {
    return pickupDetails;
  }

  /**
   * Overrides the predefined pickup details if provided.
   * @param pickupDetails pickupDetails or {@code null} for none
   */
  public TestOrder setPickupDetails(TestOrderPickupDetails pickupDetails) {
    this.pickupDetails = pickupDetails;
    return this;
  }

  /**
   * Required. The billing address. Acceptable values are: - "`dwight`" - "`jim`" - "`pam`"
   * @return value or {@code null} for none
   */
  public java.lang.String getPredefinedBillingAddress() {
    return predefinedBillingAddress;
  }

  /**
   * Required. The billing address. Acceptable values are: - "`dwight`" - "`jim`" - "`pam`"
   * @param predefinedBillingAddress predefinedBillingAddress or {@code null} for none
   */
  public TestOrder setPredefinedBillingAddress(java.lang.String predefinedBillingAddress) {
    this.predefinedBillingAddress = predefinedBillingAddress;
    return this;
  }

  /**
   * Required. Identifier of one of the predefined delivery addresses for the delivery. Acceptable
   * values are: - "`dwight`" - "`jim`" - "`pam`"
   * @return value or {@code null} for none
   */
  public java.lang.String getPredefinedDeliveryAddress() {
    return predefinedDeliveryAddress;
  }

  /**
   * Required. Identifier of one of the predefined delivery addresses for the delivery. Acceptable
   * values are: - "`dwight`" - "`jim`" - "`pam`"
   * @param predefinedDeliveryAddress predefinedDeliveryAddress or {@code null} for none
   */
  public TestOrder setPredefinedDeliveryAddress(java.lang.String predefinedDeliveryAddress) {
    this.predefinedDeliveryAddress = predefinedDeliveryAddress;
    return this;
  }

  /**
   * Required. Email address of the customer. Acceptable values are: -
   * "`pog.dwight.schrute@gmail.com`" - "`pog.jim.halpert@gmail.com`" -
   * "`penpog.pam.beesly@gmail.comding`"
   * @return value or {@code null} for none
   */
  public java.lang.String getPredefinedEmail() {
    return predefinedEmail;
  }

  /**
   * Required. Email address of the customer. Acceptable values are: -
   * "`pog.dwight.schrute@gmail.com`" - "`pog.jim.halpert@gmail.com`" -
   * "`penpog.pam.beesly@gmail.comding`"
   * @param predefinedEmail predefinedEmail or {@code null} for none
   */
  public TestOrder setPredefinedEmail(java.lang.String predefinedEmail) {
    this.predefinedEmail = predefinedEmail;
    return this;
  }

  /**
   * Identifier of one of the predefined pickup details. Required for orders containing line items
   * with shipping type `pickup`. Acceptable values are: - "`dwight`" - "`jim`" - "`pam`"
   * @return value or {@code null} for none
   */
  public java.lang.String getPredefinedPickupDetails() {
    return predefinedPickupDetails;
  }

  /**
   * Identifier of one of the predefined pickup details. Required for orders containing line items
   * with shipping type `pickup`. Acceptable values are: - "`dwight`" - "`jim`" - "`pam`"
   * @param predefinedPickupDetails predefinedPickupDetails or {@code null} for none
   */
  public TestOrder setPredefinedPickupDetails(java.lang.String predefinedPickupDetails) {
    this.predefinedPickupDetails = predefinedPickupDetails;
    return this;
  }

  /**
   * Promotions associated with the order.
   * @return value or {@code null} for none
   */
  public java.util.List<OrderPromotion> getPromotions() {
    return promotions;
  }

  /**
   * Promotions associated with the order.
   * @param promotions promotions or {@code null} for none
   */
  public TestOrder setPromotions(java.util.List<OrderPromotion> promotions) {
    this.promotions = promotions;
    return this;
  }

  /**
   * Required. The price of shipping for all items. Shipping tax is automatically calculated for
   * orders where marketplace facilitator tax laws are applicable. Otherwise, tax settings from
   * Merchant Center are applied. Note that shipping is not taxed in certain states.
   * @return value or {@code null} for none
   */
  public Price getShippingCost() {
    return shippingCost;
  }

  /**
   * Required. The price of shipping for all items. Shipping tax is automatically calculated for
   * orders where marketplace facilitator tax laws are applicable. Otherwise, tax settings from
   * Merchant Center are applied. Note that shipping is not taxed in certain states.
   * @param shippingCost shippingCost or {@code null} for none
   */
  public TestOrder setShippingCost(Price shippingCost) {
    this.shippingCost = shippingCost;
    return this;
  }

  /**
   * Required. The requested shipping option. Acceptable values are: - "`economy`" - "`expedited`" -
   * "`oneDay`" - "`sameDay`" - "`standard`" - "`twoDay`"
   * @return value or {@code null} for none
   */
  public java.lang.String getShippingOption() {
    return shippingOption;
  }

  /**
   * Required. The requested shipping option. Acceptable values are: - "`economy`" - "`expedited`" -
   * "`oneDay`" - "`sameDay`" - "`standard`" - "`twoDay`"
   * @param shippingOption shippingOption or {@code null} for none
   */
  public TestOrder setShippingOption(java.lang.String shippingOption) {
    this.shippingOption = shippingOption;
    return this;
  }

  @Override
  public TestOrder set(String fieldName, Object value) {
    return (TestOrder) super.set(fieldName, value);
  }

  @Override
  public TestOrder clone() {
    return (TestOrder) super.clone();
  }

}
