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
 * Model definition for OrderreturnsProcessRequest.
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
public final class OrderreturnsProcessRequest extends com.google.api.client.json.GenericJson {

  /**
   * Option to charge the customer return shipping cost.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean fullChargeReturnShippingCost;

  /**
   * [required] The ID of the operation, unique across all operations for a given order return.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationId;

  /**
   * Refunds for original shipping fee.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrderreturnsRefundOperation refundShippingFee;

  /**
   * The list of items to return.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrderreturnsReturnItem> returnItems;

  /**
   * Option to charge the customer return shipping cost.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFullChargeReturnShippingCost() {
    return fullChargeReturnShippingCost;
  }

  /**
   * Option to charge the customer return shipping cost.
   * @param fullChargeReturnShippingCost fullChargeReturnShippingCost or {@code null} for none
   */
  public OrderreturnsProcessRequest setFullChargeReturnShippingCost(java.lang.Boolean fullChargeReturnShippingCost) {
    this.fullChargeReturnShippingCost = fullChargeReturnShippingCost;
    return this;
  }

  /**
   * [required] The ID of the operation, unique across all operations for a given order return.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationId() {
    return operationId;
  }

  /**
   * [required] The ID of the operation, unique across all operations for a given order return.
   * @param operationId operationId or {@code null} for none
   */
  public OrderreturnsProcessRequest setOperationId(java.lang.String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * Refunds for original shipping fee.
   * @return value or {@code null} for none
   */
  public OrderreturnsRefundOperation getRefundShippingFee() {
    return refundShippingFee;
  }

  /**
   * Refunds for original shipping fee.
   * @param refundShippingFee refundShippingFee or {@code null} for none
   */
  public OrderreturnsProcessRequest setRefundShippingFee(OrderreturnsRefundOperation refundShippingFee) {
    this.refundShippingFee = refundShippingFee;
    return this;
  }

  /**
   * The list of items to return.
   * @return value or {@code null} for none
   */
  public java.util.List<OrderreturnsReturnItem> getReturnItems() {
    return returnItems;
  }

  /**
   * The list of items to return.
   * @param returnItems returnItems or {@code null} for none
   */
  public OrderreturnsProcessRequest setReturnItems(java.util.List<OrderreturnsReturnItem> returnItems) {
    this.returnItems = returnItems;
    return this;
  }

  @Override
  public OrderreturnsProcessRequest set(String fieldName, Object value) {
    return (OrderreturnsProcessRequest) super.set(fieldName, value);
  }

  @Override
  public OrderreturnsProcessRequest clone() {
    return (OrderreturnsProcessRequest) super.clone();
  }

}
