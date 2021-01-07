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

package com.google.api.services.reseller.model;

/**
 * JSON template for the ChangePlan rpc request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Workspace Reseller API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChangePlanRequest extends com.google.api.client.json.GenericJson {

  /**
   * Google-issued code (100 char max) for discounted pricing on subscription plans. Deal code must
   * be included in changePlan request in order to receive discounted rate. This property is
   * optional. If a deal code has already been added to a subscription, this property may be left
   * empty and the existing discounted rate will still apply (if not empty, only provide the deal
   * code that is already present on the subscription). If a deal code has never been added to a
   * subscription and this property is left blank, regular pricing will apply.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dealCode;

  /**
   * Identifies the resource as a subscription change plan request. Value:
   * subscriptions#changePlanRequest
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The planName property is required. This is the name of the subscription's payment plan. For
   * more information about the Google payment plans, see API concepts. Possible values are: -
   * ANNUAL_MONTHLY_PAY - The annual commitment plan with monthly payments *Caution:
   * *ANNUAL_MONTHLY_PAY is returned as ANNUAL in all API responses. - ANNUAL_YEARLY_PAY - The
   * annual commitment plan with yearly payments - FLEXIBLE - The flexible plan - TRIAL - The 30-day
   * free trial plan
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String planName;

  /**
   * This is an optional property. This purchase order (PO) information is for resellers to use for
   * their company tracking usage. If a purchaseOrderId value is given it appears in the API
   * responses and shows up in the invoice. The property accepts up to 80 plain text characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String purchaseOrderId;

  /**
   * This is a required property. The seats property is the number of user seat licenses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Seats seats;

  /**
   * Google-issued code (100 char max) for discounted pricing on subscription plans. Deal code must
   * be included in changePlan request in order to receive discounted rate. This property is
   * optional. If a deal code has already been added to a subscription, this property may be left
   * empty and the existing discounted rate will still apply (if not empty, only provide the deal
   * code that is already present on the subscription). If a deal code has never been added to a
   * subscription and this property is left blank, regular pricing will apply.
   * @return value or {@code null} for none
   */
  public java.lang.String getDealCode() {
    return dealCode;
  }

  /**
   * Google-issued code (100 char max) for discounted pricing on subscription plans. Deal code must
   * be included in changePlan request in order to receive discounted rate. This property is
   * optional. If a deal code has already been added to a subscription, this property may be left
   * empty and the existing discounted rate will still apply (if not empty, only provide the deal
   * code that is already present on the subscription). If a deal code has never been added to a
   * subscription and this property is left blank, regular pricing will apply.
   * @param dealCode dealCode or {@code null} for none
   */
  public ChangePlanRequest setDealCode(java.lang.String dealCode) {
    this.dealCode = dealCode;
    return this;
  }

  /**
   * Identifies the resource as a subscription change plan request. Value:
   * subscriptions#changePlanRequest
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies the resource as a subscription change plan request. Value:
   * subscriptions#changePlanRequest
   * @param kind kind or {@code null} for none
   */
  public ChangePlanRequest setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The planName property is required. This is the name of the subscription's payment plan. For
   * more information about the Google payment plans, see API concepts. Possible values are: -
   * ANNUAL_MONTHLY_PAY - The annual commitment plan with monthly payments *Caution:
   * *ANNUAL_MONTHLY_PAY is returned as ANNUAL in all API responses. - ANNUAL_YEARLY_PAY - The
   * annual commitment plan with yearly payments - FLEXIBLE - The flexible plan - TRIAL - The 30-day
   * free trial plan
   * @return value or {@code null} for none
   */
  public java.lang.String getPlanName() {
    return planName;
  }

  /**
   * The planName property is required. This is the name of the subscription's payment plan. For
   * more information about the Google payment plans, see API concepts. Possible values are: -
   * ANNUAL_MONTHLY_PAY - The annual commitment plan with monthly payments *Caution:
   * *ANNUAL_MONTHLY_PAY is returned as ANNUAL in all API responses. - ANNUAL_YEARLY_PAY - The
   * annual commitment plan with yearly payments - FLEXIBLE - The flexible plan - TRIAL - The 30-day
   * free trial plan
   * @param planName planName or {@code null} for none
   */
  public ChangePlanRequest setPlanName(java.lang.String planName) {
    this.planName = planName;
    return this;
  }

  /**
   * This is an optional property. This purchase order (PO) information is for resellers to use for
   * their company tracking usage. If a purchaseOrderId value is given it appears in the API
   * responses and shows up in the invoice. The property accepts up to 80 plain text characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getPurchaseOrderId() {
    return purchaseOrderId;
  }

  /**
   * This is an optional property. This purchase order (PO) information is for resellers to use for
   * their company tracking usage. If a purchaseOrderId value is given it appears in the API
   * responses and shows up in the invoice. The property accepts up to 80 plain text characters.
   * @param purchaseOrderId purchaseOrderId or {@code null} for none
   */
  public ChangePlanRequest setPurchaseOrderId(java.lang.String purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
    return this;
  }

  /**
   * This is a required property. The seats property is the number of user seat licenses.
   * @return value or {@code null} for none
   */
  public Seats getSeats() {
    return seats;
  }

  /**
   * This is a required property. The seats property is the number of user seat licenses.
   * @param seats seats or {@code null} for none
   */
  public ChangePlanRequest setSeats(Seats seats) {
    this.seats = seats;
    return this;
  }

  @Override
  public ChangePlanRequest set(String fieldName, Object value) {
    return (ChangePlanRequest) super.set(fieldName, value);
  }

  @Override
  public ChangePlanRequest clone() {
    return (ChangePlanRequest) super.clone();
  }

}
