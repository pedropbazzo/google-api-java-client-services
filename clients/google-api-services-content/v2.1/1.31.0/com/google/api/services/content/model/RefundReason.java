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
 * Model definition for RefundReason.
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
public final class RefundReason extends com.google.api.client.json.GenericJson {

  /**
   * Description of the reason.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Code of the refund reason. Acceptable values are: - "`adjustment`" - "`autoPostInternal`" -
   * "`autoPostInvalidBillingAddress`" - "`autoPostNoInventory`" - "`autoPostPriceError`" -
   * "`autoPostUndeliverableShippingAddress`" - "`couponAbuse`" - "`courtesyAdjustment`" -
   * "`customerCanceled`" - "`customerDiscretionaryReturn`" - "`customerInitiatedMerchantCancel`" -
   * "`customerSupportRequested`" - "`deliveredLateByCarrier`" - "`deliveredTooLate`" -
   * "`expiredItem`" - "`failToPushOrderGoogleError`" - "`failToPushOrderMerchantError`" -
   * "`failToPushOrderMerchantFulfillmentError`" - "`failToPushOrderToMerchant`" -
   * "`failToPushOrderToMerchantOutOfStock`" - "`feeAdjustment`" - "`invalidCoupon`" -
   * "`lateShipmentCredit`" - "`malformedShippingAddress`" - "`merchantDidNotShipOnTime`" -
   * "`noInventory`" - "`orderTimeout`" - "`other`" - "`paymentAbuse`" - "`paymentDeclined`" -
   * "`priceAdjustment`" - "`priceError`" - "`productArrivedDamaged`" - "`productNotAsDescribed`" -
   * "`promoReallocation`" - "`qualityNotAsExpected`" - "`returnRefundAbuse`" -
   * "`shippingCostAdjustment`" - "`shippingPriceError`" - "`taxAdjustment`" - "`taxError`" -
   * "`undeliverableShippingAddress`" - "`unsupportedPoBoxAddress`" - "`wrongProductShipped`"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reasonCode;

  /**
   * Description of the reason.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the reason.
   * @param description description or {@code null} for none
   */
  public RefundReason setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Code of the refund reason. Acceptable values are: - "`adjustment`" - "`autoPostInternal`" -
   * "`autoPostInvalidBillingAddress`" - "`autoPostNoInventory`" - "`autoPostPriceError`" -
   * "`autoPostUndeliverableShippingAddress`" - "`couponAbuse`" - "`courtesyAdjustment`" -
   * "`customerCanceled`" - "`customerDiscretionaryReturn`" - "`customerInitiatedMerchantCancel`" -
   * "`customerSupportRequested`" - "`deliveredLateByCarrier`" - "`deliveredTooLate`" -
   * "`expiredItem`" - "`failToPushOrderGoogleError`" - "`failToPushOrderMerchantError`" -
   * "`failToPushOrderMerchantFulfillmentError`" - "`failToPushOrderToMerchant`" -
   * "`failToPushOrderToMerchantOutOfStock`" - "`feeAdjustment`" - "`invalidCoupon`" -
   * "`lateShipmentCredit`" - "`malformedShippingAddress`" - "`merchantDidNotShipOnTime`" -
   * "`noInventory`" - "`orderTimeout`" - "`other`" - "`paymentAbuse`" - "`paymentDeclined`" -
   * "`priceAdjustment`" - "`priceError`" - "`productArrivedDamaged`" - "`productNotAsDescribed`" -
   * "`promoReallocation`" - "`qualityNotAsExpected`" - "`returnRefundAbuse`" -
   * "`shippingCostAdjustment`" - "`shippingPriceError`" - "`taxAdjustment`" - "`taxError`" -
   * "`undeliverableShippingAddress`" - "`unsupportedPoBoxAddress`" - "`wrongProductShipped`"
   * @return value or {@code null} for none
   */
  public java.lang.String getReasonCode() {
    return reasonCode;
  }

  /**
   * Code of the refund reason. Acceptable values are: - "`adjustment`" - "`autoPostInternal`" -
   * "`autoPostInvalidBillingAddress`" - "`autoPostNoInventory`" - "`autoPostPriceError`" -
   * "`autoPostUndeliverableShippingAddress`" - "`couponAbuse`" - "`courtesyAdjustment`" -
   * "`customerCanceled`" - "`customerDiscretionaryReturn`" - "`customerInitiatedMerchantCancel`" -
   * "`customerSupportRequested`" - "`deliveredLateByCarrier`" - "`deliveredTooLate`" -
   * "`expiredItem`" - "`failToPushOrderGoogleError`" - "`failToPushOrderMerchantError`" -
   * "`failToPushOrderMerchantFulfillmentError`" - "`failToPushOrderToMerchant`" -
   * "`failToPushOrderToMerchantOutOfStock`" - "`feeAdjustment`" - "`invalidCoupon`" -
   * "`lateShipmentCredit`" - "`malformedShippingAddress`" - "`merchantDidNotShipOnTime`" -
   * "`noInventory`" - "`orderTimeout`" - "`other`" - "`paymentAbuse`" - "`paymentDeclined`" -
   * "`priceAdjustment`" - "`priceError`" - "`productArrivedDamaged`" - "`productNotAsDescribed`" -
   * "`promoReallocation`" - "`qualityNotAsExpected`" - "`returnRefundAbuse`" -
   * "`shippingCostAdjustment`" - "`shippingPriceError`" - "`taxAdjustment`" - "`taxError`" -
   * "`undeliverableShippingAddress`" - "`unsupportedPoBoxAddress`" - "`wrongProductShipped`"
   * @param reasonCode reasonCode or {@code null} for none
   */
  public RefundReason setReasonCode(java.lang.String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

  @Override
  public RefundReason set(String fieldName, Object value) {
    return (RefundReason) super.set(fieldName, value);
  }

  @Override
  public RefundReason clone() {
    return (RefundReason) super.clone();
  }

}
