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

package com.google.api.services.billingbudgets.v1beta1.model;

/**
 * All date times begin at 12 AM US and Canadian Pacific Time (UTC-8).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing Budget API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudBillingBudgetsV1beta1CustomPeriod extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The end date of the time period. If unset, specifies to track all usage incurred
   * since the start_date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeDate endDate;

  /**
   * Required. The start date must be after January 1, 2017.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeDate startDate;

  /**
   * Optional. The end date of the time period. If unset, specifies to track all usage incurred
   * since the start_date.
   * @return value or {@code null} for none
   */
  public GoogleTypeDate getEndDate() {
    return endDate;
  }

  /**
   * Optional. The end date of the time period. If unset, specifies to track all usage incurred
   * since the start_date.
   * @param endDate endDate or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1beta1CustomPeriod setEndDate(GoogleTypeDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Required. The start date must be after January 1, 2017.
   * @return value or {@code null} for none
   */
  public GoogleTypeDate getStartDate() {
    return startDate;
  }

  /**
   * Required. The start date must be after January 1, 2017.
   * @param startDate startDate or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1beta1CustomPeriod setStartDate(GoogleTypeDate startDate) {
    this.startDate = startDate;
    return this;
  }

  @Override
  public GoogleCloudBillingBudgetsV1beta1CustomPeriod set(String fieldName, Object value) {
    return (GoogleCloudBillingBudgetsV1beta1CustomPeriod) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudBillingBudgetsV1beta1CustomPeriod clone() {
    return (GoogleCloudBillingBudgetsV1beta1CustomPeriod) super.clone();
  }

}
